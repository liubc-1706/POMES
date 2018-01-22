package newpmbe.product.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import newpmbe.product.diagram.edit.parts.EMPArtifactEditPart;
import newpmbe.product.diagram.edit.parts.EMPDiagramEditPart;
import newpmbe.product.diagram.edit.parts.EMPDocumentEditPart;
import newpmbe.product.diagram.edit.parts.EMPFormEditPart;
import newpmbe.product.diagram.edit.parts.EMPMessageEditPart;
import newpmbe.product.diagram.edit.parts.EMPOtherEditPart;
import newpmbe.product.diagram.edit.parts.EMPProductPackageEditPart;

import newpmbe.product.diagram.part.NewPMBEVisualIDRegistry;

import org.eclipse.core.resources.IFile;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.jface.viewers.Viewer;

import org.eclipse.ui.IMemento;

import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class NewPMBENavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	public void dispose() {
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
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
					.getContents(), EMPDiagramEditPart.MODEL_ID), file));
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

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (NewPMBEVisualIDRegistry.getVisualID(view)) {
		case EMPDiagramEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getEMPDiagram_1000ToEMPArtifact_2001Children(view,
					parentElement));
			result.addAll(getEMPDiagram_1000ToEMPDocument_2002Children(view,
					parentElement));
			result.addAll(getEMPDiagram_1000ToEMPMessage_2003Children(view,
					parentElement));
			result.addAll(getEMPDiagram_1000ToEMPOther_2004Children(view,
					parentElement));
			result.addAll(getEMPDiagram_1000ToEMPProductPackage_2005Children(
					view, parentElement));
			result.addAll(getEMPDiagram_1000ToEMPForm_2006Children(view,
					parentElement));
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
	private Collection getEMPDiagram_1000ToEMPProductPackage_2005Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPProductPackageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPProductPackage_2005ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPProductPackage_2005ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPMessage_2003Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPMessageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPMessage_2003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPMessage_2003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDocument_2002Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDocumentEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDocument_2002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDocument_2002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPForm_2006Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPFormEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPForm_2006ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPForm_2006ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPOther_2004Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPOtherEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPOther_2004ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPOther_2004ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPArtifact_2001Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPArtifactEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPArtifact_2001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPArtifact_2001ChildrenLeaf(View view) {
		return false;
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
	 * @generated
	 */
	private Collection selectViewsByType(Collection views, String type) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
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
		return EMPDiagramEditPart.MODEL_ID.equals(NewPMBEVisualIDRegistry
				.getModelID(view));
	}

}
