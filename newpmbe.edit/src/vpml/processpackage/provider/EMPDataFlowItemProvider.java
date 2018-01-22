/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.provider;


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

import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.ProcesspackagePackage;

import vpml.provider.NewPMBEEditPlugin;

/**
 * This is the item provider adapter for a {@link vpml.processpackage.EMPDataFlow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMPDataFlowItemProvider
	extends EMPFlowItemProvider
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
	public EMPDataFlowItemProvider(AdapterFactory adapterFactory) {
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

			addProbabilityPropertyDescriptor(object);
			addTargetProductPropertyDescriptor(object);
			addTargetActivityPropertyDescriptor(object);
			addSourceProductPropertyDescriptor(object);
			addSourceActivityPropertyDescriptor(object);
			addSourceInAndPropertyDescriptor(object);
			addTargetInAndPropertyDescriptor(object);
			addTargetInOrPropertyDescriptor(object);
			addSourceInOrPropertyDescriptor(object);
			addSourceOutAndPropertyDescriptor(object);
			addTargetOutAndPropertyDescriptor(object);
			addSourceOutOrPropertyDescriptor(object);
			addTargetOutOrPropertyDescriptor(object);
			addMileStonePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Probability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProbabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDataFlow_probability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDataFlow_probability_feature", "_UI_EMPDataFlow_type"),
				 ProcesspackagePackage.Literals.EMP_DATA_FLOW__PROBABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Product feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetProductPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDataFlow_targetProduct_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDataFlow_targetProduct_feature", "_UI_EMPDataFlow_type"),
				 ProcesspackagePackage.Literals.EMP_DATA_FLOW__TARGET_PRODUCT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDataFlow_targetActivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDataFlow_targetActivity_feature", "_UI_EMPDataFlow_type"),
				 ProcesspackagePackage.Literals.EMP_DATA_FLOW__TARGET_ACTIVITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Product feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceProductPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDataFlow_sourceProduct_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDataFlow_sourceProduct_feature", "_UI_EMPDataFlow_type"),
				 ProcesspackagePackage.Literals.EMP_DATA_FLOW__SOURCE_PRODUCT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDataFlow_sourceActivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDataFlow_sourceActivity_feature", "_UI_EMPDataFlow_type"),
				 ProcesspackagePackage.Literals.EMP_DATA_FLOW__SOURCE_ACTIVITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source In And feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceInAndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDataFlow_sourceInAnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDataFlow_sourceInAnd_feature", "_UI_EMPDataFlow_type"),
				 ProcesspackagePackage.Literals.EMP_DATA_FLOW__SOURCE_IN_AND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target In And feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetInAndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDataFlow_targetInAnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDataFlow_targetInAnd_feature", "_UI_EMPDataFlow_type"),
				 ProcesspackagePackage.Literals.EMP_DATA_FLOW__TARGET_IN_AND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target In Or feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetInOrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDataFlow_targetInOr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDataFlow_targetInOr_feature", "_UI_EMPDataFlow_type"),
				 ProcesspackagePackage.Literals.EMP_DATA_FLOW__TARGET_IN_OR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source In Or feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceInOrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDataFlow_sourceInOr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDataFlow_sourceInOr_feature", "_UI_EMPDataFlow_type"),
				 ProcesspackagePackage.Literals.EMP_DATA_FLOW__SOURCE_IN_OR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Out And feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceOutAndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDataFlow_sourceOutAnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDataFlow_sourceOutAnd_feature", "_UI_EMPDataFlow_type"),
				 ProcesspackagePackage.Literals.EMP_DATA_FLOW__SOURCE_OUT_AND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Out And feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetOutAndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDataFlow_targetOutAnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDataFlow_targetOutAnd_feature", "_UI_EMPDataFlow_type"),
				 ProcesspackagePackage.Literals.EMP_DATA_FLOW__TARGET_OUT_AND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Out Or feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceOutOrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDataFlow_sourceOutOr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDataFlow_sourceOutOr_feature", "_UI_EMPDataFlow_type"),
				 ProcesspackagePackage.Literals.EMP_DATA_FLOW__SOURCE_OUT_OR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Out Or feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetOutOrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDataFlow_targetOutOr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDataFlow_targetOutOr_feature", "_UI_EMPDataFlow_type"),
				 ProcesspackagePackage.Literals.EMP_DATA_FLOW__TARGET_OUT_OR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mile Stone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMileStonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDataFlow_mileStone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDataFlow_mileStone_feature", "_UI_EMPDataFlow_type"),
				 ProcesspackagePackage.Literals.EMP_DATA_FLOW__MILE_STONE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns EMPDataFlow.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMPDataFlow"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((EMPDataFlow)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EMPDataFlow_type") :
			getString("_UI_EMPDataFlow_type") + " " + label;
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

		switch (notification.getFeatureID(EMPDataFlow.class)) {
			case ProcesspackagePackage.EMP_DATA_FLOW__PROBABILITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
