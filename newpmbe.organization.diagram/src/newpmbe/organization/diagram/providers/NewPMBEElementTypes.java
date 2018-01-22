package newpmbe.organization.diagram.providers;

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
import newpmbe.organization.diagram.part.NewPMBEDiagramEditorPlugin;

import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.resourcepackage.ResourcepackagePackage;

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
			elements.put(EMODiagram_1000, OrganizationpackagePackage.eINSTANCE
					.getEMODiagram());
			elements.put(EMOResourceGroupType_2003,
					OrganizationpackagePackage.eINSTANCE
							.getEMOResourceGroupType());
			elements.put(EMRRole_2004, ResourcepackagePackage.eINSTANCE
					.getEMRRole());
			elements.put(EMOComposeRelation_4001,
					OrganizationpackagePackage.eINSTANCE
							.getEMOComposeRelation());
			elements.put(EMOAssociationRelation_4002,
					OrganizationpackagePackage.eINSTANCE
							.getEMOAssociationRelation());
			elements.put(EMOAssociationRelation_4003,
					OrganizationpackagePackage.eINSTANCE
							.getEMOAssociationRelation());
			elements.put(EMOAssociationRelation_4004,
					OrganizationpackagePackage.eINSTANCE
							.getEMOAssociationRelation());
			elements.put(EMOAssociationRelation_4005,
					OrganizationpackagePackage.eINSTANCE
							.getEMOAssociationRelation());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	public static final IElementType EMODiagram_1000 = getElementType("newpmbe.organization.diagram.EMODiagram_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMOResourceGroupType_2003 = getElementType("newpmbe.organization.diagram.EMOResourceGroupType_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRRole_2004 = getElementType("newpmbe.organization.diagram.EMRRole_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMOComposeRelation_4001 = getElementType("newpmbe.organization.diagram.EMOComposeRelation_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMOAssociationRelation_4002 = getElementType("newpmbe.organization.diagram.EMOAssociationRelation_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMOAssociationRelation_4003 = getElementType("newpmbe.organization.diagram.EMOAssociationRelation_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMOAssociationRelation_4004 = getElementType("newpmbe.organization.diagram.EMOAssociationRelation_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMOAssociationRelation_4005 = getElementType("newpmbe.organization.diagram.EMOAssociationRelation_4005"); //$NON-NLS-1$

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
			KNOWN_ELEMENT_TYPES.add(EMODiagram_1000);
			KNOWN_ELEMENT_TYPES.add(EMOResourceGroupType_2003);
			KNOWN_ELEMENT_TYPES.add(EMRRole_2004);
			KNOWN_ELEMENT_TYPES.add(EMOComposeRelation_4001);
			KNOWN_ELEMENT_TYPES.add(EMOAssociationRelation_4002);
			KNOWN_ELEMENT_TYPES.add(EMOAssociationRelation_4003);
			KNOWN_ELEMENT_TYPES.add(EMOAssociationRelation_4004);
			KNOWN_ELEMENT_TYPES.add(EMOAssociationRelation_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}
}
