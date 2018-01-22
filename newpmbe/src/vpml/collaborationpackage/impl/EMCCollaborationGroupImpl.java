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
import vpml.collaborationpackage.EMCCollaborationGroup;
import vpml.collaborationpackage.EMCDiagram;

import vpml.impl.EMObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMC Collaboration Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.collaborationpackage.impl.EMCCollaborationGroupImpl#getColColGroupDiagram <em>Col Col Group Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMCCollaborationGroupImpl extends EMObjectImpl implements EMCCollaborationGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMCCollaborationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CollaborationpackagePackage.Literals.EMC_COLLABORATION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMCDiagram getColColGroupDiagram() {
		if (eContainerFeatureID != CollaborationpackagePackage.EMC_COLLABORATION_GROUP__COL_COL_GROUP_DIAGRAM) return null;
		return (EMCDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColColGroupDiagram(EMCDiagram newColColGroupDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newColColGroupDiagram, CollaborationpackagePackage.EMC_COLLABORATION_GROUP__COL_COL_GROUP_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColColGroupDiagram(EMCDiagram newColColGroupDiagram) {
		if (newColColGroupDiagram != eInternalContainer() || (eContainerFeatureID != CollaborationpackagePackage.EMC_COLLABORATION_GROUP__COL_COL_GROUP_DIAGRAM && newColColGroupDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newColColGroupDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newColColGroupDiagram != null)
				msgs = ((InternalEObject)newColColGroupDiagram).eInverseAdd(this, CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_GROUP, EMCDiagram.class, msgs);
			msgs = basicSetColColGroupDiagram(newColColGroupDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationpackagePackage.EMC_COLLABORATION_GROUP__COL_COL_GROUP_DIAGRAM, newColColGroupDiagram, newColColGroupDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborationpackagePackage.EMC_COLLABORATION_GROUP__COL_COL_GROUP_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetColColGroupDiagram((EMCDiagram)otherEnd, msgs);
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
			case CollaborationpackagePackage.EMC_COLLABORATION_GROUP__COL_COL_GROUP_DIAGRAM:
				return basicSetColColGroupDiagram(null, msgs);
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
			case CollaborationpackagePackage.EMC_COLLABORATION_GROUP__COL_COL_GROUP_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_GROUP, EMCDiagram.class, msgs);
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
			case CollaborationpackagePackage.EMC_COLLABORATION_GROUP__COL_COL_GROUP_DIAGRAM:
				return getColColGroupDiagram();
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
			case CollaborationpackagePackage.EMC_COLLABORATION_GROUP__COL_COL_GROUP_DIAGRAM:
				setColColGroupDiagram((EMCDiagram)newValue);
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
			case CollaborationpackagePackage.EMC_COLLABORATION_GROUP__COL_COL_GROUP_DIAGRAM:
				setColColGroupDiagram((EMCDiagram)null);
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
			case CollaborationpackagePackage.EMC_COLLABORATION_GROUP__COL_COL_GROUP_DIAGRAM:
				return getColColGroupDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

} //EMCCollaborationGroupImpl
