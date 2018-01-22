/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Product Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMIProductPackage#getProductList <em>Product List</em>}</li>
 *   <li>{@link vpml.infopackage.EMIProductPackage#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link vpml.infopackage.EMIProductPackage#getTopPackage <em>Top Package</em>}</li>
 *   <li>{@link vpml.infopackage.EMIProductPackage#getProductPackageDiagram <em>Product Package Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIProductPackage()
 * @model
 * @generated
 */
public interface EMIProductPackage extends EMIProduct {
	/**
	 * Returns the value of the '<em><b>Product List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product List</em>' attribute.
	 * @see #setProductList(List)
	 * @see vpml.infopackage.InfopackagePackage#getEMIProductPackage_ProductList()
	 * @model dataType="vpml.utilpackage.JavaList" many="false"
	 * @generated
	 */
	List getProductList();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIProductPackage#getProductList <em>Product List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product List</em>' attribute.
	 * @see #getProductList()
	 * @generated
	 */
	void setProductList(List value);

	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.infopackage.EMIProductPackage}.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIProductPackage#getTopPackage <em>Top Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' containment reference list.
	 * @see vpml.infopackage.InfopackagePackage#getEMIProductPackage_SubPackages()
	 * @see vpml.infopackage.EMIProductPackage#getTopPackage
	 * @model type="vpml.infopackage.EMIProductPackage" opposite="topPackage" containment="true"
	 * @generated
	 */
	EList getSubPackages();

	/**
	 * Returns the value of the '<em><b>Top Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIProductPackage#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Package</em>' container reference.
	 * @see #setTopPackage(EMIProductPackage)
	 * @see vpml.infopackage.InfopackagePackage#getEMIProductPackage_TopPackage()
	 * @see vpml.infopackage.EMIProductPackage#getSubPackages
	 * @model opposite="subPackages"
	 * @generated
	 */
	EMIProductPackage getTopPackage();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIProductPackage#getTopPackage <em>Top Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Package</em>' container reference.
	 * @see #getTopPackage()
	 * @generated
	 */
	void setTopPackage(EMIProductPackage value);

	/**
	 * Returns the value of the '<em><b>Product Package Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIDiagram#getProductPackage <em>Product Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Package Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Package Diagram</em>' container reference.
	 * @see #setProductPackageDiagram(EMIDiagram)
	 * @see vpml.infopackage.InfopackagePackage#getEMIProductPackage_ProductPackageDiagram()
	 * @see vpml.infopackage.EMIDiagram#getProductPackage
	 * @model opposite="productPackage"
	 * @generated
	 */
	EMIDiagram getProductPackageDiagram();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIProductPackage#getProductPackageDiagram <em>Product Package Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Package Diagram</em>' container reference.
	 * @see #getProductPackageDiagram()
	 * @generated
	 */
	void setProductPackageDiagram(EMIDiagram value);

} // EMIProductPackage
