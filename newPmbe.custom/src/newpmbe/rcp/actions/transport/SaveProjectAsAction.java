package newpmbe.rcp.actions.transport;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;

public class SaveProjectAsAction implements IWorkbenchWindowActionDelegate {
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
//		String typeString = null;
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if(page == null){
			MessageDialog.openInformation(null, "无法保存", "当前没有可保存的工程");
			return;
		}else{
			IEditorPart editor = page.getActiveEditor();
			if(editor == null){
				MessageDialog.openInformation(null, "无法保存", "当前没有可保存的工程");
				return;
			}else{
				if(editor.isDirty()){
					editor.doSave(null);
				}
				IFileEditorInput input = (IFileEditorInput)editor.getEditorInput();
				IFile file = input.getFile();
				IProject originProject = file.getProject();
				SaveAsDialog saveAsDialog = new SaveAsDialog(shell, originProject);
				saveAsDialog.open();
			}
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

}
