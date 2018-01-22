/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP Mile Stone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPMileStone#getProcess <em>Process</em>}</li>
 *   <li>{@link vpml.processpackage.EMPMileStone#getDataFlows <em>Data Flows</em>}</li>
 *   <li>{@link vpml.processpackage.EMPMileStone#getEmpDiagram <em>Emp Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPMileStone()
 * @model
 * @generated
 */
public interface EMPMileStone extends EMPObject {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' attribute.
	 * @see #setProcess(String)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPMileStone_Process()
	 * @model
	 * @generated
	 */
	String getProcess();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPMileStone#getProcess <em>Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' attribute.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(String value);

	/**
	 * Returns the value of the '<em><b>Data Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPDataFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDataFlow#getMileStone <em>Mile Stone</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPMileStone_DataFlows()
	 * @see vpml.processpackage.EMPDataFlow#getMileStone
	 * @model type="vpml.processpackage.EMPDataFlow" opposite="mileStone"
	 * @generated
	 */
	EList getDataFlows();

	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getMileStones <em>Mile Stones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPMileStone_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getMileStones
	 * @model opposite="mileStones" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPMileStone#getEmpDiagram <em>Emp Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp Diagram</em>' container reference.
	 * @see #getEmpDiagram()
	 * @generated
	 */
	void setEmpDiagram(EMPDiagram value);

} // EMPMileStone
