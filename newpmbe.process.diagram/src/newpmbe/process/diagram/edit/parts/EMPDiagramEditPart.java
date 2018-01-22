package newpmbe.process.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import newpmbe.process.diagram.comActRefresher.CompActivityRefresher;
import newpmbe.process.diagram.edit.policies.EMPDiagramCanonicalEditPolicy;
import newpmbe.process.diagram.edit.policies.EMPDiagramItemSemanticEditPolicy;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;

/**
 * @generated
 */
public class EMPDiagramEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Newprocess"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated NOT
	 */
	public EMPDiagramEditPart(View view) {
		super(view);
		//		//给DataFlow添加监听器 hzg
		//		CompActivityRefresher refresher = CompActivityRefresher.getInstance();
		//		Object object=view.getElement();
		//
		//		refresher.addNotificationListener(view.getElement().getCompActivities());

	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EMPDiagramItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new EMPDiagramCanonicalEditPolicy());
		//禁用PopupBar
		removeEditPolicy(EditPolicyRoles.POPUPBAR_ROLE);
		//禁用ConnectionHandler
		removeEditPolicy(EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}
}
