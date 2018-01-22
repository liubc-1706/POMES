package newpmbe.organization.diagram.part;

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

import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import vpml.organizationpackage.EMOAssociationRelation;
import vpml.organizationpackage.EMOComposeRelation;
import vpml.organizationpackage.EMODiagram;
import vpml.organizationpackage.EMOResourceGroupType;
//import vpml.organizationpackage.EMOGroupType;
import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.resourcepackage.EMRRole;
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
			if (EMODiagramEditPart.MODEL_ID.equals(view.getType())) {
				return EMODiagramEditPart.VISUAL_ID;
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
		if (OrganizationpackagePackage.eINSTANCE.getEMODiagram().isSuperTypeOf(
				domainElementMetaclass)
				&& isDiagramEMODiagram_1000((EMODiagram) domainElement)) {
			return EMODiagramEditPart.VISUAL_ID;
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
		if (!EMODiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (EMODiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EMODiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		int nodeVisualID = semanticHint != null ? getVisualID(semanticHint)
				: -1;
		switch (containerVisualID) {
		case EMOResourceGroupTypeEditPart.VISUAL_ID:
			if (EMOResourceGroupTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMOResourceGroupTypeNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMOResourceGroupType_2003ChildNodeID(
					domainElement, semanticHint);
		case EMRRoleEditPart.VISUAL_ID:
			if (EMRRoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMRRoleNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMRRole_2004ChildNodeID(domainElement,
					semanticHint);
		case EMODiagramEditPart.VISUAL_ID:
			if ((semanticHint == null || EMOResourceGroupTypeEditPart.VISUAL_ID == nodeVisualID)
					&& OrganizationpackagePackage.eINSTANCE
							.getEMOResourceGroupType().isSuperTypeOf(
									domainElementMetaclass)
					&& (domainElement == null || isNodeEMOResourceGroupType_2003((EMOResourceGroupType) domainElement))) {
				return EMOResourceGroupTypeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMRRoleEditPart.VISUAL_ID == nodeVisualID)
					&& ResourcepackagePackage.eINSTANCE.getEMRRole()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMRRole_2004((EMRRole) domainElement))) {
				return EMRRoleEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMODiagram_1000ChildNodeID(domainElement,
					semanticHint);
		case EMOAssociationRelationEditPart.VISUAL_ID:
			if (EMOAssociationRelationNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMOAssociationRelationNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMOAssociationRelation_4002LinkLabelID(semanticHint);
		case EMOAssociationRelation2EditPart.VISUAL_ID:
			if (EMOAssociationRelationName2EditPart.VISUAL_ID == nodeVisualID) {
				return EMOAssociationRelationName2EditPart.VISUAL_ID;
			}
			return getUnrecognizedEMOAssociationRelation_4003LinkLabelID(semanticHint);
		case EMOAssociationRelation3EditPart.VISUAL_ID:
			if (EMOAssociationRelationName3EditPart.VISUAL_ID == nodeVisualID) {
				return EMOAssociationRelationName3EditPart.VISUAL_ID;
			}
			return getUnrecognizedEMOAssociationRelation_4004LinkLabelID(semanticHint);
		case EMOAssociationRelation4EditPart.VISUAL_ID:
			if (EMOAssociationRelationName4EditPart.VISUAL_ID == nodeVisualID) {
				return EMOAssociationRelationName4EditPart.VISUAL_ID;
			}
			return getUnrecognizedEMOAssociationRelation_4005LinkLabelID(semanticHint);
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
		if (OrganizationpackagePackage.eINSTANCE.getEMOComposeRelation()
				.isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMOComposeRelation_4001((EMOComposeRelation) domainElement))) {
			return EMOComposeRelationEditPart.VISUAL_ID;
		} else if (OrganizationpackagePackage.eINSTANCE
				.getEMOAssociationRelation().isSuperTypeOf(
						domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMOAssociationRelation_4002((EMOAssociationRelation) domainElement))) {
			return EMOAssociationRelationEditPart.VISUAL_ID;
		} else if (OrganizationpackagePackage.eINSTANCE
				.getEMOAssociationRelation().isSuperTypeOf(
						domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMOAssociationRelation_4003((EMOAssociationRelation) domainElement))) {
			return EMOAssociationRelation2EditPart.VISUAL_ID;
		} else if (OrganizationpackagePackage.eINSTANCE
				.getEMOAssociationRelation().isSuperTypeOf(
						domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMOAssociationRelation_4004((EMOAssociationRelation) domainElement))) {
			return EMOAssociationRelation3EditPart.VISUAL_ID;
		} else if (OrganizationpackagePackage.eINSTANCE
				.getEMOAssociationRelation().isSuperTypeOf(
						domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEMOAssociationRelation_4005((EMOAssociationRelation) domainElement))) {
			return EMOAssociationRelation4EditPart.VISUAL_ID;
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
	private static boolean isDiagramEMODiagram_1000(EMODiagram element) {
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
	private static boolean isNodeEMOResourceGroupType_2003(
			EMOResourceGroupType element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMRRole_2004(EMRRole element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMOResourceGroupType_2003ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMRRole_2004ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMODiagram_1000ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMOAssociationRelation_4002LinkLabelID(
			String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMOAssociationRelation_4003LinkLabelID(
			String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMOAssociationRelation_4004LinkLabelID(
			String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMOAssociationRelation_4005LinkLabelID(
			String semanticHint) {
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
	private static boolean isLinkWithClassEMOComposeRelation_4001(
			EMOComposeRelation element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMOAssociationRelation_4002(
			EMOAssociationRelation element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMOAssociationRelation_4003(
			EMOAssociationRelation element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMOAssociationRelation_4004(
			EMOAssociationRelation element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassEMOAssociationRelation_4005(
			EMOAssociationRelation element) {
		return true;
	}
}
