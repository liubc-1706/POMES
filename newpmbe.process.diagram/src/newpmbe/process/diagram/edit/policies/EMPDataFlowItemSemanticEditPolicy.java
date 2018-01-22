package newpmbe.process.diagram.edit.policies;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import newpmbe.process.diagram.edit.parts.EMPArtifactEditPart;
import newpmbe.process.diagram.edit.parts.EMPClockEditPart;
import newpmbe.process.diagram.edit.parts.EMPCompActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPDocumentEditPart;
import newpmbe.process.diagram.edit.parts.EMPFormEditPart;
import newpmbe.process.diagram.edit.parts.EMPMessageEditPart;
import newpmbe.process.diagram.edit.parts.EMPOtherEditPart;
import newpmbe.process.diagram.edit.parts.EMPProductPackageEditPart;
import newpmbe.process.diagram.part.NewPMBEDocumentProvider;
import newpmbe.process.diagram.part.NewPMBEDiagramEditor;
import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.ResourceUndoContext;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

import vpml.processpackage.EMPClock;
import vpml.processpackage.EMPClockFlow;
import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.EMPDocument;
import vpml.processpackage.EMPLeafProduct;
import vpml.processpackage.EMPObject;
import vpml.processpackage.EMPProduct;

/**
 * @generated NOT
 */
