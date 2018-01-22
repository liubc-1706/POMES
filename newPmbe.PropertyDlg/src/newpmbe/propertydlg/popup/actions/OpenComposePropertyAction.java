package newpmbe.propertydlg.popup.actions;

import newpmbe.DlgPackage.CompositeDlg;
import newpmbe.DlgPackage.ProductProDlg;
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

public class OpenComposePropertyAction extends AbstractActionDelegate implements IObjectActionDelegate {

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
		
		CompositeDlg dlg = new CompositeDlg(shell, obj,true,editpart.getClass().toString().contains("newpmbe.simulation"));
		if (dlg.open() == Window.OK) 
		{
			CompositeCommand cc = new CompositeCommand("dlg");
			NewPMBEPropertySource ns = new NewPMBEPropertySource();
			IPropertySource ips = ns.getPropertySource(obj);
			
			SetModelPropertyValueCommand name = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Name", obj, ips, "Name", dlg.getName());	
			cc.compose(name);
			
			SetModelPropertyValueCommand description = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Description", obj, ips, "Description", dlg.getDescription());
			cc.compose(description);
			
			if (dlg.isIsact())
			{
				SetModelPropertyValueCommand id = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Id", obj, ips, "Id", dlg.getId());			
				cc.compose(id);
				
				SetModelPropertyValueCommand procedure = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Procedure", obj, ips, "Procedure", dlg.getProcedure());
				cc.compose(procedure);
				
				SetModelPropertyValueCommand creater = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Creater", obj, ips, "Creater", dlg.getCreater());
				cc.compose(creater);	
				
				SetModelPropertyValueCommand re_modifier = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Last Modifier", obj, ips, "Last Modifier", dlg.getModifier());
				cc.compose(re_modifier);
				
				SetModelPropertyValueCommand time_create = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Created Date", obj, ips, "Created Date", dlg.getTime_create());
				cc.compose(time_create);
				
				SetModelPropertyValueCommand time_modify = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Last Modified Date", obj, ips, "Last Modified Date", dlg.getTime_modify());			
				cc.compose(time_modify);
			}
			editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(cc));
		}		
	}
}
