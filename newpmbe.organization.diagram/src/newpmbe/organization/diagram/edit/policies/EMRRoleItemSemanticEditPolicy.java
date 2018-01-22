package newpmbe.organization.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;
import newpmbe.organization.diagram.providers.NewPMBEElementTypes;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;

import vpml.organizationpackage.EMOAssociationRelation;
import vpml.organizationpackage.EMODiagram;
import vpml.organizationpackage.EMOResourceGroupType;
//import vpml.organizationpackage.EMOGroupType;
import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.resourcepackage.EMRRole;

/**
 * @generated
 */
public class EMRRoleItemSemanticEditPolicy extends
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
		if (NewPMBEElementTypes.EMOAssociationRelation_4003 == req
				.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMOAssociationRelation4003Command(req)
					: getCreateCompleteIncomingEMOAssociationRelation4003Command(req);
		}
		if (NewPMBEElementTypes.EMOAssociationRelation_4004 == req
				.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMOAssociationRelation4004Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMOAssociationRelation_4005 == req
				.getElementType()) {
			return req.getTarget() == null ? null
					: getCreateCompleteIncomingEMOAssociationRelation4005Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMOAssociationRelation4003Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMOAssociationRelation4003Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof EMRRole)) {
			return UnexecutableCommand.INSTANCE;
		}
		final EMODiagram element = (EMODiagram) getRelationshipContainer(req
				.getSource(), OrganizationpackagePackage.eINSTANCE
				.getEMODiagram(), req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(OrganizationpackagePackage.eINSTANCE
					.getEMODiagram_AssociationRelations());
		}
		return getMSLWrapper(new CreateIncomingEMOAssociationRelation4003Command(
				req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMOAssociationRelation4003Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMOAssociationRelation4003Command(
				CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return OrganizationpackagePackage.eINSTANCE.getEMODiagram();
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
			EMOAssociationRelation newElement = (EMOAssociationRelation) super
					.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setTargetRole((EMRRole) getTarget());
				newElement.setSourceRole((EMRRole) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMOAssociationRelation4004Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMOAssociationRelation4005Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof EMOResourceGroupType)) {
			return UnexecutableCommand.INSTANCE;
		}
		final EMODiagram element = (EMODiagram) getRelationshipContainer(req
				.getSource(), OrganizationpackagePackage.eINSTANCE
				.getEMODiagram(), req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(OrganizationpackagePackage.eINSTANCE
					.getEMODiagram_AssociationRelations());
		}
		return getMSLWrapper(new CreateIncomingEMOAssociationRelation4005Command(
				req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMOAssociationRelation4005Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMOAssociationRelation4005Command(
				CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return OrganizationpackagePackage.eINSTANCE.getEMODiagram();
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
			EMOAssociationRelation newElement = (EMOAssociationRelation) super
					.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setTargetRole((EMRRole) getTarget());
				newElement
						.setSourceGroupType((EMOResourceGroupType) getSource());
			}
			return newElement;
		}
	}
}
