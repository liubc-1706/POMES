/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vpml.impl.EMDiagramImpl;

import vpml.infopackage.EMIArtifact;
import vpml.infopackage.EMIComInfo;
import vpml.infopackage.EMIDataFlow;
import vpml.infopackage.EMIDiagram;
import vpml.infopackage.EMIDocument;
import vpml.infopackage.EMIInAnd;
import vpml.infopackage.EMIInOr;
import vpml.infopackage.EMIMessage;
import vpml.infopackage.EMIOther;
import vpml.infopackage.EMIOutAnd;
import vpml.infopackage.EMIOutOr;
import vpml.infopackage.EMIProductPackage;
import vpml.infopackage.EMIRefFlow;
import vpml.infopackage.EMIStateConnector;
import vpml.infopackage.InfopackagePackage;

import vpml.processpackage.EMPDiagram;
import vpml.processpackage.ProcesspackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMI Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.infopackage.impl.EMIDiagramImpl#getEmiDiagram <em>Emi Diagram</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIDiagramImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIDiagramImpl#getInand <em>Inand</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIDiagramImpl#getInor <em>Inor</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIDiagramImpl#getStateConnector <em>State Connector</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIDiagramImpl#getOther <em>Other</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIDiagramImpl#getProductPackage <em>Product Package</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIDiagramImpl#getOutand <em>Outand</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIDiagramImpl#getOutor <em>Outor</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIDiagramImpl#getRefFlow <em>Ref Flow</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIDiagramImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIDiagramImpl#getDataFlow <em>Data Flow</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIDiagramImpl#getComInfo <em>Com Info</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIDiagramImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMIDiagramImpl extends EMDiagramImpl implements EMIDiagram {
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
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList artifact = null;

	/**
	 * The cached value of the '{@link #getInand() <em>Inand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInand()
	 * @generated
	 * @ordered
	 */
	protected EList inand = null;

	/**
	 * The cached value of the '{@link #getInor() <em>Inor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInor()
	 * @generated
	 * @ordered
	 */
	protected EList inor = null;

	/**
	 * The cached value of the '{@link #getStateConnector() <em>State Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateConnector()
	 * @generated
	 * @ordered
	 */
	protected EList stateConnector = null;

	/**
	 * The cached value of the '{@link #getOther() <em>Other</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected EList other = null;

	/**
	 * The cached value of the '{@link #getProductPackage() <em>Product Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPackage()
	 * @generated
	 * @ordered
	 */
	protected EList productPackage = null;

	/**
	 * The cached value of the '{@link #getOutand() <em>Outand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutand()
	 * @generated
	 * @ordered
	 */
	protected EList outand = null;

	/**
	 * The cached value of the '{@link #getOutor() <em>Outor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutor()
	 * @generated
	 * @ordered
	 */
	protected EList outor = null;

	/**
	 * The cached value of the '{@link #getRefFlow() <em>Ref Flow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefFlow()
	 * @generated
	 * @ordered
	 */
	protected EList refFlow = null;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected EList document = null;

	/**
	 * The cached value of the '{@link #getDataFlow() <em>Data Flow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFlow()
	 * @generated
	 * @ordered
	 */
	protected EList dataFlow = null;

	/**
	 * The cached value of the '{@link #getComInfo() <em>Com Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComInfo()
	 * @generated
	 * @ordered
	 */
	protected EList comInfo = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList message = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMIDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InfopackagePackage.Literals.EMI_DIAGRAM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfopackagePackage.EMI_DIAGRAM__EMI_DIAGRAM, oldEmiDiagram, emiDiagram));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_DIAGRAM__EMI_DIAGRAM, oldEmiDiagram, newEmiDiagram);
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_DIAGRAM__EMI_DIAGRAM, newEmiDiagram, newEmiDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArtifact() {
		if (artifact == null) {
			artifact = new EObjectContainmentWithInverseEList(EMIArtifact.class, this, InfopackagePackage.EMI_DIAGRAM__ARTIFACT, InfopackagePackage.EMI_ARTIFACT__ARTIFACT_DIAGRAM);
		}
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInand() {
		if (inand == null) {
			inand = new EObjectContainmentWithInverseEList(EMIInAnd.class, this, InfopackagePackage.EMI_DIAGRAM__INAND, InfopackagePackage.EMI_IN_AND__INAND_DIAGRAM);
		}
		return inand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInor() {
		if (inor == null) {
			inor = new EObjectContainmentWithInverseEList(EMIInOr.class, this, InfopackagePackage.EMI_DIAGRAM__INOR, InfopackagePackage.EMI_IN_OR__INOR_DIAGRAM);
		}
		return inor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStateConnector() {
		if (stateConnector == null) {
			stateConnector = new EObjectContainmentWithInverseEList(EMIStateConnector.class, this, InfopackagePackage.EMI_DIAGRAM__STATE_CONNECTOR, InfopackagePackage.EMI_STATE_CONNECTOR__STATE_CONNECTOR_DIAGRAM);
		}
		return stateConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOther() {
		if (other == null) {
			other = new EObjectContainmentWithInverseEList(EMIOther.class, this, InfopackagePackage.EMI_DIAGRAM__OTHER, InfopackagePackage.EMI_OTHER__OTHER_DIAGRAM);
		}
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProductPackage() {
		if (productPackage == null) {
			productPackage = new EObjectContainmentWithInverseEList(EMIProductPackage.class, this, InfopackagePackage.EMI_DIAGRAM__PRODUCT_PACKAGE, InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_PACKAGE_DIAGRAM);
		}
		return productPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutand() {
		if (outand == null) {
			outand = new EObjectContainmentWithInverseEList(EMIOutAnd.class, this, InfopackagePackage.EMI_DIAGRAM__OUTAND, InfopackagePackage.EMI_OUT_AND__OUTAND_DIAGRAM);
		}
		return outand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutor() {
		if (outor == null) {
			outor = new EObjectContainmentWithInverseEList(EMIOutOr.class, this, InfopackagePackage.EMI_DIAGRAM__OUTOR, InfopackagePackage.EMI_OUT_OR__OUTOR_DIAGRAM);
		}
		return outor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRefFlow() {
		if (refFlow == null) {
			refFlow = new EObjectContainmentWithInverseEList(EMIRefFlow.class, this, InfopackagePackage.EMI_DIAGRAM__REF_FLOW, InfopackagePackage.EMI_REF_FLOW__REF_FLOW_DIAGRAM);
		}
		return refFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDocument() {
		if (document == null) {
			document = new EObjectContainmentWithInverseEList(EMIDocument.class, this, InfopackagePackage.EMI_DIAGRAM__DOCUMENT, InfopackagePackage.EMI_DOCUMENT__DOCUMENT_DIAGRAM);
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDataFlow() {
		if (dataFlow == null) {
			dataFlow = new EObjectContainmentWithInverseEList(EMIDataFlow.class, this, InfopackagePackage.EMI_DIAGRAM__DATA_FLOW, InfopackagePackage.EMI_DATA_FLOW__DATA_FLOW_DIAGRAM);
		}
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComInfo() {
		if (comInfo == null) {
			comInfo = new EObjectContainmentWithInverseEList(EMIComInfo.class, this, InfopackagePackage.EMI_DIAGRAM__COM_INFO, InfopackagePackage.EMI_COM_INFO__COM_INFO_DIAGRAM);
		}
		return comInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMessage() {
		if (message == null) {
			message = new EObjectContainmentEList(EMIMessage.class, this, InfopackagePackage.EMI_DIAGRAM__MESSAGE);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfopackagePackage.EMI_DIAGRAM__EMI_DIAGRAM:
				if (emiDiagram != null)
					msgs = ((InternalEObject)emiDiagram).eInverseRemove(this, InfopackagePackage.EMI_DIAGRAM__EMI_DIAGRAM, EMIDiagram.class, msgs);
				return basicSetEmiDiagram((EMIDiagram)otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__ARTIFACT:
				return ((InternalEList)getArtifact()).basicAdd(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__INAND:
				return ((InternalEList)getInand()).basicAdd(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__INOR:
				return ((InternalEList)getInor()).basicAdd(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__STATE_CONNECTOR:
				return ((InternalEList)getStateConnector()).basicAdd(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__OTHER:
				return ((InternalEList)getOther()).basicAdd(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__PRODUCT_PACKAGE:
				return ((InternalEList)getProductPackage()).basicAdd(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__OUTAND:
				return ((InternalEList)getOutand()).basicAdd(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__OUTOR:
				return ((InternalEList)getOutor()).basicAdd(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__REF_FLOW:
				return ((InternalEList)getRefFlow()).basicAdd(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__DOCUMENT:
				return ((InternalEList)getDocument()).basicAdd(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__DATA_FLOW:
				return ((InternalEList)getDataFlow()).basicAdd(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__COM_INFO:
				return ((InternalEList)getComInfo()).basicAdd(otherEnd, msgs);
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
			case InfopackagePackage.EMI_DIAGRAM__EMI_DIAGRAM:
				return basicSetEmiDiagram(null, msgs);
			case InfopackagePackage.EMI_DIAGRAM__ARTIFACT:
				return ((InternalEList)getArtifact()).basicRemove(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__INAND:
				return ((InternalEList)getInand()).basicRemove(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__INOR:
				return ((InternalEList)getInor()).basicRemove(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__STATE_CONNECTOR:
				return ((InternalEList)getStateConnector()).basicRemove(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__OTHER:
				return ((InternalEList)getOther()).basicRemove(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__PRODUCT_PACKAGE:
				return ((InternalEList)getProductPackage()).basicRemove(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__OUTAND:
				return ((InternalEList)getOutand()).basicRemove(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__OUTOR:
				return ((InternalEList)getOutor()).basicRemove(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__REF_FLOW:
				return ((InternalEList)getRefFlow()).basicRemove(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__DOCUMENT:
				return ((InternalEList)getDocument()).basicRemove(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__DATA_FLOW:
				return ((InternalEList)getDataFlow()).basicRemove(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__COM_INFO:
				return ((InternalEList)getComInfo()).basicRemove(otherEnd, msgs);
			case InfopackagePackage.EMI_DIAGRAM__MESSAGE:
				return ((InternalEList)getMessage()).basicRemove(otherEnd, msgs);
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
			case InfopackagePackage.EMI_DIAGRAM__EMI_DIAGRAM:
				if (resolve) return getEmiDiagram();
				return basicGetEmiDiagram();
			case InfopackagePackage.EMI_DIAGRAM__ARTIFACT:
				return getArtifact();
			case InfopackagePackage.EMI_DIAGRAM__INAND:
				return getInand();
			case InfopackagePackage.EMI_DIAGRAM__INOR:
				return getInor();
			case InfopackagePackage.EMI_DIAGRAM__STATE_CONNECTOR:
				return getStateConnector();
			case InfopackagePackage.EMI_DIAGRAM__OTHER:
				return getOther();
			case InfopackagePackage.EMI_DIAGRAM__PRODUCT_PACKAGE:
				return getProductPackage();
			case InfopackagePackage.EMI_DIAGRAM__OUTAND:
				return getOutand();
			case InfopackagePackage.EMI_DIAGRAM__OUTOR:
				return getOutor();
			case InfopackagePackage.EMI_DIAGRAM__REF_FLOW:
				return getRefFlow();
			case InfopackagePackage.EMI_DIAGRAM__DOCUMENT:
				return getDocument();
			case InfopackagePackage.EMI_DIAGRAM__DATA_FLOW:
				return getDataFlow();
			case InfopackagePackage.EMI_DIAGRAM__COM_INFO:
				return getComInfo();
			case InfopackagePackage.EMI_DIAGRAM__MESSAGE:
				return getMessage();
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
			case InfopackagePackage.EMI_DIAGRAM__EMI_DIAGRAM:
				setEmiDiagram((EMIDiagram)newValue);
				return;
			case InfopackagePackage.EMI_DIAGRAM__ARTIFACT:
				getArtifact().clear();
				getArtifact().addAll((Collection)newValue);
				return;
			case InfopackagePackage.EMI_DIAGRAM__INAND:
				getInand().clear();
				getInand().addAll((Collection)newValue);
				return;
			case InfopackagePackage.EMI_DIAGRAM__INOR:
				getInor().clear();
				getInor().addAll((Collection)newValue);
				return;
			case InfopackagePackage.EMI_DIAGRAM__STATE_CONNECTOR:
				getStateConnector().clear();
				getStateConnector().addAll((Collection)newValue);
				return;
			case InfopackagePackage.EMI_DIAGRAM__OTHER:
				getOther().clear();
				getOther().addAll((Collection)newValue);
				return;
			case InfopackagePackage.EMI_DIAGRAM__PRODUCT_PACKAGE:
				getProductPackage().clear();
				getProductPackage().addAll((Collection)newValue);
				return;
			case InfopackagePackage.EMI_DIAGRAM__OUTAND:
				getOutand().clear();
				getOutand().addAll((Collection)newValue);
				return;
			case InfopackagePackage.EMI_DIAGRAM__OUTOR:
				getOutor().clear();
				getOutor().addAll((Collection)newValue);
				return;
			case InfopackagePackage.EMI_DIAGRAM__REF_FLOW:
				getRefFlow().clear();
				getRefFlow().addAll((Collection)newValue);
				return;
			case InfopackagePackage.EMI_DIAGRAM__DOCUMENT:
				getDocument().clear();
				getDocument().addAll((Collection)newValue);
				return;
			case InfopackagePackage.EMI_DIAGRAM__DATA_FLOW:
				getDataFlow().clear();
				getDataFlow().addAll((Collection)newValue);
				return;
			case InfopackagePackage.EMI_DIAGRAM__COM_INFO:
				getComInfo().clear();
				getComInfo().addAll((Collection)newValue);
				return;
			case InfopackagePackage.EMI_DIAGRAM__MESSAGE:
				getMessage().clear();
				getMessage().addAll((Collection)newValue);
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
			case InfopackagePackage.EMI_DIAGRAM__EMI_DIAGRAM:
				setEmiDiagram((EMIDiagram)null);
				return;
			case InfopackagePackage.EMI_DIAGRAM__ARTIFACT:
				getArtifact().clear();
				return;
			case InfopackagePackage.EMI_DIAGRAM__INAND:
				getInand().clear();
				return;
			case InfopackagePackage.EMI_DIAGRAM__INOR:
				getInor().clear();
				return;
			case InfopackagePackage.EMI_DIAGRAM__STATE_CONNECTOR:
				getStateConnector().clear();
				return;
			case InfopackagePackage.EMI_DIAGRAM__OTHER:
				getOther().clear();
				return;
			case InfopackagePackage.EMI_DIAGRAM__PRODUCT_PACKAGE:
				getProductPackage().clear();
				return;
			case InfopackagePackage.EMI_DIAGRAM__OUTAND:
				getOutand().clear();
				return;
			case InfopackagePackage.EMI_DIAGRAM__OUTOR:
				getOutor().clear();
				return;
			case InfopackagePackage.EMI_DIAGRAM__REF_FLOW:
				getRefFlow().clear();
				return;
			case InfopackagePackage.EMI_DIAGRAM__DOCUMENT:
				getDocument().clear();
				return;
			case InfopackagePackage.EMI_DIAGRAM__DATA_FLOW:
				getDataFlow().clear();
				return;
			case InfopackagePackage.EMI_DIAGRAM__COM_INFO:
				getComInfo().clear();
				return;
			case InfopackagePackage.EMI_DIAGRAM__MESSAGE:
				getMessage().clear();
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
			case InfopackagePackage.EMI_DIAGRAM__EMI_DIAGRAM:
				return emiDiagram != null;
			case InfopackagePackage.EMI_DIAGRAM__ARTIFACT:
				return artifact != null && !artifact.isEmpty();
			case InfopackagePackage.EMI_DIAGRAM__INAND:
				return inand != null && !inand.isEmpty();
			case InfopackagePackage.EMI_DIAGRAM__INOR:
				return inor != null && !inor.isEmpty();
			case InfopackagePackage.EMI_DIAGRAM__STATE_CONNECTOR:
				return stateConnector != null && !stateConnector.isEmpty();
			case InfopackagePackage.EMI_DIAGRAM__OTHER:
				return other != null && !other.isEmpty();
			case InfopackagePackage.EMI_DIAGRAM__PRODUCT_PACKAGE:
				return productPackage != null && !productPackage.isEmpty();
			case InfopackagePackage.EMI_DIAGRAM__OUTAND:
				return outand != null && !outand.isEmpty();
			case InfopackagePackage.EMI_DIAGRAM__OUTOR:
				return outor != null && !outor.isEmpty();
			case InfopackagePackage.EMI_DIAGRAM__REF_FLOW:
				return refFlow != null && !refFlow.isEmpty();
			case InfopackagePackage.EMI_DIAGRAM__DOCUMENT:
				return document != null && !document.isEmpty();
			case InfopackagePackage.EMI_DIAGRAM__DATA_FLOW:
				return dataFlow != null && !dataFlow.isEmpty();
			case InfopackagePackage.EMI_DIAGRAM__COM_INFO:
				return comInfo != null && !comInfo.isEmpty();
			case InfopackagePackage.EMI_DIAGRAM__MESSAGE:
				return message != null && !message.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EMIDiagramImpl
