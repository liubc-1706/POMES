package newpmbe.process.diagram.navigator;

import java.io.File;
import newpmbe.process.diagram.edit.parts.EMOResourceGroupTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMOResourceGroupTypeNameEditPart;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
//import newpmbe.process.diagram.edit.parts.EMOGroupTypeEditPart;
//import newpmbe.process.diagram.edit.parts.EMOGroupTypeNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPArtifactEditPart;
import newpmbe.process.diagram.edit.parts.EMPArtifactNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPArtifactNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow10EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow11EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow12EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow13EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow14EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow15EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow16EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow2EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow3EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow4EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow5EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow6EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow7EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow8EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlow9EditPart;
import newpmbe.process.diagram.edit.parts.EMPAssFlowEditPart;
import newpmbe.process.diagram.edit.parts.EMPAutoActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPAutoActivityNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPAutoBatchActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPAutoBatchActivityNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPClockEditPart;
import newpmbe.process.diagram.edit.parts.EMPClockFlowEditPart;
import newpmbe.process.diagram.edit.parts.EMPClockNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPCompActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPCompActivityNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow10EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow11EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow12EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow13EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow14EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow15EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow16EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow17EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow18EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow2EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow3EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow4EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow5EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow6EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow7EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow8EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlow9EditPart;
import newpmbe.process.diagram.edit.parts.EMPDataFlowEditPart;
import newpmbe.process.diagram.edit.parts.EMPDiagramEditPart;
import newpmbe.process.diagram.edit.parts.EMPDocumentEditPart;
import newpmbe.process.diagram.edit.parts.EMPDocumentNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPFormEditPart;
import newpmbe.process.diagram.edit.parts.EMPFormNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPInAndEditPart;

import newpmbe.process.diagram.edit.parts.EMPInOrEditPart;

import newpmbe.process.diagram.edit.parts.EMPManualBatchActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPManualBatchActivityNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPMessageEditPart;
import newpmbe.process.diagram.edit.parts.EMPMessageNameEditPart;
//import newpmbe.process.diagram.edit.parts.EMPMileStoneEditPart;
//import newpmbe.process.diagram.edit.parts.EMPMileStoneNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPNormalActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPNormalActivityNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPOtherEditPart;
import newpmbe.process.diagram.edit.parts.EMPOtherNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPOutAndEditPart;

import newpmbe.process.diagram.edit.parts.EMPOutOrEditPart;

import newpmbe.process.diagram.edit.parts.EMPProductPackageEditPart;
import newpmbe.process.diagram.edit.parts.EMPProductPackageNameEditPart;
import newpmbe.process.diagram.edit.parts.EMPRefFlowEditPart;
import newpmbe.process.diagram.edit.parts.EMRLocationTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMRLocationTypeNameEditPart;
import newpmbe.process.diagram.edit.parts.EMRMachineTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMRMachineTypeNameEditPart;
import newpmbe.process.diagram.edit.parts.EMRRoleEditPart;
import newpmbe.process.diagram.edit.parts.EMRRoleNameEditPart;
import newpmbe.process.diagram.edit.parts.EMRToolTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMRToolTypeNameEditPart;

import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;
import newpmbe.process.diagram.part.NewPMBEVisualIDRegistry;

