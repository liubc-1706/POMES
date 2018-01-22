/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vpml.infopackage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfopackageFactoryImpl extends EFactoryImpl implements InfopackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfopackageFactory init() {
		try {
			InfopackageFactory theInfopackageFactory = (InfopackageFactory)EPackage.Registry.INSTANCE.getEFactory("http:///vpml/infopackage.ecore"); 
			if (theInfopackageFactory != null) {
				return theInfopackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfopackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfopackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InfopackagePackage.EMI_LEAF_PRODUCT: return createEMILeafProduct();
			case InfopackagePackage.EMI_DOCUMENT: return createEMIDocument();
			case InfopackagePackage.EMI_ARTIFACT: return createEMIArtifact();
			case InfopackagePackage.EMI_MESSAGE: return createEMIMessage();
			case InfopackagePackage.EMI_OTHER: return createEMIOther();
			case InfopackagePackage.EMI_PRODUCT_PACKAGE: return createEMIProductPackage();
			case InfopackagePackage.EMI_OBJECT: return createEMIObject();
			case InfopackagePackage.EMI_LOGICAL_CONNECTOR: return createEMILogicalConnector();
			case InfopackagePackage.EMI_COM_INFO: return createEMIComInfo();
			case InfopackagePackage.EMI_PRODUCT: return createEMIProduct();
			case InfopackagePackage.EMI_FLOW: return createEMIFlow();
			case InfopackagePackage.EMI_NODE: return createEMINode();
			case InfopackagePackage.EMI_REF_FLOW: return createEMIRefFlow();
			case InfopackagePackage.EMI_DATA_FLOW: return createEMIDataFlow();
			case InfopackagePackage.EMI_IN_CONNECTOR: return createEMIInConnector();
			case InfopackagePackage.EMI_OUT_CONNECTOR: return createEMIOutConnector();
			case InfopackagePackage.EMI_STATE_CONNECTOR: return createEMIStateConnector();
			case InfopackagePackage.EMI_IN_OR: return createEMIInOr();
			case InfopackagePackage.EMI_IN_AND: return createEMIInAnd();
			case InfopackagePackage.EMI_OUT_AND: return createEMIOutAnd();
			case InfopackagePackage.EMI_OUT_OR: return createEMIOutOr();
			case InfopackagePackage.EMI_DIAGRAM: return createEMIDiagram();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMILeafProduct createEMILeafProduct() {
		EMILeafProductImpl emiLeafProduct = new EMILeafProductImpl();
		return emiLeafProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIDocument createEMIDocument() {
		EMIDocumentImpl emiDocument = new EMIDocumentImpl();
		return emiDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIArtifact createEMIArtifact() {
		EMIArtifactImpl emiArtifact = new EMIArtifactImpl();
		return emiArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIOther createEMIOther() {
		EMIOtherImpl emiOther = new EMIOtherImpl();
		return emiOther;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIProductPackage createEMIProductPackage() {
		EMIProductPackageImpl emiProductPackage = new EMIProductPackageImpl();
		return emiProductPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIObject createEMIObject() {
		EMIObjectImpl emiObject = new EMIObjectImpl();
		return emiObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMILogicalConnector createEMILogicalConnector() {
		EMILogicalConnectorImpl emiLogicalConnector = new EMILogicalConnectorImpl();
		return emiLogicalConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIComInfo createEMIComInfo() {
		EMIComInfoImpl emiComInfo = new EMIComInfoImpl();
		return emiComInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIProduct createEMIProduct() {
		EMIProductImpl emiProduct = new EMIProductImpl();
		return emiProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIFlow createEMIFlow() {
		EMIFlowImpl emiFlow = new EMIFlowImpl();
		return emiFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMINode createEMINode() {
		EMINodeImpl emiNode = new EMINodeImpl();
		return emiNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIRefFlow createEMIRefFlow() {
		EMIRefFlowImpl emiRefFlow = new EMIRefFlowImpl();
		return emiRefFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIDataFlow createEMIDataFlow() {
		EMIDataFlowImpl emiDataFlow = new EMIDataFlowImpl();
		return emiDataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIInConnector createEMIInConnector() {
		EMIInConnectorImpl emiInConnector = new EMIInConnectorImpl();
		return emiInConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIOutConnector createEMIOutConnector() {
		EMIOutConnectorImpl emiOutConnector = new EMIOutConnectorImpl();
		return emiOutConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIStateConnector createEMIStateConnector() {
		EMIStateConnectorImpl emiStateConnector = new EMIStateConnectorImpl();
		return emiStateConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIInOr createEMIInOr() {
		EMIInOrImpl emiInOr = new EMIInOrImpl();
		return emiInOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIInAnd createEMIInAnd() {
		EMIInAndImpl emiInAnd = new EMIInAndImpl();
		return emiInAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIOutAnd createEMIOutAnd() {
		EMIOutAndImpl emiOutAnd = new EMIOutAndImpl();
		return emiOutAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIOutOr createEMIOutOr() {
		EMIOutOrImpl emiOutOr = new EMIOutOrImpl();
		return emiOutOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIDiagram createEMIDiagram() {
		EMIDiagramImpl emiDiagram = new EMIDiagramImpl();
		return emiDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIMessage createEMIMessage() {
		EMIMessageImpl emiMessage = new EMIMessageImpl();
		return emiMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfopackagePackage getInfopackagePackage() {
		return (InfopackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static InfopackagePackage getPackage() {
		return InfopackagePackage.eINSTANCE;
	}

} //InfopackageFactoryImpl
