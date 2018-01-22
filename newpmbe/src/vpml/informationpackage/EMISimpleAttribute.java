/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.informationpackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Simple Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.informationpackage.EMISimpleAttribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.informationpackage.InformationpackagePackage#getEMISimpleAttribute()
 * @model
 * @generated
 */
public interface EMISimpleAttribute extends EMIAttribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link vpml.informationpackage.EMISimpleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see vpml.informationpackage.EMISimpleType
	 * @see #setType(EMISimpleType)
	 * @see vpml.informationpackage.InformationpackagePackage#getEMISimpleAttribute_Type()
	 * @model default=""
	 * @generated
	 */
	EMISimpleType getType();

	/**
	 * Sets the value of the '{@link vpml.informationpackage.EMISimpleAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see vpml.informationpackage.EMISimpleType
	 * @see #getType()
	 * @generated
	 */
	void setType(EMISimpleType value);

} // EMISimpleAttribute
