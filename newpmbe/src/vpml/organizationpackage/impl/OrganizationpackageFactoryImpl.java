/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.organizationpackage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vpml.organizationpackage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganizationpackageFactoryImpl extends EFactoryImpl implements OrganizationpackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrganizationpackageFactory init() {
		try {
			OrganizationpackageFactory theOrganizationpackageFactory = (OrganizationpackageFactory)EPackage.Registry.INSTANCE.getEFactory("http:///vpml/organizationpackage.ecore"); 
			if (theOrganizationpackageFactory != null) {
				return theOrganizationpackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrganizationpackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationpackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE: return createEMOResourceGroupType();
			case OrganizationpackagePackage.EMO_RELATIONS: return createEMORelations();
			case OrganizationpackagePackage.EMO_ASSOCIATION_RELATION: return createEMOAssociationRelation();
			case OrganizationpackagePackage.EMO_COMPOSE_RELATION: return createEMOComposeRelation();
			case OrganizationpackagePackage.EMO_DIAGRAM: return createEMODiagram();
			case OrganizationpackagePackage.EMO_OBJECT: return createEMOObject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOResourceGroupType createEMOResourceGroupType() {
		EMOResourceGroupTypeImpl emoResourceGroupType = new EMOResourceGroupTypeImpl();
		return emoResourceGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMORelations createEMORelations() {
		EMORelationsImpl emoRelations = new EMORelationsImpl();
		return emoRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOAssociationRelation createEMOAssociationRelation() {
		EMOAssociationRelationImpl emoAssociationRelation = new EMOAssociationRelationImpl();
		return emoAssociationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOComposeRelation createEMOComposeRelation() {
		EMOComposeRelationImpl emoComposeRelation = new EMOComposeRelationImpl();
		return emoComposeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMODiagram createEMODiagram() {
		EMODiagramImpl emoDiagram = new EMODiagramImpl();
		return emoDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOObject createEMOObject() {
		EMOObjectImpl emoObject = new EMOObjectImpl();
		return emoObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationpackagePackage getOrganizationpackagePackage() {
		return (OrganizationpackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static OrganizationpackagePackage getPackage() {
		return OrganizationpackagePackage.eINSTANCE;
	}

} //OrganizationpackageFactoryImpl
