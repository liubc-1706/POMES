package newpmbe.rcp;

import org.eclipse.core.runtime.IPlatformRunnable;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IPlatformRunnable {

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IPlatformRunnable#run(java.lang.Object)
	 */
	public static final String PLUGIN_ID = "newPmbe.custom"; //$NON-NLS-1$
	public Object run(Object args) throws Exception {
		Display display = PlatformUI.createDisplay();
		System.out.println(Messages.getString("Application.1")); //$NON-NLS-1$
		try {
			int returnCode = PlatformUI.createAndRunWorkbench(display, new ApplicationWorkbenchAdvisor());

			if (returnCode == PlatformUI.RETURN_RESTART) {
				System.out.println(Messages.getString("Application.2")); //$NON-NLS-1$
				return IPlatformRunnable.EXIT_RESTART;
			}
			System.out.println(Messages.getString("Application.3")); //$NON-NLS-1$
			return IPlatformRunnable.EXIT_OK;
		} finally {
			if(display!=null)
			{
				display.dispose();
			}
		}
	}
}
