package newpmbe.process.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
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

import newpmbe.process.diagram.part.NewPMBEVisualIDRegistry;

import newpmbe.process.diagram.view.factories.EMOResourceGroupTypeNameViewFactory;
import newpmbe.process.diagram.view.factories.EMOResourceGroupTypeViewFactory;
//import newpmbe.process.diagram.view.factories.EMOGroupTypeNameViewFactory;
//import newpmbe.process.diagram.view.factories.EMOGroupTypeViewFactory;
import newpmbe.process.diagram.view.factories.EMPArtifactNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPArtifactNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPArtifactViewFactory;
import newpmbe.process.diagram.view.factories.EMPAssFlow10ViewFactory;
import newpmbe.process.diagram.view.factories.EMPAssFlow11ViewFactory;
import newpmbe.process.diagram.view.factories.EMPAssFlow12ViewFactory;
import newpmbe.process.diagram.view.factories.EMPAssFlow13ViewFactory;
import newpmbe.process.diagram.view.factories.EMPAssFlow14ViewFactory;
import newpmbe.process.diagram.view.factories.EMPAssFlow15ViewFactory;
import newpmbe.process.diagram.view.factories.EMPAssFlow16ViewFactory;
import newpmbe.process.diagram.view.factories.EMPAssFlow2ViewFactory;
import newpmbe.process.diagram.view.factories.EMPAssFlow3ViewFactory;
import newpmbe.process.diagram.view.factories.EMPAssFlow4ViewFactory;
import newpmbe.process.diagram.view.factories.EMPAssFlow5ViewFactory;
import newpmbe.process.diagram.view.factories.EMPAssFlow6ViewFactory;
import newpmbe.process.diagram.view.factories.EMPAssFlow7ViewFactory;
import newpmbe.process.diagram.view.factories.EMPAssFlow8ViewFactory;
import newpmbe.process.diagram.view.factories.EMPAssFlow9ViewFactory;
import newpmbe.process.diagram.view.factories.EMPAssFlowViewFactory;
import newpmbe.process.diagram.view.factories.EMPAutoActivityNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPAutoActivityViewFactory;
import newpmbe.process.diagram.view.factories.EMPAutoBatchActivityNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPAutoBatchActivityViewFactory;
import newpmbe.process.diagram.view.factories.EMPClockFlowViewFactory;
import newpmbe.process.diagram.view.factories.EMPClockNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPClockViewFactory;
import newpmbe.process.diagram.view.factories.EMPCompActivityNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPCompActivityViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow10ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow11ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow12ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow13ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow14ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow15ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow16ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow17ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow18ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow2ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow3ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow4ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow5ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow6ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow7ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow8ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlow9ViewFactory;
import newpmbe.process.diagram.view.factories.EMPDataFlowViewFactory;
import newpmbe.process.diagram.view.factories.EMPDiagramViewFactory;
import newpmbe.process.diagram.view.factories.EMPDocumentNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPDocumentViewFactory;
import newpmbe.process.diagram.view.factories.EMPFormNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPFormViewFactory;
import newpmbe.process.diagram.view.factories.EMPInAndNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPInAndViewFactory;
import newpmbe.process.diagram.view.factories.EMPInOrNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPInOrViewFactory;
import newpmbe.process.diagram.view.factories.EMPManualBatchActivityNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPManualBatchActivityViewFactory;
import newpmbe.process.diagram.view.factories.EMPMessageNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPMessageViewFactory;
import newpmbe.process.diagram.view.factories.EMPMileStoneNameViewFactory;
//import newpmbe.process.diagram.view.factories.EMPMileStoneViewFactory;
import newpmbe.process.diagram.view.factories.EMPNormalActivityNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPNormalActivityViewFactory;
import newpmbe.process.diagram.view.factories.EMPOtherNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPOtherViewFactory;
import newpmbe.process.diagram.view.factories.EMPOutAndNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPOutAndViewFactory;
import newpmbe.process.diagram.view.factories.EMPOutOrNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPOutOrViewFactory;
import newpmbe.process.diagram.view.factories.EMPProductPackageNameViewFactory;
import newpmbe.process.diagram.view.factories.EMPProductPackageViewFactory;
import newpmbe.process.diagram.view.factories.EMPRefFlowViewFactory;
import newpmbe.process.diagram.view.factories.EMRLocationTypeNameViewFactory;
import newpmbe.process.diagram.view.factories.EMRLocationTypeViewFactory;
import newpmbe.process.diagram.view.factories.EMRMachineTypeNameViewFactory;
import newpmbe.process.diagram.view.factories.EMRMachineTypeViewFactory;
import newpmbe.process.diagram.view.factories.EMRRoleNameViewFactory;
import newpmbe.process.diagram.view.factories.EMRRoleViewFactory;
import newpmbe.process.diagram.view.factories.EMRToolTypeNameViewFactory;
import newpmbe.process.diagram.view.factories.EMRToolTypeViewFactory;

