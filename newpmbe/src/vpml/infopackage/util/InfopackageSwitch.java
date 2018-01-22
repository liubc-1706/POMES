/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import vpml.EMDiagram;
import vpml.EMObject;

import vpml.infopackage.*;

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
 * @see vpml.infopackage.InfopackagePackage
 * @generated
 */
public class InfopackageSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfopackagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfopackageSwitch() {
		if (modelPackage == null) {
			modelPackage = InfopackagePackage.eINSTANCE;
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
			case InfopackagePackage.EMI_LEAF_PRODUCT: {
				EMILeafProduct emiLeafProduct = (EMILeafProduct)theEObject;
				Object result = caseEMILeafProduct(emiLeafProduct);
				if (result == null) result = caseEMIProduct(emiLeafProduct);
				if (result == null) result = caseEMINode(emiLeafProduct);
				if (result == null) result = caseEMIObject(emiLeafProduct);
				if (result == null) result = caseEMObject(emiLeafProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_DOCUMENT: {
				EMIDocument emiDocument = (EMIDocument)theEObject;
				Object result = caseEMIDocument(emiDocument);
				if (result == null) result = caseEMILeafProduct(emiDocument);
				if (result == null) result = caseEMIProduct(emiDocument);
				if (result == null) result = caseEMINode(emiDocument);
				if (result == null) result = caseEMIObject(emiDocument);
				if (result == null) result = caseEMObject(emiDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_ARTIFACT: {
				EMIArtifact emiArtifact = (EMIArtifact)theEObject;
				Object result = caseEMIArtifact(emiArtifact);
				if (result == null) result = caseEMILeafProduct(emiArtifact);
				if (result == null) result = caseEMIProduct(emiArtifact);
				if (result == null) result = caseEMINode(emiArtifact);
				if (result == null) result = caseEMIObject(emiArtifact);
				if (result == null) result = caseEMObject(emiArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_MESSAGE: {
				EMIMessage emiMessage = (EMIMessage)theEObject;
				Object result = caseEMIMessage(emiMessage);
				if (result == null) result = caseEMILeafProduct(emiMessage);
				if (result == null) result = caseEMIProduct(emiMessage);
				if (result == null) result = caseEMINode(emiMessage);
				if (result == null) result = caseEMIObject(emiMessage);
				if (result == null) result = caseEMObject(emiMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_OTHER: {
				EMIOther emiOther = (EMIOther)theEObject;
				Object result = caseEMIOther(emiOther);
				if (result == null) result = caseEMILeafProduct(emiOther);
				if (result == null) result = caseEMIProduct(emiOther);
				if (result == null) result = caseEMINode(emiOther);
				if (result == null) result = caseEMIObject(emiOther);
				if (result == null) result = caseEMObject(emiOther);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_PRODUCT_PACKAGE: {
				EMIProductPackage emiProductPackage = (EMIProductPackage)theEObject;
				Object result = caseEMIProductPackage(emiProductPackage);
				if (result == null) result = caseEMIProduct(emiProductPackage);
				if (result == null) result = caseEMINode(emiProductPackage);
				if (result == null) result = caseEMIObject(emiProductPackage);
				if (result == null) result = caseEMObject(emiProductPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_OBJECT: {
				EMIObject emiObject = (EMIObject)theEObject;
				Object result = caseEMIObject(emiObject);
				if (result == null) result = caseEMObject(emiObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_LOGICAL_CONNECTOR: {
				EMILogicalConnector emiLogicalConnector = (EMILogicalConnector)theEObject;
				Object result = caseEMILogicalConnector(emiLogicalConnector);
				if (result == null) result = caseEMINode(emiLogicalConnector);
				if (result == null) result = caseEMIObject(emiLogicalConnector);
				if (result == null) result = caseEMObject(emiLogicalConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_COM_INFO: {
				EMIComInfo emiComInfo = (EMIComInfo)theEObject;
				Object result = caseEMIComInfo(emiComInfo);
				if (result == null) result = caseEMINode(emiComInfo);
				if (result == null) result = caseEMIObject(emiComInfo);
				if (result == null) result = caseEMObject(emiComInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_PRODUCT: {
				EMIProduct emiProduct = (EMIProduct)theEObject;
				Object result = caseEMIProduct(emiProduct);
				if (result == null) result = caseEMINode(emiProduct);
				if (result == null) result = caseEMIObject(emiProduct);
				if (result == null) result = caseEMObject(emiProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_FLOW: {
				EMIFlow emiFlow = (EMIFlow)theEObject;
				Object result = caseEMIFlow(emiFlow);
				if (result == null) result = caseEMIObject(emiFlow);
				if (result == null) result = caseEMObject(emiFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_NODE: {
				EMINode emiNode = (EMINode)theEObject;
				Object result = caseEMINode(emiNode);
				if (result == null) result = caseEMIObject(emiNode);
				if (result == null) result = caseEMObject(emiNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_REF_FLOW: {
				EMIRefFlow emiRefFlow = (EMIRefFlow)theEObject;
				Object result = caseEMIRefFlow(emiRefFlow);
				if (result == null) result = caseEMIFlow(emiRefFlow);
				if (result == null) result = caseEMIObject(emiRefFlow);
				if (result == null) result = caseEMObject(emiRefFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_DATA_FLOW: {
				EMIDataFlow emiDataFlow = (EMIDataFlow)theEObject;
				Object result = caseEMIDataFlow(emiDataFlow);
				if (result == null) result = caseEMIFlow(emiDataFlow);
				if (result == null) result = caseEMIObject(emiDataFlow);
				if (result == null) result = caseEMObject(emiDataFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_IN_CONNECTOR: {
				EMIInConnector emiInConnector = (EMIInConnector)theEObject;
				Object result = caseEMIInConnector(emiInConnector);
				if (result == null) result = caseEMILogicalConnector(emiInConnector);
				if (result == null) result = caseEMINode(emiInConnector);
				if (result == null) result = caseEMIObject(emiInConnector);
				if (result == null) result = caseEMObject(emiInConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_OUT_CONNECTOR: {
				EMIOutConnector emiOutConnector = (EMIOutConnector)theEObject;
				Object result = caseEMIOutConnector(emiOutConnector);
				if (result == null) result = caseEMILogicalConnector(emiOutConnector);
				if (result == null) result = caseEMINode(emiOutConnector);
				if (result == null) result = caseEMIObject(emiOutConnector);
				if (result == null) result = caseEMObject(emiOutConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_STATE_CONNECTOR: {
				EMIStateConnector emiStateConnector = (EMIStateConnector)theEObject;
				Object result = caseEMIStateConnector(emiStateConnector);
				if (result == null) result = caseEMILogicalConnector(emiStateConnector);
				if (result == null) result = caseEMINode(emiStateConnector);
				if (result == null) result = caseEMIObject(emiStateConnector);
				if (result == null) result = caseEMObject(emiStateConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_IN_OR: {
				EMIInOr emiInOr = (EMIInOr)theEObject;
				Object result = caseEMIInOr(emiInOr);
				if (result == null) result = caseEMIInConnector(emiInOr);
				if (result == null) result = caseEMILogicalConnector(emiInOr);
				if (result == null) result = caseEMINode(emiInOr);
				if (result == null) result = caseEMIObject(emiInOr);
				if (result == null) result = caseEMObject(emiInOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_IN_AND: {
				EMIInAnd emiInAnd = (EMIInAnd)theEObject;
				Object result = caseEMIInAnd(emiInAnd);
				if (result == null) result = caseEMIInConnector(emiInAnd);
				if (result == null) result = caseEMILogicalConnector(emiInAnd);
				if (result == null) result = caseEMINode(emiInAnd);
				if (result == null) result = caseEMIObject(emiInAnd);
				if (result == null) result = caseEMObject(emiInAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_OUT_AND: {
				EMIOutAnd emiOutAnd = (EMIOutAnd)theEObject;
				Object result = caseEMIOutAnd(emiOutAnd);
				if (result == null) result = caseEMIOutConnector(emiOutAnd);
				if (result == null) result = caseEMILogicalConnector(emiOutAnd);
				if (result == null) result = caseEMINode(emiOutAnd);
				if (result == null) result = caseEMIObject(emiOutAnd);
				if (result == null) result = caseEMObject(emiOutAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_OUT_OR: {
				EMIOutOr emiOutOr = (EMIOutOr)theEObject;
				Object result = caseEMIOutOr(emiOutOr);
				if (result == null) result = caseEMIOutConnector(emiOutOr);
				if (result == null) result = caseEMILogicalConnector(emiOutOr);
				if (result == null) result = caseEMINode(emiOutOr);
				if (result == null) result = caseEMIObject(emiOutOr);
				if (result == null) result = caseEMObject(emiOutOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfopackagePackage.EMI_DIAGRAM: {
				EMIDiagram emiDiagram = (EMIDiagram)theEObject;
				Object result = caseEMIDiagram(emiDiagram);
				if (result == null) result = caseEMDiagram(emiDiagram);
				if (result == null) result = caseEMObject(emiDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Leaf Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Leaf Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMILeafProduct(EMILeafProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIDocument(EMIDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIArtifact(EMIArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Other</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Other</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIOther(EMIOther object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Product Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Product Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIProductPackage(EMIProductPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIObject(EMIObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Logical Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Logical Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMILogicalConnector(EMILogicalConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Com Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Com Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIComInfo(EMIComInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIProduct(EMIProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIFlow(EMIFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMINode(EMINode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Ref Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Ref Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIRefFlow(EMIRefFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Data Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIDataFlow(EMIDataFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI In Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI In Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIInConnector(EMIInConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Out Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Out Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIOutConnector(EMIOutConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI State Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI State Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIStateConnector(EMIStateConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI In Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI In Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIInOr(EMIInOr object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI In And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI In And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIInAnd(EMIInAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Out And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Out And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIOutAnd(EMIOutAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Out Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Out Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIOutOr(EMIOutOr object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIDiagram(EMIDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIMessage(EMIMessage object) {
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

} //InfopackageSwitch
