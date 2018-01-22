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

import vpml.infopackage.EMIComInfo;
import vpml.infopackage.EMIDiagram;
import vpml.infopackage.InfopackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMI Com Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.infopackage.impl.EMIComInfoImpl#getComInfoDiagram <em>Com Info Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMIComInfoImpl extends EMINodeImpl implements EMIComInfo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMIComInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InfopackagePackage.Literals.EMI_COM_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIDiagram getComInfoDiagram() {
		if (eContainerFeatureID != InfopackagePackage.EMI_COM_INFO__COM_INFO_DIAGRAM) return null;
		return (EMIDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComInfoDiagram(EMIDiagram newComInfoDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComInfoDiagram, InfopackagePackage.EMI_COM_INFO__COM_INFO_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComInfoDiagram(EMIDiagram newComInfoDiagram) {
		if (newComInfoDiagram != eInternalContainer() || (eContainerFeatureID != InfopackagePackage.EMI_COM_INFO__COM_INFO_DIAGRAM && newComInfoDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newComInfoDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComInfoDiagram != null)
				msgs = ((InternalEObject)newComInfoDiagram).eInverseAdd(this, InfopackagePackage.EMI_DIAGRAM__COM_INFO, EMIDiagram.class, msgs);
			msgs = basicSetComInfoDiagram(newComInfoDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_COM_INFO__COM_INFO_DIAGRAM, newComInfoDiagram, newComInfoDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfopackagePackage.EMI_COM_INFO__COM_INFO_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComInfoDiagram((EMIDiagram)otherEnd, msgs);
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
			case InfopackagePackage.EMI_COM_INFO__COM_INFO_DIAGRAM:
				return basicSetComInfoDiagram(null, msgs);
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
			case InfopackagePackage.EMI_COM_INFO__COM_INFO_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, InfopackagePackage.EMI_DIAGRAM__COM_INFO, EMIDiagram.class, msgs);
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
			case InfopackagePackage.EMI_COM_INFO__COM_INFO_DIAGRAM:
				return getComInfoDiagram();
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
			case InfopackagePackage.EMI_COM_INFO__COM_INFO_DIAGRAM:
				setComInfoDiagram((EMIDiagram)newValue);
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
			case InfopackagePackage.EMI_COM_INFO__COM_INFO_DIAGRAM:
				setComInfoDiagram((EMIDiagram)null);
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
			case InfopackagePackage.EMI_COM_INFO__COM_INFO_DIAGRAM:
				return getComInfoDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

} //EMIComInfoImpl
