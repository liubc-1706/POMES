package process.diagram.actions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;
import newpmbe.svn.wc.WorkingCopyManager;

//import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.wc.SVNRevision;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class NewpmbeCheckOutAction implements IObjectActionDelegate {

	private IContainer selectedElement = null;
	private boolean validating;
	private Document document;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub

	}

	public void run(IAction action) {
		String projectName=selectedElement.getProject().getName();		
		String strFileName = null;
		String tagName = null;
		IPath path;
		IPath rawPath;
		String strPath;
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
			strFileName = strRawPath.substring(0,strRawPath.lastIndexOf(strPath))+ ".settings/" + "tree.xml";	 //$NON-NLS-1$ //$NON-NLS-2$
			System.out.println(strFileName);
			tagName = ((IContainer)selectedElement).toString();
			tagName = tagName.replaceAll("/", "___"); //$NON-NLS-1$ //$NON-NLS-2$
		}
		System.out.println(tagName);
		
		// TODO 从服务器上得tree.xml文件 by fan
		WorkingCopyManager wcManager=new WorkingCopyManager();
		if(!wcManager.configConnection()){
			MessageDialog.openError(null, "连接服务器出错", "无法连接到服务器，请检查网络状况！");
			return;
		}
		File treeFile = new File(strFileName);
		
        if(treeFile.getParentFile().exists()){
            boolean flag = false;
            File[] files = treeFile.getParentFile().listFiles();
            for(int i = 0; i < files.length; i++){
                if(files[i].getName().equals(".svn"))
                    flag = true;
            }
            if(flag == false){
                MessageDialog.openError(null, "错误", "模块未添加至服务器，请在签入签出之前先进行添加操作！");
                return;
            }
        }
        else{
            MessageDialog.openError(null, "错误", "未找到相应文件，请确保文件路径正确！");
            return;
        }
		try{
			wcManager.update(strFileName, SVNRevision.HEAD, true);
		}catch(Exception e){
			e.printStackTrace();
			MessageDialog.openError(null,Messages.getString("NewpmbeCheckOutAction.9"),Messages.getString("NewpmbeCheckOutAction.10")+e); //$NON-NLS-1$ //$NON-NLS-2$
			return;
		}
		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			factory.setValidating(validating);
			DocumentBuilder builder = factory.newDocumentBuilder();
			document = builder.parse(new File(strFileName));
			document.getDocumentElement().normalize();
			Node node = document.getElementsByTagName(tagName).item(0);
			if(node == null){
				MessageDialog.openError(null, Messages.getString("NewpmbeCheckOutAction.11"), Messages.getString("NewpmbeCheckOutAction.12")); //$NON-NLS-1$ //$NON-NLS-2$
				return;
			}		
			
			//根据子节点是否加了修改锁判断该节点可否加修改锁
			if (ableLockNode(node) == false)
				return; //加锁不成功，返回
			//根据该节点的冻结锁是否为0，判断该节点可否加修改锁
			/*if (canFrozenLockNode(node.getParentNode()) == false)
				return;*/
			if(!((Element) node).getAttribute("intFrozenLock").equalsIgnoreCase("0")) //$NON-NLS-1$ //$NON-NLS-2$
				return;
			//加修改锁
			addLockNode(node,wcManager);
			//加冻结锁
			addFrozenLockNode(node);
			//标志check out该节点的为该用户，而不是其他用户
			//mark(node);
			//TODO check out并加锁 该文件及其子文件并且下载直接父活动 by 樊束川
		} catch (Exception exp) {
			exp.printStackTrace();
		}
		//file.createNewFile();
		//保存设置了修改锁和冻结锁的文件
		
		
		try {
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			DOMSource source = new DOMSource(document);
			transformer.setOutputProperty(OutputKeys.ENCODING, "GB2312"); //$NON-NLS-1$
			transformer.setOutputProperty(OutputKeys.INDENT, "yes"); //$NON-NLS-1$
			FileOutputStream output=new FileOutputStream(strFileName);
			PrintWriter pw = new PrintWriter(output);
			StreamResult result = new StreamResult(pw);
			//StreamResult result=new StreamResult(new File(strFileName));
			transformer.transform(source, result);
			pw.flush();
			pw.close();
			
			
		} catch (TransformerException mye) {
			mye.printStackTrace();
		} catch (IOException exp) {
			exp.printStackTrace();
		}
		File file=new File(strFileName);
		file.setLastModified(System.currentTimeMillis()+10000);
		System.out.println(file.lastModified());
		
		//上传修改后的tree.xml文件
		try {
			wcManager.commit(strFileName, false, "Commit the latest tree structure.");
			//cf.checkinFile(strFileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			MessageDialog.openError(null, Messages.getString("NewpmbeCheckOutAction.17"), Messages.getString("NewpmbeCheckOutAction.18")+e); //$NON-NLS-1$ //$NON-NLS-2$
			return;
		}
		
		
		//先保存Editor
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		activePage.closeAllEditors(true);
		
		//checkout要修改的文件
