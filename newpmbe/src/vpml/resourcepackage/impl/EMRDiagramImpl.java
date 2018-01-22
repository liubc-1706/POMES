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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vpml.impl.EMDiagramImpl;

import vpml.organizationpackage.EMODiagram;
import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.processpackage.EMPDiagram;
import vpml.processpackage.ProcesspackagePackage;

import vpml.resourcepackage.EMRAbstractLocationType;
import vpml.resourcepackage.EMRAbstractMachineType;
import vpml.resourcepackage.EMRAbstractRole;
import vpml.resourcepackage.EMRAbstractToolType;
import vpml.resourcepackage.EMRClassificationRelation;
import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.EMRLocationType;
import vpml.resourcepackage.EMRMachineType;
import vpml.resourcepackage.EMRRole;
import vpml.resourcepackage.EMRToolType;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMR Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.resourcepackage.impl.EMRDiagramImpl#getEmpDiagrams <em>Emp Diagrams</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRDiagramImpl#getEmoDiagram <em>Emo Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRDiagramImpl#getClassificationRelations <em>Classification Relations</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRDiagramImpl#getAbstractLocationTypes <em>Abstract Location Types</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRDiagramImpl#getAbstractMachineTypes <em>Abstract Machine Types</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRDiagramImpl#getAbstractToolTypes <em>Abstract Tool Types</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRDiagramImpl#getAbstractRoles <em>Abstract Roles</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRDiagramImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRDiagramImpl#getLocationTypes <em>Location Types</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRDiagramImpl#getMachineTypes <em>Machine Types</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRDiagramImpl#getToolTypes <em>Tool Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMRDiagramImpl extends EMDiagramImpl implements EMRDiagram {
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
	 * The cached value of the '{@link #getEmoDiagram() <em>Emo Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmoDiagram()
	 * @generated
	 * @ordered
	 */
	protected EMODiagram emoDiagram = null;

	/**
	 * The cached value of the '{@link #getClassificationRelations() <em>Classification Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationRelations()
	 * @generated
	 * @ordered
	 */
	protected EList classificationRelations = null;

	/**
	 * The cached value of the '{@link #getAbstractLocationTypes() <em>Abstract Location Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractLocationTypes()
	 * @generated
	 * @ordered
	 */
	protected EList abstractLocationTypes = null;

	/**
	 * The cached value of the '{@link #getAbstractMachineTypes() <em>Abstract Machine Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractMachineTypes()
	 * @generated
	 * @ordered
	 */
	protected EList abstractMachineTypes = null;

	/**
	 * The cached value of the '{@link #getAbstractToolTypes() <em>Abstract Tool Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractToolTypes()
	 * @generated
	 * @ordered
	 */
	protected EList abstractToolTypes = null;

	/**
	 * The cached value of the '{@link #getAbstractRoles() <em>Abstract Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractRoles()
	 * @generated
	 * @ordered
	 */
	protected EList abstractRoles = null;

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
	 * The cached value of the '{@link #getLocationTypes() <em>Location Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationTypes()
	 * @generated
	 * @ordered
	 */
	protected EList locationTypes = null;

	/**
	 * The cached value of the '{@link #getMachineTypes() <em>Machine Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineTypes()
	 * @generated
	 * @ordered
	 */
	protected EList machineTypes = null;

	/**
	 * The cached value of the '{@link #getToolTypes() <em>Tool Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolTypes()
	 * @generated
	 * @ordered
	 */
	protected EList toolTypes = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMRDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ResourcepackagePackage.Literals.EMR_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEmpDiagrams() {
		if (empDiagrams == null) {
			empDiagrams = new EObjectWithInverseResolvingEList.ManyInverse(EMPDiagram.class, this, ResourcepackagePackage.EMR_DIAGRAM__EMP_DIAGRAMS, ProcesspackagePackage.EMP_DIAGRAM__EMR_DIAGRAMS);
		}
		return empDiagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMODiagram getEmoDiagram() {
		if (emoDiagram != null && emoDiagram.eIsProxy()) {
			InternalEObject oldEmoDiagram = (InternalEObject)emoDiagram;
			emoDiagram = (EMODiagram)eResolveProxy(oldEmoDiagram);
			if (emoDiagram != oldEmoDiagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_DIAGRAM__EMO_DIAGRAM, oldEmoDiagram, emoDiagram));
			}
		}
		return emoDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMODiagram basicGetEmoDiagram() {
		return emoDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmoDiagram(EMODiagram newEmoDiagram, NotificationChain msgs) {
		EMODiagram oldEmoDiagram = emoDiagram;
		emoDiagram = newEmoDiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_DIAGRAM__EMO_DIAGRAM, oldEmoDiagram, newEmoDiagram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmoDiagram(EMODiagram newEmoDiagram) {
		if (newEmoDiagram != emoDiagram) {
			NotificationChain msgs = null;
			if (emoDiagram != null)
				msgs = ((InternalEObject)emoDiagram).eInverseRemove(this, OrganizationpackagePackage.EMO_DIAGRAM__EMR_DIAGRAMS, EMODiagram.class, msgs);
			if (newEmoDiagram != null)
				msgs = ((InternalEObject)newEmoDiagram).eInverseAdd(this, OrganizationpackagePackage.EMO_DIAGRAM__EMR_DIAGRAMS, EMODiagram.class, msgs);
			msgs = basicSetEmoDiagram(newEmoDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_DIAGRAM__EMO_DIAGRAM, newEmoDiagram, newEmoDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClassificationRelations() {
		if (classificationRelations == null) {
			classificationRelations = new EObjectContainmentWithInverseEList(EMRClassificationRelation.class, this, ResourcepackagePackage.EMR_DIAGRAM__CLASSIFICATION_RELATIONS, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__EMR_DIAGRAM);
		}
		return classificationRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAbstractLocationTypes() {
		if (abstractLocationTypes == null) {
			abstractLocationTypes = new EObjectContainmentWithInverseEList(EMRAbstractLocationType.class, this, ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_LOCATION_TYPES, ResourcepackagePackage.EMR_ABSTRACT_LOCATION_TYPE__EMR_DIAGRAM);
		}
		return abstractLocationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAbstractMachineTypes() {
		if (abstractMachineTypes == null) {
			abstractMachineTypes = new EObjectContainmentWithInverseEList(EMRAbstractMachineType.class, this, ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_MACHINE_TYPES, ResourcepackagePackage.EMR_ABSTRACT_MACHINE_TYPE__EMR_DIAGRAM);
		}
		return abstractMachineTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAbstractToolTypes() {
		if (abstractToolTypes == null) {
			abstractToolTypes = new EObjectContainmentWithInverseEList(EMRAbstractToolType.class, this, ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_TOOL_TYPES, ResourcepackagePackage.EMR_ABSTRACT_TOOL_TYPE__EMR_DIAGRAM);
		}
		return abstractToolTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAbstractRoles() {
		if (abstractRoles == null) {
			abstractRoles = new EObjectContainmentWithInverseEList(EMRAbstractRole.class, this, ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_ROLES, ResourcepackagePackage.EMR_ABSTRACT_ROLE__EMR_DIAGRAM);
		}
		return abstractRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentWithInverseEList(EMRRole.class, this, ResourcepackagePackage.EMR_DIAGRAM__ROLES, ResourcepackagePackage.EMR_ROLE__EMR_DIAGRAM);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLocationTypes() {
		if (locationTypes == null) {
			locationTypes = new EObjectContainmentWithInverseEList(EMRLocationType.class, this, ResourcepackagePackage.EMR_DIAGRAM__LOCATION_TYPES, ResourcepackagePackage.EMR_LOCATION_TYPE__EMR_DIAGRAM);
		}
		return locationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMachineTypes() {
		if (machineTypes == null) {
			machineTypes = new EObjectContainmentWithInverseEList(EMRMachineType.class, this, ResourcepackagePackage.EMR_DIAGRAM__MACHINE_TYPES, ResourcepackagePackage.EMR_MACHINE_TYPE__EMR_DIAGRAM);
		}
		return machineTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getToolTypes() {
		if (toolTypes == null) {
			toolTypes = new EObjectContainmentWithInverseEList(EMRToolType.class, this, ResourcepackagePackage.EMR_DIAGRAM__TOOL_TYPES, ResourcepackagePackage.EMR_TOOL_TYPE__EMR_DIAGRAM);
		}
		return toolTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcepackagePackage.EMR_DIAGRAM__EMP_DIAGRAMS:
				return ((InternalEList)getEmpDiagrams()).basicAdd(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__EMO_DIAGRAM:
				if (emoDiagram != null)
					msgs = ((InternalEObject)emoDiagram).eInverseRemove(this, OrganizationpackagePackage.EMO_DIAGRAM__EMR_DIAGRAMS, EMODiagram.class, msgs);
				return basicSetEmoDiagram((EMODiagram)otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__CLASSIFICATION_RELATIONS:
				return ((InternalEList)getClassificationRelations()).basicAdd(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_LOCATION_TYPES:
				return ((InternalEList)getAbstractLocationTypes()).basicAdd(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_MACHINE_TYPES:
				return ((InternalEList)getAbstractMachineTypes()).basicAdd(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_TOOL_TYPES:
				return ((InternalEList)getAbstractToolTypes()).basicAdd(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_ROLES:
				return ((InternalEList)getAbstractRoles()).basicAdd(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__ROLES:
				return ((InternalEList)getRoles()).basicAdd(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__LOCATION_TYPES:
				return ((InternalEList)getLocationTypes()).basicAdd(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__MACHINE_TYPES:
				return ((InternalEList)getMachineTypes()).basicAdd(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__TOOL_TYPES:
				return ((InternalEList)getToolTypes()).basicAdd(otherEnd, msgs);
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
			case ResourcepackagePackage.EMR_DIAGRAM__EMP_DIAGRAMS:
				return ((InternalEList)getEmpDiagrams()).basicRemove(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__EMO_DIAGRAM:
				return basicSetEmoDiagram(null, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__CLASSIFICATION_RELATIONS:
				return ((InternalEList)getClassificationRelations()).basicRemove(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_LOCATION_TYPES:
				return ((InternalEList)getAbstractLocationTypes()).basicRemove(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_MACHINE_TYPES:
				return ((InternalEList)getAbstractMachineTypes()).basicRemove(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_TOOL_TYPES:
				return ((InternalEList)getAbstractToolTypes()).basicRemove(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_ROLES:
				return ((InternalEList)getAbstractRoles()).basicRemove(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__ROLES:
				return ((InternalEList)getRoles()).basicRemove(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__LOCATION_TYPES:
				return ((InternalEList)getLocationTypes()).basicRemove(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__MACHINE_TYPES:
				return ((InternalEList)getMachineTypes()).basicRemove(otherEnd, msgs);
			case ResourcepackagePackage.EMR_DIAGRAM__TOOL_TYPES:
				return ((InternalEList)getToolTypes()).basicRemove(otherEnd, msgs);
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
			case ResourcepackagePackage.EMR_DIAGRAM__EMP_DIAGRAMS:
				return getEmpDiagrams();
			case ResourcepackagePackage.EMR_DIAGRAM__EMO_DIAGRAM:
				if (resolve) return getEmoDiagram();
				return basicGetEmoDiagram();
			case ResourcepackagePackage.EMR_DIAGRAM__CLASSIFICATION_RELATIONS:
				return getClassificationRelations();
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_LOCATION_TYPES:
				return getAbstractLocationTypes();
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_MACHINE_TYPES:
				return getAbstractMachineTypes();
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_TOOL_TYPES:
				return getAbstractToolTypes();
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_ROLES:
				return getAbstractRoles();
			case ResourcepackagePackage.EMR_DIAGRAM__ROLES:
				return getRoles();
			case ResourcepackagePackage.EMR_DIAGRAM__LOCATION_TYPES:
				return getLocationTypes();
			case ResourcepackagePackage.EMR_DIAGRAM__MACHINE_TYPES:
				return getMachineTypes();
			case ResourcepackagePackage.EMR_DIAGRAM__TOOL_TYPES:
				return getToolTypes();
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
			case ResourcepackagePackage.EMR_DIAGRAM__EMP_DIAGRAMS:
				getEmpDiagrams().clear();
				getEmpDiagrams().addAll((Collection)newValue);
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__EMO_DIAGRAM:
				setEmoDiagram((EMODiagram)newValue);
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__CLASSIFICATION_RELATIONS:
				getClassificationRelations().clear();
				getClassificationRelations().addAll((Collection)newValue);
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_LOCATION_TYPES:
				getAbstractLocationTypes().clear();
				getAbstractLocationTypes().addAll((Collection)newValue);
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_MACHINE_TYPES:
				getAbstractMachineTypes().clear();
				getAbstractMachineTypes().addAll((Collection)newValue);
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_TOOL_TYPES:
				getAbstractToolTypes().clear();
				getAbstractToolTypes().addAll((Collection)newValue);
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_ROLES:
				getAbstractRoles().clear();
				getAbstractRoles().addAll((Collection)newValue);
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection)newValue);
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__LOCATION_TYPES:
				getLocationTypes().clear();
				getLocationTypes().addAll((Collection)newValue);
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__MACHINE_TYPES:
				getMachineTypes().clear();
				getMachineTypes().addAll((Collection)newValue);
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__TOOL_TYPES:
				getToolTypes().clear();
				getToolTypes().addAll((Collection)newValue);
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
			case ResourcepackagePackage.EMR_DIAGRAM__EMP_DIAGRAMS:
				getEmpDiagrams().clear();
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__EMO_DIAGRAM:
				setEmoDiagram((EMODiagram)null);
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__CLASSIFICATION_RELATIONS:
				getClassificationRelations().clear();
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_LOCATION_TYPES:
				getAbstractLocationTypes().clear();
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_MACHINE_TYPES:
				getAbstractMachineTypes().clear();
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_TOOL_TYPES:
				getAbstractToolTypes().clear();
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_ROLES:
				getAbstractRoles().clear();
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__ROLES:
				getRoles().clear();
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__LOCATION_TYPES:
				getLocationTypes().clear();
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__MACHINE_TYPES:
				getMachineTypes().clear();
				return;
			case ResourcepackagePackage.EMR_DIAGRAM__TOOL_TYPES:
				getToolTypes().clear();
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
			case ResourcepackagePackage.EMR_DIAGRAM__EMP_DIAGRAMS:
				return empDiagrams != null && !empDiagrams.isEmpty();
			case ResourcepackagePackage.EMR_DIAGRAM__EMO_DIAGRAM:
				return emoDiagram != null;
			case ResourcepackagePackage.EMR_DIAGRAM__CLASSIFICATION_RELATIONS:
				return classificationRelations != null && !classificationRelations.isEmpty();
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_LOCATION_TYPES:
				return abstractLocationTypes != null && !abstractLocationTypes.isEmpty();
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_MACHINE_TYPES:
				return abstractMachineTypes != null && !abstractMachineTypes.isEmpty();
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_TOOL_TYPES:
				return abstractToolTypes != null && !abstractToolTypes.isEmpty();
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_ROLES:
				return abstractRoles != null && !abstractRoles.isEmpty();
			case ResourcepackagePackage.EMR_DIAGRAM__ROLES:
				return roles != null && !roles.isEmpty();
			case ResourcepackagePackage.EMR_DIAGRAM__LOCATION_TYPES:
				return locationTypes != null && !locationTypes.isEmpty();
			case ResourcepackagePackage.EMR_DIAGRAM__MACHINE_TYPES:
				return machineTypes != null && !machineTypes.isEmpty();
			case ResourcepackagePackage.EMR_DIAGRAM__TOOL_TYPES:
				return toolTypes != null && !toolTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EMRDiagramImpl
