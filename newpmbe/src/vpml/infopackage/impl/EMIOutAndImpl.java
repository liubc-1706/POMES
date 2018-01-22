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
import vpml.infopackage.EMIOutAnd;
import vpml.infopackage.InfopackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMI Out And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.infopackage.impl.EMIOutAndImpl#getOutandDiagram <em>Outand Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMIOutAndImpl extends EMIOutConnectorImpl implements EMIOutAnd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMIOutAndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InfopackagePackage.Literals.EMI_OUT_AND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIDiagram getOutandDiagram() {
		if (eContainerFeatureID != InfopackagePackage.EMI_OUT_AND__OUTAND_DIAGRAM) return null;
		return (EMIDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutandDiagram(EMIDiagram newOutandDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOutandDiagram, InfopackagePackage.EMI_OUT_AND__OUTAND_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutandDiagram(EMIDiagram newOutandDiagram) {
		if (newOutandDiagram != eInternalContainer() || (eContainerFeatureID != InfopackagePackage.EMI_OUT_AND__OUTAND_DIAGRAM && newOutandDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newOutandDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOutandDiagram != null)
				msgs = ((InternalEObject)newOutandDiagram).eInverseAdd(this, InfopackagePackage.EMI_DIAGRAM__OUTAND, EMIDiagram.class, msgs);
			msgs = basicSetOutandDiagram(newOutandDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_OUT_AND__OUTAND_DIAGRAM, newOutandDiagram, newOutandDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfopackagePackage.EMI_OUT_AND__OUTAND_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOutandDiagram((EMIDiagram)otherEnd, msgs);
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
			case InfopackagePackage.EMI_OUT_AND__OUTAND_DIAGRAM:
				return basicSetOutandDiagram(null, msgs);
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
			case InfopackagePackage.EMI_OUT_AND__OUTAND_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, InfopackagePackage.EMI_DIAGRAM__OUTAND, EMIDiagram.class, msgs);
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
			case InfopackagePackage.EMI_OUT_AND__OUTAND_DIAGRAM:
				return getOutandDiagram();
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
			case InfopackagePackage.EMI_OUT_AND__OUTAND_DIAGRAM:
				setOutandDiagram((EMIDiagram)newValue);
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
			case InfopackagePackage.EMI_OUT_AND__OUTAND_DIAGRAM:
				setOutandDiagram((EMIDiagram)null);
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
			case InfopackagePackage.EMI_OUT_AND__OUTAND_DIAGRAM:
				return getOutandDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

} //EMIOutAndImpl
