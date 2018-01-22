/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Out Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMIOutOr������򣩱�ʾ���������һ�����������Ϊ���룬����һ����������������Ʒ��
 * һ������������ӵ���������������ϵĸ���ֵ��iProbability��ӦΪ1000��
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMIOutOr#getOutorDiagram <em>Outor Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIOutOr()
 * @model
 * @generated
 */
public interface EMIOutOr extends EMIOutConnector {
	/**
	 * Returns the value of the '<em><b>Outor Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIDiagram#getOutor <em>Outor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outor Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outor Diagram</em>' container reference.
	 * @see #setOutorDiagram(EMIDiagram)
	 * @see vpml.infopackage.InfopackagePackage#getEMIOutOr_OutorDiagram()
	 * @see vpml.infopackage.EMIDiagram#getOutor
	 * @model opposite="outor"
	 * @generated
	 */
	EMIDiagram getOutorDiagram();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIOutOr#getOutorDiagram <em>Outor Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outor Diagram</em>' container reference.
	 * @see #getOutorDiagram()
	 * @generated
	 */
	void setOutorDiagram(EMIDiagram value);

} // EMIOutOr
