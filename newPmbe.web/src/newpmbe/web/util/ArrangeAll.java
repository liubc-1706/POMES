package newpmbe.web.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;

public class ArrangeAll {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void arrangeAll(IFile file, String fileDir){
				
		int index1 = fileDir.lastIndexOf("\\");
	    String fileNameTmp = fileDir.substring(index1 + 1);
	    int index2 =fileNameTmp.indexOf(".");
	    String fileName = fileNameTmp.substring(0, index2);
	    
	    IWorkbenchWindow window = null;
		if(fileNameTmp.indexOf("process") >= 0){
			window = newpmbe.process.diagram.part
			.NewPMBEDiagramEditorPlugin.getInstance() 
			.getWorkbench().getActiveWorkbenchWindow();
//		}else{
//			window = newPmbe.product.diagram.part.NewpmbeDiagramEditorPlugin.getInstance()
//			.getWorkbench().getActiveWorkbenchWindow();
		}
		
		IWorkbenchPage activePage = window.getActivePage();
		DiagramDocumentEditor targetDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
		
		IGraphicalEditPart targetElementEditPart = (IGraphicalEditPart)targetDiagramEditor
									.getDiagramEditPart().getChildren().get(1);
		IGraphicalEditPart sourceElementEditPart = (IGraphicalEditPart)targetDiagramEditor
									.getDiagramEditPart().getChildren().get(0); 
		
		ArrangeRequest arrangeRequest =
			new ArrangeRequest(ActionIds.ACTION_ARRANGE_ALL);
		List list=new ArrayList();
		list.add(targetDiagramEditor.getDiagramEditPart());
		arrangeRequest.setPartsToArrange(targetDiagramEditor.getDiagramEditPart().getChildren());
		Command arrangeCmd =  targetDiagramEditor.getDiagramEditPart().getCommand(arrangeRequest);
		sourceElementEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(arrangeCmd);
		targetDiagramEditor.doSave(new NullProgressMonitor()); 
	}
}
