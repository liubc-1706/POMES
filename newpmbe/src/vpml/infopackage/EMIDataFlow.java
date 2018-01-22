/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Data Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMIDataFlow#getDataFlowDiagram <em>Data Flow Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIDataFlow()
 * @model
 * @generated
 */
public interface EMIDataFlow extends EMIFlow {
	/**
	 * Returns the value of the '<em><b>Data Flow Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIDiagram#getDataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Flow Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Flow Diagram</em>' container reference.
	 * @see #setDataFlowDiagram(EMIDiagram)
	 * @see vpml.infopackage.InfopackagePackage#getEMIDataFlow_DataFlowDiagram()
	 * @see vpml.infopackage.EMIDiagram#getDataFlow
	 * @model opposite="dataFlow"
	 * @generated
	 */
	EMIDiagram getDataFlowDiagram();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIDataFlow#getDataFlowDiagram <em>Data Flow Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Flow Diagram</em>' container reference.
	 * @see #getDataFlowDiagram()
	 * @generated
	 */
	void setDataFlowDiagram(EMIDiagram value);

} // EMIDataFlow
