/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP Attribute Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPAttributeItem#getType <em>Type</em>}</li>
 *   <li>{@link vpml.processpackage.EMPAttributeItem#get_depend <em>depend</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPAttributeItem()
 * @model
 * @generated
 */
public interface EMPAttributeItem extends EMPObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPAttributeItem_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPAttributeItem#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>depend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>depend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>depend</em>' attribute.
	 * @see #set_depend(String)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPAttributeItem__depend()
	 * @model
	 * @generated
	 */
	String get_depend();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPAttributeItem#get_depend <em>depend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>depend</em>' attribute.
	 * @see #get_depend()
	 * @generated
	 */
	void set_depend(String value);

} // EMPAttributeItem
