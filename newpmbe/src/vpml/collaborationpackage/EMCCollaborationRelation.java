/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.collaborationpackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMC Collaboration Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.collaborationpackage.EMCCollaborationRelation#getColColRelationDiagram <em>Col Col Relation Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCCollaborationRelation()
 * @model
 * @generated
 */
public interface EMCCollaborationRelation extends EMCRelation {
	/**
	 * Returns the value of the '<em><b>Col Col Relation Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCDiagram#getColColRelation <em>Col Col Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Col Relation Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Col Relation Diagram</em>' container reference.
	 * @see #setColColRelationDiagram(EMCDiagram)
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCCollaborationRelation_ColColRelationDiagram()
	 * @see vpml.collaborationpackage.EMCDiagram#getColColRelation
	 * @model opposite="colColRelation"
	 * @generated
	 */
	EMCDiagram getColColRelationDiagram();

	/**
	 * Sets the value of the '{@link vpml.collaborationpackage.EMCCollaborationRelation#getColColRelationDiagram <em>Col Col Relation Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Col Relation Diagram</em>' container reference.
	 * @see #getColColRelationDiagram()
	 * @generated
	 */
	void setColColRelationDiagram(EMCDiagram value);

} // EMCCollaborationRelation
