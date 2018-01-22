/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.utilpackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see vpml.utilpackage.UtilpackageFactory
 * @model kind="package"
 * @generated
 */
public interface UtilpackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "utilpackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///vpml/utilpackage.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vpml.utilpackage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilpackagePackage eINSTANCE = vpml.utilpackage.impl.UtilpackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link vpml.utilpackage.impl.DSDistributionImpl <em>DS Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.utilpackage.impl.DSDistributionImpl
	 * @see vpml.utilpackage.impl.UtilpackagePackageImpl#getDSDistribution()
	 * @generated
	 */
	int DS_DISTRIBUTION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_DISTRIBUTION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>DArgument1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_DISTRIBUTION__DARGUMENT1 = 1;

	/**
	 * The feature id for the '<em><b>DArgument2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_DISTRIBUTION__DARGUMENT2 = 2;

	/**
	 * The number of structural features of the '<em>DS Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_DISTRIBUTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link vpml.utilpackage.EnumTimeUnit <em>Enum Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.utilpackage.EnumTimeUnit
	 * @see vpml.utilpackage.impl.UtilpackagePackageImpl#getEnumTimeUnit()
	 * @generated
	 */
	int ENUM_TIME_UNIT = 1;

	/**
	 * The meta object id for the '{@link vpml.utilpackage.EnumDistribution <em>Enum Distribution</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.utilpackage.EnumDistribution
	 * @see vpml.utilpackage.impl.UtilpackagePackageImpl#getEnumDistribution()
	 * @generated
	 */
	int ENUM_DISTRIBUTION = 2;

	/**
	 * The meta object id for the '{@link vpml.utilpackage.Sex <em>Sex</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.utilpackage.Sex
	 * @see vpml.utilpackage.impl.UtilpackagePackageImpl#getSex()
	 * @generated
	 */
	int SEX = 3;

	/**
	 * The meta object id for the '{@link vpml.utilpackage.EnumIOType <em>Enum IO Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.utilpackage.EnumIOType
	 * @see vpml.utilpackage.impl.UtilpackagePackageImpl#getEnumIOType()
	 * @generated
	 */
	int ENUM_IO_TYPE = 4;

	/**
	 * The meta object id for the '{@link vpml.utilpackage.EnumBatchType <em>Enum Batch Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vpml.utilpackage.EnumBatchType
	 * @see vpml.utilpackage.impl.UtilpackagePackageImpl#getEnumBatchType()
	 * @generated
	 */
	int ENUM_BATCH_TYPE = 5;

	/**
	 * The meta object id for the '<em>Java List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see vpml.utilpackage.impl.UtilpackagePackageImpl#getJavaList()
	 * @generated
	 */
	int JAVA_LIST = 6;

	/**
	 * The meta object id for the '<em>Java Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see vpml.utilpackage.impl.UtilpackagePackageImpl#getJavaDate()
	 * @generated
	 */
	int JAVA_DATE = 7;


	/**
	 * Returns the meta object for class '{@link vpml.utilpackage.DSDistribution <em>DS Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Distribution</em>'.
	 * @see vpml.utilpackage.DSDistribution
	 * @generated
	 */
	EClass getDSDistribution();

	/**
	 * Returns the meta object for the attribute '{@link vpml.utilpackage.DSDistribution#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see vpml.utilpackage.DSDistribution#getType()
	 * @see #getDSDistribution()
	 * @generated
	 */
	EAttribute getDSDistribution_Type();

	/**
	 * Returns the meta object for the attribute '{@link vpml.utilpackage.DSDistribution#getDArgument1 <em>DArgument1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DArgument1</em>'.
	 * @see vpml.utilpackage.DSDistribution#getDArgument1()
	 * @see #getDSDistribution()
	 * @generated
	 */
	EAttribute getDSDistribution_DArgument1();

	/**
	 * Returns the meta object for the attribute '{@link vpml.utilpackage.DSDistribution#getDArgument2 <em>DArgument2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DArgument2</em>'.
	 * @see vpml.utilpackage.DSDistribution#getDArgument2()
	 * @see #getDSDistribution()
	 * @generated
	 */
	EAttribute getDSDistribution_DArgument2();

	/**
	 * Returns the meta object for enum '{@link vpml.utilpackage.EnumTimeUnit <em>Enum Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Time Unit</em>'.
	 * @see vpml.utilpackage.EnumTimeUnit
	 * @generated
	 */
	EEnum getEnumTimeUnit();

	/**
	 * Returns the meta object for enum '{@link vpml.utilpackage.EnumDistribution <em>Enum Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Distribution</em>'.
	 * @see vpml.utilpackage.EnumDistribution
	 * @generated
	 */
	EEnum getEnumDistribution();

	/**
	 * Returns the meta object for enum '{@link vpml.utilpackage.Sex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sex</em>'.
	 * @see vpml.utilpackage.Sex
	 * @generated
	 */
	EEnum getSex();

	/**
	 * Returns the meta object for enum '{@link vpml.utilpackage.EnumIOType <em>Enum IO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum IO Type</em>'.
	 * @see vpml.utilpackage.EnumIOType
	 * @generated
	 */
	EEnum getEnumIOType();

	/**
	 * Returns the meta object for enum '{@link vpml.utilpackage.EnumBatchType <em>Enum Batch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Batch Type</em>'.
	 * @see vpml.utilpackage.EnumBatchType
	 * @generated
	 */
	EEnum getEnumBatchType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Java List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 * @generated
	 */
	EDataType getJavaList();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Java Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getJavaDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilpackageFactory getUtilpackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link vpml.utilpackage.impl.DSDistributionImpl <em>DS Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.utilpackage.impl.DSDistributionImpl
		 * @see vpml.utilpackage.impl.UtilpackagePackageImpl#getDSDistribution()
		 * @generated
		 */
		EClass DS_DISTRIBUTION = eINSTANCE.getDSDistribution();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS_DISTRIBUTION__TYPE = eINSTANCE.getDSDistribution_Type();

		/**
		 * The meta object literal for the '<em><b>DArgument1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS_DISTRIBUTION__DARGUMENT1 = eINSTANCE.getDSDistribution_DArgument1();

		/**
		 * The meta object literal for the '<em><b>DArgument2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS_DISTRIBUTION__DARGUMENT2 = eINSTANCE.getDSDistribution_DArgument2();

		/**
		 * The meta object literal for the '{@link vpml.utilpackage.EnumTimeUnit <em>Enum Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.utilpackage.EnumTimeUnit
		 * @see vpml.utilpackage.impl.UtilpackagePackageImpl#getEnumTimeUnit()
		 * @generated
		 */
		EEnum ENUM_TIME_UNIT = eINSTANCE.getEnumTimeUnit();

		/**
		 * The meta object literal for the '{@link vpml.utilpackage.EnumDistribution <em>Enum Distribution</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.utilpackage.EnumDistribution
		 * @see vpml.utilpackage.impl.UtilpackagePackageImpl#getEnumDistribution()
		 * @generated
		 */
		EEnum ENUM_DISTRIBUTION = eINSTANCE.getEnumDistribution();

		/**
		 * The meta object literal for the '{@link vpml.utilpackage.Sex <em>Sex</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.utilpackage.Sex
		 * @see vpml.utilpackage.impl.UtilpackagePackageImpl#getSex()
		 * @generated
		 */
		EEnum SEX = eINSTANCE.getSex();

		/**
		 * The meta object literal for the '{@link vpml.utilpackage.EnumIOType <em>Enum IO Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.utilpackage.EnumIOType
		 * @see vpml.utilpackage.impl.UtilpackagePackageImpl#getEnumIOType()
		 * @generated
		 */
		EEnum ENUM_IO_TYPE = eINSTANCE.getEnumIOType();

		/**
		 * The meta object literal for the '{@link vpml.utilpackage.EnumBatchType <em>Enum Batch Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vpml.utilpackage.EnumBatchType
		 * @see vpml.utilpackage.impl.UtilpackagePackageImpl#getEnumBatchType()
		 * @generated
		 */
		EEnum ENUM_BATCH_TYPE = eINSTANCE.getEnumBatchType();

		/**
		 * The meta object literal for the '<em>Java List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see vpml.utilpackage.impl.UtilpackagePackageImpl#getJavaList()
		 * @generated
		 */
		EDataType JAVA_LIST = eINSTANCE.getJavaList();

		/**
		 * The meta object literal for the '<em>Java Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see vpml.utilpackage.impl.UtilpackagePackageImpl#getJavaDate()
		 * @generated
		 */
		EDataType JAVA_DATE = eINSTANCE.getJavaDate();

	}

} //UtilpackagePackage
