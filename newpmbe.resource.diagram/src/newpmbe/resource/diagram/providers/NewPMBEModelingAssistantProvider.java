package newpmbe.resource.diagram.providers;

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
import newpmbe.resource.diagram.edit.parts.EMRAbstractLocationTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractMachineTypeEditPart;
//import newpmbe.resource.diagram.edit.parts.EMRAbstractRoleEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractToolTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRDiagramEditPart;
import newpmbe.resource.diagram.edit.parts.EMRLocationTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRMachineTypeEditPart;
//import newpmbe.resource.diagram.edit.parts.EMRRoleEditPart;
import newpmbe.resource.diagram.edit.parts.EMRToolTypeEditPart;

import newpmbe.resource.diagram.part.NewPMBEDiagramEditorPlugin;

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
		if (editPart instanceof EMRDiagramEditPart) {
			List types = new ArrayList();
			types.add(NewPMBEElementTypes.EMRAbstractToolType_2009);
			types.add(NewPMBEElementTypes.EMRAbstractLocationType_2010);
			types.add(NewPMBEElementTypes.EMRAbstractMachineType_2011);
			types.add(NewPMBEElementTypes.EMRLocationType_2012);
			types.add(NewPMBEElementTypes.EMRMachineType_2013);
			types.add(NewPMBEElementTypes.EMRToolType_2014);
			return types;
		}
		return Collections.EMPTY_LIST;
//		return null;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
//		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
//				.getAdapter(IGraphicalEditPart.class);
//		if (sourceEditPart instanceof EMRAbstractLocationTypeEditPart) {
//			List types = new ArrayList();
//			types.add(NewPMBEElementTypes.EMRClassificationRelation_4009);
//			types.add(NewPMBEElementTypes.EMRClassificationRelation_4010);
//			return types;
//		}
//		if (sourceEditPart instanceof EMRAbstractMachineTypeEditPart) {
//			List types = new ArrayList();
//			types.add(NewPMBEElementTypes.EMRClassificationRelation_4011);
//			types.add(NewPMBEElementTypes.EMRClassificationRelation_4012);
//			return types;
//		}
//		if (sourceEditPart instanceof EMRAbstractToolTypeEditPart) {
//			List types = new ArrayList();
//			types.add(NewPMBEElementTypes.EMRClassificationRelation_4013);
//			types.add(NewPMBEElementTypes.EMRClassificationRelation_4014);
//			return types;
//		}
//		return Collections.EMPTY_LIST;
		return null;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
//		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
//				.getAdapter(IGraphicalEditPart.class);
//		if (targetEditPart instanceof EMRAbstractLocationTypeEditPart) {
//			List types = new ArrayList();
//			types.add(NewPMBEElementTypes.EMRClassificationRelation_4009);
//			return types;
//		}
//		if (targetEditPart instanceof EMRLocationTypeEditPart) {
//			List types = new ArrayList();
//			types.add(NewPMBEElementTypes.EMRClassificationRelation_4010);
//			return types;
//		}
//		if (targetEditPart instanceof EMRAbstractMachineTypeEditPart) {
//			List types = new ArrayList();
//			types.add(NewPMBEElementTypes.EMRClassificationRelation_4011);
//			return types;
//		}
//		if (targetEditPart instanceof EMRMachineTypeEditPart) {
//			List types = new ArrayList();
//			types.add(NewPMBEElementTypes.EMRClassificationRelation_4012);
//			return types;
//		}
//		if (targetEditPart instanceof EMRAbstractToolTypeEditPart) {
//			List types = new ArrayList();
//			types.add(NewPMBEElementTypes.EMRClassificationRelation_4013);
//			return types;
//		}
//		if (targetEditPart instanceof EMRToolTypeEditPart) {
//			List types = new ArrayList();
//			types.add(NewPMBEElementTypes.EMRClassificationRelation_4014);
//			return types;
//		}
//		return Collections.EMPTY_LIST;
		return null;
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
//		if (sourceEditPart instanceof EMRAbstractLocationTypeEditPart) {
//			List types = new ArrayList();
//			if (targetEditPart instanceof EMRAbstractLocationTypeEditPart) {
//				types.add(NewPMBEElementTypes.EMRClassificationRelation_4009);
//			}
//			if (targetEditPart instanceof EMRLocationTypeEditPart) {
//				types.add(NewPMBEElementTypes.EMRClassificationRelation_4010);
//			}
//			return types;
//		}
//		if (sourceEditPart instanceof EMRAbstractMachineTypeEditPart) {
//			List types = new ArrayList();
//			if (targetEditPart instanceof EMRAbstractMachineTypeEditPart) {
//				types.add(NewPMBEElementTypes.EMRClassificationRelation_4011);
//			}
//			if (targetEditPart instanceof EMRMachineTypeEditPart) {
//				types.add(NewPMBEElementTypes.EMRClassificationRelation_4012);
//			}
//			return types;
//		}
//		if (sourceEditPart instanceof EMRAbstractToolTypeEditPart) {
//			List types = new ArrayList();
//			if (targetEditPart instanceof EMRAbstractToolTypeEditPart) {
//				types.add(NewPMBEElementTypes.EMRClassificationRelation_4013);
//			}
//			if (targetEditPart instanceof EMRToolTypeEditPart) {
//				types.add(NewPMBEElementTypes.EMRClassificationRelation_4014);
//			}
//			return types;
//		}
//		return Collections.EMPTY_LIST;
		return null;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
