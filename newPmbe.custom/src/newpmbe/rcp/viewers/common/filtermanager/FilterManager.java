package newpmbe.rcp.viewers.common.filtermanager;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;


public class FilterManager implements ISelectionListener{
	private IWorkbenchPage activePage;
	private ViewerFilter lastFilter = null;
	private IWorkbenchPart lastPart = null;
	
	
	private static FilterManager filterManager = null;
	private IFile currentFile;
	
	private FilterManager(){
		if(getActivePage()!= null){
			activePage.addSelectionListener(this);
		}
		currentFile = null;
	}
	public void init(){
		IEditorPart editor = activePage.getActiveEditor();
		if(editor != null && editor instanceof DiagramDocumentEditor){
			IFileEditorInput input = (IFileEditorInput)((DiagramDocumentEditor)editor).getEditorInput();
			currentFile = input.getFile();
		}
			CommonViewer viewer = getViewer();
			if(viewer!= null){
				lastFilter = new OlyCurrentProcessProjectFilter();
				//viewer.addFilter(new NavigationGropFilter());
				viewer.setInput(ResourcesPlugin.getWorkspace().getRoot());
				
				//viewer.addFilter(lastFilter);   show all models in the navigator. --- by fan
		}
	}
	public static FilterManager getInstance(){
		if(filterManager == null)
			filterManager = new FilterManager();
		return filterManager;
	}
	public CommonViewer getViewer() {
		IViewPart part = getActivePage().findView("org.eclipse.ui.navigator.ProjectExplorer");
		if(part == null)
			return null;
		CommonNavigator navigator = (CommonNavigator)part;
		return navigator.getCommonViewer();
	}
	public IWorkbenchPage getActivePage(){
		if(activePage == null){
			activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		}
		return activePage;
	}
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		//如果是选择了Editor
		if(lastPart != null && lastPart.equals(part))
			//如果窗口未打开
				return;
		lastPart = part;
		CommonViewer viewer = getViewer();
		if(part instanceof CommonNavigator){
			IEditorPart editorPart = activePage.getActiveEditor();
			if(activePage != null && editorPart != null){
				if(!(editorPart instanceof DiagramDocumentEditor)){
					return;
				}
				DiagramDocumentEditor editor = (DiagramDocumentEditor)editorPart;
				
				IFileEditorInput input = (IFileEditorInput)editor.getEditorInput();
				IFile newFile = input.getFile();
				if(currentFile.getProject().equals(newFile.getProject())){
					return;
				}
				currentFile = newFile;
				
				if(viewer!= null){
					viewer.refresh();
					viewer.expandToLevel(3);
				}
			}
		}
		else if(part instanceof DiagramDocumentEditor){
			DiagramDocumentEditor editor = (DiagramDocumentEditor)part;
	
			IFileEditorInput input = (IFileEditorInput)editor.getEditorInput();
			IFile newFile = input.getFile();
			if(currentFile != null && currentFile.getProject().equals(newFile.getProject())){
				return;
			}
			currentFile = newFile;
			if(viewer!= null){
				viewer.refresh();
				viewer.expandToLevel(3);
			}
		}
	}
	public IProject getCurrentProject(){
		if(currentFile != null)
			return currentFile.getProject();
		return null;
	}
}
