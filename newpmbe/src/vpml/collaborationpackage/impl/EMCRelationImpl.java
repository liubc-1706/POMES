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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import vpml.EMObject;
import vpml.VpmlPackage;

import vpml.collaborationpackage.CollaborationpackagePackage;
import vpml.collaborationpackage.EMCRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMC Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.collaborationpackage.impl.EMCRelationImpl#getSourceRelationSourceObj <em>Source Relation Source Obj</em>}</li>
 *   <li>{@link vpml.collaborationpackage.impl.EMCRelationImpl#getTargetRelationTargetObj <em>Target Relation Target Obj</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMCRelationImpl extends EObjectImpl implements EMCRelation {
	/**
	 * The cached value of the '{@link #getSourceRelationSourceObj() <em>Source Relation Source Obj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRelationSourceObj()
	 * @generated
	 * @ordered
	 */
	protected EMObject sourceRelationSourceObj = null;

	/**
	 * The cached value of the '{@link #getTargetRelationTargetObj() <em>Target Relation Target Obj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRelationTargetObj()
	 * @generated
	 * @ordered
	 */
	protected EMObject targetRelationTargetObj = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMCRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CollaborationpackagePackage.Literals.EMC_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMObject getSourceRelationSourceObj() {
		if (sourceRelationSourceObj != null && sourceRelationSourceObj.eIsProxy()) {
			InternalEObject oldSourceRelationSourceObj = (InternalEObject)sourceRelationSourceObj;
			sourceRelationSourceObj = (EMObject)eResolveProxy(oldSourceRelationSourceObj);
			if (sourceRelationSourceObj != oldSourceRelationSourceObj) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollaborationpackagePackage.EMC_RELATION__SOURCE_RELATION_SOURCE_OBJ, oldSourceRelationSourceObj, sourceRelationSourceObj));
			}
		}
		return sourceRelationSourceObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMObject basicGetSourceRelationSourceObj() {
		return sourceRelationSourceObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRelationSourceObj(EMObject newSourceRelationSourceObj, NotificationChain msgs) {
		EMObject oldSourceRelationSourceObj = sourceRelationSourceObj;
		sourceRelationSourceObj = newSourceRelationSourceObj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollaborationpackagePackage.EMC_RELATION__SOURCE_RELATION_SOURCE_OBJ, oldSourceRelationSourceObj, newSourceRelationSourceObj);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRelationSourceObj(EMObject newSourceRelationSourceObj) {
		if (newSourceRelationSourceObj != sourceRelationSourceObj) {
			NotificationChain msgs = null;
			if (sourceRelationSourceObj != null)
				msgs = ((InternalEObject)sourceRelationSourceObj).eInverseRemove(this, VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION, EMObject.class, msgs);
			if (newSourceRelationSourceObj != null)
				msgs = ((InternalEObject)newSourceRelationSourceObj).eInverseAdd(this, VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION, EMObject.class, msgs);
			msgs = basicSetSourceRelationSourceObj(newSourceRelationSourceObj, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationpackagePackage.EMC_RELATION__SOURCE_RELATION_SOURCE_OBJ, newSourceRelationSourceObj, newSourceRelationSourceObj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMObject getTargetRelationTargetObj() {
		if (targetRelationTargetObj != null && targetRelationTargetObj.eIsProxy()) {
			InternalEObject oldTargetRelationTargetObj = (InternalEObject)targetRelationTargetObj;
			targetRelationTargetObj = (EMObject)eResolveProxy(oldTargetRelationTargetObj);
			if (targetRelationTargetObj != oldTargetRelationTargetObj) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollaborationpackagePackage.EMC_RELATION__TARGET_RELATION_TARGET_OBJ, oldTargetRelationTargetObj, targetRelationTargetObj));
			}
		}
		return targetRelationTargetObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMObject basicGetTargetRelationTargetObj() {
		return targetRelationTargetObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetRelationTargetObj(EMObject newTargetRelationTargetObj, NotificationChain msgs) {
		EMObject oldTargetRelationTargetObj = targetRelationTargetObj;
		targetRelationTargetObj = newTargetRelationTargetObj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollaborationpackagePackage.EMC_RELATION__TARGET_RELATION_TARGET_OBJ, oldTargetRelationTargetObj, newTargetRelationTargetObj);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRelationTargetObj(EMObject newTargetRelationTargetObj) {
		if (newTargetRelationTargetObj != targetRelationTargetObj) {
			NotificationChain msgs = null;
			if (targetRelationTargetObj != null)
				msgs = ((InternalEObject)targetRelationTargetObj).eInverseRemove(this, VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION, EMObject.class, msgs);
			if (newTargetRelationTargetObj != null)
				msgs = ((InternalEObject)newTargetRelationTargetObj).eInverseAdd(this, VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION, EMObject.class, msgs);
			msgs = basicSetTargetRelationTargetObj(newTargetRelationTargetObj, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationpackagePackage.EMC_RELATION__TARGET_RELATION_TARGET_OBJ, newTargetRelationTargetObj, newTargetRelationTargetObj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborationpackagePackage.EMC_RELATION__SOURCE_RELATION_SOURCE_OBJ:
				if (sourceRelationSourceObj != null)
					msgs = ((InternalEObject)sourceRelationSourceObj).eInverseRemove(this, VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION, EMObject.class, msgs);
				return basicSetSourceRelationSourceObj((EMObject)otherEnd, msgs);
			case CollaborationpackagePackage.EMC_RELATION__TARGET_RELATION_TARGET_OBJ:
				if (targetRelationTargetObj != null)
					msgs = ((InternalEObject)targetRelationTargetObj).eInverseRemove(this, VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION, EMObject.class, msgs);
				return basicSetTargetRelationTargetObj((EMObject)otherEnd, msgs);
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
			case CollaborationpackagePackage.EMC_RELATION__SOURCE_RELATION_SOURCE_OBJ:
				return basicSetSourceRelationSourceObj(null, msgs);
			case CollaborationpackagePackage.EMC_RELATION__TARGET_RELATION_TARGET_OBJ:
				return basicSetTargetRelationTargetObj(null, msgs);
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
			case CollaborationpackagePackage.EMC_RELATION__SOURCE_RELATION_SOURCE_OBJ:
				if (resolve) return getSourceRelationSourceObj();
				return basicGetSourceRelationSourceObj();
			case CollaborationpackagePackage.EMC_RELATION__TARGET_RELATION_TARGET_OBJ:
				if (resolve) return getTargetRelationTargetObj();
				return basicGetTargetRelationTargetObj();
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
			case CollaborationpackagePackage.EMC_RELATION__SOURCE_RELATION_SOURCE_OBJ:
				setSourceRelationSourceObj((EMObject)newValue);
				return;
			case CollaborationpackagePackage.EMC_RELATION__TARGET_RELATION_TARGET_OBJ:
				setTargetRelationTargetObj((EMObject)newValue);
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
			case CollaborationpackagePackage.EMC_RELATION__SOURCE_RELATION_SOURCE_OBJ:
				setSourceRelationSourceObj((EMObject)null);
				return;
			case CollaborationpackagePackage.EMC_RELATION__TARGET_RELATION_TARGET_OBJ:
				setTargetRelationTargetObj((EMObject)null);
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
			case CollaborationpackagePackage.EMC_RELATION__SOURCE_RELATION_SOURCE_OBJ:
				return sourceRelationSourceObj != null;
			case CollaborationpackagePackage.EMC_RELATION__TARGET_RELATION_TARGET_OBJ:
				return targetRelationTargetObj != null;
		}
		return super.eIsSet(featureID);
	}

} //EMCRelationImpl
