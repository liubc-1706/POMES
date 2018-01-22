/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.organizationpackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vpml.organizationpackage.OrganizationpackagePackage
 * @generated
 */
public interface OrganizationpackageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrganizationpackageFactory eINSTANCE = vpml.organizationpackage.impl.OrganizationpackageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EMO Resource Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMO Resource Group Type</em>'.
	 * @generated
	 */
	EMOResourceGroupType createEMOResourceGroupType();

	/**
	 * Returns a new object of class '<em>EMO Relations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMO Relations</em>'.
	 * @generated
	 */
	EMORelations createEMORelations();

	/**
	 * Returns a new object of class '<em>EMO Association Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMO Association Relation</em>'.
	 * @generated
	 */
	EMOAssociationRelation createEMOAssociationRelation();

	/**
	 * Returns a new object of class '<em>EMO Compose Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMO Compose Relation</em>'.
	 * @generated
	 */
	EMOComposeRelation createEMOComposeRelation();

	/**
	 * Returns a new object of class '<em>EMO Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMO Diagram</em>'.
	 * @generated
	 */
	EMODiagram createEMODiagram();

	/**
	 * Returns a new object of class '<em>EMO Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMO Object</em>'.
	 * @generated
	 */
	EMOObject createEMOObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OrganizationpackagePackage getOrganizationpackagePackage();

} //OrganizationpackageFactory
