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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import vpml.organizationpackage.OrganizationpackageFactory;

import vpml.processpackage.EMPDiagram;
import vpml.processpackage.ProcesspackageFactory;
import vpml.processpackage.ProcesspackagePackage;

import vpml.provider.EMDiagramItemProvider;
import vpml.provider.NewPMBEEditPlugin;

import vpml.resourcepackage.ResourcepackageFactory;

import vpml.utilpackage.UtilpackageFactory;

/**
 * This is the item provider adapter for a {@link vpml.processpackage.EMPDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMPDiagramItemProvider
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
	public EMPDiagramItemProvider(AdapterFactory adapterFactory) {
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

			addEmoDiagramsPropertyDescriptor(object);
			addEmrDiagramsPropertyDescriptor(object);
			addEmcDiagramPropertyDescriptor(object);
			addEmiDiagramPropertyDescriptor(object);
			addStartedTimePropertyDescriptor(object);
			addDurationTimePropertyDescriptor(object);
			addTimeUnitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	
	/**
	 * This adds a property descriptor for the Duration Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addDurationTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDiagram_durationTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDiagram_durationTime_feature", "_UI_EMPDiagram_type"),
				 ProcesspackagePackage.Literals.EMP_DIAGRAM__DURATION_TIME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}
	/**
	 * This adds a property descriptor for the Emo Diagrams feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmoDiagramsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDiagram_emoDiagrams_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDiagram_emoDiagrams_feature", "_UI_EMPDiagram_type"),
				 ProcesspackagePackage.Literals.EMP_DIAGRAM__EMO_DIAGRAMS,
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
				 getString("_UI_EMPDiagram_emrDiagrams_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDiagram_emrDiagrams_feature", "_UI_EMPDiagram_type"),
				 ProcesspackagePackage.Literals.EMP_DIAGRAM__EMR_DIAGRAMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Emc Diagram feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmcDiagramPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDiagram_emcDiagram_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDiagram_emcDiagram_feature", "_UI_EMPDiagram_type"),
				 ProcesspackagePackage.Literals.EMP_DIAGRAM__EMC_DIAGRAM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_EMPDiagram_emiDiagram_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDiagram_emiDiagram_feature", "_UI_EMPDiagram_type"),
				 ProcesspackagePackage.Literals.EMP_DIAGRAM__EMI_DIAGRAM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Started Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartedTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDiagram_startedTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDiagram_startedTime_feature", "_UI_EMPDiagram_type"),
				 ProcesspackagePackage.Literals.EMP_DIAGRAM__STARTED_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMPDiagram_timeUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMPDiagram_timeUnit_feature", "_UI_EMPDiagram_type"),
				 ProcesspackagePackage.Literals.EMP_DIAGRAM__TIME_UNIT,
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
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__DURATION_TIME);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__IN_ORS);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__PRODUCT_PACKAGES);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__OUT_ANDS);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__DATA_FLOWS);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__CLOCK_FLOWS);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__CLOCKS);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__IN_ANDS);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__NORMAL_ACTIVITIES);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__COMP_ACTIVITIES);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__OUT_ORS);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__ASS_FLOWS);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__REF_FLOWS);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__OTHERS);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__ARTIFACTS);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__FORMS);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__DOCUMENTS);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__AUTO_ACTIVITIES);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__MESSAGES);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__MANUAL_BATCH_ACTIVITIES);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__AUTO_BATCH_ACTIVITIES);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__MACHINE_TYPES);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__ROLES);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__LOCATION_TYPES);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__TOOL_TYPES);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__RESOURCE_GROUP_TYPES);
			childrenFeatures.add(ProcesspackagePackage.Literals.EMP_DIAGRAM__MILE_STONES);
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
	 * This returns EMPDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMPDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((EMPDiagram)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EMPDiagram_type") :
			getString("_UI_EMPDiagram_type") + " " + label;
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

		switch (notification.getFeatureID(EMPDiagram.class)) {
			case ProcesspackagePackage.EMP_DIAGRAM__STARTED_TIME:
			case ProcesspackagePackage.EMP_DIAGRAM__TIME_UNIT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProcesspackagePackage.EMP_DIAGRAM__DURATION_TIME:
			case ProcesspackagePackage.EMP_DIAGRAM__IN_ORS:
			case ProcesspackagePackage.EMP_DIAGRAM__PRODUCT_PACKAGES:
			case ProcesspackagePackage.EMP_DIAGRAM__OUT_ANDS:
			case ProcesspackagePackage.EMP_DIAGRAM__DATA_FLOWS:
			case ProcesspackagePackage.EMP_DIAGRAM__CLOCK_FLOWS:
			case ProcesspackagePackage.EMP_DIAGRAM__CLOCKS:
			case ProcesspackagePackage.EMP_DIAGRAM__IN_ANDS:
			case ProcesspackagePackage.EMP_DIAGRAM__NORMAL_ACTIVITIES:
			case ProcesspackagePackage.EMP_DIAGRAM__COMP_ACTIVITIES:
			case ProcesspackagePackage.EMP_DIAGRAM__OUT_ORS:
			case ProcesspackagePackage.EMP_DIAGRAM__ASS_FLOWS:
			case ProcesspackagePackage.EMP_DIAGRAM__REF_FLOWS:
			case ProcesspackagePackage.EMP_DIAGRAM__OTHERS:
			case ProcesspackagePackage.EMP_DIAGRAM__ARTIFACTS:
			case ProcesspackagePackage.EMP_DIAGRAM__FORMS:
			case ProcesspackagePackage.EMP_DIAGRAM__DOCUMENTS:
			case ProcesspackagePackage.EMP_DIAGRAM__AUTO_ACTIVITIES:
			case ProcesspackagePackage.EMP_DIAGRAM__MESSAGES:
			case ProcesspackagePackage.EMP_DIAGRAM__MANUAL_BATCH_ACTIVITIES:
			case ProcesspackagePackage.EMP_DIAGRAM__AUTO_BATCH_ACTIVITIES:
			case ProcesspackagePackage.EMP_DIAGRAM__MACHINE_TYPES:
			case ProcesspackagePackage.EMP_DIAGRAM__ROLES:
			case ProcesspackagePackage.EMP_DIAGRAM__LOCATION_TYPES:
			case ProcesspackagePackage.EMP_DIAGRAM__TOOL_TYPES:
			case ProcesspackagePackage.EMP_DIAGRAM__RESOURCE_GROUP_TYPES:
			case ProcesspackagePackage.EMP_DIAGRAM__MILE_STONES:
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
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__DURATION_TIME,
				 UtilpackageFactory.eINSTANCE.createDSDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__IN_ORS,
				 ProcesspackageFactory.eINSTANCE.createEMPInOr()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__PRODUCT_PACKAGES,
				 ProcesspackageFactory.eINSTANCE.createEMPProductPackage()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__OUT_ANDS,
				 ProcesspackageFactory.eINSTANCE.createEMPOutAnd()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__DATA_FLOWS,
				 ProcesspackageFactory.eINSTANCE.createEMPDataFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__CLOCK_FLOWS,
				 ProcesspackageFactory.eINSTANCE.createEMPClockFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__CLOCKS,
				 ProcesspackageFactory.eINSTANCE.createEMPClock()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__IN_ANDS,
				 ProcesspackageFactory.eINSTANCE.createEMPInAnd()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__NORMAL_ACTIVITIES,
				 ProcesspackageFactory.eINSTANCE.createEMPNormalActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__COMP_ACTIVITIES,
				 ProcesspackageFactory.eINSTANCE.createEMPCompActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__OUT_ORS,
				 ProcesspackageFactory.eINSTANCE.createEMPOutOr()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__ASS_FLOWS,
				 ProcesspackageFactory.eINSTANCE.createEMPAssFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__REF_FLOWS,
				 ProcesspackageFactory.eINSTANCE.createEMPRefFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__OTHERS,
				 ProcesspackageFactory.eINSTANCE.createEMPOther()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__ARTIFACTS,
				 ProcesspackageFactory.eINSTANCE.createEMPArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__FORMS,
				 ProcesspackageFactory.eINSTANCE.createEMPForm()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__DOCUMENTS,
				 ProcesspackageFactory.eINSTANCE.createEMPDocument()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__AUTO_ACTIVITIES,
				 ProcesspackageFactory.eINSTANCE.createEMPAutoActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__MESSAGES,
				 ProcesspackageFactory.eINSTANCE.createEMPMessage()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__MANUAL_BATCH_ACTIVITIES,
				 ProcesspackageFactory.eINSTANCE.createEMPManualBatchActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__AUTO_BATCH_ACTIVITIES,
				 ProcesspackageFactory.eINSTANCE.createEMPAutoBatchActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__MACHINE_TYPES,
				 ResourcepackageFactory.eINSTANCE.createEMRMachineType()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__ROLES,
				 ResourcepackageFactory.eINSTANCE.createEMRRole()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__LOCATION_TYPES,
				 ResourcepackageFactory.eINSTANCE.createEMRLocationType()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__TOOL_TYPES,
				 ResourcepackageFactory.eINSTANCE.createEMRToolType()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__RESOURCE_GROUP_TYPES,
				 OrganizationpackageFactory.eINSTANCE.createEMOResourceGroupType()));

		newChildDescriptors.add
			(createChildParameter
				(ProcesspackagePackage.Literals.EMP_DIAGRAM__MILE_STONES,
				 ProcesspackageFactory.eINSTANCE.createEMPMileStone()));
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
