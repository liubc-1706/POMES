package newpmbe.organization.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import newpmbe.organization.diagram.edit.policies.EMODiagramCanonicalEditPolicy;
import newpmbe.organization.diagram.edit.policies.EMODiagramItemSemanticEditPolicy;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;

/**
 * @generated
 */
public class EMODiagramEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "neworganization"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public EMODiagramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EMODiagramItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new EMODiagramCanonicalEditPolicy());
		//½ûÓÃPopupBar
		removeEditPolicy(EditPolicyRoles.POPUPBAR_ROLE);
		//½ûÓÃConnectionHandler
		removeEditPolicy(EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}
}
