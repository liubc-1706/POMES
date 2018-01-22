/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage.provider;


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

import vpml.provider.NewPMBEEditPlugin;

import vpml.resourcepackage.EMRClassificationRelation;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * This is the item provider adapter for a {@link vpml.resourcepackage.EMRClassificationRelation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMRClassificationRelationItemProvider
	extends EMRRelationItemProvider
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
	public EMRClassificationRelationItemProvider(AdapterFactory adapterFactory) {
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

			addRolePropertyDescriptor(object);
			addSourceAbsRoleTypePropertyDescriptor(object);
			addTargetAbsRoleTypePropertyDescriptor(object);
			addLocationTypePropertyDescriptor(object);
			addSourceAbsLocationTypePropertyDescriptor(object);
			addTargetAbsLocationTypePropertyDescriptor(object);
			addToolTypePropertyDescriptor(object);
			addTargetAbsToolTypePropertyDescriptor(object);
			addSourceAbsToolTypePropertyDescriptor(object);
			addMachineTypePropertyDescriptor(object);
			addSourceAbsMachineTypePropertyDescriptor(object);
			addTargetAbsMachineTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMRClassificationRelation_role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMRClassificationRelation_role_feature", "_UI_EMRClassificationRelation_type"),
				 ResourcepackagePackage.Literals.EMR_CLASSIFICATION_RELATION__ROLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Abs Role Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceAbsRoleTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMRClassificationRelation_sourceAbsRoleType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMRClassificationRelation_sourceAbsRoleType_feature", "_UI_EMRClassificationRelation_type"),
				 ResourcepackagePackage.Literals.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_ROLE_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Abs Role Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetAbsRoleTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMRClassificationRelation_targetAbsRoleType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMRClassificationRelation_targetAbsRoleType_feature", "_UI_EMRClassificationRelation_type"),
				 ResourcepackagePackage.Literals.EMR_CLASSIFICATION_RELATION__TARGET_ABS_ROLE_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMRClassificationRelation_locationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMRClassificationRelation_locationType_feature", "_UI_EMRClassificationRelation_type"),
				 ResourcepackagePackage.Literals.EMR_CLASSIFICATION_RELATION__LOCATION_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Abs Location Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceAbsLocationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMRClassificationRelation_sourceAbsLocationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMRClassificationRelation_sourceAbsLocationType_feature", "_UI_EMRClassificationRelation_type"),
				 ResourcepackagePackage.Literals.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_LOCATION_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Abs Location Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetAbsLocationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMRClassificationRelation_targetAbsLocationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMRClassificationRelation_targetAbsLocationType_feature", "_UI_EMRClassificationRelation_type"),
				 ResourcepackagePackage.Literals.EMR_CLASSIFICATION_RELATION__TARGET_ABS_LOCATION_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tool Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToolTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMRClassificationRelation_toolType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMRClassificationRelation_toolType_feature", "_UI_EMRClassificationRelation_type"),
				 ResourcepackagePackage.Literals.EMR_CLASSIFICATION_RELATION__TOOL_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Abs Tool Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetAbsToolTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMRClassificationRelation_targetAbsToolType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMRClassificationRelation_targetAbsToolType_feature", "_UI_EMRClassificationRelation_type"),
				 ResourcepackagePackage.Literals.EMR_CLASSIFICATION_RELATION__TARGET_ABS_TOOL_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Abs Tool Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceAbsToolTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMRClassificationRelation_sourceAbsToolType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMRClassificationRelation_sourceAbsToolType_feature", "_UI_EMRClassificationRelation_type"),
				 ResourcepackagePackage.Literals.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_TOOL_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Machine Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMachineTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMRClassificationRelation_machineType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMRClassificationRelation_machineType_feature", "_UI_EMRClassificationRelation_type"),
				 ResourcepackagePackage.Literals.EMR_CLASSIFICATION_RELATION__MACHINE_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Abs Machine Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceAbsMachineTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMRClassificationRelation_sourceAbsMachineType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMRClassificationRelation_sourceAbsMachineType_feature", "_UI_EMRClassificationRelation_type"),
				 ResourcepackagePackage.Literals.EMR_CLASSIFICATION_RELATION__SOURCE_ABS_MACHINE_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Abs Machine Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetAbsMachineTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMRClassificationRelation_targetAbsMachineType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMRClassificationRelation_targetAbsMachineType_feature", "_UI_EMRClassificationRelation_type"),
				 ResourcepackagePackage.Literals.EMR_CLASSIFICATION_RELATION__TARGET_ABS_MACHINE_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns EMRClassificationRelation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMRClassificationRelation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((EMRClassificationRelation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EMRClassificationRelation_type") :
			getString("_UI_EMRClassificationRelation_type") + " " + label;
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
