package newpmbe.process.diagram.edit.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ComponentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.GroupRequestViaKeyboard;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.jface.dialogs.MessageDialog;

import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPObject;

public class ReferredComponentEditPolicy extends ComponentEditPolicy {

	@Override
	protected Command getDeleteCommand(GroupRequest request) {
		// TODO Auto-generated method stub
		String path1=this.getView().getDiagram().getElement().eResource().getURI().path();
		String path2=this.getView().getElement().eResource().getURI().path();
		if(!path1.equals(path2)){ //判断被选中的元素是不是引用元素
			GroupRequest grpRequest = (GroupRequest)request;
			if (grpRequest instanceof GroupRequestViaKeyboard){
				MessageDialog.openError(null, "操作错误", "不能删除顶层自动生成对象");
				return null;
			}
			return null;
		}
		
		CompoundCommand cc = new CompoundCommand(DiagramUIMessages.AddCommand_Label);
		IGraphicalEditPart editPart=(IGraphicalEditPart)getHost();
		String id=((EMPObject)((NodeImpl)editPart.getModel()).getElement()).getId();
		
		List sourceConnections=editPart.getSourceConnections();
		List targetConnections=editPart.getTargetConnections();
		for(int i=0;i<sourceConnections.size();i++){
			Edge edge=(Edge)((ConnectionNodeEditPart)sourceConnections.get(i)).getModel();
			NodeImpl target=(NodeImpl)edge.getTarget();
			if(target.getElement() instanceof EMPCompActivity){
				List elementsToDestory=new ArrayList();
				//to do: get elements to destory in the sub diagram
				
				IFile file=WorkspaceSynchronizer.getFile(target.eResource()); 
				IPath subPath=file.getParent().getProjectRelativePath().
												append(((EMPObject)target.getElement()).getName());
				IFolder folder=file.getProject().getFolder(subPath);
				if(folder.exists()){	
					getViewElementToDestory(id,folder,elementsToDestory,
							editPart.getEditingDomain().getResourceSet());
				}
				for(int j=0;j<elementsToDestory.size();j++){
					DestroyElementRequest destroy = new DestroyElementRequest(editPart
							.getEditingDomain(), (EObject)elementsToDestory.get(j), false);
					cc.add(new ICommandProxy(new DestroyElementCommand(destroy)));
				}
			}
			
			DestroyElementRequest destroy = new DestroyElementRequest(editPart
					.getEditingDomain(), edge, false);
			DestroyElementRequest destroy2 = new DestroyElementRequest(editPart
					.getEditingDomain(), edge.getElement(), false);
			cc.add(new ICommandProxy(new DestroyElementCommand(destroy)));
			cc.add(new ICommandProxy(new DestroyElementCommand(destroy2)));
		}
		for(int i=0;i<targetConnections.size();i++){
			Edge edge=(Edge)((ConnectionNodeEditPart)targetConnections.get(i)).getModel();
			NodeImpl source=(NodeImpl)edge.getSource();
			if(source.getElement() instanceof EMPCompActivity){
				List elementsToDestory=new ArrayList();
				//to do: get elements to destory in the sub diagram
				IFile file=WorkspaceSynchronizer.getFile(source.eResource()); 
				IPath subPath=file.getParent().getProjectRelativePath().
												append(((EMPObject)source.getElement()).getName());
				IFolder folder=file.getProject().getFolder(subPath);
				if(folder.exists()){	
					getViewElementToDestory(id,folder,elementsToDestory,
							editPart.getEditingDomain().getResourceSet());
				}
				for(int j=0;j<elementsToDestory.size();j++){
					DestroyElementRequest destroy = new DestroyElementRequest(editPart
							.getEditingDomain(), (EObject)elementsToDestory.get(j), false);
					cc.add(new ICommandProxy(new DestroyElementCommand(destroy)));
				}
			}
			
			DestroyElementRequest destroy = new DestroyElementRequest(editPart
					.getEditingDomain(), edge, false);
			DestroyElementRequest destroy2 = new DestroyElementRequest(editPart
					.getEditingDomain(), edge.getElement(), false);
			cc.add(new ICommandProxy(new DestroyElementCommand(destroy)));
			cc.add(new ICommandProxy(new DestroyElementCommand(destroy2)));
		}
		cc.add(super.getDeleteCommand(request));
		return cc;
	}
	
	private void getViewElementToDestory(String id,IFolder folder,List list,ResourceSet resourceSet){
		try{
			IResource resources[]=folder.members();
			for(int i=0;i<resources.length;i++){
				IResource file=resources[i];
				if(file instanceof IFolder)
					getViewElementToDestory(id,(IFolder)file,list,resourceSet);
				else if((file instanceof IFile)&&
						file.getName().endsWith(".process_diagram")){
					URI fileURI= URI.createFileURI(file.getLocation().toString());
					Resource resource = resourceSet.getResource(fileURI, true);
					Diagram diagram=(Diagram)resource.getContents().get(1);
					List nodeList=diagram.getChildren();
					
					for(int j=0;j<nodeList.size();j++){
						NodeImpl node=(NodeImpl)nodeList.get(j);
						if(node.getElement() instanceof EMPObject)
							if(id.equals(((EMPObject)node.getElement()).getId()))
								list.add(node);
					}
					List edgeList=diagram.getEdges();
					for(int k=0;k<edgeList.size();k++){
						Edge edge=(Edge)edgeList.get(k);
						if((edge.getSource().getElement() instanceof EMPObject)
								&& (edge.getTarget().getElement() instanceof EMPObject)){
							EMPObject source=(EMPObject)edge.getSource().getElement();
							EMPObject target=(EMPObject)edge.getTarget().getElement();
							if(id.equals(source.getId())||id.equals(target.getId())){
								list.add(edge);
								list.add(edge.getElement());
							}
						}
					}

				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
