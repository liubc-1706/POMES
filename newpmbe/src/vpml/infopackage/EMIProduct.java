/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMIProduct#getProcedure <em>Procedure</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIProduct()
 * @model
 * @generated
 */
public interface EMIProduct extends EMINode {
	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 与产品相关的过程步骤的文字描述
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure</em>' attribute.
	 * @see #setProcedure(String)
	 * @see vpml.infopackage.InfopackagePackage#getEMIProduct_Procedure()
	 * @model
	 * @generated
	 */
	String getProcedure();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIProduct#getProcedure <em>Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' attribute.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(String value);

} // EMIProduct
