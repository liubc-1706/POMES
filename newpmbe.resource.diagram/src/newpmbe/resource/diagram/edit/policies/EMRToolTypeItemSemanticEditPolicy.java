package newpmbe.resource.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;
import newpmbe.resource.diagram.providers.NewPMBEElementTypes;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;
import org.eclipse.jface.dialogs.MessageDialog;

import vpml.resourcepackage.EMRAbstractToolType;
import vpml.resourcepackage.EMRClassificationRelation;
//import vpml.resourcepackage.EMRClassificationRelationship;
import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.EMRToolType;
import vpml.resourcepackage.ResourcepackagePackage;

/**
 * @generated
 */
public class EMRToolTypeItemSemanticEditPolicy extends
		NewPMBEBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getMSLWrapper(new DestroyElementCommand(req) {

			protected EObject getElementToDestroy() {
				View view = (View) getHost().getModel();
				EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
				if (annotation != null) {
					return view;
				}
				return super.getElementToDestroy();
			}

		});
	}

	/**
	 * Modified by Liushunzheng on 19/07/2007
	 * @generated NOT
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (NewPMBEElementTypes.EMRClassificationRelation_4014 == req
				.getElementType()) {
			//<lsz>
			EObject targetObject = req.getTarget();
			//如果要建立的分类关系的目标工具类型，它的分类关系不为空，即目标工具类型已属于某一分类关系
			if (targetObject instanceof EMRToolType) {
				if (((EMRToolType) targetObject).getClassificationRelation() != null)
					{
					//hzg 捕捉鼠标左键的弹起事件？
//					event
//					MessageDialog.openError(null, "操作错误", "一个工具类型只能有一个分类关系");
					return null;
					
					}
			}
			//</lsz>
			return req.getTarget() == null ? null
					: getCreateCompleteIncomingEMRClassificationRelation4014Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEMRClassificationRelation4014Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof EMRAbstractToolType)) {
			return UnexecutableCommand.INSTANCE;
		}
		final EMRDiagram element = (EMRDiagram) getRelationshipContainer(req
				.getSource(), ResourcepackagePackage.eINSTANCE.getEMRDiagram(),
				req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(ResourcepackagePackage.eINSTANCE
					.getEMRDiagram_ClassificationRelations());
		}
		return getMSLWrapper(new CreateIncomingEMRClassificationRelation4014Command(
				req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEMRClassificationRelation4014Command
			extends CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEMRClassificationRelation4014Command(
				CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return ResourcepackagePackage.eINSTANCE.getEMRDiagram();
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
			EMRClassificationRelation newElement = (EMRClassificationRelation) super
					.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setToolType((EMRToolType) getTarget());
				newElement
						.setSourceAbsToolType((EMRAbstractToolType) getSource());
			}
			return newElement;
		}
	}
}
