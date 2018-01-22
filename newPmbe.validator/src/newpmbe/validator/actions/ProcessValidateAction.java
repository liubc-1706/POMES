package newpmbe.validator.actions;

import java.util.List;

import newpmbe.process.validator.ProblemsView;
import newpmbe.process.validator.Validator;

import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.w3c.dom.Document;

public class ProcessValidateAction implements IObjectActionDelegate {
	
	private IProject selectedElement;
	
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub

	}

	public void run(IAction action) {
		// TODO Auto-generated method stub
		//ProcessValidator.ValidateProcess(selectedElement);
		//Validator validator=new Validator(selectedElement,null);
		//validator.validateProject();
		
		//ProcessValidator.ValidateProcess(selectedElement);
		Validator validator=new Validator(selectedElement);
		List problemList=validator.ValidateProcess();
		
		try {
		IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().
								getActiveWorkbenchWindow().getActivePage();
		IViewPart view=workbenchPage.findView("newpmbe.validator.views.ProblemsView");
		//如果视图不存在，则显示视图
		if(view==null){
			workbenchPage.showView("newpmbe.validator.views.ProblemsView");
			view=workbenchPage.findView("newpmbe.validator.views.ProblemsView");
		}
		((ProblemsView)view).getViewer().setInput(problemList);
		((ProblemsView)view).text.setText("过程名："+selectedElement.getName().replace(".process", ""));
		workbenchPage.bringToTop(view);
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		
		
		/*IWorkbenchWindow window = NewpmbeDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		DiagramDocumentEditor currentDiagramEditor=(DiagramDocumentEditor)activePage.getActiveEditor();
		
		List editParts=currentDiagramEditor.getDiagramEditPart().getChildren();
		for(int i=0;i<editParts.size();i++){
			if(editParts.get(i) instanceof ShapeNodeEditPart){
				GraphicalEditPart editPart=(GraphicalEditPart)editParts.get(i);
				String name=((vpml.impl.EMObjectImpl)((NodeImpl)editPart.getModel()).getElement()).getName();
				System.out.println(name);
			}
		}*/
		
		
		
		
	}

	
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof IProject) {
				selectedElement = (IProject) structuredSelection
						.getFirstElement();
			}
		}
	}

}
