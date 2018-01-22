/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import vpml.EMDiagram;
import vpml.EMObject;

import vpml.resourcepackage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see vpml.resourcepackage.ResourcepackagePackage
 * @generated
 */
public class ResourcepackageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResourcepackagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcepackageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ResourcepackagePackage.eINSTANCE;
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
	protected ResourcepackageSwitch modelSwitch =
		new ResourcepackageSwitch() {
			public Object caseEMRResourceType(EMRResourceType object) {
				return createEMRResourceTypeAdapter();
			}
			public Object caseEMRBasicResourceType(EMRBasicResourceType object) {
				return createEMRBasicResourceTypeAdapter();
			}
			public Object caseEMRClassificationRelation(EMRClassificationRelation object) {
				return createEMRClassificationRelationAdapter();
			}
			public Object caseEMRAbstractResourceType(EMRAbstractResourceType object) {
				return createEMRAbstractResourceTypeAdapter();
			}
			public Object caseEMRAbstractRole(EMRAbstractRole object) {
				return createEMRAbstractRoleAdapter();
			}
			public Object caseEMRAbstractToolType(EMRAbstractToolType object) {
				return createEMRAbstractToolTypeAdapter();
			}
			public Object caseEMRAbstractMachineType(EMRAbstractMachineType object) {
				return createEMRAbstractMachineTypeAdapter();
			}
			public Object caseEMRAbstractLocationType(EMRAbstractLocationType object) {
				return createEMRAbstractLocationTypeAdapter();
			}
			public Object caseEMRToolType(EMRToolType object) {
				return createEMRToolTypeAdapter();
			}
			public Object caseEMRMachineType(EMRMachineType object) {
				return createEMRMachineTypeAdapter();
			}
			public Object caseEMRLocationType(EMRLocationType object) {
				return createEMRLocationTypeAdapter();
			}
			public Object caseEMRRole(EMRRole object) {
				return createEMRRoleAdapter();
			}
			public Object caseEMRDiagram(EMRDiagram object) {
				return createEMRDiagramAdapter();
			}
			public Object caseEMRObject(EMRObject object) {
				return createEMRObjectAdapter();
			}
			public Object caseEMRRelation(EMRRelation object) {
				return createEMRRelationAdapter();
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
	 * Creates a new adapter for an object of class '{@link vpml.resourcepackage.EMRResourceType <em>EMR Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.resourcepackage.EMRResourceType
	 * @generated
	 */
	public Adapter createEMRResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.resourcepackage.EMRBasicResourceType <em>EMR Basic Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.resourcepackage.EMRBasicResourceType
	 * @generated
	 */
	public Adapter createEMRBasicResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.resourcepackage.EMRClassificationRelation <em>EMR Classification Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.resourcepackage.EMRClassificationRelation
	 * @generated
	 */
	public Adapter createEMRClassificationRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.resourcepackage.EMRAbstractResourceType <em>EMR Abstract Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.resourcepackage.EMRAbstractResourceType
	 * @generated
	 */
	public Adapter createEMRAbstractResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.resourcepackage.EMRAbstractRole <em>EMR Abstract Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.resourcepackage.EMRAbstractRole
	 * @generated
	 */
	public Adapter createEMRAbstractRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.resourcepackage.EMRAbstractToolType <em>EMR Abstract Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.resourcepackage.EMRAbstractToolType
	 * @generated
	 */
	public Adapter createEMRAbstractToolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.resourcepackage.EMRAbstractMachineType <em>EMR Abstract Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.resourcepackage.EMRAbstractMachineType
	 * @generated
	 */
	public Adapter createEMRAbstractMachineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.resourcepackage.EMRAbstractLocationType <em>EMR Abstract Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.resourcepackage.EMRAbstractLocationType
	 * @generated
	 */
	public Adapter createEMRAbstractLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.resourcepackage.EMRToolType <em>EMR Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.resourcepackage.EMRToolType
	 * @generated
	 */
	public Adapter createEMRToolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.resourcepackage.EMRMachineType <em>EMR Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.resourcepackage.EMRMachineType
	 * @generated
	 */
	public Adapter createEMRMachineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.resourcepackage.EMRLocationType <em>EMR Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.resourcepackage.EMRLocationType
	 * @generated
	 */
	public Adapter createEMRLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.resourcepackage.EMRRole <em>EMR Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.resourcepackage.EMRRole
	 * @generated
	 */
	public Adapter createEMRRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.resourcepackage.EMRDiagram <em>EMR Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.resourcepackage.EMRDiagram
	 * @generated
	 */
	public Adapter createEMRDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.resourcepackage.EMRObject <em>EMR Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.resourcepackage.EMRObject
	 * @generated
	 */
	public Adapter createEMRObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.resourcepackage.EMRRelation <em>EMR Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.resourcepackage.EMRRelation
	 * @generated
	 */
	public Adapter createEMRRelationAdapter() {
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

} //ResourcepackageAdapterFactory
