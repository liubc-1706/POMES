package newpmbe.process.validator;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;
import newpmbe.validator.Problem;
import newpmbe.validator.Problems;
import newpmbe.validator.Warning;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.*;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class ProblemsView extends ViewPart {
	
	private Composite upComposite;
	private TreeViewer viewer;
	public Text text;
	private Action doubleClickAction;

	/*
	 * The content provider class is responsible for
	 * providing objects to the view. It can wrap
	 * existing objects in adapters or simply return
	 * objects as-is. These objects may be sensitive
	 * to the current input of the view, or ignore
	 * it and always show the same content 
	 * (like Task List, for example).
	 */
	 
	class MyTreeContentProvider implements ITreeContentProvider {
		public Object[] getChildren(Object parentElement) {
			
			if(parentElement instanceof Problems){
				List list=((Problems)parentElement).getProblemList();
				if(list==null||list.isEmpty()){
					return new Object[0];
				}
				else
					return list.toArray();
			}
			
			return new Object[0];            
        }

        public Object getParent(Object element) {
        	return null;
        }

        public boolean hasChildren(Object element) {
            if(element instanceof Problems){
            	if(((Problems)element).getNumber()>0)
            		return true;
            	else
            		return false;
            }
            else
            	return false;
        }

        public Object[] getElements(Object inputElement) {
        	if(inputElement instanceof List){
    			return ((List)inputElement).toArray();
    		}
    		return new Object[0];
        }

        public void dispose() {
            
        }

        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
            
        }

	}
	
	
	class MyTableLableProvider implements ITableLabelProvider{

        public Image getColumnImage(Object element, int columnIndex) {
        	if(columnIndex==0){
        		if(element instanceof Problems){
        			ImageDescriptor image = 
        	            AbstractUIPlugin.imageDescriptorFromPlugin("newPmbe.validator" , 
        	                    "icons/gifi.gif") ;
        			return PlatformUI.getWorkbench().getSharedImages().getImage( ISharedImages.IMG_TOOL_REDO);
        		}
        		else if(element instanceof newpmbe.validator.Error)
        			return PlatformUI.getWorkbench().getSharedImages().getImage( ISharedImages.IMG_OBJS_ERROR_TSK);
        		else if(element instanceof newpmbe.validator.Warning){
        			return PlatformUI.getWorkbench().getSharedImages().getImage( ISharedImages.IMG_OBJS_WARN_TSK);
        		}
        	}
        	return null;
        }

        public String getColumnText(Object element, int columnIndex) {
        	if(element instanceof Problems){
        		Problems problems=(Problems)element;
        		switch(columnIndex){
        			case 0:{
        				if(problems.getType().equals(Problems.TYPE_ACTIVITY))
        					return "【活动】"+"("+problems.getNumber()+")";
        				if(problems.getType().equals(Problems.TYPE_PRODUCT))
        					return "【产品】"+"("+problems.getNumber()+")";
        				if(problems.getType().equals(Problems.TYPE_CONDITIONAL))
        					return "【逻辑连接符】"+"("+problems.getNumber()+")";
        				if(problems.getType().equals(Problems.TYPE_RESOURCE))
        					return "【资源】"+"("+problems.getNumber()+")";
        				if(problems.getType().equals(Problems.TYPE_OTHER))
        					return "【其他】"+"("+problems.getNumber()+")";
        			}
        			case 1:
        				return "";
        			case 2:
        				return "";
        			default:
        				return "";
        		}
        	}
        	else if(element instanceof Problem){
        		Problem problem=(Problem)element;
        		switch(columnIndex){
            		case 0:{
            			if(problem.getName()==null)
            				return problem.getDescription();
            			return problem.getName()+": "+problem.getDescription();
            		}
            		case 1:
            			if(problem.getResource().endsWith("/")){
            				if(problem.getName()==null)
            					return problem.getResource();
            				return problem.getResource()+"/"+problem.getName();
            			}
            			else{
            				if(problem.getName()==null)
            					return problem.getResource();
            				return problem.getResource().replaceAll("//", "/")+"//"+problem.getName();
            			}
            			/*case 2:
            			return problem.getPath().toString();*/
            		default:
            			return "";
        		}
            }
        	else
        		return "";
        	
        }

        public void addListener(ILabelProviderListener listener) {
            
        }

        public void dispose() {
            
        }

        public boolean isLabelProperty(Object element, String property) {
            return false;
        }

        public void removeListener(ILabelProviderListener listener) {
            
        }
        
    }


	
	
	class NameSorter extends ViewerSorter {
		
		public int category(Object element)
		  {
		    if(element instanceof newpmbe.validator.Error)
		    	return 0;
		    if(element instanceof Warning)
		    	return 1;
		    return 1;
		  }

		@Override
		public int compare(Viewer viewer, Object e1, Object e2) {
			// TODO Auto-generated method stub
			if(e1 instanceof newpmbe.validator.Error
					&& e2 instanceof Warning){
				return 1;
			}
			if(e1 instanceof Warning &&
					e2 instanceof newpmbe.validator.Error)
				return -1;
				
			return 0;
		}
		

	}

	/**
	 * The constructor.
	 */
	public ProblemsView() {
	}

	
	/**
	public List getList(){
		List problems=new ArrayList();
		newpmbe.validator.Error error1=new newpmbe.validator.Error();
		error1.description="error1";
		error1.resource="fan.test";
		//error1.path="fiefef";
		
		newpmbe.validator.Error error2=new newpmbe.validator.Error();
		error2.description="error2";
		error2.resource="fan.test";
		//error2.path="fiefef";
		
		newpmbe.validator.Error error3=new newpmbe.validator.Error();
		error3.description="error3";
		error3.resource="fan.test";
		//error3.path="fiefef";
		
		problems.add(error1);
		problems.add(error2);
		problems.add(error3);
		
		Problems errors=new Problems();
		errors.setProblemList(problems);
		errors.setType(Problems.TYPE_ERROR);
		
		
		List problems2=new ArrayList();
		newpmbe.validator.Warning warning1=new newpmbe.validator.Warning();
		warning1.description="warning1";
		warning1.resource="fan.test";
		//warning1.path="fiefef";
		
		newpmbe.validator.Warning warning2=new newpmbe.validator.Warning();
		warning2.description="warning2";
		warning2.resource="fan.test";
	//	warning2.path="fiefef";
		
		newpmbe.validator.Warning warning3=new newpmbe.validator.Warning();
		warning3.description="error3";
		warning3.resource="fan.test";
		//warning3.path="fiefef";
		
		problems2.add(warning1);
		problems2.add(warning2);
		problems2.add(warning3);
		
		Problems warnings=new Problems();
		warnings.setProblemList(problems2);
		warnings.setType(Problems.TYPE_WARNING);
		
		
		List list=new ArrayList();
		list.add(warnings);
		list.add(errors);
		
		
		
		
		
		return list;
	}*/
	
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		GridLayout gridLayout=new GridLayout();
		parent.setLayout(gridLayout);
		GridData gridData=new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.verticalSpan=4;
		text=new Text(parent,SWT.BORDER);
		text.setLayoutData(gridData);
		//text.setSize(100, 20);
		text.setEditable(false);
		GridData gridData2=new GridData(GridData.FILL_BOTH);
		//treeComposite=new Composite(parent,SWT.NONE);
		//treeComposite.setLayoutData(gridData2);
		viewer = new TreeViewer(parent,SWT.FULL_SELECTION | SWT.BORDER);
		viewer.getTree().setLayoutData(gridData2);
		viewer.getTree().setHeaderVisible(true);
		
		
		TreeColumn column=new TreeColumn(viewer.getTree(),SWT.LEFT);
		column.setText("问题描述");
		column.setWidth(400);
	
		column=new TreeColumn(viewer.getTree(),SWT.LEFT);
		column.setText("问题路径");
		column.setWidth(500);
		
		viewer.setContentProvider(new MyTreeContentProvider());
		viewer.setLabelProvider(new MyTableLableProvider());
		viewer.setSorter(new NameSorter());
		
		
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				ProblemsView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(new Separator());
	}

	private void fillContextMenu(IMenuManager manager) {
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
	}

	private void makeActions() {
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
			
				if(obj instanceof newpmbe.validator.Problem){
					String filePath=((Problem)obj).getPath().toString();
					openDiagram(((Problem)obj).getPath());
					String id=((Problem)obj).getID();
					if(id!=null)
						elementLocate(id);
					System.out.println(filePath);
				}
				
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"完整性检查报告",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}



	public TreeViewer getViewer() {
		return viewer;
	}



	public void setViewer(TreeViewer viewer) {
		this.viewer = viewer;
	}
	
	
	
	/**
	 * 打开指定的diagram文件
	 * @param filePath：文件的路径
	 */
	public void openDiagram(IPath filePath){
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		IEditorPart editorParts[] = activePage.getEditors();
		
		for (int i = 0; i < editorParts.length; i++) {
			//if (editorParts[i].getTitle().equals(filePath)) {  //注意判断条件，Editors可能有相同名字。跟AcitiveEditor属同一个工程的才能打开！
			IEditorInput input = editorParts[i].getEditorInput();
			IFile file = ((IFileEditorInput)input).getFile();
			if(filePath.equals(file.getFullPath())){//判断路径是否相同
				activePage.bringToTop(editorParts[i]);
				return;
			}
		}
		
		//如果diagram文件未被打开，则打开文件
		IFile diagramFile=ResourcesPlugin.getWorkspace().getRoot().
											getFile(filePath);
		if(diagramFile != null){
			try {
				IDE.openEditor(activePage, diagramFile);
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
	
	
	public void elementLocate(String elementID){
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		DiagramDocumentEditor currentDiagramEditor=(DiagramDocumentEditor)activePage.getActiveEditor();
		
		List editParts=currentDiagramEditor.getDiagramEditPart().getChildren();
		for(int i=0;i<editParts.size();i++){
			GraphicalEditPart editPart=(GraphicalEditPart)editParts.get(i);
			String id=((vpml.impl.EMObjectImpl)((NodeImpl)editPart.getModel()).getElement()).getId();
			if(id!=null&&id.equals(elementID)){
				currentDiagramEditor.getDiagramGraphicalViewer().select(editPart);
				currentDiagramEditor.getDiagramGraphicalViewer().reveal(editPart);
				return;
			}
		}
		
		
	}
	
	
	
}