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

import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.ProcesspackagePackage;

import vpml.resourcepackage.EMRClassificationRelation;
import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.EMRToolType;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMR Tool Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.resourcepackage.impl.EMRToolTypeImpl#getEmrDiagram <em>Emr Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRToolTypeImpl#getClassificationRelation <em>Classification Relation</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRToolTypeImpl#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.impl.EMRToolTypeImpl#getAssFlows <em>Ass Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMRToolTypeImpl extends EMRBasicResourceTypeImpl implements EMRToolType {
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
	protected EMRToolTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ResourcepackagePackage.Literals.EMR_TOOL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMRDiagram getEmrDiagram() {
		if (eContainerFeatureID != ResourcepackagePackage.EMR_TOOL_TYPE__EMR_DIAGRAM) return null;
		return (EMRDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmrDiagram(EMRDiagram newEmrDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmrDiagram, ResourcepackagePackage.EMR_TOOL_TYPE__EMR_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmrDiagram(EMRDiagram newEmrDiagram) {
		if (newEmrDiagram != eInternalContainer() || (eContainerFeatureID != ResourcepackagePackage.EMR_TOOL_TYPE__EMR_DIAGRAM && newEmrDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmrDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmrDiagram != null)
				msgs = ((InternalEObject)newEmrDiagram).eInverseAdd(this, ResourcepackagePackage.EMR_DIAGRAM__TOOL_TYPES, EMRDiagram.class, msgs);
			msgs = basicSetEmrDiagram(newEmrDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_TOOL_TYPE__EMR_DIAGRAM, newEmrDiagram, newEmrDiagram));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcepackagePackage.EMR_TOOL_TYPE__CLASSIFICATION_RELATION, oldClassificationRelation, classificationRelation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_TOOL_TYPE__CLASSIFICATION_RELATION, oldClassificationRelation, newClassificationRelation);
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
				msgs = ((InternalEObject)classificationRelation).eInverseRemove(this, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TOOL_TYPE, EMRClassificationRelation.class, msgs);
			if (newClassificationRelation != null)
				msgs = ((InternalEObject)newClassificationRelation).eInverseAdd(this, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TOOL_TYPE, EMRClassificationRelation.class, msgs);
			msgs = basicSetClassificationRelation(newClassificationRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_TOOL_TYPE__CLASSIFICATION_RELATION, newClassificationRelation, newClassificationRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPDiagram getEmpDiagram() {
		if (eContainerFeatureID != ResourcepackagePackage.EMR_TOOL_TYPE__EMP_DIAGRAM) return null;
		return (EMPDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpDiagram(EMPDiagram newEmpDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmpDiagram, ResourcepackagePackage.EMR_TOOL_TYPE__EMP_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpDiagram(EMPDiagram newEmpDiagram) {
		if (newEmpDiagram != eInternalContainer() || (eContainerFeatureID != ResourcepackagePackage.EMR_TOOL_TYPE__EMP_DIAGRAM && newEmpDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmpDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmpDiagram != null)
				msgs = ((InternalEObject)newEmpDiagram).eInverseAdd(this, ProcesspackagePackage.EMP_DIAGRAM__TOOL_TYPES, EMPDiagram.class, msgs);
			msgs = basicSetEmpDiagram(newEmpDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcepackagePackage.EMR_TOOL_TYPE__EMP_DIAGRAM, newEmpDiagram, newEmpDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssFlows() {
		if (assFlows == null) {
			assFlows = new EObjectWithInverseResolvingEList(EMPAssFlow.class, this, ResourcepackagePackage.EMR_TOOL_TYPE__ASS_FLOWS, ProcesspackagePackage.EMP_ASS_FLOW__TOOL_TYPE);
		}
		return assFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcepackagePackage.EMR_TOOL_TYPE__EMR_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmrDiagram((EMRDiagram)otherEnd, msgs);
			case ResourcepackagePackage.EMR_TOOL_TYPE__CLASSIFICATION_RELATION:
				if (classificationRelation != null)
					msgs = ((InternalEObject)classificationRelation).eInverseRemove(this, ResourcepackagePackage.EMR_CLASSIFICATION_RELATION__TOOL_TYPE, EMRClassificationRelation.class, msgs);
				return basicSetClassificationRelation((EMRClassificationRelation)otherEnd, msgs);
			case ResourcepackagePackage.EMR_TOOL_TYPE__EMP_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmpDiagram((EMPDiagram)otherEnd, msgs);
			case ResourcepackagePackage.EMR_TOOL_TYPE__ASS_FLOWS:
				return ((InternalEList)getAssFlows()).basicAdd(otherEnd, msgs);
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
			case ResourcepackagePackage.EMR_TOOL_TYPE__EMR_DIAGRAM:
				return basicSetEmrDiagram(null, msgs);
			case ResourcepackagePackage.EMR_TOOL_TYPE__CLASSIFICATION_RELATION:
				return basicSetClassificationRelation(null, msgs);
			case ResourcepackagePackage.EMR_TOOL_TYPE__EMP_DIAGRAM:
				return basicSetEmpDiagram(null, msgs);
			case ResourcepackagePackage.EMR_TOOL_TYPE__ASS_FLOWS:
				return ((InternalEList)getAssFlows()).basicRemove(otherEnd, msgs);
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
			case ResourcepackagePackage.EMR_TOOL_TYPE__EMR_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ResourcepackagePackage.EMR_DIAGRAM__TOOL_TYPES, EMRDiagram.class, msgs);
			case ResourcepackagePackage.EMR_TOOL_TYPE__EMP_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ProcesspackagePackage.EMP_DIAGRAM__TOOL_TYPES, EMPDiagram.class, msgs);
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
			case ResourcepackagePackage.EMR_TOOL_TYPE__EMR_DIAGRAM:
				return getEmrDiagram();
			case ResourcepackagePackage.EMR_TOOL_TYPE__CLASSIFICATION_RELATION:
				if (resolve) return getClassificationRelation();
				return basicGetClassificationRelation();
			case ResourcepackagePackage.EMR_TOOL_TYPE__EMP_DIAGRAM:
				return getEmpDiagram();
			case ResourcepackagePackage.EMR_TOOL_TYPE__ASS_FLOWS:
				return getAssFlows();
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
			case ResourcepackagePackage.EMR_TOOL_TYPE__EMR_DIAGRAM:
				setEmrDiagram((EMRDiagram)newValue);
				return;
			case ResourcepackagePackage.EMR_TOOL_TYPE__CLASSIFICATION_RELATION:
				setClassificationRelation((EMRClassificationRelation)newValue);
				return;
			case ResourcepackagePackage.EMR_TOOL_TYPE__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)newValue);
				return;
			case ResourcepackagePackage.EMR_TOOL_TYPE__ASS_FLOWS:
				getAssFlows().clear();
				getAssFlows().addAll((Collection)newValue);
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
			case ResourcepackagePackage.EMR_TOOL_TYPE__EMR_DIAGRAM:
				setEmrDiagram((EMRDiagram)null);
				return;
			case ResourcepackagePackage.EMR_TOOL_TYPE__CLASSIFICATION_RELATION:
				setClassificationRelation((EMRClassificationRelation)null);
				return;
			case ResourcepackagePackage.EMR_TOOL_TYPE__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)null);
				return;
			case ResourcepackagePackage.EMR_TOOL_TYPE__ASS_FLOWS:
				getAssFlows().clear();
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
			case ResourcepackagePackage.EMR_TOOL_TYPE__EMR_DIAGRAM:
				return getEmrDiagram() != null;
			case ResourcepackagePackage.EMR_TOOL_TYPE__CLASSIFICATION_RELATION:
				return classificationRelation != null;
			case ResourcepackagePackage.EMR_TOOL_TYPE__EMP_DIAGRAM:
				return getEmpDiagram() != null;
			case ResourcepackagePackage.EMR_TOOL_TYPE__ASS_FLOWS:
				return assFlows != null && !assFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EMRToolTypeImpl
