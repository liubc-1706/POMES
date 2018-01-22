/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.organizationpackage;

import org.eclipse.emf.common.util.EList;

import vpml.collaborationpackage.EMCDiagram;

import vpml.processpackage.EMPDiagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMO Resource Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 一个或若干个企业功能实体的集合，这些功能实体负责完成某项企业任务。组织单元可以由人员或低层组织单元组成。若干个组织单元也可以组合成更大的组织单元。组织单元的下级节点可以是组织单元和组织单元分类器。
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.organizationpackage.EMOResourceGroupType#getOrganiztionType <em>Organiztion Type</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOResourceGroupType#getSuperOrganization <em>Super Organization</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOResourceGroupType#getPrincipal <em>Principal</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOResourceGroupType#getArrangeNumber <em>Arrange Number</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOResourceGroupType#getReserved <em>Reserved</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOResourceGroupType#getSourceAssociationRelations <em>Source Association Relations</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOResourceGroupType#getTargetComposeRelation <em>Target Compose Relation</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOResourceGroupType#getSourceComposeRelations <em>Source Compose Relations</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOResourceGroupType#getTargetAssociationRelations <em>Target Association Relations</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOResourceGroupType#getEmoDiagram <em>Emo Diagram</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOResourceGroupType#getBasicResourceTypes <em>Basic Resource Types</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOResourceGroupType#getAssFlows <em>Ass Flows</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOResourceGroupType#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMOResourceGroupType#getColEMOGroupDiagram <em>Col EMO Group Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOResourceGroupType()
 * @model
 * @generated
 */
public interface EMOResourceGroupType extends EMOObject {
	/**
	 * Returns the value of the '<em><b>Organiztion Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organiztion Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organiztion Type</em>' attribute.
	 * @see #setOrganiztionType(String)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOResourceGroupType_OrganiztionType()
	 * @model
	 * @generated
	 */
	String getOrganiztionType();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOResourceGroupType#getOrganiztionType <em>Organiztion Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organiztion Type</em>' attribute.
	 * @see #getOrganiztionType()
	 * @generated
	 */
	void setOrganiztionType(String value);

	/**
	 * Returns the value of the '<em><b>Super Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Organization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Organization</em>' containment reference.
	 * @see #setSuperOrganization(EMOResourceGroupType)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOResourceGroupType_SuperOrganization()
	 * @model containment="true"
	 * @generated
	 */
	EMOResourceGroupType getSuperOrganization();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOResourceGroupType#getSuperOrganization <em>Super Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Organization</em>' containment reference.
	 * @see #getSuperOrganization()
	 * @generated
	 */
	void setSuperOrganization(EMOResourceGroupType value);

	/**
	 * Returns the value of the '<em><b>Principal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Principal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Principal</em>' attribute.
	 * @see #setPrincipal(String)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOResourceGroupType_Principal()
	 * @model
	 * @generated
	 */
	String getPrincipal();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOResourceGroupType#getPrincipal <em>Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principal</em>' attribute.
	 * @see #getPrincipal()
	 * @generated
	 */
	void setPrincipal(String value);

