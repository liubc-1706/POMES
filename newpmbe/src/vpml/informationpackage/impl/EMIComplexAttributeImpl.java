/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.informationpackage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vpml.informationpackage.EMIComplexAttribute;
import vpml.informationpackage.EMIComplexItem;
import vpml.informationpackage.InformationpackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMI Complex Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.informationpackage.impl.EMIComplexAttributeImpl#getComplexType <em>Complex Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMIComplexAttributeImpl extends EMIAttributeImpl implements EMIComplexAttribute {
	/**
	 * The cached value of the '{@link #getComplexType() <em>Complex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexType()
	 * @generated
	 * @ordered
	 */
	protected EMIComplexItem complexType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMIComplexAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InformationpackagePackage.Literals.EMI_COMPLEX_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIComplexItem getComplexType() {
		if (complexType != null && complexType.eIsProxy()) {
			InternalEObject oldComplexType = (InternalEObject)complexType;
			complexType = (EMIComplexItem)eResolveProxy(oldComplexType);
			if (complexType != oldComplexType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationpackagePackage.EMI_COMPLEX_ATTRIBUTE__COMPLEX_TYPE, oldComplexType, complexType));
			}
		}
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIComplexItem basicGetComplexType() {
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexType(EMIComplexItem newComplexType) {
		EMIComplexItem oldComplexType = complexType;
		complexType = newComplexType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationpackagePackage.EMI_COMPLEX_ATTRIBUTE__COMPLEX_TYPE, oldComplexType, complexType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InformationpackagePackage.EMI_COMPLEX_ATTRIBUTE__COMPLEX_TYPE:
				if (resolve) return getComplexType();
				return basicGetComplexType();
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
			case InformationpackagePackage.EMI_COMPLEX_ATTRIBUTE__COMPLEX_TYPE:
				setComplexType((EMIComplexItem)newValue);
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
			case InformationpackagePackage.EMI_COMPLEX_ATTRIBUTE__COMPLEX_TYPE:
				setComplexType((EMIComplexItem)null);
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
			case InformationpackagePackage.EMI_COMPLEX_ATTRIBUTE__COMPLEX_TYPE:
				return complexType != null;
		}
		return super.eIsSet(featureID);
	}

} //EMIComplexAttributeImpl
