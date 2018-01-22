/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.utilpackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DS Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 分布的参数，三个参数
 * 分布类型、参数1、参数2
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.utilpackage.DSDistribution#getType <em>Type</em>}</li>
 *   <li>{@link vpml.utilpackage.DSDistribution#getDArgument1 <em>DArgument1</em>}</li>
 *   <li>{@link vpml.utilpackage.DSDistribution#getDArgument2 <em>DArgument2</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.utilpackage.UtilpackagePackage#getDSDistribution()
 * @model
 * @generated
 */
public interface DSDistribution extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * The literals are from the enumeration {@link vpml.utilpackage.EnumDistribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 分布类型，缺省值为1，表示常量分布
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see vpml.utilpackage.EnumDistribution
	 * @see #setType(EnumDistribution)
	 * @see vpml.utilpackage.UtilpackagePackage#getDSDistribution_Type()
	 * @model default="1"
	 * @generated
	 */
	EnumDistribution getType();

	/**
	 * Sets the value of the '{@link vpml.utilpackage.DSDistribution#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see vpml.utilpackage.EnumDistribution
	 * @see #getType()
	 * @generated
	 */
	void setType(EnumDistribution value);

	/**
	 * Returns the value of the '<em><b>DArgument1</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DArgument1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DArgument1</em>' attribute.
	 * @see #setDArgument1(double)
	 * @see vpml.utilpackage.UtilpackagePackage#getDSDistribution_DArgument1()
	 * @model default="10"
	 * @generated
	 */
	double getDArgument1();

	/**
	 * Sets the value of the '{@link vpml.utilpackage.DSDistribution#getDArgument1 <em>DArgument1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DArgument1</em>' attribute.
	 * @see #getDArgument1()
	 * @generated
	 */
	void setDArgument1(double value);

	/**
	 * Returns the value of the '<em><b>DArgument2</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DArgument2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DArgument2</em>' attribute.
	 * @see #setDArgument2(double)
	 * @see vpml.utilpackage.UtilpackagePackage#getDSDistribution_DArgument2()
	 * @model default="0"
	 * @generated
	 */
	double getDArgument2();

	/**
	 * Sets the value of the '{@link vpml.utilpackage.DSDistribution#getDArgument2 <em>DArgument2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DArgument2</em>' attribute.
	 * @see #getDArgument2()
	 * @generated
	 */
	void setDArgument2(double value);

} // DSDistribution
