/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import vpml.EMObject;
import vpml.processpackage.EMPActivity;
import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPInAnd;
import vpml.processpackage.EMPInOr;
import vpml.processpackage.EMPProduct;
import vpml.processpackage.ProcesspackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMP In And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.processpackage.impl.EMPInAndImpl#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPInAndImpl#getSourceFlows <em>Source Flows</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPInAndImpl#getTargetFlows <em>Target Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMPInAndImpl extends EMPInConnectorImpl implements EMPInAnd {
	/**
	 * The cached value of the '{@link #getSourceFlows() <em>Source Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFlows()
	 * @generated
	 * @ordered
	 */
	protected EList sourceFlows = null;

	/**
	 * The cached value of the '{@link #getTargetFlows() <em>Target Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFlows()
	 * @generated
	 * @ordered
	 */
	protected EList targetFlows = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMPInAndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcesspackagePackage.Literals.EMP_IN_AND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPDiagram getEmpDiagram() {
		if (eContainerFeatureID != ProcesspackagePackage.EMP_IN_AND__EMP_DIAGRAM) return null;
		return (EMPDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpDiagram(EMPDiagram newEmpDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmpDiagram, ProcesspackagePackage.EMP_IN_AND__EMP_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpDiagram(EMPDiagram newEmpDiagram) {
		if (newEmpDiagram != eInternalContainer() || (eContainerFeatureID != ProcesspackagePackage.EMP_IN_AND__EMP_DIAGRAM && newEmpDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmpDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmpDiagram != null)
				msgs = ((InternalEObject)newEmpDiagram).eInverseAdd(this, ProcesspackagePackage.EMP_DIAGRAM__IN_ANDS, EMPDiagram.class, msgs);
			msgs = basicSetEmpDiagram(newEmpDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_IN_AND__EMP_DIAGRAM, newEmpDiagram, newEmpDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceFlows() {
		if (sourceFlows == null) {
			sourceFlows = new EObjectWithInverseResolvingEList(EMPDataFlow.class, this, ProcesspackagePackage.EMP_IN_AND__SOURCE_FLOWS, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_AND);
		}
		return sourceFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargetFlows() {
		if (targetFlows == null) {
			targetFlows = new EObjectWithInverseResolvingEList(EMPDataFlow.class, this, ProcesspackagePackage.EMP_IN_AND__TARGET_FLOWS, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_AND);
		}
		return targetFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_IN_AND__EMP_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmpDiagram((EMPDiagram)otherEnd, msgs);
			case ProcesspackagePackage.EMP_IN_AND__SOURCE_FLOWS:
				return ((InternalEList)getSourceFlows()).basicAdd(otherEnd, msgs);
			case ProcesspackagePackage.EMP_IN_AND__TARGET_FLOWS:
				return ((InternalEList)getTargetFlows()).basicAdd(otherEnd, msgs);
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
			case ProcesspackagePackage.EMP_IN_AND__EMP_DIAGRAM:
				return basicSetEmpDiagram(null, msgs);
			case ProcesspackagePackage.EMP_IN_AND__SOURCE_FLOWS:
				return ((InternalEList)getSourceFlows()).basicRemove(otherEnd, msgs);
			case ProcesspackagePackage.EMP_IN_AND__TARGET_FLOWS:
				return ((InternalEList)getTargetFlows()).basicRemove(otherEnd, msgs);
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
			case ProcesspackagePackage.EMP_IN_AND__EMP_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ProcesspackagePackage.EMP_DIAGRAM__IN_ANDS, EMPDiagram.class, msgs);
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
			case ProcesspackagePackage.EMP_IN_AND__EMP_DIAGRAM:
				return getEmpDiagram();
			case ProcesspackagePackage.EMP_IN_AND__SOURCE_FLOWS:
				return getSourceFlows();
			case ProcesspackagePackage.EMP_IN_AND__TARGET_FLOWS:
				return getTargetFlows();
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
			case ProcesspackagePackage.EMP_IN_AND__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)newValue);
				return;
			case ProcesspackagePackage.EMP_IN_AND__SOURCE_FLOWS:
				getSourceFlows().clear();
				getSourceFlows().addAll((Collection)newValue);
				return;
			case ProcesspackagePackage.EMP_IN_AND__TARGET_FLOWS:
				getTargetFlows().clear();
				getTargetFlows().addAll((Collection)newValue);
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
			case ProcesspackagePackage.EMP_IN_AND__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)null);
				return;
			case ProcesspackagePackage.EMP_IN_AND__SOURCE_FLOWS:
				getSourceFlows().clear();
				return;
			case ProcesspackagePackage.EMP_IN_AND__TARGET_FLOWS:
				getTargetFlows().clear();
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
			case ProcesspackagePackage.EMP_IN_AND__EMP_DIAGRAM:
				return getEmpDiagram() != null;
			case ProcesspackagePackage.EMP_IN_AND__SOURCE_FLOWS:
				return sourceFlows != null && !sourceFlows.isEmpty();
			case ProcesspackagePackage.EMP_IN_AND__TARGET_FLOWS:
				return targetFlows != null && !targetFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public void GetPrevProduct(HashSet plstPrevPro) {

		for(Object flow :targetFlows)
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
		}
		
	}

	
	/**
	 * @generated not
	 * InAnd的目标逻辑连接符是InOr
	 */
	public List getTargetLogicalConnectors() {
		List targetConnList=new ArrayList<EMPInOr>();
		if(sourceFlows==null)
			return null;
		for(int i=0;i<sourceFlows.size();i++)
		{
			EMPDataFlow dataFlow=(EMPDataFlow)(sourceFlows.get(i));
			if(dataFlow.getTargetInOr()!=null)
				targetConnList.add(dataFlow.getTargetInOr());
		}
		return targetConnList;
	}
	/**
	 * @generated not
	 */
	public List getTargetActs() {
		List targetActList=new ArrayList<EMPActivity>();
		if(sourceFlows==null)
			return null;
		for(int i=0;i<sourceFlows.size();i++)
		{
			EMPDataFlow dataFlow=(EMPDataFlow)(sourceFlows.get(i));
			if(dataFlow.getTargetActivity()!=null)
				targetActList.add(dataFlow.getTargetActivity());
		}
		return targetActList;
	}
} //EMPInAndImpl
