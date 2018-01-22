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
 * A representation of the model object '<em><b>EMP Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMPObject是过程模型中所有对象的基类，它继承自企业模型基本对象。
 * 每一个EMPObject都记录了其父节点，即其所在的组合活动
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPObject#getComActivity <em>Com Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPObject()
 * @model
 * @generated
 */
public interface EMPObject extends EMObject {
	/**
	 * Returns the value of the '<em><b>Com Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPCompActivity#getLeafObjects <em>Leaf Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Activity</em>' container reference.
	 * @see #setComActivity(EMPCompActivity)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPObject_ComActivity()
	 * @see vpml.processpackage.EMPCompActivity#getLeafObjects
	 * @model opposite="leafObjects"
	 * @generated NOT
	 */
	EMPCompActivity getCompActivity();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPObject#getcompActivity <em>Com Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Activity</em>' container reference.
	 * @see #getcompActivity()
	 * @generated NOT
	 */
	void setCompActivity(EMPCompActivity value);

} // EMPObject
