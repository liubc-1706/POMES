/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import vpml.resourcepackage.EMRAbstractLocationType;
import vpml.resourcepackage.EMRAbstractMachineType;
import vpml.resourcepackage.EMRAbstractRole;
import vpml.resourcepackage.EMRAbstractToolType;
import vpml.resourcepackage.EMRClassificationRelation;
import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.EMRLocationType;
import vpml.resourcepackage.EMRMachineType;
import vpml.resourcepackage.EMRRole;
import vpml.resourcepackage.EMRToolType;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMR Classification Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.resourcepackage.impl.EMRClassificationRelationImpl#getEmrDiagram <em>Emr Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRClassificationRelationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRClassificationRelationImpl#getSourceAbsRoleType <em>Source Abs Role Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRClassificationRelationImpl#getTargetAbsRoleType <em>Target Abs Role Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRClassificationRelationImpl#getLocationType <em>Location Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRClassificationRelationImpl#getSourceAbsLocationType <em>Source Abs Location Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRClassificationRelationImpl#getTargetAbsLocationType <em>Target Abs Location Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRClassificationRelationImpl#getToolType <em>Tool Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRClassificationRelationImpl#getTargetAbsToolType <em>Target Abs Tool Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRClassificationRelationImpl#getSourceAbsToolType <em>Source Abs Tool Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRClassificationRelationImpl#getMachineType <em>Machine Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRClassificationRelationImpl#getSourceAbsMachineType <em>Source Abs Machine Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRClassificationRelationImpl#getTargetAbsMachineType <em>Target Abs Machine Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMRClassificationRelationImpl extends EMRRelationImpl implements EMRClassificationRelation {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EMRRole role = null;

	/**
	 * The cached value of the '{@link #getSourceAbsRoleType() <em>Source Abs Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAbsRoleType()
	 * @generated
	 * @ordered
	 */
	protected EMRAbstractRole sourceAbsRoleType = null;

	/**
	 * The cached value of the '{@link #getTargetAbsRoleType() <em>Target Abs Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAbsRoleType()
	 * @generated
	 * @ordered
	 */
	protected EMRAbstractRole targetAbsRoleType = null;

	/**
	 * The cached value of the '{@link #getLocationType() <em>Location Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationType()
	 * @generated
	 * @ordered
	 */
	protected EMRLocationType locationType = null;

	/**
	 * The cached value of the '{@link #getSourceAbsLocationType() <em>Source Abs Location Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAbsLocationType()
	 * @generated
	 * @ordered
	 */
	protected EMRAbstractLocationType sourceAbsLocationType = null;

	/**
	 * The cached value of the '{@link #getTargetAbsLocationType() <em>Target Abs Location Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAbsLocationType()
	 * @generated
	 * @ordered
	 */
	protected EMRAbstractLocationType targetAbsLocationType = null;

	/**
	 * The cached value of the '{@link #getToolType() <em>Tool Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolType()
	 * @generated
	 * @ordered
	 */
	protected EMRToolType toolType = null;

	/**
	 * The cached value of the '{@link #getTargetAbsToolType() <em>Target Abs Tool Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAbsToolType()
	 * @generated
	 * @ordered
	 */
	protected EMRAbstractToolType targetAbsToolType = null;

	/**
	 * The cached value of the '{@link #getSourceAbsToolType() <em>Source Abs Tool Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAbsToolType()
	 * @generated
	 * @ordered
	 */
	protected EMRAbstractToolType sourceAbsToolType = null;

	/**
	 * The cached value of the '{@link #getMachineType() <em>Machine Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineType()
	 * @generated
	 * @ordered
	 */
	protected EMRMachineType machineType = null;

	/**
	 * The cached value of the '{@link #getSourceAbsMachineType() <em>Source Abs Machine Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAbsMachineType()
	 * @generated
	 * @ordered
	 */
	protected EMRAbstractMachineType sourceAbsMachineType = null;

	/**
	 * The cached value of the '{@link #getTargetAbsMachineType() <em>Target Abs Machine Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAbsMachineType()
	 * @generated
	 * @ordered
	 */
	protected EMRAbstractMachineType targetAbsMachineType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMRClassificationRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ResourcepackagePackage.Literals.EMR_CLASSIFICATION_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRDiagram getEmrDiagram() {
		if (eContainerFeatureID != ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__EMR_DIAGRAM) return null;
		return (EMRDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmrDiagram(EMRDiagram newEmrDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmrDiagram, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__EMR_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmrDiagram(EMRDiagram newEmrDiagram) {
		if (newEmrDiagram != eInternalContainer() || (eContainerFeatureID != ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__EMR_DIAGRAM && newEmrDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmrDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmrDiagram != null)
				msgs = ((InternalEObject)newEmrDiagram).eInverseAdd(this, ResourcepackagePackage.EMR_DIAGRAM__CLASSIFICATION_RELATIONS, EMRDiagram.class, msgs);
			msgs = basicSetEmrDiagram(newEmrDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__EMR_DIAGRAM, newEmrDiagram, newEmrDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRRole getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (EMRRole)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRRole basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(EMRRole newRole, NotificationChain msgs) {
		EMRRole oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(EMRRole newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, ResourcepackagePackage.EMR_ROLE__CLASSIFICATION_RELATION, EMRRole.class, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, ResourcepackagePackage.EMR_ROLE__CLASSIFICATION_RELATION, EMRRole.class, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractRole getSourceAbsRoleType() {
		if (sourceAbsRoleType != null && sourceAbsRoleType.eIsProxy()) {
			InternalEObject oldSourceAbsRoleType = (InternalEObject)sourceAbsRoleType;
			sourceAbsRoleType = (EMRAbstractRole)eResolveProxy(oldSourceAbsRoleType);
			if (sourceAbsRoleType != oldSourceAbsRoleType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_ROLE_TYPE, oldSourceAbsRoleType, sourceAbsRoleType));
			}
		}
		return sourceAbsRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractRole basicGetSourceAbsRoleType() {
		return sourceAbsRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceAbsRoleType(EMRAbstractRole newSourceAbsRoleType, NotificationChain msgs) {
		EMRAbstractRole oldSourceAbsRoleType = sourceAbsRoleType;
		sourceAbsRoleType = newSourceAbsRoleType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_ROLE_TYPE, oldSourceAbsRoleType, newSourceAbsRoleType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAbsRoleType(EMRAbstractRole newSourceAbsRoleType) {
		if (newSourceAbsRoleType != sourceAbsRoleType) {
			NotificationChain msgs = null;
			if (sourceAbsRoleType != null)
				msgs = ((InternalEObject)sourceAbsRoleType).eInverseRemove(this, ResourcepackagePackage.EMR_ABSTRACT_ROLE__SOURCE_CLASSIFICATION_RELATIONS, EMRAbstractRole.class, msgs);
			if (newSourceAbsRoleType != null)
				msgs = ((InternalEObject)newSourceAbsRoleType).eInverseAdd(this, ResourcepackagePackage.EMR_ABSTRACT_ROLE__SOURCE_CLASSIFICATION_RELATIONS, EMRAbstractRole.class, msgs);
			msgs = basicSetSourceAbsRoleType(newSourceAbsRoleType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_ROLE_TYPE, newSourceAbsRoleType, newSourceAbsRoleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractRole getTargetAbsRoleType() {
		if (targetAbsRoleType != null && targetAbsRoleType.eIsProxy()) {
			InternalEObject oldTargetAbsRoleType = (InternalEObject)targetAbsRoleType;
			targetAbsRoleType = (EMRAbstractRole)eResolveProxy(oldTargetAbsRoleType);
			if (targetAbsRoleType != oldTargetAbsRoleType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_ROLE_TYPE, oldTargetAbsRoleType, targetAbsRoleType));
			}
		}
		return targetAbsRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractRole basicGetTargetAbsRoleType() {
		return targetAbsRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetAbsRoleType(EMRAbstractRole newTargetAbsRoleType, NotificationChain msgs) {
		EMRAbstractRole oldTargetAbsRoleType = targetAbsRoleType;
		targetAbsRoleType = newTargetAbsRoleType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_ROLE_TYPE, oldTargetAbsRoleType, newTargetAbsRoleType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAbsRoleType(EMRAbstractRole newTargetAbsRoleType) {
		if (newTargetAbsRoleType != targetAbsRoleType) {
			NotificationChain msgs = null;
			if (targetAbsRoleType != null)
				msgs = ((InternalEObject)targetAbsRoleType).eInverseRemove(this, ResourcepackagePackage.EMR_ABSTRACT_ROLE__TARGET_CLASSIFICATION_RELATION, EMRAbstractRole.class, msgs);
			if (newTargetAbsRoleType != null)
				msgs = ((InternalEObject)newTargetAbsRoleType).eInverseAdd(this, ResourcepackagePackage.EMR_ABSTRACT_ROLE__TARGET_CLASSIFICATION_RELATION, EMRAbstractRole.class, msgs);
			msgs = basicSetTargetAbsRoleType(newTargetAbsRoleType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_ROLE_TYPE, newTargetAbsRoleType, newTargetAbsRoleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRLocationType getLocationType() {
		if (locationType != null && locationType.eIsProxy()) {
			InternalEObject oldLocationType = (InternalEObject)locationType;
			locationType = (EMRLocationType)eResolveProxy(oldLocationType);
			if (locationType != oldLocationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__LOCATION_TYPE, oldLocationType, locationType));
			}
		}
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRLocationType basicGetLocationType() {
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationType(EMRLocationType newLocationType, NotificationChain msgs) {
		EMRLocationType oldLocationType = locationType;
		locationType = newLocationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__LOCATION_TYPE, oldLocationType, newLocationType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationType(EMRLocationType newLocationType) {
		if (newLocationType != locationType) {
			NotificationChain msgs = null;
			if (locationType != null)
				msgs = ((InternalEObject)locationType).eInverseRemove(this, ResourcepackagePackage.EMR_LOCATION_TYPE__CLASSIFICATION_RELATION, EMRLocationType.class, msgs);
			if (newLocationType != null)
				msgs = ((InternalEObject)newLocationType).eInverseAdd(this, ResourcepackagePackage.EMR_LOCATION_TYPE__CLASSIFICATION_RELATION, EMRLocationType.class, msgs);
			msgs = basicSetLocationType(newLocationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__LOCATION_TYPE, newLocationType, newLocationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractLocationType getSourceAbsLocationType() {
		if (sourceAbsLocationType != null && sourceAbsLocationType.eIsProxy()) {
			InternalEObject oldSourceAbsLocationType = (InternalEObject)sourceAbsLocationType;
			sourceAbsLocationType = (EMRAbstractLocationType)eResolveProxy(oldSourceAbsLocationType);
			if (sourceAbsLocationType != oldSourceAbsLocationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_LOCATION_TYPE, oldSourceAbsLocationType, sourceAbsLocationType));
			}
		}
		return sourceAbsLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractLocationType basicGetSourceAbsLocationType() {
		return sourceAbsLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceAbsLocationType(EMRAbstractLocationType newSourceAbsLocationType, NotificationChain msgs) {
		EMRAbstractLocationType oldSourceAbsLocationType = sourceAbsLocationType;
		sourceAbsLocationType = newSourceAbsLocationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_LOCATION_TYPE, oldSourceAbsLocationType, newSourceAbsLocationType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAbsLocationType(EMRAbstractLocationType newSourceAbsLocationType) {
		if (newSourceAbsLocationType != sourceAbsLocationType) {
			NotificationChain msgs = null;
			if (sourceAbsLocationType != null)
				msgs = ((InternalEObject)sourceAbsLocationType).eInverseRemove(this, ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__SOURCE_CLASSIFICATION_RELATIONS, EMRAbstractLocationType.class, msgs);
			if (newSourceAbsLocationType != null)
				msgs = ((InternalEObject)newSourceAbsLocationType).eInverseAdd(this, ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__SOURCE_CLASSIFICATION_RELATIONS, EMRAbstractLocationType.class, msgs);
			msgs = basicSetSourceAbsLocationType(newSourceAbsLocationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_LOCATION_TYPE, newSourceAbsLocationType, newSourceAbsLocationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractLocationType getTargetAbsLocationType() {
		if (targetAbsLocationType != null && targetAbsLocationType.eIsProxy()) {
			InternalEObject oldTargetAbsLocationType = (InternalEObject)targetAbsLocationType;
			targetAbsLocationType = (EMRAbstractLocationType)eResolveProxy(oldTargetAbsLocationType);
			if (targetAbsLocationType != oldTargetAbsLocationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_LOCATION_TYPE, oldTargetAbsLocationType, targetAbsLocationType));
			}
		}
		return targetAbsLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractLocationType basicGetTargetAbsLocationType() {
		return targetAbsLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetAbsLocationType(EMRAbstractLocationType newTargetAbsLocationType, NotificationChain msgs) {
		EMRAbstractLocationType oldTargetAbsLocationType = targetAbsLocationType;
		targetAbsLocationType = newTargetAbsLocationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_LOCATION_TYPE, oldTargetAbsLocationType, newTargetAbsLocationType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAbsLocationType(EMRAbstractLocationType newTargetAbsLocationType) {
		if (newTargetAbsLocationType != targetAbsLocationType) {
			NotificationChain msgs = null;
			if (targetAbsLocationType != null)
				msgs = ((InternalEObject)targetAbsLocationType).eInverseRemove(this, ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__TARGET_CLASSIFICATION, EMRAbstractLocationType.class, msgs);
			if (newTargetAbsLocationType != null)
				msgs = ((InternalEObject)newTargetAbsLocationType).eInverseAdd(this, ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__TARGET_CLASSIFICATION, EMRAbstractLocationType.class, msgs);
			msgs = basicSetTargetAbsLocationType(newTargetAbsLocationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_LOCATION_TYPE, newTargetAbsLocationType, newTargetAbsLocationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRToolType getToolType() {
		if (toolType != null && toolType.eIsProxy()) {
			InternalEObject oldToolType = (InternalEObject)toolType;
			toolType = (EMRToolType)eResolveProxy(oldToolType);
			if (toolType != oldToolType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TOOL_TYPE, oldToolType, toolType));
			}
		}
		return toolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRToolType basicGetToolType() {
		return toolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToolType(EMRToolType newToolType, NotificationChain msgs) {
		EMRToolType oldToolType = toolType;
		toolType = newToolType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TOOL_TYPE, oldToolType, newToolType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolType(EMRToolType newToolType) {
		if (newToolType != toolType) {
			NotificationChain msgs = null;
			if (toolType != null)
				msgs = ((InternalEObject)toolType).eInverseRemove(this, ResourcepackagePackage.EMR_TOOL_TYPE__CLASSIFICATION_RELATION, EMRToolType.class, msgs);
			if (newToolType != null)
				msgs = ((InternalEObject)newToolType).eInverseAdd(this, ResourcepackagePackage.EMR_TOOL_TYPE__CLASSIFICATION_RELATION, EMRToolType.class, msgs);
			msgs = basicSetToolType(newToolType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TOOL_TYPE, newToolType, newToolType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractToolType getTargetAbsToolType() {
		if (targetAbsToolType != null && targetAbsToolType.eIsProxy()) {
			InternalEObject oldTargetAbsToolType = (InternalEObject)targetAbsToolType;
			targetAbsToolType = (EMRAbstractToolType)eResolveProxy(oldTargetAbsToolType);
			if (targetAbsToolType != oldTargetAbsToolType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_TOOL_TYPE, oldTargetAbsToolType, targetAbsToolType));
			}
		}
		return targetAbsToolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractToolType basicGetTargetAbsToolType() {
		return targetAbsToolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetAbsToolType(EMRAbstractToolType newTargetAbsToolType, NotificationChain msgs) {
		EMRAbstractToolType oldTargetAbsToolType = targetAbsToolType;
		targetAbsToolType = newTargetAbsToolType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_TOOL_TYPE, oldTargetAbsToolType, newTargetAbsToolType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAbsToolType(EMRAbstractToolType newTargetAbsToolType) {
		if (newTargetAbsToolType != targetAbsToolType) {
			NotificationChain msgs = null;
			if (targetAbsToolType != null)
				msgs = ((InternalEObject)targetAbsToolType).eInverseRemove(this, ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__TARGET_CLASSIFICATION_RELATION, EMRAbstractToolType.class, msgs);
			if (newTargetAbsToolType != null)
				msgs = ((InternalEObject)newTargetAbsToolType).eInverseAdd(this, ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__TARGET_CLASSIFICATION_RELATION, EMRAbstractToolType.class, msgs);
			msgs = basicSetTargetAbsToolType(newTargetAbsToolType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_TOOL_TYPE, newTargetAbsToolType, newTargetAbsToolType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractToolType getSourceAbsToolType() {
		if (sourceAbsToolType != null && sourceAbsToolType.eIsProxy()) {
			InternalEObject oldSourceAbsToolType = (InternalEObject)sourceAbsToolType;
			sourceAbsToolType = (EMRAbstractToolType)eResolveProxy(oldSourceAbsToolType);
			if (sourceAbsToolType != oldSourceAbsToolType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_TOOL_TYPE, oldSourceAbsToolType, sourceAbsToolType));
			}
		}
		return sourceAbsToolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractToolType basicGetSourceAbsToolType() {
		return sourceAbsToolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceAbsToolType(EMRAbstractToolType newSourceAbsToolType, NotificationChain msgs) {
		EMRAbstractToolType oldSourceAbsToolType = sourceAbsToolType;
		sourceAbsToolType = newSourceAbsToolType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_TOOL_TYPE, oldSourceAbsToolType, newSourceAbsToolType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAbsToolType(EMRAbstractToolType newSourceAbsToolType) {
		if (newSourceAbsToolType != sourceAbsToolType) {
			NotificationChain msgs = null;
			if (sourceAbsToolType != null)
				msgs = ((InternalEObject)sourceAbsToolType).eInverseRemove(this, ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__SOURCE_ABS_CLASSFICATION_RELATIONS, EMRAbstractToolType.class, msgs);
			if (newSourceAbsToolType != null)
				msgs = ((InternalEObject)newSourceAbsToolType).eInverseAdd(this, ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__SOURCE_ABS_CLASSFICATION_RELATIONS, EMRAbstractToolType.class, msgs);
			msgs = basicSetSourceAbsToolType(newSourceAbsToolType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_TOOL_TYPE, newSourceAbsToolType, newSourceAbsToolType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRMachineType getMachineType() {
		if (machineType != null && machineType.eIsProxy()) {
			InternalEObject oldMachineType = (InternalEObject)machineType;
			machineType = (EMRMachineType)eResolveProxy(oldMachineType);
			if (machineType != oldMachineType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__MACHINE_TYPE, oldMachineType, machineType));
			}
		}
		return machineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRMachineType basicGetMachineType() {
		return machineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachineType(EMRMachineType newMachineType, NotificationChain msgs) {
		EMRMachineType oldMachineType = machineType;
		machineType = newMachineType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__MACHINE_TYPE, oldMachineType, newMachineType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachineType(EMRMachineType newMachineType) {
		if (newMachineType != machineType) {
			NotificationChain msgs = null;
			if (machineType != null)
				msgs = ((InternalEObject)machineType).eInverseRemove(this, ResourcepackagePackage.EMR_MACHINE_TYPE__CLASSIFICATION_RELATION, EMRMachineType.class, msgs);
			if (newMachineType != null)
				msgs = ((InternalEObject)newMachineType).eInverseAdd(this, ResourcepackagePackage.EMR_MACHINE_TYPE__CLASSIFICATION_RELATION, EMRMachineType.class, msgs);
			msgs = basicSetMachineType(newMachineType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__MACHINE_TYPE, newMachineType, newMachineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractMachineType getSourceAbsMachineType() {
		if (sourceAbsMachineType != null && sourceAbsMachineType.eIsProxy()) {
			InternalEObject oldSourceAbsMachineType = (InternalEObject)sourceAbsMachineType;
			sourceAbsMachineType = (EMRAbstractMachineType)eResolveProxy(oldSourceAbsMachineType);
			if (sourceAbsMachineType != oldSourceAbsMachineType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_MACHINE_TYPE, oldSourceAbsMachineType, sourceAbsMachineType));
			}
		}
		return sourceAbsMachineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractMachineType basicGetSourceAbsMachineType() {
		return sourceAbsMachineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceAbsMachineType(EMRAbstractMachineType newSourceAbsMachineType, NotificationChain msgs) {
		EMRAbstractMachineType oldSourceAbsMachineType = sourceAbsMachineType;
		sourceAbsMachineType = newSourceAbsMachineType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_MACHINE_TYPE, oldSourceAbsMachineType, newSourceAbsMachineType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAbsMachineType(EMRAbstractMachineType newSourceAbsMachineType) {
		if (newSourceAbsMachineType != sourceAbsMachineType) {
			NotificationChain msgs = null;
			if (sourceAbsMachineType != null)
				msgs = ((InternalEObject)sourceAbsMachineType).eInverseRemove(this, ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__SOURCE_CLASSIFICATION_RELATIONS, EMRAbstractMachineType.class, msgs);
			if (newSourceAbsMachineType != null)
				msgs = ((InternalEObject)newSourceAbsMachineType).eInverseAdd(this, ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__SOURCE_CLASSIFICATION_RELATIONS, EMRAbstractMachineType.class, msgs);
			msgs = basicSetSourceAbsMachineType(newSourceAbsMachineType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_MACHINE_TYPE, newSourceAbsMachineType, newSourceAbsMachineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractMachineType getTargetAbsMachineType() {
		if (targetAbsMachineType != null && targetAbsMachineType.eIsProxy()) {
			InternalEObject oldTargetAbsMachineType = (InternalEObject)targetAbsMachineType;
			targetAbsMachineType = (EMRAbstractMachineType)eResolveProxy(oldTargetAbsMachineType);
			if (targetAbsMachineType != oldTargetAbsMachineType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_MACHINE_TYPE, oldTargetAbsMachineType, targetAbsMachineType));
			}
		}
		return targetAbsMachineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRAbstractMachineType basicGetTargetAbsMachineType() {
		return targetAbsMachineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetAbsMachineType(EMRAbstractMachineType newTargetAbsMachineType, NotificationChain msgs) {
		EMRAbstractMachineType oldTargetAbsMachineType = targetAbsMachineType;
		targetAbsMachineType = newTargetAbsMachineType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_MACHINE_TYPE, oldTargetAbsMachineType, newTargetAbsMachineType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAbsMachineType(EMRAbstractMachineType newTargetAbsMachineType) {
		if (newTargetAbsMachineType != targetAbsMachineType) {
			NotificationChain msgs = null;
			if (targetAbsMachineType != null)
				msgs = ((InternalEObject)targetAbsMachineType).eInverseRemove(this, ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__TARGET_CLASSIFICATION_RELATION, EMRAbstractMachineType.class, msgs);
			if (newTargetAbsMachineType != null)
				msgs = ((InternalEObject)newTargetAbsMachineType).eInverseAdd(this, ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__TARGET_CLASSIFICATION_RELATION, EMRAbstractMachineType.class, msgs);
			msgs = basicSetTargetAbsMachineType(newTargetAbsMachineType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_MACHINE_TYPE, newTargetAbsMachineType, newTargetAbsMachineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__EMR_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmrDiagram((EMRDiagram)otherEnd, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__ROLE:
				if (role != null)
					msgs = ((InternalEObject)role).eInverseRemove(this, ResourcepackagePackage.EMR_ROLE__CLASSIFICATION_RELATION, EMRRole.class, msgs);
				return basicSetRole((EMRRole)otherEnd, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_ROLE_TYPE:
				if (sourceAbsRoleType != null)
					msgs = ((InternalEObject)sourceAbsRoleType).eInverseRemove(this, ResourcepackagePackage.EMR_ABSTRACT_ROLE__SOURCE_CLASSIFICATION_RELATIONS, EMRAbstractRole.class, msgs);
				return basicSetSourceAbsRoleType((EMRAbstractRole)otherEnd, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_ROLE_TYPE:
				if (targetAbsRoleType != null)
					msgs = ((InternalEObject)targetAbsRoleType).eInverseRemove(this, ResourcepackagePackage.EMR_ABSTRACT_ROLE__TARGET_CLASSIFICATION_RELATION, EMRAbstractRole.class, msgs);
				return basicSetTargetAbsRoleType((EMRAbstractRole)otherEnd, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__LOCATION_TYPE:
				if (locationType != null)
					msgs = ((InternalEObject)locationType).eInverseRemove(this, ResourcepackagePackage.EMR_LOCATION_TYPE__CLASSIFICATION_RELATION, EMRLocationType.class, msgs);
				return basicSetLocationType((EMRLocationType)otherEnd, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_LOCATION_TYPE:
				if (sourceAbsLocationType != null)
					msgs = ((InternalEObject)sourceAbsLocationType).eInverseRemove(this, ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__SOURCE_CLASSIFICATION_RELATIONS, EMRAbstractLocationType.class, msgs);
				return basicSetSourceAbsLocationType((EMRAbstractLocationType)otherEnd, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_LOCATION_TYPE:
				if (targetAbsLocationType != null)
					msgs = ((InternalEObject)targetAbsLocationType).eInverseRemove(this, ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__TARGET_CLASSIFICATION, EMRAbstractLocationType.class, msgs);
				return basicSetTargetAbsLocationType((EMRAbstractLocationType)otherEnd, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TOOL_TYPE:
				if (toolType != null)
					msgs = ((InternalEObject)toolType).eInverseRemove(this, ResourcepackagePackage.EMR_TOOL_TYPE__CLASSIFICATION_RELATION, EMRToolType.class, msgs);
				return basicSetToolType((EMRToolType)otherEnd, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_TOOL_TYPE:
				if (targetAbsToolType != null)
					msgs = ((InternalEObject)targetAbsToolType).eInverseRemove(this, ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__TARGET_CLASSIFICATION_RELATION, EMRAbstractToolType.class, msgs);
				return basicSetTargetAbsToolType((EMRAbstractToolType)otherEnd, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_TOOL_TYPE:
				if (sourceAbsToolType != null)
					msgs = ((InternalEObject)sourceAbsToolType).eInverseRemove(this, ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__SOURCE_ABS_CLASSFICATION_RELATIONS, EMRAbstractToolType.class, msgs);
				return basicSetSourceAbsToolType((EMRAbstractToolType)otherEnd, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__MACHINE_TYPE:
				if (machineType != null)
					msgs = ((InternalEObject)machineType).eInverseRemove(this, ResourcepackagePackage.EMR_MACHINE_TYPE__CLASSIFICATION_RELATION, EMRMachineType.class, msgs);
				return basicSetMachineType((EMRMachineType)otherEnd, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_MACHINE_TYPE:
				if (sourceAbsMachineType != null)
					msgs = ((InternalEObject)sourceAbsMachineType).eInverseRemove(this, ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__SOURCE_CLASSIFICATION_RELATIONS, EMRAbstractMachineType.class, msgs);
				return basicSetSourceAbsMachineType((EMRAbstractMachineType)otherEnd, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_MACHINE_TYPE:
				if (targetAbsMachineType != null)
					msgs = ((InternalEObject)targetAbsMachineType).eInverseRemove(this, ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__TARGET_CLASSIFICATION_RELATION, EMRAbstractMachineType.class, msgs);
				return basicSetTargetAbsMachineType((EMRAbstractMachineType)otherEnd, msgs);
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
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__EMR_DIAGRAM:
				return basicSetEmrDiagram(null, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__ROLE:
				return basicSetRole(null, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_ROLE_TYPE:
				return basicSetSourceAbsRoleType(null, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_ROLE_TYPE:
				return basicSetTargetAbsRoleType(null, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__LOCATION_TYPE:
				return basicSetLocationType(null, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_LOCATION_TYPE:
				return basicSetSourceAbsLocationType(null, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_LOCATION_TYPE:
				return basicSetTargetAbsLocationType(null, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TOOL_TYPE:
				return basicSetToolType(null, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_TOOL_TYPE:
				return basicSetTargetAbsToolType(null, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_TOOL_TYPE:
				return basicSetSourceAbsToolType(null, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__MACHINE_TYPE:
				return basicSetMachineType(null, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_MACHINE_TYPE:
				return basicSetSourceAbsMachineType(null, msgs);
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_MACHINE_TYPE:
				return basicSetTargetAbsMachineType(null, msgs);
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
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__EMR_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ResourcepackagePackage.EMR_DIAGRAM__CLASSIFICATION_RELATIONS, EMRDiagram.class, msgs);
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
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__EMR_DIAGRAM:
				return getEmrDiagram();
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_ROLE_TYPE:
				if (resolve) return getSourceAbsRoleType();
				return basicGetSourceAbsRoleType();
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_ROLE_TYPE:
				if (resolve) return getTargetAbsRoleType();
				return basicGetTargetAbsRoleType();
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__LOCATION_TYPE:
				if (resolve) return getLocationType();
				return basicGetLocationType();
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_LOCATION_TYPE:
				if (resolve) return getSourceAbsLocationType();
				return basicGetSourceAbsLocationType();
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_LOCATION_TYPE:
				if (resolve) return getTargetAbsLocationType();
				return basicGetTargetAbsLocationType();
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TOOL_TYPE:
				if (resolve) return getToolType();
				return basicGetToolType();
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_TOOL_TYPE:
				if (resolve) return getTargetAbsToolType();
				return basicGetTargetAbsToolType();
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_TOOL_TYPE:
				if (resolve) return getSourceAbsToolType();
				return basicGetSourceAbsToolType();
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__MACHINE_TYPE:
				if (resolve) return getMachineType();
				return basicGetMachineType();
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_MACHINE_TYPE:
				if (resolve) return getSourceAbsMachineType();
				return basicGetSourceAbsMachineType();
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_MACHINE_TYPE:
				if (resolve) return getTargetAbsMachineType();
				return basicGetTargetAbsMachineType();
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
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__EMR_DIAGRAM:
				setEmrDiagram((EMRDiagram)newValue);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__ROLE:
				setRole((EMRRole)newValue);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_ROLE_TYPE:
				setSourceAbsRoleType((EMRAbstractRole)newValue);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_ROLE_TYPE:
				setTargetAbsRoleType((EMRAbstractRole)newValue);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__LOCATION_TYPE:
				setLocationType((EMRLocationType)newValue);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_LOCATION_TYPE:
				setSourceAbsLocationType((EMRAbstractLocationType)newValue);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_LOCATION_TYPE:
				setTargetAbsLocationType((EMRAbstractLocationType)newValue);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TOOL_TYPE:
				setToolType((EMRToolType)newValue);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_TOOL_TYPE:
				setTargetAbsToolType((EMRAbstractToolType)newValue);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_TOOL_TYPE:
				setSourceAbsToolType((EMRAbstractToolType)newValue);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__MACHINE_TYPE:
				setMachineType((EMRMachineType)newValue);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_MACHINE_TYPE:
				setSourceAbsMachineType((EMRAbstractMachineType)newValue);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_MACHINE_TYPE:
				setTargetAbsMachineType((EMRAbstractMachineType)newValue);
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
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__EMR_DIAGRAM:
				setEmrDiagram((EMRDiagram)null);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__ROLE:
				setRole((EMRRole)null);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_ROLE_TYPE:
				setSourceAbsRoleType((EMRAbstractRole)null);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_ROLE_TYPE:
				setTargetAbsRoleType((EMRAbstractRole)null);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__LOCATION_TYPE:
				setLocationType((EMRLocationType)null);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_LOCATION_TYPE:
				setSourceAbsLocationType((EMRAbstractLocationType)null);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_LOCATION_TYPE:
				setTargetAbsLocationType((EMRAbstractLocationType)null);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TOOL_TYPE:
				setToolType((EMRToolType)null);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_TOOL_TYPE:
				setTargetAbsToolType((EMRAbstractToolType)null);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_TOOL_TYPE:
				setSourceAbsToolType((EMRAbstractToolType)null);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__MACHINE_TYPE:
				setMachineType((EMRMachineType)null);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_MACHINE_TYPE:
				setSourceAbsMachineType((EMRAbstractMachineType)null);
				return;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_MACHINE_TYPE:
				setTargetAbsMachineType((EMRAbstractMachineType)null);
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
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__EMR_DIAGRAM:
				return getEmrDiagram() != null;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__ROLE:
				return role != null;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_ROLE_TYPE:
				return sourceAbsRoleType != null;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_ROLE_TYPE:
				return targetAbsRoleType != null;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__LOCATION_TYPE:
				return locationType != null;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_LOCATION_TYPE:
				return sourceAbsLocationType != null;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_LOCATION_TYPE:
				return targetAbsLocationType != null;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TOOL_TYPE:
				return toolType != null;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_TOOL_TYPE:
				return targetAbsToolType != null;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_TOOL_TYPE:
				return sourceAbsToolType != null;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__MACHINE_TYPE:
				return machineType != null;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_MACHINE_TYPE:
				return sourceAbsMachineType != null;
			case ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_MACHINE_TYPE:
				return targetAbsMachineType != null;
		}
		return super.eIsSet(featureID);
	}

} //EMRClassificationRelationImpl
