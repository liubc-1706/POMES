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
 * A representation of the model object '<em><b>EMP In And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMPInAnd（输入与连接符）允许来自多个输入产品的数据流连接。当资源可用并且所有其它的连接（例如，时钟连接）得到满足时，若连接到"输入与"的每个输入产品中都到达时，活动将被激活。
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPInAnd#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.EMPInAnd#getSourceFlows <em>Source Flows</em>}</li>
 *   <li>{@link vpml.processpackage.EMPInAnd#getTargetFlows <em>Target Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPInAnd()
 * @model
 * @generated
 */
public interface EMPInAnd extends EMPInConnector {
	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getInAnds <em>In Ands</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPInAnd_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getInAnds
	 * @model opposite="inAnds" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPInAnd#getEmpDiagram <em>Emp Diagram</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDataFlow#getSourceInAnd <em>Source In And</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPInAnd_SourceFlows()
	 * @see vpml.processpackage.EMPDataFlow#getSourceInAnd
	 * @model type="vpml.processpackage.EMPDataFlow" opposite="sourceInAnd"
	 * @generated
	 */
	EList getSourceFlows();

	/**
	 * Returns the value of the '<em><b>Target Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPDataFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDataFlow#getTargetInAnd <em>Target In And</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPInAnd_TargetFlows()
	 * @see vpml.processpackage.EMPDataFlow#getTargetInAnd
	 * @model type="vpml.processpackage.EMPDataFlow" opposite="targetInAnd"
	 * @generated
	 */
	EList getTargetFlows();

	void GetPrevProduct(HashSet plstPrevPro);

	/**
	 * @generated not
	 * InAnd的目标逻辑连接符是InOr
	 */
	List getTargetLogicalConnectors();

	/**
	 * @generated not
	 * InAnd输出的目标有两种InOr和活动
	 */
	List getTargetActs();
} // EMPInAnd
