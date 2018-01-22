/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage;

import org.eclipse.emf.common.util.EList;

import vpml.processpackage.EMPDiagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMR Tool Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.resourcepackage.EMRToolType#getEmrDiagram <em>Emr Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRToolType#getClassificationRelation <em>Classification Relation</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRToolType#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRToolType#getAssFlows <em>Ass Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRToolType()
 * @model
 * @generated
 */
public interface EMRToolType extends EMRBasicResourceType {
	/**
	 * Returns the value of the '<em><b>Emr Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRDiagram#getToolTypes <em>Tool Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emr Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emr Diagram</em>' container reference.
	 * @see #setEmrDiagram(EMRDiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRToolType_EmrDiagram()
	 * @see vpml.resourcepackage.EMRDiagram#getToolTypes
	 * @model opposite="toolTypes" required="true"
	 * @generated
	 */
	EMRDiagram getEmrDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRToolType#getEmrDiagram <em>Emr Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emr Diagram</em>' container reference.
	 * @see #getEmrDiagram()
	 * @generated
	 */
	void setEmrDiagram(EMRDiagram value);

	/**
	 * Returns the value of the '<em><b>Classification Relation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRClassificationRelation#getToolType <em>Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Relation</em>' reference.
	 * @see #setClassificationRelation(EMRClassificationRelation)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRToolType_ClassificationRelation()
	 * @see vpml.resourcepackage.EMRClassificationRelation#getToolType
	 * @model opposite="toolType" required="true"
	 * @generated
	 */
	EMRClassificationRelation getClassificationRelation();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRToolType#getClassificationRelation <em>Classification Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Relation</em>' reference.
	 * @see #getClassificationRelation()
	 * @generated
	 */
	void setClassificationRelation(EMRClassificationRelation value);

	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getToolTypes <em>Tool Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRToolType_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getToolTypes
	 * @model opposite="toolTypes" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRToolType#getEmpDiagram <em>Emp Diagram</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPAssFlow#getToolType <em>Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ass Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ass Flows</em>' reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRToolType_AssFlows()
	 * @see vpml.processpackage.EMPAssFlow#getToolType
	 * @model type="vpml.processpackage.EMPAssFlow" opposite="toolType"
	 * @generated
	 */
	EList getAssFlows();

} // EMRToolType
