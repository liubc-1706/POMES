/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.informationpackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.informationpackage.EMIForm#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.informationpackage.InformationpackagePackage#getEMIForm()
 * @model
 * @generated
 */
public interface EMIForm extends EMIComplexItem {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.informationpackage.EMIAttribute}.
	 * It is bidirectional and its opposite is '{@link vpml.informationpackage.EMIAttribute#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see vpml.informationpackage.InformationpackagePackage#getEMIForm_Attributes()
	 * @see vpml.informationpackage.EMIAttribute#getForm
	 * @model type="vpml.informationpackage.EMIAttribute" opposite="form" containment="true"
	 * @generated
	 */
	EList getAttributes();

} // EMIForm
