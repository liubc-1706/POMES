package newpmbe.process.diagram.edit.policies;

import java.util.ArrayList;
import java.util.List;

import newpmbe.process.diagram.edit.parts.EMPCompActivityEditPart;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;

import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;

import vpml.processpackage.EMPClock;
import vpml.processpackage.EMPClockFlow;
import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.EMPLeafProduct;
import vpml.processpackage.EMPObject;

/**
 * @generated
 */
public class EMPClockFlowItemSemanticEditPolicy extends
		NewPMBEBaseItemSemanticEditPolicy {

	/**
	 * @generated NOT
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getMSLWrapper(new DestroyElementCommand(req) {
			@Override
			protected EObject getElementToDestroy() {
				// TODO Auto-generated method stub
				ConnectionNodeEditPart connection = (ConnectionNodeEditPart) getHost();
				IGraphicalEditPart source = (IGraphicalEditPart) connection
						.getSource();
				IGraphicalEditPart target = (IGraphicalEditPart) connection
						.getTarget();
				if (source instanceof EMPCompActivityEditPart
						|| target instanceof EMPCompActivityEditPart) {
					EMPCompActivityEditPart compEditPart = null;
					EMPObject obj = null;
					if (source instanceof EMPCompActivityEditPart) {
						compEditPart = (EMPCompActivityEditPart) source;
						obj = (EMPObject) ((NodeImpl) target.getModel())
								.getElement();
					} else if (target instanceof EMPCompActivityEditPart) {
						compEditPart = (EMPCompActivityEditPart) target;
						obj = (EMPObject) ((NodeImpl) source.getModel())
								.getElement();
					}
					EMPCompActivity compAct = (EMPCompActivity) ((NodeImpl) compEditPart
							.getModel()).getElement();
					String id = obj.getId();

					CompoundCommand cc = new CompoundCommand(
							DiagramUIMessages.AddCommand_Label);
					if (obj instanceof EMPLeafProduct) {
						List sourceFlowList = ((EMPLeafProduct) obj)
								.getSourceDataFlows();
						List targetFlowList = ((EMPLeafProduct) obj)
								.getTargetDataFlows();
						for (int i = 0; i < sourceFlowList.size(); i++) {
							EMPDataFlow dataflow = (EMPDataFlow) sourceFlowList
									.get(i);
							System.out.println(dataflow.GetEndPoint()
									.eResource().getURI().path());
							System.out.println(compAct.eResource().getURI()
									.path());
							IFile file1 = WorkspaceSynchronizer
									.getFile(dataflow.GetEndPoint().eResource());
							IFile file2 = WorkspaceSynchronizer.getFile(compAct
									.eResource());
							if (file1.getProjectRelativePath().toString()
									.contains(
											file2.getParent()
													.getProjectRelativePath()
													.append(compAct.getName())
													.toString())) {
								DestroyElementRequest destroy = new DestroyElementRequest(
										connection.getEditingDomain(),
										dataflow, false);
								cc.add(new ICommandProxy(
										new DestroyElementCommand(destroy)));
							}
						}
						for (int i = 0; i < targetFlowList.size(); i++) {
							EMPDataFlow dataflow = (EMPDataFlow) targetFlowList
									.get(i);
							System.out.println(dataflow.GetStartPoint()
									.eResource().getURI().path());
							System.out.println(compAct.eResource().getURI()
									.path());
							IFile file1 = WorkspaceSynchronizer
									.getFile(dataflow.GetStartPoint()
											.eResource());
							IFile file2 = WorkspaceSynchronizer.getFile(compAct
									.eResource());
							if (file1.getProjectRelativePath().toString()
									.contains(
											file2.getParent()
													.getProjectRelativePath()
													.append(compAct.getName())
													.toString())) {
								DestroyElementRequest destroy = new DestroyElementRequest(
										connection.getEditingDomain(),
										dataflow, false);
								cc.add(new ICommandProxy(
										new DestroyElementCommand(destroy)));
							}
						}
					} else if (obj instanceof EMPClock) {
						List clockFlowList = ((EMPClock) obj).getClockFlows();
						for (int i = 0; i < clockFlowList.size(); i++) {
							EMPClockFlow clockFlow = (EMPClockFlow) clockFlowList
									.get(i);
							IFile file1 = WorkspaceSynchronizer
									.getFile(clockFlow.getActivity()
											.eResource());
							IFile file2 = WorkspaceSynchronizer.getFile(compAct
									.eResource());
							if (file1.getProjectRelativePath().toString()
									.contains(
											file2.getParent()
													.getProjectRelativePath()
													.append(compAct.getName())
													.toString())) {
								DestroyElementRequest destroy = new DestroyElementRequest(
										connection.getEditingDomain(),
										clockFlow, false);
								cc.add(new ICommandProxy(
										new DestroyElementCommand(destroy)));
							}
						}

					}

					IFile file = WorkspaceSynchronizer.getFile(compAct
							.eResource());
					IPath subPath = file.getParent().getProjectRelativePath()
							.append(compAct.getName());
					IFolder folder = file.getProject().getFolder(subPath);
					if (folder.exists()) {
						List list = new ArrayList();//deleteNotationView(xmi_id, folder);
						getViewElementToDestory(id, folder, list, connection
								.getEditingDomain().getResourceSet());
						for (int i = 0; i < list.size(); i++) {
							EObject eo = (EObject) list.get(i);
							DestroyElementRequest destroy = new DestroyElementRequest(
									connection.getEditingDomain(), eo, false);
							cc.add(new ICommandProxy(new DestroyElementCommand(
									destroy)));
						}
					}

					connection.getDiagramEditDomain().getDiagramCommandStack()
							.execute(cc);
					//save 
					IWorkbenchWindow window = newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin
							.getInstance().getWorkbench()
							.getActiveWorkbenchWindow();
					IWorkbenchPage activePage = window.getActivePage();
					DiagramDocumentEditor document = (DiagramDocumentEditor) activePage
							.getActiveEditor();
					document.doSave(new NullProgressMonitor());

				}
				return super.getElementToDestroy();
			}

			private void getViewElementToDestory(String id, IFolder folder,
					List list, ResourceSet resourceSet) {
				try {
					IResource resources[] = folder.members();
					for (int i = 0; i < resources.length; i++) {
						IResource file = resources[i];
						if (file instanceof IFolder)
							getViewElementToDestory(id, (IFolder) file, list,
									resourceSet);
						else if ((file instanceof IFile)
								&& file.getName().endsWith(".process_diagram")) {
							URI fileURI = URI.createFileURI(file.getLocation()
									.toString());
							Resource resource = resourceSet.getResource(
									fileURI, true);
							Diagram diagram = (Diagram) resource.getContents()
									.get(1);
							List nodeList = diagram.getChildren();

							for (int j = 0; j < nodeList.size(); j++) {
								NodeImpl node = (NodeImpl) nodeList.get(j);
								if (node.getElement() instanceof EMPObject)
									if (id.equals(((EMPObject) node
											.getElement()).getId()))
										list.add(node);
							}
							List edgeList = diagram.getEdges();
							for (int k = 0; k < edgeList.size(); k++) {
								Edge edge = (Edge) edgeList.get(k);
								if ((edge.getSource().getElement() instanceof EMPObject)
										&& (edge.getTarget().getElement() instanceof EMPObject)) {
									EMPObject source = (EMPObject) edge
											.getSource().getElement();
									EMPObject target = (EMPObject) edge
											.getTarget().getElement();
									if (id.equals(source.getId())
											|| id.equals(target.getId()))
										list.add(edge);
								}
							}

						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}
}
