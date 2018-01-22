/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import vpml.impl.EMObjectImpl;

import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPObject;
import vpml.processpackage.ProcesspackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMP Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.processpackage.impl.EMPObjectImpl#getComActivity <em>Com Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMPObjectImpl extends EMObjectImpl implements EMPObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMPObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcesspackagePackage.Literals.EMP_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPCompActivity getComActivity() {
		if (eContainerFeatureID != ProcesspackagePackage.EMP_OBJECT__COM_ACTIVITY) return null;
		return (EMPCompActivity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComActivity(EMPCompActivity newComActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComActivity, ProcesspackagePackage.EMP_OBJECT__COM_ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComActivity(EMPCompActivity newComActivity) {
		if (newComActivity != eInternalContainer() || (eContainerFeatureID != ProcesspackagePackage.EMP_OBJECT__COM_ACTIVITY && newComActivity != null)) {
			if (EcoreUtil.isAncestor(this, newComActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComActivity != null)
				msgs = ((InternalEObject)newComActivity).eInverseAdd(this, ProcesspackagePackage.EMP_COMP_ACTIVITY__LEAF_OBJECTS, EMPCompActivity.class, msgs);
			msgs = basicSetComActivity(newComActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_OBJECT__COM_ACTIVITY, newComActivity, newComActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_OBJECT__COM_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComActivity((EMPCompActivity)otherEnd, msgs);
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
			case ProcesspackagePackage.EMP_OBJECT__COM_ACTIVITY:
				return basicSetComActivity(null, msgs);
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
			case ProcesspackagePackage.EMP_OBJECT__COM_ACTIVITY:
				return eInternalContainer().eInverseRemove(this, ProcesspackagePackage.EMP_COMP_ACTIVITY__LEAF_OBJECTS, EMPCompActivity.class, msgs);
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
			case ProcesspackagePackage.EMP_OBJECT__COM_ACTIVITY:
				return getComActivity();
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
			case ProcesspackagePackage.EMP_OBJECT__COM_ACTIVITY:
				setComActivity((EMPCompActivity)newValue);
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
			case ProcesspackagePackage.EMP_OBJECT__COM_ACTIVITY:
				setComActivity((EMPCompActivity)null);
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
			case ProcesspackagePackage.EMP_OBJECT__COM_ACTIVITY:
				return getComActivity() != null;
		}
		return super.eIsSet(featureID);
	}

	public EMPCompActivity getCompActivity() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCompActivity(EMPCompActivity value) {
		// TODO Auto-generated method stub
		
	}

} //EMPObjectImpl
