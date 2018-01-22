package newpmbe.process.diagram.part;

import newpmbe.process.diagram.edit.parts.EMOResourceGroupTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMOResourceGroupTypeNameEditPart;
//import newpmbe.process.diagram.edit.parts.EMOGroupTypeEditPart;
//import newpmbe.process.diagram.edit.parts.EMOGroupTypeNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPArtifactEditPart;
import newpmbe.process.diagram.edit.parts.EMPArtifactNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPArtifactNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow10EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow11EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow12EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow13EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow14EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow15EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow16EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow2EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow3EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow4EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow5EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow6EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow7EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow8EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow9EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlowEditPart;
import newpmbe.process.diagram.edit.parts.EMPAutoActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPAutoActivityNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPAutoBatchActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPAutoBatchActivityNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPClockEditPart;
import newpmbe.process.diagram.edit.parts.EMPClockFlowEditPart;
import newpmbe.process.diagram.edit.parts.EMPClockNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPCompActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPCompActivityNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow10EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow11EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow12EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow13EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow14EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow15EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow16EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow17EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow18EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow2EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow3EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow4EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow5EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow6EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow7EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow8EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow9EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlowEditPart;
import newpmbe.process.diagram.edit.parts.EMPDiagramEditPart;
import newpmbe.process.diagram.edit.parts.EMPDocumentEditPart;
import newpmbe.process.diagram.edit.parts.EMPDocumentNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPFormEditPart;
import newpmbe.process.diagram.edit.parts.EMPFormNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPInAndEditPart;

import newpmbe.process.diagram.edit.parts.EMPInOrEditPart;

import newpmbe.process.diagram.edit.parts.EMPManualBatchActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPManualBatchActivityNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPMessageEditPart;
import newpmbe.process.diagram.edit.parts.EMPMessageNameEditPart;
//import newpmbe.process.diagram.edit.parts.EMPMileStoneEditPart;
//import newpmbe.process.diagram.edit.parts.EMPMileStoneNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPNormalActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPNormalActivityNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPOtherEditPart;
import newpmbe.process.diagram.edit.parts.EMPOtherNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPOutAndEditPart;

import newpmbe.process.diagram.edit.parts.EMPOutOrEditPart;

import newpmbe.process.diagram.edit.parts.EMPProductPackageEditPart;
import newpmbe.process.diagram.edit.parts.EMPProductPackageNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPRefFlowEditPart;
import newpmbe.process.diagram.edit.parts.EMRLocationTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMRLocationTypeNameEditPart;
import newpmbe.process.diagram.edit.parts.EMRMachineTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMRMachineTypeNameEditPart;
import newpmbe.process.diagram.edit.parts.EMRRoleEditPart;
import newpmbe.process.diagram.edit.parts.EMRRoleNameEditPart;
import newpmbe.process.diagram.edit.parts.EMRToolTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMRToolTypeNameEditPart;

import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import vpml.organizationpackage.EMOResourceGroupType;
//import vpml.organizationpackage.EMOGroupType;
import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.processpackage.EMPArtifact;
import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPAutoActivity;
import vpml.processpackage.EMPAutoBatchActivity;
import vpml.processpackage.EMPClock;
import vpml.processpackage.EMPClockFlow;
import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPDocument;
import vpml.processpackage.EMPForm;
import vpml.processpackage.EMPInAnd;
import vpml.processpackage.EMPInOr;
import vpml.processpackage.EMPManualBatchActivity;
import vpml.processpackage.EMPMessage;
import vpml.processpackage.EMPMileStone;
import vpml.processpackage.EMPNormalActivity;
import vpml.processpackage.EMPOther;
import vpml.processpackage.EMPOutAnd;
import vpml.processpackage.EMPOutOr;
import vpml.processpackage.EMPProductPackage;
import vpml.processpackage.EMPRefFlow;
import vpml.processpackage.ProcesspackagePackage;

