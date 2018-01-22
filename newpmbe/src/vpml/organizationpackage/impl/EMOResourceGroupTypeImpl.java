/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.organizationpackage.impl;

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
import vpml.organizationpackage.EMOComposeRelation;
import vpml.organizationpackage.EMODiagram;
import vpml.organizationpackage.EMOResourceGroupType;
import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.ProcesspackagePackage;

import vpml.resourcepackage.EMRBasicResourceType;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMO Resource Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.organizationpackage.impl.EMOResourceGroupTypeImpl#getOrganiztionType <em>Organiztion Type</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMOResourceGroupTypeImpl#getSuperOrganization <em>Super Organization</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMOResourceGroupTypeImpl#getPrincipal <em>Principal</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMOResourceGroupTypeImpl#getArrangeNumber <em>Arrange Number</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMOResourceGroupTypeImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMOResourceGroupTypeImpl#getSourceAssociationRelations <em>Source Association Relations</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMOResourceGroupTypeImpl#getTargetComposeRelation <em>Target Compose Relation</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMOResourceGroupTypeImpl#getSourceComposeRelations <em>Source Compose Relations</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMOResourceGroupTypeImpl#getTargetAssociationRelations <em>Target Association Relations</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMOResourceGroupTypeImpl#getEmoDiagram <em>Emo Diagram</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMOResourceGroupTypeImpl#getBasicResourceTypes <em>Basic Resource Types</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMOResourceGroupTypeImpl#getAssFlows <em>Ass Flows</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMOResourceGroupTypeImpl#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMOResourceGroupTypeImpl#getColEMOGroupDiagram <em>Col EMO Group Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMOResourceGroupTypeImpl extends EMOObjectImpl implements EMOResourceGroupType {
	/**
	 * The default value of the '{@link #getOrganiztionType() <em>Organiztion Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganiztionType()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganiztionType() <em>Organiztion Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganiztionType()
	 * @generated
	 * @ordered
	 */
	protected String organiztionType = ORGANIZTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperOrganization() <em>Super Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperOrganization()
	 * @generated
	 * @ordered
	 */
	protected EMOResourceGroupType superOrganization = null;

	/**
	 * The default value of the '{@link #getPrincipal() <em>Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipal()
	 * @generated
	 * @ordered
	 */
	protected static final String PRINCIPAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrincipal() <em>Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipal()
	 * @generated
	 * @ordered
	 */
	protected String principal = PRINCIPAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrangeNumber() <em>Arrange Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrangeNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Long ARRANGE_NUMBER_EDEFAULT = new Long(1L);

	/**
	 * The cached value of the '{@link #getArrangeNumber() <em>Arrange Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrangeNumber()
	 * @generated
	 * @ordered
	 */
	protected Long arrangeNumber = ARRANGE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected static final String RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected String reserved = RESERVED_EDEFAULT;

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
	 * The cached value of the '{@link #getTargetComposeRelation() <em>Target Compose Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetComposeRelation()
	 * @generated
	 * @ordered
	 */
	protected EMOComposeRelation targetComposeRelation = null;

	/**
	 * The cached value of the '{@link #getSourceComposeRelations() <em>Source Compose Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceComposeRelations()
	 * @generated
	 * @ordered
	 */
	protected EList sourceComposeRelations = null;

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
	 * The cached value of the '{@link #getBasicResourceTypes() <em>Basic Resource Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicResourceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList basicResourceTypes = null;

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
	protected EMOResourceGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrganizationpackagePackage.Literals.EMO_RESOURCE_GROUP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganiztionType() {
		return organiztionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganiztionType(String newOrganiztionType) {
		String oldOrganiztionType = organiztionType;
		organiztionType = newOrganiztionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ORGANIZTION_TYPE, oldOrganiztionType, organiztionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOResourceGroupType getSuperOrganization() {
		return superOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperOrganization(EMOResourceGroupType newSuperOrganization, NotificationChain msgs) {
		EMOResourceGroupType oldSuperOrganization = superOrganization;
		superOrganization = newSuperOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SUPER_ORGANIZATION, oldSuperOrganization, newSuperOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperOrganization(EMOResourceGroupType newSuperOrganization) {
		if (newSuperOrganization != superOrganization) {
			NotificationChain msgs = null;
			if (superOrganization != null)
				msgs = ((InternalEObject)superOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SUPER_ORGANIZATION, null, msgs);
			if (newSuperOrganization != null)
				msgs = ((InternalEObject)newSuperOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SUPER_ORGANIZATION, null, msgs);
			msgs = basicSetSuperOrganization(newSuperOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SUPER_ORGANIZATION, newSuperOrganization, newSuperOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrincipal() {
		return principal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrincipal(String newPrincipal) {
		String oldPrincipal = principal;
		principal = newPrincipal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__PRINCIPAL, oldPrincipal, principal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getArrangeNumber() {
		return arrangeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrangeNumber(Long newArrangeNumber) {
		Long oldArrangeNumber = arrangeNumber;
		arrangeNumber = newArrangeNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ARRANGE_NUMBER, oldArrangeNumber, arrangeNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(String newReserved) {
		String oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceAssociationRelations() {
		if (sourceAssociationRelations == null) {
			sourceAssociationRelations = new EObjectWithInverseResolvingEList(EMOAssociationRelation.class, this, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_ASSOCIATION_RELATIONS, OrganizationpackagePackage.EMO_ASSOCIATION_RELATION__SOURCE_GROUP_TYPE);
		}
		return sourceAssociationRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOComposeRelation getTargetComposeRelation() {
		if (targetComposeRelation != null && targetComposeRelation.eIsProxy()) {
			InternalEObject oldTargetComposeRelation = (InternalEObject)targetComposeRelation;
			targetComposeRelation = (EMOComposeRelation)eResolveProxy(oldTargetComposeRelation);
			if (targetComposeRelation != oldTargetComposeRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_COMPOSE_RELATION, oldTargetComposeRelation, targetComposeRelation));
			}
		}
		return targetComposeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOComposeRelation basicGetTargetComposeRelation() {
		return targetComposeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetComposeRelation(EMOComposeRelation newTargetComposeRelation, NotificationChain msgs) {
		EMOComposeRelation oldTargetComposeRelation = targetComposeRelation;
		targetComposeRelation = newTargetComposeRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_COMPOSE_RELATION, oldTargetComposeRelation, newTargetComposeRelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetComposeRelation(EMOComposeRelation newTargetComposeRelation) {
		if (newTargetComposeRelation != targetComposeRelation) {
			NotificationChain msgs = null;
			if (targetComposeRelation != null)
				msgs = ((InternalEObject)targetComposeRelation).eInverseRemove(this, OrganizationpackagePackage.EMO_COMPOSE_RELATION__TARGET_GROUP_TYPE, EMOComposeRelation.class, msgs);
			if (newTargetComposeRelation != null)
				msgs = ((InternalEObject)newTargetComposeRelation).eInverseAdd(this, OrganizationpackagePackage.EMO_COMPOSE_RELATION__TARGET_GROUP_TYPE, EMOComposeRelation.class, msgs);
			msgs = basicSetTargetComposeRelation(newTargetComposeRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_COMPOSE_RELATION, newTargetComposeRelation, newTargetComposeRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceComposeRelations() {
		if (sourceComposeRelations == null) {
			sourceComposeRelations = new EObjectWithInverseResolvingEList(EMOComposeRelation.class, this, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_COMPOSE_RELATIONS, OrganizationpackagePackage.EMO_COMPOSE_RELATION__SOURCE_GROUP_TYPE);
		}
		return sourceComposeRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargetAssociationRelations() {
		if (targetAssociationRelations == null) {
			targetAssociationRelations = new EObjectWithInverseResolvingEList(EMOAssociationRelation.class, this, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_ASSOCIATION_RELATIONS, OrganizationpackagePackage.EMO_ASSOCIATION_RELATION__TARGET_GROUP_TYPE);
		}
		return targetAssociationRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMODiagram getEmoDiagram() {
		if (eContainerFeatureID != OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMO_DIAGRAM) return null;
		return (EMODiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmoDiagram(EMODiagram newEmoDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmoDiagram, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMO_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmoDiagram(EMODiagram newEmoDiagram) {
		if (newEmoDiagram != eInternalContainer() || (eContainerFeatureID != OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMO_DIAGRAM && newEmoDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmoDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmoDiagram != null)
				msgs = ((InternalEObject)newEmoDiagram).eInverseAdd(this, OrganizationpackagePackage.EMO_DIAGRAM__RESOURCE_GROUP_TYPES, EMODiagram.class, msgs);
			msgs = basicSetEmoDiagram(newEmoDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMO_DIAGRAM, newEmoDiagram, newEmoDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBasicResourceTypes() {
		if (basicResourceTypes == null) {
			basicResourceTypes = new EObjectWithInverseResolvingEList.ManyInverse(EMRBasicResourceType.class, this, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__BASIC_RESOURCE_TYPES, ResourcepackagePackage.EMR_BASIC_RESOURCE_TYPE__RESOURCE_GROUP_TYPES);
		}
		return basicResourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssFlows() {
		if (assFlows == null) {
			assFlows = new EObjectWithInverseResolvingEList(EMPAssFlow.class, this, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ASS_FLOWS, ProcesspackagePackage.EMP_ASS_FLOW__RESOURCE_GROUP_TYPE);
		}
		return assFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPDiagram getEmpDiagram() {
		if (eContainerFeatureID != OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMP_DIAGRAM) return null;
		return (EMPDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpDiagram(EMPDiagram newEmpDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmpDiagram, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMP_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpDiagram(EMPDiagram newEmpDiagram) {
		if (newEmpDiagram != eInternalContainer() || (eContainerFeatureID != OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMP_DIAGRAM && newEmpDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmpDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmpDiagram != null)
				msgs = ((InternalEObject)newEmpDiagram).eInverseAdd(this, ProcesspackagePackage.EMP_DIAGRAM__RESOURCE_GROUP_TYPES, EMPDiagram.class, msgs);
			msgs = basicSetEmpDiagram(newEmpDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMP_DIAGRAM, newEmpDiagram, newEmpDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMCDiagram getColEMOGroupDiagram() {
		if (eContainerFeatureID != OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__COL_EMO_GROUP_DIAGRAM) return null;
		return (EMCDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColEMOGroupDiagram(EMCDiagram newColEMOGroupDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newColEMOGroupDiagram, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__COL_EMO_GROUP_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColEMOGroupDiagram(EMCDiagram newColEMOGroupDiagram) {
		if (newColEMOGroupDiagram != eInternalContainer() || (eContainerFeatureID != OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__COL_EMO_GROUP_DIAGRAM && newColEMOGroupDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newColEMOGroupDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newColEMOGroupDiagram != null)
				msgs = ((InternalEObject)newColEMOGroupDiagram).eInverseAdd(this, CollaborationpackagePackage.EMC_DIAGRAM__COL_EMO_GROUP, EMCDiagram.class, msgs);
			msgs = basicSetColEMOGroupDiagram(newColEMOGroupDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__COL_EMO_GROUP_DIAGRAM, newColEMOGroupDiagram, newColEMOGroupDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_ASSOCIATION_RELATIONS:
				return ((InternalEList)getSourceAssociationRelations()).basicAdd(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_COMPOSE_RELATION:
				if (targetComposeRelation != null)
					msgs = ((InternalEObject)targetComposeRelation).eInverseRemove(this, OrganizationpackagePackage.EMO_COMPOSE_RELATION__TARGET_GROUP_TYPE, EMOComposeRelation.class, msgs);
				return basicSetTargetComposeRelation((EMOComposeRelation)otherEnd, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_COMPOSE_RELATIONS:
				return ((InternalEList)getSourceComposeRelations()).basicAdd(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_ASSOCIATION_RELATIONS:
				return ((InternalEList)getTargetAssociationRelations()).basicAdd(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMO_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmoDiagram((EMODiagram)otherEnd, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__BASIC_RESOURCE_TYPES:
				return ((InternalEList)getBasicResourceTypes()).basicAdd(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ASS_FLOWS:
				return ((InternalEList)getAssFlows()).basicAdd(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMP_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmpDiagram((EMPDiagram)otherEnd, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__COL_EMO_GROUP_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetColEMOGroupDiagram((EMCDiagram)otherEnd, msgs);
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
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SUPER_ORGANIZATION:
				return basicSetSuperOrganization(null, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_ASSOCIATION_RELATIONS:
				return ((InternalEList)getSourceAssociationRelations()).basicRemove(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_COMPOSE_RELATION:
				return basicSetTargetComposeRelation(null, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_COMPOSE_RELATIONS:
				return ((InternalEList)getSourceComposeRelations()).basicRemove(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_ASSOCIATION_RELATIONS:
				return ((InternalEList)getTargetAssociationRelations()).basicRemove(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMO_DIAGRAM:
				return basicSetEmoDiagram(null, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__BASIC_RESOURCE_TYPES:
				return ((InternalEList)getBasicResourceTypes()).basicRemove(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ASS_FLOWS:
				return ((InternalEList)getAssFlows()).basicRemove(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMP_DIAGRAM:
				return basicSetEmpDiagram(null, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__COL_EMO_GROUP_DIAGRAM:
				return basicSetColEMOGroupDiagram(null, msgs);
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
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMO_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, OrganizationpackagePackage.EMO_DIAGRAM__RESOURCE_GROUP_TYPES, EMODiagram.class, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMP_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ProcesspackagePackage.EMP_DIAGRAM__RESOURCE_GROUP_TYPES, EMPDiagram.class, msgs);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__COL_EMO_GROUP_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, CollaborationpackagePackage.EMC_DIAGRAM__COL_EMO_GROUP, EMCDiagram.class, msgs);
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
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ORGANIZTION_TYPE:
				return getOrganiztionType();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SUPER_ORGANIZATION:
				return getSuperOrganization();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__PRINCIPAL:
				return getPrincipal();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ARRANGE_NUMBER:
				return getArrangeNumber();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__RESERVED:
				return getReserved();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_ASSOCIATION_RELATIONS:
				return getSourceAssociationRelations();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_COMPOSE_RELATION:
				if (resolve) return getTargetComposeRelation();
				return basicGetTargetComposeRelation();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_COMPOSE_RELATIONS:
				return getSourceComposeRelations();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_ASSOCIATION_RELATIONS:
				return getTargetAssociationRelations();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMO_DIAGRAM:
				return getEmoDiagram();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__BASIC_RESOURCE_TYPES:
				return getBasicResourceTypes();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ASS_FLOWS:
				return getAssFlows();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMP_DIAGRAM:
				return getEmpDiagram();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__COL_EMO_GROUP_DIAGRAM:
				return getColEMOGroupDiagram();
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
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ORGANIZTION_TYPE:
				setOrganiztionType((String)newValue);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SUPER_ORGANIZATION:
				setSuperOrganization((EMOResourceGroupType)newValue);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__PRINCIPAL:
				setPrincipal((String)newValue);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ARRANGE_NUMBER:
				setArrangeNumber((Long)newValue);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__RESERVED:
				setReserved((String)newValue);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_ASSOCIATION_RELATIONS:
				getSourceAssociationRelations().clear();
				getSourceAssociationRelations().addAll((Collection)newValue);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_COMPOSE_RELATION:
				setTargetComposeRelation((EMOComposeRelation)newValue);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_COMPOSE_RELATIONS:
				getSourceComposeRelations().clear();
				getSourceComposeRelations().addAll((Collection)newValue);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_ASSOCIATION_RELATIONS:
				getTargetAssociationRelations().clear();
				getTargetAssociationRelations().addAll((Collection)newValue);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMO_DIAGRAM:
				setEmoDiagram((EMODiagram)newValue);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__BASIC_RESOURCE_TYPES:
				getBasicResourceTypes().clear();
				getBasicResourceTypes().addAll((Collection)newValue);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ASS_FLOWS:
				getAssFlows().clear();
				getAssFlows().addAll((Collection)newValue);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)newValue);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__COL_EMO_GROUP_DIAGRAM:
				setColEMOGroupDiagram((EMCDiagram)newValue);
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
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ORGANIZTION_TYPE:
				setOrganiztionType(ORGANIZTION_TYPE_EDEFAULT);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SUPER_ORGANIZATION:
				setSuperOrganization((EMOResourceGroupType)null);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__PRINCIPAL:
				setPrincipal(PRINCIPAL_EDEFAULT);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ARRANGE_NUMBER:
				setArrangeNumber(ARRANGE_NUMBER_EDEFAULT);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_ASSOCIATION_RELATIONS:
				getSourceAssociationRelations().clear();
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_COMPOSE_RELATION:
				setTargetComposeRelation((EMOComposeRelation)null);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_COMPOSE_RELATIONS:
				getSourceComposeRelations().clear();
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_ASSOCIATION_RELATIONS:
				getTargetAssociationRelations().clear();
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMO_DIAGRAM:
				setEmoDiagram((EMODiagram)null);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__BASIC_RESOURCE_TYPES:
				getBasicResourceTypes().clear();
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ASS_FLOWS:
				getAssFlows().clear();
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)null);
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__COL_EMO_GROUP_DIAGRAM:
				setColEMOGroupDiagram((EMCDiagram)null);
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
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ORGANIZTION_TYPE:
				return ORGANIZTION_TYPE_EDEFAULT == null ? organiztionType != null : !ORGANIZTION_TYPE_EDEFAULT.equals(organiztionType);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SUPER_ORGANIZATION:
				return superOrganization != null;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__PRINCIPAL:
				return PRINCIPAL_EDEFAULT == null ? principal != null : !PRINCIPAL_EDEFAULT.equals(principal);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ARRANGE_NUMBER:
				return ARRANGE_NUMBER_EDEFAULT == null ? arrangeNumber != null : !ARRANGE_NUMBER_EDEFAULT.equals(arrangeNumber);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_ASSOCIATION_RELATIONS:
				return sourceAssociationRelations != null && !sourceAssociationRelations.isEmpty();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_COMPOSE_RELATION:
				return targetComposeRelation != null;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SOURCE_COMPOSE_RELATIONS:
				return sourceComposeRelations != null && !sourceComposeRelations.isEmpty();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__TARGET_ASSOCIATION_RELATIONS:
				return targetAssociationRelations != null && !targetAssociationRelations.isEmpty();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMO_DIAGRAM:
				return getEmoDiagram() != null;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__BASIC_RESOURCE_TYPES:
				return basicResourceTypes != null && !basicResourceTypes.isEmpty();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ASS_FLOWS:
				return assFlows != null && !assFlows.isEmpty();
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMP_DIAGRAM:
				return getEmpDiagram() != null;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__COL_EMO_GROUP_DIAGRAM:
				return getColEMOGroupDiagram() != null;
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
		result.append(" (organiztionType: ");
		result.append(organiztionType);
		result.append(", principal: ");
		result.append(principal);
		result.append(", arrangeNumber: ");
		result.append(arrangeNumber);
		result.append(", reserved: ");
		result.append(reserved);
		result.append(')');
		return result.toString();
	}

} //EMOResourceGroupTypeImpl
