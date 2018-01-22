package newpmbe.resource.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import newpmbe.resource.diagram.edit.parts.EMRAbstractLocationTypeEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractMachineTypeEditPart;
//import newpmbe.resource.diagram.edit.parts.EMRAbstractRoleEditPart;
import newpmbe.resource.diagram.edit.parts.EMRAbstractToolTypeEditPart;
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
import newpmbe.resource.diagram.edit.parts.EMRMachineTypeEditPart;
//import newpmbe.resource.diagram.edit.parts.EMRRoleEditPart;
import newpmbe.resource.diagram.edit.parts.EMRToolTypeEditPart;

import newpmbe.resource.diagram.part.NewPMBEVisualIDRegistry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import org.eclipse.gmf.runtime.diagram.core.DiagramEditingDomainFactory;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.eclipse.ui.part.FileEditorInput;

/**
 * @generated
 */
public class NewPMBENavigatorContentProvider implements ICommonContentProvider{

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	// added by zhangpeng
	private static final String resourceFileExtension = ".resource_diagram";
	private static TreeViewer viewer = null;
	private static HashMap<IResource, NewPMBENavigatorItem> hashMap = new HashMap<IResource, NewPMBENavigatorItem>();
	private IWorkbenchPage activePage;
	
	//end added by zhangpeng
	/**
	 * @generated
	 */
	public void dispose() {
	}

	/**
	 * @generated NOT
	 * added by zhangpeng
	 */
	public static HashMap getHashMap() {
		return hashMap;
	}

