package vpml.informationpackage.actions;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import vpml.informationpackage.InformationpackageFactory;
import vpml.informationpackage.InformationpackagePackage;

public class NewEnumAction implements IObjectActionDelegate{
	private IProject selectedProject;
	protected InformationpackagePackage informationpackagePackage = InformationpackagePackage.eINSTANCE;
	protected InformationpackageFactory informationpackageFactory = informationpackagePackage.getInformationpackageFactory();
	
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub

	}

	public void run(IAction action) {
		// TODO Auto-generated method stub
		NewModelDialog dlg=new NewModelDialog(null);
		dlg.setSelectedProject(selectedProject);
		dlg.setType("EMIEnum");
		dlg.open();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		selectedProject = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof IProject) {
				selectedProject = (IProject) structuredSelection
						.getFirstElement();
			}
		}
	}
	
	protected EObject createInitialModel(){
		EClass eClass = (EClass)informationpackagePackage.getEClassifier("EMIForm");
		EObject rootObject = informationpackageFactory.create(eClass);
		return rootObject;
	}
}
