/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import vpml.EMDiagram;
import vpml.EMObject;

import vpml.processpackage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see vpml.processpackage.ProcesspackagePackage
 * @generated
 */
public class ProcesspackageSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProcesspackagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcesspackageSwitch() {
		if (modelPackage == null) {
			modelPackage = ProcesspackagePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProcesspackagePackage.EMP_NORMAL_ACTIVITY: {
				EMPNormalActivity empNormalActivity = (EMPNormalActivity)theEObject;
				Object result = caseEMPNormalActivity(empNormalActivity);
				if (result == null) result = caseEMPLeafActivity(empNormalActivity);
				if (result == null) result = caseEMPActivity(empNormalActivity);
				if (result == null) result = caseEMPObject(empNormalActivity);
				if (result == null) result = caseEMObject(empNormalActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY: {
				EMPBatchActivity empBatchActivity = (EMPBatchActivity)theEObject;
				Object result = caseEMPBatchActivity(empBatchActivity);
				if (result == null) result = caseEMPLeafActivity(empBatchActivity);
				if (result == null) result = caseEMPActivity(empBatchActivity);
				if (result == null) result = caseEMPObject(empBatchActivity);
				if (result == null) result = caseEMObject(empBatchActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_ACTIVITY: {
				EMPActivity empActivity = (EMPActivity)theEObject;
				Object result = caseEMPActivity(empActivity);
				if (result == null) result = caseEMPObject(empActivity);
				if (result == null) result = caseEMObject(empActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_OBJECT: {
				EMPObject empObject = (EMPObject)theEObject;
				Object result = caseEMPObject(empObject);
				if (result == null) result = caseEMObject(empObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_FLOW: {
				EMPFlow empFlow = (EMPFlow)theEObject;
				Object result = caseEMPFlow(empFlow);
				if (result == null) result = caseEMPObject(empFlow);
				if (result == null) result = caseEMObject(empFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_DATA_FLOW: {
				EMPDataFlow empDataFlow = (EMPDataFlow)theEObject;
				Object result = caseEMPDataFlow(empDataFlow);
				if (result == null) result = caseEMPFlow(empDataFlow);
				if (result == null) result = caseEMPObject(empDataFlow);
				if (result == null) result = caseEMObject(empDataFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_ASS_FLOW: {
				EMPAssFlow empAssFlow = (EMPAssFlow)theEObject;
				Object result = caseEMPAssFlow(empAssFlow);
				if (result == null) result = caseEMPFlow(empAssFlow);
				if (result == null) result = caseEMPObject(empAssFlow);
				if (result == null) result = caseEMObject(empAssFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_CLOCK_FLOW: {
				EMPClockFlow empClockFlow = (EMPClockFlow)theEObject;
				Object result = caseEMPClockFlow(empClockFlow);
				if (result == null) result = caseEMPFlow(empClockFlow);
				if (result == null) result = caseEMPObject(empClockFlow);
				if (result == null) result = caseEMObject(empClockFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_LOGICAL_CONNECTOR: {
				EMPLogicalConnector empLogicalConnector = (EMPLogicalConnector)theEObject;
				Object result = caseEMPLogicalConnector(empLogicalConnector);
				if (result == null) result = caseEMPObject(empLogicalConnector);
				if (result == null) result = caseEMObject(empLogicalConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_IN_AND: {
				EMPInAnd empInAnd = (EMPInAnd)theEObject;
				Object result = caseEMPInAnd(empInAnd);
				if (result == null) result = caseEMPInConnector(empInAnd);
				if (result == null) result = caseEMPLogicalConnector(empInAnd);
				if (result == null) result = caseEMPObject(empInAnd);
				if (result == null) result = caseEMObject(empInAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_OUT_AND: {
				EMPOutAnd empOutAnd = (EMPOutAnd)theEObject;
				Object result = caseEMPOutAnd(empOutAnd);
				if (result == null) result = caseEMPOutConnector(empOutAnd);
				if (result == null) result = caseEMPLogicalConnector(empOutAnd);
				if (result == null) result = caseEMPObject(empOutAnd);
				if (result == null) result = caseEMObject(empOutAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_IN_OR: {
				EMPInOr empInOr = (EMPInOr)theEObject;
				Object result = caseEMPInOr(empInOr);
				if (result == null) result = caseEMPInConnector(empInOr);
				if (result == null) result = caseEMPLogicalConnector(empInOr);
				if (result == null) result = caseEMPObject(empInOr);
				if (result == null) result = caseEMObject(empInOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_OUT_OR: {
				EMPOutOr empOutOr = (EMPOutOr)theEObject;
				Object result = caseEMPOutOr(empOutOr);
				if (result == null) result = caseEMPOutConnector(empOutOr);
				if (result == null) result = caseEMPLogicalConnector(empOutOr);
				if (result == null) result = caseEMPObject(empOutOr);
				if (result == null) result = caseEMObject(empOutOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_CLOCK: {
				EMPClock empClock = (EMPClock)theEObject;
				Object result = caseEMPClock(empClock);
				if (result == null) result = caseEMPObject(empClock);
				if (result == null) result = caseEMObject(empClock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_COMP_ACTIVITY: {
				EMPCompActivity empCompActivity = (EMPCompActivity)theEObject;
				Object result = caseEMPCompActivity(empCompActivity);
				if (result == null) result = caseEMPActivity(empCompActivity);
				if (result == null) result = caseEMPObject(empCompActivity);
				if (result == null) result = caseEMObject(empCompActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_IN_CONNECTOR: {
				EMPInConnector empInConnector = (EMPInConnector)theEObject;
				Object result = caseEMPInConnector(empInConnector);
				if (result == null) result = caseEMPLogicalConnector(empInConnector);
				if (result == null) result = caseEMPObject(empInConnector);
				if (result == null) result = caseEMObject(empInConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_OUT_CONNECTOR: {
				EMPOutConnector empOutConnector = (EMPOutConnector)theEObject;
				Object result = caseEMPOutConnector(empOutConnector);
				if (result == null) result = caseEMPLogicalConnector(empOutConnector);
				if (result == null) result = caseEMPObject(empOutConnector);
				if (result == null) result = caseEMObject(empOutConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY: {
				EMPLeafActivity empLeafActivity = (EMPLeafActivity)theEObject;
				Object result = caseEMPLeafActivity(empLeafActivity);
				if (result == null) result = caseEMPActivity(empLeafActivity);
				if (result == null) result = caseEMPObject(empLeafActivity);
				if (result == null) result = caseEMObject(empLeafActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_PRODUCT: {
				EMPProduct empProduct = (EMPProduct)theEObject;
				Object result = caseEMPProduct(empProduct);
				if (result == null) result = caseEMPObject(empProduct);
				if (result == null) result = caseEMObject(empProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE: {
				EMPProductPackage empProductPackage = (EMPProductPackage)theEObject;
				Object result = caseEMPProductPackage(empProductPackage);
				if (result == null) result = caseEMPProduct(empProductPackage);
				if (result == null) result = caseEMPObject(empProductPackage);
				if (result == null) result = caseEMObject(empProductPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_LEAF_PRODUCT: {
				EMPLeafProduct empLeafProduct = (EMPLeafProduct)theEObject;
				Object result = caseEMPLeafProduct(empLeafProduct);
				if (result == null) result = caseEMPProduct(empLeafProduct);
				if (result == null) result = caseEMPObject(empLeafProduct);
				if (result == null) result = caseEMObject(empLeafProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_REF_FLOW: {
				EMPRefFlow empRefFlow = (EMPRefFlow)theEObject;
				Object result = caseEMPRefFlow(empRefFlow);
				if (result == null) result = caseEMPFlow(empRefFlow);
				if (result == null) result = caseEMPObject(empRefFlow);
				if (result == null) result = caseEMObject(empRefFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_DOCUMENT: {
				EMPDocument empDocument = (EMPDocument)theEObject;
				Object result = caseEMPDocument(empDocument);
				if (result == null) result = caseEMPLeafProduct(empDocument);
				if (result == null) result = caseEMPProduct(empDocument);
				if (result == null) result = caseEMPObject(empDocument);
				if (result == null) result = caseEMObject(empDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_ARTIFACT: {
				EMPArtifact empArtifact = (EMPArtifact)theEObject;
				Object result = caseEMPArtifact(empArtifact);
				if (result == null) result = caseEMPLeafProduct(empArtifact);
				if (result == null) result = caseEMPProduct(empArtifact);
				if (result == null) result = caseEMPObject(empArtifact);
				if (result == null) result = caseEMObject(empArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_OTHER: {
				EMPOther empOther = (EMPOther)theEObject;
				Object result = caseEMPOther(empOther);
				if (result == null) result = caseEMPLeafProduct(empOther);
				if (result == null) result = caseEMPProduct(empOther);
				if (result == null) result = caseEMPObject(empOther);
				if (result == null) result = caseEMObject(empOther);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_ATTRIBUTE_ITEM: {
				EMPAttributeItem empAttributeItem = (EMPAttributeItem)theEObject;
				Object result = caseEMPAttributeItem(empAttributeItem);
				if (result == null) result = caseEMPObject(empAttributeItem);
				if (result == null) result = caseEMObject(empAttributeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_AUTO_ACTIVITY: {
				EMPAutoActivity empAutoActivity = (EMPAutoActivity)theEObject;
				Object result = caseEMPAutoActivity(empAutoActivity);
				if (result == null) result = caseEMPLeafActivity(empAutoActivity);
				if (result == null) result = caseEMPActivity(empAutoActivity);
				if (result == null) result = caseEMPObject(empAutoActivity);
				if (result == null) result = caseEMObject(empAutoActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY: {
				EMPManualBatchActivity empManualBatchActivity = (EMPManualBatchActivity)theEObject;
				Object result = caseEMPManualBatchActivity(empManualBatchActivity);
				if (result == null) result = caseEMPBatchActivity(empManualBatchActivity);
				if (result == null) result = caseEMPLeafActivity(empManualBatchActivity);
				if (result == null) result = caseEMPActivity(empManualBatchActivity);
				if (result == null) result = caseEMPObject(empManualBatchActivity);
				if (result == null) result = caseEMObject(empManualBatchActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_AUTO_BATCH_ACTIVITY: {
				EMPAutoBatchActivity empAutoBatchActivity = (EMPAutoBatchActivity)theEObject;
				Object result = caseEMPAutoBatchActivity(empAutoBatchActivity);
				if (result == null) result = caseEMPBatchActivity(empAutoBatchActivity);
				if (result == null) result = caseEMPLeafActivity(empAutoBatchActivity);
				if (result == null) result = caseEMPActivity(empAutoBatchActivity);
				if (result == null) result = caseEMPObject(empAutoBatchActivity);
				if (result == null) result = caseEMObject(empAutoBatchActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_MESSAGE: {
				EMPMessage empMessage = (EMPMessage)theEObject;
				Object result = caseEMPMessage(empMessage);
				if (result == null) result = caseEMPLeafProduct(empMessage);
				if (result == null) result = caseEMPProduct(empMessage);
				if (result == null) result = caseEMPObject(empMessage);
				if (result == null) result = caseEMObject(empMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_DIAGRAM: {
				EMPDiagram empDiagram = (EMPDiagram)theEObject;
				Object result = caseEMPDiagram(empDiagram);
				if (result == null) result = caseEMDiagram(empDiagram);
				if (result == null) result = caseEMObject(empDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_MILE_STONE: {
				EMPMileStone empMileStone = (EMPMileStone)theEObject;
				Object result = caseEMPMileStone(empMileStone);
				if (result == null) result = caseEMPObject(empMileStone);
				if (result == null) result = caseEMObject(empMileStone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcesspackagePackage.EMP_FORM: {
				EMPForm empForm = (EMPForm)theEObject;
				Object result = caseEMPForm(empForm);
				if (result == null) result = caseEMPLeafProduct(empForm);
				if (result == null) result = caseEMPProduct(empForm);
				if (result == null) result = caseEMPObject(empForm);
				if (result == null) result = caseEMObject(empForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Normal Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Normal Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPNormalActivity(EMPNormalActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Batch Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Batch Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPBatchActivity(EMPBatchActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPActivity(EMPActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPObject(EMPObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPFlow(EMPFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Data Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPDataFlow(EMPDataFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Ass Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Ass Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPAssFlow(EMPAssFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Clock Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Clock Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPClockFlow(EMPClockFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Logical Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Logical Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPLogicalConnector(EMPLogicalConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP In And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP In And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPInAnd(EMPInAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Out And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Out And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPOutAnd(EMPOutAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP In Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP In Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPInOr(EMPInOr object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Out Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Out Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPOutOr(EMPOutOr object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPClock(EMPClock object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Comp Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Comp Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPCompActivity(EMPCompActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP In Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP In Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPInConnector(EMPInConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Out Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Out Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPOutConnector(EMPOutConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Leaf Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Leaf Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPLeafActivity(EMPLeafActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPProduct(EMPProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Product Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Product Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPProductPackage(EMPProductPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Leaf Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Leaf Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPLeafProduct(EMPLeafProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Ref Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Ref Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPRefFlow(EMPRefFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPDocument(EMPDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPArtifact(EMPArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Other</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Other</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPOther(EMPOther object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Attribute Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Attribute Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPAttributeItem(EMPAttributeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Auto Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Auto Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPAutoActivity(EMPAutoActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Manual Batch Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Manual Batch Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPManualBatchActivity(EMPManualBatchActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Auto Batch Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Auto Batch Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPAutoBatchActivity(EMPAutoBatchActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPMessage(EMPMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPDiagram(EMPDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Mile Stone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Mile Stone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPMileStone(EMPMileStone object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMP Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMP Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMPForm(EMPForm object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EM Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EM Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMObject(EMObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EM Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EM Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMDiagram(EMDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //ProcesspackageSwitch
