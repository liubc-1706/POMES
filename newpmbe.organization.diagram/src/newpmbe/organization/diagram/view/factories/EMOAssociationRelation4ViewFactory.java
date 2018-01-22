package newpmbe.organization.diagram.view.factories;

import java.util.ArrayList;
import java.util.List;

import newpmbe.organization.diagram.edit.parts.EMOAssociationRelationName4EditPart;
import newpmbe.organization.diagram.edit.parts.EMODiagramEditPart;

import newpmbe.organization.diagram.part.NewPMBEVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EcoreFactory;

import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;

import org.eclipse.gmf.runtime.diagram.ui.view.factories.ConnectionViewFactory;

import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EMOAssociationRelation4ViewFactory extends ConnectionViewFactory {

	/**
	 * @generated 
	 */
	protected List createStyles(View view) {
		List styles = new ArrayList();
		styles.add(NotationFactory.eINSTANCE.createRoutingStyle());
		styles.add(NotationFactory.eINSTANCE.createFontStyle());
		return styles;
	}

	/**
	 * @generated
	 */
	protected void decorateView(View containerView, View view,
			IAdaptable semanticAdapter, String semanticHint, int index,
			boolean persisted) {
		if (semanticHint == null) {
			semanticHint = NewPMBEVisualIDRegistry
					.getType(newpmbe.organization.diagram.edit.parts.EMOAssociationRelation4EditPart.VISUAL_ID);
			view.setType(semanticHint);
		}
		super.decorateView(containerView, view, semanticAdapter, semanticHint,
				index, persisted);
		if (!EMODiagramEditPart.MODEL_ID.equals(NewPMBEVisualIDRegistry
				.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation.getDetails().put(
					"modelID", EMODiagramEditPart.MODEL_ID); //$NON-NLS-1$
			view.getEAnnotations().add(shortcutAnnotation);
		}
		getViewService()
				.createNode(
						semanticAdapter,
						view,
						NewPMBEVisualIDRegistry
								.getType(EMOAssociationRelationName4EditPart.VISUAL_ID),
						ViewUtil.APPEND, true, getPreferencesHint());
	}

}