/**
 * @generated
 */
public class NewPMBEViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (EMPDiagramEditPart.MODEL_ID.equals(diagramKind)
				&& NewPMBEVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return EMPDiagramViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (elementType != null
				&& !NewPMBEElementTypes.isKnownElementType(elementType)) {
			return null;
		}
		EClass semanticType = getSemanticEClass(semanticAdapter);
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(containerView,
				semanticElement, semanticType, semanticHint);
		switch (nodeVID) {
		case EMPAutoBatchActivityEditPart.VISUAL_ID:
			return EMPAutoBatchActivityViewFactory.class;
		case EMPAutoBatchActivityNameEditPart.VISUAL_ID:
			return EMPAutoBatchActivityNameViewFactory.class;
		case EMPOutOrEditPart.VISUAL_ID:
			return EMPOutOrViewFactory.class;
		case EMPDocumentEditPart.VISUAL_ID:
			return EMPDocumentViewFactory.class;
		case EMPDocumentNameEditPart.VISUAL_ID:
			return EMPDocumentNameViewFactory.class;
		case EMPProductPackageEditPart.VISUAL_ID:
			return EMPProductPackageViewFactory.class;
		case EMPProductPackageNameEditPart.VISUAL_ID:
			return EMPProductPackageNameViewFactory.class;
		case EMPNormalActivityEditPart.VISUAL_ID:
			return EMPNormalActivityViewFactory.class;
		case EMPNormalActivityNameEditPart.VISUAL_ID:
			return EMPNormalActivityNameViewFactory.class;
		case EMPOtherEditPart.VISUAL_ID:
			return EMPOtherViewFactory.class;
		case EMPOtherNameEditPart.VISUAL_ID:
			return EMPOtherNameViewFactory.class;
		case EMPMessageEditPart.VISUAL_ID:
			return EMPMessageViewFactory.class;
		case EMPMessageNameEditPart.VISUAL_ID:
			return EMPMessageNameViewFactory.class;
		case EMPCompActivityEditPart.VISUAL_ID:
			return EMPCompActivityViewFactory.class;
		case EMPCompActivityNameEditPart.VISUAL_ID:
			return EMPCompActivityNameViewFactory.class;
		case EMPOutAndEditPart.VISUAL_ID:
			return EMPOutAndViewFactory.class;
		case EMPManualBatchActivityEditPart.VISUAL_ID:
			return EMPManualBatchActivityViewFactory.class;
		case EMPManualBatchActivityNameEditPart.VISUAL_ID:
			return EMPManualBatchActivityNameViewFactory.class;
		case EMPClockEditPart.VISUAL_ID:
			return EMPClockViewFactory.class;
		case EMPClockNameEditPart.VISUAL_ID:
			return EMPClockNameViewFactory.class;
		case EMPInAndEditPart.VISUAL_ID:
			return EMPInAndViewFactory.class;
		case EMPInOrEditPart.VISUAL_ID:
			return EMPInOrViewFactory.class;
		case EMPAutoActivityEditPart.VISUAL_ID:
			return EMPAutoActivityViewFactory.class;
		case EMPAutoActivityNameEditPart.VISUAL_ID:
			return EMPAutoActivityNameViewFactory.class;
		case EMPArtifactEditPart.VISUAL_ID:
			return EMPArtifactViewFactory.class;
		case EMPArtifactNameEditPart.VISUAL_ID:
			return EMPArtifactNameViewFactory.class;
		case EMOResourceGroupTypeEditPart.VISUAL_ID:
			return EMOResourceGroupTypeViewFactory.class;
		case EMOResourceGroupTypeNameEditPart.VISUAL_ID:
			return EMOResourceGroupTypeNameViewFactory.class;
		case EMRToolTypeEditPart.VISUAL_ID:
			return EMRToolTypeViewFactory.class;
		case EMRToolTypeNameEditPart.VISUAL_ID:
			return EMRToolTypeNameViewFactory.class;
		case EMRRoleEditPart.VISUAL_ID:
			return EMRRoleViewFactory.class;
		case EMRRoleNameEditPart.VISUAL_ID:
			return EMRRoleNameViewFactory.class;
		case EMRMachineTypeEditPart.VISUAL_ID:
			return EMRMachineTypeViewFactory.class;
		case EMRMachineTypeNameEditPart.VISUAL_ID:
			return EMRMachineTypeNameViewFactory.class;
		case EMRLocationTypeEditPart.VISUAL_ID:
			return EMRLocationTypeViewFactory.class;
		case EMRLocationTypeNameEditPart.VISUAL_ID:
			return EMRLocationTypeNameViewFactory.class;
		case EMPFormEditPart.VISUAL_ID:
			return EMPFormViewFactory.class;
		case EMPFormNameEditPart.VISUAL_ID:
			return EMPFormNameViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (elementType != null
				&& !NewPMBEElementTypes.isKnownElementType(elementType)) {
			return null;
		}
		EClass semanticType = getSemanticEClass(semanticAdapter);
		if (semanticType == null) {
			return null;
		}
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int linkVID = NewPMBEVisualIDRegistry.getLinkWithClassVisualID(
				semanticElement, semanticType);
		switch (linkVID) {
		case EMPClockFlowEditPart.VISUAL_ID:
			return EMPClockFlowViewFactory.class;
		case EMPAssFlowEditPart.VISUAL_ID:
			return EMPAssFlowViewFactory.class;
		case EMPRefFlowEditPart.VISUAL_ID:
			return EMPRefFlowViewFactory.class;
		case EMPDataFlowEditPart.VISUAL_ID:
			return EMPDataFlowViewFactory.class;
		case EMPAssFlow2EditPart.VISUAL_ID:
			return EMPAssFlow2ViewFactory.class;
		case EMPAssFlow3EditPart.VISUAL_ID:
			return EMPAssFlow3ViewFactory.class;
		case EMPAssFlow4EditPart.VISUAL_ID:
			return EMPAssFlow4ViewFactory.class;
		case EMPAssFlow5EditPart.VISUAL_ID:
			return EMPAssFlow5ViewFactory.class;
		case EMPAssFlow6EditPart.VISUAL_ID:
			return EMPAssFlow6ViewFactory.class;
		case EMPAssFlow7EditPart.VISUAL_ID:
			return EMPAssFlow7ViewFactory.class;
		case EMPAssFlow8EditPart.VISUAL_ID:
			return EMPAssFlow8ViewFactory.class;
		case EMPAssFlow9EditPart.VISUAL_ID:
			return EMPAssFlow9ViewFactory.class;
		case EMPAssFlow10EditPart.VISUAL_ID:
			return EMPAssFlow10ViewFactory.class;
		case EMPAssFlow11EditPart.VISUAL_ID:
			return EMPAssFlow11ViewFactory.class;
		case EMPAssFlow12EditPart.VISUAL_ID:
			return EMPAssFlow12ViewFactory.class;
		case EMPAssFlow13EditPart.VISUAL_ID:
			return EMPAssFlow13ViewFactory.class;
		case EMPAssFlow14EditPart.VISUAL_ID:
			return EMPAssFlow14ViewFactory.class;
		case EMPAssFlow15EditPart.VISUAL_ID:
			return EMPAssFlow15ViewFactory.class;
		case EMPAssFlow16EditPart.VISUAL_ID:
			return EMPAssFlow16ViewFactory.class;
		case EMPDataFlow2EditPart.VISUAL_ID:
			return EMPDataFlow2ViewFactory.class;
		case EMPDataFlow3EditPart.VISUAL_ID:
			return EMPDataFlow3ViewFactory.class;
		case EMPDataFlow4EditPart.VISUAL_ID:
			return EMPDataFlow4ViewFactory.class;
		case EMPDataFlow5EditPart.VISUAL_ID:
			return EMPDataFlow5ViewFactory.class;
		case EMPDataFlow6EditPart.VISUAL_ID:
			return EMPDataFlow6ViewFactory.class;
		case EMPDataFlow7EditPart.VISUAL_ID:
			return EMPDataFlow7ViewFactory.class;
		case EMPDataFlow8EditPart.VISUAL_ID:
			return EMPDataFlow8ViewFactory.class;
		case EMPDataFlow9EditPart.VISUAL_ID:
			return EMPDataFlow9ViewFactory.class;
		case EMPDataFlow10EditPart.VISUAL_ID:
			return EMPDataFlow10ViewFactory.class;
		case EMPDataFlow11EditPart.VISUAL_ID:
			return EMPDataFlow11ViewFactory.class;
		case EMPDataFlow12EditPart.VISUAL_ID:
			return EMPDataFlow12ViewFactory.class;
		case EMPDataFlow13EditPart.VISUAL_ID:
			return EMPDataFlow13ViewFactory.class;
		case EMPDataFlow14EditPart.VISUAL_ID:
			return EMPDataFlow14ViewFactory.class;
		case EMPDataFlow15EditPart.VISUAL_ID:
			return EMPDataFlow15ViewFactory.class;
		case EMPDataFlow16EditPart.VISUAL_ID:
			return EMPDataFlow16ViewFactory.class;
		case EMPDataFlow17EditPart.VISUAL_ID:
			return EMPDataFlow17ViewFactory.class;
		case EMPDataFlow18EditPart.VISUAL_ID:
			return EMPDataFlow18ViewFactory.class;
		}
		return getUnrecognizedConnectorViewClass(semanticAdapter,
				containerView, semanticHint);
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}

	/**
	 * @generated
	 */
	private Class getUnrecognizedConnectorViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		// Handle unrecognized child node classes here
		return null;
	}

}
