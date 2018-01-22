package newpmbe.organization.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelation2EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelation3EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelation4EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelationEditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelationName2EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelationName3EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelationName4EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelationNameEditPart;
import newpmbe.organization.diagram.edit.parts.EMOComposeRelationEditPart;
import newpmbe.organization.diagram.edit.parts.EMODiagramEditPart;
import newpmbe.organization.diagram.edit.parts.EMOResourceGroupTypeEditPart;
import newpmbe.organization.diagram.edit.parts.EMOResourceGroupTypeNameEditPart;
//import newpmbe.organization.diagram.edit.parts.EMOGroupTypeEditPart;
//import newpmbe.organization.diagram.edit.parts.EMOGroupTypeNameEditPart;
import newpmbe.organization.diagram.edit.parts.EMRRoleEditPart;
import newpmbe.organization.diagram.edit.parts.EMRRoleNameEditPart;

import newpmbe.organization.diagram.part.NewPMBEVisualIDRegistry;

import newpmbe.organization.diagram.view.factories.EMOAssociationRelation2ViewFactory;
import newpmbe.organization.diagram.view.factories.EMOAssociationRelation3ViewFactory;
import newpmbe.organization.diagram.view.factories.EMOAssociationRelation4ViewFactory;
import newpmbe.organization.diagram.view.factories.EMOAssociationRelationName2ViewFactory;
import newpmbe.organization.diagram.view.factories.EMOAssociationRelationName3ViewFactory;
import newpmbe.organization.diagram.view.factories.EMOAssociationRelationName4ViewFactory;
import newpmbe.organization.diagram.view.factories.EMOAssociationRelationNameViewFactory;
import newpmbe.organization.diagram.view.factories.EMOAssociationRelationViewFactory;
import newpmbe.organization.diagram.view.factories.EMOComposeRelationViewFactory;
import newpmbe.organization.diagram.view.factories.EMODiagramViewFactory;
import newpmbe.organization.diagram.view.factories.EMOResourceGroupTypeNameViewFactory;
import newpmbe.organization.diagram.view.factories.EMOResourceGroupTypeViewFactory;
import newpmbe.organization.diagram.view.factories.EMOGroupTypeNameViewFactory;
//import newpmbe.organization.diagram.view.factories.EMOGroupTypeViewFactory;
import newpmbe.organization.diagram.view.factories.EMRRoleNameViewFactory;
import newpmbe.organization.diagram.view.factories.EMRRoleViewFactory;

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
		if (EMODiagramEditPart.MODEL_ID.equals(diagramKind)
				&& NewPMBEVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return EMODiagramViewFactory.class;
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
		case EMOResourceGroupTypeEditPart.VISUAL_ID:
			return EMOResourceGroupTypeViewFactory.class;
		case EMOResourceGroupTypeNameEditPart.VISUAL_ID:
			return EMOResourceGroupTypeNameViewFactory.class;
		case EMRRoleEditPart.VISUAL_ID:
			return EMRRoleViewFactory.class;
		case EMRRoleNameEditPart.VISUAL_ID:
			return EMRRoleNameViewFactory.class;
		case EMOAssociationRelationNameEditPart.VISUAL_ID:
			return EMOAssociationRelationNameViewFactory.class;
		case EMOAssociationRelationName2EditPart.VISUAL_ID:
			return EMOAssociationRelationName2ViewFactory.class;
		case EMOAssociationRelationName3EditPart.VISUAL_ID:
			return EMOAssociationRelationName3ViewFactory.class;
		case EMOAssociationRelationName4EditPart.VISUAL_ID:
			return EMOAssociationRelationName4ViewFactory.class;
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
		case EMOComposeRelationEditPart.VISUAL_ID:
			return EMOComposeRelationViewFactory.class;
		case EMOAssociationRelationEditPart.VISUAL_ID:
			return EMOAssociationRelationViewFactory.class;
		case EMOAssociationRelation2EditPart.VISUAL_ID:
			return EMOAssociationRelation2ViewFactory.class;
		case EMOAssociationRelation3EditPart.VISUAL_ID:
			return EMOAssociationRelation3ViewFactory.class;
		case EMOAssociationRelation4EditPart.VISUAL_ID:
			return EMOAssociationRelation4ViewFactory.class;
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
