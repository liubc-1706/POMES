package newpmbe.process.diagram.creationtools;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;


import newpmbe.process.diagram.edit.parts.EMPDataFlowEditPart;
import newpmbe.process.diagram.part.NewPMBEDiagramEditor;
import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.util.SelectInDiagramHelper;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

import vpml.processpackage.EMPDataFlow;

public class DataFlowCreationTool extends UnspecifiedTypeConnectionTool {
	// temporarily disable the autoexpose helper since it interferes with menu
	// selection.
	private boolean antiScroll = false;

//	private EMPDataFlow dataFlow;
//	private Node dataFlowView;
//	private EMPDataFlowEditPart editPart;
	
	public DataFlowCreationTool(List connectionTypes) {
		super(connectionTypes);
	}
	private IWorkbenchPage activePage;
	private IWorkbenchPage getActivePage(){
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		return activePage;
	}




	/**
	 * Overridden so that the tool doesn't get deactivated and the feedback
	 * erased if popup dialogs appear to complete the command.
	 * 
	 * @see org.eclipse.gef.tools.AbstractConnectionCreationTool#handleCreateConnection()
	 */
	protected boolean handleCreateConnection() {

		// When a connection is to be created, a dialog box may appear which
		// will cause this tool to be deactivated and the feedback to be
		// erased. This behavior is overridden by setting the avoid
		// deactivation flag.
		setAvoidDeactivation(true);

		EditPartViewer viewer = getCurrentViewer();
		Command endCommand = getCommand();
		//获得目标模型--->是黄色的就表明为引入的Object，只能作为source，而不能作为target
		EditPart endPart = this.getTargetEditPart();
//		endPart.
		//获得目标模型的颜色
		if(endPart instanceof IGraphicalEditPart){
			Object obj = ((IGraphicalEditPart)endPart).getStructuralFeatureValue(NotationPackage.eINSTANCE.getFillStyle_FillColor());
			if(((Integer)obj).intValue() == 65535)//黄色
			{
				this.setState(STATE_INVALID);
				endCommand = null;
			}
		}
		
		activePage=getActivePage();
//		activePage.getActiveEditor();
		NewPMBEDiagramEditor activeEditor = (NewPMBEDiagramEditor)activePage.getActiveEditor();
		
		IEditorInput editorInput = activeEditor.getEditorInput();
		IFile childFile = ((IFileEditorInput)editorInput).getFile();
		IFile file ;
		IPath parentPath= childFile.getParent().getParent().getFullPath();
//		if(parentPath.segments()==null)
		setCurrentCommand(endCommand);
		
		antiScroll = true;
		
		executeCurrentCommand();
		//hzg 如果是在子图里创建的DataFlow
//		if(parentPath.segmentCount()!=0  )
//		
//		{
//			Collection obj = DiagramCommandStack.getReturnValues(endCommand);
//			for (Iterator i = obj.iterator(); i.hasNext();)  {
//				Object object = i.next();
//				if (object instanceof IAdaptable) {
//					Object v  = ((IAdaptable)object).getAdapter(View.class);
//					if( v!= null){
//					Object sourcePart=getCurrentViewer().getEditPartRegistry().get(
//							((IAdaptable)object).getAdapter(View.class));
//					EMPDataFlowEditPart dataFlowEditPart=(EMPDataFlowEditPart)sourcePart;
//					if(dataFlowEditPart.getSource()instanceof IGraphicalEditPart){
//						Object obj2 = ((IGraphicalEditPart)dataFlowEditPart.getSource()).getStructuralFeatureValue(NotationPackage.eINSTANCE.getFillStyle_FillColor());
//						if(((Integer)obj2).intValue() == 65535)//黄色
//						{
//							System.out.println("haha");
//							IContainer parentContainer= childFile.getParent().getParent();
//							file= parentContainer.getFile(new Path(parentPath+"_diagram"));
////							IFile file = childFile.getParent().getFolder(new Path(name)).getFile(new Path(name+".process_diagram"));
////							childFile.getParent().getFullPath();
//							
//							activePage.saveAllEditors(false);
//							NewPMBEDiagramEditor editor = 
//								(NewPMBEDiagramEditor)activePage.findEditor(new FileEditorInput(file));
////							EditPart tempEditPart =editor.getDiagramEditPart();
////							tempEditPart.refresh();
//							activePage.closeEditor(editor, true);
////							editor.close(true);
////							activePage.closeAllEditors(true);
////							IFile file=(IFile)path1;
//						
//							try {
//								
//								IDE.openEditor(activePage, file);
////								IDE.openEditor(activePage, childFile);
//								activePage.bringToTop(activeEditor);
////								MessageDialog.openError(null, "title", "message");
//							} catch (PartInitException e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
//						}
//					}
//					
//					}
//				}
//			}
//	
//		};
		


		
//		String path1 = this.getSemanticElement().eResource().getURI().path();
//		String path2 = ((View) this.getHost().getModel()).getDiagram()
//				.getElement().eResource().getURI().path();
//		System.out.println(path1);
//		System.out.println(path2);
//		if (!path1.equals(path2)) {
//		List xx=	this.getCurrentViewer().getFocusEditPart().getChildren();
		
//		EditPart SourceProductEditPart = this.getConnectionSource();
		
//		Collection obj = DiagramCommandStack.getReturnValues(endCommand);
		antiScroll = false;

		selectAddedObject(viewer, DiagramCommandStack
			.getReturnValues(endCommand));

		setAvoidDeactivation(false);
		eraseSourceFeedback();
		deactivate();

		return true;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.tools.CreationTool#handleMove()
	 */
	protected boolean handleMove() {
		if (!antiScroll) {
			boolean bool = super.handleMove();
			boolean cont = getState() == STATE_CONNECTION_STARTED
				&& ((getCurrentCommand() == null) || ((getCurrentCommand() != null) && (getCurrentCommand()
					.canExecute())));
			if (cont) {
				if ((getTargetEditPart() != null)
					&& (getTargetEditPart().getViewer() instanceof ScrollingGraphicalViewer)
					&& (getTargetEditPart().getViewer().getControl() instanceof FigureCanvas)) {
					FigureCanvas figureCanvas = (FigureCanvas) ((ScrollingGraphicalViewer) getTargetEditPart()
						.getViewer()).getControl();
					Point location1 = getLocation().getCopy();
					SelectInDiagramHelper.exposeLocation(figureCanvas,
						location1);

				}
			}
			return bool;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.tools.TargetingTool#doAutoexpose()
	 */
	protected void doAutoexpose() {
		if (!antiScroll)
			super.doAutoexpose();
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.tools.TargetingTool#getCommand()
	 */
	protected Command getCommand() {
		if (!antiScroll)
			return super.getCommand();
		return null;
	}

}
