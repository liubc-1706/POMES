package newpmbe.product.diagram.part;

import java.util.Iterator;

import newpmbe.product.diagram.edit.parts.EMPArtifactEditPart;
import newpmbe.product.diagram.edit.parts.EMPDocumentEditPart;
import newpmbe.product.diagram.edit.parts.EMPMessageEditPart;
import newpmbe.product.diagram.edit.parts.EMPOtherEditPart;
import newpmbe.product.diagram.edit.parts.EMPProductPackageEditPart;

import newpmbe.product.diagram.view.factories.EMPArtifactViewFactory;
import newpmbe.product.diagram.view.factories.EMPDiagramViewFactory;
import newpmbe.product.diagram.view.factories.EMPDocumentViewFactory;
import newpmbe.product.diagram.view.factories.EMPMessageViewFactory;
import newpmbe.product.diagram.view.factories.EMPOtherViewFactory;
import newpmbe.product.diagram.view.factories.EMPProductPackageViewFactory;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.GraphicalViewer;

import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.ui.IEditorPart;

import org.eclipse.ui.ide.IDE;

import vpml.processpackage.EMPArtifact;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPDocument;
import vpml.processpackage.EMPMessage;
import vpml.processpackage.EMPOther;
import vpml.processpackage.EMPProductPackage;

import java.io.IOException;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import newpmbe.product.diagram.edit.parts.EMPDiagramEditPart;

import org.eclipse.core.commands.ExecutionException;

import org.eclipse.core.commands.operations.OperationHistoryFactory;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.edit.provider.IWrapperItemProvider;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.transaction.TransactionalEditingDomain;

import org.eclipse.gmf.runtime.common.core.command.CommandResult;

import org.eclipse.gmf.runtime.diagram.core.services.ViewService;

import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;

import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;

import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import org.eclipse.gmf.runtime.notation.Diagram;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

import org.eclipse.swt.SWT;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;

import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * @generated
 */
public class NewPMBENewDiagramFileWizard extends Wizard {

	/**
	 * @generated
	 */
	private TransactionalEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WizardNewFileCreationPage myFileCreationPage;

	/**
	 * @generated
	 */
	private IFile mySelectedModelFile;

	/**
	 * @generated
	 */
	private IWorkbenchPage myWorkbenchPage;

	/**
	 * @generated
	 */
	private IStructuredSelection mySelection;

	/**
	 * @generated
	 */
	private EObject myDiagramRoot;

	/**
	 * @generated
	 */
	public NewPMBENewDiagramFileWizard(IFile selectedModelFile,
			IWorkbenchPage workbenchPage, IStructuredSelection selection,
			EObject diagramRoot, TransactionalEditingDomain editingDomain) {
		assert selectedModelFile != null : "Null selectedModelFile in NewPMBENewDiagramFileWizard constructor"; //$NON-NLS-1$
		assert workbenchPage != null : "Null workbenchPage in NewPMBENewDiagramFileWizard constructor"; //$NON-NLS-1$
		assert selection != null : "Null selection in NewPMBENewDiagramFileWizard constructor"; //$NON-NLS-1$
		assert diagramRoot != null : "Null diagramRoot in NewPMBENewDiagramFileWizard constructor"; //$NON-NLS-1$
		assert editingDomain != null : "Null editingDomain in NewPMBENewDiagramFileWizard constructor"; //$NON-NLS-1$

		mySelectedModelFile = selectedModelFile;
		myWorkbenchPage = workbenchPage;
		mySelection = selection;
		myDiagramRoot = diagramRoot;
		myEditingDomain = editingDomain;
	}

	/**
	 * @generated
	 */
	public void addPages() {
		myFileCreationPage = new WizardNewFileCreationPage(
				"Initialize new Ecore diagram file", mySelection) {

			public void createControl(Composite parent) {
				super.createControl(parent);

				IContainer parentContainer = mySelectedModelFile.getParent();
				String originalFileName = mySelectedModelFile
						.getProjectRelativePath().removeFileExtension()
						.lastSegment();
				String fileExtension = ".product_diagram"; //$NON-NLS-1$
				String fileName = originalFileName + fileExtension;
				for (int i = 1; parentContainer.getFile(new Path(fileName))
						.exists(); i++) {
					fileName = originalFileName + i + fileExtension;
				}
				setFileName(fileName);
			}

		};
		myFileCreationPage.setTitle("Diagram file");
		myFileCreationPage.setDescription("Create new diagram based on "
				+ EMPDiagramEditPart.MODEL_ID + " model content");
		addPage(myFileCreationPage);
		addPage(new RootElementSelectorPage());
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IFile diagramFile = myFileCreationPage.createNewFile();
		try {
			diagramFile.setCharset("UTF-8", new NullProgressMonitor()); //$NON-NLS-1$
		} catch (CoreException e) {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"Unable to set charset for diagram file", e); //$NON-NLS-1$
		}

		ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final Resource diagramResource = resourceSet.createResource(URI
				.createPlatformResourceURI(
						diagramFile.getFullPath().toString(), true));

