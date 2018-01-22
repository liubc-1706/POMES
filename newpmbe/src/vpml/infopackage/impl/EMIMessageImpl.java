/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vpml.infopackage.EMIDiagram;
import vpml.infopackage.EMIMessage;
import vpml.infopackage.InfopackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMI Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.infopackage.impl.EMIMessageImpl#getMessageDiagram <em>Message Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMIMessageImpl extends EMILeafProductImpl implements EMIMessage {
	/**
	 * The cached value of the '{@link #getMessageDiagram() <em>Message Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDiagram()
	 * @generated
	 * @ordered
	 */
	protected EMIDiagram messageDiagram = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMIMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InfopackagePackage.Literals.EMI_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIDiagram getMessageDiagram() {
		if (messageDiagram != null && messageDiagram.eIsProxy()) {
			InternalEObject oldMessageDiagram = (InternalEObject)messageDiagram;
			messageDiagram = (EMIDiagram)eResolveProxy(oldMessageDiagram);
			if (messageDiagram != oldMessageDiagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfopackagePackage.EMI_MESSAGE__MESSAGE_DIAGRAM, oldMessageDiagram, messageDiagram));
			}
		}
		return messageDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIDiagram basicGetMessageDiagram() {
		return messageDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDiagram(EMIDiagram newMessageDiagram) {
		EMIDiagram oldMessageDiagram = messageDiagram;
		messageDiagram = newMessageDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_MESSAGE__MESSAGE_DIAGRAM, oldMessageDiagram, messageDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfopackagePackage.EMI_MESSAGE__MESSAGE_DIAGRAM:
				if (resolve) return getMessageDiagram();
				return basicGetMessageDiagram();
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
			case InfopackagePackage.EMI_MESSAGE__MESSAGE_DIAGRAM:
				setMessageDiagram((EMIDiagram)newValue);
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
			case InfopackagePackage.EMI_MESSAGE__MESSAGE_DIAGRAM:
				setMessageDiagram((EMIDiagram)null);
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
			case InfopackagePackage.EMI_MESSAGE__MESSAGE_DIAGRAM:
				return messageDiagram != null;
		}
		return super.eIsSet(featureID);
	}

} //EMIMessageImpl
