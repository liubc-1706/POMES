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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import vpml.infopackage.EMIDiagram;
import vpml.infopackage.InfopackageFactory;
import vpml.infopackage.InfopackagePackage;

import vpml.provider.EMDiagramItemProvider;
import vpml.provider.NewPMBEEditPlugin;

/**
 * This is the item provider adapter for a {@link vpml.infopackage.EMIDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMIDiagramItemProvider
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
	public EMIDiagramItemProvider(AdapterFactory adapterFactory) {
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

			addEmiDiagramPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Emi Diagram feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmiDiagramPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMIDiagram_emiDiagram_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMIDiagram_emiDiagram_feature", "_UI_EMIDiagram_type"),
				 InfopackagePackage.Literals.EMI_DIAGRAM__EMI_DIAGRAM,
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
			childrenFeatures.add(InfopackagePackage.Literals.EMI_DIAGRAM__ARTIFACT);
			childrenFeatures.add(InfopackagePackage.Literals.EMI_DIAGRAM__INAND);
			childrenFeatures.add(InfopackagePackage.Literals.EMI_DIAGRAM__INOR);
			childrenFeatures.add(InfopackagePackage.Literals.EMI_DIAGRAM__STATE_CONNECTOR);
			childrenFeatures.add(InfopackagePackage.Literals.EMI_DIAGRAM__OTHER);
			childrenFeatures.add(InfopackagePackage.Literals.EMI_DIAGRAM__PRODUCT_PACKAGE);
			childrenFeatures.add(InfopackagePackage.Literals.EMI_DIAGRAM__OUTAND);
			childrenFeatures.add(InfopackagePackage.Literals.EMI_DIAGRAM__OUTOR);
			childrenFeatures.add(InfopackagePackage.Literals.EMI_DIAGRAM__REF_FLOW);
			childrenFeatures.add(InfopackagePackage.Literals.EMI_DIAGRAM__DOCUMENT);
			childrenFeatures.add(InfopackagePackage.Literals.EMI_DIAGRAM__DATA_FLOW);
			childrenFeatures.add(InfopackagePackage.Literals.EMI_DIAGRAM__COM_INFO);
			childrenFeatures.add(InfopackagePackage.Literals.EMI_DIAGRAM__MESSAGE);
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
	 * This returns EMIDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMIDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((EMIDiagram)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EMIDiagram_type") :
			getString("_UI_EMIDiagram_type") + " " + label;
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

		switch (notification.getFeatureID(EMIDiagram.class)) {
			case InfopackagePackage.EMI_DIAGRAM__ARTIFACT:
			case InfopackagePackage.EMI_DIAGRAM__INAND:
			case InfopackagePackage.EMI_DIAGRAM__INOR:
			case InfopackagePackage.EMI_DIAGRAM__STATE_CONNECTOR:
			case InfopackagePackage.EMI_DIAGRAM__OTHER:
			case InfopackagePackage.EMI_DIAGRAM__PRODUCT_PACKAGE:
			case InfopackagePackage.EMI_DIAGRAM__OUTAND:
			case InfopackagePackage.EMI_DIAGRAM__OUTOR:
			case InfopackagePackage.EMI_DIAGRAM__REF_FLOW:
			case InfopackagePackage.EMI_DIAGRAM__DOCUMENT:
			case InfopackagePackage.EMI_DIAGRAM__DATA_FLOW:
			case InfopackagePackage.EMI_DIAGRAM__COM_INFO:
			case InfopackagePackage.EMI_DIAGRAM__MESSAGE:
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
				(InfopackagePackage.Literals.EMI_DIAGRAM__ARTIFACT,
				 InfopackageFactory.eINSTANCE.createEMIArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(InfopackagePackage.Literals.EMI_DIAGRAM__INAND,
				 InfopackageFactory.eINSTANCE.createEMIInAnd()));

		newChildDescriptors.add
			(createChildParameter
				(InfopackagePackage.Literals.EMI_DIAGRAM__INOR,
				 InfopackageFactory.eINSTANCE.createEMIInOr()));

		newChildDescriptors.add
			(createChildParameter
				(InfopackagePackage.Literals.EMI_DIAGRAM__STATE_CONNECTOR,
				 InfopackageFactory.eINSTANCE.createEMIStateConnector()));

		newChildDescriptors.add
			(createChildParameter
				(InfopackagePackage.Literals.EMI_DIAGRAM__OTHER,
				 InfopackageFactory.eINSTANCE.createEMIOther()));

		newChildDescriptors.add
			(createChildParameter
				(InfopackagePackage.Literals.EMI_DIAGRAM__PRODUCT_PACKAGE,
				 InfopackageFactory.eINSTANCE.createEMIProductPackage()));

		newChildDescriptors.add
			(createChildParameter
				(InfopackagePackage.Literals.EMI_DIAGRAM__OUTAND,
				 InfopackageFactory.eINSTANCE.createEMIOutAnd()));

		newChildDescriptors.add
			(createChildParameter
				(InfopackagePackage.Literals.EMI_DIAGRAM__OUTOR,
				 InfopackageFactory.eINSTANCE.createEMIOutOr()));

		newChildDescriptors.add
			(createChildParameter
				(InfopackagePackage.Literals.EMI_DIAGRAM__REF_FLOW,
				 InfopackageFactory.eINSTANCE.createEMIRefFlow()));

		newChildDescriptors.add
			(createChildParameter
				(InfopackagePackage.Literals.EMI_DIAGRAM__DOCUMENT,
				 InfopackageFactory.eINSTANCE.createEMIDocument()));

		newChildDescriptors.add
			(createChildParameter
				(InfopackagePackage.Literals.EMI_DIAGRAM__DATA_FLOW,
				 InfopackageFactory.eINSTANCE.createEMIDataFlow()));

		newChildDescriptors.add
			(createChildParameter
				(InfopackagePackage.Literals.EMI_DIAGRAM__COM_INFO,
				 InfopackageFactory.eINSTANCE.createEMIComInfo()));

		newChildDescriptors.add
			(createChildParameter
				(InfopackagePackage.Literals.EMI_DIAGRAM__MESSAGE,
				 InfopackageFactory.eINSTANCE.createEMIMessage()));
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