public class EMPDataFlowItemSemanticEditPolicy extends
		NewPMBEBaseItemSemanticEditPolicy {
	private IWorkbenchPage activePage;

	private IWorkbenchPage getActivePage() {
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
				.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		return activePage;
	}

	/**
	 * @generated NOT
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		//System.out.println("fa");
		String path1 = this.getSemanticElement().eResource().getURI().path();
		String path2 = ((View) this.getHost().getModel()).getDiagram()
				.getElement().eResource().getURI().path();
		System.out.println(path1);
		System.out.println(path2);
		//		if (!path1.equals(path2)) { //判断被选中的元素是不是引用元素
		////			MessageDialog.openError(null, "操作错误", "请删除该数据流的目标活动");
		//			return UnexecutableCommand.INSTANCE;
		//		} 

		return getMSLWrapper(new DestroyElementCommand(req) {
			/*private Namespace XMLNS_XMI=Namespace.getNamespace("xmi","http://www.omg.org/XMI");
			 private Namespace XMLNS_NOTATION=Namespace.getNamespace("notation","http://www.eclipse.org/gmf/runtime/1.0.0/notation");
			 private Namespace XMLNS_XSI=Namespace.getNamespace("xsi","http://www.w3.org/2001/XMLSchema-instance");
			 */

			@Override
			protected EObject getElementToDestroy() {
				// TODO Auto-generated method stub
				ConnectionNodeEditPart connection = (ConnectionNodeEditPart) getHost();
				IGraphicalEditPart source = (IGraphicalEditPart) connection
						.getSource();
				IGraphicalEditPart target = (IGraphicalEditPart) connection
						.getTarget();
				if (source instanceof EMPCompActivityEditPart
						|| target instanceof EMPCompActivityEditPart) {
					EMPCompActivityEditPart compEditPart = null;
					EMPObject obj = null;
					String xmi_id = null;
					if (source instanceof EMPCompActivityEditPart) {
						compEditPart = (EMPCompActivityEditPart) source;
						//NodeImpl node=(NodeImpl)target.getModel();
						if (target instanceof EMPDocumentEditPart)
							xmi_id = ((EMPDocumentEditPart) target)
									.getElementGuid();
						else if (target instanceof EMPArtifactEditPart)
							xmi_id = ((EMPArtifactEditPart) target)
									.getElementGuid();
						else if (target instanceof EMPMessageEditPart)
							xmi_id = ((EMPMessageEditPart) target)
									.getElementGuid();
						else if (target instanceof EMPOtherEditPart)
							xmi_id = ((EMPOtherEditPart) target)
									.getElementGuid();
						else if (target instanceof EMPFormEditPart)
							xmi_id = ((EMPFormEditPart) target)
									.getElementGuid();
						obj = (EMPObject) ((NodeImpl) target.getModel())
								.getElement();
					} else if (target instanceof EMPCompActivityEditPart) {
						compEditPart = (EMPCompActivityEditPart) target;
						//NodeImpl node=(NodeImpl)source.getModel();
						if (source instanceof EMPDocumentEditPart)
							xmi_id = ((EMPDocumentEditPart) source)
									.getElementGuid();
						else if (source instanceof EMPArtifactEditPart)
							xmi_id = ((EMPArtifactEditPart) source)
									.getElementGuid();
						else if (source instanceof EMPMessageEditPart)
							xmi_id = ((EMPMessageEditPart) source)
									.getElementGuid();
						else if (source instanceof EMPOtherEditPart)
							xmi_id = ((EMPOtherEditPart) source)
									.getElementGuid();
						else if (source instanceof EMPClockEditPart)
							xmi_id = ((EMPClockEditPart) source)
									.getElementGuid();
						else if (source instanceof EMPFormEditPart)
							xmi_id = ((EMPFormEditPart) source)
									.getElementGuid();
						obj = (EMPObject) ((NodeImpl) source.getModel())
								.getElement();
					}
					EMPCompActivity compAct = (EMPCompActivity) ((NodeImpl) compEditPart
							.getModel()).getElement();
					String id = obj.getId();

					CompoundCommand cc = new CompoundCommand(
							DiagramUIMessages.AddCommand_Label);

					if (obj instanceof EMPProduct) {
						List sourceFlowList = ((EMPProduct) obj)
								.getSourceDataFlows();
						List targetFlowList = ((EMPProduct) obj)
								.getTargetDataFlows();
						for (int i = 0; i < sourceFlowList.size(); i++) {
							EMPDataFlow dataflow = (EMPDataFlow) sourceFlowList
									.get(i);
							IFile file1 = WorkspaceSynchronizer
									.getFile(dataflow.GetEndPoint().eResource());
							IFile file2 = WorkspaceSynchronizer.getFile(compAct
									.eResource());
							if (file1.getProjectRelativePath().toString()
									.contains(
											file2.getParent()
													.getProjectRelativePath()
													.append(compAct.getName())
													.toString())) {
								DestroyElementRequest destroy = new DestroyElementRequest(
										connection.getEditingDomain(),
										dataflow, false);
								cc.add(new ICommandProxy(
										new DestroyElementCommand(destroy)));
							}
						}
						for (int i = 0; i < targetFlowList.size(); i++) {
							EMPDataFlow dataflow = (EMPDataFlow) targetFlowList
									.get(i);
							IFile file1 = WorkspaceSynchronizer
									.getFile(dataflow.GetStartPoint()
											.eResource());
							IFile file2 = WorkspaceSynchronizer.getFile(compAct
									.eResource());
							if (file1.getProjectRelativePath().toString()
									.contains(
											file2.getParent()
													.getProjectRelativePath()
													.append(compAct.getName())
													.toString())) {
								DestroyElementRequest destroy = new DestroyElementRequest(
										connection.getEditingDomain(),
										dataflow, false);
								cc.add(new ICommandProxy(
										new DestroyElementCommand(destroy)));
							}
						}
					} else if (obj instanceof EMPClock) {
						List clockFlowList = ((EMPClock) obj).getClockFlows();
						for (int i = 0; i < clockFlowList.size(); i++) {
							EMPClockFlow clockFlow = (EMPClockFlow) clockFlowList
									.get(i);
							IFile file1 = WorkspaceSynchronizer
									.getFile(clockFlow.getActivity()
											.eResource());
							IFile file2 = WorkspaceSynchronizer.getFile(compAct
									.eResource());
							if (file1.getProjectRelativePath().toString()
									.contains(
											file2.getParent()
													.getProjectRelativePath()
													.append(compAct.getName())
													.toString())) {
								DestroyElementRequest destroy = new DestroyElementRequest(
										connection.getEditingDomain(),
										clockFlow, false);
								cc.add(new ICommandProxy(
										new DestroyElementCommand(destroy)));
							}
						}

					}

					IFile file = WorkspaceSynchronizer.getFile(compAct
							.eResource());
					IPath subPath = file.getParent().getProjectRelativePath()
							.append(compAct.getName());
					IFolder folder = file.getProject().getFolder(subPath);
					if (folder.exists()) {
						List list = new ArrayList();//deleteNotationView(xmi_id, folder);
						getViewElementToDestory(id, folder, list, connection
								.getEditingDomain().getResourceSet());
						for (int i = 0; i < list.size(); i++) {
							EObject eo = (EObject) list.get(i);
							DestroyElementRequest destroy = new DestroyElementRequest(
									connection.getEditingDomain(), eo, false);
							cc.add(new ICommandProxy(new DestroyElementCommand(
									destroy)));
						}
					}

					connection.getDiagramEditDomain().getDiagramCommandStack()
							.execute(cc);
					//save 
					IWorkbenchWindow window = newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin
							.getInstance().getWorkbench()
							.getActiveWorkbenchWindow();
					IWorkbenchPage activePage = window.getActivePage();
					DiagramDocumentEditor document = (DiagramDocumentEditor) activePage
							.getActiveEditor();
					document.doSave(new NullProgressMonitor());

				}
				return super.getElementToDestroy();
			}

			private void getViewElementToDestory(String id, IFolder folder,
					List list, ResourceSet resourceSet) {
				try {
					IResource resources[] = folder.members();
					for (int i = 0; i < resources.length; i++) {
						IResource file = resources[i];
						if (file instanceof IFolder)
							getViewElementToDestory(id, (IFolder) file, list,
									resourceSet);
						else if ((file instanceof IFile)
								&& file.getName().endsWith(".process_diagram")) {
							URI fileURI = URI.createFileURI(file.getLocation()
									.toString());
							Resource resource = resourceSet.getResource(
									fileURI, true);
							Diagram diagram = (Diagram) resource.getContents()
									.get(1);
							List nodeList = diagram.getChildren();

							for (int j = 0; j < nodeList.size(); j++) {
								NodeImpl node = (NodeImpl) nodeList.get(j);
								if (id.equals(((EMPObject) node.getElement())
										.getId()))
									list.add(node);
							}
							List edgeList = diagram.getEdges();
							for (int k = 0; k < edgeList.size(); k++) {
								Edge edge = (Edge) edgeList.get(k);
								EMPObject source = (EMPObject) edge.getSource()
										.getElement();
								EMPObject target = (EMPObject) edge.getTarget()
										.getElement();
								if (id.equals(source.getId())
										|| id.equals(target.getId())) {
									list.add(edge);
									list.add(edge.getElement());
								}
							}

						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			/**
			 * delete views identified by xmi_id, including nodes and edges
			 * @param xmi_id
			 * @param folder
			 */
			/*public void deleteNotationView(String xmi_id,IFolder folder){
			 try {
			 IResource resources[]=folder.members();
			 for(int i=0;i<resources.length;i++){
			 IResource file=resources[i];
			 if(file instanceof IFolder)
			 deleteNotationView(xmi_id,(IFolder)file);
			 else if((file instanceof IFile)&&
			 file.getName().endsWith(".process_diagram")){
			 Document doc=XMLParser.parser((IFile)file);
			 Element root=doc.getRootElement();
			 Element diagram=root.getChild("Diagram", XMLNS_NOTATION);
			 Element node=getNodeByID(diagram,xmi_id);
			 if(node!=null){
			 String node_id=node.getAttributeValue("id", XMLNS_XMI);
			 diagram.removeContent(node);
			 List edges=diagram.getChildren("edges");
			 List edgesToRemove=new ArrayList();
			 for(int j=0;j<edges.size();j++){
			 Element edge=(Element)edges.get(j);
			 String source=edge.getAttributeValue("source");
			 String target=edge.getAttributeValue("target");
			 if(source.equals(node_id)||target.equals(node_id))
			 edgesToRemove.add(edge);//diagram.removeContent(edge);
			 }
			 for(int j=0;j<edgesToRemove.size();j++){
			 diagram.removeContent((Element)edgesToRemove.get(j));
			 }
			 }
			 System.out.println(file.getRawLocation().toString());
			 
			 XMLOutputter outputter = new XMLOutputter();
			 
			 
			 try {
			 //FileWriter writer = new FileWriter(file.getRawLocation().toString());
			 OutputStream out=new FileOutputStream(file.getRawLocation().toString());
			 
			 outputter.output(doc, out);
			 //writer.close();
			 //doc.
			 doc=null;
			 } catch (FileNotFoundException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
			 } catch (IOException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
			 } 
			 }
			 }
			 } catch (CoreException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
			 }
			 }
			 
			 public Element getNodeByID(Element diagram,String xmi_id){
			 List list=diagram.getChildren("children");
			 for(int i=0;i<list.size();i++){
			 Element node=(Element)list.get(i);
			 Element element=node.getChild("element");
			 if(element!=null){
			 String href=element.getAttributeValue("href");
			 if(href.endsWith(xmi_id))
			 return node;
			 }
			 }
			 return null;
			 }*/

		});

	}

}
