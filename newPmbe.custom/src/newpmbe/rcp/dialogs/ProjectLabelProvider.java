package newpmbe.rcp.dialogs;

import newpmbe.rcp.NewPmbePlugin;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class ProjectLabelProvider extends LabelProvider
implements ITableLabelProvider {

	public Image getColumnImage(Object element, int columnIndex) {
		if(element instanceof IResource){
			switch(columnIndex){
			case 0:
				IResource resource = (IResource)element;
				String imageStr = null;
				if(resource.getName().endsWith(".process")){
					imageStr = "icons/processproject.gif";
				}else if(resource.getName().endsWith(".organization")){
					imageStr = "icons/organizationproject.gif";
				}else if(resource.getName().endsWith(".resource")){
					imageStr = "icons/resourceproject.gif";
				}else{
					imageStr = "icons/prj_obj.gif";
				}
				return NewPmbePlugin.getImageDescriptor(imageStr).createImage();
			case 1:
				return null;
			default:
				return null;
			}
		}
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
		if(element instanceof IResource){
			switch(columnIndex){
			case 0:
				return ((IResource)element).getName();
			case 1:
				return ((IResource)element).getLocation().toString();
			default:
				return "";
			}
		}
		return "";
	}

}
