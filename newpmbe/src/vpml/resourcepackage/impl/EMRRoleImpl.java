/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import vpml.collaborationpackage.CollaborationpackagePackage;
import vpml.collaborationpackage.EMCDiagram;

import vpml.organizationpackage.EMOAssociationRelation;
import vpml.organizationpackage.EMODiagram;
import vpml.organizationpackage.EMOResourceGroupType;
import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.ProcesspackagePackage;

import vpml.resourcepackage.EMRClassificationRelation;
import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.EMRRole;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMR Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.resourcepackage.impl.EMRRoleImpl#getTargetAssociationRelations <em>Target Association Relations</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRRoleImpl#getSourceAssociationRelations <em>Source Association Relations</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRRoleImpl#getEmoDiagram <em>Emo Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRRoleImpl#getBelongedOrganization <em>Belonged Organization</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRRoleImpl#getEmrDiagram <em>Emr Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRRoleImpl#getClassificationRelation <em>Classification Relation</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRRoleImpl#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRRoleImpl#getAssFlows <em>Ass Flows</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRRoleImpl#getColRoleDiagram <em>Col Role Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMRRoleImpl extends EMRBasicResourceTypeImpl implements EMRRole {
	/**
	 * The cached value of the '{@link #getTargetAssociationRelations() <em>Target Association Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAssociationRelations()
	 * @generated
	 * @ordered
	 */
	protected EList targetAssociationRelations = null;

	/**
	 * The cached value of the '{@link #getSourceAssociationRelations() <em>Source Association Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAssociationRelations()
	 * @generated
	 * @ordered
	 */
	protected EList sourceAssociationRelations = null;

	/**
	 * The cached value of the '{@link #getBelongedOrganization() <em>Belonged Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongedOrganization()
	 * @generated
	 * @ordered
	 */
	protected EMOResourceGroupType belongedOrganization = null;

	/**
	 * The cached value of the '{@link #getClassificationRelation() <em>Classification Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationRelation()
	 * @generated
	 * @ordered
	 */
	protected EMRClassificationRelation classificationRelation = null;

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
	protected EMRRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ResourcepackagePackage.Literals.EMR_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargetAssociationRelations() {
		if (targetAssociationRelations == null) {
			targetAssociationRelations = new EObjectWithInverseResolvingEList(EMOAssociationRelation.class, this, ResourcepackagePackage.EMR_ROLE__TARGET_ASSOCIATION_RELATIONS, OrganizationpackagePackage.EMO_ASSOCIATION_RELATION__TARGET_ROLE);
		}
		return targetAssociationRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceAssociationRelations() {
		if (sourceAssociationRelations == null) {
			sourceAssociationRelations = new EObjectWithInverseResolvingEList(EMOAssociationRelation.class, this, ResourcepackagePackage.EMR_ROLE__SOURCE_ASSOCIATION_RELATIONS, OrganizationpackagePackage.EMO_ASSOCIATION_RELATION__SOURCE_ROLE);
		}
		return sourceAssociationRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMODiagram getEmoDiagram() {
		if (eContainerFeatureID != ResourcepackagePackage.EMR_ROLE__EMO_DIAGRAM) return null;
		return (EMODiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmoDiagram(EMODiagram newEmoDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmoDiagram, ResourcepackagePackage.EMR_ROLE__EMO_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmoDiagram(EMODiagram newEmoDiagram) {
		if (newEmoDiagram != eInternalContainer() || (eContainerFeatureID != ResourcepackagePackage.EMR_ROLE__EMO_DIAGRAM && newEmoDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmoDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmoDiagram != null)
				msgs = ((InternalEObject)newEmoDiagram).eInverseAdd(this, OrganizationpackagePackage.EMO_DIAGRAM__ROLES, EMODiagram.class, msgs);
			msgs = basicSetEmoDiagram(newEmoDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ROLE__EMO_DIAGRAM, newEmoDiagram, newEmoDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOResourceGroupType getBelongedOrganization() {
		return belongedOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongedOrganization(EMOResourceGroupType newBelongedOrganization, NotificationChain msgs) {
		EMOResourceGroupType oldBelongedOrganization = belongedOrganization;
		belongedOrganization = newBelongedOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ROLE__BELONGED_ORGANIZATION, oldBelongedOrganization, newBelongedOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongedOrganization(EMOResourceGroupType newBelongedOrganization) {
		if (newBelongedOrganization != belongedOrganization) {
			NotificationChain msgs = null;
			if (belongedOrganization != null)
				msgs = ((InternalEObject)belongedOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcepackagePackage.EMR_ROLE__BELONGED_ORGANIZATION, null, msgs);
			if (newBelongedOrganization != null)
				msgs = ((InternalEObject)newBelongedOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcepackagePackage.EMR_ROLE__BELONGED_ORGANIZATION, null, msgs);
			msgs = basicSetBelongedOrganization(newBelongedOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ROLE__BELONGED_ORGANIZATION, newBelongedOrganization, newBelongedOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRDiagram getEmrDiagram() {
		if (eContainerFeatureID != ResourcepackagePackage.EMR_ROLE__EMR_DIAGRAM) return null;
		return (EMRDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmrDiagram(EMRDiagram newEmrDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmrDiagram, ResourcepackagePackage.EMR_ROLE__EMR_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmrDiagram(EMRDiagram newEmrDiagram) {
		if (newEmrDiagram != eInternalContainer() || (eContainerFeatureID != ResourcepackagePackage.EMR_ROLE__EMR_DIAGRAM && newEmrDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmrDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmrDiagram != null)
				msgs = ((InternalEObject)newEmrDiagram).eInverseAdd(this, ResourcepackagePackage.EMR_DIAGRAM__ROLES, EMRDiagram.class, msgs);
			msgs = basicSetEmrDiagram(newEmrDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ROLE__EMR_DIAGRAM, newEmrDiagram, newEmrDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRClassificationRelation getClassificationRelation() {
		if (classificationRelation != null && classificationRelation.eIsProxy()) {
			InternalEObject oldClassificationRelation = (InternalEObject)classificationRelation;
			classificationRelation = (EMRClassificationRelation)eResolveProxy(oldClassificationRelation);
			if (classificationRelation != oldClassificationRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_ROLE__CLASSIFICATION_RELATION, oldClassificationRelation, classificationRelation));
			}
		}
		return classificationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRClassificationRelation basicGetClassificationRelation() {
		return classificationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationRelation(EMRClassificationRelation newClassificationRelation, NotificationChain msgs) {
		EMRClassificationRelation oldClassificationRelation = classificationRelation;
		classificationRelation = newClassificationRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ROLE__CLASSIFICATION_RELATION, oldClassificationRelation, newClassificationRelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationRelation(EMRClassificationRelation newClassificationRelation) {
		if (newClassificationRelation != classificationRelation) {
			NotificationChain msgs = null;
			if (classificationRelation != null)
				msgs = ((InternalEObject)classificationRelation).eInverseRemove(this, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__ROLE, EMRClassificationRelation.class, msgs);
			if (newClassificationRelation != null)
				msgs = ((InternalEObject)newClassificationRelation).eInverseAdd(this, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__ROLE, EMRClassificationRelation.class, msgs);
			msgs = basicSetClassificationRelation(newClassificationRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ROLE__CLASSIFICATION_RELATION, newClassificationRelation, newClassificationRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPDiagram getEmpDiagram() {
		if (eContainerFeatureID != ResourcepackagePackage.EMR_ROLE__EMP_DIAGRAM) return null;
		return (EMPDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpDiagram(EMPDiagram newEmpDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmpDiagram, ResourcepackagePackage.EMR_ROLE__EMP_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpDiagram(EMPDiagram newEmpDiagram) {
		if (newEmpDiagram != eInternalContainer() || (eContainerFeatureID != ResourcepackagePackage.EMR_ROLE__EMP_DIAGRAM && newEmpDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmpDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmpDiagram != null)
				msgs = ((InternalEObject)newEmpDiagram).eInverseAdd(this, ProcesspackagePackage.EMP_DIAGRAM__ROLES, EMPDiagram.class, msgs);
			msgs = basicSetEmpDiagram(newEmpDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ROLE__EMP_DIAGRAM, newEmpDiagram, newEmpDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssFlows() {
		if (assFlows == null) {
			assFlows = new EObjectWithInverseResolvingEList(EMPAssFlow.class, this, ResourcepackagePackage.EMR_ROLE__ASS_FLOWS, ProcesspackagePackage.EMP_ASS_FLOW__ROLE);
		}
		return assFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMCDiagram getColRoleDiagram() {
		if (eContainerFeatureID != ResourcepackagePackage.EMR_ROLE__COL_ROLE_DIAGRAM) return null;
		return (EMCDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColRoleDiagram(EMCDiagram newColRoleDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newColRoleDiagram, ResourcepackagePackage.EMR_ROLE__COL_ROLE_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColRoleDiagram(EMCDiagram newColRoleDiagram) {
		if (newColRoleDiagram != eInternalContainer() || (eContainerFeatureID != ResourcepackagePackage.EMR_ROLE__COL_ROLE_DIAGRAM && newColRoleDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newColRoleDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newColRoleDiagram != null)
				msgs = ((InternalEObject)newColRoleDiagram).eInverseAdd(this, CollaborationpackagePackage.EMC_DIAGRAM__COL_ROLE, EMCDiagram.class, msgs);
			msgs = basicSetColRoleDiagram(newColRoleDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_ROLE__COL_ROLE_DIAGRAM, newColRoleDiagram, newColRoleDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcepackagePackage.EMR_ROLE__TARGET_ASSOCIATION_RELATIONS:
				return ((InternalEList)getTargetAssociationRelations()).basicAdd(otherEnd, msgs);
			case ResourcepackagePackage.EMR_ROLE__SOURCE_ASSOCIATION_RELATIONS:
				return ((InternalEList)getSourceAssociationRelations()).basicAdd(otherEnd, msgs);
			case ResourcepackagePackage.EMR_ROLE__EMO_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmoDiagram((EMODiagram)otherEnd, msgs);
			case ResourcepackagePackage.EMR_ROLE__EMR_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmrDiagram((EMRDiagram)otherEnd, msgs);
			case ResourcepackagePackage.EMR_ROLE__CLASSIFICATION_RELATION:
				if (classificationRelation != null)
					msgs = ((InternalEObject)classificationRelation).eInverseRemove(this, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__ROLE, EMRClassificationRelation.class, msgs);
				return basicSetClassificationRelation((EMRClassificationRelation)otherEnd, msgs);
			case ResourcepackagePackage.EMR_ROLE__EMP_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmpDiagram((EMPDiagram)otherEnd, msgs);
			case ResourcepackagePackage.EMR_ROLE__ASS_FLOWS:
				return ((InternalEList)getAssFlows()).basicAdd(otherEnd, msgs);
			case ResourcepackagePackage.EMR_ROLE__COL_ROLE_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetColRoleDiagram((EMCDiagram)otherEnd, msgs);
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
			case ResourcepackagePackage.EMR_ROLE__TARGET_ASSOCIATION_RELATIONS:
				return ((InternalEList)getTargetAssociationRelations()).basicRemove(otherEnd, msgs);
			case ResourcepackagePackage.EMR_ROLE__SOURCE_ASSOCIATION_RELATIONS:
				return ((InternalEList)getSourceAssociationRelations()).basicRemove(otherEnd, msgs);
			case ResourcepackagePackage.EMR_ROLE__EMO_DIAGRAM:
				return basicSetEmoDiagram(null, msgs);
			case ResourcepackagePackage.EMR_ROLE__BELONGED_ORGANIZATION:
				return basicSetBelongedOrganization(null, msgs);
			case ResourcepackagePackage.EMR_ROLE__EMR_DIAGRAM:
				return basicSetEmrDiagram(null, msgs);
			case ResourcepackagePackage.EMR_ROLE__CLASSIFICATION_RELATION:
				return basicSetClassificationRelation(null, msgs);
			case ResourcepackagePackage.EMR_ROLE__EMP_DIAGRAM:
				return basicSetEmpDiagram(null, msgs);
			case ResourcepackagePackage.EMR_ROLE__ASS_FLOWS:
				return ((InternalEList)getAssFlows()).basicRemove(otherEnd, msgs);
			case ResourcepackagePackage.EMR_ROLE__COL_ROLE_DIAGRAM:
				return basicSetColRoleDiagram(null, msgs);
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
			case ResourcepackagePackage.EMR_ROLE__EMO_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, OrganizationpackagePackage.EMO_DIAGRAM__ROLES, EMODiagram.class, msgs);
			case ResourcepackagePackage.EMR_ROLE__EMR_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ResourcepackagePackage.EMR_DIAGRAM__ROLES, EMRDiagram.class, msgs);
			case ResourcepackagePackage.EMR_ROLE__EMP_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ProcesspackagePackage.EMP_DIAGRAM__ROLES, EMPDiagram.class, msgs);
			case ResourcepackagePackage.EMR_ROLE__COL_ROLE_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, CollaborationpackagePackage.EMC_DIAGRAM__COL_ROLE, EMCDiagram.class, msgs);
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
			case ResourcepackagePackage.EMR_ROLE__TARGET_ASSOCIATION_RELATIONS:
				return getTargetAssociationRelations();
			case ResourcepackagePackage.EMR_ROLE__SOURCE_ASSOCIATION_RELATIONS:
				return getSourceAssociationRelations();
			case ResourcepackagePackage.EMR_ROLE__EMO_DIAGRAM:
				return getEmoDiagram();
			case ResourcepackagePackage.EMR_ROLE__BELONGED_ORGANIZATION:
				return getBelongedOrganization();
			case ResourcepackagePackage.EMR_ROLE__EMR_DIAGRAM:
				return getEmrDiagram();
			case ResourcepackagePackage.EMR_ROLE__CLASSIFICATION_RELATION:
				if (resolve) return getClassificationRelation();
				return basicGetClassificationRelation();
			case ResourcepackagePackage.EMR_ROLE__EMP_DIAGRAM:
				return getEmpDiagram();
			case ResourcepackagePackage.EMR_ROLE__ASS_FLOWS:
				return getAssFlows();
			case ResourcepackagePackage.EMR_ROLE__COL_ROLE_DIAGRAM:
				return getColRoleDiagram();
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
			case ResourcepackagePackage.EMR_ROLE__TARGET_ASSOCIATION_RELATIONS:
				getTargetAssociationRelations().clear();
				getTargetAssociationRelations().addAll((Collection)newValue);
				return;
			case ResourcepackagePackage.EMR_ROLE__SOURCE_ASSOCIATION_RELATIONS:
				getSourceAssociationRelations().clear();
				getSourceAssociationRelations().addAll((Collection)newValue);
				return;
			case ResourcepackagePackage.EMR_ROLE__EMO_DIAGRAM:
				setEmoDiagram((EMODiagram)newValue);
				return;
			case ResourcepackagePackage.EMR_ROLE__BELONGED_ORGANIZATION:
				setBelongedOrganization((EMOResourceGroupType)newValue);
				return;
			case ResourcepackagePackage.EMR_ROLE__EMR_DIAGRAM:
				setEmrDiagram((EMRDiagram)newValue);
				return;
			case ResourcepackagePackage.EMR_ROLE__CLASSIFICATION_RELATION:
				setClassificationRelation((EMRClassificationRelation)newValue);
				return;
			case ResourcepackagePackage.EMR_ROLE__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)newValue);
				return;
			case ResourcepackagePackage.EMR_ROLE__ASS_FLOWS:
				getAssFlows().clear();
				getAssFlows().addAll((Collection)newValue);
				return;
			case ResourcepackagePackage.EMR_ROLE__COL_ROLE_DIAGRAM:
				setColRoleDiagram((EMCDiagram)newValue);
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
			case ResourcepackagePackage.EMR_ROLE__TARGET_ASSOCIATION_RELATIONS:
				getTargetAssociationRelations().clear();
				return;
			case ResourcepackagePackage.EMR_ROLE__SOURCE_ASSOCIATION_RELATIONS:
				getSourceAssociationRelations().clear();
				return;
			case ResourcepackagePackage.EMR_ROLE__EMO_DIAGRAM:
				setEmoDiagram((EMODiagram)null);
				return;
			case ResourcepackagePackage.EMR_ROLE__BELONGED_ORGANIZATION:
				setBelongedOrganization((EMOResourceGroupType)null);
				return;
			case ResourcepackagePackage.EMR_ROLE__EMR_DIAGRAM:
				setEmrDiagram((EMRDiagram)null);
				return;
			case ResourcepackagePackage.EMR_ROLE__CLASSIFICATION_RELATION:
				setClassificationRelation((EMRClassificationRelation)null);
				return;
			case ResourcepackagePackage.EMR_ROLE__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)null);
				return;
			case ResourcepackagePackage.EMR_ROLE__ASS_FLOWS:
				getAssFlows().clear();
				return;
			case ResourcepackagePackage.EMR_ROLE__COL_ROLE_DIAGRAM:
				setColRoleDiagram((EMCDiagram)null);
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
			case ResourcepackagePackage.EMR_ROLE__TARGET_ASSOCIATION_RELATIONS:
				return targetAssociationRelations != null && !targetAssociationRelations.isEmpty();
			case ResourcepackagePackage.EMR_ROLE__SOURCE_ASSOCIATION_RELATIONS:
				return sourceAssociationRelations != null && !sourceAssociationRelations.isEmpty();
			case ResourcepackagePackage.EMR_ROLE__EMO_DIAGRAM:
				return getEmoDiagram() != null;
			case ResourcepackagePackage.EMR_ROLE__BELONGED_ORGANIZATION:
				return belongedOrganization != null;
			case ResourcepackagePackage.EMR_ROLE__EMR_DIAGRAM:
				return getEmrDiagram() != null;
			case ResourcepackagePackage.EMR_ROLE__CLASSIFICATION_RELATION:
				return classificationRelation != null;
			case ResourcepackagePackage.EMR_ROLE__EMP_DIAGRAM:
				return getEmpDiagram() != null;
			case ResourcepackagePackage.EMR_ROLE__ASS_FLOWS:
				return assFlows != null && !assFlows.isEmpty();
			case ResourcepackagePackage.EMR_ROLE__COL_ROLE_DIAGRAM:
				return getColRoleDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

} //EMRRoleImpl
