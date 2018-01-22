/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage.impl;

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

import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.organizationpackage.impl.OrganizationpackagePackageImpl;

import vpml.processpackage.ProcesspackagePackage;

import vpml.processpackage.impl.ProcesspackagePackageImpl;

import vpml.resourcepackage.EMRAbstractLocationType;
import vpml.resourcepackage.EMRAbstractMachineType;
import vpml.resourcepackage.EMRAbstractResourceType;
import vpml.resourcepackage.EMRAbstractRole;
import vpml.resourcepackage.EMRAbstractToolType;
import vpml.resourcepackage.EMRBasicResourceType;
import vpml.resourcepackage.EMRClassificationRelation;
import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.EMRLocationType;
import vpml.resourcepackage.EMRMachineType;
import vpml.resourcepackage.EMRObject;
import vpml.resourcepackage.EMRRelation;
import vpml.resourcepackage.EMRResourceType;
import vpml.resourcepackage.EMRRole;
import vpml.resourcepackage.EMRToolType;
import vpml.resourcepackage.ResourcepackageFactory;
import vpml.resourcepackage.ResourcepackagePackage;

import vpml.utilpackage.UtilpackagePackage;

import vpml.utilpackage.impl.UtilpackagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcepackagePackageImpl extends EPackageImpl implements ResourcepackagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emrResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emrBasicResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emrClassificationRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emrAbstractResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emrAbstractRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emrAbstractToolTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emrAbstractMachineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emrAbstractLocationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emrToolTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emrMachineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emrLocationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emrRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emrDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emrObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emrRelationEClass = null;

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
	 * @see vpml.resourcepackage.ResourcepackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourcepackagePackageImpl() {
		super(eNS_URI, ResourcepackageFactory.eINSTANCE);
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
	public static ResourcepackagePackage init() {
		if (isInited) return (ResourcepackagePackage)EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI);

		// Obtain or create and register package
		ResourcepackagePackageImpl theResourcepackagePackage = (ResourcepackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ResourcepackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ResourcepackagePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VpmlPackageImpl theVpmlPackage = (VpmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI) instanceof VpmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI) : VpmlPackage.eINSTANCE);
		OrganizationpackagePackageImpl theOrganizationpackagePackage = (OrganizationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI) instanceof OrganizationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI) : OrganizationpackagePackage.eINSTANCE);
		ProcesspackagePackageImpl theProcesspackagePackage = (ProcesspackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI) instanceof ProcesspackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI) : ProcesspackagePackage.eINSTANCE);
		UtilpackagePackageImpl theUtilpackagePackage = (UtilpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI) instanceof UtilpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI) : UtilpackagePackage.eINSTANCE);
		InfopackagePackageImpl theInfopackagePackage = (InfopackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI) instanceof InfopackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI) : InfopackagePackage.eINSTANCE);
		InformationpackagePackageImpl theInformationpackagePackage = (InformationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI) instanceof InformationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI) : InformationpackagePackage.eINSTANCE);
		CollaborationpackagePackageImpl theCollaborationpackagePackage = (CollaborationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI) instanceof CollaborationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI) : CollaborationpackagePackage.eINSTANCE);

		// Create package meta-data objects
		theResourcepackagePackage.createPackageContents();
		theVpmlPackage.createPackageContents();
		theOrganizationpackagePackage.createPackageContents();
		theProcesspackagePackage.createPackageContents();
		theUtilpackagePackage.createPackageContents();
		theInfopackagePackage.createPackageContents();
		theInformationpackagePackage.createPackageContents();
		theCollaborationpackagePackage.createPackageContents();

		// Initialize created meta-data
		theResourcepackagePackage.initializePackageContents();
		theVpmlPackage.initializePackageContents();
		theOrganizationpackagePackage.initializePackageContents();
		theProcesspackagePackage.initializePackageContents();
		theUtilpackagePackage.initializePackageContents();
		theInfopackagePackage.initializePackageContents();
		theInformationpackagePackage.initializePackageContents();
		theCollaborationpackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResourcepackagePackage.freeze();

		return theResourcepackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMRResourceType() {
		return emrResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMRBasicResourceType() {
		return emrBasicResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRBasicResourceType_ResourceGroupTypes() {
		return (EReference)emrBasicResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMRBasicResourceType_CostPerUnit() {
		return (EAttribute)emrBasicResourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMRBasicResourceType_TotalAmount() {
		return (EAttribute)emrBasicResourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMRBasicResourceType_UsageAmount() {
		return (EAttribute)emrBasicResourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMRBasicResourceType_AvailableAmount() {
		return (EAttribute)emrBasicResourceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMRBasicResourceType_Efficiency() {
		return (EAttribute)emrBasicResourceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMRClassificationRelation() {
		return emrClassificationRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRClassificationRelation_EmrDiagram() {
		return (EReference)emrClassificationRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRClassificationRelation_Role() {
		return (EReference)emrClassificationRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRClassificationRelation_SourceAbsRoleType() {
		return (EReference)emrClassificationRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRClassificationRelation_TargetAbsRoleType() {
		return (EReference)emrClassificationRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRClassificationRelation_LocationType() {
		return (EReference)emrClassificationRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRClassificationRelation_SourceAbsLocationType() {
		return (EReference)emrClassificationRelationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRClassificationRelation_TargetAbsLocationType() {
		return (EReference)emrClassificationRelationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRClassificationRelation_ToolType() {
		return (EReference)emrClassificationRelationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRClassificationRelation_TargetAbsToolType() {
		return (EReference)emrClassificationRelationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRClassificationRelation_SourceAbsToolType() {
		return (EReference)emrClassificationRelationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRClassificationRelation_MachineType() {
		return (EReference)emrClassificationRelationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRClassificationRelation_SourceAbsMachineType() {
		return (EReference)emrClassificationRelationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRClassificationRelation_TargetAbsMachineType() {
		return (EReference)emrClassificationRelationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMRAbstractResourceType() {
		return emrAbstractResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMRAbstractRole() {
		return emrAbstractRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRAbstractRole_EmrDiagram() {
		return (EReference)emrAbstractRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRAbstractRole_SourceClassificationRelations() {
		return (EReference)emrAbstractRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRAbstractRole_TargetClassificationRelation() {
		return (EReference)emrAbstractRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMRAbstractToolType() {
		return emrAbstractToolTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRAbstractToolType_EmrDiagram() {
		return (EReference)emrAbstractToolTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRAbstractToolType_TargetClassificationRelation() {
		return (EReference)emrAbstractToolTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRAbstractToolType_SourceAbsClassficationRelations() {
		return (EReference)emrAbstractToolTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMRAbstractMachineType() {
		return emrAbstractMachineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRAbstractMachineType_EmrDiagram() {
		return (EReference)emrAbstractMachineTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRAbstractMachineType_SourceClassificationRelations() {
		return (EReference)emrAbstractMachineTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRAbstractMachineType_TargetClassificationRelation() {
		return (EReference)emrAbstractMachineTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMRAbstractLocationType() {
		return emrAbstractLocationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRAbstractLocationType_EmrDiagram() {
		return (EReference)emrAbstractLocationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRAbstractLocationType_SourceClassificationRelations() {
		return (EReference)emrAbstractLocationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRAbstractLocationType_TargetClassification() {
		return (EReference)emrAbstractLocationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMRToolType() {
		return emrToolTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRToolType_EmrDiagram() {
		return (EReference)emrToolTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRToolType_ClassificationRelation() {
		return (EReference)emrToolTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRToolType_EmpDiagram() {
		return (EReference)emrToolTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRToolType_AssFlows() {
		return (EReference)emrToolTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMRMachineType() {
		return emrMachineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRMachineType_EmrDiagram() {
		return (EReference)emrMachineTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRMachineType_ClassificationRelation() {
		return (EReference)emrMachineTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRMachineType_EmpDiagram() {
		return (EReference)emrMachineTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRMachineType_AssFlows() {
		return (EReference)emrMachineTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRMachineType_ColMachineDiagram() {
		return (EReference)emrMachineTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMRLocationType() {
		return emrLocationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRLocationType_EmrDiagram() {
		return (EReference)emrLocationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRLocationType_ClassificationRelation() {
		return (EReference)emrLocationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRLocationType_EmpDiagram() {
		return (EReference)emrLocationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRLocationType_AssFlows() {
		return (EReference)emrLocationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRLocationType_ColLocationDiagram() {
		return (EReference)emrLocationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMRRole() {
		return emrRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRRole_TargetAssociationRelations() {
		return (EReference)emrRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRRole_SourceAssociationRelations() {
		return (EReference)emrRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRRole_EmoDiagram() {
		return (EReference)emrRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRRole_BelongedOrganization() {
		return (EReference)emrRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRRole_EmrDiagram() {
		return (EReference)emrRoleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRRole_ClassificationRelation() {
		return (EReference)emrRoleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRRole_EmpDiagram() {
		return (EReference)emrRoleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRRole_AssFlows() {
		return (EReference)emrRoleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRRole_ColRoleDiagram() {
		return (EReference)emrRoleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMRDiagram() {
		return emrDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRDiagram_EmpDiagrams() {
		return (EReference)emrDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRDiagram_EmoDiagram() {
		return (EReference)emrDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRDiagram_ClassificationRelations() {
		return (EReference)emrDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRDiagram_AbstractLocationTypes() {
		return (EReference)emrDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRDiagram_AbstractMachineTypes() {
		return (EReference)emrDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRDiagram_AbstractToolTypes() {
		return (EReference)emrDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRDiagram_AbstractRoles() {
		return (EReference)emrDiagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRDiagram_Roles() {
		return (EReference)emrDiagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRDiagram_LocationTypes() {
		return (EReference)emrDiagramEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRDiagram_MachineTypes() {
		return (EReference)emrDiagramEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMRDiagram_ToolTypes() {
		return (EReference)emrDiagramEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMRObject() {
		return emrObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMRRelation() {
		return emrRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcepackageFactory getResourcepackageFactory() {
		return (ResourcepackageFactory)getEFactoryInstance();
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
		emrResourceTypeEClass = createEClass(EMR_RESOURCE_TYPE);

		emrBasicResourceTypeEClass = createEClass(EMR_BASIC_RESOURCE_TYPE);
		createEReference(emrBasicResourceTypeEClass, EMR_BASIC_RESOURCE_TYPE__RESOURCE_GROUP_TYPES);
		createEAttribute(emrBasicResourceTypeEClass, EMR_BASIC_RESOURCE_TYPE__COST_PER_UNIT);
		createEAttribute(emrBasicResourceTypeEClass, EMR_BASIC_RESOURCE_TYPE__TOTAL_AMOUNT);
		createEAttribute(emrBasicResourceTypeEClass, EMR_BASIC_RESOURCE_TYPE__USAGE_AMOUNT);
		createEAttribute(emrBasicResourceTypeEClass, EMR_BASIC_RESOURCE_TYPE__AVAILABLE_AMOUNT);
		createEAttribute(emrBasicResourceTypeEClass, EMR_BASIC_RESOURCE_TYPE__EFFICIENCY);

		emrClassificationRelationEClass = createEClass(EMR_CLASSIFICATION_RELATION);
		createEReference(emrClassificationRelationEClass, EMR_CLASSIFICATION_RELATION__EMR_DIAGRAM);
		createEReference(emrClassificationRelationEClass, EMR_CLASSIFICATION_RELATION__ROLE);
		createEReference(emrClassificationRelationEClass, EMR_CLASSIFICATION_RELATION__SOURCE_ABS_ROLE_TYPE);
		createEReference(emrClassificationRelationEClass, EMR_CLASSIFICATION_RELATION__TARGET_ABS_ROLE_TYPE);
		createEReference(emrClassificationRelationEClass, EMR_CLASSIFICATION_RELATION__LOCATION_TYPE);
		createEReference(emrClassificationRelationEClass, EMR_CLASSIFICATION_RELATION__SOURCE_ABS_LOCATION_TYPE);
		createEReference(emrClassificationRelationEClass, EMR_CLASSIFICATION_RELATION__TARGET_ABS_LOCATION_TYPE);
		createEReference(emrClassificationRelationEClass, EMR_CLASSIFICATION_RELATION__TOOL_TYPE);
		createEReference(emrClassificationRelationEClass, EMR_CLASSIFICATION_RELATION__TARGET_ABS_TOOL_TYPE);
		createEReference(emrClassificationRelationEClass, EMR_CLASSIFICATION_RELATION__SOURCE_ABS_TOOL_TYPE);
		createEReference(emrClassificationRelationEClass, EMR_CLASSIFICATION_RELATION__MACHINE_TYPE);
		createEReference(emrClassificationRelationEClass, EMR_CLASSIFICATION_RELATION__SOURCE_ABS_MACHINE_TYPE);
		createEReference(emrClassificationRelationEClass, EMR_CLASSIFICATION_RELATION__TARGET_ABS_MACHINE_TYPE);

		emrAbstractResourceTypeEClass = createEClass(EMR_ABSTRACT_RESOURCE_TYPE);

		emrAbstractRoleEClass = createEClass(EMR_ABSTRACT_ROLE);
		createEReference(emrAbstractRoleEClass, EMR_ABSTRACT_ROLE__EMR_DIAGRAM);
		createEReference(emrAbstractRoleEClass, EMR_ABSTRACT_ROLE__SOURCE_CLASSIFICATION_RELATIONS);
		createEReference(emrAbstractRoleEClass, EMR_ABSTRACT_ROLE__TARGET_CLASSIFICATION_RELATION);

		emrAbstractToolTypeEClass = createEClass(EMR_ABSTRACT_TOOL_TYPE);
		createEReference(emrAbstractToolTypeEClass, EMR_ABSTRACT_TOOL_TYPE__EMR_DIAGRAM);
		createEReference(emrAbstractToolTypeEClass, EMR_ABSTRACT_TOOL_TYPE__TARGET_CLASSIFICATION_RELATION);
		createEReference(emrAbstractToolTypeEClass, EMR_ABSTRACT_TOOL_TYPE__SOURCE_ABS_CLASSFICATION_RELATIONS);

		emrAbstractMachineTypeEClass = createEClass(EMR_ABSTRACT_MACHINE_TYPE);
		createEReference(emrAbstractMachineTypeEClass, EMR_ABSTRACT_MACHINE_TYPE__EMR_DIAGRAM);
		createEReference(emrAbstractMachineTypeEClass, EMR_ABSTRACT_MACHINE_TYPE__SOURCE_CLASSIFICATION_RELATIONS);
		createEReference(emrAbstractMachineTypeEClass, EMR_ABSTRACT_MACHINE_TYPE__TARGET_CLASSIFICATION_RELATION);

		emrAbstractLocationTypeEClass = createEClass(EMR_ABSTRACT_LOCATION_TYPE);
		createEReference(emrAbstractLocationTypeEClass, EMR_ABSTRACT_LOCATION_TYPE__EMR_DIAGRAM);
		createEReference(emrAbstractLocationTypeEClass, EMR_ABSTRACT_LOCATION_TYPE__SOURCE_CLASSIFICATION_RELATIONS);
		createEReference(emrAbstractLocationTypeEClass, EMR_ABSTRACT_LOCATION_TYPE__TARGET_CLASSIFICATION);

		emrToolTypeEClass = createEClass(EMR_TOOL_TYPE);
		createEReference(emrToolTypeEClass, EMR_TOOL_TYPE__EMR_DIAGRAM);
		createEReference(emrToolTypeEClass, EMR_TOOL_TYPE__CLASSIFICATION_RELATION);
		createEReference(emrToolTypeEClass, EMR_TOOL_TYPE__EMP_DIAGRAM);
		createEReference(emrToolTypeEClass, EMR_TOOL_TYPE__ASS_FLOWS);

		emrMachineTypeEClass = createEClass(EMR_MACHINE_TYPE);
		createEReference(emrMachineTypeEClass, EMR_MACHINE_TYPE__EMR_DIAGRAM);
		createEReference(emrMachineTypeEClass, EMR_MACHINE_TYPE__CLASSIFICATION_RELATION);
		createEReference(emrMachineTypeEClass, EMR_MACHINE_TYPE__EMP_DIAGRAM);
		createEReference(emrMachineTypeEClass, EMR_MACHINE_TYPE__ASS_FLOWS);
		createEReference(emrMachineTypeEClass, EMR_MACHINE_TYPE__COL_MACHINE_DIAGRAM);

		emrLocationTypeEClass = createEClass(EMR_LOCATION_TYPE);
		createEReference(emrLocationTypeEClass, EMR_LOCATION_TYPE__EMR_DIAGRAM);
		createEReference(emrLocationTypeEClass, EMR_LOCATION_TYPE__CLASSIFICATION_RELATION);
		createEReference(emrLocationTypeEClass, EMR_LOCATION_TYPE__EMP_DIAGRAM);
		createEReference(emrLocationTypeEClass, EMR_LOCATION_TYPE__ASS_FLOWS);
		createEReference(emrLocationTypeEClass, EMR_LOCATION_TYPE__COL_LOCATION_DIAGRAM);

		emrRoleEClass = createEClass(EMR_ROLE);
		createEReference(emrRoleEClass, EMR_ROLE__TARGET_ASSOCIATION_RELATIONS);
		createEReference(emrRoleEClass, EMR_ROLE__SOURCE_ASSOCIATION_RELATIONS);
		createEReference(emrRoleEClass, EMR_ROLE__EMO_DIAGRAM);
		createEReference(emrRoleEClass, EMR_ROLE__BELONGED_ORGANIZATION);
		createEReference(emrRoleEClass, EMR_ROLE__EMR_DIAGRAM);
		createEReference(emrRoleEClass, EMR_ROLE__CLASSIFICATION_RELATION);
		createEReference(emrRoleEClass, EMR_ROLE__EMP_DIAGRAM);
		createEReference(emrRoleEClass, EMR_ROLE__ASS_FLOWS);
		createEReference(emrRoleEClass, EMR_ROLE__COL_ROLE_DIAGRAM);

		emrDiagramEClass = createEClass(EMR_DIAGRAM);
		createEReference(emrDiagramEClass, EMR_DIAGRAM__EMP_DIAGRAMS);
		createEReference(emrDiagramEClass, EMR_DIAGRAM__EMO_DIAGRAM);
		createEReference(emrDiagramEClass, EMR_DIAGRAM__CLASSIFICATION_RELATIONS);
		createEReference(emrDiagramEClass, EMR_DIAGRAM__ABSTRACT_LOCATION_TYPES);
		createEReference(emrDiagramEClass, EMR_DIAGRAM__ABSTRACT_MACHINE_TYPES);
		createEReference(emrDiagramEClass, EMR_DIAGRAM__ABSTRACT_TOOL_TYPES);
		createEReference(emrDiagramEClass, EMR_DIAGRAM__ABSTRACT_ROLES);
		createEReference(emrDiagramEClass, EMR_DIAGRAM__ROLES);
		createEReference(emrDiagramEClass, EMR_DIAGRAM__LOCATION_TYPES);
		createEReference(emrDiagramEClass, EMR_DIAGRAM__MACHINE_TYPES);
		createEReference(emrDiagramEClass, EMR_DIAGRAM__TOOL_TYPES);

		emrObjectEClass = createEClass(EMR_OBJECT);

		emrRelationEClass = createEClass(EMR_RELATION);
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
		ProcesspackagePackage theProcesspackagePackage = (ProcesspackagePackage)EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI);
		CollaborationpackagePackage theCollaborationpackagePackage = (CollaborationpackagePackage)EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI);
		VpmlPackage theVpmlPackage = (VpmlPackage)EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI);

		// Add supertypes to classes
		emrResourceTypeEClass.getESuperTypes().add(this.getEMRObject());
		emrBasicResourceTypeEClass.getESuperTypes().add(this.getEMRResourceType());
		emrClassificationRelationEClass.getESuperTypes().add(this.getEMRRelation());
		emrAbstractResourceTypeEClass.getESuperTypes().add(this.getEMRResourceType());
		emrAbstractRoleEClass.getESuperTypes().add(this.getEMRAbstractResourceType());
		emrAbstractToolTypeEClass.getESuperTypes().add(this.getEMRAbstractResourceType());
		emrAbstractMachineTypeEClass.getESuperTypes().add(this.getEMRAbstractResourceType());
		emrAbstractLocationTypeEClass.getESuperTypes().add(this.getEMRAbstractResourceType());
		emrToolTypeEClass.getESuperTypes().add(this.getEMRBasicResourceType());
		emrMachineTypeEClass.getESuperTypes().add(this.getEMRBasicResourceType());
		emrLocationTypeEClass.getESuperTypes().add(this.getEMRBasicResourceType());
		emrRoleEClass.getESuperTypes().add(this.getEMRBasicResourceType());
		emrDiagramEClass.getESuperTypes().add(theVpmlPackage.getEMDiagram());
		emrObjectEClass.getESuperTypes().add(theVpmlPackage.getEMObject());
		emrRelationEClass.getESuperTypes().add(this.getEMRObject());

		// Initialize classes and features; add operations and parameters
		initEClass(emrResourceTypeEClass, EMRResourceType.class, "EMRResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emrBasicResourceTypeEClass, EMRBasicResourceType.class, "EMRBasicResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMRBasicResourceType_ResourceGroupTypes(), theOrganizationpackagePackage.getEMOResourceGroupType(), theOrganizationpackagePackage.getEMOResourceGroupType_BasicResourceTypes(), "resourceGroupTypes", null, 0, -1, EMRBasicResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMRBasicResourceType_CostPerUnit(), ecorePackage.getEDoubleObject(), "costPerUnit", "10", 0, 1, EMRBasicResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMRBasicResourceType_TotalAmount(), ecorePackage.getEIntegerObject(), "totalAmount", "1", 0, 1, EMRBasicResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMRBasicResourceType_UsageAmount(), ecorePackage.getEIntegerObject(), "usageAmount", "1", 0, 1, EMRBasicResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMRBasicResourceType_AvailableAmount(), ecorePackage.getEIntegerObject(), "availableAmount", "1", 0, 1, EMRBasicResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMRBasicResourceType_Efficiency(), ecorePackage.getEDoubleObject(), "efficiency", "1", 0, 1, EMRBasicResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emrClassificationRelationEClass, EMRClassificationRelation.class, "EMRClassificationRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMRClassificationRelation_EmrDiagram(), this.getEMRDiagram(), this.getEMRDiagram_ClassificationRelations(), "emrDiagram", null, 1, 1, EMRClassificationRelation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRClassificationRelation_Role(), this.getEMRRole(), this.getEMRRole_ClassificationRelation(), "role", null, 0, 1, EMRClassificationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRClassificationRelation_SourceAbsRoleType(), this.getEMRAbstractRole(), this.getEMRAbstractRole_SourceClassificationRelations(), "sourceAbsRoleType", null, 0, 1, EMRClassificationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRClassificationRelation_TargetAbsRoleType(), this.getEMRAbstractRole(), this.getEMRAbstractRole_TargetClassificationRelation(), "targetAbsRoleType", null, 0, 1, EMRClassificationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRClassificationRelation_LocationType(), this.getEMRLocationType(), this.getEMRLocationType_ClassificationRelation(), "locationType", null, 0, 1, EMRClassificationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRClassificationRelation_SourceAbsLocationType(), this.getEMRAbstractLocationType(), this.getEMRAbstractLocationType_SourceClassificationRelations(), "sourceAbsLocationType", null, 0, 1, EMRClassificationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRClassificationRelation_TargetAbsLocationType(), this.getEMRAbstractLocationType(), this.getEMRAbstractLocationType_TargetClassification(), "targetAbsLocationType", null, 0, 1, EMRClassificationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRClassificationRelation_ToolType(), this.getEMRToolType(), this.getEMRToolType_ClassificationRelation(), "toolType", null, 0, 1, EMRClassificationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRClassificationRelation_TargetAbsToolType(), this.getEMRAbstractToolType(), this.getEMRAbstractToolType_TargetClassificationRelation(), "targetAbsToolType", null, 0, 1, EMRClassificationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRClassificationRelation_SourceAbsToolType(), this.getEMRAbstractToolType(), this.getEMRAbstractToolType_SourceAbsClassficationRelations(), "sourceAbsToolType", null, 0, 1, EMRClassificationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRClassificationRelation_MachineType(), this.getEMRMachineType(), this.getEMRMachineType_ClassificationRelation(), "machineType", null, 0, 1, EMRClassificationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRClassificationRelation_SourceAbsMachineType(), this.getEMRAbstractMachineType(), this.getEMRAbstractMachineType_SourceClassificationRelations(), "sourceAbsMachineType", null, 0, 1, EMRClassificationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRClassificationRelation_TargetAbsMachineType(), this.getEMRAbstractMachineType(), this.getEMRAbstractMachineType_TargetClassificationRelation(), "targetAbsMachineType", null, 0, 1, EMRClassificationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emrAbstractResourceTypeEClass, EMRAbstractResourceType.class, "EMRAbstractResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emrAbstractRoleEClass, EMRAbstractRole.class, "EMRAbstractRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMRAbstractRole_EmrDiagram(), this.getEMRDiagram(), this.getEMRDiagram_AbstractRoles(), "emrDiagram", null, 1, 1, EMRAbstractRole.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRAbstractRole_SourceClassificationRelations(), this.getEMRClassificationRelation(), this.getEMRClassificationRelation_SourceAbsRoleType(), "sourceClassificationRelations", null, 0, -1, EMRAbstractRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRAbstractRole_TargetClassificationRelation(), this.getEMRClassificationRelation(), this.getEMRClassificationRelation_TargetAbsRoleType(), "targetClassificationRelation", null, 0, 1, EMRAbstractRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emrAbstractToolTypeEClass, EMRAbstractToolType.class, "EMRAbstractToolType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMRAbstractToolType_EmrDiagram(), this.getEMRDiagram(), this.getEMRDiagram_AbstractToolTypes(), "emrDiagram", null, 1, 1, EMRAbstractToolType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRAbstractToolType_TargetClassificationRelation(), this.getEMRClassificationRelation(), this.getEMRClassificationRelation_TargetAbsToolType(), "targetClassificationRelation", null, 0, 1, EMRAbstractToolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRAbstractToolType_SourceAbsClassficationRelations(), this.getEMRClassificationRelation(), this.getEMRClassificationRelation_SourceAbsToolType(), "sourceAbsClassficationRelations", null, 0, -1, EMRAbstractToolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emrAbstractMachineTypeEClass, EMRAbstractMachineType.class, "EMRAbstractMachineType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMRAbstractMachineType_EmrDiagram(), this.getEMRDiagram(), this.getEMRDiagram_AbstractMachineTypes(), "emrDiagram", null, 1, 1, EMRAbstractMachineType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRAbstractMachineType_SourceClassificationRelations(), this.getEMRClassificationRelation(), this.getEMRClassificationRelation_SourceAbsMachineType(), "sourceClassificationRelations", null, 0, -1, EMRAbstractMachineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRAbstractMachineType_TargetClassificationRelation(), this.getEMRClassificationRelation(), this.getEMRClassificationRelation_TargetAbsMachineType(), "targetClassificationRelation", null, 0, 1, EMRAbstractMachineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emrAbstractLocationTypeEClass, EMRAbstractLocationType.class, "EMRAbstractLocationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMRAbstractLocationType_EmrDiagram(), this.getEMRDiagram(), this.getEMRDiagram_AbstractLocationTypes(), "emrDiagram", null, 1, 1, EMRAbstractLocationType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRAbstractLocationType_SourceClassificationRelations(), this.getEMRClassificationRelation(), this.getEMRClassificationRelation_SourceAbsLocationType(), "sourceClassificationRelations", null, 0, -1, EMRAbstractLocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRAbstractLocationType_TargetClassification(), this.getEMRClassificationRelation(), this.getEMRClassificationRelation_TargetAbsLocationType(), "targetClassification", null, 0, 1, EMRAbstractLocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emrToolTypeEClass, EMRToolType.class, "EMRToolType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMRToolType_EmrDiagram(), this.getEMRDiagram(), this.getEMRDiagram_ToolTypes(), "emrDiagram", null, 1, 1, EMRToolType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRToolType_ClassificationRelation(), this.getEMRClassificationRelation(), this.getEMRClassificationRelation_ToolType(), "classificationRelation", null, 1, 1, EMRToolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRToolType_EmpDiagram(), theProcesspackagePackage.getEMPDiagram(), theProcesspackagePackage.getEMPDiagram_ToolTypes(), "empDiagram", null, 1, 1, EMRToolType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRToolType_AssFlows(), theProcesspackagePackage.getEMPAssFlow(), theProcesspackagePackage.getEMPAssFlow_ToolType(), "assFlows", null, 0, -1, EMRToolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emrMachineTypeEClass, EMRMachineType.class, "EMRMachineType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMRMachineType_EmrDiagram(), this.getEMRDiagram(), this.getEMRDiagram_MachineTypes(), "emrDiagram", null, 1, 1, EMRMachineType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRMachineType_ClassificationRelation(), this.getEMRClassificationRelation(), this.getEMRClassificationRelation_MachineType(), "classificationRelation", null, 1, 1, EMRMachineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRMachineType_EmpDiagram(), theProcesspackagePackage.getEMPDiagram(), theProcesspackagePackage.getEMPDiagram_MachineTypes(), "empDiagram", null, 1, 1, EMRMachineType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRMachineType_AssFlows(), theProcesspackagePackage.getEMPAssFlow(), theProcesspackagePackage.getEMPAssFlow_MachineType(), "assFlows", null, 0, -1, EMRMachineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRMachineType_ColMachineDiagram(), theCollaborationpackagePackage.getEMCDiagram(), theCollaborationpackagePackage.getEMCDiagram_ColMachine(), "colMachineDiagram", null, 0, 1, EMRMachineType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emrLocationTypeEClass, EMRLocationType.class, "EMRLocationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMRLocationType_EmrDiagram(), this.getEMRDiagram(), this.getEMRDiagram_LocationTypes(), "emrDiagram", null, 1, 1, EMRLocationType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRLocationType_ClassificationRelation(), this.getEMRClassificationRelation(), this.getEMRClassificationRelation_LocationType(), "classificationRelation", null, 1, 1, EMRLocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRLocationType_EmpDiagram(), theProcesspackagePackage.getEMPDiagram(), theProcesspackagePackage.getEMPDiagram_LocationTypes(), "empDiagram", null, 1, 1, EMRLocationType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRLocationType_AssFlows(), theProcesspackagePackage.getEMPAssFlow(), theProcesspackagePackage.getEMPAssFlow_LocationType(), "assFlows", null, 0, -1, EMRLocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRLocationType_ColLocationDiagram(), theCollaborationpackagePackage.getEMCDiagram(), theCollaborationpackagePackage.getEMCDiagram_ColLocation(), "colLocationDiagram", null, 0, 1, EMRLocationType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emrRoleEClass, EMRRole.class, "EMRRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMRRole_TargetAssociationRelations(), theOrganizationpackagePackage.getEMOAssociationRelation(), theOrganizationpackagePackage.getEMOAssociationRelation_TargetRole(), "targetAssociationRelations", null, 0, -1, EMRRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRRole_SourceAssociationRelations(), theOrganizationpackagePackage.getEMOAssociationRelation(), theOrganizationpackagePackage.getEMOAssociationRelation_SourceRole(), "sourceAssociationRelations", null, 0, -1, EMRRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRRole_EmoDiagram(), theOrganizationpackagePackage.getEMODiagram(), theOrganizationpackagePackage.getEMODiagram_Roles(), "emoDiagram", null, 1, 1, EMRRole.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRRole_BelongedOrganization(), theOrganizationpackagePackage.getEMOResourceGroupType(), null, "belongedOrganization", null, 0, 1, EMRRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRRole_EmrDiagram(), this.getEMRDiagram(), this.getEMRDiagram_Roles(), "emrDiagram", null, 1, 1, EMRRole.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRRole_ClassificationRelation(), this.getEMRClassificationRelation(), this.getEMRClassificationRelation_Role(), "classificationRelation", null, 0, 1, EMRRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRRole_EmpDiagram(), theProcesspackagePackage.getEMPDiagram(), theProcesspackagePackage.getEMPDiagram_Roles(), "empDiagram", null, 1, 1, EMRRole.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRRole_AssFlows(), theProcesspackagePackage.getEMPAssFlow(), theProcesspackagePackage.getEMPAssFlow_Role(), "assFlows", null, 0, -1, EMRRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRRole_ColRoleDiagram(), theCollaborationpackagePackage.getEMCDiagram(), theCollaborationpackagePackage.getEMCDiagram_ColRole(), "colRoleDiagram", null, 0, 1, EMRRole.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emrDiagramEClass, EMRDiagram.class, "EMRDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMRDiagram_EmpDiagrams(), theProcesspackagePackage.getEMPDiagram(), theProcesspackagePackage.getEMPDiagram_EmrDiagrams(), "empDiagrams", null, 0, -1, EMRDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRDiagram_EmoDiagram(), theOrganizationpackagePackage.getEMODiagram(), theOrganizationpackagePackage.getEMODiagram_EmrDiagrams(), "emoDiagram", null, 1, 1, EMRDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRDiagram_ClassificationRelations(), this.getEMRClassificationRelation(), this.getEMRClassificationRelation_EmrDiagram(), "classificationRelations", null, 0, -1, EMRDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRDiagram_AbstractLocationTypes(), this.getEMRAbstractLocationType(), this.getEMRAbstractLocationType_EmrDiagram(), "abstractLocationTypes", null, 0, -1, EMRDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRDiagram_AbstractMachineTypes(), this.getEMRAbstractMachineType(), this.getEMRAbstractMachineType_EmrDiagram(), "abstractMachineTypes", null, 0, -1, EMRDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRDiagram_AbstractToolTypes(), this.getEMRAbstractToolType(), this.getEMRAbstractToolType_EmrDiagram(), "abstractToolTypes", null, 0, -1, EMRDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRDiagram_AbstractRoles(), this.getEMRAbstractRole(), this.getEMRAbstractRole_EmrDiagram(), "abstractRoles", null, 0, -1, EMRDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRDiagram_Roles(), this.getEMRRole(), this.getEMRRole_EmrDiagram(), "roles", null, 0, -1, EMRDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRDiagram_LocationTypes(), this.getEMRLocationType(), this.getEMRLocationType_EmrDiagram(), "locationTypes", null, 0, -1, EMRDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRDiagram_MachineTypes(), this.getEMRMachineType(), this.getEMRMachineType_EmrDiagram(), "machineTypes", null, 0, -1, EMRDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMRDiagram_ToolTypes(), this.getEMRToolType(), this.getEMRToolType_EmrDiagram(), "toolTypes", null, 0, -1, EMRDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emrObjectEClass, EMRObject.class, "EMRObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emrRelationEClass, EMRRelation.class, "EMRRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ResourcepackagePackageImpl
