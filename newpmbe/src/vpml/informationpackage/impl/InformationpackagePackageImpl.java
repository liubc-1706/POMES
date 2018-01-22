/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.informationpackage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import vpml.VpmlPackage;

import vpml.collaborationpackage.CollaborationpackagePackage;

import vpml.collaborationpackage.impl.CollaborationpackagePackageImpl;

import vpml.impl.VpmlPackageImpl;

import vpml.infopackage.InfopackagePackage;

import vpml.infopackage.impl.InfopackagePackageImpl;

import vpml.informationpackage.EMIAttribute;
import vpml.informationpackage.EMIComplexAttribute;
import vpml.informationpackage.EMIComplexItem;
import vpml.informationpackage.EMIEnum;
import vpml.informationpackage.EMIEnumLiteral;
import vpml.informationpackage.EMIForm;
import vpml.informationpackage.EMIList;
import vpml.informationpackage.EMISimpleAttribute;
import vpml.informationpackage.EMISimpleType;
import vpml.informationpackage.EMIStatAttribute;
import vpml.informationpackage.InformationpackageFactory;
import vpml.informationpackage.InformationpackagePackage;

import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.organizationpackage.impl.OrganizationpackagePackageImpl;

import vpml.processpackage.ProcesspackagePackage;

import vpml.processpackage.impl.ProcesspackagePackageImpl;

import vpml.resourcepackage.ResourcepackagePackage;

import vpml.resourcepackage.impl.ResourcepackagePackageImpl;

import vpml.utilpackage.UtilpackagePackage;

