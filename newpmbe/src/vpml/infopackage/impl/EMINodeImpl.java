/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vpml.infopackage.EMIFlow;
import vpml.infopackage.EMINode;
import vpml.infopackage.InfopackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMI Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.infopackage.impl.EMINodeImpl#getTargetFlow <em>Target Flow</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMINodeImpl#getSourceFlow <em>Source Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMINodeImpl extends EMIObjectImpl implements EMINode {
	/**
	 * The cached value of the '{@link #getTargetFlow() <em>Target Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFlow()
	 * @generated
	 * @ordered
	 */
	protected EList targetFlow = null;

	/**
	 * The cached value of the '{@link #getSourceFlow() <em>Source Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFlow()
	 * @generated
	 * @ordered
	 */
	protected EList sourceFlow = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMINodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InfopackagePackage.Literals.EMI_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargetFlow() {
		if (targetFlow == null) {
			targetFlow = new EObjectWithInverseResolvingEList(EMIFlow.class, this, InfopackagePackage.EMI_NODE__TARGET_FLOW, InfopackagePackage.EMI_FLOW__SOURCE_NODE);
		}
		return targetFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceFlow() {
		if (sourceFlow == null) {
			sourceFlow = new EObjectWithInverseResolvingEList(EMIFlow.class, this, InfopackagePackage.EMI_NODE__SOURCE_FLOW, InfopackagePackage.EMI_FLOW__TARGET_NODE);
		}
		return sourceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfopackagePackage.EMI_NODE__TARGET_FLOW:
				return ((InternalEList)getTargetFlow()).basicAdd(otherEnd, msgs);
			case InfopackagePackage.EMI_NODE__SOURCE_FLOW:
				return ((InternalEList)getSourceFlow()).basicAdd(otherEnd, msgs);
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
			case InfopackagePackage.EMI_NODE__TARGET_FLOW:
				return ((InternalEList)getTargetFlow()).basicRemove(otherEnd, msgs);
			case InfopackagePackage.EMI_NODE__SOURCE_FLOW:
				return ((InternalEList)getSourceFlow()).basicRemove(otherEnd, msgs);
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
			case InfopackagePackage.EMI_NODE__TARGET_FLOW:
				return getTargetFlow();
			case InfopackagePackage.EMI_NODE__SOURCE_FLOW:
				return getSourceFlow();
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
			case InfopackagePackage.EMI_NODE__TARGET_FLOW:
				getTargetFlow().clear();
				getTargetFlow().addAll((Collection)newValue);
				return;
			case InfopackagePackage.EMI_NODE__SOURCE_FLOW:
				getSourceFlow().clear();
				getSourceFlow().addAll((Collection)newValue);
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
			case InfopackagePackage.EMI_NODE__TARGET_FLOW:
				getTargetFlow().clear();
				return;
			case InfopackagePackage.EMI_NODE__SOURCE_FLOW:
				getSourceFlow().clear();
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
			case InfopackagePackage.EMI_NODE__TARGET_FLOW:
				return targetFlow != null && !targetFlow.isEmpty();
			case InfopackagePackage.EMI_NODE__SOURCE_FLOW:
				return sourceFlow != null && !sourceFlow.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EMINodeImpl
