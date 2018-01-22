/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage;

import org.eclipse.emf.common.util.EList;

import vpml.collaborationpackage.EMCDiagram;

import vpml.processpackage.EMPDiagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMR Location Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.resourcepackage.EMRLocationType#getEmrDiagram <em>Emr Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRLocationType#getClassificationRelation <em>Classification Relation</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRLocationType#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRLocationType#getAssFlows <em>Ass Flows</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRLocationType#getColLocationDiagram <em>Col Location Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRLocationType()
 * @model
 * @generated
 */
public interface EMRLocationType extends EMRBasicResourceType {
	/**
	 * Returns the value of the '<em><b>Emr Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRDiagram#getLocationTypes <em>Location Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emr Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emr Diagram</em>' container reference.
	 * @see #setEmrDiagram(EMRDiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRLocationType_EmrDiagram()
	 * @see vpml.resourcepackage.EMRDiagram#getLocationTypes
	 * @model opposite="locationTypes" required="true"
	 * @generated
	 */
	EMRDiagram getEmrDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRLocationType#getEmrDiagram <em>Emr Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emr Diagram</em>' container reference.
	 * @see #getEmrDiagram()
	 * @generated
	 */
	void setEmrDiagram(EMRDiagram value);

	/**
	 * Returns the value of the '<em><b>Classification Relation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRClassificationRelation#getLocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Relation</em>' reference.
	 * @see #setClassificationRelation(EMRClassificationRelation)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRLocationType_ClassificationRelation()
	 * @see vpml.resourcepackage.EMRClassificationRelation#getLocationType
	 * @model opposite="locationType" required="true"
	 * @generated
	 */
	EMRClassificationRelation getClassificationRelation();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRLocationType#getClassificationRelation <em>Classification Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Relation</em>' reference.
	 * @see #getClassificationRelation()
	 * @generated
	 */
	void setClassificationRelation(EMRClassificationRelation value);

	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getLocationTypes <em>Location Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRLocationType_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getLocationTypes
	 * @model opposite="locationTypes" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRLocationType#getEmpDiagram <em>Emp Diagram</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPAssFlow#getLocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ass Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ass Flows</em>' reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRLocationType_AssFlows()
	 * @see vpml.processpackage.EMPAssFlow#getLocationType
	 * @model type="vpml.processpackage.EMPAssFlow" opposite="locationType"
	 * @generated
	 */
	EList getAssFlows();

	/**
	 * Returns the value of the '<em><b>Col Location Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCDiagram#getColLocation <em>Col Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Location Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Location Diagram</em>' container reference.
	 * @see #setColLocationDiagram(EMCDiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRLocationType_ColLocationDiagram()
	 * @see vpml.collaborationpackage.EMCDiagram#getColLocation
	 * @model opposite="colLocation"
	 * @generated
	 */
	EMCDiagram getColLocationDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRLocationType#getColLocationDiagram <em>Col Location Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Location Diagram</em>' container reference.
	 * @see #getColLocationDiagram()
	 * @generated
	 */
	void setColLocationDiagram(EMCDiagram value);

} // EMRLocationType
