package newpmbe.resource.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import newpmbe.resource.diagram.edit.parts.EMRAbstractLocationTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractLocationTypeNameEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractMachineTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractMachineTypeNameEditPart;
//import newpmbe.resource.diagram.edit.parts.EMRAbstractRoleEditPart;
//import newpmbe.resource.diagram.edit.parts.EMRAbstractRoleNameEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractToolTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractToolTypeNameEditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelation2EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelation3EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelation4EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelation5EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelation6EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationEditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship2EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship3EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship4EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship5EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship6EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship7EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship8EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationshipEditPart;
import newpmbe.resource.diagram.edit.parts.EMRDiagramEditPart;
import newpmbe.resource.diagram.edit.parts.EMRLocationTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRLocationTypeNameEditPart;
import newpmbe.resource.diagram.edit.parts.EMRMachineTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRMachineTypeNameEditPart;
//import newpmbe.resource.diagram.edit.parts.EMRRoleEditPart;
//import newpmbe.resource.diagram.edit.parts.EMRRoleNameEditPart;
import newpmbe.resource.diagram.edit.parts.EMRToolTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRToolTypeNameEditPart;

import newpmbe.resource.diagram.part.NewPMBEVisualIDRegistry;

import newpmbe.resource.diagram.view.factories.EMRAbstractLocationTypeNameViewFactory;
import newpmbe.resource.diagram.view.factories.EMRAbstractLocationTypeViewFactory;
import newpmbe.resource.diagram.view.factories.EMRAbstractMachineTypeNameViewFactory;
import newpmbe.resource.diagram.view.factories.EMRAbstractMachineTypeViewFactory;
import newpmbe.resource.diagram.view.factories.EMRAbstractRoleNameViewFactory;
//import newpmbe.resource.diagram.view.factories.EMRAbstractRoleViewFactory;
import newpmbe.resource.diagram.view.factories.EMRAbstractToolTypeNameViewFactory;
import newpmbe.resource.diagram.view.factories.EMRAbstractToolTypeViewFactory;
import newpmbe.resource.diagram.view.factories.EMRClassificationRelation2ViewFactory;
import newpmbe.resource.diagram.view.factories.EMRClassificationRelation3ViewFactory;
import newpmbe.resource.diagram.view.factories.EMRClassificationRelation4ViewFactory;
import newpmbe.resource.diagram.view.factories.EMRClassificationRelation5ViewFactory;
import newpmbe.resource.diagram.view.factories.EMRClassificationRelation6ViewFactory;
import newpmbe.resource.diagram.view.factories.EMRClassificationRelationViewFactory;
import newpmbe.resource.diagram.view.factories.EMRClassificationRelationship2ViewFactory;
import newpmbe.resource.diagram.view.factories.EMRClassificationRelationship3ViewFactory;
import newpmbe.resource.diagram.view.factories.EMRClassificationRelationship4ViewFactory;
import newpmbe.resource.diagram.view.factories.EMRClassificationRelationship5ViewFactory;
import newpmbe.resource.diagram.view.factories.EMRClassificationRelationship6ViewFactory;
import newpmbe.resource.diagram.view.factories.EMRClassificationRelationship7ViewFactory;
import newpmbe.resource.diagram.view.factories.EMRClassificationRelationship8ViewFactory;
import newpmbe.resource.diagram.view.factories.EMRClassificationRelationshipViewFactory;
import newpmbe.resource.diagram.view.factories.EMRDiagramViewFactory;
import newpmbe.resource.diagram.view.factories.EMRLocationTypeNameViewFactory;
import newpmbe.resource.diagram.view.factories.EMRLocationTypeViewFactory;
import newpmbe.resource.diagram.view.factories.EMRMachineTypeNameViewFactory;
import newpmbe.resource.diagram.view.factories.EMRMachineTypeViewFactory;
import newpmbe.resource.diagram.view.factories.EMRRoleNameViewFactory;
//import newpmbe.resource.diagram.view.factories.EMRRoleViewFactory;
import newpmbe.resource.diagram.view.factories.EMRToolTypeNameViewFactory;
import newpmbe.resource.diagram.view.factories.EMRToolTypeViewFactory;

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
		if (EMRDiagramEditPart.MODEL_ID.equals(diagramKind)
				&& NewPMBEVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return EMRDiagramViewFactory.class;
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
		case EMRAbstractToolTypeEditPart.VISUAL_ID:
			return EMRAbstractToolTypeViewFactory.class;
		case EMRAbstractToolTypeNameEditPart.VISUAL_ID:
			return EMRAbstractToolTypeNameViewFactory.class;
		case EMRAbstractLocationTypeEditPart.VISUAL_ID:
			return EMRAbstractLocationTypeViewFactory.class;
		case EMRAbstractLocationTypeNameEditPart.VISUAL_ID:
			return EMRAbstractLocationTypeNameViewFactory.class;
		case EMRAbstractMachineTypeEditPart.VISUAL_ID:
			return EMRAbstractMachineTypeViewFactory.class;
		case EMRAbstractMachineTypeNameEditPart.VISUAL_ID:
			return EMRAbstractMachineTypeNameViewFactory.class;
		case EMRLocationTypeEditPart.VISUAL_ID:
			return EMRLocationTypeViewFactory.class;
		case EMRLocationTypeNameEditPart.VISUAL_ID:
			return EMRLocationTypeNameViewFactory.class;
		case EMRMachineTypeEditPart.VISUAL_ID:
			return EMRMachineTypeViewFactory.class;
		case EMRMachineTypeNameEditPart.VISUAL_ID:
			return EMRMachineTypeNameViewFactory.class;
		case EMRToolTypeEditPart.VISUAL_ID:
			return EMRToolTypeViewFactory.class;
		case EMRToolTypeNameEditPart.VISUAL_ID:
			return EMRToolTypeNameViewFactory.class;
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
		case EMRClassificationRelationEditPart.VISUAL_ID:
			return EMRClassificationRelationViewFactory.class;
		case EMRClassificationRelation2EditPart.VISUAL_ID:
			return EMRClassificationRelation2ViewFactory.class;
		case EMRClassificationRelation3EditPart.VISUAL_ID:
			return EMRClassificationRelation3ViewFactory.class;
		case EMRClassificationRelation4EditPart.VISUAL_ID:
			return EMRClassificationRelation4ViewFactory.class;
		case EMRClassificationRelation5EditPart.VISUAL_ID:
			return EMRClassificationRelation5ViewFactory.class;
		case EMRClassificationRelation6EditPart.VISUAL_ID:
			return EMRClassificationRelation6ViewFactory.class;
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
