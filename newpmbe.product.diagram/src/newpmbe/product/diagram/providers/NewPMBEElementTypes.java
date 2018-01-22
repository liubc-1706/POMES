package newpmbe.product.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import newpmbe.product.diagram.part.NewPMBEDiagramEditorPlugin;

import vpml.processpackage.ProcesspackagePackage;

/**
 * @generated
 */
public class NewPMBEElementTypes {

	/**
	 * @generated
	 */
	private NewPMBEElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			element = ((EStructuralFeature) element).getEContainingClass();
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return NewPMBEDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();
			elements.put(EMPDiagram_1000, ProcesspackagePackage.eINSTANCE
					.getEMPDiagram());
			elements.put(EMPArtifact_2001, ProcesspackagePackage.eINSTANCE
					.getEMPArtifact());
			elements.put(EMPDocument_2002, ProcesspackagePackage.eINSTANCE
					.getEMPDocument());
			elements.put(EMPMessage_2003, ProcesspackagePackage.eINSTANCE
					.getEMPMessage());
			elements.put(EMPOther_2004, ProcesspackagePackage.eINSTANCE
					.getEMPOther());
			elements.put(EMPProductPackage_2005,
					ProcesspackagePackage.eINSTANCE.getEMPProductPackage());
			elements.put(EMPForm_2006, ProcesspackagePackage.eINSTANCE
					.getEMPForm());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	public static final IElementType EMPDiagram_1000 = getElementType("newpmbe.product.diagram.EMPDiagram_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPArtifact_2001 = getElementType("newpmbe.product.diagram.EMPArtifact_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDocument_2002 = getElementType("newpmbe.product.diagram.EMPDocument_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPMessage_2003 = getElementType("newpmbe.product.diagram.EMPMessage_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPOther_2004 = getElementType("newpmbe.product.diagram.EMPOther_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPProductPackage_2005 = getElementType("newpmbe.product.diagram.EMPProductPackage_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPForm_2006 = getElementType("newpmbe.product.diagram.EMPForm_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(EMPDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(EMPArtifact_2001);
			KNOWN_ELEMENT_TYPES.add(EMPDocument_2002);
			KNOWN_ELEMENT_TYPES.add(EMPMessage_2003);
			KNOWN_ELEMENT_TYPES.add(EMPOther_2004);
			KNOWN_ELEMENT_TYPES.add(EMPProductPackage_2005);
			KNOWN_ELEMENT_TYPES.add(EMPForm_2006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}
}
