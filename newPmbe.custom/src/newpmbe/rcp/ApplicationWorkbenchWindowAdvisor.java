package newpmbe.rcp;

import newpmbe.rcp.viewers.common.filtermanager.FilterManager;

//import org.eclipse.swt.graphics.Point;
//import org.eclipse.ui.PlatformUI;
//import org.eclipse.ui.activities.ActivityManagerEvent;
//import org.eclipse.ui.activities.IActivityManager;
//import org.eclipse.ui.activities.IActivityManagerListener;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.swt.graphics.Image;
// comment by Ning
//import org.eclipse.ui.internal.ide.model.WorkbenchAdapterBuilder;
import org.eclipse.ui.ide.IDE;
//import org.eclipse.ui.internal.ide.model.WorkbenchAdapterBuilder;//¸ÄÎªorg.eclipse.ui.ide.IDE°ü
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.ide.IDEActionFactory;
//import org.eclipse.jface.action.IStatusLineManager;
//import org.eclipse.swt.widgets.Shell;
//import org.eclipse.swt.layout.FormLayout;
//import org.eclipse.swt.layout.FormData;
//import org.eclipse.swt.layout.FormAttachment;
//import org.eclipse.swt.widgets.Menu;
//import org.eclipse.swt.widgets.Control;
//import org.eclipse.swt.widgets.Composite;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor{
	public Image statusImage = null;
//	private Control toolbar;
//	private Control page;
//	private Control statusline;
//	private Control searchPanel;
//	private Control imageItemPanel;

	public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}


	public ActionBarAdvisor createActionBarAdvisor(
			IActionBarConfigurer configurer) {
		return new ApplicationActionBarAdvisor(this, configurer);
	}

	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();

		configurer.setTitle(Messages.getString("ApplicationWorkbenchWindowAdvisor.0")); //$NON-NLS-1$
		configurer.setShowMenuBar(true);
		configurer.setShowCoolBar(true);
		configurer.setShowStatusLine(true);
		configurer.setShowPerspectiveBar(true);
		configurer.setShowProgressIndicator(true);
		
		// comment by Ning
//		WorkbenchAdapterBuilder.registerAdapters();
		IDE.registerAdapters();
		
		//configurer.setTitle("RCP Application");
	}
	public void postWindowOpen() {
		  statusImage =
		      AbstractUIPlugin.imageDescriptorFromPlugin(
		      "newPmbe.custom", //$NON-NLS-1$
		      IImageKeys.FLDER_OBJ).createImage();
//		  IStatusLineManager statusline = getWindowConfigurer().
//		      getActionBarConfigurer().getStatusLineManager();
//		  statusline.setMessage(statusImage, "SASFolder"); //$NON-NLS-1$
		  FilterManager.getInstance().init();
		}
	public void dispose() {
		  statusImage.dispose();
	}
}
