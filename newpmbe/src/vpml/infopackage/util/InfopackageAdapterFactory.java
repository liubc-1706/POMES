/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import vpml.EMDiagram;
import vpml.EMObject;

import vpml.infopackage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see vpml.infopackage.InfopackagePackage
 * @generated
 */
public class InfopackageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfopackagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfopackageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InfopackagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfopackageSwitch modelSwitch =
		new InfopackageSwitch() {
			public Object caseEMILeafProduct(EMILeafProduct object) {
				return createEMILeafProductAdapter();
			}
			public Object caseEMIDocument(EMIDocument object) {
				return createEMIDocumentAdapter();
			}
			public Object caseEMIArtifact(EMIArtifact object) {
				return createEMIArtifactAdapter();
			}
			public Object caseEMIMessage(EMIMessage object) {
				return createEMIMessageAdapter();
			}
			public Object caseEMIOther(EMIOther object) {
				return createEMIOtherAdapter();
			}
			public Object caseEMIProductPackage(EMIProductPackage object) {
				return createEMIProductPackageAdapter();
			}
			public Object caseEMIObject(EMIObject object) {
				return createEMIObjectAdapter();
			}
			public Object caseEMILogicalConnector(EMILogicalConnector object) {
				return createEMILogicalConnectorAdapter();
			}
			public Object caseEMIComInfo(EMIComInfo object) {
				return createEMIComInfoAdapter();
			}
			public Object caseEMIProduct(EMIProduct object) {
				return createEMIProductAdapter();
			}
			public Object caseEMIFlow(EMIFlow object) {
				return createEMIFlowAdapter();
			}
			public Object caseEMINode(EMINode object) {
				return createEMINodeAdapter();
			}
			public Object caseEMIRefFlow(EMIRefFlow object) {
				return createEMIRefFlowAdapter();
			}
			public Object caseEMIDataFlow(EMIDataFlow object) {
				return createEMIDataFlowAdapter();
			}
			public Object caseEMIInConnector(EMIInConnector object) {
				return createEMIInConnectorAdapter();
			}
			public Object caseEMIOutConnector(EMIOutConnector object) {
				return createEMIOutConnectorAdapter();
			}
			public Object caseEMIStateConnector(EMIStateConnector object) {
				return createEMIStateConnectorAdapter();
			}
			public Object caseEMIInOr(EMIInOr object) {
				return createEMIInOrAdapter();
			}
			public Object caseEMIInAnd(EMIInAnd object) {
				return createEMIInAndAdapter();
			}
			public Object caseEMIOutAnd(EMIOutAnd object) {
				return createEMIOutAndAdapter();
			}
			public Object caseEMIOutOr(EMIOutOr object) {
				return createEMIOutOrAdapter();
			}
			public Object caseEMIDiagram(EMIDiagram object) {
				return createEMIDiagramAdapter();
			}
			public Object caseEMObject(EMObject object) {
				return createEMObjectAdapter();
			}
			public Object caseEMDiagram(EMDiagram object) {
				return createEMDiagramAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMILeafProduct <em>EMI Leaf Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMILeafProduct
	 * @generated
	 */
	public Adapter createEMILeafProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIDocument <em>EMI Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIDocument
	 * @generated
	 */
	public Adapter createEMIDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIArtifact <em>EMI Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIArtifact
	 * @generated
	 */
	public Adapter createEMIArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIOther <em>EMI Other</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIOther
	 * @generated
	 */
	public Adapter createEMIOtherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIProductPackage <em>EMI Product Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIProductPackage
	 * @generated
	 */
	public Adapter createEMIProductPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIObject <em>EMI Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIObject
	 * @generated
	 */
	public Adapter createEMIObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMILogicalConnector <em>EMI Logical Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMILogicalConnector
	 * @generated
	 */
	public Adapter createEMILogicalConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIComInfo <em>EMI Com Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIComInfo
	 * @generated
	 */
	public Adapter createEMIComInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIProduct <em>EMI Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIProduct
	 * @generated
	 */
	public Adapter createEMIProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIFlow <em>EMI Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIFlow
	 * @generated
	 */
	public Adapter createEMIFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMINode <em>EMI Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMINode
	 * @generated
	 */
	public Adapter createEMINodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIRefFlow <em>EMI Ref Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIRefFlow
	 * @generated
	 */
	public Adapter createEMIRefFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIDataFlow <em>EMI Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIDataFlow
	 * @generated
	 */
	public Adapter createEMIDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIInConnector <em>EMI In Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIInConnector
	 * @generated
	 */
	public Adapter createEMIInConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIOutConnector <em>EMI Out Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIOutConnector
	 * @generated
	 */
	public Adapter createEMIOutConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIStateConnector <em>EMI State Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIStateConnector
	 * @generated
	 */
	public Adapter createEMIStateConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIInOr <em>EMI In Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIInOr
	 * @generated
	 */
	public Adapter createEMIInOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIInAnd <em>EMI In And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIInAnd
	 * @generated
	 */
	public Adapter createEMIInAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIOutAnd <em>EMI Out And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIOutAnd
	 * @generated
	 */
	public Adapter createEMIOutAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIOutOr <em>EMI Out Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIOutOr
	 * @generated
	 */
	public Adapter createEMIOutOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIDiagram <em>EMI Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIDiagram
	 * @generated
	 */
	public Adapter createEMIDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.infopackage.EMIMessage <em>EMI Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.infopackage.EMIMessage
	 * @generated
	 */
	public Adapter createEMIMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.EMObject <em>EM Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.EMObject
	 * @generated
	 */
	public Adapter createEMObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.EMDiagram <em>EM Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.EMDiagram
	 * @generated
	 */
	public Adapter createEMDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //InfopackageAdapterFactory
