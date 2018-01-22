package wzy.diagram.ccpu.popup.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import newpmbe.process.diagram.edit.parts.EMPProductPackageEditPart;
import newpmbe.product.diagram.part.NewPMBEDiagramEditorPlugin;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.util.Log;
import org.eclipse.gmf.runtime.common.core.util.Trace;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.common.ui.action.global.GlobalActionId;
import org.eclipse.gmf.runtime.common.ui.action.internal.CommonUIActionDebugOptions;
import org.eclipse.gmf.runtime.common.ui.action.internal.CommonUIActionPlugin;
import org.eclipse.gmf.runtime.common.ui.action.internal.CommonUIActionStatusCodes;
import org.eclipse.gmf.runtime.common.ui.action.internal.global.GlobalActionHandlerData;
import org.eclipse.gmf.runtime.common.ui.services.action.global.GlobalActionContext;
import org.eclipse.gmf.runtime.common.ui.services.action.global.GlobalActionHandlerContext;
import org.eclipse.gmf.runtime.common.ui.services.action.global.GlobalActionHandlerService;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionContext;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionHandler;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionHandlerProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.INodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SemanticCreateCommand;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.events.HelpListener;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IKeyBindingService;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.dialogs.MessageDialog;
import vpml.processpackage.impl.EMPCompActivityImpl;
import vpml.processpackage.impl.EMPProductPackageImpl;

public class PasteNewAction extends AbstractActionDelegate implements IObjectActionDelegate{
	
	public static ArrayList<IGraphicalEditPart> itemEditpartArray = new ArrayList<IGraphicalEditPart>(100);
	public static ArrayList<Integer> creatFileFlag = new ArrayList<Integer>(100); 
	public static int productFolderID = 0;
	public static int activityFolderID = 0;
	public PasteNewAction(){
		Paste paste = new Paste();
		IKeyBindingService keyBindingService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().getSite().getKeyBindingService();
		keyBindingService.registerAction(paste);

	}
	
	protected void getID(File f){
		activityFolderID = 0;
		productFolderID = 0;
		ArrayList<Integer> activityIDList = new ArrayList<Integer>(100);
		ArrayList<Integer> productIDList = new ArrayList<Integer>(100);;
		activityIDList.clear();
		productIDList.clear();
		File[] fileList = f.listFiles();
		boolean flag_ = false;
		for(File file_:fileList){
			if(file_.getName().contains("_")&&!file_.getName().contains("_diagram")&&!file_.getName().equals("_Collaboration")){
				flag_ = true;
				break;
			}
		}
		if(flag_){
			for(File file:fileList){
				if(file.isDirectory()&&!file.getName().equals("_Collaboration")&&!file.getName().equals("RootSimulationModel")&&!file.getName().equals(".settings")){
					String dirName = file.getName();
					File dirFile = new File(f.getAbsolutePath()+"/"+dirName);
					dirFile.mkdir();
					File fileComp = dirFile.listFiles()[0];
					String fileName = fileComp.getName();
					int num;				
					if(dirName.contains("_")){
						num = Integer.parseInt(dirName.split("_")[1]);					
						if(fileName.contains("process_diagram")){
							activityIDList.add(num);
						}
						else if(fileName.contains("product_diagram")){
							productIDList.add(num);
						}
						else{}
					}								
				}			
			}
			boolean flag = false;
			while(true){
				flag = false;
				if(activityIDList.size()==1||activityIDList.size()==0)	break;
				
				for(int i = 0 ;i < activityIDList.size()-1; i++){
					if(activityIDList.get(i) > activityIDList.get(i+1)){
						Integer item1 = activityIDList.get(i);
						Integer item2 = activityIDList.get(i+1);
						activityIDList.remove(i);
						activityIDList.remove(i);
						activityIDList.add(i,item2);
						activityIDList.add(i+1,item1);
						flag = true;							
					}
				}
				if(!flag){
					break;
				}
			}
			if(activityIDList.size()==1){
				if(activityIDList.get(0) == 1)
					activityFolderID = 2;
				else
					activityFolderID = 1;
			}
			else{
				for(int i = 0;i<activityIDList.size()-1;i++){
					if(activityIDList.get(0) != 1){
						activityFolderID = 1;
					}
					else{
						if((activityIDList.get(i+1)-activityIDList.get(i))>1){
							activityFolderID = activityIDList.get(i)+1;
						}
						else
							activityFolderID = activityIDList.get(activityIDList.size()-1)+1;
					}
					
				}
			}
			
			while(true){
				if(productIDList.size() == 1||productIDList.size() == 0)	break;
				flag = false;
				for(int i = 0 ;i < productIDList.size()-1; i++){
					if(productIDList.get(i) > productIDList.get(i+1)){
						Integer item1 = productIDList.get(i);
						Integer item2 = productIDList.get(i+1);
						productIDList.remove(i);
						productIDList.remove(i+1);
						productIDList.add(i,item2);
						productIDList.add(i+1,item1);
						flag = true;							
					}
				}
				if(!flag){
					break;
				}
			}
			if(productIDList.size() == 1){
				if(productIDList.get(0) == 1)
					productFolderID = 2;
				else
					productFolderID = 1;
			}
			else{
				for(int i = 0;i<productIDList.size()-1;i++){
					if(productIDList.get(0)!=1)
						productFolderID = 1;
					else{
						if((productIDList.get(i+1)-productIDList.get(i))>1){
							productFolderID = productIDList.get(i)+1;
						}
						else
							productFolderID = productIDList.get(productIDList.size()-1)+1;
					}
					
				}
			}
		}
		
		else{
			for(File file:fileList){
				if(file.isDirectory()&&!file.getName().equals("_Collaboration")&&!file.getName().equals("RootSimulationModel")&&!file.getName().equals(".settings")){
					String dirName = file.getName();
					File dirFile = new File(f.getAbsolutePath()+"/"+dirName);
					dirFile.mkdir();
					File fileComp = dirFile.listFiles()[0];
					String fileName = fileComp.getName();
					if(fileName.contains("process_diagram")){
						activityFolderID++;
					}
					else if(fileName.contains("product_diagram")){
						productFolderID++;
					}
					else{}
				}					
			}			
		}
		
		 
	}
	
