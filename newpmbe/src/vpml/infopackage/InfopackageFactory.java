/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vpml.infopackage.InfopackagePackage
 * @generated
 */
public interface InfopackageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfopackageFactory eINSTANCE = vpml.infopackage.impl.InfopackageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EMI Leaf Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Leaf Product</em>'.
	 * @generated
	 */
	EMILeafProduct createEMILeafProduct();

	/**
	 * Returns a new object of class '<em>EMI Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Document</em>'.
	 * @generated
	 */
	EMIDocument createEMIDocument();

	/**
	 * Returns a new object of class '<em>EMI Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Artifact</em>'.
	 * @generated
	 */
	EMIArtifact createEMIArtifact();

	/**
	 * Returns a new object of class '<em>EMI Other</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Other</em>'.
	 * @generated
	 */
	EMIOther createEMIOther();

	/**
	 * Returns a new object of class '<em>EMI Product Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Product Package</em>'.
	 * @generated
	 */
	EMIProductPackage createEMIProductPackage();

	/**
	 * Returns a new object of class '<em>EMI Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Object</em>'.
	 * @generated
	 */
	EMIObject createEMIObject();

	/**
	 * Returns a new object of class '<em>EMI Logical Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Logical Connector</em>'.
	 * @generated
	 */
	EMILogicalConnector createEMILogicalConnector();

	/**
	 * Returns a new object of class '<em>EMI Com Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Com Info</em>'.
	 * @generated
	 */
	EMIComInfo createEMIComInfo();

	/**
	 * Returns a new object of class '<em>EMI Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Product</em>'.
	 * @generated
	 */
	EMIProduct createEMIProduct();

	/**
	 * Returns a new object of class '<em>EMI Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Flow</em>'.
	 * @generated
	 */
	EMIFlow createEMIFlow();

	/**
	 * Returns a new object of class '<em>EMI Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Node</em>'.
	 * @generated
	 */
	EMINode createEMINode();

	/**
	 * Returns a new object of class '<em>EMI Ref Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Ref Flow</em>'.
	 * @generated
	 */
	EMIRefFlow createEMIRefFlow();

	/**
	 * Returns a new object of class '<em>EMI Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Data Flow</em>'.
	 * @generated
	 */
	EMIDataFlow createEMIDataFlow();

	/**
	 * Returns a new object of class '<em>EMI In Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI In Connector</em>'.
	 * @generated
	 */
	EMIInConnector createEMIInConnector();

	/**
	 * Returns a new object of class '<em>EMI Out Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Out Connector</em>'.
	 * @generated
	 */
	EMIOutConnector createEMIOutConnector();

	/**
	 * Returns a new object of class '<em>EMI State Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI State Connector</em>'.
	 * @generated
	 */
	EMIStateConnector createEMIStateConnector();

	/**
	 * Returns a new object of class '<em>EMI In Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI In Or</em>'.
	 * @generated
	 */
	EMIInOr createEMIInOr();

	/**
	 * Returns a new object of class '<em>EMI In And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI In And</em>'.
	 * @generated
	 */
	EMIInAnd createEMIInAnd();

	/**
	 * Returns a new object of class '<em>EMI Out And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Out And</em>'.
	 * @generated
	 */
	EMIOutAnd createEMIOutAnd();

	/**
	 * Returns a new object of class '<em>EMI Out Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Out Or</em>'.
	 * @generated
	 */
	EMIOutOr createEMIOutOr();

	/**
	 * Returns a new object of class '<em>EMI Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Diagram</em>'.
	 * @generated
	 */
	EMIDiagram createEMIDiagram();

	/**
	 * Returns a new object of class '<em>EMI Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMI Message</em>'.
	 * @generated
	 */
	EMIMessage createEMIMessage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InfopackagePackage getInfopackagePackage();

} //InfopackageFactory
