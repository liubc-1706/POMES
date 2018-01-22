/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see vpml.VpmlFactory
 * @model kind="package"
 * @generated
 */
public interface VpmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vpml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///vpml.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vpml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VpmlPackage eINSTANCE = vpml.impl.VpmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link vpml.impl.EMObjectImpl <em>EM Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.impl.EMObjectImpl
	 * @see vpml.impl.VpmlPackageImpl#getEMObject()
	 * @generated
	 */
	int EM_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_OBJECT__ID = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_OBJECT__CODE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_OBJECT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_OBJECT__OID = 4;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION = 5;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_OBJECT__TARGET_OBJ_TARGET_RELATION = 6;

	/**
	 * The number of structural features of the '<em>EM Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_OBJECT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link vpml.impl.EMModelImpl <em>EM Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.impl.EMModelImpl
	 * @see vpml.impl.VpmlPackageImpl#getEMModel()
	 * @generated
	 */
	int EM_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_MODEL__NAME = EM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_MODEL__ID = EM_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_MODEL__CODE = EM_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_MODEL__DESCRIPTION = EM_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_MODEL__OID = EM_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_MODEL__SOURCE_OBJ_SOURCE_RELATION = EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_MODEL__TARGET_OBJ_TARGET_RELATION = EM_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The number of structural features of the '<em>EM Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_MODEL_FEATURE_COUNT = EM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link vpml.impl.EMDiagramImpl <em>EM Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.impl.EMDiagramImpl
	 * @see vpml.impl.VpmlPackageImpl#getEMDiagram()
	 * @generated
	 */
	int EM_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_DIAGRAM__NAME = EM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_DIAGRAM__ID = EM_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_DIAGRAM__CODE = EM_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_DIAGRAM__DESCRIPTION = EM_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_DIAGRAM__OID = EM_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_DIAGRAM__SOURCE_OBJ_SOURCE_RELATION = EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_DIAGRAM__TARGET_OBJ_TARGET_RELATION = EM_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Creater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_DIAGRAM__CREATER = EM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_DIAGRAM__CREATED_DATE = EM_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_DIAGRAM__LAST_MODIFIER = EM_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_DIAGRAM__LAST_MODIFIED_DATE = EM_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EM Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_DIAGRAM_FEATURE_COUNT = EM_OBJECT_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link vpml.EMObject <em>EM Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EM Object</em>'.
	 * @see vpml.EMObject
	 * @generated
	 */
	EClass getEMObject();

	/**
	 * Returns the meta object for the attribute '{@link vpml.EMObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vpml.EMObject#getName()
	 * @see #getEMObject()
	 * @generated
	 */
	EAttribute getEMObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link vpml.EMObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see vpml.EMObject#getId()
	 * @see #getEMObject()
	 * @generated
	 */
	EAttribute getEMObject_Id();

	/**
	 * Returns the meta object for the attribute '{@link vpml.EMObject#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see vpml.EMObject#getCode()
	 * @see #getEMObject()
	 * @generated
	 */
	EAttribute getEMObject_Code();

	/**
	 * Returns the meta object for the attribute '{@link vpml.EMObject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see vpml.EMObject#getDescription()
	 * @see #getEMObject()
	 * @generated
	 */
	EAttribute getEMObject_Description();

	/**
	 * Returns the meta object for the attribute '{@link vpml.EMObject#getOID <em>OID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OID</em>'.
	 * @see vpml.EMObject#getOID()
	 * @see #getEMObject()
	 * @generated
	 */
	EAttribute getEMObject_OID();

	/**
	 * Returns the meta object for the reference list '{@link vpml.EMObject#getSourceObjSourceRelation <em>Source Obj Source Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Obj Source Relation</em>'.
	 * @see vpml.EMObject#getSourceObjSourceRelation()
	 * @see #getEMObject()
	 * @generated
	 */
	EReference getEMObject_SourceObjSourceRelation();

	/**
	 * Returns the meta object for the reference list '{@link vpml.EMObject#getTargetObjTargetRelation <em>Target Obj Target Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Obj Target Relation</em>'.
	 * @see vpml.EMObject#getTargetObjTargetRelation()
	 * @see #getEMObject()
	 * @generated
	 */
	EReference getEMObject_TargetObjTargetRelation();

	/**
	 * Returns the meta object for class '{@link vpml.EMModel <em>EM Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EM Model</em>'.
	 * @see vpml.EMModel
	 * @generated
	 */
	EClass getEMModel();

	/**
	 * Returns the meta object for class '{@link vpml.EMDiagram <em>EM Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EM Diagram</em>'.
	 * @see vpml.EMDiagram
	 * @generated
	 */
	EClass getEMDiagram();

	/**
	 * Returns the meta object for the attribute '{@link vpml.EMDiagram#getCreater <em>Creater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creater</em>'.
	 * @see vpml.EMDiagram#getCreater()
	 * @see #getEMDiagram()
	 * @generated
	 */
	EAttribute getEMDiagram_Creater();

	/**
	 * Returns the meta object for the attribute '{@link vpml.EMDiagram#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see vpml.EMDiagram#getCreatedDate()
	 * @see #getEMDiagram()
	 * @generated
	 */
	EAttribute getEMDiagram_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link vpml.EMDiagram#getLastModifier <em>Last Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modifier</em>'.
	 * @see vpml.EMDiagram#getLastModifier()
	 * @see #getEMDiagram()
	 * @generated
	 */
	EAttribute getEMDiagram_LastModifier();

	/**
	 * Returns the meta object for the attribute '{@link vpml.EMDiagram#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see vpml.EMDiagram#getLastModifiedDate()
	 * @see #getEMDiagram()
	 * @generated
	 */
	EAttribute getEMDiagram_LastModifiedDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VpmlFactory getVpmlFactory();

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
		 * The meta object literal for the '{@link vpml.impl.EMObjectImpl <em>EM Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.impl.EMObjectImpl
		 * @see vpml.impl.VpmlPackageImpl#getEMObject()
		 * @generated
		 */
		EClass EM_OBJECT = eINSTANCE.getEMObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_OBJECT__NAME = eINSTANCE.getEMObject_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_OBJECT__ID = eINSTANCE.getEMObject_Id();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_OBJECT__CODE = eINSTANCE.getEMObject_Code();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_OBJECT__DESCRIPTION = eINSTANCE.getEMObject_Description();

		/**
		 * The meta object literal for the '<em><b>OID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_OBJECT__OID = eINSTANCE.getEMObject_OID();

		/**
		 * The meta object literal for the '<em><b>Source Obj Source Relation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION = eINSTANCE.getEMObject_SourceObjSourceRelation();

		/**
		 * The meta object literal for the '<em><b>Target Obj Target Relation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EM_OBJECT__TARGET_OBJ_TARGET_RELATION = eINSTANCE.getEMObject_TargetObjTargetRelation();

		/**
		 * The meta object literal for the '{@link vpml.impl.EMModelImpl <em>EM Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.impl.EMModelImpl
		 * @see vpml.impl.VpmlPackageImpl#getEMModel()
		 * @generated
		 */
		EClass EM_MODEL = eINSTANCE.getEMModel();

		/**
		 * The meta object literal for the '{@link vpml.impl.EMDiagramImpl <em>EM Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.impl.EMDiagramImpl
		 * @see vpml.impl.VpmlPackageImpl#getEMDiagram()
		 * @generated
		 */
		EClass EM_DIAGRAM = eINSTANCE.getEMDiagram();

		/**
		 * The meta object literal for the '<em><b>Creater</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_DIAGRAM__CREATER = eINSTANCE.getEMDiagram_Creater();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_DIAGRAM__CREATED_DATE = eINSTANCE.getEMDiagram_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Last Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_DIAGRAM__LAST_MODIFIER = eINSTANCE.getEMDiagram_LastModifier();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_DIAGRAM__LAST_MODIFIED_DATE = eINSTANCE.getEMDiagram_LastModifiedDate();

	}

} //VpmlPackage
