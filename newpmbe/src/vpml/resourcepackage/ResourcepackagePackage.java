/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import vpml.VpmlPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see vpml.resourcepackage.ResourcepackageFactory
 * @model kind="package"
 * @generated
 */
public interface ResourcepackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resourcepackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///vpml/resourcepackage.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vpml.resourcepackage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcepackagePackage eINSTANCE = vpml.resourcepackage.impl.ResourcepackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link vpml.resourcepackage.impl.EMRObjectImpl <em>EMR Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.resourcepackage.impl.EMRObjectImpl
	 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRObject()
	 * @generated
	 */
	int EMR_OBJECT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_OBJECT__NAME = VpmlPackage.EM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_OBJECT__ID = VpmlPackage.EM_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_OBJECT__CODE = VpmlPackage.EM_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_OBJECT__DESCRIPTION = VpmlPackage.EM_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_OBJECT__OID = VpmlPackage.EM_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_OBJECT__SOURCE_OBJ_SOURCE_RELATION = VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_OBJECT__TARGET_OBJ_TARGET_RELATION = VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The number of structural features of the '<em>EMR Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_OBJECT_FEATURE_COUNT = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link vpml.resourcepackage.impl.EMRResourceTypeImpl <em>EMR Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.resourcepackage.impl.EMRResourceTypeImpl
	 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRResourceType()
	 * @generated
	 */
	int EMR_RESOURCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_RESOURCE_TYPE__NAME = EMR_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_RESOURCE_TYPE__ID = EMR_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_RESOURCE_TYPE__CODE = EMR_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_RESOURCE_TYPE__DESCRIPTION = EMR_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_RESOURCE_TYPE__OID = EMR_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_RESOURCE_TYPE__SOURCE_OBJ_SOURCE_RELATION = EMR_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_RESOURCE_TYPE__TARGET_OBJ_TARGET_RELATION = EMR_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The number of structural features of the '<em>EMR Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_RESOURCE_TYPE_FEATURE_COUNT = EMR_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link vpml.resourcepackage.impl.EMRBasicResourceTypeImpl <em>EMR Basic Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.resourcepackage.impl.EMRBasicResourceTypeImpl
	 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRBasicResourceType()
	 * @generated
	 */
	int EMR_BASIC_RESOURCE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_BASIC_RESOURCE_TYPE__NAME = EMR_RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_BASIC_RESOURCE_TYPE__ID = EMR_RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_BASIC_RESOURCE_TYPE__CODE = EMR_RESOURCE_TYPE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_BASIC_RESOURCE_TYPE__DESCRIPTION = EMR_RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_BASIC_RESOURCE_TYPE__OID = EMR_RESOURCE_TYPE__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_BASIC_RESOURCE_TYPE__SOURCE_OBJ_SOURCE_RELATION = EMR_RESOURCE_TYPE__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_BASIC_RESOURCE_TYPE__TARGET_OBJ_TARGET_RELATION = EMR_RESOURCE_TYPE__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Resource Group Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_BASIC_RESOURCE_TYPE__RESOURCE_GROUP_TYPES = EMR_RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost Per Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_BASIC_RESOURCE_TYPE__COST_PER_UNIT = EMR_RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_BASIC_RESOURCE_TYPE__TOTAL_AMOUNT = EMR_RESOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Usage Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_BASIC_RESOURCE_TYPE__USAGE_AMOUNT = EMR_RESOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Available Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_BASIC_RESOURCE_TYPE__AVAILABLE_AMOUNT = EMR_RESOURCE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_BASIC_RESOURCE_TYPE__EFFICIENCY = EMR_RESOURCE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EMR Basic Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT = EMR_RESOURCE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link vpml.resourcepackage.impl.EMRRelationImpl <em>EMR Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.resourcepackage.impl.EMRRelationImpl
	 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRRelation()
	 * @generated
	 */
	int EMR_RELATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_RELATION__NAME = EMR_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_RELATION__ID = EMR_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_RELATION__CODE = EMR_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_RELATION__DESCRIPTION = EMR_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_RELATION__OID = EMR_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_RELATION__SOURCE_OBJ_SOURCE_RELATION = EMR_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_RELATION__TARGET_OBJ_TARGET_RELATION = EMR_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The number of structural features of the '<em>EMR Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_RELATION_FEATURE_COUNT = EMR_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link vpml.resourcepackage.impl.EMRClassificationRelationImpl <em>EMR Classification Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.resourcepackage.impl.EMRClassificationRelationImpl
	 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRClassificationRelation()
	 * @generated
	 */
	int EMR_CLASSIFICATION_RELATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__NAME = EMR_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__ID = EMR_RELATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__CODE = EMR_RELATION__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__DESCRIPTION = EMR_RELATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__OID = EMR_RELATION__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__SOURCE_OBJ_SOURCE_RELATION = EMR_RELATION__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__TARGET_OBJ_TARGET_RELATION = EMR_RELATION__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Emr Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__EMR_DIAGRAM = EMR_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__ROLE = EMR_RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Abs Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__SOURCE_ABS_ROLE_TYPE = EMR_RELATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Abs Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__TARGET_ABS_ROLE_TYPE = EMR_RELATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__LOCATION_TYPE = EMR_RELATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Abs Location Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__SOURCE_ABS_LOCATION_TYPE = EMR_RELATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Abs Location Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__TARGET_ABS_LOCATION_TYPE = EMR_RELATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tool Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__TOOL_TYPE = EMR_RELATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target Abs Tool Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__TARGET_ABS_TOOL_TYPE = EMR_RELATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Source Abs Tool Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__SOURCE_ABS_TOOL_TYPE = EMR_RELATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Machine Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__MACHINE_TYPE = EMR_RELATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Source Abs Machine Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__SOURCE_ABS_MACHINE_TYPE = EMR_RELATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Target Abs Machine Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION__TARGET_ABS_MACHINE_TYPE = EMR_RELATION_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>EMR Classification Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_CLASSIFICATION_RELATION_FEATURE_COUNT = EMR_RELATION_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link vpml.resourcepackage.impl.EMRAbstractResourceTypeImpl <em>EMR Abstract Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.resourcepackage.impl.EMRAbstractResourceTypeImpl
	 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRAbstractResourceType()
	 * @generated
	 */
	int EMR_ABSTRACT_RESOURCE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_RESOURCE_TYPE__NAME = EMR_RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_RESOURCE_TYPE__ID = EMR_RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_RESOURCE_TYPE__CODE = EMR_RESOURCE_TYPE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_RESOURCE_TYPE__DESCRIPTION = EMR_RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_RESOURCE_TYPE__OID = EMR_RESOURCE_TYPE__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_RESOURCE_TYPE__SOURCE_OBJ_SOURCE_RELATION = EMR_RESOURCE_TYPE__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_RESOURCE_TYPE__TARGET_OBJ_TARGET_RELATION = EMR_RESOURCE_TYPE__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The number of structural features of the '<em>EMR Abstract Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT = EMR_RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link vpml.resourcepackage.impl.EMRAbstractRoleImpl <em>EMR Abstract Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.resourcepackage.impl.EMRAbstractRoleImpl
	 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRAbstractRole()
	 * @generated
	 */
	int EMR_ABSTRACT_ROLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_ROLE__NAME = EMR_ABSTRACT_RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_ROLE__ID = EMR_ABSTRACT_RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_ROLE__CODE = EMR_ABSTRACT_RESOURCE_TYPE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_ROLE__DESCRIPTION = EMR_ABSTRACT_RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_ROLE__OID = EMR_ABSTRACT_RESOURCE_TYPE__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_ROLE__SOURCE_OBJ_SOURCE_RELATION = EMR_ABSTRACT_RESOURCE_TYPE__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_ROLE__TARGET_OBJ_TARGET_RELATION = EMR_ABSTRACT_RESOURCE_TYPE__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Emr Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_ROLE__EMR_DIAGRAM = EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Classification Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_ROLE__SOURCE_CLASSIFICATION_RELATIONS = EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Classification Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_ROLE__TARGET_CLASSIFICATION_RELATION = EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EMR Abstract Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_ROLE_FEATURE_COUNT = EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link vpml.resourcepackage.impl.EMRAbstractToolTypeImpl <em>EMR Abstract Tool Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.resourcepackage.impl.EMRAbstractToolTypeImpl
	 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRAbstractToolType()
	 * @generated
	 */
	int EMR_ABSTRACT_TOOL_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_TOOL_TYPE__NAME = EMR_ABSTRACT_RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_TOOL_TYPE__ID = EMR_ABSTRACT_RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_TOOL_TYPE__CODE = EMR_ABSTRACT_RESOURCE_TYPE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_TOOL_TYPE__DESCRIPTION = EMR_ABSTRACT_RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_TOOL_TYPE__OID = EMR_ABSTRACT_RESOURCE_TYPE__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_TOOL_TYPE__SOURCE_OBJ_SOURCE_RELATION = EMR_ABSTRACT_RESOURCE_TYPE__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_TOOL_TYPE__TARGET_OBJ_TARGET_RELATION = EMR_ABSTRACT_RESOURCE_TYPE__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Emr Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_TOOL_TYPE__EMR_DIAGRAM = EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Classification Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_TOOL_TYPE__TARGET_CLASSIFICATION_RELATION = EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Abs Classfication Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_TOOL_TYPE__SOURCE_ABS_CLASSFICATION_RELATIONS = EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EMR Abstract Tool Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_TOOL_TYPE_FEATURE_COUNT = EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link vpml.resourcepackage.impl.EMRAbstractMachineTypeImpl <em>EMR Abstract Machine Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.resourcepackage.impl.EMRAbstractMachineTypeImpl
	 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRAbstractMachineType()
	 * @generated
	 */
	int EMR_ABSTRACT_MACHINE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_MACHINE_TYPE__NAME = EMR_ABSTRACT_RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_MACHINE_TYPE__ID = EMR_ABSTRACT_RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_MACHINE_TYPE__CODE = EMR_ABSTRACT_RESOURCE_TYPE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_MACHINE_TYPE__DESCRIPTION = EMR_ABSTRACT_RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_MACHINE_TYPE__OID = EMR_ABSTRACT_RESOURCE_TYPE__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_MACHINE_TYPE__SOURCE_OBJ_SOURCE_RELATION = EMR_ABSTRACT_RESOURCE_TYPE__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_MACHINE_TYPE__TARGET_OBJ_TARGET_RELATION = EMR_ABSTRACT_RESOURCE_TYPE__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Emr Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_MACHINE_TYPE__EMR_DIAGRAM = EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Classification Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_MACHINE_TYPE__SOURCE_CLASSIFICATION_RELATIONS = EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Classification Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_MACHINE_TYPE__TARGET_CLASSIFICATION_RELATION = EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EMR Abstract Machine Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_MACHINE_TYPE_FEATURE_COUNT = EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link vpml.resourcepackage.impl.EMRAbstractLocationTypeImpl <em>EMR Abstract Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.resourcepackage.impl.EMRAbstractLocationTypeImpl
	 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRAbstractLocationType()
	 * @generated
	 */
	int EMR_ABSTRACT_LOCATION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_LOCATION_TYPE__NAME = EMR_ABSTRACT_RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_LOCATION_TYPE__ID = EMR_ABSTRACT_RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_LOCATION_TYPE__CODE = EMR_ABSTRACT_RESOURCE_TYPE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_LOCATION_TYPE__DESCRIPTION = EMR_ABSTRACT_RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_LOCATION_TYPE__OID = EMR_ABSTRACT_RESOURCE_TYPE__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_LOCATION_TYPE__SOURCE_OBJ_SOURCE_RELATION = EMR_ABSTRACT_RESOURCE_TYPE__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_LOCATION_TYPE__TARGET_OBJ_TARGET_RELATION = EMR_ABSTRACT_RESOURCE_TYPE__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Emr Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_LOCATION_TYPE__EMR_DIAGRAM = EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Classification Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_LOCATION_TYPE__SOURCE_CLASSIFICATION_RELATIONS = EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Classification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_LOCATION_TYPE__TARGET_CLASSIFICATION = EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EMR Abstract Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ABSTRACT_LOCATION_TYPE_FEATURE_COUNT = EMR_ABSTRACT_RESOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link vpml.resourcepackage.impl.EMRToolTypeImpl <em>EMR Tool Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.resourcepackage.impl.EMRToolTypeImpl
	 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRToolType()
	 * @generated
	 */
	int EMR_TOOL_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__NAME = EMR_BASIC_RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__ID = EMR_BASIC_RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__CODE = EMR_BASIC_RESOURCE_TYPE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__DESCRIPTION = EMR_BASIC_RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__OID = EMR_BASIC_RESOURCE_TYPE__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__SOURCE_OBJ_SOURCE_RELATION = EMR_BASIC_RESOURCE_TYPE__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__TARGET_OBJ_TARGET_RELATION = EMR_BASIC_RESOURCE_TYPE__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Resource Group Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__RESOURCE_GROUP_TYPES = EMR_BASIC_RESOURCE_TYPE__RESOURCE_GROUP_TYPES;

	/**
	 * The feature id for the '<em><b>Cost Per Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__COST_PER_UNIT = EMR_BASIC_RESOURCE_TYPE__COST_PER_UNIT;

	/**
	 * The feature id for the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__TOTAL_AMOUNT = EMR_BASIC_RESOURCE_TYPE__TOTAL_AMOUNT;

	/**
	 * The feature id for the '<em><b>Usage Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__USAGE_AMOUNT = EMR_BASIC_RESOURCE_TYPE__USAGE_AMOUNT;

	/**
	 * The feature id for the '<em><b>Available Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__AVAILABLE_AMOUNT = EMR_BASIC_RESOURCE_TYPE__AVAILABLE_AMOUNT;

	/**
	 * The feature id for the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__EFFICIENCY = EMR_BASIC_RESOURCE_TYPE__EFFICIENCY;

	/**
	 * The feature id for the '<em><b>Emr Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__EMR_DIAGRAM = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classification Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__CLASSIFICATION_RELATION = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__EMP_DIAGRAM = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE__ASS_FLOWS = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EMR Tool Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_TOOL_TYPE_FEATURE_COUNT = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link vpml.resourcepackage.impl.EMRMachineTypeImpl <em>EMR Machine Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.resourcepackage.impl.EMRMachineTypeImpl
	 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRMachineType()
	 * @generated
	 */
	int EMR_MACHINE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__NAME = EMR_BASIC_RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__ID = EMR_BASIC_RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__CODE = EMR_BASIC_RESOURCE_TYPE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__DESCRIPTION = EMR_BASIC_RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__OID = EMR_BASIC_RESOURCE_TYPE__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__SOURCE_OBJ_SOURCE_RELATION = EMR_BASIC_RESOURCE_TYPE__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__TARGET_OBJ_TARGET_RELATION = EMR_BASIC_RESOURCE_TYPE__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Resource Group Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__RESOURCE_GROUP_TYPES = EMR_BASIC_RESOURCE_TYPE__RESOURCE_GROUP_TYPES;

	/**
	 * The feature id for the '<em><b>Cost Per Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__COST_PER_UNIT = EMR_BASIC_RESOURCE_TYPE__COST_PER_UNIT;

	/**
	 * The feature id for the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__TOTAL_AMOUNT = EMR_BASIC_RESOURCE_TYPE__TOTAL_AMOUNT;

	/**
	 * The feature id for the '<em><b>Usage Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__USAGE_AMOUNT = EMR_BASIC_RESOURCE_TYPE__USAGE_AMOUNT;

	/**
	 * The feature id for the '<em><b>Available Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__AVAILABLE_AMOUNT = EMR_BASIC_RESOURCE_TYPE__AVAILABLE_AMOUNT;

	/**
	 * The feature id for the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__EFFICIENCY = EMR_BASIC_RESOURCE_TYPE__EFFICIENCY;

	/**
	 * The feature id for the '<em><b>Emr Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__EMR_DIAGRAM = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classification Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__CLASSIFICATION_RELATION = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__EMP_DIAGRAM = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__ASS_FLOWS = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Col Machine Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE__COL_MACHINE_DIAGRAM = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EMR Machine Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_MACHINE_TYPE_FEATURE_COUNT = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link vpml.resourcepackage.impl.EMRLocationTypeImpl <em>EMR Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.resourcepackage.impl.EMRLocationTypeImpl
	 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRLocationType()
	 * @generated
	 */
	int EMR_LOCATION_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__NAME = EMR_BASIC_RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__ID = EMR_BASIC_RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__CODE = EMR_BASIC_RESOURCE_TYPE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__DESCRIPTION = EMR_BASIC_RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__OID = EMR_BASIC_RESOURCE_TYPE__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__SOURCE_OBJ_SOURCE_RELATION = EMR_BASIC_RESOURCE_TYPE__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__TARGET_OBJ_TARGET_RELATION = EMR_BASIC_RESOURCE_TYPE__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Resource Group Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__RESOURCE_GROUP_TYPES = EMR_BASIC_RESOURCE_TYPE__RESOURCE_GROUP_TYPES;

	/**
	 * The feature id for the '<em><b>Cost Per Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__COST_PER_UNIT = EMR_BASIC_RESOURCE_TYPE__COST_PER_UNIT;

	/**
	 * The feature id for the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__TOTAL_AMOUNT = EMR_BASIC_RESOURCE_TYPE__TOTAL_AMOUNT;

	/**
	 * The feature id for the '<em><b>Usage Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__USAGE_AMOUNT = EMR_BASIC_RESOURCE_TYPE__USAGE_AMOUNT;

	/**
	 * The feature id for the '<em><b>Available Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__AVAILABLE_AMOUNT = EMR_BASIC_RESOURCE_TYPE__AVAILABLE_AMOUNT;

	/**
	 * The feature id for the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__EFFICIENCY = EMR_BASIC_RESOURCE_TYPE__EFFICIENCY;

	/**
	 * The feature id for the '<em><b>Emr Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__EMR_DIAGRAM = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classification Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__CLASSIFICATION_RELATION = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__EMP_DIAGRAM = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__ASS_FLOWS = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Col Location Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE__COL_LOCATION_DIAGRAM = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EMR Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_LOCATION_TYPE_FEATURE_COUNT = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link vpml.resourcepackage.impl.EMRRoleImpl <em>EMR Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.resourcepackage.impl.EMRRoleImpl
	 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRRole()
	 * @generated
	 */
	int EMR_ROLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__NAME = EMR_BASIC_RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__ID = EMR_BASIC_RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__CODE = EMR_BASIC_RESOURCE_TYPE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__DESCRIPTION = EMR_BASIC_RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__OID = EMR_BASIC_RESOURCE_TYPE__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__SOURCE_OBJ_SOURCE_RELATION = EMR_BASIC_RESOURCE_TYPE__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__TARGET_OBJ_TARGET_RELATION = EMR_BASIC_RESOURCE_TYPE__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Resource Group Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__RESOURCE_GROUP_TYPES = EMR_BASIC_RESOURCE_TYPE__RESOURCE_GROUP_TYPES;

	/**
	 * The feature id for the '<em><b>Cost Per Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__COST_PER_UNIT = EMR_BASIC_RESOURCE_TYPE__COST_PER_UNIT;

	/**
	 * The feature id for the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__TOTAL_AMOUNT = EMR_BASIC_RESOURCE_TYPE__TOTAL_AMOUNT;

	/**
	 * The feature id for the '<em><b>Usage Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__USAGE_AMOUNT = EMR_BASIC_RESOURCE_TYPE__USAGE_AMOUNT;

	/**
	 * The feature id for the '<em><b>Available Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__AVAILABLE_AMOUNT = EMR_BASIC_RESOURCE_TYPE__AVAILABLE_AMOUNT;

	/**
	 * The feature id for the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__EFFICIENCY = EMR_BASIC_RESOURCE_TYPE__EFFICIENCY;

	/**
	 * The feature id for the '<em><b>Target Association Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__TARGET_ASSOCIATION_RELATIONS = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Association Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__SOURCE_ASSOCIATION_RELATIONS = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emo Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__EMO_DIAGRAM = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Belonged Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__BELONGED_ORGANIZATION = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Emr Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__EMR_DIAGRAM = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Classification Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__CLASSIFICATION_RELATION = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__EMP_DIAGRAM = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__ASS_FLOWS = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Col Role Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE__COL_ROLE_DIAGRAM = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>EMR Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_ROLE_FEATURE_COUNT = EMR_BASIC_RESOURCE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link vpml.resourcepackage.impl.EMRDiagramImpl <em>EMR Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.resourcepackage.impl.EMRDiagramImpl
	 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRDiagram()
	 * @generated
	 */
	int EMR_DIAGRAM = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__NAME = VpmlPackage.EM_DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__ID = VpmlPackage.EM_DIAGRAM__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__CODE = VpmlPackage.EM_DIAGRAM__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__DESCRIPTION = VpmlPackage.EM_DIAGRAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__OID = VpmlPackage.EM_DIAGRAM__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__SOURCE_OBJ_SOURCE_RELATION = VpmlPackage.EM_DIAGRAM__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__TARGET_OBJ_TARGET_RELATION = VpmlPackage.EM_DIAGRAM__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Creater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__CREATER = VpmlPackage.EM_DIAGRAM__CREATER;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__CREATED_DATE = VpmlPackage.EM_DIAGRAM__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Last Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__LAST_MODIFIER = VpmlPackage.EM_DIAGRAM__LAST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__LAST_MODIFIED_DATE = VpmlPackage.EM_DIAGRAM__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Emp Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__EMP_DIAGRAMS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emo Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__EMO_DIAGRAM = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classification Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__CLASSIFICATION_RELATIONS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Location Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__ABSTRACT_LOCATION_TYPES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract Machine Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__ABSTRACT_MACHINE_TYPES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Tool Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__ABSTRACT_TOOL_TYPES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__ABSTRACT_ROLES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__ROLES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Location Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__LOCATION_TYPES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Machine Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__MACHINE_TYPES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tool Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM__TOOL_TYPES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>EMR Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMR_DIAGRAM_FEATURE_COUNT = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 11;


	/**
	 * Returns the meta object for class '{@link vpml.resourcepackage.EMRResourceType <em>EMR Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMR Resource Type</em>'.
	 * @see vpml.resourcepackage.EMRResourceType
	 * @generated
	 */
	EClass getEMRResourceType();

	/**
	 * Returns the meta object for class '{@link vpml.resourcepackage.EMRBasicResourceType <em>EMR Basic Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMR Basic Resource Type</em>'.
	 * @see vpml.resourcepackage.EMRBasicResourceType
	 * @generated
	 */
	EClass getEMRBasicResourceType();

	/**
	 * Returns the meta object for the reference list '{@link vpml.resourcepackage.EMRBasicResourceType#getResourceGroupTypes <em>Resource Group Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Group Types</em>'.
	 * @see vpml.resourcepackage.EMRBasicResourceType#getResourceGroupTypes()
	 * @see #getEMRBasicResourceType()
	 * @generated
	 */
	EReference getEMRBasicResourceType_ResourceGroupTypes();

	/**
	 * Returns the meta object for the attribute '{@link vpml.resourcepackage.EMRBasicResourceType#getCostPerUnit <em>Cost Per Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Per Unit</em>'.
	 * @see vpml.resourcepackage.EMRBasicResourceType#getCostPerUnit()
	 * @see #getEMRBasicResourceType()
	 * @generated
	 */
	EAttribute getEMRBasicResourceType_CostPerUnit();

	/**
	 * Returns the meta object for the attribute '{@link vpml.resourcepackage.EMRBasicResourceType#getTotalAmount <em>Total Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Amount</em>'.
	 * @see vpml.resourcepackage.EMRBasicResourceType#getTotalAmount()
	 * @see #getEMRBasicResourceType()
	 * @generated
	 */
	EAttribute getEMRBasicResourceType_TotalAmount();

	/**
	 * Returns the meta object for the attribute '{@link vpml.resourcepackage.EMRBasicResourceType#getUsageAmount <em>Usage Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Amount</em>'.
	 * @see vpml.resourcepackage.EMRBasicResourceType#getUsageAmount()
	 * @see #getEMRBasicResourceType()
	 * @generated
	 */
	EAttribute getEMRBasicResourceType_UsageAmount();

	/**
	 * Returns the meta object for the attribute '{@link vpml.resourcepackage.EMRBasicResourceType#getAvailableAmount <em>Available Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Amount</em>'.
	 * @see vpml.resourcepackage.EMRBasicResourceType#getAvailableAmount()
	 * @see #getEMRBasicResourceType()
	 * @generated
	 */
	EAttribute getEMRBasicResourceType_AvailableAmount();

	/**
	 * Returns the meta object for the attribute '{@link vpml.resourcepackage.EMRBasicResourceType#getEfficiency <em>Efficiency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Efficiency</em>'.
	 * @see vpml.resourcepackage.EMRBasicResourceType#getEfficiency()
	 * @see #getEMRBasicResourceType()
	 * @generated
	 */
	EAttribute getEMRBasicResourceType_Efficiency();

	/**
	 * Returns the meta object for class '{@link vpml.resourcepackage.EMRClassificationRelation <em>EMR Classification Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMR Classification Relation</em>'.
	 * @see vpml.resourcepackage.EMRClassificationRelation
	 * @generated
	 */
	EClass getEMRClassificationRelation();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRClassificationRelation#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emr Diagram</em>'.
	 * @see vpml.resourcepackage.EMRClassificationRelation#getEmrDiagram()
	 * @see #getEMRClassificationRelation()
	 * @generated
	 */
	EReference getEMRClassificationRelation_EmrDiagram();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRClassificationRelation#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see vpml.resourcepackage.EMRClassificationRelation#getRole()
	 * @see #getEMRClassificationRelation()
	 * @generated
	 */
	EReference getEMRClassificationRelation_Role();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRClassificationRelation#getSourceAbsRoleType <em>Source Abs Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Abs Role Type</em>'.
	 * @see vpml.resourcepackage.EMRClassificationRelation#getSourceAbsRoleType()
	 * @see #getEMRClassificationRelation()
	 * @generated
	 */
	EReference getEMRClassificationRelation_SourceAbsRoleType();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRClassificationRelation#getTargetAbsRoleType <em>Target Abs Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Abs Role Type</em>'.
	 * @see vpml.resourcepackage.EMRClassificationRelation#getTargetAbsRoleType()
	 * @see #getEMRClassificationRelation()
	 * @generated
	 */
	EReference getEMRClassificationRelation_TargetAbsRoleType();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRClassificationRelation#getLocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location Type</em>'.
	 * @see vpml.resourcepackage.EMRClassificationRelation#getLocationType()
	 * @see #getEMRClassificationRelation()
	 * @generated
	 */
	EReference getEMRClassificationRelation_LocationType();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRClassificationRelation#getSourceAbsLocationType <em>Source Abs Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Abs Location Type</em>'.
	 * @see vpml.resourcepackage.EMRClassificationRelation#getSourceAbsLocationType()
	 * @see #getEMRClassificationRelation()
	 * @generated
	 */
	EReference getEMRClassificationRelation_SourceAbsLocationType();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRClassificationRelation#getTargetAbsLocationType <em>Target Abs Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Abs Location Type</em>'.
	 * @see vpml.resourcepackage.EMRClassificationRelation#getTargetAbsLocationType()
	 * @see #getEMRClassificationRelation()
	 * @generated
	 */
	EReference getEMRClassificationRelation_TargetAbsLocationType();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRClassificationRelation#getToolType <em>Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool Type</em>'.
	 * @see vpml.resourcepackage.EMRClassificationRelation#getToolType()
	 * @see #getEMRClassificationRelation()
	 * @generated
	 */
	EReference getEMRClassificationRelation_ToolType();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRClassificationRelation#getTargetAbsToolType <em>Target Abs Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Abs Tool Type</em>'.
	 * @see vpml.resourcepackage.EMRClassificationRelation#getTargetAbsToolType()
	 * @see #getEMRClassificationRelation()
	 * @generated
	 */
	EReference getEMRClassificationRelation_TargetAbsToolType();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRClassificationRelation#getSourceAbsToolType <em>Source Abs Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Abs Tool Type</em>'.
	 * @see vpml.resourcepackage.EMRClassificationRelation#getSourceAbsToolType()
	 * @see #getEMRClassificationRelation()
	 * @generated
	 */
	EReference getEMRClassificationRelation_SourceAbsToolType();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRClassificationRelation#getMachineType <em>Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Machine Type</em>'.
	 * @see vpml.resourcepackage.EMRClassificationRelation#getMachineType()
	 * @see #getEMRClassificationRelation()
	 * @generated
	 */
	EReference getEMRClassificationRelation_MachineType();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRClassificationRelation#getSourceAbsMachineType <em>Source Abs Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Abs Machine Type</em>'.
	 * @see vpml.resourcepackage.EMRClassificationRelation#getSourceAbsMachineType()
	 * @see #getEMRClassificationRelation()
	 * @generated
	 */
	EReference getEMRClassificationRelation_SourceAbsMachineType();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRClassificationRelation#getTargetAbsMachineType <em>Target Abs Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Abs Machine Type</em>'.
	 * @see vpml.resourcepackage.EMRClassificationRelation#getTargetAbsMachineType()
	 * @see #getEMRClassificationRelation()
	 * @generated
	 */
	EReference getEMRClassificationRelation_TargetAbsMachineType();

	/**
	 * Returns the meta object for class '{@link vpml.resourcepackage.EMRAbstractResourceType <em>EMR Abstract Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMR Abstract Resource Type</em>'.
	 * @see vpml.resourcepackage.EMRAbstractResourceType
	 * @generated
	 */
	EClass getEMRAbstractResourceType();

	/**
	 * Returns the meta object for class '{@link vpml.resourcepackage.EMRAbstractRole <em>EMR Abstract Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMR Abstract Role</em>'.
	 * @see vpml.resourcepackage.EMRAbstractRole
	 * @generated
	 */
	EClass getEMRAbstractRole();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRAbstractRole#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emr Diagram</em>'.
	 * @see vpml.resourcepackage.EMRAbstractRole#getEmrDiagram()
	 * @see #getEMRAbstractRole()
	 * @generated
	 */
	EReference getEMRAbstractRole_EmrDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.resourcepackage.EMRAbstractRole#getSourceClassificationRelations <em>Source Classification Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Classification Relations</em>'.
	 * @see vpml.resourcepackage.EMRAbstractRole#getSourceClassificationRelations()
	 * @see #getEMRAbstractRole()
	 * @generated
	 */
	EReference getEMRAbstractRole_SourceClassificationRelations();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRAbstractRole#getTargetClassificationRelation <em>Target Classification Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Classification Relation</em>'.
	 * @see vpml.resourcepackage.EMRAbstractRole#getTargetClassificationRelation()
	 * @see #getEMRAbstractRole()
	 * @generated
	 */
	EReference getEMRAbstractRole_TargetClassificationRelation();

	/**
	 * Returns the meta object for class '{@link vpml.resourcepackage.EMRAbstractToolType <em>EMR Abstract Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMR Abstract Tool Type</em>'.
	 * @see vpml.resourcepackage.EMRAbstractToolType
	 * @generated
	 */
	EClass getEMRAbstractToolType();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRAbstractToolType#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emr Diagram</em>'.
	 * @see vpml.resourcepackage.EMRAbstractToolType#getEmrDiagram()
	 * @see #getEMRAbstractToolType()
	 * @generated
	 */
	EReference getEMRAbstractToolType_EmrDiagram();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRAbstractToolType#getTargetClassificationRelation <em>Target Classification Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Classification Relation</em>'.
	 * @see vpml.resourcepackage.EMRAbstractToolType#getTargetClassificationRelation()
	 * @see #getEMRAbstractToolType()
	 * @generated
	 */
	EReference getEMRAbstractToolType_TargetClassificationRelation();

	/**
	 * Returns the meta object for the reference list '{@link vpml.resourcepackage.EMRAbstractToolType#getSourceAbsClassficationRelations <em>Source Abs Classfication Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Abs Classfication Relations</em>'.
	 * @see vpml.resourcepackage.EMRAbstractToolType#getSourceAbsClassficationRelations()
	 * @see #getEMRAbstractToolType()
	 * @generated
	 */
	EReference getEMRAbstractToolType_SourceAbsClassficationRelations();

	/**
	 * Returns the meta object for class '{@link vpml.resourcepackage.EMRAbstractMachineType <em>EMR Abstract Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMR Abstract Machine Type</em>'.
	 * @see vpml.resourcepackage.EMRAbstractMachineType
	 * @generated
	 */
	EClass getEMRAbstractMachineType();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRAbstractMachineType#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emr Diagram</em>'.
	 * @see vpml.resourcepackage.EMRAbstractMachineType#getEmrDiagram()
	 * @see #getEMRAbstractMachineType()
	 * @generated
	 */
	EReference getEMRAbstractMachineType_EmrDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.resourcepackage.EMRAbstractMachineType#getSourceClassificationRelations <em>Source Classification Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Classification Relations</em>'.
	 * @see vpml.resourcepackage.EMRAbstractMachineType#getSourceClassificationRelations()
	 * @see #getEMRAbstractMachineType()
	 * @generated
	 */
	EReference getEMRAbstractMachineType_SourceClassificationRelations();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRAbstractMachineType#getTargetClassificationRelation <em>Target Classification Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Classification Relation</em>'.
	 * @see vpml.resourcepackage.EMRAbstractMachineType#getTargetClassificationRelation()
	 * @see #getEMRAbstractMachineType()
	 * @generated
	 */
	EReference getEMRAbstractMachineType_TargetClassificationRelation();

	/**
	 * Returns the meta object for class '{@link vpml.resourcepackage.EMRAbstractLocationType <em>EMR Abstract Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMR Abstract Location Type</em>'.
	 * @see vpml.resourcepackage.EMRAbstractLocationType
	 * @generated
	 */
	EClass getEMRAbstractLocationType();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRAbstractLocationType#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emr Diagram</em>'.
	 * @see vpml.resourcepackage.EMRAbstractLocationType#getEmrDiagram()
	 * @see #getEMRAbstractLocationType()
	 * @generated
	 */
	EReference getEMRAbstractLocationType_EmrDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.resourcepackage.EMRAbstractLocationType#getSourceClassificationRelations <em>Source Classification Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Classification Relations</em>'.
	 * @see vpml.resourcepackage.EMRAbstractLocationType#getSourceClassificationRelations()
	 * @see #getEMRAbstractLocationType()
	 * @generated
	 */
	EReference getEMRAbstractLocationType_SourceClassificationRelations();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRAbstractLocationType#getTargetClassification <em>Target Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Classification</em>'.
	 * @see vpml.resourcepackage.EMRAbstractLocationType#getTargetClassification()
	 * @see #getEMRAbstractLocationType()
	 * @generated
	 */
	EReference getEMRAbstractLocationType_TargetClassification();

	/**
	 * Returns the meta object for class '{@link vpml.resourcepackage.EMRToolType <em>EMR Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMR Tool Type</em>'.
	 * @see vpml.resourcepackage.EMRToolType
	 * @generated
	 */
	EClass getEMRToolType();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRToolType#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emr Diagram</em>'.
	 * @see vpml.resourcepackage.EMRToolType#getEmrDiagram()
	 * @see #getEMRToolType()
	 * @generated
	 */
	EReference getEMRToolType_EmrDiagram();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRToolType#getClassificationRelation <em>Classification Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classification Relation</em>'.
	 * @see vpml.resourcepackage.EMRToolType#getClassificationRelation()
	 * @see #getEMRToolType()
	 * @generated
	 */
	EReference getEMRToolType_ClassificationRelation();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRToolType#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.resourcepackage.EMRToolType#getEmpDiagram()
	 * @see #getEMRToolType()
	 * @generated
	 */
	EReference getEMRToolType_EmpDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.resourcepackage.EMRToolType#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ass Flows</em>'.
	 * @see vpml.resourcepackage.EMRToolType#getAssFlows()
	 * @see #getEMRToolType()
	 * @generated
	 */
	EReference getEMRToolType_AssFlows();

	/**
	 * Returns the meta object for class '{@link vpml.resourcepackage.EMRMachineType <em>EMR Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMR Machine Type</em>'.
	 * @see vpml.resourcepackage.EMRMachineType
	 * @generated
	 */
	EClass getEMRMachineType();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRMachineType#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emr Diagram</em>'.
	 * @see vpml.resourcepackage.EMRMachineType#getEmrDiagram()
	 * @see #getEMRMachineType()
	 * @generated
	 */
	EReference getEMRMachineType_EmrDiagram();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRMachineType#getClassificationRelation <em>Classification Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classification Relation</em>'.
	 * @see vpml.resourcepackage.EMRMachineType#getClassificationRelation()
	 * @see #getEMRMachineType()
	 * @generated
	 */
	EReference getEMRMachineType_ClassificationRelation();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRMachineType#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.resourcepackage.EMRMachineType#getEmpDiagram()
	 * @see #getEMRMachineType()
	 * @generated
	 */
	EReference getEMRMachineType_EmpDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.resourcepackage.EMRMachineType#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ass Flows</em>'.
	 * @see vpml.resourcepackage.EMRMachineType#getAssFlows()
	 * @see #getEMRMachineType()
	 * @generated
	 */
	EReference getEMRMachineType_AssFlows();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRMachineType#getColMachineDiagram <em>Col Machine Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Col Machine Diagram</em>'.
	 * @see vpml.resourcepackage.EMRMachineType#getColMachineDiagram()
	 * @see #getEMRMachineType()
	 * @generated
	 */
	EReference getEMRMachineType_ColMachineDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.resourcepackage.EMRLocationType <em>EMR Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMR Location Type</em>'.
	 * @see vpml.resourcepackage.EMRLocationType
	 * @generated
	 */
	EClass getEMRLocationType();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRLocationType#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emr Diagram</em>'.
	 * @see vpml.resourcepackage.EMRLocationType#getEmrDiagram()
	 * @see #getEMRLocationType()
	 * @generated
	 */
	EReference getEMRLocationType_EmrDiagram();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRLocationType#getClassificationRelation <em>Classification Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classification Relation</em>'.
	 * @see vpml.resourcepackage.EMRLocationType#getClassificationRelation()
	 * @see #getEMRLocationType()
	 * @generated
	 */
	EReference getEMRLocationType_ClassificationRelation();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRLocationType#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.resourcepackage.EMRLocationType#getEmpDiagram()
	 * @see #getEMRLocationType()
	 * @generated
	 */
	EReference getEMRLocationType_EmpDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.resourcepackage.EMRLocationType#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ass Flows</em>'.
	 * @see vpml.resourcepackage.EMRLocationType#getAssFlows()
	 * @see #getEMRLocationType()
	 * @generated
	 */
	EReference getEMRLocationType_AssFlows();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRLocationType#getColLocationDiagram <em>Col Location Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Col Location Diagram</em>'.
	 * @see vpml.resourcepackage.EMRLocationType#getColLocationDiagram()
	 * @see #getEMRLocationType()
	 * @generated
	 */
	EReference getEMRLocationType_ColLocationDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.resourcepackage.EMRRole <em>EMR Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMR Role</em>'.
	 * @see vpml.resourcepackage.EMRRole
	 * @generated
	 */
	EClass getEMRRole();

	/**
	 * Returns the meta object for the reference list '{@link vpml.resourcepackage.EMRRole#getTargetAssociationRelations <em>Target Association Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Association Relations</em>'.
	 * @see vpml.resourcepackage.EMRRole#getTargetAssociationRelations()
	 * @see #getEMRRole()
	 * @generated
	 */
	EReference getEMRRole_TargetAssociationRelations();

	/**
	 * Returns the meta object for the reference list '{@link vpml.resourcepackage.EMRRole#getSourceAssociationRelations <em>Source Association Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Association Relations</em>'.
	 * @see vpml.resourcepackage.EMRRole#getSourceAssociationRelations()
	 * @see #getEMRRole()
	 * @generated
	 */
	EReference getEMRRole_SourceAssociationRelations();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRRole#getEmoDiagram <em>Emo Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emo Diagram</em>'.
	 * @see vpml.resourcepackage.EMRRole#getEmoDiagram()
	 * @see #getEMRRole()
	 * @generated
	 */
	EReference getEMRRole_EmoDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link vpml.resourcepackage.EMRRole#getBelongedOrganization <em>Belonged Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Belonged Organization</em>'.
	 * @see vpml.resourcepackage.EMRRole#getBelongedOrganization()
	 * @see #getEMRRole()
	 * @generated
	 */
	EReference getEMRRole_BelongedOrganization();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRRole#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emr Diagram</em>'.
	 * @see vpml.resourcepackage.EMRRole#getEmrDiagram()
	 * @see #getEMRRole()
	 * @generated
	 */
	EReference getEMRRole_EmrDiagram();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRRole#getClassificationRelation <em>Classification Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classification Relation</em>'.
	 * @see vpml.resourcepackage.EMRRole#getClassificationRelation()
	 * @see #getEMRRole()
	 * @generated
	 */
	EReference getEMRRole_ClassificationRelation();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRRole#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.resourcepackage.EMRRole#getEmpDiagram()
	 * @see #getEMRRole()
	 * @generated
	 */
	EReference getEMRRole_EmpDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.resourcepackage.EMRRole#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ass Flows</em>'.
	 * @see vpml.resourcepackage.EMRRole#getAssFlows()
	 * @see #getEMRRole()
	 * @generated
	 */
	EReference getEMRRole_AssFlows();

	/**
	 * Returns the meta object for the container reference '{@link vpml.resourcepackage.EMRRole#getColRoleDiagram <em>Col Role Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Col Role Diagram</em>'.
	 * @see vpml.resourcepackage.EMRRole#getColRoleDiagram()
	 * @see #getEMRRole()
	 * @generated
	 */
	EReference getEMRRole_ColRoleDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.resourcepackage.EMRDiagram <em>EMR Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMR Diagram</em>'.
	 * @see vpml.resourcepackage.EMRDiagram
	 * @generated
	 */
	EClass getEMRDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.resourcepackage.EMRDiagram#getEmpDiagrams <em>Emp Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emp Diagrams</em>'.
	 * @see vpml.resourcepackage.EMRDiagram#getEmpDiagrams()
	 * @see #getEMRDiagram()
	 * @generated
	 */
	EReference getEMRDiagram_EmpDiagrams();

	/**
	 * Returns the meta object for the reference '{@link vpml.resourcepackage.EMRDiagram#getEmoDiagram <em>Emo Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Emo Diagram</em>'.
	 * @see vpml.resourcepackage.EMRDiagram#getEmoDiagram()
	 * @see #getEMRDiagram()
	 * @generated
	 */
	EReference getEMRDiagram_EmoDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.resourcepackage.EMRDiagram#getClassificationRelations <em>Classification Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Relations</em>'.
	 * @see vpml.resourcepackage.EMRDiagram#getClassificationRelations()
	 * @see #getEMRDiagram()
	 * @generated
	 */
	EReference getEMRDiagram_ClassificationRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.resourcepackage.EMRDiagram#getAbstractLocationTypes <em>Abstract Location Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Location Types</em>'.
	 * @see vpml.resourcepackage.EMRDiagram#getAbstractLocationTypes()
	 * @see #getEMRDiagram()
	 * @generated
	 */
	EReference getEMRDiagram_AbstractLocationTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.resourcepackage.EMRDiagram#getAbstractMachineTypes <em>Abstract Machine Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Machine Types</em>'.
	 * @see vpml.resourcepackage.EMRDiagram#getAbstractMachineTypes()
	 * @see #getEMRDiagram()
	 * @generated
	 */
	EReference getEMRDiagram_AbstractMachineTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.resourcepackage.EMRDiagram#getAbstractToolTypes <em>Abstract Tool Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Tool Types</em>'.
	 * @see vpml.resourcepackage.EMRDiagram#getAbstractToolTypes()
	 * @see #getEMRDiagram()
	 * @generated
	 */
	EReference getEMRDiagram_AbstractToolTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.resourcepackage.EMRDiagram#getAbstractRoles <em>Abstract Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Roles</em>'.
	 * @see vpml.resourcepackage.EMRDiagram#getAbstractRoles()
	 * @see #getEMRDiagram()
	 * @generated
	 */
	EReference getEMRDiagram_AbstractRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.resourcepackage.EMRDiagram#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see vpml.resourcepackage.EMRDiagram#getRoles()
	 * @see #getEMRDiagram()
	 * @generated
	 */
	EReference getEMRDiagram_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.resourcepackage.EMRDiagram#getLocationTypes <em>Location Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location Types</em>'.
	 * @see vpml.resourcepackage.EMRDiagram#getLocationTypes()
	 * @see #getEMRDiagram()
	 * @generated
	 */
	EReference getEMRDiagram_LocationTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.resourcepackage.EMRDiagram#getMachineTypes <em>Machine Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Types</em>'.
	 * @see vpml.resourcepackage.EMRDiagram#getMachineTypes()
	 * @see #getEMRDiagram()
	 * @generated
	 */
	EReference getEMRDiagram_MachineTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.resourcepackage.EMRDiagram#getToolTypes <em>Tool Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool Types</em>'.
	 * @see vpml.resourcepackage.EMRDiagram#getToolTypes()
	 * @see #getEMRDiagram()
	 * @generated
	 */
	EReference getEMRDiagram_ToolTypes();

	/**
	 * Returns the meta object for class '{@link vpml.resourcepackage.EMRObject <em>EMR Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMR Object</em>'.
	 * @see vpml.resourcepackage.EMRObject
	 * @generated
	 */
	EClass getEMRObject();

	/**
	 * Returns the meta object for class '{@link vpml.resourcepackage.EMRRelation <em>EMR Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMR Relation</em>'.
	 * @see vpml.resourcepackage.EMRRelation
	 * @generated
	 */
	EClass getEMRRelation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourcepackageFactory getResourcepackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals  {
		/**
		 * The meta object literal for the '{@link vpml.resourcepackage.impl.EMRResourceTypeImpl <em>EMR Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.resourcepackage.impl.EMRResourceTypeImpl
		 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRResourceType()
		 * @generated
		 */
		EClass EMR_RESOURCE_TYPE = eINSTANCE.getEMRResourceType();

		/**
		 * The meta object literal for the '{@link vpml.resourcepackage.impl.EMRBasicResourceTypeImpl <em>EMR Basic Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.resourcepackage.impl.EMRBasicResourceTypeImpl
		 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRBasicResourceType()
		 * @generated
		 */
		EClass EMR_BASIC_RESOURCE_TYPE = eINSTANCE.getEMRBasicResourceType();

		/**
		 * The meta object literal for the '<em><b>Resource Group Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_BASIC_RESOURCE_TYPE__RESOURCE_GROUP_TYPES = eINSTANCE.getEMRBasicResourceType_ResourceGroupTypes();

		/**
		 * The meta object literal for the '<em><b>Cost Per Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMR_BASIC_RESOURCE_TYPE__COST_PER_UNIT = eINSTANCE.getEMRBasicResourceType_CostPerUnit();

		/**
		 * The meta object literal for the '<em><b>Total Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMR_BASIC_RESOURCE_TYPE__TOTAL_AMOUNT = eINSTANCE.getEMRBasicResourceType_TotalAmount();

		/**
		 * The meta object literal for the '<em><b>Usage Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMR_BASIC_RESOURCE_TYPE__USAGE_AMOUNT = eINSTANCE.getEMRBasicResourceType_UsageAmount();

		/**
		 * The meta object literal for the '<em><b>Available Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMR_BASIC_RESOURCE_TYPE__AVAILABLE_AMOUNT = eINSTANCE.getEMRBasicResourceType_AvailableAmount();

		/**
		 * The meta object literal for the '<em><b>Efficiency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMR_BASIC_RESOURCE_TYPE__EFFICIENCY = eINSTANCE.getEMRBasicResourceType_Efficiency();

		/**
		 * The meta object literal for the '{@link vpml.resourcepackage.impl.EMRClassificationRelationImpl <em>EMR Classification Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.resourcepackage.impl.EMRClassificationRelationImpl
		 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRClassificationRelation()
		 * @generated
		 */
		EClass EMR_CLASSIFICATION_RELATION = eINSTANCE.getEMRClassificationRelation();

		/**
		 * The meta object literal for the '<em><b>Emr Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_CLASSIFICATION_RELATION__EMR_DIAGRAM = eINSTANCE.getEMRClassificationRelation_EmrDiagram();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_CLASSIFICATION_RELATION__ROLE = eINSTANCE.getEMRClassificationRelation_Role();

		/**
		 * The meta object literal for the '<em><b>Source Abs Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_CLASSIFICATION_RELATION__SOURCE_ABS_ROLE_TYPE = eINSTANCE.getEMRClassificationRelation_SourceAbsRoleType();

		/**
		 * The meta object literal for the '<em><b>Target Abs Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_CLASSIFICATION_RELATION__TARGET_ABS_ROLE_TYPE = eINSTANCE.getEMRClassificationRelation_TargetAbsRoleType();

		/**
		 * The meta object literal for the '<em><b>Location Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_CLASSIFICATION_RELATION__LOCATION_TYPE = eINSTANCE.getEMRClassificationRelation_LocationType();

		/**
		 * The meta object literal for the '<em><b>Source Abs Location Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_CLASSIFICATION_RELATION__SOURCE_ABS_LOCATION_TYPE = eINSTANCE.getEMRClassificationRelation_SourceAbsLocationType();

		/**
		 * The meta object literal for the '<em><b>Target Abs Location Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_CLASSIFICATION_RELATION__TARGET_ABS_LOCATION_TYPE = eINSTANCE.getEMRClassificationRelation_TargetAbsLocationType();

		/**
		 * The meta object literal for the '<em><b>Tool Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_CLASSIFICATION_RELATION__TOOL_TYPE = eINSTANCE.getEMRClassificationRelation_ToolType();

		/**
		 * The meta object literal for the '<em><b>Target Abs Tool Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_CLASSIFICATION_RELATION__TARGET_ABS_TOOL_TYPE = eINSTANCE.getEMRClassificationRelation_TargetAbsToolType();

		/**
		 * The meta object literal for the '<em><b>Source Abs Tool Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_CLASSIFICATION_RELATION__SOURCE_ABS_TOOL_TYPE = eINSTANCE.getEMRClassificationRelation_SourceAbsToolType();

		/**
		 * The meta object literal for the '<em><b>Machine Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_CLASSIFICATION_RELATION__MACHINE_TYPE = eINSTANCE.getEMRClassificationRelation_MachineType();

		/**
		 * The meta object literal for the '<em><b>Source Abs Machine Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_CLASSIFICATION_RELATION__SOURCE_ABS_MACHINE_TYPE = eINSTANCE.getEMRClassificationRelation_SourceAbsMachineType();

		/**
		 * The meta object literal for the '<em><b>Target Abs Machine Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_CLASSIFICATION_RELATION__TARGET_ABS_MACHINE_TYPE = eINSTANCE.getEMRClassificationRelation_TargetAbsMachineType();

		/**
		 * The meta object literal for the '{@link vpml.resourcepackage.impl.EMRAbstractResourceTypeImpl <em>EMR Abstract Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.resourcepackage.impl.EMRAbstractResourceTypeImpl
		 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRAbstractResourceType()
		 * @generated
		 */
		EClass EMR_ABSTRACT_RESOURCE_TYPE = eINSTANCE.getEMRAbstractResourceType();

		/**
		 * The meta object literal for the '{@link vpml.resourcepackage.impl.EMRAbstractRoleImpl <em>EMR Abstract Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.resourcepackage.impl.EMRAbstractRoleImpl
		 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRAbstractRole()
		 * @generated
		 */
		EClass EMR_ABSTRACT_ROLE = eINSTANCE.getEMRAbstractRole();

		/**
		 * The meta object literal for the '<em><b>Emr Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ABSTRACT_ROLE__EMR_DIAGRAM = eINSTANCE.getEMRAbstractRole_EmrDiagram();

		/**
		 * The meta object literal for the '<em><b>Source Classification Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ABSTRACT_ROLE__SOURCE_CLASSIFICATION_RELATIONS = eINSTANCE.getEMRAbstractRole_SourceClassificationRelations();

		/**
		 * The meta object literal for the '<em><b>Target Classification Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ABSTRACT_ROLE__TARGET_CLASSIFICATION_RELATION = eINSTANCE.getEMRAbstractRole_TargetClassificationRelation();

		/**
		 * The meta object literal for the '{@link vpml.resourcepackage.impl.EMRAbstractToolTypeImpl <em>EMR Abstract Tool Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.resourcepackage.impl.EMRAbstractToolTypeImpl
		 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRAbstractToolType()
		 * @generated
		 */
		EClass EMR_ABSTRACT_TOOL_TYPE = eINSTANCE.getEMRAbstractToolType();

		/**
		 * The meta object literal for the '<em><b>Emr Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ABSTRACT_TOOL_TYPE__EMR_DIAGRAM = eINSTANCE.getEMRAbstractToolType_EmrDiagram();

		/**
		 * The meta object literal for the '<em><b>Target Classification Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ABSTRACT_TOOL_TYPE__TARGET_CLASSIFICATION_RELATION = eINSTANCE.getEMRAbstractToolType_TargetClassificationRelation();

		/**
		 * The meta object literal for the '<em><b>Source Abs Classfication Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ABSTRACT_TOOL_TYPE__SOURCE_ABS_CLASSFICATION_RELATIONS = eINSTANCE.getEMRAbstractToolType_SourceAbsClassficationRelations();

		/**
		 * The meta object literal for the '{@link vpml.resourcepackage.impl.EMRAbstractMachineTypeImpl <em>EMR Abstract Machine Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.resourcepackage.impl.EMRAbstractMachineTypeImpl
		 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRAbstractMachineType()
		 * @generated
		 */
		EClass EMR_ABSTRACT_MACHINE_TYPE = eINSTANCE.getEMRAbstractMachineType();

		/**
		 * The meta object literal for the '<em><b>Emr Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ABSTRACT_MACHINE_TYPE__EMR_DIAGRAM = eINSTANCE.getEMRAbstractMachineType_EmrDiagram();

		/**
		 * The meta object literal for the '<em><b>Source Classification Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ABSTRACT_MACHINE_TYPE__SOURCE_CLASSIFICATION_RELATIONS = eINSTANCE.getEMRAbstractMachineType_SourceClassificationRelations();

		/**
		 * The meta object literal for the '<em><b>Target Classification Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ABSTRACT_MACHINE_TYPE__TARGET_CLASSIFICATION_RELATION = eINSTANCE.getEMRAbstractMachineType_TargetClassificationRelation();

		/**
		 * The meta object literal for the '{@link vpml.resourcepackage.impl.EMRAbstractLocationTypeImpl <em>EMR Abstract Location Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.resourcepackage.impl.EMRAbstractLocationTypeImpl
		 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRAbstractLocationType()
		 * @generated
		 */
		EClass EMR_ABSTRACT_LOCATION_TYPE = eINSTANCE.getEMRAbstractLocationType();

		/**
		 * The meta object literal for the '<em><b>Emr Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ABSTRACT_LOCATION_TYPE__EMR_DIAGRAM = eINSTANCE.getEMRAbstractLocationType_EmrDiagram();

		/**
		 * The meta object literal for the '<em><b>Source Classification Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ABSTRACT_LOCATION_TYPE__SOURCE_CLASSIFICATION_RELATIONS = eINSTANCE.getEMRAbstractLocationType_SourceClassificationRelations();

		/**
		 * The meta object literal for the '<em><b>Target Classification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ABSTRACT_LOCATION_TYPE__TARGET_CLASSIFICATION = eINSTANCE.getEMRAbstractLocationType_TargetClassification();

		/**
		 * The meta object literal for the '{@link vpml.resourcepackage.impl.EMRToolTypeImpl <em>EMR Tool Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.resourcepackage.impl.EMRToolTypeImpl
		 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRToolType()
		 * @generated
		 */
		EClass EMR_TOOL_TYPE = eINSTANCE.getEMRToolType();

		/**
		 * The meta object literal for the '<em><b>Emr Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_TOOL_TYPE__EMR_DIAGRAM = eINSTANCE.getEMRToolType_EmrDiagram();

		/**
		 * The meta object literal for the '<em><b>Classification Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_TOOL_TYPE__CLASSIFICATION_RELATION = eINSTANCE.getEMRToolType_ClassificationRelation();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_TOOL_TYPE__EMP_DIAGRAM = eINSTANCE.getEMRToolType_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Ass Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_TOOL_TYPE__ASS_FLOWS = eINSTANCE.getEMRToolType_AssFlows();

		/**
		 * The meta object literal for the '{@link vpml.resourcepackage.impl.EMRMachineTypeImpl <em>EMR Machine Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.resourcepackage.impl.EMRMachineTypeImpl
		 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRMachineType()
		 * @generated
		 */
		EClass EMR_MACHINE_TYPE = eINSTANCE.getEMRMachineType();

		/**
		 * The meta object literal for the '<em><b>Emr Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_MACHINE_TYPE__EMR_DIAGRAM = eINSTANCE.getEMRMachineType_EmrDiagram();

		/**
		 * The meta object literal for the '<em><b>Classification Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_MACHINE_TYPE__CLASSIFICATION_RELATION = eINSTANCE.getEMRMachineType_ClassificationRelation();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_MACHINE_TYPE__EMP_DIAGRAM = eINSTANCE.getEMRMachineType_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Ass Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_MACHINE_TYPE__ASS_FLOWS = eINSTANCE.getEMRMachineType_AssFlows();

		/**
		 * The meta object literal for the '<em><b>Col Machine Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_MACHINE_TYPE__COL_MACHINE_DIAGRAM = eINSTANCE.getEMRMachineType_ColMachineDiagram();

		/**
		 * The meta object literal for the '{@link vpml.resourcepackage.impl.EMRLocationTypeImpl <em>EMR Location Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.resourcepackage.impl.EMRLocationTypeImpl
		 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRLocationType()
		 * @generated
		 */
		EClass EMR_LOCATION_TYPE = eINSTANCE.getEMRLocationType();

		/**
		 * The meta object literal for the '<em><b>Emr Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_LOCATION_TYPE__EMR_DIAGRAM = eINSTANCE.getEMRLocationType_EmrDiagram();

		/**
		 * The meta object literal for the '<em><b>Classification Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_LOCATION_TYPE__CLASSIFICATION_RELATION = eINSTANCE.getEMRLocationType_ClassificationRelation();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_LOCATION_TYPE__EMP_DIAGRAM = eINSTANCE.getEMRLocationType_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Ass Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_LOCATION_TYPE__ASS_FLOWS = eINSTANCE.getEMRLocationType_AssFlows();

		/**
		 * The meta object literal for the '<em><b>Col Location Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_LOCATION_TYPE__COL_LOCATION_DIAGRAM = eINSTANCE.getEMRLocationType_ColLocationDiagram();

		/**
		 * The meta object literal for the '{@link vpml.resourcepackage.impl.EMRRoleImpl <em>EMR Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.resourcepackage.impl.EMRRoleImpl
		 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRRole()
		 * @generated
		 */
		EClass EMR_ROLE = eINSTANCE.getEMRRole();

		/**
		 * The meta object literal for the '<em><b>Target Association Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ROLE__TARGET_ASSOCIATION_RELATIONS = eINSTANCE.getEMRRole_TargetAssociationRelations();

		/**
		 * The meta object literal for the '<em><b>Source Association Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ROLE__SOURCE_ASSOCIATION_RELATIONS = eINSTANCE.getEMRRole_SourceAssociationRelations();

		/**
		 * The meta object literal for the '<em><b>Emo Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ROLE__EMO_DIAGRAM = eINSTANCE.getEMRRole_EmoDiagram();

		/**
		 * The meta object literal for the '<em><b>Belonged Organization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ROLE__BELONGED_ORGANIZATION = eINSTANCE.getEMRRole_BelongedOrganization();

		/**
		 * The meta object literal for the '<em><b>Emr Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ROLE__EMR_DIAGRAM = eINSTANCE.getEMRRole_EmrDiagram();

		/**
		 * The meta object literal for the '<em><b>Classification Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ROLE__CLASSIFICATION_RELATION = eINSTANCE.getEMRRole_ClassificationRelation();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ROLE__EMP_DIAGRAM = eINSTANCE.getEMRRole_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Ass Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ROLE__ASS_FLOWS = eINSTANCE.getEMRRole_AssFlows();

		/**
		 * The meta object literal for the '<em><b>Col Role Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_ROLE__COL_ROLE_DIAGRAM = eINSTANCE.getEMRRole_ColRoleDiagram();

		/**
		 * The meta object literal for the '{@link vpml.resourcepackage.impl.EMRDiagramImpl <em>EMR Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.resourcepackage.impl.EMRDiagramImpl
		 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRDiagram()
		 * @generated
		 */
		EClass EMR_DIAGRAM = eINSTANCE.getEMRDiagram();

		/**
		 * The meta object literal for the '<em><b>Emp Diagrams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_DIAGRAM__EMP_DIAGRAMS = eINSTANCE.getEMRDiagram_EmpDiagrams();

		/**
		 * The meta object literal for the '<em><b>Emo Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_DIAGRAM__EMO_DIAGRAM = eINSTANCE.getEMRDiagram_EmoDiagram();

		/**
		 * The meta object literal for the '<em><b>Classification Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_DIAGRAM__CLASSIFICATION_RELATIONS = eINSTANCE.getEMRDiagram_ClassificationRelations();

		/**
		 * The meta object literal for the '<em><b>Abstract Location Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_DIAGRAM__ABSTRACT_LOCATION_TYPES = eINSTANCE.getEMRDiagram_AbstractLocationTypes();

		/**
		 * The meta object literal for the '<em><b>Abstract Machine Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_DIAGRAM__ABSTRACT_MACHINE_TYPES = eINSTANCE.getEMRDiagram_AbstractMachineTypes();

		/**
		 * The meta object literal for the '<em><b>Abstract Tool Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_DIAGRAM__ABSTRACT_TOOL_TYPES = eINSTANCE.getEMRDiagram_AbstractToolTypes();

		/**
		 * The meta object literal for the '<em><b>Abstract Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_DIAGRAM__ABSTRACT_ROLES = eINSTANCE.getEMRDiagram_AbstractRoles();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_DIAGRAM__ROLES = eINSTANCE.getEMRDiagram_Roles();

		/**
		 * The meta object literal for the '<em><b>Location Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_DIAGRAM__LOCATION_TYPES = eINSTANCE.getEMRDiagram_LocationTypes();

		/**
		 * The meta object literal for the '<em><b>Machine Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_DIAGRAM__MACHINE_TYPES = eINSTANCE.getEMRDiagram_MachineTypes();

		/**
		 * The meta object literal for the '<em><b>Tool Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMR_DIAGRAM__TOOL_TYPES = eINSTANCE.getEMRDiagram_ToolTypes();

		/**
		 * The meta object literal for the '{@link vpml.resourcepackage.impl.EMRObjectImpl <em>EMR Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.resourcepackage.impl.EMRObjectImpl
		 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRObject()
		 * @generated
		 */
		EClass EMR_OBJECT = eINSTANCE.getEMRObject();

		/**
		 * The meta object literal for the '{@link vpml.resourcepackage.impl.EMRRelationImpl <em>EMR Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.resourcepackage.impl.EMRRelationImpl
		 * @see vpml.resourcepackage.impl.ResourcepackagePackageImpl#getEMRRelation()
		 * @generated
		 */
		EClass EMR_RELATION = eINSTANCE.getEMRRelation();

	}

} //ResourcepackagePackage
