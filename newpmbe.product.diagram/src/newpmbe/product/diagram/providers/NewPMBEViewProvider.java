package newpmbe.product.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import newpmbe.product.diagram.edit.parts.EMPArtifactEditPart;
import newpmbe.product.diagram.edit.parts.EMPArtifactNameEditPart;
import newpmbe.product.diagram.edit.parts.EMPDiagramEditPart;
import newpmbe.product.diagram.edit.parts.EMPDocumentEditPart;
import newpmbe.product.diagram.edit.parts.EMPDocumentNameEditPart;
import newpmbe.product.diagram.edit.parts.EMPFormEditPart;
import newpmbe.product.diagram.edit.parts.EMPFormNameEditPart;
import newpmbe.product.diagram.edit.parts.EMPMessageEditPart;
import newpmbe.product.diagram.edit.parts.EMPMessageNameEditPart;
import newpmbe.product.diagram.edit.parts.EMPOtherEditPart;
import newpmbe.product.diagram.edit.parts.EMPOtherNameEditPart;
import newpmbe.product.diagram.edit.parts.EMPProductPackageEditPart;
import newpmbe.product.diagram.edit.parts.EMPProductPackageNameEditPart;

import newpmbe.product.diagram.part.NewPMBEVisualIDRegistry;

import newpmbe.product.diagram.view.factories.EMPArtifactNameViewFactory;
import newpmbe.product.diagram.view.factories.EMPArtifactViewFactory;
import newpmbe.product.diagram.view.factories.EMPDiagramViewFactory;
import newpmbe.product.diagram.view.factories.EMPDocumentNameViewFactory;
import newpmbe.product.diagram.view.factories.EMPDocumentViewFactory;
import newpmbe.product.diagram.view.factories.EMPFormNameViewFactory;
import newpmbe.product.diagram.view.factories.EMPFormViewFactory;
import newpmbe.product.diagram.view.factories.EMPMessageNameViewFactory;
import newpmbe.product.diagram.view.factories.EMPMessageViewFactory;
import newpmbe.product.diagram.view.factories.EMPOtherNameViewFactory;
import newpmbe.product.diagram.view.factories.EMPOtherViewFactory;
import newpmbe.product.diagram.view.factories.EMPProductPackageNameViewFactory;
import newpmbe.product.diagram.view.factories.EMPProductPackageViewFactory;

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
		case EMPArtifactEditPart.VISUAL_ID:
			return EMPArtifactViewFactory.class;
		case EMPArtifactNameEditPart.VISUAL_ID:
			return EMPArtifactNameViewFactory.class;
		case EMPDocumentEditPart.VISUAL_ID:
			return EMPDocumentViewFactory.class;
		case EMPDocumentNameEditPart.VISUAL_ID:
			return EMPDocumentNameViewFactory.class;
		case EMPMessageEditPart.VISUAL_ID:
			return EMPMessageViewFactory.class;
		case EMPMessageNameEditPart.VISUAL_ID:
			return EMPMessageNameViewFactory.class;
		case EMPOtherEditPart.VISUAL_ID:
			return EMPOtherViewFactory.class;
		case EMPOtherNameEditPart.VISUAL_ID:
			return EMPOtherNameViewFactory.class;
		case EMPProductPackageEditPart.VISUAL_ID:
			return EMPProductPackageViewFactory.class;
		case EMPProductPackageNameEditPart.VISUAL_ID:
			return EMPProductPackageNameViewFactory.class;
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
