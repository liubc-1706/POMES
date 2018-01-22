package newpmbe.oldEdition.update;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import newpmbe.models.fileCopyUtil.RelativePath;

import newpmbe.process.diagram.part.NewPMBEDiagramEditorUtil;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.util.EditorUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

import vpml.EMDiagram;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.ProcesspackagePackage;
import vpml.resourcepackage.ResourcepackagePackage;
import vpml.utilpackage.EnumIOType;
import vpml.utilpackage.EnumTimeUnit;

public class ModelManager {
	private IWorkbenchWindow window;
	private IWorkbenchPage activePage;
	private DiagramDocumentEditor currentDiagramEditor;
	
	
	public ModelManager(){
		window= newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin.getInstance().getWorkbench().getActiveWorkbenchWindow();
		activePage = window.getActivePage();		
	}
	
	public void createProcessProject(String projectName) throws CoreException{
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root= workspace.getRoot();
		IProject project= root.getProject(projectName);
		/*project.create(null);
	    project.open(null);*/
		
		String pathStr=root.getLocation().append("过程模型").append(projectName).toString();
		Path path=new Path(pathStr);
		IProjectDescription description=workspace.newProjectDescription(projectName+".process");
		description.setLocation(path);
		project.create(description, null);
	    project.open(null);
		
	    
	    IProgressMonitor progressMonitor = new NullProgressMonitor();
		progressMonitor.beginTask(
				"Creating diagram and model files", 4); //$NON-NLS-1$
		final IProgressMonitor subProgressMonitor = new SubProgressMonitor(
				progressMonitor, 1);
		String processName=projectName+"_diagram";
		NewPMBEDiagramEditorUtil.openDiagram(NewPMBEDiagramEditorUtil
			.createDiagram((new Path(projectName)).makeAbsolute(),
					processName, progressMonitor));
		
		activePage = window.getActivePage();
		currentDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
		
	    
		//---- set process name 2007-10-20 by fan
		String name=processName.replace(".process_diagram", "");
		IGraphicalEditPart diagramEditPart=currentDiagramEditor.getDiagramEditPart();
		this.setProcessName(diagramEditPart, name);
		//---- set ended
		
		//changed by cty - copy files
		String desFilePathStr=project.getLocation().toString();
//		String srcFilePathStr=pathStr+"\\过程模型\\_ResFiles";
		
		String srcFilePathStr="";
		System.out.println(srcFilePathStr);
		try{
			srcFilePathStr=RelativePath.getFullPathRelateClass("../configuration/_ResFiles",RelativePath.class);
			String srcFilePathStr1=RelativePath.getFullPathRelateClass("../../../../_ResFiles",RelativePath.class);
			File srcFolder=new File(srcFilePathStr);
			if(!srcFolder.exists())
				srcFilePathStr=srcFilePathStr1;
			copyFiles(srcFilePathStr,desFilePathStr);
		}
		catch(Exception ee){
			ee.printStackTrace();
		}
	    project.refreshLocal(1, new NullProgressMonitor());
		
//	   end changed by cty
	}
	
	/**
	 * create sub diagram for a composite activity
	 * @param currentFile
	 * @param subProcessName
	 * @throws Exception
	 */
	public  void createSubProcessDiagram(IFile currentFile, String subProcessName) throws Exception{
		String projectName=currentFile.getProject().getName();
		String path=currentFile.getParent().getProjectRelativePath().append(subProcessName).
				append(subProcessName+".process_diagram").toString();
		IFolder folder=currentFile.getProject().getFolder(currentFile.getParent().
				getProjectRelativePath().append(subProcessName));
		if(!folder.exists()){
			folder.create(true, true, new NullProgressMonitor());
		}
		
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		progressMonitor.beginTask(
				"Creating diagram and model files", 4); //$NON-NLS-1$
		final IProgressMonitor subProgressMonitor = new SubProgressMonitor(
				progressMonitor, 1);
		NewPMBEDiagramEditorUtil.openDiagram(NewPMBEDiagramEditorUtil
				.createDiagram((new Path(projectName)).makeAbsolute(),
						path, progressMonitor));
		
		activePage = window.getActivePage();
		currentDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
		
		//---- set process name 2007-10-20 by fan
		String name=currentFile.getName().replace(".process_diagram", "");
		IGraphicalEditPart diagramEditPart=currentDiagramEditor.getDiagramEditPart();
		setProcessName(diagramEditPart, name);
		//---- set ended
	}
	
