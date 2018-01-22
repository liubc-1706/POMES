package newpmbe.propertydlg.popup.actions;


import newpmbe.DlgPackage.ProductProDlg;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.ui.properties.commands.SetModelPropertyValueCommand;

import vpml.processpackage.EMPForm;


public class OpenProductPropertyAction extends AbstractActionDelegate implements IObjectActionDelegate {

	//@Override
	protected void doRun(IProgressMonitor progressMonitor){
		Shell shell = new Shell();
		/*
		 * ÃüÁî×éºÏ
		 */
//		CompositeCommand cc;
		IStructuredSelection strSle = getStructuredSelection();
		Object selection = strSle.getFirstElement();
		IGraphicalEditPart editpart = (IGraphicalEditPart)selection;
		
		EObject obj = editpart.resolveSemanticElement();
		
		ProductProDlg dlg = new ProductProDlg(shell, obj,editpart.getClass().toString().contains("newpmbe.simulation"));
		if (dlg.open() == Window.OK) 
		{
			CompositeCommand cc = new CompositeCommand("dlg");
			NewPMBEPropertySource ns = new NewPMBEPropertySource();
			IPropertySource ips = ns.getPropertySource(obj);
			
			SetModelPropertyValueCommand name = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Name", obj, ips, "Name", dlg.getName());
			cc.compose(name);
			
			SetModelPropertyValueCommand description = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Description", obj, ips, "Description", dlg.getDescription());
			cc.compose(description);
			
			if(obj instanceof EMPForm){
				SetModelPropertyValueCommand handle = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Form Type", obj, ips, "Form Type", dlg.getFormType());
				cc.compose(handle);
			}else{
				SetModelPropertyValueCommand handle = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Attachment", obj, ips, "Attachment", dlg.getHandle());
				cc.compose(handle);
			}
			
			SetModelPropertyValueCommand period = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Period", obj, ips, "Period", dlg.getPeriod());
			cc.compose(period);
			
			SetModelPropertyValueCommand cost = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Cost", obj, ips, "Cost", dlg.getCost());
			cc.compose(cost);
			
			SetModelPropertyValueCommand initQueue = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Init Queue", obj, ips, "Init Queue", dlg.getInitqueue());
			cc.compose(initQueue);
			
			SetModelPropertyValueCommand iotype = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Io Type", obj, ips, "Io Type", dlg.getIotype());
			cc.compose(iotype);
			
			SetModelPropertyValueCommand durationTime = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Duration Time", obj, ips, "Duration Time", dlg.getDsd());
			cc.compose(durationTime);
			
			SetModelPropertyValueCommand timeunit = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Time Unit", obj, ips, "Time Unit", dlg.getTimeunit());
			cc.compose(timeunit);
			
			editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(cc));
		}		
	}

}
