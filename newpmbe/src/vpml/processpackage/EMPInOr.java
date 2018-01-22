/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;

import java.util.HashSet;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP In Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMPInOr（输入或连接符）允许从多个输入产品到单一的活动有多个数据流输入。当资源可用并且所有其它的的连接（例如，时钟连接）得到满足时，若连接到"输入或"的每个输入产品中任何一个到达时，活动将被激活。
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPInOr#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.EMPInOr#getTargetFlows <em>Target Flows</em>}</li>
 *   <li>{@link vpml.processpackage.EMPInOr#getSourceFlows <em>Source Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPInOr()
 * @model
 * @generated
 */
public interface EMPInOr extends EMPInConnector {
	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getInOrs <em>In Ors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPInOr_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getInOrs
	 * @model opposite="inOrs" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPInOr#getEmpDiagram <em>Emp Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp Diagram</em>' container reference.
	 * @see #getEmpDiagram()
	 * @generated
	 */
	void setEmpDiagram(EMPDiagram value);

	/**
	 * Returns the value of the '<em><b>Target Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPDataFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDataFlow#getTargetInOr <em>Target In Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPInOr_TargetFlows()
	 * @see vpml.processpackage.EMPDataFlow#getTargetInOr
	 * @model type="vpml.processpackage.EMPDataFlow" opposite="targetInOr"
	 * @generated
	 */
	EList getTargetFlows();

	/**
	 * Returns the value of the '<em><b>Source Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPDataFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDataFlow#getSourceInOr <em>Source In Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPInOr_SourceFlows()
	 * @see vpml.processpackage.EMPDataFlow#getSourceInOr
	 * @model type="vpml.processpackage.EMPDataFlow" opposite="sourceInOr"
	 * @generated
	 */
	EList getSourceFlows();

	void GetPrevProduct(HashSet plstPrevPro);

	
	/**
	 * @generated not
	 * InOr的目标逻辑连接符是InAnd
	 */
	List getTargetLogicalConnectors();

	/**
	 * @generated not
	 * InOr输出的目标有两种InAnd和活动
	 */
	List getTargetActs();
} // EMPInOr
