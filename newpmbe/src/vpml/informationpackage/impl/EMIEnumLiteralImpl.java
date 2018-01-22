/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.informationpackage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import vpml.impl.EMObjectImpl;

import vpml.informationpackage.EMIEnum;
import vpml.informationpackage.EMIEnumLiteral;
import vpml.informationpackage.InformationpackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMI Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.informationpackage.impl.EMIEnumLiteralImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link vpml.informationpackage.impl.EMIEnumLiteralImpl#getValue <em>Value</em>}</li>
 *   <li>{@link vpml.informationpackage.impl.EMIEnumLiteralImpl#getEnum <em>Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMIEnumLiteralImpl extends EMObjectImpl implements EMIEnumLiteral {
	/**
	 * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected String literal = LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Integer value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMIEnumLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InformationpackagePackage.Literals.EMI_ENUM_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteral(String newLiteral) {
		String oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationpackagePackage.EMI_ENUM_LITERAL__LITERAL, oldLiteral, literal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Integer newValue) {
		Integer oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationpackagePackage.EMI_ENUM_LITERAL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIEnum getEnum() {
		if (eContainerFeatureID != InformationpackagePackage.EMI_ENUM_LITERAL__ENUM) return null;
		return (EMIEnum)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnum(EMIEnum newEnum, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnum, InformationpackagePackage.EMI_ENUM_LITERAL__ENUM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnum(EMIEnum newEnum) {
		if (newEnum != eInternalContainer() || (eContainerFeatureID != InformationpackagePackage.EMI_ENUM_LITERAL__ENUM && newEnum != null)) {
			if (EcoreUtil.isAncestor(this, newEnum))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnum != null)
				msgs = ((InternalEObject)newEnum).eInverseAdd(this, InformationpackagePackage.EMI_ENUM__LITERALS, EMIEnum.class, msgs);
			msgs = basicSetEnum(newEnum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationpackagePackage.EMI_ENUM_LITERAL__ENUM, newEnum, newEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InformationpackagePackage.EMI_ENUM_LITERAL__ENUM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnum((EMIEnum)otherEnd, msgs);
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
			case InformationpackagePackage.EMI_ENUM_LITERAL__ENUM:
				return basicSetEnum(null, msgs);
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
			case InformationpackagePackage.EMI_ENUM_LITERAL__ENUM:
				return eInternalContainer().eInverseRemove(this, InformationpackagePackage.EMI_ENUM__LITERALS, EMIEnum.class, msgs);
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
			case InformationpackagePackage.EMI_ENUM_LITERAL__LITERAL:
				return getLiteral();
			case InformationpackagePackage.EMI_ENUM_LITERAL__VALUE:
				return getValue();
			case InformationpackagePackage.EMI_ENUM_LITERAL__ENUM:
				return getEnum();
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
			case InformationpackagePackage.EMI_ENUM_LITERAL__LITERAL:
				setLiteral((String)newValue);
				return;
			case InformationpackagePackage.EMI_ENUM_LITERAL__VALUE:
				setValue((Integer)newValue);
				return;
			case InformationpackagePackage.EMI_ENUM_LITERAL__ENUM:
				setEnum((EMIEnum)newValue);
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
			case InformationpackagePackage.EMI_ENUM_LITERAL__LITERAL:
				setLiteral(LITERAL_EDEFAULT);
				return;
			case InformationpackagePackage.EMI_ENUM_LITERAL__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case InformationpackagePackage.EMI_ENUM_LITERAL__ENUM:
				setEnum((EMIEnum)null);
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
			case InformationpackagePackage.EMI_ENUM_LITERAL__LITERAL:
				return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
			case InformationpackagePackage.EMI_ENUM_LITERAL__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case InformationpackagePackage.EMI_ENUM_LITERAL__ENUM:
				return getEnum() != null;
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
		result.append(" (literal: ");
		result.append(literal);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //EMIEnumLiteralImpl