/*		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root=workspace.getRoot();*/
		try{
				String prefix = "";
				if(selectedElement.getName().endsWith(".organization")){
					prefix = "组织模型";
				}else if(selectedElement.getName().endsWith(".process")){
					prefix = "过程模型";
				}else if(selectedElement.getName().endsWith(".resource")){
					prefix = "资源模型";
				}
			
			
			String relativePath = prefix +"\\"+ selectedElement.getProject().getName()
					+"\\"+selectedElement.getProjectRelativePath().toString();
			String relativeURL = selectedElement.getProject().getName()
					+"/"+selectedElement.getProjectRelativePath().toString();
			SVNURL url = wcManager.getRepositoryRootURL().appendPath(relativeURL, true);
			if(selectedElement instanceof IProject){
				//selectedElement.delete(true, null);

				//File selectedFile = new File(selectedElement.getProject().getName()+"\\"+selectedElement.getProjectRelativePath().toString());
				wcManager.checkout(url, SVNRevision.HEAD, relativePath,true);
				//cf.checkoutFile(null, selectedElement.getProject().getName()+"\\"+selectedElement.getProjectRelativePath().toString()); //$NON-NLS-1$
				selectedElement.refreshLocal(2, null);
				
				/*IProject project=root.getProject(projectName);
				IPath targetPath=new Path(cf.getWorkroot()+"\\"+projectName);
				IProjectDescription description=workspace.loadProjectDescription(
						new Path(cf.getWorkroot()+"\\"+projectName+"\\.project"));
				description.setLocation(targetPath);
				project.create(description, null);
				project.open(null);*/
			}
			else{
				//if it's folder type
				
				//String relativePath = selectedElement.getProject().getName()+"\\"+selectedElement.getProjectRelativePath().toString();
				//SVNURL url = wcFunc.getRepositoryRootURL().appendPath(relativePath, false);
				wcManager.checkout(url, SVNRevision.HEAD, relativePath, true);
				File processFile = new File(wcManager.getLocalWorkRoot()+"\\"+relativePath+"\\"+selectedElement.getName()+".process");
				//cf.checkoutFile(null, selectedElement.getProject().getName()+"\\"+selectedElement.getProjectRelativePath().toString()); //$NON-NLS-1$
				//File processFile=new File(cf.getWorkroot()+"\\"+selectedElement.getProject().getName()+"\\"+selectedElement.getProjectRelativePath().toString()+"\\"+selectedElement.getName()+".process"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				System.out.println(processFile.getAbsolutePath());
				if(processFile.exists()){
					
					String parentRelativePath=selectedElement.getParent().getProjectRelativePath().toString();
					String selectedProjectName = selectedElement.getProject().getName();
					String parentName = selectedElement.getParent().getName();
					String targetPath=null;
					
					//why not combin to one sentence???????????? we surely can do that!!!
					if(parentRelativePath.length()==0){
						targetPath=selectedProjectName + "/"+ parentName;
					}
					else{
						targetPath=selectedProjectName +"/"+parentRelativePath+"/"+ parentName;
					}
					System.out.println(targetPath);
					File targetFile=new File(wcManager.getLocalWorkRoot()+"/"+targetPath); //$NON-NLS-1$
					if(!targetFile.exists()){
						SVNURL sourceURL = wcManager.getRepositoryRootURL().appendPath(targetPath, false);
						wcManager.checkout(sourceURL, SVNRevision.HEAD, targetPath, false);
						System.out.println("请关注！！！！！！！！！！！！！！！！");
//						wcManager.commit(relativePath, false, "更新org.eclipse.core.resources.prefs文件");
					}
				}
				selectedElement.getParent().refreshLocal(2, null);
			}
			MessageDialog.openInformation(null, Messages.getString("NewpmbeCheckOutAction.8"), Messages.getString("NewpmbeCheckOutAction.32")); //$NON-NLS-1$ //$NON-NLS-2$
		}catch(Exception e){
			e.printStackTrace();
			MessageDialog.openError(null, Messages.getString("NewpmbeCheckOutAction.33"), Messages.getString("NewpmbeCheckOutAction.34")+e); //$NON-NLS-1$ //$NON-NLS-2$
		}
		//TODO:把本地文件改为可写IResource.setReadOnly(false) */
