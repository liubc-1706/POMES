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

import vpml.resourcepackage.EMRAbstractLocationType;
import vpml.resourcepackage.EMRClassificationRelation;
import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMR Abstract Location Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.resourcepackage.impl.EMRAbstractLocationTypeImpl#getEmrDiagram <em>Emr Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRAbstractLocationTypeImpl#getSourceClassificationRelations <em>Source Classification Relations</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRAbstractLocationTypeImpl#getTargetClassification <em>Target Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMRAbstractLocationTypeImpl extends EMRAbstractResourceTypeImpl implements EMRAbstractLocationType {
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
	 * The cached value of the '{@link #getTargetClassification() <em>Target Classification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClassification()
	 * @generated
	 * @ordered
	 */
	protected EMRClassificationRelation targetClassification = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMRAbstractLocationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ResourcepackagePackage.Literals.EMR_ABSTRACT_LOCATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRDiagram getEmrDiagram() {
		if (eContainerFeatureID != ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__EMR_DIAGRAM) return null;
		return (EMRDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmrDiagram(EMRDiagram newEmrDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmrDiagram, ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__EMR_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmrDiagram(EMRDiagram newEmrDiagram) {
		if (newEmrDiagram != eInternalContainer() || (eContainerFeatureID != ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__EMR_DIAGRAM && newEmrDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmrDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmrDiagram != null)
				msgs = ((InternalEObject)newEmrDiagram).eInverseAdd(this, ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_LOCATION_TYPES, EMRDiagram.class, msgs);
			msgs = basicSetEmrDiagram(newEmrDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__EMR_DIAGRAM, newEmrDiagram, newEmrDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceClassificationRelations() {
		if (sourceClassificationRelations == null) {
			sourceClassificationRelations = new EObjectWithInverseResolvingEList(EMRClassificationRelation.class, this, ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__SOURCE_CLASSIFICATION_RELATIONS, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_LOCATION_TYPE);
		}
		return sourceClassificationRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRClassificationRelation getTargetClassification() {
		if (targetClassification != null && targetClassification.eIsProxy()) {
			InternalEObject oldTargetClassification = (InternalEObject)targetClassification;
			targetClassification = (EMRClassificationRelation)eResolveProxy(oldTargetClassification);
			if (targetClassification != oldTargetClassification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__TARGET_CLASSIFICATION, oldTargetClassification, targetClassification));
			}
		}
		return targetClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRClassificationRelation basicGetTargetClassification() {
		return targetClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetClassification(EMRClassificationRelation newTargetClassification, NotificationChain msgs) {
		EMRClassificationRelation oldTargetClassification = targetClassification;
		targetClassification = newTargetClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__TARGET_CLASSIFICATION, oldTargetClassification, newTargetClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClassification(EMRClassificationRelation newTargetClassification) {
		if (newTargetClassification != targetClassification) {
			NotificationChain msgs = null;
			if (targetClassification != null)
				msgs = ((InternalEObject)targetClassification).eInverseRemove(this, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_LOCATION_TYPE, EMRClassificationRelation.class, msgs);
			if (newTargetClassification != null)
				msgs = ((InternalEObject)newTargetClassification).eInverseAdd(this, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_LOCATION_TYPE, EMRClassificationRelation.class, msgs);
			msgs = basicSetTargetClassification(newTargetClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__TARGET_CLASSIFICATION, newTargetClassification, newTargetClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__EMR_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmrDiagram((EMRDiagram)otherEnd, msgs);
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__SOURCE_CLASSIFICATION_RELATIONS:
				return ((InternalEList)getSourceClassificationRelations()).basicAdd(otherEnd, msgs);
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__TARGET_CLASSIFICATION:
				if (targetClassification != null)
					msgs = ((InternalEObject)targetClassification).eInverseRemove(this, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_LOCATION_TYPE, EMRClassificationRelation.class, msgs);
				return basicSetTargetClassification((EMRClassificationRelation)otherEnd, msgs);
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
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__EMR_DIAGRAM:
				return basicSetEmrDiagram(null, msgs);
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__SOURCE_CLASSIFICATION_RELATIONS:
				return ((InternalEList)getSourceClassificationRelations()).basicRemove(otherEnd, msgs);
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__TARGET_CLASSIFICATION:
				return basicSetTargetClassification(null, msgs);
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
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__EMR_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_LOCATION_TYPES, EMRDiagram.class, msgs);
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
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__EMR_DIAGRAM:
				return getEmrDiagram();
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__SOURCE_CLASSIFICATION_RELATIONS:
				return getSourceClassificationRelations();
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__TARGET_CLASSIFICATION:
				if (resolve) return getTargetClassification();
				return basicGetTargetClassification();
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
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__EMR_DIAGRAM:
				setEmrDiagram((EMRDiagram)newValue);
				return;
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__SOURCE_CLASSIFICATION_RELATIONS:
				getSourceClassificationRelations().clear();
				getSourceClassificationRelations().addAll((Collection)newValue);
				return;
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__TARGET_CLASSIFICATION:
				setTargetClassification((EMRClassificationRelation)newValue);
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
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__EMR_DIAGRAM:
				setEmrDiagram((EMRDiagram)null);
				return;
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__SOURCE_CLASSIFICATION_RELATIONS:
				getSourceClassificationRelations().clear();
				return;
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__TARGET_CLASSIFICATION:
				setTargetClassification((EMRClassificationRelation)null);
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
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__EMR_DIAGRAM:
				return getEmrDiagram() != null;
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__SOURCE_CLASSIFICATION_RELATIONS:
				return sourceClassificationRelations != null && !sourceClassificationRelations.isEmpty();
			case ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__TARGET_CLASSIFICATION:
				return targetClassification != null;
		}
		return super.eIsSet(featureID);
	}

} //EMRAbstractLocationTypeImpl
