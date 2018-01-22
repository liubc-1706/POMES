package newpmbe.resource.diagram.navigator;

import newpmbe.resource.diagram.edit.parts.EMRDiagramEditPart;

import newpmbe.resource.diagram.part.NewPMBEDiagramEditor;
import newpmbe.resource.diagram.part.NewPMBEDiagramEditorPlugin;
import newpmbe.resource.diagram.part.NewPMBEVisualIDRegistry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditorInput;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;

import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;

import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionConstants;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;

/**
 * @generated
 */
public class NewPMBENavigatorActionProvider extends CommonActionProvider {

	/**
	 * @generated
	 */
	private boolean myContribute;

	/**
	 * @generated
	 */
	private OpenDiagramAction myOpenDiagramAction;

	/**
	 * @generated
	 */
	public void init(ICommonActionExtensionSite aSite) {
		super.init(aSite);
		if (aSite.getViewSite() instanceof ICommonViewerWorkbenchSite) {
			myContribute = true;
			makeActions((ICommonViewerWorkbenchSite) aSite.getViewSite());
		} else {
			myContribute = false;
		}
	}

	/**
	 * @generated
	 */
	private void makeActions(ICommonViewerWorkbenchSite viewerSite) {
		myOpenDiagramAction = new OpenDiagramAction(viewerSite);
	}

	/**
	 * @generated
	 */
	public void fillActionBars(IActionBars actionBars) {
		if (!myContribute) {
			return;
		}
		IStructuredSelection selection = (IStructuredSelection) getContext()
				.getSelection();
		myOpenDiagramAction.selectionChanged(selection);
		if (myOpenDiagramAction.isEnabled()) {
			actionBars.setGlobalActionHandler(ICommonActionConstants.OPEN,
					myOpenDiagramAction);
		}
	}

	/**
	 * @generated
	 */
	public void fillContextMenu(IMenuManager menu) {
	}

	/**
	 * @generated NOT
	 */
	private class OpenDiagramAction extends Action {

		/**
		 * @generated
		 */
		private Diagram myDiagram;
		/**
		 * @generated NOT
		 * added by zhangpeng
		 */
		private IFile myFile;

		/**
		 * @generated
		 */
		private ICommonViewerWorkbenchSite myViewerSite;

		/**
		 * @generated
		 */
		public OpenDiagramAction(ICommonViewerWorkbenchSite viewerSite) {
			super("Open Diagram");
			myViewerSite = viewerSite;
		}

		/**
		 * @generated
		 */
		public final void selectionChanged(IStructuredSelection selection) {
			myDiagram = null;
			if (selection.size() == 1) {
				Object selectedElement = selection.getFirstElement();
				if (selectedElement instanceof NewPMBENavigatorItem) {
					selectedElement = ((NewPMBENavigatorItem) selectedElement)
							.getView();
				} 
				else if(selectedElement instanceof IProject)
				{
					NewPMBENavigatorItem item = (NewPMBENavigatorItem) NewPMBENavigatorContentProvider.getHashMap().
					get(selectedElement);
					if(item.getView() instanceof DiagramImpl)
					{
						Diagram diagram = (Diagram)item.getView();
						if (EMRDiagramEditPart.MODEL_ID
								.equals(NewPMBEVisualIDRegistry.getModelID(diagram))) {
							myDiagram = diagram;
							IProject project = (IProject)selectedElement;
							//changed by zhangpeng-改变了工程属性，为每个工程项目增加了后缀，但是要对用户透明
							String projectExtension = project.getFileExtension();
							
							//去掉功程名称后面的扩展名
							String projectName = project.getName().substring(0, project.getName().length() - projectExtension.length() - 1);
							myFile = project.getFile(projectName + ".resource_diagram"); //$NON-NLS-1$
							//end changed by zhangpeng
						}
					}
				}
					else if (selectedElement instanceof IAdaptable) {
					selectedElement = ((IAdaptable) selectedElement)
							.getAdapter(View.class);
				}
				if (selectedElement instanceof Diagram) {
					Diagram diagram = (Diagram) selectedElement;
					if (EMRDiagramEditPart.MODEL_ID
							.equals(NewPMBEVisualIDRegistry.getModelID(diagram))) {
						myDiagram = diagram;
					}
				}
			}
			setEnabled(myDiagram != null);
		}

		/**
		 * @generated NOT
		 */
		public void run() {
			if (myDiagram == null) {
				return;
			}
			//DiagramEditorInput editorInput = new DiagramEditorInput(myDiagram);
			IWorkbenchPage page = myViewerSite.getPage();
			try {
				//page.openEditor(editorInput, NewPMBEDiagramEditor.ID);
				IDE.openEditor(page, myFile, true);
			} catch (PartInitException e) {
				NewPMBEDiagramEditorPlugin.getInstance().logError(
						"Exception while openning diagram", e);
			}
		}

	}

}
