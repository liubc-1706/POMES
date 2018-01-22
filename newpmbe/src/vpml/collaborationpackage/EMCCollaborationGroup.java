/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.collaborationpackage;

import vpml.EMObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMC Collaboration Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.collaborationpackage.EMCCollaborationGroup#getColColGroupDiagram <em>Col Col Group Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCCollaborationGroup()
 * @model
 * @generated
 */
public interface EMCCollaborationGroup extends EMObject {
	/**
	 * Returns the value of the '<em><b>Col Col Group Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCDiagram#getColColGroup <em>Col Col Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Col Group Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Col Group Diagram</em>' container reference.
	 * @see #setColColGroupDiagram(EMCDiagram)
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCCollaborationGroup_ColColGroupDiagram()
	 * @see vpml.collaborationpackage.EMCDiagram#getColColGroup
	 * @model opposite="colColGroup"
	 * @generated
	 */
	EMCDiagram getColColGroupDiagram();

	/**
	 * Sets the value of the '{@link vpml.collaborationpackage.EMCCollaborationGroup#getColColGroupDiagram <em>Col Col Group Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Col Group Diagram</em>' container reference.
	 * @see #getColColGroupDiagram()
	 * @generated
	 */
	void setColColGroupDiagram(EMCDiagram value);

} // EMCCollaborationGroup
