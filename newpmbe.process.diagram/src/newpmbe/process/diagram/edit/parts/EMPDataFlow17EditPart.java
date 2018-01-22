package newpmbe.process.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import newpmbe.process.diagram.edit.policies.EMPDataFlow17ItemSemanticEditPolicy;

import org.eclipse.draw2d.Connection;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;

/**
 * @generated
 */
public class EMPDataFlow17EditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4036;

	/**
	 * @generated
	 */
	public EMPDataFlow17EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EMPDataFlow17ItemSemanticEditPolicy());

	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected Connection createConnectionFigure() {
		return new DataFlow();
	}

	/**
	 * @generated
	 */
	public class DataFlow extends
			org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx {

		/**
		 * @generated
		 */
		public DataFlow() {
			this.setFill(true);
			this.setFillXOR(false);
			this.setOutline(true);
			this.setOutlineXOR(false);
			this.setLineWidth(1);
			this.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);
			this.setForegroundColor(org.eclipse.draw2d.ColorConstants.black);
			this.setBackgroundColor(org.eclipse.draw2d.ColorConstants.black);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RotatableDecoration createTargetDecoration() {
			org.eclipse.draw2d.PolylineDecoration df = new org.eclipse.draw2d.PolylineDecoration();
			df.setFill(true);
			df.setFillXOR(true);
			df.setOutline(true);
			df.setOutlineXOR(true);
			df.setLineWidth(2);
			df.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);
			org.eclipse.draw2d.geometry.PointList pl = new org.eclipse.draw2d.geometry.PointList();
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(1));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(-1));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

	}

}
