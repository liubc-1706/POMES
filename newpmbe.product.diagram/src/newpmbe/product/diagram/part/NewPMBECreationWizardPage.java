package newpmbe.product.diagram.part;

import java.io.IOException;

import java.lang.reflect.InvocationTargetException;

import java.util.Collections;

import newpmbe.product.diagram.view.factories.EMPDiagramViewFactory;

import org.eclipse.core.commands.ExecutionException;

import org.eclipse.core.resources.IFile;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.transaction.TransactionalEditingDomain;

import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationFactory;

import org.eclipse.jface.dialogs.ErrorDialog;

import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import org.eclipse.ui.actions.WorkspaceModifyOperation;

import org.eclipse.ui.ide.IDE;

import vpml.processpackage.EMPDiagram;
import vpml.processpackage.ProcesspackageFactory;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import org.eclipse.core.resources.ResourcesPlugin;

/**
 * @generated
 */
public class NewPMBECreationWizardPage extends WizardNewFileCreationPage {

	/**
	 * @generated
	 */
	private static final String DIAGRAM_EXT = ".product_diagram"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public NewPMBECreationWizardPage(String pageName,
			IStructuredSelection selection) {
		super(pageName, selection);
	}

	/**
	 * @generated
	 */
	protected String getDefaultFileName() {
		return "default"; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public String getFileName() {
		String fileName = super.getFileName();
		if (fileName != null && !fileName.endsWith(DIAGRAM_EXT)) {
			fileName += DIAGRAM_EXT;
		}
		return fileName;
	}

	/**
	 * @generated
	 */
	private String getUniqueFileName(IPath containerPath, String fileName) {
		String newFileName = fileName;
		IPath diagramFilePath = containerPath.append(newFileName + DIAGRAM_EXT);
		int i = 1;
		while (exists(diagramFilePath)) {
			i++;
			newFileName = fileName + i;
			diagramFilePath = containerPath.append(newFileName + DIAGRAM_EXT);
		}
		return newFileName;
	}

	/**
	 * @generated
	 */
	public void createControl(Composite parent) {
		super.createControl(parent);
		IPath path = getContainerFullPath();
		if (path != null) {
			String fileName = getUniqueFileName(path, getDefaultFileName());
			setFileName(fileName);
		} else {
			setFileName(getDefaultFileName());
		}
		setPageComplete(validatePage());
	}

	/**
	 * @generated
	 */
	public static boolean exists(IPath path) {
		return ResourcesPlugin.getWorkspace().getRoot().exists(path);
	}
}
