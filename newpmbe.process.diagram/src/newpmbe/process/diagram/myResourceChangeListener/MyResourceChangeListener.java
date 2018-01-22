package newpmbe.process.diagram.myResourceChangeListener;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.MessageDialog;

public class MyResourceChangeListener
implements IResourceChangeListener
{
	private MyResourceChangeListener(){
		ResourcesPlugin.getWorkspace()
		.addResourceChangeListener(
				this,
				IResourceChangeEvent.POST_CHANGE);
	}
//	public static void shutdown(){
//		if (manager !=null){
//			ResourcesPlugin
//			.get
//		}
//	}
public void resourceChanged(IResourceChangeEvent e){
	MessageDialog.openError(null, "hzg", "resourceListener");
	
}
}
