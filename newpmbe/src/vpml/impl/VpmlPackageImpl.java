/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import vpml.EMDiagram;
import vpml.EMModel;
import vpml.EMObject;
import vpml.VpmlFactory;
import vpml.VpmlPackage;

import vpml.collaborationpackage.CollaborationpackagePackage;

import vpml.collaborationpackage.impl.CollaborationpackagePackageImpl;

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
public class VpmlPackageImpl extends EPackageImpl implements VpmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emDiagramEClass = null;

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
	 * @see vpml.VpmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VpmlPackageImpl() {
		super(eNS_URI, VpmlFactory.eINSTANCE);
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
	public static VpmlPackage init() {
		if (isInited) return (VpmlPackage)EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI);

		// Obtain or create and register package
		VpmlPackageImpl theVpmlPackage = (VpmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof VpmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new VpmlPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OrganizationpackagePackageImpl theOrganizationpackagePackage = (OrganizationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI) instanceof OrganizationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI) : OrganizationpackagePackage.eINSTANCE);
		ResourcepackagePackageImpl theResourcepackagePackage = (ResourcepackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI) instanceof ResourcepackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI) : ResourcepackagePackage.eINSTANCE);
		ProcesspackagePackageImpl theProcesspackagePackage = (ProcesspackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI) instanceof ProcesspackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI) : ProcesspackagePackage.eINSTANCE);
		UtilpackagePackageImpl theUtilpackagePackage = (UtilpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI) instanceof UtilpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI) : UtilpackagePackage.eINSTANCE);
		InfopackagePackageImpl theInfopackagePackage = (InfopackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI) instanceof InfopackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI) : InfopackagePackage.eINSTANCE);
		InformationpackagePackageImpl theInformationpackagePackage = (InformationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI) instanceof InformationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI) : InformationpackagePackage.eINSTANCE);
		CollaborationpackagePackageImpl theCollaborationpackagePackage = (CollaborationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI) instanceof CollaborationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI) : CollaborationpackagePackage.eINSTANCE);

		// Create package meta-data objects
		theVpmlPackage.createPackageContents();
		theOrganizationpackagePackage.createPackageContents();
		theResourcepackagePackage.createPackageContents();
		theProcesspackagePackage.createPackageContents();
		theUtilpackagePackage.createPackageContents();
		theInfopackagePackage.createPackageContents();
		theInformationpackagePackage.createPackageContents();
		theCollaborationpackagePackage.createPackageContents();

		// Initialize created meta-data
		theVpmlPackage.initializePackageContents();
		theOrganizationpackagePackage.initializePackageContents();
		theResourcepackagePackage.initializePackageContents();
		theProcesspackagePackage.initializePackageContents();
		theUtilpackagePackage.initializePackageContents();
		theInfopackagePackage.initializePackageContents();
		theInformationpackagePackage.initializePackageContents();
		theCollaborationpackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVpmlPackage.freeze();

		return theVpmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMObject() {
		return emObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMObject_Name() {
		return (EAttribute)emObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMObject_Id() {
		return (EAttribute)emObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMObject_Code() {
		return (EAttribute)emObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMObject_Description() {
		return (EAttribute)emObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMObject_OID() {
		return (EAttribute)emObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMObject_SourceObjSourceRelation() {
		return (EReference)emObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMObject_TargetObjTargetRelation() {
		return (EReference)emObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMModel() {
		return emModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMDiagram() {
		return emDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMDiagram_Creater() {
		return (EAttribute)emDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMDiagram_CreatedDate() {
		return (EAttribute)emDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMDiagram_LastModifier() {
		return (EAttribute)emDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMDiagram_LastModifiedDate() {
		return (EAttribute)emDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpmlFactory getVpmlFactory() {
		return (VpmlFactory)getEFactoryInstance();
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
		emObjectEClass = createEClass(EM_OBJECT);
		createEAttribute(emObjectEClass, EM_OBJECT__NAME);
		createEAttribute(emObjectEClass, EM_OBJECT__ID);
		createEAttribute(emObjectEClass, EM_OBJECT__CODE);
		createEAttribute(emObjectEClass, EM_OBJECT__DESCRIPTION);
		createEAttribute(emObjectEClass, EM_OBJECT__OID);
		createEReference(emObjectEClass, EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION);
		createEReference(emObjectEClass, EM_OBJECT__TARGET_OBJ_TARGET_RELATION);

		emModelEClass = createEClass(EM_MODEL);

		emDiagramEClass = createEClass(EM_DIAGRAM);
		createEAttribute(emDiagramEClass, EM_DIAGRAM__CREATER);
		createEAttribute(emDiagramEClass, EM_DIAGRAM__CREATED_DATE);
		createEAttribute(emDiagramEClass, EM_DIAGRAM__LAST_MODIFIER);
		createEAttribute(emDiagramEClass, EM_DIAGRAM__LAST_MODIFIED_DATE);
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
		OrganizationpackagePackage theOrganizationpackagePackage = (OrganizationpackagePackage)EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI);
		ResourcepackagePackage theResourcepackagePackage = (ResourcepackagePackage)EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI);
		ProcesspackagePackage theProcesspackagePackage = (ProcesspackagePackage)EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI);
		UtilpackagePackage theUtilpackagePackage = (UtilpackagePackage)EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI);
		InfopackagePackage theInfopackagePackage = (InfopackagePackage)EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI);
		InformationpackagePackage theInformationpackagePackage = (InformationpackagePackage)EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI);
		CollaborationpackagePackage theCollaborationpackagePackage = (CollaborationpackagePackage)EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theOrganizationpackagePackage);
		getESubpackages().add(theResourcepackagePackage);
		getESubpackages().add(theProcesspackagePackage);
		getESubpackages().add(theUtilpackagePackage);
		getESubpackages().add(theInfopackagePackage);
		getESubpackages().add(theInformationpackagePackage);
		getESubpackages().add(theCollaborationpackagePackage);

		// Add supertypes to classes
		emModelEClass.getESuperTypes().add(this.getEMObject());
		emDiagramEClass.getESuperTypes().add(this.getEMObject());

		// Initialize classes and features; add operations and parameters
		initEClass(emObjectEClass, EMObject.class, "EMObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, EMObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMObject_Id(), ecorePackage.getEString(), "id", null, 0, 1, EMObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMObject_Code(), ecorePackage.getEString(), "code", null, 0, 1, EMObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMObject_Description(), ecorePackage.getEString(), "description", null, 0, 1, EMObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMObject_OID(), ecorePackage.getELongObject(), "OID", "0", 0, 1, EMObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMObject_SourceObjSourceRelation(), theCollaborationpackagePackage.getEMCRelation(), theCollaborationpackagePackage.getEMCRelation_SourceRelationSourceObj(), "sourceObjSourceRelation", null, 0, -1, EMObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMObject_TargetObjTargetRelation(), theCollaborationpackagePackage.getEMCRelation(), theCollaborationpackagePackage.getEMCRelation_TargetRelationTargetObj(), "targetObjTargetRelation", null, 0, -1, EMObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emModelEClass, EMModel.class, "EMModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emDiagramEClass, EMDiagram.class, "EMDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMDiagram_Creater(), ecorePackage.getEString(), "creater", null, 0, 1, EMDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMDiagram_CreatedDate(), theUtilpackagePackage.getJavaDate(), "createdDate", null, 0, 1, EMDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMDiagram_LastModifier(), ecorePackage.getEString(), "lastModifier", null, 0, 1, EMDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMDiagram_LastModifiedDate(), theUtilpackagePackage.getJavaDate(), "lastModifiedDate", null, 0, 1, EMDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //VpmlPackageImpl
