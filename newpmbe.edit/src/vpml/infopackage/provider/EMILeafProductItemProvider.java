/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage.provider;


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

import vpml.infopackage.EMILeafProduct;
import vpml.infopackage.InfopackagePackage;

import vpml.provider.NewPMBEEditPlugin;

import vpml.utilpackage.UtilpackageFactory;

/**
 * This is the item provider adapter for a {@link vpml.infopackage.EMILeafProduct} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMILeafProductItemProvider
	extends EMIProductItemProvider
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
	public EMILeafProductItemProvider(AdapterFactory adapterFactory) {
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

			addProductIDPropertyDescriptor(object);
			addAttachmentPropertyDescriptor(object);
			addIotypePropertyDescriptor(object);
			addIntervalPropertyDescriptor(object);
			addUnitPropertyDescriptor(object);
			addInitListPropertyDescriptor(object);
			addCostPropertyDescriptor(object);
			addDatabasePropertyDescriptor(object);
			addDbTablePropertyDescriptor(object);
			addDbTableItemPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Product ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProductIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMILeafProduct_productID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMILeafProduct_productID_feature", "_UI_EMILeafProduct_type"),
				 InfopackagePackage.Literals.EMI_LEAF_PRODUCT__PRODUCT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attachment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttachmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMILeafProduct_attachment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMILeafProduct_attachment_feature", "_UI_EMILeafProduct_type"),
				 InfopackagePackage.Literals.EMI_LEAF_PRODUCT__ATTACHMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Iotype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIotypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMILeafProduct_iotype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMILeafProduct_iotype_feature", "_UI_EMILeafProduct_type"),
				 InfopackagePackage.Literals.EMI_LEAF_PRODUCT__IOTYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMILeafProduct_interval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMILeafProduct_interval_feature", "_UI_EMILeafProduct_type"),
				 InfopackagePackage.Literals.EMI_LEAF_PRODUCT__INTERVAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMILeafProduct_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMILeafProduct_unit_feature", "_UI_EMILeafProduct_type"),
				 InfopackagePackage.Literals.EMI_LEAF_PRODUCT__UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Init List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMILeafProduct_initList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMILeafProduct_initList_feature", "_UI_EMILeafProduct_type"),
				 InfopackagePackage.Literals.EMI_LEAF_PRODUCT__INIT_LIST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMILeafProduct_cost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMILeafProduct_cost_feature", "_UI_EMILeafProduct_type"),
				 InfopackagePackage.Literals.EMI_LEAF_PRODUCT__COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Database feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMILeafProduct_database_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMILeafProduct_database_feature", "_UI_EMILeafProduct_type"),
				 InfopackagePackage.Literals.EMI_LEAF_PRODUCT__DATABASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Db Table feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMILeafProduct_dbTable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMILeafProduct_dbTable_feature", "_UI_EMILeafProduct_type"),
				 InfopackagePackage.Literals.EMI_LEAF_PRODUCT__DB_TABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Db Table Item feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbTableItemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMILeafProduct_dbTableItem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMILeafProduct_dbTableItem_feature", "_UI_EMILeafProduct_type"),
				 InfopackagePackage.Literals.EMI_LEAF_PRODUCT__DB_TABLE_ITEM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(InfopackagePackage.Literals.EMI_LEAF_PRODUCT__DURATION_TIME);
		}
		return childrenFeatures;
	}

	/**
	 * This returns EMILeafProduct.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMILeafProduct"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((EMILeafProduct)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EMILeafProduct_type") :
			getString("_UI_EMILeafProduct_type") + " " + label;
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

		switch (notification.getFeatureID(EMILeafProduct.class)) {
			case InfopackagePackage.EMI_LEAF_PRODUCT__PRODUCT_ID:
			case InfopackagePackage.EMI_LEAF_PRODUCT__ATTACHMENT:
			case InfopackagePackage.EMI_LEAF_PRODUCT__IOTYPE:
			case InfopackagePackage.EMI_LEAF_PRODUCT__INTERVAL:
			case InfopackagePackage.EMI_LEAF_PRODUCT__UNIT:
			case InfopackagePackage.EMI_LEAF_PRODUCT__INIT_LIST:
			case InfopackagePackage.EMI_LEAF_PRODUCT__COST:
			case InfopackagePackage.EMI_LEAF_PRODUCT__DATABASE:
			case InfopackagePackage.EMI_LEAF_PRODUCT__DB_TABLE:
			case InfopackagePackage.EMI_LEAF_PRODUCT__DB_TABLE_ITEM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__DURATION_TIME:
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
				(InfopackagePackage.Literals.EMI_LEAF_PRODUCT__DURATION_TIME,
				 UtilpackageFactory.eINSTANCE.createDSDistribution()));
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
