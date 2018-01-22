package newpmbe.rcp.dialogs;

import newpmbe.rcp.NewPmbePlugin;
import newpmbe.rcp.viewers.common.filtermanager.OrganizationFilter;
import newpmbe.rcp.viewers.common.filtermanager.ProcessFilter;
import newpmbe.rcp.viewers.common.filtermanager.ResourceFilter;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class OpenModelDialog extends TitleAreaDialog {
	private CCombo combo;
	private CheckboxTableViewer checkboxTableViewer;
	
	private Object[] projectList;
	private boolean preCloseNeeded;
	/**
	 * Create the dialog
	 * @param parentShell
	 */
	public OpenModelDialog(Shell parentShell) {
		super(parentShell);
		preCloseNeeded = false;
		projectList = null;
	}

	/**
	 * Create contents of the dialog
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		// TODO 自动生成方法存根
	      Composite container = new Composite(parent, SWT.BORDER);
	      container.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
	      container.setLayout(new FormLayout());

	      checkboxTableViewer =
	         CheckboxTableViewer.newCheckList(container, SWT.BORDER);

	      final Table table = checkboxTableViewer.getTable();
	      final FormData formData = new FormData();
	      formData.right = new FormAttachment(100, -34);
	      formData.left = new FormAttachment(100, -404);
	      formData.top = new FormAttachment(0, 65);
	      formData.bottom = new FormAttachment(0, 246);
	      table.setLayoutData(formData);
	      table.setHeaderVisible(true);
	      checkboxTableViewer.setContentProvider(
	 	         new ProjectContentProvider());
	 	      checkboxTableViewer.setLabelProvider(
	 	         new ProjectLabelProvider());
	      final TableColumn tableColumn =
	         new TableColumn(table, SWT.NONE);
	      tableColumn.setWidth(148);
	      tableColumn.setText("工程列表");
	      final TableColumn pathColumn =
		         new TableColumn(table, SWT.NONE);
	      pathColumn.setWidth(218);
	      pathColumn.setText("工程路径");
//		      tableColumn.setWidth(131);
//		      tableColumn.setText("工程路径");
		      checkboxTableViewer.setInput(ResourcesPlugin.getWorkspace().getRoot());
//	      checkboxTableViewer.setInput(ResourcesPlugin.getWorkspace().getRoot());

	      final Label label = new Label(container, SWT.NONE);
	      final FormData fd_label = new FormData();
	      fd_label.top = new FormAttachment(0, 20);
	      fd_label.left = new FormAttachment(table, 0, SWT.LEFT);
	      label.setLayoutData(fd_label);
	      label.setText("选择工程类型:");

	      combo = new CCombo(container, SWT.BORDER);
	      fd_label.right = new FormAttachment(combo, 0, SWT.LEFT);
	      combo.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
	      combo.setEditable(false);
	      combo.add("过程模型");
	      combo.add("组织模型");
	      combo.add("资源模型");
	      combo.add("所有模型");
	      combo.addSelectionListener(new SelectionListener(){

			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				if(checkboxTableViewer.getInput() == null){
					checkboxTableViewer.setInput(ResourcesPlugin.getWorkspace().getRoot());
				}
				switch(combo.getSelectionIndex()){

				case 0:
					checkboxTableViewer.setFilters(new ViewerFilter[]{new ProcessFilter()});
					break;
				case 1:
					checkboxTableViewer.setFilters(new ViewerFilter[]{new OrganizationFilter()});
					break;
				case 2:
					checkboxTableViewer.setFilters(new ViewerFilter[]{new ResourceFilter()});
					break;
				case 3:
					checkboxTableViewer.setFilters(new ViewerFilter[]{});
					break;
					default:
						checkboxTableViewer.setFilters(new ViewerFilter[]{});
				}
			}
	    	  
	      });
	      final FormData fd_combo = new FormData();
	      fd_combo.bottom = new FormAttachment(0, 36);
	      fd_combo.top = new FormAttachment(0, 16);
	      fd_combo.right = new FormAttachment(0, 215);
	      fd_combo.left = new FormAttachment(0, 120);
	      combo.setLayoutData(fd_combo);

	      final Button button = new Button(container, SWT.CHECK);
	      final FormData fd_button = new FormData();
	      fd_button.bottom = new FormAttachment(0, 34);
	      fd_button.top = new FormAttachment(0, 18);
	      fd_button.left = new FormAttachment(0, 235);
	      button.setLayoutData(fd_button);
	      button.setText("关闭现有已打开工程");
	      button.setSelection(false);
	      button.addSelectionListener(new SelectionListener(){

			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void widgetSelected(SelectionEvent e) {
				preCloseNeeded = button.getSelection();
			}
	    	  
	      });
	      
	      
	      setTitle("打开指定的工程");
	      setMessage("选择想要打开的工程");
	      setTitleImage(NewPmbePlugin.getImageDescriptor("icons/4fun.gif").createImage());
	      return container;
	}

	/**
	 * Create contents of the button bar
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "确定",
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				"取消", false);
	}

	/**
	 * Return the initial size of the dialog
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(452, 416);
	}
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("打开工程");
		newShell.setImage(NewPmbePlugin.getImageDescriptor("icons/diagram.gif").createImage());
	}
	public Object[] getProjectList(){
		return projectList;
		
	}
	public boolean needPreClose(){
		return preCloseNeeded;
	}
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) {
			  Object[] checked = checkboxTableViewer.getCheckedElements();
		      int count = checked.length;
		      projectList = new IProject[count];
		      System.arraycopy(checked, 0, projectList, 0, count);
		}
		super.buttonPressed(buttonId);
	}

}
