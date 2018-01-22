/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.collaborationpackage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import vpml.EMDiagram;
import vpml.EMObject;

import vpml.collaborationpackage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see vpml.collaborationpackage.CollaborationpackagePackage
 * @generated
 */
public class CollaborationpackageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CollaborationpackagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationpackageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CollaborationpackagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationpackageSwitch modelSwitch =
		new CollaborationpackageSwitch() {
			public Object caseEMCLogicalConnector(EMCLogicalConnector object) {
				return createEMCLogicalConnectorAdapter();
			}
			public Object caseEMCAnd(EMCAnd object) {
				return createEMCAndAdapter();
			}
			public Object caseEMCOR(EMCOR object) {
				return createEMCORAdapter();
			}
			public Object caseEMCCollaborationGroup(EMCCollaborationGroup object) {
				return createEMCCollaborationGroupAdapter();
			}
			public Object caseEMCDiagram(EMCDiagram object) {
				return createEMCDiagramAdapter();
			}
			public Object caseEMCRelation(EMCRelation object) {
				return createEMCRelationAdapter();
			}
			public Object caseEMCCollaborationRelation(EMCCollaborationRelation object) {
				return createEMCCollaborationRelationAdapter();
			}
			public Object caseEMCSequenceRelation(EMCSequenceRelation object) {
				return createEMCSequenceRelationAdapter();
			}
			public Object caseEMObject(EMObject object) {
				return createEMObjectAdapter();
			}
			public Object caseEMDiagram(EMDiagram object) {
				return createEMDiagramAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link vpml.collaborationpackage.EMCLogicalConnector <em>EMC Logical Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.collaborationpackage.EMCLogicalConnector
	 * @generated
	 */
	public Adapter createEMCLogicalConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.collaborationpackage.EMCAnd <em>EMC And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.collaborationpackage.EMCAnd
	 * @generated
	 */
	public Adapter createEMCAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.collaborationpackage.EMCOR <em>EMCOR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.collaborationpackage.EMCOR
	 * @generated
	 */
	public Adapter createEMCORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.collaborationpackage.EMCCollaborationGroup <em>EMC Collaboration Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.collaborationpackage.EMCCollaborationGroup
	 * @generated
	 */
	public Adapter createEMCCollaborationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.collaborationpackage.EMCDiagram <em>EMC Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.collaborationpackage.EMCDiagram
	 * @generated
	 */
	public Adapter createEMCDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.collaborationpackage.EMCRelation <em>EMC Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.collaborationpackage.EMCRelation
	 * @generated
	 */
	public Adapter createEMCRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.collaborationpackage.EMCCollaborationRelation <em>EMC Collaboration Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.collaborationpackage.EMCCollaborationRelation
	 * @generated
	 */
	public Adapter createEMCCollaborationRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.collaborationpackage.EMCSequenceRelation <em>EMC Sequence Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.collaborationpackage.EMCSequenceRelation
	 * @generated
	 */
	public Adapter createEMCSequenceRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.EMObject <em>EM Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.EMObject
	 * @generated
	 */
	public Adapter createEMObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.EMDiagram <em>EM Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.EMDiagram
	 * @generated
	 */
	public Adapter createEMDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CollaborationpackageAdapterFactory