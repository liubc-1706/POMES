package newpmbe.propertydlg.popup.actions;

import newpmbe.DlgPackage.ClockProDlg;

import org.eclipse.gmf.runtime.emf.ui.properties.commands.SetModelPropertyValueCommand;

import org.eclipse.ui.views.properties.*;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import vpml.*;
import vpml.processpackage.impl.*;

public class OpenClockPropertyAction extends AbstractActionDelegate implements IObjectActionDelegate {

	//@Override
	protected void doRun(IProgressMonitor progressMonitor){
		Shell shell = new Shell();
		/*
		 * ÃüÁî×éºÏ
		 */
		
		IStructuredSelection strSle = getStructuredSelection();
		Object selection = strSle.getFirstElement();
		IGraphicalEditPart editpart = (IGraphicalEditPart)selection;
		
		EObject obj = editpart.resolveSemanticElement();
				
		ClockProDlg dlg = new ClockProDlg(shell, obj, editpart.getClass().toString().contains("newpmbe.simulation"));
		if (dlg.open() == Window.OK) 
		{
			CompositeCommand cc = new CompositeCommand("dlg");
			NewPMBEPropertySource ns = new NewPMBEPropertySource();
			IPropertySource ips = ns.getPropertySource(obj);
			
			SetModelPropertyValueCommand name = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Name", obj, ips, "Name", dlg.getName());
			cc.compose(name);
			
			SetModelPropertyValueCommand description = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Description", obj, ips, "Description", dlg.getDescription());
			cc.compose(description);
			
			System.out.println(dlg.getTimeunit().toString());
			SetModelPropertyValueCommand timeunit = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Time Unit", obj, ips, "Time Unit", dlg.getTimeunit());
			cc.compose(timeunit);
			
			SetModelPropertyValueCommand starttime = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Start Time", obj, ips, "Start Time", dlg.getBst());
			cc.compose(starttime);
			
			SetModelPropertyValueCommand endtime = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "End Time", obj, ips, "End Time", dlg.getBet());
			cc.compose(endtime);
			
			SetModelPropertyValueCommand restart = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Restart Period", obj, ips, "Restart Period", dlg.getBrc());
			cc.compose(restart);
			
			SetModelPropertyValueCommand timetag = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Tq Flag", obj, ips, "Tq Flag", dlg.isTimetag());
			cc.compose(timetag);
			
			SetModelPropertyValueCommand emertag = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "EFlag", obj, ips, "EFlag", dlg.isEmertag());
			cc.compose(emertag);
			
			SetModelPropertyValueCommand intervalvalue = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Interval Value", obj, ips, "Interval Value", dlg.getInttime());
			cc.compose(intervalvalue);
			
			SetModelPropertyValueCommand intervalunit = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Interval Unit", obj, ips, "Interval Unit", dlg.getIntervalTimeUnit());
			cc.compose(intervalunit);
			
			editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(cc));
		}		
	}
}
