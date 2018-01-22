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
 * A representation of the model object '<em><b>EMP Comp Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMPCompActivity����ϻ���൱���ӹ��̡�EMPCompActivity֧�ֻ�ķֲ㶨�壬������̶������ڲ�ͬ��ϸ������Ͻ��й��̶��塣һ��EMPCompActivity���԰���һ�������Ĺ���ͼ����ͼ��������ͼ���ֹ�����Զ�������������Զ���������������ϻ�����ӡ���Ʒ����Դ����ɡ�
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPCompActivity#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.EMPCompActivity#getLeafObjects <em>Leaf Objects</em>}</li>
 *   <li>{@link vpml.processpackage.EMPCompActivity#getAssFlows <em>Ass Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPCompActivity()
 * @model
 * @generated
 */
public interface EMPCompActivity extends EMPActivity {
	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getCompActivities <em>Comp Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPCompActivity_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getCompActivities
	 * @model opposite="compActivities" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPCompActivity#getEmpDiagram <em>Emp Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp Diagram</em>' container reference.
	 * @see #getEmpDiagram()
	 * @generated
	 */
	void setEmpDiagram(EMPDiagram value);

	/**
	 * Returns the value of the '<em><b>Leaf Objects</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPObject}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPObject#getComActivity <em>Com Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leaf Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaf Objects</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPCompActivity_LeafObjects()
	 * @see vpml.processpackage.EMPObject#getComActivity
	 * @model type="vpml.processpackage.EMPObject" opposite="comActivity" containment="true"
	 * @generated
	 */
	EList getLeafObjects();

	/**
	 * Returns the value of the '<em><b>Ass Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPAssFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPAssFlow#getCompActivity <em>Comp Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ass Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ass Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPCompActivity_AssFlows()
	 * @see vpml.processpackage.EMPAssFlow#getCompActivity
	 * @model type="vpml.processpackage.EMPAssFlow" opposite="compActivity"
	 * @generated
	 */
	EList getAssFlows();

} // EMPCompActivity
