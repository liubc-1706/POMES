package newpmbe.organization.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import newpmbe.organization.diagram.edit.parts.EMOAssociationRelation2EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelation3EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelation4EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelationEditPart;
import newpmbe.organization.diagram.edit.parts.EMOComposeRelationEditPart;
import newpmbe.organization.diagram.edit.parts.EMODiagramEditPart;
import newpmbe.organization.diagram.edit.parts.EMOResourceGroupTypeEditPart;
//import newpmbe.organization.diagram.edit.parts.EMOGroupTypeEditPart;
import newpmbe.organization.diagram.edit.parts.EMRRoleEditPart;

import newpmbe.organization.diagram.part.NewPMBEVisualIDRegistry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import org.eclipse.gmf.runtime.diagram.core.DiagramEditingDomainFactory;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.eclipse.ui.part.FileEditorInput;

/**
 * @generated NOT
 */
public class NewPMBENavigatorContentProvider implements ICommonContentProvider{

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	// added by zhangpeng
	private static final String organizationFileExtension = ".organization_diagram";
	private static TreeViewer viewer = null;
	private static HashMap<IResource, NewPMBENavigatorItem> hashMap = new HashMap<IResource, NewPMBENavigatorItem>();

	private IWorkbenchPage activePage;
	//end added by zhangpeng
	
	/**
	 * @generated
	 */
	public void dispose() {
	}

	/**
	 * @generated NOT
	 * added by zhangpeng
	 */
	public static HashMap getHashMap() {
		return hashMap;
	}

