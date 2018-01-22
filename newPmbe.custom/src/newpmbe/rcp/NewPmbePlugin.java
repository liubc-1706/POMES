package newpmbe.rcp;

import org.eclipse.ui.plugin.*;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 */
public class NewPmbePlugin extends AbstractUIPlugin {

	//The shared instance.
	private static NewPmbePlugin plugin;
	
	/**
	 * The constructor.
	 */
	public NewPmbePlugin() {
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 * 在这个方法里读取工程的最大id是不安全的。以为以后用户创建工程的时候，新创建工程的id没被加入!
	 * 因为默认树必须打开，所以把读取id的操作放在树里。
	 */
	public void start(BundleContext context) throws Exception {
		//FileUtil.getInst().operationOidFromFile(true);
		super.start(context);
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance.
	 */
	public static NewPmbePlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		//return AbstractUIPlugin.imageDescriptorFromPlugin("MyProject", path);
		return AbstractUIPlugin.imageDescriptorFromPlugin("newPmbe.custom", path); //$NON-NLS-1$
		//return null;
		
	}
}
