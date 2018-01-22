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
public class EMRMachineTypeItemSemanticEditPolicy extends
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
		if (NewPMBEElementTypes.EMPAssFlow_4006 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPAssFlow4006Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPAssFlow_4012 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPAssFlow4012Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPAssFlow_4013 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPAssFlow4013Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPAssFlow_4014 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPAssFlow4014Command(req)
					: null;
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPAssFlow4006Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPAssFlow4012Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPAssFlow4013Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPAssFlow4014Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}
}
