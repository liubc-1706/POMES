package newpmbe.rcp.views.Navigator;

import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ReadOnlyStateChecker;
import org.eclipse.ui.actions.SelectionListenerAction;
import org.eclipse.ui.ide.undo.DeleteResourcesOperation;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;

/**
 * Standard action for deleting the currently selected resources.
 * <p>
 * This class may be instantiated; it is not intended to be subclassed.
 * </p>
 */
public class DeleteResourceAction extends SelectionListenerAction {

	static class DeleteProjectDialog extends MessageDialog {

		private IResource[] projects;

		private boolean deleteContent = false;

		/**
		 * Control testing mode. In testing mode, it returns true to delete
		 * contents and does not pop up the dialog.
		 */
		private boolean fIsTesting = false;

		private Button radio1;

//		private Button radio2;

		DeleteProjectDialog(Shell parentShell, IResource[] projects) {
			super(parentShell, getTitle(projects), null, // accept the
					// default window
					// icon
					getMessage(projects), MessageDialog.QUESTION, new String[] {
							"ȷ��",
							"ȡ��" }, 0); // yes is the
			// default
			this.projects = projects;
		}

		static String getTitle(IResource[] projects) {
			if (projects.length == 1) {
				return "ȷ�Ϲ���ɾ��";
			}
			return "ȷ�϶������ɾ��";
		}

		static String getMessage(IResource[] projects) {
			if (projects.length == 1) {
				IProject project = (IProject) projects[0];
				return NLS
						.bind(
								"��ȷ��ɾ������ ''{0}''��?",
								project.getName());
			}
			return NLS.bind(
					"��ȷ��ɾ������{0}��?",
					new Integer(projects.length));
		}

		/*
		 * (non-Javadoc) Method declared on Window.
		 */
		protected void configureShell(Shell newShell) {
			super.configureShell(newShell);
		}

		protected Control createCustomArea(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			composite.setLayout(new GridLayout());
			radio1 = new Button(composite, SWT.RADIO);
			radio1.addSelectionListener(selectionListener);
			String text1;
			if (projects.length == 1) {
				IProject project = (IProject) projects[0];
				if (project == null || project.getLocation() == null) {
					text1 = "ͬʱɾ���ļ�ϵͳ�е���Դ";
				} else {
					text1 = NLS
							.bind(
									"ͬʱɾ��''{0}''�������Դ",
									project.getLocation().toOSString());
				}
			} else {
				text1 = "ͬʱɾ���ļ�ϵͳ�е���Դ";
			}
			radio1.setText(text1);
			radio1.setFont(parent.getFont());

//			radio2 = new Button(composite, SWT.RADIO);
//			radio2.addSelectionListener(selectionListener);
//			String text2 = "��Ҫɾ����Դ";
//			radio2.setText(text2);
//			radio2.setFont(parent.getFont());
//
//			// set initial state
//			radio1.setSelection(deleteContent);
//			radio2.setSelection(!deleteContent);

			return composite;
		}

