package newpmbe.resource.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import newpmbe.resource.diagram.edit.policies.EMRDiagramCanonicalEditPolicy;
import newpmbe.resource.diagram.edit.policies.EMRDiagramItemSemanticEditPolicy;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;

/**
 * @generated
 */
public class EMRDiagramEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "newresource"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public EMRDiagramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EMRDiagramItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new EMRDiagramCanonicalEditPolicy());
		//½ûÓÃPopupBar
		removeEditPolicy(EditPolicyRoles.POPUPBAR_ROLE);
		//½ûÓÃConnectionHandler
		removeEditPolicy(EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}
}
