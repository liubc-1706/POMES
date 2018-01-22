/**
 * ===============================================
 * Copyright SEI of Beihang University. All rights
 * reserved.
 * created by zhang peng in 2007-7-21.
 * ================================================
**/
package newpmbe.svn.actions;

import newpmbe.ui.SVNDialogs;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class ConfigrateAction implements IWorkbenchWindowActionDelegate {
	
	private IWorkbenchWindow window;
	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub
		this.window=window;
	}

	public void run(IAction action) {
		// TODO Auto-generated method stub
		System.out.println("cofigrate!");	
		SVNDialogs.openConfigurationDialog(window.getShell());
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

}
