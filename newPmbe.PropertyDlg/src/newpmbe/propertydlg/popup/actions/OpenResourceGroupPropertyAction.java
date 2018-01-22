package newpmbe.propertydlg.popup.actions;

import newpmbe.DlgPackage.ResourceGroupProDlg;

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

public class OpenResourceGroupPropertyAction extends AbstractActionDelegate implements IObjectActionDelegate {

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
		
		ResourceGroupProDlg dlg = new ResourceGroupProDlg(shell, editpart, editpart.getClass().toString().contains("newpmbe.simulation"));
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
						
			SetModelPropertyValueCommand orgType = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Organiztion Type", obj, ips, "Organiztion Type", dlg.getOrgType());
			cc.compose(orgType);
			
			SetModelPropertyValueCommand principal = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Principal", obj, ips, "Principal", dlg.getPrincpal());
			cc.compose(principal);

			SetModelPropertyValueCommand anum = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Arrange Number", obj, ips, "Arrange Number", dlg.getArrangeNum());
			cc.compose(anum);
			
			SetModelPropertyValueCommand reserved = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Reserved", obj, ips, "Reserved", dlg.getReserved());
			cc.compose(reserved);
			
			editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(cc));
		}		
	}
}
