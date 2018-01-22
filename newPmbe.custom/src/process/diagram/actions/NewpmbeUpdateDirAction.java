package process.diagram.actions;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import newpmbe.svn.wc.WorkingCopyManager;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.tmatesoft.svn.core.wc.SVNRevision;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class NewpmbeUpdateDirAction implements IObjectActionDelegate {

	private IProject selectedElement;
	private Document doc = null;
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub

	}

	public void run(IAction action) {
		// TODO Auto-generated method stub
//		 下面是建立XML文档内容的过程
		String strNodeId = ((IProject) selectedElement).getLocation().toString() + "/.settings/tree.xml";		 //$NON-NLS-1$
		File file = new File(strNodeId);
		if(!file.exists()){
			MessageDialog.openError(null, "更新错误", "模型还未加入服务器，请先添加模型！"); //$NON-NLS-1$ //$NON-NLS-2$
			return;
		}
        if(file.getParentFile().exists()){
            boolean flag = false;
            File[] files = file.getParentFile().listFiles();
            for(int i = 0; i < files.length; i++){
                if(files[i].getName().equals(".svn")){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                MessageDialog.openError(null, "错误", "模块未添加至服务器，请先添加模型！");
                return;
            }
        }
        WorkingCopyManager wcManager = new WorkingCopyManager();
		if(!wcManager.configConnection()){
			MessageDialog.openError(null, "连接服务器出错", "无法连接到服务器，请检查网络状况！");
			return;
		}
		try {
			wcManager.update(selectedElement.getLocation().toString(), SVNRevision.HEAD, true);
//			updateDirectory(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			MessageDialog.openError(null, "更新错误", "更新模型时出错！");
			return;
		}
		MessageDialog.openInformation(null, "更新完成", "更新模型成功！");
	}
	
	private void updateDirectory(File inFile) throws Exception {
		//		为解析XML作准备，创建DocumentBuilderFactory实例,指定DocumentBuilder 
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
			System.err.println(pce); //出异常时输出异常信息，然后退出，下同 
		}
		
		try {
			doc = db.parse(inFile);
		} catch (DOMException dom) {
			System.err.println(dom.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe);
		}
		//下面是解析XML的全过程，比较简单，先取根元素 
		//Element root = doc.getDocumentElement();
		//取根节点
		Node node = doc.getFirstChild();						
		buildFolder(node);
	}
	private void buildFolder(Node node) {
		// TODO Auto-generated method stub		
		String path = node.getNodeName();
		String projectRootName = ((IProject)selectedElement).toString();
		//projectRootName = projectRootName.replaceFirst("P", "A");
		path = path.replaceAll("___", "/");	 //$NON-NLS-1$ //$NON-NLS-2$
		if(path.length() != projectRootName.length()){			
			path = path.substring(projectRootName.length() + 1);
			IFolder folder=((IProject)selectedElement).getFolder(path);
			if(!folder.exists()){
				try{
					IProgressMonitor monitor = new NullProgressMonitor();
					folder.create(true, true, monitor);
				}catch(Exception e){
					e.printStackTrace();
				}			
			}
		}		
		NodeList list = node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			Node nodeitem = list.item(i);
			if(nodeitem instanceof Element)
				buildFolder(nodeitem);
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
