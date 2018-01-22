/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vpml.processpackage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcesspackageFactoryImpl extends EFactoryImpl implements ProcesspackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcesspackageFactory init() {
		try {
			ProcesspackageFactory theProcesspackageFactory = (ProcesspackageFactory)EPackage.Registry.INSTANCE.getEFactory("http:///vpml/processpackage.ecore"); 
			if (theProcesspackageFactory != null) {
				return theProcesspackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProcesspackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcesspackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProcesspackagePackage.EMP_NORMAL_ACTIVITY: return createEMPNormalActivity();
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY: return createEMPBatchActivity();
			case ProcesspackagePackage.EMP_ACTIVITY: return createEMPActivity();
			case ProcesspackagePackage.EMP_OBJECT: return createEMPObject();
			case ProcesspackagePackage.EMP_FLOW: return createEMPFlow();
			case ProcesspackagePackage.EMP_DATA_FLOW: return createEMPDataFlow();
			case ProcesspackagePackage.EMP_ASS_FLOW: return createEMPAssFlow();
			case ProcesspackagePackage.EMP_CLOCK_FLOW: return createEMPClockFlow();
			case ProcesspackagePackage.EMP_LOGICAL_CONNECTOR: return createEMPLogicalConnector();
			case ProcesspackagePackage.EMP_IN_AND: return createEMPInAnd();
			case ProcesspackagePackage.EMP_OUT_AND: return createEMPOutAnd();
			case ProcesspackagePackage.EMP_IN_OR: return createEMPInOr();
			case ProcesspackagePackage.EMP_OUT_OR: return createEMPOutOr();
			case ProcesspackagePackage.EMP_CLOCK: return createEMPClock();
			case ProcesspackagePackage.EMP_COMP_ACTIVITY: return createEMPCompActivity();
			case ProcesspackagePackage.EMP_IN_CONNECTOR: return createEMPInConnector();
			case ProcesspackagePackage.EMP_OUT_CONNECTOR: return createEMPOutConnector();
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY: return createEMPLeafActivity();
			case ProcesspackagePackage.EMP_PRODUCT: return createEMPProduct();
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE: return createEMPProductPackage();
			case ProcesspackagePackage.EMP_LEAF_PRODUCT: return createEMPLeafProduct();
			case ProcesspackagePackage.EMP_REF_FLOW: return createEMPRefFlow();
			case ProcesspackagePackage.EMP_DOCUMENT: return createEMPDocument();
			case ProcesspackagePackage.EMP_ARTIFACT: return createEMPArtifact();
			case ProcesspackagePackage.EMP_OTHER: return createEMPOther();
			case ProcesspackagePackage.EMP_ATTRIBUTE_ITEM: return createEMPAttributeItem();
			case ProcesspackagePackage.EMP_AUTO_ACTIVITY: return createEMPAutoActivity();
			case ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY: return createEMPManualBatchActivity();
			case ProcesspackagePackage.EMP_AUTO_BATCH_ACTIVITY: return createEMPAutoBatchActivity();
			case ProcesspackagePackage.EMP_MESSAGE: return createEMPMessage();
			case ProcesspackagePackage.EMP_DIAGRAM: return createEMPDiagram();
			case ProcesspackagePackage.EMP_MILE_STONE: return createEMPMileStone();
			case ProcesspackagePackage.EMP_FORM: return createEMPForm();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPNormalActivity createEMPNormalActivity() {
		EMPNormalActivityImpl empNormalActivity = new EMPNormalActivityImpl();
		return empNormalActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPBatchActivity createEMPBatchActivity() {
		EMPBatchActivityImpl empBatchActivity = new EMPBatchActivityImpl();
		return empBatchActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPActivity createEMPActivity() {
		EMPActivityImpl empActivity = new EMPActivityImpl();
		return empActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPObject createEMPObject() {
		EMPObjectImpl empObject = new EMPObjectImpl();
		return empObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPFlow createEMPFlow() {
		EMPFlowImpl empFlow = new EMPFlowImpl();
		return empFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPDataFlow createEMPDataFlow() {
		EMPDataFlowImpl empDataFlow = new EMPDataFlowImpl();
		return empDataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPAssFlow createEMPAssFlow() {
		EMPAssFlowImpl empAssFlow = new EMPAssFlowImpl();
		return empAssFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPClockFlow createEMPClockFlow() {
		EMPClockFlowImpl empClockFlow = new EMPClockFlowImpl();
		return empClockFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPLogicalConnector createEMPLogicalConnector() {
		EMPLogicalConnectorImpl empLogicalConnector = new EMPLogicalConnectorImpl();
		return empLogicalConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPInAnd createEMPInAnd() {
		EMPInAndImpl empInAnd = new EMPInAndImpl();
		return empInAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPOutAnd createEMPOutAnd() {
		EMPOutAndImpl empOutAnd = new EMPOutAndImpl();
		return empOutAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPInOr createEMPInOr() {
		EMPInOrImpl empInOr = new EMPInOrImpl();
		return empInOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPOutOr createEMPOutOr() {
		EMPOutOrImpl empOutOr = new EMPOutOrImpl();
		return empOutOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPClock createEMPClock() {
		EMPClockImpl empClock = new EMPClockImpl();
		return empClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPCompActivity createEMPCompActivity() {
		EMPCompActivityImpl empCompActivity = new EMPCompActivityImpl();
		return empCompActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPInConnector createEMPInConnector() {
		EMPInConnectorImpl empInConnector = new EMPInConnectorImpl();
		return empInConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPOutConnector createEMPOutConnector() {
		EMPOutConnectorImpl empOutConnector = new EMPOutConnectorImpl();
		return empOutConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPLeafActivity createEMPLeafActivity() {
		EMPLeafActivityImpl empLeafActivity = new EMPLeafActivityImpl();
		return empLeafActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPProduct createEMPProduct() {
		EMPProductImpl empProduct = new EMPProductImpl();
		return empProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPProductPackage createEMPProductPackage() {
		EMPProductPackageImpl empProductPackage = new EMPProductPackageImpl();
		return empProductPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPLeafProduct createEMPLeafProduct() {
		EMPLeafProductImpl empLeafProduct = new EMPLeafProductImpl();
		return empLeafProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPRefFlow createEMPRefFlow() {
		EMPRefFlowImpl empRefFlow = new EMPRefFlowImpl();
		return empRefFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPDocument createEMPDocument() {
		EMPDocumentImpl empDocument = new EMPDocumentImpl();
		return empDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPArtifact createEMPArtifact() {
		EMPArtifactImpl empArtifact = new EMPArtifactImpl();
		return empArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPOther createEMPOther() {
		EMPOtherImpl empOther = new EMPOtherImpl();
		return empOther;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPAttributeItem createEMPAttributeItem() {
		EMPAttributeItemImpl empAttributeItem = new EMPAttributeItemImpl();
		return empAttributeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPAutoActivity createEMPAutoActivity() {
		EMPAutoActivityImpl empAutoActivity = new EMPAutoActivityImpl();
		return empAutoActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPManualBatchActivity createEMPManualBatchActivity() {
		EMPManualBatchActivityImpl empManualBatchActivity = new EMPManualBatchActivityImpl();
		return empManualBatchActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPAutoBatchActivity createEMPAutoBatchActivity() {
		EMPAutoBatchActivityImpl empAutoBatchActivity = new EMPAutoBatchActivityImpl();
		return empAutoBatchActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPMessage createEMPMessage() {
		EMPMessageImpl empMessage = new EMPMessageImpl();
		return empMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPDiagram createEMPDiagram() {
		EMPDiagramImpl empDiagram = new EMPDiagramImpl();
		return empDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPMileStone createEMPMileStone() {
		EMPMileStoneImpl empMileStone = new EMPMileStoneImpl();
		return empMileStone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPForm createEMPForm() {
		EMPFormImpl empForm = new EMPFormImpl();
		return empForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcesspackagePackage getProcesspackagePackage() {
		return (ProcesspackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ProcesspackagePackage getPackage() {
		return ProcesspackagePackage.eINSTANCE;
	}

} //ProcesspackageFactoryImpl
