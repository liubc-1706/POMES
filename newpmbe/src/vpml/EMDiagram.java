/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EM Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMDiagram 包括企业资源图，组织模型图，过程图和数据图。企业资源图描述资源分类树，包括资源类型定义、资源实体定义以及资源类型之间的分类关系，资源实体与基本资源类型之间的实例关系。
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.EMDiagram#getCreater <em>Creater</em>}</li>
 *   <li>{@link vpml.EMDiagram#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link vpml.EMDiagram#getLastModifier <em>Last Modifier</em>}</li>
 *   <li>{@link vpml.EMDiagram#getLastModifiedDate <em>Last Modified Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.VpmlPackage#getEMDiagram()
 * @model
 * @generated
 */
public interface EMDiagram extends EMObject {
	/**
	 * Returns the value of the '<em><b>Creater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creater</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creater</em>' attribute.
	 * @see #setCreater(String)
	 * @see vpml.VpmlPackage#getEMDiagram_Creater()
	 * @model
	 * @generated
	 */
	String getCreater();

	/**
	 * Sets the value of the '{@link vpml.EMDiagram#getCreater <em>Creater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creater</em>' attribute.
	 * @see #getCreater()
	 * @generated
	 */
	void setCreater(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see vpml.VpmlPackage#getEMDiagram_CreatedDate()
	 * @model dataType="vpml.utilpackage.JavaDate"
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link vpml.EMDiagram#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modifier</em>' attribute.
	 * @see #setLastModifier(String)
	 * @see vpml.VpmlPackage#getEMDiagram_LastModifier()
	 * @model
	 * @generated
	 */
	String getLastModifier();

	/**
	 * Sets the value of the '{@link vpml.EMDiagram#getLastModifier <em>Last Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modifier</em>' attribute.
	 * @see #getLastModifier()
	 * @generated
	 */
	void setLastModifier(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see vpml.VpmlPackage#getEMDiagram_LastModifiedDate()
	 * @model dataType="vpml.utilpackage.JavaDate"
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link vpml.EMDiagram#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

} // EMDiagram
