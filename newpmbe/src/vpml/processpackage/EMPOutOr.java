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
 * A representation of the model object '<em><b>EMP Out Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMPOutOr（输出或）表示将活动产生的一个输出数据作为输入，仅向一个输出数据流输出产品。
 * 一个输出或所连接的所有输出连接流上的概率值（iProbability）应为1000。
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPOutOr#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.EMPOutOr#getSourceFlows <em>Source Flows</em>}</li>
 *   <li>{@link vpml.processpackage.EMPOutOr#getTargetFlows <em>Target Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPOutOr()
 * @model
 * @generated
 */
public interface EMPOutOr extends EMPOutConnector {
	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getOutOrs <em>Out Ors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPOutOr_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getOutOrs
	 * @model opposite="outOrs" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPOutOr#getEmpDiagram <em>Emp Diagram</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDataFlow#getSourceOutOr <em>Source Out Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPOutOr_SourceFlows()
	 * @see vpml.processpackage.EMPDataFlow#getSourceOutOr
	 * @model type="vpml.processpackage.EMPDataFlow" opposite="sourceOutOr"
	 * @generated
	 */
	EList getSourceFlows();

	/**
	 * Returns the value of the '<em><b>Target Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPDataFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDataFlow#getTargetOutOr <em>Target Out Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPOutOr_TargetFlows()
	 * @see vpml.processpackage.EMPDataFlow#getTargetOutOr
	 * @model type="vpml.processpackage.EMPDataFlow" opposite="targetOutOr"
	 * @generated
	 */
	EList getTargetFlows();

	//add by cty begin
	/**
	 * @generated not
	 * OutOr的目标逻辑连接符是OutAnd
	 */
	List getTargetLogicalConnectors();

	/**
	 * @generated not
	 * OutOr输出的目标有两种OutAnd和产品
	 */
	List getTargetProducts();
	//add by cty end
	void GetAllSuccLeafProduct(HashSet plstSuccPro);


} // EMPOutOr
