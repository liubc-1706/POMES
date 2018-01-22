/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.informationpackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Stat Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.informationpackage.EMIStatAttribute#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link vpml.informationpackage.EMIStatAttribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.informationpackage.InformationpackagePackage#getEMIStatAttribute()
 * @model
 * @generated
 */
public interface EMIStatAttribute extends EMIAttribute {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' attribute.
	 * @see #setExpressions(String)
	 * @see vpml.informationpackage.InformationpackagePackage#getEMIStatAttribute_Expressions()
	 * @model
	 * @generated
	 */
	String getExpressions();

	/**
	 * Sets the value of the '{@link vpml.informationpackage.EMIStatAttribute#getExpressions <em>Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expressions</em>' attribute.
	 * @see #getExpressions()
	 * @generated
	 */
	void setExpressions(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see vpml.informationpackage.InformationpackagePackage#getEMIStatAttribute_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link vpml.informationpackage.EMIStatAttribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

} // EMIStatAttribute
