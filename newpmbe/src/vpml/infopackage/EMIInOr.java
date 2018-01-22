/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI In Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMIInOr（输入或连接符）允许从多个输入产品到单一的活动有多个数据流输入。当资源可用并且所有其它的的连接（例如，时钟连接）得到满足时，若连接到"输入或"的每个输入产品中任何一个到达时，活动将被激活。
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMIInOr#getInorDiagram <em>Inor Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIInOr()
 * @model
 * @generated
 */
public interface EMIInOr extends EMIInConnector {
	/**
	 * Returns the value of the '<em><b>Inor Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIDiagram#getInor <em>Inor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inor Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inor Diagram</em>' container reference.
	 * @see #setInorDiagram(EMIDiagram)
	 * @see vpml.infopackage.InfopackagePackage#getEMIInOr_InorDiagram()
	 * @see vpml.infopackage.EMIDiagram#getInor
	 * @model opposite="inor"
	 * @generated
	 */
	EMIDiagram getInorDiagram();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIInOr#getInorDiagram <em>Inor Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inor Diagram</em>' container reference.
	 * @see #getInorDiagram()
	 * @generated
	 */
	void setInorDiagram(EMIDiagram value);

} // EMIInOr
