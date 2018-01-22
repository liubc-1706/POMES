package newpmbe.propertydlg.popup.actions;

import newpmbe.DlgPackage.OrgResourceInProcessDlg;
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

public class OpenOrgResourceInProcessPropertyAction extends AbstractActionDelegate implements IObjectActionDelegate {

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
		
		DiagramDocumentEditor editor = (DiagramDocumentEditor)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		IFile editorFile = ((IFileEditorInput)editor.getEditorInput()).getFile();
		
		OrgResourceInProcessDlg dlg = new OrgResourceInProcessDlg(shell, obj, editorFile);
		if (dlg.open() == Window.OK) 
		{
			CompositeCommand cc = new CompositeCommand("dlg");
			NewPMBEPropertySource ns = new NewPMBEPropertySource();
			IPropertySource ips = ns.getPropertySource(obj);
			
			SetModelPropertyValueCommand name = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Name", obj, ips, "Name", dlg.getName());
			cc.compose(name);			
			
			SetModelPropertyValueCommand code = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Code", obj, ips, "Code", dlg.getCode());
			cc.compose(code);
			
			SetModelPropertyValueCommand total = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Total Amount", obj, ips, "Total Amount", dlg.getTotal());
			cc.compose(total);
					
			SetModelPropertyValueCommand availiable = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Available Amount", obj, ips, "Available Amount", dlg.getAviliable());
			cc.compose(availiable);
			
			SetModelPropertyValueCommand usage = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Usage Amount", obj, ips, "Usage Amount", dlg.getUsage());
			cc.compose(usage);
			
			SetModelPropertyValueCommand cost = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Cost Per Unit", obj, ips, "Cost Per Unit", dlg.getPrice());
			cc.compose(cost);
			
			SetModelPropertyValueCommand efficiency = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Efficiency", obj, ips, "Efficiency", dlg.getEfficiency());
			cc.compose(efficiency);
			
			editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(cc));
		}		
	}
}