		List affectedFiles = new LinkedList();
		affectedFiles.add(mySelectedModelFile);
		affectedFiles.add(diagramFile);

		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				myEditingDomain, "Initializing diagram contents", affectedFiles) { //$NON-NLS-1$
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				int diagramVID = NewPMBEVisualIDRegistry
						.getDiagramVisualID(myDiagramRoot);
				if (diagramVID != EMPDiagramEditPart.VISUAL_ID) {
					return CommandResult
							.newErrorCommandResult("Incorrect model object stored as a root resource object"); //$NON-NLS-1$
				}
				Diagram diagram = ViewService.createDiagram(myDiagramRoot,
						EMPDiagramEditPart.MODEL_ID,
						NewPMBEDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				diagramResource.getContents().add(diagram);
				diagramResource.getContents().add(diagram.getElement());
				return CommandResult.newOKCommandResult();
			}
		};

		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new NullProgressMonitor(), null);
			diagramResource.save(Collections.EMPTY_MAP);
			NewPMBEDiagramEditorUtil.openDiagram(diagramResource);
		} catch (ExecutionException e) {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		} catch (IOException ex) {
			NewPMBEDiagramEditorPlugin
					.getInstance()
					.logError(
							"Save operation failed for: " + diagramFile.getFullPath().toString(), ex); //$NON-NLS-1$
		} catch (PartInitException ex) {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"Unable to open editor", ex); //$NON-NLS-1$
		}
		return true;
	}

	/**
	 * @generated
	 */
	private class RootElementSelectorPage extends WizardPage implements
			ISelectionChangedListener {

		/**
		 * @generated
		 */
		protected RootElementSelectorPage() {
			super("Select diagram root element");
			setTitle("Diagram root element");
			setDescription("Select semantic model element to be depicted on diagram");
		}

		/**
		 * @generated
		 */
		public void createControl(Composite parent) {
			initializeDialogUnits(parent);
			Composite topLevel = new Composite(parent, SWT.NONE);
			topLevel.setLayout(new GridLayout());
			topLevel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
					| GridData.HORIZONTAL_ALIGN_FILL));
			topLevel.setFont(parent.getFont());
			setControl(topLevel);
			createModelBrowser(topLevel);
			setPageComplete(validatePage());
		}

		/**
		 * @generated
		 */
		private void createModelBrowser(Composite parent) {
			Composite panel = new Composite(parent, SWT.NONE);
			panel.setLayoutData(new GridData(GridData.FILL_BOTH));
			GridLayout layout = new GridLayout();
			layout.marginWidth = 0;
			panel.setLayout(layout);

			Label label = new Label(panel, SWT.NONE);
			label.setText("Select diagram root element:");
			label.setLayoutData(new GridData(
					GridData.HORIZONTAL_ALIGN_BEGINNING));

			TreeViewer treeViewer = new TreeViewer(panel, SWT.SINGLE
					| SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
			GridData layoutData = new GridData(GridData.FILL_BOTH);
			layoutData.heightHint = 300;
			layoutData.widthHint = 300;
			treeViewer.getTree().setLayoutData(layoutData);
			treeViewer.setContentProvider(new AdapterFactoryContentProvider(
					NewPMBEDiagramEditorPlugin.getInstance()
							.getItemProvidersAdapterFactory()));
			treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(
					NewPMBEDiagramEditorPlugin.getInstance()
							.getItemProvidersAdapterFactory()));
			treeViewer.setInput(myDiagramRoot.eResource());
			treeViewer.setSelection(new StructuredSelection(myDiagramRoot));
			treeViewer.addSelectionChangedListener(this);
		}

		/**
		 * @generated
		 */
		public void selectionChanged(SelectionChangedEvent event) {
			myDiagramRoot = null;
			if (event.getSelection() instanceof IStructuredSelection) {
				IStructuredSelection selection = (IStructuredSelection) event
						.getSelection();
				if (selection.size() == 1) {
					Object selectedElement = selection.getFirstElement();
					if (selectedElement instanceof IWrapperItemProvider) {
						selectedElement = ((IWrapperItemProvider) selectedElement)
								.getValue();
					}
					if (selectedElement instanceof FeatureMap.Entry) {
						selectedElement = ((FeatureMap.Entry) selectedElement)
								.getValue();
					}
					if (selectedElement instanceof EObject) {
						myDiagramRoot = (EObject) selectedElement;
					}
				}
			}
			setPageComplete(validatePage());
		}

		/**
		 * @generated
		 */
		private boolean validatePage() {
			if (myDiagramRoot == null) {
				setErrorMessage("No diagram root element selected");
				return false;
			}
			boolean result = ViewService
					.getInstance()
					.provides(
							new CreateDiagramViewOperation(
									new EObjectAdapter(myDiagramRoot),
									EMPDiagramEditPart.MODEL_ID,
									NewPMBEDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT));
			setErrorMessage(result ? null
					: "Invalid diagram root element was selected");
			return result;
		}

	}
}