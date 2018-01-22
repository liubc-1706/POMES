/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;

import vpml.utilpackage.DSDistribution;
import vpml.utilpackage.EnumIOType;
import vpml.utilpackage.EnumTimeUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP Leaf Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPLeafProduct#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link vpml.processpackage.EMPLeafProduct#getIoType <em>Io Type</em>}</li>
 *   <li>{@link vpml.processpackage.EMPLeafProduct#getPeriod <em>Period</em>}</li>
 *   <li>{@link vpml.processpackage.EMPLeafProduct#getDurationTime <em>Duration Time</em>}</li>
 *   <li>{@link vpml.processpackage.EMPLeafProduct#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link vpml.processpackage.EMPLeafProduct#getInitQueue <em>Init Queue</em>}</li>
 *   <li>{@link vpml.processpackage.EMPLeafProduct#getCost <em>Cost</em>}</li>
 *   <li>{@link vpml.processpackage.EMPLeafProduct#getTopProductPackage <em>Top Product Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPLeafProduct()
 * @model
 * @generated
 */
public interface EMPLeafProduct extends EMPProduct {
	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 记录附件名（句柄）
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attachment</em>' attribute.
	 * @see #setAttachment(String)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPLeafProduct_Attachment()
	 * @model
	 * @generated
	 */
	String getAttachment();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPLeafProduct#getAttachment <em>Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment</em>' attribute.
	 * @see #getAttachment()
	 * @generated
	 */
	void setAttachment(String value);

	/**
	 * Returns the value of the '<em><b>Io Type</b></em>' attribute.
	 * The default value is <code>"NON_SOURCE"</code>.
	 * The literals are from the enumeration {@link vpml.utilpackage.EnumIOType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 输入产品的类型，包括非源类型，单一类型和连续类型
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Io Type</em>' attribute.
	 * @see vpml.utilpackage.EnumIOType
	 * @see #setIoType(EnumIOType)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPLeafProduct_IoType()
	 * @model default="NON_SOURCE"
	 * @generated
	 */
	EnumIOType getIoType();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPLeafProduct#getIoType <em>Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io Type</em>' attribute.
	 * @see vpml.utilpackage.EnumIOType
	 * @see #getIoType()
	 * @generated
	 */
	void setIoType(EnumIOType value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 时间间隔(周期)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(Integer)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPLeafProduct_Period()
	 * @model default="0"
	 * @generated
	 */
	Integer getPeriod();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPLeafProduct#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Integer value);

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
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPLeafProduct_DurationTime()
	 * @model containment="true"
	 * @generated
	 */
	DSDistribution getDurationTime();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPLeafProduct#getDurationTime <em>Duration Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Time</em>' containment reference.
	 * @see #getDurationTime()
	 * @generated
	 */
	void setDurationTime(DSDistribution value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The default value is <code>"HOUR"</code>.
	 * The literals are from the enumeration {@link vpml.utilpackage.EnumTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 单位，为小时，分，秒等
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see vpml.utilpackage.EnumTimeUnit
	 * @see #setTimeUnit(EnumTimeUnit)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPLeafProduct_TimeUnit()
	 * @model default="HOUR"
	 * @generated
	 */
	EnumTimeUnit getTimeUnit();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPLeafProduct#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see vpml.utilpackage.EnumTimeUnit
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(EnumTimeUnit value);

	/**
	 * Returns the value of the '<em><b>Init Queue</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 初始化队列
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Init Queue</em>' attribute.
	 * @see #setInitQueue(Integer)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPLeafProduct_InitQueue()
	 * @model default="0"
	 * @generated
	 */
	Integer getInitQueue();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPLeafProduct#getInitQueue <em>Init Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Queue</em>' attribute.
	 * @see #getInitQueue()
	 * @generated
	 */
	void setInitQueue(Integer value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 原材料费用
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(Double)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPLeafProduct_Cost()
	 * @model default="0.0"
	 * @generated
	 */
	Double getCost();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPLeafProduct#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(Double value);

	/**
	 * Returns the value of the '<em><b>Top Product Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPProductPackage#getLeafProducts <em>Leaf Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Product Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Product Package</em>' container reference.
	 * @see #setTopProductPackage(EMPProductPackage)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPLeafProduct_TopProductPackage()
	 * @see vpml.processpackage.EMPProductPackage#getLeafProducts
	 * @model opposite="leafProducts"
	 * @generated
	 */
	EMPProductPackage getTopProductPackage();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPLeafProduct#getTopProductPackage <em>Top Product Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Product Package</em>' container reference.
	 * @see #getTopProductPackage()
	 * @generated
	 */
	void setTopProductPackage(EMPProductPackage value);

} // EMPLeafProduct