	/**
	 * @generated NOT
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = (TreeViewer) viewer;
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated NOT
	 */
	public Object[] getChildren(Object parentElement) {
		//added by zhangpeng
		if (parentElement instanceof IProject) {
			IProject project = (IProject) parentElement;

			//changed by zhangpeng-改变了工程属性，为每个工程项目增加了后缀，但是要对用户透明
			String projectExtension = project.getFileExtension();
			String projectName = project.getName().substring(0,
					project.getName().length() - projectExtension.length() - 1);
			IFile file = project.getFile(projectName
					+ organizationFileExtension);
			//end changed by zhangpeng

			//如果文件还未被创建
			if (!file.exists())
				return EMPTY_ARRAY;
			AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) createEditingDomain();
			editingDomain.setResourceToReadOnlyMap(new HashMap() {
				public Object get(Object key) {
					if (!containsKey(key)) {
						put(key, Boolean.TRUE);
					}
					return super.get(key);
				}
			});
			ResourceSet resourceSet = editingDomain.getResourceSet();

			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = resourceSet.getResource(fileURI, true);
			Collection result = new ArrayList();
			result.addAll(createNavigatorItems(selectViewsByType(resource
					.getContents(), EMODiagramEditPart.MODEL_ID), file));
			ArrayList list = (ArrayList) result;
			for (int i = 0; i < result.size(); i++) {
				if (list.get(i) instanceof NewPMBENavigatorItem) {
					NewPMBENavigatorItem navigatorItem = (NewPMBENavigatorItem) list
							.get(i);
					if (navigatorItem.isLeaf()
							|| !isOwnView(navigatorItem.getView())) {
						return EMPTY_ARRAY;
					}
					hashMap.put(project, navigatorItem);
					Object[] array = getViewChildren(navigatorItem.getView(),
							parentElement);
					return array;
				}
			}
			return result.toArray();
		}
		//end added by zhangpeng
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) GMFEditingDomainFactory.INSTANCE
					.createEditingDomain();
			editingDomain.setResourceToReadOnlyMap(new HashMap() {
				public Object get(Object key) {
					if (!containsKey(key)) {
						put(key, Boolean.TRUE);
					}
					return super.get(key);
				}
			});
			ResourceSet resourceSet = editingDomain.getResourceSet();

			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = resourceSet.getResource(fileURI, true);

			Collection result = new ArrayList();
			result.addAll(createNavigatorItems(selectViewsByType(resource
					.getContents(), EMODiagramEditPart.MODEL_ID), file));
			return result.toArray();
		}

		if (parentElement instanceof NewPMBENavigatorGroup) {
			NewPMBENavigatorGroup group = (NewPMBENavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof NewPMBENavigatorItem) {
			NewPMBENavigatorItem navigatorItem = (NewPMBENavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		// Due to plugin.xml content will be called only for "own" views
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (NewPMBEVisualIDRegistry.getVisualID(view)) {
		case EMOResourceGroupTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMOResourceGroupType_2003ToEMOComposeRelation_4001InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMOResourceGroupType_2003ToEMOComposeRelation_4001OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMOResourceGroupType_2003ToEMOAssociationRelation_4002InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMOResourceGroupType_2003ToEMOAssociationRelation_4002OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMOResourceGroupType_2003ToEMOAssociationRelation_4004InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMOResourceGroupType_2003ToEMOAssociationRelation_4005OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMRRoleEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMRRole_2004ToEMOAssociationRelation_4003InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMRRole_2004ToEMOAssociationRelation_4003OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMRRole_2004ToEMOAssociationRelation_4004OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMRRole_2004ToEMOAssociationRelation_4005InSource(
							view, incominglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMODiagramEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result
					.addAll(getEMODiagram_1000ToEMOResourceGroupType_2003Children(
							view, parentElement));
			result.addAll(getEMODiagram_1000ToEMRRole_2004Children(view,
					parentElement));
			NewPMBENavigatorGroup links = new NewPMBENavigatorGroup("links",
					"icons/linksNavigatorGroup.gif", parentElement);
			links
					.addChildren(getEMODiagram_1000ToEMOComposeRelation_4001Children(
							view, links));
			links
					.addChildren(getEMODiagram_1000ToEMOAssociationRelation_4002Children(
							view, links));
			links
					.addChildren(getEMODiagram_1000ToEMOAssociationRelation_4003Children(
							view, links));
			links
					.addChildren(getEMODiagram_1000ToEMOAssociationRelation_4004Children(
							view, links));
			links
					.addChildren(getEMODiagram_1000ToEMOAssociationRelation_4005Children(
							view, links));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}
		case EMOComposeRelationEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMOComposeRelation_4001ToEMOResourceGroupType_2003OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMOComposeRelation_4001ToEMOResourceGroupType_2003InSource(
							(Edge) view, source));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		case EMOAssociationRelationEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMOAssociationRelation_4002ToEMOResourceGroupType_2003OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMOAssociationRelation_4002ToEMOResourceGroupType_2003InSource(
							(Edge) view, source));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		case EMOAssociationRelation2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMOAssociationRelation_4003ToEMRRole_2004OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMOAssociationRelation_4003ToEMRRole_2004InSource(
							(Edge) view, source));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		case EMOAssociationRelation3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMOAssociationRelation_4004ToEMOResourceGroupType_2003OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMOAssociationRelation_4004ToEMRRole_2004InSource(
							(Edge) view, source));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		case EMOAssociationRelation4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMOAssociationRelation_4005ToEMRRole_2004OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMOAssociationRelation_4005ToEMOResourceGroupType_2003InSource(
							(Edge) view, source));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof NewPMBEAbstractNavigatorItem) {
			NewPMBEAbstractNavigatorItem abstractNavigatorItem = (NewPMBEAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	private Collection getEMODiagram_1000ToEMOAssociationRelation_4002Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOAssociationRelationEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMODiagram_1000ToEMOAssociationRelation_4002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMODiagram_1000ToEMOAssociationRelation_4002ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMOResourceGroupType_2003ToEMOAssociationRelation_4002OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOAssociationRelationEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMOResourceGroupType_2003ToEMOAssociationRelation_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOResourceGroupType_2003ToEMOAssociationRelation_4002OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOAssociationRelation_4005ToEMRRole_2004OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRRoleEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMOAssociationRelation_4005ToEMRRole_2004OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOAssociationRelation_4005ToEMRRole_2004OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOAssociationRelation_4005ToEMOResourceGroupType_2003InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMOResourceGroupTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMOAssociationRelation_4005ToEMOResourceGroupType_2003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOAssociationRelation_4005ToEMOResourceGroupType_2003InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOComposeRelation_4001ToEMOResourceGroupType_2003OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMOResourceGroupTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMOComposeRelation_4001ToEMOResourceGroupType_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOComposeRelation_4001ToEMOResourceGroupType_2003OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMODiagram_1000ToEMOResourceGroupType_2003Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOResourceGroupTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMODiagram_1000ToEMOResourceGroupType_2003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMODiagram_1000ToEMOResourceGroupType_2003ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMODiagram_1000ToEMRRole_2004Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRRoleEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMODiagram_1000ToEMRRole_2004ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMODiagram_1000ToEMRRole_2004ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMRRole_2004ToEMOAssociationRelation_4005InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOAssociationRelation4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRRole_2004ToEMOAssociationRelation_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRRole_2004ToEMOAssociationRelation_4005InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMODiagram_1000ToEMOAssociationRelation_4004Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOAssociationRelation3EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMODiagram_1000ToEMOAssociationRelation_4004ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMODiagram_1000ToEMOAssociationRelation_4004ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMOAssociationRelation_4003ToEMRRole_2004OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRRoleEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMOAssociationRelation_4003ToEMRRole_2004OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOAssociationRelation_4003ToEMRRole_2004OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRRole_2004ToEMOAssociationRelation_4003OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOAssociationRelation2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRRole_2004ToEMOAssociationRelation_4003OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRRole_2004ToEMOAssociationRelation_4003OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOAssociationRelation_4003ToEMRRole_2004InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRRoleEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMOAssociationRelation_4003ToEMRRole_2004InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOAssociationRelation_4003ToEMRRole_2004InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRRole_2004ToEMOAssociationRelation_4004OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOAssociationRelation3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRRole_2004ToEMOAssociationRelation_4004OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRRole_2004ToEMOAssociationRelation_4004OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOResourceGroupType_2003ToEMOAssociationRelation_4005OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOAssociationRelation4EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMOResourceGroupType_2003ToEMOAssociationRelation_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOResourceGroupType_2003ToEMOAssociationRelation_4005OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOResourceGroupType_2003ToEMOAssociationRelation_4002InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOAssociationRelationEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMOResourceGroupType_2003ToEMOAssociationRelation_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOResourceGroupType_2003ToEMOAssociationRelation_4002InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMODiagram_1000ToEMOAssociationRelation_4005Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOAssociationRelation4EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMODiagram_1000ToEMOAssociationRelation_4005ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMODiagram_1000ToEMOAssociationRelation_4005ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMOResourceGroupType_2003ToEMOComposeRelation_4001InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOComposeRelationEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMOResourceGroupType_2003ToEMOComposeRelation_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOResourceGroupType_2003ToEMOComposeRelation_4001InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMODiagram_1000ToEMOComposeRelation_4001Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOComposeRelationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMODiagram_1000ToEMOComposeRelation_4001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMODiagram_1000ToEMOComposeRelation_4001ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMRRole_2004ToEMOAssociationRelation_4003InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOAssociationRelation2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRRole_2004ToEMOAssociationRelation_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRRole_2004ToEMOAssociationRelation_4003InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOAssociationRelation_4002ToEMOResourceGroupType_2003OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMOResourceGroupTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMOAssociationRelation_4002ToEMOResourceGroupType_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOAssociationRelation_4002ToEMOResourceGroupType_2003OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMODiagram_1000ToEMOAssociationRelation_4003Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOAssociationRelation2EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMODiagram_1000ToEMOAssociationRelation_4003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMODiagram_1000ToEMOAssociationRelation_4003ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMOComposeRelation_4001ToEMOResourceGroupType_2003InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMOResourceGroupTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMOComposeRelation_4001ToEMOResourceGroupType_2003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOComposeRelation_4001ToEMOResourceGroupType_2003InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOAssociationRelation_4002ToEMOResourceGroupType_2003InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMOResourceGroupTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMOAssociationRelation_4002ToEMOResourceGroupType_2003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOAssociationRelation_4002ToEMOResourceGroupType_2003InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOAssociationRelation_4004ToEMOResourceGroupType_2003OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMOResourceGroupTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMOAssociationRelation_4004ToEMOResourceGroupType_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOAssociationRelation_4004ToEMOResourceGroupType_2003OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOResourceGroupType_2003ToEMOAssociationRelation_4004InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOAssociationRelation3EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMOResourceGroupType_2003ToEMOAssociationRelation_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOResourceGroupType_2003ToEMOAssociationRelation_4004InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOAssociationRelation_4004ToEMRRole_2004InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRRoleEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMOAssociationRelation_4004ToEMRRole_2004InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOAssociationRelation_4004ToEMRRole_2004InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOResourceGroupType_2003ToEMOComposeRelation_4001OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOComposeRelationEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMOResourceGroupType_2003ToEMOComposeRelation_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOResourceGroupType_2003ToEMOComposeRelation_4001OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getLinksSourceByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& !isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getLinksTargetByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getTarget();
			if (type.equals(nextEdgeSource.getType())
					&& !isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getOutgoingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getIncomingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getChildrenByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getDiagramLinksByType(Collection diagrams, String type) {
		Collection result = new ArrayList();
		for (Iterator it = diagrams.iterator(); it.hasNext();) {
			Diagram nextDiagram = (Diagram) it.next();
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private Collection selectViewsByType(Collection views, String type) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			Object obj = it.next();
			if(obj instanceof View){
				View nextView = (View) obj;
				if (type.equals(nextView.getType()) && isOwnView(nextView)) {
					result.add(nextView);
				}
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent) {
		Collection result = new ArrayList();
		createNavigatorItems(views, parent, result, false);
		return result;
	}

	/**
	 * @generated
	 */
	private void createNavigatorItems(Collection views, Object parent,
			Collection result, boolean isLeafs) {
		for (Iterator it = views.iterator(); it.hasNext();) {
			result.add(new NewPMBENavigatorItem((View) it.next(), parent,
					isLeafs));
		}
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return EMODiagramEditPart.MODEL_ID.equals(NewPMBEVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection getForeignShortcuts(Diagram diagram, Object parent) {
		Collection result = new ArrayList();
		for (Iterator it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent);
	}

	//added by zhangpeng
	protected TransactionalEditingDomain createEditingDomain() {
		String editingDomainID = "newpmbe.organization.diagram.EditingDomain";
		if (editingDomainID != null) {
			TransactionalEditingDomain editingDomain = TransactionalEditingDomain.Registry.INSTANCE
					.getEditingDomain(editingDomainID);
			if (editingDomain != null) {
				return editingDomain;
			}
		}
		TransactionalEditingDomain editingDomain = DiagramEditingDomainFactory
				.getInstance().createEditingDomain();
		editingDomain.setID(editingDomainID);
		return editingDomain;
	}

	public static TreeViewer getViewer() {
//		IViewPart part = getActivePage().findView("org.eclipse.ui.navigator.ProjectExplorer");
//		if(part == null)
//			return null;
//		CommonNavigator navigator = (CommonNavigator)part;
//		return navigator.getCommonViewer();
		return viewer;
	}
	
	public IWorkbenchPage getActivePage(){
		if(activePage == null){
			activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		}
		return activePage;
	}
	//end added by zhangpeng

	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		if(!(part instanceof DiagramDocumentEditor))
			return;
		Object oldInput = getViewer().getInput();
		DiagramDocumentEditor editor = (DiagramDocumentEditor)part;

		IFileEditorInput input = (IFileEditorInput)editor.getEditorInput();
		IFile file = input.getFile();
		IProject project = file.getProject();
		this.inputChanged(getViewer(), oldInput, project);
	}
	
}
