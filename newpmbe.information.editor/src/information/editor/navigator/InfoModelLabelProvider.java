package information.editor.navigator;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class InfoModelLabelProvider extends LabelProvider implements
ICommonLabelProvider, ITreePathLabelProvider{
	@Override
	public Image getImage(Object element) {
		// TODO Auto-generated method stub
		if(element instanceof IProject){
			String ex = ((IProject)element).getFileExtension();
			if(ex!=null){
				if(ex.equals("info")){
					return AbstractUIPlugin.imageDescriptorFromPlugin(
							"newpmbe.information.editor", "/icons/full/infoproject.gif").createImage();
				}
			}
		}
		if(element instanceof IFile){
			String ex = ((IFile)element).getFileExtension();
			if(ex!=null){
				if(ex.equals("form")){
					return AbstractUIPlugin.imageDescriptorFromPlugin(
							"newpmbe.information.editor", "/icons/full/ico_form.gif").createImage();
				}else if(ex.equals("list")){
					return AbstractUIPlugin.imageDescriptorFromPlugin(
							"newpmbe.information.editor", "/icons/full/ico_list.gif").createImage();
				}else if(ex.equals("enum")){
					return AbstractUIPlugin.imageDescriptorFromPlugin(
							"newpmbe.information.editor", "/icons/full/ico_enum.gif").createImage();
				}
			}
		}
		return super.getImage(element);
	}

	@Override
	public String getText(Object element) {
		// TODO Auto-generated method stub
		if(element instanceof IProject){
			String extension = ((IProject)element).getFileExtension();
			if(extension!=null){
				String name = ((IProject)element).getName().substring(0,
					((IProject)element).getName().length() - extension.length() - 1);
				return name;
			}else{
				return ((IProject)element).getName();
			}
		}
		if(element instanceof IFile){
			String extension = ((IFile)element).getFileExtension();
			if(extension!=null){
				String name = ((IFile)element).getName().substring(0,
					((IFile)element).getName().length() - extension.length() - 1);
				return name;
			}else{
				return ((IFile)element).getName();
			}
		}
		return super.getText(element);
	}

	public void init(ICommonContentExtensionSite config) {
		// TODO Auto-generated method stub
		
	}

	public void restoreState(IMemento memento) {
		// TODO Auto-generated method stub
		
	}

	public void saveState(IMemento memento) {
		// TODO Auto-generated method stub
		
	}

	public String getDescription(Object anElement) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		// TODO Auto-generated method stub
		
	}

}
