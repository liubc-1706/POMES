package newpmbe.rcp.actions.transport;

import newpmbe.rcp.NewPmbePlugin;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class TransportWizard extends Wizard implements INewWizard{
	
	private WizardProjectsImportPage importPage;
    public TransportWizard(String pageId){
		setWindowTitle("导出向导");
		
		IDialogSettings addressSettings =
			NewPmbePlugin.getDefault().getDialogSettings();
		IDialogSettings wizardSettings =
			addressSettings.getSection("ImportWizard");
		if(wizardSettings == null)
			wizardSettings = addressSettings.addNewSection("ImportWizard");
		setDialogSettings(addressSettings);
    }

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}
	public void addPages() {
		importPage = new WizardProjectsImportPage("导入工程");
		addPage(importPage);
		}
}
