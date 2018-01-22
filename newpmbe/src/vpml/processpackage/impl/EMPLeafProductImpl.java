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

import vpml.processpackage.EMPLeafProduct;
import vpml.processpackage.EMPProductPackage;
import vpml.processpackage.ProcesspackagePackage;

import vpml.utilpackage.DSDistribution;
import vpml.utilpackage.EnumIOType;
import vpml.utilpackage.EnumTimeUnit;
import vpml.utilpackage.impl.DSDistributionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMP Leaf Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.processpackage.impl.EMPLeafProductImpl#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPLeafProductImpl#getIoType <em>Io Type</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPLeafProductImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPLeafProductImpl#getDurationTime <em>Duration Time</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPLeafProductImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPLeafProductImpl#getInitQueue <em>Init Queue</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPLeafProductImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPLeafProductImpl#getTopProductPackage <em>Top Product Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMPLeafProductImpl extends EMPProductImpl implements EMPLeafProduct {
	/**
	 * The default value of the '{@link #getAttachment() <em>Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACHMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttachment() <em>Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected String attachment = ATTACHMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIoType() <em>Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumIOType IO_TYPE_EDEFAULT = EnumIOType.NON_SOURCE_LITERAL;

	/**
	 * The cached value of the '{@link #getIoType() <em>Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoType()
	 * @generated
	 * @ordered
	 */
	protected EnumIOType ioType = IO_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERIOD_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Integer period = PERIOD_EDEFAULT;

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
	 * The default value of the '{@link #getInitQueue() <em>Init Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitQueue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INIT_QUEUE_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getInitQueue() <em>Init Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitQueue()
	 * @generated
	 * @ordered
	 */
	protected Integer initQueue = INIT_QUEUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final Double COST_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected Double cost = COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMPLeafProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcesspackagePackage.Literals.EMP_LEAF_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttachment() {
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment(String newAttachment) {
		String oldAttachment = attachment;
		attachment = newAttachment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_LEAF_PRODUCT__ATTACHMENT, oldAttachment, attachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIOType getIoType() {
		return ioType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoType(EnumIOType newIoType) {
		EnumIOType oldIoType = ioType;
		ioType = newIoType == null ? IO_TYPE_EDEFAULT : newIoType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_LEAF_PRODUCT__IO_TYPE, oldIoType, ioType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Integer newPeriod) {
		Integer oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_LEAF_PRODUCT__PERIOD, oldPeriod, period));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_LEAF_PRODUCT__DURATION_TIME, oldDurationTime, newDurationTime);
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
				msgs = ((InternalEObject)durationTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcesspackagePackage.EMP_LEAF_PRODUCT__DURATION_TIME, null, msgs);
			if (newDurationTime != null)
				msgs = ((InternalEObject)newDurationTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcesspackagePackage.EMP_LEAF_PRODUCT__DURATION_TIME, null, msgs);
			msgs = basicSetDurationTime(newDurationTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_LEAF_PRODUCT__DURATION_TIME, newDurationTime, newDurationTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_LEAF_PRODUCT__TIME_UNIT, oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getInitQueue() {
		return initQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitQueue(Integer newInitQueue) {
		Integer oldInitQueue = initQueue;
		initQueue = newInitQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_LEAF_PRODUCT__INIT_QUEUE, oldInitQueue, initQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(Double newCost) {
		Double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_LEAF_PRODUCT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPProductPackage getTopProductPackage() {
		if (eContainerFeatureID != ProcesspackagePackage.EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE) return null;
		return (EMPProductPackage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopProductPackage(EMPProductPackage newTopProductPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTopProductPackage, ProcesspackagePackage.EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopProductPackage(EMPProductPackage newTopProductPackage) {
		if (newTopProductPackage != eInternalContainer() || (eContainerFeatureID != ProcesspackagePackage.EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE && newTopProductPackage != null)) {
			if (EcoreUtil.isAncestor(this, newTopProductPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTopProductPackage != null)
				msgs = ((InternalEObject)newTopProductPackage).eInverseAdd(this, ProcesspackagePackage.EMP_PRODUCT_PACKAGE__LEAF_PRODUCTS, EMPProductPackage.class, msgs);
			msgs = basicSetTopProductPackage(newTopProductPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE, newTopProductPackage, newTopProductPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTopProductPackage((EMPProductPackage)otherEnd, msgs);
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
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__DURATION_TIME:
				return basicSetDurationTime(null, msgs);
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE:
				return basicSetTopProductPackage(null, msgs);
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
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE:
				return eInternalContainer().eInverseRemove(this, ProcesspackagePackage.EMP_PRODUCT_PACKAGE__LEAF_PRODUCTS, EMPProductPackage.class, msgs);
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
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__ATTACHMENT:
				return getAttachment();
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__IO_TYPE:
				return getIoType();
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__PERIOD:
				return getPeriod();
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__DURATION_TIME:
				return getDurationTime();
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__TIME_UNIT:
				return getTimeUnit();
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__INIT_QUEUE:
				return getInitQueue();
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__COST:
				return getCost();
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE:
				return getTopProductPackage();
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
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__ATTACHMENT:
				setAttachment((String)newValue);
				return;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__IO_TYPE:
				setIoType((EnumIOType)newValue);
				return;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__PERIOD:
				setPeriod((Integer)newValue);
				return;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__DURATION_TIME:
				setDurationTime((DSDistribution)newValue);
				return;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__TIME_UNIT:
				setTimeUnit((EnumTimeUnit)newValue);
				return;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__INIT_QUEUE:
				setInitQueue((Integer)newValue);
				return;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__COST:
				setCost((Double)newValue);
				return;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE:
				setTopProductPackage((EMPProductPackage)newValue);
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
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__ATTACHMENT:
				setAttachment(ATTACHMENT_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__IO_TYPE:
				setIoType(IO_TYPE_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__DURATION_TIME:
				setDurationTime((DSDistribution)null);
				return;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__INIT_QUEUE:
				setInitQueue(INIT_QUEUE_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__COST:
				setCost(COST_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE:
				setTopProductPackage((EMPProductPackage)null);
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
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__ATTACHMENT:
				return ATTACHMENT_EDEFAULT == null ? attachment != null : !ATTACHMENT_EDEFAULT.equals(attachment);
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__IO_TYPE:
				return ioType != IO_TYPE_EDEFAULT;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__PERIOD:
				return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__DURATION_TIME:
				return durationTime != null;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__TIME_UNIT:
				return timeUnit != TIME_UNIT_EDEFAULT;
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__INIT_QUEUE:
				return INIT_QUEUE_EDEFAULT == null ? initQueue != null : !INIT_QUEUE_EDEFAULT.equals(initQueue);
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case ProcesspackagePackage.EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE:
				return getTopProductPackage() != null;
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
		result.append(" (attachment: ");
		result.append(attachment);
		result.append(", ioType: ");
		result.append(ioType);
		result.append(", period: ");
		result.append(period);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(", initQueue: ");
		result.append(initQueue);
		result.append(", cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //EMPLeafProductImpl
