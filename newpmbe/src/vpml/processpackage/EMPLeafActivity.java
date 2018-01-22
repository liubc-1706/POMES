/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;

import java.util.Date;

import vpml.utilpackage.DSDistribution;
import vpml.utilpackage.EnumTimeUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP Leaf Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMPLeafActivity（叶活动）是手工活动、自动活动、批处理活动的基类，它相当于原子活动，不可以再包含其他活动。
 * EMPLeafActivity具有所有叶活动的基本属性，如开始时间、结束时间、优先级等等。
 * EMPLeafActivity和下列各项连接是合法的：
 * 1、从基本资源类型到手工活动任意数目的关联连接。在过程模型通过完整性检查（也就是过程能被模拟）之前，手工活动必须与一个以上的角色相关联。  
 * 2、从产品、"输入或"和 "输出与"到手工活动任意数目的数据流连接。
 * 3、从时钟到活动单一数目的输入连接。
 * 4、从产品到活动任意数目的引用连接。
 * 5、从活动到产品、"输出与" 和"输出或" 任意数目的数据流连接。 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPLeafActivity#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link vpml.processpackage.EMPLeafActivity#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link vpml.processpackage.EMPLeafActivity#getDurationTime <em>Duration Time</em>}</li>
 *   <li>{@link vpml.processpackage.EMPLeafActivity#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link vpml.processpackage.EMPLeafActivity#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPLeafActivity()
 * @model
 * @generated
 */
public interface EMPLeafActivity extends EMPActivity {
	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 是否为缺省值
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(Boolean)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPLeafActivity_IsDefault()
	 * @model default="true"
	 * @generated
	 */
	Boolean getIsDefault();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPLeafActivity#getIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #getIsDefault()
	 * @generated
	 */
	void setIsDefault(Boolean value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 开始时间
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPLeafActivity_StartTime()
	 * @model dataType="vpml.utilpackage.JavaDate"
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPLeafActivity#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 活动持续时间：完成该活动所需的时间。它可以用常量分布、均匀分布、正态分布、泊松分布、指数分布和Gamma分布来定义，其缺省值为常量分布，值为10，单位为小时
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration Time</em>' containment reference.
	 * @see #setDurationTime(DSDistribution)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPLeafActivity_DurationTime()
	 * @model containment="true"
	 * @generated
	 */
	DSDistribution getDurationTime();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPLeafActivity#getDurationTime <em>Duration Time</em>}' containment reference.
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
	 * 持续时间的时间单位。（秒、分、小时、天、月、年）
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see vpml.utilpackage.EnumTimeUnit
	 * @see #setTimeUnit(EnumTimeUnit)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPLeafActivity_TimeUnit()
	 * @model default="HOUR"
	 * @generated
	 */
	EnumTimeUnit getTimeUnit();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPLeafActivity#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see vpml.utilpackage.EnumTimeUnit
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(EnumTimeUnit value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 优先级。活动最高优先级是1级〔缺值为50〕。用于解决活动调度中的资源冲突问题。
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPLeafActivity_Priority()
	 * @model default="50"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPLeafActivity#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

} // EMPLeafActivity
