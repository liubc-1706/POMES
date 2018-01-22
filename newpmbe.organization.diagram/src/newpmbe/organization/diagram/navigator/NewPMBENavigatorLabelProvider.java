package newpmbe.organization.diagram.navigator;

import newpmbe.organization.diagram.edit.parts.EMOAssociationRelation2EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelation3EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelation4EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelationEditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelationName2EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelationName3EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelationName4EditPart;
import newpmbe.organization.diagram.edit.parts.EMOAssociationRelationNameEditPart;
import newpmbe.organization.diagram.edit.parts.EMOComposeRelationEditPart;
import newpmbe.organization.diagram.edit.parts.EMODiagramEditPart;
import newpmbe.organization.diagram.edit.parts.EMOResourceGroupTypeEditPart;
import newpmbe.organization.diagram.edit.parts.EMOResourceGroupTypeNameEditPart;
//import newpmbe.organization.diagram.edit.parts.EMOGroupTypeEditPart;
//import newpmbe.organization.diagram.edit.parts.EMOGroupTypeNameEditPart;
import newpmbe.organization.diagram.edit.parts.EMRRoleEditPart;
import newpmbe.organization.diagram.edit.parts.EMRRoleNameEditPart;

import newpmbe.organization.diagram.part.NewPMBEDiagramEditorPlugin;
import newpmbe.organization.diagram.part.NewPMBEVisualIDRegistry;

import newpmbe.organization.diagram.providers.NewPMBEElementTypes;

import org.eclipse.core.resources.IProject;
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
	 * @generated NOT
	 */
	public Image getImage(Object element) {
		if (element instanceof IProject) {
			ImageDescriptor descriptor = NewPMBEDiagramEditorPlugin
					.getBundledImageDescriptor("icons/organizationproject.gif");
			return descriptor.createImage();
		}
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

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}
		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (NewPMBEVisualIDRegistry.getVisualID(view)) {
		case EMOResourceGroupTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/organizationpackage.ecore?EMOResourceGroupType",
					NewPMBEElementTypes.EMOResourceGroupType_2003);
		case EMRRoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/resourcepackage.ecore?EMRRole",
					NewPMBEElementTypes.EMRRole_2004);
		case EMODiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///vpml/organizationpackage.ecore?EMODiagram",
					NewPMBEElementTypes.EMODiagram_1000);
		case EMOComposeRelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/organizationpackage.ecore?EMOComposeRelation",
					NewPMBEElementTypes.EMOComposeRelation_4001);
		case EMOAssociationRelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/organizationpackage.ecore?EMOAssociationRelation",
					NewPMBEElementTypes.EMOAssociationRelation_4002);
		case EMOAssociationRelation2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/organizationpackage.ecore?EMOAssociationRelation",
					NewPMBEElementTypes.EMOAssociationRelation_4003);
		case EMOAssociationRelation3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/organizationpackage.ecore?EMOAssociationRelation",
					NewPMBEElementTypes.EMOAssociationRelation_4004);
		case EMOAssociationRelation4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/organizationpackage.ecore?EMOAssociationRelation",
					NewPMBEElementTypes.EMOAssociationRelation_4005);
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
	 * @generated NOT
	 */
	public String getText(Object element) {
		//added by zhangpeng
		if (element instanceof IProject) {
			IProject project = (IProject) element;
			//changed by zhangpeng-改变了工程属性，为每个工程项目增加了后缀，但是要对用户透明
			String projectExtension = project.getFileExtension();
			//去掉功程名称后面的扩展名
			String projectName = project.getName().substring(0,
					project.getName().length() - projectExtension.length() - 1);

			return projectName;
			//end changed by zhangpeng
		}
		//end added by zhangpeng
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

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}
		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		switch (NewPMBEVisualIDRegistry.getVisualID(view)) {
		case EMOResourceGroupTypeEditPart.VISUAL_ID:
			return getEMOResourceGroupType_2003Text(view);
		case EMRRoleEditPart.VISUAL_ID:
			return getEMRRole_2004Text(view);
		case EMODiagramEditPart.VISUAL_ID:
			return getEMODiagram_1000Text(view);
		case EMOComposeRelationEditPart.VISUAL_ID:
			return getEMOComposeRelation_4001Text(view);
		case EMOAssociationRelationEditPart.VISUAL_ID:
			return getEMOAssociationRelation_4002Text(view);
		case EMOAssociationRelation2EditPart.VISUAL_ID:
			return getEMOAssociationRelation_4003Text(view);
		case EMOAssociationRelation3EditPart.VISUAL_ID:
			return getEMOAssociationRelation_4004Text(view);
		case EMOAssociationRelation4EditPart.VISUAL_ID:
			return getEMOAssociationRelation_4005Text(view);
		default:
			return getUnknownElementText(view);
		}
	}

	/**
	 * @generated
	 */
	private String getEMOResourceGroupType_2003Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMOResourceGroupTypeNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMOResourceGroupType_2003;
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
	private String getEMRRole_2004Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMRRoleNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMRRole_2004;
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
	private String getEMODiagram_1000Text(View view) {
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
	private String getEMOComposeRelation_4001Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMOAssociationRelation_4002Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMOAssociationRelationNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMOAssociationRelation_4002;
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
					"Parser was not found for label " + 6001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMOAssociationRelation_4003Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMOAssociationRelationName2EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMOAssociationRelation_4003;
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
					"Parser was not found for label " + 6002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMOAssociationRelation_4004Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMOAssociationRelationName3EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMOAssociationRelation_4004;
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
					"Parser was not found for label " + 6003);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMOAssociationRelation_4005Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMOAssociationRelationName4EditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMOAssociationRelation_4005;
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
					"Parser was not found for label " + 6004);
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
		return EMODiagramEditPart.MODEL_ID.equals(NewPMBEVisualIDRegistry
				.getModelID(view));
	}

}
