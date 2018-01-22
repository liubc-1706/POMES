/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.collaborationpackage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import vpml.collaborationpackage.CollaborationpackagePackage;
import vpml.collaborationpackage.EMCAnd;
import vpml.collaborationpackage.EMCDiagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMC And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.collaborationpackage.impl.EMCAndImpl#getColAndDiagram <em>Col And Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMCAndImpl extends EMCLogicalConnectorImpl implements EMCAnd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMCAndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CollaborationpackagePackage.Literals.EMC_AND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMCDiagram getColAndDiagram() {
		if (eContainerFeatureID != CollaborationpackagePackage.EMC_AND__COL_AND_DIAGRAM) return null;
		return (EMCDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColAndDiagram(EMCDiagram newColAndDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newColAndDiagram, CollaborationpackagePackage.EMC_AND__COL_AND_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColAndDiagram(EMCDiagram newColAndDiagram) {
		if (newColAndDiagram != eInternalContainer() || (eContainerFeatureID != CollaborationpackagePackage.EMC_AND__COL_AND_DIAGRAM && newColAndDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newColAndDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newColAndDiagram != null)
				msgs = ((InternalEObject)newColAndDiagram).eInverseAdd(this, CollaborationpackagePackage.EMC_DIAGRAM__COL_AND, EMCDiagram.class, msgs);
			msgs = basicSetColAndDiagram(newColAndDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationpackagePackage.EMC_AND__COL_AND_DIAGRAM, newColAndDiagram, newColAndDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborationpackagePackage.EMC_AND__COL_AND_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetColAndDiagram((EMCDiagram)otherEnd, msgs);
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
			case CollaborationpackagePackage.EMC_AND__COL_AND_DIAGRAM:
				return basicSetColAndDiagram(null, msgs);
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
			case CollaborationpackagePackage.EMC_AND__COL_AND_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, CollaborationpackagePackage.EMC_DIAGRAM__COL_AND, EMCDiagram.class, msgs);
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
			case CollaborationpackagePackage.EMC_AND__COL_AND_DIAGRAM:
				return getColAndDiagram();
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
			case CollaborationpackagePackage.EMC_AND__COL_AND_DIAGRAM:
				setColAndDiagram((EMCDiagram)newValue);
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
			case CollaborationpackagePackage.EMC_AND__COL_AND_DIAGRAM:
				setColAndDiagram((EMCDiagram)null);
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
			case CollaborationpackagePackage.EMC_AND__COL_AND_DIAGRAM:
				return getColAndDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

} //EMCAndImpl
