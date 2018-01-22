/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.collaborationpackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMC And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.collaborationpackage.EMCAnd#getColAndDiagram <em>Col And Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCAnd()
 * @model
 * @generated
 */
public interface EMCAnd extends EMCLogicalConnector {
	/**
	 * Returns the value of the '<em><b>Col And Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCDiagram#getColAnd <em>Col And</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col And Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col And Diagram</em>' container reference.
	 * @see #setColAndDiagram(EMCDiagram)
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCAnd_ColAndDiagram()
	 * @see vpml.collaborationpackage.EMCDiagram#getColAnd
	 * @model opposite="colAnd"
	 * @generated
	 */
	EMCDiagram getColAndDiagram();

	/**
	 * Sets the value of the '{@link vpml.collaborationpackage.EMCAnd#getColAndDiagram <em>Col And Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col And Diagram</em>' container reference.
	 * @see #getColAndDiagram()
	 * @generated
	 */
	void setColAndDiagram(EMCDiagram value);

} // EMCAnd
