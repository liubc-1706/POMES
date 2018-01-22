package newpmbe.resource.diagram.part;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.DelegatingLayout;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.LayeredPane;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.PrintAction;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IDiagramPreferenceSupport;
import org.eclipse.gmf.runtime.diagram.ui.internal.parts.DiagramGraphicalViewerKeyHandler;
import org.eclipse.gmf.runtime.diagram.ui.internal.parts.DirectEditKeyHandler;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
//import org.eclipse.gmf.runtime.diagram.ui.providers.DiagramContextMenuProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import newpmbe.resource.diagram.edit.parts.NewPMBEEditPartFactory;
import newpmbe.resource.diagram.navigator.NewPMBENavigatorContentProvider;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.transaction.NotificationFilter;

import org.eclipse.gmf.runtime.common.ui.services.marker.MarkerNavigationService;

import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;

import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;

import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.document.StorageDiagramDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.EditPartService;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;

import org.eclipse.jface.window.Window;

import org.eclipse.osgi.util.NLS;

import org.eclipse.swt.widgets.Shell;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import org.eclipse.ui.dialogs.SaveAsDialog;

import org.eclipse.ui.ide.IGotoMarker;

import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.part.FileEditorInput;

/**
 * @generated
 */
public class NewPMBEDiagramEditor extends DiagramDocumentEditor implements
		IGotoMarker {

	/**
	 * @generated
	 */
	public static final String ID = "newpmbe.resource.diagram.part.NewPMBEDiagramEditorID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public NewPMBEDiagramEditor() {
		super(true);
	}

	/**
	 * @generated NOT
	 */
	public void runPrintViewAction() {
		IAction printAction = getActionRegistry().getAction("print");
		printAction.run();
	}

	/**
	 * @generated
	 */
	protected String getEditingDomainID() {
		return "newpmbe.resource.diagram.EditingDomain"; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	protected TransactionalEditingDomain createEditingDomain() {
		TransactionalEditingDomain domain = super.createEditingDomain();
		domain.setID(getEditingDomainID());
		final NotificationFilter diagramResourceModifiedFilter = NotificationFilter
				.createNotifierFilter(domain.getResourceSet()).and(
						NotificationFilter
								.createEventTypeFilter(Notification.ADD)).and(
						NotificationFilter.createFeatureFilter(
								ResourceSet.class,
								ResourceSet.RESOURCE_SET__RESOURCES));
		domain.getResourceSet().eAdapters().add(new Adapter() {

			private Notifier myTarger;

			public Notifier getTarget() {
				return myTarger;
			}

			public boolean isAdapterForType(Object type) {
				return false;
			}

			public void notifyChanged(Notification notification) {
				if (diagramResourceModifiedFilter.matches(notification)) {
					Object value = notification.getNewValue();
					if (value instanceof Resource) {
						((Resource) value).setTrackingModification(true);
					}
				}
			}

			public void setTarget(Notifier newTarget) {
				myTarger = newTarget;
			}

		});

		return domain;
	}

	/**
	 * @generated NOT
	 */
	protected void configureGraphicalViewer() {
//		super.configureGraphicalViewer();
		
		getGraphicalViewer().getControl().setBackground(ColorConstants.listBackground);
        IDiagramGraphicalViewer viewer = getDiagramGraphicalViewer();

        RootEditPart rootEP = EditPartService.getInstance().createRootEditPart(
            getDiagram());
        if (rootEP instanceof IDiagramPreferenceSupport) {
            ((IDiagramPreferenceSupport) rootEP)
                .setPreferencesHint(getPreferencesHint());
        }

        if (getDiagramGraphicalViewer() instanceof DiagramGraphicalViewer) {
            ((DiagramGraphicalViewer) getDiagramGraphicalViewer())
                .hookWorkspacePreferenceStore(getWorkspaceViewerPreferenceStore());
        }

        viewer.setRootEditPart(rootEP);

        viewer.setEditPartFactory(EditPartService.getInstance());
        ContextMenuProvider provider = new DiagramContextMenuProvider(this,
            viewer);
        viewer.setContextMenu(provider);
        getSite().registerContextMenu(ActionIds.DIAGRAM_EDITOR_CONTEXT_MENU,
            provider, viewer);
        KeyHandler viewerKeyHandler = new DiagramGraphicalViewerKeyHandler(viewer)
            .setParent(getKeyHandler());
        viewer.setKeyHandler(new DirectEditKeyHandler(viewer)
            .setParent(viewerKeyHandler));
        ((FigureCanvas) viewer.getControl())
            .setScrollBarVisibility(FigureCanvas.ALWAYS);
		DiagramRootEditPart root = (DiagramRootEditPart) getDiagramGraphicalViewer()
				.getRootEditPart();
		LayeredPane printableLayers = (LayeredPane) root
				.getLayer(LayerConstants.PRINTABLE_LAYERS);
		FreeformLayer extLabelsLayer = new FreeformLayer();
		extLabelsLayer.setLayoutManager(new DelegatingLayout());
		printableLayers.addLayerAfter(extLabelsLayer,
				NewPMBEEditPartFactory.EXTERNAL_NODE_LABELS_LAYER,
				LayerConstants.PRIMARY_LAYER);
		LayeredPane scalableLayers = (LayeredPane) root
				.getLayer(LayerConstants.SCALABLE_LAYERS);
		FreeformLayer scaledFeedbackLayer = new FreeformLayer();
		scaledFeedbackLayer.setEnabled(false);
		scalableLayers.addLayerAfter(scaledFeedbackLayer,
				LayerConstants.SCALED_FEEDBACK_LAYER,
				DiagramRootEditPart.DECORATION_UNPRINTABLE_LAYER);
	}

	/**
	 * @generated
	 */
	protected PaletteRoot createPaletteRoot(PaletteRoot existingPaletteRoot) {
		PaletteRoot root = super.createPaletteRoot(existingPaletteRoot);
		new NewPMBEPaletteFactory().fillPalette(root);
		return root;
	}

	/**
	 * @generated
	 */
	protected PreferencesHint getPreferencesHint() {
		return NewPMBEDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	/**
	 * @generated
	 */
	public String getContributorId() {
		return NewPMBEDiagramEditorPlugin.ID;
	}

	/**
	 * @generated
	 */
	private String contentObjectURI;

	/**
	 * @generated
	 */
	protected void setDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput) {
			setDocumentProvider(new NewPMBEDocumentProvider(contentObjectURI));
		} else {
			setDocumentProvider(new StorageDiagramDocumentProvider());
		}
	}

	/**
	 * @generated
	 */
	public void gotoMarker(IMarker marker) {
		MarkerNavigationService.getInstance().gotoMarker(this, marker);
	}

	/**
	 * @generated
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * @generated NOT
	 */