	/**
	 * 设置过程图的ID属性
	 * @param editPart 代表过程图的DiagramEditPart
	 * @param id
	 */
	public void setProcessID(IGraphicalEditPart editPart, String id){
		EStructuralFeature processID=ProcesspackagePackage.Literals.EMP_DIAGRAM.
		getEStructuralFeature(ProcesspackagePackage.EMP_DIAGRAM__ID);
		SetRequest setRequest= new SetRequest(editPart.getEditingDomain(), 
						ViewUtil.resolveSemanticElement((View) editPart.getModel()), 
						processID, 
						id);
		SetValueCommand setValueCommand = new SetValueCommand(setRequest);
		editPart.getDiagramEditDomain().getDiagramCommandStack().
								execute(new ICommandProxy(setValueCommand));
	}
	
	/**
	 * 设置过程图的name属性
	 * @param editPart 代表过程图的DiagramEditPart
	 * @param name
	 */
	public void setProcessName(IGraphicalEditPart editPart, String name){
		EStructuralFeature processName=ProcesspackagePackage.Literals.EMP_DIAGRAM.
		getEStructuralFeature(ProcesspackagePackage.EMP_DIAGRAM__NAME);
		SetRequest setRequest= new SetRequest(editPart.getEditingDomain(), 
						ViewUtil.resolveSemanticElement((View) editPart.getModel()), 
						processName, 
						name);
		SetValueCommand setValueCommand = new SetValueCommand(setRequest);
		editPart.getDiagramEditDomain().getDiagramCommandStack().
								execute(new ICommandProxy(setValueCommand));
	}
	
	
	/**
	 * create subDiagram for composite product
	 * @param currentFile
	 * @param subProductName
	 * @throws Exception
	 */
	public void createSubProductDiagram(IFile currentFile, String subProductName) throws Exception{
		String projectName=currentFile.getProject().getName();
		String path=currentFile.getParent().getProjectRelativePath().append(subProductName).
				append(subProductName+".product_diagram").toString();
		IFolder folder=currentFile.getProject().getFolder(currentFile.getParent().
				getProjectRelativePath().append(subProductName));
		if(!folder.exists()){
			folder.create(true, true, new NullProgressMonitor());
		}
		
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		progressMonitor.beginTask(
				"Creating diagram and model files", 4); //$NON-NLS-1$
		final IProgressMonitor subProgressMonitor = new SubProgressMonitor(
				progressMonitor, 1);
		newpmbe.product.diagram.part.NewPMBEDiagramEditorUtil.openDiagram(newpmbe.product.
				diagram.part.NewPMBEDiagramEditorUtil.createDiagram(
						(new Path(projectName)).makeAbsolute(),path,progressMonitor));
		
		activePage = window.getActivePage();
		currentDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
		
		//---- set sub-diagram name 2007-10-20 by fan
		String name=currentFile.getName().replace(".product_diagram", "");
		IGraphicalEditPart diagramEditPart=currentDiagramEditor.getDiagramEditPart();
		setProcessName(diagramEditPart, name);
		//---- set ended
		
	}
	
