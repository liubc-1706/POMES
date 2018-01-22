/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.collaborationpackage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vpml.collaborationpackage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollaborationpackageFactoryImpl extends EFactoryImpl implements CollaborationpackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CollaborationpackageFactory init() {
		try {
			CollaborationpackageFactory theCollaborationpackageFactory = (CollaborationpackageFactory)EPackage.Registry.INSTANCE.getEFactory("http:///vpml/collaborationpackage.ecore"); 
			if (theCollaborationpackageFactory != null) {
				return theCollaborationpackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CollaborationpackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationpackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CollaborationpackagePackage.EMC_LOGICAL_CONNECTOR: return createEMCLogicalConnector();
			case CollaborationpackagePackage.EMC_AND: return createEMCAnd();
			case CollaborationpackagePackage.EMCOR: return createEMCOR();
			case CollaborationpackagePackage.EMC_COLLABORATION_GROUP: return createEMCCollaborationGroup();
			case CollaborationpackagePackage.EMC_DIAGRAM: return createEMCDiagram();
			case CollaborationpackagePackage.EMC_RELATION: return createEMCRelation();
			case CollaborationpackagePackage.EMC_COLLABORATION_RELATION: return createEMCCollaborationRelation();
			case CollaborationpackagePackage.EMC_SEQUENCE_RELATION: return createEMCSequenceRelation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMCLogicalConnector createEMCLogicalConnector() {
		EMCLogicalConnectorImpl emcLogicalConnector = new EMCLogicalConnectorImpl();
		return emcLogicalConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMCAnd createEMCAnd() {
		EMCAndImpl emcAnd = new EMCAndImpl();
		return emcAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMCOR createEMCOR() {
		EMCORImpl emcor = new EMCORImpl();
		return emcor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMCCollaborationGroup createEMCCollaborationGroup() {
		EMCCollaborationGroupImpl emcCollaborationGroup = new EMCCollaborationGroupImpl();
		return emcCollaborationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMCDiagram createEMCDiagram() {
		EMCDiagramImpl emcDiagram = new EMCDiagramImpl();
		return emcDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMCRelation createEMCRelation() {
		EMCRelationImpl emcRelation = new EMCRelationImpl();
		return emcRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMCCollaborationRelation createEMCCollaborationRelation() {
		EMCCollaborationRelationImpl emcCollaborationRelation = new EMCCollaborationRelationImpl();
		return emcCollaborationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMCSequenceRelation createEMCSequenceRelation() {
		EMCSequenceRelationImpl emcSequenceRelation = new EMCSequenceRelationImpl();
		return emcSequenceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationpackagePackage getCollaborationpackagePackage() {
		return (CollaborationpackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static CollaborationpackagePackage getPackage() {
		return CollaborationpackagePackage.eINSTANCE;
	}

} //CollaborationpackageFactoryImpl
