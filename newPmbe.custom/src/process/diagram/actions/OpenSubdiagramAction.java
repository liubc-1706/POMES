package process.diagram.actions;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import newpmbe.process.diagram.coherence.CompFileManager;
import newpmbe.process.diagram.edit.parts.EMPCompActivityEditPart;
import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;
import newpmbe.process.diagram.part.NewPMBEDiagramEditorUtil;

import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.draw2d.LayeredPane;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.properties.Properties;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.requests.ChangePropertyValueRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.emf.ui.properties.commands.SetModelPropertyValueCommand;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.model.WorkbenchContentProvider;

import vpml.EMObject;
import vpml.processpackage.EMPClock;
import vpml.processpackage.EMPClockFlow;
import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPProduct;
import vpml.processpackage.EMPProductPackage;
import vpml.processpackage.impl.EMPActivityImpl;
import vpml.processpackage.impl.EMPClockFlowImpl;
import vpml.processpackage.impl.EMPCompActivityImpl;
import vpml.processpackage.impl.EMPDataFlowImpl;
import vpml.processpackage.impl.EMPRefFlowImpl;

public class OpenSubdiagramAction implements IObjectActionDelegate {

	public final static String ID = "com.my.Process.popup.CreateSubDiagramID"; //$NON-NLS-1$
	/**
	 * HashMap<String, String> ����,��һ��������¼�ϲ�ڵ�,�ڶ���������¼�²�ڵ�.
	 */
	//public static HashMap<String, String> actRelationMap = new HashMap<String, String>();
	
