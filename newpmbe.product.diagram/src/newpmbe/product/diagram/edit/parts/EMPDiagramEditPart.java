package newpmbe.product.diagram.edit.parts;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import newpmbe.product.diagram.part.NewPMBEDiagramEditorPlugin;
import newpmbe.product.diagram.part.NewPMBEVisualIDRegistry;

import newpmbe.product.diagram.view.factories.DomainElementInitializer;
import newpmbe.product.diagram.view.factories.EMPArtifactViewFactory;
import newpmbe.product.diagram.view.factories.EMPDocumentViewFactory;
import newpmbe.product.diagram.view.factories.EMPMessageViewFactory;
import newpmbe.product.diagram.view.factories.EMPOtherViewFactory;
import newpmbe.product.diagram.view.factories.EMPProductPackageViewFactory;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.command.CompoundCommand;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CopyCommand;
import org.eclipse.emf.edit.command.RemoveCommand;

import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import org.eclipse.emf.transaction.util.TransactionUtil;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.TreeEditPart;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import org.eclipse.gef.editpolicies.RootComponentEditPolicy;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;

import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;

import vpml.processpackage.EMPArtifact;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPDocument;
import vpml.processpackage.EMPMessage;
import vpml.processpackage.EMPOther;
import vpml.processpackage.EMPProductPackage;
import vpml.processpackage.ProcesspackageFactory;
import vpml.processpackage.ProcesspackagePackage;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import newpmbe.product.diagram.edit.policies.EMPDiagramCanonicalEditPolicy;
import newpmbe.product.diagram.edit.policies.EMPDiagramItemSemanticEditPolicy;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;

/**
 * @generated
 */
public class EMPDiagramEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public static final String MODEL_ID = "newproduct"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public EMPDiagramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EMPDiagramItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new EMPDiagramCanonicalEditPolicy());
		//½ûÓÃPopupBar
		removeEditPolicy(EditPolicyRoles.POPUPBAR_ROLE);
		//½ûÓÃConnectionHandler
		removeEditPolicy(EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}
}
