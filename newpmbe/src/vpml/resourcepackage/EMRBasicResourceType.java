/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMR Basic Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMRBasicResourceType������ҵ��Դ����������ͣ�������Դ�����ε���Ͳ㣬�������ٷ��࣬�����ԶԶ��������Դ���ͽ��г��󣬳�ΪEMRAbstractResourceType�����ڶ���Դ���Բ��ö��ַ��෽ʽ������������Դ����֮��Ķ��ؼ̳С�EMRBasiceResourceType��EMRAbstractResourceType�γ���ҵ����Դ��������ͼ��
 * EMRBasicResourceTypeͨ��EMRInstanceRelationship��EMRResourceEntity�������Ӷ��������ڸû������͵���Դʵ�塣
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.resourcepackage.EMRBasicResourceType#getResourceGroupTypes <em>Resource Group Types</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRBasicResourceType#getCostPerUnit <em>Cost Per Unit</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRBasicResourceType#getTotalAmount <em>Total Amount</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRBasicResourceType#getUsageAmount <em>Usage Amount</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRBasicResourceType#getAvailableAmount <em>Available Amount</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRBasicResourceType#getEfficiency <em>Efficiency</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRBasicResourceType()
 * @model
 * @generated
 */
public interface EMRBasicResourceType extends EMRResourceType {
	/**
	 * Returns the value of the '<em><b>Resource Group Types</b></em>' reference list.
	 * The list contents are of type {@link vpml.organizationpackage.EMOResourceGroupType}.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOResourceGroupType#getBasicResourceTypes <em>Basic Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Group Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Group Types</em>' reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRBasicResourceType_ResourceGroupTypes()
	 * @see vpml.organizationpackage.EMOResourceGroupType#getBasicResourceTypes
	 * @model type="vpml.organizationpackage.EMOResourceGroupType" opposite="basicResourceTypes"
	 * @generated
	 */
	EList getResourceGroupTypes();

	/**
	 * Returns the value of the '<em><b>Cost Per Unit</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ��Դ�ļ۸�
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost Per Unit</em>' attribute.
	 * @see #setCostPerUnit(Double)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRBasicResourceType_CostPerUnit()
	 * @model default="10"
	 * @generated
	 */
	Double getCostPerUnit();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRBasicResourceType#getCostPerUnit <em>Cost Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Per Unit</em>' attribute.
	 * @see #getCostPerUnit()
	 * @generated
	 */
	void setCostPerUnit(Double value);

	/**
	 * Returns the value of the '<em><b>Total Amount</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ��ҵӵ�и�����Դ������
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Amount</em>' attribute.
	 * @see #setTotalAmount(Integer)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRBasicResourceType_TotalAmount()
	 * @model default="1"
	 * @generated
	 */
	Integer getTotalAmount();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRBasicResourceType#getTotalAmount <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Amount</em>' attribute.
	 * @see #getTotalAmount()
	 * @generated
	 */
	void setTotalAmount(Integer value);

	/**
	 * Returns the value of the '<em><b>Usage Amount</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Amount</em>' attribute.
	 * @see #setUsageAmount(Integer)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRBasicResourceType_UsageAmount()
	 * @model default="1"
	 * @generated
	 */
	Integer getUsageAmount();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRBasicResourceType#getUsageAmount <em>Usage Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Amount</em>' attribute.
	 * @see #getUsageAmount()
	 * @generated
	 */
	void setUsageAmount(Integer value);

	/**
	 * Returns the value of the '<em><b>Available Amount</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Amount</em>' attribute.
	 * @see #setAvailableAmount(Integer)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRBasicResourceType_AvailableAmount()
	 * @model default="1"
	 * @generated
	 */
	Integer getAvailableAmount();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRBasicResourceType#getAvailableAmount <em>Available Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Amount</em>' attribute.
	 * @see #getAvailableAmount()
	 * @generated
	 */
	void setAvailableAmount(Integer value);

	/**
	 * Returns the value of the '<em><b>Efficiency</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Efficiency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Efficiency</em>' attribute.
	 * @see #setEfficiency(Double)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRBasicResourceType_Efficiency()
	 * @model default="1"
	 * @generated
	 */
	Double getEfficiency();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRBasicResourceType#getEfficiency <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Efficiency</em>' attribute.
	 * @see #getEfficiency()
	 * @generated
	 */
	void setEfficiency(Double value);

} // EMRBasicResourceType
