/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.collaborationpackage;

import org.eclipse.emf.ecore.EObject;

import vpml.EMObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMC Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.collaborationpackage.EMCRelation#getSourceRelationSourceObj <em>Source Relation Source Obj</em>}</li>
 *   <li>{@link vpml.collaborationpackage.EMCRelation#getTargetRelationTargetObj <em>Target Relation Target Obj</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCRelation()
 * @model
 * @generated
 */
public interface EMCRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Relation Source Obj</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.EMObject#getSourceObjSourceRelation <em>Source Obj Source Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Relation Source Obj</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Relation Source Obj</em>' reference.
	 * @see #setSourceRelationSourceObj(EMObject)
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCRelation_SourceRelationSourceObj()
	 * @see vpml.EMObject#getSourceObjSourceRelation
	 * @model opposite="sourceObjSourceRelation"
	 * @generated
	 */
	EMObject getSourceRelationSourceObj();

	/**
	 * Sets the value of the '{@link vpml.collaborationpackage.EMCRelation#getSourceRelationSourceObj <em>Source Relation Source Obj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Relation Source Obj</em>' reference.
	 * @see #getSourceRelationSourceObj()
	 * @generated
	 */
	void setSourceRelationSourceObj(EMObject value);

	/**
	 * Returns the value of the '<em><b>Target Relation Target Obj</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.EMObject#getTargetObjTargetRelation <em>Target Obj Target Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Relation Target Obj</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Relation Target Obj</em>' reference.
	 * @see #setTargetRelationTargetObj(EMObject)
	 * @see vpml.collaborationpackage.CollaborationpackagePackage#getEMCRelation_TargetRelationTargetObj()
	 * @see vpml.EMObject#getTargetObjTargetRelation
	 * @model opposite="targetObjTargetRelation"
	 * @generated
	 */
	EMObject getTargetRelationTargetObj();

	/**
	 * Sets the value of the '{@link vpml.collaborationpackage.EMCRelation#getTargetRelationTargetObj <em>Target Relation Target Obj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Relation Target Obj</em>' reference.
	 * @see #getTargetRelationTargetObj()
	 * @generated
	 */
	void setTargetRelationTargetObj(EMObject value);

} // EMCRelation
