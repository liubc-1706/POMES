/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMIFlow（流连接）不仅用在建立VPML对象间的联系，而且还用在活动间传送产品信息，帮助协调活动的调度。
 * 共有四种流连接：数据流连接（EMIDataFlow），时钟连接（EMIClock）、引用连接（EMIRefFlow）和关联连接（EMIAssFlow）。
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMIFlow#getDirection <em>Direction</em>}</li>
 *   <li>{@link vpml.infopackage.EMIFlow#getNumber <em>Number</em>}</li>
 *   <li>{@link vpml.infopackage.EMIFlow#getSourceNode <em>Source Node</em>}</li>
 *   <li>{@link vpml.infopackage.EMIFlow#getTargetNode <em>Target Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIFlow()
 * @model
 * @generated
 */
public interface EMIFlow extends EMIObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 用来表示连接方向。
	 * 1：PointA-->PointB
	 * 2：PointB-->PointA
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(int)
	 * @see vpml.infopackage.InfopackagePackage#getEMIFlow_Direction()
	 * @model default="1"
	 * @generated
	 */
	int getDirection();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIFlow#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(int value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 数量。具体解释见具体连接。
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see vpml.infopackage.InfopackagePackage#getEMIFlow_Number()
	 * @model default="1"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIFlow#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Source Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMINode#getTargetFlow <em>Target Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Node</em>' reference.
	 * @see #setSourceNode(EMINode)
	 * @see vpml.infopackage.InfopackagePackage#getEMIFlow_SourceNode()
	 * @see vpml.infopackage.EMINode#getTargetFlow
	 * @model opposite="targetFlow"
	 * @generated
	 */
	EMINode getSourceNode();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIFlow#getSourceNode <em>Source Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Node</em>' reference.
	 * @see #getSourceNode()
	 * @generated
	 */
	void setSourceNode(EMINode value);

	/**
	 * Returns the value of the '<em><b>Target Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMINode#getSourceFlow <em>Source Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Node</em>' reference.
	 * @see #setTargetNode(EMINode)
	 * @see vpml.infopackage.InfopackagePackage#getEMIFlow_TargetNode()
	 * @see vpml.infopackage.EMINode#getSourceFlow
	 * @model opposite="sourceFlow"
	 * @generated
	 */
	EMINode getTargetNode();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIFlow#getTargetNode <em>Target Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Node</em>' reference.
	 * @see #getTargetNode()
	 * @generated
	 */
	void setTargetNode(EMINode value);

} // EMIFlow
