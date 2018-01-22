package newpmbe.propertydlg.popup.actions;

import java.io.File;
import java.util.Iterator;

import newpmbe.DlgPackage.CompositeDlg;
import newpmbe.DlgPackage.ProcessProDlg;
import newpmbe.DlgPackage.PropertyUtility;
import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;

import org.eclipse.gmf.runtime.emf.ui.properties.commands.SetModelPropertyValueCommand;

import org.eclipse.ui.views.properties.*;
import org.eclipse.jface.action.IAction;
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
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;

import vpml.*;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.impl.*;

public class OpenProcessPropertyAction extends AbstractActionDelegate implements IObjectActionDelegate {

	//@Override
	protected void doRun(IProgressMonitor progressMonitor){
		Shell shell = new Shell();
		/*
		 * 命令组合
		 */
		
		/**
		 * 判断所选择的diagram为过程视图还是组合活动视图
		 * 具体方法：判断当前点击的diagram视图文件的路径，
		 * 在project根目录下则为过程视图，否则为组合活动视图 
		 */
		
		//获取当前diagram所在文件路径
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		DiagramDocumentEditor targetDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
		IEditorInput activeInput = targetDiagramEditor.getEditorInput();

		IFile activeEditorFile = ((IFileEditorInput)activeInput).getFile();
		String filename = activeEditorFile.getName();
		String filePath = activeEditorFile.getRawLocation().toString();
		int index = filePath.lastIndexOf('/');
		String filepath = filePath.substring(0, index);
		String projectPath = activeEditorFile.getProject().getLocation().toString();
		
		IStructuredSelection strSle = getStructuredSelection();		
		Object selection = strSle.getFirstElement();
		IGraphicalEditPart editpart = (IGraphicalEditPart)selection;
		EObject obj = editpart.resolveSemanticElement();
		
		boolean isSim = editpart.getClass().toString().contains("newpmbe.simulation");
		int simPathLen = projectPath.length() + 21+ 2*(activeEditorFile.getProject().getName().length() -8) +  14;
		
		//该文件不在工程目录下，为子过程视图或子模拟视图
		if(((!filepath.equals(projectPath)) && (!isSim)) || (isSim && simPathLen < filepath.length()))
		{
			//获取过程视图语义文件
			
			//切换到上层文件件
			int posu = filepath.lastIndexOf('/');				
			String projectpath = filepath.substring(0, posu);
			
			File file = new File(projectpath);
			File filelist[] = file.listFiles();
			for (int i = 0; i < filelist.length; i++)
			{
				if (filelist[i].isFile() && (filelist[i].getName().endsWith("process_diagram")||filelist[i].getName().endsWith("simulation_diagram")))
				{
					filePath = filelist[i].getAbsolutePath();
					break;
				}
			}
			
//			int posd = filePath.lastIndexOf('_');
//			String resname = filePath.substring(0, posd);
			String resname = filePath;
			
//			int pos = filename.indexOf('.');
//			String composeName = filename.substring(0, pos);
			EMObject emo = (EMObject)obj;
			//获取过程视图对象
			EMPDiagram rootModel = (EMPDiagram) PropertyUtility.GetDiagramObject(resname);
			
			//获取组合活动对象
			EList compose = rootModel.getCompActivities();
			Iterator iter = compose.iterator();
			EObject rs =  null;
			while(iter.hasNext())
			{
				EMObject base = (EMObject) iter.next();
				if (base.getId().equals(emo.getId())) 
				{
					rs = base;
					break;
				}			
			}
			if(rs == null)
			{
				return;
			}
			
			CompositeDlg dlg = new CompositeDlg(shell, rs, false,isSim);
			dlg.open();
		}
		else	//为主过程视图或主模拟视图
		{
//			IStructuredSelection strSle = getStructuredSelection();		
//			Object selection = strSle.getFirstElement();
//			IGraphicalEditPart editpart = (IGraphicalEditPart)selection;
			
//			EObject obj = editpart.resolveSemanticElement();
			
			ProcessProDlg dlg = new ProcessProDlg(shell, obj,isSim); 
			if (dlg.open() == Window.OK) 
			{
				CompositeCommand cc = new CompositeCommand("dlg");
				NewPMBEPropertySource ns = new NewPMBEPropertySource();
				IPropertySource ips = ns.getPropertySource(obj);
				
				SetModelPropertyValueCommand name = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Name", obj, ips, "Name", dlg.getName());
				cc.compose(name);
				
				SetModelPropertyValueCommand id = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Id", obj, ips, "Id", dlg.getId());
				cc.compose(id);
				
				SetModelPropertyValueCommand creater = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Creater", obj, ips, "Creater", dlg.getCreater());
				cc.compose(creater);
				
				SetModelPropertyValueCommand description = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Description", obj, ips, "Description", dlg.getDescription());
				cc.compose(description);
				
				SetModelPropertyValueCommand re_modifier = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Last Modifier", obj, ips, "Last Modifier", dlg.getModifier());
				cc.compose(re_modifier);
				
				SetModelPropertyValueCommand time_create = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Last Modified Date", obj, ips, "Last Modified Date", dlg.getTime_modify());
				cc.compose(time_create);
				
				SetModelPropertyValueCommand time_modify = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Created Date", obj, ips, "Created Date", dlg.getTime_create());
				cc.compose(time_modify);			
				
				SetModelPropertyValueCommand starttime = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Started Time", obj, ips, "Started Time", dlg.getSt());
				cc.compose(starttime);	
				
				SetModelPropertyValueCommand durationTime = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Duration Time", obj, ips, "Duration Time", dlg.getDsd());
				cc.compose(durationTime);
				
				SetModelPropertyValueCommand timeunit = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Time Unit", obj, ips, "Time Unit", dlg.getTimeunit());
				cc.compose(timeunit);
				
				editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(cc));
			}
		}
	}
}
