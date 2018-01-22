package newpmbe.resource.diagram.navigator;

import newpmbe.resource.diagram.edit.parts.EMRAbstractLocationTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractLocationTypeNameEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractMachineTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractMachineTypeNameEditPart;
//import newpmbe.resource.diagram.edit.parts.EMRAbstractRoleEditPart;
//import newpmbe.resource.diagram.edit.parts.EMRAbstractRoleNameEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractToolTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractToolTypeNameEditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelation2EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelation3EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelation4EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelation5EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelation6EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationEditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship2EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship3EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship4EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship5EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship6EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship7EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationship8EditPart;
import newpmbe.resource.diagram.edit.parts.EMRClassificationRelationshipEditPart;
import newpmbe.resource.diagram.edit.parts.EMRDiagramEditPart;
import newpmbe.resource.diagram.edit.parts.EMRLocationTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRLocationTypeNameEditPart;
import newpmbe.resource.diagram.edit.parts.EMRMachineTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRMachineTypeNameEditPart;
//import newpmbe.resource.diagram.edit.parts.EMRRoleEditPart;
//import newpmbe.resource.diagram.edit.parts.EMRRoleNameEditPart;
import newpmbe.resource.diagram.edit.parts.EMRToolTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRToolTypeNameEditPart;

import newpmbe.resource.diagram.part.NewPMBEDiagramEditorPlugin;
import newpmbe.resource.diagram.part.NewPMBEVisualIDRegistry;

import newpmbe.resource.diagram.providers.NewPMBEElementTypes;

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
		if(element instanceof IProject)
		{
			ImageDescriptor descriptor = NewPMBEDiagramEditorPlugin.getBundledImageDescriptor("icons/resourceproject.gif");
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
		case EMRAbstractToolTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/resourcepackage.ecore?EMRAbstractToolType",
					NewPMBEElementTypes.EMRAbstractToolType_2009);
		case EMRAbstractLocationTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/resourcepackage.ecore?EMRAbstractLocationType",
					NewPMBEElementTypes.EMRAbstractLocationType_2010);
		case EMRAbstractMachineTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/resourcepackage.ecore?EMRAbstractMachineType",
					NewPMBEElementTypes.EMRAbstractMachineType_2011);
		case EMRLocationTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/resourcepackage.ecore?EMRLocationType",
					NewPMBEElementTypes.EMRLocationType_2012);
		case EMRMachineTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/resourcepackage.ecore?EMRMachineType",
					NewPMBEElementTypes.EMRMachineType_2013);
		case EMRToolTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/resourcepackage.ecore?EMRToolType",
					NewPMBEElementTypes.EMRToolType_2014);
		case EMRDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///vpml/resourcepackage.ecore?EMRDiagram",
					NewPMBEElementTypes.EMRDiagram_1000);
		case EMRClassificationRelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/resourcepackage.ecore?EMRClassificationRelation",
					NewPMBEElementTypes.EMRClassificationRelation_4009);
		case EMRClassificationRelation2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/resourcepackage.ecore?EMRClassificationRelation",
					NewPMBEElementTypes.EMRClassificationRelation_4010);
		case EMRClassificationRelation3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/resourcepackage.ecore?EMRClassificationRelation",
					NewPMBEElementTypes.EMRClassificationRelation_4011);
		case EMRClassificationRelation4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/resourcepackage.ecore?EMRClassificationRelation",
					NewPMBEElementTypes.EMRClassificationRelation_4012);
		case EMRClassificationRelation5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/resourcepackage.ecore?EMRClassificationRelation",
					NewPMBEElementTypes.EMRClassificationRelation_4013);
		case EMRClassificationRelation6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/resourcepackage.ecore?EMRClassificationRelation",
					NewPMBEElementTypes.EMRClassificationRelation_4014);
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
		case EMRAbstractToolTypeEditPart.VISUAL_ID:
			return getEMRAbstractToolType_2009Text(view);
		case EMRAbstractLocationTypeEditPart.VISUAL_ID:
			return getEMRAbstractLocationType_2010Text(view);
		case EMRAbstractMachineTypeEditPart.VISUAL_ID:
			return getEMRAbstractMachineType_2011Text(view);
		case EMRLocationTypeEditPart.VISUAL_ID:
			return getEMRLocationType_2012Text(view);
		case EMRMachineTypeEditPart.VISUAL_ID:
			return getEMRMachineType_2013Text(view);
		case EMRToolTypeEditPart.VISUAL_ID:
			return getEMRToolType_2014Text(view);
		case EMRDiagramEditPart.VISUAL_ID:
			return getEMRDiagram_1000Text(view);
		case EMRClassificationRelationEditPart.VISUAL_ID:
			return getEMRClassificationRelation_4009Text(view);
		case EMRClassificationRelation2EditPart.VISUAL_ID:
			return getEMRClassificationRelation_4010Text(view);
		case EMRClassificationRelation3EditPart.VISUAL_ID:
			return getEMRClassificationRelation_4011Text(view);
		case EMRClassificationRelation4EditPart.VISUAL_ID:
			return getEMRClassificationRelation_4012Text(view);
		case EMRClassificationRelation5EditPart.VISUAL_ID:
			return getEMRClassificationRelation_4013Text(view);
		case EMRClassificationRelation6EditPart.VISUAL_ID:
			return getEMRClassificationRelation_4014Text(view);
		default:
			return getUnknownElementText(view);
		}
	}

	/**
	 * @generated
	 */
	private String getEMRAbstractToolType_2009Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMRAbstractToolTypeNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMRAbstractToolType_2009;
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
					"Parser was not found for label " + 5009);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMRAbstractLocationType_2010Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMRAbstractLocationTypeNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMRAbstractLocationType_2010;
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
					"Parser was not found for label " + 5010);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMRAbstractMachineType_2011Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMRAbstractMachineTypeNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMRAbstractMachineType_2011;
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
					"Parser was not found for label " + 5011);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMRLocationType_2012Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMRLocationTypeNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMRLocationType_2012;
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
					"Parser was not found for label " + 5012);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMRMachineType_2013Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMRMachineTypeNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMRMachineType_2013;
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
					"Parser was not found for label " + 5013);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMRToolType_2014Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMRToolTypeNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMRToolType_2014;
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
					"Parser was not found for label " + 5014);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMRDiagram_1000Text(View view) {
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
	private String getEMRClassificationRelation_4009Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4009);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMRClassificationRelation_4010Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4010);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMRClassificationRelation_4011Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4011);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMRClassificationRelation_4012Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4012);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMRClassificationRelation_4013Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4013);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMRClassificationRelation_4014Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4014);
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
		return EMRDiagramEditPart.MODEL_ID.equals(NewPMBEVisualIDRegistry
				.getModelID(view));
	}

}
