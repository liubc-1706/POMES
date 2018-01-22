/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;

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
 * @see vpml.infopackage.InfopackageFactory
 * @model kind="package"
 * @generated
 */
public interface InfopackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "infopackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///vpml/infopackage.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vpml.infopackage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfopackagePackage eINSTANCE = vpml.infopackage.impl.InfopackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIObjectImpl <em>EMI Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIObjectImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIObject()
	 * @generated
	 */
	int EMI_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OBJECT__NAME = VpmlPackage.EM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OBJECT__ID = VpmlPackage.EM_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OBJECT__CODE = VpmlPackage.EM_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OBJECT__DESCRIPTION = VpmlPackage.EM_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OBJECT__OID = VpmlPackage.EM_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OBJECT__SOURCE_OBJ_SOURCE_RELATION = VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OBJECT__TARGET_OBJ_TARGET_RELATION = VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The number of structural features of the '<em>EMI Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OBJECT_FEATURE_COUNT = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMINodeImpl <em>EMI Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMINodeImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMINode()
	 * @generated
	 */
	int EMI_NODE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_NODE__NAME = EMI_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_NODE__ID = EMI_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_NODE__CODE = EMI_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_NODE__DESCRIPTION = EMI_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_NODE__OID = EMI_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_NODE__SOURCE_OBJ_SOURCE_RELATION = EMI_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_NODE__TARGET_OBJ_TARGET_RELATION = EMI_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_NODE__TARGET_FLOW = EMI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_NODE__SOURCE_FLOW = EMI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMI Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_NODE_FEATURE_COUNT = EMI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIProductImpl <em>EMI Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIProductImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIProduct()
	 * @generated
	 */
	int EMI_PRODUCT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT__NAME = EMI_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT__ID = EMI_NODE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT__CODE = EMI_NODE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT__DESCRIPTION = EMI_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT__OID = EMI_NODE__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT__SOURCE_OBJ_SOURCE_RELATION = EMI_NODE__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT__TARGET_OBJ_TARGET_RELATION = EMI_NODE__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT__TARGET_FLOW = EMI_NODE__TARGET_FLOW;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT__SOURCE_FLOW = EMI_NODE__SOURCE_FLOW;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT__PROCEDURE = EMI_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT_FEATURE_COUNT = EMI_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMILeafProductImpl <em>EMI Leaf Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMILeafProductImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMILeafProduct()
	 * @generated
	 */
	int EMI_LEAF_PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__NAME = EMI_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__ID = EMI_PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__CODE = EMI_PRODUCT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__DESCRIPTION = EMI_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__OID = EMI_PRODUCT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__SOURCE_OBJ_SOURCE_RELATION = EMI_PRODUCT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__TARGET_OBJ_TARGET_RELATION = EMI_PRODUCT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__TARGET_FLOW = EMI_PRODUCT__TARGET_FLOW;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__SOURCE_FLOW = EMI_PRODUCT__SOURCE_FLOW;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__PROCEDURE = EMI_PRODUCT__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__PRODUCT_ID = EMI_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__ATTACHMENT = EMI_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Iotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__IOTYPE = EMI_PRODUCT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__INTERVAL = EMI_PRODUCT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__UNIT = EMI_PRODUCT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Init List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__INIT_LIST = EMI_PRODUCT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__COST = EMI_PRODUCT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__DURATION_TIME = EMI_PRODUCT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__DATABASE = EMI_PRODUCT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Db Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__DB_TABLE = EMI_PRODUCT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Db Table Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT__DB_TABLE_ITEM = EMI_PRODUCT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>EMI Leaf Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LEAF_PRODUCT_FEATURE_COUNT = EMI_PRODUCT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIDocumentImpl <em>EMI Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIDocumentImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIDocument()
	 * @generated
	 */
	int EMI_DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__NAME = EMI_LEAF_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__ID = EMI_LEAF_PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__CODE = EMI_LEAF_PRODUCT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__DESCRIPTION = EMI_LEAF_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__OID = EMI_LEAF_PRODUCT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__SOURCE_OBJ_SOURCE_RELATION = EMI_LEAF_PRODUCT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__TARGET_OBJ_TARGET_RELATION = EMI_LEAF_PRODUCT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__TARGET_FLOW = EMI_LEAF_PRODUCT__TARGET_FLOW;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__SOURCE_FLOW = EMI_LEAF_PRODUCT__SOURCE_FLOW;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__PROCEDURE = EMI_LEAF_PRODUCT__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__PRODUCT_ID = EMI_LEAF_PRODUCT__PRODUCT_ID;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__ATTACHMENT = EMI_LEAF_PRODUCT__ATTACHMENT;

	/**
	 * The feature id for the '<em><b>Iotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__IOTYPE = EMI_LEAF_PRODUCT__IOTYPE;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__INTERVAL = EMI_LEAF_PRODUCT__INTERVAL;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__UNIT = EMI_LEAF_PRODUCT__UNIT;

	/**
	 * The feature id for the '<em><b>Init List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__INIT_LIST = EMI_LEAF_PRODUCT__INIT_LIST;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__COST = EMI_LEAF_PRODUCT__COST;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__DURATION_TIME = EMI_LEAF_PRODUCT__DURATION_TIME;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__DATABASE = EMI_LEAF_PRODUCT__DATABASE;

	/**
	 * The feature id for the '<em><b>Db Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__DB_TABLE = EMI_LEAF_PRODUCT__DB_TABLE;

	/**
	 * The feature id for the '<em><b>Db Table Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__DB_TABLE_ITEM = EMI_LEAF_PRODUCT__DB_TABLE_ITEM;

	/**
	 * The feature id for the '<em><b>Document Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT__DOCUMENT_DIAGRAM = EMI_LEAF_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DOCUMENT_FEATURE_COUNT = EMI_LEAF_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIArtifactImpl <em>EMI Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIArtifactImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIArtifact()
	 * @generated
	 */
	int EMI_ARTIFACT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__NAME = EMI_LEAF_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__ID = EMI_LEAF_PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__CODE = EMI_LEAF_PRODUCT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__DESCRIPTION = EMI_LEAF_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__OID = EMI_LEAF_PRODUCT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__SOURCE_OBJ_SOURCE_RELATION = EMI_LEAF_PRODUCT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__TARGET_OBJ_TARGET_RELATION = EMI_LEAF_PRODUCT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__TARGET_FLOW = EMI_LEAF_PRODUCT__TARGET_FLOW;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__SOURCE_FLOW = EMI_LEAF_PRODUCT__SOURCE_FLOW;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__PROCEDURE = EMI_LEAF_PRODUCT__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__PRODUCT_ID = EMI_LEAF_PRODUCT__PRODUCT_ID;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__ATTACHMENT = EMI_LEAF_PRODUCT__ATTACHMENT;

	/**
	 * The feature id for the '<em><b>Iotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__IOTYPE = EMI_LEAF_PRODUCT__IOTYPE;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__INTERVAL = EMI_LEAF_PRODUCT__INTERVAL;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__UNIT = EMI_LEAF_PRODUCT__UNIT;

	/**
	 * The feature id for the '<em><b>Init List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__INIT_LIST = EMI_LEAF_PRODUCT__INIT_LIST;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__COST = EMI_LEAF_PRODUCT__COST;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__DURATION_TIME = EMI_LEAF_PRODUCT__DURATION_TIME;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__DATABASE = EMI_LEAF_PRODUCT__DATABASE;

	/**
	 * The feature id for the '<em><b>Db Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__DB_TABLE = EMI_LEAF_PRODUCT__DB_TABLE;

	/**
	 * The feature id for the '<em><b>Db Table Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__DB_TABLE_ITEM = EMI_LEAF_PRODUCT__DB_TABLE_ITEM;

	/**
	 * The feature id for the '<em><b>Artifact Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT__ARTIFACT_DIAGRAM = EMI_LEAF_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ARTIFACT_FEATURE_COUNT = EMI_LEAF_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIOtherImpl <em>EMI Other</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIOtherImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIOther()
	 * @generated
	 */
	int EMI_OTHER = 4;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIProductPackageImpl <em>EMI Product Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIProductPackageImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIProductPackage()
	 * @generated
	 */
	int EMI_PRODUCT_PACKAGE = 5;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMILogicalConnectorImpl <em>EMI Logical Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMILogicalConnectorImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMILogicalConnector()
	 * @generated
	 */
	int EMI_LOGICAL_CONNECTOR = 7;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIComInfoImpl <em>EMI Com Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIComInfoImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIComInfo()
	 * @generated
	 */
	int EMI_COM_INFO = 8;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIFlowImpl <em>EMI Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIFlowImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIFlow()
	 * @generated
	 */
	int EMI_FLOW = 10;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIRefFlowImpl <em>EMI Ref Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIRefFlowImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIRefFlow()
	 * @generated
	 */
	int EMI_REF_FLOW = 12;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIDataFlowImpl <em>EMI Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIDataFlowImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIDataFlow()
	 * @generated
	 */
	int EMI_DATA_FLOW = 13;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIInConnectorImpl <em>EMI In Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIInConnectorImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIInConnector()
	 * @generated
	 */
	int EMI_IN_CONNECTOR = 14;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIOutConnectorImpl <em>EMI Out Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIOutConnectorImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIOutConnector()
	 * @generated
	 */
	int EMI_OUT_CONNECTOR = 15;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIStateConnectorImpl <em>EMI State Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIStateConnectorImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIStateConnector()
	 * @generated
	 */
	int EMI_STATE_CONNECTOR = 16;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIInOrImpl <em>EMI In Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIInOrImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIInOr()
	 * @generated
	 */
	int EMI_IN_OR = 17;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIInAndImpl <em>EMI In And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIInAndImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIInAnd()
	 * @generated
	 */
	int EMI_IN_AND = 18;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIOutAndImpl <em>EMI Out And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIOutAndImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIOutAnd()
	 * @generated
	 */
	int EMI_OUT_AND = 19;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIOutOrImpl <em>EMI Out Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIOutOrImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIOutOr()
	 * @generated
	 */
	int EMI_OUT_OR = 20;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIDiagramImpl <em>EMI Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIDiagramImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIDiagram()
	 * @generated
	 */
	int EMI_DIAGRAM = 21;

	/**
	 * The meta object id for the '{@link vpml.infopackage.impl.EMIMessageImpl <em>EMI Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.infopackage.impl.EMIMessageImpl
	 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIMessage()
	 * @generated
	 */
	int EMI_MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__NAME = EMI_LEAF_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__ID = EMI_LEAF_PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__CODE = EMI_LEAF_PRODUCT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__DESCRIPTION = EMI_LEAF_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__OID = EMI_LEAF_PRODUCT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__SOURCE_OBJ_SOURCE_RELATION = EMI_LEAF_PRODUCT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__TARGET_OBJ_TARGET_RELATION = EMI_LEAF_PRODUCT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__TARGET_FLOW = EMI_LEAF_PRODUCT__TARGET_FLOW;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__SOURCE_FLOW = EMI_LEAF_PRODUCT__SOURCE_FLOW;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__PROCEDURE = EMI_LEAF_PRODUCT__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__PRODUCT_ID = EMI_LEAF_PRODUCT__PRODUCT_ID;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__ATTACHMENT = EMI_LEAF_PRODUCT__ATTACHMENT;

	/**
	 * The feature id for the '<em><b>Iotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__IOTYPE = EMI_LEAF_PRODUCT__IOTYPE;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__INTERVAL = EMI_LEAF_PRODUCT__INTERVAL;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__UNIT = EMI_LEAF_PRODUCT__UNIT;

	/**
	 * The feature id for the '<em><b>Init List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__INIT_LIST = EMI_LEAF_PRODUCT__INIT_LIST;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__COST = EMI_LEAF_PRODUCT__COST;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__DURATION_TIME = EMI_LEAF_PRODUCT__DURATION_TIME;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__DATABASE = EMI_LEAF_PRODUCT__DATABASE;

	/**
	 * The feature id for the '<em><b>Db Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__DB_TABLE = EMI_LEAF_PRODUCT__DB_TABLE;

	/**
	 * The feature id for the '<em><b>Db Table Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__DB_TABLE_ITEM = EMI_LEAF_PRODUCT__DB_TABLE_ITEM;

	/**
	 * The feature id for the '<em><b>Message Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE__MESSAGE_DIAGRAM = EMI_LEAF_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_MESSAGE_FEATURE_COUNT = EMI_LEAF_PRODUCT_FEATURE_COUNT + 1;


	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__NAME = EMI_LEAF_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__ID = EMI_LEAF_PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__CODE = EMI_LEAF_PRODUCT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__DESCRIPTION = EMI_LEAF_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__OID = EMI_LEAF_PRODUCT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__SOURCE_OBJ_SOURCE_RELATION = EMI_LEAF_PRODUCT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__TARGET_OBJ_TARGET_RELATION = EMI_LEAF_PRODUCT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__TARGET_FLOW = EMI_LEAF_PRODUCT__TARGET_FLOW;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__SOURCE_FLOW = EMI_LEAF_PRODUCT__SOURCE_FLOW;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__PROCEDURE = EMI_LEAF_PRODUCT__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__PRODUCT_ID = EMI_LEAF_PRODUCT__PRODUCT_ID;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__ATTACHMENT = EMI_LEAF_PRODUCT__ATTACHMENT;

	/**
	 * The feature id for the '<em><b>Iotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__IOTYPE = EMI_LEAF_PRODUCT__IOTYPE;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__INTERVAL = EMI_LEAF_PRODUCT__INTERVAL;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__UNIT = EMI_LEAF_PRODUCT__UNIT;

	/**
	 * The feature id for the '<em><b>Init List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__INIT_LIST = EMI_LEAF_PRODUCT__INIT_LIST;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__COST = EMI_LEAF_PRODUCT__COST;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__DURATION_TIME = EMI_LEAF_PRODUCT__DURATION_TIME;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__DATABASE = EMI_LEAF_PRODUCT__DATABASE;

	/**
	 * The feature id for the '<em><b>Db Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__DB_TABLE = EMI_LEAF_PRODUCT__DB_TABLE;

	/**
	 * The feature id for the '<em><b>Db Table Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__DB_TABLE_ITEM = EMI_LEAF_PRODUCT__DB_TABLE_ITEM;

	/**
	 * The feature id for the '<em><b>Other Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER__OTHER_DIAGRAM = EMI_LEAF_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI Other</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OTHER_FEATURE_COUNT = EMI_LEAF_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT_PACKAGE__NAME = EMI_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT_PACKAGE__ID = EMI_PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT_PACKAGE__CODE = EMI_PRODUCT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT_PACKAGE__DESCRIPTION = EMI_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT_PACKAGE__OID = EMI_PRODUCT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT_PACKAGE__SOURCE_OBJ_SOURCE_RELATION = EMI_PRODUCT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT_PACKAGE__TARGET_OBJ_TARGET_RELATION = EMI_PRODUCT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT_PACKAGE__TARGET_FLOW = EMI_PRODUCT__TARGET_FLOW;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT_PACKAGE__SOURCE_FLOW = EMI_PRODUCT__SOURCE_FLOW;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT_PACKAGE__PROCEDURE = EMI_PRODUCT__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Product List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT_PACKAGE__PRODUCT_LIST = EMI_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT_PACKAGE__SUB_PACKAGES = EMI_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Top Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT_PACKAGE__TOP_PACKAGE = EMI_PRODUCT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Package Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT_PACKAGE__PRODUCT_PACKAGE_DIAGRAM = EMI_PRODUCT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EMI Product Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_PRODUCT_PACKAGE_FEATURE_COUNT = EMI_PRODUCT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LOGICAL_CONNECTOR__NAME = EMI_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LOGICAL_CONNECTOR__ID = EMI_NODE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LOGICAL_CONNECTOR__CODE = EMI_NODE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LOGICAL_CONNECTOR__DESCRIPTION = EMI_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LOGICAL_CONNECTOR__OID = EMI_NODE__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LOGICAL_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION = EMI_NODE__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LOGICAL_CONNECTOR__TARGET_OBJ_TARGET_RELATION = EMI_NODE__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LOGICAL_CONNECTOR__TARGET_FLOW = EMI_NODE__TARGET_FLOW;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LOGICAL_CONNECTOR__SOURCE_FLOW = EMI_NODE__SOURCE_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LOGICAL_CONNECTOR__TYPE = EMI_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI Logical Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LOGICAL_CONNECTOR_FEATURE_COUNT = EMI_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COM_INFO__NAME = EMI_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COM_INFO__ID = EMI_NODE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COM_INFO__CODE = EMI_NODE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COM_INFO__DESCRIPTION = EMI_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COM_INFO__OID = EMI_NODE__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COM_INFO__SOURCE_OBJ_SOURCE_RELATION = EMI_NODE__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COM_INFO__TARGET_OBJ_TARGET_RELATION = EMI_NODE__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COM_INFO__TARGET_FLOW = EMI_NODE__TARGET_FLOW;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COM_INFO__SOURCE_FLOW = EMI_NODE__SOURCE_FLOW;

	/**
	 * The feature id for the '<em><b>Com Info Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COM_INFO__COM_INFO_DIAGRAM = EMI_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI Com Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COM_INFO_FEATURE_COUNT = EMI_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FLOW__NAME = EMI_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FLOW__ID = EMI_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FLOW__CODE = EMI_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FLOW__DESCRIPTION = EMI_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FLOW__OID = EMI_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FLOW__SOURCE_OBJ_SOURCE_RELATION = EMI_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FLOW__TARGET_OBJ_TARGET_RELATION = EMI_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FLOW__DIRECTION = EMI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FLOW__NUMBER = EMI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FLOW__SOURCE_NODE = EMI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FLOW__TARGET_NODE = EMI_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EMI Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FLOW_FEATURE_COUNT = EMI_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_REF_FLOW__NAME = EMI_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_REF_FLOW__ID = EMI_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_REF_FLOW__CODE = EMI_FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_REF_FLOW__DESCRIPTION = EMI_FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_REF_FLOW__OID = EMI_FLOW__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_REF_FLOW__SOURCE_OBJ_SOURCE_RELATION = EMI_FLOW__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_REF_FLOW__TARGET_OBJ_TARGET_RELATION = EMI_FLOW__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_REF_FLOW__DIRECTION = EMI_FLOW__DIRECTION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_REF_FLOW__NUMBER = EMI_FLOW__NUMBER;

	/**
	 * The feature id for the '<em><b>Source Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_REF_FLOW__SOURCE_NODE = EMI_FLOW__SOURCE_NODE;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_REF_FLOW__TARGET_NODE = EMI_FLOW__TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Ref Flow Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_REF_FLOW__REF_FLOW_DIAGRAM = EMI_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI Ref Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_REF_FLOW_FEATURE_COUNT = EMI_FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DATA_FLOW__NAME = EMI_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DATA_FLOW__ID = EMI_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DATA_FLOW__CODE = EMI_FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DATA_FLOW__DESCRIPTION = EMI_FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DATA_FLOW__OID = EMI_FLOW__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DATA_FLOW__SOURCE_OBJ_SOURCE_RELATION = EMI_FLOW__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DATA_FLOW__TARGET_OBJ_TARGET_RELATION = EMI_FLOW__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DATA_FLOW__DIRECTION = EMI_FLOW__DIRECTION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DATA_FLOW__NUMBER = EMI_FLOW__NUMBER;

	/**
	 * The feature id for the '<em><b>Source Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DATA_FLOW__SOURCE_NODE = EMI_FLOW__SOURCE_NODE;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DATA_FLOW__TARGET_NODE = EMI_FLOW__TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Data Flow Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DATA_FLOW__DATA_FLOW_DIAGRAM = EMI_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DATA_FLOW_FEATURE_COUNT = EMI_FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_CONNECTOR__NAME = EMI_LOGICAL_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_CONNECTOR__ID = EMI_LOGICAL_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_CONNECTOR__CODE = EMI_LOGICAL_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_CONNECTOR__DESCRIPTION = EMI_LOGICAL_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_CONNECTOR__OID = EMI_LOGICAL_CONNECTOR__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION = EMI_LOGICAL_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_CONNECTOR__TARGET_OBJ_TARGET_RELATION = EMI_LOGICAL_CONNECTOR__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_CONNECTOR__TARGET_FLOW = EMI_LOGICAL_CONNECTOR__TARGET_FLOW;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_CONNECTOR__SOURCE_FLOW = EMI_LOGICAL_CONNECTOR__SOURCE_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_CONNECTOR__TYPE = EMI_LOGICAL_CONNECTOR__TYPE;

	/**
	 * The number of structural features of the '<em>EMI In Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_CONNECTOR_FEATURE_COUNT = EMI_LOGICAL_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_CONNECTOR__NAME = EMI_LOGICAL_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_CONNECTOR__ID = EMI_LOGICAL_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_CONNECTOR__CODE = EMI_LOGICAL_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_CONNECTOR__DESCRIPTION = EMI_LOGICAL_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_CONNECTOR__OID = EMI_LOGICAL_CONNECTOR__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION = EMI_LOGICAL_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_CONNECTOR__TARGET_OBJ_TARGET_RELATION = EMI_LOGICAL_CONNECTOR__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_CONNECTOR__TARGET_FLOW = EMI_LOGICAL_CONNECTOR__TARGET_FLOW;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_CONNECTOR__SOURCE_FLOW = EMI_LOGICAL_CONNECTOR__SOURCE_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_CONNECTOR__TYPE = EMI_LOGICAL_CONNECTOR__TYPE;

	/**
	 * The number of structural features of the '<em>EMI Out Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_CONNECTOR_FEATURE_COUNT = EMI_LOGICAL_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STATE_CONNECTOR__NAME = EMI_LOGICAL_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STATE_CONNECTOR__ID = EMI_LOGICAL_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STATE_CONNECTOR__CODE = EMI_LOGICAL_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STATE_CONNECTOR__DESCRIPTION = EMI_LOGICAL_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STATE_CONNECTOR__OID = EMI_LOGICAL_CONNECTOR__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STATE_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION = EMI_LOGICAL_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STATE_CONNECTOR__TARGET_OBJ_TARGET_RELATION = EMI_LOGICAL_CONNECTOR__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STATE_CONNECTOR__TARGET_FLOW = EMI_LOGICAL_CONNECTOR__TARGET_FLOW;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STATE_CONNECTOR__SOURCE_FLOW = EMI_LOGICAL_CONNECTOR__SOURCE_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STATE_CONNECTOR__TYPE = EMI_LOGICAL_CONNECTOR__TYPE;

	/**
	 * The feature id for the '<em><b>State Connector Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STATE_CONNECTOR__STATE_CONNECTOR_DIAGRAM = EMI_LOGICAL_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI State Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STATE_CONNECTOR_FEATURE_COUNT = EMI_LOGICAL_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_OR__NAME = EMI_IN_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_OR__ID = EMI_IN_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_OR__CODE = EMI_IN_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_OR__DESCRIPTION = EMI_IN_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_OR__OID = EMI_IN_CONNECTOR__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_OR__SOURCE_OBJ_SOURCE_RELATION = EMI_IN_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_OR__TARGET_OBJ_TARGET_RELATION = EMI_IN_CONNECTOR__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_OR__TARGET_FLOW = EMI_IN_CONNECTOR__TARGET_FLOW;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_OR__SOURCE_FLOW = EMI_IN_CONNECTOR__SOURCE_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_OR__TYPE = EMI_IN_CONNECTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Inor Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_OR__INOR_DIAGRAM = EMI_IN_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI In Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_OR_FEATURE_COUNT = EMI_IN_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_AND__NAME = EMI_IN_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_AND__ID = EMI_IN_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_AND__CODE = EMI_IN_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_AND__DESCRIPTION = EMI_IN_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_AND__OID = EMI_IN_CONNECTOR__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_AND__SOURCE_OBJ_SOURCE_RELATION = EMI_IN_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_AND__TARGET_OBJ_TARGET_RELATION = EMI_IN_CONNECTOR__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_AND__TARGET_FLOW = EMI_IN_CONNECTOR__TARGET_FLOW;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_AND__SOURCE_FLOW = EMI_IN_CONNECTOR__SOURCE_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_AND__TYPE = EMI_IN_CONNECTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Inand Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_AND__INAND_DIAGRAM = EMI_IN_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI In And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_IN_AND_FEATURE_COUNT = EMI_IN_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_AND__NAME = EMI_OUT_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_AND__ID = EMI_OUT_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_AND__CODE = EMI_OUT_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_AND__DESCRIPTION = EMI_OUT_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_AND__OID = EMI_OUT_CONNECTOR__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_AND__SOURCE_OBJ_SOURCE_RELATION = EMI_OUT_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_AND__TARGET_OBJ_TARGET_RELATION = EMI_OUT_CONNECTOR__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_AND__TARGET_FLOW = EMI_OUT_CONNECTOR__TARGET_FLOW;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_AND__SOURCE_FLOW = EMI_OUT_CONNECTOR__SOURCE_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_AND__TYPE = EMI_OUT_CONNECTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Outand Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_AND__OUTAND_DIAGRAM = EMI_OUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI Out And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_AND_FEATURE_COUNT = EMI_OUT_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_OR__NAME = EMI_OUT_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_OR__ID = EMI_OUT_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_OR__CODE = EMI_OUT_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_OR__DESCRIPTION = EMI_OUT_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_OR__OID = EMI_OUT_CONNECTOR__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_OR__SOURCE_OBJ_SOURCE_RELATION = EMI_OUT_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_OR__TARGET_OBJ_TARGET_RELATION = EMI_OUT_CONNECTOR__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Target Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_OR__TARGET_FLOW = EMI_OUT_CONNECTOR__TARGET_FLOW;

	/**
	 * The feature id for the '<em><b>Source Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_OR__SOURCE_FLOW = EMI_OUT_CONNECTOR__SOURCE_FLOW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_OR__TYPE = EMI_OUT_CONNECTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Outor Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_OR__OUTOR_DIAGRAM = EMI_OUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI Out Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_OUT_OR_FEATURE_COUNT = EMI_OUT_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__NAME = VpmlPackage.EM_DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__ID = VpmlPackage.EM_DIAGRAM__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__CODE = VpmlPackage.EM_DIAGRAM__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__DESCRIPTION = VpmlPackage.EM_DIAGRAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__OID = VpmlPackage.EM_DIAGRAM__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__SOURCE_OBJ_SOURCE_RELATION = VpmlPackage.EM_DIAGRAM__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__TARGET_OBJ_TARGET_RELATION = VpmlPackage.EM_DIAGRAM__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Creater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__CREATER = VpmlPackage.EM_DIAGRAM__CREATER;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__CREATED_DATE = VpmlPackage.EM_DIAGRAM__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Last Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__LAST_MODIFIER = VpmlPackage.EM_DIAGRAM__LAST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__LAST_MODIFIED_DATE = VpmlPackage.EM_DIAGRAM__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Emi Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__EMI_DIAGRAM = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__ARTIFACT = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__INAND = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__INOR = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__STATE_CONNECTOR = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Other</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__OTHER = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Product Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__PRODUCT_PACKAGE = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Outand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__OUTAND = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Outor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__OUTOR = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ref Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__REF_FLOW = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__DOCUMENT = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Data Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__DATA_FLOW = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Com Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__COM_INFO = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM__MESSAGE = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>EMI Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_DIAGRAM_FEATURE_COUNT = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 14;


	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMILeafProduct <em>EMI Leaf Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Leaf Product</em>'.
	 * @see vpml.infopackage.EMILeafProduct
	 * @generated
	 */
	EClass getEMILeafProduct();

	/**
	 * Returns the meta object for the attribute '{@link vpml.infopackage.EMILeafProduct#getProductID <em>Product ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product ID</em>'.
	 * @see vpml.infopackage.EMILeafProduct#getProductID()
	 * @see #getEMILeafProduct()
	 * @generated
	 */
	EAttribute getEMILeafProduct_ProductID();

	/**
	 * Returns the meta object for the attribute '{@link vpml.infopackage.EMILeafProduct#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attachment</em>'.
	 * @see vpml.infopackage.EMILeafProduct#getAttachment()
	 * @see #getEMILeafProduct()
	 * @generated
	 */
	EAttribute getEMILeafProduct_Attachment();

	/**
	 * Returns the meta object for the attribute '{@link vpml.infopackage.EMILeafProduct#getIotype <em>Iotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iotype</em>'.
	 * @see vpml.infopackage.EMILeafProduct#getIotype()
	 * @see #getEMILeafProduct()
	 * @generated
	 */
	EAttribute getEMILeafProduct_Iotype();

	/**
	 * Returns the meta object for the attribute '{@link vpml.infopackage.EMILeafProduct#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see vpml.infopackage.EMILeafProduct#getInterval()
	 * @see #getEMILeafProduct()
	 * @generated
	 */
	EAttribute getEMILeafProduct_Interval();

	/**
	 * Returns the meta object for the attribute '{@link vpml.infopackage.EMILeafProduct#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see vpml.infopackage.EMILeafProduct#getUnit()
	 * @see #getEMILeafProduct()
	 * @generated
	 */
	EAttribute getEMILeafProduct_Unit();

	/**
	 * Returns the meta object for the attribute '{@link vpml.infopackage.EMILeafProduct#getInitList <em>Init List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init List</em>'.
	 * @see vpml.infopackage.EMILeafProduct#getInitList()
	 * @see #getEMILeafProduct()
	 * @generated
	 */
	EAttribute getEMILeafProduct_InitList();

	/**
	 * Returns the meta object for the attribute '{@link vpml.infopackage.EMILeafProduct#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see vpml.infopackage.EMILeafProduct#getCost()
	 * @see #getEMILeafProduct()
	 * @generated
	 */
	EAttribute getEMILeafProduct_Cost();

	/**
	 * Returns the meta object for the containment reference '{@link vpml.infopackage.EMILeafProduct#getDurationTime <em>Duration Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration Time</em>'.
	 * @see vpml.infopackage.EMILeafProduct#getDurationTime()
	 * @see #getEMILeafProduct()
	 * @generated
	 */
	EReference getEMILeafProduct_DurationTime();

	/**
	 * Returns the meta object for the attribute '{@link vpml.infopackage.EMILeafProduct#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database</em>'.
	 * @see vpml.infopackage.EMILeafProduct#getDatabase()
	 * @see #getEMILeafProduct()
	 * @generated
	 */
	EAttribute getEMILeafProduct_Database();

	/**
	 * Returns the meta object for the attribute '{@link vpml.infopackage.EMILeafProduct#getDbTable <em>Db Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Table</em>'.
	 * @see vpml.infopackage.EMILeafProduct#getDbTable()
	 * @see #getEMILeafProduct()
	 * @generated
	 */
	EAttribute getEMILeafProduct_DbTable();

	/**
	 * Returns the meta object for the attribute '{@link vpml.infopackage.EMILeafProduct#getDbTableItem <em>Db Table Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Table Item</em>'.
	 * @see vpml.infopackage.EMILeafProduct#getDbTableItem()
	 * @see #getEMILeafProduct()
	 * @generated
	 */
	EAttribute getEMILeafProduct_DbTableItem();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIDocument <em>EMI Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Document</em>'.
	 * @see vpml.infopackage.EMIDocument
	 * @generated
	 */
	EClass getEMIDocument();

	/**
	 * Returns the meta object for the container reference '{@link vpml.infopackage.EMIDocument#getDocumentDiagram <em>Document Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Document Diagram</em>'.
	 * @see vpml.infopackage.EMIDocument#getDocumentDiagram()
	 * @see #getEMIDocument()
	 * @generated
	 */
	EReference getEMIDocument_DocumentDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIArtifact <em>EMI Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Artifact</em>'.
	 * @see vpml.infopackage.EMIArtifact
	 * @generated
	 */
	EClass getEMIArtifact();

	/**
	 * Returns the meta object for the container reference '{@link vpml.infopackage.EMIArtifact#getArtifactDiagram <em>Artifact Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Artifact Diagram</em>'.
	 * @see vpml.infopackage.EMIArtifact#getArtifactDiagram()
	 * @see #getEMIArtifact()
	 * @generated
	 */
	EReference getEMIArtifact_ArtifactDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIOther <em>EMI Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Other</em>'.
	 * @see vpml.infopackage.EMIOther
	 * @generated
	 */
	EClass getEMIOther();

	/**
	 * Returns the meta object for the container reference '{@link vpml.infopackage.EMIOther#getOtherDiagram <em>Other Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Other Diagram</em>'.
	 * @see vpml.infopackage.EMIOther#getOtherDiagram()
	 * @see #getEMIOther()
	 * @generated
	 */
	EReference getEMIOther_OtherDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIProductPackage <em>EMI Product Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Product Package</em>'.
	 * @see vpml.infopackage.EMIProductPackage
	 * @generated
	 */
	EClass getEMIProductPackage();

	/**
	 * Returns the meta object for the attribute '{@link vpml.infopackage.EMIProductPackage#getProductList <em>Product List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product List</em>'.
	 * @see vpml.infopackage.EMIProductPackage#getProductList()
	 * @see #getEMIProductPackage()
	 * @generated
	 */
	EAttribute getEMIProductPackage_ProductList();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.infopackage.EMIProductPackage#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Packages</em>'.
	 * @see vpml.infopackage.EMIProductPackage#getSubPackages()
	 * @see #getEMIProductPackage()
	 * @generated
	 */
	EReference getEMIProductPackage_SubPackages();

	/**
	 * Returns the meta object for the container reference '{@link vpml.infopackage.EMIProductPackage#getTopPackage <em>Top Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Top Package</em>'.
	 * @see vpml.infopackage.EMIProductPackage#getTopPackage()
	 * @see #getEMIProductPackage()
	 * @generated
	 */
	EReference getEMIProductPackage_TopPackage();

	/**
	 * Returns the meta object for the container reference '{@link vpml.infopackage.EMIProductPackage#getProductPackageDiagram <em>Product Package Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Product Package Diagram</em>'.
	 * @see vpml.infopackage.EMIProductPackage#getProductPackageDiagram()
	 * @see #getEMIProductPackage()
	 * @generated
	 */
	EReference getEMIProductPackage_ProductPackageDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIObject <em>EMI Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Object</em>'.
	 * @see vpml.infopackage.EMIObject
	 * @generated
	 */
	EClass getEMIObject();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMILogicalConnector <em>EMI Logical Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Logical Connector</em>'.
	 * @see vpml.infopackage.EMILogicalConnector
	 * @generated
	 */
	EClass getEMILogicalConnector();

	/**
	 * Returns the meta object for the attribute '{@link vpml.infopackage.EMILogicalConnector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see vpml.infopackage.EMILogicalConnector#getType()
	 * @see #getEMILogicalConnector()
	 * @generated
	 */
	EAttribute getEMILogicalConnector_Type();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIComInfo <em>EMI Com Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Com Info</em>'.
	 * @see vpml.infopackage.EMIComInfo
	 * @generated
	 */
	EClass getEMIComInfo();

	/**
	 * Returns the meta object for the container reference '{@link vpml.infopackage.EMIComInfo#getComInfoDiagram <em>Com Info Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Com Info Diagram</em>'.
	 * @see vpml.infopackage.EMIComInfo#getComInfoDiagram()
	 * @see #getEMIComInfo()
	 * @generated
	 */
	EReference getEMIComInfo_ComInfoDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIProduct <em>EMI Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Product</em>'.
	 * @see vpml.infopackage.EMIProduct
	 * @generated
	 */
	EClass getEMIProduct();

	/**
	 * Returns the meta object for the attribute '{@link vpml.infopackage.EMIProduct#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Procedure</em>'.
	 * @see vpml.infopackage.EMIProduct#getProcedure()
	 * @see #getEMIProduct()
	 * @generated
	 */
	EAttribute getEMIProduct_Procedure();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIFlow <em>EMI Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Flow</em>'.
	 * @see vpml.infopackage.EMIFlow
	 * @generated
	 */
	EClass getEMIFlow();

	/**
	 * Returns the meta object for the attribute '{@link vpml.infopackage.EMIFlow#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see vpml.infopackage.EMIFlow#getDirection()
	 * @see #getEMIFlow()
	 * @generated
	 */
	EAttribute getEMIFlow_Direction();

	/**
	 * Returns the meta object for the attribute '{@link vpml.infopackage.EMIFlow#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see vpml.infopackage.EMIFlow#getNumber()
	 * @see #getEMIFlow()
	 * @generated
	 */
	EAttribute getEMIFlow_Number();

	/**
	 * Returns the meta object for the reference '{@link vpml.infopackage.EMIFlow#getSourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Node</em>'.
	 * @see vpml.infopackage.EMIFlow#getSourceNode()
	 * @see #getEMIFlow()
	 * @generated
	 */
	EReference getEMIFlow_SourceNode();

	/**
	 * Returns the meta object for the reference '{@link vpml.infopackage.EMIFlow#getTargetNode <em>Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Node</em>'.
	 * @see vpml.infopackage.EMIFlow#getTargetNode()
	 * @see #getEMIFlow()
	 * @generated
	 */
	EReference getEMIFlow_TargetNode();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMINode <em>EMI Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Node</em>'.
	 * @see vpml.infopackage.EMINode
	 * @generated
	 */
	EClass getEMINode();

	/**
	 * Returns the meta object for the reference list '{@link vpml.infopackage.EMINode#getTargetFlow <em>Target Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Flow</em>'.
	 * @see vpml.infopackage.EMINode#getTargetFlow()
	 * @see #getEMINode()
	 * @generated
	 */
	EReference getEMINode_TargetFlow();

	/**
	 * Returns the meta object for the reference list '{@link vpml.infopackage.EMINode#getSourceFlow <em>Source Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Flow</em>'.
	 * @see vpml.infopackage.EMINode#getSourceFlow()
	 * @see #getEMINode()
	 * @generated
	 */
	EReference getEMINode_SourceFlow();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIRefFlow <em>EMI Ref Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Ref Flow</em>'.
	 * @see vpml.infopackage.EMIRefFlow
	 * @generated
	 */
	EClass getEMIRefFlow();

	/**
	 * Returns the meta object for the container reference '{@link vpml.infopackage.EMIRefFlow#getRefFlowDiagram <em>Ref Flow Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ref Flow Diagram</em>'.
	 * @see vpml.infopackage.EMIRefFlow#getRefFlowDiagram()
	 * @see #getEMIRefFlow()
	 * @generated
	 */
	EReference getEMIRefFlow_RefFlowDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIDataFlow <em>EMI Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Data Flow</em>'.
	 * @see vpml.infopackage.EMIDataFlow
	 * @generated
	 */
	EClass getEMIDataFlow();

	/**
	 * Returns the meta object for the container reference '{@link vpml.infopackage.EMIDataFlow#getDataFlowDiagram <em>Data Flow Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Flow Diagram</em>'.
	 * @see vpml.infopackage.EMIDataFlow#getDataFlowDiagram()
	 * @see #getEMIDataFlow()
	 * @generated
	 */
	EReference getEMIDataFlow_DataFlowDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIInConnector <em>EMI In Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI In Connector</em>'.
	 * @see vpml.infopackage.EMIInConnector
	 * @generated
	 */
	EClass getEMIInConnector();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIOutConnector <em>EMI Out Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Out Connector</em>'.
	 * @see vpml.infopackage.EMIOutConnector
	 * @generated
	 */
	EClass getEMIOutConnector();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIStateConnector <em>EMI State Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI State Connector</em>'.
	 * @see vpml.infopackage.EMIStateConnector
	 * @generated
	 */
	EClass getEMIStateConnector();

	/**
	 * Returns the meta object for the container reference '{@link vpml.infopackage.EMIStateConnector#getStateConnectorDiagram <em>State Connector Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State Connector Diagram</em>'.
	 * @see vpml.infopackage.EMIStateConnector#getStateConnectorDiagram()
	 * @see #getEMIStateConnector()
	 * @generated
	 */
	EReference getEMIStateConnector_StateConnectorDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIInOr <em>EMI In Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI In Or</em>'.
	 * @see vpml.infopackage.EMIInOr
	 * @generated
	 */
	EClass getEMIInOr();

	/**
	 * Returns the meta object for the container reference '{@link vpml.infopackage.EMIInOr#getInorDiagram <em>Inor Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Inor Diagram</em>'.
	 * @see vpml.infopackage.EMIInOr#getInorDiagram()
	 * @see #getEMIInOr()
	 * @generated
	 */
	EReference getEMIInOr_InorDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIInAnd <em>EMI In And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI In And</em>'.
	 * @see vpml.infopackage.EMIInAnd
	 * @generated
	 */
	EClass getEMIInAnd();

	/**
	 * Returns the meta object for the container reference '{@link vpml.infopackage.EMIInAnd#getInandDiagram <em>Inand Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Inand Diagram</em>'.
	 * @see vpml.infopackage.EMIInAnd#getInandDiagram()
	 * @see #getEMIInAnd()
	 * @generated
	 */
	EReference getEMIInAnd_InandDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIOutAnd <em>EMI Out And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Out And</em>'.
	 * @see vpml.infopackage.EMIOutAnd
	 * @generated
	 */
	EClass getEMIOutAnd();

	/**
	 * Returns the meta object for the container reference '{@link vpml.infopackage.EMIOutAnd#getOutandDiagram <em>Outand Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Outand Diagram</em>'.
	 * @see vpml.infopackage.EMIOutAnd#getOutandDiagram()
	 * @see #getEMIOutAnd()
	 * @generated
	 */
	EReference getEMIOutAnd_OutandDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIOutOr <em>EMI Out Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Out Or</em>'.
	 * @see vpml.infopackage.EMIOutOr
	 * @generated
	 */
	EClass getEMIOutOr();

	/**
	 * Returns the meta object for the container reference '{@link vpml.infopackage.EMIOutOr#getOutorDiagram <em>Outor Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Outor Diagram</em>'.
	 * @see vpml.infopackage.EMIOutOr#getOutorDiagram()
	 * @see #getEMIOutOr()
	 * @generated
	 */
	EReference getEMIOutOr_OutorDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIDiagram <em>EMI Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Diagram</em>'.
	 * @see vpml.infopackage.EMIDiagram
	 * @generated
	 */
	EClass getEMIDiagram();

	/**
	 * Returns the meta object for the reference '{@link vpml.infopackage.EMIDiagram#getEmiDiagram <em>Emi Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Emi Diagram</em>'.
	 * @see vpml.infopackage.EMIDiagram#getEmiDiagram()
	 * @see #getEMIDiagram()
	 * @generated
	 */
	EReference getEMIDiagram_EmiDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.infopackage.EMIDiagram#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact</em>'.
	 * @see vpml.infopackage.EMIDiagram#getArtifact()
	 * @see #getEMIDiagram()
	 * @generated
	 */
	EReference getEMIDiagram_Artifact();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.infopackage.EMIDiagram#getInand <em>Inand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inand</em>'.
	 * @see vpml.infopackage.EMIDiagram#getInand()
	 * @see #getEMIDiagram()
	 * @generated
	 */
	EReference getEMIDiagram_Inand();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.infopackage.EMIDiagram#getInor <em>Inor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inor</em>'.
	 * @see vpml.infopackage.EMIDiagram#getInor()
	 * @see #getEMIDiagram()
	 * @generated
	 */
	EReference getEMIDiagram_Inor();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.infopackage.EMIDiagram#getStateConnector <em>State Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Connector</em>'.
	 * @see vpml.infopackage.EMIDiagram#getStateConnector()
	 * @see #getEMIDiagram()
	 * @generated
	 */
	EReference getEMIDiagram_StateConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.infopackage.EMIDiagram#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other</em>'.
	 * @see vpml.infopackage.EMIDiagram#getOther()
	 * @see #getEMIDiagram()
	 * @generated
	 */
	EReference getEMIDiagram_Other();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.infopackage.EMIDiagram#getProductPackage <em>Product Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Package</em>'.
	 * @see vpml.infopackage.EMIDiagram#getProductPackage()
	 * @see #getEMIDiagram()
	 * @generated
	 */
	EReference getEMIDiagram_ProductPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.infopackage.EMIDiagram#getOutand <em>Outand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outand</em>'.
	 * @see vpml.infopackage.EMIDiagram#getOutand()
	 * @see #getEMIDiagram()
	 * @generated
	 */
	EReference getEMIDiagram_Outand();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.infopackage.EMIDiagram#getOutor <em>Outor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outor</em>'.
	 * @see vpml.infopackage.EMIDiagram#getOutor()
	 * @see #getEMIDiagram()
	 * @generated
	 */
	EReference getEMIDiagram_Outor();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.infopackage.EMIDiagram#getRefFlow <em>Ref Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Flow</em>'.
	 * @see vpml.infopackage.EMIDiagram#getRefFlow()
	 * @see #getEMIDiagram()
	 * @generated
	 */
	EReference getEMIDiagram_RefFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.infopackage.EMIDiagram#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document</em>'.
	 * @see vpml.infopackage.EMIDiagram#getDocument()
	 * @see #getEMIDiagram()
	 * @generated
	 */
	EReference getEMIDiagram_Document();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.infopackage.EMIDiagram#getDataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Flow</em>'.
	 * @see vpml.infopackage.EMIDiagram#getDataFlow()
	 * @see #getEMIDiagram()
	 * @generated
	 */
	EReference getEMIDiagram_DataFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.infopackage.EMIDiagram#getComInfo <em>Com Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Com Info</em>'.
	 * @see vpml.infopackage.EMIDiagram#getComInfo()
	 * @see #getEMIDiagram()
	 * @generated
	 */
	EReference getEMIDiagram_ComInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.infopackage.EMIDiagram#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message</em>'.
	 * @see vpml.infopackage.EMIDiagram#getMessage()
	 * @see #getEMIDiagram()
	 * @generated
	 */
	EReference getEMIDiagram_Message();

	/**
	 * Returns the meta object for class '{@link vpml.infopackage.EMIMessage <em>EMI Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Message</em>'.
	 * @see vpml.infopackage.EMIMessage
	 * @generated
	 */
	EClass getEMIMessage();

	/**
	 * Returns the meta object for the reference '{@link vpml.infopackage.EMIMessage#getMessageDiagram <em>Message Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Diagram</em>'.
	 * @see vpml.infopackage.EMIMessage#getMessageDiagram()
	 * @see #getEMIMessage()
	 * @generated
	 */
	EReference getEMIMessage_MessageDiagram();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfopackageFactory getInfopackageFactory();

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
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMILeafProductImpl <em>EMI Leaf Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMILeafProductImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMILeafProduct()
		 * @generated
		 */
		EClass EMI_LEAF_PRODUCT = eINSTANCE.getEMILeafProduct();

		/**
		 * The meta object literal for the '<em><b>Product ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_LEAF_PRODUCT__PRODUCT_ID = eINSTANCE.getEMILeafProduct_ProductID();

		/**
		 * The meta object literal for the '<em><b>Attachment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_LEAF_PRODUCT__ATTACHMENT = eINSTANCE.getEMILeafProduct_Attachment();

		/**
		 * The meta object literal for the '<em><b>Iotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_LEAF_PRODUCT__IOTYPE = eINSTANCE.getEMILeafProduct_Iotype();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_LEAF_PRODUCT__INTERVAL = eINSTANCE.getEMILeafProduct_Interval();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_LEAF_PRODUCT__UNIT = eINSTANCE.getEMILeafProduct_Unit();

		/**
		 * The meta object literal for the '<em><b>Init List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_LEAF_PRODUCT__INIT_LIST = eINSTANCE.getEMILeafProduct_InitList();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_LEAF_PRODUCT__COST = eINSTANCE.getEMILeafProduct_Cost();

		/**
		 * The meta object literal for the '<em><b>Duration Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_LEAF_PRODUCT__DURATION_TIME = eINSTANCE.getEMILeafProduct_DurationTime();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_LEAF_PRODUCT__DATABASE = eINSTANCE.getEMILeafProduct_Database();

		/**
		 * The meta object literal for the '<em><b>Db Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_LEAF_PRODUCT__DB_TABLE = eINSTANCE.getEMILeafProduct_DbTable();

		/**
		 * The meta object literal for the '<em><b>Db Table Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_LEAF_PRODUCT__DB_TABLE_ITEM = eINSTANCE.getEMILeafProduct_DbTableItem();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIDocumentImpl <em>EMI Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIDocumentImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIDocument()
		 * @generated
		 */
		EClass EMI_DOCUMENT = eINSTANCE.getEMIDocument();

		/**
		 * The meta object literal for the '<em><b>Document Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_DOCUMENT__DOCUMENT_DIAGRAM = eINSTANCE.getEMIDocument_DocumentDiagram();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIArtifactImpl <em>EMI Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIArtifactImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIArtifact()
		 * @generated
		 */
		EClass EMI_ARTIFACT = eINSTANCE.getEMIArtifact();

		/**
		 * The meta object literal for the '<em><b>Artifact Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_ARTIFACT__ARTIFACT_DIAGRAM = eINSTANCE.getEMIArtifact_ArtifactDiagram();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIOtherImpl <em>EMI Other</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIOtherImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIOther()
		 * @generated
		 */
		EClass EMI_OTHER = eINSTANCE.getEMIOther();

		/**
		 * The meta object literal for the '<em><b>Other Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_OTHER__OTHER_DIAGRAM = eINSTANCE.getEMIOther_OtherDiagram();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIProductPackageImpl <em>EMI Product Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIProductPackageImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIProductPackage()
		 * @generated
		 */
		EClass EMI_PRODUCT_PACKAGE = eINSTANCE.getEMIProductPackage();

		/**
		 * The meta object literal for the '<em><b>Product List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_PRODUCT_PACKAGE__PRODUCT_LIST = eINSTANCE.getEMIProductPackage_ProductList();

		/**
		 * The meta object literal for the '<em><b>Sub Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_PRODUCT_PACKAGE__SUB_PACKAGES = eINSTANCE.getEMIProductPackage_SubPackages();

		/**
		 * The meta object literal for the '<em><b>Top Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_PRODUCT_PACKAGE__TOP_PACKAGE = eINSTANCE.getEMIProductPackage_TopPackage();

		/**
		 * The meta object literal for the '<em><b>Product Package Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_PRODUCT_PACKAGE__PRODUCT_PACKAGE_DIAGRAM = eINSTANCE.getEMIProductPackage_ProductPackageDiagram();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIObjectImpl <em>EMI Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIObjectImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIObject()
		 * @generated
		 */
		EClass EMI_OBJECT = eINSTANCE.getEMIObject();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMILogicalConnectorImpl <em>EMI Logical Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMILogicalConnectorImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMILogicalConnector()
		 * @generated
		 */
		EClass EMI_LOGICAL_CONNECTOR = eINSTANCE.getEMILogicalConnector();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_LOGICAL_CONNECTOR__TYPE = eINSTANCE.getEMILogicalConnector_Type();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIComInfoImpl <em>EMI Com Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIComInfoImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIComInfo()
		 * @generated
		 */
		EClass EMI_COM_INFO = eINSTANCE.getEMIComInfo();

		/**
		 * The meta object literal for the '<em><b>Com Info Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_COM_INFO__COM_INFO_DIAGRAM = eINSTANCE.getEMIComInfo_ComInfoDiagram();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIProductImpl <em>EMI Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIProductImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIProduct()
		 * @generated
		 */
		EClass EMI_PRODUCT = eINSTANCE.getEMIProduct();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_PRODUCT__PROCEDURE = eINSTANCE.getEMIProduct_Procedure();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIFlowImpl <em>EMI Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIFlowImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIFlow()
		 * @generated
		 */
		EClass EMI_FLOW = eINSTANCE.getEMIFlow();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_FLOW__DIRECTION = eINSTANCE.getEMIFlow_Direction();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_FLOW__NUMBER = eINSTANCE.getEMIFlow_Number();

		/**
		 * The meta object literal for the '<em><b>Source Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_FLOW__SOURCE_NODE = eINSTANCE.getEMIFlow_SourceNode();

		/**
		 * The meta object literal for the '<em><b>Target Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_FLOW__TARGET_NODE = eINSTANCE.getEMIFlow_TargetNode();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMINodeImpl <em>EMI Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMINodeImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMINode()
		 * @generated
		 */
		EClass EMI_NODE = eINSTANCE.getEMINode();

		/**
		 * The meta object literal for the '<em><b>Target Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_NODE__TARGET_FLOW = eINSTANCE.getEMINode_TargetFlow();

		/**
		 * The meta object literal for the '<em><b>Source Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_NODE__SOURCE_FLOW = eINSTANCE.getEMINode_SourceFlow();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIRefFlowImpl <em>EMI Ref Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIRefFlowImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIRefFlow()
		 * @generated
		 */
		EClass EMI_REF_FLOW = eINSTANCE.getEMIRefFlow();

		/**
		 * The meta object literal for the '<em><b>Ref Flow Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_REF_FLOW__REF_FLOW_DIAGRAM = eINSTANCE.getEMIRefFlow_RefFlowDiagram();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIDataFlowImpl <em>EMI Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIDataFlowImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIDataFlow()
		 * @generated
		 */
		EClass EMI_DATA_FLOW = eINSTANCE.getEMIDataFlow();

		/**
		 * The meta object literal for the '<em><b>Data Flow Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_DATA_FLOW__DATA_FLOW_DIAGRAM = eINSTANCE.getEMIDataFlow_DataFlowDiagram();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIInConnectorImpl <em>EMI In Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIInConnectorImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIInConnector()
		 * @generated
		 */
		EClass EMI_IN_CONNECTOR = eINSTANCE.getEMIInConnector();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIOutConnectorImpl <em>EMI Out Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIOutConnectorImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIOutConnector()
		 * @generated
		 */
		EClass EMI_OUT_CONNECTOR = eINSTANCE.getEMIOutConnector();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIStateConnectorImpl <em>EMI State Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIStateConnectorImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIStateConnector()
		 * @generated
		 */
		EClass EMI_STATE_CONNECTOR = eINSTANCE.getEMIStateConnector();

		/**
		 * The meta object literal for the '<em><b>State Connector Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_STATE_CONNECTOR__STATE_CONNECTOR_DIAGRAM = eINSTANCE.getEMIStateConnector_StateConnectorDiagram();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIInOrImpl <em>EMI In Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIInOrImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIInOr()
		 * @generated
		 */
		EClass EMI_IN_OR = eINSTANCE.getEMIInOr();

		/**
		 * The meta object literal for the '<em><b>Inor Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_IN_OR__INOR_DIAGRAM = eINSTANCE.getEMIInOr_InorDiagram();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIInAndImpl <em>EMI In And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIInAndImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIInAnd()
		 * @generated
		 */
		EClass EMI_IN_AND = eINSTANCE.getEMIInAnd();

		/**
		 * The meta object literal for the '<em><b>Inand Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_IN_AND__INAND_DIAGRAM = eINSTANCE.getEMIInAnd_InandDiagram();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIOutAndImpl <em>EMI Out And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIOutAndImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIOutAnd()
		 * @generated
		 */
		EClass EMI_OUT_AND = eINSTANCE.getEMIOutAnd();

		/**
		 * The meta object literal for the '<em><b>Outand Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_OUT_AND__OUTAND_DIAGRAM = eINSTANCE.getEMIOutAnd_OutandDiagram();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIOutOrImpl <em>EMI Out Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIOutOrImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIOutOr()
		 * @generated
		 */
		EClass EMI_OUT_OR = eINSTANCE.getEMIOutOr();

		/**
		 * The meta object literal for the '<em><b>Outor Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_OUT_OR__OUTOR_DIAGRAM = eINSTANCE.getEMIOutOr_OutorDiagram();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIDiagramImpl <em>EMI Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIDiagramImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIDiagram()
		 * @generated
		 */
		EClass EMI_DIAGRAM = eINSTANCE.getEMIDiagram();

		/**
		 * The meta object literal for the '<em><b>Emi Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_DIAGRAM__EMI_DIAGRAM = eINSTANCE.getEMIDiagram_EmiDiagram();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_DIAGRAM__ARTIFACT = eINSTANCE.getEMIDiagram_Artifact();

		/**
		 * The meta object literal for the '<em><b>Inand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_DIAGRAM__INAND = eINSTANCE.getEMIDiagram_Inand();

		/**
		 * The meta object literal for the '<em><b>Inor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_DIAGRAM__INOR = eINSTANCE.getEMIDiagram_Inor();

		/**
		 * The meta object literal for the '<em><b>State Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_DIAGRAM__STATE_CONNECTOR = eINSTANCE.getEMIDiagram_StateConnector();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_DIAGRAM__OTHER = eINSTANCE.getEMIDiagram_Other();

		/**
		 * The meta object literal for the '<em><b>Product Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_DIAGRAM__PRODUCT_PACKAGE = eINSTANCE.getEMIDiagram_ProductPackage();

		/**
		 * The meta object literal for the '<em><b>Outand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_DIAGRAM__OUTAND = eINSTANCE.getEMIDiagram_Outand();

		/**
		 * The meta object literal for the '<em><b>Outor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_DIAGRAM__OUTOR = eINSTANCE.getEMIDiagram_Outor();

		/**
		 * The meta object literal for the '<em><b>Ref Flow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_DIAGRAM__REF_FLOW = eINSTANCE.getEMIDiagram_RefFlow();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_DIAGRAM__DOCUMENT = eINSTANCE.getEMIDiagram_Document();

		/**
		 * The meta object literal for the '<em><b>Data Flow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_DIAGRAM__DATA_FLOW = eINSTANCE.getEMIDiagram_DataFlow();

		/**
		 * The meta object literal for the '<em><b>Com Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_DIAGRAM__COM_INFO = eINSTANCE.getEMIDiagram_ComInfo();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_DIAGRAM__MESSAGE = eINSTANCE.getEMIDiagram_Message();

		/**
		 * The meta object literal for the '{@link vpml.infopackage.impl.EMIMessageImpl <em>EMI Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.infopackage.impl.EMIMessageImpl
		 * @see vpml.infopackage.impl.InfopackagePackageImpl#getEMIMessage()
		 * @generated
		 */
		EClass EMI_MESSAGE = eINSTANCE.getEMIMessage();

		/**
		 * The meta object literal for the '<em><b>Message Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_MESSAGE__MESSAGE_DIAGRAM = eINSTANCE.getEMIMessage_MessageDiagram();

	}

} //InfopackagePackage