import vpml.resourcepackage.EMRLocationType;
import vpml.resourcepackage.EMRMachineType;
import vpml.resourcepackage.EMRRole;
import vpml.resourcepackage.EMRToolType;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented 
 * by a domain model object.
 *
 * @generated
 */
public class NewPMBEVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = NewPMBEDiagramEditorPlugin
			.getInstance().getBundle().getSymbolicName()
			+ "/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (EMPDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return EMPDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				NewPMBEDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getDiagramVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	private static int getDiagramVisualID(EObject domainElement,
			EClass domainElementMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				domainElementMetaclass)
				&& isDiagramEMPDiagram_1000((EMPDiagram) domainElement)) {
			return EMPDiagramEditPart.VISUAL_ID;
		}
		return getUnrecognizedDiagramID(domainElement);
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getNodeVisualID(containerView, domainElement,
				domainElementMetaclass, null);
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView,
			EObject domainElement, EClass domainElementMetaclass,
			String semanticHint) {
		String containerModelID = getModelID(containerView);
		if (!EMPDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (EMPDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EMPDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		int nodeVisualID = semanticHint != null ? getVisualID(semanticHint)
				: -1;
		switch (containerVisualID) {
		case EMPAutoBatchActivityEditPart.VISUAL_ID:
			if (EMPAutoBatchActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPAutoBatchActivityNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPAutoBatchActivity_2048ChildNodeID(
					domainElement, semanticHint);
		case EMPOutOrEditPart.VISUAL_ID:
			return getUnrecognizedEMPOutOr_2024ChildNodeID(domainElement,
					semanticHint);
		case EMPDocumentEditPart.VISUAL_ID:
			if (EMPDocumentNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPDocumentNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPDocument_2025ChildNodeID(domainElement,
					semanticHint);
		case EMPProductPackageEditPart.VISUAL_ID:
			if (EMPProductPackageNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPProductPackageNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPProductPackage_2026ChildNodeID(
					domainElement, semanticHint);
		case EMPNormalActivityEditPart.VISUAL_ID:
			if (EMPNormalActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPNormalActivityNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPNormalActivity_2044ChildNodeID(
					domainElement, semanticHint);
		case EMPOtherEditPart.VISUAL_ID:
			if (EMPOtherNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPOtherNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPOther_2028ChildNodeID(domainElement,
					semanticHint);
		case EMPMessageEditPart.VISUAL_ID:
			if (EMPMessageNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPMessageNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPMessage_2029ChildNodeID(domainElement,
					semanticHint);
		case EMPCompActivityEditPart.VISUAL_ID:
			if (EMPCompActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPCompActivityNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPCompActivity_2045ChildNodeID(
					domainElement, semanticHint);
		case EMPOutAndEditPart.VISUAL_ID:
			return getUnrecognizedEMPOutAnd_2031ChildNodeID(domainElement,
					semanticHint);
		case EMPManualBatchActivityEditPart.VISUAL_ID:
			if (EMPManualBatchActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPManualBatchActivityNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPManualBatchActivity_2046ChildNodeID(
					domainElement, semanticHint);
		case EMPClockEditPart.VISUAL_ID:
			if (EMPClockNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPClockNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPClock_2033ChildNodeID(domainElement,
					semanticHint);
		case EMPInAndEditPart.VISUAL_ID:
			return getUnrecognizedEMPInAnd_2034ChildNodeID(domainElement,
					semanticHint);
		case EMPInOrEditPart.VISUAL_ID:
			return getUnrecognizedEMPInOr_2035ChildNodeID(domainElement,
					semanticHint);
		case EMPAutoActivityEditPart.VISUAL_ID:
			if (EMPAutoActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPAutoActivityNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPAutoActivity_2047ChildNodeID(
					domainElement, semanticHint);
		case EMPArtifactEditPart.VISUAL_ID:
			if (EMPArtifactNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPArtifactNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPArtifact_2037ChildNodeID(domainElement,
					semanticHint);
		case EMOResourceGroupTypeEditPart.VISUAL_ID:
			if (EMOResourceGroupTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMOResourceGroupTypeNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMOResourceGroupType_2038ChildNodeID(
					domainElement, semanticHint);
		case EMRToolTypeEditPart.VISUAL_ID:
			if (EMRToolTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMRToolTypeNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMRToolType_2039ChildNodeID(domainElement,
					semanticHint);
		case EMRRoleEditPart.VISUAL_ID:
			if (EMRRoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMRRoleNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMRRole_2040ChildNodeID(domainElement,
					semanticHint);
		case EMRMachineTypeEditPart.VISUAL_ID:
			if (EMRMachineTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMRMachineTypeNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMRMachineType_2041ChildNodeID(domainElement,
					semanticHint);
		case EMRLocationTypeEditPart.VISUAL_ID:
			if (EMRLocationTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMRLocationTypeNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMRLocationType_2042ChildNodeID(
					domainElement, semanticHint);
		case EMPFormEditPart.VISUAL_ID:
			if (EMPFormNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPFormNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPForm_2049ChildNodeID(domainElement,
					semanticHint);
		case EMPDiagramEditPart.VISUAL_ID:
			if ((semanticHint == null || EMPAutoBatchActivityEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE
							.getEMPAutoBatchActivity().isSuperTypeOf(
									domainElementMetaclass)
					&& (domainElement == null || isNodeEMPAutoBatchActivity_2048((EMPAutoBatchActivity) domainElement))) {
				return EMPAutoBatchActivityEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPOutOrEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPOutOr()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPOutOr_2024((EMPOutOr) domainElement))) {
				return EMPOutOrEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPDocumentEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPDocument()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPDocument_2025((EMPDocument) domainElement))) {
				return EMPDocumentEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPProductPackageEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPProductPackage()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPProductPackage_2026((EMPProductPackage) domainElement))) {
				return EMPProductPackageEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPNormalActivityEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPNormalActivity()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPNormalActivity_2044((EMPNormalActivity) domainElement))) {
				return EMPNormalActivityEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPOtherEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPOther()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPOther_2028((EMPOther) domainElement))) {
				return EMPOtherEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPMessageEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPMessage()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPMessage_2029((EMPMessage) domainElement))) {
				return EMPMessageEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPCompActivityEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPCompActivity()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPCompActivity_2045((EMPCompActivity) domainElement))) {
				return EMPCompActivityEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPOutAndEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPOutAnd()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPOutAnd_2031((EMPOutAnd) domainElement))) {
				return EMPOutAndEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPManualBatchActivityEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE
							.getEMPManualBatchActivity().isSuperTypeOf(
									domainElementMetaclass)
					&& (domainElement == null || isNodeEMPManualBatchActivity_2046((EMPManualBatchActivity) domainElement))) {
				return EMPManualBatchActivityEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPClockEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPClock()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPClock_2033((EMPClock) domainElement))) {
				return EMPClockEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPInAndEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPInAnd()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPInAnd_2034((EMPInAnd) domainElement))) {
				return EMPInAndEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPInOrEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPInOr()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPInOr_2035((EMPInOr) domainElement))) {
				return EMPInOrEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPAutoActivityEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPAutoActivity()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPAutoActivity_2047((EMPAutoActivity) domainElement))) {
				return EMPAutoActivityEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPArtifactEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPArtifact()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPArtifact_2037((EMPArtifact) domainElement))) {
				return EMPArtifactEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMOResourceGroupTypeEditPart.VISUAL_ID == nodeVisualID)
					&& OrganizationpackagePackage.eINSTANCE
							.getEMOResourceGroupType().isSuperTypeOf(
									domainElementMetaclass)
					&& (domainElement == null || isNodeEMOResourceGroupType_2038((EMOResourceGroupType) domainElement))) {
				return EMOResourceGroupTypeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMRToolTypeEditPart.VISUAL_ID == nodeVisualID)
					&& ResourcepackagePackage.eINSTANCE.getEMRToolType()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMRToolType_2039((EMRToolType) domainElement))) {
				return EMRToolTypeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMRRoleEditPart.VISUAL_ID == nodeVisualID)
					&& ResourcepackagePackage.eINSTANCE.getEMRRole()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMRRole_2040((EMRRole) domainElement))) {
				return EMRRoleEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMRMachineTypeEditPart.VISUAL_ID == nodeVisualID)
					&& ResourcepackagePackage.eINSTANCE.getEMRMachineType()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMRMachineType_2041((EMRMachineType) domainElement))) {
				return EMRMachineTypeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMRLocationTypeEditPart.VISUAL_ID == nodeVisualID)
					&& ResourcepackagePackage.eINSTANCE.getEMRLocationType()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMRLocationType_2042((EMRLocationType) domainElement))) {
				return EMRLocationTypeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPFormEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPForm()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPForm_2049((EMPForm) domainElement))) {
				return EMPFormEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPDiagram_1000ChildNodeID(domainElement,
					semanticHint);
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getLinkWithClassVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement,
			EClass domainElementMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPClockFlow().isSuperTypeOf(
				domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPClockFlow_4001((EMPClockFlow) domainElement))) {
			return EMPClockFlowEditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPAssFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPAssFlow_4003((EMPAssFlow) domainElement))) {
			return EMPAssFlowEditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPRefFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPRefFlow_4004((EMPRefFlow) domainElement))) {
			return EMPRefFlowEditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4002((EMPDataFlow) domainElement))) {
			return EMPDataFlowEditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPAssFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPAssFlow_4006((EMPAssFlow) domainElement))) {
			return EMPAssFlow2EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPAssFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPAssFlow_4007((EMPAssFlow) domainElement))) {
			return EMPAssFlow3EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPAssFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPAssFlow_4008((EMPAssFlow) domainElement))) {
			return EMPAssFlow4EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPAssFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPAssFlow_4009((EMPAssFlow) domainElement))) {
			return EMPAssFlow5EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPAssFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPAssFlow_4010((EMPAssFlow) domainElement))) {
			return EMPAssFlow6EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPAssFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPAssFlow_4011((EMPAssFlow) domainElement))) {
			return EMPAssFlow7EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPAssFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPAssFlow_4012((EMPAssFlow) domainElement))) {
			return EMPAssFlow8EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPAssFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPAssFlow_4013((EMPAssFlow) domainElement))) {
			return EMPAssFlow9EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPAssFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPAssFlow_4014((EMPAssFlow) domainElement))) {
			return EMPAssFlow10EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPAssFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPAssFlow_4015((EMPAssFlow) domainElement))) {
			return EMPAssFlow11EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPAssFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPAssFlow_4025((EMPAssFlow) domainElement))) {
			return EMPAssFlow12EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPAssFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPAssFlow_4026((EMPAssFlow) domainElement))) {
			return EMPAssFlow13EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPAssFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPAssFlow_4027((EMPAssFlow) domainElement))) {
			return EMPAssFlow14EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPAssFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPAssFlow_4028((EMPAssFlow) domainElement))) {
			return EMPAssFlow15EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPAssFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPAssFlow_4029((EMPAssFlow) domainElement))) {
			return EMPAssFlow16EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4005((EMPDataFlow) domainElement))) {
			return EMPDataFlow2EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4016((EMPDataFlow) domainElement))) {
			return EMPDataFlow3EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4017((EMPDataFlow) domainElement))) {
			return EMPDataFlow4EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4018((EMPDataFlow) domainElement))) {
			return EMPDataFlow5EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4019((EMPDataFlow) domainElement))) {
			return EMPDataFlow6EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4020((EMPDataFlow) domainElement))) {
			return EMPDataFlow7EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4021((EMPDataFlow) domainElement))) {
			return EMPDataFlow8EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4022((EMPDataFlow) domainElement))) {
			return EMPDataFlow9EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4023((EMPDataFlow) domainElement))) {
			return EMPDataFlow10EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4030((EMPDataFlow) domainElement))) {
			return EMPDataFlow11EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4031((EMPDataFlow) domainElement))) {
			return EMPDataFlow12EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4032((EMPDataFlow) domainElement))) {
			return EMPDataFlow13EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4033((EMPDataFlow) domainElement))) {
			return EMPDataFlow14EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4034((EMPDataFlow) domainElement))) {
			return EMPDataFlow15EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4035((EMPDataFlow) domainElement))) {
			return EMPDataFlow16EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4036((EMPDataFlow) domainElement))) {
			return EMPDataFlow17EditPart.VISUAL_ID;
		} else if (ProcesspackagePackage.eINSTANCE.getEMPDataFlow()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMPDataFlow_4037((EMPDataFlow) domainElement))) {
			return EMPDataFlow18EditPart.VISUAL_ID;
		} else {
			return getUnrecognizedLinkWithClassID(domainElement);
		}
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isDiagramEMPDiagram_1000(EMPDiagram element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDiagramID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPAutoBatchActivity_2048(
			EMPAutoBatchActivity element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPOutOr_2024(EMPOutOr element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPDocument_2025(EMPDocument element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPProductPackage_2026(
			EMPProductPackage element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPNormalActivity_2044(
			EMPNormalActivity element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPOther_2028(EMPOther element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPMessage_2029(EMPMessage element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPCompActivity_2045(EMPCompActivity element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPOutAnd_2031(EMPOutAnd element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPManualBatchActivity_2046(
			EMPManualBatchActivity element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPClock_2033(EMPClock element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPInAnd_2034(EMPInAnd element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPInOr_2035(EMPInOr element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPAutoActivity_2047(EMPAutoActivity element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPArtifact_2037(EMPArtifact element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMOResourceGroupType_2038(
			EMOResourceGroupType element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMRToolType_2039(EMRToolType element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMRRole_2040(EMRRole element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMRMachineType_2041(EMRMachineType element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMRLocationType_2042(EMRLocationType element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPForm_2049(EMPForm element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPAutoBatchActivity_2048ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPOutOr_2024ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPDocument_2025ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPProductPackage_2026ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPNormalActivity_2044ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPOther_2028ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPMessage_2029ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPCompActivity_2045ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPOutAnd_2031ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPManualBatchActivity_2046ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPClock_2033ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPInAnd_2034ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPInOr_2035ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPAutoActivity_2047ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPArtifact_2037ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMOResourceGroupType_2038ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMRToolType_2039ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMRRole_2040ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMRMachineType_2041ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMRLocationType_2042ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPForm_2049ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPDiagram_1000ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedLinkWithClassID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPClockFlow_4001(EMPClockFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4002(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPAssFlow_4003(EMPAssFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPRefFlow_4004(EMPRefFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4005(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4016(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4017(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4018(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4019(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4020(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPAssFlow_4006(EMPAssFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPAssFlow_4007(EMPAssFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPAssFlow_4008(EMPAssFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPAssFlow_4009(EMPAssFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPAssFlow_4010(EMPAssFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPAssFlow_4011(EMPAssFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPAssFlow_4012(EMPAssFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPAssFlow_4013(EMPAssFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPAssFlow_4014(EMPAssFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPAssFlow_4015(EMPAssFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPAssFlow_4025(EMPAssFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPAssFlow_4026(EMPAssFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPAssFlow_4027(EMPAssFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPAssFlow_4028(EMPAssFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPAssFlow_4029(EMPAssFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4021(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4022(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4023(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4030(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4031(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4032(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4033(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4034(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4035(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4036(EMPDataFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMPDataFlow_4037(EMPDataFlow element) {
		return true;
	}
}
