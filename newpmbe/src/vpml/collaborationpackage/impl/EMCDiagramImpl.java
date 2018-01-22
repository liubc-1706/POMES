/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.collaborationpackage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vpml.collaborationpackage.CollaborationpackagePackage;
import vpml.collaborationpackage.EMCAnd;
import vpml.collaborationpackage.EMCCollaborationGroup;
import vpml.collaborationpackage.EMCCollaborationRelation;
import vpml.collaborationpackage.EMCDiagram;
import vpml.collaborationpackage.EMCOR;
import vpml.collaborationpackage.EMCSequenceRelation;

import vpml.impl.EMDiagramImpl;

import vpml.organizationpackage.EMOResourceGroupType;
import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.processpackage.EMPDiagram;
import vpml.processpackage.ProcesspackagePackage;

import vpml.resourcepackage.EMRLocationType;
import vpml.resourcepackage.EMRMachineType;
import vpml.resourcepackage.EMRRole;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMC Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.collaborationpackage.impl.EMCDiagramImpl#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.collaborationpackage.impl.EMCDiagramImpl#getAssociatePrModel <em>Associate Pr Model</em>}</li>
 *   <li>{@link vpml.collaborationpackage.impl.EMCDiagramImpl#getColAnd <em>Col And</em>}</li>
 *   <li>{@link vpml.collaborationpackage.impl.EMCDiagramImpl#getColOR <em>Col OR</em>}</li>
 *   <li>{@link vpml.collaborationpackage.impl.EMCDiagramImpl#getColRole <em>Col Role</em>}</li>
 *   <li>{@link vpml.collaborationpackage.impl.EMCDiagramImpl#getColLocation <em>Col Location</em>}</li>
 *   <li>{@link vpml.collaborationpackage.impl.EMCDiagramImpl#getColMachine <em>Col Machine</em>}</li>
 *   <li>{@link vpml.collaborationpackage.impl.EMCDiagramImpl#getColEMOGroup <em>Col EMO Group</em>}</li>
 *   <li>{@link vpml.collaborationpackage.impl.EMCDiagramImpl#getColColGroup <em>Col Col Group</em>}</li>
 *   <li>{@link vpml.collaborationpackage.impl.EMCDiagramImpl#getColColRelation <em>Col Col Relation</em>}</li>
 *   <li>{@link vpml.collaborationpackage.impl.EMCDiagramImpl#getColSeqRelation <em>Col Seq Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMCDiagramImpl extends EMDiagramImpl implements EMCDiagram {
	/**
	 * The cached value of the '{@link #getEmpDiagram() <em>Emp Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpDiagram()
	 * @generated
	 * @ordered
	 */
	protected EMPDiagram empDiagram = null;

	/**
	 * The default value of the '{@link #getAssociatePrModel() <em>Associate Pr Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatePrModel()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATE_PR_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociatePrModel() <em>Associate Pr Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatePrModel()
	 * @generated
	 * @ordered
	 */
	protected String associatePrModel = ASSOCIATE_PR_MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColAnd() <em>Col And</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColAnd()
	 * @generated
	 * @ordered
	 */
	protected EList colAnd = null;

	/**
	 * The cached value of the '{@link #getColOR() <em>Col OR</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColOR()
	 * @generated
	 * @ordered
	 */
	protected EList colOR = null;

	/**
	 * The cached value of the '{@link #getColRole() <em>Col Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColRole()
	 * @generated
	 * @ordered
	 */
	protected EList colRole = null;

	/**
	 * The cached value of the '{@link #getColLocation() <em>Col Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColLocation()
	 * @generated
	 * @ordered
	 */
	protected EList colLocation = null;

	/**
	 * The cached value of the '{@link #getColMachine() <em>Col Machine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColMachine()
	 * @generated
	 * @ordered
	 */
	protected EList colMachine = null;

	/**
	 * The cached value of the '{@link #getColEMOGroup() <em>Col EMO Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColEMOGroup()
	 * @generated
	 * @ordered
	 */
	protected EList colEMOGroup = null;

	/**
	 * The cached value of the '{@link #getColColGroup() <em>Col Col Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColColGroup()
	 * @generated
	 * @ordered
	 */
	protected EList colColGroup = null;

	/**
	 * The cached value of the '{@link #getColColRelation() <em>Col Col Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColColRelation()
	 * @generated
	 * @ordered
	 */
	protected EList colColRelation = null;

	/**
	 * The cached value of the '{@link #getColSeqRelation() <em>Col Seq Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColSeqRelation()
	 * @generated
	 * @ordered
	 */
	protected EList colSeqRelation = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMCDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CollaborationpackagePackage.Literals.EMC_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPDiagram getEmpDiagram() {
		if (empDiagram != null && empDiagram.eIsProxy()) {
			InternalEObject oldEmpDiagram = (InternalEObject)empDiagram;
			empDiagram = (EMPDiagram)eResolveProxy(oldEmpDiagram);
			if (empDiagram != oldEmpDiagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollaborationpackagePackage.EMC_DIAGRAM__EMP_DIAGRAM, oldEmpDiagram, empDiagram));
			}
		}
		return empDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPDiagram basicGetEmpDiagram() {
		return empDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpDiagram(EMPDiagram newEmpDiagram, NotificationChain msgs) {
		EMPDiagram oldEmpDiagram = empDiagram;
		empDiagram = newEmpDiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollaborationpackagePackage.EMC_DIAGRAM__EMP_DIAGRAM, oldEmpDiagram, newEmpDiagram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpDiagram(EMPDiagram newEmpDiagram) {
		if (newEmpDiagram != empDiagram) {
			NotificationChain msgs = null;
			if (empDiagram != null)
				msgs = ((InternalEObject)empDiagram).eInverseRemove(this, ProcesspackagePackage.EMP_DIAGRAM__EMC_DIAGRAM, EMPDiagram.class, msgs);
			if (newEmpDiagram != null)
				msgs = ((InternalEObject)newEmpDiagram).eInverseAdd(this, ProcesspackagePackage.EMP_DIAGRAM__EMC_DIAGRAM, EMPDiagram.class, msgs);
			msgs = basicSetEmpDiagram(newEmpDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationpackagePackage.EMC_DIAGRAM__EMP_DIAGRAM, newEmpDiagram, newEmpDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociatePrModel() {
		return associatePrModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatePrModel(String newAssociatePrModel) {
		String oldAssociatePrModel = associatePrModel;
		associatePrModel = newAssociatePrModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationpackagePackage.EMC_DIAGRAM__ASSOCIATE_PR_MODEL, oldAssociatePrModel, associatePrModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getColAnd() {
		if (colAnd == null) {
			colAnd = new EObjectContainmentWithInverseEList(EMCAnd.class, this, CollaborationpackagePackage.EMC_DIAGRAM__COL_AND, CollaborationpackagePackage.EMC_AND__COL_AND_DIAGRAM);
		}
		return colAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getColOR() {
		if (colOR == null) {
			colOR = new EObjectContainmentWithInverseEList(EMCOR.class, this, CollaborationpackagePackage.EMC_DIAGRAM__COL_OR, CollaborationpackagePackage.EMCOR__COL_OR_DIAGRAM);
		}
		return colOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getColRole() {
		if (colRole == null) {
			colRole = new EObjectContainmentWithInverseEList(EMRRole.class, this, CollaborationpackagePackage.EMC_DIAGRAM__COL_ROLE, ResourcepackagePackage.EMR_ROLE__COL_ROLE_DIAGRAM);
		}
		return colRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getColLocation() {
		if (colLocation == null) {
			colLocation = new EObjectContainmentWithInverseEList(EMRLocationType.class, this, CollaborationpackagePackage.EMC_DIAGRAM__COL_LOCATION, ResourcepackagePackage.EMR_LOCATION_TYPE__COL_LOCATION_DIAGRAM);
		}
		return colLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getColMachine() {
		if (colMachine == null) {
			colMachine = new EObjectContainmentWithInverseEList(EMRMachineType.class, this, CollaborationpackagePackage.EMC_DIAGRAM__COL_MACHINE, ResourcepackagePackage.EMR_MACHINE_TYPE__COL_MACHINE_DIAGRAM);
		}
		return colMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getColEMOGroup() {
		if (colEMOGroup == null) {
			colEMOGroup = new EObjectContainmentWithInverseEList(EMOResourceGroupType.class, this, CollaborationpackagePackage.EMC_DIAGRAM__COL_EMO_GROUP, OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__COL_EMO_GROUP_DIAGRAM);
		}
		return colEMOGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getColColGroup() {
		if (colColGroup == null) {
			colColGroup = new EObjectContainmentWithInverseEList(EMCCollaborationGroup.class, this, CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_GROUP, CollaborationpackagePackage.EMC_COLLABORATION_GROUP__COL_COL_GROUP_DIAGRAM);
		}
		return colColGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getColColRelation() {
		if (colColRelation == null) {
			colColRelation = new EObjectContainmentWithInverseEList(EMCCollaborationRelation.class, this, CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_RELATION, CollaborationpackagePackage.EMC_COLLABORATION_RELATION__COL_COL_RELATION_DIAGRAM);
		}
		return colColRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getColSeqRelation() {
		if (colSeqRelation == null) {
			colSeqRelation = new EObjectContainmentWithInverseEList(EMCSequenceRelation.class, this, CollaborationpackagePackage.EMC_DIAGRAM__COL_SEQ_RELATION, CollaborationpackagePackage.EMC_SEQUENCE_RELATION__COL_SEQ_RELATION_DIAGRAM);
		}
		return colSeqRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborationpackagePackage.EMC_DIAGRAM__EMP_DIAGRAM:
				if (empDiagram != null)
					msgs = ((InternalEObject)empDiagram).eInverseRemove(this, ProcesspackagePackage.EMP_DIAGRAM__EMC_DIAGRAM, EMPDiagram.class, msgs);
				return basicSetEmpDiagram((EMPDiagram)otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_AND:
				return ((InternalEList)getColAnd()).basicAdd(otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_OR:
				return ((InternalEList)getColOR()).basicAdd(otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_ROLE:
				return ((InternalEList)getColRole()).basicAdd(otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_LOCATION:
				return ((InternalEList)getColLocation()).basicAdd(otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_MACHINE:
				return ((InternalEList)getColMachine()).basicAdd(otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_EMO_GROUP:
				return ((InternalEList)getColEMOGroup()).basicAdd(otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_GROUP:
				return ((InternalEList)getColColGroup()).basicAdd(otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_RELATION:
				return ((InternalEList)getColColRelation()).basicAdd(otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_SEQ_RELATION:
				return ((InternalEList)getColSeqRelation()).basicAdd(otherEnd, msgs);
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
			case CollaborationpackagePackage.EMC_DIAGRAM__EMP_DIAGRAM:
				return basicSetEmpDiagram(null, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_AND:
				return ((InternalEList)getColAnd()).basicRemove(otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_OR:
				return ((InternalEList)getColOR()).basicRemove(otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_ROLE:
				return ((InternalEList)getColRole()).basicRemove(otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_LOCATION:
				return ((InternalEList)getColLocation()).basicRemove(otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_MACHINE:
				return ((InternalEList)getColMachine()).basicRemove(otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_EMO_GROUP:
				return ((InternalEList)getColEMOGroup()).basicRemove(otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_GROUP:
				return ((InternalEList)getColColGroup()).basicRemove(otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_RELATION:
				return ((InternalEList)getColColRelation()).basicRemove(otherEnd, msgs);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_SEQ_RELATION:
				return ((InternalEList)getColSeqRelation()).basicRemove(otherEnd, msgs);
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
			case CollaborationpackagePackage.EMC_DIAGRAM__EMP_DIAGRAM:
				if (resolve) return getEmpDiagram();
				return basicGetEmpDiagram();
			case CollaborationpackagePackage.EMC_DIAGRAM__ASSOCIATE_PR_MODEL:
				return getAssociatePrModel();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_AND:
				return getColAnd();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_OR:
				return getColOR();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_ROLE:
				return getColRole();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_LOCATION:
				return getColLocation();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_MACHINE:
				return getColMachine();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_EMO_GROUP:
				return getColEMOGroup();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_GROUP:
				return getColColGroup();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_RELATION:
				return getColColRelation();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_SEQ_RELATION:
				return getColSeqRelation();
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
			case CollaborationpackagePackage.EMC_DIAGRAM__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)newValue);
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__ASSOCIATE_PR_MODEL:
				setAssociatePrModel((String)newValue);
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_AND:
				getColAnd().clear();
				getColAnd().addAll((Collection)newValue);
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_OR:
				getColOR().clear();
				getColOR().addAll((Collection)newValue);
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_ROLE:
				getColRole().clear();
				getColRole().addAll((Collection)newValue);
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_LOCATION:
				getColLocation().clear();
				getColLocation().addAll((Collection)newValue);
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_MACHINE:
				getColMachine().clear();
				getColMachine().addAll((Collection)newValue);
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_EMO_GROUP:
				getColEMOGroup().clear();
				getColEMOGroup().addAll((Collection)newValue);
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_GROUP:
				getColColGroup().clear();
				getColColGroup().addAll((Collection)newValue);
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_RELATION:
				getColColRelation().clear();
				getColColRelation().addAll((Collection)newValue);
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_SEQ_RELATION:
				getColSeqRelation().clear();
				getColSeqRelation().addAll((Collection)newValue);
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
			case CollaborationpackagePackage.EMC_DIAGRAM__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)null);
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__ASSOCIATE_PR_MODEL:
				setAssociatePrModel(ASSOCIATE_PR_MODEL_EDEFAULT);
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_AND:
				getColAnd().clear();
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_OR:
				getColOR().clear();
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_ROLE:
				getColRole().clear();
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_LOCATION:
				getColLocation().clear();
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_MACHINE:
				getColMachine().clear();
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_EMO_GROUP:
				getColEMOGroup().clear();
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_GROUP:
				getColColGroup().clear();
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_RELATION:
				getColColRelation().clear();
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_SEQ_RELATION:
				getColSeqRelation().clear();
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
			case CollaborationpackagePackage.EMC_DIAGRAM__EMP_DIAGRAM:
				return empDiagram != null;
			case CollaborationpackagePackage.EMC_DIAGRAM__ASSOCIATE_PR_MODEL:
				return ASSOCIATE_PR_MODEL_EDEFAULT == null ? associatePrModel != null : !ASSOCIATE_PR_MODEL_EDEFAULT.equals(associatePrModel);
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_AND:
				return colAnd != null && !colAnd.isEmpty();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_OR:
				return colOR != null && !colOR.isEmpty();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_ROLE:
				return colRole != null && !colRole.isEmpty();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_LOCATION:
				return colLocation != null && !colLocation.isEmpty();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_MACHINE:
				return colMachine != null && !colMachine.isEmpty();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_EMO_GROUP:
				return colEMOGroup != null && !colEMOGroup.isEmpty();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_GROUP:
				return colColGroup != null && !colColGroup.isEmpty();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_RELATION:
				return colColRelation != null && !colColRelation.isEmpty();
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_SEQ_RELATION:
				return colSeqRelation != null && !colSeqRelation.isEmpty();
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
		result.append(" (associatePrModel: ");
		result.append(associatePrModel);
		result.append(')');
		return result.toString();
	}

} //EMCDiagramImpl
