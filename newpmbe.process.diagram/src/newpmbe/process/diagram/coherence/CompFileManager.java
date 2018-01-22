package newpmbe.process.diagram.coherence;

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
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

import vpml.processpackage.EMPCompActivity;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;


public class CompFileManager implements NotificationListener{
	private static CompFileManager _instance;
	private static Map<EMPCompActivity, IFile> compAct2File;

	private CompFileManager(){
		compAct2File = new HashMap<EMPCompActivity, IFile>();
//		Set definedActivities = new HashSet(PlatformUI.getWorkbench().getActivitySupport().getActivityManager().getDefinedActivityIds());
//		// alter the set by adding or removing activity ids
//		PlatformUI.getWorkbench().getActivitySupport().setEnabledActivityIds(definedActivities);
//		IPluginContribution contribution;
//		WorkbenchActivityHelper helper;
	}
	public static CompFileManager getInstance(){
		if(_instance == null)
			_instance = new CompFileManager();
		return _instance;
	}

	public void notifyChanged(Notification notification) {
		// TODO Auto-generated method stub
		Object feature = notification.getFeature();
		Object notifier = notification.getNotifier();
		boolean openFlag = false;
		
		if(notifier instanceof EMPCompActivity && feature instanceof EAttributeImpl){
			String name = ((EAttributeImpl)feature).getName();
			if(name.equals("name")){
				EMPCompActivity activity = (EMPCompActivity)notifier;
//				IFile file = compAct2File.get(activity);
				String newValue = notification.getNewStringValue();
				String oldValue = notification.getOldStringValue();
//				IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
//				.getWorkbench().getActiveWorkbenchWindow();
				IWorkbenchPage activePage = getActivePage();
				IFile file = searchFileFromProject(activity, oldValue);
				if(file == null)
					return;
				NewPMBEDiagramEditor activeEditor = (NewPMBEDiagramEditor)activePage.getActiveEditor();
				
				IPath path = file.getFullPath();
				path = path.removeLastSegments(1);
				IPath folderPath = new Path(path.toString());
				folderPath = folderPath.removeLastSegments(1);
				folderPath = folderPath.append(notification.getNewStringValue());
				try {
					IContainer folder = file.getParent();
					IContainer parentContainer = folder.getParent();
					NewPMBEDiagramEditor editor = (NewPMBEDiagramEditor)activePage.findEditor(new FileEditorInput(file));
					
					//��Ҫ��folder�ļ��п�ʼ���ݹ�Ĳ��ҵ����д򿪵�Editors
//					Object[] editors = findAllNeedReOpenEditors(folder, activePage);
					
					//���δ������ǰԴ�ļ���·��
					Object[] paths = findAllNeedReOpenPaths(folder, activePage);
					//�ƶ�����ļ�
					List<IFile> newFiles = new ArrayList<IFile>();
					int startSegment = parentContainer.getFullPath().segmentCount();
					for(int i = 0; i < paths.length; i++){
						IPath tempPath = (IPath)paths[i];
						int segmentCount = tempPath.segmentCount();
						IPath tailPath = tempPath.removeFirstSegments(startSegment + 1);
						IPath headPath = tempPath.removeLastSegments(segmentCount - startSegment);
						headPath = headPath.append(newValue);
						headPath = headPath.append(tailPath);
						String[] segments = headPath.segments();
						IContainer tempContainer = parentContainer;
						int segIndex;
						for(segIndex = startSegment; segIndex < segmentCount - 1; segIndex++){
							tempContainer = tempContainer.getFolder(new Path(segments[segIndex]));
						}
						IFile tempFile = tempContainer.getFile(new Path(segments[segIndex]));
						newFiles.add(tempFile);
					}
					
					IFile newFile = parentContainer.getFolder(new Path(newValue)).getFile(new Path(newValue+".process_diagram"));
					if(editor != null){
						openFlag = true;
						if(editor.isDirty()){
							boolean confirm = MessageDialog.openConfirm(null, "����", "�ӻ�Ѿ����޸ģ�Ҫ�����޸ĵ��ӻ��");
							if(confirm){
								editor.close(true);
							}
							else return;
						}
						else{
							editor.close(true);
						}
					}
					file.move(path.append(newValue+".process_diagram"), true, null);
					folder.move(folderPath, true, null);
					if(openFlag){
//						editor.setInput(new FileEditorInput(newFile));
						IDE.openEditor(activePage, newFile);
						Iterator<IFile> iter = newFiles.iterator();
						while(iter.hasNext()){
							IDE.openEditor(activePage, iter.next());
						}
						activePage.bringToTop(activeEditor);
					}
					compAct2File.put((EMPCompActivity)notifier, newFile);
//					NewPMBENavigatorContentProvider.getViewer().refresh();
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
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
			//���file����ϻ��Ӧ��File
			IEditorInput editorInput = activeEditor.getEditorInput();
			IFile parentFile = ((IFileEditorInput)editorInput).getFile();
			if(name != null){
				file = parentFile.getParent().getFolder(new Path(name)).getFile(new Path(name+".process_diagram"));
			}
			else{
				return null;
			}
			//������ļ����ڣ��������compAct2FileMap
			if(file.exists()){
				compAct2File.put(compActivity, file);
				return file;
			}
		}
		return null;
	}
	public void addNotificationListener(EObject obj){
        TransactionalEditingDomain theEditingDomain = TransactionUtil.getEditingDomain(obj);
        if (theEditingDomain != null) {
            DiagramEventBroker diagramEventBroker = DiagramEventBroker.getInstance(theEditingDomain);
    		diagramEventBroker.addNotificationListener(obj,this);
        }
	}
	public void removeNotificationListener(EObject obj){
        TransactionalEditingDomain theEditingDomain = TransactionUtil.getEditingDomain(obj);
        if (theEditingDomain != null) {
            DiagramEventBroker diagramEventBroker = DiagramEventBroker.getInstance(theEditingDomain);
    		diagramEventBroker.removeNotificationListener(obj,this);
        }
	}
	public void changeFileName(){
		
	}
	public Map<EMPCompActivity, IFile> getComp2FileMap(){
		return compAct2File;
	}
	/**
	 * �ݹ��������λ�ڵ�ǰ����Ŀ¼�µ�.process_diagram�ļ�������������Щ�ļ����б���
	 * @param folder
	 * @return ��¼.process_diagram�ļ����б�
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
	 * ����������Ҫ���´򿪵ı༭���ļ�·������������ǰ�༭���ļ���·����
	 * @param folder ��ǰ�ı����ƵĻ��Ӧ�ı༭���ļ��ĸ��ļ���
	 * @param page ��ǰ�Ĺ���̨ҳ��
	 * @return ������Ҫ���´򿪵ı༭���ļ�·��
	 * @author zhangpeng
	 */
	public Object[] findAllNeedReOpenPaths(IContainer folder, IWorkbenchPage page){
		ArrayList<IFile> list = findAllSubFiles(folder);
//		ArrayList<NewPMBEDiagramEditor> editors = new ArrayList<NewPMBEDiagramEditor>();
		ArrayList<IPath> paths = new ArrayList<IPath>();
		for(int i = 0; i < list.size(); i++){
			NewPMBEDiagramEditor editor = 
				(NewPMBEDiagramEditor)page.findEditor(new FileEditorInput(list.get(i)));
			//�༭�����ڴ�״̬
			if(editor != null){
				//�رձ༭��
				editor.close(true);
				//����ԭ�ļ���·��
				if(!list.get(i).getParent().equals(folder)){
				paths.add(list.get(i).getFullPath());
				}
			}
		}
		return paths.toArray();
	}
	public void closeEditors(IContainer folder){
		ArrayList<IFile> list = findAllSubFiles(folder);
		for(int i = 0; i < list.size(); i++){
			NewPMBEDiagramEditor editor = 
				(NewPMBEDiagramEditor)getActivePage().findEditor(new FileEditorInput(list.get(i)));
			//�༭�����ڴ�״̬
			if(editor != null){
				//�رձ༭��
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
	public void saveActiveEditor(){
		getActivePage().getActiveEditor().doSave(null);
	}
}
