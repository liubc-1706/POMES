package newpmbe.web.part;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

public class PublishWizardDialog {
	
	public void buildPublishWizardDialog(Shell s){
		
		MyWizardDialog dialog = new MyWizardDialog(s, new PublishWizard());
		dialog.setPageSize(-1,-1);
		dialog.open();
	}
}
