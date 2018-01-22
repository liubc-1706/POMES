/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import vpml.resourcepackage.EMRAbstractMachineType;
import vpml.resourcepackage.EMRClassificationRelation;
import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMR Abstract Machine Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.resourcepackage.impl.EMRAbstractMachineTypeImpl#getEmrDiagram <em>Emr Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRAbstractMachineTypeImpl#getSourceClassificationRelations <em>Source Classification Relations</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRAbstractMachineTypeImpl#getTargetClassificationRelation <em>Target Classification Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMRAbstractMachineTypeImpl extends EMRAbstractResourceTypeImpl implements EMRAbstractMachineType {
	/**
	 * The cached value of the '{@link #getSourceClassificationRelations() <em>Source Classification Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceClassificationRelations()
	 * @generated
	 * @ordered
	 */
	protected EList sourceClassificationRelations = null;

	/**
	 * The cached value of the '{@link #getTargetClassificationRelation() <em>Target Classification Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClassificationRelation()
	 * @generated
	 * @ordered
	 */
	protected EMRClassificationRelation targetClassificationRelation = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMRAbstractMachineTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ResourcepackagePackage.Literals.EMR_ABSTRACT_MACHINE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRDiagram getEmrDiagram() {
		if (eContainerFeatureID != ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__EMR_DIAGRAM) return null;
		return (EMRDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmrDiagram(EMRDiagram newEmrDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmrDiagram, ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__EMR_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmrDiagram(EMRDiagram newEmrDiagram) {
		if (newEmrDiagram != eInternalContainer() || (eContainerFeatureID != ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__EMR_DIAGRAM && newEmrDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmrDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmrDiagram != null)
				msgs = ((InternalEObject)newEmrDiagram).eInverseAdd(this, ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_MACHINE_TYPES, EMRDiagram.class, msgs);
			msgs = basicSetEmrDiagram(newEmrDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__EMR_DIAGRAM, newEmrDiagram, newEmrDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceClassificationRelations() {
		if (sourceClassificationRelations == null) {
			sourceClassificationRelations = new EObjectWithInverseResolvingEList(EMRClassificationRelation.class, this, ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__SOURCE_CLASSIFICATION_RELATIONS, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_MACHINE_TYPE);
		}
		return sourceClassificationRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRClassificationRelation getTargetClassificationRelation() {
		if (targetClassificationRelation != null && targetClassificationRelation.eIsProxy()) {
			InternalEObject oldTargetClassificationRelation = (InternalEObject)targetClassificationRelation;
			targetClassificationRelation = (EMRClassificationRelation)eResolveProxy(oldTargetClassificationRelation);
			if (targetClassificationRelation != oldTargetClassificationRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__TARGET_CLASSIFICATION_RELATION, oldTargetClassificationRelation, targetClassificationRelation));
			}
		}
		return targetClassificationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRClassificationRelation basicGetTargetClassificationRelation() {
		return targetClassificationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetClassificationRelation(EMRClassificationRelation newTargetClassificationRelation, NotificationChain msgs) {
		EMRClassificationRelation oldTargetClassificationRelation = targetClassificationRelation;
		targetClassificationRelation = newTargetClassificationRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__TARGET_CLASSIFICATION_RELATION, oldTargetClassificationRelation, newTargetClassificationRelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClassificationRelation(EMRClassificationRelation newTargetClassificationRelation) {
		if (newTargetClassificationRelation != targetClassificationRelation) {
			NotificationChain msgs = null;
			if (targetClassificationRelation != null)
				msgs = ((InternalEObject)targetClassificationRelation).eInverseRemove(this, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_MACHINE_TYPE, EMRClassificationRelation.class, msgs);
			if (newTargetClassificationRelation != null)
				msgs = ((InternalEObject)newTargetClassificationRelation).eInverseAdd(this, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_MACHINE_TYPE, EMRClassificationRelation.class, msgs);
			msgs = basicSetTargetClassificationRelation(newTargetClassificationRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__TARGET_CLASSIFICATION_RELATION, newTargetClassificationRelation, newTargetClassificationRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__EMR_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmrDiagram((EMRDiagram)otherEnd, msgs);
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__SOURCE_CLASSIFICATION_RELATIONS:
				return ((InternalEList)getSourceClassificationRelations()).basicAdd(otherEnd, msgs);
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__TARGET_CLASSIFICATION_RELATION:
				if (targetClassificationRelation != null)
					msgs = ((InternalEObject)targetClassificationRelation).eInverseRemove(this, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_MACHINE_TYPE, EMRClassificationRelation.class, msgs);
				return basicSetTargetClassificationRelation((EMRClassificationRelation)otherEnd, msgs);
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
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__EMR_DIAGRAM:
				return basicSetEmrDiagram(null, msgs);
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__SOURCE_CLASSIFICATION_RELATIONS:
				return ((InternalEList)getSourceClassificationRelations()).basicRemove(otherEnd, msgs);
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__TARGET_CLASSIFICATION_RELATION:
				return basicSetTargetClassificationRelation(null, msgs);
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
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__EMR_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_MACHINE_TYPES, EMRDiagram.class, msgs);
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
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__EMR_DIAGRAM:
				return getEmrDiagram();
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__SOURCE_CLASSIFICATION_RELATIONS:
				return getSourceClassificationRelations();
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__TARGET_CLASSIFICATION_RELATION:
				if (resolve) return getTargetClassificationRelation();
				return basicGetTargetClassificationRelation();
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
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__EMR_DIAGRAM:
				setEmrDiagram((EMRDiagram)newValue);
				return;
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__SOURCE_CLASSIFICATION_RELATIONS:
				getSourceClassificationRelations().clear();
				getSourceClassificationRelations().addAll((Collection)newValue);
				return;
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__TARGET_CLASSIFICATION_RELATION:
				setTargetClassificationRelation((EMRClassificationRelation)newValue);
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
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__EMR_DIAGRAM:
				setEmrDiagram((EMRDiagram)null);
				return;
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__SOURCE_CLASSIFICATION_RELATIONS:
				getSourceClassificationRelations().clear();
				return;
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__TARGET_CLASSIFICATION_RELATION:
				setTargetClassificationRelation((EMRClassificationRelation)null);
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
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__EMR_DIAGRAM:
				return getEmrDiagram() != null;
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__SOURCE_CLASSIFICATION_RELATIONS:
				return sourceClassificationRelations != null && !sourceClassificationRelations.isEmpty();
			case ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__TARGET_CLASSIFICATION_RELATION:
				return targetClassificationRelation != null;
		}
		return super.eIsSet(featureID);
	}

} //EMRAbstractMachineTypeImpl
