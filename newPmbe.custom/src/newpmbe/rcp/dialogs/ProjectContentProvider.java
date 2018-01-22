package newpmbe.rcp.dialogs;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ProjectContentProvider implements IStructuredContentProvider {

	public Object[] getElements(Object inputElement) {
		if(inputElement instanceof IWorkspaceRoot){
			return ((IWorkspaceRoot)inputElement).getProjects();
		}
		else
			return new Object[0];
	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

}
