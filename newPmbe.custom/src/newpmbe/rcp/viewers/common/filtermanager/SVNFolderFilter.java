package newpmbe.rcp.viewers.common.filtermanager;

import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class SVNFolderFilter extends ViewerFilter {

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if(element instanceof IFolder){
			IFolder folder = (IFolder)element;
			if(folder.getName().equals(".svn")){
				return false;
			}
		}
		return true;
	}

}
