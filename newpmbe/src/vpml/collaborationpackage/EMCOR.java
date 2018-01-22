/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.collaborationpackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMCOR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.collaborationpackage.EMCOR#getColORDiagram <em>Col OR Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCOR()
 * @model
 * @generated
 */
public interface EMCOR extends EMCLogicalConnector {
	/**
	 * Returns the value of the '<em><b>Col OR Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCDiagram#getColOR <em>Col OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col OR Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col OR Diagram</em>' container reference.
	 * @see #setColORDiagram(EMCDiagram)
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCOR_ColORDiagram()
	 * @see vpml.collaborationpackage.EMCDiagram#getColOR
	 * @model opposite="colOR"
	 * @generated
	 */
	EMCDiagram getColORDiagram();

	/**
	 * Sets the value of the '{@link vpml.collaborationpackage.EMCOR#getColORDiagram <em>Col OR Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col OR Diagram</em>' container reference.
	 * @see #getColORDiagram()
	 * @generated
	 */
	void setColORDiagram(EMCDiagram value);

} // EMCOR
