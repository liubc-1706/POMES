/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vpml.resourcepackage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcepackageFactoryImpl extends EFactoryImpl implements ResourcepackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourcepackageFactory init() {
		try {
			ResourcepackageFactory theResourcepackageFactory = (ResourcepackageFactory)EPackage.Registry.INSTANCE.getEFactory("http:///vpml/resourcepackage.ecore"); 
			if (theResourcepackageFactory != null) {
				return theResourcepackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourcepackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcepackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ResourcepackagePackage.EMR_RESOURCE_TYPE: return createEMRResourceType();
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE: return createEMRBasicResourceType();
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION: return createEMRClassificationRelation();
			case ResourcepackagePackage.EMR_ABSTRACT_RESOURCE_TYPE: return createEMRAbstractResourceType();
			case ResourcepackagePackage.EMR_ABSTRACT_ROLE: return createEMRAbstractRole();
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE: return createEMRAbstractToolType();
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE: return createEMRAbstractMachineType();
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE: return createEMRAbstractLocationType();
			case ResourcepackagePackage.EMR_TOOL_TYPE: return createEMRToolType();
			case ResourcepackagePackage.EMR_MACHINE_TYPE: return createEMRMachineType();
			case ResourcepackagePackage.EMR_LOCATION_TYPE: return createEMRLocationType();
			case ResourcepackagePackage.EMR_ROLE: return createEMRRole();
			case ResourcepackagePackage.EMR_DIAGRAM: return createEMRDiagram();
			case ResourcepackagePackage.EMR_OBJECT: return createEMRObject();
			case ResourcepackagePackage.EMR_RELATION: return createEMRRelation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRResourceType createEMRResourceType() {
		EMRResourceTypeImpl emrResourceType = new EMRResourceTypeImpl();
		return emrResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRBasicResourceType createEMRBasicResourceType() {
		EMRBasicResourceTypeImpl emrBasicResourceType = new EMRBasicResourceTypeImpl();
		return emrBasicResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRClassificationRelation createEMRClassificationRelation() {
		EMRClassificationRelationImpl emrClassificationRelation = new EMRClassificationRelationImpl();
		return emrClassificationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractResourceType createEMRAbstractResourceType() {
		EMRAbstractResourceTypeImpl emrAbstractResourceType = new EMRAbstractResourceTypeImpl();
		return emrAbstractResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractRole createEMRAbstractRole() {
		EMRAbstractRoleImpl emrAbstractRole = new EMRAbstractRoleImpl();
		return emrAbstractRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractToolType createEMRAbstractToolType() {
		EMRAbstractToolTypeImpl emrAbstractToolType = new EMRAbstractToolTypeImpl();
		return emrAbstractToolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractMachineType createEMRAbstractMachineType() {
		EMRAbstractMachineTypeImpl emrAbstractMachineType = new EMRAbstractMachineTypeImpl();
		return emrAbstractMachineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractLocationType createEMRAbstractLocationType() {
		EMRAbstractLocationTypeImpl emrAbstractLocationType = new EMRAbstractLocationTypeImpl();
		return emrAbstractLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRToolType createEMRToolType() {
		EMRToolTypeImpl emrToolType = new EMRToolTypeImpl();
		return emrToolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRMachineType createEMRMachineType() {
		EMRMachineTypeImpl emrMachineType = new EMRMachineTypeImpl();
		return emrMachineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRLocationType createEMRLocationType() {
		EMRLocationTypeImpl emrLocationType = new EMRLocationTypeImpl();
		return emrLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRRole createEMRRole() {
		EMRRoleImpl emrRole = new EMRRoleImpl();
		return emrRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRDiagram createEMRDiagram() {
		EMRDiagramImpl emrDiagram = new EMRDiagramImpl();
		return emrDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRObject createEMRObject() {
		EMRObjectImpl emrObject = new EMRObjectImpl();
		return emrObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRRelation createEMRRelation() {
		EMRRelationImpl emrRelation = new EMRRelationImpl();
		return emrRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcepackagePackage getResourcepackagePackage() {
		return (ResourcepackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ResourcepackagePackage getPackage() {
		return ResourcepackagePackage.eINSTANCE;
	}

} //ResourcepackageFactoryImpl
