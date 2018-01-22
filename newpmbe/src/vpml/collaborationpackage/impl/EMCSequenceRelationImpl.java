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
import vpml.collaborationpackage.EMCDiagram;
import vpml.collaborationpackage.EMCSequenceRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMC Sequence Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.collaborationpackage.impl.EMCSequenceRelationImpl#getColSeqRelationDiagram <em>Col Seq Relation Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMCSequenceRelationImpl extends EMCRelationImpl implements EMCSequenceRelation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMCSequenceRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CollaborationpackagePackage.Literals.EMC_SEQUENCE_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMCDiagram getColSeqRelationDiagram() {
		if (eContainerFeatureID != CollaborationpackagePackage.EMC_SEQUENCE_RELATION__COL_SEQ_RELATION_DIAGRAM) return null;
		return (EMCDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColSeqRelationDiagram(EMCDiagram newColSeqRelationDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newColSeqRelationDiagram, CollaborationpackagePackage.EMC_SEQUENCE_RELATION__COL_SEQ_RELATION_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColSeqRelationDiagram(EMCDiagram newColSeqRelationDiagram) {
		if (newColSeqRelationDiagram != eInternalContainer() || (eContainerFeatureID != CollaborationpackagePackage.EMC_SEQUENCE_RELATION__COL_SEQ_RELATION_DIAGRAM && newColSeqRelationDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newColSeqRelationDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newColSeqRelationDiagram != null)
				msgs = ((InternalEObject)newColSeqRelationDiagram).eInverseAdd(this, CollaborationpackagePackage.EMC_DIAGRAM__COL_SEQ_RELATION, EMCDiagram.class, msgs);
			msgs = basicSetColSeqRelationDiagram(newColSeqRelationDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationpackagePackage.EMC_SEQUENCE_RELATION__COL_SEQ_RELATION_DIAGRAM, newColSeqRelationDiagram, newColSeqRelationDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborationpackagePackage.EMC_SEQUENCE_RELATION__COL_SEQ_RELATION_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetColSeqRelationDiagram((EMCDiagram)otherEnd, msgs);
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
			case CollaborationpackagePackage.EMC_SEQUENCE_RELATION__COL_SEQ_RELATION_DIAGRAM:
				return basicSetColSeqRelationDiagram(null, msgs);
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
			case CollaborationpackagePackage.EMC_SEQUENCE_RELATION__COL_SEQ_RELATION_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, CollaborationpackagePackage.EMC_DIAGRAM__COL_SEQ_RELATION, EMCDiagram.class, msgs);
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
			case CollaborationpackagePackage.EMC_SEQUENCE_RELATION__COL_SEQ_RELATION_DIAGRAM:
				return getColSeqRelationDiagram();
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
			case CollaborationpackagePackage.EMC_SEQUENCE_RELATION__COL_SEQ_RELATION_DIAGRAM:
				setColSeqRelationDiagram((EMCDiagram)newValue);
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
			case CollaborationpackagePackage.EMC_SEQUENCE_RELATION__COL_SEQ_RELATION_DIAGRAM:
				setColSeqRelationDiagram((EMCDiagram)null);
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
			case CollaborationpackagePackage.EMC_SEQUENCE_RELATION__COL_SEQ_RELATION_DIAGRAM:
				return getColSeqRelationDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

} //EMCSequenceRelationImpl
