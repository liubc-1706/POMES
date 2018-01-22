/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vpml.organizationpackage.EMOResourceGroupType;
import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.resourcepackage.EMRBasicResourceType;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMR Basic Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.resourcepackage.impl.EMRBasicResourceTypeImpl#getResourceGroupTypes <em>Resource Group Types</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRBasicResourceTypeImpl#getCostPerUnit <em>Cost Per Unit</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRBasicResourceTypeImpl#getTotalAmount <em>Total Amount</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRBasicResourceTypeImpl#getUsageAmount <em>Usage Amount</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRBasicResourceTypeImpl#getAvailableAmount <em>Available Amount</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRBasicResourceTypeImpl#getEfficiency <em>Efficiency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMRBasicResourceTypeImpl extends EMRResourceTypeImpl implements EMRBasicResourceType {
	/**
	 * The cached value of the '{@link #getResourceGroupTypes() <em>Resource Group Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceGroupTypes()
	 * @generated
	 * @ordered
	 */
	protected EList resourceGroupTypes = null;

	/**
	 * The default value of the '{@link #getCostPerUnit() <em>Cost Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Double COST_PER_UNIT_EDEFAULT = new Double(10.0);

	/**
	 * The cached value of the '{@link #getCostPerUnit() <em>Cost Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerUnit()
	 * @generated
	 * @ordered
	 */
	protected Double costPerUnit = COST_PER_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalAmount() <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOTAL_AMOUNT_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getTotalAmount() <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmount()
	 * @generated
	 * @ordered
	 */
	protected Integer totalAmount = TOTAL_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsageAmount() <em>Usage Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageAmount()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Integer USAGE_AMOUNT_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getUsageAmount() <em>Usage Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageAmount()
	 * @generated
	 * @ordered
	 */
	protected Integer usageAmount = USAGE_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableAmount() <em>Available Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableAmount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AVAILABLE_AMOUNT_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getAvailableAmount() <em>Available Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableAmount()
	 * @generated
	 * @ordered
	 */
	protected Integer availableAmount = AVAILABLE_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfficiency()
	 * @generated
	 * @ordered
	 */
	protected static final Double EFFICIENCY_EDEFAULT = new Double(1.0);

	/**
	 * The cached value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfficiency()
	 * @generated
	 * @ordered
	 */
	protected Double efficiency = EFFICIENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMRBasicResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ResourcepackagePackage.Literals.EMR_BASIC_RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResourceGroupTypes() {
		if (resourceGroupTypes == null) {
			resourceGroupTypes = new EObjectWithInverseResolvingEList.ManyInverse(EMOResourceGroupType.class, this, ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__RESOURCE_GROUP_TYPES, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__BASIC_RESOURCE_TYPES);
		}
		return resourceGroupTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCostPerUnit() {
		return costPerUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostPerUnit(Double newCostPerUnit) {
		Double oldCostPerUnit = costPerUnit;
		costPerUnit = newCostPerUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__COST_PER_UNIT, oldCostPerUnit, costPerUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTotalAmount() {
		return totalAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalAmount(Integer newTotalAmount) {
		Integer oldTotalAmount = totalAmount;
		totalAmount = newTotalAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__TOTAL_AMOUNT, oldTotalAmount, totalAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUsageAmount() {
		return usageAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageAmount(Integer newUsageAmount) {
		Integer oldUsageAmount = usageAmount;
		usageAmount = newUsageAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__USAGE_AMOUNT, oldUsageAmount, usageAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAvailableAmount() {
		return availableAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableAmount(Integer newAvailableAmount) {
		Integer oldAvailableAmount = availableAmount;
		availableAmount = newAvailableAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__AVAILABLE_AMOUNT, oldAvailableAmount, availableAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getEfficiency() {
		return efficiency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEfficiency(Double newEfficiency) {
		Double oldEfficiency = efficiency;
		efficiency = newEfficiency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__EFFICIENCY, oldEfficiency, efficiency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__RESOURCE_GROUP_TYPES:
				return ((InternalEList)getResourceGroupTypes()).basicAdd(otherEnd, msgs);
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
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__RESOURCE_GROUP_TYPES:
				return ((InternalEList)getResourceGroupTypes()).basicRemove(otherEnd, msgs);
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
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__RESOURCE_GROUP_TYPES:
				return getResourceGroupTypes();
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__COST_PER_UNIT:
				return getCostPerUnit();
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__TOTAL_AMOUNT:
				return getTotalAmount();
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__USAGE_AMOUNT:
				return getUsageAmount();
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__AVAILABLE_AMOUNT:
				return getAvailableAmount();
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__EFFICIENCY:
				return getEfficiency();
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
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__RESOURCE_GROUP_TYPES:
				getResourceGroupTypes().clear();
				getResourceGroupTypes().addAll((Collection)newValue);
				return;
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__COST_PER_UNIT:
				setCostPerUnit((Double)newValue);
				return;
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__TOTAL_AMOUNT:
				setTotalAmount((Integer)newValue);
				return;
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__USAGE_AMOUNT:
				setUsageAmount((Integer)newValue);
				return;
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__AVAILABLE_AMOUNT:
				setAvailableAmount((Integer)newValue);
				return;
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__EFFICIENCY:
				setEfficiency((Double)newValue);
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
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__RESOURCE_GROUP_TYPES:
				getResourceGroupTypes().clear();
				return;
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__COST_PER_UNIT:
				setCostPerUnit(COST_PER_UNIT_EDEFAULT);
				return;
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__TOTAL_AMOUNT:
				setTotalAmount(TOTAL_AMOUNT_EDEFAULT);
				return;
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__USAGE_AMOUNT:
				setUsageAmount(USAGE_AMOUNT_EDEFAULT);
				return;
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__AVAILABLE_AMOUNT:
				setAvailableAmount(AVAILABLE_AMOUNT_EDEFAULT);
				return;
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__EFFICIENCY:
				setEfficiency(EFFICIENCY_EDEFAULT);
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
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__RESOURCE_GROUP_TYPES:
				return resourceGroupTypes != null && !resourceGroupTypes.isEmpty();
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__COST_PER_UNIT:
				return COST_PER_UNIT_EDEFAULT == null ? costPerUnit != null : !COST_PER_UNIT_EDEFAULT.equals(costPerUnit);
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__TOTAL_AMOUNT:
				return TOTAL_AMOUNT_EDEFAULT == null ? totalAmount != null : !TOTAL_AMOUNT_EDEFAULT.equals(totalAmount);
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__USAGE_AMOUNT:
				return USAGE_AMOUNT_EDEFAULT == null ? usageAmount != null : !USAGE_AMOUNT_EDEFAULT.equals(usageAmount);
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__AVAILABLE_AMOUNT:
				return AVAILABLE_AMOUNT_EDEFAULT == null ? availableAmount != null : !AVAILABLE_AMOUNT_EDEFAULT.equals(availableAmount);
			case ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__EFFICIENCY:
				return EFFICIENCY_EDEFAULT == null ? efficiency != null : !EFFICIENCY_EDEFAULT.equals(efficiency);
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
		result.append(" (costPerUnit: ");
		result.append(costPerUnit);
		result.append(", totalAmount: ");
		result.append(totalAmount);
		result.append(", usageAmount: ");
		result.append(usageAmount);
		result.append(", availableAmount: ");
		result.append(availableAmount);
		result.append(", efficiency: ");
		result.append(efficiency);
		result.append(')');
		return result.toString();
	}

} //EMRBasicResourceTypeImpl
