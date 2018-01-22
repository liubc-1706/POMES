/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vpml.infopackage.EMIFlow;
import vpml.infopackage.EMINode;
import vpml.infopackage.InfopackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMI Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.infopackage.impl.EMIFlowImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIFlowImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIFlowImpl#getSourceNode <em>Source Node</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMIFlowImpl#getTargetNode <em>Target Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMIFlowImpl extends EMIObjectImpl implements EMIFlow {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final int DIRECTION_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected int direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceNode() <em>Source Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceNode()
	 * @generated
	 * @ordered
	 */
	protected EMINode sourceNode = null;

	/**
	 * The cached value of the '{@link #getTargetNode() <em>Target Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNode()
	 * @generated
	 * @ordered
	 */
	protected EMINode targetNode = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMIFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InfopackagePackage.Literals.EMI_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(int newDirection) {
		int oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_FLOW__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_FLOW__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMINode getSourceNode() {
		if (sourceNode != null && sourceNode.eIsProxy()) {
			InternalEObject oldSourceNode = (InternalEObject)sourceNode;
			sourceNode = (EMINode)eResolveProxy(oldSourceNode);
			if (sourceNode != oldSourceNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfopackagePackage.EMI_FLOW__SOURCE_NODE, oldSourceNode, sourceNode));
			}
		}
		return sourceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMINode basicGetSourceNode() {
		return sourceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceNode(EMINode newSourceNode, NotificationChain msgs) {
		EMINode oldSourceNode = sourceNode;
		sourceNode = newSourceNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_FLOW__SOURCE_NODE, oldSourceNode, newSourceNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceNode(EMINode newSourceNode) {
		if (newSourceNode != sourceNode) {
			NotificationChain msgs = null;
			if (sourceNode != null)
				msgs = ((InternalEObject)sourceNode).eInverseRemove(this, InfopackagePackage.EMI_NODE__TARGET_FLOW, EMINode.class, msgs);
			if (newSourceNode != null)
				msgs = ((InternalEObject)newSourceNode).eInverseAdd(this, InfopackagePackage.EMI_NODE__TARGET_FLOW, EMINode.class, msgs);
			msgs = basicSetSourceNode(newSourceNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_FLOW__SOURCE_NODE, newSourceNode, newSourceNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMINode getTargetNode() {
		if (targetNode != null && targetNode.eIsProxy()) {
			InternalEObject oldTargetNode = (InternalEObject)targetNode;
			targetNode = (EMINode)eResolveProxy(oldTargetNode);
			if (targetNode != oldTargetNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfopackagePackage.EMI_FLOW__TARGET_NODE, oldTargetNode, targetNode));
			}
		}
		return targetNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMINode basicGetTargetNode() {
		return targetNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetNode(EMINode newTargetNode, NotificationChain msgs) {
		EMINode oldTargetNode = targetNode;
		targetNode = newTargetNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_FLOW__TARGET_NODE, oldTargetNode, newTargetNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNode(EMINode newTargetNode) {
		if (newTargetNode != targetNode) {
			NotificationChain msgs = null;
			if (targetNode != null)
				msgs = ((InternalEObject)targetNode).eInverseRemove(this, InfopackagePackage.EMI_NODE__SOURCE_FLOW, EMINode.class, msgs);
			if (newTargetNode != null)
				msgs = ((InternalEObject)newTargetNode).eInverseAdd(this, InfopackagePackage.EMI_NODE__SOURCE_FLOW, EMINode.class, msgs);
			msgs = basicSetTargetNode(newTargetNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_FLOW__TARGET_NODE, newTargetNode, newTargetNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfopackagePackage.EMI_FLOW__SOURCE_NODE:
				if (sourceNode != null)
					msgs = ((InternalEObject)sourceNode).eInverseRemove(this, InfopackagePackage.EMI_NODE__TARGET_FLOW, EMINode.class, msgs);
				return basicSetSourceNode((EMINode)otherEnd, msgs);
			case InfopackagePackage.EMI_FLOW__TARGET_NODE:
				if (targetNode != null)
					msgs = ((InternalEObject)targetNode).eInverseRemove(this, InfopackagePackage.EMI_NODE__SOURCE_FLOW, EMINode.class, msgs);
				return basicSetTargetNode((EMINode)otherEnd, msgs);
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
			case InfopackagePackage.EMI_FLOW__SOURCE_NODE:
				return basicSetSourceNode(null, msgs);
			case InfopackagePackage.EMI_FLOW__TARGET_NODE:
				return basicSetTargetNode(null, msgs);
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
			case InfopackagePackage.EMI_FLOW__DIRECTION:
				return new Integer(getDirection());
			case InfopackagePackage.EMI_FLOW__NUMBER:
				return new Integer(getNumber());
			case InfopackagePackage.EMI_FLOW__SOURCE_NODE:
				if (resolve) return getSourceNode();
				return basicGetSourceNode();
			case InfopackagePackage.EMI_FLOW__TARGET_NODE:
				if (resolve) return getTargetNode();
				return basicGetTargetNode();
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
			case InfopackagePackage.EMI_FLOW__DIRECTION:
				setDirection(((Integer)newValue).intValue());
				return;
			case InfopackagePackage.EMI_FLOW__NUMBER:
				setNumber(((Integer)newValue).intValue());
				return;
			case InfopackagePackage.EMI_FLOW__SOURCE_NODE:
				setSourceNode((EMINode)newValue);
				return;
			case InfopackagePackage.EMI_FLOW__TARGET_NODE:
				setTargetNode((EMINode)newValue);
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
			case InfopackagePackage.EMI_FLOW__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case InfopackagePackage.EMI_FLOW__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case InfopackagePackage.EMI_FLOW__SOURCE_NODE:
				setSourceNode((EMINode)null);
				return;
			case InfopackagePackage.EMI_FLOW__TARGET_NODE:
				setTargetNode((EMINode)null);
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
			case InfopackagePackage.EMI_FLOW__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case InfopackagePackage.EMI_FLOW__NUMBER:
				return number != NUMBER_EDEFAULT;
			case InfopackagePackage.EMI_FLOW__SOURCE_NODE:
				return sourceNode != null;
			case InfopackagePackage.EMI_FLOW__TARGET_NODE:
				return targetNode != null;
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(", number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //EMIFlowImpl
