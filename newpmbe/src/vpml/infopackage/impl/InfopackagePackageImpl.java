/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import vpml.VpmlPackage;

import vpml.collaborationpackage.CollaborationpackagePackage;

import vpml.collaborationpackage.impl.CollaborationpackagePackageImpl;

import vpml.impl.VpmlPackageImpl;

import vpml.infopackage.EMIArtifact;
import vpml.infopackage.EMIComInfo;
import vpml.infopackage.EMIDataFlow;
import vpml.infopackage.EMIDiagram;
import vpml.infopackage.EMIDocument;
import vpml.infopackage.EMIFlow;
import vpml.infopackage.EMIInAnd;
import vpml.infopackage.EMIInConnector;
import vpml.infopackage.EMIInOr;
import vpml.infopackage.EMILeafProduct;
import vpml.infopackage.EMILogicalConnector;
import vpml.infopackage.EMIMessage;
import vpml.infopackage.EMINode;
import vpml.infopackage.EMIObject;
import vpml.infopackage.EMIOther;
import vpml.infopackage.EMIOutAnd;
import vpml.infopackage.EMIOutConnector;
import vpml.infopackage.EMIOutOr;
import vpml.infopackage.EMIProduct;
import vpml.infopackage.EMIProductPackage;
import vpml.infopackage.EMIRefFlow;
import vpml.infopackage.EMIStateConnector;
import vpml.infopackage.InfopackageFactory;
import vpml.infopackage.InfopackagePackage;

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
public class InfopackagePackageImpl extends EPackageImpl implements InfopackagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiLeafProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiOtherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiProductPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiLogicalConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiComInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiRefFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiDataFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiInConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiOutConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiStateConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiInOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiInAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiOutAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiOutOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emiMessageEClass = null;

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
	 * @see vpml.infopackage.InfopackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfopackagePackageImpl() {
		super(eNS_URI, InfopackageFactory.eINSTANCE);
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
	public static InfopackagePackage init() {
		if (isInited) return (InfopackagePackage)EPackage.Registry.INSTANCE.getEPackage(InfopackagePackage.eNS_URI);

		// Obtain or create and register package
		InfopackagePackageImpl theInfopackagePackage = (InfopackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof InfopackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new InfopackagePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VpmlPackageImpl theVpmlPackage = (VpmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI) instanceof VpmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VpmlPackage.eNS_URI) : VpmlPackage.eINSTANCE);
		OrganizationpackagePackageImpl theOrganizationpackagePackage = (OrganizationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI) instanceof OrganizationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganizationpackagePackage.eNS_URI) : OrganizationpackagePackage.eINSTANCE);
		ResourcepackagePackageImpl theResourcepackagePackage = (ResourcepackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI) instanceof ResourcepackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcepackagePackage.eNS_URI) : ResourcepackagePackage.eINSTANCE);
		ProcesspackagePackageImpl theProcesspackagePackage = (ProcesspackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI) instanceof ProcesspackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcesspackagePackage.eNS_URI) : ProcesspackagePackage.eINSTANCE);
		UtilpackagePackageImpl theUtilpackagePackage = (UtilpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI) instanceof UtilpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilpackagePackage.eNS_URI) : UtilpackagePackage.eINSTANCE);
		InformationpackagePackageImpl theInformationpackagePackage = (InformationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI) instanceof InformationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationpackagePackage.eNS_URI) : InformationpackagePackage.eINSTANCE);
		CollaborationpackagePackageImpl theCollaborationpackagePackage = (CollaborationpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI) instanceof CollaborationpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollaborationpackagePackage.eNS_URI) : CollaborationpackagePackage.eINSTANCE);

		// Create package meta-data objects
		theInfopackagePackage.createPackageContents();
		theVpmlPackage.createPackageContents();
		theOrganizationpackagePackage.createPackageContents();
		theResourcepackagePackage.createPackageContents();
		theProcesspackagePackage.createPackageContents();
		theUtilpackagePackage.createPackageContents();
		theInformationpackagePackage.createPackageContents();
		theCollaborationpackagePackage.createPackageContents();

		// Initialize created meta-data
		theInfopackagePackage.initializePackageContents();
		theVpmlPackage.initializePackageContents();
		theOrganizationpackagePackage.initializePackageContents();
		theResourcepackagePackage.initializePackageContents();
		theProcesspackagePackage.initializePackageContents();
		theUtilpackagePackage.initializePackageContents();
		theInformationpackagePackage.initializePackageContents();
		theCollaborationpackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInfopackagePackage.freeze();

		return theInfopackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMILeafProduct() {
		return emiLeafProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMILeafProduct_ProductID() {
		return (EAttribute)emiLeafProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMILeafProduct_Attachment() {
		return (EAttribute)emiLeafProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMILeafProduct_Iotype() {
		return (EAttribute)emiLeafProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMILeafProduct_Interval() {
		return (EAttribute)emiLeafProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMILeafProduct_Unit() {
		return (EAttribute)emiLeafProductEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMILeafProduct_InitList() {
		return (EAttribute)emiLeafProductEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMILeafProduct_Cost() {
		return (EAttribute)emiLeafProductEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMILeafProduct_DurationTime() {
		return (EReference)emiLeafProductEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMILeafProduct_Database() {
		return (EAttribute)emiLeafProductEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMILeafProduct_DbTable() {
		return (EAttribute)emiLeafProductEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMILeafProduct_DbTableItem() {
		return (EAttribute)emiLeafProductEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIDocument() {
		return emiDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIDocument_DocumentDiagram() {
		return (EReference)emiDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIArtifact() {
		return emiArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIArtifact_ArtifactDiagram() {
		return (EReference)emiArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIOther() {
		return emiOtherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIOther_OtherDiagram() {
		return (EReference)emiOtherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIProductPackage() {
		return emiProductPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMIProductPackage_ProductList() {
		return (EAttribute)emiProductPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIProductPackage_SubPackages() {
		return (EReference)emiProductPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIProductPackage_TopPackage() {
		return (EReference)emiProductPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIProductPackage_ProductPackageDiagram() {
		return (EReference)emiProductPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIObject() {
		return emiObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMILogicalConnector() {
		return emiLogicalConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMILogicalConnector_Type() {
		return (EAttribute)emiLogicalConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIComInfo() {
		return emiComInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIComInfo_ComInfoDiagram() {
		return (EReference)emiComInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIProduct() {
		return emiProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMIProduct_Procedure() {
		return (EAttribute)emiProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIFlow() {
		return emiFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMIFlow_Direction() {
		return (EAttribute)emiFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMIFlow_Number() {
		return (EAttribute)emiFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIFlow_SourceNode() {
		return (EReference)emiFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIFlow_TargetNode() {
		return (EReference)emiFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMINode() {
		return emiNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMINode_TargetFlow() {
		return (EReference)emiNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMINode_SourceFlow() {
		return (EReference)emiNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIRefFlow() {
		return emiRefFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIRefFlow_RefFlowDiagram() {
		return (EReference)emiRefFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIDataFlow() {
		return emiDataFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIDataFlow_DataFlowDiagram() {
		return (EReference)emiDataFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIInConnector() {
		return emiInConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIOutConnector() {
		return emiOutConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIStateConnector() {
		return emiStateConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIStateConnector_StateConnectorDiagram() {
		return (EReference)emiStateConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIInOr() {
		return emiInOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIInOr_InorDiagram() {
		return (EReference)emiInOrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIInAnd() {
		return emiInAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIInAnd_InandDiagram() {
		return (EReference)emiInAndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIOutAnd() {
		return emiOutAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIOutAnd_OutandDiagram() {
		return (EReference)emiOutAndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIOutOr() {
		return emiOutOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIOutOr_OutorDiagram() {
		return (EReference)emiOutOrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIDiagram() {
		return emiDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIDiagram_EmiDiagram() {
		return (EReference)emiDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIDiagram_Artifact() {
		return (EReference)emiDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIDiagram_Inand() {
		return (EReference)emiDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIDiagram_Inor() {
		return (EReference)emiDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIDiagram_StateConnector() {
		return (EReference)emiDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIDiagram_Other() {
		return (EReference)emiDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIDiagram_ProductPackage() {
		return (EReference)emiDiagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIDiagram_Outand() {
		return (EReference)emiDiagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIDiagram_Outor() {
		return (EReference)emiDiagramEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIDiagram_RefFlow() {
		return (EReference)emiDiagramEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIDiagram_Document() {
		return (EReference)emiDiagramEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIDiagram_DataFlow() {
		return (EReference)emiDiagramEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIDiagram_ComInfo() {
		return (EReference)emiDiagramEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIDiagram_Message() {
		return (EReference)emiDiagramEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMIMessage() {
		return emiMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMIMessage_MessageDiagram() {
		return (EReference)emiMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfopackageFactory getInfopackageFactory() {
		return (InfopackageFactory)getEFactoryInstance();
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
		emiLeafProductEClass = createEClass(EMI_LEAF_PRODUCT);
		createEAttribute(emiLeafProductEClass, EMI_LEAF_PRODUCT__PRODUCT_ID);
		createEAttribute(emiLeafProductEClass, EMI_LEAF_PRODUCT__ATTACHMENT);
		createEAttribute(emiLeafProductEClass, EMI_LEAF_PRODUCT__IOTYPE);
		createEAttribute(emiLeafProductEClass, EMI_LEAF_PRODUCT__INTERVAL);
		createEAttribute(emiLeafProductEClass, EMI_LEAF_PRODUCT__UNIT);
		createEAttribute(emiLeafProductEClass, EMI_LEAF_PRODUCT__INIT_LIST);
		createEAttribute(emiLeafProductEClass, EMI_LEAF_PRODUCT__COST);
		createEReference(emiLeafProductEClass, EMI_LEAF_PRODUCT__DURATION_TIME);
		createEAttribute(emiLeafProductEClass, EMI_LEAF_PRODUCT__DATABASE);
		createEAttribute(emiLeafProductEClass, EMI_LEAF_PRODUCT__DB_TABLE);
		createEAttribute(emiLeafProductEClass, EMI_LEAF_PRODUCT__DB_TABLE_ITEM);

		emiDocumentEClass = createEClass(EMI_DOCUMENT);
		createEReference(emiDocumentEClass, EMI_DOCUMENT__DOCUMENT_DIAGRAM);

		emiArtifactEClass = createEClass(EMI_ARTIFACT);
		createEReference(emiArtifactEClass, EMI_ARTIFACT__ARTIFACT_DIAGRAM);

		emiMessageEClass = createEClass(EMI_MESSAGE);
		createEReference(emiMessageEClass, EMI_MESSAGE__MESSAGE_DIAGRAM);

		emiOtherEClass = createEClass(EMI_OTHER);
		createEReference(emiOtherEClass, EMI_OTHER__OTHER_DIAGRAM);

		emiProductPackageEClass = createEClass(EMI_PRODUCT_PACKAGE);
		createEAttribute(emiProductPackageEClass, EMI_PRODUCT_PACKAGE__PRODUCT_LIST);
		createEReference(emiProductPackageEClass, EMI_PRODUCT_PACKAGE__SUB_PACKAGES);
		createEReference(emiProductPackageEClass, EMI_PRODUCT_PACKAGE__TOP_PACKAGE);
		createEReference(emiProductPackageEClass, EMI_PRODUCT_PACKAGE__PRODUCT_PACKAGE_DIAGRAM);

		emiObjectEClass = createEClass(EMI_OBJECT);

		emiLogicalConnectorEClass = createEClass(EMI_LOGICAL_CONNECTOR);
		createEAttribute(emiLogicalConnectorEClass, EMI_LOGICAL_CONNECTOR__TYPE);

		emiComInfoEClass = createEClass(EMI_COM_INFO);
		createEReference(emiComInfoEClass, EMI_COM_INFO__COM_INFO_DIAGRAM);

		emiProductEClass = createEClass(EMI_PRODUCT);
		createEAttribute(emiProductEClass, EMI_PRODUCT__PROCEDURE);

		emiFlowEClass = createEClass(EMI_FLOW);
		createEAttribute(emiFlowEClass, EMI_FLOW__DIRECTION);
		createEAttribute(emiFlowEClass, EMI_FLOW__NUMBER);
		createEReference(emiFlowEClass, EMI_FLOW__SOURCE_NODE);
		createEReference(emiFlowEClass, EMI_FLOW__TARGET_NODE);

		emiNodeEClass = createEClass(EMI_NODE);
		createEReference(emiNodeEClass, EMI_NODE__TARGET_FLOW);
		createEReference(emiNodeEClass, EMI_NODE__SOURCE_FLOW);

		emiRefFlowEClass = createEClass(EMI_REF_FLOW);
		createEReference(emiRefFlowEClass, EMI_REF_FLOW__REF_FLOW_DIAGRAM);

		emiDataFlowEClass = createEClass(EMI_DATA_FLOW);
		createEReference(emiDataFlowEClass, EMI_DATA_FLOW__DATA_FLOW_DIAGRAM);

		emiInConnectorEClass = createEClass(EMI_IN_CONNECTOR);

		emiOutConnectorEClass = createEClass(EMI_OUT_CONNECTOR);

		emiStateConnectorEClass = createEClass(EMI_STATE_CONNECTOR);
		createEReference(emiStateConnectorEClass, EMI_STATE_CONNECTOR__STATE_CONNECTOR_DIAGRAM);

		emiInOrEClass = createEClass(EMI_IN_OR);
		createEReference(emiInOrEClass, EMI_IN_OR__INOR_DIAGRAM);

		emiInAndEClass = createEClass(EMI_IN_AND);
		createEReference(emiInAndEClass, EMI_IN_AND__INAND_DIAGRAM);

		emiOutAndEClass = createEClass(EMI_OUT_AND);
		createEReference(emiOutAndEClass, EMI_OUT_AND__OUTAND_DIAGRAM);

		emiOutOrEClass = createEClass(EMI_OUT_OR);
		createEReference(emiOutOrEClass, EMI_OUT_OR__OUTOR_DIAGRAM);

		emiDiagramEClass = createEClass(EMI_DIAGRAM);
		createEReference(emiDiagramEClass, EMI_DIAGRAM__EMI_DIAGRAM);
		createEReference(emiDiagramEClass, EMI_DIAGRAM__ARTIFACT);
		createEReference(emiDiagramEClass, EMI_DIAGRAM__INAND);
		createEReference(emiDiagramEClass, EMI_DIAGRAM__INOR);
		createEReference(emiDiagramEClass, EMI_DIAGRAM__STATE_CONNECTOR);
		createEReference(emiDiagramEClass, EMI_DIAGRAM__OTHER);
		createEReference(emiDiagramEClass, EMI_DIAGRAM__PRODUCT_PACKAGE);
		createEReference(emiDiagramEClass, EMI_DIAGRAM__OUTAND);
		createEReference(emiDiagramEClass, EMI_DIAGRAM__OUTOR);
		createEReference(emiDiagramEClass, EMI_DIAGRAM__REF_FLOW);
		createEReference(emiDiagramEClass, EMI_DIAGRAM__DOCUMENT);
		createEReference(emiDiagramEClass, EMI_DIAGRAM__DATA_FLOW);
		createEReference(emiDiagramEClass, EMI_DIAGRAM__COM_INFO);
		createEReference(emiDiagramEClass, EMI_DIAGRAM__MESSAGE);
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

		// Add supertypes to classes
		emiLeafProductEClass.getESuperTypes().add(this.getEMIProduct());
		emiDocumentEClass.getESuperTypes().add(this.getEMILeafProduct());
		emiArtifactEClass.getESuperTypes().add(this.getEMILeafProduct());
		emiMessageEClass.getESuperTypes().add(this.getEMILeafProduct());
		emiOtherEClass.getESuperTypes().add(this.getEMILeafProduct());
		emiProductPackageEClass.getESuperTypes().add(this.getEMIProduct());
		emiObjectEClass.getESuperTypes().add(theVpmlPackage.getEMObject());
		emiLogicalConnectorEClass.getESuperTypes().add(this.getEMINode());
		emiComInfoEClass.getESuperTypes().add(this.getEMINode());
		emiProductEClass.getESuperTypes().add(this.getEMINode());
		emiFlowEClass.getESuperTypes().add(this.getEMIObject());
		emiNodeEClass.getESuperTypes().add(this.getEMIObject());
		emiRefFlowEClass.getESuperTypes().add(this.getEMIFlow());
		emiDataFlowEClass.getESuperTypes().add(this.getEMIFlow());
		emiInConnectorEClass.getESuperTypes().add(this.getEMILogicalConnector());
		emiOutConnectorEClass.getESuperTypes().add(this.getEMILogicalConnector());
		emiStateConnectorEClass.getESuperTypes().add(this.getEMILogicalConnector());
		emiInOrEClass.getESuperTypes().add(this.getEMIInConnector());
		emiInAndEClass.getESuperTypes().add(this.getEMIInConnector());
		emiOutAndEClass.getESuperTypes().add(this.getEMIOutConnector());
		emiOutOrEClass.getESuperTypes().add(this.getEMIOutConnector());
		emiDiagramEClass.getESuperTypes().add(theVpmlPackage.getEMDiagram());

		// Initialize classes and features; add operations and parameters
		initEClass(emiLeafProductEClass, EMILeafProduct.class, "EMILeafProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMILeafProduct_ProductID(), ecorePackage.getEString(), "productID", null, 0, 1, EMILeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMILeafProduct_Attachment(), ecorePackage.getEString(), "attachment", null, 0, 1, EMILeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMILeafProduct_Iotype(), ecorePackage.getEString(), "iotype", null, 0, 1, EMILeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMILeafProduct_Interval(), ecorePackage.getEIntegerObject(), "interval", null, 0, 1, EMILeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMILeafProduct_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, EMILeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMILeafProduct_InitList(), ecorePackage.getEIntegerObject(), "initList", null, 0, 1, EMILeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMILeafProduct_Cost(), ecorePackage.getEDoubleObject(), "cost", null, 0, 1, EMILeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMILeafProduct_DurationTime(), theUtilpackagePackage.getDSDistribution(), null, "durationTime", null, 0, 1, EMILeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMILeafProduct_Database(), ecorePackage.getEString(), "database", null, 0, 1, EMILeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMILeafProduct_DbTable(), ecorePackage.getEString(), "dbTable", null, 0, 1, EMILeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMILeafProduct_DbTableItem(), ecorePackage.getEString(), "dbTableItem", null, 0, 1, EMILeafProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiDocumentEClass, EMIDocument.class, "EMIDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIDocument_DocumentDiagram(), this.getEMIDiagram(), this.getEMIDiagram_Document(), "documentDiagram", null, 0, 1, EMIDocument.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiArtifactEClass, EMIArtifact.class, "EMIArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIArtifact_ArtifactDiagram(), this.getEMIDiagram(), this.getEMIDiagram_Artifact(), "artifactDiagram", null, 0, 1, EMIArtifact.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiMessageEClass, EMIMessage.class, "EMIMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIMessage_MessageDiagram(), this.getEMIDiagram(), null, "messageDiagram", null, 0, 1, EMIMessage.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiOtherEClass, EMIOther.class, "EMIOther", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIOther_OtherDiagram(), this.getEMIDiagram(), this.getEMIDiagram_Other(), "otherDiagram", null, 0, 1, EMIOther.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiProductPackageEClass, EMIProductPackage.class, "EMIProductPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMIProductPackage_ProductList(), theUtilpackagePackage.getJavaList(), "productList", null, 0, 1, EMIProductPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIProductPackage_SubPackages(), this.getEMIProductPackage(), this.getEMIProductPackage_TopPackage(), "subPackages", null, 0, -1, EMIProductPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIProductPackage_TopPackage(), this.getEMIProductPackage(), this.getEMIProductPackage_SubPackages(), "topPackage", null, 0, 1, EMIProductPackage.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIProductPackage_ProductPackageDiagram(), this.getEMIDiagram(), this.getEMIDiagram_ProductPackage(), "productPackageDiagram", null, 0, 1, EMIProductPackage.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiObjectEClass, EMIObject.class, "EMIObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emiLogicalConnectorEClass, EMILogicalConnector.class, "EMILogicalConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMILogicalConnector_Type(), ecorePackage.getEInt(), "type", null, 0, 1, EMILogicalConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiComInfoEClass, EMIComInfo.class, "EMIComInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIComInfo_ComInfoDiagram(), this.getEMIDiagram(), this.getEMIDiagram_ComInfo(), "comInfoDiagram", null, 0, 1, EMIComInfo.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiProductEClass, EMIProduct.class, "EMIProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMIProduct_Procedure(), ecorePackage.getEString(), "procedure", null, 0, 1, EMIProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiFlowEClass, EMIFlow.class, "EMIFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMIFlow_Direction(), ecorePackage.getEInt(), "direction", "1", 0, 1, EMIFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMIFlow_Number(), ecorePackage.getEInt(), "number", "1", 0, 1, EMIFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIFlow_SourceNode(), this.getEMINode(), this.getEMINode_TargetFlow(), "sourceNode", null, 0, 1, EMIFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIFlow_TargetNode(), this.getEMINode(), this.getEMINode_SourceFlow(), "targetNode", null, 0, 1, EMIFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiNodeEClass, EMINode.class, "EMINode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMINode_TargetFlow(), this.getEMIFlow(), this.getEMIFlow_SourceNode(), "targetFlow", null, 0, -1, EMINode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMINode_SourceFlow(), this.getEMIFlow(), this.getEMIFlow_TargetNode(), "sourceFlow", null, 0, -1, EMINode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiRefFlowEClass, EMIRefFlow.class, "EMIRefFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIRefFlow_RefFlowDiagram(), this.getEMIDiagram(), this.getEMIDiagram_RefFlow(), "refFlowDiagram", null, 0, 1, EMIRefFlow.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiDataFlowEClass, EMIDataFlow.class, "EMIDataFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIDataFlow_DataFlowDiagram(), this.getEMIDiagram(), this.getEMIDiagram_DataFlow(), "dataFlowDiagram", null, 0, 1, EMIDataFlow.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiInConnectorEClass, EMIInConnector.class, "EMIInConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emiOutConnectorEClass, EMIOutConnector.class, "EMIOutConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emiStateConnectorEClass, EMIStateConnector.class, "EMIStateConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIStateConnector_StateConnectorDiagram(), this.getEMIDiagram(), this.getEMIDiagram_StateConnector(), "stateConnectorDiagram", null, 0, 1, EMIStateConnector.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiInOrEClass, EMIInOr.class, "EMIInOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIInOr_InorDiagram(), this.getEMIDiagram(), this.getEMIDiagram_Inor(), "inorDiagram", null, 0, 1, EMIInOr.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiInAndEClass, EMIInAnd.class, "EMIInAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIInAnd_InandDiagram(), this.getEMIDiagram(), this.getEMIDiagram_Inand(), "inandDiagram", null, 0, 1, EMIInAnd.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiOutAndEClass, EMIOutAnd.class, "EMIOutAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIOutAnd_OutandDiagram(), this.getEMIDiagram(), this.getEMIDiagram_Outand(), "outandDiagram", null, 0, 1, EMIOutAnd.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiOutOrEClass, EMIOutOr.class, "EMIOutOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIOutOr_OutorDiagram(), this.getEMIDiagram(), this.getEMIDiagram_Outor(), "outorDiagram", null, 0, 1, EMIOutOr.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emiDiagramEClass, EMIDiagram.class, "EMIDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMIDiagram_EmiDiagram(), this.getEMIDiagram(), this.getEMIDiagram_EmiDiagram(), "emiDiagram", null, 1, 1, EMIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIDiagram_Artifact(), this.getEMIArtifact(), this.getEMIArtifact_ArtifactDiagram(), "artifact", null, 0, -1, EMIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIDiagram_Inand(), this.getEMIInAnd(), this.getEMIInAnd_InandDiagram(), "inand", null, 0, -1, EMIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIDiagram_Inor(), this.getEMIInOr(), this.getEMIInOr_InorDiagram(), "inor", null, 0, -1, EMIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIDiagram_StateConnector(), this.getEMIStateConnector(), this.getEMIStateConnector_StateConnectorDiagram(), "stateConnector", null, 0, -1, EMIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIDiagram_Other(), this.getEMIOther(), this.getEMIOther_OtherDiagram(), "other", null, 0, -1, EMIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIDiagram_ProductPackage(), this.getEMIProductPackage(), this.getEMIProductPackage_ProductPackageDiagram(), "productPackage", null, 0, -1, EMIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIDiagram_Outand(), this.getEMIOutAnd(), this.getEMIOutAnd_OutandDiagram(), "outand", null, 0, -1, EMIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIDiagram_Outor(), this.getEMIOutOr(), this.getEMIOutOr_OutorDiagram(), "outor", null, 0, -1, EMIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIDiagram_RefFlow(), this.getEMIRefFlow(), this.getEMIRefFlow_RefFlowDiagram(), "refFlow", null, 0, -1, EMIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIDiagram_Document(), this.getEMIDocument(), this.getEMIDocument_DocumentDiagram(), "document", null, 0, -1, EMIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIDiagram_DataFlow(), this.getEMIDataFlow(), this.getEMIDataFlow_DataFlowDiagram(), "dataFlow", null, 0, -1, EMIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIDiagram_ComInfo(), this.getEMIComInfo(), this.getEMIComInfo_ComInfoDiagram(), "comInfo", null, 0, -1, EMIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMIDiagram_Message(), this.getEMIMessage(), null, "message", null, 0, -1, EMIDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //InfopackagePackageImpl
