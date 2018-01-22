/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vpml.resourcepackage.ResourcepackagePackage
 * @generated
 */
public interface ResourcepackageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcepackageFactory eINSTANCE = vpml.resourcepackage.impl.ResourcepackageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EMR Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMR Resource Type</em>'.
	 * @generated
	 */
	EMRResourceType createEMRResourceType();

	/**
	 * Returns a new object of class '<em>EMR Basic Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMR Basic Resource Type</em>'.
	 * @generated
	 */
	EMRBasicResourceType createEMRBasicResourceType();

	/**
	 * Returns a new object of class '<em>EMR Classification Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMR Classification Relation</em>'.
	 * @generated
	 */
	EMRClassificationRelation createEMRClassificationRelation();

	/**
	 * Returns a new object of class '<em>EMR Abstract Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMR Abstract Resource Type</em>'.
	 * @generated
	 */
	EMRAbstractResourceType createEMRAbstractResourceType();

	/**
	 * Returns a new object of class '<em>EMR Abstract Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMR Abstract Role</em>'.
	 * @generated
	 */
	EMRAbstractRole createEMRAbstractRole();

	/**
	 * Returns a new object of class '<em>EMR Abstract Tool Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMR Abstract Tool Type</em>'.
	 * @generated
	 */
	EMRAbstractToolType createEMRAbstractToolType();

	/**
	 * Returns a new object of class '<em>EMR Abstract Machine Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMR Abstract Machine Type</em>'.
	 * @generated
	 */
	EMRAbstractMachineType createEMRAbstractMachineType();

	/**
	 * Returns a new object of class '<em>EMR Abstract Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMR Abstract Location Type</em>'.
	 * @generated
	 */
	EMRAbstractLocationType createEMRAbstractLocationType();

	/**
	 * Returns a new object of class '<em>EMR Tool Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMR Tool Type</em>'.
	 * @generated
	 */
	EMRToolType createEMRToolType();

	/**
	 * Returns a new object of class '<em>EMR Machine Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMR Machine Type</em>'.
	 * @generated
	 */
	EMRMachineType createEMRMachineType();

	/**
	 * Returns a new object of class '<em>EMR Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMR Location Type</em>'.
	 * @generated
	 */
	EMRLocationType createEMRLocationType();

	/**
	 * Returns a new object of class '<em>EMR Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMR Role</em>'.
	 * @generated
	 */
	EMRRole createEMRRole();

	/**
	 * Returns a new object of class '<em>EMR Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMR Diagram</em>'.
	 * @generated
	 */
	EMRDiagram createEMRDiagram();

	/**
	 * Returns a new object of class '<em>EMR Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMR Object</em>'.
	 * @generated
	 */
	EMRObject createEMRObject();

	/**
	 * Returns a new object of class '<em>EMR Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMR Relation</em>'.
	 * @generated
	 */
	EMRRelation createEMRRelation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourcepackagePackage getResourcepackagePackage();

} //ResourcepackageFactory
