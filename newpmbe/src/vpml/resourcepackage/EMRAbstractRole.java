/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMR Abstract Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.resourcepackage.EMRAbstractRole#getEmrDiagram <em>Emr Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRAbstractRole#getSourceClassificationRelations <em>Source Classification Relations</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRAbstractRole#getTargetClassificationRelation <em>Target Classification Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRAbstractRole()
 * @model
 * @generated
 */
public interface EMRAbstractRole extends EMRAbstractResourceType {
	/**
	 * Returns the value of the '<em><b>Emr Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRDiagram#getAbstractRoles <em>Abstract Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emr Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emr Diagram</em>' container reference.
	 * @see #setEmrDiagram(EMRDiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRAbstractRole_EmrDiagram()
	 * @see vpml.resourcepackage.EMRDiagram#getAbstractRoles
	 * @model opposite="abstractRoles" required="true"
	 * @generated
	 */
	EMRDiagram getEmrDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRAbstractRole#getEmrDiagram <em>Emr Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emr Diagram</em>' container reference.
	 * @see #getEmrDiagram()
	 * @generated
	 */
	void setEmrDiagram(EMRDiagram value);

	/**
	 * Returns the value of the '<em><b>Source Classification Relations</b></em>' reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRClassificationRelation}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRClassificationRelation#getSourceAbsRoleType <em>Source Abs Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Classification Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Classification Relations</em>' reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRAbstractRole_SourceClassificationRelations()
	 * @see vpml.resourcepackage.EMRClassificationRelation#getSourceAbsRoleType
	 * @model type="vpml.resourcepackage.EMRClassificationRelation" opposite="sourceAbsRoleType"
	 * @generated
	 */
	EList getSourceClassificationRelations();

	/**
	 * Returns the value of the '<em><b>Target Classification Relation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRClassificationRelation#getTargetAbsRoleType <em>Target Abs Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Classification Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Classification Relation</em>' reference.
	 * @see #setTargetClassificationRelation(EMRClassificationRelation)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRAbstractRole_TargetClassificationRelation()
	 * @see vpml.resourcepackage.EMRClassificationRelation#getTargetAbsRoleType
	 * @model opposite="targetAbsRoleType"
	 * @generated
	 */
	EMRClassificationRelation getTargetClassificationRelation();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRAbstractRole#getTargetClassificationRelation <em>Target Classification Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Classification Relation</em>' reference.
	 * @see #getTargetClassificationRelation()
	 * @generated
	 */
	void setTargetClassificationRelation(EMRClassificationRelation value);

} // EMRAbstractRole
