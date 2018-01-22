/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import vpml.EMObject;
import vpml.organizationpackage.EMOResourceGroupType;
import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPAutoActivity;
import vpml.processpackage.EMPAutoBatchActivity;
import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPManualBatchActivity;
import vpml.processpackage.EMPNormalActivity;
import vpml.processpackage.EMPProduct;
import vpml.processpackage.ProcesspackagePackage;

import vpml.resourcepackage.EMRLocationType;
import vpml.resourcepackage.EMRMachineType;
import vpml.resourcepackage.EMRRole;
import vpml.resourcepackage.EMRToolType;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMP Ass Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.processpackage.impl.EMPAssFlowImpl#getResourceGroupType <em>Resource Group Type</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPAssFlowImpl#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPAssFlowImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPAssFlowImpl#getLocationType <em>Location Type</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPAssFlowImpl#getMachineType <em>Machine Type</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPAssFlowImpl#getRole <em>Role</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPAssFlowImpl#getToolType <em>Tool Type</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPAssFlowImpl#getAutoActivity <em>Auto Activity</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPAssFlowImpl#getNormalActivity <em>Normal Activity</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPAssFlowImpl#getCompActivity <em>Comp Activity</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPAssFlowImpl#getManualBatchActivity <em>Manual Batch Activity</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPAssFlowImpl#getAutoBatchActiviy <em>Auto Batch Activiy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMPAssFlowImpl extends EMPFlowImpl implements EMPAssFlow {
	

	public EMObject pStartPoint;
	
	public EMObject pEndPoint;
	
	public EMObject GetStartPoint()
	{
		return pStartPoint;
	}
	public void SetStartPoint(EMObject StartPoint)
	{
		pStartPoint = StartPoint;
	}
	public EMObject GetEndPoint()
	{
		return pEndPoint;
	}
	public void SetEndPoint(EMObject EndPoint)
	{
		pEndPoint = EndPoint;
	}
	
	/**
	 * The cached value of the '{@link #getResourceGroupType() <em>Resource Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceGroupType()
	 * @generated
	 * @ordered
	 */
	protected EMOResourceGroupType resourceGroupType = null;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected EMPProduct product = null;

	/**
	 * The cached value of the '{@link #getLocationType() <em>Location Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationType()
	 * @generated
	 * @ordered
	 */
	protected EMRLocationType locationType = null;

	/**
	 * The cached value of the '{@link #getMachineType() <em>Machine Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineType()
	 * @generated
	 * @ordered
	 */
	protected EMRMachineType machineType = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EMRRole role = null;

	/**
	 * The cached value of the '{@link #getToolType() <em>Tool Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolType()
	 * @generated
	 * @ordered
	 */
	protected EMRToolType toolType = null;

	/**
	 * The cached value of the '{@link #getAutoActivity() <em>Auto Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoActivity()
	 * @generated
	 * @ordered
	 */
	protected EMPAutoActivity autoActivity = null;

	/**
	 * The cached value of the '{@link #getNormalActivity() <em>Normal Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalActivity()
	 * @generated
	 * @ordered
	 */
	protected EMPNormalActivity normalActivity = null;

	/**
	 * The cached value of the '{@link #getCompActivity() <em>Comp Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompActivity()
	 * @generated
	 * @ordered
	 */
	protected EMPCompActivity compActivity = null;

	/**
	 * The cached value of the '{@link #getManualBatchActivity() <em>Manual Batch Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualBatchActivity()
	 * @generated
	 * @ordered
	 */
	protected EMPManualBatchActivity manualBatchActivity = null;

	/**
	 * The cached value of the '{@link #getAutoBatchActiviy() <em>Auto Batch Activiy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoBatchActiviy()
	 * @generated
	 * @ordered
	 */
	protected EMPAutoBatchActivity autoBatchActiviy = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMPAssFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcesspackagePackage.Literals.EMP_ASS_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOResourceGroupType getResourceGroupType() {
		if (resourceGroupType != null && resourceGroupType.eIsProxy()) {
			InternalEObject oldResourceGroupType = (InternalEObject)resourceGroupType;
			resourceGroupType = (EMOResourceGroupType)eResolveProxy(oldResourceGroupType);
			if (resourceGroupType != oldResourceGroupType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_ASS_FLOW__RESOURCE_GROUP_TYPE, oldResourceGroupType, resourceGroupType));
			}
		}
		return resourceGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOResourceGroupType basicGetResourceGroupType() {
		return resourceGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetResourceGroupType(EMOResourceGroupType newResourceGroupType, NotificationChain msgs) {
		pStartPoint = newResourceGroupType;
		
		EMOResourceGroupType oldResourceGroupType = resourceGroupType;
		resourceGroupType = newResourceGroupType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__RESOURCE_GROUP_TYPE, oldResourceGroupType, newResourceGroupType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceGroupType(EMOResourceGroupType newResourceGroupType) {
		if (newResourceGroupType != resourceGroupType) {
			NotificationChain msgs = null;
			if (resourceGroupType != null)
				msgs = ((InternalEObject)resourceGroupType).eInverseRemove(this, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ASS_FLOWS, EMOResourceGroupType.class, msgs);
			if (newResourceGroupType != null)
				msgs = ((InternalEObject)newResourceGroupType).eInverseAdd(this, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ASS_FLOWS, EMOResourceGroupType.class, msgs);
			msgs = basicSetResourceGroupType(newResourceGroupType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__RESOURCE_GROUP_TYPE, newResourceGroupType, newResourceGroupType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPDiagram getEmpDiagram() {
		if (eContainerFeatureID != ProcesspackagePackage.EMP_ASS_FLOW__EMP_DIAGRAM) return null;
		return (EMPDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpDiagram(EMPDiagram newEmpDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmpDiagram, ProcesspackagePackage.EMP_ASS_FLOW__EMP_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpDiagram(EMPDiagram newEmpDiagram) {
		if (newEmpDiagram != eInternalContainer() || (eContainerFeatureID != ProcesspackagePackage.EMP_ASS_FLOW__EMP_DIAGRAM && newEmpDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmpDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmpDiagram != null)
				msgs = ((InternalEObject)newEmpDiagram).eInverseAdd(this, ProcesspackagePackage.EMP_DIAGRAM__ASS_FLOWS, EMPDiagram.class, msgs);
			msgs = basicSetEmpDiagram(newEmpDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__EMP_DIAGRAM, newEmpDiagram, newEmpDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPProduct getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject)product;
			product = (EMPProduct)eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_ASS_FLOW__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPProduct basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetProduct(EMPProduct newProduct, NotificationChain msgs) {
		pEndPoint = newProduct;
		
		EMPProduct oldProduct = product;
		product = newProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__PRODUCT, oldProduct, newProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(EMPProduct newProduct) {
		if (newProduct != product) {
			NotificationChain msgs = null;
			if (product != null)
				msgs = ((InternalEObject)product).eInverseRemove(this, ProcesspackagePackage.EMP_PRODUCT__ASS_FLOWS, EMPProduct.class, msgs);
			if (newProduct != null)
				msgs = ((InternalEObject)newProduct).eInverseAdd(this, ProcesspackagePackage.EMP_PRODUCT__ASS_FLOWS, EMPProduct.class, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__PRODUCT, newProduct, newProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRLocationType getLocationType() {
		if (locationType != null && locationType.eIsProxy()) {
			InternalEObject oldLocationType = (InternalEObject)locationType;
			locationType = (EMRLocationType)eResolveProxy(oldLocationType);
			if (locationType != oldLocationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_ASS_FLOW__LOCATION_TYPE, oldLocationType, locationType));
			}
		}
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRLocationType basicGetLocationType() {
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetLocationType(EMRLocationType newLocationType, NotificationChain msgs) {
		pStartPoint = newLocationType;
		
		EMRLocationType oldLocationType = locationType;
		locationType = newLocationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__LOCATION_TYPE, oldLocationType, newLocationType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationType(EMRLocationType newLocationType) {
		if (newLocationType != locationType) {
			NotificationChain msgs = null;
			if (locationType != null)
				msgs = ((InternalEObject)locationType).eInverseRemove(this, ResourcepackagePackage.EMR_LOCATION_TYPE__ASS_FLOWS, EMRLocationType.class, msgs);
			if (newLocationType != null)
				msgs = ((InternalEObject)newLocationType).eInverseAdd(this, ResourcepackagePackage.EMR_LOCATION_TYPE__ASS_FLOWS, EMRLocationType.class, msgs);
			msgs = basicSetLocationType(newLocationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__LOCATION_TYPE, newLocationType, newLocationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRMachineType getMachineType() {
		if (machineType != null && machineType.eIsProxy()) {
			InternalEObject oldMachineType = (InternalEObject)machineType;
			machineType = (EMRMachineType)eResolveProxy(oldMachineType);
			if (machineType != oldMachineType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_ASS_FLOW__MACHINE_TYPE, oldMachineType, machineType));
			}
		}
		return machineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRMachineType basicGetMachineType() {
		return machineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetMachineType(EMRMachineType newMachineType, NotificationChain msgs) {
		pStartPoint = newMachineType;
		
		EMRMachineType oldMachineType = machineType;
		machineType = newMachineType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__MACHINE_TYPE, oldMachineType, newMachineType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachineType(EMRMachineType newMachineType) {
		if (newMachineType != machineType) {
			NotificationChain msgs = null;
			if (machineType != null)
				msgs = ((InternalEObject)machineType).eInverseRemove(this, ResourcepackagePackage.EMR_MACHINE_TYPE__ASS_FLOWS, EMRMachineType.class, msgs);
			if (newMachineType != null)
				msgs = ((InternalEObject)newMachineType).eInverseAdd(this, ResourcepackagePackage.EMR_MACHINE_TYPE__ASS_FLOWS, EMRMachineType.class, msgs);
			msgs = basicSetMachineType(newMachineType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__MACHINE_TYPE, newMachineType, newMachineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRRole getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (EMRRole)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_ASS_FLOW__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRRole basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetRole(EMRRole newRole, NotificationChain msgs) {
		pStartPoint = newRole;
		
		EMRRole oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(EMRRole newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, ResourcepackagePackage.EMR_ROLE__ASS_FLOWS, EMRRole.class, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, ResourcepackagePackage.EMR_ROLE__ASS_FLOWS, EMRRole.class, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRToolType getToolType() {
		if (toolType != null && toolType.eIsProxy()) {
			InternalEObject oldToolType = (InternalEObject)toolType;
			toolType = (EMRToolType)eResolveProxy(oldToolType);
			if (toolType != oldToolType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_ASS_FLOW__TOOL_TYPE, oldToolType, toolType));
			}
		}
		return toolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRToolType basicGetToolType() {
		return toolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetToolType(EMRToolType newToolType, NotificationChain msgs) {
		pStartPoint = newToolType;
		
		EMRToolType oldToolType = toolType;
		toolType = newToolType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__TOOL_TYPE, oldToolType, newToolType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolType(EMRToolType newToolType) {
		if (newToolType != toolType) {
			NotificationChain msgs = null;
			if (toolType != null)
				msgs = ((InternalEObject)toolType).eInverseRemove(this, ResourcepackagePackage.EMR_TOOL_TYPE__ASS_FLOWS, EMRToolType.class, msgs);
			if (newToolType != null)
				msgs = ((InternalEObject)newToolType).eInverseAdd(this, ResourcepackagePackage.EMR_TOOL_TYPE__ASS_FLOWS, EMRToolType.class, msgs);
			msgs = basicSetToolType(newToolType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__TOOL_TYPE, newToolType, newToolType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPAutoActivity getAutoActivity() {
		if (autoActivity != null && autoActivity.eIsProxy()) {
			InternalEObject oldAutoActivity = (InternalEObject)autoActivity;
			autoActivity = (EMPAutoActivity)eResolveProxy(oldAutoActivity);
			if (autoActivity != oldAutoActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_ASS_FLOW__AUTO_ACTIVITY, oldAutoActivity, autoActivity));
			}
		}
		return autoActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPAutoActivity basicGetAutoActivity() {
		return autoActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetAutoActivity(EMPAutoActivity newAutoActivity, NotificationChain msgs) {
		pEndPoint = newAutoActivity;
		
		EMPAutoActivity oldAutoActivity = autoActivity;
		autoActivity = newAutoActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__AUTO_ACTIVITY, oldAutoActivity, newAutoActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoActivity(EMPAutoActivity newAutoActivity) {
		if (newAutoActivity != autoActivity) {
			NotificationChain msgs = null;
			if (autoActivity != null)
				msgs = ((InternalEObject)autoActivity).eInverseRemove(this, ProcesspackagePackage.EMP_AUTO_ACTIVITY__ASS_FLOWS, EMPAutoActivity.class, msgs);
			if (newAutoActivity != null)
				msgs = ((InternalEObject)newAutoActivity).eInverseAdd(this, ProcesspackagePackage.EMP_AUTO_ACTIVITY__ASS_FLOWS, EMPAutoActivity.class, msgs);
			msgs = basicSetAutoActivity(newAutoActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__AUTO_ACTIVITY, newAutoActivity, newAutoActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPNormalActivity getNormalActivity() {
		if (normalActivity != null && normalActivity.eIsProxy()) {
			InternalEObject oldNormalActivity = (InternalEObject)normalActivity;
			normalActivity = (EMPNormalActivity)eResolveProxy(oldNormalActivity);
			if (normalActivity != oldNormalActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_ASS_FLOW__NORMAL_ACTIVITY, oldNormalActivity, normalActivity));
			}
		}
		return normalActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPNormalActivity basicGetNormalActivity() {
		return normalActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetNormalActivity(EMPNormalActivity newNormalActivity, NotificationChain msgs) {
		pEndPoint = newNormalActivity;
		
		EMPNormalActivity oldNormalActivity = normalActivity;
		normalActivity = newNormalActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__NORMAL_ACTIVITY, oldNormalActivity, newNormalActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalActivity(EMPNormalActivity newNormalActivity) {
		if (newNormalActivity != normalActivity) {
			NotificationChain msgs = null;
			if (normalActivity != null)
				msgs = ((InternalEObject)normalActivity).eInverseRemove(this, ProcesspackagePackage.EMP_NORMAL_ACTIVITY__ASS_FLOWS, EMPNormalActivity.class, msgs);
			if (newNormalActivity != null)
				msgs = ((InternalEObject)newNormalActivity).eInverseAdd(this, ProcesspackagePackage.EMP_NORMAL_ACTIVITY__ASS_FLOWS, EMPNormalActivity.class, msgs);
			msgs = basicSetNormalActivity(newNormalActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__NORMAL_ACTIVITY, newNormalActivity, newNormalActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPCompActivity getCompActivity() {
		if (compActivity != null && compActivity.eIsProxy()) {
			InternalEObject oldCompActivity = (InternalEObject)compActivity;
			compActivity = (EMPCompActivity)eResolveProxy(oldCompActivity);
			if (compActivity != oldCompActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_ASS_FLOW__COMP_ACTIVITY, oldCompActivity, compActivity));
			}
		}
		return compActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPCompActivity basicGetCompActivity() {
		return compActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetCompActivity(EMPCompActivity newCompActivity, NotificationChain msgs) {
		pEndPoint = newCompActivity;
		
		EMPCompActivity oldCompActivity = compActivity;
		compActivity = newCompActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__COMP_ACTIVITY, oldCompActivity, newCompActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompActivity(EMPCompActivity newCompActivity) {
		if (newCompActivity != compActivity) {
			NotificationChain msgs = null;
			if (compActivity != null)
				msgs = ((InternalEObject)compActivity).eInverseRemove(this, ProcesspackagePackage.EMP_COMP_ACTIVITY__ASS_FLOWS, EMPCompActivity.class, msgs);
			if (newCompActivity != null)
				msgs = ((InternalEObject)newCompActivity).eInverseAdd(this, ProcesspackagePackage.EMP_COMP_ACTIVITY__ASS_FLOWS, EMPCompActivity.class, msgs);
			msgs = basicSetCompActivity(newCompActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__COMP_ACTIVITY, newCompActivity, newCompActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPManualBatchActivity getManualBatchActivity() {
		if (manualBatchActivity != null && manualBatchActivity.eIsProxy()) {
			InternalEObject oldManualBatchActivity = (InternalEObject)manualBatchActivity;
			manualBatchActivity = (EMPManualBatchActivity)eResolveProxy(oldManualBatchActivity);
			if (manualBatchActivity != oldManualBatchActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_ASS_FLOW__MANUAL_BATCH_ACTIVITY, oldManualBatchActivity, manualBatchActivity));
			}
		}
		return manualBatchActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPManualBatchActivity basicGetManualBatchActivity() {
		return manualBatchActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetManualBatchActivity(EMPManualBatchActivity newManualBatchActivity, NotificationChain msgs) {
		pEndPoint = newManualBatchActivity;
		
		EMPManualBatchActivity oldManualBatchActivity = manualBatchActivity;
		manualBatchActivity = newManualBatchActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__MANUAL_BATCH_ACTIVITY, oldManualBatchActivity, newManualBatchActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManualBatchActivity(EMPManualBatchActivity newManualBatchActivity) {
		if (newManualBatchActivity != manualBatchActivity) {
			NotificationChain msgs = null;
			if (manualBatchActivity != null)
				msgs = ((InternalEObject)manualBatchActivity).eInverseRemove(this, ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__ASS_FLOWS, EMPManualBatchActivity.class, msgs);
			if (newManualBatchActivity != null)
				msgs = ((InternalEObject)newManualBatchActivity).eInverseAdd(this, ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__ASS_FLOWS, EMPManualBatchActivity.class, msgs);
			msgs = basicSetManualBatchActivity(newManualBatchActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__MANUAL_BATCH_ACTIVITY, newManualBatchActivity, newManualBatchActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPAutoBatchActivity getAutoBatchActiviy() {
		if (autoBatchActiviy != null && autoBatchActiviy.eIsProxy()) {
			InternalEObject oldAutoBatchActiviy = (InternalEObject)autoBatchActiviy;
			autoBatchActiviy = (EMPAutoBatchActivity)eResolveProxy(oldAutoBatchActiviy);
			if (autoBatchActiviy != oldAutoBatchActiviy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_ASS_FLOW__AUTO_BATCH_ACTIVIY, oldAutoBatchActiviy, autoBatchActiviy));
			}
		}
		return autoBatchActiviy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPAutoBatchActivity basicGetAutoBatchActiviy() {
		return autoBatchActiviy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetAutoBatchActiviy(EMPAutoBatchActivity newAutoBatchActiviy, NotificationChain msgs) {
		pEndPoint = newAutoBatchActiviy;
		
		EMPAutoBatchActivity oldAutoBatchActiviy = autoBatchActiviy;
		autoBatchActiviy = newAutoBatchActiviy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__AUTO_BATCH_ACTIVIY, oldAutoBatchActiviy, newAutoBatchActiviy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoBatchActiviy(EMPAutoBatchActivity newAutoBatchActiviy) {
		if (newAutoBatchActiviy != autoBatchActiviy) {
			NotificationChain msgs = null;
			if (autoBatchActiviy != null)
				msgs = ((InternalEObject)autoBatchActiviy).eInverseRemove(this, ProcesspackagePackage.EMP_AUTO_BATCH_ACTIVITY__ASS_FLOWS, EMPAutoBatchActivity.class, msgs);
			if (newAutoBatchActiviy != null)
				msgs = ((InternalEObject)newAutoBatchActiviy).eInverseAdd(this, ProcesspackagePackage.EMP_AUTO_BATCH_ACTIVITY__ASS_FLOWS, EMPAutoBatchActivity.class, msgs);
			msgs = basicSetAutoBatchActiviy(newAutoBatchActiviy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ASS_FLOW__AUTO_BATCH_ACTIVIY, newAutoBatchActiviy, newAutoBatchActiviy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_ASS_FLOW__RESOURCE_GROUP_TYPE:
				if (resourceGroupType != null)
					msgs = ((InternalEObject)resourceGroupType).eInverseRemove(this, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ASS_FLOWS, EMOResourceGroupType.class, msgs);
				return basicSetResourceGroupType((EMOResourceGroupType)otherEnd, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__EMP_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmpDiagram((EMPDiagram)otherEnd, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__PRODUCT:
				if (product != null)
					msgs = ((InternalEObject)product).eInverseRemove(this, ProcesspackagePackage.EMP_PRODUCT__ASS_FLOWS, EMPProduct.class, msgs);
				return basicSetProduct((EMPProduct)otherEnd, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__LOCATION_TYPE:
				if (locationType != null)
					msgs = ((InternalEObject)locationType).eInverseRemove(this, ResourcepackagePackage.EMR_LOCATION_TYPE__ASS_FLOWS, EMRLocationType.class, msgs);
				return basicSetLocationType((EMRLocationType)otherEnd, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__MACHINE_TYPE:
				if (machineType != null)
					msgs = ((InternalEObject)machineType).eInverseRemove(this, ResourcepackagePackage.EMR_MACHINE_TYPE__ASS_FLOWS, EMRMachineType.class, msgs);
				return basicSetMachineType((EMRMachineType)otherEnd, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__ROLE:
				if (role != null)
					msgs = ((InternalEObject)role).eInverseRemove(this, ResourcepackagePackage.EMR_ROLE__ASS_FLOWS, EMRRole.class, msgs);
				return basicSetRole((EMRRole)otherEnd, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__TOOL_TYPE:
				if (toolType != null)
					msgs = ((InternalEObject)toolType).eInverseRemove(this, ResourcepackagePackage.EMR_TOOL_TYPE__ASS_FLOWS, EMRToolType.class, msgs);
				return basicSetToolType((EMRToolType)otherEnd, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__AUTO_ACTIVITY:
				if (autoActivity != null)
					msgs = ((InternalEObject)autoActivity).eInverseRemove(this, ProcesspackagePackage.EMP_AUTO_ACTIVITY__ASS_FLOWS, EMPAutoActivity.class, msgs);
				return basicSetAutoActivity((EMPAutoActivity)otherEnd, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__NORMAL_ACTIVITY:
				if (normalActivity != null)
					msgs = ((InternalEObject)normalActivity).eInverseRemove(this, ProcesspackagePackage.EMP_NORMAL_ACTIVITY__ASS_FLOWS, EMPNormalActivity.class, msgs);
				return basicSetNormalActivity((EMPNormalActivity)otherEnd, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__COMP_ACTIVITY:
				if (compActivity != null)
					msgs = ((InternalEObject)compActivity).eInverseRemove(this, ProcesspackagePackage.EMP_COMP_ACTIVITY__ASS_FLOWS, EMPCompActivity.class, msgs);
				return basicSetCompActivity((EMPCompActivity)otherEnd, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__MANUAL_BATCH_ACTIVITY:
				if (manualBatchActivity != null)
					msgs = ((InternalEObject)manualBatchActivity).eInverseRemove(this, ProcesspackagePackage.EMP_MANUAL_BATCH_ACTIVITY__ASS_FLOWS, EMPManualBatchActivity.class, msgs);
				return basicSetManualBatchActivity((EMPManualBatchActivity)otherEnd, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__AUTO_BATCH_ACTIVIY:
				if (autoBatchActiviy != null)
					msgs = ((InternalEObject)autoBatchActiviy).eInverseRemove(this, ProcesspackagePackage.EMP_AUTO_BATCH_ACTIVITY__ASS_FLOWS, EMPAutoBatchActivity.class, msgs);
				return basicSetAutoBatchActiviy((EMPAutoBatchActivity)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_ASS_FLOW__RESOURCE_GROUP_TYPE:
				return basicSetResourceGroupType(null, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__EMP_DIAGRAM:
				return basicSetEmpDiagram(null, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__PRODUCT:
				return basicSetProduct(null, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__LOCATION_TYPE:
				return basicSetLocationType(null, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__MACHINE_TYPE:
				return basicSetMachineType(null, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__ROLE:
				return basicSetRole(null, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__TOOL_TYPE:
				return basicSetToolType(null, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__AUTO_ACTIVITY:
				return basicSetAutoActivity(null, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__NORMAL_ACTIVITY:
				return basicSetNormalActivity(null, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__COMP_ACTIVITY:
				return basicSetCompActivity(null, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__MANUAL_BATCH_ACTIVITY:
				return basicSetManualBatchActivity(null, msgs);
			case ProcesspackagePackage.EMP_ASS_FLOW__AUTO_BATCH_ACTIVIY:
				return basicSetAutoBatchActiviy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case ProcesspackagePackage.EMP_ASS_FLOW__EMP_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ProcesspackagePackage.EMP_DIAGRAM__ASS_FLOWS, EMPDiagram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_ASS_FLOW__RESOURCE_GROUP_TYPE:
				if (resolve) return getResourceGroupType();
				return basicGetResourceGroupType();
			case ProcesspackagePackage.EMP_ASS_FLOW__EMP_DIAGRAM:
				return getEmpDiagram();
			case ProcesspackagePackage.EMP_ASS_FLOW__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case ProcesspackagePackage.EMP_ASS_FLOW__LOCATION_TYPE:
				if (resolve) return getLocationType();
				return basicGetLocationType();
			case ProcesspackagePackage.EMP_ASS_FLOW__MACHINE_TYPE:
				if (resolve) return getMachineType();
				return basicGetMachineType();
			case ProcesspackagePackage.EMP_ASS_FLOW__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case ProcesspackagePackage.EMP_ASS_FLOW__TOOL_TYPE:
				if (resolve) return getToolType();
				return basicGetToolType();
			case ProcesspackagePackage.EMP_ASS_FLOW__AUTO_ACTIVITY:
				if (resolve) return getAutoActivity();
				return basicGetAutoActivity();
			case ProcesspackagePackage.EMP_ASS_FLOW__NORMAL_ACTIVITY:
				if (resolve) return getNormalActivity();
				return basicGetNormalActivity();
			case ProcesspackagePackage.EMP_ASS_FLOW__COMP_ACTIVITY:
				if (resolve) return getCompActivity();
				return basicGetCompActivity();
			case ProcesspackagePackage.EMP_ASS_FLOW__MANUAL_BATCH_ACTIVITY:
				if (resolve) return getManualBatchActivity();
				return basicGetManualBatchActivity();
			case ProcesspackagePackage.EMP_ASS_FLOW__AUTO_BATCH_ACTIVIY:
				if (resolve) return getAutoBatchActiviy();
				return basicGetAutoBatchActiviy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_ASS_FLOW__RESOURCE_GROUP_TYPE:
				setResourceGroupType((EMOResourceGroupType)newValue);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)newValue);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__PRODUCT:
				setProduct((EMPProduct)newValue);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__LOCATION_TYPE:
				setLocationType((EMRLocationType)newValue);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__MACHINE_TYPE:
				setMachineType((EMRMachineType)newValue);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__ROLE:
				setRole((EMRRole)newValue);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__TOOL_TYPE:
				setToolType((EMRToolType)newValue);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__AUTO_ACTIVITY:
				setAutoActivity((EMPAutoActivity)newValue);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__NORMAL_ACTIVITY:
				setNormalActivity((EMPNormalActivity)newValue);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__COMP_ACTIVITY:
				setCompActivity((EMPCompActivity)newValue);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__MANUAL_BATCH_ACTIVITY:
				setManualBatchActivity((EMPManualBatchActivity)newValue);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__AUTO_BATCH_ACTIVIY:
				setAutoBatchActiviy((EMPAutoBatchActivity)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_ASS_FLOW__RESOURCE_GROUP_TYPE:
				setResourceGroupType((EMOResourceGroupType)null);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)null);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__PRODUCT:
				setProduct((EMPProduct)null);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__LOCATION_TYPE:
				setLocationType((EMRLocationType)null);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__MACHINE_TYPE:
				setMachineType((EMRMachineType)null);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__ROLE:
				setRole((EMRRole)null);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__TOOL_TYPE:
				setToolType((EMRToolType)null);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__AUTO_ACTIVITY:
				setAutoActivity((EMPAutoActivity)null);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__NORMAL_ACTIVITY:
				setNormalActivity((EMPNormalActivity)null);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__COMP_ACTIVITY:
				setCompActivity((EMPCompActivity)null);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__MANUAL_BATCH_ACTIVITY:
				setManualBatchActivity((EMPManualBatchActivity)null);
				return;
			case ProcesspackagePackage.EMP_ASS_FLOW__AUTO_BATCH_ACTIVIY:
				setAutoBatchActiviy((EMPAutoBatchActivity)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_ASS_FLOW__RESOURCE_GROUP_TYPE:
				return resourceGroupType != null;
			case ProcesspackagePackage.EMP_ASS_FLOW__EMP_DIAGRAM:
				return getEmpDiagram() != null;
			case ProcesspackagePackage.EMP_ASS_FLOW__PRODUCT:
				return product != null;
			case ProcesspackagePackage.EMP_ASS_FLOW__LOCATION_TYPE:
				return locationType != null;
			case ProcesspackagePackage.EMP_ASS_FLOW__MACHINE_TYPE:
				return machineType != null;
			case ProcesspackagePackage.EMP_ASS_FLOW__ROLE:
				return role != null;
			case ProcesspackagePackage.EMP_ASS_FLOW__TOOL_TYPE:
				return toolType != null;
			case ProcesspackagePackage.EMP_ASS_FLOW__AUTO_ACTIVITY:
				return autoActivity != null;
			case ProcesspackagePackage.EMP_ASS_FLOW__NORMAL_ACTIVITY:
				return normalActivity != null;
			case ProcesspackagePackage.EMP_ASS_FLOW__COMP_ACTIVITY:
				return compActivity != null;
			case ProcesspackagePackage.EMP_ASS_FLOW__MANUAL_BATCH_ACTIVITY:
				return manualBatchActivity != null;
			case ProcesspackagePackage.EMP_ASS_FLOW__AUTO_BATCH_ACTIVIY:
				return autoBatchActiviy != null;
		}
		return super.eIsSet(featureID);
	}

} //EMPAssFlowImpl
