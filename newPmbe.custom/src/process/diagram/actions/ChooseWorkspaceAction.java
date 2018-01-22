package process.diagram.actions;

import java.awt.Container;
import java.awt.FlowLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
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



public class ChooseWorkspaceAction implements IWorkbenchWindowActionDelegate {
	
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
        
		NewProcessDialog dlg=new NewProcessDialog(window.getShell());
		dlg.open();
       
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}
private class NewProcessDialog extends Dialog{
		
		private String textValue;
		private Text nameText;
		public NewProcessDialog(Shell parentShell){
			super(parentShell);
		}
		
		public String getTextValue(){
			return this.textValue;
		}
		
		public void setTextValue(String string){
			this.textValue=string;
		}
		
		protected Control createDialogArea(Composite parent){
			this.getShell().setText("输入新的工作空间路径");
			Composite topComp=new Composite(parent,SWT.NONE);
			topComp.setLayout(null);
			Label label=new Label(topComp,SWT.NONE);
		    label.setBounds(10,32,80,25);
		    label.setText("工作空间路径:");
		    nameText=new Text(topComp,SWT.BORDER);
		    nameText.setText(textValue==null?"":textValue);
		    nameText.setBounds(100,30,220,25);
		    
		    return topComp;
			
		}

		@Override
		protected void initializeBounds() {
			// TODO Auto-generated method stub
			super.createButton((Composite)getButtonBar(),IDialogConstants.OK_ID, "确定", false);
			super.createButton((Composite)getButtonBar(), IDialogConstants.CANCEL_ID, "取消", false);
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
			p.x=340;
			p.y=140;
			return p;
		}

		@Override
		protected void buttonPressed(int buttonId) {
			// TODO Auto-generated method stub
			//super.buttonPressed(buttonId);
			if(buttonId==IDialogConstants.OK_ID){
				this.textValue=nameText.getText();
				String path=nameText.getText();
				if(path!=null&&path.length()!=0){
					File file=new File(path);
					if(file.exists())
					{
						File file1=new File(path+"\\过程模型");
						if(!file1.exists()){
							file1.mkdir();
						}
						File file2=new File(path+"\\资源模型");
						if(!file2.exists()){
							file2.mkdir();
						}
						File file3=new File(path+"\\组织模型");
						if(!file3.exists()){
							file3.mkdir();
						}
						File file4=new File(path+"\\业务模型");
						if(!file4.exists()){
							file4.mkdir();
						}
						IWorkspace workSpace=ResourcesPlugin.getWorkspace();
						IWorkspaceRoot root=workSpace.getRoot();
						File workpath=new File(root.getLocation().toString()+"\\workspacePath.properties");
					    if(workpath.exists()){
					    	workpath.delete();
					    }
						try {
							workpath.createNewFile();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							FileOutputStream outPut=new FileOutputStream(workpath);
							Properties pro=new Properties();
							try {
								pro.put("path", path);
								pro.store(outPut, null);
								
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						this.close();
					}
					else{
						MessageDialog.openError(getShell(), "error", "非法路径");
					}
				}
				else{
					MessageDialog.openError(getShell(), "error", "路径不能为空");
				}
			}
			else if(buttonId==IDialogConstants.CANCEL_ID){
				this.close();
			}
		}
		
	}
}
