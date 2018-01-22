/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMIDocument#getDocumentDiagram <em>Document Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIDocument()
 * @model
 * @generated
 */
public interface EMIDocument extends EMILeafProduct {
	/**
	 * Returns the value of the '<em><b>Document Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIDiagram#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Diagram</em>' container reference.
	 * @see #setDocumentDiagram(EMIDiagram)
	 * @see vpml.infopackage.InfopackagePackage#getEMIDocument_DocumentDiagram()
	 * @see vpml.infopackage.EMIDiagram#getDocument
	 * @model opposite="document"
	 * @generated
	 */
	EMIDiagram getDocumentDiagram();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIDocument#getDocumentDiagram <em>Document Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Diagram</em>' container reference.
	 * @see #getDocumentDiagram()
	 * @generated
	 */
	void setDocumentDiagram(EMIDiagram value);

} // EMIDocument
