/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.utilpackage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import vpml.utilpackage.DSDistribution;
import vpml.utilpackage.EnumDistribution;
import vpml.utilpackage.UtilpackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.utilpackage.impl.DSDistributionImpl#getType <em>Type</em>}</li>
 *   <li>{@link vpml.utilpackage.impl.DSDistributionImpl#getDArgument1 <em>DArgument1</em>}</li>
 *   <li>{@link vpml.utilpackage.impl.DSDistributionImpl#getDArgument2 <em>DArgument2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSDistributionImpl extends EObjectImpl implements DSDistribution {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumDistribution TYPE_EDEFAULT = EnumDistribution.DEFAULT_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EnumDistribution type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDArgument1() <em>DArgument1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDArgument1()
	 * @generated
	 * @ordered
	 */
	protected static final double DARGUMENT1_EDEFAULT = 10.0;

	/**
	 * The cached value of the '{@link #getDArgument1() <em>DArgument1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDArgument1()
	 * @generated
	 * @ordered
	 */
	protected double dArgument1 = DARGUMENT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDArgument2() <em>DArgument2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDArgument2()
	 * @generated
	 * @ordered
	 */
	protected static final double DARGUMENT2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDArgument2() <em>DArgument2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDArgument2()
	 * @generated
	 * @ordered
	 */
	protected double dArgument2 = DARGUMENT2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DSDistributionImpl() {
		super();
		this.type = EnumDistribution.DEFAULT_LITERAL;
	}
	
	public DSDistributionImpl(EnumDistribution disType) {
		super();
		this.type = disType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UtilpackagePackage.Literals.DS_DISTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDistribution getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EnumDistribution newType) {
		EnumDistribution oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilpackagePackage.DS_DISTRIBUTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDArgument1() {
		return dArgument1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDArgument1(double newDArgument1) {
		double oldDArgument1 = dArgument1;
		dArgument1 = newDArgument1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilpackagePackage.DS_DISTRIBUTION__DARGUMENT1, oldDArgument1, dArgument1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDArgument2() {
		return dArgument2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDArgument2(double newDArgument2) {
		double oldDArgument2 = dArgument2;
		dArgument2 = newDArgument2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilpackagePackage.DS_DISTRIBUTION__DARGUMENT2, oldDArgument2, dArgument2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UtilpackagePackage.DS_DISTRIBUTION__TYPE:
				return getType();
			case UtilpackagePackage.DS_DISTRIBUTION__DARGUMENT1:
				return new Double(getDArgument1());
			case UtilpackagePackage.DS_DISTRIBUTION__DARGUMENT2:
				return new Double(getDArgument2());
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
			case UtilpackagePackage.DS_DISTRIBUTION__TYPE:
				setType((EnumDistribution)newValue);
				return;
			case UtilpackagePackage.DS_DISTRIBUTION__DARGUMENT1:
				setDArgument1(((Double)newValue).doubleValue());
				return;
			case UtilpackagePackage.DS_DISTRIBUTION__DARGUMENT2:
				setDArgument2(((Double)newValue).doubleValue());
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
			case UtilpackagePackage.DS_DISTRIBUTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case UtilpackagePackage.DS_DISTRIBUTION__DARGUMENT1:
				setDArgument1(DARGUMENT1_EDEFAULT);
				return;
			case UtilpackagePackage.DS_DISTRIBUTION__DARGUMENT2:
				setDArgument2(DARGUMENT2_EDEFAULT);
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
			case UtilpackagePackage.DS_DISTRIBUTION__TYPE:
				return type != TYPE_EDEFAULT;
			case UtilpackagePackage.DS_DISTRIBUTION__DARGUMENT1:
				return dArgument1 != DARGUMENT1_EDEFAULT;
			case UtilpackagePackage.DS_DISTRIBUTION__DARGUMENT2:
				return dArgument2 != DARGUMENT2_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", dArgument1: ");
		result.append(dArgument1);
		result.append(", dArgument2: ");
		result.append(dArgument2);
		result.append(')');
		return result.toString();
	}

} //DSDistributionImpl
