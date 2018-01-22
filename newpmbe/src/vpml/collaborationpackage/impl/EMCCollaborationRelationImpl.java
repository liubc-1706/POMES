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
import vpml.collaborationpackage.EMCCollaborationRelation;
import vpml.collaborationpackage.EMCDiagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMC Collaboration Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.collaborationpackage.impl.EMCCollaborationRelationImpl#getColColRelationDiagram <em>Col Col Relation Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMCCollaborationRelationImpl extends EMCRelationImpl implements EMCCollaborationRelation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMCCollaborationRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CollaborationpackagePackage.Literals.EMC_COLLABORATION_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMCDiagram getColColRelationDiagram() {
		if (eContainerFeatureID != CollaborationpackagePackage.EMC_COLLABORATION_RELATION__COL_COL_RELATION_DIAGRAM) return null;
		return (EMCDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColColRelationDiagram(EMCDiagram newColColRelationDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newColColRelationDiagram, CollaborationpackagePackage.EMC_COLLABORATION_RELATION__COL_COL_RELATION_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColColRelationDiagram(EMCDiagram newColColRelationDiagram) {
		if (newColColRelationDiagram != eInternalContainer() || (eContainerFeatureID != CollaborationpackagePackage.EMC_COLLABORATION_RELATION__COL_COL_RELATION_DIAGRAM && newColColRelationDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newColColRelationDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newColColRelationDiagram != null)
				msgs = ((InternalEObject)newColColRelationDiagram).eInverseAdd(this, CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_RELATION, EMCDiagram.class, msgs);
			msgs = basicSetColColRelationDiagram(newColColRelationDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationpackagePackage.EMC_COLLABORATION_RELATION__COL_COL_RELATION_DIAGRAM, newColColRelationDiagram, newColColRelationDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborationpackagePackage.EMC_COLLABORATION_RELATION__COL_COL_RELATION_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetColColRelationDiagram((EMCDiagram)otherEnd, msgs);
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
			case CollaborationpackagePackage.EMC_COLLABORATION_RELATION__COL_COL_RELATION_DIAGRAM:
				return basicSetColColRelationDiagram(null, msgs);
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
			case CollaborationpackagePackage.EMC_COLLABORATION_RELATION__COL_COL_RELATION_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_RELATION, EMCDiagram.class, msgs);
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
			case CollaborationpackagePackage.EMC_COLLABORATION_RELATION__COL_COL_RELATION_DIAGRAM:
				return getColColRelationDiagram();
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
			case CollaborationpackagePackage.EMC_COLLABORATION_RELATION__COL_COL_RELATION_DIAGRAM:
				setColColRelationDiagram((EMCDiagram)newValue);
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
			case CollaborationpackagePackage.EMC_COLLABORATION_RELATION__COL_COL_RELATION_DIAGRAM:
				setColColRelationDiagram((EMCDiagram)null);
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
			case CollaborationpackagePackage.EMC_COLLABORATION_RELATION__COL_COL_RELATION_DIAGRAM:
				return getColColRelationDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

} //EMCCollaborationRelationImpl
