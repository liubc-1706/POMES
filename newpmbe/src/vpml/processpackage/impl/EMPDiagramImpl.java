/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vpml.collaborationpackage.CollaborationpackagePackage;
import vpml.collaborationpackage.EMCDiagram;

import vpml.impl.EMDiagramImpl;

import vpml.infopackage.EMIDiagram;
import vpml.infopackage.InfopackagePackage;

import vpml.organizationpackage.EMODiagram;
import vpml.organizationpackage.EMOResourceGroupType;
import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.processpackage.EMPArtifact;
import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPAutoActivity;
import vpml.processpackage.EMPAutoBatchActivity;
import vpml.processpackage.EMPClock;
import vpml.processpackage.EMPClockFlow;
import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPDocument;
import vpml.processpackage.EMPForm;
import vpml.processpackage.EMPInAnd;
import vpml.processpackage.EMPInOr;
import vpml.processpackage.EMPManualBatchActivity;
import vpml.processpackage.EMPMessage;
import vpml.processpackage.EMPMileStone;
import vpml.processpackage.EMPNormalActivity;
import vpml.processpackage.EMPOther;
import vpml.processpackage.EMPOutAnd;
import vpml.processpackage.EMPOutOr;
import vpml.processpackage.EMPProductPackage;
import vpml.processpackage.EMPRefFlow;
import vpml.processpackage.ProcesspackagePackage;

import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.EMRLocationType;
import vpml.resourcepackage.EMRMachineType;
import vpml.resourcepackage.EMRRole;
import vpml.resourcepackage.EMRToolType;
import vpml.resourcepackage.ResourcepackagePackage;

