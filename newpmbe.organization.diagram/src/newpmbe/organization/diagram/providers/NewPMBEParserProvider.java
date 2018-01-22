package newpmbe.organization.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.notation.View;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelationName2EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelationName3EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelationName4EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelationNameEditPart;
import newpmbe.organization.diagram.edit.parts.EMOResourceGroupTypeNameEditPart;
//import newpmbe.organization.diagram.edit.parts.EMOGroupTypeNameEditPart;
import newpmbe.organization.diagram.edit.parts.EMRRoleNameEditPart;

import newpmbe.organization.diagram.part.NewPMBEVisualIDRegistry;

import vpml.VpmlPackage;

/**
 * @generated
 */
public class NewPMBEParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser eMOResourceGroupTypeEMOResourceGroupTypeName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getEMOResourceGroupTypeEMOResourceGroupTypeName_5003Parser() {
		if (eMOResourceGroupTypeEMOResourceGroupTypeName_5003Parser == null) {
			eMOResourceGroupTypeEMOResourceGroupTypeName_5003Parser = createEMOResourceGroupTypeEMOResourceGroupTypeName_5003Parser();
		}
		return eMOResourceGroupTypeEMOResourceGroupTypeName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMOResourceGroupTypeEMOResourceGroupTypeName_5003Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMRRoleEMRRoleName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getEMRRoleEMRRoleName_5004Parser() {
		if (eMRRoleEMRRoleName_5004Parser == null) {
			eMRRoleEMRRoleName_5004Parser = createEMRRoleEMRRoleName_5004Parser();
		}
		return eMRRoleEMRRoleName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMRRoleEMRRoleName_5004Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMOAssociationRelationEMOAssociationRelationName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getEMOAssociationRelationEMOAssociationRelationName_6001Parser() {
		if (eMOAssociationRelationEMOAssociationRelationName_6001Parser == null) {
			eMOAssociationRelationEMOAssociationRelationName_6001Parser = createEMOAssociationRelationEMOAssociationRelationName_6001Parser();
		}
		return eMOAssociationRelationEMOAssociationRelationName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMOAssociationRelationEMOAssociationRelationName_6001Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMOAssociationRelationEMOAssociationRelationName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getEMOAssociationRelationEMOAssociationRelationName_6002Parser() {
		if (eMOAssociationRelationEMOAssociationRelationName_6002Parser == null) {
			eMOAssociationRelationEMOAssociationRelationName_6002Parser = createEMOAssociationRelationEMOAssociationRelationName_6002Parser();
		}
		return eMOAssociationRelationEMOAssociationRelationName_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMOAssociationRelationEMOAssociationRelationName_6002Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMOAssociationRelationEMOAssociationRelationName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getEMOAssociationRelationEMOAssociationRelationName_6003Parser() {
		if (eMOAssociationRelationEMOAssociationRelationName_6003Parser == null) {
			eMOAssociationRelationEMOAssociationRelationName_6003Parser = createEMOAssociationRelationEMOAssociationRelationName_6003Parser();
		}
		return eMOAssociationRelationEMOAssociationRelationName_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMOAssociationRelationEMOAssociationRelationName_6003Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMOAssociationRelationEMOAssociationRelationName_6004Parser;

	/**
	 * @generated
	 */
	private IParser getEMOAssociationRelationEMOAssociationRelationName_6004Parser() {
		if (eMOAssociationRelationEMOAssociationRelationName_6004Parser == null) {
			eMOAssociationRelationEMOAssociationRelationName_6004Parser = createEMOAssociationRelationEMOAssociationRelationName_6004Parser();
		}
		return eMOAssociationRelationEMOAssociationRelationName_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMOAssociationRelationEMOAssociationRelationName_6004Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EMOResourceGroupTypeNameEditPart.VISUAL_ID:
			return getEMOResourceGroupTypeEMOResourceGroupTypeName_5003Parser();
		case EMRRoleNameEditPart.VISUAL_ID:
			return getEMRRoleEMRRoleName_5004Parser();
		case EMOAssociationRelationNameEditPart.VISUAL_ID:
			return getEMOAssociationRelationEMOAssociationRelationName_6001Parser();
		case EMOAssociationRelationName2EditPart.VISUAL_ID:
			return getEMOAssociationRelationEMOAssociationRelationName_6002Parser();
		case EMOAssociationRelationName3EditPart.VISUAL_ID:
			return getEMOAssociationRelationEMOAssociationRelationName_6003Parser();
		case EMOAssociationRelationName4EditPart.VISUAL_ID:
			return getEMOAssociationRelationEMOAssociationRelationName_6004Parser();
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
