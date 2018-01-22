package newpmbe.organization.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import newpmbe.organization.diagram.edit.parts.EMODiagramEditPart;
import newpmbe.organization.diagram.edit.parts.EMOResourceGroupTypeEditPart;
//import newpmbe.organization.diagram.edit.parts.EMOGroupTypeEditPart;
import newpmbe.organization.diagram.edit.parts.EMRRoleEditPart;

import newpmbe.organization.diagram.part.NewPMBEDiagramEditorPlugin;

/**
 * @generated
 */
public class NewPMBEModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
//		if (editPart instanceof EMODiagramEditPart) {
//			List types = new ArrayList();
//			types.add(NewPMBEElementTypes.EMOResourceGroupType_2003);
//			types.add(NewPMBEElementTypes.EMRRole_2004);
//			return types;
//		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
//		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
//				.getAdapter(IGraphicalEditPart.class);
//		if (sourceEditPart instanceof EMOResourceGroupTypeEditPart) {
//			List types = new ArrayList();
//			types.add(NewPMBEElementTypes.EMOComposeRelation_4001);
//			types.add(NewPMBEElementTypes.EMOAssociationRelation_4002);
//			types.add(NewPMBEElementTypes.EMOAssociationRelation_4005);
//			return types;
//		}
//		if (sourceEditPart instanceof EMRRoleEditPart) {
//			List types = new ArrayList();
//			types.add(NewPMBEElementTypes.EMOAssociationRelation_4003);
//			types.add(NewPMBEElementTypes.EMOAssociationRelation_4004);
//			return types;
//		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
//		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
//				.getAdapter(IGraphicalEditPart.class);
//		if (targetEditPart instanceof EMOResourceGroupTypeEditPart) {
//			List types = new ArrayList();
//			types.add(NewPMBEElementTypes.EMOComposeRelation_4001);
//			types.add(NewPMBEElementTypes.EMOAssociationRelation_4002);
//			types.add(NewPMBEElementTypes.EMOAssociationRelation_4004);
//			return types;
//		}
//		if (targetEditPart instanceof EMRRoleEditPart) {
//			List types = new ArrayList();
//			types.add(NewPMBEElementTypes.EMOAssociationRelation_4003);
//			types.add(NewPMBEElementTypes.EMOAssociationRelation_4005);
//			return types;
//		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
//		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
//				.getAdapter(IGraphicalEditPart.class);
//		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
//				.getAdapter(IGraphicalEditPart.class);
//		if (sourceEditPart instanceof EMOResourceGroupTypeEditPart) {
//			List types = new ArrayList();
//			if (targetEditPart instanceof EMOResourceGroupTypeEditPart) {
//				types.add(NewPMBEElementTypes.EMOComposeRelation_4001);
//			}
//			if (targetEditPart instanceof EMOResourceGroupTypeEditPart) {
//				types.add(NewPMBEElementTypes.EMOAssociationRelation_4002);
//			}
//			if (targetEditPart instanceof EMRRoleEditPart) {
//				types.add(NewPMBEElementTypes.EMOAssociationRelation_4005);
//			}
//			return types;
//		}
//		if (sourceEditPart instanceof EMRRoleEditPart) {
//			List types = new ArrayList();
//			if (targetEditPart instanceof EMRRoleEditPart) {
//				types.add(NewPMBEElementTypes.EMOAssociationRelation_4003);
//			}
//			if (targetEditPart instanceof EMOResourceGroupTypeEditPart) {
//				types.add(NewPMBEElementTypes.EMOAssociationRelation_4004);
//			}
//			return types;
//		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
//		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
//				.getAdapter(IGraphicalEditPart.class);
//		if (targetEditPart instanceof EMOResourceGroupTypeEditPart) {
//			List types = new ArrayList();
//			if (relationshipType == NewPMBEElementTypes.EMOComposeRelation_4001) {
//				types.add(NewPMBEElementTypes.EMOResourceGroupType_2003);
//			}
//			if (relationshipType == NewPMBEElementTypes.EMOAssociationRelation_4002) {
//				types.add(NewPMBEElementTypes.EMOResourceGroupType_2003);
//			}
//			if (relationshipType == NewPMBEElementTypes.EMOAssociationRelation_4004) {
//				types.add(NewPMBEElementTypes.EMRRole_2004);
//			}
//			return types;
//		}
//		if (targetEditPart instanceof EMRRoleEditPart) {
//			List types = new ArrayList();
//			if (relationshipType == NewPMBEElementTypes.EMOAssociationRelation_4003) {
//				types.add(NewPMBEElementTypes.EMRRole_2004);
//			}
//			if (relationshipType == NewPMBEElementTypes.EMOAssociationRelation_4005) {
//				types.add(NewPMBEElementTypes.EMOResourceGroupType_2003);
//			}
//			return types;
//		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
//		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
//				.getAdapter(IGraphicalEditPart.class);
//		if (sourceEditPart instanceof EMOResourceGroupTypeEditPart) {
//			List types = new ArrayList();
//			if (relationshipType == NewPMBEElementTypes.EMOComposeRelation_4001) {
//				types.add(NewPMBEElementTypes.EMOResourceGroupType_2003);
//			}
//			if (relationshipType == NewPMBEElementTypes.EMOAssociationRelation_4002) {
//				types.add(NewPMBEElementTypes.EMOResourceGroupType_2003);
//			}
//			if (relationshipType == NewPMBEElementTypes.EMOAssociationRelation_4005) {
//				types.add(NewPMBEElementTypes.EMRRole_2004);
//			}
//			return types;
//		}
//		if (sourceEditPart instanceof EMRRoleEditPart) {
//			List types = new ArrayList();
//			if (relationshipType == NewPMBEElementTypes.EMOAssociationRelation_4003) {
//				types.add(NewPMBEElementTypes.EMRRole_2004);
//			}
//			if (relationshipType == NewPMBEElementTypes.EMOAssociationRelation_4004) {
//				types.add(NewPMBEElementTypes.EMOResourceGroupType_2003);
//			}
//			return types;
//		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				NewPMBEDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage("Available domain model elements:");
		dialog.setTitle("Select domain model element");
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
