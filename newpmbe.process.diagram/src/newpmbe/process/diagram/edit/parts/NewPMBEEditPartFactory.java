package newpmbe.process.diagram.edit.parts;

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
import newpmbe.process.diagram.part.NewPMBEVisualIDRegistry;
import newpmbe.process.diagram.part.NewPMBEPaletteFactory;
import newpmbe.process.diagram.edit.parts.EMPNormalActivityNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPNormalActivityEditPart;

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
			case EMPAutoBatchActivityEditPart.VISUAL_ID:
				return new EMPAutoBatchActivityEditPart(view);
			case EMPAutoBatchActivityNameEditPart.VISUAL_ID:
				return new EMPAutoBatchActivityNameEditPart(view);
			case EMPOutOrEditPart.VISUAL_ID:
				return new EMPOutOrEditPart(view);
			case EMPDocumentEditPart.VISUAL_ID:
				return new EMPDocumentEditPart(view);
			case EMPDocumentNameEditPart.VISUAL_ID:
				return new EMPDocumentNameEditPart(view);
			case EMPProductPackageEditPart.VISUAL_ID:
				return new EMPProductPackageEditPart(view);
			case EMPProductPackageNameEditPart.VISUAL_ID:
				return new EMPProductPackageNameEditPart(view);
			case EMPNormalActivityEditPart.VISUAL_ID:
				return new EMPNormalActivityEditPart(view);
			case EMPNormalActivityNameEditPart.VISUAL_ID:
				return new EMPNormalActivityNameEditPart(view);
			case EMPOtherEditPart.VISUAL_ID:
				return new EMPOtherEditPart(view);
			case EMPOtherNameEditPart.VISUAL_ID:
				return new EMPOtherNameEditPart(view);
			case EMPMessageEditPart.VISUAL_ID:
				return new EMPMessageEditPart(view);
			case EMPMessageNameEditPart.VISUAL_ID:
				return new EMPMessageNameEditPart(view);
			case EMPCompActivityEditPart.VISUAL_ID:
				return new EMPCompActivityEditPart(view);
			case EMPCompActivityNameEditPart.VISUAL_ID:
				return new EMPCompActivityNameEditPart(view);
			case EMPOutAndEditPart.VISUAL_ID:
				return new EMPOutAndEditPart(view);
			case EMPManualBatchActivityEditPart.VISUAL_ID:
				return new EMPManualBatchActivityEditPart(view);
			case EMPManualBatchActivityNameEditPart.VISUAL_ID:
				return new EMPManualBatchActivityNameEditPart(view);
			case EMPClockEditPart.VISUAL_ID:
				return new EMPClockEditPart(view);
			case EMPClockNameEditPart.VISUAL_ID:
				return new EMPClockNameEditPart(view);
			case EMPInAndEditPart.VISUAL_ID:
				return new EMPInAndEditPart(view);
			case EMPInOrEditPart.VISUAL_ID:
				return new EMPInOrEditPart(view);
			case EMPAutoActivityEditPart.VISUAL_ID:
				return new EMPAutoActivityEditPart(view);
			case EMPAutoActivityNameEditPart.VISUAL_ID:
				return new EMPAutoActivityNameEditPart(view);
			case EMPArtifactEditPart.VISUAL_ID:
				return new EMPArtifactEditPart(view);
			case EMPArtifactNameEditPart.VISUAL_ID:
				return new EMPArtifactNameEditPart(view);
			case EMOResourceGroupTypeEditPart.VISUAL_ID:
				return new EMOResourceGroupTypeEditPart(view);
			case EMOResourceGroupTypeNameEditPart.VISUAL_ID:
				return new EMOResourceGroupTypeNameEditPart(view);
			case EMRToolTypeEditPart.VISUAL_ID:
				return new EMRToolTypeEditPart(view);
			case EMRToolTypeNameEditPart.VISUAL_ID:
				return new EMRToolTypeNameEditPart(view);
			case EMRRoleEditPart.VISUAL_ID:
				return new EMRRoleEditPart(view);
			case EMRRoleNameEditPart.VISUAL_ID:
				return new EMRRoleNameEditPart(view);
			case EMRMachineTypeEditPart.VISUAL_ID:
				return new EMRMachineTypeEditPart(view);
			case EMRMachineTypeNameEditPart.VISUAL_ID:
				return new EMRMachineTypeNameEditPart(view);
			case EMRLocationTypeEditPart.VISUAL_ID:
				return new EMRLocationTypeEditPart(view);
			case EMRLocationTypeNameEditPart.VISUAL_ID:
				return new EMRLocationTypeNameEditPart(view);
			case EMPFormEditPart.VISUAL_ID:
				return new EMPFormEditPart(view);
			case EMPFormNameEditPart.VISUAL_ID:
				return new EMPFormNameEditPart(view);
			case EMPDiagramEditPart.VISUAL_ID:
				return new EMPDiagramEditPart(view);
			case EMPClockFlowEditPart.VISUAL_ID:
				return new EMPClockFlowEditPart(view);
			case EMPAssFlowEditPart.VISUAL_ID:
				return new EMPAssFlowEditPart(view);
			case EMPRefFlowEditPart.VISUAL_ID:
				return new EMPRefFlowEditPart(view);
			case EMPDataFlowEditPart.VISUAL_ID:
				return new EMPDataFlowEditPart(view);
			case EMPAssFlow2EditPart.VISUAL_ID:
				return new EMPAssFlow2EditPart(view);
			case EMPAssFlow3EditPart.VISUAL_ID:
				return new EMPAssFlow3EditPart(view);
			case EMPAssFlow4EditPart.VISUAL_ID:
				return new EMPAssFlow4EditPart(view);
			case EMPAssFlow5EditPart.VISUAL_ID:
				return new EMPAssFlow5EditPart(view);
			case EMPAssFlow6EditPart.VISUAL_ID:
				return new EMPAssFlow6EditPart(view);
			case EMPAssFlow7EditPart.VISUAL_ID:
				return new EMPAssFlow7EditPart(view);
			case EMPAssFlow8EditPart.VISUAL_ID:
				return new EMPAssFlow8EditPart(view);
			case EMPAssFlow9EditPart.VISUAL_ID:
				return new EMPAssFlow9EditPart(view);
			case EMPAssFlow10EditPart.VISUAL_ID:
				return new EMPAssFlow10EditPart(view);
			case EMPAssFlow11EditPart.VISUAL_ID:
				return new EMPAssFlow11EditPart(view);
			case EMPAssFlow12EditPart.VISUAL_ID:
				return new EMPAssFlow12EditPart(view);
			case EMPAssFlow13EditPart.VISUAL_ID:
				return new EMPAssFlow13EditPart(view);
			case EMPAssFlow14EditPart.VISUAL_ID:
				return new EMPAssFlow14EditPart(view);
			case EMPAssFlow15EditPart.VISUAL_ID:
				return new EMPAssFlow15EditPart(view);
			case EMPAssFlow16EditPart.VISUAL_ID:
				return new EMPAssFlow16EditPart(view);
			case EMPDataFlow2EditPart.VISUAL_ID:
				return new EMPDataFlow2EditPart(view);
			case EMPDataFlow3EditPart.VISUAL_ID:
				return new EMPDataFlow3EditPart(view);
			case EMPDataFlow4EditPart.VISUAL_ID:
				return new EMPDataFlow4EditPart(view);
			case EMPDataFlow5EditPart.VISUAL_ID:
				return new EMPDataFlow5EditPart(view);
			case EMPDataFlow6EditPart.VISUAL_ID:
				return new EMPDataFlow6EditPart(view);
			case EMPDataFlow7EditPart.VISUAL_ID:
				return new EMPDataFlow7EditPart(view);
			case EMPDataFlow8EditPart.VISUAL_ID:
				return new EMPDataFlow8EditPart(view);
			case EMPDataFlow9EditPart.VISUAL_ID:
				return new EMPDataFlow9EditPart(view);
			case EMPDataFlow10EditPart.VISUAL_ID:
				return new EMPDataFlow10EditPart(view);
			case EMPDataFlow11EditPart.VISUAL_ID:
				return new EMPDataFlow11EditPart(view);
			case EMPDataFlow12EditPart.VISUAL_ID:
				return new EMPDataFlow12EditPart(view);
			case EMPDataFlow13EditPart.VISUAL_ID:
				return new EMPDataFlow13EditPart(view);
			case EMPDataFlow14EditPart.VISUAL_ID:
				return new EMPDataFlow14EditPart(view);
			case EMPDataFlow15EditPart.VISUAL_ID:
				return new EMPDataFlow15EditPart(view);
			case EMPDataFlow16EditPart.VISUAL_ID:
				return new EMPDataFlow16EditPart(view);
			case EMPDataFlow17EditPart.VISUAL_ID:
				return new EMPDataFlow17EditPart(view);
			case EMPDataFlow18EditPart.VISUAL_ID:
				return new EMPDataFlow18EditPart(view);
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
