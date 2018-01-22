/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import vpml.EMDiagram;
import vpml.EMObject;

import vpml.resourcepackage.*;

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
 * @see vpml.resourcepackage.ResourcepackagePackage
 * @generated
 */
public class ResourcepackageSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResourcepackagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcepackageSwitch() {
		if (modelPackage == null) {
			modelPackage = ResourcepackagePackage.eINSTANCE;
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
			case ResourcepackagePackage.EMR_RESOURCE_TYPE: {
				EMRResourceType emrResourceType = (EMRResourceType)theEObject;
				Object result = caseEMRResourceType(emrResourceType);
				if (result == null) result = caseEMRObject(emrResourceType);
				if (result == null) result = caseEMObject(emrResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE: {
				EMRBasicResourceType emrBasicResourceType = (EMRBasicResourceType)theEObject;
				Object result = caseEMRBasicResourceType(emrBasicResourceType);
				if (result == null) result = caseEMRResourceType(emrBasicResourceType);
				if (result == null) result = caseEMRObject(emrBasicResourceType);
				if (result == null) result = caseEMObject(emrBasicResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION: {
				EMRClassificationRelation emrClassificationRelation = (EMRClassificationRelation)theEObject;
				Object result = caseEMRClassificationRelation(emrClassificationRelation);
				if (result == null) result = caseEMRRelation(emrClassificationRelation);
				if (result == null) result = caseEMRObject(emrClassificationRelation);
				if (result == null) result = caseEMObject(emrClassificationRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcepackagePackage.EMR_ABSTRACT_RESOURCE_TYPE: {
				EMRAbstractResourceType emrAbstractResourceType = (EMRAbstractResourceType)theEObject;
				Object result = caseEMRAbstractResourceType(emrAbstractResourceType);
				if (result == null) result = caseEMRResourceType(emrAbstractResourceType);
				if (result == null) result = caseEMRObject(emrAbstractResourceType);
				if (result == null) result = caseEMObject(emrAbstractResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcepackagePackage.EMR_ABSTRACT_ROLE: {
				EMRAbstractRole emrAbstractRole = (EMRAbstractRole)theEObject;
				Object result = caseEMRAbstractRole(emrAbstractRole);
				if (result == null) result = caseEMRAbstractResourceType(emrAbstractRole);
				if (result == null) result = caseEMRResourceType(emrAbstractRole);
				if (result == null) result = caseEMRObject(emrAbstractRole);
				if (result == null) result = caseEMObject(emrAbstractRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE: {
				EMRAbstractToolType emrAbstractToolType = (EMRAbstractToolType)theEObject;
				Object result = caseEMRAbstractToolType(emrAbstractToolType);
				if (result == null) result = caseEMRAbstractResourceType(emrAbstractToolType);
				if (result == null) result = caseEMRResourceType(emrAbstractToolType);
				if (result == null) result = caseEMRObject(emrAbstractToolType);
				if (result == null) result = caseEMObject(emrAbstractToolType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE: {
				EMRAbstractMachineType emrAbstractMachineType = (EMRAbstractMachineType)theEObject;
				Object result = caseEMRAbstractMachineType(emrAbstractMachineType);
				if (result == null) result = caseEMRAbstractResourceType(emrAbstractMachineType);
				if (result == null) result = caseEMRResourceType(emrAbstractMachineType);
				if (result == null) result = caseEMRObject(emrAbstractMachineType);
				if (result == null) result = caseEMObject(emrAbstractMachineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE: {
				EMRAbstractLocationType emrAbstractLocationType = (EMRAbstractLocationType)theEObject;
				Object result = caseEMRAbstractLocationType(emrAbstractLocationType);
				if (result == null) result = caseEMRAbstractResourceType(emrAbstractLocationType);
				if (result == null) result = caseEMRResourceType(emrAbstractLocationType);
				if (result == null) result = caseEMRObject(emrAbstractLocationType);
				if (result == null) result = caseEMObject(emrAbstractLocationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcepackagePackage.EMR_TOOL_TYPE: {
				EMRToolType emrToolType = (EMRToolType)theEObject;
				Object result = caseEMRToolType(emrToolType);
				if (result == null) result = caseEMRBasicResourceType(emrToolType);
				if (result == null) result = caseEMRResourceType(emrToolType);
				if (result == null) result = caseEMRObject(emrToolType);
				if (result == null) result = caseEMObject(emrToolType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcepackagePackage.EMR_MACHINE_TYPE: {
				EMRMachineType emrMachineType = (EMRMachineType)theEObject;
				Object result = caseEMRMachineType(emrMachineType);
				if (result == null) result = caseEMRBasicResourceType(emrMachineType);
				if (result == null) result = caseEMRResourceType(emrMachineType);
				if (result == null) result = caseEMRObject(emrMachineType);
				if (result == null) result = caseEMObject(emrMachineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcepackagePackage.EMR_LOCATION_TYPE: {
				EMRLocationType emrLocationType = (EMRLocationType)theEObject;
				Object result = caseEMRLocationType(emrLocationType);
				if (result == null) result = caseEMRBasicResourceType(emrLocationType);
				if (result == null) result = caseEMRResourceType(emrLocationType);
				if (result == null) result = caseEMRObject(emrLocationType);
				if (result == null) result = caseEMObject(emrLocationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcepackagePackage.EMR_ROLE: {
				EMRRole emrRole = (EMRRole)theEObject;
				Object result = caseEMRRole(emrRole);
				if (result == null) result = caseEMRBasicResourceType(emrRole);
				if (result == null) result = caseEMRResourceType(emrRole);
				if (result == null) result = caseEMRObject(emrRole);
				if (result == null) result = caseEMObject(emrRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcepackagePackage.EMR_DIAGRAM: {
				EMRDiagram emrDiagram = (EMRDiagram)theEObject;
				Object result = caseEMRDiagram(emrDiagram);
				if (result == null) result = caseEMDiagram(emrDiagram);
				if (result == null) result = caseEMObject(emrDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcepackagePackage.EMR_OBJECT: {
				EMRObject emrObject = (EMRObject)theEObject;
				Object result = caseEMRObject(emrObject);
				if (result == null) result = caseEMObject(emrObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcepackagePackage.EMR_RELATION: {
				EMRRelation emrRelation = (EMRRelation)theEObject;
				Object result = caseEMRRelation(emrRelation);
				if (result == null) result = caseEMRObject(emrRelation);
				if (result == null) result = caseEMObject(emrRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMR Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMR Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMRResourceType(EMRResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMR Basic Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMR Basic Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMRBasicResourceType(EMRBasicResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMR Classification Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMR Classification Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMRClassificationRelation(EMRClassificationRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMR Abstract Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMR Abstract Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMRAbstractResourceType(EMRAbstractResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMR Abstract Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMR Abstract Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMRAbstractRole(EMRAbstractRole object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMR Abstract Tool Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMR Abstract Tool Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMRAbstractToolType(EMRAbstractToolType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMR Abstract Machine Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMR Abstract Machine Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMRAbstractMachineType(EMRAbstractMachineType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMR Abstract Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMR Abstract Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMRAbstractLocationType(EMRAbstractLocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMR Tool Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMR Tool Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMRToolType(EMRToolType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMR Machine Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMR Machine Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMRMachineType(EMRMachineType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMR Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMR Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMRLocationType(EMRLocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMR Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMR Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMRRole(EMRRole object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMR Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMR Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMRDiagram(EMRDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMR Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMR Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMRObject(EMRObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EMR Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EMR Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEMRRelation(EMRRelation object) {
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

} //ResourcepackageSwitch
