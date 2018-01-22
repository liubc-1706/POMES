/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.organizationpackage.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import vpml.EMDiagram;
import vpml.EMObject;

import vpml.organizationpackage.*;

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
 * @see vpml.organizationpackage.OrganizationpackagePackage
 * @generated
 */
public class OrganizationpackageSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OrganizationpackagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationpackageSwitch() {
		if (modelPackage == null) {
			modelPackage = OrganizationpackagePackage.eINSTANCE;
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
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE: {
				EMOResourceGroupType emoResourceGroupType = (EMOResourceGroupType)theEObject;
				Object result = caseEMOResourceGroupType(emoResourceGroupType);
				if (result == null) result = caseEMOObject(emoResourceGroupType);
				if (result == null) result = caseEMObject(emoResourceGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrganizationpackagePackage.EMO_RELATIONS: {
				EMORelations emoRelations = (EMORelations)theEObject;
				Object result = caseEMORelations(emoRelations);
				if (result == null) result = caseEMObject(emoRelations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrganizationpackagePackage.EMO_ASSOCIATION_RELATION: {
				EMOAssociationRelation emoAssociationRelation = (EMOAssociationRelation)theEObject;
				Object result = caseEMOAssociationRelation(emoAssociationRelation);
				if (result == null) result = caseEMORelations(emoAssociationRelation);
				if (result == null) result = caseEMObject(emoAssociationRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION: {
				EMOComposeRelation emoComposeRelation = (EMOComposeRelation)theEObject;
				Object result = caseEMOComposeRelation(emoComposeRelation);
				if (result == null) result = caseEMORelations(emoComposeRelation);
				if (result == null) result = caseEMObject(emoComposeRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrganizationpackagePackage.EMO_DIAGRAM: {
				EMODiagram emoDiagram = (EMODiagram)theEObject;
				Object result = caseEMODiagram(emoDiagram);
				if (result == null) result = caseEMDiagram(emoDiagram);
				if (result == null) result = caseEMObject(emoDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrganizationpackagePackage.EMO_OBJECT: {
				EMOObject emoObject = (EMOObject)theEObject;
				Object result = caseEMOObject(emoObject);
				if (result == null) result = caseEMObject(emoObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMO Resource Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMO Resource Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMOResourceGroupType(EMOResourceGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMO Relations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMO Relations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMORelations(EMORelations object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMO Association Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMO Association Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMOAssociationRelation(EMOAssociationRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMO Compose Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMO Compose Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMOComposeRelation(EMOComposeRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMO Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMO Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMODiagram(EMODiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMO Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMO Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMOObject(EMOObject object) {
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

} //OrganizationpackageSwitch
