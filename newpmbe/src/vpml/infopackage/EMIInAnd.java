/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI In And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMIInAnd�����������ӷ����������Զ�������Ʒ�����������ӡ�����Դ���ò����������������ӣ����磬ʱ�����ӣ��õ�����ʱ�������ӵ�"������"��ÿ�������Ʒ�ж�����ʱ����������
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMIInAnd#getInandDiagram <em>Inand Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIInAnd()
 * @model
 * @generated
 */
public interface EMIInAnd extends EMIInConnector {
	/**
	 * Returns the value of the '<em><b>Inand Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIDiagram#getInand <em>Inand</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inand Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inand Diagram</em>' container reference.
	 * @see #setInandDiagram(EMIDiagram)
	 * @see vpml.infopackage.InfopackagePackage#getEMIInAnd_InandDiagram()
	 * @see vpml.infopackage.EMIDiagram#getInand
	 * @model opposite="inand"
	 * @generated
	 */
	EMIDiagram getInandDiagram();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIInAnd#getInandDiagram <em>Inand Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inand Diagram</em>' container reference.
	 * @see #getInandDiagram()
	 * @generated
	 */
	void setInandDiagram(EMIDiagram value);

} // EMIInAnd
