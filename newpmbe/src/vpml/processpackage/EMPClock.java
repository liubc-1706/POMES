/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;

import org.eclipse.emf.common.util.EList;

import vpml.utilpackage.EnumTimeUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMPClock（时钟）用于控制周期事件或定时发生的事件。它通过时钟连接流（EMPClockFlow）和叶活动相连。
 * 时钟的属性主要用于模拟时对相关活动的时间控制。
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPClock#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link vpml.processpackage.EMPClock#getEndTime <em>End Time</em>}</li>
 *   <li>{@link vpml.processpackage.EMPClock#getRestartPeriod <em>Restart Period</em>}</li>
 *   <li>{@link vpml.processpackage.EMPClock#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link vpml.processpackage.EMPClock#getTqFlag <em>Tq Flag</em>}</li>
 *   <li>{@link vpml.processpackage.EMPClock#getEFlag <em>EFlag</em>}</li>
 *   <li>{@link vpml.processpackage.EMPClock#getIntervalValue <em>Interval Value</em>}</li>
 *   <li>{@link vpml.processpackage.EMPClock#getIntervalUnit <em>Interval Unit</em>}</li>
 *   <li>{@link vpml.processpackage.EMPClock#getClockFlows <em>Clock Flows</em>}</li>
 *   <li>{@link vpml.processpackage.EMPClock#getEmpDiagram <em>Emp Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPClock()
 * @model
 * @generated
 */
public interface EMPClock extends EMPObject {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 开始时间：在模拟时钟周期中，时钟第一次发送信号的时间。缺省时间是模拟开始的时间。开始时间在重做周期中计算。
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(double)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPClock_StartTime()
	 * @model default="0"
	 * @generated
	 */
	double getStartTime();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPClock#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(double value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 在模拟时钟周期中，时钟停止发送信号的时间。缺省时间是模拟开始的时间，也就是说时钟只发送一个信号。结束时间在一个重启动周期中计算。
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(double)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPClock_EndTime()
	 * @model default="0"
	 * @generated
	 */
	double getEndTime();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPClock#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(double value);

	/**
	 * Returns the value of the '<em><b>Restart Period</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 是时钟回0之前的时间值。开始时间和结束时间仅在重做周期内起作用。
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Restart Period</em>' attribute.
	 * @see #setRestartPeriod(int)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPClock_RestartPeriod()
	 * @model default="0"
	 * @generated
	 */
	int getRestartPeriod();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPClock#getRestartPeriod <em>Restart Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart Period</em>' attribute.
	 * @see #getRestartPeriod()
	 * @generated
	 */
	void setRestartPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The default value is <code>"HOUR"</code>.
	 * The literals are from the enumeration {@link vpml.utilpackage.EnumTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 时间单位
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see vpml.utilpackage.EnumTimeUnit
	 * @see #setTimeUnit(EnumTimeUnit)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPClock_TimeUnit()
	 * @model default="HOUR"
	 * @generated
	 */
	EnumTimeUnit getTimeUnit();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPClock#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see vpml.utilpackage.EnumTimeUnit
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(EnumTimeUnit value);

	/**
	 * Returns the value of the '<em><b>Tq Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 时钟队列标志
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tq Flag</em>' attribute.
	 * @see #setTqFlag(Boolean)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPClock_TqFlag()
	 * @model
	 * @generated
	 */
	Boolean getTqFlag();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPClock#getTqFlag <em>Tq Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tq Flag</em>' attribute.
	 * @see #getTqFlag()
	 * @generated
	 */
	void setTqFlag(Boolean value);

	/**
	 * Returns the value of the '<em><b>EFlag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 紧急状况标志
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EFlag</em>' attribute.
	 * @see #setEFlag(Boolean)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPClock_EFlag()
	 * @model
	 * @generated
	 */
	Boolean getEFlag();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPClock#getEFlag <em>EFlag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EFlag</em>' attribute.
	 * @see #getEFlag()
	 * @generated
	 */
	void setEFlag(Boolean value);

	/**
	 * Returns the value of the '<em><b>Interval Value</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 时钟两次发送数据的十进制时间值。如果此值大于0，时钟在指定的时间间隔重复开始一个活动。如果此值等于0，时钟将只传送一次数据。
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interval Value</em>' attribute.
	 * @see #setIntervalValue(double)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPClock_IntervalValue()
	 * @model default="1"
	 * @generated
	 */
	double getIntervalValue();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPClock#getIntervalValue <em>Interval Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Value</em>' attribute.
	 * @see #getIntervalValue()
	 * @generated
	 */
	void setIntervalValue(double value);

	/**
	 * Returns the value of the '<em><b>Interval Unit</b></em>' attribute.
	 * The default value is <code>"HOUR"</code>.
	 * The literals are from the enumeration {@link vpml.utilpackage.EnumTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 时间间隔单位
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interval Unit</em>' attribute.
	 * @see vpml.utilpackage.EnumTimeUnit
	 * @see #setIntervalUnit(EnumTimeUnit)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPClock_IntervalUnit()
	 * @model default="HOUR"
	 * @generated
	 */
	EnumTimeUnit getIntervalUnit();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPClock#getIntervalUnit <em>Interval Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Unit</em>' attribute.
	 * @see vpml.utilpackage.EnumTimeUnit
	 * @see #getIntervalUnit()
	 * @generated
	 */
	void setIntervalUnit(EnumTimeUnit value);

	/**
	 * Returns the value of the '<em><b>Clock Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPClockFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPClockFlow#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPClock_ClockFlows()
	 * @see vpml.processpackage.EMPClockFlow#getClock
	 * @model type="vpml.processpackage.EMPClockFlow" opposite="clock"
	 * @generated
	 */
	EList getClockFlows();

	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPClock_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getClocks
	 * @model opposite="clocks" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPClock#getEmpDiagram <em>Emp Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp Diagram</em>' container reference.
	 * @see #getEmpDiagram()
	 * @generated
	 */
	void setEmpDiagram(EMPDiagram value);

} // EMPClock
