/**
 * 
 */
package newpmbe.process.diagram.navigator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import vpml.processpackage.impl.EMPCompActivityImpl;
import vpml.processpackage.impl.EMPDataFlowImpl;

/**
 * @author nemo
 *
 */
public class CompActivityFilter extends ViewerFilter {

	/**
	 * 
	 */
	public CompActivityFilter() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		// TODO Auto-generated method stub
		if(element instanceof NewPMBENavigatorItem)
		{
			NewPMBENavigatorItem item = (NewPMBENavigatorItem)element;
			/*if(item.getView().getElement() instanceof EMPCompActivityImpl)
			{
				EMPCompActivityImpl compActivity = (EMPCompActivityImpl)item.getView().getElement();
				if(item.getParent() instanceof IProject)
				{
					IFolder folder = ((IProject)item.getParent()).getFolder(compActivity.getName());
					if(folder != null)
						return false;
				}
				else if(item.getParent() instanceof IFolder)
				{
					IFolder folder = ((IFolder)item.getParent()).getFolder(compActivity.getName());
					if(folder != null)
						return false;
				}
			}*/
			if(item.getView().getElement() instanceof EMPDataFlowImpl)
			{
				EMPDataFlowImpl folder = (EMPDataFlowImpl)item.getView().getElement();
				String folderName = EMPDataFlowImpl.class.getName();
				//if(folderName.indexOf("links")!= -1)									
						return false;
								
			}
		}
		else if(element instanceof IFolder){
			IFolder folder = (IFolder)element;
			if(!folder.getName().endsWith(".process")){
				IFile file = folder.getFile(folder.getName()+".process_diagram");
				if(file == null || !file.exists()){
					return false;
				}
			}
		}
		return true;
	}

}
