/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Other</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMIOther#getOtherDiagram <em>Other Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIOther()
 * @model
 * @generated
 */
public interface EMIOther extends EMILeafProduct {
	/**
	 * Returns the value of the '<em><b>Other Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIDiagram#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Diagram</em>' container reference.
	 * @see #setOtherDiagram(EMIDiagram)
	 * @see vpml.infopackage.InfopackagePackage#getEMIOther_OtherDiagram()
	 * @see vpml.infopackage.EMIDiagram#getOther
	 * @model opposite="other"
	 * @generated
	 */
	EMIDiagram getOtherDiagram();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIOther#getOtherDiagram <em>Other Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Diagram</em>' container reference.
	 * @see #getOtherDiagram()
	 * @generated
	 */
	void setOtherDiagram(EMIDiagram value);

} // EMIOther