import vpml.utilpackage.impl.UtilpackagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InformationpackagePackageImpl extends EPackageImpl implements InformationpackagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiComplexItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiSimpleAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiStatAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiComplexAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum emiSimpleTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see vpml.informationpackage.InformationpackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InformationpackagePackageImpl() {
		super(eNS_URI, InformationpackageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InformationpackagePackage init() {
		if (isInited) return (InformationpackagePackage)EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI);

		// Obtain or create and register package
		InformationpackagePackageImpl theInformationpackagePackage = (InformationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof InformationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new InformationpackagePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VpmlPackageImpl theVpmlPackage = (VpmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI) instanceof VpmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI) : VpmlPackage.eINSTANCE);
		OrganizationpackagePackageImpl theOrganizationpackagePackage = (OrganizationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI) instanceof OrganizationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI) : OrganizationpackagePackage.eINSTANCE);
		ResourcepackagePackageImpl theResourcepackagePackage = (ResourcepackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI) instanceof ResourcepackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI) : ResourcepackagePackage.eINSTANCE);
		ProcesspackagePackageImpl theProcesspackagePackage = (ProcesspackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI) instanceof ProcesspackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI) : ProcesspackagePackage.eINSTANCE);
		UtilpackagePackageImpl theUtilpackagePackage = (UtilpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI) instanceof UtilpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI) : UtilpackagePackage.eINSTANCE);
		InfopackagePackageImpl theInfopackagePackage = (InfopackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI) instanceof InfopackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI) : InfopackagePackage.eINSTANCE);
		CollaborationpackagePackageImpl theCollaborationpackagePackage = (CollaborationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI) instanceof CollaborationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI) : CollaborationpackagePackage.eINSTANCE);

		// Create package meta-data objects
		theInformationpackagePackage.createPackageContents();
		theVpmlPackage.createPackageContents();
		theOrganizationpackagePackage.createPackageContents();
		theResourcepackagePackage.createPackageContents();
		theProcesspackagePackage.createPackageContents();
		theUtilpackagePackage.createPackageContents();
		theInfopackagePackage.createPackageContents();
		theCollaborationpackagePackage.createPackageContents();

		// Initialize created meta-data
		theInformationpackagePackage.initializePackageContents();
		theVpmlPackage.initializePackageContents();
		theOrganizationpackagePackage.initializePackageContents();
		theResourcepackagePackage.initializePackageContents();
		theProcesspackagePackage.initializePackageContents();
		theUtilpackagePackage.initializePackageContents();
		theInfopackagePackage.initializePackageContents();
		theCollaborationpackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInformationpackagePackage.freeze();

		return theInformationpackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIComplexItem() {
		return emiComplexItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIForm() {
		return emiFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIForm_Attributes() {
		return (EReference)emiFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIEnum() {
		return emiEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIEnum_Literals() {
		return (EReference)emiEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIEnumLiteral() {
		return emiEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMIEnumLiteral_Literal() {
		return (EAttribute)emiEnumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMIEnumLiteral_Value() {
		return (EAttribute)emiEnumLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIEnumLiteral_Enum() {
		return (EReference)emiEnumLiteralEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMISimpleAttribute() {
		return emiSimpleAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMISimpleAttribute_Type() {
		return (EAttribute)emiSimpleAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIList() {
		return emiListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIList_Attributes() {
		return (EReference)emiListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIStatAttribute() {
		return emiStatAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMIStatAttribute_Expressions() {
		return (EAttribute)emiStatAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMIStatAttribute_DefaultValue() {
		return (EAttribute)emiStatAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIComplexAttribute() {
		return emiComplexAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIComplexAttribute_ComplexType() {
		return (EReference)emiComplexAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIAttribute() {
		return emiAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMIAttribute_Maximun() {
		return (EAttribute)emiAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMIAttribute_Minimum() {
		return (EAttribute)emiAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIAttribute_Form() {
		return (EReference)emiAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIAttribute_List() {
		return (EReference)emiAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEMISimpleType() {
		return emiSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationpackageFactory getInformationpackageFactory() {
		return (InformationpackageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		emiComplexItemEClass = createEClass(EMI_COMPLEX_ITEM);

		emiFormEClass = createEClass(EMI_FORM);
		createEReference(emiFormEClass, EMI_FORM__ATTRIBUTES);

		emiEnumEClass = createEClass(EMI_ENUM);
		createEReference(emiEnumEClass, EMI_ENUM__LITERALS);

		emiEnumLiteralEClass = createEClass(EMI_ENUM_LITERAL);
		createEAttribute(emiEnumLiteralEClass, EMI_ENUM_LITERAL__LITERAL);
		createEAttribute(emiEnumLiteralEClass, EMI_ENUM_LITERAL__VALUE);
		createEReference(emiEnumLiteralEClass, EMI_ENUM_LITERAL__ENUM);

		emiSimpleAttributeEClass = createEClass(EMI_SIMPLE_ATTRIBUTE);
		createEAttribute(emiSimpleAttributeEClass, EMI_SIMPLE_ATTRIBUTE__TYPE);

		emiListEClass = createEClass(EMI_LIST);
		createEReference(emiListEClass, EMI_LIST__ATTRIBUTES);

		emiStatAttributeEClass = createEClass(EMI_STAT_ATTRIBUTE);
		createEAttribute(emiStatAttributeEClass, EMI_STAT_ATTRIBUTE__EXPRESSIONS);
		createEAttribute(emiStatAttributeEClass, EMI_STAT_ATTRIBUTE__DEFAULT_VALUE);

		emiComplexAttributeEClass = createEClass(EMI_COMPLEX_ATTRIBUTE);
		createEReference(emiComplexAttributeEClass, EMI_COMPLEX_ATTRIBUTE__COMPLEX_TYPE);

		emiAttributeEClass = createEClass(EMI_ATTRIBUTE);
		createEAttribute(emiAttributeEClass, EMI_ATTRIBUTE__MAXIMUN);
		createEAttribute(emiAttributeEClass, EMI_ATTRIBUTE__MINIMUM);
		createEReference(emiAttributeEClass, EMI_ATTRIBUTE__FORM);
		createEReference(emiAttributeEClass, EMI_ATTRIBUTE__LIST);

		// Create enums
		emiSimpleTypeEEnum = createEEnum(EMI_SIMPLE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		VpmlPackage theVpmlPackage = (VpmlPackage)EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI);

		// Add supertypes to classes
		emiComplexItemEClass.getESuperTypes().add(theVpmlPackage.getEMObject());
		emiFormEClass.getESuperTypes().add(this.getEMIComplexItem());
		emiEnumEClass.getESuperTypes().add(this.getEMIComplexItem());
		emiEnumLiteralEClass.getESuperTypes().add(theVpmlPackage.getEMObject());
		emiSimpleAttributeEClass.getESuperTypes().add(this.getEMIAttribute());
		emiListEClass.getESuperTypes().add(this.getEMIComplexItem());
		emiStatAttributeEClass.getESuperTypes().add(this.getEMIAttribute());
		emiComplexAttributeEClass.getESuperTypes().add(this.getEMIAttribute());
		emiAttributeEClass.getESuperTypes().add(theVpmlPackage.getEMObject());

		// Initialize classes and features; add operations and parameters
		initEClass(emiComplexItemEClass, EMIComplexItem.class, "EMIComplexItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emiFormEClass, EMIForm.class, "EMIForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIForm_Attributes(), this.getEMIAttribute(), this.getEMIAttribute_Form(), "attributes", null, 0, -1, EMIForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiEnumEClass, EMIEnum.class, "EMIEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIEnum_Literals(), this.getEMIEnumLiteral(), this.getEMIEnumLiteral_Enum(), "literals", null, 1, -1, EMIEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiEnumLiteralEClass, EMIEnumLiteral.class, "EMIEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMIEnumLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, EMIEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMIEnumLiteral_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, EMIEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIEnumLiteral_Enum(), this.getEMIEnum(), this.getEMIEnum_Literals(), "enum", null, 1, 1, EMIEnumLiteral.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiSimpleAttributeEClass, EMISimpleAttribute.class, "EMISimpleAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMISimpleAttribute_Type(), this.getEMISimpleType(), "type", "", 0, 1, EMISimpleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiListEClass, EMIList.class, "EMIList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIList_Attributes(), this.getEMIAttribute(), this.getEMIAttribute_List(), "attributes", null, 0, -1, EMIList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiStatAttributeEClass, EMIStatAttribute.class, "EMIStatAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMIStatAttribute_Expressions(), ecorePackage.getEString(), "expressions", null, 0, 1, EMIStatAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMIStatAttribute_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, EMIStatAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiComplexAttributeEClass, EMIComplexAttribute.class, "EMIComplexAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIComplexAttribute_ComplexType(), this.getEMIComplexItem(), null, "complexType", null, 1, 1, EMIComplexAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiAttributeEClass, EMIAttribute.class, "EMIAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMIAttribute_Maximun(), ecorePackage.getEIntegerObject(), "maximun", "1", 0, 1, EMIAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMIAttribute_Minimum(), ecorePackage.getEIntegerObject(), "minimum", "1", 0, 1, EMIAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIAttribute_Form(), this.getEMIForm(), this.getEMIForm_Attributes(), "form", null, 0, 1, EMIAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIAttribute_List(), this.getEMIList(), this.getEMIList_Attributes(), "list", null, 0, 1, EMIAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(emiSimpleTypeEEnum, EMISimpleType.class, "EMISimpleType");
		addEEnumLiteral(emiSimpleTypeEEnum, EMISimpleType.STRING_LITERAL);
		addEEnumLiteral(emiSimpleTypeEEnum, EMISimpleType.INTEGER_LITERAL);
		addEEnumLiteral(emiSimpleTypeEEnum, EMISimpleType.DOUBLE_LITERAL);
		addEEnumLiteral(emiSimpleTypeEEnum, EMISimpleType.BOOLEAN_LITERAL);
		addEEnumLiteral(emiSimpleTypeEEnum, EMISimpleType.DATE_LITERAL);
		addEEnumLiteral(emiSimpleTypeEEnum, EMISimpleType.DATE_TIME_LITERAL);
		addEEnumLiteral(emiSimpleTypeEEnum, EMISimpleType.TIME_LITERAL);
	}

} //InformationpackagePackageImpl
