package newpmbe.propertydlg.popup.actions;


import newpmbe.DlgPackage.BasicActivityProDlg;
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

public class OpenBasicActivityPropertyAction extends AbstractActionDelegate implements IObjectActionDelegate {

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
		
		BasicActivityProDlg dlg = new BasicActivityProDlg(shell, obj, editpart.getClass().toString().contains("newpmbe.simulation"), file);
		if (dlg.open() == Window.OK) 
		{
			CompositeCommand cc = new CompositeCommand("dlg");
			NewPMBEPropertySource ns = new NewPMBEPropertySource();
			IPropertySource ips = ns.getPropertySource(obj);
			
			SetModelPropertyValueCommand name = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Name", obj, ips, "Name", dlg.getName());
			SetModelPropertyValueCommand id = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Id", obj, ips, "Id", dlg.getId());
			SetModelPropertyValueCommand procedure = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Procedure", obj, ips, "Procedure", dlg.getProcedure());
			SetModelPropertyValueCommand creater = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Creater", obj, ips, "Creater", dlg.getCreater());
			SetModelPropertyValueCommand description = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Description", obj, ips, "Description", dlg.getDescription());
			SetModelPropertyValueCommand re_modifier = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Last Modifier", obj, ips, "Last Modifier", dlg.getModifier());
			SetModelPropertyValueCommand time_create = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Last Modified Date", obj, ips, "Last Modified Date", dlg.getTime_modify());
			SetModelPropertyValueCommand time_modify = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Created Date", obj, ips, "Created Date", dlg.getTime_create());
			SetModelPropertyValueCommand duration_time = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Duration Time", obj, ips, "Duration Time", dlg.getDsd());
			SetModelPropertyValueCommand start_time = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Start Time", obj, ips, "Start Time", dlg.getSt());
			SetModelPropertyValueCommand priority = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Priority", obj, ips, "Priority", dlg.getPriority());
			SetModelPropertyValueCommand isdefault = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Is Default", obj, ips, "Is Default", dlg.isIsdefault());
			SetModelPropertyValueCommand timeunit = new SetModelPropertyValueCommand(editpart.getEditingDomain(), "Time Unit", obj, ips, "Time Unit", dlg.getTimeunit());
			
			cc.compose(name);
			cc.compose(id);
			cc.compose(procedure);
			cc.compose(creater);
			cc.compose(description);
			cc.compose(re_modifier);
			cc.compose(time_create);
			cc.compose(time_modify);
			cc.compose(duration_time);
			cc.compose(start_time);
			cc.compose(priority);
			cc.compose(isdefault);
			cc.compose(timeunit);
			
			editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(cc));
		}		
	}
}
