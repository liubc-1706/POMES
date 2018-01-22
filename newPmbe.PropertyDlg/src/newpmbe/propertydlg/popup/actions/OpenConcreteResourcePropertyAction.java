package newpmbe.propertydlg.popup.actions;

import newpmbe.DlgPackage.ConcreteResourceDlg;
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

public class OpenConcreteResourcePropertyAction extends AbstractActionDelegate implements IObjectActionDelegate {

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
		
		ConcreteResourceDlg dlg = new ConcreteResourceDlg(shell, editpart,editpart.getClass().toString().contains("newpmbe.simulation"));
		if (dlg.open() == Window.OK) 
		{
			CompositeCommand cc = new CompositeCommand("dlg");
			NewPMBEPropertySource ns = new NewPMBEPropertySource();
			IPropertySource ips = ns.getPropertySource(obj);
			
			SetModelPropertyValueCommand name = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Name", obj, ips, "Name", dlg.getName());
			cc.compose(name);			
			
			SetModelPropertyValueCommand description = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Description", obj, ips, "Description", dlg.getDescription());
			cc.compose(description);
			
			SetModelPropertyValueCommand code = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Code", obj, ips, "Code", dlg.getCode());
			cc.compose(code);
			
			SetModelPropertyValueCommand total = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Total Amount", obj, ips, "Total Amount", dlg.getTotal());
			cc.compose(total);
			
			SetModelPropertyValueCommand usage = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Usage Amount", obj, ips, "Usage Amount", dlg.getUsage());
			cc.compose(usage);
			
			SetModelPropertyValueCommand availiable = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Available Amount", obj, ips, "Available Amount", dlg.getAviliable());
			cc.compose(availiable);
			
			SetModelPropertyValueCommand cost = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Cost Per Unit", obj, ips, "Cost Per Unit", dlg.getPrice());
			cc.compose(cost);
			
			SetModelPropertyValueCommand efficiency = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Efficiency", obj, ips, "Efficiency", dlg.getEfficiency());
			cc.compose(efficiency);
			
			editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(cc));
		}		
	}
}
