/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vpml.EMObject;
import vpml.VpmlPackage;

import vpml.collaborationpackage.CollaborationpackagePackage;
import vpml.collaborationpackage.EMCRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EM Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.impl.EMObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link vpml.impl.EMObjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link vpml.impl.EMObjectImpl#getCode <em>Code</em>}</li>
 *   <li>{@link vpml.impl.EMObjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link vpml.impl.EMObjectImpl#getOID <em>OID</em>}</li>
 *   <li>{@link vpml.impl.EMObjectImpl#getSourceObjSourceRelation <em>Source Obj Source Relation</em>}</li>
 *   <li>{@link vpml.impl.EMObjectImpl#getTargetObjTargetRelation <em>Target Obj Target Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMObjectImpl extends EObjectImpl implements EMObject {
	
	protected static final Long SIM_OID_EDEFAULT = new Long(0L);

	
	protected Long simOID = SIM_OID_EDEFAULT;
	
	public Long getSimOID() {
		return simOID;
	}
	
	public void setSimOID(Long newSimOID) {
		simOID = newSimOID;
	}
	
	//xsm
	public String GetClassType()
	{
		String str = this.getClass().toString();
		str = str.substring(str.lastIndexOf(".")+1);
		return str;
	}
	public String GetFullBasePackageType()
	{
		String str = this.getClass().toString();
		//str形式为“class ×××”，所以从第6个字符开始取
		str =  str.substring(str.lastIndexOf(".")+1);
		return str;
	}
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated NOT xsm
	 * @ordered
	 */
	protected String id = java.util.UUID.randomUUID().toString();;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOID() <em>OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOID()
	 * @generated
	 * @ordered
	 */
	protected static final Long OID_EDEFAULT = new Long(0L);

	/**
	 * The cached value of the '{@link #getOID() <em>OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOID()
	 * @generated NOT xsm
	 * @ordered
	 */
	private static long i = 0;
	
	protected Long oid = i++;

	/**
	 * The cached value of the '{@link #getSourceObjSourceRelation() <em>Source Obj Source Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceObjSourceRelation()
	 * @generated
	 * @ordered
	 */
	protected EList sourceObjSourceRelation = null;

	/**
	 * The cached value of the '{@link #getTargetObjTargetRelation() <em>Target Obj Target Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetObjTargetRelation()
	 * @generated
	 * @ordered
	 */
	protected EList targetObjTargetRelation = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VpmlPackage.Literals.EM_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpmlPackage.EM_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpmlPackage.EM_OBJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpmlPackage.EM_OBJECT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpmlPackage.EM_OBJECT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getOID() {
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOID(Long newOID) {
		Long oldOID = oid;
		oid = newOID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpmlPackage.EM_OBJECT__OID, oldOID, oid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceObjSourceRelation() {
		if (sourceObjSourceRelation == null) {
			sourceObjSourceRelation = new EObjectWithInverseResolvingEList(EMCRelation.class, this, VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION, CollaborationpackagePackage.EMC_RELATION__SOURCE_RELATION_SOURCE_OBJ);
		}
		return sourceObjSourceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargetObjTargetRelation() {
		if (targetObjTargetRelation == null) {
			targetObjTargetRelation = new EObjectWithInverseResolvingEList(EMCRelation.class, this, VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION, CollaborationpackagePackage.EMC_RELATION__TARGET_RELATION_TARGET_OBJ);
		}
		return targetObjTargetRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION:
				return ((InternalEList)getSourceObjSourceRelation()).basicAdd(otherEnd, msgs);
			case VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION:
				return ((InternalEList)getTargetObjTargetRelation()).basicAdd(otherEnd, msgs);
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
			case VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION:
				return ((InternalEList)getSourceObjSourceRelation()).basicRemove(otherEnd, msgs);
			case VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION:
				return ((InternalEList)getTargetObjTargetRelation()).basicRemove(otherEnd, msgs);
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
			case VpmlPackage.EM_OBJECT__NAME:
				return getName();
			case VpmlPackage.EM_OBJECT__ID:
				return getId();
			case VpmlPackage.EM_OBJECT__CODE:
				return getCode();
			case VpmlPackage.EM_OBJECT__DESCRIPTION:
				return getDescription();
			case VpmlPackage.EM_OBJECT__OID:
				return getOID();
			case VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION:
				return getSourceObjSourceRelation();
			case VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION:
				return getTargetObjTargetRelation();
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
			case VpmlPackage.EM_OBJECT__NAME:
				setName((String)newValue);
				return;
			case VpmlPackage.EM_OBJECT__ID:
				setId((String)newValue);
				return;
			case VpmlPackage.EM_OBJECT__CODE:
				setCode((String)newValue);
				return;
			case VpmlPackage.EM_OBJECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case VpmlPackage.EM_OBJECT__OID:
				setOID((Long)newValue);
				return;
			case VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION:
				getSourceObjSourceRelation().clear();
				getSourceObjSourceRelation().addAll((Collection)newValue);
				return;
			case VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION:
				getTargetObjTargetRelation().clear();
				getTargetObjTargetRelation().addAll((Collection)newValue);
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
			case VpmlPackage.EM_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VpmlPackage.EM_OBJECT__ID:
				setId(ID_EDEFAULT);
				return;
			case VpmlPackage.EM_OBJECT__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case VpmlPackage.EM_OBJECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case VpmlPackage.EM_OBJECT__OID:
				setOID(OID_EDEFAULT);
				return;
			case VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION:
				getSourceObjSourceRelation().clear();
				return;
			case VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION:
				getTargetObjTargetRelation().clear();
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
			case VpmlPackage.EM_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VpmlPackage.EM_OBJECT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case VpmlPackage.EM_OBJECT__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case VpmlPackage.EM_OBJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case VpmlPackage.EM_OBJECT__OID:
				return OID_EDEFAULT == null ? oid != null : !OID_EDEFAULT.equals(oid);
			case VpmlPackage.EM_OBJECT__SOURCE_OBJ_SOURCE_RELATION:
				return sourceObjSourceRelation != null && !sourceObjSourceRelation.isEmpty();
			case VpmlPackage.EM_OBJECT__TARGET_OBJ_TARGET_RELATION:
				return targetObjTargetRelation != null && !targetObjTargetRelation.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", code: ");
		result.append(code);
		result.append(", description: ");
		result.append(description);
		result.append(", OID: ");
		result.append(oid);
		result.append(')');
		return result.toString();
	}

} //EMObjectImpl
