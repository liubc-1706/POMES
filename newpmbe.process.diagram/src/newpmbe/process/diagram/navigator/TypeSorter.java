package newpmbe.process.diagram.navigator;


import java.sql.Time;


import newpmbe.process.diagram.part.NewPMBEVisualIDRegistry;

import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

public class TypeSorter extends ViewerSorter{
	private static final int GROUP_CATEGORY = 4035;
	
	public int category(Object element) {
		if (element instanceof NewPMBENavigatorItem) {
			NewPMBENavigatorItem item = (NewPMBENavigatorItem) element;
			return NewPMBEVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}
	
	public void sort(Viewer viewer, Object[] elements) {
		// TODO Auto-generated method stub
		super.sort(viewer, elements);
	}
	
	public int compare(Viewer viewer, Object e1, Object e2) {
		   
		int cat1 = category(e1);
	    int cat2 = category(e2);
	    if (cat1 != cat2) {
	    	return cat1 - cat2;
	    	}
	    String name1;
        String name2;

        if (viewer == null || !(viewer instanceof ContentViewer)) {
            name1 = e1.toString();
            name2 = e2.toString();
        } else {
            IBaseLabelProvider prov = ((ContentViewer) viewer)
                    .getLabelProvider();
            if (prov instanceof ILabelProvider) {
                ILabelProvider lprov = (ILabelProvider) prov;
                name1 = lprov.getText(e1);
                name2 = lprov.getText(e2);
            } else {
                name1 = e1.toString();
                name2 = e2.toString();
            }
        }
        if (name1 == null) {
			name1 = "";//$NON-NLS-1$
		}
        if (name2 == null) {
			name2 = "";//$NON-NLS-1$
		}
       
        return getComparator().compare(name1, name2);
	}

}
