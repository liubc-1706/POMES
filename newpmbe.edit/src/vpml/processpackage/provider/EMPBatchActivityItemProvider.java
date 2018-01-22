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

import vpml.processpackage.EMPBatchActivity;
import vpml.processpackage.ProcesspackagePackage;

import vpml.provider.NewPMBEEditPlugin;

/**
 * This is the item provider adapter for a {@link vpml.processpackage.EMPBatchActivity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMPBatchActivityItemProvider
	extends EMPLeafActivityItemProvider
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
	public EMPBatchActivityItemProvider(AdapterFactory adapterFactory) {
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

			addBatchTypePropertyDescriptor(object);
			addBatStartTimePropertyDescriptor(object);
			addBatEndTimePropertyDescriptor(object);
			addRestartPeriodPropertyDescriptor(object);
			addBatTimeUnitPropertyDescriptor(object);
			addTimerQueueFlagPropertyDescriptor(object);
			addEmergencyFlagPropertyDescriptor(object);
			addIntervalValuePropertyDescriptor(object);
			addIntervalTimeUnitPropertyDescriptor(object);
			addMaxQuantityPropertyDescriptor(object);
			addMinQuantityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Batch Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBatchTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPBatchActivity_batchType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPBatchActivity_batchType_feature", "_UI_EMPBatchActivity_type"),
				 ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY__BATCH_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bat Start Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBatStartTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPBatchActivity_batStartTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPBatchActivity_batStartTime_feature", "_UI_EMPBatchActivity_type"),
				 ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY__BAT_START_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bat End Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBatEndTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPBatchActivity_batEndTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPBatchActivity_batEndTime_feature", "_UI_EMPBatchActivity_type"),
				 ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY__BAT_END_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Restart Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestartPeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPBatchActivity_restartPeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPBatchActivity_restartPeriod_feature", "_UI_EMPBatchActivity_type"),
				 ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY__RESTART_PERIOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bat Time Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBatTimeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPBatchActivity_batTimeUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPBatchActivity_batTimeUnit_feature", "_UI_EMPBatchActivity_type"),
				 ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY__BAT_TIME_UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer Queue Flag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimerQueueFlagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPBatchActivity_timerQueueFlag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPBatchActivity_timerQueueFlag_feature", "_UI_EMPBatchActivity_type"),
				 ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY__TIMER_QUEUE_FLAG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Emergency Flag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmergencyFlagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPBatchActivity_emergencyFlag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPBatchActivity_emergencyFlag_feature", "_UI_EMPBatchActivity_type"),
				 ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY__EMERGENCY_FLAG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interval Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntervalValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPBatchActivity_intervalValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPBatchActivity_intervalValue_feature", "_UI_EMPBatchActivity_type"),
				 ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY__INTERVAL_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interval Time Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntervalTimeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPBatchActivity_intervalTimeUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPBatchActivity_intervalTimeUnit_feature", "_UI_EMPBatchActivity_type"),
				 ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY__INTERVAL_TIME_UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Quantity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxQuantityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPBatchActivity_maxQuantity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPBatchActivity_maxQuantity_feature", "_UI_EMPBatchActivity_type"),
				 ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY__MAX_QUANTITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Quantity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinQuantityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPBatchActivity_minQuantity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPBatchActivity_minQuantity_feature", "_UI_EMPBatchActivity_type"),
				 ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY__MIN_QUANTITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns EMPBatchActivity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMPBatchActivity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((EMPBatchActivity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EMPBatchActivity_type") :
			getString("_UI_EMPBatchActivity_type") + " " + label;
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

		switch (notification.getFeatureID(EMPBatchActivity.class)) {
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BATCH_TYPE:
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_START_TIME:
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_END_TIME:
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__RESTART_PERIOD:
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__BAT_TIME_UNIT:
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__TIMER_QUEUE_FLAG:
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__EMERGENCY_FLAG:
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__INTERVAL_VALUE:
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__INTERVAL_TIME_UNIT:
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__MAX_QUANTITY:
			case ProcesspackagePackage.EMP_BATCH_ACTIVITY__MIN_QUANTITY:
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
