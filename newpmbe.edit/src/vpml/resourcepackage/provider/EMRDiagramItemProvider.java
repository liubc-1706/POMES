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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import vpml.provider.EMDiagramItemProvider;
import vpml.provider.NewPMBEEditPlugin;

import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.ResourcepackageFactory;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * This is the item provider adapter for a {@link vpml.resourcepackage.EMRDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMRDiagramItemProvider
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
	public EMRDiagramItemProvider(AdapterFactory adapterFactory) {
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
			addEmoDiagramPropertyDescriptor(object);
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
				 getString("_UI_EMRDiagram_empDiagrams_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMRDiagram_empDiagrams_feature", "_UI_EMRDiagram_type"),
				 ResourcepackagePackage.Literals.EMR_DIAGRAM__EMP_DIAGRAMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Emo Diagram feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmoDiagramPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMRDiagram_emoDiagram_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMRDiagram_emoDiagram_feature", "_UI_EMRDiagram_type"),
				 ResourcepackagePackage.Literals.EMR_DIAGRAM__EMO_DIAGRAM,
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
			childrenFeatures.add(ResourcepackagePackage.Literals.EMR_DIAGRAM__CLASSIFICATION_RELATIONS);
			childrenFeatures.add(ResourcepackagePackage.Literals.EMR_DIAGRAM__ABSTRACT_LOCATION_TYPES);
			childrenFeatures.add(ResourcepackagePackage.Literals.EMR_DIAGRAM__ABSTRACT_MACHINE_TYPES);
			childrenFeatures.add(ResourcepackagePackage.Literals.EMR_DIAGRAM__ABSTRACT_TOOL_TYPES);
			childrenFeatures.add(ResourcepackagePackage.Literals.EMR_DIAGRAM__ABSTRACT_ROLES);
			childrenFeatures.add(ResourcepackagePackage.Literals.EMR_DIAGRAM__ROLES);
			childrenFeatures.add(ResourcepackagePackage.Literals.EMR_DIAGRAM__LOCATION_TYPES);
			childrenFeatures.add(ResourcepackagePackage.Literals.EMR_DIAGRAM__MACHINE_TYPES);
			childrenFeatures.add(ResourcepackagePackage.Literals.EMR_DIAGRAM__TOOL_TYPES);
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
	 * This returns EMRDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMRDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((EMRDiagram)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EMRDiagram_type") :
			getString("_UI_EMRDiagram_type") + " " + label;
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

		switch (notification.getFeatureID(EMRDiagram.class)) {
			case ResourcepackagePackage.EMR_DIAGRAM__CLASSIFICATION_RELATIONS:
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_LOCATION_TYPES:
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_MACHINE_TYPES:
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_TOOL_TYPES:
			case ResourcepackagePackage.EMR_DIAGRAM__ABSTRACT_ROLES:
			case ResourcepackagePackage.EMR_DIAGRAM__ROLES:
			case ResourcepackagePackage.EMR_DIAGRAM__LOCATION_TYPES:
			case ResourcepackagePackage.EMR_DIAGRAM__MACHINE_TYPES:
			case ResourcepackagePackage.EMR_DIAGRAM__TOOL_TYPES:
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
				(ResourcepackagePackage.Literals.EMR_DIAGRAM__CLASSIFICATION_RELATIONS,
				 ResourcepackageFactory.eINSTANCE.createEMRClassificationRelation()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcepackagePackage.Literals.EMR_DIAGRAM__ABSTRACT_LOCATION_TYPES,
				 ResourcepackageFactory.eINSTANCE.createEMRAbstractLocationType()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcepackagePackage.Literals.EMR_DIAGRAM__ABSTRACT_MACHINE_TYPES,
				 ResourcepackageFactory.eINSTANCE.createEMRAbstractMachineType()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcepackagePackage.Literals.EMR_DIAGRAM__ABSTRACT_TOOL_TYPES,
				 ResourcepackageFactory.eINSTANCE.createEMRAbstractToolType()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcepackagePackage.Literals.EMR_DIAGRAM__ABSTRACT_ROLES,
				 ResourcepackageFactory.eINSTANCE.createEMRAbstractRole()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcepackagePackage.Literals.EMR_DIAGRAM__ROLES,
				 ResourcepackageFactory.eINSTANCE.createEMRRole()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcepackagePackage.Literals.EMR_DIAGRAM__LOCATION_TYPES,
				 ResourcepackageFactory.eINSTANCE.createEMRLocationType()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcepackagePackage.Literals.EMR_DIAGRAM__MACHINE_TYPES,
				 ResourcepackageFactory.eINSTANCE.createEMRMachineType()));

		newChildDescriptors.add
			(createChildParameter
				(ResourcepackagePackage.Literals.EMR_DIAGRAM__TOOL_TYPES,
				 ResourcepackageFactory.eINSTANCE.createEMRToolType()));
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
