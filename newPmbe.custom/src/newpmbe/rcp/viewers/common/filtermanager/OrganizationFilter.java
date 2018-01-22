package newpmbe.rcp.viewers.common.filtermanager;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class OrganizationFilter extends ViewerFilter {

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		// TODO Auto-generated method stub
		if(parentElement instanceof IWorkspaceRoot){
			IProject project = (IProject)element;
			
			if(project.getName().endsWith("organization")){
				return true;
			}else{
				return false;
			}
		}
		return true;
	}

}
