package newpmbe.product.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import newpmbe.product.diagram.providers.NewPMBEElementTypes;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

import vpml.processpackage.ProcesspackagePackage;

/**
 * @generated
 */
public class EMPDiagramItemSemanticEditPolicy extends
		NewPMBEBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (NewPMBEElementTypes.EMPArtifact_2001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_Artifacts());
			}
			return getMSLWrapper(new CreateEMPArtifact_2001Command(req));
		}
		if (NewPMBEElementTypes.EMPDocument_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_Documents());
			}
			return getMSLWrapper(new CreateEMPDocument_2002Command(req));
		}
		if (NewPMBEElementTypes.EMPMessage_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_Messages());
			}
			return getMSLWrapper(new CreateEMPMessage_2003Command(req));
		}
		if (NewPMBEElementTypes.EMPOther_2004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_Others());
			}
			return getMSLWrapper(new CreateEMPOther_2004Command(req));
		}
		if (NewPMBEElementTypes.EMPProductPackage_2005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_ProductPackages());
			}
			return getMSLWrapper(new CreateEMPProductPackage_2005Command(req));
		}
		if (NewPMBEElementTypes.EMPForm_2006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_Forms());
			}
			return getMSLWrapper(new CreateEMPForm_2006Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	private static class CreateEMPArtifact_2001Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPArtifact_2001Command(CreateElementRequest req) {
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
	private static class CreateEMPDocument_2002Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPDocument_2002Command(CreateElementRequest req) {
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
	private static class CreateEMPMessage_2003Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPMessage_2003Command(CreateElementRequest req) {
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
	private static class CreateEMPOther_2004Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPOther_2004Command(CreateElementRequest req) {
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
	private static class CreateEMPProductPackage_2005Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPProductPackage_2005Command(CreateElementRequest req) {
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
	private static class CreateEMPForm_2006Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPForm_2006Command(CreateElementRequest req) {
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
