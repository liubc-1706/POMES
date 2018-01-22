/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.collaborationpackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMC Sequence Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.collaborationpackage.EMCSequenceRelation#getColSeqRelationDiagram <em>Col Seq Relation Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCSequenceRelation()
 * @model
 * @generated
 */
public interface EMCSequenceRelation extends EMCRelation {
	/**
	 * Returns the value of the '<em><b>Col Seq Relation Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCDiagram#getColSeqRelation <em>Col Seq Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Seq Relation Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Seq Relation Diagram</em>' container reference.
	 * @see #setColSeqRelationDiagram(EMCDiagram)
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCSequenceRelation_ColSeqRelationDiagram()
	 * @see vpml.collaborationpackage.EMCDiagram#getColSeqRelation
	 * @model opposite="colSeqRelation"
	 * @generated
	 */
	EMCDiagram getColSeqRelationDiagram();

	/**
	 * Sets the value of the '{@link vpml.collaborationpackage.EMCSequenceRelation#getColSeqRelationDiagram <em>Col Seq Relation Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Seq Relation Diagram</em>' container reference.
	 * @see #getColSeqRelationDiagram()
	 * @generated
	 */
	void setColSeqRelationDiagram(EMCDiagram value);

} // EMCSequenceRelation
