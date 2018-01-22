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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import vpml.organizationpackage.EMODiagram;
import vpml.organizationpackage.OrganizationpackageFactory;
import vpml.organizationpackage.OrganizationpackagePackage;

import vpml.provider.EMDiagramItemProvider;
import vpml.provider.NewPMBEEditPlugin;

import vpml.resourcepackage.ResourcepackageFactory;

/**
 * This is the item provider adapter for a {@link vpml.organizationpackage.EMODiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMODiagramItemProvider
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
	public EMODiagramItemProvider(AdapterFactory adapterFactory) {
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

			addEmpDiagramsPropertyDescriptor(object);
			addEmrDiagramsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Emp Diagrams feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmpDiagramsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMODiagram_empDiagrams_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMODiagram_empDiagrams_feature", "_UI_EMODiagram_type"),
				 OrganizationpackagePackage.Literals.EMO_DIAGRAM__EMP_DIAGRAMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Emr Diagrams feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmrDiagramsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMODiagram_emrDiagrams_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMODiagram_emrDiagrams_feature", "_UI_EMODiagram_type"),
				 OrganizationpackagePackage.Literals.EMO_DIAGRAM__EMR_DIAGRAMS,
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
			childrenFeatures.add(OrganizationpackagePackage.Literals.EMO_DIAGRAM__ROLES);
			childrenFeatures.add(OrganizationpackagePackage.Literals.EMO_DIAGRAM__RESOURCE_GROUP_TYPES);
			childrenFeatures.add(OrganizationpackagePackage.Literals.EMO_DIAGRAM__ASSOCIATION_RELATIONS);
			childrenFeatures.add(OrganizationpackagePackage.Literals.EMO_DIAGRAM__COMPOSE_RELATIONS);
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
	 * This returns EMODiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMODiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((EMODiagram)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EMODiagram_type") :
			getString("_UI_EMODiagram_type") + " " + label;
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

		switch (notification.getFeatureID(EMODiagram.class)) {
			case OrganizationpackagePackage.EMO_DIAGRAM__ROLES:
			case OrganizationpackagePackage.EMO_DIAGRAM__RESOURCE_GROUP_TYPES:
			case OrganizationpackagePackage.EMO_DIAGRAM__ASSOCIATION_RELATIONS:
			case OrganizationpackagePackage.EMO_DIAGRAM__COMPOSE_RELATIONS:
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
				(OrganizationpackagePackage.Literals.EMO_DIAGRAM__ROLES,
				 ResourcepackageFactory.eINSTANCE.createEMRRole()));

		newChildDescriptors.add
			(createChildParameter
				(OrganizationpackagePackage.Literals.EMO_DIAGRAM__RESOURCE_GROUP_TYPES,
				 OrganizationpackageFactory.eINSTANCE.createEMOResourceGroupType()));

		newChildDescriptors.add
			(createChildParameter
				(OrganizationpackagePackage.Literals.EMO_DIAGRAM__ASSOCIATION_RELATIONS,
				 OrganizationpackageFactory.eINSTANCE.createEMOAssociationRelation()));

		newChildDescriptors.add
			(createChildParameter
				(OrganizationpackagePackage.Literals.EMO_DIAGRAM__COMPOSE_RELATIONS,
				 OrganizationpackageFactory.eINSTANCE.createEMOComposeRelation()));
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
