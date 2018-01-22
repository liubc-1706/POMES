package newpmbe.process.diagram.edit.policies;

import java.util.List;
import java.util.Collection;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.emf.ecore.EObject;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import newpmbe.process.diagram.edit.parts.EMOResourceGroupTypeEditPart;
//import newpmbe.process.diagram.edit.parts.EMOGroupTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMPArtifactEditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow10EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow11EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow12EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow13EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow14EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow15EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow16EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow2EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow3EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow4EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow5EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow6EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow7EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow8EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow9EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlowEditPart;
import newpmbe.process.diagram.edit.parts.EMPAutoActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPAutoBatchActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPClockEditPart;
import newpmbe.process.diagram.edit.parts.EMPClockFlowEditPart;
import newpmbe.process.diagram.edit.parts.EMPCompActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow10EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow11EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow12EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow13EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow14EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow15EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow16EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow17EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow18EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow2EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow3EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow4EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow5EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow6EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow7EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow8EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow9EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlowEditPart;
import newpmbe.process.diagram.edit.parts.EMPDiagramEditPart;
import newpmbe.process.diagram.edit.parts.EMPDocumentEditPart;
import newpmbe.process.diagram.edit.parts.EMPFormEditPart;
import newpmbe.process.diagram.edit.parts.EMPInAndEditPart;
import newpmbe.process.diagram.edit.parts.EMPInOrEditPart;
import newpmbe.process.diagram.edit.parts.EMPManualBatchActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPMessageEditPart;
//import newpmbe.process.diagram.edit.parts.EMPMileStoneEditPart;
import newpmbe.process.diagram.edit.parts.EMPNormalActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPOtherEditPart;
import newpmbe.process.diagram.edit.parts.EMPOutAndEditPart;
import newpmbe.process.diagram.edit.parts.EMPOutOrEditPart;
import newpmbe.process.diagram.edit.parts.EMPProductPackageEditPart;
import newpmbe.process.diagram.edit.parts.EMPRefFlowEditPart;
import newpmbe.process.diagram.edit.parts.EMRLocationTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMRMachineTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMRRoleEditPart;
import newpmbe.process.diagram.edit.parts.EMRToolTypeEditPart;

import newpmbe.process.diagram.part.NewPMBEVisualIDRegistry;

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

import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPClockFlow;
import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPObject;
import vpml.processpackage.EMPRefFlow;
import vpml.processpackage.ProcesspackagePackage;

import vpml.resourcepackage.EMRDiagram;

/**
 * @generated
 */
