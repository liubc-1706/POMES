package newpmbe.process.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import newpmbe.process.diagram.edit.parts.EMOResourceGroupTypeEditPart;
//import newpmbe.process.diagram.edit.parts.EMOGroupTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMPArtifactEditPart;
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
import newpmbe.process.diagram.edit.parts.EMPAutoBatchActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPClockEditPart;
import newpmbe.process.diagram.edit.parts.EMPClockFlowEditPart;
import newpmbe.process.diagram.edit.parts.EMPCompActivityEditPart;
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
import newpmbe.process.diagram.edit.parts.EMPFormEditPart;
import newpmbe.process.diagram.edit.parts.EMPInAndEditPart;
import newpmbe.process.diagram.edit.parts.EMPInOrEditPart;
import newpmbe.process.diagram.edit.parts.EMPManualBatchActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPMessageEditPart;
//import newpmbe.process.diagram.edit.parts.EMPMileStoneEditPart;
import newpmbe.process.diagram.edit.parts.EMPNormalActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMPOtherEditPart;
import newpmbe.process.diagram.edit.parts.EMPOutAndEditPart;
import newpmbe.process.diagram.edit.parts.EMPOutOrEditPart;
import newpmbe.process.diagram.edit.parts.EMPProductPackageEditPart;
import newpmbe.process.diagram.edit.parts.EMPRefFlowEditPart;
import newpmbe.process.diagram.edit.parts.EMRLocationTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMRMachineTypeEditPart;
import newpmbe.process.diagram.edit.parts.EMRRoleEditPart;
import newpmbe.process.diagram.edit.parts.EMRToolTypeEditPart;

import newpmbe.process.diagram.part.NewPMBEVisualIDRegistry;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import org.eclipse.gmf.runtime.diagram.core.DiagramEditingDomainFactory;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

import org.eclipse.ui.IMemento;
import org.eclipse.ui.PlatformUI;

import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.impl.EMPCompActivityImpl;
import vpml.processpackage.impl.EMPDiagramImpl;

/**
 * @generated
 */
