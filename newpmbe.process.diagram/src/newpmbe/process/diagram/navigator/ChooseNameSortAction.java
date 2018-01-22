package newpmbe.process.diagram.navigator;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.CommonNavigator;

public class ChooseNameSortAction implements IObjectActionDelegate {
	private TreeViewer selectedElement = null;
	private IWorkbenchPage activePage;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub

	}

	public void run(IAction action) {
		// TODO Auto-generated method stub
		   NameSorter sorter=new NameSorter();
           Viewer i;
           TreeViewer viewer = getViewer();
            viewer.setSorter(sorter);
            viewer.refresh();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof IContainer) {
				selectedElement = (TreeViewer) structuredSelection
						.getFirstElement();
			}
		}
	}
	public IWorkbenchPage getActivePage(){
		if(activePage == null){
			activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		}
		return activePage;
	}
	public TreeViewer getViewer() {
		IViewPart part = getActivePage().findView("org.eclipse.ui.navigator.ProjectExplorer");
		if(part == null)
			return null;
		CommonNavigator navigator = (CommonNavigator)part;
		return navigator.getCommonViewer();
	}

}
