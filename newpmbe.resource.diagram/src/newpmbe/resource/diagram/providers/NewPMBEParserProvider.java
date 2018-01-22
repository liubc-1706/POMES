package newpmbe.resource.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.notation.View;
import newpmbe.resource.diagram.edit.parts.EMRAbstractLocationTypeNameEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractMachineTypeNameEditPart;
//import newpmbe.resource.diagram.edit.parts.EMRAbstractRoleNameEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractToolTypeNameEditPart;
import newpmbe.resource.diagram.edit.parts.EMRLocationTypeNameEditPart;
import newpmbe.resource.diagram.edit.parts.EMRMachineTypeNameEditPart;
//import newpmbe.resource.diagram.edit.parts.EMRRoleNameEditPart;
import newpmbe.resource.diagram.edit.parts.EMRToolTypeNameEditPart;

import newpmbe.resource.diagram.part.NewPMBEVisualIDRegistry;

import vpml.VpmlPackage;

/**
 * @generated
 */
public class NewPMBEParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser eMRAbstractToolTypeEMRAbstractToolTypeName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getEMRAbstractToolTypeEMRAbstractToolTypeName_5009Parser() {
		if (eMRAbstractToolTypeEMRAbstractToolTypeName_5009Parser == null) {
			eMRAbstractToolTypeEMRAbstractToolTypeName_5009Parser = createEMRAbstractToolTypeEMRAbstractToolTypeName_5009Parser();
		}
		return eMRAbstractToolTypeEMRAbstractToolTypeName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMRAbstractToolTypeEMRAbstractToolTypeName_5009Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMRAbstractLocationTypeEMRAbstractLocationTypeName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getEMRAbstractLocationTypeEMRAbstractLocationTypeName_5010Parser() {
		if (eMRAbstractLocationTypeEMRAbstractLocationTypeName_5010Parser == null) {
			eMRAbstractLocationTypeEMRAbstractLocationTypeName_5010Parser = createEMRAbstractLocationTypeEMRAbstractLocationTypeName_5010Parser();
		}
		return eMRAbstractLocationTypeEMRAbstractLocationTypeName_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMRAbstractLocationTypeEMRAbstractLocationTypeName_5010Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMRAbstractMachineTypeEMRAbstractMachineTypeName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getEMRAbstractMachineTypeEMRAbstractMachineTypeName_5011Parser() {
		if (eMRAbstractMachineTypeEMRAbstractMachineTypeName_5011Parser == null) {
			eMRAbstractMachineTypeEMRAbstractMachineTypeName_5011Parser = createEMRAbstractMachineTypeEMRAbstractMachineTypeName_5011Parser();
		}
		return eMRAbstractMachineTypeEMRAbstractMachineTypeName_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMRAbstractMachineTypeEMRAbstractMachineTypeName_5011Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMRLocationTypeEMRLocationTypeName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getEMRLocationTypeEMRLocationTypeName_5012Parser() {
		if (eMRLocationTypeEMRLocationTypeName_5012Parser == null) {
			eMRLocationTypeEMRLocationTypeName_5012Parser = createEMRLocationTypeEMRLocationTypeName_5012Parser();
		}
		return eMRLocationTypeEMRLocationTypeName_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMRLocationTypeEMRLocationTypeName_5012Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMRMachineTypeEMRMachineTypeName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getEMRMachineTypeEMRMachineTypeName_5013Parser() {
		if (eMRMachineTypeEMRMachineTypeName_5013Parser == null) {
			eMRMachineTypeEMRMachineTypeName_5013Parser = createEMRMachineTypeEMRMachineTypeName_5013Parser();
		}
		return eMRMachineTypeEMRMachineTypeName_5013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMRMachineTypeEMRMachineTypeName_5013Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMRToolTypeEMRToolTypeName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getEMRToolTypeEMRToolTypeName_5014Parser() {
		if (eMRToolTypeEMRToolTypeName_5014Parser == null) {
			eMRToolTypeEMRToolTypeName_5014Parser = createEMRToolTypeEMRToolTypeName_5014Parser();
		}
		return eMRToolTypeEMRToolTypeName_5014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMRToolTypeEMRToolTypeName_5014Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EMRAbstractToolTypeNameEditPart.VISUAL_ID:
			return getEMRAbstractToolTypeEMRAbstractToolTypeName_5009Parser();
		case EMRAbstractLocationTypeNameEditPart.VISUAL_ID:
			return getEMRAbstractLocationTypeEMRAbstractLocationTypeName_5010Parser();
		case EMRAbstractMachineTypeNameEditPart.VISUAL_ID:
			return getEMRAbstractMachineTypeEMRAbstractMachineTypeName_5011Parser();
		case EMRLocationTypeNameEditPart.VISUAL_ID:
			return getEMRLocationTypeEMRLocationTypeName_5012Parser();
		case EMRMachineTypeNameEditPart.VISUAL_ID:
			return getEMRMachineTypeEMRMachineTypeName_5013Parser();
		case EMRToolTypeNameEditPart.VISUAL_ID:
			return getEMRToolTypeEMRToolTypeName_5014Parser();
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
