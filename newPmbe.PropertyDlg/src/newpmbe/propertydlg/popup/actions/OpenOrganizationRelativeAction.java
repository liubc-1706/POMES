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
		 * �������
		 */
//		
//		/**
//		 * �ж���ѡ���diagramΪ������ͼ������ϻ��ͼ
//		 * ���巽�����жϵ�ǰ�����diagram��ͼ�ļ���·����
//		 * ��project��Ŀ¼����Ϊ������ͼ������Ϊ��ϻ��ͼ 
//		 */
//		
//		//��ȡ��ǰdiagram�����ļ�·��
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
//		//���ļ����ڹ���Ŀ¼��
//		if(!filepath.equals(projectPath))
//		{
//			return;
//		}
//		else	//Ϊ������ͼ
//		{
			IStructuredSelection strSle = getStructuredSelection();		
			Object selection = strSle.getFirstElement();
			IGraphicalEditPart editpart = (IGraphicalEditPart)selection;
			
			EMPDiagram obj = (EMPDiagram)editpart.resolveSemanticElement();
			EMODiagram emoDiagram = null;
			
			DiagramDocumentEditor editor = (DiagramDocumentEditor)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			IFile editorFile = ((IFileEditorInput)editor.getEditorInput()).getFile();
			emoDiagram = (EMODiagram)this.getResourceDiagram(editorFile);
			//���ԭ����������ͼ��
//			if(obj.getEmoDiagrams()!= null && obj.getEmoDiagrams().size() != 0){
//				emoDiagram = (EMODiagram)obj.getEmoDiagrams().get(0);
//			}
			
			//���Ŀǰû����Դ��ͼ���򵯳���ʾ����������Դѡ�񴰿�
			IWorkspace ws = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot root = ws.getRoot();
//			IPath path = root.getRawLocation();
//			String pathstr = path.toString();
//			pathstr += "\\��Դģ��\\";
			
			if(!findOrganizationFile(root)){
				MessageDialog.openWarning(null, "δ�ҵ���֯ģ��", "û����֯ģ�ͣ����ȶ�����֯��ͼ");
				return;
			}
			
			
			ResourceRelateDlg dlg = new ResourceRelateDlg(shell, obj, RESOURCETYPE.ORGNIZATION);
			if (dlg.open() == Window.OK) 
			{
				if(dlg.getDiagramList().size()==0)
					return;
				//���ԭ���Ѿ��й�������Դ��ͼ
				if(emoDiagram != null){
					if(emoDiagram.getId().equals(((EMODiagram)dlg.getDiagramList().get(0)).getId())){
						return;
					}else{
						//����ȣ����ı��˹�������Դ��ͼ
						if(!MessageDialog.openConfirm(null, "�ѹ�����֯��ͼ", 
								"�ù�����ͼ�ѹ�����������֯��ͼ����ȷ�����¹�����")){
							return;
						}else{
							//�ı����������Դ��ͼ�е�Ԫ�ص����֣�ʹ���Ϊnull
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
				
				
				//���ļ��м�¼����������Դ�����֣���ʽΪ:fileName | filePath | resourceName | resourcePath
				//�����ļ�.record�Ƿ��Ѵ��ڣ���������ڣ�������
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
				//�ȶ��룬����û�д���Ŀ
				 try { 
					 FileReader fr = new FileReader(nativeFile);
					        BufferedReader br = new BufferedReader(fr);
					        String record = new String();
					        while ((record = br.readLine()) != null) {
					        	String strs[] = record.split("=");
					        	if(strs[0].equals(editor.getTitle())
					        			&& strs[1].equals(editorFile.getRawLocation().toString())){
					        	//�Ѿ������˴���Ŀ�����޸Ĵ���Ŀ
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
			          System.out.println("IO���󣺶�д����ʧ��");
			          e.printStackTrace();
			      }
			    try {
			    	//���Ƿ���ڣ������ڣ������cache
			    	FileWriter fw = null;
			    	PrintWriter out = null;
			    	if(isExist == true){
			    		fw = new FileWriter(nativeFile, false);
			    		out = new PrintWriter(fw);
			    		out.print(cache);
			    	}else{
			    	//����׷��д
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
	//��ȡ��ǰ��Դ��ͼ
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
		//�ȶ��룬����û�д���Ŀ
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
			        	//�Ѿ������˴���Ŀ�����޸Ĵ���Ŀ
//			        		isExist = true;
			        		emDiagram = (EMDiagram)PropertyUtility.GetDiagramObject(strs[2]);
			        		break;
			        	}
			 }
			 br.close();
			 fr.close(); 
	      } catch (IOException e) { 
	          System.out.println("IO���󣺶�д����ʧ��");
	          e.printStackTrace();
	      }
	      return emDiagram;
	}
}
