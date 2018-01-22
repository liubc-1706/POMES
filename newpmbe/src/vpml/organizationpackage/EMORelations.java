/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.organizationpackage;

import vpml.EMObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMO Relations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.organizationpackage.EMORelations#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMORelations()
 * @model
 * @generated
 */
public interface EMORelations extends EMObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(Integer)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMORelations_Number()
	 * @model default="1"
	 * @generated
	 */
	Integer getNumber();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMORelations#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(Integer value);

} // EMORelations
