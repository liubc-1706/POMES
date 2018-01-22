/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.collaborationpackage.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import vpml.EMDiagram;
import vpml.EMObject;

import vpml.collaborationpackage.*;

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
 * @see vpml.collaborationpackage.CollaborationpackagePackage
 * @generated
 */
public class CollaborationpackageSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CollaborationpackagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationpackageSwitch() {
		if (modelPackage == null) {
			modelPackage = CollaborationpackagePackage.eINSTANCE;
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
			case CollaborationpackagePackage.EMC_LOGICAL_CONNECTOR: {
				EMCLogicalConnector emcLogicalConnector = (EMCLogicalConnector)theEObject;
				Object result = caseEMCLogicalConnector(emcLogicalConnector);
				if (result == null) result = caseEMObject(emcLogicalConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollaborationpackagePackage.EMC_AND: {
				EMCAnd emcAnd = (EMCAnd)theEObject;
				Object result = caseEMCAnd(emcAnd);
				if (result == null) result = caseEMCLogicalConnector(emcAnd);
				if (result == null) result = caseEMObject(emcAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollaborationpackagePackage.EMCOR: {
				EMCOR emcor = (EMCOR)theEObject;
				Object result = caseEMCOR(emcor);
				if (result == null) result = caseEMCLogicalConnector(emcor);
				if (result == null) result = caseEMObject(emcor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollaborationpackagePackage.EMC_COLLABORATION_GROUP: {
				EMCCollaborationGroup emcCollaborationGroup = (EMCCollaborationGroup)theEObject;
				Object result = caseEMCCollaborationGroup(emcCollaborationGroup);
				if (result == null) result = caseEMObject(emcCollaborationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollaborationpackagePackage.EMC_DIAGRAM: {
				EMCDiagram emcDiagram = (EMCDiagram)theEObject;
				Object result = caseEMCDiagram(emcDiagram);
				if (result == null) result = caseEMDiagram(emcDiagram);
				if (result == null) result = caseEMObject(emcDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollaborationpackagePackage.EMC_RELATION: {
				EMCRelation emcRelation = (EMCRelation)theEObject;
				Object result = caseEMCRelation(emcRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollaborationpackagePackage.EMC_COLLABORATION_RELATION: {
				EMCCollaborationRelation emcCollaborationRelation = (EMCCollaborationRelation)theEObject;
				Object result = caseEMCCollaborationRelation(emcCollaborationRelation);
				if (result == null) result = caseEMCRelation(emcCollaborationRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollaborationpackagePackage.EMC_SEQUENCE_RELATION: {
				EMCSequenceRelation emcSequenceRelation = (EMCSequenceRelation)theEObject;
				Object result = caseEMCSequenceRelation(emcSequenceRelation);
				if (result == null) result = caseEMCRelation(emcSequenceRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMC Logical Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMC Logical Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMCLogicalConnector(EMCLogicalConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMC And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMC And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMCAnd(EMCAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMCOR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMCOR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMCOR(EMCOR object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMC Collaboration Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMC Collaboration Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMCCollaborationGroup(EMCCollaborationGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMC Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMC Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMCDiagram(EMCDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMC Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMC Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMCRelation(EMCRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMC Collaboration Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMC Collaboration Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMCCollaborationRelation(EMCCollaborationRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMC Sequence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMC Sequence Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMCSequenceRelation(EMCSequenceRelation object) {
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

} //CollaborationpackageSwitch
