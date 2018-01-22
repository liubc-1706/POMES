package newpmbe.resource.diagram.part;

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

import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import vpml.resourcepackage.EMRAbstractLocationType;
import vpml.resourcepackage.EMRAbstractMachineType;
import vpml.resourcepackage.EMRAbstractRole;
import vpml.resourcepackage.EMRAbstractToolType;
import vpml.resourcepackage.EMRClassificationRelation;
//import vpml.resourcepackage.EMRClassificationRelationship;
import vpml.resourcepackage.EMRDiagram;
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
			if (EMRDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return EMRDiagramEditPart.VISUAL_ID;
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
		if (ResourcepackagePackage.eINSTANCE.getEMRDiagram().isSuperTypeOf(
				domainElementMetaclass)
				&& isDiagramEMRDiagram_1000((EMRDiagram) domainElement)) {
			return EMRDiagramEditPart.VISUAL_ID;
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
		if (!EMRDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (EMRDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EMRDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		int nodeVisualID = semanticHint != null ? getVisualID(semanticHint)
				: -1;
		switch (containerVisualID) {
		case EMRAbstractToolTypeEditPart.VISUAL_ID:
			if (EMRAbstractToolTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMRAbstractToolTypeNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMRAbstractToolType_2009ChildNodeID(
					domainElement, semanticHint);
		case EMRAbstractLocationTypeEditPart.VISUAL_ID:
			if (EMRAbstractLocationTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMRAbstractLocationTypeNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMRAbstractLocationType_2010ChildNodeID(
					domainElement, semanticHint);
		case EMRAbstractMachineTypeEditPart.VISUAL_ID:
			if (EMRAbstractMachineTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMRAbstractMachineTypeNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMRAbstractMachineType_2011ChildNodeID(
					domainElement, semanticHint);
		case EMRLocationTypeEditPart.VISUAL_ID:
			if (EMRLocationTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMRLocationTypeNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMRLocationType_2012ChildNodeID(
					domainElement, semanticHint);
		case EMRMachineTypeEditPart.VISUAL_ID:
			if (EMRMachineTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMRMachineTypeNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMRMachineType_2013ChildNodeID(domainElement,
					semanticHint);
		case EMRToolTypeEditPart.VISUAL_ID:
			if (EMRToolTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMRToolTypeNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMRToolType_2014ChildNodeID(domainElement,
					semanticHint);
		case EMRDiagramEditPart.VISUAL_ID:
			if ((semanticHint == null || EMRAbstractToolTypeEditPart.VISUAL_ID == nodeVisualID)
					&& ResourcepackagePackage.eINSTANCE
							.getEMRAbstractToolType().isSuperTypeOf(
									domainElementMetaclass)
					&& (domainElement == null || isNodeEMRAbstractToolType_2009((EMRAbstractToolType) domainElement))) {
				return EMRAbstractToolTypeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMRAbstractLocationTypeEditPart.VISUAL_ID == nodeVisualID)
					&& ResourcepackagePackage.eINSTANCE
							.getEMRAbstractLocationType().isSuperTypeOf(
									domainElementMetaclass)
					&& (domainElement == null || isNodeEMRAbstractLocationType_2010((EMRAbstractLocationType) domainElement))) {
				return EMRAbstractLocationTypeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMRAbstractMachineTypeEditPart.VISUAL_ID == nodeVisualID)
					&& ResourcepackagePackage.eINSTANCE
							.getEMRAbstractMachineType().isSuperTypeOf(
									domainElementMetaclass)
					&& (domainElement == null || isNodeEMRAbstractMachineType_2011((EMRAbstractMachineType) domainElement))) {
				return EMRAbstractMachineTypeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMRLocationTypeEditPart.VISUAL_ID == nodeVisualID)
					&& ResourcepackagePackage.eINSTANCE.getEMRLocationType()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMRLocationType_2012((EMRLocationType) domainElement))) {
				return EMRLocationTypeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMRMachineTypeEditPart.VISUAL_ID == nodeVisualID)
					&& ResourcepackagePackage.eINSTANCE.getEMRMachineType()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMRMachineType_2013((EMRMachineType) domainElement))) {
				return EMRMachineTypeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMRToolTypeEditPart.VISUAL_ID == nodeVisualID)
					&& ResourcepackagePackage.eINSTANCE.getEMRToolType()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMRToolType_2014((EMRToolType) domainElement))) {
				return EMRToolTypeEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMRDiagram_1000ChildNodeID(domainElement,
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
		if (ResourcepackagePackage.eINSTANCE.getEMRClassificationRelation()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMRClassificationRelation_4009((EMRClassificationRelation) domainElement))) {
			return EMRClassificationRelationEditPart.VISUAL_ID;
		} else if (ResourcepackagePackage.eINSTANCE
				.getEMRClassificationRelation().isSuperTypeOf(
						domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMRClassificationRelation_4010((EMRClassificationRelation) domainElement))) {
			return EMRClassificationRelation2EditPart.VISUAL_ID;
		} else if (ResourcepackagePackage.eINSTANCE
				.getEMRClassificationRelation().isSuperTypeOf(
						domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMRClassificationRelation_4011((EMRClassificationRelation) domainElement))) {
			return EMRClassificationRelation3EditPart.VISUAL_ID;
		} else if (ResourcepackagePackage.eINSTANCE
				.getEMRClassificationRelation().isSuperTypeOf(
						domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMRClassificationRelation_4012((EMRClassificationRelation) domainElement))) {
			return EMRClassificationRelation4EditPart.VISUAL_ID;
		} else if (ResourcepackagePackage.eINSTANCE
				.getEMRClassificationRelation().isSuperTypeOf(
						domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMRClassificationRelation_4013((EMRClassificationRelation) domainElement))) {
			return EMRClassificationRelation5EditPart.VISUAL_ID;
		} else if (ResourcepackagePackage.eINSTANCE
				.getEMRClassificationRelation().isSuperTypeOf(
						domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMRClassificationRelation_4014((EMRClassificationRelation) domainElement))) {
			return EMRClassificationRelation6EditPart.VISUAL_ID;
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
	private static boolean isDiagramEMRDiagram_1000(EMRDiagram element) {
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
	private static boolean isNodeEMRAbstractToolType_2009(
			EMRAbstractToolType element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMRAbstractLocationType_2010(
			EMRAbstractLocationType element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMRAbstractMachineType_2011(
			EMRAbstractMachineType element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMRLocationType_2012(EMRLocationType element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMRMachineType_2013(EMRMachineType element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMRToolType_2014(EMRToolType element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMRAbstractToolType_2009ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMRAbstractLocationType_2010ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMRAbstractMachineType_2011ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMRLocationType_2012ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMRMachineType_2013ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMRToolType_2014ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMRDiagram_1000ChildNodeID(
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
	private static boolean isLinkWithClassEMRClassificationRelation_4009(
			EMRClassificationRelation element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMRClassificationRelation_4010(
			EMRClassificationRelation element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMRClassificationRelation_4011(
			EMRClassificationRelation element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMRClassificationRelation_4012(
			EMRClassificationRelation element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMRClassificationRelation_4013(
			EMRClassificationRelation element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMRClassificationRelation_4014(
			EMRClassificationRelation element) {
		return true;
	}
}
