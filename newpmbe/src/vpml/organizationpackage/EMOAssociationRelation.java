/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.organizationpackage;

import vpml.resourcepackage.EMRRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMO Association Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 表示人员与组织单元之间的从属关系。
 * 一个人员可以属于一个或者多个组织单元（也可以不属于任何组织单元），一个组织单元也可以拥有一个或者多个（也可以没有）人员。
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.organizationpackage.EMOAssociationRelation#getSourceGroupType <em>Source Group Type</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOAssociationRelation#getTargetRole <em>Target Role</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOAssociationRelation#getSourceRole <em>Source Role</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOAssociationRelation#getTargetGroupType <em>Target Group Type</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOAssociationRelation#getEmoDiagram <em>Emo Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOAssociationRelation()
 * @model
 * @generated
 */
public interface EMOAssociationRelation extends EMORelations {
	/**
	 * Returns the value of the '<em><b>Source Group Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOResourceGroupType#getSourceAssociationRelations <em>Source Association Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Group Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Group Type</em>' reference.
	 * @see #setSourceGroupType(EMOResourceGroupType)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOAssociationRelation_SourceGroupType()
	 * @see vpml.organizationpackage.EMOResourceGroupType#getSourceAssociationRelations
	 * @model opposite="sourceAssociationRelations"
	 * @generated
	 */
	EMOResourceGroupType getSourceGroupType();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOAssociationRelation#getSourceGroupType <em>Source Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Group Type</em>' reference.
	 * @see #getSourceGroupType()
	 * @generated
	 */
	void setSourceGroupType(EMOResourceGroupType value);

	/**
	 * Returns the value of the '<em><b>Target Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRRole#getTargetAssociationRelations <em>Target Association Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Role</em>' reference.
	 * @see #setTargetRole(EMRRole)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOAssociationRelation_TargetRole()
	 * @see vpml.resourcepackage.EMRRole#getTargetAssociationRelations
	 * @model opposite="targetAssociationRelations"
	 * @generated
	 */
	EMRRole getTargetRole();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOAssociationRelation#getTargetRole <em>Target Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Role</em>' reference.
	 * @see #getTargetRole()
	 * @generated
	 */
	void setTargetRole(EMRRole value);

	/**
	 * Returns the value of the '<em><b>Source Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRRole#getSourceAssociationRelations <em>Source Association Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role</em>' reference.
	 * @see #setSourceRole(EMRRole)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOAssociationRelation_SourceRole()
	 * @see vpml.resourcepackage.EMRRole#getSourceAssociationRelations
	 * @model opposite="sourceAssociationRelations"
	 * @generated
	 */
	EMRRole getSourceRole();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOAssociationRelation#getSourceRole <em>Source Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Role</em>' reference.
	 * @see #getSourceRole()
	 * @generated
	 */
	void setSourceRole(EMRRole value);

	/**
	 * Returns the value of the '<em><b>Target Group Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOResourceGroupType#getTargetAssociationRelations <em>Target Association Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Group Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Group Type</em>' reference.
	 * @see #setTargetGroupType(EMOResourceGroupType)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOAssociationRelation_TargetGroupType()
	 * @see vpml.organizationpackage.EMOResourceGroupType#getTargetAssociationRelations
	 * @model opposite="targetAssociationRelations"
	 * @generated
	 */
	EMOResourceGroupType getTargetGroupType();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOAssociationRelation#getTargetGroupType <em>Target Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Group Type</em>' reference.
	 * @see #getTargetGroupType()
	 * @generated
	 */
	void setTargetGroupType(EMOResourceGroupType value);

	/**
	 * Returns the value of the '<em><b>Emo Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMODiagram#getAssociationRelations <em>Association Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emo Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emo Diagram</em>' container reference.
	 * @see #setEmoDiagram(EMODiagram)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOAssociationRelation_EmoDiagram()
	 * @see vpml.organizationpackage.EMODiagram#getAssociationRelations
	 * @model opposite="associationRelations" required="true"
	 * @generated
	 */
	EMODiagram getEmoDiagram();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOAssociationRelation#getEmoDiagram <em>Emo Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emo Diagram</em>' container reference.
	 * @see #getEmoDiagram()
	 * @generated
	 */
	void setEmoDiagram(EMODiagram value);

} // EMOAssociationRelation
