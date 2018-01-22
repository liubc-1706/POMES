/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.organizationpackage.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import vpml.organizationpackage.EMOResourceGroupType;
import vpml.organizationpackage.OrganizationpackageFactory;
import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.provider.NewPMBEEditPlugin;

/**
 * This is the item provider adapter for a {@link vpml.organizationpackage.EMOResourceGroupType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMOResourceGroupTypeItemProvider
	extends EMOObjectItemProvider
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOResourceGroupTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOrganiztionTypePropertyDescriptor(object);
			addPrincipalPropertyDescriptor(object);
			addArrangeNumberPropertyDescriptor(object);
			addReservedPropertyDescriptor(object);
			addSourceAssociationRelationsPropertyDescriptor(object);
			addTargetComposeRelationPropertyDescriptor(object);
			addSourceComposeRelationsPropertyDescriptor(object);
			addTargetAssociationRelationsPropertyDescriptor(object);
			addBasicResourceTypesPropertyDescriptor(object);
			addAssFlowsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Organiztion Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrganiztionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMOResourceGroupType_organiztionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMOResourceGroupType_organiztionType_feature", "_UI_EMOResourceGroupType_type"),
				 OrganizationpackagePackage.Literals.EMO_RESOURCE_GROUP_TYPE__ORGANIZTION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Principal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrincipalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMOResourceGroupType_principal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMOResourceGroupType_principal_feature", "_UI_EMOResourceGroupType_type"),
				 OrganizationpackagePackage.Literals.EMO_RESOURCE_GROUP_TYPE__PRINCIPAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Arrange Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArrangeNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMOResourceGroupType_arrangeNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMOResourceGroupType_arrangeNumber_feature", "_UI_EMOResourceGroupType_type"),
				 OrganizationpackagePackage.Literals.EMO_RESOURCE_GROUP_TYPE__ARRANGE_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reserved feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReservedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMOResourceGroupType_reserved_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMOResourceGroupType_reserved_feature", "_UI_EMOResourceGroupType_type"),
				 OrganizationpackagePackage.Literals.EMO_RESOURCE_GROUP_TYPE__RESERVED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Association Relations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceAssociationRelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMOResourceGroupType_sourceAssociationRelations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMOResourceGroupType_sourceAssociationRelations_feature", "_UI_EMOResourceGroupType_type"),
				 OrganizationpackagePackage.Literals.EMO_RESOURCE_GROUP_TYPE__SOURCE_ASSOCIATION_RELATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Compose Relation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetComposeRelationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMOResourceGroupType_targetComposeRelation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMOResourceGroupType_targetComposeRelation_feature", "_UI_EMOResourceGroupType_type"),
				 OrganizationpackagePackage.Literals.EMO_RESOURCE_GROUP_TYPE__TARGET_COMPOSE_RELATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Compose Relations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceComposeRelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMOResourceGroupType_sourceComposeRelations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMOResourceGroupType_sourceComposeRelations_feature", "_UI_EMOResourceGroupType_type"),
				 OrganizationpackagePackage.Literals.EMO_RESOURCE_GROUP_TYPE__SOURCE_COMPOSE_RELATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Association Relations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetAssociationRelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMOResourceGroupType_targetAssociationRelations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMOResourceGroupType_targetAssociationRelations_feature", "_UI_EMOResourceGroupType_type"),
				 OrganizationpackagePackage.Literals.EMO_RESOURCE_GROUP_TYPE__TARGET_ASSOCIATION_RELATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Basic Resource Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasicResourceTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMOResourceGroupType_basicResourceTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMOResourceGroupType_basicResourceTypes_feature", "_UI_EMOResourceGroupType_type"),
				 OrganizationpackagePackage.Literals.EMO_RESOURCE_GROUP_TYPE__BASIC_RESOURCE_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ass Flows feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssFlowsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMOResourceGroupType_assFlows_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMOResourceGroupType_assFlows_feature", "_UI_EMOResourceGroupType_type"),
				 OrganizationpackagePackage.Literals.EMO_RESOURCE_GROUP_TYPE__ASS_FLOWS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OrganizationpackagePackage.Literals.EMO_RESOURCE_GROUP_TYPE__SUPER_ORGANIZATION);
		}
		return childrenFeatures;
	}

	/**
	 * This returns EMOResourceGroupType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMOResourceGroupType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((EMOResourceGroupType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EMOResourceGroupType_type") :
			getString("_UI_EMOResourceGroupType_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EMOResourceGroupType.class)) {
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ORGANIZTION_TYPE:
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__PRINCIPAL:
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__ARRANGE_NUMBER:
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__RESERVED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrganizationpackagePackage.EMO_RESOURCE_GROUP_TYPE__SUPER_ORGANIZATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OrganizationpackagePackage.Literals.EMO_RESOURCE_GROUP_TYPE__SUPER_ORGANIZATION,
				 OrganizationpackageFactory.eINSTANCE.createEMOResourceGroupType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return NewPMBEEditPlugin.INSTANCE;
	}

}
