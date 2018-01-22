/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;

import vpml.EMObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP Data Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMPDataFlow（数据流连接）是有向的连接，用带箭头的连线指示信息流的方向。
 * 根据流前后的节点不同，将数据流具体分为了活动到产品、活动到输出逻辑连接符、产品到活动、产品到输入逻辑连接符、输出逻辑连接符到产品、输出逻辑连接符到输出逻辑连接符、输入逻辑连接符到活动、输入逻辑连接符到输入逻辑连接符、产品到里程碑这九种连接流。
 * 这九种流在图形表示上都是一样的，只是为了方便实现，因此予以区分。
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPDataFlow#getProbability <em>Probability</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDataFlow#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDataFlow#getTargetProduct <em>Target Product</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDataFlow#getTargetActivity <em>Target Activity</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDataFlow#getSourceProduct <em>Source Product</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDataFlow#getSourceActivity <em>Source Activity</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDataFlow#getSourceInAnd <em>Source In And</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDataFlow#getTargetInAnd <em>Target In And</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDataFlow#getTargetInOr <em>Target In Or</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDataFlow#getSourceInOr <em>Source In Or</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDataFlow#getSourceOutAnd <em>Source Out And</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDataFlow#getTargetOutAnd <em>Target Out And</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDataFlow#getSourceOutOr <em>Source Out Or</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDataFlow#getTargetOutOr <em>Target Out Or</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDataFlow#getMileStone <em>Mile Stone</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPDataFlow()
 * @model
 * @generated
 */
public interface EMPDataFlow extends EMPFlow {
	
	
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(Double)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDataFlow_Probability()
	 * @model default="1"
	 * @generated
	 */
	Double getProbability();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDataFlow#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(Double value);

	//xsm
//	public  float GetProbability();
//	
//	public void SetProbability(float Probability);
	
	public EMObject GetStartPoint();
	
	public EMObject GetEndPoint();
	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getDataFlows <em>Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDataFlow_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getDataFlows
	 * @model opposite="dataFlows" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDataFlow#getEmpDiagram <em>Emp Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp Diagram</em>' container reference.
	 * @see #getEmpDiagram()
	 * @generated
	 */
	void setEmpDiagram(EMPDiagram value);

	/**
	 * Returns the value of the '<em><b>Target Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPProduct#getTargetDataFlows <em>Target Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Product</em>' reference.
	 * @see #setTargetProduct(EMPProduct)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDataFlow_TargetProduct()
	 * @see vpml.processpackage.EMPProduct#getTargetDataFlows
	 * @model opposite="targetDataFlows"
	 * @generated
	 */
	EMPProduct getTargetProduct();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDataFlow#getTargetProduct <em>Target Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Product</em>' reference.
	 * @see #getTargetProduct()
	 * @generated
	 */
	void setTargetProduct(EMPProduct value);

	/**
	 * Returns the value of the '<em><b>Target Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPActivity#getTargetDataFlows <em>Target Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Activity</em>' reference.
	 * @see #setTargetActivity(EMPActivity)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDataFlow_TargetActivity()
	 * @see vpml.processpackage.EMPActivity#getTargetDataFlows
	 * @model opposite="targetDataFlows"
	 * @generated
	 */
	EMPActivity getTargetActivity();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDataFlow#getTargetActivity <em>Target Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Activity</em>' reference.
	 * @see #getTargetActivity()
	 * @generated
	 */
	void setTargetActivity(EMPActivity value);

	/**
	 * Returns the value of the '<em><b>Source Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPProduct#getSourceDataFlows <em>Source Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Product</em>' reference.
	 * @see #setSourceProduct(EMPProduct)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDataFlow_SourceProduct()
	 * @see vpml.processpackage.EMPProduct#getSourceDataFlows
	 * @model opposite="sourceDataFlows"
	 * @generated
	 */
	EMPProduct getSourceProduct();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDataFlow#getSourceProduct <em>Source Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Product</em>' reference.
	 * @see #getSourceProduct()
	 * @generated
	 */
	void setSourceProduct(EMPProduct value);

	/**
	 * Returns the value of the '<em><b>Source Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPActivity#getSourceDataFlows <em>Source Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Activity</em>' reference.
	 * @see #setSourceActivity(EMPActivity)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDataFlow_SourceActivity()
	 * @see vpml.processpackage.EMPActivity#getSourceDataFlows
	 * @model opposite="sourceDataFlows"
	 * @generated
	 */
	EMPActivity getSourceActivity();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDataFlow#getSourceActivity <em>Source Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Activity</em>' reference.
	 * @see #getSourceActivity()
	 * @generated
	 */
	void setSourceActivity(EMPActivity value);

	/**
	 * Returns the value of the '<em><b>Source In And</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPInAnd#getSourceFlows <em>Source Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source In And</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source In And</em>' reference.
	 * @see #setSourceInAnd(EMPInAnd)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDataFlow_SourceInAnd()
	 * @see vpml.processpackage.EMPInAnd#getSourceFlows
	 * @model opposite="sourceFlows"
	 * @generated
	 */
	EMPInAnd getSourceInAnd();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDataFlow#getSourceInAnd <em>Source In And</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source In And</em>' reference.
	 * @see #getSourceInAnd()
	 * @generated
	 */
	void setSourceInAnd(EMPInAnd value);

