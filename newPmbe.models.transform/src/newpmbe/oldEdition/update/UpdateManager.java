package newpmbe.oldEdition.update;

import java.io.File;
import java.util.List;

import newpmbe.process.diagram.comActRefresher.CompActivityRefresher;
import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
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
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import vpml.processpackage.EMPProduct;
import vpml.processpackage.impl.EMPDocumentImpl;
import vpml.resourcepackage.ResourcepackagePackage;

public class UpdateManager {
	private File mainProcessFile;   //main process file for old pmbe model
	private File rsFile;            //resource file for old pmbe model
	private String modelName;       //the model name
	private IProgressMonitor monitor;
	
	/**
	 * constructor
	 * @param modelName
	 * @param mainProcessFile
	 * @param rsFile
	 */
	public UpdateManager(String modelName,File mainProcessFile, File rsFile,IProgressMonitor monitor){
		this.modelName=modelName;
		this.mainProcessFile=mainProcessFile;
		this.rsFile=rsFile;
		this.monitor=monitor;
	}

	/**
	 * update the old pmbe model which is identified by mainProcessFile and rsFile
	 * @throws CoreException 
	 */
	public void update() throws Exception{
		CompActivityRefresher.disEnabled();
		ModelManager mg=new ModelManager();
		AttributeManager am=new AttributeManager();
		OldPMBEModel opm=new OldPMBEModel(mg, am, modelName, mainProcessFile, rsFile,monitor);
		opm.parseAndGenerateModel();
		CompActivityRefresher.setEnabled();
		/*IWorkbenchWindow window = NewpmbeDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		DiagramDocumentEditor editor1 = (DiagramDocumentEditor)activePage.getEditors()[0];
		DiagramDocumentEditor editor2 = (DiagramDocumentEditor)activePage.getEditors()[1];
		IGraphicalEditPart editPart1 = (IGraphicalEditPart)editor1.getDiagramEditPart().getChildren().get(0);
		IGraphicalEditPart editPart2=(IGraphicalEditPart)editor2.getDiagramEditPart().getChildren().get(0);
		EMPProduct data=(EMPProduct)((NodeImpl)editPart1.getModel()).getElement();
		Object model=editPart1.getModel();
		EObjectAdapter objAdapter = new EObjectAdapter(data);
		activePage.closeEditor(editor1, false);
		//editor1.doSave(new NullProgressMonitor());
		//editor2.doSave(new NullProgressMonitor());
		/*IElementType type=newPmbe.process.diagram.providers.NewpmbeElementTypes.EMRBasicResourceType_2016;
		ViewAndElementDescriptor viewAndElementDescriptor = new ViewAndElementDescriptor(
				new CreateElementRequestAdapter(
				new CreateElementRequest(type)),
				Node.class,
				((IHintedType) type).getSemanticHint(), 
				newPmbe.process.diagram.part.NewpmbeDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		CreateViewAndElementRequest req = new CreateViewAndElementRequest(viewAndElementDescriptor);
		Command command = editor2.getDiagramEditPart().getCommand(req);
		DiagramCommandStack commandStack = editor2.getDiagramEditDomain()
        .getDiagramCommandStack();
		commandStack.execute(command);
		
		IGraphicalEditPart editPart1 = (IGraphicalEditPart)editor2.getDiagramEditPart().getChildren().get(0);
		EStructuralFeature name =ResourcepackagePackage.Literals.EMR_BASIC_RESOURCE_TYPE.getEStructuralFeature(ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__NAME);
		SetRequest setRequest = new SetRequest(editPart1.getEditingDomain(), 
				ViewUtil.resolveSemanticElement((View)editPart1.getModel()), 
				name, 
				"defaultname");
		SetValueCommand setValueCommand = new SetValueCommand(setRequest);
		editPart1.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(setValueCommand));
		
		
		
		CreateViewRequest.ViewDescriptor viewDescriptor = new CreateViewRequest.ViewDescriptor(
				objAdapter, Node.class, null,
				NewpmbeDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);

		CreateViewRequest cvRequest = new CreateViewRequest(
				(viewDescriptor));
		Command cmd=editor2.getDiagramEditPart().getCommand(cvRequest);
		editor2.getDiagramEditDomain().getDiagramCommandStack().execute(cmd);
		editor2.doSave(new NullProgressMonitor());
		
		IGraphicalEditPart edit=(IGraphicalEditPart)editor2.getDiagramGraphicalViewer().getEditPartRegistry().get(data);
		//editor2.getDiagramEditPart().get
		IFile activeEditorFile = ((IFileEditorInput)editor2.getEditorInput()).getFile();
		activePage.closeEditor(editor2, false);
		try {
			IDE.openEditor(activePage, activeEditorFile);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		editor2=(DiagramDocumentEditor)activePage.getActiveEditor();
		
		String id=((vpml.impl.EMObjectImpl)((NodeImpl)model).getElement()).getId();
		
		GraphicalEditPart editpart=null;
		List editParts=editor2.getDiagramEditPart().getChildren();
		for(int i=0;i<editParts.size();i++){
			GraphicalEditPart temp=(GraphicalEditPart)editParts.get(i);
			String ID=(String)temp.getStructuralFeatureValue(vpml.VpmlPackage.Literals.EM_OBJECT.getEStructuralFeature(vpml.VpmlPackage.EM_OBJECT__ID));
			if(model.equals(temp.getModel())){
				editpart=temp;
				return;
			}
		}
		List list=editor2.getDiagramEditPart().getChildren();
		IElementType type=newPmbe.process.diagram.providers.NewpmbeElementTypes.EMPDataFlow_4001;
		CreateConnectionViewAndElementRequest testReq = new CreateConnectionViewAndElementRequest(type, 
				((IHintedType) type).getSemanticHint(), 
				newPmbe.process.diagram.part.NewpmbeDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		Command testCommand =testReq.getCreateCommand(testReq,(IGraphicalEditPart)list.get(0), editpart);
		DiagramCommandStack testCommandStack = editor2.getDiagramEditDomain()
        .getDiagramCommandStack();
		testCommandStack.execute(testCommand);
		//activePage.closeEditor(editor2, false);
		List list2=editor2.getDiagramEditPart().getChildren();
		System.out.println();
		//editor2.getDiagramEditPart().
		*/
		
		
	}

	
	
	
	public File getMainProcessFile() {
		return mainProcessFile;
	}

	public void setMainProcessFile(File mainProcessFile) {
		this.mainProcessFile = mainProcessFile;
	}

	public File getRsFile() {
		return rsFile;
	}

	public void setRsFile(File rsFile) {
		this.rsFile = rsFile;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	
	
}
