/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.organizationpackage;

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
 * @see vpml.organizationpackage.OrganizationpackageFactory
 * @model kind="package"
 * @generated
 */
public interface OrganizationpackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "organizationpackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///vpml/organizationpackage.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vpml.organizationpackage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrganizationpackagePackage eINSTANCE = vpml.organizationpackage.impl.OrganizationpackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link vpml.organizationpackage.impl.EMOObjectImpl <em>EMO Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.organizationpackage.impl.EMOObjectImpl
	 * @see vpml.organizationpackage.impl.OrganizationpackagePackageImpl#getEMOObject()
	 * @generated
	 */
	int EMO_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_OBJECT__NAME = VpmlPackage.EM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_OBJECT__ID = VpmlPackage.EM_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_OBJECT__CODE = VpmlPackage.EM_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_OBJECT__DESCRIPTION = VpmlPackage.EM_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_OBJECT__OID = VpmlPackage.EM_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_OBJECT__SOURCE_OBJ_SOURCE_RELATION = VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_OBJECT__TARGET_OBJ_TARGET_RELATION = VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The number of structural features of the '<em>EMO Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_OBJECT_FEATURE_COUNT = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link vpml.organizationpackage.impl.EMOResourceGroupTypeImpl <em>EMO Resource Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.organizationpackage.impl.EMOResourceGroupTypeImpl
	 * @see vpml.organizationpackage.impl.OrganizationpackagePackageImpl#getEMOResourceGroupType()
	 * @generated
	 */
	int EMO_RESOURCE_GROUP_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__NAME = EMO_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__ID = EMO_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__CODE = EMO_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__DESCRIPTION = EMO_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__OID = EMO_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__SOURCE_OBJ_SOURCE_RELATION = EMO_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__TARGET_OBJ_TARGET_RELATION = EMO_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Organiztion Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__ORGANIZTION_TYPE = EMO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__SUPER_ORGANIZATION = EMO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Principal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__PRINCIPAL = EMO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arrange Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__ARRANGE_NUMBER = EMO_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__RESERVED = EMO_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Association Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__SOURCE_ASSOCIATION_RELATIONS = EMO_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Compose Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__TARGET_COMPOSE_RELATION = EMO_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source Compose Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__SOURCE_COMPOSE_RELATIONS = EMO_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target Association Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__TARGET_ASSOCIATION_RELATIONS = EMO_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Emo Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__EMO_DIAGRAM = EMO_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Basic Resource Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__BASIC_RESOURCE_TYPES = EMO_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__ASS_FLOWS = EMO_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__EMP_DIAGRAM = EMO_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Col EMO Group Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE__COL_EMO_GROUP_DIAGRAM = EMO_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>EMO Resource Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RESOURCE_GROUP_TYPE_FEATURE_COUNT = EMO_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link vpml.organizationpackage.impl.EMORelationsImpl <em>EMO Relations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.organizationpackage.impl.EMORelationsImpl
	 * @see vpml.organizationpackage.impl.OrganizationpackagePackageImpl#getEMORelations()
	 * @generated
	 */
	int EMO_RELATIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RELATIONS__NAME = VpmlPackage.EM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RELATIONS__ID = VpmlPackage.EM_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RELATIONS__CODE = VpmlPackage.EM_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RELATIONS__DESCRIPTION = VpmlPackage.EM_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RELATIONS__OID = VpmlPackage.EM_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RELATIONS__SOURCE_OBJ_SOURCE_RELATION = VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RELATIONS__TARGET_OBJ_TARGET_RELATION = VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RELATIONS__NUMBER = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMO Relations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_RELATIONS_FEATURE_COUNT = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.organizationpackage.impl.EMOAssociationRelationImpl <em>EMO Association Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.organizationpackage.impl.EMOAssociationRelationImpl
	 * @see vpml.organizationpackage.impl.OrganizationpackagePackageImpl#getEMOAssociationRelation()
	 * @generated
	 */
	int EMO_ASSOCIATION_RELATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_ASSOCIATION_RELATION__NAME = EMO_RELATIONS__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_ASSOCIATION_RELATION__ID = EMO_RELATIONS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_ASSOCIATION_RELATION__CODE = EMO_RELATIONS__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_ASSOCIATION_RELATION__DESCRIPTION = EMO_RELATIONS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_ASSOCIATION_RELATION__OID = EMO_RELATIONS__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_ASSOCIATION_RELATION__SOURCE_OBJ_SOURCE_RELATION = EMO_RELATIONS__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_ASSOCIATION_RELATION__TARGET_OBJ_TARGET_RELATION = EMO_RELATIONS__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_ASSOCIATION_RELATION__NUMBER = EMO_RELATIONS__NUMBER;

	/**
	 * The feature id for the '<em><b>Source Group Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_ASSOCIATION_RELATION__SOURCE_GROUP_TYPE = EMO_RELATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_ASSOCIATION_RELATION__TARGET_ROLE = EMO_RELATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_ASSOCIATION_RELATION__SOURCE_ROLE = EMO_RELATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Group Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_ASSOCIATION_RELATION__TARGET_GROUP_TYPE = EMO_RELATIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Emo Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_ASSOCIATION_RELATION__EMO_DIAGRAM = EMO_RELATIONS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EMO Association Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_ASSOCIATION_RELATION_FEATURE_COUNT = EMO_RELATIONS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link vpml.organizationpackage.impl.EMOComposeRelationImpl <em>EMO Compose Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.organizationpackage.impl.EMOComposeRelationImpl
	 * @see vpml.organizationpackage.impl.OrganizationpackagePackageImpl#getEMOComposeRelation()
	 * @generated
	 */
	int EMO_COMPOSE_RELATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_COMPOSE_RELATION__NAME = EMO_RELATIONS__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_COMPOSE_RELATION__ID = EMO_RELATIONS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_COMPOSE_RELATION__CODE = EMO_RELATIONS__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_COMPOSE_RELATION__DESCRIPTION = EMO_RELATIONS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_COMPOSE_RELATION__OID = EMO_RELATIONS__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_COMPOSE_RELATION__SOURCE_OBJ_SOURCE_RELATION = EMO_RELATIONS__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_COMPOSE_RELATION__TARGET_OBJ_TARGET_RELATION = EMO_RELATIONS__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_COMPOSE_RELATION__NUMBER = EMO_RELATIONS__NUMBER;

	/**
	 * The feature id for the '<em><b>Target Group Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_COMPOSE_RELATION__TARGET_GROUP_TYPE = EMO_RELATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Group Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_COMPOSE_RELATION__SOURCE_GROUP_TYPE = EMO_RELATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emo Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_COMPOSE_RELATION__EMO_DIAGRAM = EMO_RELATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EMO Compose Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_COMPOSE_RELATION_FEATURE_COUNT = EMO_RELATIONS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link vpml.organizationpackage.impl.EMODiagramImpl <em>EMO Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.organizationpackage.impl.EMODiagramImpl
	 * @see vpml.organizationpackage.impl.OrganizationpackagePackageImpl#getEMODiagram()
	 * @generated
	 */
	int EMO_DIAGRAM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__NAME = VpmlPackage.EM_DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__ID = VpmlPackage.EM_DIAGRAM__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__CODE = VpmlPackage.EM_DIAGRAM__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__DESCRIPTION = VpmlPackage.EM_DIAGRAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__OID = VpmlPackage.EM_DIAGRAM__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__SOURCE_OBJ_SOURCE_RELATION = VpmlPackage.EM_DIAGRAM__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__TARGET_OBJ_TARGET_RELATION = VpmlPackage.EM_DIAGRAM__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Creater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__CREATER = VpmlPackage.EM_DIAGRAM__CREATER;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__CREATED_DATE = VpmlPackage.EM_DIAGRAM__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Last Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__LAST_MODIFIER = VpmlPackage.EM_DIAGRAM__LAST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__LAST_MODIFIED_DATE = VpmlPackage.EM_DIAGRAM__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Emp Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__EMP_DIAGRAMS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emr Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__EMR_DIAGRAMS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__ROLES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resource Group Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__RESOURCE_GROUP_TYPES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Association Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__ASSOCIATION_RELATIONS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Compose Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM__COMPOSE_RELATIONS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EMO Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMO_DIAGRAM_FEATURE_COUNT = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link vpml.organizationpackage.EMOResourceGroupType <em>EMO Resource Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMO Resource Group Type</em>'.
	 * @see vpml.organizationpackage.EMOResourceGroupType
	 * @generated
	 */
	EClass getEMOResourceGroupType();

	/**
	 * Returns the meta object for the attribute '{@link vpml.organizationpackage.EMOResourceGroupType#getOrganiztionType <em>Organiztion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organiztion Type</em>'.
	 * @see vpml.organizationpackage.EMOResourceGroupType#getOrganiztionType()
	 * @see #getEMOResourceGroupType()
	 * @generated
	 */
	EAttribute getEMOResourceGroupType_OrganiztionType();

	/**
	 * Returns the meta object for the containment reference '{@link vpml.organizationpackage.EMOResourceGroupType#getSuperOrganization <em>Super Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Super Organization</em>'.
	 * @see vpml.organizationpackage.EMOResourceGroupType#getSuperOrganization()
	 * @see #getEMOResourceGroupType()
	 * @generated
	 */
	EReference getEMOResourceGroupType_SuperOrganization();

	/**
	 * Returns the meta object for the attribute '{@link vpml.organizationpackage.EMOResourceGroupType#getPrincipal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Principal</em>'.
	 * @see vpml.organizationpackage.EMOResourceGroupType#getPrincipal()
	 * @see #getEMOResourceGroupType()
	 * @generated
	 */
	EAttribute getEMOResourceGroupType_Principal();

	/**
	 * Returns the meta object for the attribute '{@link vpml.organizationpackage.EMOResourceGroupType#getArrangeNumber <em>Arrange Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrange Number</em>'.
	 * @see vpml.organizationpackage.EMOResourceGroupType#getArrangeNumber()
	 * @see #getEMOResourceGroupType()
	 * @generated
	 */
	EAttribute getEMOResourceGroupType_ArrangeNumber();

	/**
	 * Returns the meta object for the attribute '{@link vpml.organizationpackage.EMOResourceGroupType#getReserved <em>Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved</em>'.
	 * @see vpml.organizationpackage.EMOResourceGroupType#getReserved()
	 * @see #getEMOResourceGroupType()
	 * @generated
	 */
	EAttribute getEMOResourceGroupType_Reserved();

	/**
	 * Returns the meta object for the reference list '{@link vpml.organizationpackage.EMOResourceGroupType#getSourceAssociationRelations <em>Source Association Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Association Relations</em>'.
	 * @see vpml.organizationpackage.EMOResourceGroupType#getSourceAssociationRelations()
	 * @see #getEMOResourceGroupType()
	 * @generated
	 */
	EReference getEMOResourceGroupType_SourceAssociationRelations();

	/**
	 * Returns the meta object for the reference '{@link vpml.organizationpackage.EMOResourceGroupType#getTargetComposeRelation <em>Target Compose Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Compose Relation</em>'.
	 * @see vpml.organizationpackage.EMOResourceGroupType#getTargetComposeRelation()
	 * @see #getEMOResourceGroupType()
	 * @generated
	 */
	EReference getEMOResourceGroupType_TargetComposeRelation();

	/**
	 * Returns the meta object for the reference list '{@link vpml.organizationpackage.EMOResourceGroupType#getSourceComposeRelations <em>Source Compose Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Compose Relations</em>'.
	 * @see vpml.organizationpackage.EMOResourceGroupType#getSourceComposeRelations()
	 * @see #getEMOResourceGroupType()
	 * @generated
	 */
	EReference getEMOResourceGroupType_SourceComposeRelations();

	/**
	 * Returns the meta object for the reference list '{@link vpml.organizationpackage.EMOResourceGroupType#getTargetAssociationRelations <em>Target Association Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Association Relations</em>'.
	 * @see vpml.organizationpackage.EMOResourceGroupType#getTargetAssociationRelations()
	 * @see #getEMOResourceGroupType()
	 * @generated
	 */
	EReference getEMOResourceGroupType_TargetAssociationRelations();

	/**
	 * Returns the meta object for the container reference '{@link vpml.organizationpackage.EMOResourceGroupType#getEmoDiagram <em>Emo Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emo Diagram</em>'.
	 * @see vpml.organizationpackage.EMOResourceGroupType#getEmoDiagram()
	 * @see #getEMOResourceGroupType()
	 * @generated
	 */
	EReference getEMOResourceGroupType_EmoDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.organizationpackage.EMOResourceGroupType#getBasicResourceTypes <em>Basic Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Basic Resource Types</em>'.
	 * @see vpml.organizationpackage.EMOResourceGroupType#getBasicResourceTypes()
	 * @see #getEMOResourceGroupType()
	 * @generated
	 */
	EReference getEMOResourceGroupType_BasicResourceTypes();

	/**
	 * Returns the meta object for the reference list '{@link vpml.organizationpackage.EMOResourceGroupType#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ass Flows</em>'.
	 * @see vpml.organizationpackage.EMOResourceGroupType#getAssFlows()
	 * @see #getEMOResourceGroupType()
	 * @generated
	 */
	EReference getEMOResourceGroupType_AssFlows();

	/**
	 * Returns the meta object for the container reference '{@link vpml.organizationpackage.EMOResourceGroupType#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.organizationpackage.EMOResourceGroupType#getEmpDiagram()
	 * @see #getEMOResourceGroupType()
	 * @generated
	 */
	EReference getEMOResourceGroupType_EmpDiagram();

	/**
	 * Returns the meta object for the container reference '{@link vpml.organizationpackage.EMOResourceGroupType#getColEMOGroupDiagram <em>Col EMO Group Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Col EMO Group Diagram</em>'.
	 * @see vpml.organizationpackage.EMOResourceGroupType#getColEMOGroupDiagram()
	 * @see #getEMOResourceGroupType()
	 * @generated
	 */
	EReference getEMOResourceGroupType_ColEMOGroupDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.organizationpackage.EMORelations <em>EMO Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMO Relations</em>'.
	 * @see vpml.organizationpackage.EMORelations
	 * @generated
	 */
	EClass getEMORelations();

	/**
	 * Returns the meta object for the attribute '{@link vpml.organizationpackage.EMORelations#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see vpml.organizationpackage.EMORelations#getNumber()
	 * @see #getEMORelations()
	 * @generated
	 */
	EAttribute getEMORelations_Number();

	/**
	 * Returns the meta object for class '{@link vpml.organizationpackage.EMOAssociationRelation <em>EMO Association Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMO Association Relation</em>'.
	 * @see vpml.organizationpackage.EMOAssociationRelation
	 * @generated
	 */
	EClass getEMOAssociationRelation();

	/**
	 * Returns the meta object for the reference '{@link vpml.organizationpackage.EMOAssociationRelation#getSourceGroupType <em>Source Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Group Type</em>'.
	 * @see vpml.organizationpackage.EMOAssociationRelation#getSourceGroupType()
	 * @see #getEMOAssociationRelation()
	 * @generated
	 */
	EReference getEMOAssociationRelation_SourceGroupType();

	/**
	 * Returns the meta object for the reference '{@link vpml.organizationpackage.EMOAssociationRelation#getTargetRole <em>Target Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Role</em>'.
	 * @see vpml.organizationpackage.EMOAssociationRelation#getTargetRole()
	 * @see #getEMOAssociationRelation()
	 * @generated
	 */
	EReference getEMOAssociationRelation_TargetRole();

	/**
	 * Returns the meta object for the reference '{@link vpml.organizationpackage.EMOAssociationRelation#getSourceRole <em>Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Role</em>'.
	 * @see vpml.organizationpackage.EMOAssociationRelation#getSourceRole()
	 * @see #getEMOAssociationRelation()
	 * @generated
	 */
	EReference getEMOAssociationRelation_SourceRole();

	/**
	 * Returns the meta object for the reference '{@link vpml.organizationpackage.EMOAssociationRelation#getTargetGroupType <em>Target Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Group Type</em>'.
	 * @see vpml.organizationpackage.EMOAssociationRelation#getTargetGroupType()
	 * @see #getEMOAssociationRelation()
	 * @generated
	 */
	EReference getEMOAssociationRelation_TargetGroupType();

	/**
	 * Returns the meta object for the container reference '{@link vpml.organizationpackage.EMOAssociationRelation#getEmoDiagram <em>Emo Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emo Diagram</em>'.
	 * @see vpml.organizationpackage.EMOAssociationRelation#getEmoDiagram()
	 * @see #getEMOAssociationRelation()
	 * @generated
	 */
	EReference getEMOAssociationRelation_EmoDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.organizationpackage.EMOComposeRelation <em>EMO Compose Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMO Compose Relation</em>'.
	 * @see vpml.organizationpackage.EMOComposeRelation
	 * @generated
	 */
	EClass getEMOComposeRelation();

	/**
	 * Returns the meta object for the reference '{@link vpml.organizationpackage.EMOComposeRelation#getTargetGroupType <em>Target Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Group Type</em>'.
	 * @see vpml.organizationpackage.EMOComposeRelation#getTargetGroupType()
	 * @see #getEMOComposeRelation()
	 * @generated
	 */
	EReference getEMOComposeRelation_TargetGroupType();

	/**
	 * Returns the meta object for the reference '{@link vpml.organizationpackage.EMOComposeRelation#getSourceGroupType <em>Source Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Group Type</em>'.
	 * @see vpml.organizationpackage.EMOComposeRelation#getSourceGroupType()
	 * @see #getEMOComposeRelation()
	 * @generated
	 */
	EReference getEMOComposeRelation_SourceGroupType();

	/**
	 * Returns the meta object for the container reference '{@link vpml.organizationpackage.EMOComposeRelation#getEmoDiagram <em>Emo Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emo Diagram</em>'.
	 * @see vpml.organizationpackage.EMOComposeRelation#getEmoDiagram()
	 * @see #getEMOComposeRelation()
	 * @generated
	 */
	EReference getEMOComposeRelation_EmoDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.organizationpackage.EMODiagram <em>EMO Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMO Diagram</em>'.
	 * @see vpml.organizationpackage.EMODiagram
	 * @generated
	 */
	EClass getEMODiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.organizationpackage.EMODiagram#getEmpDiagrams <em>Emp Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emp Diagrams</em>'.
	 * @see vpml.organizationpackage.EMODiagram#getEmpDiagrams()
	 * @see #getEMODiagram()
	 * @generated
	 */
	EReference getEMODiagram_EmpDiagrams();

	/**
	 * Returns the meta object for the reference list '{@link vpml.organizationpackage.EMODiagram#getEmrDiagrams <em>Emr Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emr Diagrams</em>'.
	 * @see vpml.organizationpackage.EMODiagram#getEmrDiagrams()
	 * @see #getEMODiagram()
	 * @generated
	 */
	EReference getEMODiagram_EmrDiagrams();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.organizationpackage.EMODiagram#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see vpml.organizationpackage.EMODiagram#getRoles()
	 * @see #getEMODiagram()
	 * @generated
	 */
	EReference getEMODiagram_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.organizationpackage.EMODiagram#getResourceGroupTypes <em>Resource Group Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Group Types</em>'.
	 * @see vpml.organizationpackage.EMODiagram#getResourceGroupTypes()
	 * @see #getEMODiagram()
	 * @generated
	 */
	EReference getEMODiagram_ResourceGroupTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.organizationpackage.EMODiagram#getAssociationRelations <em>Association Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association Relations</em>'.
	 * @see vpml.organizationpackage.EMODiagram#getAssociationRelations()
	 * @see #getEMODiagram()
	 * @generated
	 */
	EReference getEMODiagram_AssociationRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.organizationpackage.EMODiagram#getComposeRelations <em>Compose Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compose Relations</em>'.
	 * @see vpml.organizationpackage.EMODiagram#getComposeRelations()
	 * @see #getEMODiagram()
	 * @generated
	 */
	EReference getEMODiagram_ComposeRelations();

	/**
	 * Returns the meta object for class '{@link vpml.organizationpackage.EMOObject <em>EMO Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMO Object</em>'.
	 * @see vpml.organizationpackage.EMOObject
	 * @generated
	 */
	EClass getEMOObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrganizationpackageFactory getOrganizationpackageFactory();

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
		 * The meta object literal for the '{@link vpml.organizationpackage.impl.EMOResourceGroupTypeImpl <em>EMO Resource Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.organizationpackage.impl.EMOResourceGroupTypeImpl
		 * @see vpml.organizationpackage.impl.OrganizationpackagePackageImpl#getEMOResourceGroupType()
		 * @generated
		 */
		EClass EMO_RESOURCE_GROUP_TYPE = eINSTANCE.getEMOResourceGroupType();

		/**
		 * The meta object literal for the '<em><b>Organiztion Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMO_RESOURCE_GROUP_TYPE__ORGANIZTION_TYPE = eINSTANCE.getEMOResourceGroupType_OrganiztionType();

		/**
		 * The meta object literal for the '<em><b>Super Organization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_RESOURCE_GROUP_TYPE__SUPER_ORGANIZATION = eINSTANCE.getEMOResourceGroupType_SuperOrganization();

		/**
		 * The meta object literal for the '<em><b>Principal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMO_RESOURCE_GROUP_TYPE__PRINCIPAL = eINSTANCE.getEMOResourceGroupType_Principal();

		/**
		 * The meta object literal for the '<em><b>Arrange Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMO_RESOURCE_GROUP_TYPE__ARRANGE_NUMBER = eINSTANCE.getEMOResourceGroupType_ArrangeNumber();

		/**
		 * The meta object literal for the '<em><b>Reserved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMO_RESOURCE_GROUP_TYPE__RESERVED = eINSTANCE.getEMOResourceGroupType_Reserved();

		/**
		 * The meta object literal for the '<em><b>Source Association Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_RESOURCE_GROUP_TYPE__SOURCE_ASSOCIATION_RELATIONS = eINSTANCE.getEMOResourceGroupType_SourceAssociationRelations();

		/**
		 * The meta object literal for the '<em><b>Target Compose Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_RESOURCE_GROUP_TYPE__TARGET_COMPOSE_RELATION = eINSTANCE.getEMOResourceGroupType_TargetComposeRelation();

		/**
		 * The meta object literal for the '<em><b>Source Compose Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_RESOURCE_GROUP_TYPE__SOURCE_COMPOSE_RELATIONS = eINSTANCE.getEMOResourceGroupType_SourceComposeRelations();

		/**
		 * The meta object literal for the '<em><b>Target Association Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_RESOURCE_GROUP_TYPE__TARGET_ASSOCIATION_RELATIONS = eINSTANCE.getEMOResourceGroupType_TargetAssociationRelations();

		/**
		 * The meta object literal for the '<em><b>Emo Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_RESOURCE_GROUP_TYPE__EMO_DIAGRAM = eINSTANCE.getEMOResourceGroupType_EmoDiagram();

		/**
		 * The meta object literal for the '<em><b>Basic Resource Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_RESOURCE_GROUP_TYPE__BASIC_RESOURCE_TYPES = eINSTANCE.getEMOResourceGroupType_BasicResourceTypes();

		/**
		 * The meta object literal for the '<em><b>Ass Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_RESOURCE_GROUP_TYPE__ASS_FLOWS = eINSTANCE.getEMOResourceGroupType_AssFlows();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_RESOURCE_GROUP_TYPE__EMP_DIAGRAM = eINSTANCE.getEMOResourceGroupType_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Col EMO Group Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_RESOURCE_GROUP_TYPE__COL_EMO_GROUP_DIAGRAM = eINSTANCE.getEMOResourceGroupType_ColEMOGroupDiagram();

		/**
		 * The meta object literal for the '{@link vpml.organizationpackage.impl.EMORelationsImpl <em>EMO Relations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.organizationpackage.impl.EMORelationsImpl
		 * @see vpml.organizationpackage.impl.OrganizationpackagePackageImpl#getEMORelations()
		 * @generated
		 */
		EClass EMO_RELATIONS = eINSTANCE.getEMORelations();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMO_RELATIONS__NUMBER = eINSTANCE.getEMORelations_Number();

		/**
		 * The meta object literal for the '{@link vpml.organizationpackage.impl.EMOAssociationRelationImpl <em>EMO Association Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.organizationpackage.impl.EMOAssociationRelationImpl
		 * @see vpml.organizationpackage.impl.OrganizationpackagePackageImpl#getEMOAssociationRelation()
		 * @generated
		 */
		EClass EMO_ASSOCIATION_RELATION = eINSTANCE.getEMOAssociationRelation();

		/**
		 * The meta object literal for the '<em><b>Source Group Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_ASSOCIATION_RELATION__SOURCE_GROUP_TYPE = eINSTANCE.getEMOAssociationRelation_SourceGroupType();

		/**
		 * The meta object literal for the '<em><b>Target Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_ASSOCIATION_RELATION__TARGET_ROLE = eINSTANCE.getEMOAssociationRelation_TargetRole();

		/**
		 * The meta object literal for the '<em><b>Source Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_ASSOCIATION_RELATION__SOURCE_ROLE = eINSTANCE.getEMOAssociationRelation_SourceRole();

		/**
		 * The meta object literal for the '<em><b>Target Group Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_ASSOCIATION_RELATION__TARGET_GROUP_TYPE = eINSTANCE.getEMOAssociationRelation_TargetGroupType();

		/**
		 * The meta object literal for the '<em><b>Emo Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_ASSOCIATION_RELATION__EMO_DIAGRAM = eINSTANCE.getEMOAssociationRelation_EmoDiagram();

		/**
		 * The meta object literal for the '{@link vpml.organizationpackage.impl.EMOComposeRelationImpl <em>EMO Compose Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.organizationpackage.impl.EMOComposeRelationImpl
		 * @see vpml.organizationpackage.impl.OrganizationpackagePackageImpl#getEMOComposeRelation()
		 * @generated
		 */
		EClass EMO_COMPOSE_RELATION = eINSTANCE.getEMOComposeRelation();

		/**
		 * The meta object literal for the '<em><b>Target Group Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_COMPOSE_RELATION__TARGET_GROUP_TYPE = eINSTANCE.getEMOComposeRelation_TargetGroupType();

		/**
		 * The meta object literal for the '<em><b>Source Group Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_COMPOSE_RELATION__SOURCE_GROUP_TYPE = eINSTANCE.getEMOComposeRelation_SourceGroupType();

		/**
		 * The meta object literal for the '<em><b>Emo Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_COMPOSE_RELATION__EMO_DIAGRAM = eINSTANCE.getEMOComposeRelation_EmoDiagram();

		/**
		 * The meta object literal for the '{@link vpml.organizationpackage.impl.EMODiagramImpl <em>EMO Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.organizationpackage.impl.EMODiagramImpl
		 * @see vpml.organizationpackage.impl.OrganizationpackagePackageImpl#getEMODiagram()
		 * @generated
		 */
		EClass EMO_DIAGRAM = eINSTANCE.getEMODiagram();

		/**
		 * The meta object literal for the '<em><b>Emp Diagrams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_DIAGRAM__EMP_DIAGRAMS = eINSTANCE.getEMODiagram_EmpDiagrams();

		/**
		 * The meta object literal for the '<em><b>Emr Diagrams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_DIAGRAM__EMR_DIAGRAMS = eINSTANCE.getEMODiagram_EmrDiagrams();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_DIAGRAM__ROLES = eINSTANCE.getEMODiagram_Roles();

		/**
		 * The meta object literal for the '<em><b>Resource Group Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_DIAGRAM__RESOURCE_GROUP_TYPES = eINSTANCE.getEMODiagram_ResourceGroupTypes();

		/**
		 * The meta object literal for the '<em><b>Association Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_DIAGRAM__ASSOCIATION_RELATIONS = eINSTANCE.getEMODiagram_AssociationRelations();

		/**
		 * The meta object literal for the '<em><b>Compose Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMO_DIAGRAM__COMPOSE_RELATIONS = eINSTANCE.getEMODiagram_ComposeRelations();

		/**
		 * The meta object literal for the '{@link vpml.organizationpackage.impl.EMOObjectImpl <em>EMO Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.organizationpackage.impl.EMOObjectImpl
		 * @see vpml.organizationpackage.impl.OrganizationpackagePackageImpl#getEMOObject()
		 * @generated
		 */
		EClass EMO_OBJECT = eINSTANCE.getEMOObject();

	}

} //OrganizationpackagePackage
