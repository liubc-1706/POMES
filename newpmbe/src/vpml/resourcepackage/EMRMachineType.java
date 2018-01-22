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
 * A representation of the model object '<em><b>EMR Machine Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.resourcepackage.EMRMachineType#getEmrDiagram <em>Emr Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRMachineType#getClassificationRelation <em>Classification Relation</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRMachineType#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRMachineType#getAssFlows <em>Ass Flows</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRMachineType#getColMachineDiagram <em>Col Machine Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRMachineType()
 * @model
 * @generated
 */
public interface EMRMachineType extends EMRBasicResourceType {
	/**
	 * Returns the value of the '<em><b>Emr Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRDiagram#getMachineTypes <em>Machine Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emr Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emr Diagram</em>' container reference.
	 * @see #setEmrDiagram(EMRDiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRMachineType_EmrDiagram()
	 * @see vpml.resourcepackage.EMRDiagram#getMachineTypes
	 * @model opposite="machineTypes" required="true"
	 * @generated
	 */
	EMRDiagram getEmrDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRMachineType#getEmrDiagram <em>Emr Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emr Diagram</em>' container reference.
	 * @see #getEmrDiagram()
	 * @generated
	 */
	void setEmrDiagram(EMRDiagram value);

	/**
	 * Returns the value of the '<em><b>Classification Relation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRClassificationRelation#getMachineType <em>Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Relation</em>' reference.
	 * @see #setClassificationRelation(EMRClassificationRelation)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRMachineType_ClassificationRelation()
	 * @see vpml.resourcepackage.EMRClassificationRelation#getMachineType
	 * @model opposite="machineType" required="true"
	 * @generated
	 */
	EMRClassificationRelation getClassificationRelation();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRMachineType#getClassificationRelation <em>Classification Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Relation</em>' reference.
	 * @see #getClassificationRelation()
	 * @generated
	 */
	void setClassificationRelation(EMRClassificationRelation value);

	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getMachineTypes <em>Machine Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRMachineType_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getMachineTypes
	 * @model opposite="machineTypes" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRMachineType#getEmpDiagram <em>Emp Diagram</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPAssFlow#getMachineType <em>Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ass Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ass Flows</em>' reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRMachineType_AssFlows()
	 * @see vpml.processpackage.EMPAssFlow#getMachineType
	 * @model type="vpml.processpackage.EMPAssFlow" opposite="machineType"
	 * @generated
	 */
	EList getAssFlows();

	/**
	 * Returns the value of the '<em><b>Col Machine Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCDiagram#getColMachine <em>Col Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Machine Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Machine Diagram</em>' container reference.
	 * @see #setColMachineDiagram(EMCDiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRMachineType_ColMachineDiagram()
	 * @see vpml.collaborationpackage.EMCDiagram#getColMachine
	 * @model opposite="colMachine"
	 * @generated
	 */
	EMCDiagram getColMachineDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRMachineType#getColMachineDiagram <em>Col Machine Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Machine Diagram</em>' container reference.
	 * @see #getColMachineDiagram()
	 * @generated
	 */
	void setColMachineDiagram(EMCDiagram value);

} // EMRMachineType
