package newpmbe.rcp.actions.transport;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class SaveProjectAs implements IWorkbenchWindowActionDelegate {
	Shell shell;
	IWorkbenchPage page;
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
		SaveAsDialog saveAsDialog = new SaveAsDialog(shell);
		saveAsDialog.open();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

}
