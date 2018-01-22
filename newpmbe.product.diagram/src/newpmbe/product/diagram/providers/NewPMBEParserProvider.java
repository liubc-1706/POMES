package newpmbe.product.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.notation.View;
import newpmbe.product.diagram.edit.parts.EMPArtifactNameEditPart;
import newpmbe.product.diagram.edit.parts.EMPDocumentNameEditPart;
import newpmbe.product.diagram.edit.parts.EMPFormNameEditPart;
import newpmbe.product.diagram.edit.parts.EMPMessageNameEditPart;
import newpmbe.product.diagram.edit.parts.EMPOtherNameEditPart;
import newpmbe.product.diagram.edit.parts.EMPProductPackageNameEditPart;

import newpmbe.product.diagram.part.NewPMBEVisualIDRegistry;

import vpml.VpmlPackage;

/**
 * @generated
 */
public class NewPMBEParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser eMPArtifactEMPArtifactName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getEMPArtifactEMPArtifactName_5001Parser() {
		if (eMPArtifactEMPArtifactName_5001Parser == null) {
			eMPArtifactEMPArtifactName_5001Parser = createEMPArtifactEMPArtifactName_5001Parser();
		}
		return eMPArtifactEMPArtifactName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPArtifactEMPArtifactName_5001Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMPDocumentEMPDocumentName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getEMPDocumentEMPDocumentName_5002Parser() {
		if (eMPDocumentEMPDocumentName_5002Parser == null) {
			eMPDocumentEMPDocumentName_5002Parser = createEMPDocumentEMPDocumentName_5002Parser();
		}
		return eMPDocumentEMPDocumentName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPDocumentEMPDocumentName_5002Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMPMessageEMPMessageName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getEMPMessageEMPMessageName_5003Parser() {
		if (eMPMessageEMPMessageName_5003Parser == null) {
			eMPMessageEMPMessageName_5003Parser = createEMPMessageEMPMessageName_5003Parser();
		}
		return eMPMessageEMPMessageName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPMessageEMPMessageName_5003Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMPOtherEMPOtherName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getEMPOtherEMPOtherName_5004Parser() {
		if (eMPOtherEMPOtherName_5004Parser == null) {
			eMPOtherEMPOtherName_5004Parser = createEMPOtherEMPOtherName_5004Parser();
		}
		return eMPOtherEMPOtherName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPOtherEMPOtherName_5004Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMPProductPackageEMPProductPackageName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getEMPProductPackageEMPProductPackageName_5005Parser() {
		if (eMPProductPackageEMPProductPackageName_5005Parser == null) {
			eMPProductPackageEMPProductPackageName_5005Parser = createEMPProductPackageEMPProductPackageName_5005Parser();
		}
		return eMPProductPackageEMPProductPackageName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPProductPackageEMPProductPackageName_5005Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eMPFormEMPFormName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getEMPFormEMPFormName_5006Parser() {
		if (eMPFormEMPFormName_5006Parser == null) {
			eMPFormEMPFormName_5006Parser = createEMPFormEMPFormName_5006Parser();
		}
		return eMPFormEMPFormName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEMPFormEMPFormName_5006Parser() {
		NewPMBEStructuralFeatureParser parser = new NewPMBEStructuralFeatureParser(
				VpmlPackage.eINSTANCE.getEMObject_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EMPArtifactNameEditPart.VISUAL_ID:
			return getEMPArtifactEMPArtifactName_5001Parser();
		case EMPDocumentNameEditPart.VISUAL_ID:
			return getEMPDocumentEMPDocumentName_5002Parser();
		case EMPMessageNameEditPart.VISUAL_ID:
			return getEMPMessageEMPMessageName_5003Parser();
		case EMPOtherNameEditPart.VISUAL_ID:
			return getEMPOtherEMPOtherName_5004Parser();
		case EMPProductPackageNameEditPart.VISUAL_ID:
			return getEMPProductPackageEMPProductPackageName_5005Parser();
		case EMPFormNameEditPart.VISUAL_ID:
			return getEMPFormEMPFormName_5006Parser();
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
