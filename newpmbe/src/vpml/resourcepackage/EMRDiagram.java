/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage;

import org.eclipse.emf.common.util.EList;

import vpml.EMDiagram;

import vpml.organizationpackage.EMODiagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMR Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.resourcepackage.EMRDiagram#getEmpDiagrams <em>Emp Diagrams</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRDiagram#getEmoDiagram <em>Emo Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRDiagram#getClassificationRelations <em>Classification Relations</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRDiagram#getAbstractLocationTypes <em>Abstract Location Types</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRDiagram#getAbstractMachineTypes <em>Abstract Machine Types</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRDiagram#getAbstractToolTypes <em>Abstract Tool Types</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRDiagram#getAbstractRoles <em>Abstract Roles</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRDiagram#getRoles <em>Roles</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRDiagram#getLocationTypes <em>Location Types</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRDiagram#getMachineTypes <em>Machine Types</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRDiagram#getToolTypes <em>Tool Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRDiagram()
 * @model
 * @generated
 */
public interface EMRDiagram extends EMDiagram {
	/**
	 * Returns the value of the '<em><b>Emp Diagrams</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPDiagram}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getEmrDiagrams <em>Emr Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagrams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagrams</em>' reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRDiagram_EmpDiagrams()
	 * @see vpml.processpackage.EMPDiagram#getEmrDiagrams
	 * @model type="vpml.processpackage.EMPDiagram" opposite="emrDiagrams"
	 * @generated
	 */
	EList getEmpDiagrams();

	/**
	 * Returns the value of the '<em><b>Emo Diagram</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMODiagram#getEmrDiagrams <em>Emr Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emo Diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emo Diagram</em>' reference.
	 * @see #setEmoDiagram(EMODiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRDiagram_EmoDiagram()
	 * @see vpml.organizationpackage.EMODiagram#getEmrDiagrams
	 * @model opposite="emrDiagrams" required="true"
	 * @generated
	 */
	EMODiagram getEmoDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRDiagram#getEmoDiagram <em>Emo Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emo Diagram</em>' reference.
	 * @see #getEmoDiagram()
	 * @generated
	 */
	void setEmoDiagram(EMODiagram value);

	/**
	 * Returns the value of the '<em><b>Classification Relations</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRClassificationRelation}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRClassificationRelation#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Relations</em>' containment reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRDiagram_ClassificationRelations()
	 * @see vpml.resourcepackage.EMRClassificationRelation#getEmrDiagram
	 * @model type="vpml.resourcepackage.EMRClassificationRelation" opposite="emrDiagram" containment="true"
	 * @generated
	 */
	EList getClassificationRelations();

	/**
	 * Returns the value of the '<em><b>Abstract Location Types</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRAbstractLocationType}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRAbstractLocationType#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Location Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Location Types</em>' containment reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRDiagram_AbstractLocationTypes()
	 * @see vpml.resourcepackage.EMRAbstractLocationType#getEmrDiagram
	 * @model type="vpml.resourcepackage.EMRAbstractLocationType" opposite="emrDiagram" containment="true"
	 * @generated
	 */
	EList getAbstractLocationTypes();

	/**
	 * Returns the value of the '<em><b>Abstract Machine Types</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRAbstractMachineType}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRAbstractMachineType#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Machine Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Machine Types</em>' containment reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRDiagram_AbstractMachineTypes()
	 * @see vpml.resourcepackage.EMRAbstractMachineType#getEmrDiagram
	 * @model type="vpml.resourcepackage.EMRAbstractMachineType" opposite="emrDiagram" containment="true"
	 * @generated
	 */
	EList getAbstractMachineTypes();

	/**
	 * Returns the value of the '<em><b>Abstract Tool Types</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRAbstractToolType}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRAbstractToolType#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Tool Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Tool Types</em>' containment reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRDiagram_AbstractToolTypes()
	 * @see vpml.resourcepackage.EMRAbstractToolType#getEmrDiagram
	 * @model type="vpml.resourcepackage.EMRAbstractToolType" opposite="emrDiagram" containment="true"
	 * @generated
	 */
	EList getAbstractToolTypes();

	/**
	 * Returns the value of the '<em><b>Abstract Roles</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRAbstractRole}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRAbstractRole#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Roles</em>' containment reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRDiagram_AbstractRoles()
	 * @see vpml.resourcepackage.EMRAbstractRole#getEmrDiagram
	 * @model type="vpml.resourcepackage.EMRAbstractRole" opposite="emrDiagram" containment="true"
	 * @generated
	 */
	EList getAbstractRoles();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRRole}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRRole#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRDiagram_Roles()
	 * @see vpml.resourcepackage.EMRRole#getEmrDiagram
	 * @model type="vpml.resourcepackage.EMRRole" opposite="emrDiagram" containment="true"
	 * @generated
	 */
	EList getRoles();

	/**
	 * Returns the value of the '<em><b>Location Types</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRLocationType}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRLocationType#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Types</em>' containment reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRDiagram_LocationTypes()
	 * @see vpml.resourcepackage.EMRLocationType#getEmrDiagram
	 * @model type="vpml.resourcepackage.EMRLocationType" opposite="emrDiagram" containment="true"
	 * @generated
	 */
	EList getLocationTypes();

	/**
	 * Returns the value of the '<em><b>Machine Types</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRMachineType}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRMachineType#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Types</em>' containment reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRDiagram_MachineTypes()
	 * @see vpml.resourcepackage.EMRMachineType#getEmrDiagram
	 * @model type="vpml.resourcepackage.EMRMachineType" opposite="emrDiagram" containment="true"
	 * @generated
	 */
	EList getMachineTypes();

	/**
	 * Returns the value of the '<em><b>Tool Types</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRToolType}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRToolType#getEmrDiagram <em>Emr Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Types</em>' containment reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRDiagram_ToolTypes()
	 * @see vpml.resourcepackage.EMRToolType#getEmrDiagram
	 * @model type="vpml.resourcepackage.EMRToolType" opposite="emrDiagram" containment="true"
	 * @generated
	 */
	EList getToolTypes();

} // EMRDiagram
