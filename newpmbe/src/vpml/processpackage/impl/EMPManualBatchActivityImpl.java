/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.impl;

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

import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPManualBatchActivity;
import vpml.processpackage.ProcesspackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMP Manual Batch Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.processpackage.impl.EMPManualBatchActivityImpl#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPManualBatchActivityImpl#getAssFlows <em>Ass Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMPManualBatchActivityImpl extends EMPBatchActivityImpl implements EMPManualBatchActivity {
	/**
	 * The cached value of the '{@link #getAssFlows() <em>Ass Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssFlows()
	 * @generated
	 * @ordered
	 */
	protected EList assFlows = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMPManualBatchActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcesspackagePackage.Literals.EMP_MANUAL_BATCH_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPDiagram getEmpDiagram() {
		if (eContainerFeatureID != ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__EMP_DIAGRAM) return null;
		return (EMPDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpDiagram(EMPDiagram newEmpDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmpDiagram, ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__EMP_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpDiagram(EMPDiagram newEmpDiagram) {
		if (newEmpDiagram != eInternalContainer() || (eContainerFeatureID != ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__EMP_DIAGRAM && newEmpDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmpDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmpDiagram != null)
				msgs = ((InternalEObject)newEmpDiagram).eInverseAdd(this, ProcesspackagePackage.EMP_DIAGRAM__MANUAL_BATCH_ACTIVITIES, EMPDiagram.class, msgs);
			msgs = basicSetEmpDiagram(newEmpDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__EMP_DIAGRAM, newEmpDiagram, newEmpDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssFlows() {
		if (assFlows == null) {
			assFlows = new EObjectWithInverseResolvingEList(EMPAssFlow.class, this, ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__ASS_FLOWS, ProcesspackagePackage.EMP_ASS_FLOW__MANUAL_BATCH_ACTIVITY);
		}
		return assFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__EMP_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmpDiagram((EMPDiagram)otherEnd, msgs);
			case ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__ASS_FLOWS:
				return ((InternalEList)getAssFlows()).basicAdd(otherEnd, msgs);
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
			case ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__EMP_DIAGRAM:
				return basicSetEmpDiagram(null, msgs);
			case ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__ASS_FLOWS:
				return ((InternalEList)getAssFlows()).basicRemove(otherEnd, msgs);
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
			case ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__EMP_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ProcesspackagePackage.EMP_DIAGRAM__MANUAL_BATCH_ACTIVITIES, EMPDiagram.class, msgs);
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
			case ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__EMP_DIAGRAM:
				return getEmpDiagram();
			case ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__ASS_FLOWS:
				return getAssFlows();
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
			case ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)newValue);
				return;
			case ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__ASS_FLOWS:
				getAssFlows().clear();
				getAssFlows().addAll((Collection)newValue);
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
			case ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)null);
				return;
			case ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__ASS_FLOWS:
				getAssFlows().clear();
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
			case ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__EMP_DIAGRAM:
				return getEmpDiagram() != null;
			case ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__ASS_FLOWS:
				return assFlows != null && !assFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EMPManualBatchActivityImpl
