package newpmbe.print.framework;

import newpmbe.product.diagram.part.NewPMBEDiagramEditorPlugin;

import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class PrintCurViewAction implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;
	
	public void dispose() {
		// TODO Auto-generated method stub

	}
//add by wzy start
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
//add by wzy end
	public void run(IAction action) {
		//add by wzy start
//		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
//		.getWorkbench().getActiveWorkbenchWindow();
		//add by wzy end
		IWorkbenchPage activePage=null; 
		activePage= window.getActivePage();
		if(activePage== null){
			System.out.println("null");
		}else{
			System.out.println("OK");
		}
		IEditorPart editor = activePage.getActiveEditor();
		
		if (editor instanceof newpmbe.process.diagram.part.NewPMBEDiagramEditor)
			((newpmbe.process.diagram.part.NewPMBEDiagramEditor)editor).runPrintViewAction();
		else if (editor instanceof newpmbe.resource.diagram.part.NewPMBEDiagramEditor)
			((newpmbe.resource.diagram.part.NewPMBEDiagramEditor)editor).runPrintViewAction();
		else if (editor instanceof newpmbe.organization.diagram.part.NewPMBEDiagramEditor)
			((newpmbe.organization.diagram.part.NewPMBEDiagramEditor)editor).runPrintViewAction();
		else if (editor instanceof newpmbe.product.diagram.part.NewPMBEDiagramEditor)
			((newpmbe.product.diagram.part.NewPMBEDiagramEditor)editor).runPrintViewAction();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

}
