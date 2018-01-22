package vpml.informationpackage.presentation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import vpml.informationpackage.EMIForm;
import vpml.informationpackage.impl.EMIComplexAttributeImpl;


public class ComplexTypeSetDialog extends Dialog {
	TreeViewer tv;
	Tree tree;
	EMIComplexAttributeImpl complexAttribute;
	
	public ComplexTypeSetDialog(Shell parentShell){
		super(parentShell);
	}
	
	public void setComplexAttribute(EMIComplexAttributeImpl element){
		complexAttribute=element;
	}
	
	protected Control createDialogArea(Composite parent){
		getShell().setText("设置复杂数据类型");
		Composite topComp=new Composite(parent,SWT.NONE);
		topComp.setLayout(null);
		ITreeContentProvider myWorkbenchContentProvider = new WorkbenchContentProvider();
		Object[] elements = myWorkbenchContentProvider
				.getElements(ResourcesPlugin.getWorkspace().getRoot());
		tv=new TreeViewer(topComp,SWT.NONE);
		tv.setContentProvider(myWorkbenchContentProvider);
		tv.setLabelProvider(new WorkbenchLabelProvider());
		tv.setInput(ResourcesPlugin.getWorkspace().getRoot());
		tv.getTree().setBounds(10, 22, 200, 270);
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
		p.x=300;
		p.y=380;
		return p;
	}

	@Override
	protected void buttonPressed(int buttonId) {
		// TODO Auto-generated method stub
		//super.buttonPressed(buttonId);
		if(buttonId==IDialogConstants.OK_ID){
			//EMIComplexItem form=(EMIForm)ctv.getCheckedElements()[0];
			//ci.setComplexType(form);
			/*List l=
				new AdapterFactoryItemDelegator(ourEditor.getAdapterFactory()).
					getPropertyDescriptors(input);
			for (Iterator i=l.iterator();i.hasNext();) {
				 IItemPropertyDescriptor desc = 
		 	    	(IItemPropertyDescriptor)i.next();
				 if (debug) System.out.println("descriptorID: " + desc.getId(input));
				 if (desc.getId(input).equals("complexType") )
				 	//System.out.println("we got Library Name");
					desc.setPropertyValue(input,form);
			}*/
			
		}
		else{
			this.close();
		}
	}
	
	private class TableContentProvider implements IStructuredContentProvider{
	    public Object[] getElements(Object element) {
	        if (element instanceof Object[])
	            return (Object[])element;
	        else if(element instanceof List)
	        	return ((List)element).toArray();
	        else
	            return new Object[0]; 
	    }
	    
	    public void dispose() {
	    }
	    
	    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	    }
	}

	private class TableLableProvider implements ILabelProvider{
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

		public Image getImage(Object element) {
			// TODO Auto-generated method stub
			return null;
		}

		public String getText(Object element) {
			// TODO Auto-generated method stub
			if(element instanceof Project){
				return ((Project)element).getName();
			}
			return "";
		}
		
	}
	
	private class ModelFilter extends ViewerFilter{

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
				else if(((IFile)element).getFileExtension().equals("list"))
					return true;
				else if(((IFile)element).getFileExtension().equals("enum"))
					return true;
			}else if(element instanceof IFolder){
				return true;
			}
			return false;
		}
		
	}
	
	private ViewerFilter[] getModelFilter(){
		ModelFilter mf=new ModelFilter();
		ViewerFilter[] filters=new ViewerFilter[1];
		filters[0]=mf;
		return filters;
	}
	 
	@SuppressWarnings("rawtypes")
	public static List getProjectsFromWorkspace(){
		List list=new ArrayList();
		ITreeContentProvider myWorkbenchContentProvider = new WorkbenchContentProvider();
		Object[] elements = myWorkbenchContentProvider
				.getElements(ResourcesPlugin.getWorkspace().getRoot());
		
		for (int j = 0; j < elements.length; j++)
			if (elements[j] instanceof Project){
				if(((Project)elements[j]).getName().endsWith(".info"))
					list.add(((Project)elements[j]).getName());
		}
		
		return list;
	}
	
}
