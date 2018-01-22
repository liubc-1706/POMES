/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.organizationpackage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vpml.impl.EMDiagramImpl;

import vpml.organizationpackage.EMOAssociationRelation;
import vpml.organizationpackage.EMOComposeRelation;
import vpml.organizationpackage.EMODiagram;
import vpml.organizationpackage.EMOResourceGroupType;
import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.processpackage.EMPDiagram;
import vpml.processpackage.ProcesspackagePackage;

import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.EMRRole;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMO Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.organizationpackage.impl.EMODiagramImpl#getEmpDiagrams <em>Emp Diagrams</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMODiagramImpl#getEmrDiagrams <em>Emr Diagrams</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMODiagramImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMODiagramImpl#getResourceGroupTypes <em>Resource Group Types</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMODiagramImpl#getAssociationRelations <em>Association Relations</em>}</li>
 *   <li>{@link vpml.organizationpackage.impl.EMODiagramImpl#getComposeRelations <em>Compose Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMODiagramImpl extends EMDiagramImpl implements EMODiagram {
	/**
	 * The cached value of the '{@link #getEmpDiagrams() <em>Emp Diagrams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList empDiagrams = null;

	/**
	 * The cached value of the '{@link #getEmrDiagrams() <em>Emr Diagrams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmrDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList emrDiagrams = null;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList roles = null;

	/**
	 * The cached value of the '{@link #getResourceGroupTypes() <em>Resource Group Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceGroupTypes()
	 * @generated
	 * @ordered
	 */
	protected EList resourceGroupTypes = null;

	/**
	 * The cached value of the '{@link #getAssociationRelations() <em>Association Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationRelations()
	 * @generated
	 * @ordered
	 */
	protected EList associationRelations = null;

	/**
	 * The cached value of the '{@link #getComposeRelations() <em>Compose Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposeRelations()
	 * @generated
	 * @ordered
	 */
	protected EList composeRelations = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMODiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrganizationpackagePackage.Literals.EMO_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEmpDiagrams() {
		if (empDiagrams == null) {
			empDiagrams = new EObjectWithInverseResolvingEList.ManyInverse(EMPDiagram.class, this, OrganizationpackagePackage.EMO_DIAGRAM__EMP_DIAGRAMS, ProcesspackagePackage.EMP_DIAGRAM__EMO_DIAGRAMS);
		}
		return empDiagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEmrDiagrams() {
		if (emrDiagrams == null) {
			emrDiagrams = new EObjectWithInverseResolvingEList(EMRDiagram.class, this, OrganizationpackagePackage.EMO_DIAGRAM__EMR_DIAGRAMS, ResourcepackagePackage.EMR_DIAGRAM__EMO_DIAGRAM);
		}
		return emrDiagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentWithInverseEList(EMRRole.class, this, OrganizationpackagePackage.EMO_DIAGRAM__ROLES, ResourcepackagePackage.EMR_ROLE__EMO_DIAGRAM);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResourceGroupTypes() {
		if (resourceGroupTypes == null) {
			resourceGroupTypes = new EObjectContainmentWithInverseEList(EMOResourceGroupType.class, this, OrganizationpackagePackage.EMO_DIAGRAM__RESOURCE_GROUP_TYPES, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__EMO_DIAGRAM);
		}
		return resourceGroupTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssociationRelations() {
		if (associationRelations == null) {
			associationRelations = new EObjectContainmentWithInverseEList(EMOAssociationRelation.class, this, OrganizationpackagePackage.EMO_DIAGRAM__ASSOCIATION_RELATIONS, OrganizationpackagePackage.EMO_ASSOCIATION_RELATION__EMO_DIAGRAM);
		}
		return associationRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComposeRelations() {
		if (composeRelations == null) {
			composeRelations = new EObjectContainmentWithInverseEList(EMOComposeRelation.class, this, OrganizationpackagePackage.EMO_DIAGRAM__COMPOSE_RELATIONS, OrganizationpackagePackage.EMO_COMPOSE_RELATION__EMO_DIAGRAM);
		}
		return composeRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrganizationpackagePackage.EMO_DIAGRAM__EMP_DIAGRAMS:
				return ((InternalEList)getEmpDiagrams()).basicAdd(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_DIAGRAM__EMR_DIAGRAMS:
				return ((InternalEList)getEmrDiagrams()).basicAdd(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_DIAGRAM__ROLES:
				return ((InternalEList)getRoles()).basicAdd(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_DIAGRAM__RESOURCE_GROUP_TYPES:
				return ((InternalEList)getResourceGroupTypes()).basicAdd(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_DIAGRAM__ASSOCIATION_RELATIONS:
				return ((InternalEList)getAssociationRelations()).basicAdd(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_DIAGRAM__COMPOSE_RELATIONS:
				return ((InternalEList)getComposeRelations()).basicAdd(otherEnd, msgs);
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
			case OrganizationpackagePackage.EMO_DIAGRAM__EMP_DIAGRAMS:
				return ((InternalEList)getEmpDiagrams()).basicRemove(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_DIAGRAM__EMR_DIAGRAMS:
				return ((InternalEList)getEmrDiagrams()).basicRemove(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_DIAGRAM__ROLES:
				return ((InternalEList)getRoles()).basicRemove(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_DIAGRAM__RESOURCE_GROUP_TYPES:
				return ((InternalEList)getResourceGroupTypes()).basicRemove(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_DIAGRAM__ASSOCIATION_RELATIONS:
				return ((InternalEList)getAssociationRelations()).basicRemove(otherEnd, msgs);
			case OrganizationpackagePackage.EMO_DIAGRAM__COMPOSE_RELATIONS:
				return ((InternalEList)getComposeRelations()).basicRemove(otherEnd, msgs);
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
			case OrganizationpackagePackage.EMO_DIAGRAM__EMP_DIAGRAMS:
				return getEmpDiagrams();
			case OrganizationpackagePackage.EMO_DIAGRAM__EMR_DIAGRAMS:
				return getEmrDiagrams();
			case OrganizationpackagePackage.EMO_DIAGRAM__ROLES:
				return getRoles();
			case OrganizationpackagePackage.EMO_DIAGRAM__RESOURCE_GROUP_TYPES:
				return getResourceGroupTypes();
			case OrganizationpackagePackage.EMO_DIAGRAM__ASSOCIATION_RELATIONS:
				return getAssociationRelations();
			case OrganizationpackagePackage.EMO_DIAGRAM__COMPOSE_RELATIONS:
				return getComposeRelations();
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
			case OrganizationpackagePackage.EMO_DIAGRAM__EMP_DIAGRAMS:
				getEmpDiagrams().clear();
				getEmpDiagrams().addAll((Collection)newValue);
				return;
			case OrganizationpackagePackage.EMO_DIAGRAM__EMR_DIAGRAMS:
				getEmrDiagrams().clear();
				getEmrDiagrams().addAll((Collection)newValue);
				return;
			case OrganizationpackagePackage.EMO_DIAGRAM__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection)newValue);
				return;
			case OrganizationpackagePackage.EMO_DIAGRAM__RESOURCE_GROUP_TYPES:
				getResourceGroupTypes().clear();
				getResourceGroupTypes().addAll((Collection)newValue);
				return;
			case OrganizationpackagePackage.EMO_DIAGRAM__ASSOCIATION_RELATIONS:
				getAssociationRelations().clear();
				getAssociationRelations().addAll((Collection)newValue);
				return;
			case OrganizationpackagePackage.EMO_DIAGRAM__COMPOSE_RELATIONS:
				getComposeRelations().clear();
				getComposeRelations().addAll((Collection)newValue);
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
			case OrganizationpackagePackage.EMO_DIAGRAM__EMP_DIAGRAMS:
				getEmpDiagrams().clear();
				return;
			case OrganizationpackagePackage.EMO_DIAGRAM__EMR_DIAGRAMS:
				getEmrDiagrams().clear();
				return;
			case OrganizationpackagePackage.EMO_DIAGRAM__ROLES:
				getRoles().clear();
				return;
			case OrganizationpackagePackage.EMO_DIAGRAM__RESOURCE_GROUP_TYPES:
				getResourceGroupTypes().clear();
				return;
			case OrganizationpackagePackage.EMO_DIAGRAM__ASSOCIATION_RELATIONS:
				getAssociationRelations().clear();
				return;
			case OrganizationpackagePackage.EMO_DIAGRAM__COMPOSE_RELATIONS:
				getComposeRelations().clear();
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
			case OrganizationpackagePackage.EMO_DIAGRAM__EMP_DIAGRAMS:
				return empDiagrams != null && !empDiagrams.isEmpty();
			case OrganizationpackagePackage.EMO_DIAGRAM__EMR_DIAGRAMS:
				return emrDiagrams != null && !emrDiagrams.isEmpty();
			case OrganizationpackagePackage.EMO_DIAGRAM__ROLES:
				return roles != null && !roles.isEmpty();
			case OrganizationpackagePackage.EMO_DIAGRAM__RESOURCE_GROUP_TYPES:
				return resourceGroupTypes != null && !resourceGroupTypes.isEmpty();
			case OrganizationpackagePackage.EMO_DIAGRAM__ASSOCIATION_RELATIONS:
				return associationRelations != null && !associationRelations.isEmpty();
			case OrganizationpackagePackage.EMO_DIAGRAM__COMPOSE_RELATIONS:
				return composeRelations != null && !composeRelations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EMODiagramImpl
