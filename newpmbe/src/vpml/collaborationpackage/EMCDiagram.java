/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.collaborationpackage;

import org.eclipse.emf.common.util.EList;

import vpml.EMDiagram;

import vpml.processpackage.EMPDiagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMC Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.collaborationpackage.EMCDiagram#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.collaborationpackage.EMCDiagram#getAssociatePrModel <em>Associate Pr Model</em>}</li>
 *   <li>{@link vpml.collaborationpackage.EMCDiagram#getColAnd <em>Col And</em>}</li>
 *   <li>{@link vpml.collaborationpackage.EMCDiagram#getColOR <em>Col OR</em>}</li>
 *   <li>{@link vpml.collaborationpackage.EMCDiagram#getColRole <em>Col Role</em>}</li>
 *   <li>{@link vpml.collaborationpackage.EMCDiagram#getColLocation <em>Col Location</em>}</li>
 *   <li>{@link vpml.collaborationpackage.EMCDiagram#getColMachine <em>Col Machine</em>}</li>
 *   <li>{@link vpml.collaborationpackage.EMCDiagram#getColEMOGroup <em>Col EMO Group</em>}</li>
 *   <li>{@link vpml.collaborationpackage.EMCDiagram#getColColGroup <em>Col Col Group</em>}</li>
 *   <li>{@link vpml.collaborationpackage.EMCDiagram#getColColRelation <em>Col Col Relation</em>}</li>
 *   <li>{@link vpml.collaborationpackage.EMCDiagram#getColSeqRelation <em>Col Seq Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCDiagram()
 * @model
 * @generated
 */
public interface EMCDiagram extends EMDiagram {
	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getEmcDiagram <em>Emc Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCDiagram_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getEmcDiagram
	 * @model opposite="emcDiagram" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.collaborationpackage.EMCDiagram#getEmpDiagram <em>Emp Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp Diagram</em>' reference.
	 * @see #getEmpDiagram()
	 * @generated
	 */
	void setEmpDiagram(EMPDiagram value);

	/**
	 * Returns the value of the '<em><b>Associate Pr Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associate Pr Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associate Pr Model</em>' attribute.
	 * @see #setAssociatePrModel(String)
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCDiagram_AssociatePrModel()
	 * @model
	 * @generated
	 */
	String getAssociatePrModel();

	/**
	 * Sets the value of the '{@link vpml.collaborationpackage.EMCDiagram#getAssociatePrModel <em>Associate Pr Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associate Pr Model</em>' attribute.
	 * @see #getAssociatePrModel()
	 * @generated
	 */
	void setAssociatePrModel(String value);

	/**
	 * Returns the value of the '<em><b>Col And</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.collaborationpackage.EMCAnd}.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCAnd#getColAndDiagram <em>Col And Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col And</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col And</em>' containment reference list.
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCDiagram_ColAnd()
	 * @see vpml.collaborationpackage.EMCAnd#getColAndDiagram
	 * @model type="vpml.collaborationpackage.EMCAnd" opposite="colAndDiagram" containment="true"
	 * @generated
	 */
	EList getColAnd();

	/**
	 * Returns the value of the '<em><b>Col OR</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.collaborationpackage.EMCOR}.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCOR#getColORDiagram <em>Col OR Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col OR</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col OR</em>' containment reference list.
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCDiagram_ColOR()
	 * @see vpml.collaborationpackage.EMCOR#getColORDiagram
	 * @model type="vpml.collaborationpackage.EMCOR" opposite="colORDiagram" containment="true"
	 * @generated
	 */
	EList getColOR();

	/**
	 * Returns the value of the '<em><b>Col Role</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRRole}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRRole#getColRoleDiagram <em>Col Role Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Role</em>' containment reference list.
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCDiagram_ColRole()
	 * @see vpml.resourcepackage.EMRRole#getColRoleDiagram
	 * @model type="vpml.resourcepackage.EMRRole" opposite="colRoleDiagram" containment="true"
	 * @generated
	 */
	EList getColRole();

	/**
	 * Returns the value of the '<em><b>Col Location</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRLocationType}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRLocationType#getColLocationDiagram <em>Col Location Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Location</em>' containment reference list.
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCDiagram_ColLocation()
	 * @see vpml.resourcepackage.EMRLocationType#getColLocationDiagram
	 * @model type="vpml.resourcepackage.EMRLocationType" opposite="colLocationDiagram" containment="true"
	 * @generated
	 */
	EList getColLocation();

	/**
	 * Returns the value of the '<em><b>Col Machine</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRMachineType}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRMachineType#getColMachineDiagram <em>Col Machine Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Machine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Machine</em>' containment reference list.
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCDiagram_ColMachine()
	 * @see vpml.resourcepackage.EMRMachineType#getColMachineDiagram
	 * @model type="vpml.resourcepackage.EMRMachineType" opposite="colMachineDiagram" containment="true"
	 * @generated
	 */
	EList getColMachine();

	/**
	 * Returns the value of the '<em><b>Col EMO Group</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.organizationpackage.EMOResourceGroupType}.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOResourceGroupType#getColEMOGroupDiagram <em>Col EMO Group Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col EMO Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col EMO Group</em>' containment reference list.
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCDiagram_ColEMOGroup()
	 * @see vpml.organizationpackage.EMOResourceGroupType#getColEMOGroupDiagram
	 * @model type="vpml.organizationpackage.EMOResourceGroupType" opposite="colEMOGroupDiagram" containment="true"
	 * @generated
	 */
	EList getColEMOGroup();

	/**
	 * Returns the value of the '<em><b>Col Col Group</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.collaborationpackage.EMCCollaborationGroup}.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCCollaborationGroup#getColColGroupDiagram <em>Col Col Group Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Col Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Col Group</em>' containment reference list.
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCDiagram_ColColGroup()
	 * @see vpml.collaborationpackage.EMCCollaborationGroup#getColColGroupDiagram
	 * @model type="vpml.collaborationpackage.EMCCollaborationGroup" opposite="colColGroupDiagram" containment="true"
	 * @generated
	 */
	EList getColColGroup();

	/**
	 * Returns the value of the '<em><b>Col Col Relation</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.collaborationpackage.EMCCollaborationRelation}.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCCollaborationRelation#getColColRelationDiagram <em>Col Col Relation Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Col Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Col Relation</em>' containment reference list.
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCDiagram_ColColRelation()
	 * @see vpml.collaborationpackage.EMCCollaborationRelation#getColColRelationDiagram
	 * @model type="vpml.collaborationpackage.EMCCollaborationRelation" opposite="colColRelationDiagram" containment="true"
	 * @generated
	 */
	EList getColColRelation();

	/**
	 * Returns the value of the '<em><b>Col Seq Relation</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.collaborationpackage.EMCSequenceRelation}.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCSequenceRelation#getColSeqRelationDiagram <em>Col Seq Relation Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Seq Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Seq Relation</em>' containment reference list.
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCDiagram_ColSeqRelation()
	 * @see vpml.collaborationpackage.EMCSequenceRelation#getColSeqRelationDiagram
	 * @model type="vpml.collaborationpackage.EMCSequenceRelation" opposite="colSeqRelationDiagram" containment="true"
	 * @generated
	 */
	EList getColSeqRelation();

} // EMCDiagram
