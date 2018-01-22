/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP Clock Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMPClockFlow（时钟连接）是从时钟到活动的有向连接。
 * 模拟过程中，时钟连接每隔一个规定的时间间隔发出一个消息。只有当消息到达后，活动才会被激活。它通常用于模拟周期性的活动。
 * 时钟连接的iNumber=1，且不能修改。
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPClockFlow#getActivity <em>Activity</em>}</li>
 *   <li>{@link vpml.processpackage.EMPClockFlow#getClock <em>Clock</em>}</li>
 *   <li>{@link vpml.processpackage.EMPClockFlow#getEmpDiagram <em>Emp Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPClockFlow()
 * @model
 * @generated
 */
public interface EMPClockFlow extends EMPFlow {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPActivity#getClockFlow <em>Clock Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(EMPActivity)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPClockFlow_Activity()
	 * @see vpml.processpackage.EMPActivity#getClockFlow
	 * @model opposite="clockFlow" required="true"
	 * @generated
	 */
	EMPActivity getActivity();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPClockFlow#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(EMPActivity value);

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPClock#getClockFlows <em>Clock Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' reference.
	 * @see #setClock(EMPClock)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPClockFlow_Clock()
	 * @see vpml.processpackage.EMPClock#getClockFlows
	 * @model opposite="clockFlows" required="true"
	 * @generated
	 */
	EMPClock getClock();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPClockFlow#getClock <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(EMPClock value);

	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getClockFlows <em>Clock Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPClockFlow_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getClockFlows
	 * @model opposite="clockFlows" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPClockFlow#getEmpDiagram <em>Emp Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp Diagram</em>' container reference.
	 * @see #getEmpDiagram()
	 * @generated
	 */
	void setEmpDiagram(EMPDiagram value);

} // EMPClockFlow
