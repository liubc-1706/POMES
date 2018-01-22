package newpmbe.process.diagram.part;

import java.util.List;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import java.util.ArrayList;

import newpmbe.process.diagram.creationtools.CompActivityCreationTool;
import newpmbe.process.diagram.creationtools.DataFlowCreationTool;
import newpmbe.process.diagram.providers.NewPMBEElementTypes;

import org.eclipse.gef.palette.PaletteGroup;

import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class NewPMBEPaletteFactory {

	/**
	 * @generated NOT qj
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createVpmlActivityGroup());
		paletteRoot.add(createVpmlProductGroup());
		paletteRoot.add(createVpmlOrganizationGroup());
		paletteRoot.add(createVpmlResourceGroup());
		paletteRoot.add(createVpmlForkJoinGroup());
		paletteRoot.add(createVpmlDataflowGroup());
		paletteRoot.add(createVpmlOtherGroup());
	}

	/**
	 * Creates "vpml" palette tool group
	 * @generated
	 */
	private PaletteContainer createVpml1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		paletteContainer.add(create�1CreationTool());
		paletteContainer.add(create�Զ��2CreationTool());
		paletteContainer.add(create�ֹ�������3CreationTool());
		paletteContainer.add(create�Զ�������4CreationTool());
		paletteContainer.add(create��ϻ5CreationTool());
		paletteContainer.add(create�ĵ�6CreationTool());
		paletteContainer.add(create��Ʒ7CreationTool());
		paletteContainer.add(create��Ϣ8CreationTool());
		paletteContainer.add(create������Ʒ9CreationTool());
		paletteContainer.add(create��ϲ�Ʒ10CreationTool());
		paletteContainer.add(createʱ��11CreationTool());
		paletteContainer.add(create������12CreationTool());
		paletteContainer.add(create�����13CreationTool());
		paletteContainer.add(create�����14CreationTool());
		paletteContainer.add(create�����15CreationTool());
		paletteContainer.add(create��ɫ16CreationTool());
		paletteContainer.add(create��������17CreationTool());
		paletteContainer.add(create�豸����18CreationTool());
		paletteContainer.add(create��������19CreationTool());
		paletteContainer.add(create��Դ��20CreationTool());
		paletteContainer.add(create����������21CreationTool());
		paletteContainer.add(createʱ��������22CreationTool());
		paletteContainer.add(create��������23CreationTool());
		paletteContainer.add(create��������24CreationTool());
		paletteContainer.add(create��25CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "vpml" palette tool group
	 * @generated NOT qj
	 */
	/*	private PaletteContainer createVpmlAllGroup() {
	 PaletteGroup paletteContainer = new PaletteGroup(
	 NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
	 paletteContainer.add(create�1CreationTool());
	 paletteContainer.add(create��̱��26CreationTool());
	 paletteContainer.add(create�Զ��2CreationTool());
	 paletteContainer.add(create�ֹ�������3CreationTool());
	 paletteContainer.add(create�Զ�������4CreationTool());
	 paletteContainer.add(create��ϻ5CreationTool());
	 paletteContainer.add(create�ĵ�6CreationTool());
	 paletteContainer.add(create��Ʒ7CreationTool());
	 paletteContainer.add(create��Ϣ8CreationTool());
	 paletteContainer.add(create��25CreationTool());
	 paletteContainer.add(create������Ʒ9CreationTool());
	 paletteContainer.add(create��ϲ�Ʒ10CreationTool());
	 paletteContainer.add(createʱ��11CreationTool());
	 paletteContainer.add(create������12CreationTool());
	 paletteContainer.add(create�����13CreationTool());
	 paletteContainer.add(create�����14CreationTool());
	 paletteContainer.add(create�����15CreationTool());
	 paletteContainer.add(create��ɫ16CreationTool());
	 paletteContainer.add(create��������17CreationTool());
	 paletteContainer.add(create�豸����18CreationTool());
	 paletteContainer.add(create��������19CreationTool());
	 //change hzg
	 paletteContainer.add(create��֯����20CreationTool());
	 //end
	 paletteContainer.add(create����������21CreationTool());
	 paletteContainer.add(createʱ��������22CreationTool());
	 paletteContainer.add(create��������23CreationTool());
	 paletteContainer.add(create��������24CreationTool());

	 return paletteContainer;
	 }*/

	private PaletteContainer createVpmlActivityGroup() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		paletteContainer.add(create�����CreationTool());
		paletteContainer.add(create�1CreationTool());
		paletteContainer.add(create�Զ��2CreationTool());
		paletteContainer.add(create�ֹ�������3CreationTool());
		paletteContainer.add(create�Զ�������4CreationTool());
		paletteContainer.add(create��ϻ5CreationTool());

		return paletteContainer;
	}

	private PaletteContainer createVpmlProductGroup() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		paletteContainer.add(create��Ʒ����CreationTool());
		paletteContainer.add(create�ĵ�6CreationTool());
		paletteContainer.add(create��Ʒ7CreationTool());
		paletteContainer.add(create��Ϣ8CreationTool());

		paletteContainer.add(create������Ʒ9CreationTool());
		paletteContainer.add(create��ϲ�Ʒ10CreationTool());

		return paletteContainer;
	}

	private PaletteContainer createVpmlOrganizationGroup() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		paletteContainer.add(create��֯Ԫ��CreationTool());
		paletteContainer.add(create��ɫ16CreationTool());
		paletteContainer.add(create��֯����20CreationTool());
		return paletteContainer;
	}

	private PaletteContainer createVpmlResourceGroup() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		paletteContainer.add(create��Դ����CreationTool());
		paletteContainer.add(create��������17CreationTool());
		paletteContainer.add(create�豸����18CreationTool());
		paletteContainer.add(create��������19CreationTool());
		return paletteContainer;
	}

	private PaletteContainer createVpmlForkJoinGroup() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		paletteContainer.add(create��֧����CreationTool());
		paletteContainer.add(create������12CreationTool());
		paletteContainer.add(create�����13CreationTool());
		paletteContainer.add(create�����14CreationTool());
		paletteContainer.add(create�����15CreationTool());
		return paletteContainer;
	}

	private PaletteContainer createVpmlDataflowGroup() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		paletteContainer.add(create������CreationTool());
		paletteContainer.add(create����������21CreationTool());
		paletteContainer.add(createʱ��������22CreationTool());
		paletteContainer.add(create��������23CreationTool());
		paletteContainer.add(create��������24CreationTool());
		return paletteContainer;
	}

	private PaletteContainer createVpmlOtherGroup() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		paletteContainer.add(create��������CreationTool());
		paletteContainer.add(createʱ��11CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	//	public static boolean isNormalActivity;
	private ToolEntry create�1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPNormalActivity.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPNormalActivity_2044);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("�1CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("�1CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create�Զ��2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPAutoActivity.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPAutoActivity_2047);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("�Զ��2CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("�Զ��2CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create�ֹ�������3CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPManualBatchActivity.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPManualBatchActivity_2046);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("�ֹ�������3CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("�ֹ�������3CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create�Զ�������4CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPAutoBatchActivity.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPAutoBatchActivity_2048);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("�Զ�������4CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("�Զ�������4CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create��ϻ5CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPCompActivity.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPCompActivity_2045);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("��ϻ5CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��ϻ5CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create�ĵ�6CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPDocument.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPDocument_2025);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("�ĵ�6CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("�ĵ�6CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create��Ʒ7CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPArtifact.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPArtifact_2037);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("��Ʒ7CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��Ʒ7CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create��Ϣ8CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPMessage.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPMessage_2029);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("��Ϣ8CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��Ϣ8CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create������Ʒ9CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPOther.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPOther_2028);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("������Ʒ9CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("������Ʒ9CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create��ϲ�Ʒ10CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPProductPackage.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPProductPackage_2026);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("��ϲ�Ʒ10CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��ϲ�Ʒ10CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createʱ��11CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPClock.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPClock_2033);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("ʱ��11CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("ʱ��11CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create������12CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPInAnd.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPInAnd_2034);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("������12CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("������12CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create�����13CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPInOr.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPInOr_2035);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("�����13CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("�����13CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create�����14CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPOutAnd.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPOutAnd_2031);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("�����14CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("�����14CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create�����15CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPOutOr.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPOutOr_2024);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("�����15CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("�����15CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create��ɫ16CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMRRole.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMRRole_2040);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("��ɫ16CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��ɫ16CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create��������17CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMRToolType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMRToolType_2039);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("��������17CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��������17CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create�豸����18CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMRMachineType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMRMachineType_2041);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("�豸����18CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("�豸����18CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create��������19CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMRLocationType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMRLocationType_2042);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("��������19CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��������19CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create��Դ��20CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMOGroupType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMOResourceGroupType_2038);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("��Դ��20CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��Դ��20CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	/*	private ToolEntry create��Դ��20CreationTool() {
	 ImageDescriptor smallImage;
	 ImageDescriptor largeImage;

	 smallImage = NewPMBEDiagramEditorPlugin
	 .findImageDescriptor("icons/EMOGroupType.gif"); //$NON-NLS-1$

	 largeImage = smallImage;

	 final List elementTypes = new ArrayList();
	 elementTypes.add(NewPMBEElementTypes.EMOResourceGroupType_2038);
	 ToolEntry result = new NodeToolEntry(
	 NewPMBEDiagramEditorPlugin.getString("��Դ��20CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��Դ��20CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

	 return result;
	 }*/

	/**
	 * @generated NOT hzg
	 * 
	 */
	private ToolEntry create��֯����20CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMOGroupType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMOResourceGroupType_2038);
		//hzg modify
		//		ToolEntry result = new NodeToolEntry(
		//				NewPMBEDiagramEditorPlugin.getString("��Դ��20CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��Դ��20CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$
		ToolEntry result = new NodeToolEntry(
				"��֯����", "������֯����", smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$
		//end
		return result;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry create����������21CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMPDataFlow.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4002);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4005);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4016);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4017);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4018);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4019);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4020);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4021);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4022);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4023);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4030);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4031);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4032);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4033);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4034);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4035);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4036);
		relationshipTypes.add(NewPMBEElementTypes.EMPDataFlow_4037);
		
		ToolEntry result = new DataFlowToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("����������21CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("����������21CreationTool.desc"), smallImage, largeImage, relationshipTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createʱ��������22CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMPClockFlow.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(NewPMBEElementTypes.EMPClockFlow_4001);
		ToolEntry result = new DataFlowToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("ʱ��������22CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("ʱ��������22CreationTool.desc"), smallImage, largeImage, relationshipTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create��������23CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPAssFlow.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(NewPMBEElementTypes.EMPAssFlow_4003);
		relationshipTypes.add(NewPMBEElementTypes.EMPAssFlow_4006);
		relationshipTypes.add(NewPMBEElementTypes.EMPAssFlow_4007);
		relationshipTypes.add(NewPMBEElementTypes.EMPAssFlow_4008);
		relationshipTypes.add(NewPMBEElementTypes.EMPAssFlow_4009);
		relationshipTypes.add(NewPMBEElementTypes.EMPAssFlow_4010);
		relationshipTypes.add(NewPMBEElementTypes.EMPAssFlow_4011);
		relationshipTypes.add(NewPMBEElementTypes.EMPAssFlow_4012);
		relationshipTypes.add(NewPMBEElementTypes.EMPAssFlow_4013);
		relationshipTypes.add(NewPMBEElementTypes.EMPAssFlow_4014);
		relationshipTypes.add(NewPMBEElementTypes.EMPAssFlow_4015);
		relationshipTypes.add(NewPMBEElementTypes.EMPAssFlow_4025);
		relationshipTypes.add(NewPMBEElementTypes.EMPAssFlow_4026);
		relationshipTypes.add(NewPMBEElementTypes.EMPAssFlow_4027);
		relationshipTypes.add(NewPMBEElementTypes.EMPAssFlow_4028);
		relationshipTypes.add(NewPMBEElementTypes.EMPAssFlow_4029);
		ToolEntry result = new LinkToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("��������23CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��������23CreationTool.desc"), smallImage, largeImage, relationshipTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create��������24CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPRefFlow.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(NewPMBEElementTypes.EMPRefFlow_4004);
		ToolEntry result = new LinkToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("��������24CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��������24CreationTool.desc"), smallImage, largeImage, relationshipTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create��25CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEElementTypes
				.getImageDescriptor(NewPMBEElementTypes.EMPForm_2049);

		largeImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPForm.gif"); //$NON-NLS-1$

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPForm_2049);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("��25CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��25CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	/*	private ToolEntry create��25CreationTool() {
	 ImageDescriptor smallImage;
	 ImageDescriptor largeImage;

	 smallImage = NewPMBEElementTypes
	 .getImageDescriptor(NewPMBEElementTypes.EMPForm_2049);

	 largeImage = NewPMBEDiagramEditorPlugin
	 .findImageDescriptor("icons/EMPForm.gif"); //$NON-NLS-1$

	 final List elementTypes = new ArrayList();
	 elementTypes.add(NewPMBEElementTypes.EMPForm_2049);
	 ToolEntry result = new NodeToolEntry(
	 NewPMBEDiagramEditorPlugin.getString("��25CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��25CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

	 return result;
	 }*/

	/**
	 * @generated NOT
	 */
	//qj mod
	//��̱��������ͨ���ElementType����EMPNormalActivity_2044
	//ֻ�Ǹ���ͼƬ��Editpart��Palette�У����±꣨δ������̱����
	//���뷨�޷�ʵ��
	/*	private ToolEntry create��̱��26CreationTool() {
	 ImageDescriptor smallImage;
	 ImageDescriptor largeImage;

	 isNormalActivity = false;
	 smallImage = NewPMBEDiagramEditorPlugin
	 .findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPMilestoneActivity.gif"); //$NON-NLS-1$

	 largeImage = smallImage;
	 
	 final List elementTypes = new ArrayList();
	 elementTypes.add(NewPMBEElementTypes.EMPNormalActivity_2044);
	 ToolEntry result = new NodeToolEntry(
	 NewPMBEDiagramEditorPlugin.getString("��̱��26CreationTool.title"),
	 NewPMBEDiagramEditorPlugin.getString("��̱��26CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

	 return result;
	 }*/
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
	 * ΪCompActivity��������ToolEntry
	 * @generated NOT
	 */
	private static class CompActivityToolEntry extends ToolEntry {

		/**
		 * @generated NOT
		 */
		private final List elementTypes;

		/**
		 * @generated NOT
		 */
		private CompActivityToolEntry(String title, String description,
				ImageDescriptor smallIcon, ImageDescriptor largeIcon,
				List elementTypes) {
			super(title, description, smallIcon, largeIcon);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated NOT
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

	/**
	 * @generated NOT
	 */
	private static class DataFlowToolEntry extends ToolEntry {

		/**
		 * @generated NOT
		 */
		private final List relationshipTypes;

		/**
		 * @generated NOT
		 */
		private DataFlowToolEntry(String title, String description,
				ImageDescriptor smallIcon, ImageDescriptor largeIcon,
				List relationshipTypes) {
			super(title, description, smallIcon, largeIcon);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated NOT
		 */
		public Tool createTool() {
			Tool tool = new DataFlowCreationTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	//��palette�϶Ը��������˵��
	private ToolEntry create�����CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		//	isNormalActivity = true;
		smallImage = null;

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("�����CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("�����CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	private ToolEntry create��Ʒ����CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		//	isNormalActivity = true;
		smallImage = null;

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("��Ʒ����CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��Ʒ����CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	private ToolEntry create��֯Ԫ��CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		//	isNormalActivity = true;
		smallImage = null;

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("��֯Ԫ��CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��֯Ԫ��CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	private ToolEntry create��Դ����CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		//	isNormalActivity = true;
		smallImage = null;

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("��Դ����CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��Դ����CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	private ToolEntry create��֧����CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		//	isNormalActivity = true;
		smallImage = null;

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("��֧����CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��֧����CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	private ToolEntry create������CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		//	isNormalActivity = true;
		smallImage = null;

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("������CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("������CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	private ToolEntry create��������CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		//	isNormalActivity = true;
		smallImage = null;

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("��������CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("��������CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}
}