/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;

import java.util.List;

import java.util.HashSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP Out And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMPOutAnd（输出与）表示将活动产生的一个输出数据作为输入，同时输出多个数据流。
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPOutAnd#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.EMPOutAnd#getSourceFlows <em>Source Flows</em>}</li>
 *   <li>{@link vpml.processpackage.EMPOutAnd#getTargetFlows <em>Target Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPOutAnd()
 * @model
 * @generated
 */
public interface EMPOutAnd extends EMPOutConnector {
	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getOutAnds <em>Out Ands</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPOutAnd_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getOutAnds
	 * @model opposite="outAnds" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPOutAnd#getEmpDiagram <em>Emp Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp Diagram</em>' container reference.
	 * @see #getEmpDiagram()
	 * @generated
	 */
	void setEmpDiagram(EMPDiagram value);

	/**
	 * Returns the value of the '<em><b>Source Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPDataFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDataFlow#getSourceOutAnd <em>Source Out And</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPOutAnd_SourceFlows()
	 * @see vpml.processpackage.EMPDataFlow#getSourceOutAnd
	 * @model type="vpml.processpackage.EMPDataFlow" opposite="sourceOutAnd"
	 * @generated
	 */
	EList getSourceFlows();

	/**
	 * Returns the value of the '<em><b>Target Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPDataFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDataFlow#getTargetOutAnd <em>Target Out And</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPOutAnd_TargetFlows()
	 * @see vpml.processpackage.EMPDataFlow#getTargetOutAnd
	 * @model type="vpml.processpackage.EMPDataFlow" opposite="targetOutAnd"
	 * @generated
	 */
	EList getTargetFlows();

	//add by cty begin
	/**
	 * @generated not
	 * OutAnd的目标逻辑连接符是OutOr
	 */
	List getTargetLogicalConnectors();

	/**
	 * @generated not
	 * OutAnd输出的目标有两种OutOr和产品
	 */
	List getTargetProducts();
	//add by cty end
	
	void GetAllSuccLeafProduct(HashSet plstSuccPro);


} // EMPOutAnd
