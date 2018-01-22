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

import vpml.informationpackage.EMIAttribute;
import vpml.informationpackage.EMIForm;
import vpml.informationpackage.EMIList;
import vpml.informationpackage.InformationpackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMI Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.informationpackage.impl.EMIAttributeImpl#getMaximun <em>Maximun</em>}</li>
 *   <li>{@link vpml.informationpackage.impl.EMIAttributeImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link vpml.informationpackage.impl.EMIAttributeImpl#getForm <em>Form</em>}</li>
 *   <li>{@link vpml.informationpackage.impl.EMIAttributeImpl#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMIAttributeImpl extends EMObjectImpl implements EMIAttribute {
	/**
	 * The default value of the '{@link #getMaximun() <em>Maximun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximun()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUN_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getMaximun() <em>Maximun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximun()
	 * @generated
	 * @ordered
	 */
	protected Integer maximun = MAXIMUN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MINIMUM_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected Integer minimum = MINIMUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMIAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InformationpackagePackage.Literals.EMI_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaximun() {
		return maximun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximun(Integer newMaximun) {
		Integer oldMaximun = maximun;
		maximun = newMaximun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationpackagePackage.EMI_ATTRIBUTE__MAXIMUN, oldMaximun, maximun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(Integer newMinimum) {
		Integer oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationpackagePackage.EMI_ATTRIBUTE__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIForm getForm() {
		if (eContainerFeatureID != InformationpackagePackage.EMI_ATTRIBUTE__FORM) return null;
		return (EMIForm)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(EMIForm newForm, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newForm, InformationpackagePackage.EMI_ATTRIBUTE__FORM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(EMIForm newForm) {
		if (newForm != eInternalContainer() || (eContainerFeatureID != InformationpackagePackage.EMI_ATTRIBUTE__FORM && newForm != null)) {
			if (EcoreUtil.isAncestor(this, newForm))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, InformationpackagePackage.EMI_FORM__ATTRIBUTES, EMIForm.class, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationpackagePackage.EMI_ATTRIBUTE__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIList getList() {
		if (eContainerFeatureID != InformationpackagePackage.EMI_ATTRIBUTE__LIST) return null;
		return (EMIList)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(EMIList newList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newList, InformationpackagePackage.EMI_ATTRIBUTE__LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(EMIList newList) {
		if (newList != eInternalContainer() || (eContainerFeatureID != InformationpackagePackage.EMI_ATTRIBUTE__LIST && newList != null)) {
			if (EcoreUtil.isAncestor(this, newList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newList != null)
				msgs = ((InternalEObject)newList).eInverseAdd(this, InformationpackagePackage.EMI_LIST__ATTRIBUTES, EMIList.class, msgs);
			msgs = basicSetList(newList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationpackagePackage.EMI_ATTRIBUTE__LIST, newList, newList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InformationpackagePackage.EMI_ATTRIBUTE__FORM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetForm((EMIForm)otherEnd, msgs);
			case InformationpackagePackage.EMI_ATTRIBUTE__LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetList((EMIList)otherEnd, msgs);
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
			case InformationpackagePackage.EMI_ATTRIBUTE__FORM:
				return basicSetForm(null, msgs);
			case InformationpackagePackage.EMI_ATTRIBUTE__LIST:
				return basicSetList(null, msgs);
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
			case InformationpackagePackage.EMI_ATTRIBUTE__FORM:
				return eInternalContainer().eInverseRemove(this, InformationpackagePackage.EMI_FORM__ATTRIBUTES, EMIForm.class, msgs);
			case InformationpackagePackage.EMI_ATTRIBUTE__LIST:
				return eInternalContainer().eInverseRemove(this, InformationpackagePackage.EMI_LIST__ATTRIBUTES, EMIList.class, msgs);
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
			case InformationpackagePackage.EMI_ATTRIBUTE__MAXIMUN:
				return getMaximun();
			case InformationpackagePackage.EMI_ATTRIBUTE__MINIMUM:
				return getMinimum();
			case InformationpackagePackage.EMI_ATTRIBUTE__FORM:
				return getForm();
			case InformationpackagePackage.EMI_ATTRIBUTE__LIST:
				return getList();
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
			case InformationpackagePackage.EMI_ATTRIBUTE__MAXIMUN:
				setMaximun((Integer)newValue);
				return;
			case InformationpackagePackage.EMI_ATTRIBUTE__MINIMUM:
				setMinimum((Integer)newValue);
				return;
			case InformationpackagePackage.EMI_ATTRIBUTE__FORM:
				setForm((EMIForm)newValue);
				return;
			case InformationpackagePackage.EMI_ATTRIBUTE__LIST:
				setList((EMIList)newValue);
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
			case InformationpackagePackage.EMI_ATTRIBUTE__MAXIMUN:
				setMaximun(MAXIMUN_EDEFAULT);
				return;
			case InformationpackagePackage.EMI_ATTRIBUTE__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case InformationpackagePackage.EMI_ATTRIBUTE__FORM:
				setForm((EMIForm)null);
				return;
			case InformationpackagePackage.EMI_ATTRIBUTE__LIST:
				setList((EMIList)null);
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
			case InformationpackagePackage.EMI_ATTRIBUTE__MAXIMUN:
				return MAXIMUN_EDEFAULT == null ? maximun != null : !MAXIMUN_EDEFAULT.equals(maximun);
			case InformationpackagePackage.EMI_ATTRIBUTE__MINIMUM:
				return MINIMUM_EDEFAULT == null ? minimum != null : !MINIMUM_EDEFAULT.equals(minimum);
			case InformationpackagePackage.EMI_ATTRIBUTE__FORM:
				return getForm() != null;
			case InformationpackagePackage.EMI_ATTRIBUTE__LIST:
				return getList() != null;
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
		result.append(" (maximun: ");
		result.append(maximun);
		result.append(", minimum: ");
		result.append(minimum);
		result.append(')');
		return result.toString();
	}

} //EMIAttributeImpl
