package newpmbe.propertydlg.popup.actions;

import newpmbe.DlgPackage.BatchActivityProDlg;
import newpmbe.DlgPackage.CompositeDlg;
import newpmbe.DlgPackage.ProductProDlg;
import org.eclipse.gmf.runtime.emf.ui.properties.commands.SetModelPropertyValueCommand;

import org.eclipse.ui.views.properties.*;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;

import vpml.*;
import vpml.processpackage.impl.*;

public class OpenBatchActivityPropertyAction extends AbstractActionDelegate implements IObjectActionDelegate {

	//@Override
	protected void doRun(IProgressMonitor progressMonitor){
		Shell shell = new Shell();
		/*
		 * 命令组合
		 */
		
		IStructuredSelection strSle = getStructuredSelection();
		Object selection = strSle.getFirstElement();
		IGraphicalEditPart editpart = (IGraphicalEditPart)selection;
		
		EObject obj = editpart.resolveSemanticElement();
		
		
		//获得当前编辑器对应的文件所在的路径
		DiagramDocumentEditor editor = (DiagramDocumentEditor)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		IFile file = ((IFileEditorInput)editor.getEditorInput()).getFile();
		
		BatchActivityProDlg dlg = new BatchActivityProDlg(shell, obj, editpart.getClass().toString().contains("newpmbe.simulation"), file);
		
//		BatchActivityProDlg dlg = new BatchActivityProDlg(shell, obj,editpart.getClass().toString().contains("newpmbe.simulation"));
		if (dlg.open() == Window.OK) 
		{
			CompositeCommand cc = new CompositeCommand("dlg");
			NewPMBEPropertySource ns = new NewPMBEPropertySource();
			IPropertySource ips = ns.getPropertySource(obj);
			
			SetModelPropertyValueCommand name = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Name", obj, ips, "Name", dlg.getName());
			cc.compose(name);
			
			SetModelPropertyValueCommand id = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Id", obj, ips, "Id", dlg.getId());
			cc.compose(id);
			
			SetModelPropertyValueCommand procedure = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Procedure", obj, ips, "Procedure", dlg.getProcedure());
			cc.compose(procedure);
			
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
			
			SetModelPropertyValueCommand duration_time = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Duration Time", obj, ips, "Duration Time", dlg.getDsd());
			cc.compose(duration_time);
			
			SetModelPropertyValueCommand start_time = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Start Time", obj, ips, "Start Time", dlg.getSt());
			cc.compose(start_time);
			
			SetModelPropertyValueCommand priority = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Priority", obj, ips, "Priority", dlg.getPriority());
			cc.compose(priority);
			
			SetModelPropertyValueCommand isdefault = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Is Default", obj, ips, "Is Default", dlg.isIsdefault());
			cc.compose(isdefault);
			
			SetModelPropertyValueCommand timeunit = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Time Unit", obj, ips, "Time Unit", dlg.getTimeunit());
			cc.compose(timeunit);
			
			SetModelPropertyValueCommand batchtype = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Batch Type", obj, ips, "Batch Type", dlg.getBatchType());
			cc.compose(batchtype);
			
			SetModelPropertyValueCommand bstarttime = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Bat Start Time", obj, ips, "Bat Start Time", dlg.getBst());
			cc.compose(bstarttime);
			
			SetModelPropertyValueCommand bendtime = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Bat End Time", obj, ips, "Bat End Time", dlg.getBet());
			cc.compose(bendtime);
			
			SetModelPropertyValueCommand brestart = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Restart Period", obj, ips, "Restart Period", dlg.getBrc());
			cc.compose(brestart);
			
			SetModelPropertyValueCommand maxq = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Max Quantity", obj, ips, "Max Quantity", dlg.getMaxq());
			cc.compose(maxq);
			
			SetModelPropertyValueCommand minq = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Min Quantity", obj, ips, "Min Quantity", dlg.getMinq());
			cc.compose(minq);
			
			SetModelPropertyValueCommand timetag = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Timer Queue Flag", obj, ips, "Timer Queue Flag", dlg.isTimetag());
			cc.compose(timetag);
			
			SetModelPropertyValueCommand emertag = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Emergency Flag", obj, ips, "Emergency Flag", dlg.isEmertag());
			cc.compose(emertag);
			
			SetModelPropertyValueCommand intervalvalue = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Interval Value", obj, ips, "Interval Value", dlg.getInttime());
			cc.compose(intervalvalue);
			
			SetModelPropertyValueCommand intervalunit = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Interval Time Unit", obj, ips, "Interval Time Unit", dlg.getIntervalTimeUnit());
			cc.compose(intervalunit);
			
			editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(cc));
		}		
	}
}
