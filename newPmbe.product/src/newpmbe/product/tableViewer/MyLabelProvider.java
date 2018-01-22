package newpmbe.product.tableViewer;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import vpml.processpackage.EMPProduct;

public class MyLabelProvider implements ITableLabelProvider {

	public Image getColumnImage(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getColumnText(Object element, int col) {
		// TODO Auto-generated method stub
		EMPProduct product=(EMPProduct)element;
		if(col==0)return product.getOID().toString();
		if(col==1)return product.getName();
		if(col==2)return product.getDescription();
		if(col==3){
			IFile ifile = WorkspaceSynchronizer.getFile(product.eResource());
			return ifile.getProject().getName()+"/"+ifile.getProjectRelativePath()
							.removeLastSegments(1).toString();
		}
		return "";
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
