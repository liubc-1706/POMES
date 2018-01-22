/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.collaborationpackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vpml.collaborationpackage.CollaborationpackagePackage
 * @generated
 */
public interface CollaborationpackageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollaborationpackageFactory eINSTANCE = vpml.collaborationpackage.impl.CollaborationpackageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EMC Logical Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMC Logical Connector</em>'.
	 * @generated
	 */
	EMCLogicalConnector createEMCLogicalConnector();

	/**
	 * Returns a new object of class '<em>EMC And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMC And</em>'.
	 * @generated
	 */
	EMCAnd createEMCAnd();

	/**
	 * Returns a new object of class '<em>EMCOR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMCOR</em>'.
	 * @generated
	 */
	EMCOR createEMCOR();

	/**
	 * Returns a new object of class '<em>EMC Collaboration Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMC Collaboration Group</em>'.
	 * @generated
	 */
	EMCCollaborationGroup createEMCCollaborationGroup();

	/**
	 * Returns a new object of class '<em>EMC Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMC Diagram</em>'.
	 * @generated
	 */
	EMCDiagram createEMCDiagram();

	/**
	 * Returns a new object of class '<em>EMC Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMC Relation</em>'.
	 * @generated
	 */
	EMCRelation createEMCRelation();

	/**
	 * Returns a new object of class '<em>EMC Collaboration Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMC Collaboration Relation</em>'.
	 * @generated
	 */
	EMCCollaborationRelation createEMCCollaborationRelation();

	/**
	 * Returns a new object of class '<em>EMC Sequence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMC Sequence Relation</em>'.
	 * @generated
	 */
	EMCSequenceRelation createEMCSequenceRelation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CollaborationpackagePackage getCollaborationpackagePackage();

} //CollaborationpackageFactory
