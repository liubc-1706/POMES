/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vpml.processpackage.EMPActivity;
import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.EMPInConnector;
import vpml.processpackage.EMPProduct;
import vpml.processpackage.EMPRefFlow;
import vpml.processpackage.ProcesspackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMP Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.processpackage.impl.EMPProductImpl#getTargetDataFlows <em>Target Data Flows</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPProductImpl#getSourceDataFlows <em>Source Data Flows</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPProductImpl#getRefFlows <em>Ref Flows</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPProductImpl#getAssFlows <em>Ass Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMPProductImpl extends EMPObjectImpl implements EMPProduct {
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
	 * The cached value of the '{@link #getAssFlows() <em>Ass Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssFlows()
	 * @generated
	 * @ordered
	 */
	protected EList assFlows = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMPProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcesspackagePackage.Literals.EMP_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargetDataFlows() {
		if (targetDataFlows == null) {
			targetDataFlows = new EObjectWithInverseResolvingEList(EMPDataFlow.class, this, ProcesspackagePackage.EMP_PRODUCT__TARGET_DATA_FLOWS, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_PRODUCT);
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
			sourceDataFlows = new EObjectWithInverseResolvingEList(EMPDataFlow.class, this, ProcesspackagePackage.EMP_PRODUCT__SOURCE_DATA_FLOWS, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_PRODUCT);
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
			refFlows = new EObjectWithInverseResolvingEList(EMPRefFlow.class, this, ProcesspackagePackage.EMP_PRODUCT__REF_FLOWS, ProcesspackagePackage.EMP_REF_FLOW__PRODUCT);
		}
		return refFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssFlows() {
		if (assFlows == null) {
			assFlows = new EObjectWithInverseResolvingEList(EMPAssFlow.class, this, ProcesspackagePackage.EMP_PRODUCT__ASS_FLOWS, ProcesspackagePackage.EMP_ASS_FLOW__PRODUCT);
		}
		return assFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_PRODUCT__TARGET_DATA_FLOWS:
				return ((InternalEList)getTargetDataFlows()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_PRODUCT__SOURCE_DATA_FLOWS:
				return ((InternalEList)getSourceDataFlows()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_PRODUCT__REF_FLOWS:
				return ((InternalEList)getRefFlows()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_PRODUCT__ASS_FLOWS:
				return ((InternalEList)getAssFlows()).basicAdd(otherEnd, msgs);
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
			case ProcesspackagePackage.EMP_PRODUCT__TARGET_DATA_FLOWS:
				return ((InternalEList)getTargetDataFlows()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_PRODUCT__SOURCE_DATA_FLOWS:
				return ((InternalEList)getSourceDataFlows()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_PRODUCT__REF_FLOWS:
				return ((InternalEList)getRefFlows()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_PRODUCT__ASS_FLOWS:
				return ((InternalEList)getAssFlows()).basicRemove(otherEnd, msgs);
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
			case ProcesspackagePackage.EMP_PRODUCT__TARGET_DATA_FLOWS:
				return getTargetDataFlows();
			case ProcesspackagePackage.EMP_PRODUCT__SOURCE_DATA_FLOWS:
				return getSourceDataFlows();
			case ProcesspackagePackage.EMP_PRODUCT__REF_FLOWS:
				return getRefFlows();
			case ProcesspackagePackage.EMP_PRODUCT__ASS_FLOWS:
				return getAssFlows();
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
			case ProcesspackagePackage.EMP_PRODUCT__TARGET_DATA_FLOWS:
				getTargetDataFlows().clear();
				getTargetDataFlows().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_PRODUCT__SOURCE_DATA_FLOWS:
				getSourceDataFlows().clear();
				getSourceDataFlows().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_PRODUCT__REF_FLOWS:
				getRefFlows().clear();
				getRefFlows().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_PRODUCT__ASS_FLOWS:
				getAssFlows().clear();
				getAssFlows().addAll((Collection)newValue);
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
			case ProcesspackagePackage.EMP_PRODUCT__TARGET_DATA_FLOWS:
				getTargetDataFlows().clear();
				return;
			case ProcesspackagePackage.EMP_PRODUCT__SOURCE_DATA_FLOWS:
				getSourceDataFlows().clear();
				return;
			case ProcesspackagePackage.EMP_PRODUCT__REF_FLOWS:
				getRefFlows().clear();
				return;
			case ProcesspackagePackage.EMP_PRODUCT__ASS_FLOWS:
				getAssFlows().clear();
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
			case ProcesspackagePackage.EMP_PRODUCT__TARGET_DATA_FLOWS:
				return targetDataFlows != null && !targetDataFlows.isEmpty();
			case ProcesspackagePackage.EMP_PRODUCT__SOURCE_DATA_FLOWS:
				return sourceDataFlows != null && !sourceDataFlows.isEmpty();
			case ProcesspackagePackage.EMP_PRODUCT__REF_FLOWS:
				return refFlows != null && !refFlows.isEmpty();
			case ProcesspackagePackage.EMP_PRODUCT__ASS_FLOWS:
				return assFlows != null && !assFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated not
	 */
	public List getTargetActs() {
		
		List actList=new ArrayList<EMPActivity>();
		if(sourceDataFlows!=null){
			for (int i = 0; i < sourceDataFlows.toArray().length; i++)
			{
				EMPDataFlow dataFlow=(EMPDataFlow)(sourceDataFlows.get(i));
				if(dataFlow.getTargetActivity()!=null)
					actList.add(dataFlow.getTargetActivity());
				
			}
		}
		
		if(refFlows!=null)
		{
			for (int i = 0; i < refFlows.toArray().length; i++)
			{
				EMPRefFlow refFlow=(EMPRefFlow)(refFlows.get(i));
				if(refFlow.getActivity()!=null)
					actList.add(refFlow.getActivity());
			}
		}
		return actList;
	}
	/**
	 * @generated not
	 * 产品之后通过数据流与产品相连的除了活动还有输入与/或逻辑连接符
	 */
	public List getTargetLogicalConnectors() {
		if(sourceDataFlows==null)
			return null;
		List connList=new ArrayList<EMPInConnector>();
		for (int i = 0; i < sourceDataFlows.toArray().length; i++)
		{
			EMPDataFlow dataFlow=(EMPDataFlow)(sourceDataFlows.get(i));
			if(dataFlow.getTargetInAnd()!=null)
				connList.add(dataFlow.getTargetInAnd());
			if(dataFlow.getTargetInOr()!=null)
				connList.add(dataFlow.getTargetInOr());
			
		}
		return connList;
	}
} //EMPProductImpl
