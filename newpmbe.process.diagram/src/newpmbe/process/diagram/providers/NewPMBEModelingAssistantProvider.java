package newpmbe.process.diagram.providers;

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
import newpmbe.process.diagram.edit.parts.EMOResourceGroupTypeEditPart;
//import newpmbe.process.diagram.edit.parts.EMOGroupTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMPAutoActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPAutoBatchActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPClockEditPart;
import newpmbe.process.diagram.edit.parts.EMPCompActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPDiagramEditPart;
import newpmbe.process.diagram.edit.parts.EMPInAndEditPart;
import newpmbe.process.diagram.edit.parts.EMPInOrEditPart;
import newpmbe.process.diagram.edit.parts.EMPManualBatchActivityEditPart;
//import newpmbe.process.diagram.edit.parts.EMPMileStoneEditPart;
import newpmbe.process.diagram.edit.parts.EMPNormalActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPOutAndEditPart;
import newpmbe.process.diagram.edit.parts.EMPOutOrEditPart;
import newpmbe.process.diagram.edit.parts.EMRLocationTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMRMachineTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMRRoleEditPart;
import newpmbe.process.diagram.edit.parts.EMRToolTypeEditPart;

import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;

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
		if (editPart instanceof EMPDiagramEditPart) {
			List types = new ArrayList();
			types.add(NewPMBEElementTypes.EMPAutoBatchActivity_2048);
			types.add(NewPMBEElementTypes.EMPOutOr_2024);
			types.add(NewPMBEElementTypes.EMPDocument_2025);
			types.add(NewPMBEElementTypes.EMPProductPackage_2026);
			types.add(NewPMBEElementTypes.EMPNormalActivity_2044);
			types.add(NewPMBEElementTypes.EMPOther_2028);
			types.add(NewPMBEElementTypes.EMPMessage_2029);
			types.add(NewPMBEElementTypes.EMPCompActivity_2045);
			types.add(NewPMBEElementTypes.EMPOutAnd_2031);
			types.add(NewPMBEElementTypes.EMPManualBatchActivity_2046);
			types.add(NewPMBEElementTypes.EMPClock_2033);
			types.add(NewPMBEElementTypes.EMPInAnd_2034);
			types.add(NewPMBEElementTypes.EMPInOr_2035);
			types.add(NewPMBEElementTypes.EMPAutoActivity_2047);
			types.add(NewPMBEElementTypes.EMPArtifact_2037);
			types.add(NewPMBEElementTypes.EMOResourceGroupType_2038);
			types.add(NewPMBEElementTypes.EMRToolType_2039);
			types.add(NewPMBEElementTypes.EMRRole_2040);
			types.add(NewPMBEElementTypes.EMRMachineType_2041);
			types.add(NewPMBEElementTypes.EMRLocationType_2042);
			types.add(NewPMBEElementTypes.EMPForm_2049);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof EMPClockEditPart) {
			List types = new ArrayList();
			types.add(NewPMBEElementTypes.EMPClockFlow_4001);
			return types;
		}
		if (sourceEditPart instanceof EMRToolTypeEditPart) {
			List types = new ArrayList();
			types.add(NewPMBEElementTypes.EMPAssFlow_4003);
			return types;
		}
		if (sourceEditPart instanceof EMRMachineTypeEditPart) {
			List types = new ArrayList();
			types.add(NewPMBEElementTypes.EMPAssFlow_4006);
			types.add(NewPMBEElementTypes.EMPAssFlow_4012);
			types.add(NewPMBEElementTypes.EMPAssFlow_4013);
			types.add(NewPMBEElementTypes.EMPAssFlow_4014);
			return types;
		}
		if (sourceEditPart instanceof EMOResourceGroupTypeEditPart) {
			List types = new ArrayList();
			types.add(NewPMBEElementTypes.EMPAssFlow_4007);
			types.add(NewPMBEElementTypes.EMPAssFlow_4008);
			types.add(NewPMBEElementTypes.EMPAssFlow_4009);
			types.add(NewPMBEElementTypes.EMPAssFlow_4010);
			types.add(NewPMBEElementTypes.EMPAssFlow_4011);
			return types;
		}
		if (sourceEditPart instanceof EMRLocationTypeEditPart) {
			List types = new ArrayList();
			types.add(NewPMBEElementTypes.EMPAssFlow_4015);
			types.add(NewPMBEElementTypes.EMPAssFlow_4025);
			types.add(NewPMBEElementTypes.EMPAssFlow_4026);
			types.add(NewPMBEElementTypes.EMPAssFlow_4027);
			return types;
		}
		if (sourceEditPart instanceof EMRRoleEditPart) {
			List types = new ArrayList();
			types.add(NewPMBEElementTypes.EMPAssFlow_4028);
			types.add(NewPMBEElementTypes.EMPAssFlow_4029);
			return types;
		}
		if (sourceEditPart instanceof EMPInAndEditPart) {
			List types = new ArrayList();
			types.add(NewPMBEElementTypes.EMPDataFlow_4018);
			types.add(NewPMBEElementTypes.EMPDataFlow_4036);
			types.add(NewPMBEElementTypes.EMPDataFlow_4037);
			return types;
		}
		if (sourceEditPart instanceof EMPInOrEditPart) {
			List types = new ArrayList();
			types.add(NewPMBEElementTypes.EMPDataFlow_4019);
			types.add(NewPMBEElementTypes.EMPDataFlow_4034);
			types.add(NewPMBEElementTypes.EMPDataFlow_4035);
			return types;
		}
		if (sourceEditPart instanceof EMPOutAndEditPart) {
			List types = new ArrayList();
			types.add(NewPMBEElementTypes.EMPDataFlow_4022);
			types.add(NewPMBEElementTypes.EMPDataFlow_4032);
			types.add(NewPMBEElementTypes.EMPDataFlow_4033);
			return types;
		}
		if (sourceEditPart instanceof EMPOutOrEditPart) {
			List types = new ArrayList();
			types.add(NewPMBEElementTypes.EMPDataFlow_4023);
			types.add(NewPMBEElementTypes.EMPDataFlow_4030);
			types.add(NewPMBEElementTypes.EMPDataFlow_4031);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated NOT
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		//		if (targetEditPart instanceof EMPNormalActivityEditPart) {
		//			List types = new ArrayList();
		//			types.add(NewPMBEElementTypes.EMPAssFlow_4006);
		//			types.add(NewPMBEElementTypes.EMPAssFlow_4008);
		//			types.add(NewPMBEElementTypes.EMPAssFlow_4015);
		//			types.add(NewPMBEElementTypes.EMPAssFlow_4028);
		//			return types;
		//		}
		//		if (targetEditPart instanceof EMPCompActivityEditPart) {
		//			List types = new ArrayList();
		//			types.add(NewPMBEElementTypes.EMPAssFlow_4007);
		//			return types;
		//		}
		//		if (targetEditPart instanceof EMPAutoBatchActivityEditPart) {
		//			List types = new ArrayList();
		//			types.add(NewPMBEElementTypes.EMPAssFlow_4009);
		//			types.add(NewPMBEElementTypes.EMPAssFlow_4013);
		//			types.add(NewPMBEElementTypes.EMPAssFlow_4026);
		//			return types;
		//		}
		//		if (targetEditPart instanceof EMPAutoActivityEditPart) {
		//			List types = new ArrayList();
		//			types.add(NewPMBEElementTypes.EMPAssFlow_4010);
		//			types.add(NewPMBEElementTypes.EMPAssFlow_4012);
		//			types.add(NewPMBEElementTypes.EMPAssFlow_4025);
		//			return types;
		//		}
		//		if (targetEditPart instanceof EMPManualBatchActivityEditPart) {
		//			List types = new ArrayList();
		//			types.add(NewPMBEElementTypes.EMPAssFlow_4011);
		//			types.add(NewPMBEElementTypes.EMPAssFlow_4014);
		//			types.add(NewPMBEElementTypes.EMPAssFlow_4027);
		//			types.add(NewPMBEElementTypes.EMPAssFlow_4029);
		//			return types;
		//		}
		//		if (targetEditPart instanceof EMPInAndEditPart) {
		//			List types = new ArrayList();
		//			types.add(NewPMBEElementTypes.EMPDataFlow_4016);
		//			return types;
		//		}
		//		if (targetEditPart instanceof EMPInOrEditPart) {
		//			List types = new ArrayList();
		//			types.add(NewPMBEElementTypes.EMPDataFlow_4017);
		//			return types;
		//		}
		//		if (targetEditPart instanceof EMPOutAndEditPart) {
		//			List types = new ArrayList();
		//			types.add(NewPMBEElementTypes.EMPDataFlow_4020);
		//			return types;
		//		}
		//		if (targetEditPart instanceof EMPOutOrEditPart) {
		//			List types = new ArrayList();
		//			types.add(NewPMBEElementTypes.EMPDataFlow_4021);
		//			return types;
		//		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated NOT
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		//		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
		//				.getAdapter(IGraphicalEditPart.class);
		//		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
		//				.getAdapter(IGraphicalEditPart.class);
		//		if (sourceEditPart instanceof EMPClockEditPart) {
		//			List types = new ArrayList();
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMRToolTypeEditPart) {
		//			List types = new ArrayList();
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMRMachineTypeEditPart) {
		//			List types = new ArrayList();
		//			if (targetEditPart instanceof EMPNormalActivityEditPart) {
		//				types.add(NewPMBEElementTypes.EMPAssFlow_4006);
		//			}
		//			if (targetEditPart instanceof EMPAutoActivityEditPart) {
		//				types.add(NewPMBEElementTypes.EMPAssFlow_4012);
		//			}
		//			if (targetEditPart instanceof EMPAutoBatchActivityEditPart) {
		//				types.add(NewPMBEElementTypes.EMPAssFlow_4013);
		//			}
		//			if (targetEditPart instanceof EMPManualBatchActivityEditPart) {
		//				types.add(NewPMBEElementTypes.EMPAssFlow_4014);
		//			}
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMOResourceGroupTypeEditPart) {
		//			List types = new ArrayList();
		//			if (targetEditPart instanceof EMPCompActivityEditPart) {
		//				types.add(NewPMBEElementTypes.EMPAssFlow_4007);
		//			}
		//			if (targetEditPart instanceof EMPNormalActivityEditPart) {
		//				types.add(NewPMBEElementTypes.EMPAssFlow_4008);
		//			}
		//			if (targetEditPart instanceof EMPAutoBatchActivityEditPart) {
		//				types.add(NewPMBEElementTypes.EMPAssFlow_4009);
		//			}
		//			if (targetEditPart instanceof EMPAutoActivityEditPart) {
		//				types.add(NewPMBEElementTypes.EMPAssFlow_4010);
		//			}
		//			if (targetEditPart instanceof EMPManualBatchActivityEditPart) {
		//				types.add(NewPMBEElementTypes.EMPAssFlow_4011);
		//			}
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMRLocationTypeEditPart) {
		//			List types = new ArrayList();
		//			if (targetEditPart instanceof EMPNormalActivityEditPart) {
		//				types.add(NewPMBEElementTypes.EMPAssFlow_4015);
		//			}
		//			if (targetEditPart instanceof EMPAutoActivityEditPart) {
		//				types.add(NewPMBEElementTypes.EMPAssFlow_4025);
		//			}
		//			if (targetEditPart instanceof EMPAutoBatchActivityEditPart) {
		//				types.add(NewPMBEElementTypes.EMPAssFlow_4026);
		//			}
		//			if (targetEditPart instanceof EMPManualBatchActivityEditPart) {
		//				types.add(NewPMBEElementTypes.EMPAssFlow_4027);
		//			}
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMRRoleEditPart) {
		//			List types = new ArrayList();
		//			if (targetEditPart instanceof EMPNormalActivityEditPart) {
		//				types.add(NewPMBEElementTypes.EMPAssFlow_4028);
		//			}
		//			if (targetEditPart instanceof EMPManualBatchActivityEditPart) {
		//				types.add(NewPMBEElementTypes.EMPAssFlow_4029);
		//			}
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMPInAndEditPart) {
		//			List types = new ArrayList();
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMPInOrEditPart) {
		//			List types = new ArrayList();
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMPOutAndEditPart) {
		//			List types = new ArrayList();
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMPOutOrEditPart) {
		//			List types = new ArrayList();
		//			return types;
		//		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof EMPNormalActivityEditPart) {
			List types = new ArrayList();
			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4006) {
				types.add(NewPMBEElementTypes.EMRMachineType_2041);
			}
			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4008) {
				types.add(NewPMBEElementTypes.EMOResourceGroupType_2038);
			}
			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4015) {
				types.add(NewPMBEElementTypes.EMRLocationType_2042);
			}
			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4028) {
				types.add(NewPMBEElementTypes.EMRRole_2040);
			}
			return types;
		}
		if (targetEditPart instanceof EMPCompActivityEditPart) {
			List types = new ArrayList();
			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4007) {
				types.add(NewPMBEElementTypes.EMOResourceGroupType_2038);
			}
			return types;
		}
		if (targetEditPart instanceof EMPAutoBatchActivityEditPart) {
			List types = new ArrayList();
			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4009) {
				types.add(NewPMBEElementTypes.EMOResourceGroupType_2038);
			}
			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4013) {
				types.add(NewPMBEElementTypes.EMRMachineType_2041);
			}
			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4026) {
				types.add(NewPMBEElementTypes.EMRLocationType_2042);
			}
			return types;
		}
		if (targetEditPart instanceof EMPAutoActivityEditPart) {
			List types = new ArrayList();
			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4010) {
				types.add(NewPMBEElementTypes.EMOResourceGroupType_2038);
			}
			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4012) {
				types.add(NewPMBEElementTypes.EMRMachineType_2041);
			}
			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4025) {
				types.add(NewPMBEElementTypes.EMRLocationType_2042);
			}
			return types;
		}
		if (targetEditPart instanceof EMPManualBatchActivityEditPart) {
			List types = new ArrayList();
			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4011) {
				types.add(NewPMBEElementTypes.EMOResourceGroupType_2038);
			}
			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4014) {
				types.add(NewPMBEElementTypes.EMRMachineType_2041);
			}
			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4027) {
				types.add(NewPMBEElementTypes.EMRLocationType_2042);
			}
			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4029) {
				types.add(NewPMBEElementTypes.EMRRole_2040);
			}
			return types;
		}
		if (targetEditPart instanceof EMPInAndEditPart) {
			List types = new ArrayList();
			if (relationshipType == NewPMBEElementTypes.EMPDataFlow_4034) {
				types.add(NewPMBEElementTypes.EMPInOr_2035);
			}
			if (relationshipType == NewPMBEElementTypes.EMPDataFlow_4037) {
				types.add(NewPMBEElementTypes.EMPInAnd_2034);
			}
			return types;
		}
		if (targetEditPart instanceof EMPInOrEditPart) {
			List types = new ArrayList();
			if (relationshipType == NewPMBEElementTypes.EMPDataFlow_4035) {
				types.add(NewPMBEElementTypes.EMPInOr_2035);
			}
			if (relationshipType == NewPMBEElementTypes.EMPDataFlow_4036) {
				types.add(NewPMBEElementTypes.EMPInAnd_2034);
			}
			return types;
		}
		if (targetEditPart instanceof EMPOutAndEditPart) {
			List types = new ArrayList();
			if (relationshipType == NewPMBEElementTypes.EMPDataFlow_4030) {
				types.add(NewPMBEElementTypes.EMPOutOr_2024);
			}
			if (relationshipType == NewPMBEElementTypes.EMPDataFlow_4033) {
				types.add(NewPMBEElementTypes.EMPOutAnd_2031);
			}
			return types;
		}
		if (targetEditPart instanceof EMPOutOrEditPart) {
			List types = new ArrayList();
			if (relationshipType == NewPMBEElementTypes.EMPDataFlow_4031) {
				types.add(NewPMBEElementTypes.EMPOutOr_2024);
			}
			if (relationshipType == NewPMBEElementTypes.EMPDataFlow_4032) {
				types.add(NewPMBEElementTypes.EMPOutAnd_2031);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated NOT
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		//		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
		//				.getAdapter(IGraphicalEditPart.class);
		//		if (sourceEditPart instanceof EMPClockEditPart) {
		//			List types = new ArrayList();
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMRToolTypeEditPart) {
		//			List types = new ArrayList();
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMRMachineTypeEditPart) {
		//			List types = new ArrayList();
		//			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4006) {
		//				types.add(NewPMBEElementTypes.EMPNormalActivity_2044);
		//			}
		//			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4012) {
		//				types.add(NewPMBEElementTypes.EMPAutoActivity_2047);
		//			}
		//			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4013) {
		//				types.add(NewPMBEElementTypes.EMPAutoBatchActivity_2048);
		//			}
		//			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4014) {
		//				types.add(NewPMBEElementTypes.EMPManualBatchActivity_2046);
		//			}
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMOResourceGroupTypeEditPart) {
		//			List types = new ArrayList();
		//			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4007) {
		//				types.add(NewPMBEElementTypes.EMPCompActivity_2045);
		//			}
		//			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4008) {
		//				types.add(NewPMBEElementTypes.EMPNormalActivity_2044);
		//			}
		//			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4009) {
		//				types.add(NewPMBEElementTypes.EMPAutoBatchActivity_2048);
		//			}
		//			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4010) {
		//				types.add(NewPMBEElementTypes.EMPAutoActivity_2047);
		//			}
		//			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4011) {
		//				types.add(NewPMBEElementTypes.EMPManualBatchActivity_2046);
		//			}
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMRLocationTypeEditPart) {
		//			List types = new ArrayList();
		//			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4015) {
		//				types.add(NewPMBEElementTypes.EMPNormalActivity_2044);
		//			}
		//			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4025) {
		//				types.add(NewPMBEElementTypes.EMPAutoActivity_2047);
		//			}
		//			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4026) {
		//				types.add(NewPMBEElementTypes.EMPAutoBatchActivity_2048);
		//			}
		//			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4027) {
		//				types.add(NewPMBEElementTypes.EMPManualBatchActivity_2046);
		//			}
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMRRoleEditPart) {
		//			List types = new ArrayList();
		//			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4028) {
		//				types.add(NewPMBEElementTypes.EMPNormalActivity_2044);
		//			}
		//			if (relationshipType == NewPMBEElementTypes.EMPAssFlow_4029) {
		//				types.add(NewPMBEElementTypes.EMPManualBatchActivity_2046);
		//			}
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMPInAndEditPart) {
		//			List types = new ArrayList();
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMPInOrEditPart) {
		//			List types = new ArrayList();
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMPOutAndEditPart) {
		//			List types = new ArrayList();
		//			return types;
		//		}
		//		if (sourceEditPart instanceof EMPOutOrEditPart) {
		//			List types = new ArrayList();
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
