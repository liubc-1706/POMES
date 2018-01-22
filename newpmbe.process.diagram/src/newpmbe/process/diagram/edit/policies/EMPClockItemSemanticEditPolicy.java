package newpmbe.process.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;

import newpmbe.process.diagram.providers.NewPMBEElementTypes;

/**
 * @generated
 */
public class EMPClockItemSemanticEditPolicy extends
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
		if (!path1.equals(path2)) { //判断被选中的元素是不是引用元素
			MessageDialog.openError(null, "操作错误", "不能删除顶层自动生成对象");
			return UnexecutableCommand.INSTANCE;
		} else
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
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (NewPMBEElementTypes.EMPClockFlow_4001 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEMPClockFlow4001Command(req)
					: null;
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEMPClockFlow4001Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}
}
