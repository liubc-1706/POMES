/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP Ref Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPRefFlow#getActivity <em>Activity</em>}</li>
 *   <li>{@link vpml.processpackage.EMPRefFlow#getProduct <em>Product</em>}</li>
 *   <li>{@link vpml.processpackage.EMPRefFlow#getEmpDiagram <em>Emp Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPRefFlow()
 * @model
 * @generated
 */
public interface EMPRefFlow extends EMPFlow {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPActivity#getRefFlows <em>Ref Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(EMPActivity)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPRefFlow_Activity()
	 * @see vpml.processpackage.EMPActivity#getRefFlows
	 * @model opposite="refFlows" required="true"
	 * @generated
	 */
	EMPActivity getActivity();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPRefFlow#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(EMPActivity value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPProduct#getRefFlows <em>Ref Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(EMPProduct)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPRefFlow_Product()
	 * @see vpml.processpackage.EMPProduct#getRefFlows
	 * @model opposite="refFlows" required="true"
	 * @generated
	 */
	EMPProduct getProduct();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPRefFlow#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(EMPProduct value);

	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getRefFlows <em>Ref Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPRefFlow_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getRefFlows
	 * @model opposite="refFlows" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPRefFlow#getEmpDiagram <em>Emp Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp Diagram</em>' container reference.
	 * @see #getEmpDiagram()
	 * @generated
	 */
	void setEmpDiagram(EMPDiagram value);

} // EMPRefFlow
