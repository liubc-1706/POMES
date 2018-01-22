/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import vpml.EMDiagram;
import vpml.EMObject;

import vpml.processpackage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see vpml.processpackage.ProcesspackagePackage
 * @generated
 */
public class ProcesspackageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProcesspackagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcesspackageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProcesspackagePackage.eINSTANCE;
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
	protected ProcesspackageSwitch modelSwitch =
		new ProcesspackageSwitch() {
			public Object caseEMPNormalActivity(EMPNormalActivity object) {
				return createEMPNormalActivityAdapter();
			}
			public Object caseEMPBatchActivity(EMPBatchActivity object) {
				return createEMPBatchActivityAdapter();
			}
			public Object caseEMPActivity(EMPActivity object) {
				return createEMPActivityAdapter();
			}
			public Object caseEMPObject(EMPObject object) {
				return createEMPObjectAdapter();
			}
			public Object caseEMPFlow(EMPFlow object) {
				return createEMPFlowAdapter();
			}
			public Object caseEMPDataFlow(EMPDataFlow object) {
				return createEMPDataFlowAdapter();
			}
			public Object caseEMPAssFlow(EMPAssFlow object) {
				return createEMPAssFlowAdapter();
			}
			public Object caseEMPClockFlow(EMPClockFlow object) {
				return createEMPClockFlowAdapter();
			}
			public Object caseEMPLogicalConnector(EMPLogicalConnector object) {
				return createEMPLogicalConnectorAdapter();
			}
			public Object caseEMPInAnd(EMPInAnd object) {
				return createEMPInAndAdapter();
			}
			public Object caseEMPOutAnd(EMPOutAnd object) {
				return createEMPOutAndAdapter();
			}
			public Object caseEMPInOr(EMPInOr object) {
				return createEMPInOrAdapter();
			}
			public Object caseEMPOutOr(EMPOutOr object) {
				return createEMPOutOrAdapter();
			}
			public Object caseEMPClock(EMPClock object) {
				return createEMPClockAdapter();
			}
			public Object caseEMPCompActivity(EMPCompActivity object) {
				return createEMPCompActivityAdapter();
			}
			public Object caseEMPInConnector(EMPInConnector object) {
				return createEMPInConnectorAdapter();
			}
			public Object caseEMPOutConnector(EMPOutConnector object) {
				return createEMPOutConnectorAdapter();
			}
			public Object caseEMPLeafActivity(EMPLeafActivity object) {
				return createEMPLeafActivityAdapter();
			}
			public Object caseEMPProduct(EMPProduct object) {
				return createEMPProductAdapter();
			}
			public Object caseEMPProductPackage(EMPProductPackage object) {
				return createEMPProductPackageAdapter();
			}
			public Object caseEMPLeafProduct(EMPLeafProduct object) {
				return createEMPLeafProductAdapter();
			}
			public Object caseEMPRefFlow(EMPRefFlow object) {
				return createEMPRefFlowAdapter();
			}
			public Object caseEMPDocument(EMPDocument object) {
				return createEMPDocumentAdapter();
			}
			public Object caseEMPArtifact(EMPArtifact object) {
				return createEMPArtifactAdapter();
			}
			public Object caseEMPOther(EMPOther object) {
				return createEMPOtherAdapter();
			}
			public Object caseEMPAttributeItem(EMPAttributeItem object) {
				return createEMPAttributeItemAdapter();
			}
			public Object caseEMPAutoActivity(EMPAutoActivity object) {
				return createEMPAutoActivityAdapter();
			}
			public Object caseEMPManualBatchActivity(EMPManualBatchActivity object) {
				return createEMPManualBatchActivityAdapter();
			}
			public Object caseEMPAutoBatchActivity(EMPAutoBatchActivity object) {
				return createEMPAutoBatchActivityAdapter();
			}
			public Object caseEMPMessage(EMPMessage object) {
				return createEMPMessageAdapter();
			}
			public Object caseEMPDiagram(EMPDiagram object) {
				return createEMPDiagramAdapter();
			}
			public Object caseEMPMileStone(EMPMileStone object) {
				return createEMPMileStoneAdapter();
			}
			public Object caseEMPForm(EMPForm object) {
				return createEMPFormAdapter();
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
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPNormalActivity <em>EMP Normal Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPNormalActivity
	 * @generated
	 */
	public Adapter createEMPNormalActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPBatchActivity <em>EMP Batch Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPBatchActivity
	 * @generated
	 */
	public Adapter createEMPBatchActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPActivity <em>EMP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPActivity
	 * @generated
	 */
	public Adapter createEMPActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPObject <em>EMP Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPObject
	 * @generated
	 */
	public Adapter createEMPObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPFlow <em>EMP Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPFlow
	 * @generated
	 */
	public Adapter createEMPFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPDataFlow <em>EMP Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPDataFlow
	 * @generated
	 */
	public Adapter createEMPDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPAssFlow <em>EMP Ass Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPAssFlow
	 * @generated
	 */
	public Adapter createEMPAssFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPClockFlow <em>EMP Clock Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPClockFlow
	 * @generated
	 */
	public Adapter createEMPClockFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPLogicalConnector <em>EMP Logical Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPLogicalConnector
	 * @generated
	 */
	public Adapter createEMPLogicalConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPInAnd <em>EMP In And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPInAnd
	 * @generated
	 */
	public Adapter createEMPInAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPOutAnd <em>EMP Out And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPOutAnd
	 * @generated
	 */
	public Adapter createEMPOutAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPInOr <em>EMP In Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPInOr
	 * @generated
	 */
	public Adapter createEMPInOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPOutOr <em>EMP Out Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPOutOr
	 * @generated
	 */
	public Adapter createEMPOutOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPClock <em>EMP Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPClock
	 * @generated
	 */
	public Adapter createEMPClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPCompActivity <em>EMP Comp Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPCompActivity
	 * @generated
	 */
	public Adapter createEMPCompActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPInConnector <em>EMP In Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPInConnector
	 * @generated
	 */
	public Adapter createEMPInConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPOutConnector <em>EMP Out Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPOutConnector
	 * @generated
	 */
	public Adapter createEMPOutConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPLeafActivity <em>EMP Leaf Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPLeafActivity
	 * @generated
	 */
	public Adapter createEMPLeafActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPProduct <em>EMP Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPProduct
	 * @generated
	 */
	public Adapter createEMPProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPProductPackage <em>EMP Product Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPProductPackage
	 * @generated
	 */
	public Adapter createEMPProductPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPLeafProduct <em>EMP Leaf Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPLeafProduct
	 * @generated
	 */
	public Adapter createEMPLeafProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPRefFlow <em>EMP Ref Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPRefFlow
	 * @generated
	 */
	public Adapter createEMPRefFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPDocument <em>EMP Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPDocument
	 * @generated
	 */
	public Adapter createEMPDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPArtifact <em>EMP Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPArtifact
	 * @generated
	 */
	public Adapter createEMPArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPOther <em>EMP Other</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPOther
	 * @generated
	 */
	public Adapter createEMPOtherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPAttributeItem <em>EMP Attribute Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPAttributeItem
	 * @generated
	 */
	public Adapter createEMPAttributeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPAutoActivity <em>EMP Auto Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPAutoActivity
	 * @generated
	 */
	public Adapter createEMPAutoActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPManualBatchActivity <em>EMP Manual Batch Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPManualBatchActivity
	 * @generated
	 */
	public Adapter createEMPManualBatchActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPAutoBatchActivity <em>EMP Auto Batch Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPAutoBatchActivity
	 * @generated
	 */
	public Adapter createEMPAutoBatchActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPMessage <em>EMP Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPMessage
	 * @generated
	 */
	public Adapter createEMPMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPDiagram <em>EMP Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPDiagram
	 * @generated
	 */
	public Adapter createEMPDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPMileStone <em>EMP Mile Stone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPMileStone
	 * @generated
	 */
	public Adapter createEMPMileStoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.processpackage.EMPForm <em>EMP Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.processpackage.EMPForm
	 * @generated
	 */
	public Adapter createEMPFormAdapter() {
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

} //ProcesspackageAdapterFactory
