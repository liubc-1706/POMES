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
		paletteContainer.add(create活动1CreationTool());
		paletteContainer.add(create自动活动2CreationTool());
		paletteContainer.add(create手工批处理活动3CreationTool());
		paletteContainer.add(create自动批处理活动4CreationTool());
		paletteContainer.add(create组合活动5CreationTool());
		paletteContainer.add(create文档6CreationTool());
		paletteContainer.add(create制品7CreationTool());
		paletteContainer.add(create消息8CreationTool());
		paletteContainer.add(create其他产品9CreationTool());
		paletteContainer.add(create组合产品10CreationTool());
		paletteContainer.add(create时钟11CreationTool());
		paletteContainer.add(create输入与12CreationTool());
		paletteContainer.add(create输入或13CreationTool());
		paletteContainer.add(create输出与14CreationTool());
		paletteContainer.add(create输出或15CreationTool());
		paletteContainer.add(create角色16CreationTool());
		paletteContainer.add(create工具类型17CreationTool());
		paletteContainer.add(create设备类型18CreationTool());
		paletteContainer.add(create场所类型19CreationTool());
		paletteContainer.add(create资源组20CreationTool());
		paletteContainer.add(create数据流连接21CreationTool());
		paletteContainer.add(create时钟流连接22CreationTool());
		paletteContainer.add(create关联连接23CreationTool());
		paletteContainer.add(create引用连接24CreationTool());
		paletteContainer.add(create表单25CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "vpml" palette tool group
	 * @generated NOT qj
	 */
	/*	private PaletteContainer createVpmlAllGroup() {
	 PaletteGroup paletteContainer = new PaletteGroup(
	 NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
	 paletteContainer.add(create活动1CreationTool());
	 paletteContainer.add(create里程碑活动26CreationTool());
	 paletteContainer.add(create自动活动2CreationTool());
	 paletteContainer.add(create手工批处理活动3CreationTool());
	 paletteContainer.add(create自动批处理活动4CreationTool());
	 paletteContainer.add(create组合活动5CreationTool());
	 paletteContainer.add(create文档6CreationTool());
	 paletteContainer.add(create制品7CreationTool());
	 paletteContainer.add(create消息8CreationTool());
	 paletteContainer.add(create表单25CreationTool());
	 paletteContainer.add(create其他产品9CreationTool());
	 paletteContainer.add(create组合产品10CreationTool());
	 paletteContainer.add(create时钟11CreationTool());
	 paletteContainer.add(create输入与12CreationTool());
	 paletteContainer.add(create输入或13CreationTool());
	 paletteContainer.add(create输出与14CreationTool());
	 paletteContainer.add(create输出或15CreationTool());
	 paletteContainer.add(create角色16CreationTool());
	 paletteContainer.add(create工具类型17CreationTool());
	 paletteContainer.add(create设备类型18CreationTool());
	 paletteContainer.add(create场所类型19CreationTool());
	 //change hzg
	 paletteContainer.add(create组织机构20CreationTool());
	 //end
	 paletteContainer.add(create数据流连接21CreationTool());
	 paletteContainer.add(create时钟流连接22CreationTool());
	 paletteContainer.add(create关联连接23CreationTool());
	 paletteContainer.add(create引用连接24CreationTool());

	 return paletteContainer;
	 }*/

	private PaletteContainer createVpmlActivityGroup() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		paletteContainer.add(create活动类型CreationTool());
		paletteContainer.add(create活动1CreationTool());
		paletteContainer.add(create自动活动2CreationTool());
		paletteContainer.add(create手工批处理活动3CreationTool());
		paletteContainer.add(create自动批处理活动4CreationTool());
		paletteContainer.add(create组合活动5CreationTool());

		return paletteContainer;
	}

	private PaletteContainer createVpmlProductGroup() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		paletteContainer.add(create产品类型CreationTool());
		paletteContainer.add(create文档6CreationTool());
		paletteContainer.add(create制品7CreationTool());
		paletteContainer.add(create消息8CreationTool());

		paletteContainer.add(create其他产品9CreationTool());
		paletteContainer.add(create组合产品10CreationTool());

		return paletteContainer;
	}

	private PaletteContainer createVpmlOrganizationGroup() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		paletteContainer.add(create组织元素CreationTool());
		paletteContainer.add(create角色16CreationTool());
		paletteContainer.add(create组织机构20CreationTool());
		return paletteContainer;
	}

	private PaletteContainer createVpmlResourceGroup() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		paletteContainer.add(create资源类型CreationTool());
		paletteContainer.add(create工具类型17CreationTool());
		paletteContainer.add(create设备类型18CreationTool());
		paletteContainer.add(create场所类型19CreationTool());
		return paletteContainer;
	}

	private PaletteContainer createVpmlForkJoinGroup() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		paletteContainer.add(create分支类型CreationTool());
		paletteContainer.add(create输入与12CreationTool());
		paletteContainer.add(create输入或13CreationTool());
		paletteContainer.add(create输出与14CreationTool());
		paletteContainer.add(create输出或15CreationTool());
		return paletteContainer;
	}

	private PaletteContainer createVpmlDataflowGroup() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		paletteContainer.add(create流连接CreationTool());
		paletteContainer.add(create数据流连接21CreationTool());
		paletteContainer.add(create时钟流连接22CreationTool());
		paletteContainer.add(create关联连接23CreationTool());
		paletteContainer.add(create引用连接24CreationTool());
		return paletteContainer;
	}

	private PaletteContainer createVpmlOtherGroup() {
		PaletteGroup paletteContainer = new PaletteGroup(
				NewPMBEDiagramEditorPlugin.getString("Vpml1Group.title")); //$NON-NLS-1$
		paletteContainer.add(create其他类型CreationTool());
		paletteContainer.add(create时钟11CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	//	public static boolean isNormalActivity;
	private ToolEntry create活动1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPNormalActivity.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPNormalActivity_2044);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("活动1CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("活动1CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create自动活动2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPAutoActivity.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPAutoActivity_2047);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("自动活动2CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("自动活动2CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create手工批处理活动3CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPManualBatchActivity.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPManualBatchActivity_2046);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("手工批处理活动3CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("手工批处理活动3CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create自动批处理活动4CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPAutoBatchActivity.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPAutoBatchActivity_2048);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("自动批处理活动4CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("自动批处理活动4CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create组合活动5CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPCompActivity.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPCompActivity_2045);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("组合活动5CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("组合活动5CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create文档6CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPDocument.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPDocument_2025);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("文档6CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("文档6CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create制品7CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPArtifact.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPArtifact_2037);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("制品7CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("制品7CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create消息8CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPMessage.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPMessage_2029);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("消息8CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("消息8CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create其他产品9CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPOther.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPOther_2028);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("其他产品9CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("其他产品9CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create组合产品10CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPProductPackage.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPProductPackage_2026);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("组合产品10CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("组合产品10CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create时钟11CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPClock.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPClock_2033);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("时钟11CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("时钟11CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create输入与12CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPInAnd.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPInAnd_2034);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("输入与12CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("输入与12CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create输入或13CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPInOr.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPInOr_2035);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("输入或13CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("输入或13CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create输出与14CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPOutAnd.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPOutAnd_2031);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("输出与14CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("输出与14CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create输出或15CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPOutOr.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPOutOr_2024);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("输出或15CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("输出或15CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create角色16CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMRRole.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMRRole_2040);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("角色16CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("角色16CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create工具类型17CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMRToolType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMRToolType_2039);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("工具类型17CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("工具类型17CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create设备类型18CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMRMachineType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMRMachineType_2041);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("设备类型18CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("设备类型18CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create场所类型19CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMRLocationType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMRLocationType_2042);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("场所类型19CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("场所类型19CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create资源组20CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMOGroupType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMOResourceGroupType_2038);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("资源组20CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("资源组20CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	/*	private ToolEntry create资源组20CreationTool() {
	 ImageDescriptor smallImage;
	 ImageDescriptor largeImage;

	 smallImage = NewPMBEDiagramEditorPlugin
	 .findImageDescriptor("icons/EMOGroupType.gif"); //$NON-NLS-1$

	 largeImage = smallImage;

	 final List elementTypes = new ArrayList();
	 elementTypes.add(NewPMBEElementTypes.EMOResourceGroupType_2038);
	 ToolEntry result = new NodeToolEntry(
	 NewPMBEDiagramEditorPlugin.getString("资源组20CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("资源组20CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

	 return result;
	 }*/

	/**
	 * @generated NOT hzg
	 * 
	 */
	private ToolEntry create组织机构20CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMOGroupType.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMOResourceGroupType_2038);
		//hzg modify
		//		ToolEntry result = new NodeToolEntry(
		//				NewPMBEDiagramEditorPlugin.getString("资源组20CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("资源组20CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$
		ToolEntry result = new NodeToolEntry(
				"组织机构", "创建组织机构", smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$
		//end
		return result;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry create数据流连接21CreationTool() {
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
						.getString("数据流连接21CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("数据流连接21CreationTool.desc"), smallImage, largeImage, relationshipTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry create时钟流连接22CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("icons/EMPClockFlow.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(NewPMBEElementTypes.EMPClockFlow_4001);
		ToolEntry result = new DataFlowToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("时钟流连接22CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("时钟流连接22CreationTool.desc"), smallImage, largeImage, relationshipTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create关联连接23CreationTool() {
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
						.getString("关联连接23CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("关联连接23CreationTool.desc"), smallImage, largeImage, relationshipTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create引用连接24CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPRefFlow.gif"); //$NON-NLS-1$

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(NewPMBEElementTypes.EMPRefFlow_4004);
		ToolEntry result = new LinkToolEntry(
				NewPMBEDiagramEditorPlugin
						.getString("引用连接24CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("引用连接24CreationTool.desc"), smallImage, largeImage, relationshipTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry create表单25CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = NewPMBEElementTypes
				.getImageDescriptor(NewPMBEElementTypes.EMPForm_2049);

		largeImage = NewPMBEDiagramEditorPlugin
				.findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPForm.gif"); //$NON-NLS-1$

		final List elementTypes = new ArrayList();
		elementTypes.add(NewPMBEElementTypes.EMPForm_2049);
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("表单25CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("表单25CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	/*	private ToolEntry create表单25CreationTool() {
	 ImageDescriptor smallImage;
	 ImageDescriptor largeImage;

	 smallImage = NewPMBEElementTypes
	 .getImageDescriptor(NewPMBEElementTypes.EMPForm_2049);

	 largeImage = NewPMBEDiagramEditorPlugin
	 .findImageDescriptor("icons/EMPForm.gif"); //$NON-NLS-1$

	 final List elementTypes = new ArrayList();
	 elementTypes.add(NewPMBEElementTypes.EMPForm_2049);
	 ToolEntry result = new NodeToolEntry(
	 NewPMBEDiagramEditorPlugin.getString("表单25CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("表单25CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

	 return result;
	 }*/

	/**
	 * @generated NOT
	 */
	//qj mod
	//里程碑活动借用普通活动的ElementType，即EMPNormalActivity_2044
	//只是改了图片（Editpart和Palette中）和下标（未命名里程碑活动）
	//此想法无法实现
	/*	private ToolEntry create里程碑活动26CreationTool() {
	 ImageDescriptor smallImage;
	 ImageDescriptor largeImage;

	 isNormalActivity = false;
	 smallImage = NewPMBEDiagramEditorPlugin
	 .findImageDescriptor("/newpmbe.edit/icons/full/obj16/EMPMilestoneActivity.gif"); //$NON-NLS-1$

	 largeImage = smallImage;
	 
	 final List elementTypes = new ArrayList();
	 elementTypes.add(NewPMBEElementTypes.EMPNormalActivity_2044);
	 ToolEntry result = new NodeToolEntry(
	 NewPMBEDiagramEditorPlugin.getString("里程碑活动26CreationTool.title"),
	 NewPMBEDiagramEditorPlugin.getString("里程碑活动26CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

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
	 * 为CompActivity单独定义ToolEntry
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

	//在palette上对各个分类的说明
	private ToolEntry create活动类型CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		//	isNormalActivity = true;
		smallImage = null;

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("活动类型CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("活动类型CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	private ToolEntry create产品类型CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		//	isNormalActivity = true;
		smallImage = null;

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("产品类型CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("产品类型CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	private ToolEntry create组织元素CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		//	isNormalActivity = true;
		smallImage = null;

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("组织元素CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("组织元素CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	private ToolEntry create资源类型CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		//	isNormalActivity = true;
		smallImage = null;

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("资源类型CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("资源类型CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	private ToolEntry create分支类型CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		//	isNormalActivity = true;
		smallImage = null;

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("分支类型CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("分支类型CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	private ToolEntry create流连接CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		//	isNormalActivity = true;
		smallImage = null;

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("流连接CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("流连接CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	private ToolEntry create其他类型CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		//	isNormalActivity = true;
		smallImage = null;

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		ToolEntry result = new NodeToolEntry(
				NewPMBEDiagramEditorPlugin.getString("其他类型CreationTool.title"), NewPMBEDiagramEditorPlugin.getString("其他类型CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}
}