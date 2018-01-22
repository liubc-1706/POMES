package newpmbe.process.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;
import newpmbe.process.diagram.providers.NewPMBEElementTypes;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;

import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPInAnd;
import vpml.processpackage.EMPInOr;
import vpml.processpackage.EMPProduct;
import vpml.processpackage.ProcesspackagePackage;

/**
 * @generated
 */
public class EMPInAndItemSemanticEditPolicy extends
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
		if (NewPMBEElementTypes.EMPDataFlow_4016 == req.getElementType()) {
			return req.getTarget() == null ? null
					: getCreateCompleteIncomingEMPDataFlow4016Command(req);
		}
		if (NewPMBEElementTypes.EMPDataFlow_4018 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPDataFlow4018Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPDataFlow_4034 == req.getElementType()) {
			return req.getTarget() == null ? null
					: getCreateCompleteIncomingEMPDataFlow4034Command(req);
		}
		if (NewPMBEElementTypes.EMPDataFlow_4036 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPDataFlow4036Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPDataFlow_4037 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPDataFlow4037Command(req)
					: getCreateCompleteIncomingEMPDataFlow4037Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMPDataFlow4016Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof EMPProduct)) {
			return UnexecutableCommand.INSTANCE;
		}
		final EMPDiagram element = (EMPDiagram) getRelationshipContainer(req
				.getSource(), ProcesspackagePackage.eINSTANCE.getEMPDiagram(),
				req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
					.getEMPDiagram_DataFlows());
		}
		return getMSLWrapper(new CreateIncomingEMPDataFlow4016Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMPDataFlow4016Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMPDataFlow4016Command(
				CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return ProcesspackagePackage.eINSTANCE.getEMPDiagram();
		};

		/**
		 * @generated
		 */
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			EMPDataFlow newElement = (EMPDataFlow) super
					.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setTargetInAnd((EMPInAnd) getTarget());
				newElement.setSourceProduct((EMPProduct) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPDataFlow4018Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMPDataFlow4034Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof EMPInOr)) {
			return UnexecutableCommand.INSTANCE;
		}
		final EMPDiagram element = (EMPDiagram) getRelationshipContainer(req
				.getSource(), ProcesspackagePackage.eINSTANCE.getEMPDiagram(),
				req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
					.getEMPDiagram_DataFlows());
		}
		return getMSLWrapper(new CreateIncomingEMPDataFlow4034Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMPDataFlow4034Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMPDataFlow4034Command(
				CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return ProcesspackagePackage.eINSTANCE.getEMPDiagram();
		};

		/**
		 * @generated
		 */
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			EMPDataFlow newElement = (EMPDataFlow) super
					.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setTargetInAnd((EMPInAnd) getTarget());
				newElement.setSourceInOr((EMPInOr) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPDataFlow4036Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPDataFlow4037Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMPDataFlow4037Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof EMPInAnd)) {
			return UnexecutableCommand.INSTANCE;
		}
		final EMPDiagram element = (EMPDiagram) getRelationshipContainer(req
				.getSource(), ProcesspackagePackage.eINSTANCE.getEMPDiagram(),
				req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
					.getEMPDiagram_DataFlows());
		}
		return getMSLWrapper(new CreateIncomingEMPDataFlow4037Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMPDataFlow4037Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMPDataFlow4037Command(
				CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return ProcesspackagePackage.eINSTANCE.getEMPDiagram();
		};

		/**
		 * @generated
		 */
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			EMPDataFlow newElement = (EMPDataFlow) super
					.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setTargetInAnd((EMPInAnd) getTarget());
				newElement.setSourceInAnd((EMPInAnd) getSource());
			}
			return newElement;
		}
	}
}
