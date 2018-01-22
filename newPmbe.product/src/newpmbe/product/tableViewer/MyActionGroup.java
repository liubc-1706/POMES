package newpmbe.product.tableViewer;

import java.util.Iterator;


import newpmbe.product.diagram.part.NewPMBEDiagramEditorPlugin;

import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.editor.FileDiagramEditor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionGroup;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.model.WorkbenchContentProvider;

public class MyActionGroup extends ActionGroup {
	
	private TableViewer tv;
	
	public MyActionGroup(TableViewer tableviewer){
		this.tv=tableviewer;
	}
	
	public void fillContextMenu(IMenuManager mgr){
		MenuManager menuManager=(MenuManager)mgr;
		menuManager.add(new OpenAction());
		
		Table table=tv.getTable();
		Menu menu=menuManager.createContextMenu(table);
		table.setMenu(menu);
	}
	
	protected IFile findFileInProject(String project,String filePath){
		ITreeContentProvider myWorkbenchContentProvider = new WorkbenchContentProvider();
		Object[] elements = myWorkbenchContentProvider
				.getElements(ResourcesPlugin.getWorkspace().getRoot());

		for (int j = 0; j < elements.length; j++) {
			if (elements[j] instanceof Project) {
				if ((project != null) && filePath != null) 
				//判断是否在同一个工程
				if (project.equals(((Project) elements[j])
							.getName())){
					IFile file=((Project) elements[j]).getFile(filePath);
					if(file.exists())
						return file;
				}		
			}
		}
		
		return null;
	}
	
	
	/**
	 * 打开指定的文件所对应的图表
	 * @param filePath
	 * @param project
	 */
	public void openDiagram(String filePath,String project){
		filePath+="_diagram";
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		FileDiagramEditor targetDiagramEditor = (FileDiagramEditor)activePage.getActiveEditor();
		IEditorInput activeInput = targetDiagramEditor.getEditorInput();
		IFile activeEditorFile = ((IFileEditorInput)activeInput).getFile();		
		
		IEditorPart editorParts[] = activePage.getEditors();
		boolean IsDiagramExist = false;
		String fileBelongsTo = null;
		//如果两个工程里相同名字的文件被打开，该如何区别
		for (int i = 0; i < editorParts.length; i++) {
			//应该先判断打开的文件所属的的工程是否相同
			if (editorParts[i].getTitle().equals(filePath)) {  //注意判断条件，Editors可能有相同名字。跟AcitiveEditor属同一个工程的才能打开！
				
				IEditorInput input = editorParts[i].getEditorInput();
				IFile file = ((IFileEditorInput)input).getFile();
				fileBelongsTo = file.getFullPath().segment(0);
				
				if(fileBelongsTo.equals(project)){							
					if(file.getProjectRelativePath().toString().equals(filePath)){
						IsDiagramExist = true;
						activePage.bringToTop(editorParts[i]);
						return ;
					}
				}							 
			}
		}
		
		IFile subDiagramFile = findFileInProject(project, filePath);
		if(subDiagramFile != null){
			try {
				IDE.openEditor(activePage, subDiagramFile);
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			return ;
		}
		
	}
	
	//打开产品所属的文件
	public class OpenAction extends Action{
		public OpenAction(){
			this.setText("Open");
		}
		
		public void run(){
			IStructuredSelection s=(IStructuredSelection)tv.getSelection();
			if(s.isEmpty()){
				MessageDialog.openInformation(null,"提示","请先选择");
			}
			else{
				for(Iterator it=s.iterator();it.hasNext();){
					Product product=(Product)it.next();
					String filePath=product.getFile();
					String project=product.getProject();
					openDiagram(filePath,project); //打开图表
				}
				
			}
			
			
		}
		
		
	}
	
}
