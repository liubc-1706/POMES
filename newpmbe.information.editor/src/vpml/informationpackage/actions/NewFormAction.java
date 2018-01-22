package vpml.informationpackage.actions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import vpml.informationpackage.InformationpackageFactory;
import vpml.informationpackage.InformationpackagePackage;

public class NewFormAction implements IObjectActionDelegate {
	private IProject selectedProject;
	protected InformationpackagePackage informationpackagePackage = InformationpackagePackage.eINSTANCE;
	protected InformationpackageFactory informationpackageFactory = informationpackagePackage.getInformationpackageFactory();
	
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub

	}

	public void run(IAction action) {
		// TODO Auto-generated method stub
		/*IFile modelFile=ResourcesPlugin.getWorkspace().getRoot().getFile(selectedProject.getFullPath().append("form1.form"));
		ResourceSet resourceSet = new ResourceSetImpl();

		URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
		Resource resource = resourceSet.createResource(fileURI);
		
		EObject rootObject = createInitialModel();
		if (rootObject != null) {
			resource.getContents().add(rootObject);
		}
		
		Map options = new HashMap();
		options.put(XMLResource.OPTION_ENCODING, "utf8");
		try {
			resource.save(options);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		NewModelDialog dlg=new NewModelDialog(null);
		dlg.setSelectedProject(selectedProject);
		dlg.setType("EMIForm");
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
