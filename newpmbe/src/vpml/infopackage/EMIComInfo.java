/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Com Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMIComInfo#getComInfoDiagram <em>Com Info Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIComInfo()
 * @model
 * @generated
 */
public interface EMIComInfo extends EMINode {
	/**
	 * Returns the value of the '<em><b>Com Info Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIDiagram#getComInfo <em>Com Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Info Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Info Diagram</em>' container reference.
	 * @see #setComInfoDiagram(EMIDiagram)
	 * @see vpml.infopackage.InfopackagePackage#getEMIComInfo_ComInfoDiagram()
	 * @see vpml.infopackage.EMIDiagram#getComInfo
	 * @model opposite="comInfo"
	 * @generated
	 */
	EMIDiagram getComInfoDiagram();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIComInfo#getComInfoDiagram <em>Com Info Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Info Diagram</em>' container reference.
	 * @see #getComInfoDiagram()
	 * @generated
	 */
	void setComInfoDiagram(EMIDiagram value);

} // EMIComInfo
