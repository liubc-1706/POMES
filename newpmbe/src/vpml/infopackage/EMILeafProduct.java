/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;

import vpml.utilpackage.DSDistribution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Leaf Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMILeafProduct#getProductID <em>Product ID</em>}</li>
 *   <li>{@link vpml.infopackage.EMILeafProduct#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link vpml.infopackage.EMILeafProduct#getIotype <em>Iotype</em>}</li>
 *   <li>{@link vpml.infopackage.EMILeafProduct#getInterval <em>Interval</em>}</li>
 *   <li>{@link vpml.infopackage.EMILeafProduct#getUnit <em>Unit</em>}</li>
 *   <li>{@link vpml.infopackage.EMILeafProduct#getInitList <em>Init List</em>}</li>
 *   <li>{@link vpml.infopackage.EMILeafProduct#getCost <em>Cost</em>}</li>
 *   <li>{@link vpml.infopackage.EMILeafProduct#getDurationTime <em>Duration Time</em>}</li>
 *   <li>{@link vpml.infopackage.EMILeafProduct#getDatabase <em>Database</em>}</li>
 *   <li>{@link vpml.infopackage.EMILeafProduct#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link vpml.infopackage.EMILeafProduct#getDbTableItem <em>Db Table Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMILeafProduct()
 * @model
 * @generated
 */
public interface EMILeafProduct extends EMIProduct {
	/**
	 * Returns the value of the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 产品的唯一标识
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product ID</em>' attribute.
	 * @see #setProductID(String)
	 * @see vpml.infopackage.InfopackagePackage#getEMILeafProduct_ProductID()
	 * @model
	 * @generated
	 */
	String getProductID();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMILeafProduct#getProductID <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product ID</em>' attribute.
	 * @see #getProductID()
	 * @generated
	 */
	void setProductID(String value);

	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 记录附件名（句柄）
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attachment</em>' attribute.
	 * @see #setAttachment(String)
	 * @see vpml.infopackage.InfopackagePackage#getEMILeafProduct_Attachment()
	 * @model
	 * @generated
	 */
	String getAttachment();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMILeafProduct#getAttachment <em>Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment</em>' attribute.
	 * @see #getAttachment()
	 * @generated
	 */
	void setAttachment(String value);

	/**
	 * Returns the value of the '<em><b>Iotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 输入产品的类型，包括非源类型，单一类型和连续类型
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iotype</em>' attribute.
	 * @see #setIotype(String)
	 * @see vpml.infopackage.InfopackagePackage#getEMILeafProduct_Iotype()
	 * @model
	 * @generated
	 */
	String getIotype();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMILeafProduct#getIotype <em>Iotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iotype</em>' attribute.
	 * @see #getIotype()
	 * @generated
	 */
	void setIotype(String value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 时间间隔
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(Integer)
	 * @see vpml.infopackage.InfopackagePackage#getEMILeafProduct_Interval()
	 * @model
	 * @generated
	 */
	Integer getInterval();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMILeafProduct#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(Integer value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 单位，为小时，分，秒等
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see vpml.infopackage.InfopackagePackage#getEMILeafProduct_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMILeafProduct#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Init List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 初始化队列
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Init List</em>' attribute.
	 * @see #setInitList(Integer)
	 * @see vpml.infopackage.InfopackagePackage#getEMILeafProduct_InitList()
	 * @model
	 * @generated
	 */
	Integer getInitList();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMILeafProduct#getInitList <em>Init List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init List</em>' attribute.
	 * @see #getInitList()
	 * @generated
	 */
	void setInitList(Integer value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 原材料费用
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(Double)
	 * @see vpml.infopackage.InfopackagePackage#getEMILeafProduct_Cost()
	 * @model
	 * @generated
	 */
	Double getCost();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMILeafProduct#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(Double value);

	/**
	 * Returns the value of the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Time</em>' containment reference.
	 * @see #setDurationTime(DSDistribution)
	 * @see vpml.infopackage.InfopackagePackage#getEMILeafProduct_DurationTime()
	 * @model containment="true"
	 * @generated
	 */
	DSDistribution getDurationTime();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMILeafProduct#getDurationTime <em>Duration Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Time</em>' containment reference.
	 * @see #getDurationTime()
	 * @generated
	 */
	void setDurationTime(DSDistribution value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' attribute.
	 * @see #setDatabase(String)
	 * @see vpml.infopackage.InfopackagePackage#getEMILeafProduct_Database()
	 * @model
	 * @generated
	 */
	String getDatabase();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMILeafProduct#getDatabase <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' attribute.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(String value);

	/**
	 * Returns the value of the '<em><b>Db Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Table</em>' attribute.
	 * @see #setDbTable(String)
	 * @see vpml.infopackage.InfopackagePackage#getEMILeafProduct_DbTable()
	 * @model
	 * @generated
	 */
	String getDbTable();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMILeafProduct#getDbTable <em>Db Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Table</em>' attribute.
	 * @see #getDbTable()
	 * @generated
	 */
	void setDbTable(String value);

	/**
	 * Returns the value of the '<em><b>Db Table Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Table Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Table Item</em>' attribute.
	 * @see #setDbTableItem(String)
	 * @see vpml.infopackage.InfopackagePackage#getEMILeafProduct_DbTableItem()
	 * @model
	 * @generated
	 */
	String getDbTableItem();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMILeafProduct#getDbTableItem <em>Db Table Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Table Item</em>' attribute.
	 * @see #getDbTableItem()
	 * @generated
	 */
	void setDbTableItem(String value);

} // EMILeafProduct
