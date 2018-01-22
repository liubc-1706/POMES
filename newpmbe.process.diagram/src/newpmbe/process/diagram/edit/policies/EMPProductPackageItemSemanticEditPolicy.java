package newpmbe.process.diagram.edit.policies;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;

import newpmbe.process.diagram.part.NewPMBEDiagramEditor;
import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;
import newpmbe.process.diagram.providers.NewPMBEElementTypes;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;

import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.part.FileEditorInput;

import vpml.processpackage.EMPActivity;
import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPOutAnd;
import vpml.processpackage.EMPOutOr;
import vpml.processpackage.EMPProduct;
import vpml.processpackage.EMPProductPackage;
import vpml.processpackage.ProcesspackagePackage;

import vpml.resourcepackage.EMRToolType;

/**
 * @generated
 */
public class EMPProductPackageItemSemanticEditPolicy extends
		NewPMBEBaseItemSemanticEditPolicy {

	/**
	 * @generated NOT
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		String path1 = this.getSemanticElement().eResource().getURI().path();
		String path2 = ((View) this.getHost().getModel()).getDiagram()
				.getElement().eResource().getURI().path();
		System.out.println(path1);
		System.out.println(path2);
		if (!path1.equals(path2)) { //�жϱ�ѡ�е�Ԫ���ǲ�������Ԫ��
			MessageDialog.openError(null, "��������", "����ɾ�������Զ����ɶ���");
			return UnexecutableCommand.INSTANCE;
		} else
			return getMSLWrapper(new DestroyElementCommand(req) {

				protected EObject getElementToDestroy() {
					View view = (View) getHost().getModel();

					//---- delete sub-folder for productpackage first
					EMPProductPackage prp = (EMPProductPackage) view
							.getElement();

					if (prp.getName() != null) {
						IFile file = WorkspaceSynchronizer.getFile(view
								.getElement().eResource());
						IContainer subFolder = file.getProject().getFolder(
								file.getParent().getProjectRelativePath()
										.append(prp.getName()));
						if (subFolder.exists()) {
							try {
								closeEditors(subFolder);
								subFolder.delete(true, null);
							} catch (CoreException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					//---- delete ended

					EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
					if (annotation != null) {
						return view;
					}
					return super.getElementToDestroy();
				}

				/**
				 * �ر��Ѿ��򿪵���ϲ�Ʒ��ͼ
				 * @param folder
				 */
				public void closeEditors(IContainer folder) {
					ArrayList<IFile> list = findAllSubFiles(folder);
					for (int i = 0; i < list.size(); i++) {
						DiagramDocumentEditor editor = (DiagramDocumentEditor) getActivePage()
								.findEditor(new FileEditorInput(list.get(i)));
						//�༭�����ڴ�״̬
						if (editor != null) {
							//�رձ༭��
							editor.close(false);
						}
					}
				}

				private IWorkbenchPage getActivePage() {
					IWorkbenchWindow window = NewPMBEDiagramEditorPlugin
							.getInstance().getWorkbench()
							.getActiveWorkbenchWindow();
					IWorkbenchPage activePage = window.getActivePage();
					return activePage;
				}

				/**
				 * �ݹ��������λ�ڵ�ǰ����Ŀ¼�µ�.product_diagram�ļ�������������Щ�ļ����б���
				 * @param folder
				 * @return ��¼.process_diagram�ļ����б�
				 */
				public ArrayList<IFile> findAllSubFiles(IContainer folder) {
					ArrayList<IFile> list = new ArrayList<IFile>();
					try {
						IResource[] resources = folder.members();
						for (int i = 0; i < resources.length; i++) {
							if (resources[i] instanceof IContainer) {
								IContainer container = (IContainer) resources[i];
								ArrayList<IFile> fileLists = findAllSubFiles(container);
								list.addAll(fileLists);
							} else if (resources[i] instanceof IFile) {
								IFile file = (IFile) resources[i];
								if (file.getFileExtension().equals(
										"product_diagram"))
									list.add(file);
							}
						}
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return list;
				}
			});
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (NewPMBEElementTypes.EMPAssFlow_4003 == req.getElementType()) {
			return req.getTarget() == null ? null
					: getCreateCompleteIncomingEMPAssFlow4003Command(req);
		}
		if (NewPMBEElementTypes.EMPRefFlow_4004 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPRefFlow4004Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPDataFlow_4002 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPDataFlow4002Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPDataFlow_4005 == req.getElementType()) {
			return req.getTarget() == null ? null
					: getCreateCompleteIncomingEMPDataFlow4005Command(req);
		}
		if (NewPMBEElementTypes.EMPDataFlow_4016 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPDataFlow4016Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPDataFlow_4017 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPDataFlow4017Command(req)
					: null;
		}
		if (NewPMBEElementTypes.EMPDataFlow_4022 == req.getElementType()) {
			return req.getTarget() == null ? null
					: getCreateCompleteIncomingEMPDataFlow4022Command(req);
		}
		if (NewPMBEElementTypes.EMPDataFlow_4023 == req.getElementType()) {
			return req.getTarget() == null ? null
					: getCreateCompleteIncomingEMPDataFlow4023Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPDataFlow4002Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMPDataFlow4005Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof EMPActivity)) {
			return UnexecutableCommand.INSTANCE;
		}
		final EMPDiagram element = (EMPDiagram) getRelationshipContainer(req
				.getSource(), ProcesspackagePackage.eINSTANCE.getEMPDiagram(),
				req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
					.getEMPDiagram_DataFlows());
		}
		return getMSLWrapper(new CreateIncomingEMPDataFlow4005Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMPDataFlow4005Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMPDataFlow4005Command(
				CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return ProcesspackagePackage.eINSTANCE.getEMPDiagram();
		};

		/**
		 * @generated
		 */
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			EMPDataFlow newElement = (EMPDataFlow) super
					.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setTargetProduct((EMPProduct) getTarget());
				newElement.setSourceActivity((EMPActivity) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPDataFlow4016Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPDataFlow4017Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMPDataFlow4022Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof EMPOutAnd)) {
			return UnexecutableCommand.INSTANCE;
		}
		final EMPDiagram element = (EMPDiagram) getRelationshipContainer(req
				.getSource(), ProcesspackagePackage.eINSTANCE.getEMPDiagram(),
				req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
					.getEMPDiagram_DataFlows());
		}
		return getMSLWrapper(new CreateIncomingEMPDataFlow4022Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMPDataFlow4022Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMPDataFlow4022Command(
				CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return ProcesspackagePackage.eINSTANCE.getEMPDiagram();
		};

		/**
		 * @generated
		 */
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			EMPDataFlow newElement = (EMPDataFlow) super
					.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setTargetProduct((EMPProduct) getTarget());
				newElement.setSourceOutAnd((EMPOutAnd) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMPDataFlow4023Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof EMPOutOr)) {
			return UnexecutableCommand.INSTANCE;
		}
		final EMPDiagram element = (EMPDiagram) getRelationshipContainer(req
				.getSource(), ProcesspackagePackage.eINSTANCE.getEMPDiagram(),
				req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
					.getEMPDiagram_DataFlows());
		}
		return getMSLWrapper(new CreateIncomingEMPDataFlow4023Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMPDataFlow4023Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMPDataFlow4023Command(
				CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return ProcesspackagePackage.eINSTANCE.getEMPDiagram();
		};

		/**
		 * @generated
		 */
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			EMPDataFlow newElement = (EMPDataFlow) super
					.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setTargetProduct((EMPProduct) getTarget());
				newElement.setSourceOutOr((EMPOutOr) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMPAssFlow4003Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof EMRToolType)) {
			return UnexecutableCommand.INSTANCE;
		}
		final EMPDiagram element = (EMPDiagram) getRelationshipContainer(req
				.getSource(), ProcesspackagePackage.eINSTANCE.getEMPDiagram(),
				req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(ProcesspackagePackage.eINSTANCE
					.getEMPDiagram_AssFlows());
		}
		return getMSLWrapper(new CreateIncomingEMPAssFlow4003Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMPAssFlow4003Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMPAssFlow4003Command(CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return ProcesspackagePackage.eINSTANCE.getEMPDiagram();
		};

		/**
		 * @generated
		 */
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			EMPAssFlow newElement = (EMPAssFlow) super
					.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setProduct((EMPProduct) getTarget());
				newElement.setToolType((EMRToolType) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPRefFlow4004Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

}
