/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;

import vpml.utilpackage.EnumBatchType;
import vpml.utilpackage.EnumTimeUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP Batch Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMPBatchActivity（批处理活动），按批量同时处理多个输入产品
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPBatchActivity#getBatchType <em>Batch Type</em>}</li>
 *   <li>{@link vpml.processpackage.EMPBatchActivity#getBatStartTime <em>Bat Start Time</em>}</li>
 *   <li>{@link vpml.processpackage.EMPBatchActivity#getBatEndTime <em>Bat End Time</em>}</li>
 *   <li>{@link vpml.processpackage.EMPBatchActivity#getRestartPeriod <em>Restart Period</em>}</li>
 *   <li>{@link vpml.processpackage.EMPBatchActivity#getBatTimeUnit <em>Bat Time Unit</em>}</li>
 *   <li>{@link vpml.processpackage.EMPBatchActivity#getTimerQueueFlag <em>Timer Queue Flag</em>}</li>
 *   <li>{@link vpml.processpackage.EMPBatchActivity#getEmergencyFlag <em>Emergency Flag</em>}</li>
 *   <li>{@link vpml.processpackage.EMPBatchActivity#getIntervalValue <em>Interval Value</em>}</li>
 *   <li>{@link vpml.processpackage.EMPBatchActivity#getIntervalTimeUnit <em>Interval Time Unit</em>}</li>
 *   <li>{@link vpml.processpackage.EMPBatchActivity#getMaxQuantity <em>Max Quantity</em>}</li>
 *   <li>{@link vpml.processpackage.EMPBatchActivity#getMinQuantity <em>Min Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPBatchActivity()
 * @model
 * @generated
 */
public interface EMPBatchActivity extends EMPLeafActivity {
	/**
	 * Returns the value of the '<em><b>Batch Type</b></em>' attribute.
	 * The default value is <code>"TIME_ONLY"</code>.
	 * The literals are from the enumeration {@link vpml.utilpackage.EnumBatchType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 批处理类型
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Batch Type</em>' attribute.
	 * @see vpml.utilpackage.EnumBatchType
	 * @see #setBatchType(EnumBatchType)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPBatchActivity_BatchType()
	 * @model default="TIME_ONLY"
	 * @generated
	 */
	EnumBatchType getBatchType();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPBatchActivity#getBatchType <em>Batch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch Type</em>' attribute.
	 * @see vpml.utilpackage.EnumBatchType
	 * @see #getBatchType()
	 * @generated
	 */
	void setBatchType(EnumBatchType value);

	Double getBatStartTime();
	
	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPBatchActivity#getBatStartTime <em>Bat Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bat Start Time</em>' attribute.
	 * @see #getBatStartTime()
	 * @generated
	 */
	void setBatStartTime(Double value);

	/**
	 * Returns the value of the '<em><b>Bat End Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 批处理活动结束时间
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bat End Time</em>' attribute.
	 * @see #setBatEndTime(Double)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPBatchActivity_BatEndTime()
	 * @model default="0"
	 * @generated
	 */
	Double getBatEndTime();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPBatchActivity#getBatEndTime <em>Bat End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bat End Time</em>' attribute.
	 * @see #getBatEndTime()
	 * @generated
	 */
	void setBatEndTime(Double value);

	/**
	 * Returns the value of the '<em><b>Restart Period</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 重做周期
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Restart Period</em>' attribute.
	 * @see #setRestartPeriod(Double)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPBatchActivity_RestartPeriod()
	 * @model default="0"
	 * @generated
	 */
	Double getRestartPeriod();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPBatchActivity#getRestartPeriod <em>Restart Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart Period</em>' attribute.
	 * @see #getRestartPeriod()
	 * @generated
	 */
	void setRestartPeriod(Double value);

	/**
	 * Returns the value of the '<em><b>Bat Time Unit</b></em>' attribute.
	 * The default value is <code>"HOUR"</code>.
	 * The literals are from the enumeration {@link vpml.utilpackage.EnumTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bat Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bat Time Unit</em>' attribute.
	 * @see vpml.utilpackage.EnumTimeUnit
	 * @see #setBatTimeUnit(EnumTimeUnit)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPBatchActivity_BatTimeUnit()
	 * @model default="HOUR"
	 * @generated
	 */
	EnumTimeUnit getBatTimeUnit();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPBatchActivity#getBatTimeUnit <em>Bat Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bat Time Unit</em>' attribute.
	 * @see vpml.utilpackage.EnumTimeUnit
	 * @see #getBatTimeUnit()
	 * @generated
	 */
	void setBatTimeUnit(EnumTimeUnit value);

	/**
	 * Returns the value of the '<em><b>Timer Queue Flag</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 时钟队列标志
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timer Queue Flag</em>' attribute.
	 * @see #setTimerQueueFlag(Boolean)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPBatchActivity_TimerQueueFlag()
	 * @model default="false"
	 * @generated
	 */
	Boolean getTimerQueueFlag();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPBatchActivity#getTimerQueueFlag <em>Timer Queue Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer Queue Flag</em>' attribute.
	 * @see #getTimerQueueFlag()
	 * @generated
	 */
	void setTimerQueueFlag(Boolean value);

	/**
	 * Returns the value of the '<em><b>Emergency Flag</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 紧急状况标志
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Emergency Flag</em>' attribute.
	 * @see #setEmergencyFlag(Boolean)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPBatchActivity_EmergencyFlag()
	 * @model default="false"
	 * @generated
	 */
	Boolean getEmergencyFlag();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPBatchActivity#getEmergencyFlag <em>Emergency Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emergency Flag</em>' attribute.
	 * @see #getEmergencyFlag()
	 * @generated
	 */
	void setEmergencyFlag(Boolean value);

	/**
	 * Returns the value of the '<em><b>Interval Value</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 时间间隔
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interval Value</em>' attribute.
	 * @see #setIntervalValue(Double)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPBatchActivity_IntervalValue()
	 * @model default="1"
	 * @generated
	 */
	Double getIntervalValue();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPBatchActivity#getIntervalValue <em>Interval Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Value</em>' attribute.
	 * @see #getIntervalValue()
	 * @generated
	 */
	void setIntervalValue(Double value);

	/**
	 * Returns the value of the '<em><b>Interval Time Unit</b></em>' attribute.
	 * The default value is <code>"HOUR"</code>.
	 * The literals are from the enumeration {@link vpml.utilpackage.EnumTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 时间间隔单位
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interval Time Unit</em>' attribute.
	 * @see vpml.utilpackage.EnumTimeUnit
	 * @see #setIntervalTimeUnit(EnumTimeUnit)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPBatchActivity_IntervalTimeUnit()
	 * @model default="HOUR"
	 * @generated
	 */
	EnumTimeUnit getIntervalTimeUnit();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPBatchActivity#getIntervalTimeUnit <em>Interval Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Time Unit</em>' attribute.
	 * @see vpml.utilpackage.EnumTimeUnit
	 * @see #getIntervalTimeUnit()
	 * @generated
	 */
	void setIntervalTimeUnit(EnumTimeUnit value);

	/**
	 * Returns the value of the '<em><b>Max Quantity</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 数量最大值
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Quantity</em>' attribute.
	 * @see #setMaxQuantity(Integer)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPBatchActivity_MaxQuantity()
	 * @model default="10"
	 * @generated
	 */
	Integer getMaxQuantity();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPBatchActivity#getMaxQuantity <em>Max Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Quantity</em>' attribute.
	 * @see #getMaxQuantity()
	 * @generated
	 */
	void setMaxQuantity(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Quantity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 数量最小值
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Quantity</em>' attribute.
	 * @see #setMinQuantity(Integer)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPBatchActivity_MinQuantity()
	 * @model default="1"
	 * @generated
	 */
	Integer getMinQuantity();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPBatchActivity#getMinQuantity <em>Min Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Quantity</em>' attribute.
	 * @see #getMinQuantity()
	 * @generated
	 */
	void setMinQuantity(Integer value);

} // EMPBatchActivity
