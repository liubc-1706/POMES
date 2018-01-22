/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import vpml.infopackage.EMIDiagram;
import vpml.infopackage.EMIStateConnector;
import vpml.infopackage.InfopackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMI State Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.infopackage.impl.EMIStateConnectorImpl#getStateConnectorDiagram <em>State Connector Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMIStateConnectorImpl extends EMILogicalConnectorImpl implements EMIStateConnector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMIStateConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InfopackagePackage.Literals.EMI_STATE_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIDiagram getStateConnectorDiagram() {
		if (eContainerFeatureID != InfopackagePackage.EMI_STATE_CONNECTOR__STATE_CONNECTOR_DIAGRAM) return null;
		return (EMIDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateConnectorDiagram(EMIDiagram newStateConnectorDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateConnectorDiagram, InfopackagePackage.EMI_STATE_CONNECTOR__STATE_CONNECTOR_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateConnectorDiagram(EMIDiagram newStateConnectorDiagram) {
		if (newStateConnectorDiagram != eInternalContainer() || (eContainerFeatureID != InfopackagePackage.EMI_STATE_CONNECTOR__STATE_CONNECTOR_DIAGRAM && newStateConnectorDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newStateConnectorDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateConnectorDiagram != null)
				msgs = ((InternalEObject)newStateConnectorDiagram).eInverseAdd(this, InfopackagePackage.EMI_DIAGRAM__STATE_CONNECTOR, EMIDiagram.class, msgs);
			msgs = basicSetStateConnectorDiagram(newStateConnectorDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_STATE_CONNECTOR__STATE_CONNECTOR_DIAGRAM, newStateConnectorDiagram, newStateConnectorDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfopackagePackage.EMI_STATE_CONNECTOR__STATE_CONNECTOR_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateConnectorDiagram((EMIDiagram)otherEnd, msgs);
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
			case InfopackagePackage.EMI_STATE_CONNECTOR__STATE_CONNECTOR_DIAGRAM:
				return basicSetStateConnectorDiagram(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case InfopackagePackage.EMI_STATE_CONNECTOR__STATE_CONNECTOR_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, InfopackagePackage.EMI_DIAGRAM__STATE_CONNECTOR, EMIDiagram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfopackagePackage.EMI_STATE_CONNECTOR__STATE_CONNECTOR_DIAGRAM:
				return getStateConnectorDiagram();
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
			case InfopackagePackage.EMI_STATE_CONNECTOR__STATE_CONNECTOR_DIAGRAM:
				setStateConnectorDiagram((EMIDiagram)newValue);
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
			case InfopackagePackage.EMI_STATE_CONNECTOR__STATE_CONNECTOR_DIAGRAM:
				setStateConnectorDiagram((EMIDiagram)null);
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
			case InfopackagePackage.EMI_STATE_CONNECTOR__STATE_CONNECTOR_DIAGRAM:
				return getStateConnectorDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

} //EMIStateConnectorImpl
