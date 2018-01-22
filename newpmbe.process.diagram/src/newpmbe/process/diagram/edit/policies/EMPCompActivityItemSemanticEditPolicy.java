package newpmbe.process.diagram.edit.policies;

import java.util.Map;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;

import newpmbe.process.diagram.navigator.NewPMBENavigatorContentProvider;
import newpmbe.process.diagram.providers.NewPMBEElementTypes;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;

import vpml.organizationpackage.EMOResourceGroupType;

//import vpml.organizationpackage.EMOGroupType;

import vpml.processpackage.EMPActivity;
import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPClock;
import vpml.processpackage.EMPClockFlow;
import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPInAnd;
import vpml.processpackage.EMPInOr;
import vpml.processpackage.EMPProduct;
import vpml.processpackage.EMPRefFlow;
import vpml.processpackage.ProcesspackagePackage;

import newpmbe.process.diagram.coherence.CompFileManager;

/**
 * @generated
 */
public class EMPCompActivityItemSemanticEditPolicy extends
		NewPMBEBaseItemSemanticEditPolicy {

	/**
	 * @generated NOT
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getMSLWrapper(new DestroyElementCommand(req) {

			protected EObject getElementToDestroy() {
				View view = (View) getHost().getModel();
				EMPCompActivity compActivity = (EMPCompActivity) view
						.getElement();
				CompFileManager fileManager = CompFileManager.getInstance();
				//				Map<EMPCompActivity, IFile> comp2FileMap = fileManager.getComp2FileMap();
				IFile file = fileManager.searchFileFromProject(compActivity,
						compActivity.getName());
				if (file != null) {
					IContainer container = file.getParent();
					try {
						fileManager.closeEditors(container);
						container.delete(true, null);
						fileManager.removeNotificationListener(compActivity);
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
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
		if (NewPMBEElementTypes.EMPClockFlow_4001 == req.getElementType()) {
			return req.getTarget() == null ? null
					: getCreateCompleteIncomingEMPClockFlow4001Command(req);
		}
		if (NewPMBEElementTypes.EMPRefFlow_4004 == req.getElementType()) {
			return req.getTarget() == null ? null
					: getCreateCompleteIncomingEMPRefFlow4004Command(req);
		}
		if (NewPMBEElementTypes.EMPDataFlow_4002 == req.getElementType()) {
			return req.getTarget() == null ? null
					: getCreateCompleteIncomingEMPDataFlow4002Command(req);
		}
		if (NewPMBEElementTypes.EMPAssFlow_4007 == req.getElementType()) {
			return req.getTarget() == null ? null
					: getCreateCompleteIncomingEMPAssFlow4007Command(req);
		}
		if (NewPMBEElementTypes.EMPDataFlow_4005 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPDataFlow4005Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPDataFlow_4018 == req.getElementType()) {
			return req.getTarget() == null ? null
					: getCreateCompleteIncomingEMPDataFlow4018Command(req);
		}
		if (NewPMBEElementTypes.EMPDataFlow_4019 == req.getElementType()) {
			return req.getTarget() == null ? null
					: getCreateCompleteIncomingEMPDataFlow4019Command(req);
		}
		if (NewPMBEElementTypes.EMPDataFlow_4020 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPDataFlow4020Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPDataFlow_4021 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPDataFlow4021Command(req)
					: null;
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMPClockFlow4001Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof EMPClock)) {
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
					.getEMPDiagram_ClockFlows());
		}
		return getMSLWrapper(new CreateIncomingEMPClockFlow4001Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMPClockFlow4001Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMPClockFlow4001Command(
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
			EMPClockFlow newElement = (EMPClockFlow) super
					.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setActivity((EMPActivity) getTarget());
				newElement.setClock((EMPClock) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMPRefFlow4004Command(
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
					.getEMPDiagram_RefFlows());
		}
		return getMSLWrapper(new CreateIncomingEMPRefFlow4004Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMPRefFlow4004Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMPRefFlow4004Command(CreateRelationshipRequest req) {
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
			EMPRefFlow newElement = (EMPRefFlow) super
					.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setActivity((EMPActivity) getTarget());
				newElement.setProduct((EMPProduct) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMPDataFlow4002Command(
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
		return getMSLWrapper(new CreateIncomingEMPDataFlow4002Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMPDataFlow4002Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMPDataFlow4002Command(
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
				newElement.setTargetActivity((EMPActivity) getTarget());
				newElement.setSourceProduct((EMPProduct) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMPAssFlow4007Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof EMOResourceGroupType)) {
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
					.getEMPDiagram_AssFlows());
		}
		return getMSLWrapper(new CreateIncomingEMPAssFlow4007Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMPAssFlow4007Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMPAssFlow4007Command(CreateRelationshipRequest req) {
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
			EMPAssFlow newElement = (EMPAssFlow) super
					.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setCompActivity((EMPCompActivity) getTarget());
				newElement
						.setResourceGroupType((EMOResourceGroupType) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPDataFlow4005Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMPDataFlow4018Command(
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
		return getMSLWrapper(new CreateIncomingEMPDataFlow4018Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMPDataFlow4018Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMPDataFlow4018Command(
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
				newElement.setTargetActivity((EMPActivity) getTarget());
				newElement.setSourceInAnd((EMPInAnd) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMPDataFlow4019Command(
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
		return getMSLWrapper(new CreateIncomingEMPDataFlow4019Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMPDataFlow4019Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMPDataFlow4019Command(
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
				newElement.setTargetActivity((EMPActivity) getTarget());
				newElement.setSourceInOr((EMPInOr) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPDataFlow4020Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPDataFlow4021Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}
}
