/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vpml.processpackage.EMPBatchActivity;
import vpml.processpackage.ProcesspackagePackage;

import vpml.utilpackage.EnumBatchType;
import vpml.utilpackage.EnumTimeUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMP Batch Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.processpackage.impl.EMPBatchActivityImpl#getBatchType <em>Batch Type</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPBatchActivityImpl#getBatStartTime <em>Bat Start Time</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPBatchActivityImpl#getBatEndTime <em>Bat End Time</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPBatchActivityImpl#getRestartPeriod <em>Restart Period</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPBatchActivityImpl#getBatTimeUnit <em>Bat Time Unit</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPBatchActivityImpl#getTimerQueueFlag <em>Timer Queue Flag</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPBatchActivityImpl#getEmergencyFlag <em>Emergency Flag</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPBatchActivityImpl#getIntervalValue <em>Interval Value</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPBatchActivityImpl#getIntervalTimeUnit <em>Interval Time Unit</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPBatchActivityImpl#getMaxQuantity <em>Max Quantity</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPBatchActivityImpl#getMinQuantity <em>Min Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMPBatchActivityImpl extends EMPLeafActivityImpl implements EMPBatchActivity {
	/**
	 * The default value of the '{@link #getBatchType() <em>Batch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumBatchType BATCH_TYPE_EDEFAULT = EnumBatchType.TIME_ONLY_LITERAL;

	/**
	 * The cached value of the '{@link #getBatchType() <em>Batch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchType()
	 * @generated
	 * @ordered
	 */
	protected EnumBatchType batchType = BATCH_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBatStartTime() <em>Bat Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Double BAT_START_TIME_EDEFAULT = new Double(0.0);

	protected Double batStartTime = new Double(0.0);
	/**
	 * The default value of the '{@link #getBatEndTime() <em>Bat End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Double BAT_END_TIME_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getBatEndTime() <em>Bat End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatEndTime()
	 * @generated
	 * @ordered
	 */
	protected Double batEndTime = BAT_END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestartPeriod() <em>Restart Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Double RESTART_PERIOD_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getRestartPeriod() <em>Restart Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartPeriod()
	 * @generated
	 * @ordered
	 */
	protected Double restartPeriod = RESTART_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getBatTimeUnit() <em>Bat Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final EnumTimeUnit BAT_TIME_UNIT_EDEFAULT = EnumTimeUnit.HOUR_LITERAL;

	/**
	 * The cached value of the '{@link #getBatTimeUnit() <em>Bat Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected EnumTimeUnit batTimeUnit = BAT_TIME_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimerQueueFlag() <em>Timer Queue Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerQueueFlag()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TIMER_QUEUE_FLAG_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getTimerQueueFlag() <em>Timer Queue Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerQueueFlag()
	 * @generated
	 * @ordered
	 */
	protected Boolean timerQueueFlag = TIMER_QUEUE_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmergencyFlag() <em>Emergency Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyFlag()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EMERGENCY_FLAG_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getEmergencyFlag() <em>Emergency Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyFlag()
	 * @generated
	 * @ordered
	 */
	protected Boolean emergencyFlag = EMERGENCY_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntervalValue() <em>Interval Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double INTERVAL_VALUE_EDEFAULT = new Double(1.0);

	/**
	 * The cached value of the '{@link #getIntervalValue() <em>Interval Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalValue()
	 * @generated
	 * @ordered
	 */
	protected Double intervalValue = INTERVAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntervalTimeUnit() <em>Interval Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final EnumTimeUnit INTERVAL_TIME_UNIT_EDEFAULT = EnumTimeUnit.HOUR_LITERAL;

	/**
	 * The cached value of the '{@link #getIntervalTimeUnit() <em>Interval Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected EnumTimeUnit intervalTimeUnit = INTERVAL_TIME_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxQuantity() <em>Max Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_QUANTITY_EDEFAULT = new Integer(10);

	/**
	 * The cached value of the '{@link #getMaxQuantity() <em>Max Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQuantity()
	 * @generated
	 * @ordered
	 */
	protected Integer maxQuantity = MAX_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinQuantity() <em>Min Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_QUANTITY_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getMinQuantity() <em>Min Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQuantity()
	 * @generated
	 * @ordered
	 */
	protected Integer minQuantity = MIN_QUANTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMPBatchActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumBatchType getBatchType() {
		return batchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatchType(EnumBatchType newBatchType) {
		EnumBatchType oldBatchType = batchType;
		batchType = newBatchType == null ? BATCH_TYPE_EDEFAULT : newBatchType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_BATCH_ACTIVITY__BATCH_TYPE, oldBatchType, batchType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRestartPeriod() {
		return restartPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestartPeriod(Double newRestartPeriod) {
		Double oldRestartPeriod = restartPeriod;
		restartPeriod = newRestartPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_BATCH_ACTIVITY__RESTART_PERIOD, oldRestartPeriod, restartPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTimeUnit getBatTimeUnit() {
		return batTimeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatTimeUnit(EnumTimeUnit newBatTimeUnit) {
		EnumTimeUnit oldBatTimeUnit = batTimeUnit;
		batTimeUnit = newBatTimeUnit == null ? BAT_TIME_UNIT_EDEFAULT : newBatTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_TIME_UNIT, oldBatTimeUnit, batTimeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTimerQueueFlag() {
		return timerQueueFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimerQueueFlag(Boolean newTimerQueueFlag) {
		Boolean oldTimerQueueFlag = timerQueueFlag;
		timerQueueFlag = newTimerQueueFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_BATCH_ACTIVITY__TIMER_QUEUE_FLAG, oldTimerQueueFlag, timerQueueFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEmergencyFlag() {
		return emergencyFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmergencyFlag(Boolean newEmergencyFlag) {
		Boolean oldEmergencyFlag = emergencyFlag;
		emergencyFlag = newEmergencyFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_BATCH_ACTIVITY__EMERGENCY_FLAG, oldEmergencyFlag, emergencyFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIntervalValue() {
		return intervalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalValue(Double newIntervalValue) {
		Double oldIntervalValue = intervalValue;
		intervalValue = newIntervalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_BATCH_ACTIVITY__INTERVAL_VALUE, oldIntervalValue, intervalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTimeUnit getIntervalTimeUnit() {
		return intervalTimeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalTimeUnit(EnumTimeUnit newIntervalTimeUnit) {
		EnumTimeUnit oldIntervalTimeUnit = intervalTimeUnit;
		intervalTimeUnit = newIntervalTimeUnit == null ? INTERVAL_TIME_UNIT_EDEFAULT : newIntervalTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_BATCH_ACTIVITY__INTERVAL_TIME_UNIT, oldIntervalTimeUnit, intervalTimeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxQuantity() {
		return maxQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxQuantity(Integer newMaxQuantity) {
		Integer oldMaxQuantity = maxQuantity;
		maxQuantity = newMaxQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_BATCH_ACTIVITY__MAX_QUANTITY, oldMaxQuantity, maxQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinQuantity() {
		return minQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinQuantity(Integer newMinQuantity) {
		Integer oldMinQuantity = minQuantity;
		minQuantity = newMinQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_BATCH_ACTIVITY__MIN_QUANTITY, oldMinQuantity, minQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BATCH_TYPE:
				return getBatchType();
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_START_TIME:
				return getBatStartTime();
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_END_TIME:
				return getBatEndTime();
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__RESTART_PERIOD:
				return getRestartPeriod();
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_TIME_UNIT:
				return getBatTimeUnit();
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__TIMER_QUEUE_FLAG:
				return getTimerQueueFlag();
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__EMERGENCY_FLAG:
				return getEmergencyFlag();
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__INTERVAL_VALUE:
				return getIntervalValue();
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__INTERVAL_TIME_UNIT:
				return getIntervalTimeUnit();
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__MAX_QUANTITY:
				return getMaxQuantity();
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__MIN_QUANTITY:
				return getMinQuantity();
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
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BATCH_TYPE:
				setBatchType((EnumBatchType)newValue);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_START_TIME:
				setBatStartTime((Double)newValue);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_END_TIME:
				setBatEndTime((Double)newValue);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__RESTART_PERIOD:
				setRestartPeriod((Double)newValue);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_TIME_UNIT:
				setBatTimeUnit((EnumTimeUnit)newValue);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__TIMER_QUEUE_FLAG:
				setTimerQueueFlag((Boolean)newValue);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__EMERGENCY_FLAG:
				setEmergencyFlag((Boolean)newValue);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__INTERVAL_VALUE:
				setIntervalValue((Double)newValue);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__INTERVAL_TIME_UNIT:
				setIntervalTimeUnit((EnumTimeUnit)newValue);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__MAX_QUANTITY:
				setMaxQuantity((Integer)newValue);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__MIN_QUANTITY:
				setMinQuantity((Integer)newValue);
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
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BATCH_TYPE:
				setBatchType(BATCH_TYPE_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_START_TIME:
				setBatStartTime(BAT_START_TIME_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_END_TIME:
				setBatEndTime(BAT_END_TIME_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__RESTART_PERIOD:
				setRestartPeriod(RESTART_PERIOD_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_TIME_UNIT:
				setBatTimeUnit(BAT_TIME_UNIT_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__TIMER_QUEUE_FLAG:
				setTimerQueueFlag(TIMER_QUEUE_FLAG_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__EMERGENCY_FLAG:
				setEmergencyFlag(EMERGENCY_FLAG_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__INTERVAL_VALUE:
				setIntervalValue(INTERVAL_VALUE_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__INTERVAL_TIME_UNIT:
				setIntervalTimeUnit(INTERVAL_TIME_UNIT_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__MAX_QUANTITY:
				setMaxQuantity(MAX_QUANTITY_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__MIN_QUANTITY:
				setMinQuantity(MIN_QUANTITY_EDEFAULT);
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
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BATCH_TYPE:
				return batchType != BATCH_TYPE_EDEFAULT;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_START_TIME:
				return BAT_START_TIME_EDEFAULT == null ? batStartTime != null : !BAT_START_TIME_EDEFAULT.equals(batStartTime);
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_END_TIME:
				return BAT_END_TIME_EDEFAULT == null ? batEndTime != null : !BAT_END_TIME_EDEFAULT.equals(batEndTime);
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__RESTART_PERIOD:
				return RESTART_PERIOD_EDEFAULT == null ? restartPeriod != null : !RESTART_PERIOD_EDEFAULT.equals(restartPeriod);
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_TIME_UNIT:
				return batTimeUnit != BAT_TIME_UNIT_EDEFAULT;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__TIMER_QUEUE_FLAG:
				return TIMER_QUEUE_FLAG_EDEFAULT == null ? timerQueueFlag != null : !TIMER_QUEUE_FLAG_EDEFAULT.equals(timerQueueFlag);
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__EMERGENCY_FLAG:
				return EMERGENCY_FLAG_EDEFAULT == null ? emergencyFlag != null : !EMERGENCY_FLAG_EDEFAULT.equals(emergencyFlag);
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__INTERVAL_VALUE:
				return INTERVAL_VALUE_EDEFAULT == null ? intervalValue != null : !INTERVAL_VALUE_EDEFAULT.equals(intervalValue);
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__INTERVAL_TIME_UNIT:
				return intervalTimeUnit != INTERVAL_TIME_UNIT_EDEFAULT;
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__MAX_QUANTITY:
				return MAX_QUANTITY_EDEFAULT == null ? maxQuantity != null : !MAX_QUANTITY_EDEFAULT.equals(maxQuantity);
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__MIN_QUANTITY:
				return MIN_QUANTITY_EDEFAULT == null ? minQuantity != null : !MIN_QUANTITY_EDEFAULT.equals(minQuantity);
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
		result.append(" (batchType: ");
		result.append(batchType);
		result.append(", batStartTime: ");
		result.append(batStartTime);
		result.append(", batEndTime: ");
		result.append(batEndTime);
		result.append(", restartPeriod: ");
		result.append(restartPeriod);
		result.append(", batTimeUnit: ");
		result.append(batTimeUnit);
		result.append(", timerQueueFlag: ");
		result.append(timerQueueFlag);
		result.append(", emergencyFlag: ");
		result.append(emergencyFlag);
		result.append(", intervalValue: ");
		result.append(intervalValue);
		result.append(", intervalTimeUnit: ");
		result.append(intervalTimeUnit);
		result.append(", maxQuantity: ");
		result.append(maxQuantity);
		result.append(", minQuantity: ");
		result.append(minQuantity);
		result.append(')');
		return result.toString();
	}

	public Double getBatStartTime() {
		// TODO Auto-generated method stub
		return batStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatStartTime(Double newBatStartTime) {
		Double oldBatStartTime = batStartTime;
		batStartTime = newBatStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_START_TIME, oldBatStartTime, batStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBatEndTime() {
		return batEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatEndTime(Double newBatEndTime) {
		Double oldBatEndTime = batEndTime;
		batEndTime = newBatEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_END_TIME, oldBatEndTime, batEndTime));
	}

} //EMPBatchActivityImpl
