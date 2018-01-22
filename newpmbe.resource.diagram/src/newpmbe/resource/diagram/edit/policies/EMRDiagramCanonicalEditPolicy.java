package newpmbe.resource.diagram.edit.policies;

import java.util.List;
import java.util.Collection;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.emf.ecore.EObject;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import newpmbe.resource.diagram.edit.parts.EMRAbstractLocationTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractMachineTypeEditPart;
//import newpmbe.resource.diagram.edit.parts.EMRAbstractRoleEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractToolTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelation2EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelation3EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelation4EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelation5EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelation6EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationEditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship2EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship3EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship4EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship5EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship6EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship7EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship8EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationshipEditPart;
import newpmbe.resource.diagram.edit.parts.EMRDiagramEditPart;
import newpmbe.resource.diagram.edit.parts.EMRLocationTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRMachineTypeEditPart;
//import newpmbe.resource.diagram.edit.parts.EMRRoleEditPart;
import newpmbe.resource.diagram.edit.parts.EMRToolTypeEditPart;

import newpmbe.resource.diagram.part.NewPMBEVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gef.EditPart;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;

import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalConnectionEditPolicy;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;

import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import vpml.resourcepackage.EMRClassificationRelation;
//import vpml.resourcepackage.EMRClassificationRelationship;
import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * @generated
 */
