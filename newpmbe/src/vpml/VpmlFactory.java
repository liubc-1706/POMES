/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vpml.VpmlPackage
 * @generated
 */
public interface VpmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VpmlFactory eINSTANCE = vpml.impl.VpmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EM Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EM Object</em>'.
	 * @generated
	 */
	EMObject createEMObject();

	/**
	 * Returns a new object of class '<em>EM Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EM Model</em>'.
	 * @generated
	 */
	EMModel createEMModel();

	/**
	 * Returns a new object of class '<em>EM Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EM Diagram</em>'.
	 * @generated
	 */
	EMDiagram createEMDiagram();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VpmlPackage getVpmlPackage();

} //VpmlFactory
