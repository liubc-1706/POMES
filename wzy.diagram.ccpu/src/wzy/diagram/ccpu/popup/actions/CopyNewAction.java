package wzy.diagram.ccpu.popup.actions;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import newpmbe.organization.diagram.edit.parts.EMODiagramEditPart;
import newpmbe.organization.diagram.edit.parts.EMRRoleEditPart;
import newpmbe.process.diagram.edit.parts.EMPCompActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPDiagramEditPart;
import newpmbe.process.diagram.edit.parts.EMPProductPackageEditPart;
import newpmbe.product.diagram.part.NewPMBEDiagramEditorPlugin;
import newpmbe.product.diagram.part.NewPMBEDiagramEditorUtil;
import newpmbe.resource.diagram.edit.parts.EMRDiagramEditPart;
//import newpmbe.product.diagram.part.NewPMBEDiagramFileCreator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IKeyBindingService;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.*;//.DiagramDocumentEditor;
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
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SemanticCreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;

import vpml.processpackage.impl.EMPCompActivityImpl;
import vpml.processpackage.impl.EMPProductPackageImpl;
import wzy.diagram.ccpu.popup.actions.PasteNewAction.Paste;

public class CopyNewAction extends AbstractActionDelegate implements IObjectActionDelegate{
   
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
		return GlobalActionId.COPY;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
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
	@SuppressWarnings({ "rawtypes", "unchecked", "restriction" })
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
	@SuppressWarnings("rawtypes")
	protected List getGlobalActionHandlerData() {
		/* Check if the selection is a text selection */
		if (getSelection() instanceof ITextSelection) {
			return getGlobalActionHandlerData((ITextSelection) getSelection());
		} else if (getSelection() instanceof IStructuredSelection) {
			return getGlobalActionHandlerData((IStructuredSelection) getSelection());
		}

		return new ArrayList();
	}
	
	protected void doRun(IProgressMonitor progressMonitor) {
		
		PasteNewAction.itemEditpartArray.clear();
		PasteNewAction.creatFileFlag.clear();
		
		IStructuredSelection structuredSelection = getStructuredSelection();
		Object[] selectionArray = structuredSelection.toArray();
		
		EditPart host = null;	
		
		for(int i = 0;i < selectionArray.length; i++){
			if(selectionArray[i] instanceof ShapeNodeEditPart){
				host = ((ShapeNodeEditPart)selectionArray[i]).getParent();
				break;
			}
		}
		
		if((selectionArray.length == 1)&&((selectionArray[0] instanceof EMPDiagramEditPart)||(selectionArray[0] instanceof EMODiagramEditPart)||(selectionArray[0] instanceof EMRDiagramEditPart))){
			MessageDialog.openInformation(null, "错误提示", "请选择要复制的元素！");
		}
		else if( (selectionArray.length == 1) && (selectionArray[0] instanceof ConnectionNodeEditPart)){
			MessageDialog.openInformation(null, "错误提示", "请整体复制！");
		}
	else
	{
		
		boolean flag = false;
		boolean copy = false;
		for(int i = 0;i < selectionArray.length; i++){
			if((selectionArray[i] instanceof newpmbe.organization.diagram.edit.parts.EMRRoleEditPart) || (selectionArray[i] instanceof newpmbe.process.diagram.edit.parts.EMRRoleEditPart)
				|| selectionArray[i] instanceof newpmbe.process.diagram.edit.parts.EMRLocationTypeEditPart
				|| selectionArray[i] instanceof newpmbe.process.diagram.edit.parts.EMOResourceGroupTypeEditPart
				|| selectionArray[i] instanceof newpmbe.process.diagram.edit.parts.EMRToolTypeEditPart
				|| selectionArray[i] instanceof newpmbe.process.diagram.edit.parts.EMRMachineTypeEditPart){
				flag = true;
				break;
			}
		}
	//	if(flag){
	//		copy = MessageDialog.openConfirm(null, "复制提示", "要复制的元素中包括角色、场所、资源组、工具和中的一个或几个，他们将不被复制，是否继续？");
	//	}		
		if(flag){
			if(host instanceof EMODiagramEditPart){
				MessageDialog.openInformation(null, "错误提示", "请不要复制角色！");
			}
			else{
				MessageDialog.openInformation(null, "错误提示", "选中的元素中包括角色、场所、资源组、工具中的一个或几个，不允许复制！");
			}
			}
		
	//	if((flag == true && copy == true)||(flag == false)){
		else{
		for(int i=0;i<structuredSelection.size();i++){//对每个选中的元素进行判断	
			IGraphicalEditPart edipartNow = (IGraphicalEditPart)selectionArray[i];
			PasteNewAction.itemEditpartArray.add(edipartNow);
			
			if((selectionArray[i] instanceof EMPProductPackageEditPart) || (selectionArray[i] instanceof EMPCompActivityEditPart)){
				PasteNewAction.creatFileFlag.add(1);							
			}
			else{
				PasteNewAction.creatFileFlag.add(0);
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

}
}








