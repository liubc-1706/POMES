package newpmbe.process.diagram.navigator;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.w3c.dom.Element;

import vpml.impl.EMObjectImpl;
//∞¥√˚◊÷≈≈–ÚÀ„∑®
public class NameSorter extends ViewerSorter{


	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
//        int cat1 = category(e1);
//        int cat2 = category(e2);
//
//        if (cat1 != cat2) {
//			return cat1 - cat2;
//		}
//    	
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

        // use the comparator to compare the strings
        return getComparator().compare(name1, name2);
    }

	@Override
	public void sort(Viewer viewer, Object[] elements) {
		// TODO Auto-generated method stub
		super.sort(viewer, elements);
	}

}
