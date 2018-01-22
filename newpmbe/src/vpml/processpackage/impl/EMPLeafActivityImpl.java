/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vpml.processpackage.EMPLeafActivity;
import vpml.processpackage.ProcesspackagePackage;

import vpml.utilpackage.DSDistribution;
import vpml.utilpackage.EnumTimeUnit;
import vpml.utilpackage.impl.DSDistributionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMP Leaf Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.processpackage.impl.EMPLeafActivityImpl#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPLeafActivityImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPLeafActivityImpl#getDurationTime <em>Duration Time</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPLeafActivityImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPLeafActivityImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMPLeafActivityImpl extends EMPActivityImpl implements EMPLeafActivity {
	/**
	 * The default value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DEFAULT_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDefault = IS_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDurationTime() <em>Duration Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationTime()
	 * @generated NOT xsm
	 * @ordered
	 */
	protected DSDistribution durationTime = new DSDistributionImpl();

	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated NOT
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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 50;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMPLeafActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcesspackagePackage.Literals.EMP_LEAF_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefault(Boolean newIsDefault) {
		Boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_LEAF_ACTIVITY__IS_DEFAULT, oldIsDefault, isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_LEAF_ACTIVITY__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSDistribution getDurationTime() {
		return durationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurationTime(DSDistribution newDurationTime, NotificationChain msgs) {
		DSDistribution oldDurationTime = durationTime;
		durationTime = newDurationTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_LEAF_ACTIVITY__DURATION_TIME, oldDurationTime, newDurationTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationTime(DSDistribution newDurationTime) {
		if (newDurationTime != durationTime) {
			NotificationChain msgs = null;
			if (durationTime != null)
				msgs = ((InternalEObject)durationTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcesspackagePackage.EMP_LEAF_ACTIVITY__DURATION_TIME, null, msgs);
			if (newDurationTime != null)
				msgs = ((InternalEObject)newDurationTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcesspackagePackage.EMP_LEAF_ACTIVITY__DURATION_TIME, null, msgs);
			msgs = basicSetDurationTime(newDurationTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_LEAF_ACTIVITY__DURATION_TIME, newDurationTime, newDurationTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_LEAF_ACTIVITY__TIME_UNIT, oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_LEAF_ACTIVITY__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__DURATION_TIME:
				return basicSetDurationTime(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__IS_DEFAULT:
				return getIsDefault();
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__START_TIME:
				return getStartTime();
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__DURATION_TIME:
				return getDurationTime();
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__TIME_UNIT:
				return getTimeUnit();
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__PRIORITY:
				return new Integer(getPriority());
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
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__IS_DEFAULT:
				setIsDefault((Boolean)newValue);
				return;
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__START_TIME:
				setStartTime((Date)newValue);
				return;
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__DURATION_TIME:
				setDurationTime((DSDistribution)newValue);
				return;
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__TIME_UNIT:
				setTimeUnit((EnumTimeUnit)newValue);
				return;
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__PRIORITY:
				setPriority(((Integer)newValue).intValue());
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
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__IS_DEFAULT:
				setIsDefault(IS_DEFAULT_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__DURATION_TIME:
				setDurationTime((DSDistribution)null);
				return;
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__IS_DEFAULT:
				return IS_DEFAULT_EDEFAULT == null ? isDefault != null : !IS_DEFAULT_EDEFAULT.equals(isDefault);
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__DURATION_TIME:
				return durationTime != null;
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__TIME_UNIT:
				return timeUnit != TIME_UNIT_EDEFAULT;
			case ProcesspackagePackage.EMP_LEAF_ACTIVITY__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
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
		result.append(" (isDefault: ");
		result.append(isDefault);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //EMPLeafActivityImpl
