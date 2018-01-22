/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vpml.EMDiagram;
import vpml.VpmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EM Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.impl.EMDiagramImpl#getCreater <em>Creater</em>}</li>
 *   <li>{@link vpml.impl.EMDiagramImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link vpml.impl.EMDiagramImpl#getLastModifier <em>Last Modifier</em>}</li>
 *   <li>{@link vpml.impl.EMDiagramImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMDiagramImpl extends EMObjectImpl implements EMDiagram {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VpmlPackage.Literals.EM_DIAGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VpmlPackage.EM_DIAGRAM__CREATER, oldCreater, creater));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VpmlPackage.EM_DIAGRAM__CREATED_DATE, oldCreatedDate, createdDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VpmlPackage.EM_DIAGRAM__LAST_MODIFIER, oldLastModifier, lastModifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VpmlPackage.EM_DIAGRAM__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpmlPackage.EM_DIAGRAM__CREATER:
				return getCreater();
			case VpmlPackage.EM_DIAGRAM__CREATED_DATE:
				return getCreatedDate();
			case VpmlPackage.EM_DIAGRAM__LAST_MODIFIER:
				return getLastModifier();
			case VpmlPackage.EM_DIAGRAM__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
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
			case VpmlPackage.EM_DIAGRAM__CREATER:
				setCreater((String)newValue);
				return;
			case VpmlPackage.EM_DIAGRAM__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case VpmlPackage.EM_DIAGRAM__LAST_MODIFIER:
				setLastModifier((String)newValue);
				return;
			case VpmlPackage.EM_DIAGRAM__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
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
			case VpmlPackage.EM_DIAGRAM__CREATER:
				setCreater(CREATER_EDEFAULT);
				return;
			case VpmlPackage.EM_DIAGRAM__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case VpmlPackage.EM_DIAGRAM__LAST_MODIFIER:
				setLastModifier(LAST_MODIFIER_EDEFAULT);
				return;
			case VpmlPackage.EM_DIAGRAM__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
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
			case VpmlPackage.EM_DIAGRAM__CREATER:
				return CREATER_EDEFAULT == null ? creater != null : !CREATER_EDEFAULT.equals(creater);
			case VpmlPackage.EM_DIAGRAM__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case VpmlPackage.EM_DIAGRAM__LAST_MODIFIER:
				return LAST_MODIFIER_EDEFAULT == null ? lastModifier != null : !LAST_MODIFIER_EDEFAULT.equals(lastModifier);
			case VpmlPackage.EM_DIAGRAM__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
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
		result.append(" (creater: ");
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

} //EMDiagramImpl
