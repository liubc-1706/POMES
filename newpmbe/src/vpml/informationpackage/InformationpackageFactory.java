/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.informationpackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vpml.informationpackage.InformationpackagePackage
 * @generated
 */
public interface InformationpackageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InformationpackageFactory eINSTANCE = vpml.informationpackage.impl.InformationpackageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EMI Complex Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Complex Item</em>'.
	 * @generated
	 */
	EMIComplexItem createEMIComplexItem();

	/**
	 * Returns a new object of class '<em>EMI Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Form</em>'.
	 * @generated
	 */
	EMIForm createEMIForm();

	/**
	 * Returns a new object of class '<em>EMI Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Enum</em>'.
	 * @generated
	 */
	EMIEnum createEMIEnum();

	/**
	 * Returns a new object of class '<em>EMI Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Enum Literal</em>'.
	 * @generated
	 */
	EMIEnumLiteral createEMIEnumLiteral();

	/**
	 * Returns a new object of class '<em>EMI Simple Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Simple Attribute</em>'.
	 * @generated
	 */
	EMISimpleAttribute createEMISimpleAttribute();

	/**
	 * Returns a new object of class '<em>EMI List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI List</em>'.
	 * @generated
	 */
	EMIList createEMIList();

	/**
	 * Returns a new object of class '<em>EMI Stat Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Stat Attribute</em>'.
	 * @generated
	 */
	EMIStatAttribute createEMIStatAttribute();

	/**
	 * Returns a new object of class '<em>EMI Complex Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Complex Attribute</em>'.
	 * @generated
	 */
	EMIComplexAttribute createEMIComplexAttribute();

	/**
	 * Returns a new object of class '<em>EMI Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Attribute</em>'.
	 * @generated
	 */
	EMIAttribute createEMIAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InformationpackagePackage getInformationpackagePackage();

} //InformationpackageFactory
