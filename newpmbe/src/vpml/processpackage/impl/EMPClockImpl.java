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

import vpml.processpackage.EMPClock;
import vpml.processpackage.EMPClockFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.ProcesspackagePackage;

import vpml.utilpackage.EnumTimeUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMP Clock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.processpackage.impl.EMPClockImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPClockImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPClockImpl#getRestartPeriod <em>Restart Period</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPClockImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPClockImpl#getTqFlag <em>Tq Flag</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPClockImpl#getEFlag <em>EFlag</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPClockImpl#getIntervalValue <em>Interval Value</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPClockImpl#getIntervalUnit <em>Interval Unit</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPClockImpl#getClockFlows <em>Clock Flows</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPClockImpl#getEmpDiagram <em>Emp Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMPClockImpl extends EMPObjectImpl implements EMPClock {
	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final double START_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected double startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final double END_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected double endTime = END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestartPeriod() <em>Restart Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int RESTART_PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRestartPeriod() <em>Restart Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartPeriod()
	 * @generated
	 * @ordered
	 */
	protected int restartPeriod = RESTART_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final EnumTimeUnit TIME_UNIT_EDEFAULT = EnumTimeUnit.HOUR_LITERAL;

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected EnumTimeUnit timeUnit = TIME_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTqFlag() <em>Tq Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTqFlag()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TQ_FLAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTqFlag() <em>Tq Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTqFlag()
	 * @generated
	 * @ordered
	 */
	protected Boolean tqFlag = TQ_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getEFlag() <em>EFlag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFlag()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EFLAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEFlag() <em>EFlag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFlag()
	 * @generated
	 * @ordered
	 */
	protected Boolean eFlag = EFLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntervalValue() <em>Interval Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalValue()
	 * @generated
	 * @ordered
	 */
	protected static final double INTERVAL_VALUE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getIntervalValue() <em>Interval Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalValue()
	 * @generated
	 * @ordered
	 */
	protected double intervalValue = INTERVAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntervalUnit() <em>Interval Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalUnit()
	 * @generated
	 * @ordered
	 */
	protected static final EnumTimeUnit INTERVAL_UNIT_EDEFAULT = EnumTimeUnit.HOUR_LITERAL;

	/**
	 * The cached value of the '{@link #getIntervalUnit() <em>Interval Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalUnit()
	 * @generated
	 * @ordered
	 */
	protected EnumTimeUnit intervalUnit = INTERVAL_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClockFlows() <em>Clock Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockFlows()
	 * @generated
	 * @ordered
	 */
	protected EList clockFlows = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMPClockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcesspackagePackage.Literals.EMP_CLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(double newStartTime) {
		double oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_CLOCK__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(double newEndTime) {
		double oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_CLOCK__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRestartPeriod() {
		return restartPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestartPeriod(int newRestartPeriod) {
		int oldRestartPeriod = restartPeriod;
		restartPeriod = newRestartPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_CLOCK__RESTART_PERIOD, oldRestartPeriod, restartPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTimeUnit getTimeUnit() {
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnit(EnumTimeUnit newTimeUnit) {
		EnumTimeUnit oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit == null ? TIME_UNIT_EDEFAULT : newTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_CLOCK__TIME_UNIT, oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTqFlag() {
		return tqFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTqFlag(Boolean newTqFlag) {
		Boolean oldTqFlag = tqFlag;
		tqFlag = newTqFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_CLOCK__TQ_FLAG, oldTqFlag, tqFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEFlag() {
		return eFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEFlag(Boolean newEFlag) {
		Boolean oldEFlag = eFlag;
		eFlag = newEFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_CLOCK__EFLAG, oldEFlag, eFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIntervalValue() {
		return intervalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalValue(double newIntervalValue) {
		double oldIntervalValue = intervalValue;
		intervalValue = newIntervalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_CLOCK__INTERVAL_VALUE, oldIntervalValue, intervalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTimeUnit getIntervalUnit() {
		return intervalUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalUnit(EnumTimeUnit newIntervalUnit) {
		EnumTimeUnit oldIntervalUnit = intervalUnit;
		intervalUnit = newIntervalUnit == null ? INTERVAL_UNIT_EDEFAULT : newIntervalUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_CLOCK__INTERVAL_UNIT, oldIntervalUnit, intervalUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClockFlows() {
		if (clockFlows == null) {
			clockFlows = new EObjectWithInverseResolvingEList(EMPClockFlow.class, this, ProcesspackagePackage.EMP_CLOCK__CLOCK_FLOWS, ProcesspackagePackage.EMP_CLOCK_FLOW__CLOCK);
		}
		return clockFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPDiagram getEmpDiagram() {
		if (eContainerFeatureID != ProcesspackagePackage.EMP_CLOCK__EMP_DIAGRAM) return null;
		return (EMPDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpDiagram(EMPDiagram newEmpDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmpDiagram, ProcesspackagePackage.EMP_CLOCK__EMP_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpDiagram(EMPDiagram newEmpDiagram) {
		if (newEmpDiagram != eInternalContainer() || (eContainerFeatureID != ProcesspackagePackage.EMP_CLOCK__EMP_DIAGRAM && newEmpDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmpDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmpDiagram != null)
				msgs = ((InternalEObject)newEmpDiagram).eInverseAdd(this, ProcesspackagePackage.EMP_DIAGRAM__CLOCKS, EMPDiagram.class, msgs);
			msgs = basicSetEmpDiagram(newEmpDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_CLOCK__EMP_DIAGRAM, newEmpDiagram, newEmpDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_CLOCK__CLOCK_FLOWS:
				return ((InternalEList)getClockFlows()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_CLOCK__EMP_DIAGRAM:
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
			case ProcesspackagePackage.EMP_CLOCK__CLOCK_FLOWS:
				return ((InternalEList)getClockFlows()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_CLOCK__EMP_DIAGRAM:
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
			case ProcesspackagePackage.EMP_CLOCK__EMP_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ProcesspackagePackage.EMP_DIAGRAM__CLOCKS, EMPDiagram.class, msgs);
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
			case ProcesspackagePackage.EMP_CLOCK__START_TIME:
				return new Double(getStartTime());
			case ProcesspackagePackage.EMP_CLOCK__END_TIME:
				return new Double(getEndTime());
			case ProcesspackagePackage.EMP_CLOCK__RESTART_PERIOD:
				return new Integer(getRestartPeriod());
			case ProcesspackagePackage.EMP_CLOCK__TIME_UNIT:
				return getTimeUnit();
			case ProcesspackagePackage.EMP_CLOCK__TQ_FLAG:
				return getTqFlag();
			case ProcesspackagePackage.EMP_CLOCK__EFLAG:
				return getEFlag();
			case ProcesspackagePackage.EMP_CLOCK__INTERVAL_VALUE:
				return new Double(getIntervalValue());
			case ProcesspackagePackage.EMP_CLOCK__INTERVAL_UNIT:
				return getIntervalUnit();
			case ProcesspackagePackage.EMP_CLOCK__CLOCK_FLOWS:
				return getClockFlows();
			case ProcesspackagePackage.EMP_CLOCK__EMP_DIAGRAM:
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
			case ProcesspackagePackage.EMP_CLOCK__START_TIME:
				setStartTime(((Double)newValue).doubleValue());
				return;
			case ProcesspackagePackage.EMP_CLOCK__END_TIME:
				setEndTime(((Double)newValue).doubleValue());
				return;
			case ProcesspackagePackage.EMP_CLOCK__RESTART_PERIOD:
				setRestartPeriod(((Integer)newValue).intValue());
				return;
			case ProcesspackagePackage.EMP_CLOCK__TIME_UNIT:
				setTimeUnit((EnumTimeUnit)newValue);
				return;
			case ProcesspackagePackage.EMP_CLOCK__TQ_FLAG:
				setTqFlag((Boolean)newValue);
				return;
			case ProcesspackagePackage.EMP_CLOCK__EFLAG:
				setEFlag((Boolean)newValue);
				return;
			case ProcesspackagePackage.EMP_CLOCK__INTERVAL_VALUE:
				setIntervalValue(((Double)newValue).doubleValue());
				return;
			case ProcesspackagePackage.EMP_CLOCK__INTERVAL_UNIT:
				setIntervalUnit((EnumTimeUnit)newValue);
				return;
			case ProcesspackagePackage.EMP_CLOCK__CLOCK_FLOWS:
				getClockFlows().clear();
				getClockFlows().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_CLOCK__EMP_DIAGRAM:
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
			case ProcesspackagePackage.EMP_CLOCK__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_CLOCK__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_CLOCK__RESTART_PERIOD:
				setRestartPeriod(RESTART_PERIOD_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_CLOCK__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_CLOCK__TQ_FLAG:
				setTqFlag(TQ_FLAG_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_CLOCK__EFLAG:
				setEFlag(EFLAG_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_CLOCK__INTERVAL_VALUE:
				setIntervalValue(INTERVAL_VALUE_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_CLOCK__INTERVAL_UNIT:
				setIntervalUnit(INTERVAL_UNIT_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_CLOCK__CLOCK_FLOWS:
				getClockFlows().clear();
				return;
			case ProcesspackagePackage.EMP_CLOCK__EMP_DIAGRAM:
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
			case ProcesspackagePackage.EMP_CLOCK__START_TIME:
				return startTime != START_TIME_EDEFAULT;
			case ProcesspackagePackage.EMP_CLOCK__END_TIME:
				return endTime != END_TIME_EDEFAULT;
			case ProcesspackagePackage.EMP_CLOCK__RESTART_PERIOD:
				return restartPeriod != RESTART_PERIOD_EDEFAULT;
			case ProcesspackagePackage.EMP_CLOCK__TIME_UNIT:
				return timeUnit != TIME_UNIT_EDEFAULT;
			case ProcesspackagePackage.EMP_CLOCK__TQ_FLAG:
				return TQ_FLAG_EDEFAULT == null ? tqFlag != null : !TQ_FLAG_EDEFAULT.equals(tqFlag);
			case ProcesspackagePackage.EMP_CLOCK__EFLAG:
				return EFLAG_EDEFAULT == null ? eFlag != null : !EFLAG_EDEFAULT.equals(eFlag);
			case ProcesspackagePackage.EMP_CLOCK__INTERVAL_VALUE:
				return intervalValue != INTERVAL_VALUE_EDEFAULT;
			case ProcesspackagePackage.EMP_CLOCK__INTERVAL_UNIT:
				return intervalUnit != INTERVAL_UNIT_EDEFAULT;
			case ProcesspackagePackage.EMP_CLOCK__CLOCK_FLOWS:
				return clockFlows != null && !clockFlows.isEmpty();
			case ProcesspackagePackage.EMP_CLOCK__EMP_DIAGRAM:
				return getEmpDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", restartPeriod: ");
		result.append(restartPeriod);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(", tqFlag: ");
		result.append(tqFlag);
		result.append(", eFlag: ");
		result.append(eFlag);
		result.append(", intervalValue: ");
		result.append(intervalValue);
		result.append(", intervalUnit: ");
		result.append(intervalUnit);
		result.append(')');
		return result.toString();
	}

} //EMPClockImpl