public class NewPMBENavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated NOT
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];
	private static final String processFileExtension = ".process_diagram";
	private static TreeViewer viewer = null;
	private static HashMap<IResource, NewPMBENavigatorItem> hashMap = new HashMap<IResource, NewPMBENavigatorItem>();

	//	private static HashMap<EMPCompActivity, IFile> res2Comp = new HashMap<EMPCompActivity, IFile>();

	/**
	 * @generated NOT
	 */
	public void dispose() {
	}

	/**
	 * @generated NOT
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = (TreeViewer) viewer;
	}

	/**
	 * @generated NOT
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated NOT
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IProject) {
			IProject project = (IProject) parentElement;
			//changed by zhangpeng-改变了工程属性，为每个工程项目增加了后缀，但是要对用户透明
			String projectExtension = project.getFileExtension();
			String projectName = project.getName().substring(0,
					project.getName().length() - projectExtension.length() - 1);
			IFile file = project.getFile(projectName + processFileExtension);
			//end changed by zhangpeng

			//如果文件还未被创建
			if (!file.exists())
				return EMPTY_ARRAY;
			AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) GMFEditingDomainFactory.INSTANCE
					.createEditingDomain();
			editingDomain.setResourceToReadOnlyMap(new HashMap() {
				public Object get(Object key) {
					if (!containsKey(key)) {
						put(key, Boolean.TRUE);
					}
					return super.get(key);
				}
			});
			ResourceSet resourceSet = editingDomain.getResourceSet();

			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = resourceSet.getResource(fileURI, true);
			Collection result = new ArrayList();
			result.addAll(createNavigatorItems(selectViewsByType(resource
					.getContents(), EMPDiagramEditPart.MODEL_ID), file));
			ArrayList list = (ArrayList) result;
			for (int i = 0; i < result.size(); i++) {
				if (list.get(i) instanceof NewPMBENavigatorItem) {
					NewPMBENavigatorItem navigatorItem = (NewPMBENavigatorItem) list
							.get(i);
					if (navigatorItem.isLeaf()
							|| !isOwnView(navigatorItem.getView())) {
						return EMPTY_ARRAY;
					}
					hashMap.put(project, navigatorItem);
					Object[] array = getViewChildren(navigatorItem.getView(),
							parentElement);
					ArrayList newList = new ArrayList();
					for (int k = 0; k < array.length; k++) {
						//判断此navigatorItem是否是CompActivity
						if (array[k] instanceof NewPMBENavigatorItem) {
							NewPMBENavigatorItem item = (NewPMBENavigatorItem) array[k];
							if (item.getView().getElement() instanceof EMPCompActivityImpl) {
								EMPCompActivityImpl compActivity = (EMPCompActivityImpl) item
										.getView().getElement();
								if (compActivity.getName() == null) {
									newList.add(array[k]);
									continue;
								}
								IFolder folder = project.getFolder(compActivity
										.getName());
								//下层Diagram文件
								IFile file2 = folder.getFile(folder.getName()
										+ ".process_diagram");

								if (folder != null && file2.exists()) {
									if (hashMap.get(folder) == null)
										hashMap.put(folder, navigatorItem);
									newList.add(folder);
									continue;
								}
							}
						}
						newList.add(array[k]);
					}
					return newList.toArray();
				}
			}
			return result.toArray();
		}
		if (parentElement instanceof IFolder) {
			IFolder folder = (IFolder) parentElement;
			IFile file = folder
					.getFile(folder.getName() + processFileExtension);
			if (!file.exists())
				return EMPTY_ARRAY;
			AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) createEditingDomain();
			editingDomain.setResourceToReadOnlyMap(new HashMap() {
				public Object get(Object key) {
					if (!containsKey(key)) {
						put(key, Boolean.TRUE);
					}
					return super.get(key);
				}
			});
			ResourceSet resourceSet = editingDomain.getResourceSet();

			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = resourceSet.getResource(fileURI, true);
			Collection result = new ArrayList();
			result.addAll(createNavigatorItems(selectViewsByType(resource
					.getContents(), EMPDiagramEditPart.MODEL_ID), file));
			ArrayList list = (ArrayList) result;
			for (int i = 0; i < result.size(); i++) {
				if (list.get(i) instanceof NewPMBENavigatorItem) {
					NewPMBENavigatorItem navigatorItem = (NewPMBENavigatorItem) list
							.get(i);
					if (navigatorItem.isLeaf()
							|| !isOwnView(navigatorItem.getView())) {
						return EMPTY_ARRAY;
					}
					if (hashMap.get(folder) == null)
						hashMap.put(folder, navigatorItem);
					Object[] array = getViewChildren(navigatorItem.getView(),
							parentElement);
					ArrayList newList = new ArrayList();
					for (int k = 0; k < array.length; k++) {
						if (array[k] instanceof NewPMBENavigatorItem) {
							NewPMBENavigatorItem item = (NewPMBENavigatorItem) array[k];
							if (item.getView().getElement() instanceof EMPCompActivityImpl) {
								EMPCompActivityImpl compActivity = (EMPCompActivityImpl) item
										.getView().getElement();
								IFolder folder2 = folder.getFolder(compActivity
										.getName());
								IFile file2 = folder2.getFile(folder2.getName()
										+ ".process_diagram");

								//如果文件已经创建
								if (folder2 != null && file2.exists()) {
									if (hashMap.get(folder2) == null)
										hashMap.put(folder2, navigatorItem);

									//将compActivity同相应的Diagram文件相关联
									newList.add(folder2);
									continue;
								}
							}
						}
						newList.add(array[k]);
					}
					return newList.toArray();
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof NewPMBENavigatorGroup) {
			NewPMBENavigatorGroup group = (NewPMBENavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof NewPMBENavigatorItem) {
			NewPMBENavigatorItem navigatorItem = (NewPMBENavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		// Due to plugin.xml content will be called only for "own" views
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (NewPMBEVisualIDRegistry.getVisualID(view)) {
		case EMPAutoBatchActivityEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMPAutoBatchActivity_2048ToEMPClockFlow_4001InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPAutoBatchActivity_2048ToEMPRefFlow_4004InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPAutoBatchActivity_2048ToEMPDataFlow_4002InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPAutoBatchActivity_2048ToEMPAssFlow_4009InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPAutoBatchActivity_2048ToEMPAssFlow_4013InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPAutoBatchActivity_2048ToEMPAssFlow_4026InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMPAutoBatchActivity_2048ToEMPDataFlow_4005OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPAutoBatchActivity_2048ToEMPDataFlow_4018InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPAutoBatchActivity_2048ToEMPDataFlow_4019InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPAutoBatchActivity_2048ToEMPDataFlow_4020OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPAutoBatchActivity_2048ToEMPDataFlow_4021OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMPOutOrEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMPOutOr_2024ToEMPDataFlow_4021InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMPOutOr_2024ToEMPDataFlow_4023OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPOutOr_2024ToEMPDataFlow_4030OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPOutOr_2024ToEMPDataFlow_4031InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPOutOr_2024ToEMPDataFlow_4031OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPOutOr_2024ToEMPDataFlow_4032InSource(
							view, incominglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMPDocumentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMPDocument_2025ToEMPAssFlow_4003InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMPDocument_2025ToEMPRefFlow_4004OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPDocument_2025ToEMPDataFlow_4002OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPDocument_2025ToEMPDataFlow_4005InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPDocument_2025ToEMPDataFlow_4016OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPDocument_2025ToEMPDataFlow_4017OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPDocument_2025ToEMPDataFlow_4022InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPDocument_2025ToEMPDataFlow_4023InSource(
							view, incominglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMPProductPackageEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMPProductPackage_2026ToEMPAssFlow_4003InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMPProductPackage_2026ToEMPRefFlow_4004OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPProductPackage_2026ToEMPDataFlow_4002OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPProductPackage_2026ToEMPDataFlow_4005InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPProductPackage_2026ToEMPDataFlow_4016OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPProductPackage_2026ToEMPDataFlow_4017OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPProductPackage_2026ToEMPDataFlow_4022InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPProductPackage_2026ToEMPDataFlow_4023InSource(
							view, incominglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMPNormalActivityEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMPNormalActivity_2044ToEMPClockFlow_4001InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPNormalActivity_2044ToEMPRefFlow_4004InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPNormalActivity_2044ToEMPDataFlow_4002InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPNormalActivity_2044ToEMPAssFlow_4006InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPNormalActivity_2044ToEMPAssFlow_4008InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPNormalActivity_2044ToEMPAssFlow_4015InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPNormalActivity_2044ToEMPAssFlow_4028InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMPNormalActivity_2044ToEMPDataFlow_4005OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPNormalActivity_2044ToEMPDataFlow_4018InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPNormalActivity_2044ToEMPDataFlow_4019InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPNormalActivity_2044ToEMPDataFlow_4020OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPNormalActivity_2044ToEMPDataFlow_4021OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMPOtherEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMPOther_2028ToEMPAssFlow_4003InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMPOther_2028ToEMPRefFlow_4004OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPOther_2028ToEMPDataFlow_4002OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPOther_2028ToEMPDataFlow_4005InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPOther_2028ToEMPDataFlow_4016OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPOther_2028ToEMPDataFlow_4017OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPOther_2028ToEMPDataFlow_4022InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPOther_2028ToEMPDataFlow_4023InSource(
							view, incominglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMPMessageEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMPMessage_2029ToEMPAssFlow_4003InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMPMessage_2029ToEMPRefFlow_4004OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPMessage_2029ToEMPDataFlow_4002OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPMessage_2029ToEMPDataFlow_4005InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPMessage_2029ToEMPDataFlow_4016OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPMessage_2029ToEMPDataFlow_4017OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPMessage_2029ToEMPDataFlow_4022InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPMessage_2029ToEMPDataFlow_4023InSource(
							view, incominglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMPCompActivityEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMPCompActivity_2045ToEMPClockFlow_4001InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPCompActivity_2045ToEMPRefFlow_4004InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPCompActivity_2045ToEMPDataFlow_4002InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPCompActivity_2045ToEMPAssFlow_4007InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMPCompActivity_2045ToEMPDataFlow_4005OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPCompActivity_2045ToEMPDataFlow_4018InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPCompActivity_2045ToEMPDataFlow_4019InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPCompActivity_2045ToEMPDataFlow_4020OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPCompActivity_2045ToEMPDataFlow_4021OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMPOutAndEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMPOutAnd_2031ToEMPDataFlow_4020InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMPOutAnd_2031ToEMPDataFlow_4022OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPOutAnd_2031ToEMPDataFlow_4030InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPOutAnd_2031ToEMPDataFlow_4032OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPOutAnd_2031ToEMPDataFlow_4033InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPOutAnd_2031ToEMPDataFlow_4033OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMPManualBatchActivityEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMPManualBatchActivity_2046ToEMPClockFlow_4001InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPManualBatchActivity_2046ToEMPRefFlow_4004InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPManualBatchActivity_2046ToEMPDataFlow_4002InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPManualBatchActivity_2046ToEMPAssFlow_4011InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPManualBatchActivity_2046ToEMPAssFlow_4014InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPManualBatchActivity_2046ToEMPAssFlow_4027InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPManualBatchActivity_2046ToEMPAssFlow_4029InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMPManualBatchActivity_2046ToEMPDataFlow_4005OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPManualBatchActivity_2046ToEMPDataFlow_4018InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPManualBatchActivity_2046ToEMPDataFlow_4019InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPManualBatchActivity_2046ToEMPDataFlow_4020OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPManualBatchActivity_2046ToEMPDataFlow_4021OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMPClockEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMPClock_2033ToEMPClockFlow_4001OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		case EMPInAndEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMPInAnd_2034ToEMPDataFlow_4016InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMPInAnd_2034ToEMPDataFlow_4018OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPInAnd_2034ToEMPDataFlow_4034InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPInAnd_2034ToEMPDataFlow_4036OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPInAnd_2034ToEMPDataFlow_4037InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPInAnd_2034ToEMPDataFlow_4037OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMPInOrEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMPInOr_2035ToEMPDataFlow_4017InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMPInOr_2035ToEMPDataFlow_4019OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPInOr_2035ToEMPDataFlow_4034OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPInOr_2035ToEMPDataFlow_4035InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPInOr_2035ToEMPDataFlow_4035OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPInOr_2035ToEMPDataFlow_4036InSource(
							view, incominglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMPAutoActivityEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMPAutoActivity_2047ToEMPClockFlow_4001InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPAutoActivity_2047ToEMPRefFlow_4004InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPAutoActivity_2047ToEMPDataFlow_4002InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPAutoActivity_2047ToEMPAssFlow_4010InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPAutoActivity_2047ToEMPAssFlow_4012InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPAutoActivity_2047ToEMPAssFlow_4025InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMPAutoActivity_2047ToEMPDataFlow_4005OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPAutoActivity_2047ToEMPDataFlow_4018InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPAutoActivity_2047ToEMPDataFlow_4019InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPAutoActivity_2047ToEMPDataFlow_4020OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPAutoActivity_2047ToEMPDataFlow_4021OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMPArtifactEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMPArtifact_2037ToEMPAssFlow_4003InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMPArtifact_2037ToEMPRefFlow_4004OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPArtifact_2037ToEMPDataFlow_4002OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPArtifact_2037ToEMPDataFlow_4005InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPArtifact_2037ToEMPDataFlow_4016OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPArtifact_2037ToEMPDataFlow_4017OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPArtifact_2037ToEMPDataFlow_4022InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPArtifact_2037ToEMPDataFlow_4023InSource(
							view, incominglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMOResourceGroupTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMOResourceGroupType_2038ToEMPAssFlow_4007OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMOResourceGroupType_2038ToEMPAssFlow_4008OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMOResourceGroupType_2038ToEMPAssFlow_4009OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMOResourceGroupType_2038ToEMPAssFlow_4010OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMOResourceGroupType_2038ToEMPAssFlow_4011OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		case EMRToolTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMRToolType_2039ToEMPAssFlow_4003OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		case EMRRoleEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMRRole_2040ToEMPAssFlow_4028OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMRRole_2040ToEMPAssFlow_4029OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		case EMRMachineTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMRMachineType_2041ToEMPAssFlow_4006OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMRMachineType_2041ToEMPAssFlow_4012OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMRMachineType_2041ToEMPAssFlow_4013OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMRMachineType_2041ToEMPAssFlow_4014OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		case EMRLocationTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMRLocationType_2042ToEMPAssFlow_4015OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMRLocationType_2042ToEMPAssFlow_4025OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMRLocationType_2042ToEMPAssFlow_4026OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMRLocationType_2042ToEMPAssFlow_4027OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		case EMPFormEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks.addChildren(getEMPForm_2049ToEMPAssFlow_4003InSource(
					view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMPForm_2049ToEMPRefFlow_4004OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPForm_2049ToEMPDataFlow_4002OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPForm_2049ToEMPDataFlow_4005InSource(
							view, incominglinks));
			outgoinglinks
					.addChildren(getEMPForm_2049ToEMPDataFlow_4016OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMPForm_2049ToEMPDataFlow_4017OutTarget(
							view, outgoinglinks));
			incominglinks
					.addChildren(getEMPForm_2049ToEMPDataFlow_4022InSource(
							view, incominglinks));
			incominglinks
					.addChildren(getEMPForm_2049ToEMPDataFlow_4023InSource(
							view, incominglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMPDiagramEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result
					.addAll(getEMPDiagram_1000ToEMPAutoBatchActivity_2048Children(
							view, parentElement));
			result.addAll(getEMPDiagram_1000ToEMPOutOr_2024Children(view,
					parentElement));
			result.addAll(getEMPDiagram_1000ToEMPDocument_2025Children(view,
					parentElement));
			result.addAll(getEMPDiagram_1000ToEMPProductPackage_2026Children(
					view, parentElement));
			result.addAll(getEMPDiagram_1000ToEMPNormalActivity_2044Children(
					view, parentElement));
			result.addAll(getEMPDiagram_1000ToEMPOther_2028Children(view,
					parentElement));
			result.addAll(getEMPDiagram_1000ToEMPMessage_2029Children(view,
					parentElement));
			result.addAll(getEMPDiagram_1000ToEMPCompActivity_2045Children(
					view, parentElement));
			result.addAll(getEMPDiagram_1000ToEMPOutAnd_2031Children(view,
					parentElement));
			result
					.addAll(getEMPDiagram_1000ToEMPManualBatchActivity_2046Children(
							view, parentElement));
			result.addAll(getEMPDiagram_1000ToEMPClock_2033Children(view,
					parentElement));
			result.addAll(getEMPDiagram_1000ToEMPInAnd_2034Children(view,
					parentElement));
			result.addAll(getEMPDiagram_1000ToEMPInOr_2035Children(view,
					parentElement));
			result.addAll(getEMPDiagram_1000ToEMPAutoActivity_2047Children(
					view, parentElement));
			result.addAll(getEMPDiagram_1000ToEMPArtifact_2037Children(view,
					parentElement));
			result
					.addAll(getEMPDiagram_1000ToEMOResourceGroupType_2038Children(
							view, parentElement));
			result.addAll(getEMPDiagram_1000ToEMRToolType_2039Children(view,
					parentElement));
			result.addAll(getEMPDiagram_1000ToEMRRole_2040Children(view,
					parentElement));
			result.addAll(getEMPDiagram_1000ToEMRMachineType_2041Children(view,
					parentElement));
			result.addAll(getEMPDiagram_1000ToEMRLocationType_2042Children(
					view, parentElement));
			result.addAll(getEMPDiagram_1000ToEMPForm_2049Children(view,
					parentElement));
			NewPMBENavigatorGroup links = new NewPMBENavigatorGroup("links",
					"icons/linksNavigatorGroup.gif", parentElement);
			links.addChildren(getEMPDiagram_1000ToEMPClockFlow_4001Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPAssFlow_4003Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPRefFlow_4004Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4002Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPAssFlow_4006Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPAssFlow_4007Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPAssFlow_4008Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPAssFlow_4009Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPAssFlow_4010Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPAssFlow_4011Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPAssFlow_4012Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPAssFlow_4013Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPAssFlow_4014Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPAssFlow_4015Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPAssFlow_4025Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPAssFlow_4026Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPAssFlow_4027Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPAssFlow_4028Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPAssFlow_4029Children(view,
					links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4005Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4016Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4017Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4018Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4019Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4020Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4021Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4022Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4023Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4030Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4031Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4032Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4033Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4034Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4035Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4036Children(
					view, links));
			links.addChildren(getEMPDiagram_1000ToEMPDataFlow_4037Children(
					view, links));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}
		case EMPClockFlowEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPClockFlow_4001ToEMPAutoBatchActivity_2048OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPClockFlow_4001ToEMPNormalActivity_2044OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPClockFlow_4001ToEMPCompActivity_2045OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPClockFlow_4001ToEMPManualBatchActivity_2046OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPClockFlow_4001ToEMPAutoActivity_2047OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPClockFlow_4001ToEMPClock_2033InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPAssFlowEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getEMPAssFlow_4003ToEMPDocument_2025OutTarget(
					(Edge) view, target));
			target
					.addChildren(getEMPAssFlow_4003ToEMPProductPackage_2026OutTarget(
							(Edge) view, target));
			target.addChildren(getEMPAssFlow_4003ToEMPOther_2028OutTarget(
					(Edge) view, target));
			target.addChildren(getEMPAssFlow_4003ToEMPMessage_2029OutTarget(
					(Edge) view, target));
			target.addChildren(getEMPAssFlow_4003ToEMPArtifact_2037OutTarget(
					(Edge) view, target));
			target.addChildren(getEMPAssFlow_4003ToEMPForm_2049OutTarget(
					(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPAssFlow_4003ToEMRToolType_2039InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPRefFlowEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPRefFlow_4004ToEMPAutoBatchActivity_2048OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPRefFlow_4004ToEMPNormalActivity_2044OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPRefFlow_4004ToEMPCompActivity_2045OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPRefFlow_4004ToEMPManualBatchActivity_2046OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPRefFlow_4004ToEMPAutoActivity_2047OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPRefFlow_4004ToEMPDocument_2025InSource(
					(Edge) view, source));
			source
					.addChildren(getEMPRefFlow_4004ToEMPProductPackage_2026InSource(
							(Edge) view, source));
			source.addChildren(getEMPRefFlow_4004ToEMPOther_2028InSource(
					(Edge) view, source));
			source.addChildren(getEMPRefFlow_4004ToEMPMessage_2029InSource(
					(Edge) view, source));
			source.addChildren(getEMPRefFlow_4004ToEMPArtifact_2037InSource(
					(Edge) view, source));
			source.addChildren(getEMPRefFlow_4004ToEMPForm_2049InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlowEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPDataFlow_4002ToEMPAutoBatchActivity_2048OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPDataFlow_4002ToEMPNormalActivity_2044OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPDataFlow_4002ToEMPCompActivity_2045OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPDataFlow_4002ToEMPManualBatchActivity_2046OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPDataFlow_4002ToEMPAutoActivity_2047OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPDataFlow_4002ToEMPDocument_2025InSource(
					(Edge) view, source));
			source
					.addChildren(getEMPDataFlow_4002ToEMPProductPackage_2026InSource(
							(Edge) view, source));
			source.addChildren(getEMPDataFlow_4002ToEMPOther_2028InSource(
					(Edge) view, source));
			source.addChildren(getEMPDataFlow_4002ToEMPMessage_2029InSource(
					(Edge) view, source));
			source.addChildren(getEMPDataFlow_4002ToEMPArtifact_2037InSource(
					(Edge) view, source));
			source.addChildren(getEMPDataFlow_4002ToEMPForm_2049InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPAssFlow2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPAssFlow_4006ToEMPNormalActivity_2044OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPAssFlow_4006ToEMRMachineType_2041InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPAssFlow3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPAssFlow_4007ToEMPCompActivity_2045OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMPAssFlow_4007ToEMOResourceGroupType_2038InSource(
							(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPAssFlow4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPAssFlow_4008ToEMPNormalActivity_2044OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMPAssFlow_4008ToEMOResourceGroupType_2038InSource(
							(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPAssFlow5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPAssFlow_4009ToEMPAutoBatchActivity_2048OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMPAssFlow_4009ToEMOResourceGroupType_2038InSource(
							(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPAssFlow6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPAssFlow_4010ToEMPAutoActivity_2047OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMPAssFlow_4010ToEMOResourceGroupType_2038InSource(
							(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPAssFlow7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPAssFlow_4011ToEMPManualBatchActivity_2046OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMPAssFlow_4011ToEMOResourceGroupType_2038InSource(
							(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPAssFlow8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPAssFlow_4012ToEMPAutoActivity_2047OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPAssFlow_4012ToEMRMachineType_2041InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPAssFlow9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPAssFlow_4013ToEMPAutoBatchActivity_2048OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPAssFlow_4013ToEMRMachineType_2041InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPAssFlow10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPAssFlow_4014ToEMPManualBatchActivity_2046OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPAssFlow_4014ToEMRMachineType_2041InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPAssFlow11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPAssFlow_4015ToEMPNormalActivity_2044OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMPAssFlow_4015ToEMRLocationType_2042InSource(
							(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPAssFlow12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPAssFlow_4025ToEMPAutoActivity_2047OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMPAssFlow_4025ToEMRLocationType_2042InSource(
							(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPAssFlow13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPAssFlow_4026ToEMPAutoBatchActivity_2048OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMPAssFlow_4026ToEMRLocationType_2042InSource(
							(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPAssFlow14EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPAssFlow_4027ToEMPManualBatchActivity_2046OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMPAssFlow_4027ToEMRLocationType_2042InSource(
							(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPAssFlow15EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPAssFlow_4028ToEMPNormalActivity_2044OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPAssFlow_4028ToEMRRole_2040InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPAssFlow16EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPAssFlow_4029ToEMPManualBatchActivity_2046OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPAssFlow_4029ToEMRRole_2040InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getEMPDataFlow_4005ToEMPDocument_2025OutTarget(
					(Edge) view, target));
			target
					.addChildren(getEMPDataFlow_4005ToEMPProductPackage_2026OutTarget(
							(Edge) view, target));
			target.addChildren(getEMPDataFlow_4005ToEMPOther_2028OutTarget(
					(Edge) view, target));
			target.addChildren(getEMPDataFlow_4005ToEMPMessage_2029OutTarget(
					(Edge) view, target));
			target.addChildren(getEMPDataFlow_4005ToEMPArtifact_2037OutTarget(
					(Edge) view, target));
			target.addChildren(getEMPDataFlow_4005ToEMPForm_2049OutTarget(
					(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMPDataFlow_4005ToEMPAutoBatchActivity_2048InSource(
							(Edge) view, source));
			source
					.addChildren(getEMPDataFlow_4005ToEMPNormalActivity_2044InSource(
							(Edge) view, source));
			source
					.addChildren(getEMPDataFlow_4005ToEMPCompActivity_2045InSource(
							(Edge) view, source));
			source
					.addChildren(getEMPDataFlow_4005ToEMPManualBatchActivity_2046InSource(
							(Edge) view, source));
			source
					.addChildren(getEMPDataFlow_4005ToEMPAutoActivity_2047InSource(
							(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getEMPDataFlow_4016ToEMPInAnd_2034OutTarget(
					(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPDataFlow_4016ToEMPDocument_2025InSource(
					(Edge) view, source));
			source
					.addChildren(getEMPDataFlow_4016ToEMPProductPackage_2026InSource(
							(Edge) view, source));
			source.addChildren(getEMPDataFlow_4016ToEMPOther_2028InSource(
					(Edge) view, source));
			source.addChildren(getEMPDataFlow_4016ToEMPMessage_2029InSource(
					(Edge) view, source));
			source.addChildren(getEMPDataFlow_4016ToEMPArtifact_2037InSource(
					(Edge) view, source));
			source.addChildren(getEMPDataFlow_4016ToEMPForm_2049InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getEMPDataFlow_4017ToEMPInOr_2035OutTarget(
					(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPDataFlow_4017ToEMPDocument_2025InSource(
					(Edge) view, source));
			source
					.addChildren(getEMPDataFlow_4017ToEMPProductPackage_2026InSource(
							(Edge) view, source));
			source.addChildren(getEMPDataFlow_4017ToEMPOther_2028InSource(
					(Edge) view, source));
			source.addChildren(getEMPDataFlow_4017ToEMPMessage_2029InSource(
					(Edge) view, source));
			source.addChildren(getEMPDataFlow_4017ToEMPArtifact_2037InSource(
					(Edge) view, source));
			source.addChildren(getEMPDataFlow_4017ToEMPForm_2049InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPDataFlow_4018ToEMPAutoBatchActivity_2048OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPDataFlow_4018ToEMPNormalActivity_2044OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPDataFlow_4018ToEMPCompActivity_2045OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPDataFlow_4018ToEMPManualBatchActivity_2046OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPDataFlow_4018ToEMPAutoActivity_2047OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPDataFlow_4018ToEMPInAnd_2034InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMPDataFlow_4019ToEMPAutoBatchActivity_2048OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPDataFlow_4019ToEMPNormalActivity_2044OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPDataFlow_4019ToEMPCompActivity_2045OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPDataFlow_4019ToEMPManualBatchActivity_2046OutTarget(
							(Edge) view, target));
			target
					.addChildren(getEMPDataFlow_4019ToEMPAutoActivity_2047OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPDataFlow_4019ToEMPInOr_2035InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getEMPDataFlow_4020ToEMPOutAnd_2031OutTarget(
					(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMPDataFlow_4020ToEMPAutoBatchActivity_2048InSource(
							(Edge) view, source));
			source
					.addChildren(getEMPDataFlow_4020ToEMPNormalActivity_2044InSource(
							(Edge) view, source));
			source
					.addChildren(getEMPDataFlow_4020ToEMPCompActivity_2045InSource(
							(Edge) view, source));
			source
					.addChildren(getEMPDataFlow_4020ToEMPManualBatchActivity_2046InSource(
							(Edge) view, source));
			source
					.addChildren(getEMPDataFlow_4020ToEMPAutoActivity_2047InSource(
							(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getEMPDataFlow_4021ToEMPOutOr_2024OutTarget(
					(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMPDataFlow_4021ToEMPAutoBatchActivity_2048InSource(
							(Edge) view, source));
			source
					.addChildren(getEMPDataFlow_4021ToEMPNormalActivity_2044InSource(
							(Edge) view, source));
			source
					.addChildren(getEMPDataFlow_4021ToEMPCompActivity_2045InSource(
							(Edge) view, source));
			source
					.addChildren(getEMPDataFlow_4021ToEMPManualBatchActivity_2046InSource(
							(Edge) view, source));
			source
					.addChildren(getEMPDataFlow_4021ToEMPAutoActivity_2047InSource(
							(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getEMPDataFlow_4022ToEMPDocument_2025OutTarget(
					(Edge) view, target));
			target
					.addChildren(getEMPDataFlow_4022ToEMPProductPackage_2026OutTarget(
							(Edge) view, target));
			target.addChildren(getEMPDataFlow_4022ToEMPOther_2028OutTarget(
					(Edge) view, target));
			target.addChildren(getEMPDataFlow_4022ToEMPMessage_2029OutTarget(
					(Edge) view, target));
			target.addChildren(getEMPDataFlow_4022ToEMPArtifact_2037OutTarget(
					(Edge) view, target));
			target.addChildren(getEMPDataFlow_4022ToEMPForm_2049OutTarget(
					(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPDataFlow_4022ToEMPOutAnd_2031InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getEMPDataFlow_4023ToEMPDocument_2025OutTarget(
					(Edge) view, target));
			target
					.addChildren(getEMPDataFlow_4023ToEMPProductPackage_2026OutTarget(
							(Edge) view, target));
			target.addChildren(getEMPDataFlow_4023ToEMPOther_2028OutTarget(
					(Edge) view, target));
			target.addChildren(getEMPDataFlow_4023ToEMPMessage_2029OutTarget(
					(Edge) view, target));
			target.addChildren(getEMPDataFlow_4023ToEMPArtifact_2037OutTarget(
					(Edge) view, target));
			target.addChildren(getEMPDataFlow_4023ToEMPForm_2049OutTarget(
					(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPDataFlow_4023ToEMPOutOr_2024InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow11EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getEMPDataFlow_4030ToEMPOutAnd_2031OutTarget(
					(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPDataFlow_4030ToEMPOutOr_2024InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow12EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getEMPDataFlow_4031ToEMPOutOr_2024OutTarget(
					(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPDataFlow_4031ToEMPOutOr_2024InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow13EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getEMPDataFlow_4032ToEMPOutOr_2024OutTarget(
					(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPDataFlow_4032ToEMPOutAnd_2031InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow14EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getEMPDataFlow_4033ToEMPOutAnd_2031OutTarget(
					(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPDataFlow_4033ToEMPOutAnd_2031InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow15EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getEMPDataFlow_4034ToEMPInAnd_2034OutTarget(
					(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPDataFlow_4034ToEMPInOr_2035InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow16EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getEMPDataFlow_4035ToEMPInOr_2035OutTarget(
					(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPDataFlow_4035ToEMPInOr_2035InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow17EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getEMPDataFlow_4036ToEMPInOr_2035OutTarget(
					(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPDataFlow_4036ToEMPInAnd_2034InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case EMPDataFlow18EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getEMPDataFlow_4037ToEMPInAnd_2034OutTarget(
					(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getEMPDataFlow_4037ToEMPInAnd_2034InSource(
					(Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof NewPMBEAbstractNavigatorItem) {
			NewPMBEAbstractNavigatorItem abstractNavigatorItem = (NewPMBEAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
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
	private Collection getEMPDataFlow_4023ToEMPProductPackage_2026OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPProductPackageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4023ToEMPProductPackage_2026OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4023ToEMPProductPackage_2026OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPInAnd_2034ToEMPDataFlow_4018OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPInAnd_2034ToEMPDataFlow_4018OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPInAnd_2034ToEMPDataFlow_4018OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPNormalActivity_2044ToEMPRefFlow_4004InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPRefFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPNormalActivity_2044ToEMPRefFlow_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPNormalActivity_2044ToEMPRefFlow_4004InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOResourceGroupType_2038ToEMPAssFlow_4008OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMOResourceGroupType_2038ToEMPAssFlow_4008OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOResourceGroupType_2038ToEMPAssFlow_4008OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPForm_2049ToEMPDataFlow_4017OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPForm_2049ToEMPDataFlow_4017OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPForm_2049ToEMPDataFlow_4017OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPForm_2049ToEMPAssFlow_4003InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPForm_2049ToEMPAssFlow_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPForm_2049ToEMPAssFlow_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOutOr_2024ToEMPDataFlow_4023OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow10EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOutOr_2024ToEMPDataFlow_4023OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOutOr_2024ToEMPDataFlow_4023OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4003ToEMRToolType_2039InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRToolTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4003ToEMRToolType_2039InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4003ToEMRToolType_2039InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDocument_2025ToEMPDataFlow_4005InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDocument_2025ToEMPDataFlow_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDocument_2025ToEMPDataFlow_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4022ToEMPMessage_2029OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPMessageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4022ToEMPMessage_2029OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4022ToEMPMessage_2029OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4032Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow13EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4032ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4032ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMRRole_2040ToEMPAssFlow_4028OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow15EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRRole_2040ToEMPAssFlow_4028OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRRole_2040ToEMPAssFlow_4028OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPNormalActivity_2044ToEMPDataFlow_4002InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPNormalActivity_2044ToEMPDataFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPNormalActivity_2044ToEMPDataFlow_4002InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4031ToEMPOutOr_2024InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOutOrEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4031ToEMPOutOr_2024InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4031ToEMPOutOr_2024InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4017Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4017ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4017ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4034ToEMPInAnd_2034OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPInAndEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4034ToEMPInAnd_2034OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4034ToEMPInAnd_2034OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4003ToEMPMessage_2029OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPMessageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4003ToEMPMessage_2029OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4003ToEMPMessage_2029OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4005ToEMPAutoBatchActivity_2048InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4005ToEMPAutoBatchActivity_2048InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4005ToEMPAutoBatchActivity_2048InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPInOr_2035Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPInOrEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPInOr_2035ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPInOr_2035ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPClockFlow_4001ToEMPNormalActivity_2044OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPNormalActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPClockFlow_4001ToEMPNormalActivity_2044OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPClockFlow_4001ToEMPNormalActivity_2044OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4036ToEMPInAnd_2034InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPInAndEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4036ToEMPInAnd_2034InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4036ToEMPInAnd_2034InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPArtifact_2037ToEMPRefFlow_4004OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPRefFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPArtifact_2037ToEMPRefFlow_4004OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPArtifact_2037ToEMPRefFlow_4004OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPOutOr_2024Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPOutOrEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPOutOr_2024ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPOutOr_2024ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPManualBatchActivity_2046ToEMPClockFlow_4001InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPClockFlowEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPManualBatchActivity_2046ToEMPClockFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPManualBatchActivity_2046ToEMPClockFlow_4001InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPNormalActivity_2044ToEMPAssFlow_4008InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPNormalActivity_2044ToEMPAssFlow_4008InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPNormalActivity_2044ToEMPAssFlow_4008InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4011ToEMOResourceGroupType_2038InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMOResourceGroupTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4011ToEMOResourceGroupType_2038InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4011ToEMOResourceGroupType_2038InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4021Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow8EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4021ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4021ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4027ToEMPManualBatchActivity_2046OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPManualBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPAssFlow_4027ToEMPManualBatchActivity_2046OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4027ToEMPManualBatchActivity_2046OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoActivity_2047ToEMPRefFlow_4004InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPRefFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoActivity_2047ToEMPRefFlow_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoActivity_2047ToEMPRefFlow_4004InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPNormalActivity_2044ToEMPAssFlow_4015InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow11EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPNormalActivity_2044ToEMPAssFlow_4015InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPNormalActivity_2044ToEMPAssFlow_4015InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4002ToEMPMessage_2029InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPMessageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4002ToEMPMessage_2029InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4002ToEMPMessage_2029InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPProductPackage_2026ToEMPRefFlow_4004OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPRefFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPProductPackage_2026ToEMPRefFlow_4004OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPProductPackage_2026ToEMPRefFlow_4004OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4012ToEMPAutoActivity_2047OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4012ToEMPAutoActivity_2047OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4012ToEMPAutoActivity_2047OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRRole_2040ToEMPAssFlow_4029OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow16EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRRole_2040ToEMPAssFlow_4029OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRRole_2040ToEMPAssFlow_4029OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAssFlow_4027Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow14EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAssFlow_4027ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAssFlow_4027ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4002ToEMPAutoActivity_2047OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4002ToEMPAutoActivity_2047OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4002ToEMPAutoActivity_2047OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPMessage_2029Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPMessageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPMessage_2029ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPMessage_2029ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4002ToEMPDocument_2025InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPDocumentEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4002ToEMPDocument_2025InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4002ToEMPDocument_2025InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOther_2028ToEMPDataFlow_4002OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOther_2028ToEMPDataFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOther_2028ToEMPDataFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPArtifact_2037ToEMPDataFlow_4017OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPArtifact_2037ToEMPDataFlow_4017OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPArtifact_2037ToEMPDataFlow_4017OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4022ToEMPOutAnd_2031InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOutAndEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4022ToEMPOutAnd_2031InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4022ToEMPOutAnd_2031InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPForm_2049ToEMPDataFlow_4023InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow10EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPForm_2049ToEMPDataFlow_4023InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPForm_2049ToEMPDataFlow_4023InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4003ToEMPProductPackage_2026OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPProductPackageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4003ToEMPProductPackage_2026OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4003ToEMPProductPackage_2026OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPForm_2049Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPFormEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPForm_2049ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPForm_2049ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPArtifact_2037Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPArtifactEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPArtifact_2037ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPArtifact_2037ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4023ToEMPMessage_2029OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPMessageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4023ToEMPMessage_2029OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4023ToEMPMessage_2029OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMRRole_2040Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRRoleEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMRRole_2040ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMRRole_2040ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMOResourceGroupType_2038Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMOResourceGroupTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMOResourceGroupType_2038ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMOResourceGroupType_2038ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPArtifact_2037ToEMPDataFlow_4002OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPArtifact_2037ToEMPDataFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPArtifact_2037ToEMPDataFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAssFlow_4003Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAssFlow_4003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAssFlow_4003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4015ToEMRLocationType_2042InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRLocationTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4015ToEMRLocationType_2042InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4015ToEMRLocationType_2042InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4005ToEMPCompActivity_2045InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPCompActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4005ToEMPCompActivity_2045InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4005ToEMPCompActivity_2045InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4022ToEMPForm_2049OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPFormEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4022ToEMPForm_2049OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4022ToEMPForm_2049OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoBatchActivity_2048ToEMPAssFlow_4009InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoBatchActivity_2048ToEMPAssFlow_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoBatchActivity_2048ToEMPAssFlow_4009InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOutAnd_2031ToEMPDataFlow_4022OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow9EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOutAnd_2031ToEMPDataFlow_4022OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOutAnd_2031ToEMPDataFlow_4022OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOutOr_2024ToEMPDataFlow_4021InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow8EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOutOr_2024ToEMPDataFlow_4021InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOutOr_2024ToEMPDataFlow_4021InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPProductPackage_2026ToEMPDataFlow_4017OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPProductPackage_2026ToEMPDataFlow_4017OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPProductPackage_2026ToEMPDataFlow_4017OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOther_2028ToEMPDataFlow_4017OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOther_2028ToEMPDataFlow_4017OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOther_2028ToEMPDataFlow_4017OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPManualBatchActivity_2046ToEMPDataFlow_4020OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow7EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPManualBatchActivity_2046ToEMPDataFlow_4020OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPManualBatchActivity_2046ToEMPDataFlow_4020OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPProductPackage_2026ToEMPDataFlow_4002OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPProductPackage_2026ToEMPDataFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPProductPackage_2026ToEMPDataFlow_4002OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRLocationType_2042ToEMPAssFlow_4025OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow12EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRLocationType_2042ToEMPAssFlow_4025OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRLocationType_2042ToEMPAssFlow_4025OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4008ToEMOResourceGroupType_2038InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMOResourceGroupTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4008ToEMOResourceGroupType_2038InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4008ToEMOResourceGroupType_2038InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4023Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow10EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4023ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4023ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4031ToEMPOutOr_2024OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOutOrEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4031ToEMPOutOr_2024OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4031ToEMPOutOr_2024OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4035ToEMPInOr_2035OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPInOrEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4035ToEMPInOr_2035OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4035ToEMPInOr_2035OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoBatchActivity_2048ToEMPAssFlow_4026InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow13EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoBatchActivity_2048ToEMPAssFlow_4026InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoBatchActivity_2048ToEMPAssFlow_4026InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPClock_2033ToEMPClockFlow_4001OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPClockFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPClock_2033ToEMPClockFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPClock_2033ToEMPClockFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPManualBatchActivity_2046ToEMPAssFlow_4029InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow16EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPManualBatchActivity_2046ToEMPAssFlow_4029InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPManualBatchActivity_2046ToEMPAssFlow_4029InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4023ToEMPForm_2049OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPFormEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4023ToEMPForm_2049OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4023ToEMPForm_2049OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAssFlow_4013Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow9EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAssFlow_4013ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAssFlow_4013ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4010ToEMOResourceGroupType_2038InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMOResourceGroupTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4010ToEMOResourceGroupType_2038InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4010ToEMOResourceGroupType_2038InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoActivity_2047ToEMPAssFlow_4012InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow8EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoActivity_2047ToEMPAssFlow_4012InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoActivity_2047ToEMPAssFlow_4012InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4011ToEMPManualBatchActivity_2046OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPManualBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPAssFlow_4011ToEMPManualBatchActivity_2046OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4011ToEMPManualBatchActivity_2046OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4005ToEMPManualBatchActivity_2046InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPManualBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPDataFlow_4005ToEMPManualBatchActivity_2046InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4005ToEMPManualBatchActivity_2046InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4002ToEMPProductPackage_2026InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPProductPackageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4002ToEMPProductPackage_2026InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4002ToEMPProductPackage_2026InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4031Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow12EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4031ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4031ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4002ToEMPManualBatchActivity_2046OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPManualBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPDataFlow_4002ToEMPManualBatchActivity_2046OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4002ToEMPManualBatchActivity_2046OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDocument_2025ToEMPDataFlow_4017OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDocument_2025ToEMPDataFlow_4017OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDocument_2025ToEMPDataFlow_4017OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPNormalActivity_2044ToEMPDataFlow_4021OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow8EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPNormalActivity_2044ToEMPDataFlow_4021OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPNormalActivity_2044ToEMPDataFlow_4021OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOResourceGroupType_2038ToEMPAssFlow_4011OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow7EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMOResourceGroupType_2038ToEMPAssFlow_4011OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOResourceGroupType_2038ToEMPAssFlow_4011OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4018Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4018ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4018ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4002ToEMPArtifact_2037InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPArtifactEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4002ToEMPArtifact_2037InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4002ToEMPArtifact_2037InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4022ToEMPDocument_2025OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPDocumentEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4022ToEMPDocument_2025OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4022ToEMPDocument_2025OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4007ToEMPCompActivity_2045OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPCompActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4007ToEMPCompActivity_2045OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4007ToEMPCompActivity_2045OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4005Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4005ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4005ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoActivity_2047ToEMPClockFlow_4001InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPClockFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoActivity_2047ToEMPClockFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoActivity_2047ToEMPClockFlow_4001InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOther_2028ToEMPDataFlow_4023InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow10EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOther_2028ToEMPDataFlow_4023InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOther_2028ToEMPDataFlow_4023InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAssFlow_4007Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAssFlow_4007ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAssFlow_4007ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPMessage_2029ToEMPAssFlow_4003InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPMessage_2029ToEMPAssFlow_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPMessage_2029ToEMPAssFlow_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPCompActivity_2045ToEMPDataFlow_4021OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow8EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPCompActivity_2045ToEMPDataFlow_4021OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPCompActivity_2045ToEMPDataFlow_4021OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4037ToEMPInAnd_2034InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPInAndEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4037ToEMPInAnd_2034InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4037ToEMPInAnd_2034InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPProductPackage_2026ToEMPDataFlow_4005InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPProductPackage_2026ToEMPDataFlow_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPProductPackage_2026ToEMPDataFlow_4005InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRMachineType_2041ToEMPAssFlow_4014OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow10EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRMachineType_2041ToEMPAssFlow_4014OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRMachineType_2041ToEMPAssFlow_4014OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAutoBatchActivity_2048Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAutoBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAutoBatchActivity_2048ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAutoBatchActivity_2048ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPManualBatchActivity_2046Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPManualBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPDiagram_1000ToEMPManualBatchActivity_2046ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPManualBatchActivity_2046ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoActivity_2047ToEMPAssFlow_4010InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoActivity_2047ToEMPAssFlow_4010InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoActivity_2047ToEMPAssFlow_4010InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4020ToEMPOutAnd_2031OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOutAndEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4020ToEMPOutAnd_2031OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4020ToEMPOutAnd_2031OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPInAnd_2034ToEMPDataFlow_4037InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow18EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPInAnd_2034ToEMPDataFlow_4037InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPInAnd_2034ToEMPDataFlow_4037InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4017ToEMPForm_2049InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPFormEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4017ToEMPForm_2049InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4017ToEMPForm_2049InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4037ToEMPInAnd_2034OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPInAndEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4037ToEMPInAnd_2034OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4037ToEMPInAnd_2034OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4005ToEMPProductPackage_2026OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPProductPackageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4005ToEMPProductPackage_2026OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4005ToEMPProductPackage_2026OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRLocationType_2042ToEMPAssFlow_4026OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow13EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRLocationType_2042ToEMPAssFlow_4026OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRLocationType_2042ToEMPAssFlow_4026OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4010ToEMPAutoActivity_2047OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4010ToEMPAutoActivity_2047OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4010ToEMPAutoActivity_2047OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOResourceGroupType_2038ToEMPAssFlow_4010OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMOResourceGroupType_2038ToEMPAssFlow_4010OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOResourceGroupType_2038ToEMPAssFlow_4010OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4033ToEMPOutAnd_2031InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOutAndEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4033ToEMPOutAnd_2031InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4033ToEMPOutAnd_2031InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4003ToEMPOther_2028OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOtherEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4003ToEMPOther_2028OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4003ToEMPOther_2028OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPRefFlow_4004ToEMPAutoBatchActivity_2048OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPRefFlow_4004ToEMPAutoBatchActivity_2048OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPRefFlow_4004ToEMPAutoBatchActivity_2048OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDocument_2025ToEMPDataFlow_4016OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDocument_2025ToEMPDataFlow_4016OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDocument_2025ToEMPDataFlow_4016OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAssFlow_4008Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAssFlow_4008ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAssFlow_4008ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4033ToEMPOutAnd_2031OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOutAndEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4033ToEMPOutAnd_2031OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4033ToEMPOutAnd_2031OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4033Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow14EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4033ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4033ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4026ToEMRLocationType_2042InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRLocationTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4026ToEMRLocationType_2042InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4026ToEMRLocationType_2042InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4025ToEMPAutoActivity_2047OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4025ToEMPAutoActivity_2047OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4025ToEMPAutoActivity_2047OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoActivity_2047ToEMPDataFlow_4019InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoActivity_2047ToEMPDataFlow_4019InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoActivity_2047ToEMPDataFlow_4019InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoActivity_2047ToEMPAssFlow_4025InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow12EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoActivity_2047ToEMPAssFlow_4025InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoActivity_2047ToEMPAssFlow_4025InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4032ToEMPOutAnd_2031InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOutAndEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4032ToEMPOutAnd_2031InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4032ToEMPOutAnd_2031InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPProductPackage_2026ToEMPDataFlow_4023InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow10EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPProductPackage_2026ToEMPDataFlow_4023InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPProductPackage_2026ToEMPDataFlow_4023InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPManualBatchActivity_2046ToEMPAssFlow_4027InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow14EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPManualBatchActivity_2046ToEMPAssFlow_4027InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPManualBatchActivity_2046ToEMPAssFlow_4027InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOutAnd_2031ToEMPDataFlow_4030InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow11EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOutAnd_2031ToEMPDataFlow_4030InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOutAnd_2031ToEMPDataFlow_4030InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4016ToEMPOther_2028InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOtherEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4016ToEMPOther_2028InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4016ToEMPOther_2028InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4014ToEMPManualBatchActivity_2046OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPManualBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPAssFlow_4014ToEMPManualBatchActivity_2046OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4014ToEMPManualBatchActivity_2046OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4006ToEMPNormalActivity_2044OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPNormalActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4006ToEMPNormalActivity_2044OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4006ToEMPNormalActivity_2044OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoBatchActivity_2048ToEMPDataFlow_4021OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow8EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPAutoBatchActivity_2048ToEMPDataFlow_4021OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoBatchActivity_2048ToEMPDataFlow_4021OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDocument_2025Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDocumentEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDocument_2025ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDocument_2025ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPProductPackage_2026ToEMPAssFlow_4003InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPProductPackage_2026ToEMPAssFlow_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPProductPackage_2026ToEMPAssFlow_4003InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOutAnd_2031ToEMPDataFlow_4020InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow7EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOutAnd_2031ToEMPDataFlow_4020InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOutAnd_2031ToEMPDataFlow_4020InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPCompActivity_2045ToEMPDataFlow_4002InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPCompActivity_2045ToEMPDataFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPCompActivity_2045ToEMPDataFlow_4002InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4016ToEMPMessage_2029InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPMessageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4016ToEMPMessage_2029InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4016ToEMPMessage_2029InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4002ToEMPNormalActivity_2044OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPNormalActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4002ToEMPNormalActivity_2044OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4002ToEMPNormalActivity_2044OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPCompActivity_2045ToEMPDataFlow_4005OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPCompActivity_2045ToEMPDataFlow_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPCompActivity_2045ToEMPDataFlow_4005OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOutAnd_2031ToEMPDataFlow_4032OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow13EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOutAnd_2031ToEMPDataFlow_4032OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOutAnd_2031ToEMPDataFlow_4032OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOutOr_2024ToEMPDataFlow_4031InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow12EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOutOr_2024ToEMPDataFlow_4031InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOutOr_2024ToEMPDataFlow_4031InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4017ToEMPInOr_2035OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPInOrEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4017ToEMPInOr_2035OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4017ToEMPInOr_2035OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPRefFlow_4004ToEMPForm_2049InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPFormEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPRefFlow_4004ToEMPForm_2049InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPRefFlow_4004ToEMPForm_2049InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPNormalActivity_2044Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPNormalActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPNormalActivity_2044ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPNormalActivity_2044ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPInAnd_2034ToEMPDataFlow_4036OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow17EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPInAnd_2034ToEMPDataFlow_4036OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPInAnd_2034ToEMPDataFlow_4036OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRLocationType_2042ToEMPAssFlow_4027OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow14EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRLocationType_2042ToEMPAssFlow_4027OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRLocationType_2042ToEMPAssFlow_4027OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4020ToEMPCompActivity_2045InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPCompActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4020ToEMPCompActivity_2045InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4020ToEMPCompActivity_2045InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPNormalActivity_2044ToEMPAssFlow_4028InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow15EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPNormalActivity_2044ToEMPAssFlow_4028InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPNormalActivity_2044ToEMPAssFlow_4028InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPCompActivity_2045ToEMPDataFlow_4020OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow7EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPCompActivity_2045ToEMPDataFlow_4020OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPCompActivity_2045ToEMPDataFlow_4020OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAssFlow_4029Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow16EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAssFlow_4029ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAssFlow_4029ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPCompActivity_2045ToEMPRefFlow_4004InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPRefFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPCompActivity_2045ToEMPRefFlow_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPCompActivity_2045ToEMPRefFlow_4004InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAssFlow_4025Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow12EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAssFlow_4025ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAssFlow_4025ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPInAnd_2034ToEMPDataFlow_4016InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPInAnd_2034ToEMPDataFlow_4016InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPInAnd_2034ToEMPDataFlow_4016InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRMachineType_2041ToEMPAssFlow_4012OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow8EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRMachineType_2041ToEMPAssFlow_4012OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRMachineType_2041ToEMPAssFlow_4012OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPInOr_2035ToEMPDataFlow_4019OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPInOr_2035ToEMPDataFlow_4019OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPInOr_2035ToEMPDataFlow_4019OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4012ToEMRMachineType_2041InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRMachineTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4012ToEMRMachineType_2041InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4012ToEMRMachineType_2041InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4009ToEMOResourceGroupType_2038InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMOResourceGroupTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4009ToEMOResourceGroupType_2038InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4009ToEMOResourceGroupType_2038InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPMessage_2029ToEMPDataFlow_4023InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow10EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPMessage_2029ToEMPDataFlow_4023InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPMessage_2029ToEMPDataFlow_4023InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4007ToEMOResourceGroupType_2038InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMOResourceGroupTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4007ToEMOResourceGroupType_2038InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4007ToEMOResourceGroupType_2038InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoActivity_2047ToEMPDataFlow_4021OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow8EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoActivity_2047ToEMPDataFlow_4021OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoActivity_2047ToEMPDataFlow_4021OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4018ToEMPManualBatchActivity_2046OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPManualBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPDataFlow_4018ToEMPManualBatchActivity_2046OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4018ToEMPManualBatchActivity_2046OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4003ToEMPForm_2049OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPFormEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4003ToEMPForm_2049OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4003ToEMPForm_2049OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4021ToEMPManualBatchActivity_2046InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPManualBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPDataFlow_4021ToEMPManualBatchActivity_2046InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4021ToEMPManualBatchActivity_2046InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4019ToEMPManualBatchActivity_2046OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPManualBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPDataFlow_4019ToEMPManualBatchActivity_2046OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4019ToEMPManualBatchActivity_2046OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4022ToEMPProductPackage_2026OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPProductPackageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4022ToEMPProductPackage_2026OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4022ToEMPProductPackage_2026OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4021ToEMPAutoActivity_2047InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4021ToEMPAutoActivity_2047InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4021ToEMPAutoActivity_2047InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4035Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow16EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4035ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4035ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoBatchActivity_2048ToEMPRefFlow_4004InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPRefFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoBatchActivity_2048ToEMPRefFlow_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoBatchActivity_2048ToEMPRefFlow_4004InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4022ToEMPArtifact_2037OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPArtifactEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4022ToEMPArtifact_2037OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4022ToEMPArtifact_2037OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4027ToEMRLocationType_2042InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRLocationTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4027ToEMRLocationType_2042InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4027ToEMRLocationType_2042InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPNormalActivity_2044ToEMPDataFlow_4020OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow7EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPNormalActivity_2044ToEMPDataFlow_4020OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPNormalActivity_2044ToEMPDataFlow_4020OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPCompActivity_2045ToEMPClockFlow_4001InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPClockFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPCompActivity_2045ToEMPClockFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPCompActivity_2045ToEMPClockFlow_4001InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4008ToEMPNormalActivity_2044OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPNormalActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4008ToEMPNormalActivity_2044OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4008ToEMPNormalActivity_2044OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOther_2028ToEMPDataFlow_4016OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOther_2028ToEMPDataFlow_4016OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOther_2028ToEMPDataFlow_4016OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4019ToEMPAutoActivity_2047OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4019ToEMPAutoActivity_2047OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4019ToEMPAutoActivity_2047OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPInOr_2035ToEMPDataFlow_4036InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow17EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPInOr_2035ToEMPDataFlow_4036InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPInOr_2035ToEMPDataFlow_4036InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPManualBatchActivity_2046ToEMPAssFlow_4011InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow7EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPManualBatchActivity_2046ToEMPAssFlow_4011InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPManualBatchActivity_2046ToEMPAssFlow_4011InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPForm_2049ToEMPDataFlow_4005InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPForm_2049ToEMPDataFlow_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPForm_2049ToEMPDataFlow_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4005ToEMPAutoActivity_2047InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4005ToEMPAutoActivity_2047InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4005ToEMPAutoActivity_2047InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoBatchActivity_2048ToEMPDataFlow_4002InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoBatchActivity_2048ToEMPDataFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoBatchActivity_2048ToEMPDataFlow_4002InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPCompActivity_2045ToEMPDataFlow_4019InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPCompActivity_2045ToEMPDataFlow_4019InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPCompActivity_2045ToEMPDataFlow_4019InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPMessage_2029ToEMPDataFlow_4022InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow9EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPMessage_2029ToEMPDataFlow_4022InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPMessage_2029ToEMPDataFlow_4022InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAssFlow_4009Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAssFlow_4009ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAssFlow_4009ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPNormalActivity_2044ToEMPDataFlow_4019InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPNormalActivity_2044ToEMPDataFlow_4019InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPNormalActivity_2044ToEMPDataFlow_4019InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOther_2028ToEMPAssFlow_4003InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOther_2028ToEMPAssFlow_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOther_2028ToEMPAssFlow_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4018ToEMPInAnd_2034InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPInAndEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4018ToEMPInAnd_2034InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4018ToEMPInAnd_2034InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4019ToEMPInOr_2035InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPInOrEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4019ToEMPInOr_2035InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4019ToEMPInOr_2035InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4020Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow7EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4020ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4020ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDocument_2025ToEMPDataFlow_4022InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow9EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDocument_2025ToEMPDataFlow_4022InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDocument_2025ToEMPDataFlow_4022InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPClockFlow_4001ToEMPCompActivity_2045OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPCompActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPClockFlow_4001ToEMPCompActivity_2045OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPClockFlow_4001ToEMPCompActivity_2045OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPOther_2028Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPOtherEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPOther_2028ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPOther_2028ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAssFlow_4014Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow10EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAssFlow_4014ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAssFlow_4014ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMRToolType_2039Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRToolTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMRToolType_2039ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMRToolType_2039ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4018ToEMPNormalActivity_2044OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPNormalActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4018ToEMPNormalActivity_2044OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4018ToEMPNormalActivity_2044OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPCompActivity_2045ToEMPDataFlow_4018InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPCompActivity_2045ToEMPDataFlow_4018InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPCompActivity_2045ToEMPDataFlow_4018InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPCompActivity_2045Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPCompActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPCompActivity_2045ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPCompActivity_2045ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4014ToEMRMachineType_2041InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRMachineTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4014ToEMRMachineType_2041InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4014ToEMRMachineType_2041InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoActivity_2047ToEMPDataFlow_4005OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoActivity_2047ToEMPDataFlow_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoActivity_2047ToEMPDataFlow_4005OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4028ToEMPNormalActivity_2044OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPNormalActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4028ToEMPNormalActivity_2044OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4028ToEMPNormalActivity_2044OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPArtifact_2037ToEMPDataFlow_4016OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPArtifact_2037ToEMPDataFlow_4016OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPArtifact_2037ToEMPDataFlow_4016OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4036ToEMPInOr_2035OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPInOrEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4036ToEMPInOr_2035OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4036ToEMPInOr_2035OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPRefFlow_4004ToEMPNormalActivity_2044OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPNormalActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPRefFlow_4004ToEMPNormalActivity_2044OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPRefFlow_4004ToEMPNormalActivity_2044OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4023ToEMPArtifact_2037OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPArtifactEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4023ToEMPArtifact_2037OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4023ToEMPArtifact_2037OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPProductPackage_2026ToEMPDataFlow_4022InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow9EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPProductPackage_2026ToEMPDataFlow_4022InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPProductPackage_2026ToEMPDataFlow_4022InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4021ToEMPOutOr_2024OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOutOrEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4021ToEMPOutOr_2024OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4021ToEMPOutOr_2024OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4016ToEMPInAnd_2034OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPInAndEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4016ToEMPInAnd_2034OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4016ToEMPInAnd_2034OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOutOr_2024ToEMPDataFlow_4030OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow11EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOutOr_2024ToEMPDataFlow_4030OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOutOr_2024ToEMPDataFlow_4030OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPManualBatchActivity_2046ToEMPDataFlow_4018InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow5EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPManualBatchActivity_2046ToEMPDataFlow_4018InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPManualBatchActivity_2046ToEMPDataFlow_4018InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4019ToEMPCompActivity_2045OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPCompActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4019ToEMPCompActivity_2045OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4019ToEMPCompActivity_2045OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPRefFlow_4004ToEMPProductPackage_2026InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPProductPackageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPRefFlow_4004ToEMPProductPackage_2026InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPRefFlow_4004ToEMPProductPackage_2026InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPInAnd_2034ToEMPDataFlow_4034InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow15EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPInAnd_2034ToEMPDataFlow_4034InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPInAnd_2034ToEMPDataFlow_4034InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4005ToEMPDocument_2025OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPDocumentEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4005ToEMPDocument_2025OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4005ToEMPDocument_2025OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4005ToEMPMessage_2029OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPMessageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4005ToEMPMessage_2029OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4005ToEMPMessage_2029OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPInAnd_2034ToEMPDataFlow_4037OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow18EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPInAnd_2034ToEMPDataFlow_4037OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPInAnd_2034ToEMPDataFlow_4037OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRToolType_2039ToEMPAssFlow_4003OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRToolType_2039ToEMPAssFlow_4003OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRToolType_2039ToEMPAssFlow_4003OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPRefFlow_4004ToEMPOther_2028InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOtherEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPRefFlow_4004ToEMPOther_2028InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPRefFlow_4004ToEMPOther_2028InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPRefFlow_4004ToEMPMessage_2029InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPMessageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPRefFlow_4004ToEMPMessage_2029InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPRefFlow_4004ToEMPMessage_2029InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPArtifact_2037ToEMPDataFlow_4005InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPArtifact_2037ToEMPDataFlow_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPArtifact_2037ToEMPDataFlow_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOResourceGroupType_2038ToEMPAssFlow_4007OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMOResourceGroupType_2038ToEMPAssFlow_4007OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOResourceGroupType_2038ToEMPAssFlow_4007OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4002ToEMPForm_2049InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPFormEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4002ToEMPForm_2049InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4002ToEMPForm_2049InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4019ToEMPAutoBatchActivity_2048OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPDataFlow_4019ToEMPAutoBatchActivity_2048OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4019ToEMPAutoBatchActivity_2048OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4023ToEMPDocument_2025OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPDocumentEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4023ToEMPDocument_2025OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4023ToEMPDocument_2025OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoBatchActivity_2048ToEMPDataFlow_4019InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoBatchActivity_2048ToEMPDataFlow_4019InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoBatchActivity_2048ToEMPDataFlow_4019InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMRMachineType_2041Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRMachineTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMRMachineType_2041ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMRMachineType_2041ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPRefFlow_4004ToEMPAutoActivity_2047OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPRefFlow_4004ToEMPAutoActivity_2047OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPRefFlow_4004ToEMPAutoActivity_2047OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4030ToEMPOutOr_2024InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOutOrEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4030ToEMPOutOr_2024InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4030ToEMPOutOr_2024InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4036Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow17EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4036ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4036ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoBatchActivity_2048ToEMPDataFlow_4018InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoBatchActivity_2048ToEMPDataFlow_4018InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoBatchActivity_2048ToEMPDataFlow_4018InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4016Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4016ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4016ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4009ToEMPAutoBatchActivity_2048OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4009ToEMPAutoBatchActivity_2048OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4009ToEMPAutoBatchActivity_2048OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOther_2028ToEMPRefFlow_4004OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPRefFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOther_2028ToEMPRefFlow_4004OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOther_2028ToEMPRefFlow_4004OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPInOr_2035ToEMPDataFlow_4035OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow16EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPInOr_2035ToEMPDataFlow_4035OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPInOr_2035ToEMPDataFlow_4035OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoActivity_2047ToEMPDataFlow_4020OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow7EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoActivity_2047ToEMPDataFlow_4020OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoActivity_2047ToEMPDataFlow_4020OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4018ToEMPAutoActivity_2047OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4018ToEMPAutoActivity_2047OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4018ToEMPAutoActivity_2047OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4023ToEMPOther_2028OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOtherEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4023ToEMPOther_2028OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4023ToEMPOther_2028OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4002ToEMPCompActivity_2045OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPCompActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4002ToEMPCompActivity_2045OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4002ToEMPCompActivity_2045OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4021ToEMPNormalActivity_2044InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPNormalActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4021ToEMPNormalActivity_2044InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4021ToEMPNormalActivity_2044InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4005ToEMPOther_2028OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOtherEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4005ToEMPOther_2028OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4005ToEMPOther_2028OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4003ToEMPDocument_2025OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPDocumentEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4003ToEMPDocument_2025OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4003ToEMPDocument_2025OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4025ToEMRLocationType_2042InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRLocationTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4025ToEMRLocationType_2042InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4025ToEMRLocationType_2042InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPNormalActivity_2044ToEMPDataFlow_4005OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPNormalActivity_2044ToEMPDataFlow_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPNormalActivity_2044ToEMPDataFlow_4005OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPClockFlow_4001ToEMPAutoActivity_2047OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPClockFlow_4001ToEMPAutoActivity_2047OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPClockFlow_4001ToEMPAutoActivity_2047OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDocument_2025ToEMPDataFlow_4002OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDocument_2025ToEMPDataFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDocument_2025ToEMPDataFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4026ToEMPAutoBatchActivity_2048OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4026ToEMPAutoBatchActivity_2048OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4026ToEMPAutoBatchActivity_2048OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4028ToEMRRole_2040InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRRoleEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4028ToEMRRole_2040InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4028ToEMRRole_2040InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPNormalActivity_2044ToEMPAssFlow_4006InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPNormalActivity_2044ToEMPAssFlow_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPNormalActivity_2044ToEMPAssFlow_4006InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4016ToEMPProductPackage_2026InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPProductPackageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4016ToEMPProductPackage_2026InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4016ToEMPProductPackage_2026InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4021ToEMPAutoBatchActivity_2048InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4021ToEMPAutoBatchActivity_2048InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4021ToEMPAutoBatchActivity_2048InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAssFlow_4006Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAssFlow_4006ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAssFlow_4006ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPProductPackage_2026Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPProductPackageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPProductPackage_2026ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPProductPackage_2026ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4022ToEMPOther_2028OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOtherEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4022ToEMPOther_2028OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4022ToEMPOther_2028OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4017ToEMPOther_2028InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOtherEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4017ToEMPOther_2028InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4017ToEMPOther_2028InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPMessage_2029ToEMPDataFlow_4005InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPMessage_2029ToEMPDataFlow_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPMessage_2029ToEMPDataFlow_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPProductPackage_2026ToEMPDataFlow_4016OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPProductPackage_2026ToEMPDataFlow_4016OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPProductPackage_2026ToEMPDataFlow_4016OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPArtifact_2037ToEMPAssFlow_4003InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPArtifact_2037ToEMPAssFlow_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPArtifact_2037ToEMPAssFlow_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOutAnd_2031ToEMPDataFlow_4033InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow14EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOutAnd_2031ToEMPDataFlow_4033InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOutAnd_2031ToEMPDataFlow_4033InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4013ToEMPAutoBatchActivity_2048OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4013ToEMPAutoBatchActivity_2048OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4013ToEMPAutoBatchActivity_2048OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPManualBatchActivity_2046ToEMPDataFlow_4019InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow6EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPManualBatchActivity_2046ToEMPDataFlow_4019InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPManualBatchActivity_2046ToEMPDataFlow_4019InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4016ToEMPDocument_2025InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPDocumentEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4016ToEMPDocument_2025InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4016ToEMPDocument_2025InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoBatchActivity_2048ToEMPDataFlow_4020OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow7EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPAutoBatchActivity_2048ToEMPDataFlow_4020OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoBatchActivity_2048ToEMPDataFlow_4020OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPInOr_2035ToEMPDataFlow_4034OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow15EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPInOr_2035ToEMPDataFlow_4034OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPInOr_2035ToEMPDataFlow_4034OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPRefFlow_4004ToEMPArtifact_2037InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPArtifactEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPRefFlow_4004ToEMPArtifact_2037InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPRefFlow_4004ToEMPArtifact_2037InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4015ToEMPNormalActivity_2044OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPNormalActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4015ToEMPNormalActivity_2044OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4015ToEMPNormalActivity_2044OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4034ToEMPInOr_2035InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPInOrEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4034ToEMPInOr_2035InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4034ToEMPInOr_2035InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAssFlow_4012Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow8EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAssFlow_4012ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAssFlow_4012ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOther_2028ToEMPDataFlow_4022InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow9EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOther_2028ToEMPDataFlow_4022InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOther_2028ToEMPDataFlow_4022InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4005ToEMPNormalActivity_2044InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPNormalActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4005ToEMPNormalActivity_2044InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4005ToEMPNormalActivity_2044InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDocument_2025ToEMPRefFlow_4004OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPRefFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDocument_2025ToEMPRefFlow_4004OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDocument_2025ToEMPRefFlow_4004OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4017ToEMPProductPackage_2026InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPProductPackageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4017ToEMPProductPackage_2026InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4017ToEMPProductPackage_2026InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPForm_2049ToEMPDataFlow_4022InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow9EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPForm_2049ToEMPDataFlow_4022InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPForm_2049ToEMPDataFlow_4022InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPInOr_2035ToEMPDataFlow_4017InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPInOr_2035ToEMPDataFlow_4017InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPInOr_2035ToEMPDataFlow_4017InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4020ToEMPAutoActivity_2047InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4020ToEMPAutoActivity_2047InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4020ToEMPAutoActivity_2047InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4020ToEMPManualBatchActivity_2046InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPManualBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPDataFlow_4020ToEMPManualBatchActivity_2046InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4020ToEMPManualBatchActivity_2046InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPCompActivity_2045ToEMPAssFlow_4007InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPCompActivity_2045ToEMPAssFlow_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPCompActivity_2045ToEMPAssFlow_4007InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4002ToEMPAutoBatchActivity_2048OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPDataFlow_4002ToEMPAutoBatchActivity_2048OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4002ToEMPAutoBatchActivity_2048OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4030ToEMPOutAnd_2031OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOutAndEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4030ToEMPOutAnd_2031OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4030ToEMPOutAnd_2031OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4022Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow9EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4022ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4022ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoBatchActivity_2048ToEMPAssFlow_4013InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow9EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoBatchActivity_2048ToEMPAssFlow_4013InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoBatchActivity_2048ToEMPAssFlow_4013InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPInOr_2035ToEMPDataFlow_4035InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow16EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPInOr_2035ToEMPDataFlow_4035InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPInOr_2035ToEMPDataFlow_4035InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4018ToEMPCompActivity_2045OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPCompActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4018ToEMPCompActivity_2045OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4018ToEMPCompActivity_2045OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4020ToEMPNormalActivity_2044InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPNormalActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4020ToEMPNormalActivity_2044InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4020ToEMPNormalActivity_2044InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPArtifact_2037ToEMPDataFlow_4023InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow10EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPArtifact_2037ToEMPDataFlow_4023InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPArtifact_2037ToEMPDataFlow_4023InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOutOr_2024ToEMPDataFlow_4031OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow12EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOutOr_2024ToEMPDataFlow_4031OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOutOr_2024ToEMPDataFlow_4031OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4013ToEMRMachineType_2041InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRMachineTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4013ToEMRMachineType_2041InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4013ToEMRMachineType_2041InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAssFlow_4026Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow13EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAssFlow_4026ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAssFlow_4026ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPManualBatchActivity_2046ToEMPAssFlow_4014InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow10EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPManualBatchActivity_2046ToEMPAssFlow_4014InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPManualBatchActivity_2046ToEMPAssFlow_4014InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPInAnd_2034Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPInAndEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPInAnd_2034ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPInAnd_2034ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDocument_2025ToEMPDataFlow_4023InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow10EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDocument_2025ToEMPDataFlow_4023InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDocument_2025ToEMPDataFlow_4023InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPForm_2049ToEMPRefFlow_4004OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPRefFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPForm_2049ToEMPRefFlow_4004OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPForm_2049ToEMPRefFlow_4004OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAssFlow_4028Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow15EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAssFlow_4028ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAssFlow_4028ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPRefFlow_4004ToEMPManualBatchActivity_2046OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPManualBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPRefFlow_4004ToEMPManualBatchActivity_2046OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPRefFlow_4004ToEMPManualBatchActivity_2046OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPOutAnd_2031Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPOutAndEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPOutAnd_2031ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPOutAnd_2031ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPNormalActivity_2044ToEMPClockFlow_4001InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPClockFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPNormalActivity_2044ToEMPClockFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPNormalActivity_2044ToEMPClockFlow_4001InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4029ToEMPManualBatchActivity_2046OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPManualBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPAssFlow_4029ToEMPManualBatchActivity_2046OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4029ToEMPManualBatchActivity_2046OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPMessage_2029ToEMPDataFlow_4016OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPMessage_2029ToEMPDataFlow_4016OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPMessage_2029ToEMPDataFlow_4016OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4017ToEMPDocument_2025InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPDocumentEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4017ToEMPDocument_2025InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4017ToEMPDocument_2025InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoActivity_2047ToEMPDataFlow_4002InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoActivity_2047ToEMPDataFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoActivity_2047ToEMPDataFlow_4002InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4006ToEMRMachineType_2041InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRMachineTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4006ToEMRMachineType_2041InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4006ToEMRMachineType_2041InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPMessage_2029ToEMPDataFlow_4017OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPMessage_2029ToEMPDataFlow_4017OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPMessage_2029ToEMPDataFlow_4017OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMRLocationType_2042Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRLocationTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMRLocationType_2042ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMRLocationType_2042ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4029ToEMRRole_2040InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRRoleEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4029ToEMRRole_2040InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4029ToEMRRole_2040InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4002Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4035ToEMPInOr_2035InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPInOrEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4035ToEMPInOr_2035InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4035ToEMPInOr_2035InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPManualBatchActivity_2046ToEMPDataFlow_4002InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlowEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPManualBatchActivity_2046ToEMPDataFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPManualBatchActivity_2046ToEMPDataFlow_4002InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPArtifact_2037ToEMPDataFlow_4022InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow9EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPArtifact_2037ToEMPDataFlow_4022InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPArtifact_2037ToEMPDataFlow_4022InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOutAnd_2031ToEMPDataFlow_4033OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow14EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOutAnd_2031ToEMPDataFlow_4033OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOutAnd_2031ToEMPDataFlow_4033OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPManualBatchActivity_2046ToEMPDataFlow_4021OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow8EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPManualBatchActivity_2046ToEMPDataFlow_4021OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPManualBatchActivity_2046ToEMPDataFlow_4021OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4005ToEMPArtifact_2037OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPArtifactEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4005ToEMPArtifact_2037OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4005ToEMPArtifact_2037OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPClockFlow_4001Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPClockFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPClockFlow_4001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPClockFlow_4001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPRefFlow_4004Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPRefFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPRefFlow_4004ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPRefFlow_4004ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4019Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4019ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4019ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAssFlow_4003ToEMPArtifact_2037OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPArtifactEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAssFlow_4003ToEMPArtifact_2037OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAssFlow_4003ToEMPArtifact_2037OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPRefFlow_4004ToEMPCompActivity_2045OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPCompActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPRefFlow_4004ToEMPCompActivity_2045OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPRefFlow_4004ToEMPCompActivity_2045OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPManualBatchActivity_2046ToEMPRefFlow_4004InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPRefFlowEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPManualBatchActivity_2046ToEMPRefFlow_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPManualBatchActivity_2046ToEMPRefFlow_4004InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4030Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow11EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4030ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4030ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4017ToEMPArtifact_2037InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPArtifactEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4017ToEMPArtifact_2037InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4017ToEMPArtifact_2037InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoBatchActivity_2048ToEMPDataFlow_4005OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow2EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPAutoBatchActivity_2048ToEMPDataFlow_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoBatchActivity_2048ToEMPDataFlow_4005OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPForm_2049ToEMPDataFlow_4002OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPForm_2049ToEMPDataFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPForm_2049ToEMPDataFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPMessage_2029ToEMPRefFlow_4004OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPRefFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPMessage_2029ToEMPRefFlow_4004OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPMessage_2029ToEMPRefFlow_4004OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4005ToEMPForm_2049OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPFormEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4005ToEMPForm_2049OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4005ToEMPForm_2049OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPManualBatchActivity_2046ToEMPDataFlow_4005OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow2EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPManualBatchActivity_2046ToEMPDataFlow_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPManualBatchActivity_2046ToEMPDataFlow_4005OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDocument_2025ToEMPAssFlow_4003InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDocument_2025ToEMPAssFlow_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDocument_2025ToEMPAssFlow_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoActivity_2047ToEMPDataFlow_4018InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPAutoActivity_2047ToEMPDataFlow_4018InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoActivity_2047ToEMPDataFlow_4018InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAutoActivity_2047Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAutoActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAutoActivity_2047ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAutoActivity_2047ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4017ToEMPMessage_2029InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPMessageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4017ToEMPMessage_2029InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4017ToEMPMessage_2029InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRMachineType_2041ToEMPAssFlow_4006OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRMachineType_2041ToEMPAssFlow_4006OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRMachineType_2041ToEMPAssFlow_4006OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRMachineType_2041ToEMPAssFlow_4013OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow9EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRMachineType_2041ToEMPAssFlow_4013OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRMachineType_2041ToEMPAssFlow_4013OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPClockFlow_4001ToEMPClock_2033InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPClockEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPClockFlow_4001ToEMPClock_2033InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPClockFlow_4001ToEMPClock_2033InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4021ToEMPCompActivity_2045InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPCompActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4021ToEMPCompActivity_2045InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4021ToEMPCompActivity_2045InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPAutoBatchActivity_2048ToEMPClockFlow_4001InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPClockFlowEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPAutoBatchActivity_2048ToEMPClockFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPAutoBatchActivity_2048ToEMPClockFlow_4001InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPNormalActivity_2044ToEMPDataFlow_4018InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPNormalActivity_2044ToEMPDataFlow_4018InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPNormalActivity_2044ToEMPDataFlow_4018InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMOResourceGroupType_2038ToEMPAssFlow_4009OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMOResourceGroupType_2038ToEMPAssFlow_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMOResourceGroupType_2038ToEMPAssFlow_4009OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4034Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow15EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4034ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4034ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPClockFlow_4001ToEMPManualBatchActivity_2046OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPManualBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPClockFlow_4001ToEMPManualBatchActivity_2046OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPClockFlow_4001ToEMPManualBatchActivity_2046OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4016ToEMPForm_2049InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPFormEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4016ToEMPForm_2049InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4016ToEMPForm_2049InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPMessage_2029ToEMPDataFlow_4002OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPMessage_2029ToEMPDataFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPMessage_2029ToEMPDataFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPDataFlow_4037Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow18EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPDataFlow_4037ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPDataFlow_4037ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPForm_2049ToEMPDataFlow_4016OutTarget(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPForm_2049ToEMPDataFlow_4016OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPForm_2049ToEMPDataFlow_4016OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPRefFlow_4004ToEMPDocument_2025InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPDocumentEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPRefFlow_4004ToEMPDocument_2025InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPRefFlow_4004ToEMPDocument_2025InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAssFlow_4015Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow11EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAssFlow_4015ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAssFlow_4015ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4018ToEMPAutoBatchActivity_2048OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPDataFlow_4018ToEMPAutoBatchActivity_2048OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4018ToEMPAutoBatchActivity_2048OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4019ToEMPNormalActivity_2044OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPNormalActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4019ToEMPNormalActivity_2044OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4019ToEMPNormalActivity_2044OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4023ToEMPOutOr_2024InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOutOrEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4023ToEMPOutOr_2024InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4023ToEMPOutOr_2024InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOther_2028ToEMPDataFlow_4005InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOther_2028ToEMPDataFlow_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOther_2028ToEMPDataFlow_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4016ToEMPArtifact_2037InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPArtifactEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4016ToEMPArtifact_2037InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4016ToEMPArtifact_2037InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAssFlow_4011Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow7EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAssFlow_4011ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAssFlow_4011ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPClock_2033Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPClockEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPClock_2033ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPClock_2033ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4032ToEMPOutOr_2024OutTarget(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOutOrEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4032ToEMPOutOr_2024OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4032ToEMPOutOr_2024OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4002ToEMPOther_2028InSource(Edge edge,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPOtherEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4002ToEMPOther_2028InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4002ToEMPOther_2028InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRLocationType_2042ToEMPAssFlow_4015OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow11EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRLocationType_2042ToEMPAssFlow_4015OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRLocationType_2042ToEMPAssFlow_4015OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDiagram_1000ToEMPAssFlow_4010Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPAssFlow6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDiagram_1000ToEMPAssFlow_4010ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDiagram_1000ToEMPAssFlow_4010ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMPClockFlow_4001ToEMPAutoBatchActivity_2048OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMPClockFlow_4001ToEMPAutoBatchActivity_2048OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPClockFlow_4001ToEMPAutoBatchActivity_2048OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPDataFlow_4020ToEMPAutoBatchActivity_2048InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMPAutoBatchActivityEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPDataFlow_4020ToEMPAutoBatchActivity_2048InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPDataFlow_4020ToEMPAutoBatchActivity_2048InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMPOutOr_2024ToEMPDataFlow_4032InSource(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMPDataFlow13EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMPOutOr_2024ToEMPDataFlow_4032InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMPOutOr_2024ToEMPDataFlow_4032InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getLinksSourceByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& !isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getLinksTargetByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getTarget();
			if (type.equals(nextEdgeSource.getType())
					&& !isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getOutgoingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getIncomingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getChildrenByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getDiagramLinksByType(Collection diagrams, String type) {
		Collection result = new ArrayList();
		for (Iterator it = diagrams.iterator(); it.hasNext();) {
			Diagram nextDiagram = (Diagram) it.next();
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private Collection selectViewsByType(Collection views, String type) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof View) {
				View nextView = (View) obj;
				if (type.equals(nextView.getType()) && isOwnView(nextView)) {
					result.add(nextView);
				}
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent) {
		Collection result = new ArrayList();
		createNavigatorItems(views, parent, result, false);
		return result;
	}

	/**
	 * @generated
	 */
	private void createNavigatorItems(Collection views, Object parent,
			Collection result, boolean isLeafs) {
		for (Iterator it = views.iterator(); it.hasNext();) {
			result.add(new NewPMBENavigatorItem((View) it.next(), parent,
					isLeafs));
		}
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return EMPDiagramEditPart.MODEL_ID.equals(NewPMBEVisualIDRegistry
				.getModelID(view));
	}

	public static HashMap getHashMap() {
		return hashMap;
	}

	protected TransactionalEditingDomain createEditingDomain() {
		String editingDomainID = "newpmbe.process.diagram.EditingDomain";
		if (editingDomainID != null) {
			TransactionalEditingDomain editingDomain = TransactionalEditingDomain.Registry.INSTANCE
					.getEditingDomain(editingDomainID);
			if (editingDomain != null) {
				return editingDomain;
			}
		}
		TransactionalEditingDomain editingDomain = DiagramEditingDomainFactory
				.getInstance().createEditingDomain();
		editingDomain.setID(editingDomainID);
		return editingDomain;
	}

	public static TreeViewer getViewer() {
		return viewer;
	}
}