public class EMRDiagramCanonicalEditPolicy extends
		CanonicalConnectionEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		List result = new LinkedList();
		EObject modelObject = ((View) getHost().getModel()).getElement();
		View viewObject = (View) getHost().getModel();
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((EMRDiagram) modelObject)
				.getAbstractToolTypes().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMRAbstractToolTypeEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMRDiagram) modelObject)
				.getAbstractLocationTypes().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMRAbstractLocationTypeEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMRDiagram) modelObject)
				.getAbstractMachineTypes().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMRAbstractMachineTypeEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMRDiagram) modelObject).getLocationTypes()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMRLocationTypeEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMRDiagram) modelObject).getMachineTypes()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMRMachineTypeEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMRDiagram) modelObject).getToolTypes()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMRToolTypeEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		return view.isSetElement() && view.getElement() != null
				&& view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected List getSemanticConnectionsList() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	protected EObject getSourceElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected EObject getTargetElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected boolean shouldIncludeConnection(Edge connector,
			Collection children) {
		return false;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		List createdViews = new LinkedList();
		createdViews.addAll(refreshSemanticChildren());
		List createdConnectionViews = new LinkedList();
		createdConnectionViews.addAll(refreshSemanticConnections());
		createdConnectionViews.addAll(refreshConnections());

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host()
					.getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);
		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Collection myLinkDescriptors = new LinkedList();

	/**
	 * @generated
	 */
	private Map myEObject2ViewMap = new HashMap();

	/**
	 * @generated
	 */
	private Collection refreshConnections() {
		try {
			collectAllLinks(getDiagram());
			Collection existingLinks = new LinkedList(getDiagram().getEdges());
			for (Iterator diagramLinks = existingLinks.iterator(); diagramLinks
					.hasNext();) {
				Edge nextDiagramLink = (Edge) diagramLinks.next();
				EObject diagramLinkObject = nextDiagramLink.getElement();
				EObject diagramLinkSrc = nextDiagramLink.getSource()
						.getElement();
				EObject diagramLinkDst = nextDiagramLink.getTarget()
						.getElement();
				int diagramLinkVisualID = NewPMBEVisualIDRegistry
						.getVisualID(nextDiagramLink);
				for (Iterator modelLinkDescriptors = myLinkDescriptors
						.iterator(); modelLinkDescriptors.hasNext();) {
					LinkDescriptor nextLinkDescriptor = (LinkDescriptor) modelLinkDescriptors
							.next();
					if (diagramLinkObject == nextLinkDescriptor
							.getLinkElement()
							&& diagramLinkSrc == nextLinkDescriptor.getSource()
							&& diagramLinkDst == nextLinkDescriptor
									.getDestination()
							&& diagramLinkVisualID == nextLinkDescriptor
									.getVisualID()) {
						diagramLinks.remove();
						modelLinkDescriptors.remove();
					}
				}
			}
			deleteViews(existingLinks.iterator());
			return createConnections(myLinkDescriptors);
		} finally {
			myLinkDescriptors.clear();
			myEObject2ViewMap.clear();
		}
	}

	/**
	 * @generated
	 */
	private void collectAllLinks(View view) {
		EObject modelElement = view.getElement();
		int diagramElementVisualID = NewPMBEVisualIDRegistry.getVisualID(view);
		switch (diagramElementVisualID) {
		case EMRAbstractToolTypeEditPart.VISUAL_ID:
		case EMRAbstractLocationTypeEditPart.VISUAL_ID:
		case EMRAbstractMachineTypeEditPart.VISUAL_ID:
		case EMRLocationTypeEditPart.VISUAL_ID:
		case EMRMachineTypeEditPart.VISUAL_ID:
		case EMRToolTypeEditPart.VISUAL_ID:
		case EMRDiagramEditPart.VISUAL_ID: {
			myEObject2ViewMap.put(modelElement, view);
			storeLinks(modelElement, getDiagram());
		}
		default: {
		}
			for (Iterator children = view.getChildren().iterator(); children
					.hasNext();) {
				View childView = (View) children.next();
				collectAllLinks(childView);
			}
		}
	}

	/**
	 * @generated
	 */
	private Collection createConnections(Collection linkDescriptors) {
		if (linkDescriptors.isEmpty()) {
			return Collections.EMPTY_LIST;
		}
		List adapters = new LinkedList();
		for (Iterator linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator
				.hasNext();) {
			final LinkDescriptor nextLinkDescriptor = (LinkDescriptor) linkDescriptorsIterator
					.next();
			EditPart sourceEditPart = getEditPartFor(nextLinkDescriptor
					.getSource());
			EditPart targetEditPart = getEditPartFor(nextLinkDescriptor
					.getDestination());
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(), null,
					ViewUtil.APPEND, false, ((IGraphicalEditPart) getHost())
							.getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(
					descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getEditPartFor(EObject modelElement) {
		View view = (View) myEObject2ViewMap.get(modelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(
					view);
		}
		return null;
	}

	/**
	 *@generated
	 */
	private void storeLinks(EObject container, Diagram diagram) {
		EClass containerMetaclass = container.eClass();
		storeFeatureModelFacetLinks(container, containerMetaclass, diagram);
		storeTypeModelFacetLinks(container, containerMetaclass);
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks(EObject container,
			EClass containerMetaclass) {
		storeTypeModelFacetLinks_EMRClassificationRelation_4009(container,
				containerMetaclass);
		storeTypeModelFacetLinks_EMRClassificationRelation_4010(container,
				containerMetaclass);
		storeTypeModelFacetLinks_EMRClassificationRelation_4011(container,
				containerMetaclass);
		storeTypeModelFacetLinks_EMRClassificationRelation_4012(container,
				containerMetaclass);
		storeTypeModelFacetLinks_EMRClassificationRelation_4013(container,
				containerMetaclass);
		storeTypeModelFacetLinks_EMRClassificationRelation_4014(container,
				containerMetaclass);
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_EMRClassificationRelation_4009(
			EObject container, EClass containerMetaclass) {
		if (ResourcepackagePackage.eINSTANCE.getEMRDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMRDiagram) container)
					.getClassificationRelations().iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMRClassificationRelationEditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMRClassificationRelation) nextValue)
							.getTargetAbsLocationType();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMRClassificationRelation) nextValue)
								.getSourceAbsLocationType();
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst,
									nextValue, linkVID));
						}
					}
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_EMRClassificationRelation_4010(
			EObject container, EClass containerMetaclass) {
		if (ResourcepackagePackage.eINSTANCE.getEMRDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMRDiagram) container)
					.getClassificationRelations().iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMRClassificationRelation2EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMRClassificationRelation) nextValue)
							.getLocationType();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMRClassificationRelation) nextValue)
								.getSourceAbsLocationType();
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst,
									nextValue, linkVID));
						}
					}
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_EMRClassificationRelation_4011(
			EObject container, EClass containerMetaclass) {
		if (ResourcepackagePackage.eINSTANCE.getEMRDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMRDiagram) container)
					.getClassificationRelations().iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMRClassificationRelation3EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMRClassificationRelation) nextValue)
							.getTargetAbsMachineType();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMRClassificationRelation) nextValue)
								.getSourceAbsMachineType();
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst,
									nextValue, linkVID));
						}
					}
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_EMRClassificationRelation_4012(
			EObject container, EClass containerMetaclass) {
		if (ResourcepackagePackage.eINSTANCE.getEMRDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMRDiagram) container)
					.getClassificationRelations().iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMRClassificationRelation4EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMRClassificationRelation) nextValue)
							.getMachineType();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMRClassificationRelation) nextValue)
								.getSourceAbsMachineType();
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst,
									nextValue, linkVID));
						}
					}
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_EMRClassificationRelation_4013(
			EObject container, EClass containerMetaclass) {
		if (ResourcepackagePackage.eINSTANCE.getEMRDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMRDiagram) container)
					.getClassificationRelations().iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMRClassificationRelation5EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMRClassificationRelation) nextValue)
							.getTargetAbsToolType();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMRClassificationRelation) nextValue)
								.getSourceAbsToolType();
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst,
									nextValue, linkVID));
						}
					}
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_EMRClassificationRelation_4014(
			EObject container, EClass containerMetaclass) {
		if (ResourcepackagePackage.eINSTANCE.getEMRDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMRDiagram) container)
					.getClassificationRelations().iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMRClassificationRelation6EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMRClassificationRelation) nextValue)
							.getToolType();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMRClassificationRelation) nextValue)
								.getSourceAbsToolType();
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst,
									nextValue, linkVID));
						}
					}
				}
			}
		}
	}

	/**
	 *@generated
	 */
	private void storeFeatureModelFacetLinks(EObject container,
			EClass containerMetaclass, Diagram diagram) {

	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

	/**
	 * @generated
	 */
	private class LinkDescriptor {

		/**
		 * @generated
		 */
		private EObject mySource;

		/**
		 * @generated
		 */
		private EObject myDestination;

		/**
		 * @generated
		 */
		private EObject myLinkElement;

		/**
		 * @generated
		 */
		private int myVisualID;

		/**
		 * @generated
		 */
		private IAdaptable mySemanticAdapter;

		/**
		 * @generated
		 */
		protected LinkDescriptor(EObject source, EObject destination,
				EObject linkElement, int linkVID) {
			this(source, destination, linkVID);
			myLinkElement = linkElement;
			mySemanticAdapter = new EObjectAdapter(linkElement);
		}

		/**
		 * @generated
		 */
		protected LinkDescriptor(EObject source, EObject destination,
				IElementType elementType, int linkVID) {
			this(source, destination, linkVID);
			myLinkElement = null;
			final IElementType elementTypeCopy = elementType;
			mySemanticAdapter = new IAdaptable() {
				public Object getAdapter(Class adapter) {
					if (IElementType.class.equals(adapter)) {
						return elementTypeCopy;
					}
					return null;
				}
			};
		}

		/**
		 * @generated
		 */
		private LinkDescriptor(EObject source, EObject destination, int linkVID) {
			mySource = source;
			myDestination = destination;
			myVisualID = linkVID;
		}

		/**
		 * @generated
		 */
		protected EObject getSource() {
			return mySource;
		}

		/**
		 * @generated
		 */
		protected EObject getDestination() {
			return myDestination;
		}

		/**
		 * @generated
		 */
		protected EObject getLinkElement() {
			return myLinkElement;
		}

		/**
		 * @generated
		 */
		protected int getVisualID() {
			return myVisualID;
		}

		/**
		 * @generated
		 */
		protected IAdaptable getSemanticAdapter() {
			return mySemanticAdapter;
		}
	}

}
