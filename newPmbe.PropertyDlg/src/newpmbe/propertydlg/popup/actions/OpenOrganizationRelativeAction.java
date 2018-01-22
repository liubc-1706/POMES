package newpmbe.propertydlg.popup.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import newpmbe.DlgPackage.MessageDialog;
import newpmbe.DlgPackage.RESOURCETYPE;
import newpmbe.DlgPackage.ResourceRelateDlg;

import newpmbe.DlgPackage.PropertyUtility;
import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;

import org.eclipse.gmf.runtime.emf.ui.properties.commands.SetModelPropertyValueCommand;

import org.eclipse.ui.views.properties.*;
import org.eclipse.jface.action.IAction;
//import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;

import vpml.*;
import vpml.organizationpackage.EMODiagram;
import vpml.organizationpackage.EMOResourceGroupType;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.impl.*;
import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.EMRRole;

public class OpenOrganizationRelativeAction extends AbstractActionDelegate implements IObjectActionDelegate {
	private HashMap<String, String> filelist = new HashMap();
	//@Override
	protected void doRun(IProgressMonitor progressMonitor){
		Shell shell = new Shell();
		/*
		 * 命令组合
		 */
//		
//		/**
//		 * 判断所选择的diagram为过程视图还是组合活动视图
//		 * 具体方法：判断当前点击的diagram视图文件的路径，
//		 * 在project根目录下则为过程视图，否则为组合活动视图 
//		 */
//		
//		//获取当前diagram所在文件路径
//		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
//		.getWorkbench().getActiveWorkbenchWindow();
//		IWorkbenchPage activePage = window.getActivePage();
//		DiagramDocumentEditor targetDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
//		IEditorInput activeInput = targetDiagramEditor.getEditorInput();
//
//		IFile activeEditorFile = ((IFileEditorInput)activeInput).getFile();
//		String filename = activeEditorFile.getName();
//		String filePath = activeEditorFile.getRawLocation().toString();
//		int index = filePath.lastIndexOf('/');
//		String filepath = filePath.substring(0, index);
//		String projectPath = activeEditorFile.getProject().getLocation().toString();
//		
//		//该文件不在工程目录下
//		if(!filepath.equals(projectPath))
//		{
//			return;
//		}
//		else	//为过程视图
//		{
			IStructuredSelection strSle = getStructuredSelection();		
			Object selection = strSle.getFirstElement();
			IGraphicalEditPart editpart = (IGraphicalEditPart)selection;
			
			EMPDiagram obj = (EMPDiagram)editpart.resolveSemanticElement();
			EMODiagram emoDiagram = null;
			
			DiagramDocumentEditor editor = (DiagramDocumentEditor)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			IFile editorFile = ((IFileEditorInput)editor.getEditorInput()).getFile();
			emoDiagram = (EMODiagram)this.getResourceDiagram(editorFile);
			//获得原来关联的视图。
//			if(obj.getEmoDiagrams()!= null && obj.getEmoDiagrams().size() != 0){
//				emoDiagram = (EMODiagram)obj.getEmoDiagrams().get(0);
//			}
			
			//如果目前没有资源视图，则弹出提示，不启动资源选择窗口
			IWorkspace ws = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot root = ws.getRoot();
//			IPath path = root.getRawLocation();
//			String pathstr = path.toString();
//			pathstr += "\\资源模型\\";
			
			if(!findOrganizationFile(root)){
				MessageDialog.openWarning(null, "未找到组织模型", "没有组织模型，请先定义组织视图");
				return;
			}
			
			
			ResourceRelateDlg dlg = new ResourceRelateDlg(shell, obj, RESOURCETYPE.ORGNIZATION);
			if (dlg.open() == Window.OK) 
			{
				if(dlg.getDiagramList().size()==0)
					return;
				//如果原来已经有关联的资源视图
				if(emoDiagram != null){
					if(emoDiagram.getId().equals(((EMODiagram)dlg.getDiagramList().get(0)).getId())){
						return;
					}else{
						//不相等，即改变了关联的资源视图
						if(!MessageDialog.openConfirm(null, "已关联组织视图", 
								"该过程视图已关联到其它组织视图，您确认重新关联吗？")){
							return;
						}else{
							//改变相关联的资源视图中的元素的名字，使其变为null
							CompositeCommand cc = new CompositeCommand("dlg");
							NewPMBEPropertySource ns = new NewPMBEPropertySource();
							List list = editpart.getChildren();
							for(int i = 0; i < list.size(); i++){
								IGraphicalEditPart childEditPart = (IGraphicalEditPart)list.get(i);
								EObject childObj = childEditPart.resolveSemanticElement();
								if(childObj instanceof EMOResourceGroupType || childObj instanceof EMRRole){
									IPropertySource ips = ns.getPropertySource(childObj);
									SetModelPropertyValueCommand name = new SetModelPropertyValueCommand(childEditPart.getEditingDomain(), "Name", childObj, ips, "Name", null);	
									cc.compose(name);
								}
							}
							editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(cc));
						}
					}
				}
//				CompositeCommand cc = new CompositeCommand("dlg");
//				NewPMBEPropertySource ns = new NewPMBEPropertySource();
//				IPropertySource ips = ns.getPropertySource(obj);
				
//				SetModelPropertyValueCommand name = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Emo Diagrams", obj, ips, "Emo Diagrams", dlg.getDiagramList());
//				cc.compose(name);
				
//				editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(cc));
				
				
				//在文件中记录所关联的资源的名字，格式为:fileName | filePath | resourceName | resourcePath
				//查找文件.record是否已存在，如果不存在，创建它
				IProject project = editorFile.getProject();
				IFile recordFile = project.getFile(".orgrecord");
				if(!recordFile.exists()){
					try {
						recordFile.create(null, true, new NullProgressMonitor());
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				java.io.File nativeFile = recordFile.getRawLocation().toFile();
				if(!nativeFile.exists()){
					try {
						nativeFile.createNewFile();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				Boolean isExist = false;
				StringBuffer cache = new StringBuffer();
				//先读入，看有没有此条目
				 try { 
					 FileReader fr = new FileReader(nativeFile);
					        BufferedReader br = new BufferedReader(fr);
					        String record = new String();
					        while ((record = br.readLine()) != null) {
					        	String strs[] = record.split("=");
					        	if(strs[0].equals(editor.getTitle())
					        			&& strs[1].equals(editorFile.getRawLocation().toString())){
					        	//已经包含了此条目，则修改此条目
					        		isExist = true;
					        		cache.append(strs[0] + "=" + strs[1] + "="
					        				+dlg.getResourceFilePath()+ "="
					        				+dlg.getResourceName());
					        		cache.append("\n");
					        	}else{
					        		cache.append(record);
					        		cache.append("\n");
					        	}
					 }
					 br.close();
					 fr.close(); 
			      } catch (IOException e) { 
			          System.out.println("IO错误：读写操作失败");
			          e.printStackTrace();
			      }
			    try {
			    	//看是否存在，若存在，则输出cache
			    	FileWriter fw = null;
			    	PrintWriter out = null;
			    	if(isExist == true){
			    		fw = new FileWriter(nativeFile, false);
			    		out = new PrintWriter(fw);
			    		out.print(cache);
			    	}else{
			    	//否则，追加写
				    	fw = new FileWriter(nativeFile, true);
				    	out = new PrintWriter(fw);    
				    	out.print(editor.getTitle()+"="+editorFile.getRawLocation());
				    	out.println("="+dlg.getResourceFilePath()
				    			+ "="+dlg.getResourceName());
			    	}
			    	out.close();
			    	fw.close();
			    	     } catch (IOException e) { 
			    	         System.out.println("Uh oh, got an IOException error!");
			    	         e.printStackTrace();
			    	     }
				
				dlg.getResourceFilePath();
			}
		}
	//读取当前资源视图
	private boolean findOrganizationFile(IWorkspaceRoot root)
	{
		boolean found = false;
		IProject[] projects = root.getProjects();
		for(int i = 0; i < projects.length; i++){
			if(projects[i].getName().endsWith(".organization")){
				String fileName = projects[i].getName()+"_diagram";
				IFile file = projects[i].getFile(fileName);
				found = true;
			}
		}
		return found;
	}
//	}
	public EMDiagram getResourceDiagram(IFile editorFile){
//		Boolean isExist = false;
		EMDiagram emDiagram = null;
		//先读入，看有没有此条目
		IFile recordFile = editorFile.getProject().getFile(".orgrecord");
		if(!recordFile.exists())
			return null;
		 try { 
			 FileReader fr = new FileReader(recordFile.getRawLocation().toFile());
			        BufferedReader br = new BufferedReader(fr);
			        String record = new String();
			        while ((record = br.readLine()) != null) {
			        	String strs[] = record.split("=");
			        	if(strs[0].equals(editorFile.getName())
			        			&& strs[1].equals(editorFile.getRawLocation().toString())){
			        	//已经包含了此条目，则修改此条目
//			        		isExist = true;
			        		emDiagram = (EMDiagram)PropertyUtility.GetDiagramObject(strs[2]);
			        		break;
			        	}
			 }
			 br.close();
			 fr.close(); 
	      } catch (IOException e) { 
	          System.out.println("IO错误：读写操作失败");
	          e.printStackTrace();
	      }
	      return emDiagram;
	}
}
