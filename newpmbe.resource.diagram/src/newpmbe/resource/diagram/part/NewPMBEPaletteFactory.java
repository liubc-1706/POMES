package newpmbe.resource.diagram.part;

import java.util.List;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import java.util.ArrayList;

import newpmbe.resource.diagram.providers.NewPMBEElementTypes;

import org.eclipse.gef.palette.PaletteGroup;

import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class NewPMBEPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createVpml1Group());
	}

	/**
	 * Creates "vpml" palette tool group
	 * @generated
	 */
	private PaletteContainer createVpml1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		paletteContainer.add(create抽象工具类型1CreationTool());
		paletteContainer.add(create抽象设备类型2CreationTool());
		paletteContainer.add(create抽象场所类型3CreationTool());
		paletteContainer.add(create工具类型4CreationTool());
		paletteContainer.add(create设备类型5CreationTool());
		paletteContainer.add(create场所类型6CreationTool());
		paletteContainer.add(create分类关系7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry create抽象工具类型1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMRAbstractToolType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMRAbstractToolType_2009);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("抽象工具类型1CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("抽象工具类型1CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create抽象设备类型2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMRAbstractMachineType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMRAbstractMachineType_2011);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("抽象设备类型2CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("抽象设备类型2CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create抽象场所类型3CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMRAbstractLocationType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMRAbstractLocationType_2010);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("抽象场所类型3CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("抽象场所类型3CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create工具类型4CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMRToolType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMRToolType_2014);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("工具类型4CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("工具类型4CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create设备类型5CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMRMachineType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMRMachineType_2013);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("设备类型5CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("设备类型5CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create场所类型6CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMRLocationType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMRLocationType_2012);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("场所类型6CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("场所类型6CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create分类关系7CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMRClassificationRelationship.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes
				.add(NewPMBEElementTypes.EMRClassificationRelation_4009);
		relationshipTypes
				.add(NewPMBEElementTypes.EMRClassificationRelation_4010);
		relationshipTypes
				.add(NewPMBEElementTypes.EMRClassificationRelation_4011);
		relationshipTypes
				.add(NewPMBEElementTypes.EMRClassificationRelation_4012);
		relationshipTypes
				.add(NewPMBEElementTypes.EMRClassificationRelation_4013);
		relationshipTypes
				.add(NewPMBEElementTypes.EMRClassificationRelation_4014);
		ToolEntry result = new LinkToolEntry(
				NewPMBEDiagramEditorPlugin.getString("分类关系7CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("分类关系7CreationTool.desc"), smallImage, largeImage, relationshipTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				ImageDescriptor smallIcon, ImageDescriptor largeIcon,
				List elementTypes) {
			super(title, description, smallIcon, largeIcon);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				ImageDescriptor smallIcon, ImageDescriptor largeIcon,
				List relationshipTypes) {
			super(title, description, smallIcon, largeIcon);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
