package process.diagram.actions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;



import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;
import newpmbe.svn.wc.WorkingCopyManager;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.model.WorkbenchContentProvider;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.wc.SVNRevision;
import org.w3c.dom.*; //XML的DOM实现 
//import org.apache.crimson.tree.XmlDocument; //写XML文件要用到 

//建议：尽量不要使用Project等资源，使用接口编程，而不是对象编程。而且，Eclipse对资源访问有限制。
//所有使用的Project类均已改为IProject类。


public class NewpmbeAddModelAction implements IObjectActionDelegate {
	private IProject selectedElement;

	private Document doc = null;
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub

	}

	public void printSubFolder(Object[] subResources, Element rootItem) {
		if (subResources != null && subResources.length != 0) {
			for (int j = 0; j < subResources.length; j++) {
				if (subResources[j] instanceof IFolder) {
					String strNodeId = subResources[j].toString();
					strNodeId = strNodeId.replaceAll("/", "___"); //$NON-NLS-1$ //$NON-NLS-2$
					System.out.println(strNodeId);
					Element folderItem = doc.createElement(strNodeId);
					rootItem.appendChild(folderItem);
					initModelAttributes(folderItem);
					try {
						printSubFolder(((IFolder) subResources[j]).members(),
								folderItem);
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void run(IAction action) {
		WorkingCopyManager wcManager = new WorkingCopyManager();
		if(!wcManager.configConnection()){
			MessageDialog.openError(null, "连接服务器出错", "无法连接到服务器，请检查网络状况！");
			return;
		}
		File svnfile=new File(((IProject)selectedElement).getLocationURI().getPath()+"/.svn"); //$NON-NLS-1$
		if(svnfile.exists()){
			MessageDialog.openError(null,Messages.getString("NewpmbeAddModelAction.3"), Messages.getString("NewpmbeAddModelAction.4")); //$NON-NLS-1$ //$NON-NLS-2$
			return;
		}
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		doc = builder.newDocument();

		// 下面是建立XML文档内容的过程
		String strNodeId = ((IProject) selectedElement).toString();
		strNodeId = strNodeId.replaceAll("/", "___"); //$NON-NLS-1$ //$NON-NLS-2$
		strNodeId = strNodeId.replaceFirst("P", "F"); //$NON-NLS-1$ //$NON-NLS-2$
		System.out.println(strNodeId);
		Element rootItem = doc.createElement(strNodeId);
		doc.appendChild(rootItem);	
		initModelAttributes(rootItem);
		ITreeContentProvider myWorkbenchContentProvider = new WorkbenchContentProvider();
		Object[] result = myWorkbenchContentProvider
				.getChildren(selectedElement);
		//遍历该资源的所有子资源
		for (int i = 0; i < result.length; i++) {
			if (result[i] instanceof IFolder) {
				IFolder subFolder = (IFolder) result[i];
				strNodeId = subFolder.toString();
				//如果子文件夹不是.settings文件夹
				if(strNodeId.indexOf(".settings") == -1){ //$NON-NLS-1$
					//替换子文件夹路径的/为___
					strNodeId = strNodeId.replaceAll("/", "___"); //$NON-NLS-1$ //$NON-NLS-2$
					System.out.println(strNodeId);
					Element FolderItem = doc.createElement(strNodeId);
					rootItem.appendChild(FolderItem);
					//设置该文件夹的初始属性
					initModelAttributes(FolderItem);
					Object[] subResources = null;
					try {
						subResources = subFolder.members();
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					printSubFolder(subResources, FolderItem);
					/*
					 * while(subResources!= null && subResources.length != 0) {
					 * for(int j = 0; j < subResources.length; j++){
					 * if(subResources[j] instanceof IFolder){
					 * System.out.println(subResources[j]); } } }
					 */
				}
			}
		}
		toSave();
		System.out.print(Messages.getString("NewpmbeAddModelAction.12")); //$NON-NLS-1$
		//TODO 接下来的任务-将模块文件传送到服务器上--樊束川 
		String projectPath=((IProject)selectedElement).getLocationURI().getPath().substring(1);
		String projectName=((IProject)selectedElement).getName();
		try{
		//projectPath=new String(projectPath.getBytes("gb2312"),"ISO-8859-1");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.print(projectPath);
		
		// TODO Auto-generated method stub	
		//------------------------------------------------
		//The method activePage.getEditors[] is deprecated.
		//use activePage.getEditorReferences[] to instead.
		//--changed by zhangpeng
		//------------------------------------------------
		//先保存Editor
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		activePage.closeAllEditors(true);
//		IEditorReference [] editorReferences = activePage.getEditorReferences();
//		//IEditorPart editorParts[] = activePage.getEditors();		
//		//String fileBelongsTo = null;		
//		for (int i = 0; i < editorReferences.length; i++) {
//			if(editorReferences[i] != null){
//				DiagramDocumentEditor editor = (DiagramDocumentEditor)editorReferences[i].getEditor(true);
//				editor.doSave(new NullProgressMonitor());
//				editor.close(true);
//				
//				/*IEditorInput activeInput = editorParts[i].getEditorInput();
//				IFile diagramFile = ((IFileEditorInput) activeInput).getFile();
//				activePage.closeEditor(editorParts[i], true);
//				try {
//					IDE.openEditor(activePage, diagramFile);
//				} catch (PartInitException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}*/
//			}
//		}
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root=workspace.getRoot();
		try{
			SVNURL destURL = wcManager.getRepositoryRootURL().appendPath(selectedElement.getName(),false);
			wcManager.importDirectory(projectPath, destURL, "import to the svn server", true);
			//cf.importModule(null, projectPath,projectName );
			
			/*File file=new File(projectPath+"/.settings/tree.xml");
			//IFile file=selectedElement.getProject().getFile(".settings/tree.xml");
			//file.delete(true, null);
			if(file.exists())
				file.delete();*/
			//判断模型的内容
			String prefix = "";
			if(selectedElement.getName().endsWith(".organization")){
				prefix = "组织模型";
			}else if(selectedElement.getName().endsWith(".process")){
				prefix = "过程模型";
			}else if(selectedElement.getName().endsWith(".resource")){
				prefix = "资源模型";
			}
			
			selectedElement.delete(true,true,null);
			
			wcManager.checkout(wcManager.getRepositoryRootURL().appendPath(projectName, false), SVNRevision.HEAD, prefix+"/"+selectedElement.getName(), true);
			
			//cf.checkoutFile(null, projectName);
//			File projectFile=new File(wcFunc.getLocalWorkRoot()+"/"+projectName); //$NON-NLS-1$
			//deleteFiles(projectFile);
			//selectedElement.refreshLocal(2, null);
			IProject project=root.getProject(projectName);
			IPath targetPath=new Path(wcManager.getLocalWorkRoot()+"\\"+prefix+"\\"+projectName); //$NON-NLS-1$

			IProjectDescription description=workspace.loadProjectDescription(
					new Path(wcManager.getLocalWorkRoot()+"\\"+prefix+"\\"+projectName+"\\.project")); //$NON-NLS-1$ //$NON-NLS-2$
			description.setLocation(targetPath);
			project.create(description, null);
			project.open(null);
			MessageDialog.openInformation(null, Messages.getString("NewpmbeAddModelAction.17"), Messages.getString("NewpmbeAddModelAction.18")); //$NON-NLS-1$ //$NON-NLS-2$
		}catch(Exception e){
			e.printStackTrace();
			MessageDialog.openWarning(null,Messages.getString("NewpmbeAddModelAction.19"),Messages.getString("NewpmbeAddModelAction.20")+e); //$NON-NLS-1$ //$NON-NLS-2$
		}
		/*cf.checkoutFile(null, projectName);
		
		IWorkspaceRoot root= workspace.getRoot();
		IProject project= root.getProject(projectName);
		try{
			project.create(null);
			project.open(null);
		}catch(Exception e){
			
		}*/
//		TODO:把本地文件改为只读IResource.setReadOnly(readOnly) 
//		try {
//			lockFiles(selectedElement.members());
//		} catch (CoreException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	
	}
	
	protected void deleteFiles(File file){
		if(file.isFile()){
			if(file.getName().equals(".project")) //$NON-NLS-1$
				return;
			file.delete();
		}
		else if(file.isDirectory()){
			if(file.getName().equals(".settings")||file.getName().equals(".svn")) //$NON-NLS-1$ //$NON-NLS-2$
				return;
			File[] files=file.listFiles();
			for(int i=0;i<files.length;i++){
				deleteFiles(files[i]);
			}
		}
	}
	
	
	private void initModelAttributes(Element node) {
		// TODO Auto-generated method stub		
			node.setAttribute("locked","false"); //$NON-NLS-1$ //$NON-NLS-2$
			node.setAttribute("intFrozenLock", "0");		 //$NON-NLS-1$ //$NON-NLS-2$
	}
	public void lockFiles(Object[] subResources) {
		
		if (subResources != null && subResources.length != 0) {
			for (int j = 0; j < subResources.length; j++) {
				if(subResources[j] instanceof IFile )
					if(subResources[j].toString().indexOf(".process_diagram")!= -1){
						//Dumplicated method, updated by zhangpeng	
						//((IFile) subResources[j]).setReadOnly(false);
						ResourceAttributes attr = new ResourceAttributes();
						attr.setReadOnly(true);			
						try {
							((IFile) subResources[j]).setResourceAttributes(attr);
						} catch (CoreException e) {
							e.printStackTrace();
						}
						//end changed by zhangpeng
					}
				if (subResources[j] instanceof IFolder) {
					if (subResources[j].toString().indexOf(".settings") != -1) //$NON-NLS-1$
						continue;
				    try {
				    	lockFiles(((IFolder)subResources[j]).members());
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	private void toSave() {
		IPath path = ((IProject)selectedElement).getLocation();
		String strPath = path.toString();
		String strFileName = strPath + "/.settings/tree.xml"; //$NON-NLS-1$
		//strFileName = strFileName.replaceAll("/", "___");
		try {
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			DOMSource source = new DOMSource(doc);
			transformer.setOutputProperty(OutputKeys.ENCODING, "GB2312"); //$NON-NLS-1$
			transformer.setOutputProperty(OutputKeys.INDENT, "yes"); //$NON-NLS-1$
			PrintWriter pw = new PrintWriter(new FileOutputStream(strFileName));
			StreamResult result = new StreamResult(pw);
			transformer.transform(source, result);
			pw.close();
		} catch (TransformerException mye) {
			mye.printStackTrace();
		} catch (IOException exp) {
			exp.printStackTrace();
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof IProject) {
				selectedElement = (IProject) structuredSelection
						.getFirstElement();
			}
		}
	}
}