	/**
	 * Returns the value of the '<em><b>Target In And</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPInAnd#getTargetFlows <em>Target Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target In And</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target In And</em>' reference.
	 * @see #setTargetInAnd(EMPInAnd)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDataFlow_TargetInAnd()
	 * @see vpml.processpackage.EMPInAnd#getTargetFlows
	 * @model opposite="targetFlows"
	 * @generated
	 */
	EMPInAnd getTargetInAnd();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDataFlow#getTargetInAnd <em>Target In And</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target In And</em>' reference.
	 * @see #getTargetInAnd()
	 * @generated
	 */
	void setTargetInAnd(EMPInAnd value);

	/**
	 * Returns the value of the '<em><b>Target In Or</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPInOr#getTargetFlows <em>Target Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target In Or</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target In Or</em>' reference.
	 * @see #setTargetInOr(EMPInOr)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDataFlow_TargetInOr()
	 * @see vpml.processpackage.EMPInOr#getTargetFlows
	 * @model opposite="targetFlows"
	 * @generated
	 */
	EMPInOr getTargetInOr();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDataFlow#getTargetInOr <em>Target In Or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target In Or</em>' reference.
	 * @see #getTargetInOr()
	 * @generated
	 */
	void setTargetInOr(EMPInOr value);

	/**
	 * Returns the value of the '<em><b>Source In Or</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPInOr#getSourceFlows <em>Source Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source In Or</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source In Or</em>' reference.
	 * @see #setSourceInOr(EMPInOr)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDataFlow_SourceInOr()
	 * @see vpml.processpackage.EMPInOr#getSourceFlows
	 * @model opposite="sourceFlows"
	 * @generated
	 */
	EMPInOr getSourceInOr();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDataFlow#getSourceInOr <em>Source In Or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source In Or</em>' reference.
	 * @see #getSourceInOr()
	 * @generated
	 */
	void setSourceInOr(EMPInOr value);

	/**
	 * Returns the value of the '<em><b>Source Out And</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPOutAnd#getSourceFlows <em>Source Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Out And</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Out And</em>' reference.
	 * @see #setSourceOutAnd(EMPOutAnd)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDataFlow_SourceOutAnd()
	 * @see vpml.processpackage.EMPOutAnd#getSourceFlows
	 * @model opposite="sourceFlows"
	 * @generated
	 */
	EMPOutAnd getSourceOutAnd();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDataFlow#getSourceOutAnd <em>Source Out And</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Out And</em>' reference.
	 * @see #getSourceOutAnd()
	 * @generated
	 */
	void setSourceOutAnd(EMPOutAnd value);

	/**
	 * Returns the value of the '<em><b>Target Out And</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPOutAnd#getTargetFlows <em>Target Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Out And</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Out And</em>' reference.
	 * @see #setTargetOutAnd(EMPOutAnd)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDataFlow_TargetOutAnd()
	 * @see vpml.processpackage.EMPOutAnd#getTargetFlows
	 * @model opposite="targetFlows"
	 * @generated
	 */
	EMPOutAnd getTargetOutAnd();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDataFlow#getTargetOutAnd <em>Target Out And</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Out And</em>' reference.
	 * @see #getTargetOutAnd()
	 * @generated
	 */
	void setTargetOutAnd(EMPOutAnd value);

	/**
	 * Returns the value of the '<em><b>Source Out Or</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPOutOr#getSourceFlows <em>Source Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Out Or</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Out Or</em>' reference.
	 * @see #setSourceOutOr(EMPOutOr)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDataFlow_SourceOutOr()
	 * @see vpml.processpackage.EMPOutOr#getSourceFlows
	 * @model opposite="sourceFlows"
	 * @generated
	 */
	EMPOutOr getSourceOutOr();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDataFlow#getSourceOutOr <em>Source Out Or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Out Or</em>' reference.
	 * @see #getSourceOutOr()
	 * @generated
	 */
	void setSourceOutOr(EMPOutOr value);

	/**
	 * Returns the value of the '<em><b>Target Out Or</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPOutOr#getTargetFlows <em>Target Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Out Or</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Out Or</em>' reference.
	 * @see #setTargetOutOr(EMPOutOr)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDataFlow_TargetOutOr()
	 * @see vpml.processpackage.EMPOutOr#getTargetFlows
	 * @model opposite="targetFlows"
	 * @generated
	 */
	EMPOutOr getTargetOutOr();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDataFlow#getTargetOutOr <em>Target Out Or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Out Or</em>' reference.
	 * @see #getTargetOutOr()
	 * @generated
	 */
	void setTargetOutOr(EMPOutOr value);

	/**
	 * Returns the value of the '<em><b>Mile Stone</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPMileStone#getDataFlows <em>Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mile Stone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mile Stone</em>' reference.
	 * @see #setMileStone(EMPMileStone)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDataFlow_MileStone()
	 * @see vpml.processpackage.EMPMileStone#getDataFlows
	 * @model opposite="dataFlows"
	 * @generated
	 */
	EMPMileStone getMileStone();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDataFlow#getMileStone <em>Mile Stone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mile Stone</em>' reference.
	 * @see #getMileStone()
	 * @generated
	 */
	void setMileStone(EMPMileStone value);

} // EMPDataFlow
