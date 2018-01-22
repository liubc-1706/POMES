package newpmbe.resource.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import newpmbe.resource.diagram.part.NewPMBEVisualIDRegistry;

/**
 * @generated
 */
public class NewPMBEEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public static final String EXTERNAL_NODE_LABELS_LAYER = "External Node Labels"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			int viewVisualID = NewPMBEVisualIDRegistry.getVisualID(view);
			switch (viewVisualID) {
			case EMRAbstractToolTypeEditPart.VISUAL_ID:
				return new EMRAbstractToolTypeEditPart(view);
			case EMRAbstractToolTypeNameEditPart.VISUAL_ID:
				return new EMRAbstractToolTypeNameEditPart(view);
			case EMRAbstractLocationTypeEditPart.VISUAL_ID:
				return new EMRAbstractLocationTypeEditPart(view);
			case EMRAbstractLocationTypeNameEditPart.VISUAL_ID:
				return new EMRAbstractLocationTypeNameEditPart(view);
			case EMRAbstractMachineTypeEditPart.VISUAL_ID:
				return new EMRAbstractMachineTypeEditPart(view);
			case EMRAbstractMachineTypeNameEditPart.VISUAL_ID:
				return new EMRAbstractMachineTypeNameEditPart(view);
			case EMRLocationTypeEditPart.VISUAL_ID:
				return new EMRLocationTypeEditPart(view);
			case EMRLocationTypeNameEditPart.VISUAL_ID:
				return new EMRLocationTypeNameEditPart(view);
			case EMRMachineTypeEditPart.VISUAL_ID:
				return new EMRMachineTypeEditPart(view);
			case EMRMachineTypeNameEditPart.VISUAL_ID:
				return new EMRMachineTypeNameEditPart(view);
			case EMRToolTypeEditPart.VISUAL_ID:
				return new EMRToolTypeEditPart(view);
			case EMRToolTypeNameEditPart.VISUAL_ID:
				return new EMRToolTypeNameEditPart(view);
			case EMRDiagramEditPart.VISUAL_ID:
				return new EMRDiagramEditPart(view);
			case EMRClassificationRelationEditPart.VISUAL_ID:
				return new EMRClassificationRelationEditPart(view);
			case EMRClassificationRelation2EditPart.VISUAL_ID:
				return new EMRClassificationRelation2EditPart(view);
			case EMRClassificationRelation3EditPart.VISUAL_ID:
				return new EMRClassificationRelation3EditPart(view);
			case EMRClassificationRelation4EditPart.VISUAL_ID:
				return new EMRClassificationRelation4EditPart(view);
			case EMRClassificationRelation5EditPart.VISUAL_ID:
				return new EMRClassificationRelation5EditPart(view);
			case EMRClassificationRelation6EditPart.VISUAL_ID:
				return new EMRClassificationRelation6EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrapLabel)
			return new TextCellEditorLocator((WrapLabel) source.getFigure());
		else {
			IFigure figure = source.getFigure();
			return new LabelCellEditorLocator((Label) figure);
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrapLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrapLabel wrapLabel) {
			super();
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrapLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);

			if (getWrapLabel().isTextWrapped()
					&& getWrapLabel().getText().length() > 0)
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}

			if (!rect.equals(new Rectangle(text.getBounds())))
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
		}

	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);

			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));

			if (!rect.equals(new Rectangle(text.getBounds())))
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
		}
	}
}
