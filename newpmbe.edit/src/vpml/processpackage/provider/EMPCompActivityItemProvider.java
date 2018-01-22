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
import org.eclipse.emf.edit.provider.ViewerNotification;

import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.ProcesspackageFactory;
import vpml.processpackage.ProcesspackagePackage;

import vpml.provider.NewPMBEEditPlugin;

/**
 * This is the item provider adapter for a {@link vpml.processpackage.EMPCompActivity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMPCompActivityItemProvider
	extends EMPActivityItemProvider
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
	public EMPCompActivityItemProvider(AdapterFactory adapterFactory) {
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

			addAssFlowsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_EMPCompActivity_assFlows_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPCompActivity_assFlows_feature", "_UI_EMPCompActivity_type"),
				 ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__ASS_FLOWS,
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
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS);
		}
		return childrenFeatures;
	}

	/**
	 * This returns EMPCompActivity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMPCompActivity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((EMPCompActivity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EMPCompActivity_type") :
			getString("_UI_EMPCompActivity_type") + " " + label;
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

		switch (notification.getFeatureID(EMPCompActivity.class)) {
			case ProcesspackagePackage.EMP_COMP_ACTIVITY__LEAF_OBJECTS:
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
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPObject()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPLeafActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPNormalActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPBatchActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPDataFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPAssFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPClockFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPLogicalConnector()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPInConnector()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPInAnd()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPOutConnector()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPOutAnd()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPInOr()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPOutOr()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPClock()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPCompActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPProduct()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPProductPackage()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPLeafProduct()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPRefFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPDocument()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPOther()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPAttributeItem()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPAutoActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPManualBatchActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPAutoBatchActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPMessage()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPMileStone()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY__LEAF_OBJECTS,
				 ProcesspackageFactory.eINSTANCE.createEMPForm()));
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
