package vpml.informationpackage.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;


public class NewInfoModelAction implements IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow window;
	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub
		this.window=window;
	}

	public void run(IAction action) {
		// TODO Auto-generated method stub
		NewInfoModelDialog dlg=new NewInfoModelDialog(window.getShell());
		dlg.open();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}
	
	
	private boolean isProjectExist(String projectName){
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root= workspace.getRoot();
		File workpath=new File(root.getLocation().toString()+"\\workspacePath.properties");
		String pathStr="";
		if(!workpath.exists())
		{pathStr=root.getLocation().toString();}
		else
		{
			try {
				FileInputStream inPut=new FileInputStream(workpath);
				Properties pro=new Properties();
				try {
					pro.load(inPut);
					pathStr=pro.getProperty("path");
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		String path=new String(pathStr+"\\信息模型");
		File file=new File(path);
		File []files=file.listFiles();
		
		//added by zhangpeng
		if(files == null)
			return false;
		//end added by zhangpeng
		
		for(int i=0;i<files.length;i++){
			if(files[i].getName().equals(projectName+".info")){
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * 创建工程名为projectName的信息模型
	 * @param projectName
	 * @throws Exception
	 */
	private void createProject(String projectName)throws Exception{
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root= workspace.getRoot();
		//changed by zhangpeng-projectName增加了后缀
		IProject project= root.getProject(projectName+".info"); //$NON-NLS-1$
		//end changed by zhangpeng
		//changed by luocheng 更改创建路径
		File workpath=new File(root.getLocation().toString()+"\\workspacePath.properties");
		String pathStr="";
		if(!workpath.exists())
		{pathStr=root.getLocation().toString();}
		else
		{
			try {
				FileInputStream inPut=new FileInputStream(workpath);
				Properties pro=new Properties();
				try {
					pro.load(inPut);
					pathStr=pro.getProperty("path");
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		Path path=new Path(pathStr+"\\信息模型\\"+projectName+".info");
		IProjectDescription description=workspace.newProjectDescription(projectName+".info");
		description.setLocation(path);
		project.create(description, null);
		//end by luocheng
	    project.open(null);
	    
	    project.refreshLocal(1, new NullProgressMonitor());
	   //end changed by lp
	}
	
	/**
	 * 创建过程模型的对话框
	 * @author fan
	 *
	 */
	private class NewInfoModelDialog extends Dialog{
		
		private String textValue;
		private Text nameText;
		public NewInfoModelDialog(Shell parentShell){
			super(parentShell);
		}
		
		public String getTextValue(){
			return this.textValue;
		}
		
		public void setTextValue(String string){
			this.textValue=string;
		}
		
		protected Control createDialogArea(Composite parent){
			this.getShell().setText("新建信息模型"); //$NON-NLS-1$
			Composite topComp=new Composite(parent,SWT.NONE);
			topComp.setLayout(null);
			Label label=new Label(topComp,SWT.NONE);
		    label.setBounds(10,30,75,25);
		    //hzg
		    label.setText("信息模型名称");
//		    label.setText(Messages.getString("NewResourceModelAction.5")); //$NON-NLS-1$
		    nameText=new Text(topComp,SWT.BORDER);
		    nameText.setText(textValue==null?"":textValue); //$NON-NLS-1$
		    nameText.setBounds(90,30,170,20);
		    
		    return topComp;
			
		}

		@Override
		protected void initializeBounds() {
			// TODO Auto-generated method stub
			super.createButton((Composite)getButtonBar(),IDialogConstants.OK_ID, "确定", false); //$NON-NLS-1$
			super.createButton((Composite)getButtonBar(), IDialogConstants.CANCEL_ID, "取消", false); //$NON-NLS-1$
			super.initializeBounds();
		}

		@Override
		protected Button createButton(Composite parent, int id, String label,
				boolean defaultButton) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		protected Point getInitialSize() {
			// TODO Auto-generated method stub
			Point p=super.getInitialSize();
			p.x=280;
			p.y=140;
			return p;
		}

		@Override
		protected void buttonPressed(int buttonId) {
			// TODO Auto-generated method stub
			//super.buttonPressed(buttonId);
			if(buttonId==IDialogConstants.OK_ID){
				this.textValue=nameText.getText();
				String modelName=nameText.getText();
				if(modelName!=null&&modelName.length()!=0){
					if(!isProjectExist(modelName)){
						try{
							createProject(modelName);
						}catch(Exception ex){
							MessageDialog.openError(getShell(), "..", ".."); //$NON-NLS-1$ //$NON-NLS-2$
						}
						this.close();
					}
					else{
						MessageDialog.openError(getShell(),"...", "..."); //$NON-NLS-1$ //$NON-NLS-2$
					}
				}
				else{
					MessageDialog.openError(getShell(),"...", "..."); //$NON-NLS-1$ //$NON-NLS-2$
				}
			}
			else if(buttonId==IDialogConstants.CANCEL_ID){
				this.close();
			}
		}
		
	}

}
