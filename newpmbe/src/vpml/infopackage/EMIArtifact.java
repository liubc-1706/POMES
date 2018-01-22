/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMIArtifact#getArtifactDiagram <em>Artifact Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIArtifact()
 * @model
 * @generated
 */
public interface EMIArtifact extends EMILeafProduct {
	/**
	 * Returns the value of the '<em><b>Artifact Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIDiagram#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Diagram</em>' container reference.
	 * @see #setArtifactDiagram(EMIDiagram)
	 * @see vpml.infopackage.InfopackagePackage#getEMIArtifact_ArtifactDiagram()
	 * @see vpml.infopackage.EMIDiagram#getArtifact
	 * @model opposite="artifact"
	 * @generated
	 */
	EMIDiagram getArtifactDiagram();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIArtifact#getArtifactDiagram <em>Artifact Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Diagram</em>' container reference.
	 * @see #getArtifactDiagram()
	 * @generated
	 */
	void setArtifactDiagram(EMIDiagram value);

} // EMIArtifact
