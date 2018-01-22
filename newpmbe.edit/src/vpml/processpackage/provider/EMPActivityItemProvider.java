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

import vpml.processpackage.EMPActivity;
import vpml.processpackage.ProcesspackagePackage;

import vpml.provider.NewPMBEEditPlugin;

/**
 * This is the item provider adapter for a {@link vpml.processpackage.EMPActivity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMPActivityItemProvider
	extends EMPObjectItemProvider
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
	public EMPActivityItemProvider(AdapterFactory adapterFactory) {
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

			addProcedurePropertyDescriptor(object);
			addCreaterPropertyDescriptor(object);
			addCreatedDatePropertyDescriptor(object);
			addLastModifierPropertyDescriptor(object);
			addLastModifiedDatePropertyDescriptor(object);
			addClockFlowPropertyDescriptor(object);
			addTargetDataFlowsPropertyDescriptor(object);
			addSourceDataFlowsPropertyDescriptor(object);
			addRefFlowsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Procedure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcedurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPActivity_procedure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPActivity_procedure_feature", "_UI_EMPActivity_type"),
				 ProcesspackagePackage.Literals.EMP_ACTIVITY__PROCEDURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Creater feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreaterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPActivity_creater_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPActivity_creater_feature", "_UI_EMPActivity_type"),
				 ProcesspackagePackage.Literals.EMP_ACTIVITY__CREATER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Created Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreatedDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPActivity_createdDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPActivity_createdDate_feature", "_UI_EMPActivity_type"),
				 ProcesspackagePackage.Literals.EMP_ACTIVITY__CREATED_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Modifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastModifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPActivity_lastModifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPActivity_lastModifier_feature", "_UI_EMPActivity_type"),
				 ProcesspackagePackage.Literals.EMP_ACTIVITY__LAST_MODIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Modified Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastModifiedDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPActivity_lastModifiedDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPActivity_lastModifiedDate_feature", "_UI_EMPActivity_type"),
				 ProcesspackagePackage.Literals.EMP_ACTIVITY__LAST_MODIFIED_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Clock Flow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClockFlowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPActivity_clockFlow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPActivity_clockFlow_feature", "_UI_EMPActivity_type"),
				 ProcesspackagePackage.Literals.EMP_ACTIVITY__CLOCK_FLOW,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Data Flows feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetDataFlowsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPActivity_targetDataFlows_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPActivity_targetDataFlows_feature", "_UI_EMPActivity_type"),
				 ProcesspackagePackage.Literals.EMP_ACTIVITY__TARGET_DATA_FLOWS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Data Flows feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceDataFlowsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPActivity_sourceDataFlows_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPActivity_sourceDataFlows_feature", "_UI_EMPActivity_type"),
				 ProcesspackagePackage.Literals.EMP_ACTIVITY__SOURCE_DATA_FLOWS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ref Flows feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefFlowsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPActivity_refFlows_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPActivity_refFlows_feature", "_UI_EMPActivity_type"),
				 ProcesspackagePackage.Literals.EMP_ACTIVITY__REF_FLOWS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns EMPActivity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMPActivity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((EMPActivity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EMPActivity_type") :
			getString("_UI_EMPActivity_type") + " " + label;
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

		switch (notification.getFeatureID(EMPActivity.class)) {
			case ProcesspackagePackage.EMP_ACTIVITY__PROCEDURE:
			case ProcesspackagePackage.EMP_ACTIVITY__CREATER:
			case ProcesspackagePackage.EMP_ACTIVITY__CREATED_DATE:
			case ProcesspackagePackage.EMP_ACTIVITY__LAST_MODIFIER:
			case ProcesspackagePackage.EMP_ACTIVITY__LAST_MODIFIED_DATE:
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
