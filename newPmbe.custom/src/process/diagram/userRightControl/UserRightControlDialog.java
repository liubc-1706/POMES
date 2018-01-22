package process.diagram.userRightControl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;

import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class UserRightControlDialog extends Dialog{
	
	public UserRightControlDialog(Shell parentshell) {
		// TODO Auto-generated constructor stub
		super(parentshell);
	}
	private List<String> userList = new LinkedList<String>();
	
	private HashMap<String,CheckboxTreeViewer> hashMap_CTV = new HashMap<String,CheckboxTreeViewer>();	

	@Override
	protected void cancelPressed() {
		// TODO Auto-generated method stub
		super.cancelPressed();
	}

	private class myCheckStateListener implements ICheckStateListener{
		
		private CheckboxTreeViewer ctv;
		public myCheckStateListener(CheckboxTreeViewer myCTV) {
			// TODO Auto-generated constructor stub
			ctv = myCTV;
		}

		public void checkStateChanged(CheckStateChangedEvent event) {
			// TODO Auto-generated method stub
			Object element = event.getElement();
			if (ctv.getChecked(element)
					&& ctv.getGrayed(element)) {
				ctv.setSubtreeChecked(element, true);
				ctv.setParentsGrayed(element, false);
			} else if (ctv.getChecked(element)
					&& (!ctv.getGrayed(element))) {
				ctv.setSubtreeChecked(element, true);
				ctv.setParentsGrayed(element, true);
				//?ctv.setparentsChecked(element,true);
				ctv.setGrayed(element, false);
			} else if ((!ctv.getChecked(element))
					&& (ctv.getGrayed(element))) {
				ctv.setSubtreeChecked(element, false);
				ctv.setParentsGrayed(element, false);
			} else if ((!ctv.getChecked(element))
					&& (!ctv.getGrayed(element))) {
				ctv.setSubtreeChecked(element, false);
				ctv.setParentsGrayed(element, true);
				//?ctv.setparentsChecked(element,true);
				ctv.setGrayed(element, false);
			}
		}
		
	}
	@Override
	protected Control createDialogArea(Composite parent) {
		// TODO Auto-generated method stub			
		userList.add("dzh"); //$NON-NLS-1$
		userList.add("wb"); //$NON-NLS-1$
		userList.add("gjt"); //$NON-NLS-1$
		this.getShell().setText(Messages.UserRightControlDialog_3);
		Composite topComp=new Composite(parent,SWT.NONE);
		topComp.setLayout(new GridLayout());
		this.getShell().setLayout(new GridLayout());
		topComp.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		{
			SashForm sashForm=new SashForm(topComp,SWT.BORDER);
			sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));
			Iterator<String> iter = userList.iterator();
			while(iter.hasNext()){
				String strTitle = (String) iter.next();
				createComposite(sashForm, strTitle + Messages.UserRightControlDialog_4);
			}
			
				
		}
		//TODO 当没有活动被check out时才能下载tree.xml,并加锁，否则提示用户不能打开配置对话框。 
		//读取tree.xml设置checkbox的状态
	    return topComp;
	}

	/**
	 * @param sashForm
	 * @param strTitle
	 */
	private void createComposite(SashForm sashForm, String strTitle) {
		Composite left=new Composite(sashForm,SWT.BORDER);			
		GridLayout gridLayout = new GridLayout();			
		left.setLayout(gridLayout);
		final Label MyTreeLabel = new Label(left, SWT.CENTER);
		MyTreeLabel.setText(strTitle);			
		Rectangle rect = MyTreeLabel.getBounds();
		MyTreeLabel.setBounds(rect.x,rect.y,rect.width,rect.height/2);			
			
		CheckboxTreeViewer ctv = new CheckboxTreeViewer(left, SWT.MULTI | SWT.BORDER);
		hashMap_CTV.put(strTitle,ctv);
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		
		ctv.getTree().setLayoutData(layoutData);
		ctv.setContentProvider(new ModelElementsTreeContentProvider());
		ctv.setLabelProvider(new ModelElementsTreeLabelProvider());

		ctv.setInput(ResourcesPlugin.getWorkspace().getRoot());
		ctv.addFilter(new ModelFilesFilter());
		ctv.addCheckStateListener(new myCheckStateListener(ctv));
	}

	@Override
	protected Point getInitialSize() {
		// TODO Auto-generated method stub
		Point p=super.getInitialSize();
		p.x=680;
		p.y=400;
		return p;
	}
	@Override
	protected void buttonPressed(int buttonId) {
		// TODO Auto-generated method stub
		//super.buttonPressed(buttonId);
		if(buttonId==IDialogConstants.OK_ID){
			Iterator<String> iter = hashMap_CTV.keySet().iterator();
			while(iter.hasNext()){
				String key = (String) iter.next();
				CheckboxTreeViewer ctv = hashMap_CTV.get(key);
				Object[] checkObj = ctv.getCheckedElements(); //取得打勾的记录
	             if (checkObj.length == 0) //判断是否有勾选复选框
	                 MessageDialog.openInformation(null, Messages.UserRightControlDialog_5, Messages.UserRightControlDialog_6 + key);
	             for (int i = 0; i < checkObj.length; i++) {
	            	 System.out.println(checkObj[i] + Messages.UserRightControlDialog_7 + key.substring(0, key.length() - 3) );
	                 //PeopleEntity o = (PeopleEntity) checkObj[i];
	                 //ctv.remove(o);
	             }
			}
			//TODO 保存checkbox的状态到tree.xml
			//上传tree.xml,将tree.xml解锁。			 
		}		
		this.close();		
	}

	@Override
	protected int getShellStyle() {
		// TODO Auto-generated method stub
		return super.getShellStyle()|SWT.RESIZE|SWT.MAX;
	}

	public void createModelBrowser(Composite myshell) {	

		final SashForm MySash1 = new SashForm(myshell, SWT.VERTICAL);
		MySash1.setLayoutData(new GridData(GridData.FILL_BOTH));
		final Label MyTreeLabel = new Label(MySash1, SWT.CENTER);
		MyTreeLabel.setText(Messages.UserRightControlDialog_8);
		
		final TreeViewer treeViewer = new TreeViewer(MySash1, SWT.CHECK
				| SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);	

		treeViewer.setContentProvider(new ModelElementsTreeContentProvider());
		treeViewer.setLabelProvider(new ModelElementsTreeLabelProvider());

		treeViewer.setInput(ResourcesPlugin.getWorkspace().getRoot());
		treeViewer.addFilter(new ModelFilesFilter());

		final SashForm MySash2 = new SashForm(myshell, SWT.VERTICAL);

		final Label MyTreeLabel_1 = new Label(MySash2, SWT.CENTER);
		MyTreeLabel_1.setText(Messages.UserRightControlDialog_9);
		
			
	
	}

	private EditingDomain myEditingDomain = GMFEditingDomainFactory.INSTANCE
	.createEditingDomain();

	private class ModelElementsTreeContentProvider implements
			ITreeContentProvider {

		/**
		 * @generated
		 */
		private ITreeContentProvider myWorkbenchContentProvider = new WorkbenchContentProvider();

		/**
		 * @generated
		 */
		private AdapterFactoryContentProvider myAdapterFctoryContentProvier = new AdapterFactoryContentProvider(
				NewPMBEDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());

		/**
		 * @generated
		 */
		public Object[] getChildren(Object parentElement) {
			Object[] result = myWorkbenchContentProvider
					.getChildren(parentElement);
			if (result != null && result.length > 0) {
				return result;
			}
			if (parentElement instanceof IFile) {
				IFile modelFile = (IFile) parentElement;
				IPath resourcePath = modelFile.getFullPath();
				ResourceSet resourceSet = myEditingDomain.getResourceSet();
				try {
					Resource modelResource = resourceSet.getResource(URI
							.createPlatformResourceURI(resourcePath.toString(),
									true), true);
					return myAdapterFctoryContentProvier
							.getChildren(modelResource);
				} catch (WrappedException e) {
					NewPMBEDiagramEditorPlugin
							.getInstance()
							.logError(
									"Unable to load resource: " + resourcePath.toString(), e); //$NON-NLS-1$
				}
				return Collections.EMPTY_LIST.toArray();
			}
			return myAdapterFctoryContentProvier.getChildren(parentElement);
		}

		/**
		 * @generated
		 */
		public Object getParent(Object element) {
			Object parent = myWorkbenchContentProvider.getParent(element);
			if (parent != null) {
				return parent;
			}
			if (element instanceof EObject) {
				EObject eObject = (EObject) element;
				if (eObject.eContainer() == null
						&& eObject.eResource().getURI().isFile()) {
					String path = eObject.eResource().getURI().path();
					return ResourcesPlugin.getWorkspace().getRoot()
							.getFileForLocation(new Path(path));
				}
				return myAdapterFctoryContentProvier.getParent(eObject);
			}
			return null;
		}

		/**
		 * @generated
		 */
		public boolean hasChildren(Object element) {
			if (element instanceof IFile) {
				return false;// return isValidModelFile((IFile) element);
			}
			if (element instanceof Folder ||element instanceof Project) {
				Object[] elements = myWorkbenchContentProvider
						.getElements(element);
				int nCount = elements.length;				
				for (int i = 0; i < nCount; i++) {
					if(elements[i] instanceof Folder)
						return true;
				}
				
			}
			return false;
			/*return myWorkbenchContentProvider.hasChildren(element)
					|| myAdapterFctoryContentProvier.hasChildren(element);*/
		}

		/**
		 * @generated
		 */
		public Object[] getElements(Object inputElement) {
			Object[] elements = myWorkbenchContentProvider
					.getElements(inputElement);
			return elements;
		}

		/**
		 * @generated
		 */
		public void dispose() {
			myWorkbenchContentProvider.dispose();
			myAdapterFctoryContentProvier.dispose();
		}

		/**
		 * @generated
		 */
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			myWorkbenchContentProvider.inputChanged(viewer, oldInput, newInput);
			myAdapterFctoryContentProvier.inputChanged(viewer, oldInput,
					newInput);
		}

	}

	/**
	 * @generated
	 */
	private class ModelElementsTreeLabelProvider implements ILabelProvider {

		/**
		 * @generated
		 */
		private WorkbenchLabelProvider myWorkbenchLabelProvider = new WorkbenchLabelProvider();

		/**
		 * @generated
		 */
		private AdapterFactoryLabelProvider myAdapterFactoryLabelProvider = new AdapterFactoryLabelProvider(
				NewPMBEDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());

		/**
		 * @generated
		 */
		public Image getImage(Object element) {
			Image result = myWorkbenchLabelProvider.getImage(element);
			return result != null ? result : myAdapterFactoryLabelProvider
					.getImage(element);
		}

		/**
		 * @generated
		 */
		public String getText(Object element) {
			String result = myWorkbenchLabelProvider.getText(element);
			return result != null && result.length() > 0 ? result
					: myAdapterFactoryLabelProvider.getText(element);
		}

		/**
		 * @generated
		 */
		public void addListener(ILabelProviderListener listener) {
			myWorkbenchLabelProvider.addListener(listener);
			myAdapterFactoryLabelProvider.addListener(listener);
		}

		/**
		 * @generated
		 */
		public void dispose() {
			myWorkbenchLabelProvider.dispose();
			myAdapterFactoryLabelProvider.dispose();
		}

		/**
		 * @generated
		 */
		public boolean isLabelProperty(Object element, String property) {
			return myWorkbenchLabelProvider.isLabelProperty(element, property)
					|| myAdapterFactoryLabelProvider.isLabelProperty(element,
							property);
		}

		/**
		 * @generated
		 */
		public void removeListener(ILabelProviderListener listener) {
			myWorkbenchLabelProvider.removeListener(listener);
			myAdapterFactoryLabelProvider.removeListener(listener);
		}

	}

	private class ModelFilesFilter extends ViewerFilter {

		/**
		 * @generated
		 */
		public boolean select(Viewer viewer, Object parentElement,
				Object element) {
			if (element.toString().indexOf(".setting") != -1) { //$NON-NLS-1$
				return false;
			}
			if (element instanceof IContainer) {
				if (element instanceof Folder || element instanceof Project)
					return true;
			}
			/*
			 * if (element instanceof IFile) { IFile file = (IFile) element;
			 * return isValidModelFile(file); }
			 */
			/*
			 * if(element instanceof ProcessDiagramImpl) return false;
			 */
			return false;
		}

	}

}