/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.informationpackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Complex Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.informationpackage.EMIComplexAttribute#getComplexType <em>Complex Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.informationpackage.InformationpackagePackage#getEMIComplexAttribute()
 * @model
 * @generated
 */
public interface EMIComplexAttribute extends EMIAttribute {
	/**
	 * Returns the value of the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Type</em>' reference.
	 * @see #setComplexType(EMIComplexItem)
	 * @see vpml.informationpackage.InformationpackagePackage#getEMIComplexAttribute_ComplexType()
	 * @model required="true"
	 * @generated
	 */
	EMIComplexItem getComplexType();

	/**
	 * Sets the value of the '{@link vpml.informationpackage.EMIComplexAttribute#getComplexType <em>Complex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Type</em>' reference.
	 * @see #getComplexType()
	 * @generated
	 */
	void setComplexType(EMIComplexItem value);

} // EMIComplexAttribute
