/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.collaborationpackage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import vpml.VpmlPackage;

import vpml.collaborationpackage.CollaborationpackageFactory;
import vpml.collaborationpackage.CollaborationpackagePackage;
import vpml.collaborationpackage.EMCAnd;
import vpml.collaborationpackage.EMCCollaborationGroup;
import vpml.collaborationpackage.EMCCollaborationRelation;
import vpml.collaborationpackage.EMCDiagram;
import vpml.collaborationpackage.EMCLogicalConnector;
import vpml.collaborationpackage.EMCRelation;
import vpml.collaborationpackage.EMCSequenceRelation;

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

import vpml.utilpackage.UtilpackagePackage;

import vpml.utilpackage.impl.UtilpackagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollaborationpackagePackageImpl extends EPackageImpl implements CollaborationpackagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emcLogicalConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emcAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emcorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emcCollaborationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emcDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emcRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emcCollaborationRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emcSequenceRelationEClass = null;

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
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CollaborationpackagePackageImpl() {
		super(eNS_URI, CollaborationpackageFactory.eINSTANCE);
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
	public static CollaborationpackagePackage init() {
		if (isInited) return (CollaborationpackagePackage)EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI);

		// Obtain or create and register package
		CollaborationpackagePackageImpl theCollaborationpackagePackage = (CollaborationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof CollaborationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new CollaborationpackagePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VpmlPackageImpl theVpmlPackage = (VpmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI) instanceof VpmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI) : VpmlPackage.eINSTANCE);
		OrganizationpackagePackageImpl theOrganizationpackagePackage = (OrganizationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI) instanceof OrganizationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI) : OrganizationpackagePackage.eINSTANCE);
		ResourcepackagePackageImpl theResourcepackagePackage = (ResourcepackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI) instanceof ResourcepackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI) : ResourcepackagePackage.eINSTANCE);
		ProcesspackagePackageImpl theProcesspackagePackage = (ProcesspackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI) instanceof ProcesspackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI) : ProcesspackagePackage.eINSTANCE);
		UtilpackagePackageImpl theUtilpackagePackage = (UtilpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI) instanceof UtilpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI) : UtilpackagePackage.eINSTANCE);
		InfopackagePackageImpl theInfopackagePackage = (InfopackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI) instanceof InfopackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI) : InfopackagePackage.eINSTANCE);
		InformationpackagePackageImpl theInformationpackagePackage = (InformationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI) instanceof InformationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI) : InformationpackagePackage.eINSTANCE);

		// Create package meta-data objects
		theCollaborationpackagePackage.createPackageContents();
		theVpmlPackage.createPackageContents();
		theOrganizationpackagePackage.createPackageContents();
		theResourcepackagePackage.createPackageContents();
		theProcesspackagePackage.createPackageContents();
		theUtilpackagePackage.createPackageContents();
		theInfopackagePackage.createPackageContents();
		theInformationpackagePackage.createPackageContents();

		// Initialize created meta-data
		theCollaborationpackagePackage.initializePackageContents();
		theVpmlPackage.initializePackageContents();
		theOrganizationpackagePackage.initializePackageContents();
		theResourcepackagePackage.initializePackageContents();
		theProcesspackagePackage.initializePackageContents();
		theUtilpackagePackage.initializePackageContents();
		theInfopackagePackage.initializePackageContents();
		theInformationpackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCollaborationpackagePackage.freeze();

		return theCollaborationpackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMCLogicalConnector() {
		return emcLogicalConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMCAnd() {
		return emcAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCAnd_ColAndDiagram() {
		return (EReference)emcAndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMCOR() {
		return emcorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCOR_ColORDiagram() {
		return (EReference)emcorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMCCollaborationGroup() {
		return emcCollaborationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCCollaborationGroup_ColColGroupDiagram() {
		return (EReference)emcCollaborationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMCDiagram() {
		return emcDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCDiagram_EmpDiagram() {
		return (EReference)emcDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMCDiagram_AssociatePrModel() {
		return (EAttribute)emcDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCDiagram_ColAnd() {
		return (EReference)emcDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCDiagram_ColOR() {
		return (EReference)emcDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCDiagram_ColRole() {
		return (EReference)emcDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCDiagram_ColLocation() {
		return (EReference)emcDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCDiagram_ColMachine() {
		return (EReference)emcDiagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCDiagram_ColEMOGroup() {
		return (EReference)emcDiagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCDiagram_ColColGroup() {
		return (EReference)emcDiagramEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCDiagram_ColColRelation() {
		return (EReference)emcDiagramEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCDiagram_ColSeqRelation() {
		return (EReference)emcDiagramEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMCRelation() {
		return emcRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCRelation_SourceRelationSourceObj() {
		return (EReference)emcRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCRelation_TargetRelationTargetObj() {
		return (EReference)emcRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMCCollaborationRelation() {
		return emcCollaborationRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCCollaborationRelation_ColColRelationDiagram() {
		return (EReference)emcCollaborationRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMCSequenceRelation() {
		return emcSequenceRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMCSequenceRelation_ColSeqRelationDiagram() {
		return (EReference)emcSequenceRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationpackageFactory getCollaborationpackageFactory() {
		return (CollaborationpackageFactory)getEFactoryInstance();
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
		emcLogicalConnectorEClass = createEClass(EMC_LOGICAL_CONNECTOR);

		emcAndEClass = createEClass(EMC_AND);
		createEReference(emcAndEClass, EMC_AND__COL_AND_DIAGRAM);

		emcorEClass = createEClass(EMCOR);
		createEReference(emcorEClass, EMCOR__COL_OR_DIAGRAM);

		emcCollaborationGroupEClass = createEClass(EMC_COLLABORATION_GROUP);
		createEReference(emcCollaborationGroupEClass, EMC_COLLABORATION_GROUP__COL_COL_GROUP_DIAGRAM);

		emcDiagramEClass = createEClass(EMC_DIAGRAM);
		createEReference(emcDiagramEClass, EMC_DIAGRAM__EMP_DIAGRAM);
		createEAttribute(emcDiagramEClass, EMC_DIAGRAM__ASSOCIATE_PR_MODEL);
		createEReference(emcDiagramEClass, EMC_DIAGRAM__COL_AND);
		createEReference(emcDiagramEClass, EMC_DIAGRAM__COL_OR);
		createEReference(emcDiagramEClass, EMC_DIAGRAM__COL_ROLE);
		createEReference(emcDiagramEClass, EMC_DIAGRAM__COL_LOCATION);
		createEReference(emcDiagramEClass, EMC_DIAGRAM__COL_MACHINE);
		createEReference(emcDiagramEClass, EMC_DIAGRAM__COL_EMO_GROUP);
		createEReference(emcDiagramEClass, EMC_DIAGRAM__COL_COL_GROUP);
		createEReference(emcDiagramEClass, EMC_DIAGRAM__COL_COL_RELATION);
		createEReference(emcDiagramEClass, EMC_DIAGRAM__COL_SEQ_RELATION);

		emcRelationEClass = createEClass(EMC_RELATION);
		createEReference(emcRelationEClass, EMC_RELATION__SOURCE_RELATION_SOURCE_OBJ);
		createEReference(emcRelationEClass, EMC_RELATION__TARGET_RELATION_TARGET_OBJ);

		emcCollaborationRelationEClass = createEClass(EMC_COLLABORATION_RELATION);
		createEReference(emcCollaborationRelationEClass, EMC_COLLABORATION_RELATION__COL_COL_RELATION_DIAGRAM);

		emcSequenceRelationEClass = createEClass(EMC_SEQUENCE_RELATION);
		createEReference(emcSequenceRelationEClass, EMC_SEQUENCE_RELATION__COL_SEQ_RELATION_DIAGRAM);
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
		ProcesspackagePackage theProcesspackagePackage = (ProcesspackagePackage)EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI);
		ResourcepackagePackage theResourcepackagePackage = (ResourcepackagePackage)EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI);
		OrganizationpackagePackage theOrganizationpackagePackage = (OrganizationpackagePackage)EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI);

		// Add supertypes to classes
		emcLogicalConnectorEClass.getESuperTypes().add(theVpmlPackage.getEMObject());
		emcAndEClass.getESuperTypes().add(this.getEMCLogicalConnector());
		emcorEClass.getESuperTypes().add(this.getEMCLogicalConnector());
		emcCollaborationGroupEClass.getESuperTypes().add(theVpmlPackage.getEMObject());
		emcDiagramEClass.getESuperTypes().add(theVpmlPackage.getEMDiagram());
		emcCollaborationRelationEClass.getESuperTypes().add(this.getEMCRelation());
		emcSequenceRelationEClass.getESuperTypes().add(this.getEMCRelation());

		// Initialize classes and features; add operations and parameters
		initEClass(emcLogicalConnectorEClass, EMCLogicalConnector.class, "EMCLogicalConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emcAndEClass, EMCAnd.class, "EMCAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMCAnd_ColAndDiagram(), this.getEMCDiagram(), this.getEMCDiagram_ColAnd(), "colAndDiagram", null, 0, 1, EMCAnd.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emcorEClass, vpml.collaborationpackage.EMCOR.class, "EMCOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMCOR_ColORDiagram(), this.getEMCDiagram(), this.getEMCDiagram_ColOR(), "colORDiagram", null, 0, 1, vpml.collaborationpackage.EMCOR.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emcCollaborationGroupEClass, EMCCollaborationGroup.class, "EMCCollaborationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMCCollaborationGroup_ColColGroupDiagram(), this.getEMCDiagram(), this.getEMCDiagram_ColColGroup(), "colColGroupDiagram", null, 0, 1, EMCCollaborationGroup.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emcDiagramEClass, EMCDiagram.class, "EMCDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMCDiagram_EmpDiagram(), theProcesspackagePackage.getEMPDiagram(), theProcesspackagePackage.getEMPDiagram_EmcDiagram(), "empDiagram", null, 1, 1, EMCDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMCDiagram_AssociatePrModel(), ecorePackage.getEString(), "associatePrModel", null, 0, 1, EMCDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMCDiagram_ColAnd(), this.getEMCAnd(), this.getEMCAnd_ColAndDiagram(), "colAnd", null, 0, -1, EMCDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMCDiagram_ColOR(), this.getEMCOR(), this.getEMCOR_ColORDiagram(), "colOR", null, 0, -1, EMCDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMCDiagram_ColRole(), theResourcepackagePackage.getEMRRole(), theResourcepackagePackage.getEMRRole_ColRoleDiagram(), "colRole", null, 0, -1, EMCDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMCDiagram_ColLocation(), theResourcepackagePackage.getEMRLocationType(), theResourcepackagePackage.getEMRLocationType_ColLocationDiagram(), "colLocation", null, 0, -1, EMCDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMCDiagram_ColMachine(), theResourcepackagePackage.getEMRMachineType(), theResourcepackagePackage.getEMRMachineType_ColMachineDiagram(), "colMachine", null, 0, -1, EMCDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMCDiagram_ColEMOGroup(), theOrganizationpackagePackage.getEMOResourceGroupType(), theOrganizationpackagePackage.getEMOResourceGroupType_ColEMOGroupDiagram(), "colEMOGroup", null, 0, -1, EMCDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMCDiagram_ColColGroup(), this.getEMCCollaborationGroup(), this.getEMCCollaborationGroup_ColColGroupDiagram(), "colColGroup", null, 0, -1, EMCDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMCDiagram_ColColRelation(), this.getEMCCollaborationRelation(), this.getEMCCollaborationRelation_ColColRelationDiagram(), "colColRelation", null, 0, -1, EMCDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMCDiagram_ColSeqRelation(), this.getEMCSequenceRelation(), this.getEMCSequenceRelation_ColSeqRelationDiagram(), "colSeqRelation", null, 0, -1, EMCDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emcRelationEClass, EMCRelation.class, "EMCRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMCRelation_SourceRelationSourceObj(), theVpmlPackage.getEMObject(), theVpmlPackage.getEMObject_SourceObjSourceRelation(), "sourceRelationSourceObj", null, 0, 1, EMCRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMCRelation_TargetRelationTargetObj(), theVpmlPackage.getEMObject(), theVpmlPackage.getEMObject_TargetObjTargetRelation(), "targetRelationTargetObj", null, 0, 1, EMCRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emcCollaborationRelationEClass, EMCCollaborationRelation.class, "EMCCollaborationRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMCCollaborationRelation_ColColRelationDiagram(), this.getEMCDiagram(), this.getEMCDiagram_ColColRelation(), "colColRelationDiagram", null, 0, 1, EMCCollaborationRelation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emcSequenceRelationEClass, EMCSequenceRelation.class, "EMCSequenceRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMCSequenceRelation_ColSeqRelationDiagram(), this.getEMCDiagram(), this.getEMCDiagram_ColSeqRelation(), "colSeqRelationDiagram", null, 0, 1, EMCSequenceRelation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CollaborationpackagePackageImpl
