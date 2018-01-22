/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;

import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP Product Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPProductPackage#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link vpml.processpackage.EMPProductPackage#getTopPackage <em>Top Package</em>}</li>
 *   <li>{@link vpml.processpackage.EMPProductPackage#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.EMPProductPackage#getLeafProducts <em>Leaf Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPProductPackage()
 * @model
 * @generated
 */
public interface EMPProductPackage extends EMPProduct {
	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPProductPackage}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPProductPackage#getTopPackage <em>Top Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPProductPackage_SubPackages()
	 * @see vpml.processpackage.EMPProductPackage#getTopPackage
	 * @model type="vpml.processpackage.EMPProductPackage" opposite="topPackage" containment="true"
	 * @generated
	 */
	EList getSubPackages();

	/**
	 * Returns the value of the '<em><b>Top Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPProductPackage#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Package</em>' container reference.
	 * @see #setTopPackage(EMPProductPackage)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPProductPackage_TopPackage()
	 * @see vpml.processpackage.EMPProductPackage#getSubPackages
	 * @model opposite="subPackages"
	 * @generated
	 */
	EMPProductPackage getTopPackage();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPProductPackage#getTopPackage <em>Top Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Package</em>' container reference.
	 * @see #getTopPackage()
	 * @generated
	 */
	void setTopPackage(EMPProductPackage value);

	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getProductPackages <em>Product Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPProductPackage_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getProductPackages
	 * @model opposite="productPackages" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPProductPackage#getEmpDiagram <em>Emp Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp Diagram</em>' container reference.
	 * @see #getEmpDiagram()
	 * @generated
	 */
	void setEmpDiagram(EMPDiagram value);

	/**
	 * Returns the value of the '<em><b>Leaf Products</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPLeafProduct}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPLeafProduct#getTopProductPackage <em>Top Product Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leaf Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaf Products</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPProductPackage_LeafProducts()
	 * @see vpml.processpackage.EMPLeafProduct#getTopProductPackage
	 * @model type="vpml.processpackage.EMPLeafProduct" opposite="topProductPackage" containment="true"
	 * @generated
	 */
	EList getLeafProducts();

	public LinkedList GetAllLeafProducts();

	public LinkedList GetAllProductsWithoutRecursive();

} // EMPProductPackage
