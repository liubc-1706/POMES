package newpmbe.process.diagram.creationtools;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import newpmbe.process.diagram.coherence.CompFileManager;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import vpml.processpackage.EMPCompActivity;

public class CompActivityCreationTool extends UnspecifiedTypeCreationTool {

	private EMPCompActivity newCompActivity;
	private Node newCompActivityView;
	public CompActivityCreationTool(List elementTypes) {
		super(elementTypes);
		// TODO Auto-generated constructor stub
	}
	protected void performCreation(int button) {
		
		antiScroll = true;
		EditPartViewer viewer = getCurrentViewer();
		Command c = getCurrentCommand();
		executeCurrentCommand();
		Collection obj = DiagramCommandStack.getReturnValues(c);


		for (Iterator i = obj.iterator(); i.hasNext();) {
			Object object = i.next();
			if (object instanceof IAdaptable) {
				Object v = ((IAdaptable) object).getAdapter(View.class);
				if (v != null) {
					Assert.isTrue(v instanceof Node);
					newCompActivityView = (Node)v;
					EObject e = ((View) v).getElement();
					Assert.isTrue(e instanceof EMPCompActivity);
					newCompActivity = (EMPCompActivity)e;
				}
			}
		}
		if(newCompActivity != null){
			CompFileManager compFileManager = CompFileManager.getInstance();
			compFileManager.removeNotificationListener(newCompActivity);
		}
		selectAddedObject(viewer, obj);	
		antiScroll = false;
	}
	/**
	 * If the tool is currently in a drag or drag-in-progress state, it goes into the 
	 * terminal state, performs some cleanup (erasing feedback, unlocking target edit part), 
	 * and then calls {@link #performCreation(int)}.
	 * 
	 * @see org.eclipse.gef.tools.AbstractTool#handleButtonUp(int)
	 */
	protected boolean handleButtonUp(int button) {
		if (stateTransition(STATE_DRAG | STATE_DRAG_IN_PROGRESS, STATE_TERMINAL)) {
			eraseTargetFeedback();
			unlockTargetEditPart();
			performCreation(button);
		}

		setState(STATE_TERMINAL);
		handleFinished();
		//注册监听器，从而监听组合活动名称的改变

		//To be added
		CompFileManager compFileManager = CompFileManager.getInstance();
		if(newCompActivity != null){
			//compFileManager.removeNotificationListener(newCompActivity);
			compFileManager.addNotificationListener(newCompActivity);
		}
		return true;
	}
	
}
