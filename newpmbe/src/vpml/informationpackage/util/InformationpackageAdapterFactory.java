/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.informationpackage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import vpml.EMObject;

import vpml.informationpackage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see vpml.informationpackage.InformationpackagePackage
 * @generated
 */
public class InformationpackageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InformationpackagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationpackageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InformationpackagePackage.eINSTANCE;
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
	protected InformationpackageSwitch modelSwitch =
		new InformationpackageSwitch() {
			public Object caseEMIComplexItem(EMIComplexItem object) {
				return createEMIComplexItemAdapter();
			}
			public Object caseEMIForm(EMIForm object) {
				return createEMIFormAdapter();
			}
			public Object caseEMIEnum(EMIEnum object) {
				return createEMIEnumAdapter();
			}
			public Object caseEMIEnumLiteral(EMIEnumLiteral object) {
				return createEMIEnumLiteralAdapter();
			}
			public Object caseEMISimpleAttribute(EMISimpleAttribute object) {
				return createEMISimpleAttributeAdapter();
			}
			public Object caseEMIList(EMIList object) {
				return createEMIListAdapter();
			}
			public Object caseEMIStatAttribute(EMIStatAttribute object) {
				return createEMIStatAttributeAdapter();
			}
			public Object caseEMIComplexAttribute(EMIComplexAttribute object) {
				return createEMIComplexAttributeAdapter();
			}
			public Object caseEMIAttribute(EMIAttribute object) {
				return createEMIAttributeAdapter();
			}
			public Object caseEMObject(EMObject object) {
				return createEMObjectAdapter();
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
	 * Creates a new adapter for an object of class '{@link vpml.informationpackage.EMIComplexItem <em>EMI Complex Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.informationpackage.EMIComplexItem
	 * @generated
	 */
	public Adapter createEMIComplexItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.informationpackage.EMIForm <em>EMI Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.informationpackage.EMIForm
	 * @generated
	 */
	public Adapter createEMIFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.informationpackage.EMIEnum <em>EMI Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.informationpackage.EMIEnum
	 * @generated
	 */
	public Adapter createEMIEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.informationpackage.EMIEnumLiteral <em>EMI Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.informationpackage.EMIEnumLiteral
	 * @generated
	 */
	public Adapter createEMIEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.informationpackage.EMISimpleAttribute <em>EMI Simple Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.informationpackage.EMISimpleAttribute
	 * @generated
	 */
	public Adapter createEMISimpleAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.informationpackage.EMIList <em>EMI List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.informationpackage.EMIList
	 * @generated
	 */
	public Adapter createEMIListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.informationpackage.EMIStatAttribute <em>EMI Stat Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.informationpackage.EMIStatAttribute
	 * @generated
	 */
	public Adapter createEMIStatAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.informationpackage.EMIComplexAttribute <em>EMI Complex Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.informationpackage.EMIComplexAttribute
	 * @generated
	 */
	public Adapter createEMIComplexAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vpml.informationpackage.EMIAttribute <em>EMI Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vpml.informationpackage.EMIAttribute
	 * @generated
	 */
	public Adapter createEMIAttributeAdapter() {
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

} //InformationpackageAdapterFactory
