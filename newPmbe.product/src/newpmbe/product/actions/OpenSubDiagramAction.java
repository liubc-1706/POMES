package newpmbe.product.actions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import newpmbe.process.diagram.edit.parts.EMPProductPackageEditPart;
import newpmbe.process.diagram.part.NewPMBEDiagramEditor;
import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;
import newpmbe.product.diagram.part.NewPMBEDiagramEditorUtil;

import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.part.FileEditorInput;

import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPProductPackage;
import vpml.processpackage.impl.EMPProductPackageImpl;

public class OpenSubDiagramAction implements IObjectActionDelegate{

	public final static String ID = "com.my.Process.popup.CreateSubDiagramID";
	/**
	 * HashMap<String, String> 类型,第一个参数记录上层节点,第二个参数记录下层节点.
	 */
	public static HashMap<String, String> actRelationMap = new HashMap<String, String>();
	
	private EMPProductPackageEditPart selectedElement;
	private IStructuredSelection selection;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

	public void run(IAction action) {
		// TODO Auto-generated method stub
		Command c = getCreateSubDiagramCMD();
//		selectedElement.getDiagramEditDomain().getDiagramCommandStack()
//				.execute(c);
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		selectedElement = null;
		
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof EMPProductPackageEditPart) {
				selectedElement = (EMPProductPackageEditPart) structuredSelection
						.getFirstElement();
			}
		}
	}
	
	public static Object getAdapter(Object adaptable, Class c) {
		if (c.isInstance(adaptable)) {
			return adaptable;
		}
		if (adaptable instanceof IAdaptable) {
			IAdaptable a = (IAdaptable) adaptable;
			Object adapter = a.getAdapter(c);
			if (c.isInstance(adapter)) {
				return adapter;
			}
		}
		return null;
	}
	
	private Object[] getselectedResources(IStructuredSelection selection,
			Class c) {
		return getselectedAdaptables(selection, c);
	}

	private static Object[] getselectedAdaptables(ISelection selection, Class c) {
		ArrayList result = null;
		if (!selection.isEmpty()) {
			result = new ArrayList();
			Iterator elements = ((IStructuredSelection) selection).iterator();
			while (elements.hasNext()) {
				Object adapter = getAdapter(elements.next(), c);
				if (c.isInstance(adapter)) {
					result.add(adapter);
				}
			}
		}
		if (result != null && !result.isEmpty()) {
			return result.toArray((Object[]) Array
					.newInstance(c, result.size()));
		}
		return (Object[]) Array.newInstance(c, 0);
	}
	
	
	/**
	 * * 这个方法可以得到current project。 * *
	 * 
	 * @return
	 */
	
	private IProject getProject() {
		IResource[] rs = (IResource[]) getselectedResources(
				(IStructuredSelection) selection, IResource.class);
		IProject project = null;
		for (int i = 0; i < rs.length; i++) {
			IResource r = rs[i];
			if (r.getType() == IResource.PROJECT) {
				project = (IProject) r;
				break;
			}
		}
		return project;
	}
	//
	public String getPath(String path){
		int i;
		i=path.lastIndexOf("/");
		if(i==-1)
			return "";
		else
			return path.substring(0,i);
	}
	
	public IFile getFileFromProject(String projectName,String filePath,String packageName){
		ITreeContentProvider myWorkbenchContentProvider = new WorkbenchContentProvider();
		Object[] elements = myWorkbenchContentProvider
				.getElements(ResourcesPlugin.getWorkspace().getRoot());
		
		for (int j = 0; j < elements.length; j++) {
			if (elements[j] instanceof Project) {
				
				Object[] result = myWorkbenchContentProvider
						.getChildren(elements[j]);
				if ((projectName != null) && packageName != null) 
				//判断是否在同一个工程
				if (projectName.equals(((Project) elements[j]).getName())){
					//IFolder floder=new IFolder()
					
					//如果在同一个工程，再继续判断文件是否已存在
					
					IFile file=((Project) elements[j]).getFile(getPath(filePath)+"/"+packageName+"/"+packageName+".product_diagram");
					if(file.exists()){
						return file;
					}
					else{
						IFolder folder=((Project)elements[j]).getFolder(getPath(filePath)+"/"+packageName);
						if(folder.exists()){
							return null;
						}
						else{
							try{
								IProgressMonitor monitor = new NullProgressMonitor();
								folder.create(true, true, monitor);
							}catch(Exception e){
								
							}
							return null;
						}
					}
					
					
					
					
				}			
				}				
			}
		
		return null;
		
	}
	
	
	protected Command getCreateSubDiagramCMD(){
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		DiagramDocumentEditor targetDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
		IEditorInput activeInput = targetDiagramEditor.getEditorInput();
		IFile activeEditorFile = ((IFileEditorInput)activeInput).getFile();
		String actFilePath=activeEditorFile.getProjectRelativePath().toString();//当前文件的相对路径
		String projectname = activeEditorFile.getProject().getName();
		
		
		EditPart targetEditPart = selectedElement;
		if (targetEditPart instanceof IGraphicalEditPart) {
			IGraphicalEditPart editPart = (IGraphicalEditPart) targetEditPart;
			View view = editPart.getNotationView();
			if (view != null) {
				EObject element = ViewUtil.resolveSemanticElement(view);
				if (element instanceof EMPProductPackageImpl) {
					//组合活动名
					String productPackageName=((EMPProductPackageImpl) element).getName();  
					//设置文件所属的工程
					if(productPackageName==null){
						MessageDialog.openWarning(null, "错误", "请先设置组合产品名称！");
						return null;
					}
					
					IFile file=WorkspaceSynchronizer.getFile(element.eResource());
					IFile subFile=file.getProject().getFile(file.getParent().
							getProjectRelativePath().append(productPackageName)
							.append(productPackageName+".product_diagram"));
					actFilePath=file.getProjectRelativePath().toString();
					
					if(subFile.exists()){
						IEditorPart editor =activePage.findEditor(new FileEditorInput(subFile));
						if(editor!=null){
							activePage.bringToTop(editor);
							
							return null;
						}
						else{
							try {
								IDE.openEditor(activePage, subFile);
							} catch (PartInitException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							return null;
						}
					}
					
					
					// 查看要创建的Diagram是否已打开，已打开则bringToTop
					/*IEditorPart editorParts[] = activePage.getEditors();
					boolean IsDiagramExist = false;
					
					String fileBelongsTo = null;*/
					
					/*//如果两个工程里相同名字的文件被打开，该如何区别
					for (int i = 0; i < editorParts.length; i++) {
						//应该先判断打开的文件所属的的工程是否相同
						if (editorParts[i].getTitle().equals(productPackageName + ".product_diagram")) {  //注意判断条件，Editors可能有相同名字。跟AcitiveEditor属同一个工程的才能打开！
							IEditorInput input = editorParts[i].getEditorInput();
							IFile file1 = ((IFileEditorInput)input).getFile();
							fileBelongsTo = file.getFullPath().segment(0);
							if(fileBelongsTo.equals(projectname)){	
								if(file.getProjectRelativePath().toString().equals(getPath(actFilePath)+"/"+productPackageName+"/"+productPackageName+".product_diagram")){
									IsDiagramExist = true;
									activePage.bringToTop(editorParts[i]);
									return null;
								}
							}							 
						}
					}
					// 要创建的Diagram没被打开，看是否已存在，存在则openEditor
					IFile subDiagramFile = getFileFromProject(projectname,actFilePath,productPackageName);
					if(subDiagramFile != null){
						try {
							IDE.openEditor(activePage, subDiagramFile);
						} catch (PartInitException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
						return null;
					}	*/				
										
					// 创建Diagram
					else{
						IProgressMonitor progressMonitor = new NullProgressMonitor();
						progressMonitor.beginTask(
								"Creating diagram and model files", 4); //$NON-NLS-1$
						final IProgressMonitor subProgressMonitor = new SubProgressMonitor(
								progressMonitor, 1);
						productPackageName=getPath(actFilePath)+"/"+productPackageName+"/"+productPackageName+".product_diagram";
						try{
							NewPMBEDiagramEditorUtil.openDiagram(NewPMBEDiagramEditorUtil
								.createDiagram((new Path(projectname)).makeAbsolute(),
										productPackageName, progressMonitor));
						}catch(Exception e){}	
					}
					
					actRelationMap.put(targetDiagramEditor.getTitleToolTip(), projectname + IPath.SEPARATOR + productPackageName);					
					
					
					
					// 在新创建的Diagram中设置元素
					ArrayList arrangeList = new ArrayList();					
					View targetdiagramImpl = (DiagramImpl) targetDiagramEditor
							.getDiagramEditPart().getModel();
					
					targetDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
					DiagramEditPart  diagramEditPart = ((DiagramDocumentEditor)targetDiagramEditor).getDiagramEditPart();
					//EMPProductGroupEditPart productGroupEditPart =  (EMPProductGroupEditPart)diagramEditPart;
					EObject diagramElement = ((View)diagramEditPart.getModel()).getElement();
					EMPDiagram diagramModel = (EMPDiagram)diagramElement;
					
					

					CompoundCommand cc = new CompoundCommand(
							DiagramUIMessages.AddCommand_Label);
//					EList actFlowList = ((EMPProductPackageImpl) element).getSourceFlows();//????????/
					// getActivity即getSource，getActivityFlow()即getSourceFlow();在gmfmap中指定了source是activity。
					//LayoutSubActDiagram(cc, actFlowList, true, arrangeList,
						//	targetDiagramEditor);
					//set diagram prop from parent comp act
					//name set
					SetRequest nameSetReq = new SetRequest(diagramEditPart.getEditingDomain(),diagramElement,vpml.VpmlPackage.Literals.EM_OBJECT__NAME,((EMPProductPackage)element).getName());
					SetValueCommand setNamePropCommand = new SetValueCommand(nameSetReq);
					cc.add(new ICommandProxy(setNamePropCommand));
					
					//id set
					SetRequest idSetReq = new SetRequest(diagramEditPart.getEditingDomain(),diagramElement,vpml.VpmlPackage.Literals.EM_OBJECT__ID,((EMPProductPackage)element).getId());
					SetValueCommand setIdPropCommand = new SetValueCommand(idSetReq);
					cc.add(new ICommandProxy(setIdPropCommand));
					
					//code set
					SetRequest codeSetReq = new SetRequest(diagramEditPart.getEditingDomain(),diagramElement,vpml.VpmlPackage.Literals.EM_OBJECT__CODE,((EMPProductPackage)element).getCode());
					SetValueCommand setCodePropCommand = new SetValueCommand(codeSetReq);
					cc.add(new ICommandProxy(setCodePropCommand));
					
					//desc set
					SetRequest descSetReq = new SetRequest(diagramEditPart.getEditingDomain(),diagramElement,vpml.VpmlPackage.Literals.EM_OBJECT__DESCRIPTION,((EMPProductPackage)element).getDescription());
					SetValueCommand setDescPropCommand = new SetValueCommand(descSetReq);
					cc.add(new ICommandProxy(setDescPropCommand));
					
					
					EList dataFlowList = ((EMPProductPackageImpl) element).getTargetDataFlows();
				//	LayoutSubActDiagram(cc, dataFlowList, false, arrangeList,
						//	targetDiagramEditor);
					DiagramDocumentEditor activeDiagramEditor = (DiagramDocumentEditor) activePage.getActiveEditor();
					IDiagramEditDomain dEditingDomain = activeDiagramEditor
							.getDiagramEditPart().getDiagramEditDomain(); // 目前所有的Editor都用的是同一个EditingDomain
					dEditingDomain.getDiagramCommandStack().execute(cc);

					activeDiagramEditor.doSave(new NullProgressMonitor());		
					
					//return cc;
				}
			}

		}
		return null;
		
	}
	
}
