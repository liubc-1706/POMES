/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;

import vpml.EMObject;
import vpml.organizationpackage.EMOResourceGroupType;

import vpml.resourcepackage.EMRLocationType;
import vpml.resourcepackage.EMRMachineType;
import vpml.resourcepackage.EMRRole;
import vpml.resourcepackage.EMRToolType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP Ass Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMPAssFlow表示从资源或人到活动（叶活动、组合活动）的连接
 * 资源可以是资源组(EMPResourceGroup)、基本资源类型(EMRBasicResourceType)
 * 人可以是组织模型中的角色(EMORole)、过程模型中的EMPTeam
 * 关联连接的iNumber表示其所连活动所需资源（组）/角色/Team的数量。
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPAssFlow#getResourceGroupType <em>Resource Group Type</em>}</li>
 *   <li>{@link vpml.processpackage.EMPAssFlow#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.EMPAssFlow#getProduct <em>Product</em>}</li>
 *   <li>{@link vpml.processpackage.EMPAssFlow#getLocationType <em>Location Type</em>}</li>
 *   <li>{@link vpml.processpackage.EMPAssFlow#getMachineType <em>Machine Type</em>}</li>
 *   <li>{@link vpml.processpackage.EMPAssFlow#getRole <em>Role</em>}</li>
 *   <li>{@link vpml.processpackage.EMPAssFlow#getToolType <em>Tool Type</em>}</li>
 *   <li>{@link vpml.processpackage.EMPAssFlow#getAutoActivity <em>Auto Activity</em>}</li>
 *   <li>{@link vpml.processpackage.EMPAssFlow#getNormalActivity <em>Normal Activity</em>}</li>
 *   <li>{@link vpml.processpackage.EMPAssFlow#getCompActivity <em>Comp Activity</em>}</li>
 *   <li>{@link vpml.processpackage.EMPAssFlow#getManualBatchActivity <em>Manual Batch Activity</em>}</li>
 *   <li>{@link vpml.processpackage.EMPAssFlow#getAutoBatchActiviy <em>Auto Batch Activiy</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPAssFlow()
 * @model
 * @generated
 */
public interface EMPAssFlow extends EMPFlow {
	
	public EMObject GetStartPoint();
	
	public EMObject GetEndPoint();
	
	public void SetStartPoint(EMObject StartPoint);
	
	public void SetEndPoint(EMObject EndPoint);
	
	/**
	 * Returns the value of the '<em><b>Resource Group Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOResourceGroupType#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Group Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Group Type</em>' reference.
	 * @see #setResourceGroupType(EMOResourceGroupType)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPAssFlow_ResourceGroupType()
	 * @see vpml.organizationpackage.EMOResourceGroupType#getAssFlows
	 * @model opposite="assFlows"
	 * @generated
	 */
	EMOResourceGroupType getResourceGroupType();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPAssFlow#getResourceGroupType <em>Resource Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Group Type</em>' reference.
	 * @see #getResourceGroupType()
	 * @generated
	 */
	void setResourceGroupType(EMOResourceGroupType value);

	/**
	 * Returns the value of the '<em><b>Emp Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDiagram#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emp Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp Diagram</em>' container reference.
	 * @see #setEmpDiagram(EMPDiagram)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPAssFlow_EmpDiagram()
	 * @see vpml.processpackage.EMPDiagram#getAssFlows
	 * @model opposite="assFlows" required="true"
	 * @generated
	 */
	EMPDiagram getEmpDiagram();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPAssFlow#getEmpDiagram <em>Emp Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp Diagram</em>' container reference.
	 * @see #getEmpDiagram()
	 * @generated
	 */
	void setEmpDiagram(EMPDiagram value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPProduct#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(EMPProduct)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPAssFlow_Product()
	 * @see vpml.processpackage.EMPProduct#getAssFlows
	 * @model opposite="assFlows"
	 * @generated
	 */
	EMPProduct getProduct();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPAssFlow#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(EMPProduct value);

	/**
	 * Returns the value of the '<em><b>Location Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRLocationType#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Type</em>' reference.
	 * @see #setLocationType(EMRLocationType)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPAssFlow_LocationType()
	 * @see vpml.resourcepackage.EMRLocationType#getAssFlows
	 * @model opposite="assFlows"
	 * @generated
	 */
	EMRLocationType getLocationType();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPAssFlow#getLocationType <em>Location Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Type</em>' reference.
	 * @see #getLocationType()
	 * @generated
	 */
	void setLocationType(EMRLocationType value);

	/**
	 * Returns the value of the '<em><b>Machine Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRMachineType#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Type</em>' reference.
	 * @see #setMachineType(EMRMachineType)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPAssFlow_MachineType()
	 * @see vpml.resourcepackage.EMRMachineType#getAssFlows
	 * @model opposite="assFlows"
	 * @generated
	 */
	EMRMachineType getMachineType();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPAssFlow#getMachineType <em>Machine Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Type</em>' reference.
	 * @see #getMachineType()
	 * @generated
	 */
	void setMachineType(EMRMachineType value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRRole#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(EMRRole)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPAssFlow_Role()
	 * @see vpml.resourcepackage.EMRRole#getAssFlows
	 * @model opposite="assFlows"
	 * @generated
	 */
	EMRRole getRole();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPAssFlow#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(EMRRole value);

	/**
	 * Returns the value of the '<em><b>Tool Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRToolType#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Type</em>' reference.
	 * @see #setToolType(EMRToolType)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPAssFlow_ToolType()
	 * @see vpml.resourcepackage.EMRToolType#getAssFlows
	 * @model opposite="assFlows"
	 * @generated
	 */
	EMRToolType getToolType();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPAssFlow#getToolType <em>Tool Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Type</em>' reference.
	 * @see #getToolType()
	 * @generated
	 */
	void setToolType(EMRToolType value);

	/**
	 * Returns the value of the '<em><b>Auto Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPAutoActivity#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Activity</em>' reference.
	 * @see #setAutoActivity(EMPAutoActivity)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPAssFlow_AutoActivity()
	 * @see vpml.processpackage.EMPAutoActivity#getAssFlows
	 * @model opposite="assFlows"
	 * @generated
	 */
	EMPAutoActivity getAutoActivity();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPAssFlow#getAutoActivity <em>Auto Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Activity</em>' reference.
	 * @see #getAutoActivity()
	 * @generated
	 */
	void setAutoActivity(EMPAutoActivity value);

	/**
	 * Returns the value of the '<em><b>Normal Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPNormalActivity#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Activity</em>' reference.
	 * @see #setNormalActivity(EMPNormalActivity)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPAssFlow_NormalActivity()
	 * @see vpml.processpackage.EMPNormalActivity#getAssFlows
	 * @model opposite="assFlows"
	 * @generated
	 */
	EMPNormalActivity getNormalActivity();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPAssFlow#getNormalActivity <em>Normal Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Activity</em>' reference.
	 * @see #getNormalActivity()
	 * @generated
	 */
	void setNormalActivity(EMPNormalActivity value);

	/**
	 * Returns the value of the '<em><b>Comp Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPCompActivity#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp Activity</em>' reference.
	 * @see #setCompActivity(EMPCompActivity)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPAssFlow_CompActivity()
	 * @see vpml.processpackage.EMPCompActivity#getAssFlows
	 * @model opposite="assFlows"
	 * @generated
	 */
	EMPCompActivity getCompActivity();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPAssFlow#getCompActivity <em>Comp Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp Activity</em>' reference.
	 * @see #getCompActivity()
	 * @generated
	 */
	void setCompActivity(EMPCompActivity value);

	/**
	 * Returns the value of the '<em><b>Manual Batch Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPManualBatchActivity#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manual Batch Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Batch Activity</em>' reference.
	 * @see #setManualBatchActivity(EMPManualBatchActivity)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPAssFlow_ManualBatchActivity()
	 * @see vpml.processpackage.EMPManualBatchActivity#getAssFlows
	 * @model opposite="assFlows"
	 * @generated
	 */
	EMPManualBatchActivity getManualBatchActivity();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPAssFlow#getManualBatchActivity <em>Manual Batch Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Batch Activity</em>' reference.
	 * @see #getManualBatchActivity()
	 * @generated
	 */
	void setManualBatchActivity(EMPManualBatchActivity value);

	/**
	 * Returns the value of the '<em><b>Auto Batch Activiy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPAutoBatchActivity#getAssFlows <em>Ass Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Batch Activiy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Batch Activiy</em>' reference.
	 * @see #setAutoBatchActiviy(EMPAutoBatchActivity)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPAssFlow_AutoBatchActiviy()
	 * @see vpml.processpackage.EMPAutoBatchActivity#getAssFlows
	 * @model opposite="assFlows"
	 * @generated
	 */
	EMPAutoBatchActivity getAutoBatchActiviy();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPAssFlow#getAutoBatchActiviy <em>Auto Batch Activiy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Batch Activiy</em>' reference.
	 * @see #getAutoBatchActiviy()
	 * @generated
	 */
	void setAutoBatchActiviy(EMPAutoBatchActivity value);

} // EMPAssFlow
