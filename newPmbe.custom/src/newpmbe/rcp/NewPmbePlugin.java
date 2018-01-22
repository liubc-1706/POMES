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
	 * ������������ȡ���̵����id�ǲ���ȫ�ġ���Ϊ�Ժ��û��������̵�ʱ���´������̵�idû������!
	 * ��ΪĬ��������򿪣����԰Ѷ�ȡid�Ĳ����������
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
