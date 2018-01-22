package newpmbe.oldEdition.update;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import newpmbe.process.diagram.edit.parts.EMPDiagramEditPart;
import newpmbe.process.diagram.edit.parts.EMPCompActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPDocumentEditPart;
import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.actions.internal.ArrangeAction;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest.ConnectionViewAndElementDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.model.WorkbenchContentProvider;

import vpml.processpackage.ProcesspackagePackage;

public class UpdateTest {

	public static void openDiagramFile(){
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		//ITreeContentProvider myWorkbenchContentProvider = new WorkbenchContentProvider();
		//Object[] elements = myWorkbenchContentProvider
			//	.getElements(ResourcesPlugin.getWorkspace().getRoot());
		/*for(int i=0;i<elements.length;i++){
			if(((Project)elements[i]).getName().equals("过程实例")){
				IFile file=((Project) elements[i]).getFile("过程实例.process_diagram");
				try {
					IDE.openEditor(activePage, file);
				} catch (PartInitException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				return;
			}
		}*/
		DiagramDocumentEditor targetDiagramEditor;
		IEditorInput activeInput;
		IFile activeEditorFile;
		targetDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
		activeInput = targetDiagramEditor.getEditorInput();
		//activeEditorFile = ((IFileEditorInput)activeInput).getFile();
		DiagramEditPart  diagramEditPart = ((DiagramDocumentEditor)targetDiagramEditor).getDiagramEditPart();
		//diagramEditPart.getViewer().getEditPartFactory().createEditPart(, )
		//Object node=diagramEditPart.getViewer().getFocusEditPart().getModel();
		//diagramEditPart.getViewer().getEditPartFactory().createEditPart(diagramEditPart, node);
		System.out.println("hello");
		
		
		ViewAndElementDescriptor viewAndElementDescriptor = null;
		//IElementType type=newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPNormalActivity_2008;
		EStructuralFeature name=ProcesspackagePackage.Literals.EMP_NORMAL_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_NORMAL_ACTIVITY__NAME);;
		EStructuralFeature id=ProcesspackagePackage.Literals.EMP_NORMAL_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_NORMAL_ACTIVITY__ID);;
		Map attributes=new HashMap();
		attributes.put(name, "name1");
		attributes.put(id, "id-1");
		
		/*boolean IsDiagramExist = false;
		viewAndElementDescriptor = new ViewAndElementDescriptor(
				new CreateElementRequestAdapter(
				new CreateElementRequest(type)),
				Node.class,
				((IHintedType) type).getSemanticHint(), 
				newPmbe.process.diagram.part.NewpmbeDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		
		CreateViewAndElementRequest req = new CreateViewAndElementRequest(viewAndElementDescriptor);
		Command command = targetDiagramEditor.getDiagramEditPart().getCommand(req);
		DiagramCommandStack commandStack = targetDiagramEditor.getDiagramEditDomain()
        .getDiagramCommandStack();
		commandStack.execute(command);
		
		type=newPmbe.process.diagram.providers.NewpmbeElementTypes.EMPDocument_2003;
		viewAndElementDescriptor = new ViewAndElementDescriptor(
				new CreateElementRequestAdapter(
				new CreateElementRequest(type)),
				Node.class,
				((IHintedType) type).getSemanticHint(), 
				newPmbe.process.diagram.part.NewpmbeDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		
		CreateViewAndElementRequest req2 = new CreateViewAndElementRequest(viewAndElementDescriptor);
		Command command2 = targetDiagramEditor.getDiagramEditPart().getCommand(req2);
		DiagramCommandStack commandStack2 = targetDiagramEditor.getDiagramEditDomain()
        .getDiagramCommandStack();
		commandStack2.execute(command2);*/
		/*
		type=newPmbe.process.diagram.providers.NewpmbeElementTypes.EMPDataFlow_4002;
		IGraphicalEditPart targetElementEditPart = (IGraphicalEditPart)targetDiagramEditor.getDiagramEditPart().getChildren().get(1);
		IGraphicalEditPart sourceElementEditPart = (IGraphicalEditPart)targetDiagramEditor.getDiagramEditPart().getChildren().get(0);
		String targetType = ((View)targetElementEditPart.getModel()).getType();
		System.out.println("targetType: "+targetType);
		String sourceType = ((View)sourceElementEditPart.getModel()).getType();
		System.out.println("sourceType: "+sourceType);
		EObject sourceEObject = ((View)(sourceElementEditPart.getModel())).getElement();
		EObject targetEObject = ((View)(targetElementEditPart.getModel())).getElement();
		TransactionalEditingDomain domain = targetDiagramEditor.getEditingDomain();
		//ConnectionViewAndElementDescriptor  des=new ConnectionViewAndElementDescriptor();
		CreateConnectionViewAndElementRequest testReq = new CreateConnectionViewAndElementRequest(type, ((IHintedType) type).getSemanticHint(), newPmbe.process.diagram.part.NewpmbeDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		Command testCommand =testReq.getCreateCommand(testReq, sourceElementEditPart, targetElementEditPart);
		//testReq.setSourceEditPart(sourceElementEditPart);
		//testReq.setTargetEditPart(targetElementEditPart);
		//Command testCommand=testReq.getCreateCommand(type, sourceElementEditPart, targetElementEditPart, newPmbe.process.diagram.part.NewpmbeDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		//Command testCommand = targetDiagramEditor.getDiagramEditPart().getCommand(testReq);
		DiagramCommandStack testCommandStack = targetDiagramEditor.getDiagramEditDomain()
        .getDiagramCommandStack();
		testCommandStack.execute(testCommand);
		
		
		EStructuralFeature documentName = ProcesspackagePackage.Literals.EMP_DOCUMENT.getEStructuralFeature(ProcesspackagePackage.EMP_DOCUMENT__NAME);
		EStructuralFeature documentId = ProcesspackagePackage.Literals.EMP_DOCUMENT.getEStructuralFeature(ProcesspackagePackage.EMP_DOCUMENT__ID);
		EStructuralFeature documentDescription = ProcesspackagePackage.Literals.EMP_DOCUMENT.getEStructuralFeature(ProcesspackagePackage.EMP_DOCUMENT__DESCRIPTION);
		
		
		Map documentAttributesMap = new HashMap();
		documentAttributesMap.put(documentName, "defaultName");
		documentAttributesMap.put(documentId, "ID1");
		documentAttributesMap.put(documentDescription, "description");
		SetRequest setRequest = new SetRequest(sourceElementEditPart.getEditingDomain(), 
				ViewUtil.resolveSemanticElement((View)sourceElementEditPart.getModel()), 
				documentName, 
				"defaultname");
		SetValueCommand setValueCommand = new SetValueCommand(setRequest);
		sourceElementEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(setValueCommand));
		
		
		//ArrangeAction.createArrangeAllAction(activePage).run();
		//ArrangeAction.createArrangeSelectionAction(activePage).run();
		
		ArrangeRequest arrangeRequest =
			new ArrangeRequest(ActionIds.ACTION_ARRANGE_ALL);
		List list=new ArrayList();
		list.add(targetDiagramEditor.getDiagramEditPart());
		arrangeRequest.setPartsToArrange(targetDiagramEditor.getDiagramEditPart().getChildren());
		Command arrangeCmd =  targetDiagramEditor.getDiagramEditPart().getCommand(arrangeRequest);
		sourceElementEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(arrangeCmd);
		targetDiagramEditor.doSave(new NullProgressMonitor());
	//	targetDiagramEditor.getDiagramEditPart().getChildBySemanticHint(semanticHint)
		
		
		/*
		CompoundCommand cc = new CompoundCommand("Create Subtopic and Link");
		CreateViewRequest topicRequest = CreateViewRequestFactory.getCreateShapeRequest(type, sourceElementEditPart.getDiagramPreferencesHint());
		IAdaptable topicViewAdapter = (IAdaptable) ((List) topicRequest.getNewObject()).get(0);
		ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(type,
				((IHintedType) type).getSemanticHint(), sourceElementEditPart.getDiagramPreferencesHint()), new EObjectAdapter((EObject) sourceElementEditPart.getModel()),
				topicViewAdapter, sourceElementEditPart.getViewer());

	    cc.add(new ICommandProxy(createSubTopicsCmd));
		
	    sourceElementEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
		*/


	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
