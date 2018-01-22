/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.informationpackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see vpml.informationpackage.InformationpackageFactory
 * @model kind="package"
 * @generated
 */
public interface InformationpackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "informationpackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///vpml/informationpackage.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vpml.informationpackage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InformationpackagePackage eINSTANCE = vpml.informationpackage.impl.InformationpackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link vpml.informationpackage.impl.EMIComplexItemImpl <em>EMI Complex Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.informationpackage.impl.EMIComplexItemImpl
	 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMIComplexItem()
	 * @generated
	 */
	int EMI_COMPLEX_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ITEM__NAME = VpmlPackage.EM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ITEM__ID = VpmlPackage.EM_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ITEM__CODE = VpmlPackage.EM_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ITEM__DESCRIPTION = VpmlPackage.EM_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ITEM__OID = VpmlPackage.EM_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ITEM__SOURCE_OBJ_SOURCE_RELATION = VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ITEM__TARGET_OBJ_TARGET_RELATION = VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The number of structural features of the '<em>EMI Complex Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ITEM_FEATURE_COUNT = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link vpml.informationpackage.impl.EMIFormImpl <em>EMI Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.informationpackage.impl.EMIFormImpl
	 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMIForm()
	 * @generated
	 */
	int EMI_FORM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FORM__NAME = EMI_COMPLEX_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FORM__ID = EMI_COMPLEX_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FORM__CODE = EMI_COMPLEX_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FORM__DESCRIPTION = EMI_COMPLEX_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FORM__OID = EMI_COMPLEX_ITEM__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FORM__SOURCE_OBJ_SOURCE_RELATION = EMI_COMPLEX_ITEM__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FORM__TARGET_OBJ_TARGET_RELATION = EMI_COMPLEX_ITEM__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FORM__ATTRIBUTES = EMI_COMPLEX_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_FORM_FEATURE_COUNT = EMI_COMPLEX_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.informationpackage.impl.EMIEnumImpl <em>EMI Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.informationpackage.impl.EMIEnumImpl
	 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMIEnum()
	 * @generated
	 */
	int EMI_ENUM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM__NAME = EMI_COMPLEX_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM__ID = EMI_COMPLEX_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM__CODE = EMI_COMPLEX_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM__DESCRIPTION = EMI_COMPLEX_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM__OID = EMI_COMPLEX_ITEM__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM__SOURCE_OBJ_SOURCE_RELATION = EMI_COMPLEX_ITEM__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM__TARGET_OBJ_TARGET_RELATION = EMI_COMPLEX_ITEM__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM__LITERALS = EMI_COMPLEX_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM_FEATURE_COUNT = EMI_COMPLEX_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.informationpackage.impl.EMIEnumLiteralImpl <em>EMI Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.informationpackage.impl.EMIEnumLiteralImpl
	 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMIEnumLiteral()
	 * @generated
	 */
	int EMI_ENUM_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM_LITERAL__NAME = VpmlPackage.EM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM_LITERAL__ID = VpmlPackage.EM_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM_LITERAL__CODE = VpmlPackage.EM_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM_LITERAL__DESCRIPTION = VpmlPackage.EM_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM_LITERAL__OID = VpmlPackage.EM_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM_LITERAL__SOURCE_OBJ_SOURCE_RELATION = VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM_LITERAL__TARGET_OBJ_TARGET_RELATION = VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM_LITERAL__LITERAL = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM_LITERAL__VALUE = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM_LITERAL__ENUM = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EMI Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ENUM_LITERAL_FEATURE_COUNT = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link vpml.informationpackage.impl.EMIAttributeImpl <em>EMI Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.informationpackage.impl.EMIAttributeImpl
	 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMIAttribute()
	 * @generated
	 */
	int EMI_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ATTRIBUTE__NAME = VpmlPackage.EM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ATTRIBUTE__ID = VpmlPackage.EM_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ATTRIBUTE__CODE = VpmlPackage.EM_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ATTRIBUTE__DESCRIPTION = VpmlPackage.EM_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ATTRIBUTE__OID = VpmlPackage.EM_OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ATTRIBUTE__SOURCE_OBJ_SOURCE_RELATION = VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ATTRIBUTE__TARGET_OBJ_TARGET_RELATION = VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Maximun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ATTRIBUTE__MAXIMUN = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ATTRIBUTE__MINIMUM = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Form</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ATTRIBUTE__FORM = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ATTRIBUTE__LIST = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EMI Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_ATTRIBUTE_FEATURE_COUNT = VpmlPackage.EM_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link vpml.informationpackage.impl.EMISimpleAttributeImpl <em>EMI Simple Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.informationpackage.impl.EMISimpleAttributeImpl
	 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMISimpleAttribute()
	 * @generated
	 */
	int EMI_SIMPLE_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_SIMPLE_ATTRIBUTE__NAME = EMI_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_SIMPLE_ATTRIBUTE__ID = EMI_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_SIMPLE_ATTRIBUTE__CODE = EMI_ATTRIBUTE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_SIMPLE_ATTRIBUTE__DESCRIPTION = EMI_ATTRIBUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_SIMPLE_ATTRIBUTE__OID = EMI_ATTRIBUTE__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_SIMPLE_ATTRIBUTE__SOURCE_OBJ_SOURCE_RELATION = EMI_ATTRIBUTE__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_SIMPLE_ATTRIBUTE__TARGET_OBJ_TARGET_RELATION = EMI_ATTRIBUTE__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Maximun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_SIMPLE_ATTRIBUTE__MAXIMUN = EMI_ATTRIBUTE__MAXIMUN;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_SIMPLE_ATTRIBUTE__MINIMUM = EMI_ATTRIBUTE__MINIMUM;

	/**
	 * The feature id for the '<em><b>Form</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_SIMPLE_ATTRIBUTE__FORM = EMI_ATTRIBUTE__FORM;

	/**
	 * The feature id for the '<em><b>List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_SIMPLE_ATTRIBUTE__LIST = EMI_ATTRIBUTE__LIST;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_SIMPLE_ATTRIBUTE__TYPE = EMI_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI Simple Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_SIMPLE_ATTRIBUTE_FEATURE_COUNT = EMI_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.informationpackage.impl.EMIListImpl <em>EMI List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.informationpackage.impl.EMIListImpl
	 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMIList()
	 * @generated
	 */
	int EMI_LIST = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LIST__NAME = EMI_COMPLEX_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LIST__ID = EMI_COMPLEX_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LIST__CODE = EMI_COMPLEX_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LIST__DESCRIPTION = EMI_COMPLEX_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LIST__OID = EMI_COMPLEX_ITEM__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LIST__SOURCE_OBJ_SOURCE_RELATION = EMI_COMPLEX_ITEM__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LIST__TARGET_OBJ_TARGET_RELATION = EMI_COMPLEX_ITEM__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LIST__ATTRIBUTES = EMI_COMPLEX_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_LIST_FEATURE_COUNT = EMI_COMPLEX_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.informationpackage.impl.EMIStatAttributeImpl <em>EMI Stat Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.informationpackage.impl.EMIStatAttributeImpl
	 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMIStatAttribute()
	 * @generated
	 */
	int EMI_STAT_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STAT_ATTRIBUTE__NAME = EMI_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STAT_ATTRIBUTE__ID = EMI_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STAT_ATTRIBUTE__CODE = EMI_ATTRIBUTE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STAT_ATTRIBUTE__DESCRIPTION = EMI_ATTRIBUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STAT_ATTRIBUTE__OID = EMI_ATTRIBUTE__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STAT_ATTRIBUTE__SOURCE_OBJ_SOURCE_RELATION = EMI_ATTRIBUTE__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STAT_ATTRIBUTE__TARGET_OBJ_TARGET_RELATION = EMI_ATTRIBUTE__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Maximun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STAT_ATTRIBUTE__MAXIMUN = EMI_ATTRIBUTE__MAXIMUN;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STAT_ATTRIBUTE__MINIMUM = EMI_ATTRIBUTE__MINIMUM;

	/**
	 * The feature id for the '<em><b>Form</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STAT_ATTRIBUTE__FORM = EMI_ATTRIBUTE__FORM;

	/**
	 * The feature id for the '<em><b>List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STAT_ATTRIBUTE__LIST = EMI_ATTRIBUTE__LIST;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STAT_ATTRIBUTE__EXPRESSIONS = EMI_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STAT_ATTRIBUTE__DEFAULT_VALUE = EMI_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMI Stat Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_STAT_ATTRIBUTE_FEATURE_COUNT = EMI_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link vpml.informationpackage.impl.EMIComplexAttributeImpl <em>EMI Complex Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.informationpackage.impl.EMIComplexAttributeImpl
	 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMIComplexAttribute()
	 * @generated
	 */
	int EMI_COMPLEX_ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ATTRIBUTE__NAME = EMI_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ATTRIBUTE__ID = EMI_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ATTRIBUTE__CODE = EMI_ATTRIBUTE__CODE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ATTRIBUTE__DESCRIPTION = EMI_ATTRIBUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ATTRIBUTE__OID = EMI_ATTRIBUTE__OID;

	/**
	 * The feature id for the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ATTRIBUTE__SOURCE_OBJ_SOURCE_RELATION = EMI_ATTRIBUTE__SOURCE_OBJ_SOURCE_RELATION;

	/**
	 * The feature id for the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ATTRIBUTE__TARGET_OBJ_TARGET_RELATION = EMI_ATTRIBUTE__TARGET_OBJ_TARGET_RELATION;

	/**
	 * The feature id for the '<em><b>Maximun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ATTRIBUTE__MAXIMUN = EMI_ATTRIBUTE__MAXIMUN;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ATTRIBUTE__MINIMUM = EMI_ATTRIBUTE__MINIMUM;

	/**
	 * The feature id for the '<em><b>Form</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ATTRIBUTE__FORM = EMI_ATTRIBUTE__FORM;

	/**
	 * The feature id for the '<em><b>List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ATTRIBUTE__LIST = EMI_ATTRIBUTE__LIST;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ATTRIBUTE__COMPLEX_TYPE = EMI_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMI Complex Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMI_COMPLEX_ATTRIBUTE_FEATURE_COUNT = EMI_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link vpml.informationpackage.EMISimpleType <em>EMI Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.informationpackage.EMISimpleType
	 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMISimpleType()
	 * @generated
	 */
	int EMI_SIMPLE_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link vpml.informationpackage.EMIComplexItem <em>EMI Complex Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Complex Item</em>'.
	 * @see vpml.informationpackage.EMIComplexItem
	 * @generated
	 */
	EClass getEMIComplexItem();

	/**
	 * Returns the meta object for class '{@link vpml.informationpackage.EMIForm <em>EMI Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Form</em>'.
	 * @see vpml.informationpackage.EMIForm
	 * @generated
	 */
	EClass getEMIForm();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.informationpackage.EMIForm#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see vpml.informationpackage.EMIForm#getAttributes()
	 * @see #getEMIForm()
	 * @generated
	 */
	EReference getEMIForm_Attributes();

	/**
	 * Returns the meta object for class '{@link vpml.informationpackage.EMIEnum <em>EMI Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Enum</em>'.
	 * @see vpml.informationpackage.EMIEnum
	 * @generated
	 */
	EClass getEMIEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.informationpackage.EMIEnum#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see vpml.informationpackage.EMIEnum#getLiterals()
	 * @see #getEMIEnum()
	 * @generated
	 */
	EReference getEMIEnum_Literals();

	/**
	 * Returns the meta object for class '{@link vpml.informationpackage.EMIEnumLiteral <em>EMI Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Enum Literal</em>'.
	 * @see vpml.informationpackage.EMIEnumLiteral
	 * @generated
	 */
	EClass getEMIEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link vpml.informationpackage.EMIEnumLiteral#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see vpml.informationpackage.EMIEnumLiteral#getLiteral()
	 * @see #getEMIEnumLiteral()
	 * @generated
	 */
	EAttribute getEMIEnumLiteral_Literal();

	/**
	 * Returns the meta object for the attribute '{@link vpml.informationpackage.EMIEnumLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see vpml.informationpackage.EMIEnumLiteral#getValue()
	 * @see #getEMIEnumLiteral()
	 * @generated
	 */
	EAttribute getEMIEnumLiteral_Value();

	/**
	 * Returns the meta object for the container reference '{@link vpml.informationpackage.EMIEnumLiteral#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enum</em>'.
	 * @see vpml.informationpackage.EMIEnumLiteral#getEnum()
	 * @see #getEMIEnumLiteral()
	 * @generated
	 */
	EReference getEMIEnumLiteral_Enum();

	/**
	 * Returns the meta object for class '{@link vpml.informationpackage.EMISimpleAttribute <em>EMI Simple Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Simple Attribute</em>'.
	 * @see vpml.informationpackage.EMISimpleAttribute
	 * @generated
	 */
	EClass getEMISimpleAttribute();

	/**
	 * Returns the meta object for the attribute '{@link vpml.informationpackage.EMISimpleAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see vpml.informationpackage.EMISimpleAttribute#getType()
	 * @see #getEMISimpleAttribute()
	 * @generated
	 */
	EAttribute getEMISimpleAttribute_Type();

	/**
	 * Returns the meta object for class '{@link vpml.informationpackage.EMIList <em>EMI List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI List</em>'.
	 * @see vpml.informationpackage.EMIList
	 * @generated
	 */
	EClass getEMIList();

	/**
	 * Returns the meta object for the containment reference list '{@link vpml.informationpackage.EMIList#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see vpml.informationpackage.EMIList#getAttributes()
	 * @see #getEMIList()
	 * @generated
	 */
	EReference getEMIList_Attributes();

	/**
	 * Returns the meta object for class '{@link vpml.informationpackage.EMIStatAttribute <em>EMI Stat Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Stat Attribute</em>'.
	 * @see vpml.informationpackage.EMIStatAttribute
	 * @generated
	 */
	EClass getEMIStatAttribute();

	/**
	 * Returns the meta object for the attribute '{@link vpml.informationpackage.EMIStatAttribute#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expressions</em>'.
	 * @see vpml.informationpackage.EMIStatAttribute#getExpressions()
	 * @see #getEMIStatAttribute()
	 * @generated
	 */
	EAttribute getEMIStatAttribute_Expressions();

	/**
	 * Returns the meta object for the attribute '{@link vpml.informationpackage.EMIStatAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see vpml.informationpackage.EMIStatAttribute#getDefaultValue()
	 * @see #getEMIStatAttribute()
	 * @generated
	 */
	EAttribute getEMIStatAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link vpml.informationpackage.EMIComplexAttribute <em>EMI Complex Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Complex Attribute</em>'.
	 * @see vpml.informationpackage.EMIComplexAttribute
	 * @generated
	 */
	EClass getEMIComplexAttribute();

	/**
	 * Returns the meta object for the reference '{@link vpml.informationpackage.EMIComplexAttribute#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Complex Type</em>'.
	 * @see vpml.informationpackage.EMIComplexAttribute#getComplexType()
	 * @see #getEMIComplexAttribute()
	 * @generated
	 */
	EReference getEMIComplexAttribute_ComplexType();

	/**
	 * Returns the meta object for class '{@link vpml.informationpackage.EMIAttribute <em>EMI Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMI Attribute</em>'.
	 * @see vpml.informationpackage.EMIAttribute
	 * @generated
	 */
	EClass getEMIAttribute();

	/**
	 * Returns the meta object for the attribute '{@link vpml.informationpackage.EMIAttribute#getMaximun <em>Maximun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximun</em>'.
	 * @see vpml.informationpackage.EMIAttribute#getMaximun()
	 * @see #getEMIAttribute()
	 * @generated
	 */
	EAttribute getEMIAttribute_Maximun();

	/**
	 * Returns the meta object for the attribute '{@link vpml.informationpackage.EMIAttribute#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see vpml.informationpackage.EMIAttribute#getMinimum()
	 * @see #getEMIAttribute()
	 * @generated
	 */
	EAttribute getEMIAttribute_Minimum();

	/**
	 * Returns the meta object for the container reference '{@link vpml.informationpackage.EMIAttribute#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Form</em>'.
	 * @see vpml.informationpackage.EMIAttribute#getForm()
	 * @see #getEMIAttribute()
	 * @generated
	 */
	EReference getEMIAttribute_Form();

	/**
	 * Returns the meta object for the container reference '{@link vpml.informationpackage.EMIAttribute#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>List</em>'.
	 * @see vpml.informationpackage.EMIAttribute#getList()
	 * @see #getEMIAttribute()
	 * @generated
	 */
	EReference getEMIAttribute_List();

	/**
	 * Returns the meta object for enum '{@link vpml.informationpackage.EMISimpleType <em>EMI Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EMI Simple Type</em>'.
	 * @see vpml.informationpackage.EMISimpleType
	 * @generated
	 */
	EEnum getEMISimpleType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InformationpackageFactory getInformationpackageFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link vpml.informationpackage.impl.EMIComplexItemImpl <em>EMI Complex Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.informationpackage.impl.EMIComplexItemImpl
		 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMIComplexItem()
		 * @generated
		 */
		EClass EMI_COMPLEX_ITEM = eINSTANCE.getEMIComplexItem();

		/**
		 * The meta object literal for the '{@link vpml.informationpackage.impl.EMIFormImpl <em>EMI Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.informationpackage.impl.EMIFormImpl
		 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMIForm()
		 * @generated
		 */
		EClass EMI_FORM = eINSTANCE.getEMIForm();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_FORM__ATTRIBUTES = eINSTANCE.getEMIForm_Attributes();

		/**
		 * The meta object literal for the '{@link vpml.informationpackage.impl.EMIEnumImpl <em>EMI Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.informationpackage.impl.EMIEnumImpl
		 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMIEnum()
		 * @generated
		 */
		EClass EMI_ENUM = eINSTANCE.getEMIEnum();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_ENUM__LITERALS = eINSTANCE.getEMIEnum_Literals();

		/**
		 * The meta object literal for the '{@link vpml.informationpackage.impl.EMIEnumLiteralImpl <em>EMI Enum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.informationpackage.impl.EMIEnumLiteralImpl
		 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMIEnumLiteral()
		 * @generated
		 */
		EClass EMI_ENUM_LITERAL = eINSTANCE.getEMIEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_ENUM_LITERAL__LITERAL = eINSTANCE.getEMIEnumLiteral_Literal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_ENUM_LITERAL__VALUE = eINSTANCE.getEMIEnumLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_ENUM_LITERAL__ENUM = eINSTANCE.getEMIEnumLiteral_Enum();

		/**
		 * The meta object literal for the '{@link vpml.informationpackage.impl.EMISimpleAttributeImpl <em>EMI Simple Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.informationpackage.impl.EMISimpleAttributeImpl
		 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMISimpleAttribute()
		 * @generated
		 */
		EClass EMI_SIMPLE_ATTRIBUTE = eINSTANCE.getEMISimpleAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_SIMPLE_ATTRIBUTE__TYPE = eINSTANCE.getEMISimpleAttribute_Type();

		/**
		 * The meta object literal for the '{@link vpml.informationpackage.impl.EMIListImpl <em>EMI List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.informationpackage.impl.EMIListImpl
		 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMIList()
		 * @generated
		 */
		EClass EMI_LIST = eINSTANCE.getEMIList();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_LIST__ATTRIBUTES = eINSTANCE.getEMIList_Attributes();

		/**
		 * The meta object literal for the '{@link vpml.informationpackage.impl.EMIStatAttributeImpl <em>EMI Stat Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.informationpackage.impl.EMIStatAttributeImpl
		 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMIStatAttribute()
		 * @generated
		 */
		EClass EMI_STAT_ATTRIBUTE = eINSTANCE.getEMIStatAttribute();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_STAT_ATTRIBUTE__EXPRESSIONS = eINSTANCE.getEMIStatAttribute_Expressions();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_STAT_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getEMIStatAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link vpml.informationpackage.impl.EMIComplexAttributeImpl <em>EMI Complex Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.informationpackage.impl.EMIComplexAttributeImpl
		 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMIComplexAttribute()
		 * @generated
		 */
		EClass EMI_COMPLEX_ATTRIBUTE = eINSTANCE.getEMIComplexAttribute();

		/**
		 * The meta object literal for the '<em><b>Complex Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_COMPLEX_ATTRIBUTE__COMPLEX_TYPE = eINSTANCE.getEMIComplexAttribute_ComplexType();

		/**
		 * The meta object literal for the '{@link vpml.informationpackage.impl.EMIAttributeImpl <em>EMI Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.informationpackage.impl.EMIAttributeImpl
		 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMIAttribute()
		 * @generated
		 */
		EClass EMI_ATTRIBUTE = eINSTANCE.getEMIAttribute();

		/**
		 * The meta object literal for the '<em><b>Maximun</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_ATTRIBUTE__MAXIMUN = eINSTANCE.getEMIAttribute_Maximun();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMI_ATTRIBUTE__MINIMUM = eINSTANCE.getEMIAttribute_Minimum();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_ATTRIBUTE__FORM = eINSTANCE.getEMIAttribute_Form();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMI_ATTRIBUTE__LIST = eINSTANCE.getEMIAttribute_List();

		/**
		 * The meta object literal for the '{@link vpml.informationpackage.EMISimpleType <em>EMI Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.informationpackage.EMISimpleType
		 * @see vpml.informationpackage.impl.InformationpackagePackageImpl#getEMISimpleType()
		 * @generated
		 */
		EEnum EMI_SIMPLE_TYPE = eINSTANCE.getEMISimpleType();

	}

} //InformationpackagePackage
