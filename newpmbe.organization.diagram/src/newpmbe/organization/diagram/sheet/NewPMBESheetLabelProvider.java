package newpmbe.organization.diagram.sheet;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;
import newpmbe.organization.diagram.navigator.NewPMBENavigatorGroup;

import newpmbe.organization.diagram.part.NewPMBEDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.jface.viewers.DecoratingLabelProvider;

/**
 * @generated
 */
public class NewPMBESheetLabelProvider extends DecoratingLabelProvider {

	/**
	 * @generated
	 */
	public NewPMBESheetLabelProvider() {
		super(new AdapterFactoryLabelProvider(NewPMBEDiagramEditorPlugin
				.getInstance().getItemProvidersAdapterFactory()), null);
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		Object selected = unwrap(element);
		if (selected instanceof NewPMBENavigatorGroup) {
			return ((NewPMBENavigatorGroup) selected).getGroupName();
		}
		return super.getText(selected);
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		return super.getImage(unwrap(element));
	}

	/**
	 * @generated
	 */
	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return unwrap(((IStructuredSelection) element).getFirstElement());
		}
		if (element instanceof EditPart) {
			return unwrapEditPart((EditPart) element);
		}
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null) {
				return unwrapView(view);
			}
		}
		return element;
	}

	/**
	 * @generated
	 */
	private Object unwrapEditPart(EditPart p) {
		if (p.getModel() instanceof View) {
			return unwrapView((View) p.getModel());
		}
		return p.getModel();
	}

	/**
	 * @generated
	 */
	private Object unwrapView(View view) {
		return view.getElement() == null ? view : view.getElement();
	}
}