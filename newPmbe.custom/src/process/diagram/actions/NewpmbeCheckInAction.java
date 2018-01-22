package process.diagram.actions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;



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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.wc.SVNRevision;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



public class NewpmbeCheckInAction implements IObjectActionDelegate {
	private IContainer selectedElement = null;
	private Document doc = null;
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub

	}

	public void run(IAction action) {
		String projectName=selectedElement.getProject().getName();		
		String strFileName = null;
		String tagName = null;
		IPath path; //相对路径
		IPath rawPath; //绝对路径
		String strPath = null;
		String strRawPath;
		if(selectedElement instanceof IProject){
			//path = ((Project)selectedElement).getProjectRelativePath();
			strPath = projectName;//path.toString();
			rawPath =   ((IProject) selectedElement).getLocation();
			strRawPath = rawPath.toString();
			strFileName = rawPath.toString() + "/.settings/tree.xml"; //$NON-NLS-1$
			System.out.println(strFileName);			
			tagName = ((IProject) selectedElement).toString();
			tagName = tagName.replaceAll("/", "___"); //$NON-NLS-1$ //$NON-NLS-2$
			tagName = tagName.replaceFirst("P", "F");		 //$NON-NLS-1$ //$NON-NLS-2$
		}else{
			path = ((IContainer)selectedElement).getProjectRelativePath();
			strPath = path.toString();
			rawPath = ((IContainer)selectedElement).getLocation();			
			strRawPath = rawPath.toString();
			strFileName = strRawPath.substring(0,strRawPath.lastIndexOf(strPath))+ ".settings/" + "tree.xml";		  //$NON-NLS-1$ //$NON-NLS-2$
			tagName = ((IContainer)selectedElement).toString();
			tagName = tagName.replaceAll("/", "___"); //$NON-NLS-1$ //$NON-NLS-2$
		}		
		System.out.println(tagName);
		
		//从cvs服务器上得到tree.xml文件
		WorkingCopyManager wcManager = new WorkingCopyManager();
		if(!wcManager.configConnection()){
			MessageDialog.openError(null, "连接服务器出错", "无法连接到服务器，请检查网络状况！");
			return;
		}
		File treeFile = new File(strFileName);

        if(treeFile.getParentFile().exists()){
            boolean flag = false;
            File[] files = treeFile.getParentFile().listFiles();
            for(int i = 0; i < files.length; i++){
                if(files[i].getName().equals(".svn")){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                MessageDialog.openWarning(null, "操作顺序错误", "模块未添加至服务器，请在签入签出之前先进行添加操作！");
                return;
            }
        }
        else{
            MessageDialog.openWarning(null, "目录/文件未找到", "未找到相应文件，请确保文件路径正确！");
            return;
        }
		try{

			wcManager.update(strFileName, SVNRevision.HEAD, true);
			//cf.update(new File(strFileName));
		}catch(Exception e){
			e.printStackTrace();
//			MessageDialog.openError(null, "签入错误", "服务器上找不到相应的文件，\n请确保模型已加入服务器");
			MessageDialog.openWarning(null, Messages.getString("NewpmbeCheckInAction.9"), Messages.getString("NewpmbeCheckInAction.10")+e); //$NON-NLS-1$ //$NON-NLS-2$
			return;
		}
		
		//解析该文件
		try {
			if(!readXMLFile(strFileName, tagName,wcManager)){	
//				MessageDialog.openError(null, "签出时出错", "解析服务器端特征文件(tree.xml)时出错。");
				return;
			}
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			MessageDialog.openError(null, Messages.getString("NewpmbeCheckInAction.11"), Messages.getString("NewpmbeCheckInAction.12")+e.toString()); //$NON-NLS-1$ //$NON-NLS-2$
		}
		//先保存Editor
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		activePage.closeAllEditors(true);
		
		//------------------------------------------------
		//The method activePage.getEditors[] is deprecated.
		//use activePage.getEditorReferences[] to instead.
		//--changed by zhangpeng
		//------------------------------------------------
//		IEditorReference [] editorReferences = activePage.getEditorReferences();
//		//IEditorPart editorParts[] = activePage.getEditors();		
//		//String fileBelongsTo = null;		
//		for (int i = 0; i < editorReferences.length; i++) {
//			if(editorReferences[i] != null){
//				DiagramDocumentEditor editor = (DiagramDocumentEditor)editorReferences[i].getEditor(true);
//				editor.doSave(new NullProgressMonitor());
//				editor.close(true);
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
		//------------end changed by zhangpeng------------
		//提交修改后的tree.xml文件
		//由于cvs是根据文件的创建时间和最后修改时间确定文件是否被修改过，进而提交到服务器，
		//所以将文件的最后修改时间延迟一段时间，否则不能提交
		
		File file=new File(strFileName);
		file.setLastModified(System.currentTimeMillis()+10000);
		try {
			wcManager.commit(strFileName, false, "commit the new revision, step 1");
			//cf.checkinFile(strFileName);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			MessageDialog.openError(null, Messages.getString("NewpmbeCheckInAction.13"), Messages.getString("NewpmbeCheckInAction.14")+e1); //$NON-NLS-1$ //$NON-NLS-2$
			e1.printStackTrace();
			return;
		}
		
		//TODO 下载或更新要checkout的文件
//		IWorkspace workspace = ResourcesPlugin.getWorkspace();
//		IWorkspaceRoot root=workspace.getRoot();
		try {
			File[] files=new File[1];
			files[0]=new File(strRawPath);
			wcManager.commitFiles(files, false, "commit the new revision, step 2");
			
			//上传原来没有的文件
			ArrayList<File> list = new ArrayList<File>();
			list = getUnversiondFolders(files[0], list);
			for(int j = 0; j < list.size(); j++){
				File importFile = list.get(j);
				String importPath = importFile.toURL().toString();
				
				String segment = importPath.substring((new File(wcManager.getLocalWorkRoot())).toURL().toString().length()+5);
				SVNURL url = wcManager.getRepositoryRootURL().appendPath(segment, false);
//				wcManager.importUnVersionedFiles(file, url, "commit the new revision, step 3", true);
//				SVNURL destURL = wcManager.getRepositoryRootURL().appendPath(selectedElement.getName(),false);
				wcManager.importDirectory(importFile.getAbsolutePath(), url, "import to the svn server", true);
			}
			
			String relativePath = selectedElement.getProject().getName()+"\\"+selectedElement.getProjectRelativePath().toString();
			String relativeURL = selectedElement.getProject().getName()
			+"/"+selectedElement.getProjectRelativePath().toString();
			SVNURL url = wcManager.getRepositoryRootURL().appendPath(relativeURL, false);
			//cf.checkinFiles(null,files);//?????/当没有修改的文件时
			if(selectedElement instanceof IProject){
				String prefix = "";
				if(selectedElement.getName().endsWith(".organization")){
					prefix = "组织模型";
				}else if(selectedElement.getName().endsWith(".process")){
					prefix = "过程模型";
				}else if(selectedElement.getName().endsWith(".resource")){
					prefix = "资源模型";
				}
				
				((IProject)selectedElement).delete(true,true,null);
				//selectedElement.delete(true, null);

//				wcManager.checkout(url, SVNRevision.HEAD, relativePath, true);
				//cf.checkoutFile(null, selectedElement.getProject().getName()+"\\"+selectedElement.getProjectRelativePath().toString()); //$NON-NLS-1$
				
				//File projectFile=new File(strRawPath);
				//deleteFiles(projectFile);
				
//				selectedElement.refreshLocal(2, null);
				((IProject)selectedElement).delete(true,true, null);
//				wcManager.checkout(url, SVNRevision.HEAD, relativePath, true);
				wcManager.checkout(wcManager.getRepositoryRootURL().appendPath(selectedElement.getName(), false), SVNRevision.HEAD, prefix+"/"+selectedElement.getName(), true);

//				String prefPath = selectedElement.getProject().getName()+"\\.settings\\"+"org.eclipse.core.resources.prefs";
//				System.out.println("请关注！！！！！！！！！！！！！！！！");
//				wcManager.commit(wcManager.getLocalWorkRoot()+"\\"+prefPath, false, "更新org.eclipse.core.resources.prefs文件");

				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				IWorkspaceRoot root = workspace.getRoot();
				
				IProject project=root.getProject(selectedElement.getName());
				IPath targetPath=new Path(wcManager.getLocalWorkRoot()+"\\"+prefix+"\\"+selectedElement.getName()); //$NON-NLS-1$

				IProjectDescription description=workspace.loadProjectDescription(
						new Path(wcManager.getLocalWorkRoot()+"\\"+prefix+"\\"+selectedElement.getName()+"\\.project")); //$NON-NLS-1$ //$NON-NLS-2$
				description.setLocation(targetPath);
				project.create(description, null);
				project.open(null);
				//刷新workspace
				//File projectFile=new File(strRawPath);
				//deleteFiles(projectFile);
//				selectedElement.getProject().refreshLocal(2, null);
				
		
				/*IProject project=root.getProject(projectName);
				IPath targetPath=new Path(cf.getWorkroot()+"\\"+projectName);
				IProjectDescription description=workspace.loadProjectDescription(
						new Path(cf.getWorkroot()+"\\"+projectName+"\\.project"));
				description.setLocation(targetPath);
				project.create(description, null);
				project.open(null);*/
			}
			else{
				String prefix = "";
				if(selectedElement.getProject().getName().endsWith(".organization")){
					prefix = "组织模型";
				}else if(selectedElement.getProject().getName().endsWith(".process")){
					prefix = "过程模型";
				}else if(selectedElement.getProject().getName().endsWith(".resource")){
					prefix = "资源模型";
				}
				selectedElement.delete(true, null);
				wcManager.checkout(url, SVNRevision.HEAD, prefix+"\\"+relativePath, true);
				String prefPath = selectedElement.getProject().getName()+"\\.settings\\"+"org.eclipse.core.resources.prefs";
				System.out.println("请关注！！！！！！！！！！！！！！！！");
				wcManager.commit(wcManager.getLocalWorkRoot()+"\\"+prefix+"\\"+prefPath, false, "更新org.eclipse.core.resources.prefs文件");

				//刷新workspace
				//File projectFile=new File(strRawPath);
				//deleteFiles(projectFile);
				selectedElement.getProject().refreshLocal(2, null);
			}
			MessageDialog.openInformation(null, Messages.getString("NewpmbeCheckInAction.17"), Messages.getString("NewpmbeCheckInAction.18")); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			MessageDialog.openError(null, Messages.getString("NewpmbeCheckInAction.19"), Messages.getString("NewpmbeCheckInAction.20")+e); //$NON-NLS-1$ //$NON-NLS-2$
		}
		
		//TODO:把本地文件改为只读IResource.setReadOnly(readOnly) 
//		try {
//			lockFiles(selectedElement.members());
//		} catch (CoreException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	

	}
	
	protected void deleteFiles(File file){
		if(file.isFile()){
//			if(file.getName().equals(".project")) //$NON-NLS-1$
//				return;
			file.delete();
		}
		else if(file.isDirectory()){
//			if(file.getName().equals(".settings")||file.getName().equals(".svn")) //$NON-NLS-1$ //$NON-NLS-2$
//				return;
			File[] files=file.listFiles();
			for(int i=0;i<files.length;i++){
				deleteFiles(files[i]);
			}
			file.delete();
		}
	}
	
	
	private boolean readXMLFile(String inFile,String tagName,WorkingCopyManager wcFunc) throws Exception {
		//		为解析XML作准备，创建DocumentBuilderFactory实例,指定DocumentBuilder 
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setValidating(false);
		DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException pce) {
			System.err.println(pce); //出异常时输出异常信息，然后退出，下同 
		}
		
		try {
			doc = db.parse(new File(inFile));
		} catch (DOMException dom) {
			System.err.println(dom.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe);
		}
		//		下面是解析XML的全过程，比较简单，先取根元素 
		//Element root = doc.getDocumentElement();
		//		取当前要处理的节点 
		NodeList folders = doc.getElementsByTagName(tagName);
		Element folder = (Element) folders.item(0);		
		if(folder == null){
			System.out.println(Messages.getString("NewpmbeCheckInAction.24")); //$NON-NLS-1$
			MessageDialog.openWarning(null, Messages.getString("NewpmbeCheckInAction.25"), Messages.getString("NewpmbeCheckInAction.26")); //$NON-NLS-1$ //$NON-NLS-2$
			return false;
		}
		//TODO 判断是否为本机用户在check in，如果不是同一个用户，返回,保证用户只能check In他所check out的节点
		String strLockedBy = folder.getAttribute("locked"); //$NON-NLS-1$
		if(!(folder.getAttribute("checked")).equalsIgnoreCase(wcFunc.getUserName())){ //$NON-NLS-1$
			System.out.println(wcFunc.getUserName()+Messages.getString("NewpmbeCheckInAction.29")); //$NON-NLS-1$
			System.out.println(folder.getAttribute("checked"));			 //$NON-NLS-1$
			if(strLockedBy.equalsIgnoreCase("")){ //$NON-NLS-1$
				MessageDialog.openWarning(null, Messages.getString("NewpmbeCheckInAction.32"), Messages.getString("NewpmbeCheckInAction.33")); //$NON-NLS-1$ //$NON-NLS-2$
				return false;
			}		
			if(strLockedBy.equalsIgnoreCase("false")){ //$NON-NLS-1$
				MessageDialog.openWarning(null, Messages.getString("NewpmbeCheckInAction.35"), Messages.getString("NewpmbeCheckInAction.36"));//请上传你Check out的那个活动 "); //$NON-NLS-1$ //$NON-NLS-2$
				return false;
			}
			MessageDialog.openWarning(null, Messages.getString("NewpmbeCheckInAction.37"), Messages.getString("NewpmbeCheckInAction.38") + folder.getAttribute("checked") + Messages.getString("NewpmbeCheckInAction.40"));	 //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			return false;
		}
		String strElement = selectedElement.toString();
		if(strLockedBy.indexOf(strElement) == -1){
			MessageDialog.openWarning(null, Messages.getString("NewpmbeCheckInAction.41"), Messages.getString("NewpmbeCheckInAction.42") + strLockedBy.substring(strLockedBy.indexOf("/"))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			return false;
		}
			
		
		
		//给当前节点的父节点的冻结锁减1
		delFrozenLockNode(folder);
		//构建当前文件夹对应的节点
		Element newFolder = doc.createElement(tagName);
		printSubFolder(selectedElement.members(),newFolder);
		
		folder.setAttribute("checked", "false"); //$NON-NLS-1$ //$NON-NLS-2$
		//用新构建的节点取代旧的节点,旧节点一定存在
		if(selectedElement instanceof IProject)
			doc.replaceChild(newFolder,folder);
		else{
			String parentTagName = tagName.substring(0, tagName.lastIndexOf("___")); //$NON-NLS-1$
			NodeList parentFolders = doc.getElementsByTagName(parentTagName);
			Element parentfolder = (Element) parentFolders.item(0);
			parentfolder.replaceChild(newFolder,folder);
		}
			
        //取当前要处理的节点的父节点
		/*String parentTagName = tagName.substring(0, tagName.lastIndexOf("___"));
		NodeList parentFolders = doc.getElementsByTagName(parentTagName);
		Element parentfolder = (Element) parentFolders.item(0);*/
		/*doc.removeChild(folder);
		doc.appendChild(newFolder);*/
		//保存取代了旧节点的文件
		try {
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			DOMSource source = new DOMSource(doc);
			transformer.setOutputProperty(OutputKeys.ENCODING, "GB2312"); //$NON-NLS-1$
			transformer.setOutputProperty(OutputKeys.INDENT, "yes"); //$NON-NLS-1$
			PrintWriter pw = new PrintWriter(new FileOutputStream(inFile));
			StreamResult result = new StreamResult(pw);
			transformer.transform(source, result);
			pw.flush();
			pw.close();
		} catch (TransformerException mye) {
			mye.printStackTrace();
		} catch (IOException exp) {
			exp.printStackTrace();
		}
		return true;
	}
	public void lockFiles(Object[] subResources) {
		
		if (subResources != null && subResources.length != 0) {
			for (int j = 0; j < subResources.length; j++) {
				if(subResources[j] instanceof IFile )
					if(subResources[j].toString().indexOf(".process_diagram")!= -1) //$NON-NLS-1$
					{
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
	public void printSubFolder(Object[] subResources, Element rootItem) {
		unlock(rootItem);
		if (subResources != null && subResources.length != 0) {
			for (int j = 0; j < subResources.length; j++) {
				if (subResources[j] instanceof IFolder) {
					String strNodeId = subResources[j].toString();
					if(strNodeId.indexOf(".settings") == -1){ //$NON-NLS-1$
						strNodeId = strNodeId.replaceAll("/", "___"); //$NON-NLS-1$ //$NON-NLS-2$
						System.out.println(strNodeId);
						Element folderItem = doc.createElement(strNodeId);
						unlock(folderItem);
						rootItem.appendChild(folderItem);
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
	}
	/**
	 * 删除修改锁
	 * @param rootItem
	 */
	private void unlock(Element item) {
		// TODO Auto-generated method stub
		item.setAttribute("locked","false"); //$NON-NLS-1$ //$NON-NLS-2$
		item.setAttribute("intFrozenLock", "0"); //$NON-NLS-1$ //$NON-NLS-2$
	}
	/**
	 * 将tagName节点的父节点及父节点以上节点的冻结锁减1
	 * @param node
	 */
	private void delFrozenLockNode(Node node) {
		// TODO Auto-generated method stub		
		Node nodeitem = node.getParentNode();
		while ((nodeitem != null)&& (nodeitem instanceof Element)) {
			String strFrozenLock = ((Element) nodeitem)
					.getAttribute("intFrozenLock"); //$NON-NLS-1$
			int intFronzeLock = Integer.parseInt(strFrozenLock);
			intFronzeLock--;
			((Element) nodeitem).setAttribute("intFrozenLock", String //$NON-NLS-1$
					.valueOf(intFronzeLock));
			nodeitem = nodeitem.getParentNode();
		}

	}
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub		
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof IContainer) {
				selectedElement = (IContainer) structuredSelection
						.getFirstElement();
			}
		}
	}
	public ArrayList<File> getUnversiondFolders(File file, ArrayList<File> fileList){
		if(file.isDirectory()){
			String svnString = file.getAbsolutePath()+"/.svn";
			File svnFolder = new File(svnString);
			if(!svnFolder.exists()){
				//将其加入到版本控制中
				fileList.add(file);
			}else{
				File[] files = file.listFiles();
				for(int i = 0; i < files.length; i++)
				{
					if(files[i].getName().equalsIgnoreCase(".svn"))
						continue;
					getUnversiondFolders(files[i], fileList);
				}
			}
		}
		return fileList;
	}
//1
//2,       3
//3, 4     5, 6
}