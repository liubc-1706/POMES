package newpmbe.process.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;
import newpmbe.process.diagram.providers.NewPMBEElementTypes;

/**
 * @generated
 */
public class EMRLocationTypeItemSemanticEditPolicy extends
		NewPMBEBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getMSLWrapper(new DestroyElementCommand(req) {

			protected EObject getElementToDestroy() {
				View view = (View) getHost().getModel();
				EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
				if (annotation != null) {
					return view;
				}
				return super.getElementToDestroy();
			}

		});
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (NewPMBEElementTypes.EMPAssFlow_4015 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPAssFlow4015Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPAssFlow_4025 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPAssFlow4025Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPAssFlow_4026 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPAssFlow4026Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPAssFlow_4027 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPAssFlow4027Command(req)
					: null;
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPAssFlow4015Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPAssFlow4025Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPAssFlow4026Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPAssFlow4027Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}
}