//		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
//				.getAdapter(IGraphicalEditPart.class);
//		if (targetEditPart instanceof EMRAbstractLocationTypeEditPart) {
//			List types = new ArrayList();
//			if (relationshipType == NewPMBEElementTypes.EMRClassificationRelation_4009) {
//				types.add(NewPMBEElementTypes.EMRAbstractLocationType_2010);
//			}
//			return types;
//		}
//		if (targetEditPart instanceof EMRLocationTypeEditPart) {
//			List types = new ArrayList();
//			if (relationshipType == NewPMBEElementTypes.EMRClassificationRelation_4010) {
//				types.add(NewPMBEElementTypes.EMRAbstractLocationType_2010);
//			}
//			return types;
//		}
//		if (targetEditPart instanceof EMRAbstractMachineTypeEditPart) {
//			List types = new ArrayList();
//			if (relationshipType == NewPMBEElementTypes.EMRClassificationRelation_4011) {
//				types.add(NewPMBEElementTypes.EMRAbstractMachineType_2011);
//			}
//			return types;
//		}
//		if (targetEditPart instanceof EMRMachineTypeEditPart) {
//			List types = new ArrayList();
//			if (relationshipType == NewPMBEElementTypes.EMRClassificationRelation_4012) {
//				types.add(NewPMBEElementTypes.EMRAbstractMachineType_2011);
//			}
//			return types;
//		}
//		if (targetEditPart instanceof EMRAbstractToolTypeEditPart) {
//			List types = new ArrayList();
//			if (relationshipType == NewPMBEElementTypes.EMRClassificationRelation_4013) {
//				types.add(NewPMBEElementTypes.EMRAbstractToolType_2009);
//			}
//			return types;
//		}
//		if (targetEditPart instanceof EMRToolTypeEditPart) {
//			List types = new ArrayList();
//			if (relationshipType == NewPMBEElementTypes.EMRClassificationRelation_4014) {
//				types.add(NewPMBEElementTypes.EMRAbstractToolType_2009);
//			}
//			return types;
//		}
//		return Collections.EMPTY_LIST;
		return null;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
//		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
//				.getAdapter(IGraphicalEditPart.class);
//		if (sourceEditPart instanceof EMRAbstractLocationTypeEditPart) {
//			List types = new ArrayList();
//			if (relationshipType == NewPMBEElementTypes.EMRClassificationRelation_4009) {
//				types.add(NewPMBEElementTypes.EMRAbstractLocationType_2010);
//			}
//			if (relationshipType == NewPMBEElementTypes.EMRClassificationRelation_4010) {
//				types.add(NewPMBEElementTypes.EMRLocationType_2012);
//			}
//			return types;
//		}
//		if (sourceEditPart instanceof EMRAbstractMachineTypeEditPart) {
//			List types = new ArrayList();
//			if (relationshipType == NewPMBEElementTypes.EMRClassificationRelation_4011) {
//				types.add(NewPMBEElementTypes.EMRAbstractMachineType_2011);
//			}
//			if (relationshipType == NewPMBEElementTypes.EMRClassificationRelation_4012) {
//				types.add(NewPMBEElementTypes.EMRMachineType_2013);
//			}
//			return types;
//		}
//		if (sourceEditPart instanceof EMRAbstractToolTypeEditPart) {
//			List types = new ArrayList();
//			if (relationshipType == NewPMBEElementTypes.EMRClassificationRelation_4013) {
//				types.add(NewPMBEElementTypes.EMRAbstractToolType_2009);
//			}
//			if (relationshipType == NewPMBEElementTypes.EMRClassificationRelation_4014) {
//				types.add(NewPMBEElementTypes.EMRToolType_2014);
//			}
//			return types;
//		}
//		return Collections.EMPTY_LIST;
		return null;
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
