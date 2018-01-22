/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPProduct#getTargetDataFlows <em>Target Data Flows</em>}</li>
 *   <li>{@link vpml.processpackage.EMPProduct#getSourceDataFlows <em>Source Data Flows</em>}</li>
 *   <li>{@link vpml.processpackage.EMPProduct#getRefFlows <em>Ref Flows</em>}</li>
 *   <li>{@link vpml.processpackage.EMPProduct#getAssFlows <em>Ass Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPProduct()
 * @model
 * @generated
 */
public interface EMPProduct extends EMPObject {
	/**
	 * Returns the value of the '<em><b>Target Data Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPDataFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDataFlow#getTargetProduct <em>Target Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Data Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Data Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPProduct_TargetDataFlows()
	 * @see vpml.processpackage.EMPDataFlow#getTargetProduct
	 * @model type="vpml.processpackage.EMPDataFlow" opposite="targetProduct"
	 * @generated
	 */
	EList getTargetDataFlows();

	/**
	 * Returns the value of the '<em><b>Source Data Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPDataFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDataFlow#getSourceProduct <em>Source Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Data Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Data Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPProduct_SourceDataFlows()
	 * @see vpml.processpackage.EMPDataFlow#getSourceProduct
	 * @model type="vpml.processpackage.EMPDataFlow" opposite="sourceProduct"
	 * @generated
	 */
	EList getSourceDataFlows();

	/**
	 * Returns the value of the '<em><b>Ref Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPRefFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPRefFlow#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPProduct_RefFlows()
	 * @see vpml.processpackage.EMPRefFlow#getProduct
	 * @model type="vpml.processpackage.EMPRefFlow" opposite="product"
	 * @generated
	 */
	EList getRefFlows();

	/**
	 * Returns the value of the '<em><b>Ass Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPAssFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPAssFlow#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ass Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ass Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPProduct_AssFlows()
	 * @see vpml.processpackage.EMPAssFlow#getProduct
	 * @model type="vpml.processpackage.EMPAssFlow" opposite="product"
	 * @generated
	 */
	EList getAssFlows();

	/**
	 * @generated not
	 */
	List getTargetActs();
	/**
	 * @generated not
	 */
	List getTargetLogicalConnectors();
} // EMPProduct
