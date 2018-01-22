package newpmbe.rcp.views.Navigator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceRuleFactory;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.MultiRule;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceAction;


/**
 * Standard action for opening the currently selected project(s).
 * <p>
 * Note that there is a different action for opening an editor on file
 * resources: <code>OpenFileAction</code>.
 * </p>
 * <p>
 * This class may be instantiated; it is not intended to be subclassed.
 * </p>
 */
public class OpenResourceAction extends WorkspaceAction implements IResourceChangeListener {

	/**
	 * The id of this action.
	 */
	public static final String ID = PlatformUI.PLUGIN_ID + ".OpenResourceAction"; //$NON-NLS-1$

	/**
	 * Creates a new action.
	 * 
	 * @param shell
	 *            the shell for any dialogs
	 */
	public OpenResourceAction(Shell shell) {
		super(shell, "Op&en Project");
		setToolTipText("Open Project");
		setId(ID);
	}

	/**
	 * Returns the total number of closed projects in the workspace.
	 */
	private int countClosedProjects() {
		int count = 0;
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (int i = 0; i < projects.length; i++) {
			if (!projects[i].isOpen()) {
				count++;
			}
		}
		return count;
	}

	/*
	 * (non-Javadoc) Method declared on WorkspaceAction.
	 */
	protected String getOperationMessage() {
		return "���ڴ򿪹���...";
	}

	/*
	 * (non-Javadoc) Method declared on WorkspaceAction.
	 */
	protected String getProblemsMessage() {
		return "��ѡ��Ĺ���ʱ��������";
	}

	/*
	 * (non-Javadoc) Method declared on WorkspaceAction.
	 */
	protected String getProblemsTitle() {
		return "�򿪳��ֵ�����";
	}

	/**
	 * Returns whether there are closed projects in the workspace that are
	 * not part of the current selection.
	 */
	private boolean hasOtherClosedProjects() {
		//count the closed projects in the selection
		int closedInSelection = 0;
		Iterator resources = getSelectedResources().iterator();
		while (resources.hasNext()) {
			IProject project = (IProject) resources.next();
			if (!project.isOpen())
				closedInSelection++;
		}
		//there are other closed projects if the selection does
		//not contain all closed projects in the workspace
		return closedInSelection < countClosedProjects();
	}

	protected void invokeOperation(IResource resource, IProgressMonitor monitor) throws CoreException {
		((IProject) resource).open(monitor);
	}

	/**
	 * Returns the preference for whether to open required projects when opening
	 * a project. Consults the preference and prompts the user if necessary.
	 * 
	 * @return <code>true</code> if referenced projects should be opened, and
	 *         <code>false</code> otherwise.
	 */
	private boolean promptToOpenWithReferences() {
//		IPreferenceStore store = NewPmbePlugin.getDefault().getPreferenceStore();
//		String key = "OPEN_REQUIRED_PROJECTS";
//		String value = store.getString(key);
//		if (MessageDialogWithToggle.ALWAYS.equals(value)) {
//			return true;
//		}
//		if (MessageDialogWithToggle.NEVER.equals(value)) {
//			return false;
//		}
//		String message = "Should referenced projects also be opened?";
//		MessageDialogWithToggle dialog = MessageDialogWithToggle.openYesNoCancelQuestion(getShell(), IDEWorkbenchMessages.Question, message, null, false, store, key);
//		int result = dialog.getReturnCode();
//		if (result == Window.CANCEL) {
//			throw new OperationCanceledException();
//		}
//		return dialog.getReturnCode() == IDialogConstants.YES_ID;
		return false;
	}

	/**
	 * Handles a resource changed event by updating the enablement if one of the
	 * selected projects is opened or closed.
	 */
	public void resourceChanged(IResourceChangeEvent event) {
		// Warning: code duplicated in CloseResourceAction
		List sel = getSelectedResources();
		// don't bother looking at delta if selection not applicable
		if (selectionIsOfType(IResource.PROJECT)) {
			IResourceDelta delta = event.getDelta();
			if (delta != null) {
				IResourceDelta[] projDeltas = delta.getAffectedChildren(IResourceDelta.CHANGED);
				for (int i = 0; i < projDeltas.length; ++i) {
					IResourceDelta projDelta = projDeltas[i];
					if ((projDelta.getFlags() & IResourceDelta.OPEN) != 0) {
						if (sel.contains(projDelta.getResource())) {
							selectionChanged(getStructuredSelection());
							return;
						}
					}
				}
			}
		}
	}

	/*
	 * (non-Javadoc) Method declared on IAction; overrides method on
	 * WorkspaceAction.
	 */
	public void run() {
		try {
			if (hasOtherClosedProjects() && promptToOpenWithReferences()) {
				runOpenWithReferences();
			}
			ISchedulingRule rule = null;
			// be conservative and include all projects in the selection - projects
			// can change state between now and when the job starts
			IResourceRuleFactory factory = ResourcesPlugin.getWorkspace().getRuleFactory();
			Iterator resources = getSelectedResources().iterator();
			while (resources.hasNext()) {
				IProject project = (IProject) resources.next();
				rule = MultiRule.combine(rule, factory.modifyRule(project));
			}
			runInBackground(rule);
		} catch (OperationCanceledException e) {
			//just return when canceled
		}
	}

	/**
	 * Opens the selected projects, and all related projects, in the background.
	 */
	private void runOpenWithReferences() {
		final List resources = new ArrayList(getActionResources());
		Job job = new WorkspaceJob(removeMnemonics(getText())) {

			/**
			 * Opens a project along with all projects it references
			 */
			private void doOpenWithReferences(IProject project, IProgressMonitor monitor) throws CoreException {
				if (!project.exists() || project.isOpen()) {
					return;
				}
				project.open(new SubProgressMonitor(monitor, 1000));
				IProject[] references = project.getReferencedProjects();
				for (int i = 0; i < references.length; i++) {
					doOpenWithReferences(references[i], monitor);
				}
			}

			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				try {
					// at most we can only open all projects currently closed
					monitor.beginTask("", countClosedProjects() * 1000); //$NON-NLS-1$
					monitor.setTaskName(getOperationMessage());
					for (Iterator it = resources.iterator(); it.hasNext();) {
						doOpenWithReferences((IProject) it.next(), monitor);
					}
				} finally {
					monitor.done();
				}
				return Status.OK_STATUS;
			}
		};
		job.setRule(ResourcesPlugin.getWorkspace().getRoot());
		job.setUser(true);
		job.schedule();
	}

	/*
	 * (non-Javadoc) Method declared on WorkspaceAction.
	 */
	protected boolean shouldPerformResourcePruning() {
		return false;
	}

	/**
	 * The <code>OpenResourceAction</code> implementation of this
	 * <code>SelectionListenerAction</code> method ensures that this action is
	 * enabled only if one of the selections is a closed project.
	 */
	protected boolean updateSelection(IStructuredSelection s) {
		// don't call super since we want to enable if closed project is
		// selected.

		if (!selectionIsOfType(IResource.PROJECT)) {
			return false;
		}

		Iterator resources = getSelectedResources().iterator();
		while (resources.hasNext()) {
			IProject currentResource = (IProject) resources.next();
			if (!currentResource.isOpen()) {
				return true;
			}
		}
		return false;
	}
}