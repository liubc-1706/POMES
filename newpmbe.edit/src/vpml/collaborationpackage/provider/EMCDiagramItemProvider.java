/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.collaborationpackage.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import vpml.collaborationpackage.CollaborationpackageFactory;
import vpml.collaborationpackage.CollaborationpackagePackage;
import vpml.collaborationpackage.EMCDiagram;

import vpml.organizationpackage.OrganizationpackageFactory;

import vpml.provider.EMDiagramItemProvider;
import vpml.provider.NewPMBEEditPlugin;

import vpml.resourcepackage.ResourcepackageFactory;

/**
 * This is the item provider adapter for a {@link vpml.collaborationpackage.EMCDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMCDiagramItemProvider
	extends EMDiagramItemProvider
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
	public EMCDiagramItemProvider(AdapterFactory adapterFactory) {
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

			addEmpDiagramPropertyDescriptor(object);
			addAssociatePrModelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Emp Diagram feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmpDiagramPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMCDiagram_empDiagram_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMCDiagram_empDiagram_feature", "_UI_EMCDiagram_type"),
				 CollaborationpackagePackage.Literals.EMC_DIAGRAM__EMP_DIAGRAM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Associate Pr Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociatePrModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMCDiagram_associatePrModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMCDiagram_associatePrModel_feature", "_UI_EMCDiagram_type"),
				 CollaborationpackagePackage.Literals.EMC_DIAGRAM__ASSOCIATE_PR_MODEL,
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
			childrenFeatures.add(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_AND);
			childrenFeatures.add(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_OR);
			childrenFeatures.add(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_ROLE);
			childrenFeatures.add(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_LOCATION);
			childrenFeatures.add(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_MACHINE);
			childrenFeatures.add(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_EMO_GROUP);
			childrenFeatures.add(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_COL_GROUP);
			childrenFeatures.add(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_COL_RELATION);
			childrenFeatures.add(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_SEQ_RELATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EMCDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMCDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((EMCDiagram)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EMCDiagram_type") :
			getString("_UI_EMCDiagram_type") + " " + label;
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

		switch (notification.getFeatureID(EMCDiagram.class)) {
			case CollaborationpackagePackage.EMC_DIAGRAM__ASSOCIATE_PR_MODEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_AND:
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_OR:
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_ROLE:
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_LOCATION:
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_MACHINE:
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_EMO_GROUP:
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_GROUP:
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_COL_RELATION:
			case CollaborationpackagePackage.EMC_DIAGRAM__COL_SEQ_RELATION:
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
				(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_AND,
				 CollaborationpackageFactory.eINSTANCE.createEMCAnd()));

		newChildDescriptors.add
			(createChildParameter
				(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_OR,
				 CollaborationpackageFactory.eINSTANCE.createEMCOR()));

		newChildDescriptors.add
			(createChildParameter
				(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_ROLE,
				 ResourcepackageFactory.eINSTANCE.createEMRRole()));

		newChildDescriptors.add
			(createChildParameter
				(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_LOCATION,
				 ResourcepackageFactory.eINSTANCE.createEMRLocationType()));

		newChildDescriptors.add
			(createChildParameter
				(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_MACHINE,
				 ResourcepackageFactory.eINSTANCE.createEMRMachineType()));

		newChildDescriptors.add
			(createChildParameter
				(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_EMO_GROUP,
				 OrganizationpackageFactory.eINSTANCE.createEMOResourceGroupType()));

		newChildDescriptors.add
			(createChildParameter
				(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_COL_GROUP,
				 CollaborationpackageFactory.eINSTANCE.createEMCCollaborationGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_COL_RELATION,
				 CollaborationpackageFactory.eINSTANCE.createEMCCollaborationRelation()));

		newChildDescriptors.add
			(createChildParameter
				(CollaborationpackagePackage.Literals.EMC_DIAGRAM__COL_SEQ_RELATION,
				 CollaborationpackageFactory.eINSTANCE.createEMCSequenceRelation()));
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
