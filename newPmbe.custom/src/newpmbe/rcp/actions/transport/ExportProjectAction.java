package newpmbe.rcp.actions.transport;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;
//import org.eclipse.ui.internal.IWorkbenchHelpContextIds;

public class ExportProjectAction implements IWorkbenchWindowActionDelegate {
	Shell shell;
	IWorkbenchPage page;
    private static final int SIZING_WIZARD_WIDTH = 470;

    private static final int SIZING_WIZARD_HEIGHT = 500;
	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub
		shell = window.getShell();
		page = window.getActivePage();
	}

	public void run(IAction action) {
		// TODO Auto-generated method stub
		FileSystemExportWizard wizard = new FileSystemExportWizard();
		wizard.init(PlatformUI.getWorkbench(), new TreeSelection());
		NewPmbeWizardDialog dialog = 
			new NewPmbeWizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
		dialog.create();
        dialog.getShell().setSize(SIZING_WIZARD_WIDTH,SIZING_WIZARD_HEIGHT);
        dialog.open();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

}
