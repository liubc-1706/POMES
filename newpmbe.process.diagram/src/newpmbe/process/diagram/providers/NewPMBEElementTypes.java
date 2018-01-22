package newpmbe.process.diagram.providers;

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
import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;

import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.processpackage.ProcesspackagePackage;

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
			elements.put(EMPDiagram_1000, ProcesspackagePackage.eINSTANCE
					.getEMPDiagram());
			elements.put(EMPAutoBatchActivity_2048,
					ProcesspackagePackage.eINSTANCE.getEMPAutoBatchActivity());
			elements.put(EMPOutOr_2024, ProcesspackagePackage.eINSTANCE
					.getEMPOutOr());
			elements.put(EMPDocument_2025, ProcesspackagePackage.eINSTANCE
					.getEMPDocument());
			elements.put(EMPProductPackage_2026,
					ProcesspackagePackage.eINSTANCE.getEMPProductPackage());
			elements.put(EMPNormalActivity_2044,
					ProcesspackagePackage.eINSTANCE.getEMPNormalActivity());
			elements.put(EMPOther_2028, ProcesspackagePackage.eINSTANCE
					.getEMPOther());
			elements.put(EMPMessage_2029, ProcesspackagePackage.eINSTANCE
					.getEMPMessage());
			elements.put(EMPCompActivity_2045, ProcesspackagePackage.eINSTANCE
					.getEMPCompActivity());
			elements.put(EMPOutAnd_2031, ProcesspackagePackage.eINSTANCE
					.getEMPOutAnd());
			elements
					.put(EMPManualBatchActivity_2046,
							ProcesspackagePackage.eINSTANCE
									.getEMPManualBatchActivity());
			elements.put(EMPClock_2033, ProcesspackagePackage.eINSTANCE
					.getEMPClock());
			elements.put(EMPInAnd_2034, ProcesspackagePackage.eINSTANCE
					.getEMPInAnd());
			elements.put(EMPInOr_2035, ProcesspackagePackage.eINSTANCE
					.getEMPInOr());
			elements.put(EMPAutoActivity_2047, ProcesspackagePackage.eINSTANCE
					.getEMPAutoActivity());
			elements.put(EMPArtifact_2037, ProcesspackagePackage.eINSTANCE
					.getEMPArtifact());
			elements.put(EMOResourceGroupType_2038,
					OrganizationpackagePackage.eINSTANCE
							.getEMOResourceGroupType());
			elements.put(EMRToolType_2039, ResourcepackagePackage.eINSTANCE
					.getEMRToolType());
			elements.put(EMRRole_2040, ResourcepackagePackage.eINSTANCE
					.getEMRRole());
			elements.put(EMRMachineType_2041, ResourcepackagePackage.eINSTANCE
					.getEMRMachineType());
			elements.put(EMRLocationType_2042, ResourcepackagePackage.eINSTANCE
					.getEMRLocationType());
			elements.put(EMPForm_2049, ProcesspackagePackage.eINSTANCE
					.getEMPForm());
			elements.put(EMPClockFlow_4001, ProcesspackagePackage.eINSTANCE
					.getEMPClockFlow());
			elements.put(EMPAssFlow_4003, ProcesspackagePackage.eINSTANCE
					.getEMPAssFlow());
			elements.put(EMPRefFlow_4004, ProcesspackagePackage.eINSTANCE
					.getEMPRefFlow());
			elements.put(EMPDataFlow_4002, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPAssFlow_4006, ProcesspackagePackage.eINSTANCE
					.getEMPAssFlow());
			elements.put(EMPAssFlow_4007, ProcesspackagePackage.eINSTANCE
					.getEMPAssFlow());
			elements.put(EMPAssFlow_4008, ProcesspackagePackage.eINSTANCE
					.getEMPAssFlow());
			elements.put(EMPAssFlow_4009, ProcesspackagePackage.eINSTANCE
					.getEMPAssFlow());
			elements.put(EMPAssFlow_4010, ProcesspackagePackage.eINSTANCE
					.getEMPAssFlow());
			elements.put(EMPAssFlow_4011, ProcesspackagePackage.eINSTANCE
					.getEMPAssFlow());
			elements.put(EMPAssFlow_4012, ProcesspackagePackage.eINSTANCE
					.getEMPAssFlow());
			elements.put(EMPAssFlow_4013, ProcesspackagePackage.eINSTANCE
					.getEMPAssFlow());
			elements.put(EMPAssFlow_4014, ProcesspackagePackage.eINSTANCE
					.getEMPAssFlow());
			elements.put(EMPAssFlow_4015, ProcesspackagePackage.eINSTANCE
					.getEMPAssFlow());
			elements.put(EMPAssFlow_4025, ProcesspackagePackage.eINSTANCE
					.getEMPAssFlow());
			elements.put(EMPAssFlow_4026, ProcesspackagePackage.eINSTANCE
					.getEMPAssFlow());
			elements.put(EMPAssFlow_4027, ProcesspackagePackage.eINSTANCE
					.getEMPAssFlow());
			elements.put(EMPAssFlow_4028, ProcesspackagePackage.eINSTANCE
					.getEMPAssFlow());
			elements.put(EMPAssFlow_4029, ProcesspackagePackage.eINSTANCE
					.getEMPAssFlow());
			elements.put(EMPDataFlow_4005, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPDataFlow_4016, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPDataFlow_4017, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPDataFlow_4018, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPDataFlow_4019, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPDataFlow_4020, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPDataFlow_4021, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPDataFlow_4022, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPDataFlow_4023, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPDataFlow_4030, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPDataFlow_4031, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPDataFlow_4032, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPDataFlow_4033, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPDataFlow_4034, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPDataFlow_4035, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPDataFlow_4036, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
			elements.put(EMPDataFlow_4037, ProcesspackagePackage.eINSTANCE
					.getEMPDataFlow());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	public static final IElementType EMPDiagram_1000 = getElementType("newpmbe.process.diagram.EMPDiagram_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAutoBatchActivity_2048 = getElementType("newpmbe.process.diagram.EMPAutoBatchActivity_2048"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPOutOr_2024 = getElementType("newpmbe.process.diagram.EMPOutOr_2024"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDocument_2025 = getElementType("newpmbe.process.diagram.EMPDocument_2025"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPProductPackage_2026 = getElementType("newpmbe.process.diagram.EMPProductPackage_2026"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPNormalActivity_2044 = getElementType("newpmbe.process.diagram.EMPNormalActivity_2044"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPOther_2028 = getElementType("newpmbe.process.diagram.EMPOther_2028"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPMessage_2029 = getElementType("newpmbe.process.diagram.EMPMessage_2029"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPCompActivity_2045 = getElementType("newpmbe.process.diagram.EMPCompActivity_2045"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPOutAnd_2031 = getElementType("newpmbe.process.diagram.EMPOutAnd_2031"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPManualBatchActivity_2046 = getElementType("newpmbe.process.diagram.EMPManualBatchActivity_2046"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPClock_2033 = getElementType("newpmbe.process.diagram.EMPClock_2033"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPInAnd_2034 = getElementType("newpmbe.process.diagram.EMPInAnd_2034"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPInOr_2035 = getElementType("newpmbe.process.diagram.EMPInOr_2035"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAutoActivity_2047 = getElementType("newpmbe.process.diagram.EMPAutoActivity_2047"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPArtifact_2037 = getElementType("newpmbe.process.diagram.EMPArtifact_2037"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMOResourceGroupType_2038 = getElementType("newpmbe.process.diagram.EMOResourceGroupType_2038"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRToolType_2039 = getElementType("newpmbe.process.diagram.EMRToolType_2039"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRRole_2040 = getElementType("newpmbe.process.diagram.EMRRole_2040"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRMachineType_2041 = getElementType("newpmbe.process.diagram.EMRMachineType_2041"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMRLocationType_2042 = getElementType("newpmbe.process.diagram.EMRLocationType_2042"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPForm_2049 = getElementType("newpmbe.process.diagram.EMPForm_2049"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPClockFlow_4001 = getElementType("newpmbe.process.diagram.EMPClockFlow_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4002 = getElementType("newpmbe.process.diagram.EMPDataFlow_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAssFlow_4003 = getElementType("newpmbe.process.diagram.EMPAssFlow_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPRefFlow_4004 = getElementType("newpmbe.process.diagram.EMPRefFlow_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4005 = getElementType("newpmbe.process.diagram.EMPDataFlow_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4016 = getElementType("newpmbe.process.diagram.EMPDataFlow_4016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4017 = getElementType("newpmbe.process.diagram.EMPDataFlow_4017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4018 = getElementType("newpmbe.process.diagram.EMPDataFlow_4018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4019 = getElementType("newpmbe.process.diagram.EMPDataFlow_4019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4020 = getElementType("newpmbe.process.diagram.EMPDataFlow_4020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAssFlow_4006 = getElementType("newpmbe.process.diagram.EMPAssFlow_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAssFlow_4007 = getElementType("newpmbe.process.diagram.EMPAssFlow_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAssFlow_4008 = getElementType("newpmbe.process.diagram.EMPAssFlow_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAssFlow_4009 = getElementType("newpmbe.process.diagram.EMPAssFlow_4009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAssFlow_4010 = getElementType("newpmbe.process.diagram.EMPAssFlow_4010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAssFlow_4011 = getElementType("newpmbe.process.diagram.EMPAssFlow_4011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAssFlow_4012 = getElementType("newpmbe.process.diagram.EMPAssFlow_4012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAssFlow_4013 = getElementType("newpmbe.process.diagram.EMPAssFlow_4013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAssFlow_4014 = getElementType("newpmbe.process.diagram.EMPAssFlow_4014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAssFlow_4015 = getElementType("newpmbe.process.diagram.EMPAssFlow_4015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAssFlow_4025 = getElementType("newpmbe.process.diagram.EMPAssFlow_4025"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAssFlow_4026 = getElementType("newpmbe.process.diagram.EMPAssFlow_4026"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAssFlow_4027 = getElementType("newpmbe.process.diagram.EMPAssFlow_4027"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAssFlow_4028 = getElementType("newpmbe.process.diagram.EMPAssFlow_4028"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPAssFlow_4029 = getElementType("newpmbe.process.diagram.EMPAssFlow_4029"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4021 = getElementType("newpmbe.process.diagram.EMPDataFlow_4021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4022 = getElementType("newpmbe.process.diagram.EMPDataFlow_4022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4023 = getElementType("newpmbe.process.diagram.EMPDataFlow_4023"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4030 = getElementType("newpmbe.process.diagram.EMPDataFlow_4030"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4031 = getElementType("newpmbe.process.diagram.EMPDataFlow_4031"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4032 = getElementType("newpmbe.process.diagram.EMPDataFlow_4032"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4033 = getElementType("newpmbe.process.diagram.EMPDataFlow_4033"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4034 = getElementType("newpmbe.process.diagram.EMPDataFlow_4034"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4035 = getElementType("newpmbe.process.diagram.EMPDataFlow_4035"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4036 = getElementType("newpmbe.process.diagram.EMPDataFlow_4036"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EMPDataFlow_4037 = getElementType("newpmbe.process.diagram.EMPDataFlow_4037"); //$NON-NLS-1$

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
			KNOWN_ELEMENT_TYPES.add(EMPAutoBatchActivity_2048);
			KNOWN_ELEMENT_TYPES.add(EMPOutOr_2024);
			KNOWN_ELEMENT_TYPES.add(EMPDocument_2025);
			KNOWN_ELEMENT_TYPES.add(EMPProductPackage_2026);
			KNOWN_ELEMENT_TYPES.add(EMPNormalActivity_2044);
			KNOWN_ELEMENT_TYPES.add(EMPOther_2028);
			KNOWN_ELEMENT_TYPES.add(EMPMessage_2029);
			KNOWN_ELEMENT_TYPES.add(EMPCompActivity_2045);
			KNOWN_ELEMENT_TYPES.add(EMPOutAnd_2031);
			KNOWN_ELEMENT_TYPES.add(EMPManualBatchActivity_2046);
			KNOWN_ELEMENT_TYPES.add(EMPClock_2033);
			KNOWN_ELEMENT_TYPES.add(EMPInAnd_2034);
			KNOWN_ELEMENT_TYPES.add(EMPInOr_2035);
			KNOWN_ELEMENT_TYPES.add(EMPAutoActivity_2047);
			KNOWN_ELEMENT_TYPES.add(EMPArtifact_2037);
			KNOWN_ELEMENT_TYPES.add(EMOResourceGroupType_2038);
			KNOWN_ELEMENT_TYPES.add(EMRToolType_2039);
			KNOWN_ELEMENT_TYPES.add(EMRRole_2040);
			KNOWN_ELEMENT_TYPES.add(EMRMachineType_2041);
			KNOWN_ELEMENT_TYPES.add(EMRLocationType_2042);
			KNOWN_ELEMENT_TYPES.add(EMPForm_2049);
			KNOWN_ELEMENT_TYPES.add(EMPClockFlow_4001);
			KNOWN_ELEMENT_TYPES.add(EMPAssFlow_4003);
			KNOWN_ELEMENT_TYPES.add(EMPRefFlow_4004);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4002);
			KNOWN_ELEMENT_TYPES.add(EMPAssFlow_4006);
			KNOWN_ELEMENT_TYPES.add(EMPAssFlow_4007);
			KNOWN_ELEMENT_TYPES.add(EMPAssFlow_4008);
			KNOWN_ELEMENT_TYPES.add(EMPAssFlow_4009);
			KNOWN_ELEMENT_TYPES.add(EMPAssFlow_4010);
			KNOWN_ELEMENT_TYPES.add(EMPAssFlow_4011);
			KNOWN_ELEMENT_TYPES.add(EMPAssFlow_4012);
			KNOWN_ELEMENT_TYPES.add(EMPAssFlow_4013);
			KNOWN_ELEMENT_TYPES.add(EMPAssFlow_4014);
			KNOWN_ELEMENT_TYPES.add(EMPAssFlow_4015);
			KNOWN_ELEMENT_TYPES.add(EMPAssFlow_4025);
			KNOWN_ELEMENT_TYPES.add(EMPAssFlow_4026);
			KNOWN_ELEMENT_TYPES.add(EMPAssFlow_4027);
			KNOWN_ELEMENT_TYPES.add(EMPAssFlow_4028);
			KNOWN_ELEMENT_TYPES.add(EMPAssFlow_4029);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4005);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4016);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4017);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4018);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4019);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4020);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4021);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4022);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4023);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4030);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4031);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4032);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4033);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4034);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4035);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4036);
			KNOWN_ELEMENT_TYPES.add(EMPDataFlow_4037);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}
}
