/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.utilpackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vpml.utilpackage.UtilpackagePackage
 * @generated
 */
public interface UtilpackageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilpackageFactory eINSTANCE = vpml.utilpackage.impl.UtilpackageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DS Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DS Distribution</em>'.
	 * @generated
	 */
	DSDistribution createDSDistribution();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UtilpackagePackage getUtilpackagePackage();

} //UtilpackageFactory
