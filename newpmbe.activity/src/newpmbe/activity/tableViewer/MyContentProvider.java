package newpmbe.activity.tableViewer;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class MyContentProvider implements IStructuredContentProvider {

	public Object[] getElements(Object element) {
		// TODO Auto-generated method stub
		if(element instanceof List){
			return ((List)element).toArray();
		}
		return new Object[0];
	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

}