	/**
	 * Returns the value of the '<em><b>Arrange Number</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrange Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrange Number</em>' attribute.
	 * @see #setArrangeNumber(Long)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOResourceGroupType_ArrangeNumber()
	 * @model default="1"
	 * @generated
	 */
	Long getArrangeNumber();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOResourceGroupType#getArrangeNumber <em>Arrange Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrange Number</em>' attribute.
	 * @see #getArrangeNumber()
	 * @generated
	 */
	void setArrangeNumber(Long value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(String)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOResourceGroupType_Reserved()
	 * @model
	 * @generated
	 */
	String getReserved();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOResourceGroupType#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(String value);

	/**
	 * Returns the value of the '<em><b>Source Association Relations</b></em>' reference list.
	 * The list contents are of type {@link vpml.organizationpackage.EMOAssociationRelation}.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOAssociationRelation#getSourceGroupType <em>Source Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Association Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Association Relations</em>' reference list.
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOResourceGroupType_SourceAssociationRelations()
	 * @see vpml.organizationpackage.EMOAssociationRelation#getSourceGroupType
	 * @model type="vpml.organizationpackage.EMOAssociationRelation" opposite="sourceGroupType"
	 * @generated
	 */
	EList getSourceAssociationRelations();

	/**
	 * Returns the value of the '<em><b>Target Compose Relation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOComposeRelation#getTargetGroupType <em>Target Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Compose Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Compose Relation</em>' reference.
	 * @see #setTargetComposeRelation(EMOComposeRelation)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOResourceGroupType_TargetComposeRelation()
	 * @see vpml.organizationpackage.EMOComposeRelation#getTargetGroupType
	 * @model opposite="targetGroupType"
	 * @generated
	 */
	EMOComposeRelation getTargetComposeRelation();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOResourceGroupType#getTargetComposeRelation <em>Target Compose Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Compose Relation</em>' reference.
	 * @see #getTargetComposeRelation()
	 * @generated
	 */
	void setTargetComposeRelation(EMOComposeRelation value);

	/**
	 * Returns the value of the '<em><b>Source Compose Relations</b></em>' reference list.
	 * The list contents are of type {@link vpml.organizationpackage.EMOComposeRelation}.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOComposeRelation#getSourceGroupType <em>Source Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Compose Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Compose Relations</em>' reference list.
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOResourceGroupType_SourceComposeRelations()
	 * @see vpml.organizationpackage.EMOComposeRelation#getSourceGroupType
	 * @model type="vpml.organizationpackage.EMOComposeRelation" opposite="sourceGroupType"
	 * @generated
	 */
	EList getSourceComposeRelations();

	/**
	 * Returns the value of the '<em><b>Target Association Relations</b></em>' reference list.
	 * The list contents are of type {@link vpml.organizationpackage.EMOAssociationRelation}.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOAssociationRelation#getTargetGroupType <em>Target Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Association Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Association Relations</em>' reference list.
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOResourceGroupType_TargetAssociationRelations()
	 * @see vpml.organizationpackage.EMOAssociationRelation#getTargetGroupType
	 * @model type="vpml.organizationpackage.EMOAssociationRelation" opposite="targetGroupType"
	 * @generated
	 */
	EList getTargetAssociationRelations();

	/**
	 * Returns the value of the '<em><b>Emo Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMODiagram#getResourceGroupTypes <em>Resource Group Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emo Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emo Diagram</em>' container reference.
	 * @see #setEmoDiagram(EMODiagram)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOResourceGroupType_EmoDiagram()
	 * @see vpml.organizationpackage.EMODiagram#getResourceGroupTypes
	 * @model opposite="resourceGroupTypes" required="true"
	 * @generated
	 */
	EMODiagram getEmoDiagram();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOResourceGroupType#getEmoDiagram <em>Emo Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emo Diagram</em>' container reference.
	 * @see #getEmoDiagram()
	 * @generated
	 */
	void setEmoDiagram(EMODiagram value);

	/**
	 * Returns the value of the '<em><b>Basic Resource Types</b></em>' reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRBasicResourceType}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRBasicResourceType#getResourceGroupTypes <em>Resource Group Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Resource Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Resource Types</em>' reference list.
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOResourceGroupType_BasicResourceTypes()
	 * @see vpml.resourcepackage.EMRBasicResourceType#getResourceGroupTypes
	 * @model type="vpml.resourcepackage.EMRBasicResourceType" opposite="resourceGroupTypes"
	 * @generated
	 */
	EList getBasicResourceTypes();

	/**
	 * Returns the value of the '<em><b>Ass Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPAssFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPAssFlow#getResourceGroupType <em>Resource Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ass Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ass Flows</em>' reference list.
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOResourceGroupType_AssFlows()
	 * @see vpml.processpackage.EMPAssFlow#getResourceGroupType
	 * @model type="vpml.processpackage.EMPAssFlow" opposite="resourceGroupType"
	 * @generated
	 */
	EList getAssFlows();

	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getResourceGroupTypes <em>Resource Group Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOResourceGroupType_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getResourceGroupTypes
	 * @model opposite="resourceGroupTypes" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOResourceGroupType#getEmpDiagram <em>Emp Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp Diagram</em>' container reference.
	 * @see #getEmpDiagram()
	 * @generated
	 */
	void setEmpDiagram(EMPDiagram value);

	/**
	 * Returns the value of the '<em><b>Col EMO Group Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCDiagram#getColEMOGroup <em>Col EMO Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col EMO Group Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col EMO Group Diagram</em>' container reference.
	 * @see #setColEMOGroupDiagram(EMCDiagram)
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMOResourceGroupType_ColEMOGroupDiagram()
	 * @see vpml.collaborationpackage.EMCDiagram#getColEMOGroup
	 * @model opposite="colEMOGroup"
	 * @generated
	 */
	EMCDiagram getColEMOGroupDiagram();

	/**
	 * Sets the value of the '{@link vpml.organizationpackage.EMOResourceGroupType#getColEMOGroupDiagram <em>Col EMO Group Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col EMO Group Diagram</em>' container reference.
	 * @see #getColEMOGroupDiagram()
	 * @generated
	 */
	void setColEMOGroupDiagram(EMCDiagram value);

} // EMOResourceGroupType
