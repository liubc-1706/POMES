package newpmbe.product.diagram.navigator;

import newpmbe.product.diagram.part.NewPMBEVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class NewPMBENavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 2008;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof NewPMBENavigatorItem) {
			NewPMBENavigatorItem item = (NewPMBENavigatorItem) element;
			return NewPMBEVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
