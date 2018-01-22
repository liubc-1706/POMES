package newpmbe.DlgPackage;

import java.util.Iterator;
import java.util.List;

import newpmbe.process.diagram.edit.parts.EMPFormEditPart;

import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import vpml.informationpackage.EMIForm;
import vpml.informationpackage.impl.EMIComplexItemImpl;
import vpml.informationpackage.impl.EMIFormImpl;
import vpml.processpackage.EMPForm;

public class FormTypeSetDlg extends Dialog {
	TreeViewer tv;
	Tree tree;
	EMIForm form;
	
	public EMIForm getForm() {
		return form;
	}

	public void setForm(EMIForm form) {
		this.form = form;
	}

	public FormTypeSetDlg(Shell parentShell){
		super(parentShell);
	}
	
	protected Control createDialogArea(Composite parent){
		getShell().setText("设置表单类型");
		Composite topComp=new Composite(parent,SWT.NONE);
		topComp.setLayout(null);
		
		Label label=new Label(topComp,SWT.NONE);
		label.setBounds(10, 16, 150, 20);
		label.setText("请选择表单类型：");
		ITreeContentProvider myWorkbenchContentProvider = new WorkbenchContentProvider();
		Object[] elements = myWorkbenchContentProvider
				.getElements(ResourcesPlugin.getWorkspace().getRoot());
		tv=new TreeViewer(topComp,SWT.BORDER);
		tv.setContentProvider(myWorkbenchContentProvider);
		//tv.setLabelProvider(new WorkbenchLabelProvider());
		tv.setLabelProvider(new TreeLabelProvider());
		tv.setInput(ResourcesPlugin.getWorkspace().getRoot());
		tv.getTree().setBounds(10, 42, 250, 270);
		tv.setFilters(getModelFilter());
        return topComp;
	}
	
	@Override
	protected void initializeBounds() {
		// TODO Auto-generated method stub
		super.createButton((Composite)getButtonBar(),IDialogConstants.OK_ID, "确定", false);
		super.createButton((Composite)getButtonBar(), IDialogConstants.CANCEL_ID, "取消", false);
		super.initializeBounds();
	}

	@Override
	protected Button createButton(Composite parent, int id, String label,
			boolean defaultButton) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Point getInitialSize() {
		// TODO Auto-generated method stub
		Point p=super.getInitialSize();
		p.x=280;
		p.y=385;
		return p;
	}

	@Override
	protected void buttonPressed(int buttonId) {
		// TODO Auto-generated method stub
		if(buttonId==IDialogConstants.OK_ID){
			TreeSelection selection = (TreeSelection) tv.getSelection();   
			if(selection.getFirstElement() instanceof IFile){
				URI fileURI= URI.createFileURI(((IFile)selection.getFirstElement()).getLocation().toString());
				ResourceSet rst=new ResourceSetImpl();
				Resource resource =rst.getResource(fileURI, true);
				if(resource.getContents().get(0) instanceof EMIForm){
					EMIFormImpl ci=(EMIFormImpl)resource.getContents().get(0);
					setForm(ci);
				}
				/*List l=new AdapterFactoryItemDelegator(formEditPart.getAdapterFactory()).
						getPropertyDescriptors(form);
				for (Iterator i=l.iterator();i.hasNext();) {
					 IItemPropertyDescriptor desc = 
			 	    	(IItemPropertyDescriptor)i.next();
					 if (desc.getId(form).equals("Form Type") ){
						desc.setPropertyValue(form,ci);
					 }
				}*/
			}
			this.close();
		}
		else{
			this.close();
		}
	}
	
	private ViewerFilter[] getModelFilter(){
		ModelFilter mf=new ModelFilter();
		ViewerFilter[] filters=new ViewerFilter[1];
		filters[0]=mf;
		return filters;
	}
	
	
	public class ModelFilter extends ViewerFilter{

		@Override
		public boolean select(Viewer viewer, Object parentElement,
				Object element) {
			// TODO Auto-generated method stub
			if(element instanceof Project){
				if(((Project)element).getFileExtension()!=null && ((Project)element).getFileExtension().equals("info"))
					return true;
			}else if(element instanceof IFile){
				if(((IFile)element).getFileExtension().equals("form"))
					return true;
			}else if(element instanceof IFolder){
				return true;
			}
			return false;
		}
		
	}

	public class TreeLabelProvider implements ILabelProvider{

		public Image getImage(Object element) {
			// TODO Auto-generated method stub
			//AbstractUIPlugin.imageDescriptorFromPlugin(
				//	, "/icons/next.ico").createImage();
			if(element instanceof IProject){
				String ex = ((IProject)element).getFileExtension();
				if(ex!=null){
					if(ex.equals("info")){
						return AbstractUIPlugin.imageDescriptorFromPlugin(
								"newpmbe.information.editor", "/icons/full/infoproject.gif").createImage();
					}
				}
			}else if(element instanceof IFolder){
				return PlatformUI.getWorkbench().getSharedImages().
				getImage(ISharedImages.IMG_OBJ_FOLDER);
			}else if(element instanceof IFile){
				if(((IFile)element).getFileExtension()!=null){
					if(((IFile)element).getFileExtension().equals("form")){
						return AbstractUIPlugin.
							imageDescriptorFromPlugin("newpmbe.information.editor","icons/full/ico_form.gif").createImage(); 
					}else if(((IFile)element).getFileExtension().equals("list")){
						return AbstractUIPlugin.
						imageDescriptorFromPlugin("newpmbe.information.editor","icons/full/ico_list.gif").createImage(); 
					}else if(((IFile)element).getFileExtension().equals("enum")){
						return AbstractUIPlugin.
						imageDescriptorFromPlugin("newpmbe.information.editor","icons/full/ico_enum.gif").createImage(); 
					}
				}
			}
			return null;
		}

		public String getText(Object element) {
			// TODO Auto-generated method stub
			String name="";
			String extension="";
			int index=-1;
			if(element instanceof IContainer){
				name=((IContainer)element).getName();
				extension=((IContainer)element).getFileExtension();
			}else if(element instanceof IFile){
				name=((IFile)element).getName();
				extension=((IFile)element).getFileExtension();
			}
			String result=name;
			if(extension!=null)
			if(extension.equals("list")||extension.equals("form")||
					extension.equals("enum")||extension.equals("info")){
				index=name.lastIndexOf(extension);
				
				if(index>0){
					result=name.substring(0, index-1);
				}
			}
			return result;
		}

		public void addListener(ILabelProviderListener listener) {
			// TODO Auto-generated method stub
			
		}

		public void dispose() {
			// TODO Auto-generated method stub
			
		}

		public boolean isLabelProperty(Object element, String property) {
			// TODO Auto-generated method stub
			return false;
		}

		public void removeListener(ILabelProviderListener listener) {
			// TODO Auto-generated method stub
			
		}

		
		
	}
	
	
}


