/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.organizationpackage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import vpml.organizationpackage.EMOComposeRelation;
import vpml.organizationpackage.EMODiagram;
import vpml.organizationpackage.EMOResourceGroupType;
import vpml.organizationpackage.OrganizationpackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMO Compose Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.organizationpackage.impl.EMOComposeRelationImpl#getTargetGroupType <em>Target Group Type</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMOComposeRelationImpl#getSourceGroupType <em>Source Group Type</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMOComposeRelationImpl#getEmoDiagram <em>Emo Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMOComposeRelationImpl extends EMORelationsImpl implements EMOComposeRelation {
	/**
	 * The cached value of the '{@link #getTargetGroupType() <em>Target Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetGroupType()
	 * @generated
	 * @ordered
	 */
	protected EMOResourceGroupType targetGroupType = null;

	/**
	 * The cached value of the '{@link #getSourceGroupType() <em>Source Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceGroupType()
	 * @generated
	 * @ordered
	 */
	protected EMOResourceGroupType sourceGroupType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMOComposeRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrganizationpackagePackage.Literals.EMO_COMPOSE_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOResourceGroupType getTargetGroupType() {
		if (targetGroupType != null && targetGroupType.eIsProxy()) {
			InternalEObject oldTargetGroupType = (InternalEObject)targetGroupType;
			targetGroupType = (EMOResourceGroupType)eResolveProxy(oldTargetGroupType);
			if (targetGroupType != oldTargetGroupType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganizationpackagePackage.EMO_COMPOSE_RELATION__TARGET_GROUP_TYPE, oldTargetGroupType, targetGroupType));
			}
		}
		return targetGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOResourceGroupType basicGetTargetGroupType() {
		return targetGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetGroupType(EMOResourceGroupType newTargetGroupType, NotificationChain msgs) {
		EMOResourceGroupType oldTargetGroupType = targetGroupType;
		targetGroupType = newTargetGroupType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrganizationpackagePackage.EMO_COMPOSE_RELATION__TARGET_GROUP_TYPE, oldTargetGroupType, newTargetGroupType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetGroupType(EMOResourceGroupType newTargetGroupType) {
		if (newTargetGroupType != targetGroupType) {
			NotificationChain msgs = null;
			if (targetGroupType != null)
				msgs = ((InternalEObject)targetGroupType).eInverseRemove(this, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_COMPOSE_RELATION, EMOResourceGroupType.class, msgs);
			if (newTargetGroupType != null)
				msgs = ((InternalEObject)newTargetGroupType).eInverseAdd(this, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_COMPOSE_RELATION, EMOResourceGroupType.class, msgs);
			msgs = basicSetTargetGroupType(newTargetGroupType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationpackagePackage.EMO_COMPOSE_RELATION__TARGET_GROUP_TYPE, newTargetGroupType, newTargetGroupType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOResourceGroupType getSourceGroupType() {
		if (sourceGroupType != null && sourceGroupType.eIsProxy()) {
			InternalEObject oldSourceGroupType = (InternalEObject)sourceGroupType;
			sourceGroupType = (EMOResourceGroupType)eResolveProxy(oldSourceGroupType);
			if (sourceGroupType != oldSourceGroupType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganizationpackagePackage.EMO_COMPOSE_RELATION__SOURCE_GROUP_TYPE, oldSourceGroupType, sourceGroupType));
			}
		}
		return sourceGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOResourceGroupType basicGetSourceGroupType() {
		return sourceGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceGroupType(EMOResourceGroupType newSourceGroupType, NotificationChain msgs) {
		EMOResourceGroupType oldSourceGroupType = sourceGroupType;
		sourceGroupType = newSourceGroupType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrganizationpackagePackage.EMO_COMPOSE_RELATION__SOURCE_GROUP_TYPE, oldSourceGroupType, newSourceGroupType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceGroupType(EMOResourceGroupType newSourceGroupType) {
		if (newSourceGroupType != sourceGroupType) {
			NotificationChain msgs = null;
			if (sourceGroupType != null)
				msgs = ((InternalEObject)sourceGroupType).eInverseRemove(this, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_COMPOSE_RELATIONS, EMOResourceGroupType.class, msgs);
			if (newSourceGroupType != null)
				msgs = ((InternalEObject)newSourceGroupType).eInverseAdd(this, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_COMPOSE_RELATIONS, EMOResourceGroupType.class, msgs);
			msgs = basicSetSourceGroupType(newSourceGroupType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationpackagePackage.EMO_COMPOSE_RELATION__SOURCE_GROUP_TYPE, newSourceGroupType, newSourceGroupType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMODiagram getEmoDiagram() {
		if (eContainerFeatureID != OrganizationpackagePackage.EMO_COMPOSE_RELATION__EMO_DIAGRAM) return null;
		return (EMODiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmoDiagram(EMODiagram newEmoDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmoDiagram, OrganizationpackagePackage.EMO_COMPOSE_RELATION__EMO_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmoDiagram(EMODiagram newEmoDiagram) {
		if (newEmoDiagram != eInternalContainer() || (eContainerFeatureID != OrganizationpackagePackage.EMO_COMPOSE_RELATION__EMO_DIAGRAM && newEmoDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmoDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmoDiagram != null)
				msgs = ((InternalEObject)newEmoDiagram).eInverseAdd(this, OrganizationpackagePackage.EMO_DIAGRAM__COMPOSE_RELATIONS, EMODiagram.class, msgs);
			msgs = basicSetEmoDiagram(newEmoDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationpackagePackage.EMO_COMPOSE_RELATION__EMO_DIAGRAM, newEmoDiagram, newEmoDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__TARGET_GROUP_TYPE:
				if (targetGroupType != null)
					msgs = ((InternalEObject)targetGroupType).eInverseRemove(this, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_COMPOSE_RELATION, EMOResourceGroupType.class, msgs);
				return basicSetTargetGroupType((EMOResourceGroupType)otherEnd, msgs);
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__SOURCE_GROUP_TYPE:
				if (sourceGroupType != null)
					msgs = ((InternalEObject)sourceGroupType).eInverseRemove(this, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_COMPOSE_RELATIONS, EMOResourceGroupType.class, msgs);
				return basicSetSourceGroupType((EMOResourceGroupType)otherEnd, msgs);
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__EMO_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmoDiagram((EMODiagram)otherEnd, msgs);
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
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__TARGET_GROUP_TYPE:
				return basicSetTargetGroupType(null, msgs);
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__SOURCE_GROUP_TYPE:
				return basicSetSourceGroupType(null, msgs);
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__EMO_DIAGRAM:
				return basicSetEmoDiagram(null, msgs);
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
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__EMO_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, OrganizationpackagePackage.EMO_DIAGRAM__COMPOSE_RELATIONS, EMODiagram.class, msgs);
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
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__TARGET_GROUP_TYPE:
				if (resolve) return getTargetGroupType();
				return basicGetTargetGroupType();
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__SOURCE_GROUP_TYPE:
				if (resolve) return getSourceGroupType();
				return basicGetSourceGroupType();
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__EMO_DIAGRAM:
				return getEmoDiagram();
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
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__TARGET_GROUP_TYPE:
				setTargetGroupType((EMOResourceGroupType)newValue);
				return;
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__SOURCE_GROUP_TYPE:
				setSourceGroupType((EMOResourceGroupType)newValue);
				return;
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__EMO_DIAGRAM:
				setEmoDiagram((EMODiagram)newValue);
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
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__TARGET_GROUP_TYPE:
				setTargetGroupType((EMOResourceGroupType)null);
				return;
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__SOURCE_GROUP_TYPE:
				setSourceGroupType((EMOResourceGroupType)null);
				return;
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__EMO_DIAGRAM:
				setEmoDiagram((EMODiagram)null);
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
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__TARGET_GROUP_TYPE:
				return targetGroupType != null;
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__SOURCE_GROUP_TYPE:
				return sourceGroupType != null;
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION__EMO_DIAGRAM:
				return getEmoDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

} //EMOComposeRelationImpl
