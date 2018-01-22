package newpmbe.product.diagram.navigator;

import newpmbe.product.diagram.edit.parts.EMPArtifactEditPart;
import newpmbe.product.diagram.edit.parts.EMPArtifactNameEditPart;
import newpmbe.product.diagram.edit.parts.EMPDiagramEditPart;
import newpmbe.product.diagram.edit.parts.EMPDocumentEditPart;
import newpmbe.product.diagram.edit.parts.EMPDocumentNameEditPart;
import newpmbe.product.diagram.edit.parts.EMPFormEditPart;
import newpmbe.product.diagram.edit.parts.EMPFormNameEditPart;
import newpmbe.product.diagram.edit.parts.EMPMessageEditPart;
import newpmbe.product.diagram.edit.parts.EMPMessageNameEditPart;
import newpmbe.product.diagram.edit.parts.EMPOtherEditPart;
import newpmbe.product.diagram.edit.parts.EMPOtherNameEditPart;
import newpmbe.product.diagram.edit.parts.EMPProductPackageEditPart;
import newpmbe.product.diagram.edit.parts.EMPProductPackageNameEditPart;

import newpmbe.product.diagram.part.NewPMBEDiagramEditorPlugin;
import newpmbe.product.diagram.part.NewPMBEVisualIDRegistry;

import newpmbe.product.diagram.providers.NewPMBEElementTypes;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;

import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;

import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;

import org.eclipse.swt.graphics.Image;

import org.eclipse.ui.IMemento;

import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import vpml.EMObject;

/**
 * @generated
 */
public class NewPMBENavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		NewPMBEDiagramEditorPlugin.getInstance().getImageRegistry().put(
				"Navigator?InvalidElement",
				ImageDescriptor.getMissingImageDescriptor());
		NewPMBEDiagramEditorPlugin.getInstance().getImageRegistry().put(
				"Navigator?UnknownElement",
				ImageDescriptor.getMissingImageDescriptor());
		NewPMBEDiagramEditorPlugin.getInstance().getImageRegistry().put(
				"Navigator?ImageNotFound",
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof NewPMBENavigatorItem
				&& !isOwnView(((NewPMBENavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof NewPMBENavigatorGroup) {
			NewPMBENavigatorGroup group = (NewPMBENavigatorGroup) element;
			return NewPMBEDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof NewPMBENavigatorItem) {
			NewPMBENavigatorItem navigatorItem = (NewPMBENavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (NewPMBEVisualIDRegistry.getVisualID(view)) {
		case EMPArtifactEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPArtifact",
					NewPMBEElementTypes.EMPArtifact_2001);
		case EMPDocumentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPDocument",
					NewPMBEElementTypes.EMPDocument_2002);
		case EMPMessageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPMessage",
					NewPMBEElementTypes.EMPMessage_2003);
		case EMPOtherEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPOther",
					NewPMBEElementTypes.EMPOther_2004);
		case EMPProductPackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPProductPackage",
					NewPMBEElementTypes.EMPProductPackage_2005);
		case EMPFormEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPForm",
					NewPMBEElementTypes.EMPForm_2006);
		case EMPDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///vpml/processpackage.ecore?EMPDiagram",
					NewPMBEElementTypes.EMPDiagram_1000);
		default:
			return getImage("Navigator?UnknownElement", null);
		}
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = NewPMBEDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& NewPMBEElementTypes.isKnownElementType(elementType)) {
			image = NewPMBEElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound");
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof NewPMBENavigatorGroup) {
			NewPMBENavigatorGroup group = (NewPMBENavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof NewPMBENavigatorItem) {
			NewPMBENavigatorItem navigatorItem = (NewPMBENavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		switch (NewPMBEVisualIDRegistry.getVisualID(view)) {
		case EMPArtifactEditPart.VISUAL_ID:
			return getEMPArtifact_2001Text(view);
		case EMPDocumentEditPart.VISUAL_ID:
			return getEMPDocument_2002Text(view);
		case EMPMessageEditPart.VISUAL_ID:
			return getEMPMessage_2003Text(view);
		case EMPOtherEditPart.VISUAL_ID:
			return getEMPOther_2004Text(view);
		case EMPProductPackageEditPart.VISUAL_ID:
			return getEMPProductPackage_2005Text(view);
		case EMPFormEditPart.VISUAL_ID:
			return getEMPForm_2006Text(view);
		case EMPDiagramEditPart.VISUAL_ID:
			return getEMPDiagram_1000Text(view);
		default:
			return getUnknownElementText(view);
		}
	}

	/**
	 * @generated
	 */
	private String getEMPArtifact_2001Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPArtifactNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPArtifact_2001;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDocument_2002Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPDocumentNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPDocument_2002;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPMessage_2003Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPMessageNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPMessage_2003;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPOther_2004Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPOtherNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPOther_2004;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPProductPackage_2005Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPProductPackageNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPProductPackage_2005;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPForm_2006Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPFormNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPForm_2006;
						}
						return null;
					}
				});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDiagram_1000Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">";
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return EMPDiagramEditPart.MODEL_ID.equals(NewPMBEVisualIDRegistry
				.getModelID(view));
	}

}