    protected void copyFiles(Object sel){
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();		
		IWorkbenchPage activePage = window.getActivePage();			
		DiagramDocumentEditor targetDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();		
		IEditorInput activeInput = targetDiagramEditor.getEditorInput();		
		IFile activeEditorFile = ((IFileEditorInput)activeInput).getFile();
		String fullPath = activeEditorFile.getLocation().toString();
		String actFilePath = activeEditorFile.getProjectRelativePath().toString();
		String dir = fullPath.split("/"+actFilePath)[0];
		EObject element = ((IGraphicalEditPart)sel).resolveSemanticElement();
		String folderName = null;
		int folderID = 1;
		String flag = null;
		if(sel instanceof EMPProductPackageEditPart){
			File proFile = new File(dir);
			proFile.mkdir();
			getID(proFile);
			folderID = productFolderID;
			folderName=((EMPProductPackageImpl) element).getName();		
			flag = ".product_diagram";
		}
		else{
			File proFile = new File(dir);
			proFile.mkdir();
			getID(proFile);
			folderID = activityFolderID;
			folderName=((EMPCompActivityImpl) element).getName();
			flag = ".process_diagram";
		}
		String dirReplace = dir.replace("/", "\\");
		String dirOldName = dirReplace+"\\"+folderName;
		String dirNewName = dirReplace+"\\"+"Copy_"+String.valueOf(folderID)+"_"+folderName;
		//查看是否有此文件夹存在，即是否是打开过的组合活动或产品组
		String dirNewNameCheck = dirReplace+"\\"+folderName;
		File fileCheck = new File(dirNewNameCheck);
		if(!fileCheck.exists()){return;}
		
		File dirNew = new File(dirNewName);
		dirNew.mkdir();
		
		File projectFile = new File(dirOldName);
		String[] filesName = projectFile.list();
		for(String a:filesName){
			String oldPath = dirOldName+"\\"+a;
			String newPath = dirNewName+"\\"+"Copy_"+String.valueOf(folderID)+"_"+folderName+flag;
			try  {  
		           int  bytesum  =  0;  
		           int  byteread  =  0;  
		           File  oldfile  =  new  File(oldPath);  
		           if  (oldfile.exists())  {  //文件存在时  
		               InputStream  inStream  =  new  FileInputStream(oldPath);  //读入原文件  
		               FileOutputStream  fs  =  new  FileOutputStream(newPath);  
		               byte[]  buffer  =  new  byte[1444];  
		               int  length;  
		               while  (  (byteread  =  inStream.read(buffer))  !=  -1)  {  
		                   bytesum  +=  byteread;  //字节数  文件大小  
		           //        System.out.println(bytesum);  
		                   fs.write(buffer,  0,  byteread);  
		               }  
		               inStream.close();  
		           }
		           
		       }  
		       catch  (Exception  e)  {  
		           System.out.println("复制操作出错");  
		           e.printStackTrace(); 
		           } 
		       }
		
	}
	  