public class EMPDiagramCanonicalEditPolicy extends
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
		for (Iterator values = ((EMPDiagram) modelObject)
				.getAutoBatchActivities().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMPAutoBatchActivityEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getOutOrs()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMPOutOrEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getDocuments()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMPDocumentEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getProductPackages()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMPProductPackageEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getNormalActivities()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMPNormalActivityEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getOthers()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMPOtherEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getMessages()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMPMessageEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getCompActivities()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMPCompActivityEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getOutAnds()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMPOutAndEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject)
				.getManualBatchActivities().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMPManualBatchActivityEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getClocks()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMPClockEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getInAnds()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMPInAndEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getInOrs().iterator(); values
				.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMPInOrEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getAutoActivities()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMPAutoActivityEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getArtifacts()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMPArtifactEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject)
				.getResourceGroupTypes().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMOResourceGroupTypeEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getToolTypes()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMRToolTypeEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getRoles().iterator(); values
				.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMRRoleEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getMachineTypes()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMRMachineTypeEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getLocationTypes()
				.iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMRLocationTypeEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((EMPDiagram) modelObject).getForms().iterator(); values
				.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = NewPMBEVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			if (EMPFormEditPart.VISUAL_ID == nodeVID) {
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
		case EMPAutoBatchActivityEditPart.VISUAL_ID:
		case EMPOutOrEditPart.VISUAL_ID:
		case EMPDocumentEditPart.VISUAL_ID:
		case EMPProductPackageEditPart.VISUAL_ID:
		case EMPNormalActivityEditPart.VISUAL_ID:
		case EMPOtherEditPart.VISUAL_ID:
		case EMPMessageEditPart.VISUAL_ID:
		case EMPCompActivityEditPart.VISUAL_ID:
		case EMPOutAndEditPart.VISUAL_ID:
		case EMPManualBatchActivityEditPart.VISUAL_ID:
		case EMPClockEditPart.VISUAL_ID:
		case EMPInAndEditPart.VISUAL_ID:
		case EMPInOrEditPart.VISUAL_ID:
		case EMPAutoActivityEditPart.VISUAL_ID:
		case EMPArtifactEditPart.VISUAL_ID:
		case EMOResourceGroupTypeEditPart.VISUAL_ID:
		case EMRToolTypeEditPart.VISUAL_ID:
		case EMRRoleEditPart.VISUAL_ID:
		case EMRMachineTypeEditPart.VISUAL_ID:
		case EMRLocationTypeEditPart.VISUAL_ID:
		case EMPFormEditPart.VISUAL_ID:
		case EMPDiagramEditPart.VISUAL_ID: {
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
		storeTypeModelFacetLinks_EMPClockFlow_4001(container,
				containerMetaclass);
		storeTypeModelFacetLinks_EMPAssFlow_4003(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPRefFlow_4004(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4002(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPAssFlow_4006(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPAssFlow_4007(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPAssFlow_4008(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPAssFlow_4009(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPAssFlow_4010(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPAssFlow_4011(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPAssFlow_4012(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPAssFlow_4013(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPAssFlow_4014(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPAssFlow_4015(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPAssFlow_4025(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPAssFlow_4026(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPAssFlow_4027(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPAssFlow_4028(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPAssFlow_4029(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4005(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4016(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4017(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4018(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4019(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4020(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4021(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4022(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4023(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4030(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4031(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4032(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4033(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4034(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4035(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4036(container, containerMetaclass);
		storeTypeModelFacetLinks_EMPDataFlow_4037(container, containerMetaclass);
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_EMPClockFlow_4001(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getClockFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPClockFlowEditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPClockFlow) nextValue)
							.getActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPClockFlow) nextValue)
								.getClock();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4002(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlowEditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceProduct();
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
	private void storeTypeModelFacetLinks_EMPAssFlow_4003(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getAssFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPAssFlowEditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPAssFlow) nextValue)
							.getProduct();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPAssFlow) nextValue)
								.getToolType();
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
	private void storeTypeModelFacetLinks_EMPRefFlow_4004(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getRefFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPRefFlowEditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPRefFlow) nextValue)
							.getActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPRefFlow) nextValue)
								.getProduct();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4005(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow2EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetProduct();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceActivity();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4016(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow3EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetInAnd();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceProduct();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4017(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow4EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetInOr();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceProduct();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4018(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow5EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceInAnd();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4019(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow6EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceInOr();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4020(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow7EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetOutAnd();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceActivity();
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
	private void storeTypeModelFacetLinks_EMPAssFlow_4006(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getAssFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPAssFlow2EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPAssFlow) nextValue)
							.getNormalActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPAssFlow) nextValue)
								.getMachineType();
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
	 * @generated NOT
	 */
	private void storeTypeModelFacetLinks_EMPAssFlow_4007(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getAssFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPAssFlow3EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPObject) nextValue)
							.getCompActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPAssFlow) nextValue)
								.getResourceGroupType();
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
	private void storeTypeModelFacetLinks_EMPAssFlow_4008(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getAssFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPAssFlow4EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPAssFlow) nextValue)
							.getNormalActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPAssFlow) nextValue)
								.getResourceGroupType();
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
	private void storeTypeModelFacetLinks_EMPAssFlow_4009(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getAssFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPAssFlow5EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPAssFlow) nextValue)
							.getAutoBatchActiviy();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPAssFlow) nextValue)
								.getResourceGroupType();
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
	private void storeTypeModelFacetLinks_EMPAssFlow_4010(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getAssFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPAssFlow6EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPAssFlow) nextValue)
							.getAutoActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPAssFlow) nextValue)
								.getResourceGroupType();
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
	private void storeTypeModelFacetLinks_EMPAssFlow_4011(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getAssFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPAssFlow7EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPAssFlow) nextValue)
							.getManualBatchActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPAssFlow) nextValue)
								.getResourceGroupType();
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
	private void storeTypeModelFacetLinks_EMPAssFlow_4012(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getAssFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPAssFlow8EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPAssFlow) nextValue)
							.getAutoActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPAssFlow) nextValue)
								.getMachineType();
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
	private void storeTypeModelFacetLinks_EMPAssFlow_4013(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getAssFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPAssFlow9EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPAssFlow) nextValue)
							.getAutoBatchActiviy();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPAssFlow) nextValue)
								.getMachineType();
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
	private void storeTypeModelFacetLinks_EMPAssFlow_4014(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getAssFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPAssFlow10EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPAssFlow) nextValue)
							.getManualBatchActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPAssFlow) nextValue)
								.getMachineType();
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
	private void storeTypeModelFacetLinks_EMPAssFlow_4015(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getAssFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPAssFlow11EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPAssFlow) nextValue)
							.getNormalActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPAssFlow) nextValue)
								.getLocationType();
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
	private void storeTypeModelFacetLinks_EMPAssFlow_4025(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getAssFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPAssFlow12EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPAssFlow) nextValue)
							.getAutoActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPAssFlow) nextValue)
								.getLocationType();
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
	private void storeTypeModelFacetLinks_EMPAssFlow_4026(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getAssFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPAssFlow13EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPAssFlow) nextValue)
							.getAutoBatchActiviy();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPAssFlow) nextValue)
								.getLocationType();
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
	private void storeTypeModelFacetLinks_EMPAssFlow_4027(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getAssFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPAssFlow14EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPAssFlow) nextValue)
							.getManualBatchActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPAssFlow) nextValue)
								.getLocationType();
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
	private void storeTypeModelFacetLinks_EMPAssFlow_4028(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getAssFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPAssFlow15EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPAssFlow) nextValue)
							.getNormalActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPAssFlow) nextValue)
								.getRole();
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
	private void storeTypeModelFacetLinks_EMPAssFlow_4029(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getAssFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPAssFlow16EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPAssFlow) nextValue)
							.getManualBatchActivity();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPAssFlow) nextValue)
								.getRole();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4021(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow8EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetOutOr();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceActivity();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4022(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow9EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetProduct();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceOutAnd();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4023(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow10EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetProduct();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceOutOr();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4030(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow11EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetOutAnd();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceOutOr();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4031(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow12EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetOutOr();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceOutOr();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4032(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow13EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetOutOr();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceOutAnd();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4033(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow14EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetOutAnd();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceOutAnd();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4034(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow15EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetInAnd();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceInOr();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4035(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow16EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetInOr();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceInOr();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4036(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow17EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetInOr();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceInAnd();
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
	private void storeTypeModelFacetLinks_EMPDataFlow_4037(EObject container,
			EClass containerMetaclass) {
		if (ProcesspackagePackage.eINSTANCE.getEMPDiagram().isSuperTypeOf(
				containerMetaclass)) {
			for (Iterator values = ((EMPDiagram) container).getDataFlows()
					.iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = NewPMBEVisualIDRegistry
						.getLinkWithClassVisualID(nextValue);
				if (EMPDataFlow18EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((EMPDataFlow) nextValue)
							.getTargetInAnd();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((EMPDataFlow) nextValue)
								.getSourceInAnd();
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
