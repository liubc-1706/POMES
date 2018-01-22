package newpmbe.resource.diagram.providers;

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
import newpmbe.resource.diagram.part.NewPMBEDiagramEditorPlugin;

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
			elements.put(EMRDiagram_1000, ResourcepackagePackage.eINSTANCE
					.getEMRDiagram());
			elements.put(EMRAbstractToolType_2009,
					ResourcepackagePackage.eINSTANCE.getEMRAbstractToolType());
			elements.put(EMRAbstractLocationType_2010,
					ResourcepackagePackage.eINSTANCE
							.getEMRAbstractLocationType());
			elements.put(EMRAbstractMachineType_2011,
					ResourcepackagePackage.eINSTANCE
							.getEMRAbstractMachineType());
			elements.put(EMRLocationType_2012, ResourcepackagePackage.eINSTANCE
					.getEMRLocationType());
			elements.put(EMRMachineType_2013, ResourcepackagePackage.eINSTANCE
					.getEMRMachineType());
			elements.put(EMRToolType_2014, ResourcepackagePackage.eINSTANCE
					.getEMRToolType());
			elements.put(EMRClassificationRelation_4009,
					ResourcepackagePackage.eINSTANCE
							.getEMRClassificationRelation());
			elements.put(EMRClassificationRelation_4010,
					ResourcepackagePackage.eINSTANCE
							.getEMRClassificationRelation());
			elements.put(EMRClassificationRelation_4011,
					ResourcepackagePackage.eINSTANCE
							.getEMRClassificationRelation());
			elements.put(EMRClassificationRelation_4012,
					ResourcepackagePackage.eINSTANCE
							.getEMRClassificationRelation());
			elements.put(EMRClassificationRelation_4013,
					ResourcepackagePackage.eINSTANCE
							.getEMRClassificationRelation());
			elements.put(EMRClassificationRelation_4014,
					ResourcepackagePackage.eINSTANCE
							.getEMRClassificationRelation());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	public static final IElementType EMRDiagram_1000 = getElementType("newpmbe.resource.diagram.EMRDiagram_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRAbstractToolType_2009 = getElementType("newpmbe.resource.diagram.EMRAbstractToolType_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRAbstractLocationType_2010 = getElementType("newpmbe.resource.diagram.EMRAbstractLocationType_2010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRAbstractMachineType_2011 = getElementType("newpmbe.resource.diagram.EMRAbstractMachineType_2011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRLocationType_2012 = getElementType("newpmbe.resource.diagram.EMRLocationType_2012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRMachineType_2013 = getElementType("newpmbe.resource.diagram.EMRMachineType_2013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRToolType_2014 = getElementType("newpmbe.resource.diagram.EMRToolType_2014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRClassificationRelation_4009 = getElementType("newpmbe.resource.diagram.EMRClassificationRelation_4009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRClassificationRelation_4010 = getElementType("newpmbe.resource.diagram.EMRClassificationRelation_4010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRClassificationRelation_4011 = getElementType("newpmbe.resource.diagram.EMRClassificationRelation_4011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRClassificationRelation_4012 = getElementType("newpmbe.resource.diagram.EMRClassificationRelation_4012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRClassificationRelation_4013 = getElementType("newpmbe.resource.diagram.EMRClassificationRelation_4013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRClassificationRelation_4014 = getElementType("newpmbe.resource.diagram.EMRClassificationRelation_4014"); //$NON-NLS-1$

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
			KNOWN_ELEMENT_TYPES.add(EMRDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(EMRAbstractToolType_2009);
			KNOWN_ELEMENT_TYPES.add(EMRAbstractLocationType_2010);
			KNOWN_ELEMENT_TYPES.add(EMRAbstractMachineType_2011);
			KNOWN_ELEMENT_TYPES.add(EMRLocationType_2012);
			KNOWN_ELEMENT_TYPES.add(EMRMachineType_2013);
			KNOWN_ELEMENT_TYPES.add(EMRToolType_2014);
			KNOWN_ELEMENT_TYPES.add(EMRClassificationRelation_4009);
			KNOWN_ELEMENT_TYPES.add(EMRClassificationRelation_4010);
			KNOWN_ELEMENT_TYPES.add(EMRClassificationRelation_4011);
			KNOWN_ELEMENT_TYPES.add(EMRClassificationRelation_4012);
			KNOWN_ELEMENT_TYPES.add(EMRClassificationRelation_4013);
			KNOWN_ELEMENT_TYPES.add(EMRClassificationRelation_4014);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}
}
