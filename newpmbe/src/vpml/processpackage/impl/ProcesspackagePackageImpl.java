/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.impl;

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

import vpml.processpackage.EMPActivity;
import vpml.processpackage.EMPArtifact;
import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPAttributeItem;
import vpml.processpackage.EMPAutoActivity;
import vpml.processpackage.EMPAutoBatchActivity;
import vpml.processpackage.EMPBatchActivity;
import vpml.processpackage.EMPClock;
import vpml.processpackage.EMPClockFlow;
import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPDocument;
import vpml.processpackage.EMPFlow;
import vpml.processpackage.EMPForm;
import vpml.processpackage.EMPInAnd;
import vpml.processpackage.EMPInConnector;
import vpml.processpackage.EMPInOr;
import vpml.processpackage.EMPLeafActivity;
import vpml.processpackage.EMPLeafProduct;
import vpml.processpackage.EMPLogicalConnector;
import vpml.processpackage.EMPManualBatchActivity;
import vpml.processpackage.EMPMessage;
import vpml.processpackage.EMPMileStone;
import vpml.processpackage.EMPNormalActivity;
import vpml.processpackage.EMPObject;
import vpml.processpackage.EMPOther;
import vpml.processpackage.EMPOutAnd;
import vpml.processpackage.EMPOutConnector;
import vpml.processpackage.EMPOutOr;
import vpml.processpackage.EMPProduct;
import vpml.processpackage.EMPProductPackage;
import vpml.processpackage.EMPRefFlow;
import vpml.processpackage.ProcesspackageFactory;
import vpml.processpackage.ProcesspackagePackage;

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
public class ProcesspackagePackageImpl extends EPackageImpl implements ProcesspackagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empNormalActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empBatchActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empDataFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empAssFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empClockFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empLogicalConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empInAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empOutAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empInOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empOutOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empClockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empCompActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empInConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empOutConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empLeafActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empProductPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empLeafProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empRefFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empOtherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empAttributeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empAutoActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empManualBatchActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empAutoBatchActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empMileStoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empFormEClass = null;

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
	 * @see vpml.processpackage.ProcesspackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProcesspackagePackageImpl() {
		super(eNS_URI, ProcesspackageFactory.eINSTANCE);
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
	public static ProcesspackagePackage init() {
		if (isInited) return (ProcesspackagePackage)EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI);

		// Obtain or create and register package
		ProcesspackagePackageImpl theProcesspackagePackage = (ProcesspackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ProcesspackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ProcesspackagePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VpmlPackageImpl theVpmlPackage = (VpmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI) instanceof VpmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI) : VpmlPackage.eINSTANCE);
		OrganizationpackagePackageImpl theOrganizationpackagePackage = (OrganizationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI) instanceof OrganizationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI) : OrganizationpackagePackage.eINSTANCE);
		ResourcepackagePackageImpl theResourcepackagePackage = (ResourcepackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI) instanceof ResourcepackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI) : ResourcepackagePackage.eINSTANCE);
		UtilpackagePackageImpl theUtilpackagePackage = (UtilpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI) instanceof UtilpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI) : UtilpackagePackage.eINSTANCE);
		InfopackagePackageImpl theInfopackagePackage = (InfopackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI) instanceof InfopackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI) : InfopackagePackage.eINSTANCE);
		InformationpackagePackageImpl theInformationpackagePackage = (InformationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI) instanceof InformationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI) : InformationpackagePackage.eINSTANCE);
		CollaborationpackagePackageImpl theCollaborationpackagePackage = (CollaborationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI) instanceof CollaborationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI) : CollaborationpackagePackage.eINSTANCE);

		// Create package meta-data objects
		theProcesspackagePackage.createPackageContents();
		theVpmlPackage.createPackageContents();
		theOrganizationpackagePackage.createPackageContents();
		theResourcepackagePackage.createPackageContents();
		theUtilpackagePackage.createPackageContents();
		theInfopackagePackage.createPackageContents();
		theInformationpackagePackage.createPackageContents();
		theCollaborationpackagePackage.createPackageContents();

		// Initialize created meta-data
		theProcesspackagePackage.initializePackageContents();
		theVpmlPackage.initializePackageContents();
		theOrganizationpackagePackage.initializePackageContents();
		theResourcepackagePackage.initializePackageContents();
		theUtilpackagePackage.initializePackageContents();
		theInfopackagePackage.initializePackageContents();
		theInformationpackagePackage.initializePackageContents();
		theCollaborationpackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProcesspackagePackage.freeze();

		return theProcesspackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPNormalActivity() {
		return empNormalActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPNormalActivity_EmpDiagram() {
		return (EReference)empNormalActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPNormalActivity_AssFlows() {
		return (EReference)empNormalActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPBatchActivity() {
		return empBatchActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPBatchActivity_BatchType() {
		return (EAttribute)empBatchActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPBatchActivity_BatStartTime() {
		return (EAttribute)empBatchActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPBatchActivity_BatEndTime() {
		return (EAttribute)empBatchActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPBatchActivity_RestartPeriod() {
		return (EAttribute)empBatchActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPBatchActivity_BatTimeUnit() {
		return (EAttribute)empBatchActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPBatchActivity_TimerQueueFlag() {
		return (EAttribute)empBatchActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPBatchActivity_EmergencyFlag() {
		return (EAttribute)empBatchActivityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPBatchActivity_IntervalValue() {
		return (EAttribute)empBatchActivityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPBatchActivity_IntervalTimeUnit() {
		return (EAttribute)empBatchActivityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPBatchActivity_MaxQuantity() {
		return (EAttribute)empBatchActivityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPBatchActivity_MinQuantity() {
		return (EAttribute)empBatchActivityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPActivity() {
		return empActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPActivity_Procedure() {
		return (EAttribute)empActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPActivity_Creater() {
		return (EAttribute)empActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPActivity_CreatedDate() {
		return (EAttribute)empActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPActivity_LastModifier() {
		return (EAttribute)empActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPActivity_LastModifiedDate() {
		return (EAttribute)empActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPActivity_ClockFlow() {
		return (EReference)empActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPActivity_TargetDataFlows() {
		return (EReference)empActivityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPActivity_SourceDataFlows() {
		return (EReference)empActivityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPActivity_RefFlows() {
		return (EReference)empActivityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPObject() {
		return empObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPObject_ComActivity() {
		return (EReference)empObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPFlow() {
		return empFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPDataFlow() {
		return empDataFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPDataFlow_Probability() {
		return (EAttribute)empDataFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDataFlow_EmpDiagram() {
		return (EReference)empDataFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDataFlow_TargetProduct() {
		return (EReference)empDataFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDataFlow_TargetActivity() {
		return (EReference)empDataFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDataFlow_SourceProduct() {
		return (EReference)empDataFlowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDataFlow_SourceActivity() {
		return (EReference)empDataFlowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDataFlow_SourceInAnd() {
		return (EReference)empDataFlowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDataFlow_TargetInAnd() {
		return (EReference)empDataFlowEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDataFlow_TargetInOr() {
		return (EReference)empDataFlowEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDataFlow_SourceInOr() {
		return (EReference)empDataFlowEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDataFlow_SourceOutAnd() {
		return (EReference)empDataFlowEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDataFlow_TargetOutAnd() {
		return (EReference)empDataFlowEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDataFlow_SourceOutOr() {
		return (EReference)empDataFlowEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDataFlow_TargetOutOr() {
		return (EReference)empDataFlowEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDataFlow_MileStone() {
		return (EReference)empDataFlowEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPAssFlow() {
		return empAssFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPAssFlow_ResourceGroupType() {
		return (EReference)empAssFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPAssFlow_EmpDiagram() {
		return (EReference)empAssFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPAssFlow_Product() {
		return (EReference)empAssFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPAssFlow_LocationType() {
		return (EReference)empAssFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPAssFlow_MachineType() {
		return (EReference)empAssFlowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPAssFlow_Role() {
		return (EReference)empAssFlowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPAssFlow_ToolType() {
		return (EReference)empAssFlowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPAssFlow_AutoActivity() {
		return (EReference)empAssFlowEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPAssFlow_NormalActivity() {
		return (EReference)empAssFlowEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPAssFlow_CompActivity() {
		return (EReference)empAssFlowEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPAssFlow_ManualBatchActivity() {
		return (EReference)empAssFlowEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPAssFlow_AutoBatchActiviy() {
		return (EReference)empAssFlowEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPClockFlow() {
		return empClockFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPClockFlow_Activity() {
		return (EReference)empClockFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPClockFlow_Clock() {
		return (EReference)empClockFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPClockFlow_EmpDiagram() {
		return (EReference)empClockFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPLogicalConnector() {
		return empLogicalConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPInAnd() {
		return empInAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPInAnd_EmpDiagram() {
		return (EReference)empInAndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPInAnd_SourceFlows() {
		return (EReference)empInAndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPInAnd_TargetFlows() {
		return (EReference)empInAndEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPOutAnd() {
		return empOutAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPOutAnd_EmpDiagram() {
		return (EReference)empOutAndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPOutAnd_SourceFlows() {
		return (EReference)empOutAndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPOutAnd_TargetFlows() {
		return (EReference)empOutAndEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPInOr() {
		return empInOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPInOr_EmpDiagram() {
		return (EReference)empInOrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPInOr_TargetFlows() {
		return (EReference)empInOrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPInOr_SourceFlows() {
		return (EReference)empInOrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPOutOr() {
		return empOutOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPOutOr_EmpDiagram() {
		return (EReference)empOutOrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPOutOr_SourceFlows() {
		return (EReference)empOutOrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPOutOr_TargetFlows() {
		return (EReference)empOutOrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPClock() {
		return empClockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPClock_StartTime() {
		return (EAttribute)empClockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPClock_EndTime() {
		return (EAttribute)empClockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPClock_RestartPeriod() {
		return (EAttribute)empClockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPClock_TimeUnit() {
		return (EAttribute)empClockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPClock_TqFlag() {
		return (EAttribute)empClockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPClock_EFlag() {
		return (EAttribute)empClockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPClock_IntervalValue() {
		return (EAttribute)empClockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPClock_IntervalUnit() {
		return (EAttribute)empClockEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPClock_ClockFlows() {
		return (EReference)empClockEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPClock_EmpDiagram() {
		return (EReference)empClockEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPCompActivity() {
		return empCompActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPCompActivity_EmpDiagram() {
		return (EReference)empCompActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPCompActivity_LeafObjects() {
		return (EReference)empCompActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPCompActivity_AssFlows() {
		return (EReference)empCompActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPInConnector() {
		return empInConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPOutConnector() {
		return empOutConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPLeafActivity() {
		return empLeafActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPLeafActivity_IsDefault() {
		return (EAttribute)empLeafActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPLeafActivity_StartTime() {
		return (EAttribute)empLeafActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPLeafActivity_DurationTime() {
		return (EReference)empLeafActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPLeafActivity_TimeUnit() {
		return (EAttribute)empLeafActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPLeafActivity_Priority() {
		return (EAttribute)empLeafActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPProduct() {
		return empProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPProduct_TargetDataFlows() {
		return (EReference)empProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPProduct_SourceDataFlows() {
		return (EReference)empProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPProduct_RefFlows() {
		return (EReference)empProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPProduct_AssFlows() {
		return (EReference)empProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPProductPackage() {
		return empProductPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPProductPackage_SubPackages() {
		return (EReference)empProductPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPProductPackage_TopPackage() {
		return (EReference)empProductPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPProductPackage_EmpDiagram() {
		return (EReference)empProductPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPProductPackage_LeafProducts() {
		return (EReference)empProductPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPLeafProduct() {
		return empLeafProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPLeafProduct_Attachment() {
		return (EAttribute)empLeafProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPLeafProduct_IoType() {
		return (EAttribute)empLeafProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPLeafProduct_Period() {
		return (EAttribute)empLeafProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPLeafProduct_DurationTime() {
		return (EReference)empLeafProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPLeafProduct_TimeUnit() {
		return (EAttribute)empLeafProductEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPLeafProduct_InitQueue() {
		return (EAttribute)empLeafProductEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPLeafProduct_Cost() {
		return (EAttribute)empLeafProductEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPLeafProduct_TopProductPackage() {
		return (EReference)empLeafProductEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPRefFlow() {
		return empRefFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPRefFlow_Activity() {
		return (EReference)empRefFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPRefFlow_Product() {
		return (EReference)empRefFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPRefFlow_EmpDiagram() {
		return (EReference)empRefFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPDocument() {
		return empDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDocument_EmpDiagram() {
		return (EReference)empDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPArtifact() {
		return empArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPArtifact_EmpDiagram() {
		return (EReference)empArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPOther() {
		return empOtherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPOther_EmpDiagram() {
		return (EReference)empOtherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPAttributeItem() {
		return empAttributeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPAttributeItem_Type() {
		return (EAttribute)empAttributeItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPAttributeItem__depend() {
		return (EAttribute)empAttributeItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPAutoActivity() {
		return empAutoActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPAutoActivity_EmpDiagram() {
		return (EReference)empAutoActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPAutoActivity_AssFlows() {
		return (EReference)empAutoActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPManualBatchActivity() {
		return empManualBatchActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPManualBatchActivity_EmpDiagram() {
		return (EReference)empManualBatchActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPManualBatchActivity_AssFlows() {
		return (EReference)empManualBatchActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPAutoBatchActivity() {
		return empAutoBatchActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPAutoBatchActivity_EmpDiagram() {
		return (EReference)empAutoBatchActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPAutoBatchActivity_AssFlows() {
		return (EReference)empAutoBatchActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPMessage() {
		return empMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPMessage_EmpDiagram() {
		return (EReference)empMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPDiagram() {
		return empDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_EmoDiagrams() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_EmrDiagrams() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_EmcDiagram() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_EmiDiagram() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPDiagram_StartedTime() {
		return (EAttribute)empDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_DurationTime() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPDiagram_TimeUnit() {
		return (EAttribute)empDiagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_InOrs() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_ProductPackages() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_OutAnds() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_DataFlows() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_ClockFlows() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_Clocks() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_InAnds() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_NormalActivities() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_CompActivities() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_OutOrs() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_AssFlows() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_RefFlows() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_Others() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_Artifacts() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_Forms() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_Documents() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_AutoActivities() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_Messages() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_ManualBatchActivities() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_AutoBatchActivities() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_MachineTypes() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_Roles() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_LocationTypes() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_ToolTypes() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_ResourceGroupTypes() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPDiagram_MileStones() {
		return (EReference)empDiagramEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPMileStone() {
		return empMileStoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMPMileStone_Process() {
		return (EAttribute)empMileStoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPMileStone_DataFlows() {
		return (EReference)empMileStoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPMileStone_EmpDiagram() {
		return (EReference)empMileStoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPForm() {
		return empFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPForm_EmpDiagram() {
		return (EReference)empFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMPForm_FormType() {
		return (EReference)empFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcesspackageFactory getProcesspackageFactory() {
		return (ProcesspackageFactory)getEFactoryInstance();
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
		empNormalActivityEClass = createEClass(EMP_NORMAL_ACTIVITY);
		createEReference(empNormalActivityEClass, EMP_NORMAL_ACTIVITY__EMP_DIAGRAM);
		createEReference(empNormalActivityEClass, EMP_NORMAL_ACTIVITY__ASS_FLOWS);

		empBatchActivityEClass = createEClass(EMP_BATCH_ACTIVITY);
		createEAttribute(empBatchActivityEClass, EMP_BATCH_ACTIVITY__BATCH_TYPE);
		createEAttribute(empBatchActivityEClass, EMP_BATCH_ACTIVITY__BAT_START_TIME);
		createEAttribute(empBatchActivityEClass, EMP_BATCH_ACTIVITY__BAT_END_TIME);
		createEAttribute(empBatchActivityEClass, EMP_BATCH_ACTIVITY__RESTART_PERIOD);
		createEAttribute(empBatchActivityEClass, EMP_BATCH_ACTIVITY__BAT_TIME_UNIT);
		createEAttribute(empBatchActivityEClass, EMP_BATCH_ACTIVITY__TIMER_QUEUE_FLAG);
		createEAttribute(empBatchActivityEClass, EMP_BATCH_ACTIVITY__EMERGENCY_FLAG);
		createEAttribute(empBatchActivityEClass, EMP_BATCH_ACTIVITY__INTERVAL_VALUE);
		createEAttribute(empBatchActivityEClass, EMP_BATCH_ACTIVITY__INTERVAL_TIME_UNIT);
		createEAttribute(empBatchActivityEClass, EMP_BATCH_ACTIVITY__MAX_QUANTITY);
		createEAttribute(empBatchActivityEClass, EMP_BATCH_ACTIVITY__MIN_QUANTITY);

		empActivityEClass = createEClass(EMP_ACTIVITY);
		createEAttribute(empActivityEClass, EMP_ACTIVITY__PROCEDURE);
		createEAttribute(empActivityEClass, EMP_ACTIVITY__CREATER);
		createEAttribute(empActivityEClass, EMP_ACTIVITY__CREATED_DATE);
		createEAttribute(empActivityEClass, EMP_ACTIVITY__LAST_MODIFIER);
		createEAttribute(empActivityEClass, EMP_ACTIVITY__LAST_MODIFIED_DATE);
		createEReference(empActivityEClass, EMP_ACTIVITY__CLOCK_FLOW);
		createEReference(empActivityEClass, EMP_ACTIVITY__TARGET_DATA_FLOWS);
		createEReference(empActivityEClass, EMP_ACTIVITY__SOURCE_DATA_FLOWS);
		createEReference(empActivityEClass, EMP_ACTIVITY__REF_FLOWS);

		empObjectEClass = createEClass(EMP_OBJECT);
		createEReference(empObjectEClass, EMP_OBJECT__COM_ACTIVITY);

		empFlowEClass = createEClass(EMP_FLOW);

		empDataFlowEClass = createEClass(EMP_DATA_FLOW);
		createEAttribute(empDataFlowEClass, EMP_DATA_FLOW__PROBABILITY);
		createEReference(empDataFlowEClass, EMP_DATA_FLOW__EMP_DIAGRAM);
		createEReference(empDataFlowEClass, EMP_DATA_FLOW__TARGET_PRODUCT);
		createEReference(empDataFlowEClass, EMP_DATA_FLOW__TARGET_ACTIVITY);
		createEReference(empDataFlowEClass, EMP_DATA_FLOW__SOURCE_PRODUCT);
		createEReference(empDataFlowEClass, EMP_DATA_FLOW__SOURCE_ACTIVITY);
		createEReference(empDataFlowEClass, EMP_DATA_FLOW__SOURCE_IN_AND);
		createEReference(empDataFlowEClass, EMP_DATA_FLOW__TARGET_IN_AND);
		createEReference(empDataFlowEClass, EMP_DATA_FLOW__TARGET_IN_OR);
		createEReference(empDataFlowEClass, EMP_DATA_FLOW__SOURCE_IN_OR);
		createEReference(empDataFlowEClass, EMP_DATA_FLOW__SOURCE_OUT_AND);
		createEReference(empDataFlowEClass, EMP_DATA_FLOW__TARGET_OUT_AND);
		createEReference(empDataFlowEClass, EMP_DATA_FLOW__SOURCE_OUT_OR);
		createEReference(empDataFlowEClass, EMP_DATA_FLOW__TARGET_OUT_OR);
		createEReference(empDataFlowEClass, EMP_DATA_FLOW__MILE_STONE);

		empAssFlowEClass = createEClass(EMP_ASS_FLOW);
		createEReference(empAssFlowEClass, EMP_ASS_FLOW__RESOURCE_GROUP_TYPE);
		createEReference(empAssFlowEClass, EMP_ASS_FLOW__EMP_DIAGRAM);
		createEReference(empAssFlowEClass, EMP_ASS_FLOW__PRODUCT);
		createEReference(empAssFlowEClass, EMP_ASS_FLOW__LOCATION_TYPE);
		createEReference(empAssFlowEClass, EMP_ASS_FLOW__MACHINE_TYPE);
		createEReference(empAssFlowEClass, EMP_ASS_FLOW__ROLE);
		createEReference(empAssFlowEClass, EMP_ASS_FLOW__TOOL_TYPE);
		createEReference(empAssFlowEClass, EMP_ASS_FLOW__AUTO_ACTIVITY);
		createEReference(empAssFlowEClass, EMP_ASS_FLOW__NORMAL_ACTIVITY);
		createEReference(empAssFlowEClass, EMP_ASS_FLOW__COMP_ACTIVITY);
		createEReference(empAssFlowEClass, EMP_ASS_FLOW__MANUAL_BATCH_ACTIVITY);
		createEReference(empAssFlowEClass, EMP_ASS_FLOW__AUTO_BATCH_ACTIVIY);

		empClockFlowEClass = createEClass(EMP_CLOCK_FLOW);
		createEReference(empClockFlowEClass, EMP_CLOCK_FLOW__ACTIVITY);
		createEReference(empClockFlowEClass, EMP_CLOCK_FLOW__CLOCK);
		createEReference(empClockFlowEClass, EMP_CLOCK_FLOW__EMP_DIAGRAM);

		empLogicalConnectorEClass = createEClass(EMP_LOGICAL_CONNECTOR);

		empInAndEClass = createEClass(EMP_IN_AND);
		createEReference(empInAndEClass, EMP_IN_AND__EMP_DIAGRAM);
		createEReference(empInAndEClass, EMP_IN_AND__SOURCE_FLOWS);
		createEReference(empInAndEClass, EMP_IN_AND__TARGET_FLOWS);

		empOutAndEClass = createEClass(EMP_OUT_AND);
		createEReference(empOutAndEClass, EMP_OUT_AND__EMP_DIAGRAM);
		createEReference(empOutAndEClass, EMP_OUT_AND__SOURCE_FLOWS);
		createEReference(empOutAndEClass, EMP_OUT_AND__TARGET_FLOWS);

		empInOrEClass = createEClass(EMP_IN_OR);
		createEReference(empInOrEClass, EMP_IN_OR__EMP_DIAGRAM);
		createEReference(empInOrEClass, EMP_IN_OR__TARGET_FLOWS);
		createEReference(empInOrEClass, EMP_IN_OR__SOURCE_FLOWS);

		empOutOrEClass = createEClass(EMP_OUT_OR);
		createEReference(empOutOrEClass, EMP_OUT_OR__EMP_DIAGRAM);
		createEReference(empOutOrEClass, EMP_OUT_OR__SOURCE_FLOWS);
		createEReference(empOutOrEClass, EMP_OUT_OR__TARGET_FLOWS);

		empClockEClass = createEClass(EMP_CLOCK);
		createEAttribute(empClockEClass, EMP_CLOCK__START_TIME);
		createEAttribute(empClockEClass, EMP_CLOCK__END_TIME);
		createEAttribute(empClockEClass, EMP_CLOCK__RESTART_PERIOD);
		createEAttribute(empClockEClass, EMP_CLOCK__TIME_UNIT);
		createEAttribute(empClockEClass, EMP_CLOCK__TQ_FLAG);
		createEAttribute(empClockEClass, EMP_CLOCK__EFLAG);
		createEAttribute(empClockEClass, EMP_CLOCK__INTERVAL_VALUE);
		createEAttribute(empClockEClass, EMP_CLOCK__INTERVAL_UNIT);
		createEReference(empClockEClass, EMP_CLOCK__CLOCK_FLOWS);
		createEReference(empClockEClass, EMP_CLOCK__EMP_DIAGRAM);

		empCompActivityEClass = createEClass(EMP_COMP_ACTIVITY);
		createEReference(empCompActivityEClass, EMP_COMP_ACTIVITY__EMP_DIAGRAM);
		createEReference(empCompActivityEClass, EMP_COMP_ACTIVITY__LEAF_OBJECTS);
		createEReference(empCompActivityEClass, EMP_COMP_ACTIVITY__ASS_FLOWS);

		empInConnectorEClass = createEClass(EMP_IN_CONNECTOR);

		empOutConnectorEClass = createEClass(EMP_OUT_CONNECTOR);

		empLeafActivityEClass = createEClass(EMP_LEAF_ACTIVITY);
		createEAttribute(empLeafActivityEClass, EMP_LEAF_ACTIVITY__IS_DEFAULT);
		createEAttribute(empLeafActivityEClass, EMP_LEAF_ACTIVITY__START_TIME);
		createEReference(empLeafActivityEClass, EMP_LEAF_ACTIVITY__DURATION_TIME);
		createEAttribute(empLeafActivityEClass, EMP_LEAF_ACTIVITY__TIME_UNIT);
		createEAttribute(empLeafActivityEClass, EMP_LEAF_ACTIVITY__PRIORITY);

		empProductEClass = createEClass(EMP_PRODUCT);
		createEReference(empProductEClass, EMP_PRODUCT__TARGET_DATA_FLOWS);
		createEReference(empProductEClass, EMP_PRODUCT__SOURCE_DATA_FLOWS);
		createEReference(empProductEClass, EMP_PRODUCT__REF_FLOWS);
		createEReference(empProductEClass, EMP_PRODUCT__ASS_FLOWS);

		empProductPackageEClass = createEClass(EMP_PRODUCT_PACKAGE);
		createEReference(empProductPackageEClass, EMP_PRODUCT_PACKAGE__SUB_PACKAGES);
		createEReference(empProductPackageEClass, EMP_PRODUCT_PACKAGE__TOP_PACKAGE);
		createEReference(empProductPackageEClass, EMP_PRODUCT_PACKAGE__EMP_DIAGRAM);
		createEReference(empProductPackageEClass, EMP_PRODUCT_PACKAGE__LEAF_PRODUCTS);

		empLeafProductEClass = createEClass(EMP_LEAF_PRODUCT);
		createEAttribute(empLeafProductEClass, EMP_LEAF_PRODUCT__ATTACHMENT);
		createEAttribute(empLeafProductEClass, EMP_LEAF_PRODUCT__IO_TYPE);
		createEAttribute(empLeafProductEClass, EMP_LEAF_PRODUCT__PERIOD);
		createEReference(empLeafProductEClass, EMP_LEAF_PRODUCT__DURATION_TIME);
		createEAttribute(empLeafProductEClass, EMP_LEAF_PRODUCT__TIME_UNIT);
		createEAttribute(empLeafProductEClass, EMP_LEAF_PRODUCT__INIT_QUEUE);
		createEAttribute(empLeafProductEClass, EMP_LEAF_PRODUCT__COST);
		createEReference(empLeafProductEClass, EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE);

		empRefFlowEClass = createEClass(EMP_REF_FLOW);
		createEReference(empRefFlowEClass, EMP_REF_FLOW__ACTIVITY);
		createEReference(empRefFlowEClass, EMP_REF_FLOW__PRODUCT);
		createEReference(empRefFlowEClass, EMP_REF_FLOW__EMP_DIAGRAM);

		empDocumentEClass = createEClass(EMP_DOCUMENT);
		createEReference(empDocumentEClass, EMP_DOCUMENT__EMP_DIAGRAM);

		empArtifactEClass = createEClass(EMP_ARTIFACT);
		createEReference(empArtifactEClass, EMP_ARTIFACT__EMP_DIAGRAM);

		empOtherEClass = createEClass(EMP_OTHER);
		createEReference(empOtherEClass, EMP_OTHER__EMP_DIAGRAM);

		empAttributeItemEClass = createEClass(EMP_ATTRIBUTE_ITEM);
		createEAttribute(empAttributeItemEClass, EMP_ATTRIBUTE_ITEM__TYPE);
		createEAttribute(empAttributeItemEClass, EMP_ATTRIBUTE_ITEM__DEPEND);

		empAutoActivityEClass = createEClass(EMP_AUTO_ACTIVITY);
		createEReference(empAutoActivityEClass, EMP_AUTO_ACTIVITY__EMP_DIAGRAM);
		createEReference(empAutoActivityEClass, EMP_AUTO_ACTIVITY__ASS_FLOWS);

		empManualBatchActivityEClass = createEClass(EMP_MANUAL_BATCH_ACTIVITY);
		createEReference(empManualBatchActivityEClass, EMP_MANUAL_BATCH_ACTIVITY__EMP_DIAGRAM);
		createEReference(empManualBatchActivityEClass, EMP_MANUAL_BATCH_ACTIVITY__ASS_FLOWS);

		empAutoBatchActivityEClass = createEClass(EMP_AUTO_BATCH_ACTIVITY);
		createEReference(empAutoBatchActivityEClass, EMP_AUTO_BATCH_ACTIVITY__EMP_DIAGRAM);
		createEReference(empAutoBatchActivityEClass, EMP_AUTO_BATCH_ACTIVITY__ASS_FLOWS);

		empMessageEClass = createEClass(EMP_MESSAGE);
		createEReference(empMessageEClass, EMP_MESSAGE__EMP_DIAGRAM);

		empDiagramEClass = createEClass(EMP_DIAGRAM);
		createEReference(empDiagramEClass, EMP_DIAGRAM__EMO_DIAGRAMS);
		createEReference(empDiagramEClass, EMP_DIAGRAM__EMR_DIAGRAMS);
		createEReference(empDiagramEClass, EMP_DIAGRAM__EMC_DIAGRAM);
		createEReference(empDiagramEClass, EMP_DIAGRAM__EMI_DIAGRAM);
		createEAttribute(empDiagramEClass, EMP_DIAGRAM__STARTED_TIME);
		createEReference(empDiagramEClass, EMP_DIAGRAM__DURATION_TIME);
		createEAttribute(empDiagramEClass, EMP_DIAGRAM__TIME_UNIT);
		createEReference(empDiagramEClass, EMP_DIAGRAM__IN_ORS);
		createEReference(empDiagramEClass, EMP_DIAGRAM__PRODUCT_PACKAGES);
		createEReference(empDiagramEClass, EMP_DIAGRAM__OUT_ANDS);
		createEReference(empDiagramEClass, EMP_DIAGRAM__DATA_FLOWS);
		createEReference(empDiagramEClass, EMP_DIAGRAM__CLOCK_FLOWS);
		createEReference(empDiagramEClass, EMP_DIAGRAM__CLOCKS);
		createEReference(empDiagramEClass, EMP_DIAGRAM__IN_ANDS);
		createEReference(empDiagramEClass, EMP_DIAGRAM__NORMAL_ACTIVITIES);
		createEReference(empDiagramEClass, EMP_DIAGRAM__COMP_ACTIVITIES);
		createEReference(empDiagramEClass, EMP_DIAGRAM__OUT_ORS);
		createEReference(empDiagramEClass, EMP_DIAGRAM__ASS_FLOWS);
		createEReference(empDiagramEClass, EMP_DIAGRAM__REF_FLOWS);
		createEReference(empDiagramEClass, EMP_DIAGRAM__OTHERS);
		createEReference(empDiagramEClass, EMP_DIAGRAM__ARTIFACTS);
		createEReference(empDiagramEClass, EMP_DIAGRAM__FORMS);
		createEReference(empDiagramEClass, EMP_DIAGRAM__DOCUMENTS);
		createEReference(empDiagramEClass, EMP_DIAGRAM__AUTO_ACTIVITIES);
		createEReference(empDiagramEClass, EMP_DIAGRAM__MESSAGES);
		createEReference(empDiagramEClass, EMP_DIAGRAM__MANUAL_BATCH_ACTIVITIES);
		createEReference(empDiagramEClass, EMP_DIAGRAM__AUTO_BATCH_ACTIVITIES);
		createEReference(empDiagramEClass, EMP_DIAGRAM__MACHINE_TYPES);
		createEReference(empDiagramEClass, EMP_DIAGRAM__ROLES);
		createEReference(empDiagramEClass, EMP_DIAGRAM__LOCATION_TYPES);
		createEReference(empDiagramEClass, EMP_DIAGRAM__TOOL_TYPES);
		createEReference(empDiagramEClass, EMP_DIAGRAM__RESOURCE_GROUP_TYPES);
		createEReference(empDiagramEClass, EMP_DIAGRAM__MILE_STONES);

		empMileStoneEClass = createEClass(EMP_MILE_STONE);
		createEAttribute(empMileStoneEClass, EMP_MILE_STONE__PROCESS);
		createEReference(empMileStoneEClass, EMP_MILE_STONE__DATA_FLOWS);
		createEReference(empMileStoneEClass, EMP_MILE_STONE__EMP_DIAGRAM);

		empFormEClass = createEClass(EMP_FORM);
		createEReference(empFormEClass, EMP_FORM__EMP_DIAGRAM);
		createEReference(empFormEClass, EMP_FORM__FORM_TYPE);
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
		UtilpackagePackage theUtilpackagePackage = (UtilpackagePackage)EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI);
		VpmlPackage theVpmlPackage = (VpmlPackage)EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI);
		OrganizationpackagePackage theOrganizationpackagePackage = (OrganizationpackagePackage)EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI);
		ResourcepackagePackage theResourcepackagePackage = (ResourcepackagePackage)EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI);
		CollaborationpackagePackage theCollaborationpackagePackage = (CollaborationpackagePackage)EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI);
		InfopackagePackage theInfopackagePackage = (InfopackagePackage)EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI);
		InformationpackagePackage theInformationpackagePackage = (InformationpackagePackage)EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI);

		// Add supertypes to classes
		empNormalActivityEClass.getESuperTypes().add(this.getEMPLeafActivity());
		empBatchActivityEClass.getESuperTypes().add(this.getEMPLeafActivity());
		empActivityEClass.getESuperTypes().add(this.getEMPObject());
		empObjectEClass.getESuperTypes().add(theVpmlPackage.getEMObject());
		empFlowEClass.getESuperTypes().add(this.getEMPObject());
		empDataFlowEClass.getESuperTypes().add(this.getEMPFlow());
		empAssFlowEClass.getESuperTypes().add(this.getEMPFlow());
		empClockFlowEClass.getESuperTypes().add(this.getEMPFlow());
		empLogicalConnectorEClass.getESuperTypes().add(this.getEMPObject());
		empInAndEClass.getESuperTypes().add(this.getEMPInConnector());
		empOutAndEClass.getESuperTypes().add(this.getEMPOutConnector());
		empInOrEClass.getESuperTypes().add(this.getEMPInConnector());
		empOutOrEClass.getESuperTypes().add(this.getEMPOutConnector());
		empClockEClass.getESuperTypes().add(this.getEMPObject());
		empCompActivityEClass.getESuperTypes().add(this.getEMPActivity());
		empInConnectorEClass.getESuperTypes().add(this.getEMPLogicalConnector());
		empOutConnectorEClass.getESuperTypes().add(this.getEMPLogicalConnector());
		empLeafActivityEClass.getESuperTypes().add(this.getEMPActivity());
		empProductEClass.getESuperTypes().add(this.getEMPObject());
		empProductPackageEClass.getESuperTypes().add(this.getEMPProduct());
		empLeafProductEClass.getESuperTypes().add(this.getEMPProduct());
		empRefFlowEClass.getESuperTypes().add(this.getEMPFlow());
		empDocumentEClass.getESuperTypes().add(this.getEMPLeafProduct());
		empArtifactEClass.getESuperTypes().add(this.getEMPLeafProduct());
		empOtherEClass.getESuperTypes().add(this.getEMPLeafProduct());
		empAttributeItemEClass.getESuperTypes().add(this.getEMPObject());
		empAutoActivityEClass.getESuperTypes().add(this.getEMPLeafActivity());
		empManualBatchActivityEClass.getESuperTypes().add(this.getEMPBatchActivity());
		empAutoBatchActivityEClass.getESuperTypes().add(this.getEMPBatchActivity());
		empMessageEClass.getESuperTypes().add(this.getEMPLeafProduct());
		empDiagramEClass.getESuperTypes().add(theVpmlPackage.getEMDiagram());
		empMileStoneEClass.getESuperTypes().add(this.getEMPObject());
		empFormEClass.getESuperTypes().add(this.getEMPLeafProduct());

		// Initialize classes and features; add operations and parameters
		initEClass(empNormalActivityEClass, EMPNormalActivity.class, "EMPNormalActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPNormalActivity_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_NormalActivities(), "empDiagram", null, 1, 1, EMPNormalActivity.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPNormalActivity_AssFlows(), this.getEMPAssFlow(), this.getEMPAssFlow_NormalActivity(), "assFlows", null, 0, -1, EMPNormalActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empBatchActivityEClass, EMPBatchActivity.class, "EMPBatchActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMPBatchActivity_BatchType(), theUtilpackagePackage.getEnumBatchType(), "batchType", "TIME_ONLY", 0, 1, EMPBatchActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPBatchActivity_BatStartTime(), ecorePackage.getEDoubleObject(), "batStartTime", "0", 0, 1, EMPBatchActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPBatchActivity_BatEndTime(), ecorePackage.getEDoubleObject(), "batEndTime", "0", 0, 1, EMPBatchActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPBatchActivity_RestartPeriod(), ecorePackage.getEDoubleObject(), "restartPeriod", "0", 0, 1, EMPBatchActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPBatchActivity_BatTimeUnit(), theUtilpackagePackage.getEnumTimeUnit(), "batTimeUnit", "HOUR", 0, 1, EMPBatchActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPBatchActivity_TimerQueueFlag(), ecorePackage.getEBooleanObject(), "timerQueueFlag", "false", 0, 1, EMPBatchActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPBatchActivity_EmergencyFlag(), ecorePackage.getEBooleanObject(), "emergencyFlag", "false", 0, 1, EMPBatchActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPBatchActivity_IntervalValue(), ecorePackage.getEDoubleObject(), "intervalValue", "1", 0, 1, EMPBatchActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPBatchActivity_IntervalTimeUnit(), theUtilpackagePackage.getEnumTimeUnit(), "intervalTimeUnit", "HOUR", 0, 1, EMPBatchActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPBatchActivity_MaxQuantity(), ecorePackage.getEIntegerObject(), "maxQuantity", "10", 0, 1, EMPBatchActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPBatchActivity_MinQuantity(), ecorePackage.getEIntegerObject(), "minQuantity", "1", 0, 1, EMPBatchActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empActivityEClass, EMPActivity.class, "EMPActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMPActivity_Procedure(), ecorePackage.getEString(), "procedure", null, 0, 1, EMPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPActivity_Creater(), ecorePackage.getEString(), "creater", null, 0, 1, EMPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPActivity_CreatedDate(), theUtilpackagePackage.getJavaDate(), "createdDate", null, 0, 1, EMPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPActivity_LastModifier(), ecorePackage.getEString(), "lastModifier", null, 0, 1, EMPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPActivity_LastModifiedDate(), theUtilpackagePackage.getJavaDate(), "lastModifiedDate", null, 0, 1, EMPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPActivity_ClockFlow(), this.getEMPClockFlow(), this.getEMPClockFlow_Activity(), "clockFlow", null, 0, 1, EMPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPActivity_TargetDataFlows(), this.getEMPDataFlow(), this.getEMPDataFlow_TargetActivity(), "targetDataFlows", null, 0, -1, EMPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPActivity_SourceDataFlows(), this.getEMPDataFlow(), this.getEMPDataFlow_SourceActivity(), "sourceDataFlows", null, 0, -1, EMPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPActivity_RefFlows(), this.getEMPRefFlow(), this.getEMPRefFlow_Activity(), "refFlows", null, 0, -1, EMPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empObjectEClass, EMPObject.class, "EMPObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPObject_ComActivity(), this.getEMPCompActivity(), this.getEMPCompActivity_LeafObjects(), "comActivity", null, 0, 1, EMPObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empFlowEClass, EMPFlow.class, "EMPFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(empDataFlowEClass, EMPDataFlow.class, "EMPDataFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMPDataFlow_Probability(), ecorePackage.getEDoubleObject(), "probability", "1", 0, 1, EMPDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDataFlow_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_DataFlows(), "empDiagram", null, 1, 1, EMPDataFlow.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDataFlow_TargetProduct(), this.getEMPProduct(), this.getEMPProduct_TargetDataFlows(), "targetProduct", null, 0, 1, EMPDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDataFlow_TargetActivity(), this.getEMPActivity(), this.getEMPActivity_TargetDataFlows(), "targetActivity", null, 0, 1, EMPDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDataFlow_SourceProduct(), this.getEMPProduct(), this.getEMPProduct_SourceDataFlows(), "sourceProduct", null, 0, 1, EMPDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDataFlow_SourceActivity(), this.getEMPActivity(), this.getEMPActivity_SourceDataFlows(), "sourceActivity", null, 0, 1, EMPDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDataFlow_SourceInAnd(), this.getEMPInAnd(), this.getEMPInAnd_SourceFlows(), "sourceInAnd", null, 0, 1, EMPDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDataFlow_TargetInAnd(), this.getEMPInAnd(), this.getEMPInAnd_TargetFlows(), "targetInAnd", null, 0, 1, EMPDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDataFlow_TargetInOr(), this.getEMPInOr(), this.getEMPInOr_TargetFlows(), "targetInOr", null, 0, 1, EMPDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDataFlow_SourceInOr(), this.getEMPInOr(), this.getEMPInOr_SourceFlows(), "sourceInOr", null, 0, 1, EMPDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDataFlow_SourceOutAnd(), this.getEMPOutAnd(), this.getEMPOutAnd_SourceFlows(), "sourceOutAnd", null, 0, 1, EMPDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDataFlow_TargetOutAnd(), this.getEMPOutAnd(), this.getEMPOutAnd_TargetFlows(), "targetOutAnd", null, 0, 1, EMPDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDataFlow_SourceOutOr(), this.getEMPOutOr(), this.getEMPOutOr_SourceFlows(), "sourceOutOr", null, 0, 1, EMPDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDataFlow_TargetOutOr(), this.getEMPOutOr(), this.getEMPOutOr_TargetFlows(), "targetOutOr", null, 0, 1, EMPDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDataFlow_MileStone(), this.getEMPMileStone(), this.getEMPMileStone_DataFlows(), "mileStone", null, 0, 1, EMPDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empAssFlowEClass, EMPAssFlow.class, "EMPAssFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPAssFlow_ResourceGroupType(), theOrganizationpackagePackage.getEMOResourceGroupType(), theOrganizationpackagePackage.getEMOResourceGroupType_AssFlows(), "resourceGroupType", null, 0, 1, EMPAssFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPAssFlow_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_AssFlows(), "empDiagram", null, 1, 1, EMPAssFlow.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPAssFlow_Product(), this.getEMPProduct(), this.getEMPProduct_AssFlows(), "product", null, 0, 1, EMPAssFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPAssFlow_LocationType(), theResourcepackagePackage.getEMRLocationType(), theResourcepackagePackage.getEMRLocationType_AssFlows(), "locationType", null, 0, 1, EMPAssFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPAssFlow_MachineType(), theResourcepackagePackage.getEMRMachineType(), theResourcepackagePackage.getEMRMachineType_AssFlows(), "machineType", null, 0, 1, EMPAssFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPAssFlow_Role(), theResourcepackagePackage.getEMRRole(), theResourcepackagePackage.getEMRRole_AssFlows(), "role", null, 0, 1, EMPAssFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPAssFlow_ToolType(), theResourcepackagePackage.getEMRToolType(), theResourcepackagePackage.getEMRToolType_AssFlows(), "toolType", null, 0, 1, EMPAssFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPAssFlow_AutoActivity(), this.getEMPAutoActivity(), this.getEMPAutoActivity_AssFlows(), "autoActivity", null, 0, 1, EMPAssFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPAssFlow_NormalActivity(), this.getEMPNormalActivity(), this.getEMPNormalActivity_AssFlows(), "normalActivity", null, 0, 1, EMPAssFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPAssFlow_CompActivity(), this.getEMPCompActivity(), this.getEMPCompActivity_AssFlows(), "compActivity", null, 0, 1, EMPAssFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPAssFlow_ManualBatchActivity(), this.getEMPManualBatchActivity(), this.getEMPManualBatchActivity_AssFlows(), "manualBatchActivity", null, 0, 1, EMPAssFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPAssFlow_AutoBatchActiviy(), this.getEMPAutoBatchActivity(), this.getEMPAutoBatchActivity_AssFlows(), "autoBatchActiviy", null, 0, 1, EMPAssFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empClockFlowEClass, EMPClockFlow.class, "EMPClockFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPClockFlow_Activity(), this.getEMPActivity(), this.getEMPActivity_ClockFlow(), "activity", null, 1, 1, EMPClockFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPClockFlow_Clock(), this.getEMPClock(), this.getEMPClock_ClockFlows(), "clock", null, 1, 1, EMPClockFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPClockFlow_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_ClockFlows(), "empDiagram", null, 1, 1, EMPClockFlow.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empLogicalConnectorEClass, EMPLogicalConnector.class, "EMPLogicalConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(empInAndEClass, EMPInAnd.class, "EMPInAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPInAnd_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_InAnds(), "empDiagram", null, 1, 1, EMPInAnd.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPInAnd_SourceFlows(), this.getEMPDataFlow(), this.getEMPDataFlow_SourceInAnd(), "sourceFlows", null, 0, -1, EMPInAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPInAnd_TargetFlows(), this.getEMPDataFlow(), this.getEMPDataFlow_TargetInAnd(), "targetFlows", null, 0, -1, EMPInAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empOutAndEClass, EMPOutAnd.class, "EMPOutAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPOutAnd_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_OutAnds(), "empDiagram", null, 1, 1, EMPOutAnd.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPOutAnd_SourceFlows(), this.getEMPDataFlow(), this.getEMPDataFlow_SourceOutAnd(), "sourceFlows", null, 0, -1, EMPOutAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPOutAnd_TargetFlows(), this.getEMPDataFlow(), this.getEMPDataFlow_TargetOutAnd(), "targetFlows", null, 0, -1, EMPOutAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empInOrEClass, EMPInOr.class, "EMPInOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPInOr_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_InOrs(), "empDiagram", null, 1, 1, EMPInOr.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPInOr_TargetFlows(), this.getEMPDataFlow(), this.getEMPDataFlow_TargetInOr(), "targetFlows", null, 0, -1, EMPInOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPInOr_SourceFlows(), this.getEMPDataFlow(), this.getEMPDataFlow_SourceInOr(), "sourceFlows", null, 0, -1, EMPInOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empOutOrEClass, EMPOutOr.class, "EMPOutOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPOutOr_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_OutOrs(), "empDiagram", null, 1, 1, EMPOutOr.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPOutOr_SourceFlows(), this.getEMPDataFlow(), this.getEMPDataFlow_SourceOutOr(), "sourceFlows", null, 0, -1, EMPOutOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPOutOr_TargetFlows(), this.getEMPDataFlow(), this.getEMPDataFlow_TargetOutOr(), "targetFlows", null, 0, -1, EMPOutOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empClockEClass, EMPClock.class, "EMPClock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMPClock_StartTime(), ecorePackage.getEDouble(), "startTime", "0", 0, 1, EMPClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPClock_EndTime(), ecorePackage.getEDouble(), "endTime", "0", 0, 1, EMPClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPClock_RestartPeriod(), ecorePackage.getEInt(), "restartPeriod", "0", 0, 1, EMPClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPClock_TimeUnit(), theUtilpackagePackage.getEnumTimeUnit(), "timeUnit", "HOUR", 0, 1, EMPClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPClock_TqFlag(), ecorePackage.getEBooleanObject(), "tqFlag", null, 0, 1, EMPClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPClock_EFlag(), ecorePackage.getEBooleanObject(), "eFlag", null, 0, 1, EMPClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPClock_IntervalValue(), ecorePackage.getEDouble(), "intervalValue", "1", 0, 1, EMPClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPClock_IntervalUnit(), theUtilpackagePackage.getEnumTimeUnit(), "intervalUnit", "HOUR", 0, 1, EMPClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPClock_ClockFlows(), this.getEMPClockFlow(), this.getEMPClockFlow_Clock(), "clockFlows", null, 0, -1, EMPClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPClock_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_Clocks(), "empDiagram", null, 1, 1, EMPClock.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empCompActivityEClass, EMPCompActivity.class, "EMPCompActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPCompActivity_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_CompActivities(), "empDiagram", null, 1, 1, EMPCompActivity.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPCompActivity_LeafObjects(), this.getEMPObject(), this.getEMPObject_ComActivity(), "leafObjects", null, 0, -1, EMPCompActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPCompActivity_AssFlows(), this.getEMPAssFlow(), this.getEMPAssFlow_CompActivity(), "assFlows", null, 0, -1, EMPCompActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empInConnectorEClass, EMPInConnector.class, "EMPInConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(empOutConnectorEClass, EMPOutConnector.class, "EMPOutConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(empLeafActivityEClass, EMPLeafActivity.class, "EMPLeafActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMPLeafActivity_IsDefault(), ecorePackage.getEBooleanObject(), "isDefault", "true", 0, 1, EMPLeafActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPLeafActivity_StartTime(), theUtilpackagePackage.getJavaDate(), "startTime", null, 0, 1, EMPLeafActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPLeafActivity_DurationTime(), theUtilpackagePackage.getDSDistribution(), null, "durationTime", null, 0, 1, EMPLeafActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPLeafActivity_TimeUnit(), theUtilpackagePackage.getEnumTimeUnit(), "timeUnit", "HOUR", 0, 1, EMPLeafActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPLeafActivity_Priority(), ecorePackage.getEInt(), "priority", "50", 0, 1, EMPLeafActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empProductEClass, EMPProduct.class, "EMPProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPProduct_TargetDataFlows(), this.getEMPDataFlow(), this.getEMPDataFlow_TargetProduct(), "targetDataFlows", null, 0, -1, EMPProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPProduct_SourceDataFlows(), this.getEMPDataFlow(), this.getEMPDataFlow_SourceProduct(), "sourceDataFlows", null, 0, -1, EMPProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPProduct_RefFlows(), this.getEMPRefFlow(), this.getEMPRefFlow_Product(), "refFlows", null, 0, -1, EMPProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPProduct_AssFlows(), this.getEMPAssFlow(), this.getEMPAssFlow_Product(), "assFlows", null, 0, -1, EMPProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empProductPackageEClass, EMPProductPackage.class, "EMPProductPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPProductPackage_SubPackages(), this.getEMPProductPackage(), this.getEMPProductPackage_TopPackage(), "subPackages", null, 0, -1, EMPProductPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPProductPackage_TopPackage(), this.getEMPProductPackage(), this.getEMPProductPackage_SubPackages(), "topPackage", null, 0, 1, EMPProductPackage.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPProductPackage_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_ProductPackages(), "empDiagram", null, 1, 1, EMPProductPackage.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPProductPackage_LeafProducts(), this.getEMPLeafProduct(), this.getEMPLeafProduct_TopProductPackage(), "leafProducts", null, 0, -1, EMPProductPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empLeafProductEClass, EMPLeafProduct.class, "EMPLeafProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMPLeafProduct_Attachment(), ecorePackage.getEString(), "attachment", null, 0, 1, EMPLeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPLeafProduct_IoType(), theUtilpackagePackage.getEnumIOType(), "ioType", "NON_SOURCE", 0, 1, EMPLeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPLeafProduct_Period(), ecorePackage.getEIntegerObject(), "period", "0", 0, 1, EMPLeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPLeafProduct_DurationTime(), theUtilpackagePackage.getDSDistribution(), null, "durationTime", null, 0, 1, EMPLeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPLeafProduct_TimeUnit(), theUtilpackagePackage.getEnumTimeUnit(), "timeUnit", "HOUR", 0, 1, EMPLeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPLeafProduct_InitQueue(), ecorePackage.getEIntegerObject(), "initQueue", "0", 0, 1, EMPLeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPLeafProduct_Cost(), ecorePackage.getEDoubleObject(), "cost", "0.0", 0, 1, EMPLeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPLeafProduct_TopProductPackage(), this.getEMPProductPackage(), this.getEMPProductPackage_LeafProducts(), "topProductPackage", null, 0, 1, EMPLeafProduct.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empRefFlowEClass, EMPRefFlow.class, "EMPRefFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPRefFlow_Activity(), this.getEMPActivity(), this.getEMPActivity_RefFlows(), "activity", null, 1, 1, EMPRefFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPRefFlow_Product(), this.getEMPProduct(), this.getEMPProduct_RefFlows(), "product", null, 1, 1, EMPRefFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPRefFlow_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_RefFlows(), "empDiagram", null, 1, 1, EMPRefFlow.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empDocumentEClass, EMPDocument.class, "EMPDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPDocument_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_Documents(), "empDiagram", null, 1, 1, EMPDocument.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empArtifactEClass, EMPArtifact.class, "EMPArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPArtifact_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_Artifacts(), "empDiagram", null, 1, 1, EMPArtifact.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empOtherEClass, EMPOther.class, "EMPOther", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPOther_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_Others(), "empDiagram", null, 1, 1, EMPOther.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empAttributeItemEClass, EMPAttributeItem.class, "EMPAttributeItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMPAttributeItem_Type(), ecorePackage.getEString(), "type", null, 0, 1, EMPAttributeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPAttributeItem__depend(), ecorePackage.getEString(), "_depend", null, 0, 1, EMPAttributeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empAutoActivityEClass, EMPAutoActivity.class, "EMPAutoActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPAutoActivity_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_AutoActivities(), "empDiagram", null, 1, 1, EMPAutoActivity.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPAutoActivity_AssFlows(), this.getEMPAssFlow(), this.getEMPAssFlow_AutoActivity(), "assFlows", null, 0, -1, EMPAutoActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empManualBatchActivityEClass, EMPManualBatchActivity.class, "EMPManualBatchActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPManualBatchActivity_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_ManualBatchActivities(), "empDiagram", null, 1, 1, EMPManualBatchActivity.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPManualBatchActivity_AssFlows(), this.getEMPAssFlow(), this.getEMPAssFlow_ManualBatchActivity(), "assFlows", null, 0, -1, EMPManualBatchActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empAutoBatchActivityEClass, EMPAutoBatchActivity.class, "EMPAutoBatchActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPAutoBatchActivity_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_AutoBatchActivities(), "empDiagram", null, 1, 1, EMPAutoBatchActivity.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPAutoBatchActivity_AssFlows(), this.getEMPAssFlow(), this.getEMPAssFlow_AutoBatchActiviy(), "assFlows", null, 0, -1, EMPAutoBatchActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empMessageEClass, EMPMessage.class, "EMPMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPMessage_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_Messages(), "empDiagram", null, 1, 1, EMPMessage.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empDiagramEClass, EMPDiagram.class, "EMPDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPDiagram_EmoDiagrams(), theOrganizationpackagePackage.getEMODiagram(), theOrganizationpackagePackage.getEMODiagram_EmpDiagrams(), "emoDiagrams", null, 1, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_EmrDiagrams(), theResourcepackagePackage.getEMRDiagram(), theResourcepackagePackage.getEMRDiagram_EmpDiagrams(), "emrDiagrams", null, 1, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_EmcDiagram(), theCollaborationpackagePackage.getEMCDiagram(), theCollaborationpackagePackage.getEMCDiagram_EmpDiagram(), "emcDiagram", null, 0, 1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_EmiDiagram(), theInfopackagePackage.getEMIDiagram(), theInfopackagePackage.getEMIDiagram_EmiDiagram(), "emiDiagram", null, 0, 1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPDiagram_StartedTime(), theUtilpackagePackage.getJavaDate(), "startedTime", null, 0, 1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_DurationTime(), theUtilpackagePackage.getDSDistribution(), null, "durationTime", null, 0, 1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMPDiagram_TimeUnit(), theUtilpackagePackage.getEnumTimeUnit(), "timeUnit", "2", 0, 1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_InOrs(), this.getEMPInOr(), this.getEMPInOr_EmpDiagram(), "inOrs", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_ProductPackages(), this.getEMPProductPackage(), this.getEMPProductPackage_EmpDiagram(), "productPackages", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_OutAnds(), this.getEMPOutAnd(), this.getEMPOutAnd_EmpDiagram(), "outAnds", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_DataFlows(), this.getEMPDataFlow(), this.getEMPDataFlow_EmpDiagram(), "dataFlows", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_ClockFlows(), this.getEMPClockFlow(), this.getEMPClockFlow_EmpDiagram(), "clockFlows", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_Clocks(), this.getEMPClock(), this.getEMPClock_EmpDiagram(), "clocks", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_InAnds(), this.getEMPInAnd(), this.getEMPInAnd_EmpDiagram(), "inAnds", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_NormalActivities(), this.getEMPNormalActivity(), this.getEMPNormalActivity_EmpDiagram(), "normalActivities", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_CompActivities(), this.getEMPCompActivity(), this.getEMPCompActivity_EmpDiagram(), "compActivities", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_OutOrs(), this.getEMPOutOr(), this.getEMPOutOr_EmpDiagram(), "outOrs", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_AssFlows(), this.getEMPAssFlow(), this.getEMPAssFlow_EmpDiagram(), "assFlows", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_RefFlows(), this.getEMPRefFlow(), this.getEMPRefFlow_EmpDiagram(), "refFlows", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_Others(), this.getEMPOther(), this.getEMPOther_EmpDiagram(), "others", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_Artifacts(), this.getEMPArtifact(), this.getEMPArtifact_EmpDiagram(), "artifacts", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_Forms(), this.getEMPForm(), this.getEMPForm_EmpDiagram(), "forms", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_Documents(), this.getEMPDocument(), this.getEMPDocument_EmpDiagram(), "documents", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_AutoActivities(), this.getEMPAutoActivity(), this.getEMPAutoActivity_EmpDiagram(), "autoActivities", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_Messages(), this.getEMPMessage(), this.getEMPMessage_EmpDiagram(), "messages", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_ManualBatchActivities(), this.getEMPManualBatchActivity(), this.getEMPManualBatchActivity_EmpDiagram(), "manualBatchActivities", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_AutoBatchActivities(), this.getEMPAutoBatchActivity(), this.getEMPAutoBatchActivity_EmpDiagram(), "autoBatchActivities", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_MachineTypes(), theResourcepackagePackage.getEMRMachineType(), theResourcepackagePackage.getEMRMachineType_EmpDiagram(), "machineTypes", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_Roles(), theResourcepackagePackage.getEMRRole(), theResourcepackagePackage.getEMRRole_EmpDiagram(), "roles", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_LocationTypes(), theResourcepackagePackage.getEMRLocationType(), theResourcepackagePackage.getEMRLocationType_EmpDiagram(), "locationTypes", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_ToolTypes(), theResourcepackagePackage.getEMRToolType(), theResourcepackagePackage.getEMRToolType_EmpDiagram(), "toolTypes", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_ResourceGroupTypes(), theOrganizationpackagePackage.getEMOResourceGroupType(), theOrganizationpackagePackage.getEMOResourceGroupType_EmpDiagram(), "resourceGroupTypes", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPDiagram_MileStones(), this.getEMPMileStone(), this.getEMPMileStone_EmpDiagram(), "mileStones", null, 0, -1, EMPDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empMileStoneEClass, EMPMileStone.class, "EMPMileStone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMPMileStone_Process(), ecorePackage.getEString(), "process", null, 0, 1, EMPMileStone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPMileStone_DataFlows(), this.getEMPDataFlow(), this.getEMPDataFlow_MileStone(), "dataFlows", null, 0, -1, EMPMileStone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPMileStone_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_MileStones(), "empDiagram", null, 1, 1, EMPMileStone.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empFormEClass, EMPForm.class, "EMPForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMPForm_EmpDiagram(), this.getEMPDiagram(), this.getEMPDiagram_Forms(), "empDiagram", null, 1, 1, EMPForm.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMPForm_FormType(), theInformationpackagePackage.getEMIComplexItem(), null, "formType", null, 1, 1, EMPForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ProcesspackagePackageImpl
