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
 * EMPLeafActivity��Ҷ������ֹ�����Զ�����������Ļ��࣬���൱��ԭ�ӻ���������ٰ����������
 * EMPLeafActivity��������Ҷ��Ļ������ԣ��翪ʼʱ�䡢����ʱ�䡢���ȼ��ȵȡ�
 * EMPLeafActivity�����и��������ǺϷ��ģ�
 * 1���ӻ�����Դ���͵��ֹ��������Ŀ�Ĺ������ӡ��ڹ���ģ��ͨ�������Լ�飨Ҳ���ǹ����ܱ�ģ�⣩֮ǰ���ֹ��������һ�����ϵĽ�ɫ�������  
 * 2���Ӳ�Ʒ��"�����"�� "�����"���ֹ��������Ŀ�����������ӡ�
 * 3����ʱ�ӵ����һ��Ŀ���������ӡ�
 * 4���Ӳ�Ʒ���������Ŀ���������ӡ�
 * 5���ӻ����Ʒ��"�����" ��"�����" ������Ŀ�����������ӡ� 
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
	 * �Ƿ�Ϊȱʡֵ
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
	 * ��ʼʱ��
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
	 * �����ʱ�䣺��ɸû�����ʱ�䡣�������ó����ֲ������ȷֲ�����̬�ֲ������ɷֲ���ָ���ֲ���Gamma�ֲ������壬��ȱʡֵΪ�����ֲ���ֵΪ10����λΪСʱ
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
	 * ����ʱ���ʱ�䵥λ�����롢�֡�Сʱ���졢�¡��꣩
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
	 * ���ȼ����������ȼ���1����ȱֵΪ50�������ڽ��������е���Դ��ͻ���⡣
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
