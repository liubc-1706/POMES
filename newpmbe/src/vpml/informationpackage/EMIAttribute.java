/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.informationpackage;

import vpml.EMObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.informationpackage.EMIAttribute#getMaximun <em>Maximun</em>}</li>
 *   <li>{@link vpml.informationpackage.EMIAttribute#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link vpml.informationpackage.EMIAttribute#getForm <em>Form</em>}</li>
 *   <li>{@link vpml.informationpackage.EMIAttribute#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.informationpackage.InformationpackagePackage#getEMIAttribute()
 * @model
 * @generated
 */
public interface EMIAttribute extends EMObject {
	/**
	 * Returns the value of the '<em><b>Maximun</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximun</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximun</em>' attribute.
	 * @see #setMaximun(Integer)
	 * @see vpml.informationpackage.InformationpackagePackage#getEMIAttribute_Maximun()
	 * @model default="1"
	 * @generated
	 */
	Integer getMaximun();

	/**
	 * Sets the value of the '{@link vpml.informationpackage.EMIAttribute#getMaximun <em>Maximun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximun</em>' attribute.
	 * @see #getMaximun()
	 * @generated
	 */
	void setMaximun(Integer value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(Integer)
	 * @see vpml.informationpackage.InformationpackagePackage#getEMIAttribute_Minimum()
	 * @model default="1"
	 * @generated
	 */
	Integer getMinimum();

	/**
	 * Sets the value of the '{@link vpml.informationpackage.EMIAttribute#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(Integer value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.informationpackage.EMIForm#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' container reference.
	 * @see #setForm(EMIForm)
	 * @see vpml.informationpackage.InformationpackagePackage#getEMIAttribute_Form()
	 * @see vpml.informationpackage.EMIForm#getAttributes
	 * @model opposite="attributes"
	 * @generated
	 */
	EMIForm getForm();

	/**
	 * Sets the value of the '{@link vpml.informationpackage.EMIAttribute#getForm <em>Form</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' container reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(EMIForm value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.informationpackage.EMIList#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' container reference.
	 * @see #setList(EMIList)
	 * @see vpml.informationpackage.InformationpackagePackage#getEMIAttribute_List()
	 * @see vpml.informationpackage.EMIList#getAttributes
	 * @model opposite="attributes"
	 * @generated
	 */
	EMIList getList();

	/**
	 * Sets the value of the '{@link vpml.informationpackage.EMIAttribute#getList <em>List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' container reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(EMIList value);

} // EMIAttribute
