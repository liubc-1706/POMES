/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import vpml.infopackage.EMIDiagram;
import vpml.infopackage.EMIRefFlow;
import vpml.infopackage.InfopackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMI Ref Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.infopackage.impl.EMIRefFlowImpl#getRefFlowDiagram <em>Ref Flow Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMIRefFlowImpl extends EMIFlowImpl implements EMIRefFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMIRefFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InfopackagePackage.Literals.EMI_REF_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIDiagram getRefFlowDiagram() {
		if (eContainerFeatureID != InfopackagePackage.EMI_REF_FLOW__REF_FLOW_DIAGRAM) return null;
		return (EMIDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefFlowDiagram(EMIDiagram newRefFlowDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRefFlowDiagram, InfopackagePackage.EMI_REF_FLOW__REF_FLOW_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefFlowDiagram(EMIDiagram newRefFlowDiagram) {
		if (newRefFlowDiagram != eInternalContainer() || (eContainerFeatureID != InfopackagePackage.EMI_REF_FLOW__REF_FLOW_DIAGRAM && newRefFlowDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newRefFlowDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRefFlowDiagram != null)
				msgs = ((InternalEObject)newRefFlowDiagram).eInverseAdd(this, InfopackagePackage.EMI_DIAGRAM__REF_FLOW, EMIDiagram.class, msgs);
			msgs = basicSetRefFlowDiagram(newRefFlowDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_REF_FLOW__REF_FLOW_DIAGRAM, newRefFlowDiagram, newRefFlowDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfopackagePackage.EMI_REF_FLOW__REF_FLOW_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRefFlowDiagram((EMIDiagram)otherEnd, msgs);
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
			case InfopackagePackage.EMI_REF_FLOW__REF_FLOW_DIAGRAM:
				return basicSetRefFlowDiagram(null, msgs);
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
			case InfopackagePackage.EMI_REF_FLOW__REF_FLOW_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, InfopackagePackage.EMI_DIAGRAM__REF_FLOW, EMIDiagram.class, msgs);
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
			case InfopackagePackage.EMI_REF_FLOW__REF_FLOW_DIAGRAM:
				return getRefFlowDiagram();
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
			case InfopackagePackage.EMI_REF_FLOW__REF_FLOW_DIAGRAM:
				setRefFlowDiagram((EMIDiagram)newValue);
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
			case InfopackagePackage.EMI_REF_FLOW__REF_FLOW_DIAGRAM:
				setRefFlowDiagram((EMIDiagram)null);
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
			case InfopackagePackage.EMI_REF_FLOW__REF_FLOW_DIAGRAM:
				return getRefFlowDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

} //EMIRefFlowImpl
