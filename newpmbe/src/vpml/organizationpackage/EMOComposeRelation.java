/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.organizationpackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMO Compose Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 组织单元之间的上下级关系。上级必须是一个组织内一个实际的组织单元，下级可以是一个实际的组织单元，也可以是一个组织单元类别，表示一类组织单元都是它的下级。
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.organizationpackage.EMOComposeRelation#getTargetGroupType <em>Target Group Type</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOComposeRelation#getSourceGroupType <em>Source Group Type</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOComposeRelation#getEmoDiagram <em>Emo Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOComposeRelation()
 * @model
 * @generated
 */
public interface EMOComposeRelation extends EMORelations {
	/**
	 * Returns the value of the '<em><b>Target Group Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOResourceGroupType#getTargetComposeRelation <em>Target Compose Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Group Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Group Type</em>' reference.
	 * @see #setTargetGroupType(EMOResourceGroupType)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOComposeRelation_TargetGroupType()
	 * @see vpml.organizationpackage.EMOResourceGroupType#getTargetComposeRelation
	 * @model opposite="targetComposeRelation" required="true"
	 * @generated
	 */
	EMOResourceGroupType getTargetGroupType();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOComposeRelation#getTargetGroupType <em>Target Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Group Type</em>' reference.
	 * @see #getTargetGroupType()
	 * @generated
	 */
	void setTargetGroupType(EMOResourceGroupType value);

	/**
	 * Returns the value of the '<em><b>Source Group Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOResourceGroupType#getSourceComposeRelations <em>Source Compose Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Group Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Group Type</em>' reference.
	 * @see #setSourceGroupType(EMOResourceGroupType)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOComposeRelation_SourceGroupType()
	 * @see vpml.organizationpackage.EMOResourceGroupType#getSourceComposeRelations
	 * @model opposite="sourceComposeRelations" required="true"
	 * @generated
	 */
	EMOResourceGroupType getSourceGroupType();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOComposeRelation#getSourceGroupType <em>Source Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Group Type</em>' reference.
	 * @see #getSourceGroupType()
	 * @generated
	 */
	void setSourceGroupType(EMOResourceGroupType value);

	/**
	 * Returns the value of the '<em><b>Emo Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMODiagram#getComposeRelations <em>Compose Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emo Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emo Diagram</em>' container reference.
	 * @see #setEmoDiagram(EMODiagram)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOComposeRelation_EmoDiagram()
	 * @see vpml.organizationpackage.EMODiagram#getComposeRelations
	 * @model opposite="composeRelations" required="true"
	 * @generated
	 */
	EMODiagram getEmoDiagram();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOComposeRelation#getEmoDiagram <em>Emo Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emo Diagram</em>' container reference.
	 * @see #getEmoDiagram()
	 * @generated
	 */
	void setEmoDiagram(EMODiagram value);

} // EMOComposeRelation