//		try {
//			unLockFiles(selectedElement.members());
//		} catch (CoreException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	

	public void unLockFiles(Object[] subResources) {

		if (subResources != null && subResources.length != 0) {
			for (int j = 0; j < subResources.length; j++) {
				if (subResources[j] instanceof IFile)
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
					try {
						unLockFiles(((IFolder) subResources[j]).members());
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}	

	/**
	 * 根据父节点的冻结锁是否全部为0，判断该节点可否加修改锁
	 * @param node
	 */
	private void addLockNode(Node node,WorkingCopyManager wcFunc) {
		// TODO Auto-generated method stub
		((Element) node).setAttribute("locked", "true By " + selectedElement.toString()); //$NON-NLS-1$ //$NON-NLS-2$
		((Element) node).setAttribute("checked", wcFunc.getUserName()); //$NON-NLS-1$
		NodeList list = node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			Node nodeitem = list.item(i);
			if(nodeitem instanceof Element)
				addLockNode(nodeitem,wcFunc);
		}
	}
	/**
	 * 	根据子节点是否加了修改锁判断该节点可否加修改锁
	 * @param node
	 * @return
	 */
	private boolean canFrozenLockNode(Node node) {
		// TODO Auto-generated method stub
		if ((node != null) && (node instanceof Element)){
			if (!((Element) node).getAttribute("intFrozenLock").equalsIgnoreCase("0")) //$NON-NLS-1$ //$NON-NLS-2$
				return false;			
		canFrozenLockNode(node.getParentNode());
		}		
		return true;
	}

	/**
	 * 将tagName节点的父节点及父节点以上节点的冻结锁加1
	 * @param node
	 */
	private void addFrozenLockNode(Node node) {
		// TODO Auto-generated method stub		
		Node nodeitem = node.getParentNode();
		while ((nodeitem != null)&& (nodeitem instanceof Element)) {
			String strFrozenLock = ((Element) nodeitem)
					.getAttribute("intFrozenLock"); //$NON-NLS-1$
			int intFronzeLock = Integer.parseInt(strFrozenLock);
			intFronzeLock++;
			((Element) nodeitem).setAttribute("intFrozenLock", String //$NON-NLS-1$
					.valueOf(intFronzeLock));
			nodeitem = nodeitem.getParentNode();
		}

	}

	/**
	 * 判断tagname节点及其子节点是否加上了修改锁，如果全都没加 ，则将tagname节点及其子节点全部加上修改锁，如果已经有加上的，则返回
	 * @param node 
	 */
	private boolean ableLockNode(Node node) {
		// TODO Auto-generated method stub
		if ((((Element) node).getAttribute("locked")).startsWith("true")){ //$NON-NLS-1$ //$NON-NLS-2$
			String strLockNode = node.toString();
			String strLockedElement = strLockNode.substring(strLockNode.indexOf("___"),strLockNode.lastIndexOf(":")); //$NON-NLS-1$ //$NON-NLS-2$
			strLockedElement = strLockedElement.replaceAll("___", "/"); //$NON-NLS-1$ //$NON-NLS-2$
			MessageDialog.openError(null, "error", Messages.getString("NewpmbeCheckOutAction.7") + ((Element) node).getAttribute("checked") + Messages.getString("NewpmbeCheckOutAction.6")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			return false;
		}
			
		NodeList list = node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			Node nodeitem = list.item(i);
			if(nodeitem instanceof Element){
				System.out.println(nodeitem);
				if(!ableLockNode(nodeitem))
					return false;
			}
		}
		return true;
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

}
