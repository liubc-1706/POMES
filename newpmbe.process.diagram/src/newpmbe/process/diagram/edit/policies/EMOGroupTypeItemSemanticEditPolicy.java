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
public class EMOGroupTypeItemSemanticEditPolicy extends
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
		if (NewPMBEElementTypes.EMPAssFlow_4007 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPAssFlow4007Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPAssFlow_4008 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPAssFlow4008Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPAssFlow_4009 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPAssFlow4009Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPAssFlow_4010 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPAssFlow4010Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPAssFlow_4011 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPAssFlow4011Command(req)
					: null;
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPAssFlow4007Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPAssFlow4008Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPAssFlow4009Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPAssFlow4010Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPAssFlow4011Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}
}
