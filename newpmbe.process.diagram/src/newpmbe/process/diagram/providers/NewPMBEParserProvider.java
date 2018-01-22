package newpmbe.process.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.notation.View;
import java.util.ArrayList;
import java.util.List;

import newpmbe.process.diagram.edit.parts.EMOResourceGroupTypeNameEditPart;
//import newpmbe.process.diagram.edit.parts.EMOGroupTypeNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPArtifactNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPArtifactNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPAutoActivityNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPAutoBatchActivityNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPClockNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPCompActivityNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPDocumentNameEditPart;

import newpmbe.process.diagram.edit.parts.EMPFormNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPManualBatchActivityNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPMessageNameEditPart;
//import newpmbe.process.diagram.edit.parts.EMPMileStoneNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPNormalActivityNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPOtherNameEditPart;

import newpmbe.process.diagram.edit.parts.EMPProductPackageNameEditPart;
import newpmbe.process.diagram.edit.parts.EMRLocationTypeNameEditPart;
import newpmbe.process.diagram.edit.parts.EMRMachineTypeNameEditPart;
import newpmbe.process.diagram.edit.parts.EMRRoleNameEditPart;
import newpmbe.process.diagram.edit.parts.EMRToolTypeNameEditPart;

import newpmbe.process.diagram.part.NewPMBEVisualIDRegistry;

import vpml.VpmlPackage;

/**
 * @generated
 */
