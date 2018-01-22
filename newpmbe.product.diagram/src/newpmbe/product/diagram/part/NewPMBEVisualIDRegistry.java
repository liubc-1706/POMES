package newpmbe.product.diagram.part;

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

import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import vpml.processpackage.EMPArtifact;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPDocument;
import vpml.processpackage.EMPForm;
import vpml.processpackage.EMPMessage;
import vpml.processpackage.EMPOther;
import vpml.processpackage.EMPProductPackage;
import vpml.processpackage.ProcesspackagePackage;

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
		case EMPArtifactEditPart.VISUAL_ID:
			if (EMPArtifactNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPArtifactNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPArtifact_2001ChildNodeID(domainElement,
					semanticHint);
		case EMPDocumentEditPart.VISUAL_ID:
			if (EMPDocumentNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPDocumentNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPDocument_2002ChildNodeID(domainElement,
					semanticHint);
		case EMPMessageEditPart.VISUAL_ID:
			if (EMPMessageNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPMessageNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPMessage_2003ChildNodeID(domainElement,
					semanticHint);
		case EMPOtherEditPart.VISUAL_ID:
			if (EMPOtherNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPOtherNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPOther_2004ChildNodeID(domainElement,
					semanticHint);
		case EMPProductPackageEditPart.VISUAL_ID:
			if (EMPProductPackageNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPProductPackageNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPProductPackage_2005ChildNodeID(
					domainElement, semanticHint);
		case EMPFormEditPart.VISUAL_ID:
			if (EMPFormNameEditPart.VISUAL_ID == nodeVisualID) {
				return EMPFormNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedEMPForm_2006ChildNodeID(domainElement,
					semanticHint);
		case EMPDiagramEditPart.VISUAL_ID:
			if ((semanticHint == null || EMPArtifactEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPArtifact()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPArtifact_2001((EMPArtifact) domainElement))) {
				return EMPArtifactEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPDocumentEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPDocument()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPDocument_2002((EMPDocument) domainElement))) {
				return EMPDocumentEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPMessageEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPMessage()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPMessage_2003((EMPMessage) domainElement))) {
				return EMPMessageEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPOtherEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPOther()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPOther_2004((EMPOther) domainElement))) {
				return EMPOtherEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPProductPackageEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPProductPackage()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPProductPackage_2005((EMPProductPackage) domainElement))) {
				return EMPProductPackageEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EMPFormEditPart.VISUAL_ID == nodeVisualID)
					&& ProcesspackagePackage.eINSTANCE.getEMPForm()
							.isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEMPForm_2006((EMPForm) domainElement))) {
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
		{
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
	private static boolean isNodeEMPArtifact_2001(EMPArtifact element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPDocument_2002(EMPDocument element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPMessage_2003(EMPMessage element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPOther_2004(EMPOther element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPProductPackage_2005(
			EMPProductPackage element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEMPForm_2006(EMPForm element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPArtifact_2001ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPDocument_2002ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPMessage_2003ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPOther_2004ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPProductPackage_2005ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEMPForm_2006ChildNodeID(
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
}