		private SelectionListener selectionListener = new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				Button button = (Button) e.widget;
				if (button.getSelection()) {
					deleteContent = (button == radio1);
				}
			}
		};

		boolean getDeleteContent() {
			return deleteContent;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.jface.window.Window#open()
		 */
		public int open() {
			// Override Window#open() to allow for non-interactive testing.
			if (fIsTesting) {
				deleteContent = true;
				return Window.OK;
			}
			return super.open();
		}

		/**
		 * Set this delete dialog into testing mode. It won't pop up, and it
		 * returns true for deleteContent.
		 * 
		 * @param t
		 *            the testing mode
		 */
		void setTestingMode(boolean t) {
			fIsTesting = t;
		}
	}

	/**
	 * The id of this action.
	 */
	public static final String ID = PlatformUI.PLUGIN_ID
			+ ".DeleteResourceAction";//$NON-NLS-1$

	/**
	 * The shell in which to show any dialogs.
	 */
	private Shell shell;

	/**
	 * Whether or not we are deleting content for projects.
	 */
	private boolean deleteContent = false;

	/**
	 * Flag that allows testing mode ... it won't pop up the project delete
	 * dialog, and will return "delete all content".
	 */
	protected boolean fTestingMode = false;

	private String[] modelProviderIds;

	/**
	 * Creates a new delete resource action.
	 * 
	 * @param shell
	 *            the shell for any dialogs
	 */
	public DeleteResourceAction(Shell shell) {
		super("ɾ��");
		setToolTipText("ɾ��");
		setId(ID);
		if (shell == null) {
			throw new IllegalArgumentException();
		}
		this.shell = shell;
	}

	/**
	 * Returns whether delete can be performed on the current selection.
	 * 
	 * @param resources
	 *            the selected resources
	 * @return <code>true</code> if the resources can be deleted, and
	 *         <code>false</code> if the selection contains non-resources or
	 *         phantom resources
	 */
	private boolean canDelete(IResource[] resources) {
		// allow only projects or only non-projects to be selected;
		// note that the selection may contain multiple types of resource
		if (!(containsOnlyProjects(resources) || containsOnlyNonProjects(resources))) {
			return false;
		}

		if (resources.length == 0) {
			return false;
		}
		// Return true if everything in the selection exists.
		for (int i = 0; i < resources.length; i++) {
			IResource resource = resources[i];
			if (resource.isPhantom()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns whether the selection contains linked resources.
	 * 
	 * @param resources
	 *            the selected resources
	 * @return <code>true</code> if the resources contain linked resources,
	 *         and <code>false</code> otherwise
	 */
	private boolean containsLinkedResource(IResource[] resources) {
		for (int i = 0; i < resources.length; i++) {
			IResource resource = resources[i];
			if (resource.isLinked()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns whether the selection contains only non-projects.
	 * 
	 * @param resources
	 *            the selected resources
	 * @return <code>true</code> if the resources contains only non-projects,
	 *         and <code>false</code> otherwise
	 */
	private boolean containsOnlyNonProjects(IResource[] resources) {
		int types = getSelectedResourceTypes(resources);
		// check for empty selection
		if (types == 0) {
			return false;
		}
		// note that the selection may contain multiple types of resource
		return (types & IResource.PROJECT) == 0;
	}

	/**
	 * Returns whether the selection contains only projects.
	 * 
	 * @param resources
	 *            the selected resources
	 * @return <code>true</code> if the resources contains only projects, and
	 *         <code>false</code> otherwise
	 */
	private boolean containsOnlyProjects(IResource[] resources) {
		int types = getSelectedResourceTypes(resources);
		// note that the selection may contain multiple types of resource
		return types == IResource.PROJECT;
	}

	/**
	 * Asks the user to confirm a delete operation.
	 * 
	 * @param resources
	 *            the selected resources
	 * @return <code>true</code> if the user says to go ahead, and
	 *         <code>false</code> if the deletion should be abandoned
	 */
	private boolean confirmDelete(IResource[] resources) {
		if (containsOnlyProjects(resources)) {
			return confirmDeleteProjects(resources);
		}
		return confirmDeleteNonProjects(resources);
		
	}

	/**
	 * Asks the user to confirm a delete operation, where the selection contains
	 * no projects.
	 * 
	 * @param resources
	 *            the selected resources
	 * @return <code>true</code> if the user says to go ahead, and
	 *         <code>false</code> if the deletion should be abandoned
	 */
	private boolean confirmDeleteNonProjects(IResource[] resources) {
		String title;
		String msg;
		if (resources.length == 1) {
			title = "ȷ�Ϲ���ɾ��";
			IResource resource = resources[0];
			if (resource.isLinked()) {
				msg = NLS
						.bind(
								"��ȷ������ɾ�����ӵ���Դ ''{0}''��?\nֻ�й����ռ��е����ӻᱻɾ�������ӵ�Ŀ����Դ�����ֲ��䡣",
								resource.getName());
			} else {
				msg = NLS.bind(
						"��ȷ���������ļ�ϵͳ��ɾ��''{0}''��",
						resource.getName());
			}
		} else {
			title = "ȷ�϶������ɾ��";
			if (containsLinkedResource(resources)) {
				msg = NLS
						.bind("ȷ��ɾ����{0} ��������\n\nѡ���а������ӵ���Դ��\nֻ�й����ռ��е����ӻᱻɾ�������ӵ�Ŀ����Դ�����ֲ��䡣",
								new Integer(resources.length));
			} else {
				msg = NLS.bind(
						"ȷ�����ļ�ϵͳ��ɾ���� {0}����Դ��",
						new Integer(resources.length));
			}
		}
		return MessageDialog.openQuestion(shell, title, msg);
	}

	/**
	 * Asks the user to confirm a delete operation, where the selection contains
	 * only projects. Also remembers whether project content should be deleted.
	 * 
	 * @param resources
	 *            the selected resources
	 * @return <code>true</code> if the user says to go ahead, and
	 *         <code>false</code> if the deletion should be abandoned
	 */
	private boolean confirmDeleteProjects(IResource[] resources) {
		DeleteProjectDialog dialog = new DeleteProjectDialog(shell, resources);
		dialog.setTestingMode(fTestingMode);
		int code = dialog.open();
		deleteContent = dialog.getDeleteContent();
		return code == 0; // YES
	}




	/**
	 * Return an array of the currently selected resources.
	 * 
	 * @return the selected resources
	 */
	private IResource[] getSelectedResourcesArray() {
		List selection = getSelectedResources();
		IResource[] resources = new IResource[selection.size()];
		selection.toArray(resources);
		return resources;
	}

	/**
	 * Returns a bit-mask containing the types of resources in the selection.
	 * 
	 * @param resources
	 *            the selected resources
	 */
	private int getSelectedResourceTypes(IResource[] resources) {
		int types = 0;
		for (int i = 0; i < resources.length; i++) {
			types |= resources[i].getType();
		}
		return types;
	}

	/*
	 * (non-Javadoc) Method declared on IAction.
	 */
	public void run() {
		final IResource[] resources = getSelectedResourcesArray();
		// WARNING: do not query the selected resources more than once
		// since the selection may change during the run,
		// e.g. due to window activation when the prompt dialog is dismissed.
		// For more details, see Bug 60606 [Navigator] (data loss) Navigator
		// deletes/moves the wrong file
		if (!confirmDelete(resources)) {
			return;
		}

		Job deletionCheckJob = new Job("�����Դ...") {

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
			 */
			protected IStatus run(IProgressMonitor monitor) {
				IResource[] resourcesToDelete = getResourcesToDelete(resources);

				if (resourcesToDelete.length == 0)
					return Status.CANCEL_STATUS;
				scheduleDeleteJob(resourcesToDelete);
				return Status.OK_STATUS;
			}
			
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.core.runtime.jobs.Job#belongsTo(java.lang.Object)
			 */
			public boolean belongsTo(Object family) {
				if ("ɾ����Դ"
						.equals(family)) {
					return true;
				}
				return super.belongsTo(family);
			}
		};

		deletionCheckJob.schedule();

	}

	/**
	 * Schedule a job to delete the resources to delete.
	 * 
	 * @param resourcesToDelete
	 */
	private void scheduleDeleteJob(final IResource[] resourcesToDelete) {
		// use a non-workspace job with a runnable inside so we can avoid
		// periodic updates
		Job deleteJob = new Job(
				"ɾ����Դ") {
			public IStatus run(IProgressMonitor monitor) {
				try {
					DeleteResourcesOperation op = 
						new DeleteResourcesOperation(resourcesToDelete, "ɾ����Դ", deleteContent);
					op.setModelProviderIds(getModelProviderIds());
					//�رյ�ǰ�����ռ��еı༭��
					
					
					return PlatformUI.getWorkbench().getOperationSupport()
					.getOperationHistory().execute(op, null, 
							WorkspaceUndoUtil.getUIInfoAdapter(shell));
				} catch (ExecutionException e) {
					if (e.getCause() instanceof CoreException) {
						return ((CoreException)e.getCause()).getStatus();
					} 
					return new Status(IStatus.ERROR, "org.eclipse.ui.ide", e.getMessage(),e);
				}
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.core.runtime.jobs.Job#belongsTo(java.lang.Object)
			 */
			public boolean belongsTo(Object family) {
				if ("ɾ����Դ"
						.equals(family)) {
					return true;
				}
				return super.belongsTo(family);
			}

		};
		deleteJob.setUser(true);
		deleteJob.schedule();
	}

	/**
	 * Returns the resources to delete based on the selection and their
	 * read-only status.
	 * 
	 * @param resources
	 *            the selected resources
	 * @return the resources to delete
	 */
	private IResource[] getResourcesToDelete(IResource[] resources) {

		if (containsOnlyProjects(resources) && !deleteContent) {
			// We can just return the selection
			return resources;
		}

		ReadOnlyStateChecker checker = new ReadOnlyStateChecker(this.shell,
				"ȷ����Դɾ��",
				"''{0}''��ֻ����Դ��ȷ��ɾ����");
		checker.setIgnoreLinkedResources(true);
		return checker.checkReadOnlyResources(resources);
	}

	/**
	 * The <code>DeleteResourceAction</code> implementation of this
	 * <code>SelectionListenerAction</code> method disables the action if the
	 * selection contains phantom resources or non-resources
	 */
	protected boolean updateSelection(IStructuredSelection selection) {
		return super.updateSelection(selection)
				&& canDelete(getSelectedResourcesArray());
	}

	/**
	 * Returns the model provider ids that are known to the client that
	 * instantiated this operation.
	 * 
	 * @return the model provider ids that are known to the client that
	 *         instantiated this operation.
	 * @since 3.2
	 */
	public String[] getModelProviderIds() {
		return modelProviderIds;
	}

	/**
	 * Sets the model provider ids that are known to the client that
	 * instantiated this operation. Any potential side effects reported by these
	 * models during validation will be ignored.
	 * 
	 * @param modelProviderIds
	 *            the model providers known to the client who is using this
	 *            operation.
	 * @since 3.2
	 */
	public void setModelProviderIds(String[] modelProviderIds) {
		this.modelProviderIds = modelProviderIds;
	}
}
