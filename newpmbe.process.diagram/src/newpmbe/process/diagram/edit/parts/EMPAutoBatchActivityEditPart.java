package newpmbe.process.diagram.edit.parts;

import org.eclipse.draw2d.Label;
import java.util.Iterator;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;

import newpmbe.process.diagram.edit.policies.EMPAutoBatchActivityItemSemanticEditPolicy;

import newpmbe.process.diagram.edit.policies.NewPMBEExtNodeLabelHostLayoutEditPolicy;

import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;
import newpmbe.process.diagram.part.NewPMBEVisualIDRegistry;
//import newpmbe.resource.diagram.part.NewPMBEDiagramEditorPlugin;

import newpmbe.process.diagram.providers.NewPMBEElementTypes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.transaction.RunnableWithResult;

import org.eclipse.gef.AccessibleEditPart;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.PrecisionPoint;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.LabelDirectEditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;

import org.eclipse.gef.requests.DirectEditRequest;

import org.eclipse.gef.tools.DirectEditManager;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;

import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;

import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;

import org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager;

import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;

import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;

import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

import org.eclipse.jface.text.contentassist.IContentAssistProcessor;

import org.eclipse.jface.viewers.ICellEditorValidator;

import org.eclipse.swt.SWT;

import org.eclipse.swt.accessibility.AccessibleEvent;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;

import org.eclipse.gef.commands.Command;

import org.eclipse.gef.editparts.LayerManager;

import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;

import org.eclipse.gef.requests.CreateRequest;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;

import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.render.RenderedImage;
import org.eclipse.gmf.runtime.draw2d.ui.render.factory.RenderedImageFactory;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;

import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.SlidableImageAnchor;
import org.eclipse.gmf.runtime.gef.ui.figures.WrapperNodeFigure;

import org.eclipse.gmf.runtime.notation.View;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import newpmbe.process.diagram.edit.policies.NewPMBETextSelectionEditPolicy;

/**
 * @generated
 */
public class EMPAutoBatchActivityEditPart extends ShapeNodeEditPart implements Editable{

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2048;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public EMPAutoBatchActivityEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EMPAutoBatchActivityItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		//禁用PopupBar
		removeEditPolicy(EditPolicyRoles.POPUPBAR_ROLE);
		//禁用ConnectionHandler
		removeEditPolicy(EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected void decorateChild(EditPart child) {
				if (isExternalLabel(child)) {
					return;
				}
				super.decorateChild(child);
			}

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		NewPMBEExtNodeLabelHostLayoutEditPolicy xlep = new NewPMBEExtNodeLabelHostLayoutEditPolicy() {

			protected boolean isExternalLabel(EditPart editPart) {
				return EMPAutoBatchActivityEditPart.this
						.isExternalLabel(editPart);
			}
		};
		xlep.setRealLayoutEditPolicy(lep);
		return xlep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		BasicRectangle figure = new BasicRectangle();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public BasicRectangle getPrimaryShape() {
		return (BasicRectangle) primaryShape;
	}

	/**
	 * added by dzh
	 */
	private static final String TRANSLATE_PATH_ARGUMENT = "$nl$"; //$NON-NLS-1$

	public static IPath path = new Path(TRANSLATE_PATH_ARGUMENT).append("icons"
			+ IPath.SEPARATOR + "EMPClock.SVG");

	/**
	 * @generated NOT
	 * altered by dzh
	 */
	private String icons;
	private String iconsPath;
	
	protected NodeFigure createNodePlate() {
		/*
		 * DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode()
		 * .DPtoLP(40), getMapMode().DPtoLP(40));
		 */
		//URL presenterURL = null;
		try {
			Scanner in = new Scanner(new File("icons.dat"));			
			icons = in.nextLine();
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//确定图标的路径
		if(icons.equals("icons1"))
			iconsPath = "icons/icons1/EMPAutoBatchActivity.svg";
		if(icons.equals("icons2"))
			iconsPath = "icons/icons2/EMPAutoBatchActivity.svg";
		if(icons.equals("icons3"))
			iconsPath = "icons/icons3/EMPAutoBatchActivity.svg";
		URL presenterURL = FileLocator.find(NewPMBEDiagramEditorPlugin
				.getInstance().getBundle(), new Path(
				iconsPath), null);

		//		presenterURL = FileLocator.find(NewPMBEDiagramEditorPlugin
		//				.getInstance().getBundle(), "icons/EMPClock.SVG", null);

		RenderedImage rndImg = RenderedImageFactory.getInstance(presenterURL);
		final ScalableImageFigure sif = new ScalableImageFigure(rndImg, false,
				false, true);
		sif.setPreferredImageSize(70, 50);
		NodeFigure figure = new WrapperNodeFigure(sif) {

			protected ConnectionAnchor createDefaultAnchor() {
				return new SlidableImageAnchor(this, sif);
			}

			protected ConnectionAnchor createAnchor(PrecisionPoint p) {
				if (p == null)
					// If the old terminal for the connection anchor cannot be
					// resolved (by SlidableAnchor) a null
					// PrecisionPoint will passed in - this is handled here
					return createDefaultAnchor();
				return new SlidableImageAnchor(this, sif, p);
			}
		};

		return figure;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(NewPMBEVisualIDRegistry
				.getType(EMPAutoBatchActivityNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	protected boolean isExternalLabel(EditPart childEditPart) {
		if (childEditPart instanceof EMPAutoBatchActivityNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected IFigure getExternalLabelsContainer() {
		LayerManager root = (LayerManager) getRoot();
		return root.getLayer(NewPMBEEditPartFactory.EXTERNAL_NODE_LABELS_LAYER);
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (isExternalLabel(childEditPart)) {
			IFigure labelFigure = ((GraphicalEditPart) childEditPart)
					.getFigure();
			getExternalLabelsContainer().add(labelFigure);
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (isExternalLabel(childEditPart)) {
			IFigure labelFigure = ((GraphicalEditPart) childEditPart)
					.getFigure();
			getExternalLabelsContainer().remove(labelFigure);
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	public void removeNotify() {
		for (Iterator it = getChildren().iterator(); it.hasNext();) {
			EditPart childEditPart = (EditPart) it.next();
			if (isExternalLabel(childEditPart)) {
				IFigure labelFigure = ((GraphicalEditPart) childEditPart)
						.getFigure();
				getExternalLabelsContainer().remove(labelFigure);
			}
		}
		super.removeNotify();
	}

	/**
	 * @generated
	 */
	public class BasicRectangle extends org.eclipse.draw2d.RectangleFigure {
		/**
		 * @generated
		 */
		public BasicRectangle() {
			this.setFill(false);
			this.setFillXOR(false);
			this.setOutline(false);
			this.setOutlineXOR(false);
			this.setLineWidth(1);
			this.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

	}

}
