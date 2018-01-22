/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI State Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMIStateConnector#getStateConnectorDiagram <em>State Connector Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIStateConnector()
 * @model
 * @generated
 */
public interface EMIStateConnector extends EMILogicalConnector {
	/**
	 * Returns the value of the '<em><b>State Connector Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIDiagram#getStateConnector <em>State Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Connector Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Connector Diagram</em>' container reference.
	 * @see #setStateConnectorDiagram(EMIDiagram)
	 * @see vpml.infopackage.InfopackagePackage#getEMIStateConnector_StateConnectorDiagram()
	 * @see vpml.infopackage.EMIDiagram#getStateConnector
	 * @model opposite="stateConnector"
	 * @generated
	 */
	EMIDiagram getStateConnectorDiagram();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIStateConnector#getStateConnectorDiagram <em>State Connector Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Connector Diagram</em>' container reference.
	 * @see #getStateConnectorDiagram()
	 * @generated
	 */
	void setStateConnectorDiagram(EMIDiagram value);

} // EMIStateConnector