import newpmbe.process.diagram.providers.NewPMBEElementTypes;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;

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
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

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
			IProject project = (IProject) element;
			ImageDescriptor descriptor;
			if (project.getFileExtension().equals("process")) {
				descriptor = NewPMBEDiagramEditorPlugin
						.getBundledImageDescriptor("icons/processproject.gif");
				return descriptor.createImage();
			} else if (project.getFileExtension().equals("organization")) {
				descriptor = NewPMBEDiagramEditorPlugin
						.getBundledImageDescriptor("icons/organizationproject.gif");
				return descriptor.createImage();
			} else if (project.getFileExtension().equals("resource")) {
				descriptor = NewPMBEDiagramEditorPlugin
						.getBundledImageDescriptor("icons/resourceproject.gif");
				return descriptor.createImage();
			}
		}
		if (element instanceof IFolder) {

			//added by dingzonghu & zhangpeng
			String strFileName = null;
			String tagName = null;
			IPath path;
			IPath rawPath;
			String strPath;
			String strRawPath;

			path = ((IContainer) element).getProjectRelativePath();
			strPath = path.toString();
			rawPath = ((IContainer) element).getLocation();
			strRawPath = rawPath.toString();
			strFileName = strRawPath.substring(0, strRawPath
					.lastIndexOf(strPath))
					+ ".settings/" + "tree.xml";
			System.out.println(strFileName);
			if (new File(strFileName).exists()) {
				tagName = ((IContainer) element).toString();
				tagName = tagName.replaceAll("/", "___");
				try {
					DocumentBuilderFactory factory = DocumentBuilderFactory
							.newInstance();
					DocumentBuilder builder = factory.newDocumentBuilder();
					Document document;
					document = builder.parse(new File(strFileName));
					document.getDocumentElement().normalize();
					Node node = document.getElementsByTagName(tagName).item(0);
					if (node == null) {
						return getImage(
								"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPCompActivity",
								NewPMBEElementTypes.EMPCompActivity_2045);
					}
					if (((Element) node).getAttribute("locked").indexOf("true") != -1) {
						ImageDescriptor descriptor = NewPMBEDiagramEditorPlugin
								.getBundledImageDescriptor("icons/sharedactivity.gif");
						return descriptor.createImage();
					}
				} catch (Exception exp) {
					exp.printStackTrace();
				}
			}
			//end added by dingzonghu & zhangpeng
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPCompActivity",
					NewPMBEElementTypes.EMPCompActivity_2045);
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
		case EMPAutoBatchActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPAutoBatchActivity",
					NewPMBEElementTypes.EMPAutoBatchActivity_2048);
		case EMPOutOrEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPOutOr",
					NewPMBEElementTypes.EMPOutOr_2024);
		case EMPDocumentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPDocument",
					NewPMBEElementTypes.EMPDocument_2025);
		case EMPProductPackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPProductPackage",
					NewPMBEElementTypes.EMPProductPackage_2026);
		case EMPNormalActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPNormalActivity",
					NewPMBEElementTypes.EMPNormalActivity_2044);
		case EMPOtherEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPOther",
					NewPMBEElementTypes.EMPOther_2028);
		case EMPMessageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPMessage",
					NewPMBEElementTypes.EMPMessage_2029);
		case EMPCompActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPCompActivity",
					NewPMBEElementTypes.EMPCompActivity_2045);
		case EMPOutAndEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPOutAnd",
					NewPMBEElementTypes.EMPOutAnd_2031);
		case EMPManualBatchActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPManualBatchActivity",
					NewPMBEElementTypes.EMPManualBatchActivity_2046);
		case EMPClockEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPClock",
					NewPMBEElementTypes.EMPClock_2033);
		case EMPInAndEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPInAnd",
					NewPMBEElementTypes.EMPInAnd_2034);
		case EMPInOrEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPInOr",
					NewPMBEElementTypes.EMPInOr_2035);
		case EMPAutoActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPAutoActivity",
					NewPMBEElementTypes.EMPAutoActivity_2047);
		case EMPArtifactEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPArtifact",
					NewPMBEElementTypes.EMPArtifact_2037);
		case EMOResourceGroupTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/organizationpackage.ecore?EMOResourceGroupType",
					NewPMBEElementTypes.EMOResourceGroupType_2038);
		case EMRToolTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/resourcepackage.ecore?EMRToolType",
					NewPMBEElementTypes.EMRToolType_2039);
		case EMRRoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/resourcepackage.ecore?EMRRole",
					NewPMBEElementTypes.EMRRole_2040);
		case EMRMachineTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/resourcepackage.ecore?EMRMachineType",
					NewPMBEElementTypes.EMRMachineType_2041);
		case EMRLocationTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/resourcepackage.ecore?EMRLocationType",
					NewPMBEElementTypes.EMRLocationType_2042);
		case EMPFormEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///vpml/processpackage.ecore?EMPForm",
					NewPMBEElementTypes.EMPForm_2049);
		case EMPDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///vpml/processpackage.ecore?EMPDiagram",
					NewPMBEElementTypes.EMPDiagram_1000);
		case EMPClockFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPClockFlow",
					NewPMBEElementTypes.EMPClockFlow_4001);
		case EMPAssFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPAssFlow",
					NewPMBEElementTypes.EMPAssFlow_4003);
		case EMPRefFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPRefFlow",
					NewPMBEElementTypes.EMPRefFlow_4004);
		case EMPDataFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4002);
		case EMPAssFlow2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPAssFlow",
					NewPMBEElementTypes.EMPAssFlow_4006);
		case EMPAssFlow3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPAssFlow",
					NewPMBEElementTypes.EMPAssFlow_4007);
		case EMPAssFlow4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPAssFlow",
					NewPMBEElementTypes.EMPAssFlow_4008);
		case EMPAssFlow5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPAssFlow",
					NewPMBEElementTypes.EMPAssFlow_4009);
		case EMPAssFlow6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPAssFlow",
					NewPMBEElementTypes.EMPAssFlow_4010);
		case EMPAssFlow7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPAssFlow",
					NewPMBEElementTypes.EMPAssFlow_4011);
		case EMPAssFlow8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPAssFlow",
					NewPMBEElementTypes.EMPAssFlow_4012);
		case EMPAssFlow9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPAssFlow",
					NewPMBEElementTypes.EMPAssFlow_4013);
		case EMPAssFlow10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPAssFlow",
					NewPMBEElementTypes.EMPAssFlow_4014);
		case EMPAssFlow11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPAssFlow",
					NewPMBEElementTypes.EMPAssFlow_4015);
		case EMPAssFlow12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPAssFlow",
					NewPMBEElementTypes.EMPAssFlow_4025);
		case EMPAssFlow13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPAssFlow",
					NewPMBEElementTypes.EMPAssFlow_4026);
		case EMPAssFlow14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPAssFlow",
					NewPMBEElementTypes.EMPAssFlow_4027);
		case EMPAssFlow15EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPAssFlow",
					NewPMBEElementTypes.EMPAssFlow_4028);
		case EMPAssFlow16EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPAssFlow",
					NewPMBEElementTypes.EMPAssFlow_4029);
		case EMPDataFlow2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4005);
		case EMPDataFlow3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4016);
		case EMPDataFlow4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4017);
		case EMPDataFlow5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4018);
		case EMPDataFlow6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4019);
		case EMPDataFlow7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4020);
		case EMPDataFlow8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4021);
		case EMPDataFlow9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4022);
		case EMPDataFlow10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4023);
		case EMPDataFlow11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4030);
		case EMPDataFlow12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4031);
		case EMPDataFlow13EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4032);
		case EMPDataFlow14EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4033);
		case EMPDataFlow15EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4034);
		case EMPDataFlow16EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4035);
		case EMPDataFlow17EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4036);
		case EMPDataFlow18EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///vpml/processpackage.ecore?EMPDataFlow",
					NewPMBEElementTypes.EMPDataFlow_4037);
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
		if (element instanceof IFolder) {
			IFolder folder = (IFolder) element;
			return folder.getName();
		}
		if (element instanceof NewPMBENavigatorGroup) {
			NewPMBENavigatorGroup group = (NewPMBENavigatorGroup) element;
			if (group.getGroupName() == null || group.getGroupName().equals(""))
				return "未定义";
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
		case EMPAutoBatchActivityEditPart.VISUAL_ID:
			return getEMPAutoBatchActivity_2048Text(view);
		case EMPOutOrEditPart.VISUAL_ID:
			return getEMPOutOr_2024Text(view);
		case EMPDocumentEditPart.VISUAL_ID:
			return getEMPDocument_2025Text(view);
		case EMPProductPackageEditPart.VISUAL_ID:
			return getEMPProductPackage_2026Text(view);
		case EMPNormalActivityEditPart.VISUAL_ID:
			return getEMPNormalActivity_2044Text(view);
		case EMPOtherEditPart.VISUAL_ID:
			return getEMPOther_2028Text(view);
		case EMPMessageEditPart.VISUAL_ID:
			return getEMPMessage_2029Text(view);
		case EMPCompActivityEditPart.VISUAL_ID:
			return getEMPCompActivity_2045Text(view);
		case EMPOutAndEditPart.VISUAL_ID:
			return getEMPOutAnd_2031Text(view);
		case EMPManualBatchActivityEditPart.VISUAL_ID:
			return getEMPManualBatchActivity_2046Text(view);
		case EMPClockEditPart.VISUAL_ID:
			return getEMPClock_2033Text(view);
		case EMPInAndEditPart.VISUAL_ID:
			return getEMPInAnd_2034Text(view);
		case EMPInOrEditPart.VISUAL_ID:
			return getEMPInOr_2035Text(view);
		case EMPAutoActivityEditPart.VISUAL_ID:
			return getEMPAutoActivity_2047Text(view);
		case EMPArtifactEditPart.VISUAL_ID:
			return getEMPArtifact_2037Text(view);
		case EMOResourceGroupTypeEditPart.VISUAL_ID:
			return getEMOResourceGroupType_2038Text(view);
		case EMRToolTypeEditPart.VISUAL_ID:
			return getEMRToolType_2039Text(view);
		case EMRRoleEditPart.VISUAL_ID:
			return getEMRRole_2040Text(view);
		case EMRMachineTypeEditPart.VISUAL_ID:
			return getEMRMachineType_2041Text(view);
		case EMRLocationTypeEditPart.VISUAL_ID:
			return getEMRLocationType_2042Text(view);
		case EMPFormEditPart.VISUAL_ID:
			return getEMPForm_2049Text(view);
		case EMPDiagramEditPart.VISUAL_ID:
			return getEMPDiagram_1000Text(view);
		case EMPClockFlowEditPart.VISUAL_ID:
			return getEMPClockFlow_4001Text(view);
		case EMPAssFlowEditPart.VISUAL_ID:
			return getEMPAssFlow_4003Text(view);
		case EMPRefFlowEditPart.VISUAL_ID:
			return getEMPRefFlow_4004Text(view);
		case EMPDataFlowEditPart.VISUAL_ID:
			return getEMPDataFlow_4002Text(view);
		case EMPAssFlow2EditPart.VISUAL_ID:
			return getEMPAssFlow_4006Text(view);
		case EMPAssFlow3EditPart.VISUAL_ID:
			return getEMPAssFlow_4007Text(view);
		case EMPAssFlow4EditPart.VISUAL_ID:
			return getEMPAssFlow_4008Text(view);
		case EMPAssFlow5EditPart.VISUAL_ID:
			return getEMPAssFlow_4009Text(view);
		case EMPAssFlow6EditPart.VISUAL_ID:
			return getEMPAssFlow_4010Text(view);
		case EMPAssFlow7EditPart.VISUAL_ID:
			return getEMPAssFlow_4011Text(view);
		case EMPAssFlow8EditPart.VISUAL_ID:
			return getEMPAssFlow_4012Text(view);
		case EMPAssFlow9EditPart.VISUAL_ID:
			return getEMPAssFlow_4013Text(view);
		case EMPAssFlow10EditPart.VISUAL_ID:
			return getEMPAssFlow_4014Text(view);
		case EMPAssFlow11EditPart.VISUAL_ID:
			return getEMPAssFlow_4015Text(view);
		case EMPAssFlow12EditPart.VISUAL_ID:
			return getEMPAssFlow_4025Text(view);
		case EMPAssFlow13EditPart.VISUAL_ID:
			return getEMPAssFlow_4026Text(view);
		case EMPAssFlow14EditPart.VISUAL_ID:
			return getEMPAssFlow_4027Text(view);
		case EMPAssFlow15EditPart.VISUAL_ID:
			return getEMPAssFlow_4028Text(view);
		case EMPAssFlow16EditPart.VISUAL_ID:
			return getEMPAssFlow_4029Text(view);
		case EMPDataFlow2EditPart.VISUAL_ID:
			return getEMPDataFlow_4005Text(view);
		case EMPDataFlow3EditPart.VISUAL_ID:
			return getEMPDataFlow_4016Text(view);
		case EMPDataFlow4EditPart.VISUAL_ID:
			return getEMPDataFlow_4017Text(view);
		case EMPDataFlow5EditPart.VISUAL_ID:
			return getEMPDataFlow_4018Text(view);
		case EMPDataFlow6EditPart.VISUAL_ID:
			return getEMPDataFlow_4019Text(view);
		case EMPDataFlow7EditPart.VISUAL_ID:
			return getEMPDataFlow_4020Text(view);
		case EMPDataFlow8EditPart.VISUAL_ID:
			return getEMPDataFlow_4021Text(view);
		case EMPDataFlow9EditPart.VISUAL_ID:
			return getEMPDataFlow_4022Text(view);
		case EMPDataFlow10EditPart.VISUAL_ID:
			return getEMPDataFlow_4023Text(view);
		case EMPDataFlow11EditPart.VISUAL_ID:
			return getEMPDataFlow_4030Text(view);
		case EMPDataFlow12EditPart.VISUAL_ID:
			return getEMPDataFlow_4031Text(view);
		case EMPDataFlow13EditPart.VISUAL_ID:
			return getEMPDataFlow_4032Text(view);
		case EMPDataFlow14EditPart.VISUAL_ID:
			return getEMPDataFlow_4033Text(view);
		case EMPDataFlow15EditPart.VISUAL_ID:
			return getEMPDataFlow_4034Text(view);
		case EMPDataFlow16EditPart.VISUAL_ID:
			return getEMPDataFlow_4035Text(view);
		case EMPDataFlow17EditPart.VISUAL_ID:
			return getEMPDataFlow_4036Text(view);
		case EMPDataFlow18EditPart.VISUAL_ID:
			return getEMPDataFlow_4037Text(view);
		default:
			return getUnknownElementText(view);
		}
	}

	/**
	 * @generated NOT
	 */
	private String getEMPAutoBatchActivity_2048Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPAutoBatchActivityNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPAutoBatchActivity_2048;
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
					"Parser was not found for label " + 5048);
			return "未定义";
		}
	}

	/**
	 * @generated NOT
	 */
	private String getEMPOutOr_2024Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			//			return ((EMObject) domainModelElement).getName();
			return "输出或";
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2024);
			return "未定义";
		}
	}

	/**
	 * @generated NOT
	 */
	private String getEMPDocument_2025Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPDocumentNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPDocument_2025;
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
					"Parser was not found for label " + 5025);
			return "未定义";
		}
	}

	/**
	 * @generated NOT
	 */
	private String getEMPProductPackage_2026Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPProductPackageNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPProductPackage_2026;
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
					"Parser was not found for label " + 5026);
			return "未定义";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPNormalActivity_2044Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPNormalActivityNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPNormalActivity_2044;
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
					"Parser was not found for label " + 5044);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPOther_2028Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPOtherNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPOther_2028;
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
					"Parser was not found for label " + 5028);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPMessage_2029Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPMessageNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPMessage_2029;
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
					"Parser was not found for label " + 5029);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPCompActivity_2045Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPCompActivityNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPCompActivity_2045;
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
					"Parser was not found for label " + 5045);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPOutAnd_2031Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2031);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPManualBatchActivity_2046Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPManualBatchActivityNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPManualBatchActivity_2046;
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
					"Parser was not found for label " + 5046);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPClock_2033Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPClockNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPClock_2033;
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
					"Parser was not found for label " + 5033);
			return "";
		}
	}

	/**
	 * @generated NOT
	 */
	private String getEMPInAnd_2034Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			//			return ((EMObject) domainModelElement).getName();
			return "输入与";
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2034);
			return "未定义";
		}
	}

	/**
	 * @generated NOT
	 */
	private String getEMPInOr_2035Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return "输入或";
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2035);
			return "未定义";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPAutoActivity_2047Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPAutoActivityNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPAutoActivity_2047;
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
					"Parser was not found for label " + 5047);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPArtifact_2037Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPArtifactNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPArtifact_2037;
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
					"Parser was not found for label " + 5037);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMOResourceGroupType_2038Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMOResourceGroupTypeNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMOResourceGroupType_2038;
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
					"Parser was not found for label " + 5038);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMRToolType_2039Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMRToolTypeNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMRToolType_2039;
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
					"Parser was not found for label " + 5039);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMRRole_2040Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMRRoleNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMRRole_2040;
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
					"Parser was not found for label " + 5040);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMRMachineType_2041Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMRMachineTypeNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMRMachineType_2041;
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
					"Parser was not found for label " + 5041);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMRLocationType_2042Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMRLocationTypeNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMRLocationType_2042;
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
					"Parser was not found for label " + 5042);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPForm_2049Text(View view) {
		IParser parser = ParserService.getInstance().getParser(
				new IAdaptable() {
					public Object getAdapter(Class adapter) {
						if (String.class.equals(adapter)) {
							return NewPMBEVisualIDRegistry
									.getType(EMPFormNameEditPart.VISUAL_ID);
						}
						if (IElementType.class.equals(adapter)) {
							return NewPMBEElementTypes.EMPForm_2049;
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
					"Parser was not found for label " + 5049);
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
	private String getEMPClockFlow_4001Text(View view) {
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
	private String getEMPDataFlow_4002Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPAssFlow_4003Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4003);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPRefFlow_4004Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4004);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4005Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4005);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4016Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4016);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4017Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4017);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4018Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4018);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4019Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4019);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4020Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4020);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPAssFlow_4006Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4006);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPAssFlow_4007Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4007);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPAssFlow_4008Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4008);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPAssFlow_4009Text(View view) {
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
	private String getEMPAssFlow_4010Text(View view) {
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
	private String getEMPAssFlow_4011Text(View view) {
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
	private String getEMPAssFlow_4012Text(View view) {
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
	private String getEMPAssFlow_4013Text(View view) {
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
	private String getEMPAssFlow_4014Text(View view) {
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
	private String getEMPAssFlow_4015Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4015);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPAssFlow_4025Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4025);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPAssFlow_4026Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4026);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPAssFlow_4027Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4027);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPAssFlow_4028Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4028);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPAssFlow_4029Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4029);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4021Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4021);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4022Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4022);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4023Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4023);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4030Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4030);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4031Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4031);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4032Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4032);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4033Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4033);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4034Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4034);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4035Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4035);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4036Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4036);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEMPDataFlow_4037Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return ((EMObject) domainModelElement).getName();
		} else {
			NewPMBEDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4037);
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