	private EMPCompActivityEditPart selectedElement;
	private IStructuredSelection selection;
	IWorkbenchPage activePageNow = null;
	IDiagramEditDomain dEditingDomain = null;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	
	}

	public void run(IAction action) {
		Command c = getCreateSubDiagramCMD();
		selectedElement.getDiagramEditDomain().getDiagramCommandStack()
				.execute(c);
	}

	public void selectionChanged(IAction action, ISelection selection) {
		selectedElement = null;
		
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof EMPCompActivityEditPart) {
				selectedElement = (EMPCompActivityEditPart) structuredSelection
						.getFirstElement();
			}
		}
	}
	
	public static Object getAdapter(Object adaptable, Class c) {
		if (c.isInstance(adaptable)) {
			return adaptable;
		}
		if (adaptable instanceof IAdaptable) {
			IAdaptable a = (IAdaptable) adaptable;
			Object adapter = a.getAdapter(c);
			if (c.isInstance(adapter)) {
				return adapter;
			}
		}
		return null;
	}
	
	private Object[] getselectedResources(IStructuredSelection selection,
			Class c) {
		return getselectedAdaptables(selection, c);
	}

	private static Object[] getselectedAdaptables(ISelection selection, Class c) {
		ArrayList result = null;
		if (!selection.isEmpty()) {
			result = new ArrayList();
			Iterator elements = ((IStructuredSelection) selection).iterator();
			while (elements.hasNext()) {
				Object adapter = getAdapter(elements.next(), c);
				if (c.isInstance(adapter)) {
					result.add(adapter);
				}
			}
		}
		if (result != null && !result.isEmpty()) {
			return result.toArray((Object[]) Array
					.newInstance(c, result.size()));
		}
		return (Object[]) Array.newInstance(c, 0);
	}
	
	
	/**
	 * * ����������Եõ�current project�� * *
	 * 
	 * @return
	 */
	
	private IProject getProject() {
		IResource[] rs = (IResource[]) getselectedResources(
				(IStructuredSelection) selection, IResource.class);
		IProject project = null;
		for (int i = 0; i < rs.length; i++) {
			IResource r = rs[i];
			if (r.getType() == IResource.PROJECT) {
				project = (IProject) r;
				break;
			}
		}
		return project;
	}
	//
	public String getPath(String path){
		int i;
		i=path.lastIndexOf("/"); //$NON-NLS-1$
		if(i==-1)
			return ""; //$NON-NLS-1$
		else
			return path.substring(0,i);
	}
	
	public IFile getFileFromProject(String projectName,String filePath,String compActName){
		ITreeContentProvider myWorkbenchContentProvider = new WorkbenchContentProvider();
		Object[] elements = myWorkbenchContentProvider
				.getElements(ResourcesPlugin.getWorkspace().getRoot());
		
		for (int j = 0; j < elements.length; j++) {
			if (elements[j] instanceof Project) {
				
				Object[] result = myWorkbenchContentProvider
						.getChildren(elements[j]);
				if ((projectName != null) && compActName != null) 
				//�ж��Ƿ���ͬһ������
				if (projectName.equals(((Project) elements[j]).getName())){
					//IFolder floder=new IFolder()
					
					//�����ͬһ�����̣��ټ����ж��ļ��Ƿ��Ѵ���
					
					IFile file=((Project) elements[j]).getFile(getPath(filePath)+"/"+compActName+"/"+compActName+".process_diagram"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
//					if(file.exists()){
//						return file;
//					}
//					else{
//						IFolder folder=((Project)elements[j]).getFolder(getPath(filePath)+"/"+compActName); //$NON-NLS-1$
//						if(folder.exists()){
//							return null;
//						}
//						else{
//							try{
//								IProgressMonitor monitor = new NullProgressMonitor();
//								folder.create(true, true, monitor);
//							}catch(Exception e){
//								
//							}
//							return null;
//						}
//					}
					if(!file.exists()){
						IFolder folder=((Project)elements[j]).getFolder(getPath(filePath)+"/"+compActName); //$NON-NLS-1$
						if(!folder.exists()){
							try{
								IProgressMonitor monitor = new NullProgressMonitor();
								folder.create(true, true, monitor);
							}catch(Exception e){
								e.printStackTrace();
							}
						}
					}
					return file;
				}			
				}				
			}
		return null;
		
	}
	
	
	protected Command getCreateSubDiagramCMD(){
		
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		DiagramDocumentEditor targetDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
		IEditorInput activeInput = targetDiagramEditor.getEditorInput();
		IFile activeEditorFile = ((IFileEditorInput)activeInput).getFile();
		String projectname = null;//�ļ������Ĺ���
		String actFilePath=activeEditorFile.getProjectRelativePath().toString();//��ǰ�ļ������·��
		
		DiagramDocumentEditor activeDiagramEditor = (DiagramDocumentEditor) activePage.getActiveEditor();
		dEditingDomain = activeDiagramEditor.getDiagramEditPart().getDiagramEditDomain(); // Ŀǰ���е�Editor���õ���ͬһ��EditingDomain
		
			
		EditPart targetEditPart = selectedElement;
		if (targetEditPart instanceof IGraphicalEditPart) {
			IGraphicalEditPart editPart = (IGraphicalEditPart) targetEditPart;
			View view = editPart.getNotationView();
			if (view != null) {
				EObject element = ViewUtil.resolveSemanticElement(view);
				if (element instanceof EMPCompActivityImpl) {
					EMPCompActivity compActivity = (EMPCompActivityImpl) element;
					//��ϻ��
					String ActName = compActivity.getName();  
					if(ActName==null){
						MessageDialog.openWarning(null, "", process.diagram.actions.DiagramUIMessages.getString("OpenSubdiagramAction.8")); //$NON-NLS-1$ //$NON-NLS-2$
						return null;
					}
					//�����ļ������Ĺ���
					projectname = activeEditorFile.getFullPath().segment(0);
					// �鿴Ҫ������Diagram�Ƿ��Ѵ򿪣��Ѵ���bringToTop
					IEditorPart editorParts[] = activePage.getEditors();
					boolean IsDiagramExist = false;
					
					String fileBelongsTo = null;
					
					//���������������ͬ���ֵ��ļ����򿪣����������
					for (int i = 0; i < editorParts.length; i++) {
						//Ӧ�����жϴ򿪵��ļ������ĵĹ����Ƿ���ͬ
						if (editorParts[i].getTitle().equals(ActName + ".process_diagram")) {  //ע���ж�������Editors��������ͬ���֡���AcitiveEditor��ͬһ�����̵Ĳ��ܴ򿪣� //$NON-NLS-1$
							IEditorInput input = editorParts[i].getEditorInput();
							IFile file = ((IFileEditorInput)input).getFile();
							fileBelongsTo = file.getFullPath().segment(0);
							if(fileBelongsTo.equals(projectname)){	
								if(file.getProjectRelativePath().toString().equals(getPath(actFilePath)+"/"+ActName+"/"+ActName+process.diagram.actions.DiagramUIMessages.getString("OpenSubdiagramAction.12"))){ //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
									IsDiagramExist = true;
									activePage.bringToTop(editorParts[i]);
//									return null;
								}
							}							 
						}
					}
					// Ҫ������Diagramû���򿪣����Ƿ��Ѵ��ڣ�������openEditor
					IFile subDiagramFile = getFileFromProject(projectname,actFilePath,ActName);
					if(subDiagramFile != null && subDiagramFile.exists()){
						IsDiagramExist = true;
						try {
							IDE.openEditor(activePage, subDiagramFile);
						} catch (PartInitException e) { 
							e.printStackTrace();
						}	
//						return null;
					}					
										
					// ����Diagram
					if (IsDiagramExist == false) {
						IProgressMonitor progressMonitor = new NullProgressMonitor();
						progressMonitor.beginTask(
								"Creating diagram and model files", 4); //$NON-NLS-1$
						final IProgressMonitor subProgressMonitor = new SubProgressMonitor(
								progressMonitor, 1);
						ActName=getPath(actFilePath)+"/"+ActName+"/"+ActName+".process_diagram"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						/*NewpmbeDiagramEditorUtil.createAndOpenDiagram(  //���Editor����workspace�л��Ѿ��򿪣�����������Զ���Editor���
								NewpmbeDiagramFileCreator.getInstance(),
								(new Path(projectname))
										.makeAbsolute(), ActName,
								EditorUtil.getInitialContents(), "process",
								window, subProgressMonitor, true, true);*/
						try{
							NewPMBEDiagramEditorUtil.openDiagram(NewPMBEDiagramEditorUtil
								.createDiagram((new Path(projectname)).makeAbsolute(),
										ActName, progressMonitor));
						}catch(Exception e){}	
					}		
					//�����ļ�����ϻ����--����
					if(subDiagramFile != null){
						CompFileManager manager = CompFileManager.getInstance();
						manager.getComp2FileMap().put(compActivity, subDiagramFile);
					}
					
					//���´�����Diagram������Ԫ��	
					//ӳ��id������ xsm					
					DiagramDocumentEditor activeDiagramEditorNew = (DiagramDocumentEditor) activePage.getActiveEditor();
					DiagramEditPart  diagramEditPart = ((DiagramDocumentEditor)activeDiagramEditorNew).getDiagramEditPart();
					EObject diagramElement = ((View)diagramEditPart.getModel()).getElement();
					
							
					CompoundCommand cc = new CompoundCommand(
							DiagramUIMessages.AddCommand_Label);	
				
					//xsm added begin  --- to copy value from comp act to sun diagram 
					//set diagram prop from parent comp act
					//name set
					SetRequest nameSetReq = new SetRequest(diagramEditPart.getEditingDomain(),diagramElement,vpml.VpmlPackage.Literals.EM_OBJECT__NAME,((EMPCompActivity)element).getName());
					SetValueCommand setNamePropCommand = new SetValueCommand(nameSetReq);
					cc.add(new ICommandProxy(setNamePropCommand));
					
					//id set
					SetRequest idSetReq = new SetRequest(diagramEditPart.getEditingDomain(),diagramElement,vpml.VpmlPackage.Literals.EM_OBJECT__ID,((EMPCompActivity)element).getId());
					SetValueCommand setIdPropCommand = new SetValueCommand(idSetReq);
					cc.add(new ICommandProxy(setIdPropCommand));
					
					//code set
					SetRequest codeSetReq = new SetRequest(diagramEditPart.getEditingDomain(),diagramElement,vpml.VpmlPackage.Literals.EM_OBJECT__CODE,((EMPCompActivity)element).getCode());
					SetValueCommand setCodePropCommand = new SetValueCommand(codeSetReq);
					cc.add(new ICommandProxy(setCodePropCommand));
					
					//desc set
					SetRequest descSetReq = new SetRequest(diagramEditPart.getEditingDomain(),diagramElement,vpml.VpmlPackage.Literals.EM_OBJECT__DESCRIPTION,((EMPCompActivity)element).getDescription());
					SetValueCommand setDescPropCommand = new SetValueCommand(descSetReq);
					cc.add(new ICommandProxy(setDescPropCommand));
					
					//���ó���ʱ��--����11��25��
//					SetRequest durationSetReq = new SetRequest(diagramEditPart.getEditingDomain(), diagramElement, vpml.processpackage.ProcesspackagePackage.Literals.EMP_DIAGRAM__DURATION_TIME, ((EMPDiagram)((EMPCompActivity)element).eContainer()).getDurationTime());
//					SetValueCommand setDurationPropCommand = new SetValueCommand(durationSetReq);
//					cc.add(new ICommandProxy(setDurationPropCommand));
					
					IDiagramEditDomain dEditingDomainNew = activeDiagramEditorNew
					.getDiagramEditPart().getDiagramEditDomain();
					dEditingDomainNew.getDiagramCommandStack().execute(cc);
					
					FillDiagramElement(activePage);	
				}
			}

		}
		return null;
		
	}
	/**
	 * Date��2007-8-1
	 * Author:Michael
	 * ��䵱ǰ��ϻ��ͼ���Թ����ϲ������������
	 * @param activePage
	 */

	protected void FillDiagramElement(IWorkbenchPage activePage) {
		DiagramDocumentEditor targetDiagramEditor;
		IEditorInput activeInput;
		IFile activeEditorFile;
		boolean isNewElementJoined = false;
		
		// ���´�����Diagram������Ԫ��	
		//modified by Michael
		//2007-8-1
		//������ǰ��diagram�����ļ�����ȡ�Ѵ��ڵĲ�Ʒ�б��鿴�Ƿ�����ⲿ���еĲ�Ʒ�������ӣ�����������¸�diagram
		targetDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
		activeInput = targetDiagramEditor.getEditorInput();
		activeEditorFile = ((IFileEditorInput)activeInput).getFile();

		CompoundCommand cc = new CompoundCommand(
				DiagramUIMessages.AddCommand_Label);	
		
		//����������
		DiagramEditPart  diagramEditPart = ((DiagramDocumentEditor)targetDiagramEditor).getDiagramEditPart();
		EList actFlowList = ((EMPCompActivityImpl)((View)selectedElement.getModel()).getElement()).getSourceDataFlows();
		Iterator iter =actFlowList.iterator();
		while(iter.hasNext()){
			EMPDataFlowImpl actFlow = (EMPDataFlowImpl) iter.next();	
			
			if (actFlow.getSourceActivity() instanceof EMPActivityImpl) {
				String strLeftCount = null;
				try {
					strLeftCount = activeEditorFile.getPersistentProperty(new QualifiedName("PROCESS","LeftRefNodes")); //$NON-NLS-1$ //$NON-NLS-2$
				} catch (CoreException e) {				
					e.printStackTrace();
				}
				int iLeftCount = 0;
				if(strLeftCount != null)
					iLeftCount = Integer.parseInt(strLeftCount);
				if(LayoutSubActDiagram(cc, actFlow, true, diagramEditPart, iLeftCount)){
					if(!isNewElementJoined)
						isNewElementJoined = true;
					iLeftCount++ ;
					try {
						activeEditorFile.setPersistentProperty(new QualifiedName("PROCESS","LeftRefNodes"), String.valueOf(iLeftCount)); //$NON-NLS-1$ //$NON-NLS-2$
					} catch (CoreException e) {						
						e.printStackTrace();
					}
				}
				
			}
		}
		actFlowList = ((EMPCompActivityImpl)((View)selectedElement.getModel()).getElement()).getTargetDataFlows();
		iter =actFlowList.iterator();
		while (iter.hasNext()) 
		{
			EMPDataFlowImpl actFlow = (EMPDataFlowImpl) iter.next();
			if (actFlow.getTargetActivity() instanceof EMPActivityImpl)
			{
				String strLeftCount = null;
				try 
				{
					strLeftCount = activeEditorFile
							.getPersistentProperty(new QualifiedName(
									"PROCESS", "RightRefNodes")); //$NON-NLS-1$ //$NON-NLS-2$
				} 
				catch (CoreException e)
				{
					e.printStackTrace();
				}
				int iLeftCount = 0;
				if (strLeftCount != null)
					iLeftCount = Integer.parseInt(strLeftCount);
				if (LayoutSubActDiagram(cc, actFlow, false,
						diagramEditPart, iLeftCount))
				{
					iLeftCount++;
					try 
					{
						activeEditorFile.setPersistentProperty(
								new QualifiedName("PROCESS", //$NON-NLS-1$
										"RightRefNodes"), String //$NON-NLS-1$
										.valueOf(iLeftCount));
					} 
					catch (CoreException e) 
					{
						e.printStackTrace();
					}
				}
			}
		}
		
		//ʱ����
		EMPClockFlow clockFlow = ((EMPCompActivityImpl)((View)selectedElement.getModel()).getElement()).getClockFlow();
		if(clockFlow!=null)
		{
			EMPClockFlowImpl clockFlowImpl = (EMPClockFlowImpl) clockFlow;
			
			if (clockFlowImpl.getActivity() instanceof EMPActivityImpl) 
			{
				String strLeftCount = null;
				try 
				{
					strLeftCount = activeEditorFile
							.getPersistentProperty(new QualifiedName(
									"PROCESS", "RightRefNodes")); //$NON-NLS-1$ //$NON-NLS-2$
				} 
				catch (CoreException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int iLeftCount = 1;
				if (strLeftCount != null)
					iLeftCount = Integer.parseInt(strLeftCount);
				if (LayoutClock(null, clockFlowImpl, 
						diagramEditPart)) {
					if(!isNewElementJoined)
						isNewElementJoined = true;
					iLeftCount++;
					try {
						activeEditorFile.setPersistentProperty(
								new QualifiedName("PROCESS", //$NON-NLS-1$
										"RightRefNodes"), String //$NON-NLS-1$
										.valueOf(iLeftCount));
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		//������
		EList refFlowList = ((EMPCompActivityImpl)((View)selectedElement.getModel()).getElement()).getRefFlows();
		iter =refFlowList.iterator();
		while (iter.hasNext()) {
			EMPRefFlowImpl refFlowImpl = (EMPRefFlowImpl) iter.next();
			if (refFlowImpl.getActivity() instanceof EMPActivityImpl)
			{
				String strLeftCount = null;
				try 
				{
					strLeftCount = activeEditorFile
							.getPersistentProperty(new QualifiedName(
									"PROCESS", "RightRefNodes")); //$NON-NLS-1$ //$NON-NLS-2$
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int iLeftCount = 2;
				if (strLeftCount != null)
					iLeftCount = Integer.parseInt(strLeftCount);
				EMPProduct data = null;
				
				data = (EMPProduct) refFlowImpl.getProduct();
				if (LayoutSubActDiagram(null, false, diagramEditPart, iLeftCount, data)) 
				{
					if(!isNewElementJoined)
						isNewElementJoined = true;
					iLeftCount++;
					try 
					{
						activeEditorFile.setPersistentProperty(
								new QualifiedName("PROCESS", //$NON-NLS-1$
										"RightRefNodes"), String //$NON-NLS-1$
										.valueOf(iLeftCount));
					} 
					catch (CoreException e) 
					{
						e.printStackTrace();
					}
				}
			};
		}
		DiagramDocumentEditor activeDiagramEditor = (DiagramDocumentEditor) activePage.getActiveEditor();
//		IDiagramEditDomain dEditingDomain = activeDiagramEditor
//				.getDiagramEditPart().getDiagramEditDomain(); // Ŀǰ���е�Editor���õ���ͬһ��EditingDomain
//		dEditingDomain.getDiagramCommandStack().execute(cc);

		activeDiagramEditor.doSave(new NullProgressMonitor());
		
		// ��Ҫ�ȹر��ٴ�ҳ�������ʾ��ȷ��ԭ��δ֪
		boolean closeFile = false;
		if (activePage != null)
		{
			IEditorPart editorParts[] = activePage.getEditors();
			for (int i = 0; i < editorParts.length; i++)
			{	
				IEditorInput input = editorParts[i].getEditorInput();
				IFile file = ((IFileEditorInput)input).getFile();
				if (file.getRawLocation().equals(activeEditorFile.getRawLocation()))
					{
						try 
						{
							closeFile = activePage.closeEditor(editorParts[i], true);
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
						break;						
					}
			}

		}
		
		//����ͼ
		if (closeFile)
		{
			try		
			{
				IDE.openEditor(activePage, activeEditorFile);
			} catch (PartInitException e) 
			{ 
				e.printStackTrace();
			}	
		}
	}
	
	/**
	 * @description	�жϸò�Ʒ�Ƿ��Ѿ�����
	 * @param editPart ��ͼ
	 * @param product	����ͼ��صĲ�Ʒ
	 * @return ����ֵ���Ƿ����
	 */
	private boolean elementIsExist(DiagramEditPart editPart, EMObject product)
	{
		List eplist = editPart.getChildren();
		Iterator iter = eplist.iterator();
		boolean found = false;
		while (!found && iter.hasNext())
		{
			IGraphicalEditPart ep = (IGraphicalEditPart)iter.next();
			EObject obj = ep.resolveSemanticElement();
			if (obj instanceof EMPProduct)
			{
				EMPProduct pro = (EMPProduct)obj;
				if (pro.getId().equals(product.getId()) && pro.getName().equals(product.getName()) )
				{
					found = true;
				}
			}
			else
				if (obj instanceof EMPClock)
				{
					EMPClock clock = (EMPClock)obj;
					if (clock.getId().equals(product.getId()) && clock.getName().equals(product.getName()) )
					{
						found = true;
					}
				}
		}
		return found;
	}
	
	/**
	 * 
	 * @param cc
	 * @param actFlow
	 * @param IsSource Ϊtrue��ʾActivity��Ϊflow��Source��DataΪTarget��
	 * @param subDiagramEditPart
	 * @param leftCount 
	 */
	private boolean LayoutSubActDiagram(CompoundCommand cc,
			EMPDataFlowImpl actFlow, boolean IsSource,
			DiagramEditPart subDiagramEditPart, int leftCount)
	{
		EMPProduct data = null;
		boolean result = true;
		if (IsSource == true)
			data = (EMPProduct) actFlow.getTargetProduct();
		else
			data = (EMPProduct) actFlow.getSourceProduct();

		if (data != null) 
		{
			/*if (data instanceof EMPProductPackage)
			{
				//����ϲ�Ʒ
				System.out.println("��ϲ�Ʒ" + data.getName() + "�Ӳ�Ʒ�б���");
				EMPProductPackage prtp = (EMPProductPackage)data;
				String prtname = prtp.getName();
				//��ȡ��ͼ�ļ�����·��
				IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
				.getWorkbench().getActiveWorkbenchWindow();
				IWorkbenchPage activePage = window.getActivePage();
				DiagramDocumentEditor targetDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
				IEditorInput activeInput = targetDiagramEditor.getEditorInput();

				IFile activeEditorFile = ((IFileEditorInput)activeInput).getFile();
				String path = activeEditorFile.getRawLocation().toString();
				System.out.println(path);
				
				//ת�����ϲ�·��
				int index1 = path.lastIndexOf('/');
				String filepath = path.substring(0, index1);	
				int index2 = filepath.lastIndexOf('/');
				String filePath = filepath.substring(0, index2);
				
				String prtPath = filePath + '/' + prtname + '/' + prtname + ".product_diagram";
				System.out.println(prtPath);
				//��ȡ��ϲ�Ʒ��ͼ
				EMPDiagram prtdiagram = GetDiagramObject(prtPath);
				if (prtdiagram == null)
					return false;
				
				//��ȡ��ӦԪ�ز���ͼ
				EList alist = prtdiagram.getArtifacts();				
				leftCount = LayoutCompositeProduct(cc, IsSource,subDiagramEditPart, leftCount, alist);				
				
				EList dlist = prtdiagram.getDocuments();				
				leftCount = LayoutCompositeProduct(cc, IsSource,subDiagramEditPart, leftCount, dlist);
				
				EList olist = prtdiagram.getOthers();				
				leftCount = LayoutCompositeProduct(cc, IsSource,subDiagramEditPart, leftCount, olist);
				
				EList mlist = prtdiagram.getMessages();				
				leftCount = LayoutCompositeProduct(cc, IsSource,subDiagramEditPart, leftCount, mlist);
				
				EList plist = prtdiagram.getProductPackages();				
				leftCount = LayoutCompositeProduct(cc, IsSource,subDiagramEditPart, leftCount, plist);				
				
			}
			else*/
				LayoutSubActDiagram(cc, IsSource, subDiagramEditPart, leftCount, data);

			System.out.println(process.diagram.actions.DiagramUIMessages.getString("OpenSubdiagramAction.24")); //$NON-NLS-1$
		}
		return true;
	}

	/**
	 * ������ϲ�Ʒ�Ӳ�Ʒ
	 * @param cc
	 * @param IsSource
	 * @param subDiagramEditPart
	 * @param leftCount
	 * @param list
	 * @return
	 */
	private int LayoutCompositeProduct(CompoundCommand cc,
			boolean IsSource, DiagramEditPart subDiagramEditPart,
			int leftCount, EList list) {
		boolean result = false;
		EMPProduct data;
		System.out.println(list.size());
		Iterator iter = list.iterator();
		while(iter.hasNext())
		{
			data = (EMPProduct)iter.next();
			result = LayoutSubActDiagram(cc, IsSource, subDiagramEditPart, leftCount, data);
			if (result)
				leftCount++;
		}
		return leftCount;
	}

	/**
	 * �ж϶���������Ȼ�󽫲�Ʒ��������ͼ
	 * @param cc
	 * @param IsSource
	 * @param subDiagramEditPart
	 * @param leftCount
	 * @param data
	 * @return
	 */
	private boolean LayoutSubActDiagram(CompoundCommand cc, boolean IsSource,
			DiagramEditPart subDiagramEditPart, int leftCount, EMPProduct data) 
	{
		if (elementIsExist(subDiagramEditPart, data))
			return false;

		LayoutProductinSubDiagram(cc, IsSource, subDiagramEditPart,	leftCount, data);
		return true;
	}

	/**
	 * �ж϶�������ڷ�Ȼ��ʱ�Ӳ�������ͼ
	 * @param cc
	 * @param IsSource
	 * @param subDiagramEditPart
	 * @param leftCount
	 * @param data
	 * @return
	 */
	private boolean LayoutSubActDiagram(CompoundCommand cc, boolean IsSource,
			DiagramEditPart subDiagramEditPart, int leftCount, EMPClockFlowImpl data) 
	{
		if (elementIsExist(subDiagramEditPart, data))
			return false;

		LayoutClock(cc, data, subDiagramEditPart);
		return true;
	}
	/**
	 * 	���ض��Ĳ�Ʒ���󲼾�
	 * @param cc
	 * @param IsSource
	 * @param subDiagramEditPart
	 * @param leftCount
	 * @param data
	 */
	private void LayoutProductinSubDiagram(CompoundCommand cc,
			boolean IsSource, DiagramEditPart subDiagramEditPart,
			int leftCount, EMPProduct data)
	{
		EObjectAdapter objAdapter = new EObjectAdapter(data);

		CreateViewRequest.ViewDescriptor viewDescriptor = new CreateViewRequest.ViewDescriptor(
				objAdapter, Node.class, null,
				NewPMBEDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);

		CreateViewRequest cvRequest = new CreateViewRequest(
				(viewDescriptor));
		
		DiagramRootEditPart root = (DiagramRootEditPart) subDiagramEditPart
				.getRoot();
		LayeredPane printableLayers = (LayeredPane) root
				.getLayer(LayerConstants.PRINTABLE_LAYERS);

		Rectangle LayerBounds = printableLayers.getBounds();
		if(!IsSource)
			cvRequest.setLocation(new Point(LayerBounds.width / 10, LayerBounds.height / 10 * leftCount));
		else
			cvRequest.setLocation(new Point(LayerBounds.right()
					- LayerBounds.width / 10, LayerBounds.height / 10 * leftCount));
		if (subDiagramEditPart != null) { // ��subDiagram��cmd����subDiagram�д������������Ĵ�����Ψһ��׼��
			Command cmd = subDiagramEditPart.getCommand(cvRequest);//subDiagramEditPart.findEditPart(epBegin, theElement);
//			cc.add(cmd);
			dEditingDomain.getDiagramCommandStack().execute(cmd);
			EditPart editPart = subDiagramEditPart.findEditPart(null, data);
			if (editPart != null)
			{
				ChangeSourceColor(IsSource, editPart);
			}				
		}
	}
	
	/**
	 * ��ʱ�Ӳ�������
	 * @param cc
	 * @param actFlow
	 * @param subDiagramEditPart
	 * @return
	 */
	private boolean LayoutClock(CompoundCommand cc,
			EMPClockFlowImpl actFlow, 
			DiagramEditPart subDiagramEditPart)
	{
		EMPClock data = null;
		
		data = (EMPClock) actFlow.getClock();
		if (data != null) {

			if (elementIsExist(subDiagramEditPart, data))
				return false;
			
			EObjectAdapter objAdapter = new EObjectAdapter(data);

			CreateViewRequest.ViewDescriptor viewDescriptor = new CreateViewRequest.ViewDescriptor(
					objAdapter, Node.class, null,
					NewPMBEDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);

			CreateViewRequest cvRequest = new CreateViewRequest(
					(viewDescriptor));
			
			DiagramRootEditPart root = (DiagramRootEditPart) subDiagramEditPart
					.getRoot();
			LayeredPane printableLayers = (LayeredPane) root
					.getLayer(LayerConstants.PRINTABLE_LAYERS);

			Rectangle LayerBounds = printableLayers.getBounds();
			
				cvRequest.setLocation(new Point(LayerBounds.right()
						- LayerBounds.width / 2, LayerBounds.height / 6 ));
			if (subDiagramEditPart != null) { // ��subDiagram��cmd����subDiagram�д������������Ĵ�����Ψһ��׼��
				Command cmd = subDiagramEditPart.getCommand(cvRequest);
				dEditingDomain.getDiagramCommandStack().execute(cmd);
				EditPart editPart = subDiagramEditPart.findEditPart(null, data);
				if (editPart != null)
				{
					ChangeSourceColor(false, editPart);
				}	
			}
		}
		return true;
	}	
	
	/**
	 * �ı���������Ĳ�Ʒ��ɫ
	 * @param isSource
	 * @param editPart
	 */
	protected void ChangeSourceColor(boolean isSource, EditPart editPart)
	{
		Color color = null;
		Command c = null;
		IGraphicalEditPart ep = (IGraphicalEditPart)editPart;
		if (isSource)
		{
			color = new Color(null, 0, 255, 255);
			ChangePropertyValueRequest req = new ChangePropertyValueRequest(StringStatics.BLANK, Properties.ID_FILLCOLOR, FigureUtilities.colorToInteger(color));
			c = ep.getCommand(req);
		}
		else
		{
			color = new Color(null, 255, 255, 0);
			ChangePropertyValueRequest req = new ChangePropertyValueRequest(StringStatics.BLANK, Properties.ID_FILLCOLOR, FigureUtilities.colorToInteger(color));
			c = ep.getCommand(req);
		}
        dEditingDomain.getDiagramCommandStack().execute(c);
	}
		
	/**
	 * ��ȡָ�������ļ���ģ����Ϣ
	 * @param path
	 * @return
	 */
	private EMPDiagram GetDiagramObject(String path)
	{
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());   
						
		String filepath = path;
		
		URI fileURI = URI.createFileURI(filepath);
		File file = new File(filepath);
		if (!file.exists())
			return null;
		Resource tresource = resourceSet.getResource(fileURI, true);
		EObject diagramRootModel = (EObject) tresource.getContents().get(0);
		if (diagramRootModel == null)
			return null;
		EMPDiagram diagram = (EMPDiagram)diagramRootModel; 
		return diagram;		
	}

}
