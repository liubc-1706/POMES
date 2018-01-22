/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.informationpackage.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import vpml.EMObject;

import vpml.informationpackage.*;

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
 * @see vpml.informationpackage.InformationpackagePackage
 * @generated
 */
public class InformationpackageSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InformationpackagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationpackageSwitch() {
		if (modelPackage == null) {
			modelPackage = InformationpackagePackage.eINSTANCE;
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
			case InformationpackagePackage.EMI_COMPLEX_ITEM: {
				EMIComplexItem emiComplexItem = (EMIComplexItem)theEObject;
				Object result = caseEMIComplexItem(emiComplexItem);
				if (result == null) result = caseEMObject(emiComplexItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationpackagePackage.EMI_FORM: {
				EMIForm emiForm = (EMIForm)theEObject;
				Object result = caseEMIForm(emiForm);
				if (result == null) result = caseEMIComplexItem(emiForm);
				if (result == null) result = caseEMObject(emiForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationpackagePackage.EMI_ENUM: {
				EMIEnum emiEnum = (EMIEnum)theEObject;
				Object result = caseEMIEnum(emiEnum);
				if (result == null) result = caseEMIComplexItem(emiEnum);
				if (result == null) result = caseEMObject(emiEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationpackagePackage.EMI_ENUM_LITERAL: {
				EMIEnumLiteral emiEnumLiteral = (EMIEnumLiteral)theEObject;
				Object result = caseEMIEnumLiteral(emiEnumLiteral);
				if (result == null) result = caseEMObject(emiEnumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationpackagePackage.EMI_SIMPLE_ATTRIBUTE: {
				EMISimpleAttribute emiSimpleAttribute = (EMISimpleAttribute)theEObject;
				Object result = caseEMISimpleAttribute(emiSimpleAttribute);
				if (result == null) result = caseEMIAttribute(emiSimpleAttribute);
				if (result == null) result = caseEMObject(emiSimpleAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationpackagePackage.EMI_LIST: {
				EMIList emiList = (EMIList)theEObject;
				Object result = caseEMIList(emiList);
				if (result == null) result = caseEMIComplexItem(emiList);
				if (result == null) result = caseEMObject(emiList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationpackagePackage.EMI_STAT_ATTRIBUTE: {
				EMIStatAttribute emiStatAttribute = (EMIStatAttribute)theEObject;
				Object result = caseEMIStatAttribute(emiStatAttribute);
				if (result == null) result = caseEMIAttribute(emiStatAttribute);
				if (result == null) result = caseEMObject(emiStatAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationpackagePackage.EMI_COMPLEX_ATTRIBUTE: {
				EMIComplexAttribute emiComplexAttribute = (EMIComplexAttribute)theEObject;
				Object result = caseEMIComplexAttribute(emiComplexAttribute);
				if (result == null) result = caseEMIAttribute(emiComplexAttribute);
				if (result == null) result = caseEMObject(emiComplexAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationpackagePackage.EMI_ATTRIBUTE: {
				EMIAttribute emiAttribute = (EMIAttribute)theEObject;
				Object result = caseEMIAttribute(emiAttribute);
				if (result == null) result = caseEMObject(emiAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Complex Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Complex Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIComplexItem(EMIComplexItem object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIForm(EMIForm object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIEnum(EMIEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIEnumLiteral(EMIEnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Simple Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Simple Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMISimpleAttribute(EMISimpleAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIList(EMIList object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Stat Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Stat Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIStatAttribute(EMIStatAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Complex Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Complex Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIComplexAttribute(EMIComplexAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMI Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMI Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMIAttribute(EMIAttribute object) {
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

} //InformationpackageSwitch
