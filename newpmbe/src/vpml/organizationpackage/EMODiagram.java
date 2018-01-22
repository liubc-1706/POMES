/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.organizationpackage;

import org.eclipse.emf.common.util.EList;

import vpml.EMDiagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMO Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.organizationpackage.EMODiagram#getEmpDiagrams <em>Emp Diagrams</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMODiagram#getEmrDiagrams <em>Emr Diagrams</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMODiagram#getRoles <em>Roles</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMODiagram#getResourceGroupTypes <em>Resource Group Types</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMODiagram#getAssociationRelations <em>Association Relations</em>}</li>
 *   <li>{@link vpml.organizationpackage.EMODiagram#getComposeRelations <em>Compose Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMODiagram()
 * @model
 * @generated
 */
public interface EMODiagram extends EMDiagram {
	/**
	 * Returns the value of the '<em><b>Emp Diagrams</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPDiagram}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getEmoDiagrams <em>Emo Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagrams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagrams</em>' reference list.
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMODiagram_EmpDiagrams()
	 * @see vpml.processpackage.EMPDiagram#getEmoDiagrams
	 * @model type="vpml.processpackage.EMPDiagram" opposite="emoDiagrams"
	 * @generated
	 */
	EList getEmpDiagrams();

	/**
	 * Returns the value of the '<em><b>Emr Diagrams</b></em>' reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRDiagram}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRDiagram#getEmoDiagram <em>Emo Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emr Diagrams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emr Diagrams</em>' reference list.
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMODiagram_EmrDiagrams()
	 * @see vpml.resourcepackage.EMRDiagram#getEmoDiagram
	 * @model type="vpml.resourcepackage.EMRDiagram" opposite="emoDiagram" required="true"
	 * @generated
	 */
	EList getEmrDiagrams();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRRole}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRRole#getEmoDiagram <em>Emo Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMODiagram_Roles()
	 * @see vpml.resourcepackage.EMRRole#getEmoDiagram
	 * @model type="vpml.resourcepackage.EMRRole" opposite="emoDiagram" containment="true"
	 * @generated
	 */
	EList getRoles();

	/**
	 * Returns the value of the '<em><b>Resource Group Types</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.organizationpackage.EMOResourceGroupType}.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOResourceGroupType#getEmoDiagram <em>Emo Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Group Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Group Types</em>' containment reference list.
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMODiagram_ResourceGroupTypes()
	 * @see vpml.organizationpackage.EMOResourceGroupType#getEmoDiagram
	 * @model type="vpml.organizationpackage.EMOResourceGroupType" opposite="emoDiagram" containment="true"
	 * @generated
	 */
	EList getResourceGroupTypes();

	/**
	 * Returns the value of the '<em><b>Association Relations</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.organizationpackage.EMOAssociationRelation}.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOAssociationRelation#getEmoDiagram <em>Emo Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Relations</em>' containment reference list.
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMODiagram_AssociationRelations()
	 * @see vpml.organizationpackage.EMOAssociationRelation#getEmoDiagram
	 * @model type="vpml.organizationpackage.EMOAssociationRelation" opposite="emoDiagram" containment="true"
	 * @generated
	 */
	EList getAssociationRelations();

	/**
	 * Returns the value of the '<em><b>Compose Relations</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.organizationpackage.EMOComposeRelation}.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOComposeRelation#getEmoDiagram <em>Emo Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compose Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compose Relations</em>' containment reference list.
	 * @see vpml.organizationpackage.OrganizationpackagePackage#getEMODiagram_ComposeRelations()
	 * @see vpml.organizationpackage.EMOComposeRelation#getEmoDiagram
	 * @model type="vpml.organizationpackage.EMOComposeRelation" opposite="emoDiagram" containment="true"
	 * @generated
	 */
	EList getComposeRelations();

} // EMODiagram
