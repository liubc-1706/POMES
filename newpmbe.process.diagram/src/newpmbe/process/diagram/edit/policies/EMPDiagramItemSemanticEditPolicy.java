package newpmbe.process.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import java.util.Collection;

import newpmbe.process.diagram.providers.NewPMBEElementTypes;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

import vpml.processpackage.ProcesspackagePackage;

import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.EMRLocationType;
import vpml.resourcepackage.EMRMachineType;

/**
 * @generated
 */
public class EMPDiagramItemSemanticEditPolicy extends
		NewPMBEBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (NewPMBEElementTypes.EMPAutoBatchActivity_2048 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_AutoBatchActivities());
			}
			return getMSLWrapper(new CreateEMPAutoBatchActivity_2048Command(req));
		}
		if (NewPMBEElementTypes.EMPOutOr_2024 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_OutOrs());
			}
			return getMSLWrapper(new CreateEMPOutOr_2024Command(req));
		}
		if (NewPMBEElementTypes.EMPDocument_2025 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_Documents());
			}
			return getMSLWrapper(new CreateEMPDocument_2025Command(req));
		}
		if (NewPMBEElementTypes.EMPProductPackage_2026 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_ProductPackages());
			}
			return getMSLWrapper(new CreateEMPProductPackage_2026Command(req));
		}
		if (NewPMBEElementTypes.EMPNormalActivity_2044 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_NormalActivities());
			}
			return getMSLWrapper(new CreateEMPNormalActivity_2044Command(req));
		}
		if (NewPMBEElementTypes.EMPOther_2028 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_Others());
			}
			return getMSLWrapper(new CreateEMPOther_2028Command(req));
		}
		if (NewPMBEElementTypes.EMPMessage_2029 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_Messages());
			}
			return getMSLWrapper(new CreateEMPMessage_2029Command(req));
		}
		if (NewPMBEElementTypes.EMPCompActivity_2045 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_CompActivities());
			}
			return getMSLWrapper(new CreateEMPCompActivity_2045Command(req));
		}
		if (NewPMBEElementTypes.EMPOutAnd_2031 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_OutAnds());
			}
			return getMSLWrapper(new CreateEMPOutAnd_2031Command(req));
		}
		if (NewPMBEElementTypes.EMPManualBatchActivity_2046 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_ManualBatchActivities());
			}
			return getMSLWrapper(new CreateEMPManualBatchActivity_2046Command(
					req));
		}
		if (NewPMBEElementTypes.EMPClock_2033 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_Clocks());
			}
			return getMSLWrapper(new CreateEMPClock_2033Command(req));
		}
		if (NewPMBEElementTypes.EMPInAnd_2034 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_InAnds());
			}
			return getMSLWrapper(new CreateEMPInAnd_2034Command(req));
		}
		if (NewPMBEElementTypes.EMPInOr_2035 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_InOrs());
			}
			return getMSLWrapper(new CreateEMPInOr_2035Command(req));
		}
		if (NewPMBEElementTypes.EMPAutoActivity_2047 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_AutoActivities());
			}
			return getMSLWrapper(new CreateEMPAutoActivity_2047Command(req));
		}
		if (NewPMBEElementTypes.EMPArtifact_2037 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_Artifacts());
			}
			return getMSLWrapper(new CreateEMPArtifact_2037Command(req));
		}
		if (NewPMBEElementTypes.EMOResourceGroupType_2038 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_ResourceGroupTypes());
			}
			return getMSLWrapper(new CreateEMOResourceGroupType_2038Command(req));
		}
		if (NewPMBEElementTypes.EMRToolType_2039 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_ToolTypes());
			}
			return getMSLWrapper(new CreateEMRToolType_2039Command(req));
		}
		if (NewPMBEElementTypes.EMRRole_2040 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_Roles());
			}
			return getMSLWrapper(new CreateEMRRole_2040Command(req));
		}
		if (NewPMBEElementTypes.EMRMachineType_2041 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_MachineTypes());
			}
			return getMSLWrapper(new CreateEMRMachineType_2041Command(req));
		}
		if (NewPMBEElementTypes.EMRLocationType_2042 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_LocationTypes());
			}
			return getMSLWrapper(new CreateEMRLocationType_2042Command(req));
		}
		if (NewPMBEElementTypes.EMPForm_2049 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
						.getEMPDiagram_Forms());
			}
			return getMSLWrapper(new CreateEMPForm_2049Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	private static class CreateEMPAutoBatchActivity_2048Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPAutoBatchActivity_2048Command(CreateElementRequest req) {
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
	private static class CreateEMPOutOr_2024Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPOutOr_2024Command(CreateElementRequest req) {
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
	private static class CreateEMPDocument_2025Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPDocument_2025Command(CreateElementRequest req) {
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
	private static class CreateEMPProductPackage_2026Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPProductPackage_2026Command(CreateElementRequest req) {
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
	private static class CreateEMPNormalActivity_2044Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPNormalActivity_2044Command(CreateElementRequest req) {
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
	private static class CreateEMPOther_2028Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPOther_2028Command(CreateElementRequest req) {
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
	private static class CreateEMPMessage_2029Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPMessage_2029Command(CreateElementRequest req) {
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
	private static class CreateEMPCompActivity_2045Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPCompActivity_2045Command(CreateElementRequest req) {
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
	private static class CreateEMPOutAnd_2031Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPOutAnd_2031Command(CreateElementRequest req) {
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
	private static class CreateEMPManualBatchActivity_2046Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPManualBatchActivity_2046Command(CreateElementRequest req) {
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
	private static class CreateEMPClock_2033Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPClock_2033Command(CreateElementRequest req) {
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
	private static class CreateEMPInAnd_2034Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPInAnd_2034Command(CreateElementRequest req) {
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
	private static class CreateEMPInOr_2035Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPInOr_2035Command(CreateElementRequest req) {
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
	private static class CreateEMPAutoActivity_2047Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPAutoActivity_2047Command(CreateElementRequest req) {
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
	private static class CreateEMPArtifact_2037Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPArtifact_2037Command(CreateElementRequest req) {
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
	private static class CreateEMOResourceGroupType_2038Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMOResourceGroupType_2038Command(CreateElementRequest req) {
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
	private static class CreateEMRToolType_2039Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMRToolType_2039Command(CreateElementRequest req) {
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
	private static class CreateEMRRole_2040Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMRRole_2040Command(CreateElementRequest req) {
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
	private static class CreateEMRMachineType_2041Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMRMachineType_2041Command(CreateElementRequest req) {
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
	private static class CreateEMRLocationType_2042Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMRLocationType_2042Command(CreateElementRequest req) {
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
	private static class CreateEMPForm_2049Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEMPForm_2049Command(CreateElementRequest req) {
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
