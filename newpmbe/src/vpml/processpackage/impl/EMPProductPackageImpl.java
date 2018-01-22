/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPLeafProduct;
import vpml.processpackage.EMPProduct;
import vpml.processpackage.EMPProductPackage;
import vpml.processpackage.ProcesspackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMP Product Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.processpackage.impl.EMPProductPackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPProductPackageImpl#getTopPackage <em>Top Package</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPProductPackageImpl#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPProductPackageImpl#getLeafProducts <em>Leaf Products</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMPProductPackageImpl extends EMPProductImpl implements EMPProductPackage {
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
	 * The cached value of the '{@link #getLeafProducts() <em>Leaf Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeafProducts()
	 * @generated
	 * @ordered
	 */
	protected EList leafProducts = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMPProductPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcesspackagePackage.Literals.EMP_PRODUCT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubPackages() {
		if (subPackages == null) {
			subPackages = new EObjectContainmentWithInverseEList(EMPProductPackage.class, this, ProcesspackagePackage.EMP_PRODUCT_PACKAGE__SUB_PACKAGES, ProcesspackagePackage.EMP_PRODUCT_PACKAGE__TOP_PACKAGE);
		}
		return subPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPProductPackage getTopPackage() {
		if (eContainerFeatureID != ProcesspackagePackage.EMP_PRODUCT_PACKAGE__TOP_PACKAGE) return null;
		return (EMPProductPackage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopPackage(EMPProductPackage newTopPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTopPackage, ProcesspackagePackage.EMP_PRODUCT_PACKAGE__TOP_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopPackage(EMPProductPackage newTopPackage) {
		if (newTopPackage != eInternalContainer() || (eContainerFeatureID != ProcesspackagePackage.EMP_PRODUCT_PACKAGE__TOP_PACKAGE && newTopPackage != null)) {
			if (EcoreUtil.isAncestor(this, newTopPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTopPackage != null)
				msgs = ((InternalEObject)newTopPackage).eInverseAdd(this, ProcesspackagePackage.EMP_PRODUCT_PACKAGE__SUB_PACKAGES, EMPProductPackage.class, msgs);
			msgs = basicSetTopPackage(newTopPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_PRODUCT_PACKAGE__TOP_PACKAGE, newTopPackage, newTopPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPDiagram getEmpDiagram() {
		if (eContainerFeatureID != ProcesspackagePackage.EMP_PRODUCT_PACKAGE__EMP_DIAGRAM) return null;
		return (EMPDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpDiagram(EMPDiagram newEmpDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmpDiagram, ProcesspackagePackage.EMP_PRODUCT_PACKAGE__EMP_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpDiagram(EMPDiagram newEmpDiagram) {
		if (newEmpDiagram != eInternalContainer() || (eContainerFeatureID != ProcesspackagePackage.EMP_PRODUCT_PACKAGE__EMP_DIAGRAM && newEmpDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmpDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmpDiagram != null)
				msgs = ((InternalEObject)newEmpDiagram).eInverseAdd(this, ProcesspackagePackage.EMP_DIAGRAM__PRODUCT_PACKAGES, EMPDiagram.class, msgs);
			msgs = basicSetEmpDiagram(newEmpDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_PRODUCT_PACKAGE__EMP_DIAGRAM, newEmpDiagram, newEmpDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLeafProducts() {
		if (leafProducts == null) {
			leafProducts = new EObjectContainmentWithInverseEList(EMPLeafProduct.class, this, ProcesspackagePackage.EMP_PRODUCT_PACKAGE__LEAF_PRODUCTS, ProcesspackagePackage.EMP_LEAF_PRODUCT__TOP_PRODUCT_PACKAGE);
		}
		return leafProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__SUB_PACKAGES:
				return ((InternalEList)getSubPackages()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__TOP_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTopPackage((EMPProductPackage)otherEnd, msgs);
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__EMP_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmpDiagram((EMPDiagram)otherEnd, msgs);
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__LEAF_PRODUCTS:
				return ((InternalEList)getLeafProducts()).basicAdd(otherEnd, msgs);
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
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__SUB_PACKAGES:
				return ((InternalEList)getSubPackages()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__TOP_PACKAGE:
				return basicSetTopPackage(null, msgs);
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__EMP_DIAGRAM:
				return basicSetEmpDiagram(null, msgs);
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__LEAF_PRODUCTS:
				return ((InternalEList)getLeafProducts()).basicRemove(otherEnd, msgs);
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
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__TOP_PACKAGE:
				return eInternalContainer().eInverseRemove(this, ProcesspackagePackage.EMP_PRODUCT_PACKAGE__SUB_PACKAGES, EMPProductPackage.class, msgs);
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__EMP_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ProcesspackagePackage.EMP_DIAGRAM__PRODUCT_PACKAGES, EMPDiagram.class, msgs);
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
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__SUB_PACKAGES:
				return getSubPackages();
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__TOP_PACKAGE:
				return getTopPackage();
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__EMP_DIAGRAM:
				return getEmpDiagram();
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__LEAF_PRODUCTS:
				return getLeafProducts();
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
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				getSubPackages().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__TOP_PACKAGE:
				setTopPackage((EMPProductPackage)newValue);
				return;
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)newValue);
				return;
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__LEAF_PRODUCTS:
				getLeafProducts().clear();
				getLeafProducts().addAll((Collection)newValue);
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
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				return;
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__TOP_PACKAGE:
				setTopPackage((EMPProductPackage)null);
				return;
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)null);
				return;
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__LEAF_PRODUCTS:
				getLeafProducts().clear();
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
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__SUB_PACKAGES:
				return subPackages != null && !subPackages.isEmpty();
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__TOP_PACKAGE:
				return getTopPackage() != null;
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__EMP_DIAGRAM:
				return getEmpDiagram() != null;
			case ProcesspackagePackage.EMP_PRODUCT_PACKAGE__LEAF_PRODUCTS:
				return leafProducts != null && !leafProducts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public LinkedList GetAllLeafProducts() {
		LinkedList list = new LinkedList();
		if (leafProducts != null) {
			Iterator iter = leafProducts.iterator();
			while (iter.hasNext()) {
				EMPProduct prod = (EMPProduct) iter.next();
				list.add(prod);
			}
		}

		if (subPackages != null) {
			Iterator iter2 = subPackages.iterator();
			while (iter2.hasNext()) {
				EMPProduct prod = (EMPProduct) iter2.next();
				list.addAll(((EMPProductPackage) prod).GetAllLeafProducts());
			}
		}
		return list;
	}

	public LinkedList GetAllProductsWithoutRecursive() {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		if (leafProducts != null) {
			list.addAll(leafProducts);
		}
		if (subPackages != null) {
			list.addAll(subPackages);
		}
		return list;
	}

} //EMPProductPackageImpl
