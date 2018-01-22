/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Out And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMIOutAnd������룩��ʾ���������һ�����������Ϊ���룬ͬʱ��������������
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMIOutAnd#getOutandDiagram <em>Outand Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIOutAnd()
 * @model
 * @generated
 */
public interface EMIOutAnd extends EMIOutConnector {
	/**
	 * Returns the value of the '<em><b>Outand Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIDiagram#getOutand <em>Outand</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outand Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outand Diagram</em>' container reference.
	 * @see #setOutandDiagram(EMIDiagram)
	 * @see vpml.infopackage.InfopackagePackage#getEMIOutAnd_OutandDiagram()
	 * @see vpml.infopackage.EMIDiagram#getOutand
	 * @model opposite="outand"
	 * @generated
	 */
	EMIDiagram getOutandDiagram();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIOutAnd#getOutandDiagram <em>Outand Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outand Diagram</em>' container reference.
	 * @see #getOutandDiagram()
	 * @generated
	 */
	void setOutandDiagram(EMIDiagram value);

} // EMIOutAnd