public class NewPMBEParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser eMPAutoBatchActivityEMPAutoBatchActivityName_5048Parser;

	/**
	 * @generated
	 */
	private IParser getEMPAutoBatchActivityEMPAutoBatchActivityName_5048Parser() {
		if (eMPAutoBatchActivityEMPAutoBatchActivityName_5048Parser == null) {
			eMPAutoBatchActivityEMPAutoBatchActivityName_5048Parser = createEMPAutoBatchActivityEMPAutoBatchActivityName_5048Parser();
		}
		return eMPAutoBatchActivityEMPAutoBatchActivityName_5048Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPAutoBatchActivityEMPAutoBatchActivityName_5048Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMPDocumentEMPDocumentName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getEMPDocumentEMPDocumentName_5025Parser() {
		if (eMPDocumentEMPDocumentName_5025Parser == null) {
			eMPDocumentEMPDocumentName_5025Parser = createEMPDocumentEMPDocumentName_5025Parser();
		}
		return eMPDocumentEMPDocumentName_5025Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPDocumentEMPDocumentName_5025Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMPProductPackageEMPProductPackageName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getEMPProductPackageEMPProductPackageName_5026Parser() {
		if (eMPProductPackageEMPProductPackageName_5026Parser == null) {
			eMPProductPackageEMPProductPackageName_5026Parser = createEMPProductPackageEMPProductPackageName_5026Parser();
		}
		return eMPProductPackageEMPProductPackageName_5026Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPProductPackageEMPProductPackageName_5026Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMPNormalActivityEMPNormalActivityName_5044Parser;

	/**
	 * @generated
	 */
	private IParser getEMPNormalActivityEMPNormalActivityName_5044Parser() {
		if (eMPNormalActivityEMPNormalActivityName_5044Parser == null) {
			eMPNormalActivityEMPNormalActivityName_5044Parser = createEMPNormalActivityEMPNormalActivityName_5044Parser();
		}
		return eMPNormalActivityEMPNormalActivityName_5044Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPNormalActivityEMPNormalActivityName_5044Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMPOtherEMPOtherName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getEMPOtherEMPOtherName_5028Parser() {
		if (eMPOtherEMPOtherName_5028Parser == null) {
			eMPOtherEMPOtherName_5028Parser = createEMPOtherEMPOtherName_5028Parser();
		}
		return eMPOtherEMPOtherName_5028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPOtherEMPOtherName_5028Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMPMessageEMPMessageName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getEMPMessageEMPMessageName_5029Parser() {
		if (eMPMessageEMPMessageName_5029Parser == null) {
			eMPMessageEMPMessageName_5029Parser = createEMPMessageEMPMessageName_5029Parser();
		}
		return eMPMessageEMPMessageName_5029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPMessageEMPMessageName_5029Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMPCompActivityEMPCompActivityName_5045Parser;

	/**
	 * @generated
	 */
	private IParser getEMPCompActivityEMPCompActivityName_5045Parser() {
		if (eMPCompActivityEMPCompActivityName_5045Parser == null) {
			eMPCompActivityEMPCompActivityName_5045Parser = createEMPCompActivityEMPCompActivityName_5045Parser();
		}
		return eMPCompActivityEMPCompActivityName_5045Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPCompActivityEMPCompActivityName_5045Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMPManualBatchActivityEMPManualBatchActivityName_5046Parser;

	/**
	 * @generated
	 */
	private IParser getEMPManualBatchActivityEMPManualBatchActivityName_5046Parser() {
		if (eMPManualBatchActivityEMPManualBatchActivityName_5046Parser == null) {
			eMPManualBatchActivityEMPManualBatchActivityName_5046Parser = createEMPManualBatchActivityEMPManualBatchActivityName_5046Parser();
		}
		return eMPManualBatchActivityEMPManualBatchActivityName_5046Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPManualBatchActivityEMPManualBatchActivityName_5046Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMPClockEMPClockName_5033Parser;

	/**
	 * @generated
	 */
	private IParser getEMPClockEMPClockName_5033Parser() {
		if (eMPClockEMPClockName_5033Parser == null) {
			eMPClockEMPClockName_5033Parser = createEMPClockEMPClockName_5033Parser();
		}
		return eMPClockEMPClockName_5033Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPClockEMPClockName_5033Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMPAutoActivityEMPAutoActivityName_5047Parser;

	/**
	 * @generated
	 */
	private IParser getEMPAutoActivityEMPAutoActivityName_5047Parser() {
		if (eMPAutoActivityEMPAutoActivityName_5047Parser == null) {
			eMPAutoActivityEMPAutoActivityName_5047Parser = createEMPAutoActivityEMPAutoActivityName_5047Parser();
		}
		return eMPAutoActivityEMPAutoActivityName_5047Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPAutoActivityEMPAutoActivityName_5047Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMPArtifactEMPArtifactName_5037Parser;

	/**
	 * @generated
	 */
	private IParser getEMPArtifactEMPArtifactName_5037Parser() {
		if (eMPArtifactEMPArtifactName_5037Parser == null) {
			eMPArtifactEMPArtifactName_5037Parser = createEMPArtifactEMPArtifactName_5037Parser();
		}
		return eMPArtifactEMPArtifactName_5037Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPArtifactEMPArtifactName_5037Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMOResourceGroupTypeEMOResourceGroupTypeName_5038Parser;

	/**
	 * @generated
	 */
	private IParser getEMOResourceGroupTypeEMOResourceGroupTypeName_5038Parser() {
		if (eMOResourceGroupTypeEMOResourceGroupTypeName_5038Parser == null) {
			eMOResourceGroupTypeEMOResourceGroupTypeName_5038Parser = createEMOResourceGroupTypeEMOResourceGroupTypeName_5038Parser();
		}
		return eMOResourceGroupTypeEMOResourceGroupTypeName_5038Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMOResourceGroupTypeEMOResourceGroupTypeName_5038Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMRToolTypeEMRToolTypeName_5039Parser;

	/**
	 * @generated
	 */
	private IParser getEMRToolTypeEMRToolTypeName_5039Parser() {
		if (eMRToolTypeEMRToolTypeName_5039Parser == null) {
			eMRToolTypeEMRToolTypeName_5039Parser = createEMRToolTypeEMRToolTypeName_5039Parser();
		}
		return eMRToolTypeEMRToolTypeName_5039Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMRToolTypeEMRToolTypeName_5039Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMRRoleEMRRoleName_5040Parser;

	/**
	 * @generated
	 */
	private IParser getEMRRoleEMRRoleName_5040Parser() {
		if (eMRRoleEMRRoleName_5040Parser == null) {
			eMRRoleEMRRoleName_5040Parser = createEMRRoleEMRRoleName_5040Parser();
		}
		return eMRRoleEMRRoleName_5040Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMRRoleEMRRoleName_5040Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMRMachineTypeEMRMachineTypeName_5041Parser;

	/**
	 * @generated
	 */
	private IParser getEMRMachineTypeEMRMachineTypeName_5041Parser() {
		if (eMRMachineTypeEMRMachineTypeName_5041Parser == null) {
			eMRMachineTypeEMRMachineTypeName_5041Parser = createEMRMachineTypeEMRMachineTypeName_5041Parser();
		}
		return eMRMachineTypeEMRMachineTypeName_5041Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMRMachineTypeEMRMachineTypeName_5041Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMRLocationTypeEMRLocationTypeName_5042Parser;

	/**
	 * @generated
	 */
	private IParser getEMRLocationTypeEMRLocationTypeName_5042Parser() {
		if (eMRLocationTypeEMRLocationTypeName_5042Parser == null) {
			eMRLocationTypeEMRLocationTypeName_5042Parser = createEMRLocationTypeEMRLocationTypeName_5042Parser();
		}
		return eMRLocationTypeEMRLocationTypeName_5042Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMRLocationTypeEMRLocationTypeName_5042Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMPFormEMPFormName_5049Parser;

	/**
	 * @generated
	 */
	private IParser getEMPFormEMPFormName_5049Parser() {
		if (eMPFormEMPFormName_5049Parser == null) {
			eMPFormEMPFormName_5049Parser = createEMPFormEMPFormName_5049Parser();
		}
		return eMPFormEMPFormName_5049Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPFormEMPFormName_5049Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EMPAutoBatchActivityNameEditPart.VISUAL_ID:
			return getEMPAutoBatchActivityEMPAutoBatchActivityName_5048Parser();
		case EMPDocumentNameEditPart.VISUAL_ID:
			return getEMPDocumentEMPDocumentName_5025Parser();
		case EMPProductPackageNameEditPart.VISUAL_ID:
			return getEMPProductPackageEMPProductPackageName_5026Parser();
		case EMPNormalActivityNameEditPart.VISUAL_ID:
			return getEMPNormalActivityEMPNormalActivityName_5044Parser();
		case EMPOtherNameEditPart.VISUAL_ID:
			return getEMPOtherEMPOtherName_5028Parser();
		case EMPMessageNameEditPart.VISUAL_ID:
			return getEMPMessageEMPMessageName_5029Parser();
		case EMPCompActivityNameEditPart.VISUAL_ID:
			return getEMPCompActivityEMPCompActivityName_5045Parser();
		case EMPManualBatchActivityNameEditPart.VISUAL_ID:
			return getEMPManualBatchActivityEMPManualBatchActivityName_5046Parser();
		case EMPClockNameEditPart.VISUAL_ID:
			return getEMPClockEMPClockName_5033Parser();
		case EMPAutoActivityNameEditPart.VISUAL_ID:
			return getEMPAutoActivityEMPAutoActivityName_5047Parser();
		case EMPArtifactNameEditPart.VISUAL_ID:
			return getEMPArtifactEMPArtifactName_5037Parser();
		case EMOResourceGroupTypeNameEditPart.VISUAL_ID:
			return getEMOResourceGroupTypeEMOResourceGroupTypeName_5038Parser();
		case EMRToolTypeNameEditPart.VISUAL_ID:
			return getEMRToolTypeEMRToolTypeName_5039Parser();
		case EMRRoleNameEditPart.VISUAL_ID:
			return getEMRRoleEMRRoleName_5040Parser();
		case EMRMachineTypeNameEditPart.VISUAL_ID:
			return getEMRMachineTypeEMRMachineTypeName_5041Parser();
		case EMRLocationTypeNameEditPart.VISUAL_ID:
			return getEMRLocationTypeEMRLocationTypeName_5042Parser();
		case EMPFormNameEditPart.VISUAL_ID:
			return getEMPFormEMPFormName_5049Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(NewPMBEVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(NewPMBEVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (NewPMBEElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}
}
