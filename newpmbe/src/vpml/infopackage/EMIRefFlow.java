/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Ref Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMIRefFlow#getRefFlowDiagram <em>Ref Flow Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIRefFlow()
 * @model
 * @generated
 */
public interface EMIRefFlow extends EMIFlow {
	/**
	 * Returns the value of the '<em><b>Ref Flow Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIDiagram#getRefFlow <em>Ref Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Flow Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Flow Diagram</em>' container reference.
	 * @see #setRefFlowDiagram(EMIDiagram)
	 * @see vpml.infopackage.InfopackagePackage#getEMIRefFlow_RefFlowDiagram()
	 * @see vpml.infopackage.EMIDiagram#getRefFlow
	 * @model opposite="refFlow"
	 * @generated
	 */
	EMIDiagram getRefFlowDiagram();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIRefFlow#getRefFlowDiagram <em>Ref Flow Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Flow Diagram</em>' container reference.
	 * @see #getRefFlowDiagram()
	 * @generated
	 */
	void setRefFlowDiagram(EMIDiagram value);

} // EMIRefFlow
