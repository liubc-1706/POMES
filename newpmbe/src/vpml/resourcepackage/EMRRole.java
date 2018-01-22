/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage;

import org.eclipse.emf.common.util.EList;

import vpml.collaborationpackage.EMCDiagram;

import vpml.organizationpackage.EMODiagram;
import vpml.organizationpackage.EMOResourceGroupType;

import vpml.processpackage.EMPDiagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMR Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.resourcepackage.EMRRole#getTargetAssociationRelations <em>Target Association Relations</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRRole#getSourceAssociationRelations <em>Source Association Relations</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRRole#getEmoDiagram <em>Emo Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRRole#getBelongedOrganization <em>Belonged Organization</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRRole#getEmrDiagram <em>Emr Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRRole#getClassificationRelation <em>Classification Relation</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRRole#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRRole#getAssFlows <em>Ass Flows</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRRole#getColRoleDiagram <em>Col Role Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRRole()
 * @model
 * @generated
 */
public interface EMRRole extends EMRBasicResourceType {
	/**
	 * Returns the value of the '<em><b>Target Association Relations</b></em>' reference list.
	 * The list contents are of type {@link vpml.organizationpackage.EMOAssociationRelation}.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOAssociationRelation#getTargetRole <em>Target Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Association Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Association Relations</em>' reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRRole_TargetAssociationRelations()
	 * @see vpml.organizationpackage.EMOAssociationRelation#getTargetRole
	 * @model type="vpml.organizationpackage.EMOAssociationRelation" opposite="targetRole"
	 * @generated
	 */
	EList getTargetAssociationRelations();

	/**
	 * Returns the value of the '<em><b>Source Association Relations</b></em>' reference list.
	 * The list contents are of type {@link vpml.organizationpackage.EMOAssociationRelation}.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOAssociationRelation#getSourceRole <em>Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Association Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Association Relations</em>' reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRRole_SourceAssociationRelations()
	 * @see vpml.organizationpackage.EMOAssociationRelation#getSourceRole
	 * @model type="vpml.organizationpackage.EMOAssociationRelation" opposite="sourceRole"
	 * @generated
	 */
	EList getSourceAssociationRelations();

	/**
	 * Returns the value of the '<em><b>Emo Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMODiagram#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emo Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emo Diagram</em>' container reference.
	 * @see #setEmoDiagram(EMODiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRRole_EmoDiagram()
	 * @see vpml.organizationpackage.EMODiagram#getRoles
	 * @model opposite="roles" required="true"
	 * @generated
	 */
	EMODiagram getEmoDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRRole#getEmoDiagram <em>Emo Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emo Diagram</em>' container reference.
	 * @see #getEmoDiagram()
	 * @generated
	 */
	void setEmoDiagram(EMODiagram value);

	/**
	 * Returns the value of the '<em><b>Belonged Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belonged Organization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belonged Organization</em>' containment reference.
	 * @see #setBelongedOrganization(EMOResourceGroupType)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRRole_BelongedOrganization()
	 * @model containment="true"
	 * @generated
	 */
	EMOResourceGroupType getBelongedOrganization();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRRole#getBelongedOrganization <em>Belonged Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belonged Organization</em>' containment reference.
	 * @see #getBelongedOrganization()
	 * @generated
	 */
	void setBelongedOrganization(EMOResourceGroupType value);

	/**
	 * Returns the value of the '<em><b>Emr Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRDiagram#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emr Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emr Diagram</em>' container reference.
	 * @see #setEmrDiagram(EMRDiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRRole_EmrDiagram()
	 * @see vpml.resourcepackage.EMRDiagram#getRoles
	 * @model opposite="roles" required="true"
	 * @generated
	 */
	EMRDiagram getEmrDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRRole#getEmrDiagram <em>Emr Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emr Diagram</em>' container reference.
	 * @see #getEmrDiagram()
	 * @generated
	 */
	void setEmrDiagram(EMRDiagram value);

	/**
	 * Returns the value of the '<em><b>Classification Relation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRClassificationRelation#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Relation</em>' reference.
	 * @see #setClassificationRelation(EMRClassificationRelation)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRRole_ClassificationRelation()
	 * @see vpml.resourcepackage.EMRClassificationRelation#getRole
	 * @model opposite="role"
	 * @generated
	 */
	EMRClassificationRelation getClassificationRelation();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRRole#getClassificationRelation <em>Classification Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Relation</em>' reference.
	 * @see #getClassificationRelation()
	 * @generated
	 */
	void setClassificationRelation(EMRClassificationRelation value);

	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRRole_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getRoles
	 * @model opposite="roles" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRRole#getEmpDiagram <em>Emp Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp Diagram</em>' container reference.
	 * @see #getEmpDiagram()
	 * @generated
	 */
	void setEmpDiagram(EMPDiagram value);

	/**
	 * Returns the value of the '<em><b>Ass Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPAssFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPAssFlow#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ass Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ass Flows</em>' reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRRole_AssFlows()
	 * @see vpml.processpackage.EMPAssFlow#getRole
	 * @model type="vpml.processpackage.EMPAssFlow" opposite="role"
	 * @generated
	 */
	EList getAssFlows();

	/**
	 * Returns the value of the '<em><b>Col Role Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCDiagram#getColRole <em>Col Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Role Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Role Diagram</em>' container reference.
	 * @see #setColRoleDiagram(EMCDiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRRole_ColRoleDiagram()
	 * @see vpml.collaborationpackage.EMCDiagram#getColRole
	 * @model opposite="colRole"
	 * @generated
	 */
	EMCDiagram getColRoleDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRRole#getColRoleDiagram <em>Col Role Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Role Diagram</em>' container reference.
	 * @see #getColRoleDiagram()
	 * @generated
	 */
	void setColRoleDiagram(EMCDiagram value);

} // EMRRole
