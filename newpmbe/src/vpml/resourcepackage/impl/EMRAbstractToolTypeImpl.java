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

import vpml.resourcepackage.EMRAbstractToolType;
import vpml.resourcepackage.EMRClassificationRelation;
import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMR Abstract Tool Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.resourcepackage.impl.EMRAbstractToolTypeImpl#getEmrDiagram <em>Emr Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRAbstractToolTypeImpl#getTargetClassificationRelation <em>Target Classification Relation</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRAbstractToolTypeImpl#getSourceAbsClassficationRelations <em>Source Abs Classfication Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMRAbstractToolTypeImpl extends EMRAbstractResourceTypeImpl implements EMRAbstractToolType {
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
	 * The cached value of the '{@link #getSourceAbsClassficationRelations() <em>Source Abs Classfication Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAbsClassficationRelations()
	 * @generated
	 * @ordered
	 */
	protected EList sourceAbsClassficationRelations = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMRAbstractToolTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ResourcepackagePackage.Literals.EMR_ABSTRACT_TOOL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRDiagram getEmrDiagram() {
		if (eContainerFeatureID != ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__EMR_DIAGRAM) return null;
		return (EMRDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmrDiagram(EMRDiagram newEmrDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmrDiagram, ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__EMR_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmrDiagram(EMRDiagram newEmrDiagram) {
		if (newEmrDiagram != eInternalContainer() || (eContainerFeatureID != ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__EMR_DIAGRAM && newEmrDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmrDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmrDiagram != null)
				msgs = ((InternalEObject)newEmrDiagram).eInverseAdd(this, ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_TOOL_TYPES, EMRDiagram.class, msgs);
			msgs = basicSetEmrDiagram(newEmrDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__EMR_DIAGRAM, newEmrDiagram, newEmrDiagram));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__TARGET_CLASSIFICATION_RELATION, oldTargetClassificationRelation, targetClassificationRelation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__TARGET_CLASSIFICATION_RELATION, oldTargetClassificationRelation, newTargetClassificationRelation);
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
				msgs = ((InternalEObject)targetClassificationRelation).eInverseRemove(this, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_TOOL_TYPE, EMRClassificationRelation.class, msgs);
			if (newTargetClassificationRelation != null)
				msgs = ((InternalEObject)newTargetClassificationRelation).eInverseAdd(this, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_TOOL_TYPE, EMRClassificationRelation.class, msgs);
			msgs = basicSetTargetClassificationRelation(newTargetClassificationRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__TARGET_CLASSIFICATION_RELATION, newTargetClassificationRelation, newTargetClassificationRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceAbsClassficationRelations() {
		if (sourceAbsClassficationRelations == null) {
			sourceAbsClassficationRelations = new EObjectWithInverseResolvingEList(EMRClassificationRelation.class, this, ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__SOURCE_ABS_CLASSFICATION_RELATIONS, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_TOOL_TYPE);
		}
		return sourceAbsClassficationRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__EMR_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmrDiagram((EMRDiagram)otherEnd, msgs);
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__TARGET_CLASSIFICATION_RELATION:
				if (targetClassificationRelation != null)
					msgs = ((InternalEObject)targetClassificationRelation).eInverseRemove(this, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TARGET_ABS_TOOL_TYPE, EMRClassificationRelation.class, msgs);
				return basicSetTargetClassificationRelation((EMRClassificationRelation)otherEnd, msgs);
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__SOURCE_ABS_CLASSFICATION_RELATIONS:
				return ((InternalEList)getSourceAbsClassficationRelations()).basicAdd(otherEnd, msgs);
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
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__EMR_DIAGRAM:
				return basicSetEmrDiagram(null, msgs);
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__TARGET_CLASSIFICATION_RELATION:
				return basicSetTargetClassificationRelation(null, msgs);
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__SOURCE_ABS_CLASSFICATION_RELATIONS:
				return ((InternalEList)getSourceAbsClassficationRelations()).basicRemove(otherEnd, msgs);
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
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__EMR_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_TOOL_TYPES, EMRDiagram.class, msgs);
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
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__EMR_DIAGRAM:
				return getEmrDiagram();
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__TARGET_CLASSIFICATION_RELATION:
				if (resolve) return getTargetClassificationRelation();
				return basicGetTargetClassificationRelation();
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__SOURCE_ABS_CLASSFICATION_RELATIONS:
				return getSourceAbsClassficationRelations();
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
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__EMR_DIAGRAM:
				setEmrDiagram((EMRDiagram)newValue);
				return;
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__TARGET_CLASSIFICATION_RELATION:
				setTargetClassificationRelation((EMRClassificationRelation)newValue);
				return;
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__SOURCE_ABS_CLASSFICATION_RELATIONS:
				getSourceAbsClassficationRelations().clear();
				getSourceAbsClassficationRelations().addAll((Collection)newValue);
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
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__EMR_DIAGRAM:
				setEmrDiagram((EMRDiagram)null);
				return;
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__TARGET_CLASSIFICATION_RELATION:
				setTargetClassificationRelation((EMRClassificationRelation)null);
				return;
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__SOURCE_ABS_CLASSFICATION_RELATIONS:
				getSourceAbsClassficationRelations().clear();
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
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__EMR_DIAGRAM:
				return getEmrDiagram() != null;
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__TARGET_CLASSIFICATION_RELATION:
				return targetClassificationRelation != null;
			case ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__SOURCE_ABS_CLASSFICATION_RELATIONS:
				return sourceAbsClassficationRelations != null && !sourceAbsClassficationRelations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EMRAbstractToolTypeImpl
