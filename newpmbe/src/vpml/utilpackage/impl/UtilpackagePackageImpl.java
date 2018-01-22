/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.utilpackage.impl;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import vpml.VpmlPackage;

import vpml.collaborationpackage.CollaborationpackagePackage;

import vpml.collaborationpackage.impl.CollaborationpackagePackageImpl;

import vpml.impl.VpmlPackageImpl;

import vpml.infopackage.InfopackagePackage;

import vpml.infopackage.impl.InfopackagePackageImpl;

import vpml.informationpackage.InformationpackagePackage;

import vpml.informationpackage.impl.InformationpackagePackageImpl;

import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.organizationpackage.impl.OrganizationpackagePackageImpl;

import vpml.processpackage.ProcesspackagePackage;

import vpml.processpackage.impl.ProcesspackagePackageImpl;

import vpml.resourcepackage.ResourcepackagePackage;

import vpml.resourcepackage.impl.ResourcepackagePackageImpl;

import vpml.utilpackage.DSDistribution;
import vpml.utilpackage.EnumBatchType;
import vpml.utilpackage.EnumDistribution;
import vpml.utilpackage.EnumIOType;
import vpml.utilpackage.EnumTimeUnit;
import vpml.utilpackage.Sex;
import vpml.utilpackage.UtilpackageFactory;
import vpml.utilpackage.UtilpackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilpackagePackageImpl extends EPackageImpl implements UtilpackagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumTimeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumDistributionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sexEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumIOTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBatchTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaDateEDataType = null;

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
	 * @see vpml.utilpackage.UtilpackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UtilpackagePackageImpl() {
		super(eNS_URI, UtilpackageFactory.eINSTANCE);
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
	public static UtilpackagePackage init() {
		if (isInited) return (UtilpackagePackage)EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI);

		// Obtain or create and register package
		UtilpackagePackageImpl theUtilpackagePackage = (UtilpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof UtilpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new UtilpackagePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VpmlPackageImpl theVpmlPackage = (VpmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI) instanceof VpmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI) : VpmlPackage.eINSTANCE);
		OrganizationpackagePackageImpl theOrganizationpackagePackage = (OrganizationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI) instanceof OrganizationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI) : OrganizationpackagePackage.eINSTANCE);
		ResourcepackagePackageImpl theResourcepackagePackage = (ResourcepackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI) instanceof ResourcepackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI) : ResourcepackagePackage.eINSTANCE);
		ProcesspackagePackageImpl theProcesspackagePackage = (ProcesspackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI) instanceof ProcesspackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI) : ProcesspackagePackage.eINSTANCE);
		InfopackagePackageImpl theInfopackagePackage = (InfopackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI) instanceof InfopackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI) : InfopackagePackage.eINSTANCE);
		InformationpackagePackageImpl theInformationpackagePackage = (InformationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI) instanceof InformationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI) : InformationpackagePackage.eINSTANCE);
		CollaborationpackagePackageImpl theCollaborationpackagePackage = (CollaborationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI) instanceof CollaborationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI) : CollaborationpackagePackage.eINSTANCE);

		// Create package meta-data objects
		theUtilpackagePackage.createPackageContents();
		theVpmlPackage.createPackageContents();
		theOrganizationpackagePackage.createPackageContents();
		theResourcepackagePackage.createPackageContents();
		theProcesspackagePackage.createPackageContents();
		theInfopackagePackage.createPackageContents();
		theInformationpackagePackage.createPackageContents();
		theCollaborationpackagePackage.createPackageContents();

		// Initialize created meta-data
		theUtilpackagePackage.initializePackageContents();
		theVpmlPackage.initializePackageContents();
		theOrganizationpackagePackage.initializePackageContents();
		theResourcepackagePackage.initializePackageContents();
		theProcesspackagePackage.initializePackageContents();
		theInfopackagePackage.initializePackageContents();
		theInformationpackagePackage.initializePackageContents();
		theCollaborationpackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUtilpackagePackage.freeze();

		return theUtilpackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSDistribution() {
		return dsDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSDistribution_Type() {
		return (EAttribute)dsDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSDistribution_DArgument1() {
		return (EAttribute)dsDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSDistribution_DArgument2() {
		return (EAttribute)dsDistributionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumTimeUnit() {
		return enumTimeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumDistribution() {
		return enumDistributionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSex() {
		return sexEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumIOType() {
		return enumIOTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumBatchType() {
		return enumBatchTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaList() {
		return javaListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaDate() {
		return javaDateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilpackageFactory getUtilpackageFactory() {
		return (UtilpackageFactory)getEFactoryInstance();
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
		dsDistributionEClass = createEClass(DS_DISTRIBUTION);
		createEAttribute(dsDistributionEClass, DS_DISTRIBUTION__TYPE);
		createEAttribute(dsDistributionEClass, DS_DISTRIBUTION__DARGUMENT1);
		createEAttribute(dsDistributionEClass, DS_DISTRIBUTION__DARGUMENT2);

		// Create enums
		enumTimeUnitEEnum = createEEnum(ENUM_TIME_UNIT);
		enumDistributionEEnum = createEEnum(ENUM_DISTRIBUTION);
		sexEEnum = createEEnum(SEX);
		enumIOTypeEEnum = createEEnum(ENUM_IO_TYPE);
		enumBatchTypeEEnum = createEEnum(ENUM_BATCH_TYPE);

		// Create data types
		javaListEDataType = createEDataType(JAVA_LIST);
		javaDateEDataType = createEDataType(JAVA_DATE);
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

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(dsDistributionEClass, DSDistribution.class, "DSDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDSDistribution_Type(), this.getEnumDistribution(), "type", "1", 0, 1, DSDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSDistribution_DArgument1(), ecorePackage.getEDouble(), "dArgument1", "10", 0, 1, DSDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSDistribution_DArgument2(), ecorePackage.getEDouble(), "dArgument2", "0", 0, 1, DSDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumTimeUnitEEnum, EnumTimeUnit.class, "EnumTimeUnit");
		addEEnumLiteral(enumTimeUnitEEnum, EnumTimeUnit.SECOND_LITERAL);
		addEEnumLiteral(enumTimeUnitEEnum, EnumTimeUnit.MINUTE_LITERAL);
		addEEnumLiteral(enumTimeUnitEEnum, EnumTimeUnit.HOUR_LITERAL);
		addEEnumLiteral(enumTimeUnitEEnum, EnumTimeUnit.DAY_LITERAL);
		addEEnumLiteral(enumTimeUnitEEnum, EnumTimeUnit.WEEK_LITERAL);
		addEEnumLiteral(enumTimeUnitEEnum, EnumTimeUnit.MONTH_LITERAL);
		addEEnumLiteral(enumTimeUnitEEnum, EnumTimeUnit.QUARTER_LITERAL);
		addEEnumLiteral(enumTimeUnitEEnum, EnumTimeUnit.YEAR_LITERAL);

		initEEnum(enumDistributionEEnum, EnumDistribution.class, "EnumDistribution");
		addEEnumLiteral(enumDistributionEEnum, EnumDistribution.DEFAULT_LITERAL);
		addEEnumLiteral(enumDistributionEEnum, EnumDistribution.CONSTANT_LITERAL);
		addEEnumLiteral(enumDistributionEEnum, EnumDistribution.UNIFORM_LITERAL);
		addEEnumLiteral(enumDistributionEEnum, EnumDistribution.NORMAL_LITERAL);
		addEEnumLiteral(enumDistributionEEnum, EnumDistribution.POISSION_LITERAL);
		addEEnumLiteral(enumDistributionEEnum, EnumDistribution.EXPONENTIAL_LITERAL);
		addEEnumLiteral(enumDistributionEEnum, EnumDistribution.GAMMA_LITERAL);

		initEEnum(sexEEnum, Sex.class, "Sex");
		addEEnumLiteral(sexEEnum, Sex.MAN_LITERAL);
		addEEnumLiteral(sexEEnum, Sex.WOMAN_LITERAL);

		initEEnum(enumIOTypeEEnum, EnumIOType.class, "EnumIOType");
		addEEnumLiteral(enumIOTypeEEnum, EnumIOType.NON_SOURCE_LITERAL);
		addEEnumLiteral(enumIOTypeEEnum, EnumIOType.SINGLE_SOURCE_LITERAL);
		addEEnumLiteral(enumIOTypeEEnum, EnumIOType.SEQUENCE_SOURCE_LITERAL);

		initEEnum(enumBatchTypeEEnum, EnumBatchType.class, "EnumBatchType");
		addEEnumLiteral(enumBatchTypeEEnum, EnumBatchType.AMOUNT_ONLY_LITERAL);
		addEEnumLiteral(enumBatchTypeEEnum, EnumBatchType.TIME_ONLY_LITERAL);
		addEEnumLiteral(enumBatchTypeEEnum, EnumBatchType.TIME_OR_AMOUNT_LITERAL);
		addEEnumLiteral(enumBatchTypeEEnum, EnumBatchType.TIME_AND_AMOUNT_LITERAL);

		// Initialize data types
		initEDataType(javaListEDataType, List.class, "JavaList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaDateEDataType, Date.class, "JavaDate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //UtilpackagePackageImpl
