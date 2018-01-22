package newpmbe.process.diagram.comActRefresher;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import newpmbe.process.diagram.part.NewPMBEDiagramEditor;
import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

import vpml.processpackage.EMPCompActivity;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;


public class CompActivityRefresher {
	private static boolean isEnabled=true;
	private static CompActivityRefresher _instance;
	private static Map<EMPCompActivity, IFile> compAct2File;
	private IWorkbenchPage activePage= PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
	private CompActivityRefresher(){
		compAct2File = new HashMap<EMPCompActivity, IFile>();
//		Set definedActivities = new HashSet(PlatformUI.getWorkbench().getActivitySupport().getActivityManager().getDefinedActivityIds());
//		// alter the set by adding or removing activity ids
//		PlatformUI.getWorkbench().getActivitySupport().setEnabledActivityIds(definedActivities);
//		IPluginContribution contribution;
//		WorkbenchActivityHelper helper;
	}
	public static CompActivityRefresher getInstance(){
		if(_instance == null)
			_instance = new CompActivityRefresher();
		return _instance;
	}
	
	public void doAction(IFile filex ) {
		if(isEnabled){
			IFile file=null;
			try{ file=findFatherDiagramFile(filex);}catch(Exception e)
			{
				e.printStackTrace();
			}
		
			if (file!=null){
				NewPMBEDiagramEditor editor = 
					(NewPMBEDiagramEditor)activePage.findEditor(new FileEditorInput(file));
				if(editor!=null){
					ReOpenEditor(editor,file);
				}
			}
		//
			IContainer container=filex.getParent();
//		container.get
//		container.getFolder(path)
			ArrayList<IFile> list=null;
			try{  list = findAllSubFiles(container);}catch(Exception e)
			{
				e.printStackTrace();
			}
			//hzg add 如果list为null，则list.size()会导致异常
			int listSize=0;	
		try{listSize=list.size();}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//end
			for(int i = 0; i < listSize; i++){
//				filex.get
				if(list.get(i).getName()!=filex.getName()){
					NewPMBEDiagramEditor editor = 
						(NewPMBEDiagramEditor)activePage.findEditor(new FileEditorInput(list.get(i)));
					if(editor!=null){
						try{
							ReOpenEditor(editor,list.get(i));}
						catch(Exception e){
							e.printStackTrace();
						}
					}
				}
			}
		}
//		EditPart tempEditPart =editor.getDiagramEditPart();
//		tempEditPart.refresh();
		
		// TODO Auto-generated method stub
//		Object feature = notification.getFeature();
//		Object notifier = notification.getNotifier();
//		boolean openFlag = false;
//		
//		if(notifier instanceof EMPCompActivity && feature instanceof EAttributeImpl){
//			String name = ((EAttributeImpl)feature).getName();
//			if(name.equals("name")){
//				EMPCompActivity activity = (EMPCompActivity)notifier;
////				IFile file = compAct2File.get(activity);
//				String newValue = notification.getNewStringValue();
//				String oldValue = notification.getOldStringValue();
////				IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
////				.getWorkbench().getActiveWorkbenchWindow();
//				IWorkbenchPage activePage = getActivePage();
//				IFile file = searchFileFromProject(activity, oldValue);
//				if(file == null)
//					return;
//				NewPMBEDiagramEditor activeEditor = (NewPMBEDiagramEditor)activePage.getActiveEditor();
//				
//				IPath path = file.getFullPath();
//				path = path.removeLastSegments(1);
//				IPath folderPath = new Path(path.toString());
//				folderPath = folderPath.removeLastSegments(1);
//				folderPath = folderPath.append(newValue);
//				try {
//					IContainer folder = file.getParent();
//					IContainer parentContainer = folder.getParent();
//					NewPMBEDiagramEditor editor = (NewPMBEDiagramEditor)activePage.findEditor(new FileEditorInput(file));
//					
//					//需要从folder文件夹开始，递归的查找到所有打开的Editors
////					Object[] editors = findAllNeedReOpenEditors(folder, activePage);
//					
//					//获得未改名称前源文件的路径
//					Object[] paths = findAllNeedReOpenPaths(folder, activePage);
//					//移动后的文件
//					List<IFile> newFiles = new ArrayList<IFile>();
//					int startSegment = parentContainer.getFullPath().segmentCount();
//					for(int i = 0; i < paths.length; i++){
//						IPath tempPath = (IPath)paths[i];
//						int segmentCount = tempPath.segmentCount();
//						IPath tailPath = tempPath.removeFirstSegments(startSegment + 1);
//						IPath headPath = tempPath.removeLastSegments(segmentCount - startSegment);
//						headPath = headPath.append(newValue);
//						headPath = headPath.append(tailPath);
//						String[] segments = headPath.segments();
//						IContainer tempContainer = parentContainer;
//						int segIndex;
//						for(segIndex = startSegment; segIndex < segmentCount - 1; segIndex++){
//							tempContainer = tempContainer.getFolder(new Path(segments[segIndex]));
//						}
//						IFile tempFile = tempContainer.getFile(new Path(segments[segIndex]));
//						newFiles.add(tempFile);
//					}
//					
//					IFile newFile = parentContainer.getFolder(new Path(newValue)).getFile(new Path(newValue+".process_diagram"));
//					if(editor != null){
//						openFlag = true;
//						if(editor.isDirty()){
//							boolean confirm = MessageDialog.openConfirm(null, "警告", "子活动已经被修改，要保存修改的子活动吗？");
//							if(confirm){
//								editor.close(true);
//							}
//							else return;
//						}
//						else{
//							editor.close(true);
//						}
//					}
//					file.move(path.append(newValue+".process_diagram"), true, null);
//					folder.move(folderPath, true, null);
//					if(openFlag){
////						editor.setInput(new FileEditorInput(newFile));
//						IDE.openEditor(activePage, newFile);
//						Iterator<IFile> iter = newFiles.iterator();
//						while(iter.hasNext()){
//							IDE.openEditor(activePage, iter.next());
//						}
//						activePage.bringToTop(activeEditor);
//					}
//					compAct2File.put((EMPCompActivity)notifier, newFile);
////					NewPMBENavigatorContentProvider.getViewer().refresh();
//				} catch (CoreException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
	}
	public IFile searchFileFromProject(EMPCompActivity compActivity, String name){
		IWorkbenchPage activePage = getActivePage();
		if(activePage == null)
			return null;
		NewPMBEDiagramEditor activeEditor = (NewPMBEDiagramEditor)activePage.getActiveEditor();
		IFile file = compAct2File.get(compActivity);
		if(file != null)
			return file;
		if(file == null || !file.exists()){
			//这个file是组合活动对应的File
			IEditorInput editorInput = activeEditor.getEditorInput();
			IFile parentFile = ((IFileEditorInput)editorInput).getFile();
			if(name != null){
				file = parentFile.getParent().getFolder(new Path(name)).getFile(new Path(name+".process_diagram"));
			}
			else{
				return null;
			}
			//如果该文件存在，则将其加入compAct2FileMap
			if(file.exists()){
				compAct2File.put(compActivity, file);
				return file;
			}
		}
		return null;
	}
	public Map<EMPCompActivity, IFile> getComp2FileMap(){
		return compAct2File;
	}
	/**
	 * 递归查找所有位于当前工作目录下的.process_diagram文件，并将保存这些文件的列表返回
	 * @param folder
	 * @return 记录.process_diagram文件的列表
	 */
	public ArrayList<IFile> findAllSubFiles(IContainer folder){
		ArrayList<IFile> list = new ArrayList<IFile>();
		try {
			IResource[] resources = folder.members();
			for(int i = 0; i < resources.length; i++){
				if(resources[i] instanceof IContainer){
					IContainer container = (IContainer)resources[i];
					ArrayList<IFile> fileLists = findAllSubFiles(container);
					list.addAll(fileLists);
				}
				else if(resources[i] instanceof IFile){
					IFile file = (IFile)resources[i];
					if(file.getFileExtension().equals("process_diagram"))
						list.add(file);
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * 递归查找所有位于当前工作目录下的.process_diagram文件，并将保存这些文件的列表返回
	 * @param folder
	 * @return 记录.process_diagram文件的列表
	 */
	public ArrayList<IFile> findAllSupFiles(IContainer folder){
		ArrayList<IFile> list = new ArrayList<IFile>();
		try {
			IResource[] resources = folder.members();
			for(int i = 0; i < resources.length; i++){
				if(resources[i] instanceof IContainer){
					IContainer container = (IContainer)resources[i];
					ArrayList<IFile> fileLists = findAllSubFiles(container);
					list.addAll(fileLists);
				}
				else if(resources[i] instanceof IFile){
					IFile file = (IFile)resources[i];
					if(file.getFileExtension().equals("process_diagram"))
						list.add(file);
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * 查找所有需要重新打开的编辑器文件路径（不包括当前编辑器文件的路径）
	 * @param folder 当前改变名称的活动对应的编辑器文件的父文件夹
	 * @param page 当前的工作台页面
	 * @return 所有需要重新打开的编辑器文件路径
	 * @author zhangpeng
	 */
	public Object[] findAllNeedReOpenPaths(IContainer folder, IWorkbenchPage page){
		ArrayList<IFile> list = findAllSubFiles(folder);
//		ArrayList<NewPMBEDiagramEditor> editors = new ArrayList<NewPMBEDiagramEditor>();
		ArrayList<IPath> paths = new ArrayList<IPath>();
		for(int i = 0; i < list.size(); i++){
			NewPMBEDiagramEditor editor = 
				(NewPMBEDiagramEditor)page.findEditor(new FileEditorInput(list.get(i)));
			//编辑器处于打开状态
			if(editor != null){
				//关闭编辑器
				editor.close(true);
				//保存原文件的路径
				if(!list.get(i).getParent().equals(folder)){
				paths.add(list.get(i).getFullPath());
				}
			}
		}
		return paths.toArray();
	}
	public IFile findFatherDiagramFile(IFile childfile){
		IFile file=null;
		try{
		IPath parentPath= childfile.getParent().getParent().getFullPath();
		IContainer parentContainer= childfile.getParent().getParent();
		 file= parentContainer.getFile(new Path(parentPath+"_diagram"));}
		catch(Exception e){
			e.printStackTrace();
		}
		
//	file= parentContainer.getFile(new Path(parentPath+"_diagram"));
//	IFile file2 = file.getParent().getFolder(new Path(name)).getFile(new Path(name+".process_diagram"));
//	childFile.getParent().getFullPath();
	   return file;
	}
	public IFile findChildDiagramFile(IFile fatherFile){
		IPath parentPath= fatherFile.getParent().getParent().getFullPath();
		IContainer parentContainer= fatherFile.getParent().getParent();
		IFile file= parentContainer.getFile(new Path(parentPath+"_diagram"));
//	file= parentContainer.getFile(new Path(parentPath+"_diagram"));
//	IFile file2 = file.getParent().getFolder(new Path(name)).getFile(new Path(name+".process_diagram"));
//	childFile.getParent().getFullPath();
	   return file;
	}
	public void closeEditors(IContainer folder){
		ArrayList<IFile> list = findAllSubFiles(folder);
		for(int i = 0; i < list.size(); i++){
			NewPMBEDiagramEditor editor = 
				(NewPMBEDiagramEditor)getActivePage().findEditor(new FileEditorInput(list.get(i)));
			//编辑器处于打开状态
			if(editor != null){
				//关闭编辑器
				editor.close(true);
			}
		}
	}
	private IWorkbenchPage getActivePage(){
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		return activePage;
	}
	
	private void ReOpenEditor(IEditorPart editor,IFile file){
		NewPMBEDiagramEditor activeEditor = (NewPMBEDiagramEditor)activePage.getActiveEditor();
		activePage.closeEditor(editor, false);
//		editor.close(true);
//		activePage.closeAllEditors(true);
//		IFile file=(IFile)path1;
	
		try {
			
			IDE.openEditor(activePage, file);
//			IDE.openEditor(activePage, childFile);
			activePage.bringToTop(activeEditor);
//			MessageDialog.openError(null, "title", "message");
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void setEnabled(){
		isEnabled=true;
	}
	
	public static void disEnabled(){
		isEnabled=false;
	}
}
