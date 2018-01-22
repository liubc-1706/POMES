package newpmbe.organization.diagram.part;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.PartInitException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import java.util.HashMap;
import java.util.Map;

import newpmbe.organization.diagram.edit.parts.EMODiagramEditPart;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xmi.XMIResource;

import org.eclipse.emf.edit.ui.util.EditUIUtil;

import vpml.organizationpackage.EMODiagram;
import vpml.organizationpackage.OrganizationpackageFactory;

/**
 * @generated
 */
public class NewPMBEDiagramEditorUtil {

	/**
	 * @generated
	 */
	public static boolean openDiagram(Resource diagram)
			throws PartInitException {
		return EditUIUtil.openEditor((EObject) diagram.getContents().get(0));
	}

	/**
	 * @generated
	 */
	private static void setCharset(IPath path) {
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		try {
			file.setCharset("UTF-8", new NullProgressMonitor()); //$NON-NLS-1$
		} catch (CoreException e) {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"Unable to set charset for file " + path, e); //$NON-NLS-1$
		}
	}

	/**
	 * <p>
	 * This method should be called within a workspace modify operation since it creates resources.
	 * </p>
	 * @generated
	 * @return the created resource, or <code>null</code> if the resource was not created
	 */
	public static final Resource createDiagram(IPath containerFullPath,
			String fileNameParameter, IProgressMonitor progressMonitor) {
		final String fileName = fileNameParameter;
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		progressMonitor.beginTask("Creating diagram and model files", 3); //$NON-NLS-1$
		IPath diagramPath = containerFullPath.append(fileName);
		final Resource diagramResource = editingDomain.getResourceSet()
				.createResource(
						URI.createPlatformResourceURI(diagramPath.toString()));
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain,
				"Creating diagram and model", Collections.EMPTY_LIST) { //$NON-NLS-1$
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				EMODiagram model = createInitialModel();
				//hzg add 给模型名称赋值
				
				String newFileName=fileName.substring(0, fileName.length()-21);
				model.setName(newFileName);
				//end
				diagramResource.getContents().add(model);
				Diagram diagram = ViewService.createDiagram(model,
						EMODiagramEditPart.MODEL_ID,
						NewPMBEDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(fileName);
					diagram.setElement(model);
				}
				try {
					Map options = new HashMap();
					options.put(XMIResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
					diagramResource.save(options);
				} catch (IOException e) {

					NewPMBEDiagramEditorPlugin.getInstance().logError(
							"Unable to store model and diagram resources", e); //$NON-NLS-1$
				}
				return CommandResult.newOKCommandResult();
			}
		};

		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		}

		setCharset(diagramPath);
		return diagramResource;
	}

	/**
	 * Create a new instance of domain element associated with canvas.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static EMODiagram createInitialModel() {
		return OrganizationpackageFactory.eINSTANCE.createEMODiagram();
	}

}