//	public void doSave(IProgressMonitor progressMonitor) {
//		super.doSave(progressMonitor);
//		if (NewPMBENavigatorContentProvider.getViewer() != null)
//			NewPMBENavigatorContentProvider.getViewer().refresh();
//	}

	/**
	 * @generated
	 */
	public void doSaveAs() {
		performSaveAs(new NullProgressMonitor());
	}

	/**
	 * @generated
	 */
	protected void performSaveAs(IProgressMonitor progressMonitor) {
		Shell shell = getSite().getShell();
		IEditorInput input = getEditorInput();
		SaveAsDialog dialog = new SaveAsDialog(shell);
		IFile original = input instanceof IFileEditorInput ? ((IFileEditorInput) input)
				.getFile()
				: null;
		if (original != null) {
			dialog.setOriginalFile(original);
		}
		dialog.create();
		IDocumentProvider provider = getDocumentProvider();
		if (provider == null) {
			// editor has been programmatically closed while the dialog was open
			return;
		}
		if (provider.isDeleted(input) && original != null) {
			String message = NLS.bind(
					"The original file ''{0}'' has been deleted.", original
							.getName());
			dialog.setErrorMessage(null);
			dialog.setMessage(message, IMessageProvider.WARNING);
		}
		if (dialog.open() == Window.CANCEL) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
			return;
		}
		IPath filePath = dialog.getResult();
		if (filePath == null) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
			return;
		}
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IFile file = workspaceRoot.getFile(filePath);
		final IEditorInput newInput = new FileEditorInput(file);
		// Check if the editor is already open
		IEditorMatchingStrategy matchingStrategy = getEditorDescriptor()
				.getEditorMatchingStrategy();
		IEditorReference[] editorRefs = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();
		for (int i = 0; i < editorRefs.length; i++) {
			if (matchingStrategy.matches(editorRefs[i], newInput)) {
				MessageDialog
						.openWarning(shell, "Problem During Save As...",
								"Save could not be completed. Target file is already open in another editor.");
				return;
			}
		}
		boolean success = false;
		try {
			provider.aboutToChange(newInput);
			getDocumentProvider(newInput).saveDocument(progressMonitor,
					newInput,
					getDocumentProvider().getDocument(getEditorInput()), true);
			success = true;
		} catch (CoreException x) {
			IStatus status = x.getStatus();
			if (status == null || status.getSeverity() != IStatus.CANCEL) {
				ErrorDialog.openError(shell, "Save Problems",
						"Could not save file.", x.getStatus());
			}
		} finally {
			provider.changed(newInput);
			if (success) {
				setInput(newInput);
			}
		}
		if (progressMonitor != null) {
			progressMonitor.setCanceled(!success);
		}
	}
	
	/**
	 * @generated NOT
	 * @Override
	 */
	protected void createActions() {
		ActionRegistry registry = getActionRegistry();
		registry.registerAction(new PrintAction(this));
	}
	//added by zhangpeng--temporaraily refresh the viewer by save the editors.
	/**
	 *  @generated NOT
	 */
	public void doSave(IProgressMonitor progressMonitor) {
		super.doSave(progressMonitor);
		if(getActivePage()!= null){
			CommonViewer part = getViewer();
			if(part!= null){
				part.refresh();
			}
		}
	}
	public CommonViewer getViewer() {
		IViewPart part = getActivePage().findView("org.eclipse.ui.navigator.ProjectExplorer");
		if(part == null)
			return null;
		CommonNavigator navigator = (CommonNavigator)part;
		return navigator.getCommonViewer();
	}
	public IWorkbenchPage getActivePage(){
		if(activePage == null){
			activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		}
		return activePage;
	}
	/**
	 * @generated NOT
	 */
	private IWorkbenchPage activePage;
}