import vpml.utilpackage.DSDistribution;
import vpml.utilpackage.EnumDistribution;
import vpml.utilpackage.EnumTimeUnit;
import vpml.utilpackage.impl.DSDistributionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMP Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getEmoDiagrams <em>Emo Diagrams</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getEmrDiagrams <em>Emr Diagrams</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getEmcDiagram <em>Emc Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getEmiDiagram <em>Emi Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getStartedTime <em>Started Time</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getDurationTime <em>Duration Time</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getInOrs <em>In Ors</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getProductPackages <em>Product Packages</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getOutAnds <em>Out Ands</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getDataFlows <em>Data Flows</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getClockFlows <em>Clock Flows</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getClocks <em>Clocks</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getInAnds <em>In Ands</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getNormalActivities <em>Normal Activities</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getCompActivities <em>Comp Activities</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getOutOrs <em>Out Ors</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getAssFlows <em>Ass Flows</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getRefFlows <em>Ref Flows</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getOthers <em>Others</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getDocuments <em>Documents</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getAutoActivities <em>Auto Activities</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getManualBatchActivities <em>Manual Batch Activities</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getAutoBatchActivities <em>Auto Batch Activities</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getMachineTypes <em>Machine Types</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getLocationTypes <em>Location Types</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getToolTypes <em>Tool Types</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getResourceGroupTypes <em>Resource Group Types</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDiagramImpl#getMileStones <em>Mile Stones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMPDiagramImpl extends EMDiagramImpl implements EMPDiagram {
	/**
	 * The cached value of the '{@link #getEmoDiagrams() <em>Emo Diagrams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmoDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList emoDiagrams = null;

	/**
	 * The cached value of the '{@link #getEmrDiagrams() <em>Emr Diagrams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmrDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList emrDiagrams = null;

	/**
	 * The cached value of the '{@link #getEmcDiagram() <em>Emc Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmcDiagram()
	 * @generated
	 * @ordered
	 */
	protected EMCDiagram emcDiagram = null;

	/**
	 * The cached value of the '{@link #getEmiDiagram() <em>Emi Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmiDiagram()
	 * @generated
	 * @ordered
	 */
	protected EMIDiagram emiDiagram = null;

	/**
	 * The default value of the '{@link #getStartedTime() <em>Started Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date STARTED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartedTime() <em>Started Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedTime()
	 * @generated
	 * @ordered
	 */
	protected Date startedTime = STARTED_TIME_EDEFAULT;



	/**
	 * The cached value of the '{@link #getDurationTime() <em>Duration Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationTime()
	 * @generated NOT xsm
	 * @ordered
	 */
	protected DSDistribution durationTime = new DSDistributionImpl(EnumDistribution.CONSTANT_LITERAL);

	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated NOT
	 * @ordered
	 */
	protected static final EnumTimeUnit TIME_UNIT_EDEFAULT = EnumTimeUnit.HOUR_LITERAL;

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected EnumTimeUnit timeUnit = TIME_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInOrs() <em>In Ors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInOrs()
	 * @generated
	 * @ordered
	 */
	protected EList inOrs = null;

	/**
	 * The cached value of the '{@link #getProductPackages() <em>Product Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPackages()
	 * @generated
	 * @ordered
	 */
	protected EList productPackages = null;

	/**
	 * The cached value of the '{@link #getOutAnds() <em>Out Ands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutAnds()
	 * @generated
	 * @ordered
	 */
	protected EList outAnds = null;

	/**
	 * The cached value of the '{@link #getDataFlows() <em>Data Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFlows()
	 * @generated
	 * @ordered
	 */
	protected EList dataFlows = null;

	/**
	 * The cached value of the '{@link #getClockFlows() <em>Clock Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockFlows()
	 * @generated
	 * @ordered
	 */
	protected EList clockFlows = null;

	/**
	 * The cached value of the '{@link #getClocks() <em>Clocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClocks()
	 * @generated
	 * @ordered
	 */
	protected EList clocks = null;

	/**
	 * The cached value of the '{@link #getInAnds() <em>In Ands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInAnds()
	 * @generated
	 * @ordered
	 */
	protected EList inAnds = null;

	/**
	 * The cached value of the '{@link #getNormalActivities() <em>Normal Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalActivities()
	 * @generated
	 * @ordered
	 */
	protected EList normalActivities = null;

	/**
	 * The cached value of the '{@link #getCompActivities() <em>Comp Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompActivities()
	 * @generated
	 * @ordered
	 */
	protected EList compActivities = null;

	/**
	 * The cached value of the '{@link #getOutOrs() <em>Out Ors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutOrs()
	 * @generated
	 * @ordered
	 */
	protected EList outOrs = null;

	/**
	 * The cached value of the '{@link #getAssFlows() <em>Ass Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssFlows()
	 * @generated
	 * @ordered
	 */
	protected EList assFlows = null;

	/**
	 * The cached value of the '{@link #getRefFlows() <em>Ref Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefFlows()
	 * @generated
	 * @ordered
	 */
	protected EList refFlows = null;

	/**
	 * The cached value of the '{@link #getOthers() <em>Others</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOthers()
	 * @generated
	 * @ordered
	 */
	protected EList others = null;

	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList artifacts = null;

	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected EList forms = null;

	/**
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList documents = null;

	/**
	 * The cached value of the '{@link #getAutoActivities() <em>Auto Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoActivities()
	 * @generated
	 * @ordered
	 */
	protected EList autoActivities = null;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList messages = null;

	/**
	 * The cached value of the '{@link #getManualBatchActivities() <em>Manual Batch Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualBatchActivities()
	 * @generated
	 * @ordered
	 */
	protected EList manualBatchActivities = null;

	/**
	 * The cached value of the '{@link #getAutoBatchActivities() <em>Auto Batch Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoBatchActivities()
	 * @generated
	 * @ordered
	 */
	protected EList autoBatchActivities = null;

	/**
	 * The cached value of the '{@link #getMachineTypes() <em>Machine Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineTypes()
	 * @generated
	 * @ordered
	 */
	protected EList machineTypes = null;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList roles = null;

	/**
	 * The cached value of the '{@link #getLocationTypes() <em>Location Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationTypes()
	 * @generated
	 * @ordered
	 */
	protected EList locationTypes = null;

	/**
	 * The cached value of the '{@link #getToolTypes() <em>Tool Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolTypes()
	 * @generated
	 * @ordered
	 */
	protected EList toolTypes = null;

	/**
	 * The cached value of the '{@link #getResourceGroupTypes() <em>Resource Group Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceGroupTypes()
	 * @generated
	 * @ordered
	 */
	protected EList resourceGroupTypes = null;

	/**
	 * The cached value of the '{@link #getMileStones() <em>Mile Stones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMileStones()
	 * @generated
	 * @ordered
	 */
	protected EList mileStones = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMPDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcesspackagePackage.Literals.EMP_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEmoDiagrams() {
		if (emoDiagrams == null) {
			emoDiagrams = new EObjectWithInverseResolvingEList.ManyInverse(EMODiagram.class, this, ProcesspackagePackage.EMP_DIAGRAM__EMO_DIAGRAMS, OrganizationpackagePackage.EMO_DIAGRAM__EMP_DIAGRAMS);
		}
		return emoDiagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEmrDiagrams() {
		if (emrDiagrams == null) {
			emrDiagrams = new EObjectWithInverseResolvingEList.ManyInverse(EMRDiagram.class, this, ProcesspackagePackage.EMP_DIAGRAM__EMR_DIAGRAMS, ResourcepackagePackage.EMR_DIAGRAM__EMP_DIAGRAMS);
		}
		return emrDiagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMCDiagram getEmcDiagram() {
		if (emcDiagram != null && emcDiagram.eIsProxy()) {
			InternalEObject oldEmcDiagram = (InternalEObject)emcDiagram;
			emcDiagram = (EMCDiagram)eResolveProxy(oldEmcDiagram);
			if (emcDiagram != oldEmcDiagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_DIAGRAM__EMC_DIAGRAM, oldEmcDiagram, emcDiagram));
			}
		}
		return emcDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMCDiagram basicGetEmcDiagram() {
		return emcDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmcDiagram(EMCDiagram newEmcDiagram, NotificationChain msgs) {
		EMCDiagram oldEmcDiagram = emcDiagram;
		emcDiagram = newEmcDiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DIAGRAM__EMC_DIAGRAM, oldEmcDiagram, newEmcDiagram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmcDiagram(EMCDiagram newEmcDiagram) {
		if (newEmcDiagram != emcDiagram) {
			NotificationChain msgs = null;
			if (emcDiagram != null)
				msgs = ((InternalEObject)emcDiagram).eInverseRemove(this, CollaborationpackagePackage.EMC_DIAGRAM__EMP_DIAGRAM, EMCDiagram.class, msgs);
			if (newEmcDiagram != null)
				msgs = ((InternalEObject)newEmcDiagram).eInverseAdd(this, CollaborationpackagePackage.EMC_DIAGRAM__EMP_DIAGRAM, EMCDiagram.class, msgs);
			msgs = basicSetEmcDiagram(newEmcDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DIAGRAM__EMC_DIAGRAM, newEmcDiagram, newEmcDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIDiagram getEmiDiagram() {
		if (emiDiagram != null && emiDiagram.eIsProxy()) {
			InternalEObject oldEmiDiagram = (InternalEObject)emiDiagram;
			emiDiagram = (EMIDiagram)eResolveProxy(oldEmiDiagram);
			if (emiDiagram != oldEmiDiagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_DIAGRAM__EMI_DIAGRAM, oldEmiDiagram, emiDiagram));
			}
		}
		return emiDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIDiagram basicGetEmiDiagram() {
		return emiDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmiDiagram(EMIDiagram newEmiDiagram, NotificationChain msgs) {
		EMIDiagram oldEmiDiagram = emiDiagram;
		emiDiagram = newEmiDiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DIAGRAM__EMI_DIAGRAM, oldEmiDiagram, newEmiDiagram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmiDiagram(EMIDiagram newEmiDiagram) {
		if (newEmiDiagram != emiDiagram) {
			NotificationChain msgs = null;
			if (emiDiagram != null)
				msgs = ((InternalEObject)emiDiagram).eInverseRemove(this, InfopackagePackage.EMI_DIAGRAM__EMI_DIAGRAM, EMIDiagram.class, msgs);
			if (newEmiDiagram != null)
				msgs = ((InternalEObject)newEmiDiagram).eInverseAdd(this, InfopackagePackage.EMI_DIAGRAM__EMI_DIAGRAM, EMIDiagram.class, msgs);
			msgs = basicSetEmiDiagram(newEmiDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DIAGRAM__EMI_DIAGRAM, newEmiDiagram, newEmiDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartedTime() {
		return startedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartedTime(Date newStartedTime) {
		Date oldStartedTime = startedTime;
		startedTime = newStartedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DIAGRAM__STARTED_TIME, oldStartedTime, startedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSDistribution getDurationTime() {
		return durationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationTime(DSDistribution newDurationTime) {
		if (newDurationTime != durationTime) {
			NotificationChain msgs = null;
			if (durationTime != null)
				msgs = ((InternalEObject)durationTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcesspackagePackage.EMP_DIAGRAM__DURATION_TIME, null, msgs);
			if (newDurationTime != null)
				msgs = ((InternalEObject)newDurationTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcesspackagePackage.EMP_DIAGRAM__DURATION_TIME, null, msgs);
			msgs = basicSetDurationTime(newDurationTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DIAGRAM__DURATION_TIME, newDurationTime, newDurationTime));
	}

	private NotificationChain basicSetDurationTime(
			DSDistribution newDurationTime, NotificationChain msgs) {
		
		DSDistribution oldDurationTime = durationTime;
		durationTime = newDurationTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_LEAF_ACTIVITY__DURATION_TIME, oldDurationTime, newDurationTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTimeUnit getTimeUnit() {
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnit(EnumTimeUnit newTimeUnit) {
		EnumTimeUnit oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit == null ? TIME_UNIT_EDEFAULT : newTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DIAGRAM__TIME_UNIT, oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInOrs() {
		if (inOrs == null) {
			inOrs = new EObjectContainmentWithInverseEList(EMPInOr.class, this, ProcesspackagePackage.EMP_DIAGRAM__IN_ORS, ProcesspackagePackage.EMP_IN_OR__EMP_DIAGRAM);
		}
		return inOrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProductPackages() {
		if (productPackages == null) {
			productPackages = new EObjectContainmentWithInverseEList(EMPProductPackage.class, this, ProcesspackagePackage.EMP_DIAGRAM__PRODUCT_PACKAGES, ProcesspackagePackage.EMP_PRODUCT_PACKAGE__EMP_DIAGRAM);
		}
		return productPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutAnds() {
		if (outAnds == null) {
			outAnds = new EObjectContainmentWithInverseEList(EMPOutAnd.class, this, ProcesspackagePackage.EMP_DIAGRAM__OUT_ANDS, ProcesspackagePackage.EMP_OUT_AND__EMP_DIAGRAM);
		}
		return outAnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDataFlows() {
		if (dataFlows == null) {
			dataFlows = new EObjectContainmentWithInverseEList(EMPDataFlow.class, this, ProcesspackagePackage.EMP_DIAGRAM__DATA_FLOWS, ProcesspackagePackage.EMP_DATA_FLOW__EMP_DIAGRAM);
		}
		return dataFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClockFlows() {
		if (clockFlows == null) {
			clockFlows = new EObjectContainmentWithInverseEList(EMPClockFlow.class, this, ProcesspackagePackage.EMP_DIAGRAM__CLOCK_FLOWS, ProcesspackagePackage.EMP_CLOCK_FLOW__EMP_DIAGRAM);
		}
		return clockFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClocks() {
		if (clocks == null) {
			clocks = new EObjectContainmentWithInverseEList(EMPClock.class, this, ProcesspackagePackage.EMP_DIAGRAM__CLOCKS, ProcesspackagePackage.EMP_CLOCK__EMP_DIAGRAM);
		}
		return clocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInAnds() {
		if (inAnds == null) {
			inAnds = new EObjectContainmentWithInverseEList(EMPInAnd.class, this, ProcesspackagePackage.EMP_DIAGRAM__IN_ANDS, ProcesspackagePackage.EMP_IN_AND__EMP_DIAGRAM);
		}
		return inAnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNormalActivities() {
		if (normalActivities == null) {
			normalActivities = new EObjectContainmentWithInverseEList(EMPNormalActivity.class, this, ProcesspackagePackage.EMP_DIAGRAM__NORMAL_ACTIVITIES, ProcesspackagePackage.EMP_NORMAL_ACTIVITY__EMP_DIAGRAM);
		}
		return normalActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCompActivities() {
		if (compActivities == null) {
			compActivities = new EObjectContainmentWithInverseEList(EMPCompActivity.class, this, ProcesspackagePackage.EMP_DIAGRAM__COMP_ACTIVITIES, ProcesspackagePackage.EMP_COMP_ACTIVITY__EMP_DIAGRAM);
		}
		return compActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutOrs() {
		if (outOrs == null) {
			outOrs = new EObjectContainmentWithInverseEList(EMPOutOr.class, this, ProcesspackagePackage.EMP_DIAGRAM__OUT_ORS, ProcesspackagePackage.EMP_OUT_OR__EMP_DIAGRAM);
		}
		return outOrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssFlows() {
		if (assFlows == null) {
			assFlows = new EObjectContainmentWithInverseEList(EMPAssFlow.class, this, ProcesspackagePackage.EMP_DIAGRAM__ASS_FLOWS, ProcesspackagePackage.EMP_ASS_FLOW__EMP_DIAGRAM);
		}
		return assFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRefFlows() {
		if (refFlows == null) {
			refFlows = new EObjectContainmentWithInverseEList(EMPRefFlow.class, this, ProcesspackagePackage.EMP_DIAGRAM__REF_FLOWS, ProcesspackagePackage.EMP_REF_FLOW__EMP_DIAGRAM);
		}
		return refFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOthers() {
		if (others == null) {
			others = new EObjectContainmentWithInverseEList(EMPOther.class, this, ProcesspackagePackage.EMP_DIAGRAM__OTHERS, ProcesspackagePackage.EMP_OTHER__EMP_DIAGRAM);
		}
		return others;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectContainmentWithInverseEList(EMPArtifact.class, this, ProcesspackagePackage.EMP_DIAGRAM__ARTIFACTS, ProcesspackagePackage.EMP_ARTIFACT__EMP_DIAGRAM);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getForms() {
		if (forms == null) {
			forms = new EObjectContainmentWithInverseEList(EMPForm.class, this, ProcesspackagePackage.EMP_DIAGRAM__FORMS, ProcesspackagePackage.EMP_FORM__EMP_DIAGRAM);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDocuments() {
		if (documents == null) {
			documents = new EObjectContainmentWithInverseEList(EMPDocument.class, this, ProcesspackagePackage.EMP_DIAGRAM__DOCUMENTS, ProcesspackagePackage.EMP_DOCUMENT__EMP_DIAGRAM);
		}
		return documents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAutoActivities() {
		if (autoActivities == null) {
			autoActivities = new EObjectContainmentWithInverseEList(EMPAutoActivity.class, this, ProcesspackagePackage.EMP_DIAGRAM__AUTO_ACTIVITIES, ProcesspackagePackage.EMP_AUTO_ACTIVITY__EMP_DIAGRAM);
		}
		return autoActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentWithInverseEList(EMPMessage.class, this, ProcesspackagePackage.EMP_DIAGRAM__MESSAGES, ProcesspackagePackage.EMP_MESSAGE__EMP_DIAGRAM);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getManualBatchActivities() {
		if (manualBatchActivities == null) {
			manualBatchActivities = new EObjectContainmentWithInverseEList(EMPManualBatchActivity.class, this, ProcesspackagePackage.EMP_DIAGRAM__MANUAL_BATCH_ACTIVITIES, ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__EMP_DIAGRAM);
		}
		return manualBatchActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAutoBatchActivities() {
		if (autoBatchActivities == null) {
			autoBatchActivities = new EObjectContainmentWithInverseEList(EMPAutoBatchActivity.class, this, ProcesspackagePackage.EMP_DIAGRAM__AUTO_BATCH_ACTIVITIES, ProcesspackagePackage.EMP_AUTO_BATCH_ACTIVITY__EMP_DIAGRAM);
		}
		return autoBatchActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMachineTypes() {
		if (machineTypes == null) {
			machineTypes = new EObjectContainmentWithInverseEList(EMRMachineType.class, this, ProcesspackagePackage.EMP_DIAGRAM__MACHINE_TYPES, ResourcepackagePackage.EMR_MACHINE_TYPE__EMP_DIAGRAM);
		}
		return machineTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentWithInverseEList(EMRRole.class, this, ProcesspackagePackage.EMP_DIAGRAM__ROLES, ResourcepackagePackage.EMR_ROLE__EMP_DIAGRAM);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLocationTypes() {
		if (locationTypes == null) {
			locationTypes = new EObjectContainmentWithInverseEList(EMRLocationType.class, this, ProcesspackagePackage.EMP_DIAGRAM__LOCATION_TYPES, ResourcepackagePackage.EMR_LOCATION_TYPE__EMP_DIAGRAM);
		}
		return locationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getToolTypes() {
		if (toolTypes == null) {
			toolTypes = new EObjectContainmentWithInverseEList(EMRToolType.class, this, ProcesspackagePackage.EMP_DIAGRAM__TOOL_TYPES, ResourcepackagePackage.EMR_TOOL_TYPE__EMP_DIAGRAM);
		}
		return toolTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResourceGroupTypes() {
		if (resourceGroupTypes == null) {
			resourceGroupTypes = new EObjectContainmentWithInverseEList(EMOResourceGroupType.class, this, ProcesspackagePackage.EMP_DIAGRAM__RESOURCE_GROUP_TYPES, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMP_DIAGRAM);
		}
		return resourceGroupTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMileStones() {
		if (mileStones == null) {
			mileStones = new EObjectContainmentWithInverseEList(EMPMileStone.class, this, ProcesspackagePackage.EMP_DIAGRAM__MILE_STONES, ProcesspackagePackage.EMP_MILE_STONE__EMP_DIAGRAM);
		}
		return mileStones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_DIAGRAM__EMO_DIAGRAMS:
				return ((InternalEList)getEmoDiagrams()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__EMR_DIAGRAMS:
				return ((InternalEList)getEmrDiagrams()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__EMC_DIAGRAM:
				if (emcDiagram != null)
					msgs = ((InternalEObject)emcDiagram).eInverseRemove(this, CollaborationpackagePackage.EMC_DIAGRAM__EMP_DIAGRAM, EMCDiagram.class, msgs);
				return basicSetEmcDiagram((EMCDiagram)otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__EMI_DIAGRAM:
				if (emiDiagram != null)
					msgs = ((InternalEObject)emiDiagram).eInverseRemove(this, InfopackagePackage.EMI_DIAGRAM__EMI_DIAGRAM, EMIDiagram.class, msgs);
				return basicSetEmiDiagram((EMIDiagram)otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__IN_ORS:
				return ((InternalEList)getInOrs()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__PRODUCT_PACKAGES:
				return ((InternalEList)getProductPackages()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__OUT_ANDS:
				return ((InternalEList)getOutAnds()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__DATA_FLOWS:
				return ((InternalEList)getDataFlows()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__CLOCK_FLOWS:
				return ((InternalEList)getClockFlows()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__CLOCKS:
				return ((InternalEList)getClocks()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__IN_ANDS:
				return ((InternalEList)getInAnds()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__NORMAL_ACTIVITIES:
				return ((InternalEList)getNormalActivities()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__COMP_ACTIVITIES:
				return ((InternalEList)getCompActivities()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__OUT_ORS:
				return ((InternalEList)getOutOrs()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__ASS_FLOWS:
				return ((InternalEList)getAssFlows()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__REF_FLOWS:
				return ((InternalEList)getRefFlows()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__OTHERS:
				return ((InternalEList)getOthers()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__ARTIFACTS:
				return ((InternalEList)getArtifacts()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__FORMS:
				return ((InternalEList)getForms()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__DOCUMENTS:
				return ((InternalEList)getDocuments()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__AUTO_ACTIVITIES:
				return ((InternalEList)getAutoActivities()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__MESSAGES:
				return ((InternalEList)getMessages()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__MANUAL_BATCH_ACTIVITIES:
				return ((InternalEList)getManualBatchActivities()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__AUTO_BATCH_ACTIVITIES:
				return ((InternalEList)getAutoBatchActivities()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__MACHINE_TYPES:
				return ((InternalEList)getMachineTypes()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__ROLES:
				return ((InternalEList)getRoles()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__LOCATION_TYPES:
				return ((InternalEList)getLocationTypes()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__TOOL_TYPES:
				return ((InternalEList)getToolTypes()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__RESOURCE_GROUP_TYPES:
				return ((InternalEList)getResourceGroupTypes()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__MILE_STONES:
				return ((InternalEList)getMileStones()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_DIAGRAM__EMO_DIAGRAMS:
				return ((InternalEList)getEmoDiagrams()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__EMR_DIAGRAMS:
				return ((InternalEList)getEmrDiagrams()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__EMC_DIAGRAM:
				return basicSetEmcDiagram(null, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__EMI_DIAGRAM:
				return basicSetEmiDiagram(null, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__DURATION_TIME:
				return basicSetDurationTime(null, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__IN_ORS:
				return ((InternalEList)getInOrs()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__PRODUCT_PACKAGES:
				return ((InternalEList)getProductPackages()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__OUT_ANDS:
				return ((InternalEList)getOutAnds()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__DATA_FLOWS:
				return ((InternalEList)getDataFlows()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__CLOCK_FLOWS:
				return ((InternalEList)getClockFlows()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__CLOCKS:
				return ((InternalEList)getClocks()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__IN_ANDS:
				return ((InternalEList)getInAnds()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__NORMAL_ACTIVITIES:
				return ((InternalEList)getNormalActivities()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__COMP_ACTIVITIES:
				return ((InternalEList)getCompActivities()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__OUT_ORS:
				return ((InternalEList)getOutOrs()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__ASS_FLOWS:
				return ((InternalEList)getAssFlows()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__REF_FLOWS:
				return ((InternalEList)getRefFlows()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__OTHERS:
				return ((InternalEList)getOthers()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__ARTIFACTS:
				return ((InternalEList)getArtifacts()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__FORMS:
				return ((InternalEList)getForms()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__DOCUMENTS:
				return ((InternalEList)getDocuments()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__AUTO_ACTIVITIES:
				return ((InternalEList)getAutoActivities()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__MESSAGES:
				return ((InternalEList)getMessages()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__MANUAL_BATCH_ACTIVITIES:
				return ((InternalEList)getManualBatchActivities()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__AUTO_BATCH_ACTIVITIES:
				return ((InternalEList)getAutoBatchActivities()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__MACHINE_TYPES:
				return ((InternalEList)getMachineTypes()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__ROLES:
				return ((InternalEList)getRoles()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__LOCATION_TYPES:
				return ((InternalEList)getLocationTypes()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__TOOL_TYPES:
				return ((InternalEList)getToolTypes()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__RESOURCE_GROUP_TYPES:
				return ((InternalEList)getResourceGroupTypes()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_DIAGRAM__MILE_STONES:
				return ((InternalEList)getMileStones()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_DIAGRAM__EMO_DIAGRAMS:
				return getEmoDiagrams();
			case ProcesspackagePackage.EMP_DIAGRAM__EMR_DIAGRAMS:
				return getEmrDiagrams();
			case ProcesspackagePackage.EMP_DIAGRAM__EMC_DIAGRAM:
				if (resolve) return getEmcDiagram();
				return basicGetEmcDiagram();
			case ProcesspackagePackage.EMP_DIAGRAM__EMI_DIAGRAM:
				if (resolve) return getEmiDiagram();
				return basicGetEmiDiagram();
			case ProcesspackagePackage.EMP_DIAGRAM__STARTED_TIME:
				return getStartedTime();
			case ProcesspackagePackage.EMP_DIAGRAM__DURATION_TIME:
				return getDurationTime();
			case ProcesspackagePackage.EMP_DIAGRAM__TIME_UNIT:
				return getTimeUnit();
			case ProcesspackagePackage.EMP_DIAGRAM__IN_ORS:
				return getInOrs();
			case ProcesspackagePackage.EMP_DIAGRAM__PRODUCT_PACKAGES:
				return getProductPackages();
			case ProcesspackagePackage.EMP_DIAGRAM__OUT_ANDS:
				return getOutAnds();
			case ProcesspackagePackage.EMP_DIAGRAM__DATA_FLOWS:
				return getDataFlows();
			case ProcesspackagePackage.EMP_DIAGRAM__CLOCK_FLOWS:
				return getClockFlows();
			case ProcesspackagePackage.EMP_DIAGRAM__CLOCKS:
				return getClocks();
			case ProcesspackagePackage.EMP_DIAGRAM__IN_ANDS:
				return getInAnds();
			case ProcesspackagePackage.EMP_DIAGRAM__NORMAL_ACTIVITIES:
				return getNormalActivities();
			case ProcesspackagePackage.EMP_DIAGRAM__COMP_ACTIVITIES:
				return getCompActivities();
			case ProcesspackagePackage.EMP_DIAGRAM__OUT_ORS:
				return getOutOrs();
			case ProcesspackagePackage.EMP_DIAGRAM__ASS_FLOWS:
				return getAssFlows();
			case ProcesspackagePackage.EMP_DIAGRAM__REF_FLOWS:
				return getRefFlows();
			case ProcesspackagePackage.EMP_DIAGRAM__OTHERS:
				return getOthers();
			case ProcesspackagePackage.EMP_DIAGRAM__ARTIFACTS:
				return getArtifacts();
			case ProcesspackagePackage.EMP_DIAGRAM__FORMS:
				return getForms();
			case ProcesspackagePackage.EMP_DIAGRAM__DOCUMENTS:
				return getDocuments();
			case ProcesspackagePackage.EMP_DIAGRAM__AUTO_ACTIVITIES:
				return getAutoActivities();
			case ProcesspackagePackage.EMP_DIAGRAM__MESSAGES:
				return getMessages();
			case ProcesspackagePackage.EMP_DIAGRAM__MANUAL_BATCH_ACTIVITIES:
				return getManualBatchActivities();
			case ProcesspackagePackage.EMP_DIAGRAM__AUTO_BATCH_ACTIVITIES:
				return getAutoBatchActivities();
			case ProcesspackagePackage.EMP_DIAGRAM__MACHINE_TYPES:
				return getMachineTypes();
			case ProcesspackagePackage.EMP_DIAGRAM__ROLES:
				return getRoles();
			case ProcesspackagePackage.EMP_DIAGRAM__LOCATION_TYPES:
				return getLocationTypes();
			case ProcesspackagePackage.EMP_DIAGRAM__TOOL_TYPES:
				return getToolTypes();
			case ProcesspackagePackage.EMP_DIAGRAM__RESOURCE_GROUP_TYPES:
				return getResourceGroupTypes();
			case ProcesspackagePackage.EMP_DIAGRAM__MILE_STONES:
				return getMileStones();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_DIAGRAM__EMO_DIAGRAMS:
				getEmoDiagrams().clear();
				getEmoDiagrams().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__EMR_DIAGRAMS:
				getEmrDiagrams().clear();
				getEmrDiagrams().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__EMC_DIAGRAM:
				setEmcDiagram((EMCDiagram)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__EMI_DIAGRAM:
				setEmiDiagram((EMIDiagram)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__STARTED_TIME:
				setStartedTime((Date)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__DURATION_TIME:
				setDurationTime((DSDistribution)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__TIME_UNIT:
				setTimeUnit((EnumTimeUnit)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__IN_ORS:
				getInOrs().clear();
				getInOrs().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__PRODUCT_PACKAGES:
				getProductPackages().clear();
				getProductPackages().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__OUT_ANDS:
				getOutAnds().clear();
				getOutAnds().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__DATA_FLOWS:
				getDataFlows().clear();
				getDataFlows().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__CLOCK_FLOWS:
				getClockFlows().clear();
				getClockFlows().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__CLOCKS:
				getClocks().clear();
				getClocks().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__IN_ANDS:
				getInAnds().clear();
				getInAnds().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__NORMAL_ACTIVITIES:
				getNormalActivities().clear();
				getNormalActivities().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__COMP_ACTIVITIES:
				getCompActivities().clear();
				getCompActivities().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__OUT_ORS:
				getOutOrs().clear();
				getOutOrs().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__ASS_FLOWS:
				getAssFlows().clear();
				getAssFlows().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__REF_FLOWS:
				getRefFlows().clear();
				getRefFlows().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__OTHERS:
				getOthers().clear();
				getOthers().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__FORMS:
				getForms().clear();
				getForms().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__DOCUMENTS:
				getDocuments().clear();
				getDocuments().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__AUTO_ACTIVITIES:
				getAutoActivities().clear();
				getAutoActivities().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__MANUAL_BATCH_ACTIVITIES:
				getManualBatchActivities().clear();
				getManualBatchActivities().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__AUTO_BATCH_ACTIVITIES:
				getAutoBatchActivities().clear();
				getAutoBatchActivities().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__MACHINE_TYPES:
				getMachineTypes().clear();
				getMachineTypes().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__LOCATION_TYPES:
				getLocationTypes().clear();
				getLocationTypes().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__TOOL_TYPES:
				getToolTypes().clear();
				getToolTypes().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__RESOURCE_GROUP_TYPES:
				getResourceGroupTypes().clear();
				getResourceGroupTypes().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__MILE_STONES:
				getMileStones().clear();
				getMileStones().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_DIAGRAM__EMO_DIAGRAMS:
				getEmoDiagrams().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__EMR_DIAGRAMS:
				getEmrDiagrams().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__EMC_DIAGRAM:
				setEmcDiagram((EMCDiagram)null);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__EMI_DIAGRAM:
				setEmiDiagram((EMIDiagram)null);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__STARTED_TIME:
				setStartedTime(STARTED_TIME_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__DURATION_TIME:
				setDurationTime((DSDistribution)null);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__IN_ORS:
				getInOrs().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__PRODUCT_PACKAGES:
				getProductPackages().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__OUT_ANDS:
				getOutAnds().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__DATA_FLOWS:
				getDataFlows().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__CLOCK_FLOWS:
				getClockFlows().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__CLOCKS:
				getClocks().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__IN_ANDS:
				getInAnds().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__NORMAL_ACTIVITIES:
				getNormalActivities().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__COMP_ACTIVITIES:
				getCompActivities().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__OUT_ORS:
				getOutOrs().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__ASS_FLOWS:
				getAssFlows().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__REF_FLOWS:
				getRefFlows().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__OTHERS:
				getOthers().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__ARTIFACTS:
				getArtifacts().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__FORMS:
				getForms().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__DOCUMENTS:
				getDocuments().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__AUTO_ACTIVITIES:
				getAutoActivities().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__MESSAGES:
				getMessages().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__MANUAL_BATCH_ACTIVITIES:
				getManualBatchActivities().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__AUTO_BATCH_ACTIVITIES:
				getAutoBatchActivities().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__MACHINE_TYPES:
				getMachineTypes().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__ROLES:
				getRoles().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__LOCATION_TYPES:
				getLocationTypes().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__TOOL_TYPES:
				getToolTypes().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__RESOURCE_GROUP_TYPES:
				getResourceGroupTypes().clear();
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__MILE_STONES:
				getMileStones().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_DIAGRAM__EMO_DIAGRAMS:
				return emoDiagrams != null && !emoDiagrams.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__EMR_DIAGRAMS:
				return emrDiagrams != null && !emrDiagrams.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__EMC_DIAGRAM:
				return emcDiagram != null;
			case ProcesspackagePackage.EMP_DIAGRAM__EMI_DIAGRAM:
				return emiDiagram != null;
			case ProcesspackagePackage.EMP_DIAGRAM__STARTED_TIME:
				return STARTED_TIME_EDEFAULT == null ? startedTime != null : !STARTED_TIME_EDEFAULT.equals(startedTime);
			case ProcesspackagePackage.EMP_DIAGRAM__DURATION_TIME:
				return durationTime != null;
			case ProcesspackagePackage.EMP_DIAGRAM__TIME_UNIT:
				return timeUnit != TIME_UNIT_EDEFAULT;
			case ProcesspackagePackage.EMP_DIAGRAM__IN_ORS:
				return inOrs != null && !inOrs.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__PRODUCT_PACKAGES:
				return productPackages != null && !productPackages.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__OUT_ANDS:
				return outAnds != null && !outAnds.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__DATA_FLOWS:
				return dataFlows != null && !dataFlows.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__CLOCK_FLOWS:
				return clockFlows != null && !clockFlows.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__CLOCKS:
				return clocks != null && !clocks.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__IN_ANDS:
				return inAnds != null && !inAnds.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__NORMAL_ACTIVITIES:
				return normalActivities != null && !normalActivities.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__COMP_ACTIVITIES:
				return compActivities != null && !compActivities.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__OUT_ORS:
				return outOrs != null && !outOrs.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__ASS_FLOWS:
				return assFlows != null && !assFlows.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__REF_FLOWS:
				return refFlows != null && !refFlows.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__OTHERS:
				return others != null && !others.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__ARTIFACTS:
				return artifacts != null && !artifacts.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__FORMS:
				return forms != null && !forms.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__DOCUMENTS:
				return documents != null && !documents.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__AUTO_ACTIVITIES:
				return autoActivities != null && !autoActivities.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__MESSAGES:
				return messages != null && !messages.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__MANUAL_BATCH_ACTIVITIES:
				return manualBatchActivities != null && !manualBatchActivities.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__AUTO_BATCH_ACTIVITIES:
				return autoBatchActivities != null && !autoBatchActivities.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__MACHINE_TYPES:
				return machineTypes != null && !machineTypes.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__ROLES:
				return roles != null && !roles.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__LOCATION_TYPES:
				return locationTypes != null && !locationTypes.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__TOOL_TYPES:
				return toolTypes != null && !toolTypes.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__RESOURCE_GROUP_TYPES:
				return resourceGroupTypes != null && !resourceGroupTypes.isEmpty();
			case ProcesspackagePackage.EMP_DIAGRAM__MILE_STONES:
				return mileStones != null && !mileStones.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (startedTime: ");
		result.append(startedTime);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(')');
		return result.toString();
	}

} //EMPDiagramImpl
