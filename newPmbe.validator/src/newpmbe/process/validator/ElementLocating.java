package newpmbe.process.validator;

import java.util.List;


import newpmbe.process.diagram.edit.parts.EMPDiagramEditPart;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * �ṩģ��Ԫ�صĶ�λ���ܣ�
 * @author fan
 *
 */
public class ElementLocating {

	public static void locate(){
		IWorkbenchPage page = PlatformUI.getWorkbench() 
		.getActiveWorkbenchWindow().getActivePage(); 
		IEditorPart ieditorpart = page.getActiveEditor(); 
		EMPDiagramEditPart editor=(EMPDiagramEditPart)ieditorpart;
		
	//	View view = editor.getNotationView();
		//OutlinePage fe;

		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		final ISelection selection = window.getSelectionService().getSelection();
		//Diagram diagramView = null;
        
        
		//editor.getDiagramView().
		///GraphicalViewer view=(GraphicalViewer)editor.getAdapter(GraphicalViewer.class);
		
		
	}
}
