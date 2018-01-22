/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import java.util.List;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vpml.EMObject;
import vpml.processpackage.EMPActivity;
import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPAutoActivity;
import vpml.processpackage.EMPAutoBatchActivity;
import vpml.processpackage.EMPClockFlow;
import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.EMPInAnd;
import vpml.processpackage.EMPInOr;

import vpml.processpackage.EMPManualBatchActivity;
import vpml.processpackage.EMPNormalActivity;
import vpml.processpackage.EMPOutConnector;
import vpml.processpackage.EMPProduct;

import vpml.processpackage.EMPOutAnd;
import vpml.processpackage.EMPOutOr;
import vpml.processpackage.EMPProduct;
import vpml.processpackage.EMPProductPackage;

import vpml.processpackage.EMPRefFlow;
import vpml.processpackage.ProcesspackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMP Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.processpackage.impl.EMPActivityImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPActivityImpl#getCreater <em>Creater</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPActivityImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPActivityImpl#getLastModifier <em>Last Modifier</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPActivityImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPActivityImpl#getClockFlow <em>Clock Flow</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPActivityImpl#getTargetDataFlows <em>Target Data Flows</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPActivityImpl#getSourceDataFlows <em>Source Data Flows</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPActivityImpl#getRefFlows <em>Ref Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMPActivityImpl extends EMPObjectImpl implements EMPActivity {
	
	public void GetPrevProduct(HashSet plstPrevPro) {
		
		for(Object flow :targetDataFlows)
		{
			EMPDataFlow dataFlow = (EMPDataFlow)flow;
			EMObject succObj = dataFlow.GetStartPoint();
			if(succObj instanceof EMPProduct)
			{
				plstPrevPro.add(succObj);
				
			}
			else if(succObj instanceof EMPInOr)
			{
				EMPInOr inOr = (EMPInOr)succObj;
				inOr.GetPrevProduct(plstPrevPro);
			}
			else if(succObj instanceof EMPInAnd)
			{
				EMPInAnd inAnd = (EMPInAnd)succObj;
				inAnd.GetPrevProduct(plstPrevPro);
			}
		}
	}
	
	public void GetAllSuccLeafProduct(HashSet plstSuccPro) {
		// TODO Auto-generated method stub
		for(Object flow :sourceDataFlows)
		{
			EMPDataFlow dataFlow = (EMPDataFlow)flow;
			EMObject succObj = dataFlow.GetEndPoint();
			if(succObj instanceof EMPProduct)
			{
				if(succObj instanceof EMPProductPackage)
				{
					plstSuccPro.addAll(((EMPProductPackage)succObj).GetAllLeafProducts());
				}
				else
				{
					plstSuccPro.add(succObj);
				}
			}
			else if(succObj instanceof EMPOutOr)
			{
				EMPOutOr outOr = (EMPOutOr)succObj;
				outOr.GetAllSuccLeafProduct(plstSuccPro);
			}
			else if(succObj instanceof EMPOutAnd)
			{
				EMPOutAnd outAnd = (EMPOutAnd)succObj;
				outAnd.GetAllSuccLeafProduct(plstSuccPro);
			}
		}
		
	}
	
	/**
	 * The default value of the '{@link #getProcedure() <em>Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEDURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected String procedure = PROCEDURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreater() <em>Creater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreater()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreater() <em>Creater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreater()
	 * @generated
	 * @ordered
	 */
	protected String creater = CREATER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifier() <em>Last Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifier()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifier() <em>Last Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifier()
	 * @generated
	 * @ordered
	 */
	protected String lastModifier = LAST_MODIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClockFlow() <em>Clock Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockFlow()
	 * @generated
	 * @ordered
	 */
	protected EMPClockFlow clockFlow = null;

	/**
	 * The cached value of the '{@link #getTargetDataFlows() <em>Target Data Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDataFlows()
	 * @generated
	 * @ordered
	 */
	protected EList targetDataFlows = null;

	/**
	 * The cached value of the '{@link #getSourceDataFlows() <em>Source Data Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDataFlows()
	 * @generated
	 * @ordered
	 */
	protected EList sourceDataFlows = null;

	/**
	 * The cached value of the '{@link #getRefFlows() <em>Ref Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefFlows()
	 * @generated
	 * @ordered
	 */
	protected EList refFlows = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMPActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcesspackagePackage.Literals.EMP_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcedure() {
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedure(String newProcedure) {
		String oldProcedure = procedure;
		procedure = newProcedure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ACTIVITY__PROCEDURE, oldProcedure, procedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreater() {
		return creater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreater(String newCreater) {
		String oldCreater = creater;
		creater = newCreater;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ACTIVITY__CREATER, oldCreater, creater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedDate(Date newCreatedDate) {
		Date oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ACTIVITY__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastModifier() {
		return lastModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModifier(String newLastModifier) {
		String oldLastModifier = lastModifier;
		lastModifier = newLastModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ACTIVITY__LAST_MODIFIER, oldLastModifier, lastModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModifiedDate(Date newLastModifiedDate) {
		Date oldLastModifiedDate = lastModifiedDate;
		lastModifiedDate = newLastModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ACTIVITY__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPClockFlow getClockFlow() {
		if (clockFlow != null && clockFlow.eIsProxy()) {
			InternalEObject oldClockFlow = (InternalEObject)clockFlow;
			clockFlow = (EMPClockFlow)eResolveProxy(oldClockFlow);
			if (clockFlow != oldClockFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_ACTIVITY__CLOCK_FLOW, oldClockFlow, clockFlow));
			}
		}
		return clockFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPClockFlow basicGetClockFlow() {
		return clockFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargetDataFlows() {
		if (targetDataFlows == null) {
			targetDataFlows = new EObjectWithInverseResolvingEList(EMPDataFlow.class, this, ProcesspackagePackage.EMP_ACTIVITY__TARGET_DATA_FLOWS, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_ACTIVITY);
		}
		return targetDataFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceDataFlows() {
		if (sourceDataFlows == null) {
			sourceDataFlows = new EObjectWithInverseResolvingEList(EMPDataFlow.class, this, ProcesspackagePackage.EMP_ACTIVITY__SOURCE_DATA_FLOWS, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_ACTIVITY);
		}
		return sourceDataFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRefFlows() {
		if (refFlows == null) {
			refFlows = new EObjectWithInverseResolvingEList(EMPRefFlow.class, this, ProcesspackagePackage.EMP_ACTIVITY__REF_FLOWS, ProcesspackagePackage.EMP_REF_FLOW__ACTIVITY);
		}
		return refFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_ACTIVITY__CLOCK_FLOW:
				if (clockFlow != null)
					msgs = ((InternalEObject)clockFlow).eInverseRemove(this, ProcesspackagePackage.EMP_CLOCK_FLOW__ACTIVITY, EMPClockFlow.class, msgs);
				return basicSetClockFlow((EMPClockFlow)otherEnd, msgs);
			case ProcesspackagePackage.EMP_ACTIVITY__TARGET_DATA_FLOWS:
				return ((InternalEList)getTargetDataFlows()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_ACTIVITY__SOURCE_DATA_FLOWS:
				return ((InternalEList)getSourceDataFlows()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_ACTIVITY__REF_FLOWS:
				return ((InternalEList)getRefFlows()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockFlow(EMPClockFlow newClockFlow) {
		if (newClockFlow != clockFlow) {
			NotificationChain msgs = null;
			if (clockFlow != null)
				msgs = ((InternalEObject)clockFlow).eInverseRemove(this, ProcesspackagePackage.EMP_CLOCK_FLOW__ACTIVITY, EMPClockFlow.class, msgs);
			if (newClockFlow != null)
				msgs = ((InternalEObject)newClockFlow).eInverseAdd(this, ProcesspackagePackage.EMP_CLOCK_FLOW__ACTIVITY, EMPClockFlow.class, msgs);
			msgs = basicSetClockFlow(newClockFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ACTIVITY__CLOCK_FLOW, newClockFlow, newClockFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_ACTIVITY__CLOCK_FLOW:
				return basicSetClockFlow(null, msgs);
			case ProcesspackagePackage.EMP_ACTIVITY__TARGET_DATA_FLOWS:
				return ((InternalEList)getTargetDataFlows()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_ACTIVITY__SOURCE_DATA_FLOWS:
				return ((InternalEList)getSourceDataFlows()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_ACTIVITY__REF_FLOWS:
				return ((InternalEList)getRefFlows()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_ACTIVITY__PROCEDURE:
				return getProcedure();
			case ProcesspackagePackage.EMP_ACTIVITY__CREATER:
				return getCreater();
			case ProcesspackagePackage.EMP_ACTIVITY__CREATED_DATE:
				return getCreatedDate();
			case ProcesspackagePackage.EMP_ACTIVITY__LAST_MODIFIER:
				return getLastModifier();
			case ProcesspackagePackage.EMP_ACTIVITY__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case ProcesspackagePackage.EMP_ACTIVITY__CLOCK_FLOW:
				if (resolve) return getClockFlow();
				return basicGetClockFlow();
			case ProcesspackagePackage.EMP_ACTIVITY__TARGET_DATA_FLOWS:
				return getTargetDataFlows();
			case ProcesspackagePackage.EMP_ACTIVITY__SOURCE_DATA_FLOWS:
				return getSourceDataFlows();
			case ProcesspackagePackage.EMP_ACTIVITY__REF_FLOWS:
				return getRefFlows();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClockFlow(EMPClockFlow newClockFlow, NotificationChain msgs) {
		EMPClockFlow oldClockFlow = clockFlow;
		clockFlow = newClockFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_ACTIVITY__CLOCK_FLOW, oldClockFlow, newClockFlow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_ACTIVITY__PROCEDURE:
				setProcedure((String)newValue);
				return;
			case ProcesspackagePackage.EMP_ACTIVITY__CREATER:
				setCreater((String)newValue);
				return;
			case ProcesspackagePackage.EMP_ACTIVITY__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case ProcesspackagePackage.EMP_ACTIVITY__LAST_MODIFIER:
				setLastModifier((String)newValue);
				return;
			case ProcesspackagePackage.EMP_ACTIVITY__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case ProcesspackagePackage.EMP_ACTIVITY__CLOCK_FLOW:
				setClockFlow((EMPClockFlow)newValue);
				return;
			case ProcesspackagePackage.EMP_ACTIVITY__TARGET_DATA_FLOWS:
				getTargetDataFlows().clear();
				getTargetDataFlows().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_ACTIVITY__SOURCE_DATA_FLOWS:
				getSourceDataFlows().clear();
				getSourceDataFlows().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_ACTIVITY__REF_FLOWS:
				getRefFlows().clear();
				getRefFlows().addAll((Collection)newValue);
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
			case ProcesspackagePackage.EMP_ACTIVITY__PROCEDURE:
				setProcedure(PROCEDURE_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_ACTIVITY__CREATER:
				setCreater(CREATER_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_ACTIVITY__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_ACTIVITY__LAST_MODIFIER:
				setLastModifier(LAST_MODIFIER_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_ACTIVITY__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_ACTIVITY__CLOCK_FLOW:
				setClockFlow((EMPClockFlow)null);
				return;
			case ProcesspackagePackage.EMP_ACTIVITY__TARGET_DATA_FLOWS:
				getTargetDataFlows().clear();
				return;
			case ProcesspackagePackage.EMP_ACTIVITY__SOURCE_DATA_FLOWS:
				getSourceDataFlows().clear();
				return;
			case ProcesspackagePackage.EMP_ACTIVITY__REF_FLOWS:
				getRefFlows().clear();
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
			case ProcesspackagePackage.EMP_ACTIVITY__PROCEDURE:
				return PROCEDURE_EDEFAULT == null ? procedure != null : !PROCEDURE_EDEFAULT.equals(procedure);
			case ProcesspackagePackage.EMP_ACTIVITY__CREATER:
				return CREATER_EDEFAULT == null ? creater != null : !CREATER_EDEFAULT.equals(creater);
			case ProcesspackagePackage.EMP_ACTIVITY__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case ProcesspackagePackage.EMP_ACTIVITY__LAST_MODIFIER:
				return LAST_MODIFIER_EDEFAULT == null ? lastModifier != null : !LAST_MODIFIER_EDEFAULT.equals(lastModifier);
			case ProcesspackagePackage.EMP_ACTIVITY__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case ProcesspackagePackage.EMP_ACTIVITY__CLOCK_FLOW:
				return clockFlow != null;
			case ProcesspackagePackage.EMP_ACTIVITY__TARGET_DATA_FLOWS:
				return targetDataFlows != null && !targetDataFlows.isEmpty();
			case ProcesspackagePackage.EMP_ACTIVITY__SOURCE_DATA_FLOWS:
				return sourceDataFlows != null && !sourceDataFlows.isEmpty();
			case ProcesspackagePackage.EMP_ACTIVITY__REF_FLOWS:
				return refFlows != null && !refFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (procedure: ");
		result.append(procedure);
		result.append(", creater: ");
		result.append(creater);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", lastModifier: ");
		result.append(lastModifier);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(')');
		return result.toString();
	}

	//add by cty begin

	/**
	 * @generated not
	 */
	public List getResources() {
		EList assflows=null;
//		if (assflow == null) {
//			return null;
//		}
		if(this instanceof EMPNormalActivity)
			assflows=((EMPNormalActivity)this).getAssFlows();
		if(this instanceof EMPManualBatchActivity)
			assflows=((EMPManualBatchActivity)this).getAssFlows();
		if(this instanceof EMPCompActivity)
			assflows=((EMPCompActivity)this).getAssFlows();
		if(this instanceof EMPAutoBatchActivity)
			assflows=((EMPAutoBatchActivity)this).getAssFlows();
		if(this instanceof EMPAutoActivity)
			assflows=((EMPAutoActivity)this).getAssFlows();
		List roleList= new ArrayList();//换了新模型之后，使用范型new ArrayList<资源基类>（）
		if(assflows!=null){
			for (int i = 0; i < assflows.toArray().length; i++)
			{
				EMPAssFlow assFlow=(EMPAssFlow)(assflows.get(i));
				if(assFlow.getRole()!=null)
					roleList.add(assFlow.getRole());
				if(assFlow.getResourceGroupType()!=null){
					roleList.add(assFlow.getResourceGroupType());
				}
				if(assFlow.getMachineType()!=null){
					roleList.add(assFlow.getMachineType());
				}
				if(assFlow.getLocationType()!=null){
					roleList.add(assFlow.getLocationType());
				}
				//不知道resourceGroup是否需保留，得到新代码再说，暂不考虑
			}
		}
		
		return roleList;
		
	}
	/**
	 * @generated not
	 */
	public List getTargetProducts() {
		List prodList=new ArrayList<EMPProduct>();
		if(sourceDataFlows!=null)
		{
			for (int i = 0; i < sourceDataFlows.toArray().length; i++)
			{
				EMPDataFlow dataFlow=(EMPDataFlow)(sourceDataFlows.get(i));
				if(dataFlow.getTargetProduct()!=null)
					prodList.add(dataFlow.getTargetProduct());
			}
		}
		
		//应用连接的箭头好像画反了，应该是只能从输入产品到活动，而不是从活动到输出产品
		//改过来之后应该在Product的getTargetActs()方法作相应改动
//		if(refFlows!=null)
//		{
//			for (int i = 0; i < refFlows.toArray().length; i++)
//			{
//				EMPRefFlow refFlow=(EMPRefFlow)(refFlows.get(i));
//				if(refFlow.getProduct()!=null)
//					docList.add(refFlow.getProduct());
//			}
//		}
		return prodList;
	}
	/**
	 * @generated not
	 * 活动之后通过数据流直接相连的节点除了产品还有输出与/或连接符
	 */
	
	public List getTargetLogicalConnectors() {
		List outConnList=new ArrayList<EMPOutConnector>();
		if(sourceDataFlows!=null)
		{
			for(int i=0;i<sourceDataFlows.size();i++)
			{
				EMPDataFlow dataFlow=(EMPDataFlow)(sourceDataFlows.get(i));
				if(dataFlow.getTargetOutOr()!=null)
					outConnList.add(dataFlow.getTargetOutOr());
				if(dataFlow.getTargetOutAnd()!=null)
					outConnList.add(dataFlow.getTargetOutAnd());
			}
		}
		return outConnList;
	}
	//add by cty end
	
} //EMPActivityImpl
