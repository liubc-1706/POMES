package newpmbe.rcp.actions.transport;

import newpmbe.rcp.NewPmbePlugin;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
//import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
//import org.eclipse.ui.internal.wizards.datatransfer.DataTransferMessages;
//import org.eclipse.ui.internal.wizards.datatransfer.WizardProjectsImportPage;

/**
 * Standard workbench wizard for importing projects defined
 * outside of the currently defined projects into Eclipse.
 * <p>
 * This class may be instantiated and used without further configuration;
 * this class is not intended to be subclassed.
 * </p>
 * <p>
 * Example:
 * <pre>
 * IWizard wizard = new ExternalProjectImportWizard();
 * wizard.init(workbench, selection);
 * WizardDialog dialog = new WizardDialog(shell, wizard);
 * dialog.open();
 * </pre>
 * During the call to <code>open</code>, the wizard dialog is presented to the
 * user. When the user hits Finish, a project is created with the location
 * specified by the user.
 * </p>
 */

public class ExternalProjectImportWizard extends Wizard implements
        IImportWizard {
    private static final String EXTERNAL_PROJECT_SECTION = "ExternalProjectImportWizard";//$NON-NLS-1$
	private WizardProjectsImportPage mainPage;
	
    /**
     * Constructor for ExternalProjectImportWizard.
     */
    public ExternalProjectImportWizard() {
        super();
        setNeedsProgressMonitor(true);
        IDialogSettings workbenchSettings = NewPmbePlugin.getDefault()
        		.getDialogSettings();
        
		IDialogSettings wizardSettings = workbenchSettings
		        .getSection(EXTERNAL_PROJECT_SECTION);
		if (wizardSettings == null) {
			wizardSettings = workbenchSettings
		            .addNewSection(EXTERNAL_PROJECT_SECTION);
		}
		setDialogSettings(wizardSettings);        
    }

    /* (non-Javadoc)
     * Method declared on IWizard.
     */
    public void addPages() {
        super.addPages();
        mainPage = new WizardProjectsImportPage();
        addPage(mainPage);
    }

    /* (non-Javadoc)
     * Method declared on IWorkbenchWizard.
     */
    public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
        setWindowTitle("µº»Î");
        setDefaultPageImageDescriptor(
				NewPmbePlugin.getImageDescriptor("icons/transport/import_wiz(2).gif")); //$NON-NLS-1$

    }

    /* (non-Javadoc)
     * Method declared on IWizard.
     */
    public boolean performCancel() {
    	mainPage.performCancel();
        return true;
    }

    /* (non-Javadoc)
     * Method declared on IWizard.
     */
    public boolean performFinish() {
        return mainPage.createProjects();
    }

}

