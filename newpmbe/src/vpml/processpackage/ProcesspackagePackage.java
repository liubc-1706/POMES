/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;

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
 * @see vpml.processpackage.ProcesspackageFactory
 * @model kind="package"
 * @generated
 */
public interface ProcesspackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "processpackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///vpml/processpackage.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vpml.processpackage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcesspackagePackage eINSTANCE = vpml.processpackage.impl.ProcesspackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPObjectImpl <em>EMP Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPObjectImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPObject()
	 * @generated
	 */
	int EMP_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OBJECT__NAME = VpmlPackage.EM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OBJECT__ID = VpmlPackage.EM_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OBJECT__CODE = VpmlPackage.EM_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OBJECT__DESCRIPTION = VpmlPackage.EM_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OBJECT__OID = VpmlPackage.EM_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OBJECT__SOURCE_OBJ_SOURCE_RELATION = VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OBJECT__TARGET_OBJ_TARGET_RELATION = VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OBJECT__COM_ACTIVITY = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMP Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OBJECT_FEATURE_COUNT = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPActivityImpl <em>EMP Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPActivityImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPActivity()
	 * @generated
	 */
	int EMP_ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__NAME = EMP_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__ID = EMP_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__CODE = EMP_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__DESCRIPTION = EMP_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__OID = EMP_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__SOURCE_OBJ_SOURCE_RELATION = EMP_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__TARGET_OBJ_TARGET_RELATION = EMP_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__COM_ACTIVITY = EMP_OBJECT__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__PROCEDURE = EMP_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__CREATER = EMP_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__CREATED_DATE = EMP_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__LAST_MODIFIER = EMP_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__LAST_MODIFIED_DATE = EMP_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Clock Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__CLOCK_FLOW = EMP_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__TARGET_DATA_FLOWS = EMP_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__SOURCE_DATA_FLOWS = EMP_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY__REF_FLOWS = EMP_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>EMP Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ACTIVITY_FEATURE_COUNT = EMP_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPLeafActivityImpl <em>EMP Leaf Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPLeafActivityImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPLeafActivity()
	 * @generated
	 */
	int EMP_LEAF_ACTIVITY = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__NAME = EMP_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__ID = EMP_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__CODE = EMP_ACTIVITY__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__DESCRIPTION = EMP_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__OID = EMP_ACTIVITY__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__SOURCE_OBJ_SOURCE_RELATION = EMP_ACTIVITY__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__TARGET_OBJ_TARGET_RELATION = EMP_ACTIVITY__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__COM_ACTIVITY = EMP_ACTIVITY__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__PROCEDURE = EMP_ACTIVITY__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Creater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__CREATER = EMP_ACTIVITY__CREATER;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__CREATED_DATE = EMP_ACTIVITY__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Last Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__LAST_MODIFIER = EMP_ACTIVITY__LAST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__LAST_MODIFIED_DATE = EMP_ACTIVITY__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Clock Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__CLOCK_FLOW = EMP_ACTIVITY__CLOCK_FLOW;

	/**
	 * The feature id for the '<em><b>Target Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__TARGET_DATA_FLOWS = EMP_ACTIVITY__TARGET_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Source Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__SOURCE_DATA_FLOWS = EMP_ACTIVITY__SOURCE_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__REF_FLOWS = EMP_ACTIVITY__REF_FLOWS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__IS_DEFAULT = EMP_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__START_TIME = EMP_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__DURATION_TIME = EMP_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__TIME_UNIT = EMP_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY__PRIORITY = EMP_ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EMP Leaf Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_ACTIVITY_FEATURE_COUNT = EMP_ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPNormalActivityImpl <em>EMP Normal Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPNormalActivityImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPNormalActivity()
	 * @generated
	 */
	int EMP_NORMAL_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__NAME = EMP_LEAF_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__ID = EMP_LEAF_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__CODE = EMP_LEAF_ACTIVITY__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__DESCRIPTION = EMP_LEAF_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__OID = EMP_LEAF_ACTIVITY__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__SOURCE_OBJ_SOURCE_RELATION = EMP_LEAF_ACTIVITY__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__TARGET_OBJ_TARGET_RELATION = EMP_LEAF_ACTIVITY__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__COM_ACTIVITY = EMP_LEAF_ACTIVITY__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__PROCEDURE = EMP_LEAF_ACTIVITY__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Creater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__CREATER = EMP_LEAF_ACTIVITY__CREATER;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__CREATED_DATE = EMP_LEAF_ACTIVITY__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Last Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__LAST_MODIFIER = EMP_LEAF_ACTIVITY__LAST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__LAST_MODIFIED_DATE = EMP_LEAF_ACTIVITY__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Clock Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__CLOCK_FLOW = EMP_LEAF_ACTIVITY__CLOCK_FLOW;

	/**
	 * The feature id for the '<em><b>Target Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__TARGET_DATA_FLOWS = EMP_LEAF_ACTIVITY__TARGET_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Source Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__SOURCE_DATA_FLOWS = EMP_LEAF_ACTIVITY__SOURCE_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__REF_FLOWS = EMP_LEAF_ACTIVITY__REF_FLOWS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__IS_DEFAULT = EMP_LEAF_ACTIVITY__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__START_TIME = EMP_LEAF_ACTIVITY__START_TIME;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__DURATION_TIME = EMP_LEAF_ACTIVITY__DURATION_TIME;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__TIME_UNIT = EMP_LEAF_ACTIVITY__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__PRIORITY = EMP_LEAF_ACTIVITY__PRIORITY;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__EMP_DIAGRAM = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY__ASS_FLOWS = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMP Normal Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_NORMAL_ACTIVITY_FEATURE_COUNT = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPBatchActivityImpl <em>EMP Batch Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPBatchActivityImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPBatchActivity()
	 * @generated
	 */
	int EMP_BATCH_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__NAME = EMP_LEAF_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__ID = EMP_LEAF_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__CODE = EMP_LEAF_ACTIVITY__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__DESCRIPTION = EMP_LEAF_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__OID = EMP_LEAF_ACTIVITY__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__SOURCE_OBJ_SOURCE_RELATION = EMP_LEAF_ACTIVITY__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__TARGET_OBJ_TARGET_RELATION = EMP_LEAF_ACTIVITY__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__COM_ACTIVITY = EMP_LEAF_ACTIVITY__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__PROCEDURE = EMP_LEAF_ACTIVITY__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Creater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__CREATER = EMP_LEAF_ACTIVITY__CREATER;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__CREATED_DATE = EMP_LEAF_ACTIVITY__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Last Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__LAST_MODIFIER = EMP_LEAF_ACTIVITY__LAST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__LAST_MODIFIED_DATE = EMP_LEAF_ACTIVITY__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Clock Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__CLOCK_FLOW = EMP_LEAF_ACTIVITY__CLOCK_FLOW;

	/**
	 * The feature id for the '<em><b>Target Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__TARGET_DATA_FLOWS = EMP_LEAF_ACTIVITY__TARGET_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Source Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__SOURCE_DATA_FLOWS = EMP_LEAF_ACTIVITY__SOURCE_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__REF_FLOWS = EMP_LEAF_ACTIVITY__REF_FLOWS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__IS_DEFAULT = EMP_LEAF_ACTIVITY__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__START_TIME = EMP_LEAF_ACTIVITY__START_TIME;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__DURATION_TIME = EMP_LEAF_ACTIVITY__DURATION_TIME;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__TIME_UNIT = EMP_LEAF_ACTIVITY__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__PRIORITY = EMP_LEAF_ACTIVITY__PRIORITY;

	/**
	 * The feature id for the '<em><b>Batch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__BATCH_TYPE = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bat Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__BAT_START_TIME = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bat End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__BAT_END_TIME = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Restart Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__RESTART_PERIOD = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bat Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__BAT_TIME_UNIT = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timer Queue Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__TIMER_QUEUE_FLAG = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Emergency Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__EMERGENCY_FLAG = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Interval Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__INTERVAL_VALUE = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Interval Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__INTERVAL_TIME_UNIT = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__MAX_QUANTITY = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Min Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY__MIN_QUANTITY = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>EMP Batch Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_BATCH_ACTIVITY_FEATURE_COUNT = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPFlowImpl <em>EMP Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPFlowImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPFlow()
	 * @generated
	 */
	int EMP_FLOW = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FLOW__NAME = EMP_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FLOW__ID = EMP_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FLOW__CODE = EMP_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FLOW__DESCRIPTION = EMP_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FLOW__OID = EMP_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FLOW__SOURCE_OBJ_SOURCE_RELATION = EMP_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FLOW__TARGET_OBJ_TARGET_RELATION = EMP_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FLOW__COM_ACTIVITY = EMP_OBJECT__COM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>EMP Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FLOW_FEATURE_COUNT = EMP_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPDataFlowImpl <em>EMP Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPDataFlowImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPDataFlow()
	 * @generated
	 */
	int EMP_DATA_FLOW = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__NAME = EMP_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__ID = EMP_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__CODE = EMP_FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__DESCRIPTION = EMP_FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__OID = EMP_FLOW__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__SOURCE_OBJ_SOURCE_RELATION = EMP_FLOW__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__TARGET_OBJ_TARGET_RELATION = EMP_FLOW__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__COM_ACTIVITY = EMP_FLOW__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__PROBABILITY = EMP_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__EMP_DIAGRAM = EMP_FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__TARGET_PRODUCT = EMP_FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__TARGET_ACTIVITY = EMP_FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__SOURCE_PRODUCT = EMP_FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__SOURCE_ACTIVITY = EMP_FLOW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source In And</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__SOURCE_IN_AND = EMP_FLOW_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target In And</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__TARGET_IN_AND = EMP_FLOW_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target In Or</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__TARGET_IN_OR = EMP_FLOW_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Source In Or</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__SOURCE_IN_OR = EMP_FLOW_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Source Out And</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__SOURCE_OUT_AND = EMP_FLOW_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Target Out And</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__TARGET_OUT_AND = EMP_FLOW_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Source Out Or</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__SOURCE_OUT_OR = EMP_FLOW_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Target Out Or</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__TARGET_OUT_OR = EMP_FLOW_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Mile Stone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW__MILE_STONE = EMP_FLOW_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>EMP Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DATA_FLOW_FEATURE_COUNT = EMP_FLOW_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPAssFlowImpl <em>EMP Ass Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPAssFlowImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPAssFlow()
	 * @generated
	 */
	int EMP_ASS_FLOW = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__NAME = EMP_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__ID = EMP_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__CODE = EMP_FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__DESCRIPTION = EMP_FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__OID = EMP_FLOW__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__SOURCE_OBJ_SOURCE_RELATION = EMP_FLOW__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__TARGET_OBJ_TARGET_RELATION = EMP_FLOW__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__COM_ACTIVITY = EMP_FLOW__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Resource Group Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__RESOURCE_GROUP_TYPE = EMP_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__EMP_DIAGRAM = EMP_FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__PRODUCT = EMP_FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__LOCATION_TYPE = EMP_FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Machine Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__MACHINE_TYPE = EMP_FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__ROLE = EMP_FLOW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tool Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__TOOL_TYPE = EMP_FLOW_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Auto Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__AUTO_ACTIVITY = EMP_FLOW_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Normal Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__NORMAL_ACTIVITY = EMP_FLOW_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Comp Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__COMP_ACTIVITY = EMP_FLOW_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Manual Batch Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__MANUAL_BATCH_ACTIVITY = EMP_FLOW_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Auto Batch Activiy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW__AUTO_BATCH_ACTIVIY = EMP_FLOW_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>EMP Ass Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ASS_FLOW_FEATURE_COUNT = EMP_FLOW_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPClockFlowImpl <em>EMP Clock Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPClockFlowImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPClockFlow()
	 * @generated
	 */
	int EMP_CLOCK_FLOW = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK_FLOW__NAME = EMP_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK_FLOW__ID = EMP_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK_FLOW__CODE = EMP_FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK_FLOW__DESCRIPTION = EMP_FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK_FLOW__OID = EMP_FLOW__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK_FLOW__SOURCE_OBJ_SOURCE_RELATION = EMP_FLOW__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK_FLOW__TARGET_OBJ_TARGET_RELATION = EMP_FLOW__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK_FLOW__COM_ACTIVITY = EMP_FLOW__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK_FLOW__ACTIVITY = EMP_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK_FLOW__CLOCK = EMP_FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK_FLOW__EMP_DIAGRAM = EMP_FLOW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EMP Clock Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK_FLOW_FEATURE_COUNT = EMP_FLOW_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPLogicalConnectorImpl <em>EMP Logical Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPLogicalConnectorImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPLogicalConnector()
	 * @generated
	 */
	int EMP_LOGICAL_CONNECTOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LOGICAL_CONNECTOR__NAME = EMP_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LOGICAL_CONNECTOR__ID = EMP_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LOGICAL_CONNECTOR__CODE = EMP_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LOGICAL_CONNECTOR__DESCRIPTION = EMP_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LOGICAL_CONNECTOR__OID = EMP_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LOGICAL_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION = EMP_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LOGICAL_CONNECTOR__TARGET_OBJ_TARGET_RELATION = EMP_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LOGICAL_CONNECTOR__COM_ACTIVITY = EMP_OBJECT__COM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>EMP Logical Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LOGICAL_CONNECTOR_FEATURE_COUNT = EMP_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPInConnectorImpl <em>EMP In Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPInConnectorImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPInConnector()
	 * @generated
	 */
	int EMP_IN_CONNECTOR = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_CONNECTOR__NAME = EMP_LOGICAL_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_CONNECTOR__ID = EMP_LOGICAL_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_CONNECTOR__CODE = EMP_LOGICAL_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_CONNECTOR__DESCRIPTION = EMP_LOGICAL_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_CONNECTOR__OID = EMP_LOGICAL_CONNECTOR__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION = EMP_LOGICAL_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_CONNECTOR__TARGET_OBJ_TARGET_RELATION = EMP_LOGICAL_CONNECTOR__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_CONNECTOR__COM_ACTIVITY = EMP_LOGICAL_CONNECTOR__COM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>EMP In Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_CONNECTOR_FEATURE_COUNT = EMP_LOGICAL_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPInAndImpl <em>EMP In And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPInAndImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPInAnd()
	 * @generated
	 */
	int EMP_IN_AND = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_AND__NAME = EMP_IN_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_AND__ID = EMP_IN_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_AND__CODE = EMP_IN_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_AND__DESCRIPTION = EMP_IN_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_AND__OID = EMP_IN_CONNECTOR__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_AND__SOURCE_OBJ_SOURCE_RELATION = EMP_IN_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_AND__TARGET_OBJ_TARGET_RELATION = EMP_IN_CONNECTOR__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_AND__COM_ACTIVITY = EMP_IN_CONNECTOR__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_AND__EMP_DIAGRAM = EMP_IN_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_AND__SOURCE_FLOWS = EMP_IN_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_AND__TARGET_FLOWS = EMP_IN_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EMP In And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_AND_FEATURE_COUNT = EMP_IN_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPOutConnectorImpl <em>EMP Out Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPOutConnectorImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPOutConnector()
	 * @generated
	 */
	int EMP_OUT_CONNECTOR = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_CONNECTOR__NAME = EMP_LOGICAL_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_CONNECTOR__ID = EMP_LOGICAL_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_CONNECTOR__CODE = EMP_LOGICAL_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_CONNECTOR__DESCRIPTION = EMP_LOGICAL_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_CONNECTOR__OID = EMP_LOGICAL_CONNECTOR__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION = EMP_LOGICAL_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_CONNECTOR__TARGET_OBJ_TARGET_RELATION = EMP_LOGICAL_CONNECTOR__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_CONNECTOR__COM_ACTIVITY = EMP_LOGICAL_CONNECTOR__COM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>EMP Out Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_CONNECTOR_FEATURE_COUNT = EMP_LOGICAL_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPOutAndImpl <em>EMP Out And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPOutAndImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPOutAnd()
	 * @generated
	 */
	int EMP_OUT_AND = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_AND__NAME = EMP_OUT_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_AND__ID = EMP_OUT_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_AND__CODE = EMP_OUT_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_AND__DESCRIPTION = EMP_OUT_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_AND__OID = EMP_OUT_CONNECTOR__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_AND__SOURCE_OBJ_SOURCE_RELATION = EMP_OUT_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_AND__TARGET_OBJ_TARGET_RELATION = EMP_OUT_CONNECTOR__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_AND__COM_ACTIVITY = EMP_OUT_CONNECTOR__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_AND__EMP_DIAGRAM = EMP_OUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_AND__SOURCE_FLOWS = EMP_OUT_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_AND__TARGET_FLOWS = EMP_OUT_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EMP Out And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_AND_FEATURE_COUNT = EMP_OUT_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPInOrImpl <em>EMP In Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPInOrImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPInOr()
	 * @generated
	 */
	int EMP_IN_OR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_OR__NAME = EMP_IN_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_OR__ID = EMP_IN_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_OR__CODE = EMP_IN_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_OR__DESCRIPTION = EMP_IN_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_OR__OID = EMP_IN_CONNECTOR__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_OR__SOURCE_OBJ_SOURCE_RELATION = EMP_IN_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_OR__TARGET_OBJ_TARGET_RELATION = EMP_IN_CONNECTOR__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_OR__COM_ACTIVITY = EMP_IN_CONNECTOR__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_OR__EMP_DIAGRAM = EMP_IN_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_OR__TARGET_FLOWS = EMP_IN_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_OR__SOURCE_FLOWS = EMP_IN_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EMP In Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_IN_OR_FEATURE_COUNT = EMP_IN_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPOutOrImpl <em>EMP Out Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPOutOrImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPOutOr()
	 * @generated
	 */
	int EMP_OUT_OR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_OR__NAME = EMP_OUT_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_OR__ID = EMP_OUT_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_OR__CODE = EMP_OUT_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_OR__DESCRIPTION = EMP_OUT_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_OR__OID = EMP_OUT_CONNECTOR__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_OR__SOURCE_OBJ_SOURCE_RELATION = EMP_OUT_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_OR__TARGET_OBJ_TARGET_RELATION = EMP_OUT_CONNECTOR__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_OR__COM_ACTIVITY = EMP_OUT_CONNECTOR__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_OR__EMP_DIAGRAM = EMP_OUT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_OR__SOURCE_FLOWS = EMP_OUT_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_OR__TARGET_FLOWS = EMP_OUT_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EMP Out Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OUT_OR_FEATURE_COUNT = EMP_OUT_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPClockImpl <em>EMP Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPClockImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPClock()
	 * @generated
	 */
	int EMP_CLOCK = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__NAME = EMP_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__ID = EMP_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__CODE = EMP_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__DESCRIPTION = EMP_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__OID = EMP_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__SOURCE_OBJ_SOURCE_RELATION = EMP_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__TARGET_OBJ_TARGET_RELATION = EMP_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__COM_ACTIVITY = EMP_OBJECT__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__START_TIME = EMP_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__END_TIME = EMP_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Restart Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__RESTART_PERIOD = EMP_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__TIME_UNIT = EMP_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tq Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__TQ_FLAG = EMP_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EFlag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__EFLAG = EMP_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interval Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__INTERVAL_VALUE = EMP_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Interval Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__INTERVAL_UNIT = EMP_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Clock Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__CLOCK_FLOWS = EMP_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK__EMP_DIAGRAM = EMP_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>EMP Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_CLOCK_FEATURE_COUNT = EMP_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPCompActivityImpl <em>EMP Comp Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPCompActivityImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPCompActivity()
	 * @generated
	 */
	int EMP_COMP_ACTIVITY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__NAME = EMP_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__ID = EMP_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__CODE = EMP_ACTIVITY__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__DESCRIPTION = EMP_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__OID = EMP_ACTIVITY__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__SOURCE_OBJ_SOURCE_RELATION = EMP_ACTIVITY__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__TARGET_OBJ_TARGET_RELATION = EMP_ACTIVITY__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__COM_ACTIVITY = EMP_ACTIVITY__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__PROCEDURE = EMP_ACTIVITY__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Creater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__CREATER = EMP_ACTIVITY__CREATER;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__CREATED_DATE = EMP_ACTIVITY__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Last Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__LAST_MODIFIER = EMP_ACTIVITY__LAST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__LAST_MODIFIED_DATE = EMP_ACTIVITY__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Clock Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__CLOCK_FLOW = EMP_ACTIVITY__CLOCK_FLOW;

	/**
	 * The feature id for the '<em><b>Target Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__TARGET_DATA_FLOWS = EMP_ACTIVITY__TARGET_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Source Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__SOURCE_DATA_FLOWS = EMP_ACTIVITY__SOURCE_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__REF_FLOWS = EMP_ACTIVITY__REF_FLOWS;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__EMP_DIAGRAM = EMP_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Leaf Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__LEAF_OBJECTS = EMP_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY__ASS_FLOWS = EMP_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EMP Comp Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_COMP_ACTIVITY_FEATURE_COUNT = EMP_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPProductImpl <em>EMP Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPProductImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPProduct()
	 * @generated
	 */
	int EMP_PRODUCT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT__NAME = EMP_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT__ID = EMP_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT__CODE = EMP_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT__DESCRIPTION = EMP_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT__OID = EMP_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT__SOURCE_OBJ_SOURCE_RELATION = EMP_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT__TARGET_OBJ_TARGET_RELATION = EMP_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT__COM_ACTIVITY = EMP_OBJECT__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Target Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT__TARGET_DATA_FLOWS = EMP_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT__SOURCE_DATA_FLOWS = EMP_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT__REF_FLOWS = EMP_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT__ASS_FLOWS = EMP_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EMP Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_FEATURE_COUNT = EMP_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPProductPackageImpl <em>EMP Product Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPProductPackageImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPProductPackage()
	 * @generated
	 */
	int EMP_PRODUCT_PACKAGE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE__NAME = EMP_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE__ID = EMP_PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE__CODE = EMP_PRODUCT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE__DESCRIPTION = EMP_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE__OID = EMP_PRODUCT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE__SOURCE_OBJ_SOURCE_RELATION = EMP_PRODUCT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE__TARGET_OBJ_TARGET_RELATION = EMP_PRODUCT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE__COM_ACTIVITY = EMP_PRODUCT__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Target Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE__TARGET_DATA_FLOWS = EMP_PRODUCT__TARGET_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Source Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE__SOURCE_DATA_FLOWS = EMP_PRODUCT__SOURCE_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE__REF_FLOWS = EMP_PRODUCT__REF_FLOWS;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE__ASS_FLOWS = EMP_PRODUCT__ASS_FLOWS;

	/**
	 * The feature id for the '<em><b>Sub Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE__SUB_PACKAGES = EMP_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Top Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE__TOP_PACKAGE = EMP_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE__EMP_DIAGRAM = EMP_PRODUCT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Leaf Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE__LEAF_PRODUCTS = EMP_PRODUCT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EMP Product Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_PRODUCT_PACKAGE_FEATURE_COUNT = EMP_PRODUCT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPLeafProductImpl <em>EMP Leaf Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPLeafProductImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPLeafProduct()
	 * @generated
	 */
	int EMP_LEAF_PRODUCT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__NAME = EMP_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__ID = EMP_PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__CODE = EMP_PRODUCT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__DESCRIPTION = EMP_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__OID = EMP_PRODUCT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__SOURCE_OBJ_SOURCE_RELATION = EMP_PRODUCT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__TARGET_OBJ_TARGET_RELATION = EMP_PRODUCT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__COM_ACTIVITY = EMP_PRODUCT__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Target Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__TARGET_DATA_FLOWS = EMP_PRODUCT__TARGET_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Source Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__SOURCE_DATA_FLOWS = EMP_PRODUCT__SOURCE_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__REF_FLOWS = EMP_PRODUCT__REF_FLOWS;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__ASS_FLOWS = EMP_PRODUCT__ASS_FLOWS;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__ATTACHMENT = EMP_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Io Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__IO_TYPE = EMP_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__PERIOD = EMP_PRODUCT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__DURATION_TIME = EMP_PRODUCT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__TIME_UNIT = EMP_PRODUCT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Init Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__INIT_QUEUE = EMP_PRODUCT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__COST = EMP_PRODUCT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Top Product Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE = EMP_PRODUCT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>EMP Leaf Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_LEAF_PRODUCT_FEATURE_COUNT = EMP_PRODUCT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPRefFlowImpl <em>EMP Ref Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPRefFlowImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPRefFlow()
	 * @generated
	 */
	int EMP_REF_FLOW = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_REF_FLOW__NAME = EMP_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_REF_FLOW__ID = EMP_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_REF_FLOW__CODE = EMP_FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_REF_FLOW__DESCRIPTION = EMP_FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_REF_FLOW__OID = EMP_FLOW__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_REF_FLOW__SOURCE_OBJ_SOURCE_RELATION = EMP_FLOW__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_REF_FLOW__TARGET_OBJ_TARGET_RELATION = EMP_FLOW__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_REF_FLOW__COM_ACTIVITY = EMP_FLOW__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_REF_FLOW__ACTIVITY = EMP_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_REF_FLOW__PRODUCT = EMP_FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_REF_FLOW__EMP_DIAGRAM = EMP_FLOW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EMP Ref Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_REF_FLOW_FEATURE_COUNT = EMP_FLOW_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPDocumentImpl <em>EMP Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPDocumentImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPDocument()
	 * @generated
	 */
	int EMP_DOCUMENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__NAME = EMP_LEAF_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__ID = EMP_LEAF_PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__CODE = EMP_LEAF_PRODUCT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__DESCRIPTION = EMP_LEAF_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__OID = EMP_LEAF_PRODUCT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__SOURCE_OBJ_SOURCE_RELATION = EMP_LEAF_PRODUCT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__TARGET_OBJ_TARGET_RELATION = EMP_LEAF_PRODUCT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__COM_ACTIVITY = EMP_LEAF_PRODUCT__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Target Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__TARGET_DATA_FLOWS = EMP_LEAF_PRODUCT__TARGET_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Source Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__SOURCE_DATA_FLOWS = EMP_LEAF_PRODUCT__SOURCE_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__REF_FLOWS = EMP_LEAF_PRODUCT__REF_FLOWS;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__ASS_FLOWS = EMP_LEAF_PRODUCT__ASS_FLOWS;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__ATTACHMENT = EMP_LEAF_PRODUCT__ATTACHMENT;

	/**
	 * The feature id for the '<em><b>Io Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__IO_TYPE = EMP_LEAF_PRODUCT__IO_TYPE;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__PERIOD = EMP_LEAF_PRODUCT__PERIOD;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__DURATION_TIME = EMP_LEAF_PRODUCT__DURATION_TIME;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__TIME_UNIT = EMP_LEAF_PRODUCT__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Init Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__INIT_QUEUE = EMP_LEAF_PRODUCT__INIT_QUEUE;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__COST = EMP_LEAF_PRODUCT__COST;

	/**
	 * The feature id for the '<em><b>Top Product Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__TOP_PRODUCT_PACKAGE = EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT__EMP_DIAGRAM = EMP_LEAF_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMP Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DOCUMENT_FEATURE_COUNT = EMP_LEAF_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPArtifactImpl <em>EMP Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPArtifactImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPArtifact()
	 * @generated
	 */
	int EMP_ARTIFACT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__NAME = EMP_LEAF_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__ID = EMP_LEAF_PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__CODE = EMP_LEAF_PRODUCT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__DESCRIPTION = EMP_LEAF_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__OID = EMP_LEAF_PRODUCT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__SOURCE_OBJ_SOURCE_RELATION = EMP_LEAF_PRODUCT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__TARGET_OBJ_TARGET_RELATION = EMP_LEAF_PRODUCT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__COM_ACTIVITY = EMP_LEAF_PRODUCT__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Target Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__TARGET_DATA_FLOWS = EMP_LEAF_PRODUCT__TARGET_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Source Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__SOURCE_DATA_FLOWS = EMP_LEAF_PRODUCT__SOURCE_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__REF_FLOWS = EMP_LEAF_PRODUCT__REF_FLOWS;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__ASS_FLOWS = EMP_LEAF_PRODUCT__ASS_FLOWS;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__ATTACHMENT = EMP_LEAF_PRODUCT__ATTACHMENT;

	/**
	 * The feature id for the '<em><b>Io Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__IO_TYPE = EMP_LEAF_PRODUCT__IO_TYPE;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__PERIOD = EMP_LEAF_PRODUCT__PERIOD;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__DURATION_TIME = EMP_LEAF_PRODUCT__DURATION_TIME;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__TIME_UNIT = EMP_LEAF_PRODUCT__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Init Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__INIT_QUEUE = EMP_LEAF_PRODUCT__INIT_QUEUE;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__COST = EMP_LEAF_PRODUCT__COST;

	/**
	 * The feature id for the '<em><b>Top Product Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__TOP_PRODUCT_PACKAGE = EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT__EMP_DIAGRAM = EMP_LEAF_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMP Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ARTIFACT_FEATURE_COUNT = EMP_LEAF_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPOtherImpl <em>EMP Other</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPOtherImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPOther()
	 * @generated
	 */
	int EMP_OTHER = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__NAME = EMP_LEAF_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__ID = EMP_LEAF_PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__CODE = EMP_LEAF_PRODUCT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__DESCRIPTION = EMP_LEAF_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__OID = EMP_LEAF_PRODUCT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__SOURCE_OBJ_SOURCE_RELATION = EMP_LEAF_PRODUCT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__TARGET_OBJ_TARGET_RELATION = EMP_LEAF_PRODUCT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__COM_ACTIVITY = EMP_LEAF_PRODUCT__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Target Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__TARGET_DATA_FLOWS = EMP_LEAF_PRODUCT__TARGET_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Source Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__SOURCE_DATA_FLOWS = EMP_LEAF_PRODUCT__SOURCE_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__REF_FLOWS = EMP_LEAF_PRODUCT__REF_FLOWS;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__ASS_FLOWS = EMP_LEAF_PRODUCT__ASS_FLOWS;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__ATTACHMENT = EMP_LEAF_PRODUCT__ATTACHMENT;

	/**
	 * The feature id for the '<em><b>Io Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__IO_TYPE = EMP_LEAF_PRODUCT__IO_TYPE;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__PERIOD = EMP_LEAF_PRODUCT__PERIOD;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__DURATION_TIME = EMP_LEAF_PRODUCT__DURATION_TIME;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__TIME_UNIT = EMP_LEAF_PRODUCT__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Init Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__INIT_QUEUE = EMP_LEAF_PRODUCT__INIT_QUEUE;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__COST = EMP_LEAF_PRODUCT__COST;

	/**
	 * The feature id for the '<em><b>Top Product Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__TOP_PRODUCT_PACKAGE = EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER__EMP_DIAGRAM = EMP_LEAF_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMP Other</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_OTHER_FEATURE_COUNT = EMP_LEAF_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPAttributeItemImpl <em>EMP Attribute Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPAttributeItemImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPAttributeItem()
	 * @generated
	 */
	int EMP_ATTRIBUTE_ITEM = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ATTRIBUTE_ITEM__NAME = EMP_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ATTRIBUTE_ITEM__ID = EMP_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ATTRIBUTE_ITEM__CODE = EMP_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ATTRIBUTE_ITEM__DESCRIPTION = EMP_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ATTRIBUTE_ITEM__OID = EMP_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ATTRIBUTE_ITEM__SOURCE_OBJ_SOURCE_RELATION = EMP_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ATTRIBUTE_ITEM__TARGET_OBJ_TARGET_RELATION = EMP_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ATTRIBUTE_ITEM__COM_ACTIVITY = EMP_OBJECT__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ATTRIBUTE_ITEM__TYPE = EMP_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>depend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ATTRIBUTE_ITEM__DEPEND = EMP_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMP Attribute Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_ATTRIBUTE_ITEM_FEATURE_COUNT = EMP_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPAutoActivityImpl <em>EMP Auto Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPAutoActivityImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPAutoActivity()
	 * @generated
	 */
	int EMP_AUTO_ACTIVITY = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__NAME = EMP_LEAF_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__ID = EMP_LEAF_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__CODE = EMP_LEAF_ACTIVITY__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__DESCRIPTION = EMP_LEAF_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__OID = EMP_LEAF_ACTIVITY__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__SOURCE_OBJ_SOURCE_RELATION = EMP_LEAF_ACTIVITY__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__TARGET_OBJ_TARGET_RELATION = EMP_LEAF_ACTIVITY__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__COM_ACTIVITY = EMP_LEAF_ACTIVITY__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__PROCEDURE = EMP_LEAF_ACTIVITY__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Creater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__CREATER = EMP_LEAF_ACTIVITY__CREATER;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__CREATED_DATE = EMP_LEAF_ACTIVITY__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Last Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__LAST_MODIFIER = EMP_LEAF_ACTIVITY__LAST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__LAST_MODIFIED_DATE = EMP_LEAF_ACTIVITY__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Clock Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__CLOCK_FLOW = EMP_LEAF_ACTIVITY__CLOCK_FLOW;

	/**
	 * The feature id for the '<em><b>Target Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__TARGET_DATA_FLOWS = EMP_LEAF_ACTIVITY__TARGET_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Source Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__SOURCE_DATA_FLOWS = EMP_LEAF_ACTIVITY__SOURCE_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__REF_FLOWS = EMP_LEAF_ACTIVITY__REF_FLOWS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__IS_DEFAULT = EMP_LEAF_ACTIVITY__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__START_TIME = EMP_LEAF_ACTIVITY__START_TIME;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__DURATION_TIME = EMP_LEAF_ACTIVITY__DURATION_TIME;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__TIME_UNIT = EMP_LEAF_ACTIVITY__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__PRIORITY = EMP_LEAF_ACTIVITY__PRIORITY;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__EMP_DIAGRAM = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY__ASS_FLOWS = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMP Auto Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_ACTIVITY_FEATURE_COUNT = EMP_LEAF_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPManualBatchActivityImpl <em>EMP Manual Batch Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPManualBatchActivityImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPManualBatchActivity()
	 * @generated
	 */
	int EMP_MANUAL_BATCH_ACTIVITY = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__NAME = EMP_BATCH_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__ID = EMP_BATCH_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__CODE = EMP_BATCH_ACTIVITY__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__DESCRIPTION = EMP_BATCH_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__OID = EMP_BATCH_ACTIVITY__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__SOURCE_OBJ_SOURCE_RELATION = EMP_BATCH_ACTIVITY__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__TARGET_OBJ_TARGET_RELATION = EMP_BATCH_ACTIVITY__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__COM_ACTIVITY = EMP_BATCH_ACTIVITY__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__PROCEDURE = EMP_BATCH_ACTIVITY__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Creater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__CREATER = EMP_BATCH_ACTIVITY__CREATER;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__CREATED_DATE = EMP_BATCH_ACTIVITY__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Last Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__LAST_MODIFIER = EMP_BATCH_ACTIVITY__LAST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__LAST_MODIFIED_DATE = EMP_BATCH_ACTIVITY__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Clock Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__CLOCK_FLOW = EMP_BATCH_ACTIVITY__CLOCK_FLOW;

	/**
	 * The feature id for the '<em><b>Target Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__TARGET_DATA_FLOWS = EMP_BATCH_ACTIVITY__TARGET_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Source Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__SOURCE_DATA_FLOWS = EMP_BATCH_ACTIVITY__SOURCE_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__REF_FLOWS = EMP_BATCH_ACTIVITY__REF_FLOWS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__IS_DEFAULT = EMP_BATCH_ACTIVITY__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__START_TIME = EMP_BATCH_ACTIVITY__START_TIME;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__DURATION_TIME = EMP_BATCH_ACTIVITY__DURATION_TIME;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__TIME_UNIT = EMP_BATCH_ACTIVITY__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__PRIORITY = EMP_BATCH_ACTIVITY__PRIORITY;

	/**
	 * The feature id for the '<em><b>Batch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__BATCH_TYPE = EMP_BATCH_ACTIVITY__BATCH_TYPE;

	/**
	 * The feature id for the '<em><b>Bat Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__BAT_START_TIME = EMP_BATCH_ACTIVITY__BAT_START_TIME;

	/**
	 * The feature id for the '<em><b>Bat End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__BAT_END_TIME = EMP_BATCH_ACTIVITY__BAT_END_TIME;

	/**
	 * The feature id for the '<em><b>Restart Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__RESTART_PERIOD = EMP_BATCH_ACTIVITY__RESTART_PERIOD;

	/**
	 * The feature id for the '<em><b>Bat Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__BAT_TIME_UNIT = EMP_BATCH_ACTIVITY__BAT_TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Timer Queue Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__TIMER_QUEUE_FLAG = EMP_BATCH_ACTIVITY__TIMER_QUEUE_FLAG;

	/**
	 * The feature id for the '<em><b>Emergency Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__EMERGENCY_FLAG = EMP_BATCH_ACTIVITY__EMERGENCY_FLAG;

	/**
	 * The feature id for the '<em><b>Interval Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__INTERVAL_VALUE = EMP_BATCH_ACTIVITY__INTERVAL_VALUE;

	/**
	 * The feature id for the '<em><b>Interval Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__INTERVAL_TIME_UNIT = EMP_BATCH_ACTIVITY__INTERVAL_TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__MAX_QUANTITY = EMP_BATCH_ACTIVITY__MAX_QUANTITY;

	/**
	 * The feature id for the '<em><b>Min Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__MIN_QUANTITY = EMP_BATCH_ACTIVITY__MIN_QUANTITY;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__EMP_DIAGRAM = EMP_BATCH_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY__ASS_FLOWS = EMP_BATCH_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMP Manual Batch Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MANUAL_BATCH_ACTIVITY_FEATURE_COUNT = EMP_BATCH_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPAutoBatchActivityImpl <em>EMP Auto Batch Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPAutoBatchActivityImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPAutoBatchActivity()
	 * @generated
	 */
	int EMP_AUTO_BATCH_ACTIVITY = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__NAME = EMP_BATCH_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__ID = EMP_BATCH_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__CODE = EMP_BATCH_ACTIVITY__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__DESCRIPTION = EMP_BATCH_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__OID = EMP_BATCH_ACTIVITY__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__SOURCE_OBJ_SOURCE_RELATION = EMP_BATCH_ACTIVITY__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__TARGET_OBJ_TARGET_RELATION = EMP_BATCH_ACTIVITY__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__COM_ACTIVITY = EMP_BATCH_ACTIVITY__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__PROCEDURE = EMP_BATCH_ACTIVITY__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Creater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__CREATER = EMP_BATCH_ACTIVITY__CREATER;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__CREATED_DATE = EMP_BATCH_ACTIVITY__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Last Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__LAST_MODIFIER = EMP_BATCH_ACTIVITY__LAST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__LAST_MODIFIED_DATE = EMP_BATCH_ACTIVITY__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Clock Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__CLOCK_FLOW = EMP_BATCH_ACTIVITY__CLOCK_FLOW;

	/**
	 * The feature id for the '<em><b>Target Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__TARGET_DATA_FLOWS = EMP_BATCH_ACTIVITY__TARGET_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Source Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__SOURCE_DATA_FLOWS = EMP_BATCH_ACTIVITY__SOURCE_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__REF_FLOWS = EMP_BATCH_ACTIVITY__REF_FLOWS;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__IS_DEFAULT = EMP_BATCH_ACTIVITY__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__START_TIME = EMP_BATCH_ACTIVITY__START_TIME;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__DURATION_TIME = EMP_BATCH_ACTIVITY__DURATION_TIME;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__TIME_UNIT = EMP_BATCH_ACTIVITY__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__PRIORITY = EMP_BATCH_ACTIVITY__PRIORITY;

	/**
	 * The feature id for the '<em><b>Batch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__BATCH_TYPE = EMP_BATCH_ACTIVITY__BATCH_TYPE;

	/**
	 * The feature id for the '<em><b>Bat Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__BAT_START_TIME = EMP_BATCH_ACTIVITY__BAT_START_TIME;

	/**
	 * The feature id for the '<em><b>Bat End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__BAT_END_TIME = EMP_BATCH_ACTIVITY__BAT_END_TIME;

	/**
	 * The feature id for the '<em><b>Restart Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__RESTART_PERIOD = EMP_BATCH_ACTIVITY__RESTART_PERIOD;

	/**
	 * The feature id for the '<em><b>Bat Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__BAT_TIME_UNIT = EMP_BATCH_ACTIVITY__BAT_TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Timer Queue Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__TIMER_QUEUE_FLAG = EMP_BATCH_ACTIVITY__TIMER_QUEUE_FLAG;

	/**
	 * The feature id for the '<em><b>Emergency Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__EMERGENCY_FLAG = EMP_BATCH_ACTIVITY__EMERGENCY_FLAG;

	/**
	 * The feature id for the '<em><b>Interval Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__INTERVAL_VALUE = EMP_BATCH_ACTIVITY__INTERVAL_VALUE;

	/**
	 * The feature id for the '<em><b>Interval Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__INTERVAL_TIME_UNIT = EMP_BATCH_ACTIVITY__INTERVAL_TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__MAX_QUANTITY = EMP_BATCH_ACTIVITY__MAX_QUANTITY;

	/**
	 * The feature id for the '<em><b>Min Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__MIN_QUANTITY = EMP_BATCH_ACTIVITY__MIN_QUANTITY;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__EMP_DIAGRAM = EMP_BATCH_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY__ASS_FLOWS = EMP_BATCH_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMP Auto Batch Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_AUTO_BATCH_ACTIVITY_FEATURE_COUNT = EMP_BATCH_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPMessageImpl <em>EMP Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPMessageImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPMessage()
	 * @generated
	 */
	int EMP_MESSAGE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__NAME = EMP_LEAF_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__ID = EMP_LEAF_PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__CODE = EMP_LEAF_PRODUCT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__DESCRIPTION = EMP_LEAF_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__OID = EMP_LEAF_PRODUCT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__SOURCE_OBJ_SOURCE_RELATION = EMP_LEAF_PRODUCT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__TARGET_OBJ_TARGET_RELATION = EMP_LEAF_PRODUCT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__COM_ACTIVITY = EMP_LEAF_PRODUCT__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Target Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__TARGET_DATA_FLOWS = EMP_LEAF_PRODUCT__TARGET_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Source Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__SOURCE_DATA_FLOWS = EMP_LEAF_PRODUCT__SOURCE_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__REF_FLOWS = EMP_LEAF_PRODUCT__REF_FLOWS;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__ASS_FLOWS = EMP_LEAF_PRODUCT__ASS_FLOWS;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__ATTACHMENT = EMP_LEAF_PRODUCT__ATTACHMENT;

	/**
	 * The feature id for the '<em><b>Io Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__IO_TYPE = EMP_LEAF_PRODUCT__IO_TYPE;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__PERIOD = EMP_LEAF_PRODUCT__PERIOD;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__DURATION_TIME = EMP_LEAF_PRODUCT__DURATION_TIME;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__TIME_UNIT = EMP_LEAF_PRODUCT__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Init Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__INIT_QUEUE = EMP_LEAF_PRODUCT__INIT_QUEUE;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__COST = EMP_LEAF_PRODUCT__COST;

	/**
	 * The feature id for the '<em><b>Top Product Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__TOP_PRODUCT_PACKAGE = EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE__EMP_DIAGRAM = EMP_LEAF_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMP Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MESSAGE_FEATURE_COUNT = EMP_LEAF_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPDiagramImpl <em>EMP Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPDiagramImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPDiagram()
	 * @generated
	 */
	int EMP_DIAGRAM = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__NAME = VpmlPackage.EM_DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__ID = VpmlPackage.EM_DIAGRAM__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__CODE = VpmlPackage.EM_DIAGRAM__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__DESCRIPTION = VpmlPackage.EM_DIAGRAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__OID = VpmlPackage.EM_DIAGRAM__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__SOURCE_OBJ_SOURCE_RELATION = VpmlPackage.EM_DIAGRAM__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__TARGET_OBJ_TARGET_RELATION = VpmlPackage.EM_DIAGRAM__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Creater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__CREATER = VpmlPackage.EM_DIAGRAM__CREATER;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__CREATED_DATE = VpmlPackage.EM_DIAGRAM__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Last Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__LAST_MODIFIER = VpmlPackage.EM_DIAGRAM__LAST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__LAST_MODIFIED_DATE = VpmlPackage.EM_DIAGRAM__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Emo Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__EMO_DIAGRAMS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emr Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__EMR_DIAGRAMS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emc Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__EMC_DIAGRAM = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Emi Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__EMI_DIAGRAM = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Started Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__STARTED_TIME = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__DURATION_TIME = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__TIME_UNIT = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>In Ors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__IN_ORS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Product Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__PRODUCT_PACKAGES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Out Ands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__OUT_ANDS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Data Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__DATA_FLOWS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Clock Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__CLOCK_FLOWS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__CLOCKS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>In Ands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__IN_ANDS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Normal Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__NORMAL_ACTIVITIES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Comp Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__COMP_ACTIVITIES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Out Ors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__OUT_ORS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__ASS_FLOWS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__REF_FLOWS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Others</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__OTHERS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__ARTIFACTS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__FORMS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__DOCUMENTS = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Auto Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__AUTO_ACTIVITIES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__MESSAGES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Manual Batch Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__MANUAL_BATCH_ACTIVITIES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Auto Batch Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__AUTO_BATCH_ACTIVITIES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Machine Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__MACHINE_TYPES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__ROLES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Location Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__LOCATION_TYPES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Tool Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__TOOL_TYPES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Resource Group Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__RESOURCE_GROUP_TYPES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Mile Stones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM__MILE_STONES = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 32;

	/**
	 * The number of structural features of the '<em>EMP Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_DIAGRAM_FEATURE_COUNT = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 33;

	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPMileStoneImpl <em>EMP Mile Stone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPMileStoneImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPMileStone()
	 * @generated
	 */
	int EMP_MILE_STONE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MILE_STONE__NAME = EMP_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MILE_STONE__ID = EMP_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MILE_STONE__CODE = EMP_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MILE_STONE__DESCRIPTION = EMP_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MILE_STONE__OID = EMP_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MILE_STONE__SOURCE_OBJ_SOURCE_RELATION = EMP_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MILE_STONE__TARGET_OBJ_TARGET_RELATION = EMP_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MILE_STONE__COM_ACTIVITY = EMP_OBJECT__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MILE_STONE__PROCESS = EMP_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MILE_STONE__DATA_FLOWS = EMP_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MILE_STONE__EMP_DIAGRAM = EMP_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EMP Mile Stone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_MILE_STONE_FEATURE_COUNT = EMP_OBJECT_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link vpml.processpackage.impl.EMPFormImpl <em>EMP Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.processpackage.impl.EMPFormImpl
	 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPForm()
	 * @generated
	 */
	int EMP_FORM = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__NAME = EMP_LEAF_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__ID = EMP_LEAF_PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__CODE = EMP_LEAF_PRODUCT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__DESCRIPTION = EMP_LEAF_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__OID = EMP_LEAF_PRODUCT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__SOURCE_OBJ_SOURCE_RELATION = EMP_LEAF_PRODUCT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__TARGET_OBJ_TARGET_RELATION = EMP_LEAF_PRODUCT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Com Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__COM_ACTIVITY = EMP_LEAF_PRODUCT__COM_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Target Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__TARGET_DATA_FLOWS = EMP_LEAF_PRODUCT__TARGET_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Source Data Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__SOURCE_DATA_FLOWS = EMP_LEAF_PRODUCT__SOURCE_DATA_FLOWS;

	/**
	 * The feature id for the '<em><b>Ref Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__REF_FLOWS = EMP_LEAF_PRODUCT__REF_FLOWS;

	/**
	 * The feature id for the '<em><b>Ass Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__ASS_FLOWS = EMP_LEAF_PRODUCT__ASS_FLOWS;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__ATTACHMENT = EMP_LEAF_PRODUCT__ATTACHMENT;

	/**
	 * The feature id for the '<em><b>Io Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__IO_TYPE = EMP_LEAF_PRODUCT__IO_TYPE;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__PERIOD = EMP_LEAF_PRODUCT__PERIOD;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__DURATION_TIME = EMP_LEAF_PRODUCT__DURATION_TIME;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__TIME_UNIT = EMP_LEAF_PRODUCT__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Init Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__INIT_QUEUE = EMP_LEAF_PRODUCT__INIT_QUEUE;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__COST = EMP_LEAF_PRODUCT__COST;

	/**
	 * The feature id for the '<em><b>Top Product Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__TOP_PRODUCT_PACKAGE = EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__EMP_DIAGRAM = EMP_LEAF_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Form Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM__FORM_TYPE = EMP_LEAF_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMP Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMP_FORM_FEATURE_COUNT = EMP_LEAF_PRODUCT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPNormalActivity <em>EMP Normal Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Normal Activity</em>'.
	 * @see vpml.processpackage.EMPNormalActivity
	 * @generated
	 */
	EClass getEMPNormalActivity();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPNormalActivity#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPNormalActivity#getEmpDiagram()
	 * @see #getEMPNormalActivity()
	 * @generated
	 */
	EReference getEMPNormalActivity_EmpDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPNormalActivity#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ass Flows</em>'.
	 * @see vpml.processpackage.EMPNormalActivity#getAssFlows()
	 * @see #getEMPNormalActivity()
	 * @generated
	 */
	EReference getEMPNormalActivity_AssFlows();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPBatchActivity <em>EMP Batch Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Batch Activity</em>'.
	 * @see vpml.processpackage.EMPBatchActivity
	 * @generated
	 */
	EClass getEMPBatchActivity();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPBatchActivity#getBatchType <em>Batch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Type</em>'.
	 * @see vpml.processpackage.EMPBatchActivity#getBatchType()
	 * @see #getEMPBatchActivity()
	 * @generated
	 */
	EAttribute getEMPBatchActivity_BatchType();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPBatchActivity#getBatStartTime <em>Bat Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bat Start Time</em>'.
	 * @see vpml.processpackage.EMPBatchActivity#getBatStartTime()
	 * @see #getEMPBatchActivity()
	 * @generated
	 */
	EAttribute getEMPBatchActivity_BatStartTime();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPBatchActivity#getBatEndTime <em>Bat End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bat End Time</em>'.
	 * @see vpml.processpackage.EMPBatchActivity#getBatEndTime()
	 * @see #getEMPBatchActivity()
	 * @generated
	 */
	EAttribute getEMPBatchActivity_BatEndTime();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPBatchActivity#getRestartPeriod <em>Restart Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Period</em>'.
	 * @see vpml.processpackage.EMPBatchActivity#getRestartPeriod()
	 * @see #getEMPBatchActivity()
	 * @generated
	 */
	EAttribute getEMPBatchActivity_RestartPeriod();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPBatchActivity#getBatTimeUnit <em>Bat Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bat Time Unit</em>'.
	 * @see vpml.processpackage.EMPBatchActivity#getBatTimeUnit()
	 * @see #getEMPBatchActivity()
	 * @generated
	 */
	EAttribute getEMPBatchActivity_BatTimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPBatchActivity#getTimerQueueFlag <em>Timer Queue Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timer Queue Flag</em>'.
	 * @see vpml.processpackage.EMPBatchActivity#getTimerQueueFlag()
	 * @see #getEMPBatchActivity()
	 * @generated
	 */
	EAttribute getEMPBatchActivity_TimerQueueFlag();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPBatchActivity#getEmergencyFlag <em>Emergency Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emergency Flag</em>'.
	 * @see vpml.processpackage.EMPBatchActivity#getEmergencyFlag()
	 * @see #getEMPBatchActivity()
	 * @generated
	 */
	EAttribute getEMPBatchActivity_EmergencyFlag();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPBatchActivity#getIntervalValue <em>Interval Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Value</em>'.
	 * @see vpml.processpackage.EMPBatchActivity#getIntervalValue()
	 * @see #getEMPBatchActivity()
	 * @generated
	 */
	EAttribute getEMPBatchActivity_IntervalValue();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPBatchActivity#getIntervalTimeUnit <em>Interval Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Time Unit</em>'.
	 * @see vpml.processpackage.EMPBatchActivity#getIntervalTimeUnit()
	 * @see #getEMPBatchActivity()
	 * @generated
	 */
	EAttribute getEMPBatchActivity_IntervalTimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPBatchActivity#getMaxQuantity <em>Max Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Quantity</em>'.
	 * @see vpml.processpackage.EMPBatchActivity#getMaxQuantity()
	 * @see #getEMPBatchActivity()
	 * @generated
	 */
	EAttribute getEMPBatchActivity_MaxQuantity();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPBatchActivity#getMinQuantity <em>Min Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Quantity</em>'.
	 * @see vpml.processpackage.EMPBatchActivity#getMinQuantity()
	 * @see #getEMPBatchActivity()
	 * @generated
	 */
	EAttribute getEMPBatchActivity_MinQuantity();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPActivity <em>EMP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Activity</em>'.
	 * @see vpml.processpackage.EMPActivity
	 * @generated
	 */
	EClass getEMPActivity();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPActivity#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Procedure</em>'.
	 * @see vpml.processpackage.EMPActivity#getProcedure()
	 * @see #getEMPActivity()
	 * @generated
	 */
	EAttribute getEMPActivity_Procedure();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPActivity#getCreater <em>Creater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creater</em>'.
	 * @see vpml.processpackage.EMPActivity#getCreater()
	 * @see #getEMPActivity()
	 * @generated
	 */
	EAttribute getEMPActivity_Creater();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPActivity#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see vpml.processpackage.EMPActivity#getCreatedDate()
	 * @see #getEMPActivity()
	 * @generated
	 */
	EAttribute getEMPActivity_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPActivity#getLastModifier <em>Last Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modifier</em>'.
	 * @see vpml.processpackage.EMPActivity#getLastModifier()
	 * @see #getEMPActivity()
	 * @generated
	 */
	EAttribute getEMPActivity_LastModifier();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPActivity#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see vpml.processpackage.EMPActivity#getLastModifiedDate()
	 * @see #getEMPActivity()
	 * @generated
	 */
	EAttribute getEMPActivity_LastModifiedDate();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPActivity#getClockFlow <em>Clock Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock Flow</em>'.
	 * @see vpml.processpackage.EMPActivity#getClockFlow()
	 * @see #getEMPActivity()
	 * @generated
	 */
	EReference getEMPActivity_ClockFlow();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPActivity#getTargetDataFlows <em>Target Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Data Flows</em>'.
	 * @see vpml.processpackage.EMPActivity#getTargetDataFlows()
	 * @see #getEMPActivity()
	 * @generated
	 */
	EReference getEMPActivity_TargetDataFlows();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPActivity#getSourceDataFlows <em>Source Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Data Flows</em>'.
	 * @see vpml.processpackage.EMPActivity#getSourceDataFlows()
	 * @see #getEMPActivity()
	 * @generated
	 */
	EReference getEMPActivity_SourceDataFlows();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPActivity#getRefFlows <em>Ref Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Flows</em>'.
	 * @see vpml.processpackage.EMPActivity#getRefFlows()
	 * @see #getEMPActivity()
	 * @generated
	 */
	EReference getEMPActivity_RefFlows();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPObject <em>EMP Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Object</em>'.
	 * @see vpml.processpackage.EMPObject
	 * @generated
	 */
	EClass getEMPObject();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPObject#getComActivity <em>Com Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Com Activity</em>'.
	 * @see vpml.processpackage.EMPObject#getComActivity()
	 * @see #getEMPObject()
	 * @generated
	 */
	EReference getEMPObject_ComActivity();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPFlow <em>EMP Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Flow</em>'.
	 * @see vpml.processpackage.EMPFlow
	 * @generated
	 */
	EClass getEMPFlow();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPDataFlow <em>EMP Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Data Flow</em>'.
	 * @see vpml.processpackage.EMPDataFlow
	 * @generated
	 */
	EClass getEMPDataFlow();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPDataFlow#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see vpml.processpackage.EMPDataFlow#getProbability()
	 * @see #getEMPDataFlow()
	 * @generated
	 */
	EAttribute getEMPDataFlow_Probability();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPDataFlow#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPDataFlow#getEmpDiagram()
	 * @see #getEMPDataFlow()
	 * @generated
	 */
	EReference getEMPDataFlow_EmpDiagram();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPDataFlow#getTargetProduct <em>Target Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Product</em>'.
	 * @see vpml.processpackage.EMPDataFlow#getTargetProduct()
	 * @see #getEMPDataFlow()
	 * @generated
	 */
	EReference getEMPDataFlow_TargetProduct();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPDataFlow#getTargetActivity <em>Target Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Activity</em>'.
	 * @see vpml.processpackage.EMPDataFlow#getTargetActivity()
	 * @see #getEMPDataFlow()
	 * @generated
	 */
	EReference getEMPDataFlow_TargetActivity();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPDataFlow#getSourceProduct <em>Source Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Product</em>'.
	 * @see vpml.processpackage.EMPDataFlow#getSourceProduct()
	 * @see #getEMPDataFlow()
	 * @generated
	 */
	EReference getEMPDataFlow_SourceProduct();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPDataFlow#getSourceActivity <em>Source Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Activity</em>'.
	 * @see vpml.processpackage.EMPDataFlow#getSourceActivity()
	 * @see #getEMPDataFlow()
	 * @generated
	 */
	EReference getEMPDataFlow_SourceActivity();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPDataFlow#getSourceInAnd <em>Source In And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source In And</em>'.
	 * @see vpml.processpackage.EMPDataFlow#getSourceInAnd()
	 * @see #getEMPDataFlow()
	 * @generated
	 */
	EReference getEMPDataFlow_SourceInAnd();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPDataFlow#getTargetInAnd <em>Target In And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target In And</em>'.
	 * @see vpml.processpackage.EMPDataFlow#getTargetInAnd()
	 * @see #getEMPDataFlow()
	 * @generated
	 */
	EReference getEMPDataFlow_TargetInAnd();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPDataFlow#getTargetInOr <em>Target In Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target In Or</em>'.
	 * @see vpml.processpackage.EMPDataFlow#getTargetInOr()
	 * @see #getEMPDataFlow()
	 * @generated
	 */
	EReference getEMPDataFlow_TargetInOr();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPDataFlow#getSourceInOr <em>Source In Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source In Or</em>'.
	 * @see vpml.processpackage.EMPDataFlow#getSourceInOr()
	 * @see #getEMPDataFlow()
	 * @generated
	 */
	EReference getEMPDataFlow_SourceInOr();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPDataFlow#getSourceOutAnd <em>Source Out And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Out And</em>'.
	 * @see vpml.processpackage.EMPDataFlow#getSourceOutAnd()
	 * @see #getEMPDataFlow()
	 * @generated
	 */
	EReference getEMPDataFlow_SourceOutAnd();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPDataFlow#getTargetOutAnd <em>Target Out And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Out And</em>'.
	 * @see vpml.processpackage.EMPDataFlow#getTargetOutAnd()
	 * @see #getEMPDataFlow()
	 * @generated
	 */
	EReference getEMPDataFlow_TargetOutAnd();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPDataFlow#getSourceOutOr <em>Source Out Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Out Or</em>'.
	 * @see vpml.processpackage.EMPDataFlow#getSourceOutOr()
	 * @see #getEMPDataFlow()
	 * @generated
	 */
	EReference getEMPDataFlow_SourceOutOr();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPDataFlow#getTargetOutOr <em>Target Out Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Out Or</em>'.
	 * @see vpml.processpackage.EMPDataFlow#getTargetOutOr()
	 * @see #getEMPDataFlow()
	 * @generated
	 */
	EReference getEMPDataFlow_TargetOutOr();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPDataFlow#getMileStone <em>Mile Stone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mile Stone</em>'.
	 * @see vpml.processpackage.EMPDataFlow#getMileStone()
	 * @see #getEMPDataFlow()
	 * @generated
	 */
	EReference getEMPDataFlow_MileStone();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPAssFlow <em>EMP Ass Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Ass Flow</em>'.
	 * @see vpml.processpackage.EMPAssFlow
	 * @generated
	 */
	EClass getEMPAssFlow();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPAssFlow#getResourceGroupType <em>Resource Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Group Type</em>'.
	 * @see vpml.processpackage.EMPAssFlow#getResourceGroupType()
	 * @see #getEMPAssFlow()
	 * @generated
	 */
	EReference getEMPAssFlow_ResourceGroupType();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPAssFlow#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPAssFlow#getEmpDiagram()
	 * @see #getEMPAssFlow()
	 * @generated
	 */
	EReference getEMPAssFlow_EmpDiagram();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPAssFlow#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see vpml.processpackage.EMPAssFlow#getProduct()
	 * @see #getEMPAssFlow()
	 * @generated
	 */
	EReference getEMPAssFlow_Product();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPAssFlow#getLocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location Type</em>'.
	 * @see vpml.processpackage.EMPAssFlow#getLocationType()
	 * @see #getEMPAssFlow()
	 * @generated
	 */
	EReference getEMPAssFlow_LocationType();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPAssFlow#getMachineType <em>Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Machine Type</em>'.
	 * @see vpml.processpackage.EMPAssFlow#getMachineType()
	 * @see #getEMPAssFlow()
	 * @generated
	 */
	EReference getEMPAssFlow_MachineType();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPAssFlow#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see vpml.processpackage.EMPAssFlow#getRole()
	 * @see #getEMPAssFlow()
	 * @generated
	 */
	EReference getEMPAssFlow_Role();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPAssFlow#getToolType <em>Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool Type</em>'.
	 * @see vpml.processpackage.EMPAssFlow#getToolType()
	 * @see #getEMPAssFlow()
	 * @generated
	 */
	EReference getEMPAssFlow_ToolType();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPAssFlow#getAutoActivity <em>Auto Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auto Activity</em>'.
	 * @see vpml.processpackage.EMPAssFlow#getAutoActivity()
	 * @see #getEMPAssFlow()
	 * @generated
	 */
	EReference getEMPAssFlow_AutoActivity();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPAssFlow#getNormalActivity <em>Normal Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Normal Activity</em>'.
	 * @see vpml.processpackage.EMPAssFlow#getNormalActivity()
	 * @see #getEMPAssFlow()
	 * @generated
	 */
	EReference getEMPAssFlow_NormalActivity();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPAssFlow#getCompActivity <em>Comp Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comp Activity</em>'.
	 * @see vpml.processpackage.EMPAssFlow#getCompActivity()
	 * @see #getEMPAssFlow()
	 * @generated
	 */
	EReference getEMPAssFlow_CompActivity();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPAssFlow#getManualBatchActivity <em>Manual Batch Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manual Batch Activity</em>'.
	 * @see vpml.processpackage.EMPAssFlow#getManualBatchActivity()
	 * @see #getEMPAssFlow()
	 * @generated
	 */
	EReference getEMPAssFlow_ManualBatchActivity();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPAssFlow#getAutoBatchActiviy <em>Auto Batch Activiy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auto Batch Activiy</em>'.
	 * @see vpml.processpackage.EMPAssFlow#getAutoBatchActiviy()
	 * @see #getEMPAssFlow()
	 * @generated
	 */
	EReference getEMPAssFlow_AutoBatchActiviy();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPClockFlow <em>EMP Clock Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Clock Flow</em>'.
	 * @see vpml.processpackage.EMPClockFlow
	 * @generated
	 */
	EClass getEMPClockFlow();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPClockFlow#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see vpml.processpackage.EMPClockFlow#getActivity()
	 * @see #getEMPClockFlow()
	 * @generated
	 */
	EReference getEMPClockFlow_Activity();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPClockFlow#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see vpml.processpackage.EMPClockFlow#getClock()
	 * @see #getEMPClockFlow()
	 * @generated
	 */
	EReference getEMPClockFlow_Clock();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPClockFlow#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPClockFlow#getEmpDiagram()
	 * @see #getEMPClockFlow()
	 * @generated
	 */
	EReference getEMPClockFlow_EmpDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPLogicalConnector <em>EMP Logical Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Logical Connector</em>'.
	 * @see vpml.processpackage.EMPLogicalConnector
	 * @generated
	 */
	EClass getEMPLogicalConnector();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPInAnd <em>EMP In And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP In And</em>'.
	 * @see vpml.processpackage.EMPInAnd
	 * @generated
	 */
	EClass getEMPInAnd();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPInAnd#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPInAnd#getEmpDiagram()
	 * @see #getEMPInAnd()
	 * @generated
	 */
	EReference getEMPInAnd_EmpDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPInAnd#getSourceFlows <em>Source Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Flows</em>'.
	 * @see vpml.processpackage.EMPInAnd#getSourceFlows()
	 * @see #getEMPInAnd()
	 * @generated
	 */
	EReference getEMPInAnd_SourceFlows();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPInAnd#getTargetFlows <em>Target Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Flows</em>'.
	 * @see vpml.processpackage.EMPInAnd#getTargetFlows()
	 * @see #getEMPInAnd()
	 * @generated
	 */
	EReference getEMPInAnd_TargetFlows();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPOutAnd <em>EMP Out And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Out And</em>'.
	 * @see vpml.processpackage.EMPOutAnd
	 * @generated
	 */
	EClass getEMPOutAnd();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPOutAnd#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPOutAnd#getEmpDiagram()
	 * @see #getEMPOutAnd()
	 * @generated
	 */
	EReference getEMPOutAnd_EmpDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPOutAnd#getSourceFlows <em>Source Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Flows</em>'.
	 * @see vpml.processpackage.EMPOutAnd#getSourceFlows()
	 * @see #getEMPOutAnd()
	 * @generated
	 */
	EReference getEMPOutAnd_SourceFlows();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPOutAnd#getTargetFlows <em>Target Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Flows</em>'.
	 * @see vpml.processpackage.EMPOutAnd#getTargetFlows()
	 * @see #getEMPOutAnd()
	 * @generated
	 */
	EReference getEMPOutAnd_TargetFlows();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPInOr <em>EMP In Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP In Or</em>'.
	 * @see vpml.processpackage.EMPInOr
	 * @generated
	 */
	EClass getEMPInOr();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPInOr#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPInOr#getEmpDiagram()
	 * @see #getEMPInOr()
	 * @generated
	 */
	EReference getEMPInOr_EmpDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPInOr#getTargetFlows <em>Target Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Flows</em>'.
	 * @see vpml.processpackage.EMPInOr#getTargetFlows()
	 * @see #getEMPInOr()
	 * @generated
	 */
	EReference getEMPInOr_TargetFlows();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPInOr#getSourceFlows <em>Source Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Flows</em>'.
	 * @see vpml.processpackage.EMPInOr#getSourceFlows()
	 * @see #getEMPInOr()
	 * @generated
	 */
	EReference getEMPInOr_SourceFlows();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPOutOr <em>EMP Out Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Out Or</em>'.
	 * @see vpml.processpackage.EMPOutOr
	 * @generated
	 */
	EClass getEMPOutOr();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPOutOr#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPOutOr#getEmpDiagram()
	 * @see #getEMPOutOr()
	 * @generated
	 */
	EReference getEMPOutOr_EmpDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPOutOr#getSourceFlows <em>Source Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Flows</em>'.
	 * @see vpml.processpackage.EMPOutOr#getSourceFlows()
	 * @see #getEMPOutOr()
	 * @generated
	 */
	EReference getEMPOutOr_SourceFlows();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPOutOr#getTargetFlows <em>Target Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Flows</em>'.
	 * @see vpml.processpackage.EMPOutOr#getTargetFlows()
	 * @see #getEMPOutOr()
	 * @generated
	 */
	EReference getEMPOutOr_TargetFlows();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPClock <em>EMP Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Clock</em>'.
	 * @see vpml.processpackage.EMPClock
	 * @generated
	 */
	EClass getEMPClock();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPClock#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see vpml.processpackage.EMPClock#getStartTime()
	 * @see #getEMPClock()
	 * @generated
	 */
	EAttribute getEMPClock_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPClock#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see vpml.processpackage.EMPClock#getEndTime()
	 * @see #getEMPClock()
	 * @generated
	 */
	EAttribute getEMPClock_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPClock#getRestartPeriod <em>Restart Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Period</em>'.
	 * @see vpml.processpackage.EMPClock#getRestartPeriod()
	 * @see #getEMPClock()
	 * @generated
	 */
	EAttribute getEMPClock_RestartPeriod();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPClock#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see vpml.processpackage.EMPClock#getTimeUnit()
	 * @see #getEMPClock()
	 * @generated
	 */
	EAttribute getEMPClock_TimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPClock#getTqFlag <em>Tq Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tq Flag</em>'.
	 * @see vpml.processpackage.EMPClock#getTqFlag()
	 * @see #getEMPClock()
	 * @generated
	 */
	EAttribute getEMPClock_TqFlag();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPClock#getEFlag <em>EFlag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EFlag</em>'.
	 * @see vpml.processpackage.EMPClock#getEFlag()
	 * @see #getEMPClock()
	 * @generated
	 */
	EAttribute getEMPClock_EFlag();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPClock#getIntervalValue <em>Interval Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Value</em>'.
	 * @see vpml.processpackage.EMPClock#getIntervalValue()
	 * @see #getEMPClock()
	 * @generated
	 */
	EAttribute getEMPClock_IntervalValue();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPClock#getIntervalUnit <em>Interval Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Unit</em>'.
	 * @see vpml.processpackage.EMPClock#getIntervalUnit()
	 * @see #getEMPClock()
	 * @generated
	 */
	EAttribute getEMPClock_IntervalUnit();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPClock#getClockFlows <em>Clock Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clock Flows</em>'.
	 * @see vpml.processpackage.EMPClock#getClockFlows()
	 * @see #getEMPClock()
	 * @generated
	 */
	EReference getEMPClock_ClockFlows();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPClock#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPClock#getEmpDiagram()
	 * @see #getEMPClock()
	 * @generated
	 */
	EReference getEMPClock_EmpDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPCompActivity <em>EMP Comp Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Comp Activity</em>'.
	 * @see vpml.processpackage.EMPCompActivity
	 * @generated
	 */
	EClass getEMPCompActivity();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPCompActivity#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPCompActivity#getEmpDiagram()
	 * @see #getEMPCompActivity()
	 * @generated
	 */
	EReference getEMPCompActivity_EmpDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPCompActivity#getLeafObjects <em>Leaf Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Leaf Objects</em>'.
	 * @see vpml.processpackage.EMPCompActivity#getLeafObjects()
	 * @see #getEMPCompActivity()
	 * @generated
	 */
	EReference getEMPCompActivity_LeafObjects();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPCompActivity#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ass Flows</em>'.
	 * @see vpml.processpackage.EMPCompActivity#getAssFlows()
	 * @see #getEMPCompActivity()
	 * @generated
	 */
	EReference getEMPCompActivity_AssFlows();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPInConnector <em>EMP In Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP In Connector</em>'.
	 * @see vpml.processpackage.EMPInConnector
	 * @generated
	 */
	EClass getEMPInConnector();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPOutConnector <em>EMP Out Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Out Connector</em>'.
	 * @see vpml.processpackage.EMPOutConnector
	 * @generated
	 */
	EClass getEMPOutConnector();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPLeafActivity <em>EMP Leaf Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Leaf Activity</em>'.
	 * @see vpml.processpackage.EMPLeafActivity
	 * @generated
	 */
	EClass getEMPLeafActivity();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPLeafActivity#getIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see vpml.processpackage.EMPLeafActivity#getIsDefault()
	 * @see #getEMPLeafActivity()
	 * @generated
	 */
	EAttribute getEMPLeafActivity_IsDefault();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPLeafActivity#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see vpml.processpackage.EMPLeafActivity#getStartTime()
	 * @see #getEMPLeafActivity()
	 * @generated
	 */
	EAttribute getEMPLeafActivity_StartTime();

	/**
	 * Returns the meta object for the containment reference '{@link vpml.processpackage.EMPLeafActivity#getDurationTime <em>Duration Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration Time</em>'.
	 * @see vpml.processpackage.EMPLeafActivity#getDurationTime()
	 * @see #getEMPLeafActivity()
	 * @generated
	 */
	EReference getEMPLeafActivity_DurationTime();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPLeafActivity#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see vpml.processpackage.EMPLeafActivity#getTimeUnit()
	 * @see #getEMPLeafActivity()
	 * @generated
	 */
	EAttribute getEMPLeafActivity_TimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPLeafActivity#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see vpml.processpackage.EMPLeafActivity#getPriority()
	 * @see #getEMPLeafActivity()
	 * @generated
	 */
	EAttribute getEMPLeafActivity_Priority();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPProduct <em>EMP Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Product</em>'.
	 * @see vpml.processpackage.EMPProduct
	 * @generated
	 */
	EClass getEMPProduct();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPProduct#getTargetDataFlows <em>Target Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Data Flows</em>'.
	 * @see vpml.processpackage.EMPProduct#getTargetDataFlows()
	 * @see #getEMPProduct()
	 * @generated
	 */
	EReference getEMPProduct_TargetDataFlows();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPProduct#getSourceDataFlows <em>Source Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Data Flows</em>'.
	 * @see vpml.processpackage.EMPProduct#getSourceDataFlows()
	 * @see #getEMPProduct()
	 * @generated
	 */
	EReference getEMPProduct_SourceDataFlows();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPProduct#getRefFlows <em>Ref Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Flows</em>'.
	 * @see vpml.processpackage.EMPProduct#getRefFlows()
	 * @see #getEMPProduct()
	 * @generated
	 */
	EReference getEMPProduct_RefFlows();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPProduct#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ass Flows</em>'.
	 * @see vpml.processpackage.EMPProduct#getAssFlows()
	 * @see #getEMPProduct()
	 * @generated
	 */
	EReference getEMPProduct_AssFlows();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPProductPackage <em>EMP Product Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Product Package</em>'.
	 * @see vpml.processpackage.EMPProductPackage
	 * @generated
	 */
	EClass getEMPProductPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPProductPackage#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Packages</em>'.
	 * @see vpml.processpackage.EMPProductPackage#getSubPackages()
	 * @see #getEMPProductPackage()
	 * @generated
	 */
	EReference getEMPProductPackage_SubPackages();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPProductPackage#getTopPackage <em>Top Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Top Package</em>'.
	 * @see vpml.processpackage.EMPProductPackage#getTopPackage()
	 * @see #getEMPProductPackage()
	 * @generated
	 */
	EReference getEMPProductPackage_TopPackage();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPProductPackage#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPProductPackage#getEmpDiagram()
	 * @see #getEMPProductPackage()
	 * @generated
	 */
	EReference getEMPProductPackage_EmpDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPProductPackage#getLeafProducts <em>Leaf Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Leaf Products</em>'.
	 * @see vpml.processpackage.EMPProductPackage#getLeafProducts()
	 * @see #getEMPProductPackage()
	 * @generated
	 */
	EReference getEMPProductPackage_LeafProducts();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPLeafProduct <em>EMP Leaf Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Leaf Product</em>'.
	 * @see vpml.processpackage.EMPLeafProduct
	 * @generated
	 */
	EClass getEMPLeafProduct();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPLeafProduct#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attachment</em>'.
	 * @see vpml.processpackage.EMPLeafProduct#getAttachment()
	 * @see #getEMPLeafProduct()
	 * @generated
	 */
	EAttribute getEMPLeafProduct_Attachment();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPLeafProduct#getIoType <em>Io Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Io Type</em>'.
	 * @see vpml.processpackage.EMPLeafProduct#getIoType()
	 * @see #getEMPLeafProduct()
	 * @generated
	 */
	EAttribute getEMPLeafProduct_IoType();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPLeafProduct#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see vpml.processpackage.EMPLeafProduct#getPeriod()
	 * @see #getEMPLeafProduct()
	 * @generated
	 */
	EAttribute getEMPLeafProduct_Period();

	/**
	 * Returns the meta object for the containment reference '{@link vpml.processpackage.EMPLeafProduct#getDurationTime <em>Duration Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration Time</em>'.
	 * @see vpml.processpackage.EMPLeafProduct#getDurationTime()
	 * @see #getEMPLeafProduct()
	 * @generated
	 */
	EReference getEMPLeafProduct_DurationTime();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPLeafProduct#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see vpml.processpackage.EMPLeafProduct#getTimeUnit()
	 * @see #getEMPLeafProduct()
	 * @generated
	 */
	EAttribute getEMPLeafProduct_TimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPLeafProduct#getInitQueue <em>Init Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Queue</em>'.
	 * @see vpml.processpackage.EMPLeafProduct#getInitQueue()
	 * @see #getEMPLeafProduct()
	 * @generated
	 */
	EAttribute getEMPLeafProduct_InitQueue();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPLeafProduct#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see vpml.processpackage.EMPLeafProduct#getCost()
	 * @see #getEMPLeafProduct()
	 * @generated
	 */
	EAttribute getEMPLeafProduct_Cost();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPLeafProduct#getTopProductPackage <em>Top Product Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Top Product Package</em>'.
	 * @see vpml.processpackage.EMPLeafProduct#getTopProductPackage()
	 * @see #getEMPLeafProduct()
	 * @generated
	 */
	EReference getEMPLeafProduct_TopProductPackage();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPRefFlow <em>EMP Ref Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Ref Flow</em>'.
	 * @see vpml.processpackage.EMPRefFlow
	 * @generated
	 */
	EClass getEMPRefFlow();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPRefFlow#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see vpml.processpackage.EMPRefFlow#getActivity()
	 * @see #getEMPRefFlow()
	 * @generated
	 */
	EReference getEMPRefFlow_Activity();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPRefFlow#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see vpml.processpackage.EMPRefFlow#getProduct()
	 * @see #getEMPRefFlow()
	 * @generated
	 */
	EReference getEMPRefFlow_Product();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPRefFlow#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPRefFlow#getEmpDiagram()
	 * @see #getEMPRefFlow()
	 * @generated
	 */
	EReference getEMPRefFlow_EmpDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPDocument <em>EMP Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Document</em>'.
	 * @see vpml.processpackage.EMPDocument
	 * @generated
	 */
	EClass getEMPDocument();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPDocument#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPDocument#getEmpDiagram()
	 * @see #getEMPDocument()
	 * @generated
	 */
	EReference getEMPDocument_EmpDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPArtifact <em>EMP Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Artifact</em>'.
	 * @see vpml.processpackage.EMPArtifact
	 * @generated
	 */
	EClass getEMPArtifact();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPArtifact#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPArtifact#getEmpDiagram()
	 * @see #getEMPArtifact()
	 * @generated
	 */
	EReference getEMPArtifact_EmpDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPOther <em>EMP Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Other</em>'.
	 * @see vpml.processpackage.EMPOther
	 * @generated
	 */
	EClass getEMPOther();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPOther#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPOther#getEmpDiagram()
	 * @see #getEMPOther()
	 * @generated
	 */
	EReference getEMPOther_EmpDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPAttributeItem <em>EMP Attribute Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Attribute Item</em>'.
	 * @see vpml.processpackage.EMPAttributeItem
	 * @generated
	 */
	EClass getEMPAttributeItem();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPAttributeItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see vpml.processpackage.EMPAttributeItem#getType()
	 * @see #getEMPAttributeItem()
	 * @generated
	 */
	EAttribute getEMPAttributeItem_Type();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPAttributeItem#get_depend <em>depend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>depend</em>'.
	 * @see vpml.processpackage.EMPAttributeItem#get_depend()
	 * @see #getEMPAttributeItem()
	 * @generated
	 */
	EAttribute getEMPAttributeItem__depend();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPAutoActivity <em>EMP Auto Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Auto Activity</em>'.
	 * @see vpml.processpackage.EMPAutoActivity
	 * @generated
	 */
	EClass getEMPAutoActivity();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPAutoActivity#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPAutoActivity#getEmpDiagram()
	 * @see #getEMPAutoActivity()
	 * @generated
	 */
	EReference getEMPAutoActivity_EmpDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPAutoActivity#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ass Flows</em>'.
	 * @see vpml.processpackage.EMPAutoActivity#getAssFlows()
	 * @see #getEMPAutoActivity()
	 * @generated
	 */
	EReference getEMPAutoActivity_AssFlows();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPManualBatchActivity <em>EMP Manual Batch Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Manual Batch Activity</em>'.
	 * @see vpml.processpackage.EMPManualBatchActivity
	 * @generated
	 */
	EClass getEMPManualBatchActivity();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPManualBatchActivity#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPManualBatchActivity#getEmpDiagram()
	 * @see #getEMPManualBatchActivity()
	 * @generated
	 */
	EReference getEMPManualBatchActivity_EmpDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPManualBatchActivity#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ass Flows</em>'.
	 * @see vpml.processpackage.EMPManualBatchActivity#getAssFlows()
	 * @see #getEMPManualBatchActivity()
	 * @generated
	 */
	EReference getEMPManualBatchActivity_AssFlows();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPAutoBatchActivity <em>EMP Auto Batch Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Auto Batch Activity</em>'.
	 * @see vpml.processpackage.EMPAutoBatchActivity
	 * @generated
	 */
	EClass getEMPAutoBatchActivity();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPAutoBatchActivity#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPAutoBatchActivity#getEmpDiagram()
	 * @see #getEMPAutoBatchActivity()
	 * @generated
	 */
	EReference getEMPAutoBatchActivity_EmpDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPAutoBatchActivity#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ass Flows</em>'.
	 * @see vpml.processpackage.EMPAutoBatchActivity#getAssFlows()
	 * @see #getEMPAutoBatchActivity()
	 * @generated
	 */
	EReference getEMPAutoBatchActivity_AssFlows();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPMessage <em>EMP Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Message</em>'.
	 * @see vpml.processpackage.EMPMessage
	 * @generated
	 */
	EClass getEMPMessage();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPMessage#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPMessage#getEmpDiagram()
	 * @see #getEMPMessage()
	 * @generated
	 */
	EReference getEMPMessage_EmpDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPDiagram <em>EMP Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Diagram</em>'.
	 * @see vpml.processpackage.EMPDiagram
	 * @generated
	 */
	EClass getEMPDiagram();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPDiagram#getEmoDiagrams <em>Emo Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emo Diagrams</em>'.
	 * @see vpml.processpackage.EMPDiagram#getEmoDiagrams()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_EmoDiagrams();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPDiagram#getEmrDiagrams <em>Emr Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emr Diagrams</em>'.
	 * @see vpml.processpackage.EMPDiagram#getEmrDiagrams()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_EmrDiagrams();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPDiagram#getEmcDiagram <em>Emc Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Emc Diagram</em>'.
	 * @see vpml.processpackage.EMPDiagram#getEmcDiagram()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_EmcDiagram();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPDiagram#getEmiDiagram <em>Emi Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Emi Diagram</em>'.
	 * @see vpml.processpackage.EMPDiagram#getEmiDiagram()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_EmiDiagram();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPDiagram#getStartedTime <em>Started Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started Time</em>'.
	 * @see vpml.processpackage.EMPDiagram#getStartedTime()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EAttribute getEMPDiagram_StartedTime();

	/**
	 * Returns the meta object for the containment reference '{@link vpml.processpackage.EMPDiagram#getDurationTime <em>Duration Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration Time</em>'.
	 * @see vpml.processpackage.EMPDiagram#getDurationTime()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_DurationTime();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPDiagram#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see vpml.processpackage.EMPDiagram#getTimeUnit()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EAttribute getEMPDiagram_TimeUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getInOrs <em>In Ors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Ors</em>'.
	 * @see vpml.processpackage.EMPDiagram#getInOrs()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_InOrs();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getProductPackages <em>Product Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Packages</em>'.
	 * @see vpml.processpackage.EMPDiagram#getProductPackages()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_ProductPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getOutAnds <em>Out Ands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Ands</em>'.
	 * @see vpml.processpackage.EMPDiagram#getOutAnds()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_OutAnds();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getDataFlows <em>Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Flows</em>'.
	 * @see vpml.processpackage.EMPDiagram#getDataFlows()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_DataFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getClockFlows <em>Clock Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clock Flows</em>'.
	 * @see vpml.processpackage.EMPDiagram#getClockFlows()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_ClockFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clocks</em>'.
	 * @see vpml.processpackage.EMPDiagram#getClocks()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_Clocks();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getInAnds <em>In Ands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Ands</em>'.
	 * @see vpml.processpackage.EMPDiagram#getInAnds()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_InAnds();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getNormalActivities <em>Normal Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Normal Activities</em>'.
	 * @see vpml.processpackage.EMPDiagram#getNormalActivities()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_NormalActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getCompActivities <em>Comp Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comp Activities</em>'.
	 * @see vpml.processpackage.EMPDiagram#getCompActivities()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_CompActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getOutOrs <em>Out Ors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Ors</em>'.
	 * @see vpml.processpackage.EMPDiagram#getOutOrs()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_OutOrs();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ass Flows</em>'.
	 * @see vpml.processpackage.EMPDiagram#getAssFlows()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_AssFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getRefFlows <em>Ref Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Flows</em>'.
	 * @see vpml.processpackage.EMPDiagram#getRefFlows()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_RefFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getOthers <em>Others</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Others</em>'.
	 * @see vpml.processpackage.EMPDiagram#getOthers()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_Others();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see vpml.processpackage.EMPDiagram#getArtifacts()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_Artifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forms</em>'.
	 * @see vpml.processpackage.EMPDiagram#getForms()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_Forms();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documents</em>'.
	 * @see vpml.processpackage.EMPDiagram#getDocuments()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_Documents();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getAutoActivities <em>Auto Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auto Activities</em>'.
	 * @see vpml.processpackage.EMPDiagram#getAutoActivities()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_AutoActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see vpml.processpackage.EMPDiagram#getMessages()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_Messages();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getManualBatchActivities <em>Manual Batch Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Manual Batch Activities</em>'.
	 * @see vpml.processpackage.EMPDiagram#getManualBatchActivities()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_ManualBatchActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getAutoBatchActivities <em>Auto Batch Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auto Batch Activities</em>'.
	 * @see vpml.processpackage.EMPDiagram#getAutoBatchActivities()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_AutoBatchActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getMachineTypes <em>Machine Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Types</em>'.
	 * @see vpml.processpackage.EMPDiagram#getMachineTypes()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_MachineTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see vpml.processpackage.EMPDiagram#getRoles()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getLocationTypes <em>Location Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location Types</em>'.
	 * @see vpml.processpackage.EMPDiagram#getLocationTypes()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_LocationTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getToolTypes <em>Tool Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool Types</em>'.
	 * @see vpml.processpackage.EMPDiagram#getToolTypes()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_ToolTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getResourceGroupTypes <em>Resource Group Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Group Types</em>'.
	 * @see vpml.processpackage.EMPDiagram#getResourceGroupTypes()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_ResourceGroupTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.processpackage.EMPDiagram#getMileStones <em>Mile Stones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mile Stones</em>'.
	 * @see vpml.processpackage.EMPDiagram#getMileStones()
	 * @see #getEMPDiagram()
	 * @generated
	 */
	EReference getEMPDiagram_MileStones();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPMileStone <em>EMP Mile Stone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Mile Stone</em>'.
	 * @see vpml.processpackage.EMPMileStone
	 * @generated
	 */
	EClass getEMPMileStone();

	/**
	 * Returns the meta object for the attribute '{@link vpml.processpackage.EMPMileStone#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process</em>'.
	 * @see vpml.processpackage.EMPMileStone#getProcess()
	 * @see #getEMPMileStone()
	 * @generated
	 */
	EAttribute getEMPMileStone_Process();

	/**
	 * Returns the meta object for the reference list '{@link vpml.processpackage.EMPMileStone#getDataFlows <em>Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Flows</em>'.
	 * @see vpml.processpackage.EMPMileStone#getDataFlows()
	 * @see #getEMPMileStone()
	 * @generated
	 */
	EReference getEMPMileStone_DataFlows();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPMileStone#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPMileStone#getEmpDiagram()
	 * @see #getEMPMileStone()
	 * @generated
	 */
	EReference getEMPMileStone_EmpDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.processpackage.EMPForm <em>EMP Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMP Form</em>'.
	 * @see vpml.processpackage.EMPForm
	 * @generated
	 */
	EClass getEMPForm();

	/**
	 * Returns the meta object for the container reference '{@link vpml.processpackage.EMPForm#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Emp Diagram</em>'.
	 * @see vpml.processpackage.EMPForm#getEmpDiagram()
	 * @see #getEMPForm()
	 * @generated
	 */
	EReference getEMPForm_EmpDiagram();

	/**
	 * Returns the meta object for the reference '{@link vpml.processpackage.EMPForm#getFormType <em>Form Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Form Type</em>'.
	 * @see vpml.processpackage.EMPForm#getFormType()
	 * @see #getEMPForm()
	 * @generated
	 */
	EReference getEMPForm_FormType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcesspackageFactory getProcesspackageFactory();

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
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPNormalActivityImpl <em>EMP Normal Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPNormalActivityImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPNormalActivity()
		 * @generated
		 */
		EClass EMP_NORMAL_ACTIVITY = eINSTANCE.getEMPNormalActivity();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_NORMAL_ACTIVITY__EMP_DIAGRAM = eINSTANCE.getEMPNormalActivity_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Ass Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_NORMAL_ACTIVITY__ASS_FLOWS = eINSTANCE.getEMPNormalActivity_AssFlows();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPBatchActivityImpl <em>EMP Batch Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPBatchActivityImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPBatchActivity()
		 * @generated
		 */
		EClass EMP_BATCH_ACTIVITY = eINSTANCE.getEMPBatchActivity();

		/**
		 * The meta object literal for the '<em><b>Batch Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_BATCH_ACTIVITY__BATCH_TYPE = eINSTANCE.getEMPBatchActivity_BatchType();

		/**
		 * The meta object literal for the '<em><b>Bat Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_BATCH_ACTIVITY__BAT_START_TIME = eINSTANCE.getEMPBatchActivity_BatStartTime();

		/**
		 * The meta object literal for the '<em><b>Bat End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_BATCH_ACTIVITY__BAT_END_TIME = eINSTANCE.getEMPBatchActivity_BatEndTime();

		/**
		 * The meta object literal for the '<em><b>Restart Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_BATCH_ACTIVITY__RESTART_PERIOD = eINSTANCE.getEMPBatchActivity_RestartPeriod();

		/**
		 * The meta object literal for the '<em><b>Bat Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_BATCH_ACTIVITY__BAT_TIME_UNIT = eINSTANCE.getEMPBatchActivity_BatTimeUnit();

		/**
		 * The meta object literal for the '<em><b>Timer Queue Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_BATCH_ACTIVITY__TIMER_QUEUE_FLAG = eINSTANCE.getEMPBatchActivity_TimerQueueFlag();

		/**
		 * The meta object literal for the '<em><b>Emergency Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_BATCH_ACTIVITY__EMERGENCY_FLAG = eINSTANCE.getEMPBatchActivity_EmergencyFlag();

		/**
		 * The meta object literal for the '<em><b>Interval Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_BATCH_ACTIVITY__INTERVAL_VALUE = eINSTANCE.getEMPBatchActivity_IntervalValue();

		/**
		 * The meta object literal for the '<em><b>Interval Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_BATCH_ACTIVITY__INTERVAL_TIME_UNIT = eINSTANCE.getEMPBatchActivity_IntervalTimeUnit();

		/**
		 * The meta object literal for the '<em><b>Max Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_BATCH_ACTIVITY__MAX_QUANTITY = eINSTANCE.getEMPBatchActivity_MaxQuantity();

		/**
		 * The meta object literal for the '<em><b>Min Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_BATCH_ACTIVITY__MIN_QUANTITY = eINSTANCE.getEMPBatchActivity_MinQuantity();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPActivityImpl <em>EMP Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPActivityImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPActivity()
		 * @generated
		 */
		EClass EMP_ACTIVITY = eINSTANCE.getEMPActivity();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_ACTIVITY__PROCEDURE = eINSTANCE.getEMPActivity_Procedure();

		/**
		 * The meta object literal for the '<em><b>Creater</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_ACTIVITY__CREATER = eINSTANCE.getEMPActivity_Creater();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_ACTIVITY__CREATED_DATE = eINSTANCE.getEMPActivity_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Last Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_ACTIVITY__LAST_MODIFIER = eINSTANCE.getEMPActivity_LastModifier();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_ACTIVITY__LAST_MODIFIED_DATE = eINSTANCE.getEMPActivity_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Clock Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ACTIVITY__CLOCK_FLOW = eINSTANCE.getEMPActivity_ClockFlow();

		/**
		 * The meta object literal for the '<em><b>Target Data Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ACTIVITY__TARGET_DATA_FLOWS = eINSTANCE.getEMPActivity_TargetDataFlows();

		/**
		 * The meta object literal for the '<em><b>Source Data Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ACTIVITY__SOURCE_DATA_FLOWS = eINSTANCE.getEMPActivity_SourceDataFlows();

		/**
		 * The meta object literal for the '<em><b>Ref Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ACTIVITY__REF_FLOWS = eINSTANCE.getEMPActivity_RefFlows();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPObjectImpl <em>EMP Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPObjectImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPObject()
		 * @generated
		 */
		EClass EMP_OBJECT = eINSTANCE.getEMPObject();

		/**
		 * The meta object literal for the '<em><b>Com Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_OBJECT__COM_ACTIVITY = eINSTANCE.getEMPObject_ComActivity();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPFlowImpl <em>EMP Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPFlowImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPFlow()
		 * @generated
		 */
		EClass EMP_FLOW = eINSTANCE.getEMPFlow();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPDataFlowImpl <em>EMP Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPDataFlowImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPDataFlow()
		 * @generated
		 */
		EClass EMP_DATA_FLOW = eINSTANCE.getEMPDataFlow();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_DATA_FLOW__PROBABILITY = eINSTANCE.getEMPDataFlow_Probability();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DATA_FLOW__EMP_DIAGRAM = eINSTANCE.getEMPDataFlow_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Target Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DATA_FLOW__TARGET_PRODUCT = eINSTANCE.getEMPDataFlow_TargetProduct();

		/**
		 * The meta object literal for the '<em><b>Target Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DATA_FLOW__TARGET_ACTIVITY = eINSTANCE.getEMPDataFlow_TargetActivity();

		/**
		 * The meta object literal for the '<em><b>Source Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DATA_FLOW__SOURCE_PRODUCT = eINSTANCE.getEMPDataFlow_SourceProduct();

		/**
		 * The meta object literal for the '<em><b>Source Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DATA_FLOW__SOURCE_ACTIVITY = eINSTANCE.getEMPDataFlow_SourceActivity();

		/**
		 * The meta object literal for the '<em><b>Source In And</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DATA_FLOW__SOURCE_IN_AND = eINSTANCE.getEMPDataFlow_SourceInAnd();

		/**
		 * The meta object literal for the '<em><b>Target In And</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DATA_FLOW__TARGET_IN_AND = eINSTANCE.getEMPDataFlow_TargetInAnd();

		/**
		 * The meta object literal for the '<em><b>Target In Or</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DATA_FLOW__TARGET_IN_OR = eINSTANCE.getEMPDataFlow_TargetInOr();

		/**
		 * The meta object literal for the '<em><b>Source In Or</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DATA_FLOW__SOURCE_IN_OR = eINSTANCE.getEMPDataFlow_SourceInOr();

		/**
		 * The meta object literal for the '<em><b>Source Out And</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DATA_FLOW__SOURCE_OUT_AND = eINSTANCE.getEMPDataFlow_SourceOutAnd();

		/**
		 * The meta object literal for the '<em><b>Target Out And</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DATA_FLOW__TARGET_OUT_AND = eINSTANCE.getEMPDataFlow_TargetOutAnd();

		/**
		 * The meta object literal for the '<em><b>Source Out Or</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DATA_FLOW__SOURCE_OUT_OR = eINSTANCE.getEMPDataFlow_SourceOutOr();

		/**
		 * The meta object literal for the '<em><b>Target Out Or</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DATA_FLOW__TARGET_OUT_OR = eINSTANCE.getEMPDataFlow_TargetOutOr();

		/**
		 * The meta object literal for the '<em><b>Mile Stone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DATA_FLOW__MILE_STONE = eINSTANCE.getEMPDataFlow_MileStone();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPAssFlowImpl <em>EMP Ass Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPAssFlowImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPAssFlow()
		 * @generated
		 */
		EClass EMP_ASS_FLOW = eINSTANCE.getEMPAssFlow();

		/**
		 * The meta object literal for the '<em><b>Resource Group Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ASS_FLOW__RESOURCE_GROUP_TYPE = eINSTANCE.getEMPAssFlow_ResourceGroupType();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ASS_FLOW__EMP_DIAGRAM = eINSTANCE.getEMPAssFlow_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ASS_FLOW__PRODUCT = eINSTANCE.getEMPAssFlow_Product();

		/**
		 * The meta object literal for the '<em><b>Location Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ASS_FLOW__LOCATION_TYPE = eINSTANCE.getEMPAssFlow_LocationType();

		/**
		 * The meta object literal for the '<em><b>Machine Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ASS_FLOW__MACHINE_TYPE = eINSTANCE.getEMPAssFlow_MachineType();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ASS_FLOW__ROLE = eINSTANCE.getEMPAssFlow_Role();

		/**
		 * The meta object literal for the '<em><b>Tool Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ASS_FLOW__TOOL_TYPE = eINSTANCE.getEMPAssFlow_ToolType();

		/**
		 * The meta object literal for the '<em><b>Auto Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ASS_FLOW__AUTO_ACTIVITY = eINSTANCE.getEMPAssFlow_AutoActivity();

		/**
		 * The meta object literal for the '<em><b>Normal Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ASS_FLOW__NORMAL_ACTIVITY = eINSTANCE.getEMPAssFlow_NormalActivity();

		/**
		 * The meta object literal for the '<em><b>Comp Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ASS_FLOW__COMP_ACTIVITY = eINSTANCE.getEMPAssFlow_CompActivity();

		/**
		 * The meta object literal for the '<em><b>Manual Batch Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ASS_FLOW__MANUAL_BATCH_ACTIVITY = eINSTANCE.getEMPAssFlow_ManualBatchActivity();

		/**
		 * The meta object literal for the '<em><b>Auto Batch Activiy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ASS_FLOW__AUTO_BATCH_ACTIVIY = eINSTANCE.getEMPAssFlow_AutoBatchActiviy();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPClockFlowImpl <em>EMP Clock Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPClockFlowImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPClockFlow()
		 * @generated
		 */
		EClass EMP_CLOCK_FLOW = eINSTANCE.getEMPClockFlow();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_CLOCK_FLOW__ACTIVITY = eINSTANCE.getEMPClockFlow_Activity();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_CLOCK_FLOW__CLOCK = eINSTANCE.getEMPClockFlow_Clock();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_CLOCK_FLOW__EMP_DIAGRAM = eINSTANCE.getEMPClockFlow_EmpDiagram();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPLogicalConnectorImpl <em>EMP Logical Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPLogicalConnectorImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPLogicalConnector()
		 * @generated
		 */
		EClass EMP_LOGICAL_CONNECTOR = eINSTANCE.getEMPLogicalConnector();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPInAndImpl <em>EMP In And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPInAndImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPInAnd()
		 * @generated
		 */
		EClass EMP_IN_AND = eINSTANCE.getEMPInAnd();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_IN_AND__EMP_DIAGRAM = eINSTANCE.getEMPInAnd_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Source Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_IN_AND__SOURCE_FLOWS = eINSTANCE.getEMPInAnd_SourceFlows();

		/**
		 * The meta object literal for the '<em><b>Target Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_IN_AND__TARGET_FLOWS = eINSTANCE.getEMPInAnd_TargetFlows();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPOutAndImpl <em>EMP Out And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPOutAndImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPOutAnd()
		 * @generated
		 */
		EClass EMP_OUT_AND = eINSTANCE.getEMPOutAnd();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_OUT_AND__EMP_DIAGRAM = eINSTANCE.getEMPOutAnd_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Source Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_OUT_AND__SOURCE_FLOWS = eINSTANCE.getEMPOutAnd_SourceFlows();

		/**
		 * The meta object literal for the '<em><b>Target Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_OUT_AND__TARGET_FLOWS = eINSTANCE.getEMPOutAnd_TargetFlows();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPInOrImpl <em>EMP In Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPInOrImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPInOr()
		 * @generated
		 */
		EClass EMP_IN_OR = eINSTANCE.getEMPInOr();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_IN_OR__EMP_DIAGRAM = eINSTANCE.getEMPInOr_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Target Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_IN_OR__TARGET_FLOWS = eINSTANCE.getEMPInOr_TargetFlows();

		/**
		 * The meta object literal for the '<em><b>Source Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_IN_OR__SOURCE_FLOWS = eINSTANCE.getEMPInOr_SourceFlows();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPOutOrImpl <em>EMP Out Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPOutOrImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPOutOr()
		 * @generated
		 */
		EClass EMP_OUT_OR = eINSTANCE.getEMPOutOr();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_OUT_OR__EMP_DIAGRAM = eINSTANCE.getEMPOutOr_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Source Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_OUT_OR__SOURCE_FLOWS = eINSTANCE.getEMPOutOr_SourceFlows();

		/**
		 * The meta object literal for the '<em><b>Target Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_OUT_OR__TARGET_FLOWS = eINSTANCE.getEMPOutOr_TargetFlows();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPClockImpl <em>EMP Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPClockImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPClock()
		 * @generated
		 */
		EClass EMP_CLOCK = eINSTANCE.getEMPClock();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_CLOCK__START_TIME = eINSTANCE.getEMPClock_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_CLOCK__END_TIME = eINSTANCE.getEMPClock_EndTime();

		/**
		 * The meta object literal for the '<em><b>Restart Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_CLOCK__RESTART_PERIOD = eINSTANCE.getEMPClock_RestartPeriod();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_CLOCK__TIME_UNIT = eINSTANCE.getEMPClock_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Tq Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_CLOCK__TQ_FLAG = eINSTANCE.getEMPClock_TqFlag();

		/**
		 * The meta object literal for the '<em><b>EFlag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_CLOCK__EFLAG = eINSTANCE.getEMPClock_EFlag();

		/**
		 * The meta object literal for the '<em><b>Interval Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_CLOCK__INTERVAL_VALUE = eINSTANCE.getEMPClock_IntervalValue();

		/**
		 * The meta object literal for the '<em><b>Interval Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_CLOCK__INTERVAL_UNIT = eINSTANCE.getEMPClock_IntervalUnit();

		/**
		 * The meta object literal for the '<em><b>Clock Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_CLOCK__CLOCK_FLOWS = eINSTANCE.getEMPClock_ClockFlows();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_CLOCK__EMP_DIAGRAM = eINSTANCE.getEMPClock_EmpDiagram();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPCompActivityImpl <em>EMP Comp Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPCompActivityImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPCompActivity()
		 * @generated
		 */
		EClass EMP_COMP_ACTIVITY = eINSTANCE.getEMPCompActivity();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_COMP_ACTIVITY__EMP_DIAGRAM = eINSTANCE.getEMPCompActivity_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Leaf Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_COMP_ACTIVITY__LEAF_OBJECTS = eINSTANCE.getEMPCompActivity_LeafObjects();

		/**
		 * The meta object literal for the '<em><b>Ass Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_COMP_ACTIVITY__ASS_FLOWS = eINSTANCE.getEMPCompActivity_AssFlows();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPInConnectorImpl <em>EMP In Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPInConnectorImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPInConnector()
		 * @generated
		 */
		EClass EMP_IN_CONNECTOR = eINSTANCE.getEMPInConnector();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPOutConnectorImpl <em>EMP Out Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPOutConnectorImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPOutConnector()
		 * @generated
		 */
		EClass EMP_OUT_CONNECTOR = eINSTANCE.getEMPOutConnector();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPLeafActivityImpl <em>EMP Leaf Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPLeafActivityImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPLeafActivity()
		 * @generated
		 */
		EClass EMP_LEAF_ACTIVITY = eINSTANCE.getEMPLeafActivity();

		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_LEAF_ACTIVITY__IS_DEFAULT = eINSTANCE.getEMPLeafActivity_IsDefault();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_LEAF_ACTIVITY__START_TIME = eINSTANCE.getEMPLeafActivity_StartTime();

		/**
		 * The meta object literal for the '<em><b>Duration Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_LEAF_ACTIVITY__DURATION_TIME = eINSTANCE.getEMPLeafActivity_DurationTime();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_LEAF_ACTIVITY__TIME_UNIT = eINSTANCE.getEMPLeafActivity_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_LEAF_ACTIVITY__PRIORITY = eINSTANCE.getEMPLeafActivity_Priority();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPProductImpl <em>EMP Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPProductImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPProduct()
		 * @generated
		 */
		EClass EMP_PRODUCT = eINSTANCE.getEMPProduct();

		/**
		 * The meta object literal for the '<em><b>Target Data Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_PRODUCT__TARGET_DATA_FLOWS = eINSTANCE.getEMPProduct_TargetDataFlows();

		/**
		 * The meta object literal for the '<em><b>Source Data Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_PRODUCT__SOURCE_DATA_FLOWS = eINSTANCE.getEMPProduct_SourceDataFlows();

		/**
		 * The meta object literal for the '<em><b>Ref Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_PRODUCT__REF_FLOWS = eINSTANCE.getEMPProduct_RefFlows();

		/**
		 * The meta object literal for the '<em><b>Ass Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_PRODUCT__ASS_FLOWS = eINSTANCE.getEMPProduct_AssFlows();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPProductPackageImpl <em>EMP Product Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPProductPackageImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPProductPackage()
		 * @generated
		 */
		EClass EMP_PRODUCT_PACKAGE = eINSTANCE.getEMPProductPackage();

		/**
		 * The meta object literal for the '<em><b>Sub Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_PRODUCT_PACKAGE__SUB_PACKAGES = eINSTANCE.getEMPProductPackage_SubPackages();

		/**
		 * The meta object literal for the '<em><b>Top Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_PRODUCT_PACKAGE__TOP_PACKAGE = eINSTANCE.getEMPProductPackage_TopPackage();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_PRODUCT_PACKAGE__EMP_DIAGRAM = eINSTANCE.getEMPProductPackage_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Leaf Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_PRODUCT_PACKAGE__LEAF_PRODUCTS = eINSTANCE.getEMPProductPackage_LeafProducts();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPLeafProductImpl <em>EMP Leaf Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPLeafProductImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPLeafProduct()
		 * @generated
		 */
		EClass EMP_LEAF_PRODUCT = eINSTANCE.getEMPLeafProduct();

		/**
		 * The meta object literal for the '<em><b>Attachment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_LEAF_PRODUCT__ATTACHMENT = eINSTANCE.getEMPLeafProduct_Attachment();

		/**
		 * The meta object literal for the '<em><b>Io Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_LEAF_PRODUCT__IO_TYPE = eINSTANCE.getEMPLeafProduct_IoType();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_LEAF_PRODUCT__PERIOD = eINSTANCE.getEMPLeafProduct_Period();

		/**
		 * The meta object literal for the '<em><b>Duration Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_LEAF_PRODUCT__DURATION_TIME = eINSTANCE.getEMPLeafProduct_DurationTime();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_LEAF_PRODUCT__TIME_UNIT = eINSTANCE.getEMPLeafProduct_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Init Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_LEAF_PRODUCT__INIT_QUEUE = eINSTANCE.getEMPLeafProduct_InitQueue();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_LEAF_PRODUCT__COST = eINSTANCE.getEMPLeafProduct_Cost();

		/**
		 * The meta object literal for the '<em><b>Top Product Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE = eINSTANCE.getEMPLeafProduct_TopProductPackage();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPRefFlowImpl <em>EMP Ref Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPRefFlowImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPRefFlow()
		 * @generated
		 */
		EClass EMP_REF_FLOW = eINSTANCE.getEMPRefFlow();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_REF_FLOW__ACTIVITY = eINSTANCE.getEMPRefFlow_Activity();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_REF_FLOW__PRODUCT = eINSTANCE.getEMPRefFlow_Product();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_REF_FLOW__EMP_DIAGRAM = eINSTANCE.getEMPRefFlow_EmpDiagram();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPDocumentImpl <em>EMP Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPDocumentImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPDocument()
		 * @generated
		 */
		EClass EMP_DOCUMENT = eINSTANCE.getEMPDocument();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DOCUMENT__EMP_DIAGRAM = eINSTANCE.getEMPDocument_EmpDiagram();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPArtifactImpl <em>EMP Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPArtifactImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPArtifact()
		 * @generated
		 */
		EClass EMP_ARTIFACT = eINSTANCE.getEMPArtifact();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_ARTIFACT__EMP_DIAGRAM = eINSTANCE.getEMPArtifact_EmpDiagram();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPOtherImpl <em>EMP Other</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPOtherImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPOther()
		 * @generated
		 */
		EClass EMP_OTHER = eINSTANCE.getEMPOther();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_OTHER__EMP_DIAGRAM = eINSTANCE.getEMPOther_EmpDiagram();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPAttributeItemImpl <em>EMP Attribute Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPAttributeItemImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPAttributeItem()
		 * @generated
		 */
		EClass EMP_ATTRIBUTE_ITEM = eINSTANCE.getEMPAttributeItem();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_ATTRIBUTE_ITEM__TYPE = eINSTANCE.getEMPAttributeItem_Type();

		/**
		 * The meta object literal for the '<em><b>depend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_ATTRIBUTE_ITEM__DEPEND = eINSTANCE.getEMPAttributeItem__depend();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPAutoActivityImpl <em>EMP Auto Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPAutoActivityImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPAutoActivity()
		 * @generated
		 */
		EClass EMP_AUTO_ACTIVITY = eINSTANCE.getEMPAutoActivity();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_AUTO_ACTIVITY__EMP_DIAGRAM = eINSTANCE.getEMPAutoActivity_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Ass Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_AUTO_ACTIVITY__ASS_FLOWS = eINSTANCE.getEMPAutoActivity_AssFlows();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPManualBatchActivityImpl <em>EMP Manual Batch Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPManualBatchActivityImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPManualBatchActivity()
		 * @generated
		 */
		EClass EMP_MANUAL_BATCH_ACTIVITY = eINSTANCE.getEMPManualBatchActivity();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_MANUAL_BATCH_ACTIVITY__EMP_DIAGRAM = eINSTANCE.getEMPManualBatchActivity_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Ass Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_MANUAL_BATCH_ACTIVITY__ASS_FLOWS = eINSTANCE.getEMPManualBatchActivity_AssFlows();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPAutoBatchActivityImpl <em>EMP Auto Batch Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPAutoBatchActivityImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPAutoBatchActivity()
		 * @generated
		 */
		EClass EMP_AUTO_BATCH_ACTIVITY = eINSTANCE.getEMPAutoBatchActivity();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_AUTO_BATCH_ACTIVITY__EMP_DIAGRAM = eINSTANCE.getEMPAutoBatchActivity_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Ass Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_AUTO_BATCH_ACTIVITY__ASS_FLOWS = eINSTANCE.getEMPAutoBatchActivity_AssFlows();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPMessageImpl <em>EMP Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPMessageImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPMessage()
		 * @generated
		 */
		EClass EMP_MESSAGE = eINSTANCE.getEMPMessage();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_MESSAGE__EMP_DIAGRAM = eINSTANCE.getEMPMessage_EmpDiagram();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPDiagramImpl <em>EMP Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPDiagramImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPDiagram()
		 * @generated
		 */
		EClass EMP_DIAGRAM = eINSTANCE.getEMPDiagram();

		/**
		 * The meta object literal for the '<em><b>Emo Diagrams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__EMO_DIAGRAMS = eINSTANCE.getEMPDiagram_EmoDiagrams();

		/**
		 * The meta object literal for the '<em><b>Emr Diagrams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__EMR_DIAGRAMS = eINSTANCE.getEMPDiagram_EmrDiagrams();

		/**
		 * The meta object literal for the '<em><b>Emc Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__EMC_DIAGRAM = eINSTANCE.getEMPDiagram_EmcDiagram();

		/**
		 * The meta object literal for the '<em><b>Emi Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__EMI_DIAGRAM = eINSTANCE.getEMPDiagram_EmiDiagram();

		/**
		 * The meta object literal for the '<em><b>Started Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_DIAGRAM__STARTED_TIME = eINSTANCE.getEMPDiagram_StartedTime();

		/**
		 * The meta object literal for the '<em><b>Duration Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__DURATION_TIME = eINSTANCE.getEMPDiagram_DurationTime();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_DIAGRAM__TIME_UNIT = eINSTANCE.getEMPDiagram_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>In Ors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__IN_ORS = eINSTANCE.getEMPDiagram_InOrs();

		/**
		 * The meta object literal for the '<em><b>Product Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__PRODUCT_PACKAGES = eINSTANCE.getEMPDiagram_ProductPackages();

		/**
		 * The meta object literal for the '<em><b>Out Ands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__OUT_ANDS = eINSTANCE.getEMPDiagram_OutAnds();

		/**
		 * The meta object literal for the '<em><b>Data Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__DATA_FLOWS = eINSTANCE.getEMPDiagram_DataFlows();

		/**
		 * The meta object literal for the '<em><b>Clock Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__CLOCK_FLOWS = eINSTANCE.getEMPDiagram_ClockFlows();

		/**
		 * The meta object literal for the '<em><b>Clocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__CLOCKS = eINSTANCE.getEMPDiagram_Clocks();

		/**
		 * The meta object literal for the '<em><b>In Ands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__IN_ANDS = eINSTANCE.getEMPDiagram_InAnds();

		/**
		 * The meta object literal for the '<em><b>Normal Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__NORMAL_ACTIVITIES = eINSTANCE.getEMPDiagram_NormalActivities();

		/**
		 * The meta object literal for the '<em><b>Comp Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__COMP_ACTIVITIES = eINSTANCE.getEMPDiagram_CompActivities();

		/**
		 * The meta object literal for the '<em><b>Out Ors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__OUT_ORS = eINSTANCE.getEMPDiagram_OutOrs();

		/**
		 * The meta object literal for the '<em><b>Ass Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__ASS_FLOWS = eINSTANCE.getEMPDiagram_AssFlows();

		/**
		 * The meta object literal for the '<em><b>Ref Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__REF_FLOWS = eINSTANCE.getEMPDiagram_RefFlows();

		/**
		 * The meta object literal for the '<em><b>Others</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__OTHERS = eINSTANCE.getEMPDiagram_Others();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__ARTIFACTS = eINSTANCE.getEMPDiagram_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__FORMS = eINSTANCE.getEMPDiagram_Forms();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__DOCUMENTS = eINSTANCE.getEMPDiagram_Documents();

		/**
		 * The meta object literal for the '<em><b>Auto Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__AUTO_ACTIVITIES = eINSTANCE.getEMPDiagram_AutoActivities();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__MESSAGES = eINSTANCE.getEMPDiagram_Messages();

		/**
		 * The meta object literal for the '<em><b>Manual Batch Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__MANUAL_BATCH_ACTIVITIES = eINSTANCE.getEMPDiagram_ManualBatchActivities();

		/**
		 * The meta object literal for the '<em><b>Auto Batch Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__AUTO_BATCH_ACTIVITIES = eINSTANCE.getEMPDiagram_AutoBatchActivities();

		/**
		 * The meta object literal for the '<em><b>Machine Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__MACHINE_TYPES = eINSTANCE.getEMPDiagram_MachineTypes();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__ROLES = eINSTANCE.getEMPDiagram_Roles();

		/**
		 * The meta object literal for the '<em><b>Location Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__LOCATION_TYPES = eINSTANCE.getEMPDiagram_LocationTypes();

		/**
		 * The meta object literal for the '<em><b>Tool Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__TOOL_TYPES = eINSTANCE.getEMPDiagram_ToolTypes();

		/**
		 * The meta object literal for the '<em><b>Resource Group Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__RESOURCE_GROUP_TYPES = eINSTANCE.getEMPDiagram_ResourceGroupTypes();

		/**
		 * The meta object literal for the '<em><b>Mile Stones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_DIAGRAM__MILE_STONES = eINSTANCE.getEMPDiagram_MileStones();

		/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPMileStoneImpl <em>EMP Mile Stone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPMileStoneImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPMileStone()
		 * @generated
		 */
		EClass EMP_MILE_STONE = eINSTANCE.getEMPMileStone();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMP_MILE_STONE__PROCESS = eINSTANCE.getEMPMileStone_Process();

		/**
		 * The meta object literal for the '<em><b>Data Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_MILE_STONE__DATA_FLOWS = eINSTANCE.getEMPMileStone_DataFlows();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_MILE_STONE__EMP_DIAGRAM = eINSTANCE.getEMPMileStone_EmpDiagram();

			/**
		 * The meta object literal for the '{@link vpml.processpackage.impl.EMPFormImpl <em>EMP Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.processpackage.impl.EMPFormImpl
		 * @see vpml.processpackage.impl.ProcesspackagePackageImpl#getEMPForm()
		 * @generated
		 */
		EClass EMP_FORM = eINSTANCE.getEMPForm();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_FORM__EMP_DIAGRAM = eINSTANCE.getEMPForm_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Form Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMP_FORM__FORM_TYPE = eINSTANCE.getEMPForm_FormType();

	}

} //ProcesspackagePackage
