/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.utilpackage.impl;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vpml.utilpackage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilpackageFactoryImpl extends EFactoryImpl implements UtilpackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UtilpackageFactory init() {
		try {
			UtilpackageFactory theUtilpackageFactory = (UtilpackageFactory)EPackage.Registry.INSTANCE.getEFactory("http:///vpml/utilpackage.ecore"); 
			if (theUtilpackageFactory != null) {
				return theUtilpackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UtilpackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilpackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UtilpackagePackage.DS_DISTRIBUTION: return createDSDistribution();
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
			case UtilpackagePackage.ENUM_TIME_UNIT:
				return createEnumTimeUnitFromString(eDataType, initialValue);
			case UtilpackagePackage.ENUM_DISTRIBUTION:
				return createEnumDistributionFromString(eDataType, initialValue);
			case UtilpackagePackage.SEX:
				return createSexFromString(eDataType, initialValue);
			case UtilpackagePackage.ENUM_IO_TYPE:
				return createEnumIOTypeFromString(eDataType, initialValue);
			case UtilpackagePackage.ENUM_BATCH_TYPE:
				return createEnumBatchTypeFromString(eDataType, initialValue);
			case UtilpackagePackage.JAVA_LIST:
				return createJavaListFromString(eDataType, initialValue);
			case UtilpackagePackage.JAVA_DATE:
				return createJavaDateFromString(eDataType, initialValue);
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
			case UtilpackagePackage.ENUM_TIME_UNIT:
				return convertEnumTimeUnitToString(eDataType, instanceValue);
			case UtilpackagePackage.ENUM_DISTRIBUTION:
				return convertEnumDistributionToString(eDataType, instanceValue);
			case UtilpackagePackage.SEX:
				return convertSexToString(eDataType, instanceValue);
			case UtilpackagePackage.ENUM_IO_TYPE:
				return convertEnumIOTypeToString(eDataType, instanceValue);
			case UtilpackagePackage.ENUM_BATCH_TYPE:
				return convertEnumBatchTypeToString(eDataType, instanceValue);
			case UtilpackagePackage.JAVA_LIST:
				return convertJavaListToString(eDataType, instanceValue);
			case UtilpackagePackage.JAVA_DATE:
				return convertJavaDateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSDistribution createDSDistribution() {
		DSDistributionImpl dsDistribution = new DSDistributionImpl();
		return dsDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTimeUnit createEnumTimeUnitFromString(EDataType eDataType, String initialValue) {
		EnumTimeUnit result = EnumTimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDistribution createEnumDistributionFromString(EDataType eDataType, String initialValue) {
		EnumDistribution result = EnumDistribution.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumDistributionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sex createSexFromString(EDataType eDataType, String initialValue) {
		Sex result = Sex.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSexToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIOType createEnumIOTypeFromString(EDataType eDataType, String initialValue) {
		EnumIOType result = EnumIOType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumIOTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumBatchType createEnumBatchTypeFromString(EDataType eDataType, String initialValue) {
		EnumBatchType result = EnumBatchType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumBatchTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createJavaListFromString(EDataType eDataType, String initialValue) {
		return (List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createJavaDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilpackagePackage getUtilpackagePackage() {
		return (UtilpackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static UtilpackagePackage getPackage() {
		return UtilpackagePackage.eINSTANCE;
	}

} //UtilpackageFactoryImpl
