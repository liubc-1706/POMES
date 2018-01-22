package newpmbe.resource.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;
import newpmbe.resource.diagram.providers.NewPMBEElementTypes;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;

import vpml.resourcepackage.EMRAbstractLocationType;
import vpml.resourcepackage.EMRClassificationRelation;
//import vpml.resourcepackage.EMRClassificationRelationship;
import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * @generated
 */
public class EMRAbstractLocationTypeItemSemanticEditPolicy extends
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
		if (NewPMBEElementTypes.EMRClassificationRelation_4009 == req
				.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMRClassificationRelation4009Command(req)
					: getCreateCompleteIncomingEMRClassificationRelation4009Command(req);
		}
		if (NewPMBEElementTypes.EMRClassificationRelation_4010 == req
				.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMRClassificationRelation4010Command(req)
					: null;
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMRClassificationRelation4009Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMRClassificationRelation4009Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof EMRAbstractLocationType)) {
			return UnexecutableCommand.INSTANCE;
		}
		final EMRDiagram element = (EMRDiagram) getRelationshipContainer(req
				.getSource(), ResourcepackagePackage.eINSTANCE.getEMRDiagram(),
				req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(ResourcepackagePackage.eINSTANCE
					.getEMRDiagram_ClassificationRelations());
		}
		return getMSLWrapper(new CreateIncomingEMRClassificationRelation4009Command(
				req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMRClassificationRelation4009Command
			extends CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMRClassificationRelation4009Command(
				CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return ResourcepackagePackage.eINSTANCE.getEMRDiagram();
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
			EMRClassificationRelation newElement = (EMRClassificationRelation) super
					.doDefaultElementCreation();
			if (newElement != null) {
				newElement
						.setTargetAbsLocationType((EMRAbstractLocationType) getTarget());
				newElement
						.setSourceAbsLocationType((EMRAbstractLocationType) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMRClassificationRelation4010Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}
}
