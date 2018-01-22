/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.organizationpackage.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import vpml.organizationpackage.util.OrganizationpackageAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganizationpackageItemProviderAdapterFactory extends OrganizationpackageAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection supportedTypes = new ArrayList();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationpackageItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);		
	}

	/**
	 * This keeps track of the one adapter used for all {@link vpml.organizationpackage.EMOResourceGroupType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMOResourceGroupTypeItemProvider emoResourceGroupTypeItemProvider;

	/**
	 * This creates an adapter for a {@link vpml.organizationpackage.EMOResourceGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createEMOResourceGroupTypeAdapter() {
		if (emoResourceGroupTypeItemProvider == null) {
			emoResourceGroupTypeItemProvider = new EMOResourceGroupTypeItemProvider(this);
		}

		return emoResourceGroupTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vpml.organizationpackage.EMORelations} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMORelationsItemProvider emoRelationsItemProvider;

	/**
	 * This creates an adapter for a {@link vpml.organizationpackage.EMORelations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createEMORelationsAdapter() {
		if (emoRelationsItemProvider == null) {
			emoRelationsItemProvider = new EMORelationsItemProvider(this);
		}

		return emoRelationsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vpml.organizationpackage.EMOAssociationRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMOAssociationRelationItemProvider emoAssociationRelationItemProvider;

	/**
	 * This creates an adapter for a {@link vpml.organizationpackage.EMOAssociationRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createEMOAssociationRelationAdapter() {
		if (emoAssociationRelationItemProvider == null) {
			emoAssociationRelationItemProvider = new EMOAssociationRelationItemProvider(this);
		}

		return emoAssociationRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vpml.organizationpackage.EMOComposeRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMOComposeRelationItemProvider emoComposeRelationItemProvider;

	/**
	 * This creates an adapter for a {@link vpml.organizationpackage.EMOComposeRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createEMOComposeRelationAdapter() {
		if (emoComposeRelationItemProvider == null) {
			emoComposeRelationItemProvider = new EMOComposeRelationItemProvider(this);
		}

		return emoComposeRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vpml.organizationpackage.EMODiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMODiagramItemProvider emoDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link vpml.organizationpackage.EMODiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createEMODiagramAdapter() {
		if (emoDiagramItemProvider == null) {
			emoDiagramItemProvider = new EMODiagramItemProvider(this);
		}

		return emoDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vpml.organizationpackage.EMOObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMOObjectItemProvider emoObjectItemProvider;

	/**
	 * This creates an adapter for a {@link vpml.organizationpackage.EMOObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createEMOObjectAdapter() {
		if (emoObjectItemProvider == null) {
			emoObjectItemProvider = new EMOObjectItemProvider(this);
		}

		return emoObjectItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (emoResourceGroupTypeItemProvider != null) emoResourceGroupTypeItemProvider.dispose();
		if (emoRelationsItemProvider != null) emoRelationsItemProvider.dispose();
		if (emoAssociationRelationItemProvider != null) emoAssociationRelationItemProvider.dispose();
		if (emoComposeRelationItemProvider != null) emoComposeRelationItemProvider.dispose();
		if (emoDiagramItemProvider != null) emoDiagramItemProvider.dispose();
		if (emoObjectItemProvider != null) emoObjectItemProvider.dispose();
	}

}