    protected IUndoContext getUndoContext() {
        IWorkbenchPart part = getWorkbenchPart();

        if (part != null) {
            return (IUndoContext) part.getAdapter(IUndoContext.class);
        }
        return null;
    }
    protected CompositeCommand createCompositeCommand(List commands) {
        assert null != commands;
        
        CompositeCommand result = new CompositeCommand(getLabel(), commands);
        IUndoContext undoContext = getUndoContext();
        
        if (undoContext != null) {
            result.addContext(undoContext);
        }
        return result;
    }
	protected IGlobalActionContext createContext() {
		/* Create the global action context */
		return new GlobalActionContext(getWorkbenchPart(), getSelection(),
			getLabel(), getActionId());
	}
	public String getActionId() {
		return GlobalActionId.PASTE;
	}
	private List getGlobalActionHandlerData(ITextSelection selection) {
		assert null != selection;

		/* Get the element type */
		Class clazz = selection.getClass();

		/* Create a unique list of element types */
		ArrayList listOfElementTypes = new ArrayList();
		listOfElementTypes.add(clazz);

		/* Get the global action handler for unique element types */
		return getGlobalActionHandlerData(listOfElementTypes);
	}
	private List getGlobalActionHandlerData(IStructuredSelection selection) {
		assert null != selection;

		/* Create a unique list of element types */
		ArrayList listOfElementTypes = new ArrayList();

		if (selection.isEmpty()) {
			// Use the NullElementType to signify that global action handlers
			// should be found that provide regardless of the selected types.
			listOfElementTypes.add(IGlobalActionHandlerProvider.NullElementType.class);

		} else {
			/* Get the selection as an object array */
			Object[] array = selection.toArray();

			for (int i = 0; i < array.length; i++) {
				if (!listOfElementTypes.contains(array[i].getClass())) {
					listOfElementTypes.add(array[i].getClass());
				}
			}
		}

		/* Get the global action handler for unique element types */
		return getGlobalActionHandlerData(listOfElementTypes);
	}
	private List getGlobalActionHandlerData(List listOfElementTypes) {
		assert null != listOfElementTypes;

		/* Get the global action handler for unique element types */
		ArrayList listOfHandlers = new ArrayList();
		Iterator iterator = listOfElementTypes.iterator();
		while (iterator.hasNext()) {
			/* Get the element type */
			Class clazz = (Class) iterator.next();

			/* Create the global action handler context */
			GlobalActionHandlerContext context = new GlobalActionHandlerContext(
				getWorkbenchPart(), getActionId(), clazz, false);

			/* Get the handler */
			IGlobalActionHandler handler = GlobalActionHandlerService
				.getInstance().getGlobalActionHandler(context);

			/* Get a compatible one if no handler is found for a direct match */
			if (handler == null) {
				/* Create the global action handler context */
				context = new GlobalActionHandlerContext(getWorkbenchPart(),
					getActionId(), clazz, true);

				/* Get the handler */
				handler = GlobalActionHandlerService.getInstance()
					.getGlobalActionHandler(context);
			}

			/* Add to the list */
			if (handler != null && !listOfHandlers.contains(handler)) {
				listOfHandlers.add(handler);
			}
		}

		/* Create the global action handler data and add it to the list */
		ArrayList handlerData = new ArrayList();
		IGlobalActionContext actionContext = createContext();
		for (int i = 0; i < listOfHandlers.size(); i++) {
			/* Get the next handler */
			IGlobalActionHandler handler = (IGlobalActionHandler) listOfHandlers
				.get(i);

			/* Create the global action handler data */
			handlerData
				.add(new GlobalActionHandlerData(handler, actionContext));
		}

		/* Return the handler data */
		return handlerData;
	}
	protected List getGlobalActionHandlerData() {
		/* Check if the selection is a text selection */
		if (getSelection() instanceof ITextSelection) {
			return getGlobalActionHandlerData((ITextSelection) getSelection());
		} else if (getSelection() instanceof IStructuredSelection) {
			return getGlobalActionHandlerData((IStructuredSelection) getSelection());
		}

		return new ArrayList();
	}
    
	protected void doRun(IProgressMonitor progressMonitor){
		
		int nodeLen = itemEditpartArray.size();
		if(nodeLen==0){
			MessageDialog.openInformation(null, "错误提示", "请先进行复制操作！");
		}
		else{
        IDiagramEditDomain editingDomain = itemEditpartArray.get(0).getDiagramEditDomain();
		for(int j=0;j<nodeLen;j++){
			if(creatFileFlag.get(j)==1){
				copyFiles(itemEditpartArray.get(j));
				}
			}
		
        Vector list = new Vector();

		/* Get the handler data */
		List handlerInfo = getGlobalActionHandlerData();
		for (Iterator i = handlerInfo.iterator(); i.hasNext();) {
			/* get the next element */
			GlobalActionHandlerData data = (GlobalActionHandlerData) i.next();

			/* Get the command */
			ICommand command = data.getHandler().getCommand(data.getContext());
			if (command != null) {
				list.addElement(command);
			}
		}

		if (list.size() <= 0) {
			return;
		}

		/* Create the composite operation */
		IUndoableOperation operation = createCompositeCommand(list).reduce();
        try {
            IStatus status = getOperationHistory()
                .execute(operation, progressMonitor, null);
            
    		if (!status.isOK()) {
    			/* log status error */
    			Log.log(CommonUIActionPlugin.getDefault(), status);
    		}
        } catch (ExecutionException e) {
            Trace.catching(CommonUIActionPlugin.getDefault(),
                CommonUIActionDebugOptions.EXCEPTIONS_CATCHING, getClass(),
                "doRun", e); //$NON-NLS-1$
            Log.error(CommonUIActionPlugin.getDefault(),
                CommonUIActionStatusCodes.ACTION_FAILURE, e
                    .getLocalizedMessage(), e);
        }
        

			
		} 
		}


	public class Paste extends Action{
		public Paste(){
			setId("paste");
			setActionDefinitionId("wzy.diagram.ccpu.popup.actions.PasteNewAction");
		}
		public void runWithEvent(Event event) {
			System.out.println("heheheheheh");
		}
	}
}






