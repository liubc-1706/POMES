package newpmbe.resource.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import newpmbe.resource.diagram.providers.NewPMBEElementTypes;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

import vpml.resourcepackage.ResourcepackagePackage;

/**
 * @generated
 */
public class EMRDiagramItemSemanticEditPolicy extends
		NewPMBEBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (NewPMBEElementTypes.EMRAbstractToolType_2009 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ResourcepackagePackage.eINSTANCE
						.getEMRDiagram_AbstractToolTypes());
			}
			return getMSLWrapper(new CreateEMRAbstractToolType_2009Command(req));
		}
		if (NewPMBEElementTypes.EMRAbstractLocationType_2010 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ResourcepackagePackage.eINSTANCE
						.getEMRDiagram_AbstractLocationTypes());
			}
			return getMSLWrapper(new CreateEMRAbstractLocationType_2010Command(
					req));
		}
		if (NewPMBEElementTypes.EMRAbstractMachineType_2011 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ResourcepackagePackage.eINSTANCE
						.getEMRDiagram_AbstractMachineTypes());
			}
			return getMSLWrapper(new CreateEMRAbstractMachineType_2011Command(
					req));
		}
		if (NewPMBEElementTypes.EMRLocationType_2012 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ResourcepackagePackage.eINSTANCE
						.getEMRDiagram_LocationTypes());
			}
			return getMSLWrapper(new CreateEMRLocationType_2012Command(req));
		}
		if (NewPMBEElementTypes.EMRMachineType_2013 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ResourcepackagePackage.eINSTANCE
						.getEMRDiagram_MachineTypes());
			}
			return getMSLWrapper(new CreateEMRMachineType_2013Command(req));
		}
		if (NewPMBEElementTypes.EMRToolType_2014 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ResourcepackagePackage.eINSTANCE
						.getEMRDiagram_ToolTypes());
			}
			return getMSLWrapper(new CreateEMRToolType_2014Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	private static class CreateEMRAbstractToolType_2009Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMRAbstractToolType_2009Command(CreateElementRequest req) {
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
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest())
					.getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateEMRAbstractLocationType_2010Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMRAbstractLocationType_2010Command(
				CreateElementRequest req) {
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
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest())
					.getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateEMRAbstractMachineType_2011Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMRAbstractMachineType_2011Command(CreateElementRequest req) {
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
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest())
					.getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateEMRLocationType_2012Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMRLocationType_2012Command(CreateElementRequest req) {
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
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest())
					.getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateEMRMachineType_2013Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMRMachineType_2013Command(CreateElementRequest req) {
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
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest())
					.getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateEMRToolType_2014Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMRToolType_2014Command(CreateElementRequest req) {
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
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest())
					.getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getMSLWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}
	}
}
