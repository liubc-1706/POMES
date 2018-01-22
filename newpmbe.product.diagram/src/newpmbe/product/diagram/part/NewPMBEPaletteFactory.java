package newpmbe.product.diagram.part;

import newpmbe.product.diagram.edit.parts.EMPArtifactEditPart;
import newpmbe.product.diagram.edit.parts.EMPDocumentEditPart;
import newpmbe.product.diagram.edit.parts.EMPMessageEditPart;
import newpmbe.product.diagram.edit.parts.EMPOtherEditPart;
import newpmbe.product.diagram.edit.parts.EMPProductPackageEditPart;

import org.eclipse.emf.common.notify.AdapterFactory;

import org.eclipse.emf.edit.provider.IItemLabelProvider;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;

import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.MarqueeToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.SelectionToolEntry;

import org.eclipse.gef.tools.ConnectionCreationTool;
import org.eclipse.gef.tools.CreationTool;

import org.eclipse.gmf.runtime.notation.Node;

import vpml.processpackage.ProcesspackageFactory;
import java.util.List;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import java.util.ArrayList;

import newpmbe.product.diagram.providers.NewPMBEElementTypes;

import org.eclipse.gef.palette.PaletteGroup;

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
		paletteContainer.add(create制品1CreationTool());
		paletteContainer.add(create文档2CreationTool());
		paletteContainer.add(create消息3CreationTool());
		//paletteContainer.add(create表单6CreationTool());
		paletteContainer.add(create其他4CreationTool());
		paletteContainer.add(create组合产品5CreationTool());
		
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry create制品1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMPArtifact.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPArtifact_2001);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("制品1CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("制品1CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create文档2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMPDocument.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPDocument_2002);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("文档2CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("文档2CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create消息3CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMPMessage.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPMessage_2003);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("消息3CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("消息3CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create其他4CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMPOther.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPOther_2004);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("其他4CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("其他4CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create组合产品5CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMPProductPackage.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPProductPackage_2005);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("组合产品5CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("组合产品5CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
//	private ToolEntry create表单6CreationTool() {
//		ImageDescriptor smallImage;
//		ImageDescriptor largeImage;
//
//		smallImage = NewPMBEDiagramEditorPlugin
//				.findImageDescriptor("icons/EMPForm.gif"); //$NON-NLS-1$
//
//		largeImage = smallImage;
//
//		final List elementTypes = new ArrayList();
//		elementTypes.add(NewPMBEElementTypes.EMPForm_2006);
//		ToolEntry result = new NodeToolEntry(
//				NewPMBEDiagramEditorPlugin.getString("表单6CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("表单6CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$
//
//		return result;
//	}

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

}