	public NodeEditPart createElement(IElementType type,Map attributes){
		ViewAndElementDescriptor viewAndElementDescriptor = null;
		viewAndElementDescriptor = new ViewAndElementDescriptor(
				new CreateElementRequestAdapter(
				new CreateElementRequest(type)),
				Node.class,
				((IHintedType) type).getSemanticHint(), 
				newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		CreateViewAndElementRequest req = new CreateViewAndElementRequest(viewAndElementDescriptor);
		Command command = currentDiagramEditor.getDiagramEditPart().getCommand(req);
		DiagramCommandStack commandStack = currentDiagramEditor.getDiagramEditDomain()
        .getDiagramCommandStack();
		commandStack.execute(command);
		
		GraphicalEditPart currentEditPart=(GraphicalEditPart)currentDiagramEditor.getDiagramEditPart().getChildren().get(currentDiagramEditor.getDiagramEditPart().getChildren().size()-1);
		//set attribute value
		this.setAttributes(currentEditPart, attributes);
		currentEditPart=(GraphicalEditPart)currentDiagramEditor.getDiagramEditPart().getChildren().get(currentDiagramEditor.getDiagramEditPart().getChildren().size()-1);
		NodeEditPart node=new NodeEditPart(currentEditPart,this.getCurrentFile().getLocation().toString());
		return node;
	}
	
	
	public void createConnections(IElementType type,GraphicalEditPart source,GraphicalEditPart target){
		//IElementType type=newPmbe.process.diagram.providers.NewpmbeElementTypes.EMPDataFlow_4002;
		CreateConnectionViewAndElementRequest testReq = new CreateConnectionViewAndElementRequest(type, 
				((IHintedType) type).getSemanticHint(), 
				newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		Command testCommand =testReq.getCreateCommand(testReq, source, target);
		DiagramCommandStack testCommandStack = this.currentDiagramEditor.getDiagramEditDomain()
        .getDiagramCommandStack();
		testCommandStack.execute(testCommand);
	}
	/**
	 * set attributes for editpart
	 * @param editpart
	 * @param attributes
	 */
	protected void setAttributes(GraphicalEditPart editpart,Map attributes){
		Iterator pairs = attributes.entrySet().iterator();
		for (int i = 0; i < attributes.size(); i++) {
			Map.Entry entry = (Map.Entry)pairs.next();
			EStructuralFeature key = (EStructuralFeature)entry.getKey();
			String value = (String)entry.getValue();
			System.out.println("key "+i+": "+key.getName());
			System.out.println("value "+i+": "+value);
			if (key.equals(ProcesspackagePackage.Literals.EMP_NORMAL_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_NORMAL_ACTIVITY__PRIORITY))
				|| key.equals(ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_BATCH_ACTIVITY__PRIORITY))
				|| key.equals(ProcesspackagePackage.Literals.EMP_DOCUMENT.getEStructuralFeature(ProcesspackagePackage.EMP_DOCUMENT__INIT_QUEUE))
				|| key.equals(ProcesspackagePackage.Literals.EMP_DOCUMENT.getEStructuralFeature(ProcesspackagePackage.EMP_DOCUMENT__PERIOD))
				|| key.equals(ProcesspackagePackage.Literals.EMP_CLOCK.getEStructuralFeature(ProcesspackagePackage.EMP_CLOCK__RESTART_PERIOD))
				|| key.equals(ResourcepackagePackage.Literals.EMR_ROLE.getEStructuralFeature(ResourcepackagePackage.EMR_ROLE__TOTAL_AMOUNT))
				|| key.equals(ResourcepackagePackage.Literals.EMR_ROLE.getEStructuralFeature(ResourcepackagePackage.EMR_ROLE__USAGE_AMOUNT))) {
				SetRequest setRequest = new SetRequest(editpart.getEditingDomain(), 
						ViewUtil.resolveSemanticElement((View) editpart.getModel()), 
						key, 
						Integer.parseInt(value));
				SetValueCommand setValueCommand = new SetValueCommand(setRequest);
				editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(setValueCommand));
			}
			if(key.equals(ProcesspackagePackage.Literals.EMP_DOCUMENT.getEStructuralFeature(ProcesspackagePackage.EMP_DOCUMENT__IO_TYPE))){
				int type=Integer.parseInt(value);
				EnumIOType ioType=EnumIOType.get(type);				
				SetRequest setRequest = new SetRequest(editpart.getEditingDomain(), 
						ViewUtil.resolveSemanticElement((View) editpart.getModel()), 
						key, 
						ioType);
				SetValueCommand setValueCommand = new SetValueCommand(setRequest);
				editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(setValueCommand));
			}
			if(key.equals(ProcesspackagePackage.Literals.EMP_DOCUMENT.getEStructuralFeature(ProcesspackagePackage.EMP_DOCUMENT__TIME_UNIT))
					||key.equals(ProcesspackagePackage.Literals.EMP_NORMAL_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_NORMAL_ACTIVITY__TIME_UNIT))
					||key.equals(ProcesspackagePackage.Literals.EMP_CLOCK.getEStructuralFeature(ProcesspackagePackage.EMP_CLOCK__INTERVAL_UNIT))
					||key.equals(ProcesspackagePackage.Literals.EMP_CLOCK.getEStructuralFeature(ProcesspackagePackage.EMP_CLOCK__TIME_UNIT))){
				int type=Integer.parseInt(value);
				EnumTimeUnit timeUnit=EnumTimeUnit.get(type);
				SetRequest setRequest = new SetRequest(editpart.getEditingDomain(), 
						ViewUtil.resolveSemanticElement((View) editpart.getModel()), 
						key, 
						timeUnit);
				SetValueCommand setValueCommand = new SetValueCommand(setRequest);
				editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(setValueCommand));
			}
			
			else if (key.equals(ProcesspackagePackage.Literals.EMP_CLOCK.getEStructuralFeature(ProcesspackagePackage.EMP_CLOCK__START_TIME))
					|| key.equals(ProcesspackagePackage.Literals.EMP_CLOCK.getEStructuralFeature(ProcesspackagePackage.EMP_CLOCK__END_TIME))
					|| key.equals(ProcesspackagePackage.Literals.EMP_CLOCK.getEStructuralFeature(ProcesspackagePackage.EMP_CLOCK__INTERVAL_VALUE))
					|| key.equals(ResourcepackagePackage.Literals.EMR_ROLE.getEStructuralFeature(ResourcepackagePackage.EMR_ROLE__COST_PER_UNIT))
					|| key.equals(ResourcepackagePackage.Literals.EMR_ROLE.getEStructuralFeature(ResourcepackagePackage.EMR_ROLE__EFFICIENCY))) {
				SetRequest setRequest = new SetRequest(editpart.getEditingDomain(), 
						ViewUtil.resolveSemanticElement((View) editpart.getModel()), 
						key, 
						Double.parseDouble(value));
				SetValueCommand setValueCommand = new SetValueCommand(setRequest);
				editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(setValueCommand));
			}
			else {
				SetRequest setRequest = new SetRequest(editpart.getEditingDomain(), 
						ViewUtil.resolveSemanticElement((View) editpart.getModel()), 
						key, 
						value);
				SetValueCommand setValueCommand = new SetValueCommand(setRequest);
				editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(setValueCommand));
			}
		}
	}
	

	public void arrangeCurrentDiagram(){
		ArrangeRequest arrangeRequest =
			new ArrangeRequest(ActionIds.ACTION_ARRANGE_ALL);
		arrangeRequest.setPartsToArrange(this.currentDiagramEditor.getDiagramEditPart().getChildren());
		Command arrangeCmd =  this.currentDiagramEditor.getDiagramEditPart().getCommand(arrangeRequest);
		this.currentDiagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(arrangeCmd);
	}
	
	public void saveAndCloseCurrentEditor(){
		this.currentDiagramEditor.doSave(new NullProgressMonitor());
		activePage.closeEditor(this.currentDiagramEditor, false);
		currentDiagramEditor=(DiagramDocumentEditor)activePage.getActiveEditor();
	}
	
	public IFile getCurrentFile(){
		IFile activeEditorFile = ((IFileEditorInput)this.currentDiagramEditor.getEditorInput()).getFile();
		return activeEditorFile;
	}
	
	public void openDiagramFile(IFile file){
		try {
			IDE.openEditor(this.getActivePage(), file);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		currentDiagramEditor=(DiagramDocumentEditor)activePage.getActiveEditor();
	}
	
	
	public GraphicalEditPart getEditPartById(String id){
		List editParts=this.currentDiagramEditor.getDiagramEditPart().getChildren();
		for(int i=0;i<editParts.size();i++){
			GraphicalEditPart editPart=(GraphicalEditPart)editParts.get(i);
			String ID=((vpml.impl.EMObjectImpl)((NodeImpl)editPart.getModel()).getElement()).getId();
			if(ID.equals(id))
				return editPart;
		}
		return null;
	}
	
	public IWorkbenchWindow getWindow() {
		return window;
	}

	public void setWindow(IWorkbenchWindow window) {
		this.window = window;
	}

	public IWorkbenchPage getActivePage() {
		return activePage;
	}

	public void setActivePage(IWorkbenchPage activePage) {
		this.activePage = activePage;
	}

	public DiagramDocumentEditor getCurrentDiagramEditor() {
		return currentDiagramEditor;
	}

	public void setCurrentDiagramEditor(DiagramDocumentEditor currentDiagramEditor) {
		this.currentDiagramEditor = currentDiagramEditor;
	}
	
	public void copyFiles(String srcFilePathStr,String desFilePathStr) throws IOException{
			
			
			File srcFolder=new File(srcFilePathStr);
			if(!srcFolder.getName().equals(".svn")){
				new File(desFilePathStr).mkdirs();
				File[] file=srcFolder.listFiles();
				for(int i=0;i<file.length;i++){
					if(file[i].isFile()){
						FileInputStream input=new FileInputStream(file[i]);
						File outputFile=new File(desFilePathStr+"/"+file[i].getName());
						if(!outputFile.exists()){
							outputFile.createNewFile();
							FileOutputStream output=new FileOutputStream(outputFile);
							byte[] b=new byte[1024*5];
							int len;
							while((len=input.read(b))!=-1){
								output.write(b,0,len);
								}
							output.flush();
							output.close();
							input.close();
						}
				     }
				   if(file[i].isDirectory()){
					   copyFiles(srcFilePathStr+"/"+file[i].getName(),desFilePathStr+"/"+file[i].getName());
				  }
				     
				  }
			}
		}
	}