	/**
	 * @generated NOT
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = (TreeViewer) viewer;
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated NOT
	 */
	public Object[] getChildren(Object parentElement) {
		//added by zhangpeng
//		if(parentElement instanceof IWorkspaceRoot){
//			IWorkspaceRoot spaceRoot = (IWorkspaceRoot)parentElement;
//			//仅仅返回一个工程，该工程由右侧的编辑器的状态而定
//			//如果右侧有打开着的编辑器，则以该编辑器的输入为线索显示
//			if(getActivePage() == null)
//				return EMPTY_ARRAY;
//			IEditorPart editor = getActivePage().getActiveEditor();
//			if(editor== null && !(editor instanceof DiagramDocumentEditor))
//				return EMPTY_ARRAY;
//			FileEditorInput input = (FileEditorInput)editor.getEditorInput();
//			IFile file = input.getFile();
//			IProject project = file.getProject();
//			Collection result = new ArrayList();
//			result.add(project);
//			return result.toArray();
//		}
		if(parentElement instanceof IProject){
			IProject project = (IProject)parentElement;
			//changed by zhangpeng-改变了工程属性，为每个工程项目增加了后缀，但是要对用户透明
			String projectExtension = project.getFileExtension();
			String projectName = project.getName().substring(0, project.getName().length() - projectExtension.length() - 1);
			IFile file = project.getFile(projectName + resourceFileExtension);
			//end changed by zhangpeng
			
		//如果文件还未被创建
		if(!file.exists()) return EMPTY_ARRAY;		
		AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain)createEditingDomain();
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
				.getContents(), EMRDiagramEditPart.MODEL_ID), file));
		ArrayList list = (ArrayList)result;
		for(int i = 0; i < result.size(); i++)
		{
			if(list.get(i) instanceof NewPMBENavigatorItem)
			{
				NewPMBENavigatorItem navigatorItem = (NewPMBENavigatorItem) list.get(i);
				if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
					return EMPTY_ARRAY;
				}
				hashMap.put(project, navigatorItem);
				Object[] array =  getViewChildren(navigatorItem.getView(), parentElement);
				return array;
			}
		}
		return result.toArray();
		}
		//end added by zhangpeng
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
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
					.getContents(), EMRDiagramEditPart.MODEL_ID), file));
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

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (NewPMBEVisualIDRegistry.getVisualID(view)) {
		case EMRAbstractToolTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMRAbstractToolType_2009ToEMRClassificationRelation_4013InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMRAbstractToolType_2009ToEMRClassificationRelation_4013OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMRAbstractToolType_2009ToEMRClassificationRelation_4014OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMRAbstractLocationTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMRAbstractLocationType_2010ToEMRClassificationRelation_4009InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMRAbstractLocationType_2010ToEMRClassificationRelation_4009OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMRAbstractLocationType_2010ToEMRClassificationRelation_4010OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMRAbstractMachineTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMRAbstractMachineType_2011ToEMRClassificationRelation_4011InSource(
							view, incominglinks));
			NewPMBENavigatorGroup outgoinglinks = new NewPMBENavigatorGroup(
					"outgoing links", "icons/outgoingLinksNavigatorGroup.gif",
					parentElement);
			outgoinglinks
					.addChildren(getEMRAbstractMachineType_2011ToEMRClassificationRelation_4011OutTarget(
							view, outgoinglinks));
			outgoinglinks
					.addChildren(getEMRAbstractMachineType_2011ToEMRClassificationRelation_4012OutTarget(
							view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMRLocationTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMRLocationType_2012ToEMRClassificationRelation_4010InSource(
							view, incominglinks));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMRMachineTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMRMachineType_2013ToEMRClassificationRelation_4012InSource(
							view, incominglinks));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMRToolTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup incominglinks = new NewPMBENavigatorGroup(
					"incoming links", "icons/incomingLinksNavigatorGroup.gif",
					parentElement);
			incominglinks
					.addChildren(getEMRToolType_2014ToEMRClassificationRelation_4014InSource(
							view, incominglinks));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case EMRDiagramEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getEMRDiagram_1000ToEMRAbstractToolType_2009Children(
					view, parentElement));
			result
					.addAll(getEMRDiagram_1000ToEMRAbstractLocationType_2010Children(
							view, parentElement));
			result
					.addAll(getEMRDiagram_1000ToEMRAbstractMachineType_2011Children(
							view, parentElement));
			result.addAll(getEMRDiagram_1000ToEMRLocationType_2012Children(
					view, parentElement));
			result.addAll(getEMRDiagram_1000ToEMRMachineType_2013Children(view,
					parentElement));
			result.addAll(getEMRDiagram_1000ToEMRToolType_2014Children(view,
					parentElement));
			NewPMBENavigatorGroup links = new NewPMBENavigatorGroup("links",
					"icons/linksNavigatorGroup.gif", parentElement);
			links
					.addChildren(getEMRDiagram_1000ToEMRClassificationRelation_4009Children(
							view, links));
			links
					.addChildren(getEMRDiagram_1000ToEMRClassificationRelation_4010Children(
							view, links));
			links
					.addChildren(getEMRDiagram_1000ToEMRClassificationRelation_4011Children(
							view, links));
			links
					.addChildren(getEMRDiagram_1000ToEMRClassificationRelation_4012Children(
							view, links));
			links
					.addChildren(getEMRDiagram_1000ToEMRClassificationRelation_4013Children(
							view, links));
			links
					.addChildren(getEMRDiagram_1000ToEMRClassificationRelation_4014Children(
							view, links));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}
		case EMRClassificationRelationEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMRClassificationRelation_4009ToEMRAbstractLocationType_2010OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMRClassificationRelation_4009ToEMRAbstractLocationType_2010InSource(
							(Edge) view, source));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		case EMRClassificationRelation2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMRClassificationRelation_4010ToEMRLocationType_2012OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMRClassificationRelation_4010ToEMRAbstractLocationType_2010InSource(
							(Edge) view, source));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		case EMRClassificationRelation3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMRClassificationRelation_4011ToEMRAbstractMachineType_2011OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMRClassificationRelation_4011ToEMRAbstractMachineType_2011InSource(
							(Edge) view, source));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		case EMRClassificationRelation4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMRClassificationRelation_4012ToEMRMachineType_2013OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMRClassificationRelation_4012ToEMRAbstractMachineType_2011InSource(
							(Edge) view, source));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		case EMRClassificationRelation5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMRClassificationRelation_4013ToEMRAbstractToolType_2009OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMRClassificationRelation_4013ToEMRAbstractToolType_2009InSource(
							(Edge) view, source));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		case EMRClassificationRelation6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			NewPMBENavigatorGroup target = new NewPMBENavigatorGroup("target",
					"icons/linkTargetNavigatorGroup.gif", parentElement);
			target
					.addChildren(getEMRClassificationRelation_4014ToEMRToolType_2014OutTarget(
							(Edge) view, target));
			NewPMBENavigatorGroup source = new NewPMBENavigatorGroup("source",
					"icons/linkSourceNavigatorGroup.gif", parentElement);
			source
					.addChildren(getEMRClassificationRelation_4014ToEMRAbstractToolType_2009InSource(
							(Edge) view, source));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
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
	private Collection getEMRAbstractMachineType_2011ToEMRClassificationRelation_4011OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelation3EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRAbstractMachineType_2011ToEMRClassificationRelation_4011OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRAbstractMachineType_2011ToEMRClassificationRelation_4011OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRAbstractMachineType_2011ToEMRClassificationRelation_4012OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelation4EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRAbstractMachineType_2011ToEMRClassificationRelation_4012OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRAbstractMachineType_2011ToEMRClassificationRelation_4012OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRAbstractLocationType_2010ToEMRClassificationRelation_4010OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelation2EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRAbstractLocationType_2010ToEMRClassificationRelation_4010OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRAbstractLocationType_2010ToEMRClassificationRelation_4010OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRClassificationRelation_4012ToEMRMachineType_2013OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRMachineTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRClassificationRelation_4012ToEMRMachineType_2013OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRClassificationRelation_4012ToEMRMachineType_2013OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRClassificationRelation_4013ToEMRAbstractToolType_2009OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRAbstractToolTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRClassificationRelation_4013ToEMRAbstractToolType_2009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRClassificationRelation_4013ToEMRAbstractToolType_2009OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRDiagram_1000ToEMRClassificationRelation_4009Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelationEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRDiagram_1000ToEMRClassificationRelation_4009ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRDiagram_1000ToEMRClassificationRelation_4009ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMRToolType_2014ToEMRClassificationRelation_4014InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelation6EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRToolType_2014ToEMRClassificationRelation_4014InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRToolType_2014ToEMRClassificationRelation_4014InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRAbstractToolType_2009ToEMRClassificationRelation_4013InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelation5EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRAbstractToolType_2009ToEMRClassificationRelation_4013InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRAbstractToolType_2009ToEMRClassificationRelation_4013InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRClassificationRelation_4009ToEMRAbstractLocationType_2010OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRAbstractLocationTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRClassificationRelation_4009ToEMRAbstractLocationType_2010OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRClassificationRelation_4009ToEMRAbstractLocationType_2010OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRDiagram_1000ToEMRClassificationRelation_4012Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelation4EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRDiagram_1000ToEMRClassificationRelation_4012ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRDiagram_1000ToEMRClassificationRelation_4012ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMRDiagram_1000ToEMRLocationType_2012Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRLocationTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRDiagram_1000ToEMRLocationType_2012ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRDiagram_1000ToEMRLocationType_2012ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMRAbstractToolType_2009ToEMRClassificationRelation_4014OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelation6EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRAbstractToolType_2009ToEMRClassificationRelation_4014OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRAbstractToolType_2009ToEMRClassificationRelation_4014OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRDiagram_1000ToEMRAbstractMachineType_2011Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRAbstractMachineTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRDiagram_1000ToEMRAbstractMachineType_2011ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRDiagram_1000ToEMRAbstractMachineType_2011ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMRAbstractMachineType_2011ToEMRClassificationRelation_4011InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelation3EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRAbstractMachineType_2011ToEMRClassificationRelation_4011InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRAbstractMachineType_2011ToEMRClassificationRelation_4011InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRDiagram_1000ToEMRAbstractLocationType_2010Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRAbstractLocationTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRDiagram_1000ToEMRAbstractLocationType_2010ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRDiagram_1000ToEMRAbstractLocationType_2010ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMRDiagram_1000ToEMRClassificationRelation_4011Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelation3EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRDiagram_1000ToEMRClassificationRelation_4011ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRDiagram_1000ToEMRClassificationRelation_4011ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMRClassificationRelation_4009ToEMRAbstractLocationType_2010InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRAbstractLocationTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRClassificationRelation_4009ToEMRAbstractLocationType_2010InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRClassificationRelation_4009ToEMRAbstractLocationType_2010InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRMachineType_2013ToEMRClassificationRelation_4012InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelation4EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRMachineType_2013ToEMRClassificationRelation_4012InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRMachineType_2013ToEMRClassificationRelation_4012InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRClassificationRelation_4010ToEMRLocationType_2012OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRLocationTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRClassificationRelation_4010ToEMRLocationType_2012OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRClassificationRelation_4010ToEMRLocationType_2012OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRLocationType_2012ToEMRClassificationRelation_4010InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelation2EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRLocationType_2012ToEMRClassificationRelation_4010InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRLocationType_2012ToEMRClassificationRelation_4010InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRDiagram_1000ToEMRClassificationRelation_4013Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelation5EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRDiagram_1000ToEMRClassificationRelation_4013ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRDiagram_1000ToEMRClassificationRelation_4013ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMRClassificationRelation_4010ToEMRAbstractLocationType_2010InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRAbstractLocationTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRClassificationRelation_4010ToEMRAbstractLocationType_2010InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRClassificationRelation_4010ToEMRAbstractLocationType_2010InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRClassificationRelation_4014ToEMRToolType_2014OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRToolTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRClassificationRelation_4014ToEMRToolType_2014OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRClassificationRelation_4014ToEMRToolType_2014OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRClassificationRelation_4013ToEMRAbstractToolType_2009InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRAbstractToolTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRClassificationRelation_4013ToEMRAbstractToolType_2009InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRClassificationRelation_4013ToEMRAbstractToolType_2009InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRDiagram_1000ToEMRMachineType_2013Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRMachineTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRDiagram_1000ToEMRMachineType_2013ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRDiagram_1000ToEMRMachineType_2013ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMRDiagram_1000ToEMRClassificationRelation_4010Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelation2EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRDiagram_1000ToEMRClassificationRelation_4010ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRDiagram_1000ToEMRClassificationRelation_4010ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMRDiagram_1000ToEMRClassificationRelation_4014Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelation6EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRDiagram_1000ToEMRClassificationRelation_4014ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRDiagram_1000ToEMRClassificationRelation_4014ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMRDiagram_1000ToEMRToolType_2014Children(View view,
			Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRToolTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRDiagram_1000ToEMRToolType_2014ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRDiagram_1000ToEMRToolType_2014ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMRAbstractLocationType_2010ToEMRClassificationRelation_4009OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelationEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRAbstractLocationType_2010ToEMRClassificationRelation_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRAbstractLocationType_2010ToEMRClassificationRelation_4009OutTargetLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRAbstractLocationType_2010ToEMRClassificationRelation_4009InSource(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelationEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRAbstractLocationType_2010ToEMRClassificationRelation_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRAbstractLocationType_2010ToEMRClassificationRelation_4009InSourceLeaf(
			View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRClassificationRelation_4011ToEMRAbstractMachineType_2011InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRAbstractMachineTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRClassificationRelation_4011ToEMRAbstractMachineType_2011InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRClassificationRelation_4011ToEMRAbstractMachineType_2011InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRClassificationRelation_4011ToEMRAbstractMachineType_2011OutTarget(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRAbstractMachineTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRClassificationRelation_4011ToEMRAbstractMachineType_2011OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRClassificationRelation_4011ToEMRAbstractMachineType_2011OutTargetLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRClassificationRelation_4012ToEMRAbstractMachineType_2011InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRAbstractMachineTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRClassificationRelation_4012ToEMRAbstractMachineType_2011InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRClassificationRelation_4012ToEMRAbstractMachineType_2011InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRDiagram_1000ToEMRAbstractToolType_2009Children(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRAbstractToolTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result,
				isEMRDiagram_1000ToEMRAbstractToolType_2009ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRDiagram_1000ToEMRAbstractToolType_2009ChildrenLeaf(
			View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEMRClassificationRelation_4014ToEMRAbstractToolType_2009InSource(
			Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections
				.singleton(edge), NewPMBEVisualIDRegistry
				.getType(EMRAbstractToolTypeEditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRClassificationRelation_4014ToEMRAbstractToolType_2009InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRClassificationRelation_4014ToEMRAbstractToolType_2009InSourceLeaf(
			Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEMRAbstractToolType_2009ToEMRClassificationRelation_4013OutTarget(
			View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections
				.singleton(view), NewPMBEVisualIDRegistry
				.getType(EMRClassificationRelation5EditPart.VISUAL_ID));
		createNavigatorItems(
				connectedViews,
				parent,
				result,
				isEMRAbstractToolType_2009ToEMRClassificationRelation_4013OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEMRAbstractToolType_2009ToEMRClassificationRelation_4013OutTargetLeaf(
			View view) {
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
			if(obj instanceof View){
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
		return EMRDiagramEditPart.MODEL_ID.equals(NewPMBEVisualIDRegistry
				.getModelID(view));
	}

	//added by zhangpeng
	protected TransactionalEditingDomain createEditingDomain() {
		String editingDomainID = "newpmbe.resource.diagram.EditingDomain";
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

	//end added by zhangpeng
	public static TreeViewer getViewer() {
//		IViewPart part = getActivePage().findView("org.eclipse.ui.navigator.ProjectExplorer");
//		if(part == null)
//			return null;
//		CommonNavigator navigator = (CommonNavigator)part;
//		return navigator.getCommonViewer();
		return viewer;
	}
	public IWorkbenchPage getActivePage(){
		if(activePage == null){
			activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		}
		return activePage;
	}
	//end added by zhangpeng

	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		if(!(part instanceof DiagramDocumentEditor))
			return;
		Object oldInput = getViewer().getInput();
		DiagramDocumentEditor editor = (DiagramDocumentEditor)part;

		IFileEditorInput input = (IFileEditorInput)editor.getEditorInput();
		IFile file = input.getFile();
		IProject project = file.getProject();
		this.inputChanged(getViewer(), oldInput, project);
	}
}
