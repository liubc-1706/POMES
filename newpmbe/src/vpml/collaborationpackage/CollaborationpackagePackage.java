/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.collaborationpackage;

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
 * @see vpml.collaborationpackage.CollaborationpackageFactory
 * @model kind="package"
 * @generated
 */
public interface CollaborationpackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "collaborationpackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///vpml/collaborationpackage.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vpml.collaborationpackage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollaborationpackagePackage eINSTANCE = vpml.collaborationpackage.impl.CollaborationpackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link vpml.collaborationpackage.impl.EMCLogicalConnectorImpl <em>EMC Logical Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.collaborationpackage.impl.EMCLogicalConnectorImpl
	 * @see vpml.collaborationpackage.impl.CollaborationpackagePackageImpl#getEMCLogicalConnector()
	 * @generated
	 */
	int EMC_LOGICAL_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_LOGICAL_CONNECTOR__NAME = VpmlPackage.EM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_LOGICAL_CONNECTOR__ID = VpmlPackage.EM_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_LOGICAL_CONNECTOR__CODE = VpmlPackage.EM_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_LOGICAL_CONNECTOR__DESCRIPTION = VpmlPackage.EM_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_LOGICAL_CONNECTOR__OID = VpmlPackage.EM_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_LOGICAL_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION = VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_LOGICAL_CONNECTOR__TARGET_OBJ_TARGET_RELATION = VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The number of structural features of the '<em>EMC Logical Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_LOGICAL_CONNECTOR_FEATURE_COUNT = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link vpml.collaborationpackage.impl.EMCAndImpl <em>EMC And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.collaborationpackage.impl.EMCAndImpl
	 * @see vpml.collaborationpackage.impl.CollaborationpackagePackageImpl#getEMCAnd()
	 * @generated
	 */
	int EMC_AND = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_AND__NAME = EMC_LOGICAL_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_AND__ID = EMC_LOGICAL_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_AND__CODE = EMC_LOGICAL_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_AND__DESCRIPTION = EMC_LOGICAL_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_AND__OID = EMC_LOGICAL_CONNECTOR__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_AND__SOURCE_OBJ_SOURCE_RELATION = EMC_LOGICAL_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_AND__TARGET_OBJ_TARGET_RELATION = EMC_LOGICAL_CONNECTOR__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Col And Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_AND__COL_AND_DIAGRAM = EMC_LOGICAL_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMC And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_AND_FEATURE_COUNT = EMC_LOGICAL_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.collaborationpackage.impl.EMCORImpl <em>EMCOR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.collaborationpackage.impl.EMCORImpl
	 * @see vpml.collaborationpackage.impl.CollaborationpackagePackageImpl#getEMCOR()
	 * @generated
	 */
	int EMCOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMCOR__NAME = EMC_LOGICAL_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMCOR__ID = EMC_LOGICAL_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMCOR__CODE = EMC_LOGICAL_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMCOR__DESCRIPTION = EMC_LOGICAL_CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMCOR__OID = EMC_LOGICAL_CONNECTOR__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMCOR__SOURCE_OBJ_SOURCE_RELATION = EMC_LOGICAL_CONNECTOR__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMCOR__TARGET_OBJ_TARGET_RELATION = EMC_LOGICAL_CONNECTOR__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Col OR Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMCOR__COL_OR_DIAGRAM = EMC_LOGICAL_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMCOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMCOR_FEATURE_COUNT = EMC_LOGICAL_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.collaborationpackage.impl.EMCCollaborationGroupImpl <em>EMC Collaboration Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.collaborationpackage.impl.EMCCollaborationGroupImpl
	 * @see vpml.collaborationpackage.impl.CollaborationpackagePackageImpl#getEMCCollaborationGroup()
	 * @generated
	 */
	int EMC_COLLABORATION_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_COLLABORATION_GROUP__NAME = VpmlPackage.EM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_COLLABORATION_GROUP__ID = VpmlPackage.EM_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_COLLABORATION_GROUP__CODE = VpmlPackage.EM_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_COLLABORATION_GROUP__DESCRIPTION = VpmlPackage.EM_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_COLLABORATION_GROUP__OID = VpmlPackage.EM_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_COLLABORATION_GROUP__SOURCE_OBJ_SOURCE_RELATION = VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_COLLABORATION_GROUP__TARGET_OBJ_TARGET_RELATION = VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Col Col Group Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_COLLABORATION_GROUP__COL_COL_GROUP_DIAGRAM = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMC Collaboration Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_COLLABORATION_GROUP_FEATURE_COUNT = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.collaborationpackage.impl.EMCDiagramImpl <em>EMC Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.collaborationpackage.impl.EMCDiagramImpl
	 * @see vpml.collaborationpackage.impl.CollaborationpackagePackageImpl#getEMCDiagram()
	 * @generated
	 */
	int EMC_DIAGRAM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__NAME = VpmlPackage.EM_DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__ID = VpmlPackage.EM_DIAGRAM__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__CODE = VpmlPackage.EM_DIAGRAM__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__DESCRIPTION = VpmlPackage.EM_DIAGRAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__OID = VpmlPackage.EM_DIAGRAM__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__SOURCE_OBJ_SOURCE_RELATION = VpmlPackage.EM_DIAGRAM__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__TARGET_OBJ_TARGET_RELATION = VpmlPackage.EM_DIAGRAM__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Creater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__CREATER = VpmlPackage.EM_DIAGRAM__CREATER;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__CREATED_DATE = VpmlPackage.EM_DIAGRAM__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Last Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__LAST_MODIFIER = VpmlPackage.EM_DIAGRAM__LAST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__LAST_MODIFIED_DATE = VpmlPackage.EM_DIAGRAM__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Emp Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__EMP_DIAGRAM = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Associate Pr Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__ASSOCIATE_PR_MODEL = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Col And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__COL_AND = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Col OR</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__COL_OR = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Col Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__COL_ROLE = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Col Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__COL_LOCATION = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Col Machine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__COL_MACHINE = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Col EMO Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__COL_EMO_GROUP = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Col Col Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__COL_COL_GROUP = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Col Col Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__COL_COL_RELATION = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Col Seq Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM__COL_SEQ_RELATION = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>EMC Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_DIAGRAM_FEATURE_COUNT = VpmlPackage.EM_DIAGRAM_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link vpml.collaborationpackage.impl.EMCRelationImpl <em>EMC Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.collaborationpackage.impl.EMCRelationImpl
	 * @see vpml.collaborationpackage.impl.CollaborationpackagePackageImpl#getEMCRelation()
	 * @generated
	 */
	int EMC_RELATION = 5;

	/**
	 * The feature id for the '<em><b>Source Relation Source Obj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_RELATION__SOURCE_RELATION_SOURCE_OBJ = 0;

	/**
	 * The feature id for the '<em><b>Target Relation Target Obj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_RELATION__TARGET_RELATION_TARGET_OBJ = 1;

	/**
	 * The number of structural features of the '<em>EMC Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_RELATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link vpml.collaborationpackage.impl.EMCCollaborationRelationImpl <em>EMC Collaboration Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.collaborationpackage.impl.EMCCollaborationRelationImpl
	 * @see vpml.collaborationpackage.impl.CollaborationpackagePackageImpl#getEMCCollaborationRelation()
	 * @generated
	 */
	int EMC_COLLABORATION_RELATION = 6;

	/**
	 * The feature id for the '<em><b>Source Relation Source Obj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_COLLABORATION_RELATION__SOURCE_RELATION_SOURCE_OBJ = EMC_RELATION__SOURCE_RELATION_SOURCE_OBJ;

	/**
	 * The feature id for the '<em><b>Target Relation Target Obj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_COLLABORATION_RELATION__TARGET_RELATION_TARGET_OBJ = EMC_RELATION__TARGET_RELATION_TARGET_OBJ;

	/**
	 * The feature id for the '<em><b>Col Col Relation Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_COLLABORATION_RELATION__COL_COL_RELATION_DIAGRAM = EMC_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMC Collaboration Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_COLLABORATION_RELATION_FEATURE_COUNT = EMC_RELATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.collaborationpackage.impl.EMCSequenceRelationImpl <em>EMC Sequence Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.collaborationpackage.impl.EMCSequenceRelationImpl
	 * @see vpml.collaborationpackage.impl.CollaborationpackagePackageImpl#getEMCSequenceRelation()
	 * @generated
	 */
	int EMC_SEQUENCE_RELATION = 7;

	/**
	 * The feature id for the '<em><b>Source Relation Source Obj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_SEQUENCE_RELATION__SOURCE_RELATION_SOURCE_OBJ = EMC_RELATION__SOURCE_RELATION_SOURCE_OBJ;

	/**
	 * The feature id for the '<em><b>Target Relation Target Obj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_SEQUENCE_RELATION__TARGET_RELATION_TARGET_OBJ = EMC_RELATION__TARGET_RELATION_TARGET_OBJ;

	/**
	 * The feature id for the '<em><b>Col Seq Relation Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_SEQUENCE_RELATION__COL_SEQ_RELATION_DIAGRAM = EMC_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMC Sequence Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMC_SEQUENCE_RELATION_FEATURE_COUNT = EMC_RELATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link vpml.collaborationpackage.EMCLogicalConnector <em>EMC Logical Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMC Logical Connector</em>'.
	 * @see vpml.collaborationpackage.EMCLogicalConnector
	 * @generated
	 */
	EClass getEMCLogicalConnector();

	/**
	 * Returns the meta object for class '{@link vpml.collaborationpackage.EMCAnd <em>EMC And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMC And</em>'.
	 * @see vpml.collaborationpackage.EMCAnd
	 * @generated
	 */
	EClass getEMCAnd();

	/**
	 * Returns the meta object for the container reference '{@link vpml.collaborationpackage.EMCAnd#getColAndDiagram <em>Col And Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Col And Diagram</em>'.
	 * @see vpml.collaborationpackage.EMCAnd#getColAndDiagram()
	 * @see #getEMCAnd()
	 * @generated
	 */
	EReference getEMCAnd_ColAndDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.collaborationpackage.EMCOR <em>EMCOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMCOR</em>'.
	 * @see vpml.collaborationpackage.EMCOR
	 * @generated
	 */
	EClass getEMCOR();

	/**
	 * Returns the meta object for the container reference '{@link vpml.collaborationpackage.EMCOR#getColORDiagram <em>Col OR Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Col OR Diagram</em>'.
	 * @see vpml.collaborationpackage.EMCOR#getColORDiagram()
	 * @see #getEMCOR()
	 * @generated
	 */
	EReference getEMCOR_ColORDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.collaborationpackage.EMCCollaborationGroup <em>EMC Collaboration Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMC Collaboration Group</em>'.
	 * @see vpml.collaborationpackage.EMCCollaborationGroup
	 * @generated
	 */
	EClass getEMCCollaborationGroup();

	/**
	 * Returns the meta object for the container reference '{@link vpml.collaborationpackage.EMCCollaborationGroup#getColColGroupDiagram <em>Col Col Group Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Col Col Group Diagram</em>'.
	 * @see vpml.collaborationpackage.EMCCollaborationGroup#getColColGroupDiagram()
	 * @see #getEMCCollaborationGroup()
	 * @generated
	 */
	EReference getEMCCollaborationGroup_ColColGroupDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.collaborationpackage.EMCDiagram <em>EMC Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMC Diagram</em>'.
	 * @see vpml.collaborationpackage.EMCDiagram
	 * @generated
	 */
	EClass getEMCDiagram();

	/**
	 * Returns the meta object for the reference '{@link vpml.collaborationpackage.EMCDiagram#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Emp Diagram</em>'.
	 * @see vpml.collaborationpackage.EMCDiagram#getEmpDiagram()
	 * @see #getEMCDiagram()
	 * @generated
	 */
	EReference getEMCDiagram_EmpDiagram();

	/**
	 * Returns the meta object for the attribute '{@link vpml.collaborationpackage.EMCDiagram#getAssociatePrModel <em>Associate Pr Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associate Pr Model</em>'.
	 * @see vpml.collaborationpackage.EMCDiagram#getAssociatePrModel()
	 * @see #getEMCDiagram()
	 * @generated
	 */
	EAttribute getEMCDiagram_AssociatePrModel();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.collaborationpackage.EMCDiagram#getColAnd <em>Col And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col And</em>'.
	 * @see vpml.collaborationpackage.EMCDiagram#getColAnd()
	 * @see #getEMCDiagram()
	 * @generated
	 */
	EReference getEMCDiagram_ColAnd();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.collaborationpackage.EMCDiagram#getColOR <em>Col OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col OR</em>'.
	 * @see vpml.collaborationpackage.EMCDiagram#getColOR()
	 * @see #getEMCDiagram()
	 * @generated
	 */
	EReference getEMCDiagram_ColOR();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.collaborationpackage.EMCDiagram#getColRole <em>Col Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col Role</em>'.
	 * @see vpml.collaborationpackage.EMCDiagram#getColRole()
	 * @see #getEMCDiagram()
	 * @generated
	 */
	EReference getEMCDiagram_ColRole();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.collaborationpackage.EMCDiagram#getColLocation <em>Col Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col Location</em>'.
	 * @see vpml.collaborationpackage.EMCDiagram#getColLocation()
	 * @see #getEMCDiagram()
	 * @generated
	 */
	EReference getEMCDiagram_ColLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.collaborationpackage.EMCDiagram#getColMachine <em>Col Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col Machine</em>'.
	 * @see vpml.collaborationpackage.EMCDiagram#getColMachine()
	 * @see #getEMCDiagram()
	 * @generated
	 */
	EReference getEMCDiagram_ColMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.collaborationpackage.EMCDiagram#getColEMOGroup <em>Col EMO Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col EMO Group</em>'.
	 * @see vpml.collaborationpackage.EMCDiagram#getColEMOGroup()
	 * @see #getEMCDiagram()
	 * @generated
	 */
	EReference getEMCDiagram_ColEMOGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.collaborationpackage.EMCDiagram#getColColGroup <em>Col Col Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col Col Group</em>'.
	 * @see vpml.collaborationpackage.EMCDiagram#getColColGroup()
	 * @see #getEMCDiagram()
	 * @generated
	 */
	EReference getEMCDiagram_ColColGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.collaborationpackage.EMCDiagram#getColColRelation <em>Col Col Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col Col Relation</em>'.
	 * @see vpml.collaborationpackage.EMCDiagram#getColColRelation()
	 * @see #getEMCDiagram()
	 * @generated
	 */
	EReference getEMCDiagram_ColColRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.collaborationpackage.EMCDiagram#getColSeqRelation <em>Col Seq Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col Seq Relation</em>'.
	 * @see vpml.collaborationpackage.EMCDiagram#getColSeqRelation()
	 * @see #getEMCDiagram()
	 * @generated
	 */
	EReference getEMCDiagram_ColSeqRelation();

	/**
	 * Returns the meta object for class '{@link vpml.collaborationpackage.EMCRelation <em>EMC Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMC Relation</em>'.
	 * @see vpml.collaborationpackage.EMCRelation
	 * @generated
	 */
	EClass getEMCRelation();

	/**
	 * Returns the meta object for the reference '{@link vpml.collaborationpackage.EMCRelation#getSourceRelationSourceObj <em>Source Relation Source Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Relation Source Obj</em>'.
	 * @see vpml.collaborationpackage.EMCRelation#getSourceRelationSourceObj()
	 * @see #getEMCRelation()
	 * @generated
	 */
	EReference getEMCRelation_SourceRelationSourceObj();

	/**
	 * Returns the meta object for the reference '{@link vpml.collaborationpackage.EMCRelation#getTargetRelationTargetObj <em>Target Relation Target Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Relation Target Obj</em>'.
	 * @see vpml.collaborationpackage.EMCRelation#getTargetRelationTargetObj()
	 * @see #getEMCRelation()
	 * @generated
	 */
	EReference getEMCRelation_TargetRelationTargetObj();

	/**
	 * Returns the meta object for class '{@link vpml.collaborationpackage.EMCCollaborationRelation <em>EMC Collaboration Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMC Collaboration Relation</em>'.
	 * @see vpml.collaborationpackage.EMCCollaborationRelation
	 * @generated
	 */
	EClass getEMCCollaborationRelation();

	/**
	 * Returns the meta object for the container reference '{@link vpml.collaborationpackage.EMCCollaborationRelation#getColColRelationDiagram <em>Col Col Relation Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Col Col Relation Diagram</em>'.
	 * @see vpml.collaborationpackage.EMCCollaborationRelation#getColColRelationDiagram()
	 * @see #getEMCCollaborationRelation()
	 * @generated
	 */
	EReference getEMCCollaborationRelation_ColColRelationDiagram();

	/**
	 * Returns the meta object for class '{@link vpml.collaborationpackage.EMCSequenceRelation <em>EMC Sequence Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMC Sequence Relation</em>'.
	 * @see vpml.collaborationpackage.EMCSequenceRelation
	 * @generated
	 */
	EClass getEMCSequenceRelation();

	/**
	 * Returns the meta object for the container reference '{@link vpml.collaborationpackage.EMCSequenceRelation#getColSeqRelationDiagram <em>Col Seq Relation Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Col Seq Relation Diagram</em>'.
	 * @see vpml.collaborationpackage.EMCSequenceRelation#getColSeqRelationDiagram()
	 * @see #getEMCSequenceRelation()
	 * @generated
	 */
	EReference getEMCSequenceRelation_ColSeqRelationDiagram();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CollaborationpackageFactory getCollaborationpackageFactory();

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
		 * The meta object literal for the '{@link vpml.collaborationpackage.impl.EMCLogicalConnectorImpl <em>EMC Logical Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.collaborationpackage.impl.EMCLogicalConnectorImpl
		 * @see vpml.collaborationpackage.impl.CollaborationpackagePackageImpl#getEMCLogicalConnector()
		 * @generated
		 */
		EClass EMC_LOGICAL_CONNECTOR = eINSTANCE.getEMCLogicalConnector();

		/**
		 * The meta object literal for the '{@link vpml.collaborationpackage.impl.EMCAndImpl <em>EMC And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.collaborationpackage.impl.EMCAndImpl
		 * @see vpml.collaborationpackage.impl.CollaborationpackagePackageImpl#getEMCAnd()
		 * @generated
		 */
		EClass EMC_AND = eINSTANCE.getEMCAnd();

		/**
		 * The meta object literal for the '<em><b>Col And Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMC_AND__COL_AND_DIAGRAM = eINSTANCE.getEMCAnd_ColAndDiagram();

		/**
		 * The meta object literal for the '{@link vpml.collaborationpackage.impl.EMCORImpl <em>EMCOR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.collaborationpackage.impl.EMCORImpl
		 * @see vpml.collaborationpackage.impl.CollaborationpackagePackageImpl#getEMCOR()
		 * @generated
		 */
		EClass EMCOR = eINSTANCE.getEMCOR();

		/**
		 * The meta object literal for the '<em><b>Col OR Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMCOR__COL_OR_DIAGRAM = eINSTANCE.getEMCOR_ColORDiagram();

		/**
		 * The meta object literal for the '{@link vpml.collaborationpackage.impl.EMCCollaborationGroupImpl <em>EMC Collaboration Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.collaborationpackage.impl.EMCCollaborationGroupImpl
		 * @see vpml.collaborationpackage.impl.CollaborationpackagePackageImpl#getEMCCollaborationGroup()
		 * @generated
		 */
		EClass EMC_COLLABORATION_GROUP = eINSTANCE.getEMCCollaborationGroup();

		/**
		 * The meta object literal for the '<em><b>Col Col Group Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMC_COLLABORATION_GROUP__COL_COL_GROUP_DIAGRAM = eINSTANCE.getEMCCollaborationGroup_ColColGroupDiagram();

		/**
		 * The meta object literal for the '{@link vpml.collaborationpackage.impl.EMCDiagramImpl <em>EMC Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.collaborationpackage.impl.EMCDiagramImpl
		 * @see vpml.collaborationpackage.impl.CollaborationpackagePackageImpl#getEMCDiagram()
		 * @generated
		 */
		EClass EMC_DIAGRAM = eINSTANCE.getEMCDiagram();

		/**
		 * The meta object literal for the '<em><b>Emp Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMC_DIAGRAM__EMP_DIAGRAM = eINSTANCE.getEMCDiagram_EmpDiagram();

		/**
		 * The meta object literal for the '<em><b>Associate Pr Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMC_DIAGRAM__ASSOCIATE_PR_MODEL = eINSTANCE.getEMCDiagram_AssociatePrModel();

		/**
		 * The meta object literal for the '<em><b>Col And</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMC_DIAGRAM__COL_AND = eINSTANCE.getEMCDiagram_ColAnd();

		/**
		 * The meta object literal for the '<em><b>Col OR</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMC_DIAGRAM__COL_OR = eINSTANCE.getEMCDiagram_ColOR();

		/**
		 * The meta object literal for the '<em><b>Col Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMC_DIAGRAM__COL_ROLE = eINSTANCE.getEMCDiagram_ColRole();

		/**
		 * The meta object literal for the '<em><b>Col Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMC_DIAGRAM__COL_LOCATION = eINSTANCE.getEMCDiagram_ColLocation();

		/**
		 * The meta object literal for the '<em><b>Col Machine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMC_DIAGRAM__COL_MACHINE = eINSTANCE.getEMCDiagram_ColMachine();

		/**
		 * The meta object literal for the '<em><b>Col EMO Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMC_DIAGRAM__COL_EMO_GROUP = eINSTANCE.getEMCDiagram_ColEMOGroup();

		/**
		 * The meta object literal for the '<em><b>Col Col Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMC_DIAGRAM__COL_COL_GROUP = eINSTANCE.getEMCDiagram_ColColGroup();

		/**
		 * The meta object literal for the '<em><b>Col Col Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMC_DIAGRAM__COL_COL_RELATION = eINSTANCE.getEMCDiagram_ColColRelation();

		/**
		 * The meta object literal for the '<em><b>Col Seq Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMC_DIAGRAM__COL_SEQ_RELATION = eINSTANCE.getEMCDiagram_ColSeqRelation();

		/**
		 * The meta object literal for the '{@link vpml.collaborationpackage.impl.EMCRelationImpl <em>EMC Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.collaborationpackage.impl.EMCRelationImpl
		 * @see vpml.collaborationpackage.impl.CollaborationpackagePackageImpl#getEMCRelation()
		 * @generated
		 */
		EClass EMC_RELATION = eINSTANCE.getEMCRelation();

		/**
		 * The meta object literal for the '<em><b>Source Relation Source Obj</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMC_RELATION__SOURCE_RELATION_SOURCE_OBJ = eINSTANCE.getEMCRelation_SourceRelationSourceObj();

		/**
		 * The meta object literal for the '<em><b>Target Relation Target Obj</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMC_RELATION__TARGET_RELATION_TARGET_OBJ = eINSTANCE.getEMCRelation_TargetRelationTargetObj();

		/**
		 * The meta object literal for the '{@link vpml.collaborationpackage.impl.EMCCollaborationRelationImpl <em>EMC Collaboration Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.collaborationpackage.impl.EMCCollaborationRelationImpl
		 * @see vpml.collaborationpackage.impl.CollaborationpackagePackageImpl#getEMCCollaborationRelation()
		 * @generated
		 */
		EClass EMC_COLLABORATION_RELATION = eINSTANCE.getEMCCollaborationRelation();

		/**
		 * The meta object literal for the '<em><b>Col Col Relation Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMC_COLLABORATION_RELATION__COL_COL_RELATION_DIAGRAM = eINSTANCE.getEMCCollaborationRelation_ColColRelationDiagram();

		/**
		 * The meta object literal for the '{@link vpml.collaborationpackage.impl.EMCSequenceRelationImpl <em>EMC Sequence Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.collaborationpackage.impl.EMCSequenceRelationImpl
		 * @see vpml.collaborationpackage.impl.CollaborationpackagePackageImpl#getEMCSequenceRelation()
		 * @generated
		 */
		EClass EMC_SEQUENCE_RELATION = eINSTANCE.getEMCSequenceRelation();

		/**
		 * The meta object literal for the '<em><b>Col Seq Relation Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMC_SEQUENCE_RELATION__COL_SEQ_RELATION_DIAGRAM = eINSTANCE.getEMCSequenceRelation_ColSeqRelationDiagram();

	}

} //CollaborationpackagePackage
