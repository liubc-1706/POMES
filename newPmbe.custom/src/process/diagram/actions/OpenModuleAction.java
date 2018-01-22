package process.diagram.actions;

import newpmbe.rcp.dialogs.OpenModelDialog;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

public class OpenModuleAction implements IWorkbenchWindowActionDelegate {

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
		OpenModelDialog dialog = new OpenModelDialog(shell);
		if(dialog.open() == OpenModelDialog.OK){
			if(dialog.needPreClose()){
				page.closeAllEditors(true);
			}
			Object[] projectList = dialog.getProjectList();
			for(int i = 0; i < projectList.length; i++){
				IProject project= (IProject)projectList[i];
				IFile file = project.getFile(project.getName()+"_diagram");
				
				try {
					if(page.findEditor(new FileEditorInput(file)) == null)
						IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}

}
