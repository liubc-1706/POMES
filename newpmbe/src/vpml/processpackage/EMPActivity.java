/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 活动表示过程中要执行的工作，因此活动是VPML语言的核心。
 * EMPActivity是组合活动（子过程）和叶活动的基类，记录所有类型活动的共有属性和操作。
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPActivity#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link vpml.processpackage.EMPActivity#getCreater <em>Creater</em>}</li>
 *   <li>{@link vpml.processpackage.EMPActivity#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link vpml.processpackage.EMPActivity#getLastModifier <em>Last Modifier</em>}</li>
 *   <li>{@link vpml.processpackage.EMPActivity#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link vpml.processpackage.EMPActivity#getClockFlow <em>Clock Flow</em>}</li>
 *   <li>{@link vpml.processpackage.EMPActivity#getTargetDataFlows <em>Target Data Flows</em>}</li>
 *   <li>{@link vpml.processpackage.EMPActivity#getSourceDataFlows <em>Source Data Flows</em>}</li>
 *   <li>{@link vpml.processpackage.EMPActivity#getRefFlows <em>Ref Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPActivity()
 * @model
 * @generated
 */
public interface EMPActivity extends EMPObject {
	
	void GetPrevProduct(HashSet plstPrevPro);
	
	void GetAllSuccLeafProduct(HashSet set);
	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 与产品相关的过程步骤的文字描述
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure</em>' attribute.
	 * @see #setProcedure(String)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPActivity_Procedure()
	 * @model
	 * @generated
	 */
	String getProcedure();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPActivity#getProcedure <em>Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' attribute.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(String value);

	/**
	 * Returns the value of the '<em><b>Creater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 创建者
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creater</em>' attribute.
	 * @see #setCreater(String)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPActivity_Creater()
	 * @model
	 * @generated
	 */
	String getCreater();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPActivity#getCreater <em>Creater</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 创建日期
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPActivity_CreatedDate()
	 * @model dataType="vpml.utilpackage.JavaDate"
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPActivity#getCreatedDate <em>Created Date</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 最近修改者
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Modifier</em>' attribute.
	 * @see #setLastModifier(String)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPActivity_LastModifier()
	 * @model
	 * @generated
	 */
	String getLastModifier();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPActivity#getLastModifier <em>Last Modifier</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 最近修改时间
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPActivity_LastModifiedDate()
	 * @model dataType="vpml.utilpackage.JavaDate"
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPActivity#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Clock Flow</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPClockFlow#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Flow</em>' reference.
	 * @see #setClockFlow(EMPClockFlow)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPActivity_ClockFlow()
	 * @see vpml.processpackage.EMPClockFlow#getActivity
	 * @model opposite="activity"
	 * @generated
	 */
	EMPClockFlow getClockFlow();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPActivity#getClockFlow <em>Clock Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Flow</em>' reference.
	 * @see #getClockFlow()
	 * @generated
	 */
	void setClockFlow(EMPClockFlow value);

	/**
	 * Returns the value of the '<em><b>Target Data Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPDataFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDataFlow#getTargetActivity <em>Target Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Data Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Data Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPActivity_TargetDataFlows()
	 * @see vpml.processpackage.EMPDataFlow#getTargetActivity
	 * @model type="vpml.processpackage.EMPDataFlow" opposite="targetActivity"
	 * @generated
	 */
	EList getTargetDataFlows();

	/**
	 * Returns the value of the '<em><b>Source Data Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPDataFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDataFlow#getSourceActivity <em>Source Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Data Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Data Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPActivity_SourceDataFlows()
	 * @see vpml.processpackage.EMPDataFlow#getSourceActivity
	 * @model type="vpml.processpackage.EMPDataFlow" opposite="sourceActivity"
	 * @generated
	 */
	EList getSourceDataFlows();

	/**
	 * Returns the value of the '<em><b>Ref Flows</b></em>' reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPRefFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPRefFlow#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Flows</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPActivity_RefFlows()
	 * @see vpml.processpackage.EMPRefFlow#getActivity
	 * @model type="vpml.processpackage.EMPRefFlow" opposite="activity"
	 * @generated
	 */
	EList getRefFlows();

	/**
	 * @generated not
	 */
	List getResources();
	
	/**
	 * @generated not
	 */
	List getTargetProducts();
	/**
	 * @generated not
	 */
	List getTargetLogicalConnectors();
} // EMPActivity
