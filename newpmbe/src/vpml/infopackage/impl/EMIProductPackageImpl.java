/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import vpml.infopackage.EMIDiagram;
import vpml.infopackage.EMIProductPackage;
import vpml.infopackage.InfopackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMI Product Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.infopackage.impl.EMIProductPackageImpl#getProductList <em>Product List</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIProductPackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIProductPackageImpl#getTopPackage <em>Top Package</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIProductPackageImpl#getProductPackageDiagram <em>Product Package Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMIProductPackageImpl extends EMIProductImpl implements EMIProductPackage {
	/**
	 * The default value of the '{@link #getProductList() <em>Product List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductList()
	 * @generated
	 * @ordered
	 */
	protected static final List PRODUCT_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductList() <em>Product List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductList()
	 * @generated
	 * @ordered
	 */
	protected List productList = PRODUCT_LIST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackages()
	 * @generated
	 * @ordered
	 */
	protected EList subPackages = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMIProductPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InfopackagePackage.Literals.EMI_PRODUCT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getProductList() {
		return productList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductList(List newProductList) {
		List oldProductList = productList;
		productList = newProductList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_LIST, oldProductList, productList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubPackages() {
		if (subPackages == null) {
			subPackages = new EObjectContainmentWithInverseEList(EMIProductPackage.class, this, InfopackagePackage.EMI_PRODUCT_PACKAGE__SUB_PACKAGES, InfopackagePackage.EMI_PRODUCT_PACKAGE__TOP_PACKAGE);
		}
		return subPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIProductPackage getTopPackage() {
		if (eContainerFeatureID != InfopackagePackage.EMI_PRODUCT_PACKAGE__TOP_PACKAGE) return null;
		return (EMIProductPackage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopPackage(EMIProductPackage newTopPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTopPackage, InfopackagePackage.EMI_PRODUCT_PACKAGE__TOP_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopPackage(EMIProductPackage newTopPackage) {
		if (newTopPackage != eInternalContainer() || (eContainerFeatureID != InfopackagePackage.EMI_PRODUCT_PACKAGE__TOP_PACKAGE && newTopPackage != null)) {
			if (EcoreUtil.isAncestor(this, newTopPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTopPackage != null)
				msgs = ((InternalEObject)newTopPackage).eInverseAdd(this, InfopackagePackage.EMI_PRODUCT_PACKAGE__SUB_PACKAGES, EMIProductPackage.class, msgs);
			msgs = basicSetTopPackage(newTopPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_PRODUCT_PACKAGE__TOP_PACKAGE, newTopPackage, newTopPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIDiagram getProductPackageDiagram() {
		if (eContainerFeatureID != InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_PACKAGE_DIAGRAM) return null;
		return (EMIDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductPackageDiagram(EMIDiagram newProductPackageDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProductPackageDiagram, InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_PACKAGE_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductPackageDiagram(EMIDiagram newProductPackageDiagram) {
		if (newProductPackageDiagram != eInternalContainer() || (eContainerFeatureID != InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_PACKAGE_DIAGRAM && newProductPackageDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newProductPackageDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProductPackageDiagram != null)
				msgs = ((InternalEObject)newProductPackageDiagram).eInverseAdd(this, InfopackagePackage.EMI_DIAGRAM__PRODUCT_PACKAGE, EMIDiagram.class, msgs);
			msgs = basicSetProductPackageDiagram(newProductPackageDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_PACKAGE_DIAGRAM, newProductPackageDiagram, newProductPackageDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__SUB_PACKAGES:
				return ((InternalEList)getSubPackages()).basicAdd(otherEnd, msgs);
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__TOP_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTopPackage((EMIProductPackage)otherEnd, msgs);
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_PACKAGE_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProductPackageDiagram((EMIDiagram)otherEnd, msgs);
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
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__SUB_PACKAGES:
				return ((InternalEList)getSubPackages()).basicRemove(otherEnd, msgs);
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__TOP_PACKAGE:
				return basicSetTopPackage(null, msgs);
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_PACKAGE_DIAGRAM:
				return basicSetProductPackageDiagram(null, msgs);
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
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__TOP_PACKAGE:
				return eInternalContainer().eInverseRemove(this, InfopackagePackage.EMI_PRODUCT_PACKAGE__SUB_PACKAGES, EMIProductPackage.class, msgs);
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_PACKAGE_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, InfopackagePackage.EMI_DIAGRAM__PRODUCT_PACKAGE, EMIDiagram.class, msgs);
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
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_LIST:
				return getProductList();
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__SUB_PACKAGES:
				return getSubPackages();
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__TOP_PACKAGE:
				return getTopPackage();
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_PACKAGE_DIAGRAM:
				return getProductPackageDiagram();
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
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_LIST:
				setProductList((List)newValue);
				return;
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				getSubPackages().addAll((Collection)newValue);
				return;
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__TOP_PACKAGE:
				setTopPackage((EMIProductPackage)newValue);
				return;
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_PACKAGE_DIAGRAM:
				setProductPackageDiagram((EMIDiagram)newValue);
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
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_LIST:
				setProductList(PRODUCT_LIST_EDEFAULT);
				return;
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				return;
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__TOP_PACKAGE:
				setTopPackage((EMIProductPackage)null);
				return;
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_PACKAGE_DIAGRAM:
				setProductPackageDiagram((EMIDiagram)null);
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
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_LIST:
				return PRODUCT_LIST_EDEFAULT == null ? productList != null : !PRODUCT_LIST_EDEFAULT.equals(productList);
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__SUB_PACKAGES:
				return subPackages != null && !subPackages.isEmpty();
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__TOP_PACKAGE:
				return getTopPackage() != null;
			case InfopackagePackage.EMI_PRODUCT_PACKAGE__PRODUCT_PACKAGE_DIAGRAM:
				return getProductPackageDiagram() != null;
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
		result.append(" (productList: ");
		result.append(productList);
		result.append(')');
		return result.toString();
	}

} //EMIProductPackageImpl
