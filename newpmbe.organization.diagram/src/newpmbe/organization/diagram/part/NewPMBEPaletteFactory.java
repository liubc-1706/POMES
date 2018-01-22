package newpmbe.organization.diagram.part;

import java.util.List;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import java.util.ArrayList;

import newpmbe.organization.diagram.providers.NewPMBEElementTypes;

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
	 * @generated NOT hzg
	 */
	private PaletteContainer createVpml1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		//hzg modify
		paletteContainer.add(create��֯����1CreationTool());
		//end
		paletteContainer.add(create��ɫ2CreationTool());
		paletteContainer.add(create������ϵ3CreationTool());
		paletteContainer.add(create��ɹ�ϵ4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated NOT hzg
	 */
	private ToolEntry create��֯����1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMOGroupType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMOResourceGroupType_2003);
		//hzg modify
//		ToolEntry result = new NodeToolEntry(
//				NewPMBEDiagramEditorPlugin.getString("��Դ��1CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��Դ��1CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$
		ToolEntry result = new NodeToolEntry(
				"��֯����", "������֯����", smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$
		//end
		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create��ɫ2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMRRole.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMRRole_2004);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("��ɫ2CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��ɫ2CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create������ϵ3CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMOAssociationRelation.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(NewPMBEElementTypes.EMOAssociationRelation_4002);
		relationshipTypes.add(NewPMBEElementTypes.EMOAssociationRelation_4003);
		relationshipTypes.add(NewPMBEElementTypes.EMOAssociationRelation_4004);
		relationshipTypes.add(NewPMBEElementTypes.EMOAssociationRelation_4005);
		ToolEntry result = new LinkToolEntry(
				NewPMBEDiagramEditorPlugin.getString("������ϵ3CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("������ϵ3CreationTool.desc"), smallImage, largeImage, relationshipTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create��ɹ�ϵ4CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMOComposeRelation.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(NewPMBEElementTypes.EMOComposeRelation_4001);
		ToolEntry result = new LinkToolEntry(
				NewPMBEDiagramEditorPlugin.getString("��ɹ�ϵ4CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��ɹ�ϵ4CreationTool.desc"), smallImage, largeImage, relationshipTypes); //$NON-NLS-1$ $NON-NLS-2$

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
