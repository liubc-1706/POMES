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
 * A representation of the model object '<em><b>EMI Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.informationpackage.EMIEnum#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.informationpackage.InformationpackagePackage#getEMIEnum()
 * @model
 * @generated
 */
public interface EMIEnum extends EMIComplexItem {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.informationpackage.EMIEnumLiteral}.
	 * It is bidirectional and its opposite is '{@link vpml.informationpackage.EMIEnumLiteral#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see vpml.informationpackage.InformationpackagePackage#getEMIEnum_Literals()
	 * @see vpml.informationpackage.EMIEnumLiteral#getEnum
	 * @model type="vpml.informationpackage.EMIEnumLiteral" opposite="enum" containment="true" required="true"
	 * @generated
	 */
	EList getLiterals();

} // EMIEnum
