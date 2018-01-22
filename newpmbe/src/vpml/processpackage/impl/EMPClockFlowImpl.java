/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import vpml.processpackage.EMPActivity;
import vpml.processpackage.EMPClock;
import vpml.processpackage.EMPClockFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.ProcesspackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMP Clock Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.processpackage.impl.EMPClockFlowImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPClockFlowImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPClockFlowImpl#getEmpDiagram <em>Emp Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMPClockFlowImpl extends EMPFlowImpl implements EMPClockFlow {
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EMPActivity activity = null;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected EMPClock clock = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMPClockFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcesspackagePackage.Literals.EMP_CLOCK_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPActivity getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject)activity;
			activity = (EMPActivity)eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_CLOCK_FLOW__ACTIVITY, oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPActivity basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(EMPActivity newActivity, NotificationChain msgs) {
		EMPActivity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_CLOCK_FLOW__ACTIVITY, oldActivity, newActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(EMPActivity newActivity) {
		if (newActivity != activity) {
			NotificationChain msgs = null;
			if (activity != null)
				msgs = ((InternalEObject)activity).eInverseRemove(this, ProcesspackagePackage.EMP_ACTIVITY__CLOCK_FLOW, EMPActivity.class, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, ProcesspackagePackage.EMP_ACTIVITY__CLOCK_FLOW, EMPActivity.class, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_CLOCK_FLOW__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPClock getClock() {
		if (clock != null && clock.eIsProxy()) {
			InternalEObject oldClock = (InternalEObject)clock;
			clock = (EMPClock)eResolveProxy(oldClock);
			if (clock != oldClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_CLOCK_FLOW__CLOCK, oldClock, clock));
			}
		}
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPClock basicGetClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClock(EMPClock newClock, NotificationChain msgs) {
		EMPClock oldClock = clock;
		clock = newClock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_CLOCK_FLOW__CLOCK, oldClock, newClock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(EMPClock newClock) {
		if (newClock != clock) {
			NotificationChain msgs = null;
			if (clock != null)
				msgs = ((InternalEObject)clock).eInverseRemove(this, ProcesspackagePackage.EMP_CLOCK__CLOCK_FLOWS, EMPClock.class, msgs);
			if (newClock != null)
				msgs = ((InternalEObject)newClock).eInverseAdd(this, ProcesspackagePackage.EMP_CLOCK__CLOCK_FLOWS, EMPClock.class, msgs);
			msgs = basicSetClock(newClock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_CLOCK_FLOW__CLOCK, newClock, newClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPDiagram getEmpDiagram() {
		if (eContainerFeatureID != ProcesspackagePackage.EMP_CLOCK_FLOW__EMP_DIAGRAM) return null;
		return (EMPDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpDiagram(EMPDiagram newEmpDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmpDiagram, ProcesspackagePackage.EMP_CLOCK_FLOW__EMP_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpDiagram(EMPDiagram newEmpDiagram) {
		if (newEmpDiagram != eInternalContainer() || (eContainerFeatureID != ProcesspackagePackage.EMP_CLOCK_FLOW__EMP_DIAGRAM && newEmpDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmpDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmpDiagram != null)
				msgs = ((InternalEObject)newEmpDiagram).eInverseAdd(this, ProcesspackagePackage.EMP_DIAGRAM__CLOCK_FLOWS, EMPDiagram.class, msgs);
			msgs = basicSetEmpDiagram(newEmpDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_CLOCK_FLOW__EMP_DIAGRAM, newEmpDiagram, newEmpDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_CLOCK_FLOW__ACTIVITY:
				if (activity != null)
					msgs = ((InternalEObject)activity).eInverseRemove(this, ProcesspackagePackage.EMP_ACTIVITY__CLOCK_FLOW, EMPActivity.class, msgs);
				return basicSetActivity((EMPActivity)otherEnd, msgs);
			case ProcesspackagePackage.EMP_CLOCK_FLOW__CLOCK:
				if (clock != null)
					msgs = ((InternalEObject)clock).eInverseRemove(this, ProcesspackagePackage.EMP_CLOCK__CLOCK_FLOWS, EMPClock.class, msgs);
				return basicSetClock((EMPClock)otherEnd, msgs);
			case ProcesspackagePackage.EMP_CLOCK_FLOW__EMP_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmpDiagram((EMPDiagram)otherEnd, msgs);
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
			case ProcesspackagePackage.EMP_CLOCK_FLOW__ACTIVITY:
				return basicSetActivity(null, msgs);
			case ProcesspackagePackage.EMP_CLOCK_FLOW__CLOCK:
				return basicSetClock(null, msgs);
			case ProcesspackagePackage.EMP_CLOCK_FLOW__EMP_DIAGRAM:
				return basicSetEmpDiagram(null, msgs);
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
			case ProcesspackagePackage.EMP_CLOCK_FLOW__EMP_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ProcesspackagePackage.EMP_DIAGRAM__CLOCK_FLOWS, EMPDiagram.class, msgs);
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
			case ProcesspackagePackage.EMP_CLOCK_FLOW__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
			case ProcesspackagePackage.EMP_CLOCK_FLOW__CLOCK:
				if (resolve) return getClock();
				return basicGetClock();
			case ProcesspackagePackage.EMP_CLOCK_FLOW__EMP_DIAGRAM:
				return getEmpDiagram();
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
			case ProcesspackagePackage.EMP_CLOCK_FLOW__ACTIVITY:
				setActivity((EMPActivity)newValue);
				return;
			case ProcesspackagePackage.EMP_CLOCK_FLOW__CLOCK:
				setClock((EMPClock)newValue);
				return;
			case ProcesspackagePackage.EMP_CLOCK_FLOW__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)newValue);
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
			case ProcesspackagePackage.EMP_CLOCK_FLOW__ACTIVITY:
				setActivity((EMPActivity)null);
				return;
			case ProcesspackagePackage.EMP_CLOCK_FLOW__CLOCK:
				setClock((EMPClock)null);
				return;
			case ProcesspackagePackage.EMP_CLOCK_FLOW__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)null);
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
			case ProcesspackagePackage.EMP_CLOCK_FLOW__ACTIVITY:
				return activity != null;
			case ProcesspackagePackage.EMP_CLOCK_FLOW__CLOCK:
				return clock != null;
			case ProcesspackagePackage.EMP_CLOCK_FLOW__EMP_DIAGRAM:
				return getEmpDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

} //EMPClockFlowImpl
