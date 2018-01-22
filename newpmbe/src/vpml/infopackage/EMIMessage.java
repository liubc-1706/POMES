/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMIMessage#getMessageDiagram <em>Message Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIMessage()
 * @model
 * @generated
 */
public interface EMIMessage extends EMILeafProduct {
	/**
	 * Returns the value of the '<em><b>Message Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Diagram</em>' reference.
	 * @see #setMessageDiagram(EMIDiagram)
	 * @see vpml.infopackage.InfopackagePackage#getEMIMessage_MessageDiagram()
	 * @model transient="true"
	 * @generated
	 */
	EMIDiagram getMessageDiagram();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIMessage#getMessageDiagram <em>Message Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Diagram</em>' reference.
	 * @see #getMessageDiagram()
	 * @generated
	 */
	void setMessageDiagram(EMIDiagram value);

} // EMIMessage
