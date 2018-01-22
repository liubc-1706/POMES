package newpmbe.rcp;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.ide.IDE;
// comment by Ning
//import org.eclipse.ui.internal.ide.model.WorkbenchAdapterBuilder;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = Messages.getString("ApplicationWorkbenchAdvisor.0"); //$NON-NLS-1$
	private static  ApplicationWorkbenchWindowAdvisor windowAdvisor= null;

	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		windowAdvisor = new ApplicationWorkbenchWindowAdvisor(configurer);
		return windowAdvisor;
	}
	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}
	//Remember the logout the last time closed.
	public void initialize(IWorkbenchConfigurer configurer)
	{
		//super.initialize(configurer);
		configurer.setSaveAndRestore(true);
		//PlatformUI.getPreferenceStore().setValue(IWorkbenchPreferenceConstants.SHOW_TRADITIONAL_STYLE_TABS,true);
		configurer.declareImage(IDE.SharedImages.IMG_OBJ_PROJECT,
					NewPmbePlugin.getImageDescriptor("icons/prj_obj.gif"), true);
		configurer.declareImage(IDE.SharedImages.IMG_OBJ_PROJECT_CLOSED, 
				NewPmbePlugin.getImageDescriptor("icons/prjct_nonexist_obj.gif"), true);
		super.initialize(configurer);	
		 //The workaround call
        //WorkbenchAdapterBuilder.registerAdapters();
	}

	public static ApplicationWorkbenchWindowAdvisor getWorkbenchWindowAdvisor()
	{
		return windowAdvisor;
	}
}
