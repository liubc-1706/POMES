/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.informationpackage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vpml.informationpackage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InformationpackageFactoryImpl extends EFactoryImpl implements InformationpackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InformationpackageFactory init() {
		try {
			InformationpackageFactory theInformationpackageFactory = (InformationpackageFactory)EPackage.Registry.INSTANCE.getEFactory("http:///vpml/informationpackage.ecore"); 
			if (theInformationpackageFactory != null) {
				return theInformationpackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InformationpackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationpackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InformationpackagePackage.EMI_COMPLEX_ITEM: return createEMIComplexItem();
			case InformationpackagePackage.EMI_FORM: return createEMIForm();
			case InformationpackagePackage.EMI_ENUM: return createEMIEnum();
			case InformationpackagePackage.EMI_ENUM_LITERAL: return createEMIEnumLiteral();
			case InformationpackagePackage.EMI_SIMPLE_ATTRIBUTE: return createEMISimpleAttribute();
			case InformationpackagePackage.EMI_LIST: return createEMIList();
			case InformationpackagePackage.EMI_STAT_ATTRIBUTE: return createEMIStatAttribute();
			case InformationpackagePackage.EMI_COMPLEX_ATTRIBUTE: return createEMIComplexAttribute();
			case InformationpackagePackage.EMI_ATTRIBUTE: return createEMIAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InformationpackagePackage.EMI_SIMPLE_TYPE:
				return createEMISimpleTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InformationpackagePackage.EMI_SIMPLE_TYPE:
				return convertEMISimpleTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIComplexItem createEMIComplexItem() {
		EMIComplexItemImpl emiComplexItem = new EMIComplexItemImpl();
		return emiComplexItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIForm createEMIForm() {
		EMIFormImpl emiForm = new EMIFormImpl();
		return emiForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIEnum createEMIEnum() {
		EMIEnumImpl emiEnum = new EMIEnumImpl();
		return emiEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIEnumLiteral createEMIEnumLiteral() {
		EMIEnumLiteralImpl emiEnumLiteral = new EMIEnumLiteralImpl();
		return emiEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMISimpleAttribute createEMISimpleAttribute() {
		EMISimpleAttributeImpl emiSimpleAttribute = new EMISimpleAttributeImpl();
		return emiSimpleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIList createEMIList() {
		EMIListImpl emiList = new EMIListImpl();
		return emiList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIStatAttribute createEMIStatAttribute() {
		EMIStatAttributeImpl emiStatAttribute = new EMIStatAttributeImpl();
		return emiStatAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIComplexAttribute createEMIComplexAttribute() {
		EMIComplexAttributeImpl emiComplexAttribute = new EMIComplexAttributeImpl();
		return emiComplexAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMIAttribute createEMIAttribute() {
		EMIAttributeImpl emiAttribute = new EMIAttributeImpl();
		return emiAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMISimpleType createEMISimpleTypeFromString(EDataType eDataType, String initialValue) {
		EMISimpleType result = EMISimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEMISimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationpackagePackage getInformationpackagePackage() {
		return (InformationpackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static InformationpackagePackage getPackage() {
		return InformationpackagePackage.eINSTANCE;
	}

} //InformationpackageFactoryImpl
