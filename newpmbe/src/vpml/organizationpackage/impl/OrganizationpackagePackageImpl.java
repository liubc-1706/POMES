/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.organizationpackage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import vpml.VpmlPackage;

import vpml.collaborationpackage.CollaborationpackagePackage;

import vpml.collaborationpackage.impl.CollaborationpackagePackageImpl;

import vpml.impl.VpmlPackageImpl;

import vpml.infopackage.InfopackagePackage;

import vpml.infopackage.impl.InfopackagePackageImpl;

import vpml.informationpackage.InformationpackagePackage;

import vpml.informationpackage.impl.InformationpackagePackageImpl;

import vpml.organizationpackage.EMOAssociationRelation;
import vpml.organizationpackage.EMOComposeRelation;
import vpml.organizationpackage.EMODiagram;
import vpml.organizationpackage.EMOObject;
import vpml.organizationpackage.EMORelations;
import vpml.organizationpackage.EMOResourceGroupType;
import vpml.organizationpackage.OrganizationpackageFactory;
import vpml.organizationpackage.OrganizationpackagePackage;

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
public class OrganizationpackagePackageImpl extends EPackageImpl implements OrganizationpackagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emoResourceGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emoRelationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emoAssociationRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emoComposeRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emoDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emoObjectEClass = null;

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
	 * @see vpml.organizationpackage.OrganizationpackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrganizationpackagePackageImpl() {
		super(eNS_URI, OrganizationpackageFactory.eINSTANCE);
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
	public static OrganizationpackagePackage init() {
		if (isInited) return (OrganizationpackagePackage)EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI);

		// Obtain or create and register package
		OrganizationpackagePackageImpl theOrganizationpackagePackage = (OrganizationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof OrganizationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new OrganizationpackagePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VpmlPackageImpl theVpmlPackage = (VpmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI) instanceof VpmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI) : VpmlPackage.eINSTANCE);
		ResourcepackagePackageImpl theResourcepackagePackage = (ResourcepackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI) instanceof ResourcepackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI) : ResourcepackagePackage.eINSTANCE);
		ProcesspackagePackageImpl theProcesspackagePackage = (ProcesspackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI) instanceof ProcesspackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI) : ProcesspackagePackage.eINSTANCE);
		UtilpackagePackageImpl theUtilpackagePackage = (UtilpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI) instanceof UtilpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI) : UtilpackagePackage.eINSTANCE);
		InfopackagePackageImpl theInfopackagePackage = (InfopackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI) instanceof InfopackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI) : InfopackagePackage.eINSTANCE);
		InformationpackagePackageImpl theInformationpackagePackage = (InformationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI) instanceof InformationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI) : InformationpackagePackage.eINSTANCE);
		CollaborationpackagePackageImpl theCollaborationpackagePackage = (CollaborationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI) instanceof CollaborationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI) : CollaborationpackagePackage.eINSTANCE);

		// Create package meta-data objects
		theOrganizationpackagePackage.createPackageContents();
		theVpmlPackage.createPackageContents();
		theResourcepackagePackage.createPackageContents();
		theProcesspackagePackage.createPackageContents();
		theUtilpackagePackage.createPackageContents();
		theInfopackagePackage.createPackageContents();
		theInformationpackagePackage.createPackageContents();
		theCollaborationpackagePackage.createPackageContents();

		// Initialize created meta-data
		theOrganizationpackagePackage.initializePackageContents();
		theVpmlPackage.initializePackageContents();
		theResourcepackagePackage.initializePackageContents();
		theProcesspackagePackage.initializePackageContents();
		theUtilpackagePackage.initializePackageContents();
		theInfopackagePackage.initializePackageContents();
		theInformationpackagePackage.initializePackageContents();
		theCollaborationpackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOrganizationpackagePackage.freeze();

		return theOrganizationpackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMOResourceGroupType() {
		return emoResourceGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMOResourceGroupType_OrganiztionType() {
		return (EAttribute)emoResourceGroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOResourceGroupType_SuperOrganization() {
		return (EReference)emoResourceGroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMOResourceGroupType_Principal() {
		return (EAttribute)emoResourceGroupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMOResourceGroupType_ArrangeNumber() {
		return (EAttribute)emoResourceGroupTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMOResourceGroupType_Reserved() {
		return (EAttribute)emoResourceGroupTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOResourceGroupType_SourceAssociationRelations() {
		return (EReference)emoResourceGroupTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOResourceGroupType_TargetComposeRelation() {
		return (EReference)emoResourceGroupTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOResourceGroupType_SourceComposeRelations() {
		return (EReference)emoResourceGroupTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOResourceGroupType_TargetAssociationRelations() {
		return (EReference)emoResourceGroupTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOResourceGroupType_EmoDiagram() {
		return (EReference)emoResourceGroupTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOResourceGroupType_BasicResourceTypes() {
		return (EReference)emoResourceGroupTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOResourceGroupType_AssFlows() {
		return (EReference)emoResourceGroupTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOResourceGroupType_EmpDiagram() {
		return (EReference)emoResourceGroupTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOResourceGroupType_ColEMOGroupDiagram() {
		return (EReference)emoResourceGroupTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMORelations() {
		return emoRelationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMORelations_Number() {
		return (EAttribute)emoRelationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMOAssociationRelation() {
		return emoAssociationRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOAssociationRelation_SourceGroupType() {
		return (EReference)emoAssociationRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOAssociationRelation_TargetRole() {
		return (EReference)emoAssociationRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOAssociationRelation_SourceRole() {
		return (EReference)emoAssociationRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOAssociationRelation_TargetGroupType() {
		return (EReference)emoAssociationRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOAssociationRelation_EmoDiagram() {
		return (EReference)emoAssociationRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMOComposeRelation() {
		return emoComposeRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOComposeRelation_TargetGroupType() {
		return (EReference)emoComposeRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOComposeRelation_SourceGroupType() {
		return (EReference)emoComposeRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMOComposeRelation_EmoDiagram() {
		return (EReference)emoComposeRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMODiagram() {
		return emoDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMODiagram_EmpDiagrams() {
		return (EReference)emoDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMODiagram_EmrDiagrams() {
		return (EReference)emoDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMODiagram_Roles() {
		return (EReference)emoDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMODiagram_ResourceGroupTypes() {
		return (EReference)emoDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMODiagram_AssociationRelations() {
		return (EReference)emoDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMODiagram_ComposeRelations() {
		return (EReference)emoDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMOObject() {
		return emoObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationpackageFactory getOrganizationpackageFactory() {
		return (OrganizationpackageFactory)getEFactoryInstance();
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
		emoResourceGroupTypeEClass = createEClass(EMO_RESOURCE_GROUP_TYPE);
		createEAttribute(emoResourceGroupTypeEClass, EMO_RESOURCE_GROUP_TYPE__ORGANIZTION_TYPE);
		createEReference(emoResourceGroupTypeEClass, EMO_RESOURCE_GROUP_TYPE__SUPER_ORGANIZATION);
		createEAttribute(emoResourceGroupTypeEClass, EMO_RESOURCE_GROUP_TYPE__PRINCIPAL);
		createEAttribute(emoResourceGroupTypeEClass, EMO_RESOURCE_GROUP_TYPE__ARRANGE_NUMBER);
		createEAttribute(emoResourceGroupTypeEClass, EMO_RESOURCE_GROUP_TYPE__RESERVED);
		createEReference(emoResourceGroupTypeEClass, EMO_RESOURCE_GROUP_TYPE__SOURCE_ASSOCIATION_RELATIONS);
		createEReference(emoResourceGroupTypeEClass, EMO_RESOURCE_GROUP_TYPE__TARGET_COMPOSE_RELATION);
		createEReference(emoResourceGroupTypeEClass, EMO_RESOURCE_GROUP_TYPE__SOURCE_COMPOSE_RELATIONS);
		createEReference(emoResourceGroupTypeEClass, EMO_RESOURCE_GROUP_TYPE__TARGET_ASSOCIATION_RELATIONS);
		createEReference(emoResourceGroupTypeEClass, EMO_RESOURCE_GROUP_TYPE__EMO_DIAGRAM);
		createEReference(emoResourceGroupTypeEClass, EMO_RESOURCE_GROUP_TYPE__BASIC_RESOURCE_TYPES);
		createEReference(emoResourceGroupTypeEClass, EMO_RESOURCE_GROUP_TYPE__ASS_FLOWS);
		createEReference(emoResourceGroupTypeEClass, EMO_RESOURCE_GROUP_TYPE__EMP_DIAGRAM);
		createEReference(emoResourceGroupTypeEClass, EMO_RESOURCE_GROUP_TYPE__COL_EMO_GROUP_DIAGRAM);

		emoRelationsEClass = createEClass(EMO_RELATIONS);
		createEAttribute(emoRelationsEClass, EMO_RELATIONS__NUMBER);

		emoAssociationRelationEClass = createEClass(EMO_ASSOCIATION_RELATION);
		createEReference(emoAssociationRelationEClass, EMO_ASSOCIATION_RELATION__SOURCE_GROUP_TYPE);
		createEReference(emoAssociationRelationEClass, EMO_ASSOCIATION_RELATION__TARGET_ROLE);
		createEReference(emoAssociationRelationEClass, EMO_ASSOCIATION_RELATION__SOURCE_ROLE);
		createEReference(emoAssociationRelationEClass, EMO_ASSOCIATION_RELATION__TARGET_GROUP_TYPE);
		createEReference(emoAssociationRelationEClass, EMO_ASSOCIATION_RELATION__EMO_DIAGRAM);

		emoComposeRelationEClass = createEClass(EMO_COMPOSE_RELATION);
		createEReference(emoComposeRelationEClass, EMO_COMPOSE_RELATION__TARGET_GROUP_TYPE);
		createEReference(emoComposeRelationEClass, EMO_COMPOSE_RELATION__SOURCE_GROUP_TYPE);
		createEReference(emoComposeRelationEClass, EMO_COMPOSE_RELATION__EMO_DIAGRAM);

		emoDiagramEClass = createEClass(EMO_DIAGRAM);
		createEReference(emoDiagramEClass, EMO_DIAGRAM__EMP_DIAGRAMS);
		createEReference(emoDiagramEClass, EMO_DIAGRAM__EMR_DIAGRAMS);
		createEReference(emoDiagramEClass, EMO_DIAGRAM__ROLES);
		createEReference(emoDiagramEClass, EMO_DIAGRAM__RESOURCE_GROUP_TYPES);
		createEReference(emoDiagramEClass, EMO_DIAGRAM__ASSOCIATION_RELATIONS);
		createEReference(emoDiagramEClass, EMO_DIAGRAM__COMPOSE_RELATIONS);

		emoObjectEClass = createEClass(EMO_OBJECT);
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
		ResourcepackagePackage theResourcepackagePackage = (ResourcepackagePackage)EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI);
		ProcesspackagePackage theProcesspackagePackage = (ProcesspackagePackage)EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI);
		CollaborationpackagePackage theCollaborationpackagePackage = (CollaborationpackagePackage)EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI);
		VpmlPackage theVpmlPackage = (VpmlPackage)EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI);

		// Add supertypes to classes
		emoResourceGroupTypeEClass.getESuperTypes().add(this.getEMOObject());
		emoRelationsEClass.getESuperTypes().add(theVpmlPackage.getEMObject());
		emoAssociationRelationEClass.getESuperTypes().add(this.getEMORelations());
		emoComposeRelationEClass.getESuperTypes().add(this.getEMORelations());
		emoDiagramEClass.getESuperTypes().add(theVpmlPackage.getEMDiagram());
		emoObjectEClass.getESuperTypes().add(theVpmlPackage.getEMObject());

		// Initialize classes and features; add operations and parameters
		initEClass(emoResourceGroupTypeEClass, EMOResourceGroupType.class, "EMOResourceGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMOResourceGroupType_OrganiztionType(), ecorePackage.getEString(), "organiztionType", null, 0, 1, EMOResourceGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMOResourceGroupType_SuperOrganization(), this.getEMOResourceGroupType(), null, "superOrganization", null, 0, 1, EMOResourceGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMOResourceGroupType_Principal(), ecorePackage.getEString(), "principal", null, 0, 1, EMOResourceGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMOResourceGroupType_ArrangeNumber(), ecorePackage.getELongObject(), "arrangeNumber", "1", 0, 1, EMOResourceGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMOResourceGroupType_Reserved(), ecorePackage.getEString(), "reserved", null, 0, 1, EMOResourceGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMOResourceGroupType_SourceAssociationRelations(), this.getEMOAssociationRelation(), this.getEMOAssociationRelation_SourceGroupType(), "sourceAssociationRelations", null, 0, -1, EMOResourceGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMOResourceGroupType_TargetComposeRelation(), this.getEMOComposeRelation(), this.getEMOComposeRelation_TargetGroupType(), "targetComposeRelation", null, 0, 1, EMOResourceGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMOResourceGroupType_SourceComposeRelations(), this.getEMOComposeRelation(), this.getEMOComposeRelation_SourceGroupType(), "sourceComposeRelations", null, 0, -1, EMOResourceGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMOResourceGroupType_TargetAssociationRelations(), this.getEMOAssociationRelation(), this.getEMOAssociationRelation_TargetGroupType(), "targetAssociationRelations", null, 0, -1, EMOResourceGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMOResourceGroupType_EmoDiagram(), this.getEMODiagram(), this.getEMODiagram_ResourceGroupTypes(), "emoDiagram", null, 1, 1, EMOResourceGroupType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMOResourceGroupType_BasicResourceTypes(), theResourcepackagePackage.getEMRBasicResourceType(), theResourcepackagePackage.getEMRBasicResourceType_ResourceGroupTypes(), "basicResourceTypes", null, 0, -1, EMOResourceGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMOResourceGroupType_AssFlows(), theProcesspackagePackage.getEMPAssFlow(), theProcesspackagePackage.getEMPAssFlow_ResourceGroupType(), "assFlows", null, 0, -1, EMOResourceGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMOResourceGroupType_EmpDiagram(), theProcesspackagePackage.getEMPDiagram(), theProcesspackagePackage.getEMPDiagram_ResourceGroupTypes(), "empDiagram", null, 1, 1, EMOResourceGroupType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMOResourceGroupType_ColEMOGroupDiagram(), theCollaborationpackagePackage.getEMCDiagram(), theCollaborationpackagePackage.getEMCDiagram_ColEMOGroup(), "colEMOGroupDiagram", null, 0, 1, EMOResourceGroupType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emoRelationsEClass, EMORelations.class, "EMORelations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMORelations_Number(), ecorePackage.getEIntegerObject(), "number", "1", 0, 1, EMORelations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emoAssociationRelationEClass, EMOAssociationRelation.class, "EMOAssociationRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMOAssociationRelation_SourceGroupType(), this.getEMOResourceGroupType(), this.getEMOResourceGroupType_SourceAssociationRelations(), "sourceGroupType", null, 0, 1, EMOAssociationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMOAssociationRelation_TargetRole(), theResourcepackagePackage.getEMRRole(), theResourcepackagePackage.getEMRRole_TargetAssociationRelations(), "targetRole", null, 0, 1, EMOAssociationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMOAssociationRelation_SourceRole(), theResourcepackagePackage.getEMRRole(), theResourcepackagePackage.getEMRRole_SourceAssociationRelations(), "sourceRole", null, 0, 1, EMOAssociationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMOAssociationRelation_TargetGroupType(), this.getEMOResourceGroupType(), this.getEMOResourceGroupType_TargetAssociationRelations(), "targetGroupType", null, 0, 1, EMOAssociationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMOAssociationRelation_EmoDiagram(), this.getEMODiagram(), this.getEMODiagram_AssociationRelations(), "emoDiagram", null, 1, 1, EMOAssociationRelation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emoComposeRelationEClass, EMOComposeRelation.class, "EMOComposeRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMOComposeRelation_TargetGroupType(), this.getEMOResourceGroupType(), this.getEMOResourceGroupType_TargetComposeRelation(), "targetGroupType", null, 1, 1, EMOComposeRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMOComposeRelation_SourceGroupType(), this.getEMOResourceGroupType(), this.getEMOResourceGroupType_SourceComposeRelations(), "sourceGroupType", null, 1, 1, EMOComposeRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMOComposeRelation_EmoDiagram(), this.getEMODiagram(), this.getEMODiagram_ComposeRelations(), "emoDiagram", null, 1, 1, EMOComposeRelation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emoDiagramEClass, EMODiagram.class, "EMODiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMODiagram_EmpDiagrams(), theProcesspackagePackage.getEMPDiagram(), theProcesspackagePackage.getEMPDiagram_EmoDiagrams(), "empDiagrams", null, 0, -1, EMODiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMODiagram_EmrDiagrams(), theResourcepackagePackage.getEMRDiagram(), theResourcepackagePackage.getEMRDiagram_EmoDiagram(), "emrDiagrams", null, 1, -1, EMODiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMODiagram_Roles(), theResourcepackagePackage.getEMRRole(), theResourcepackagePackage.getEMRRole_EmoDiagram(), "roles", null, 0, -1, EMODiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMODiagram_ResourceGroupTypes(), this.getEMOResourceGroupType(), this.getEMOResourceGroupType_EmoDiagram(), "resourceGroupTypes", null, 0, -1, EMODiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMODiagram_AssociationRelations(), this.getEMOAssociationRelation(), this.getEMOAssociationRelation_EmoDiagram(), "associationRelations", null, 0, -1, EMODiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMODiagram_ComposeRelations(), this.getEMOComposeRelation(), this.getEMOComposeRelation_EmoDiagram(), "composeRelations", null, 0, -1, EMODiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emoObjectEClass, EMOObject.class, "EMOObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //OrganizationpackagePackageImpl
