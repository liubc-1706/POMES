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

import vpml.infopackage.EMIArtifact;
import vpml.infopackage.EMIDiagram;
import vpml.infopackage.InfopackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMI Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.infopackage.impl.EMIArtifactImpl#getArtifactDiagram <em>Artifact Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMIArtifactImpl extends EMILeafProductImpl implements EMIArtifact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMIArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InfopackagePackage.Literals.EMI_ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIDiagram getArtifactDiagram() {
		if (eContainerFeatureID != InfopackagePackage.EMI_ARTIFACT__ARTIFACT_DIAGRAM) return null;
		return (EMIDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifactDiagram(EMIDiagram newArtifactDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newArtifactDiagram, InfopackagePackage.EMI_ARTIFACT__ARTIFACT_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactDiagram(EMIDiagram newArtifactDiagram) {
		if (newArtifactDiagram != eInternalContainer() || (eContainerFeatureID != InfopackagePackage.EMI_ARTIFACT__ARTIFACT_DIAGRAM && newArtifactDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newArtifactDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newArtifactDiagram != null)
				msgs = ((InternalEObject)newArtifactDiagram).eInverseAdd(this, InfopackagePackage.EMI_DIAGRAM__ARTIFACT, EMIDiagram.class, msgs);
			msgs = basicSetArtifactDiagram(newArtifactDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_ARTIFACT__ARTIFACT_DIAGRAM, newArtifactDiagram, newArtifactDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfopackagePackage.EMI_ARTIFACT__ARTIFACT_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetArtifactDiagram((EMIDiagram)otherEnd, msgs);
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
			case InfopackagePackage.EMI_ARTIFACT__ARTIFACT_DIAGRAM:
				return basicSetArtifactDiagram(null, msgs);
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
			case InfopackagePackage.EMI_ARTIFACT__ARTIFACT_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, InfopackagePackage.EMI_DIAGRAM__ARTIFACT, EMIDiagram.class, msgs);
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
			case InfopackagePackage.EMI_ARTIFACT__ARTIFACT_DIAGRAM:
				return getArtifactDiagram();
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
			case InfopackagePackage.EMI_ARTIFACT__ARTIFACT_DIAGRAM:
				setArtifactDiagram((EMIDiagram)newValue);
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
			case InfopackagePackage.EMI_ARTIFACT__ARTIFACT_DIAGRAM:
				setArtifactDiagram((EMIDiagram)null);
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
			case InfopackagePackage.EMI_ARTIFACT__ARTIFACT_DIAGRAM:
				return getArtifactDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

} //EMIArtifactImpl
