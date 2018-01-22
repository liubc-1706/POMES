/**
 * ===============================================
 * Copyright SEI of Beihang University. All rights
 * reserved.
 * Modified by zhang peng in 2007-7-21.
 * ================================================
**/
package newpmbe.ui;

import java.io.*;

import newpmbe.svn.wc.WorkingCopyManager;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.tmatesoft.svn.core.SVNCommitInfo;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.wc.SVNRevision;

/**
 * 提供CVS相关功能的对话框
 * @author fanshuchuan, zhangpeng
 *
 */

public class SVNDialogs {
	
	public static void openConfigurationDialog(Shell parent){
		ConfigurationDialog dlg=new ConfigurationDialog(parent);
		dlg.open();
	}
	
	public static void openLoginDialog(Shell parent){
		LoginDialog dlg=new LoginDialog(parent);
		dlg.open();
	}
	
	public static void openInputModuleDialog(Shell parent){
		InputModuleDialog dlg=new InputModuleDialog(parent);
        if(dlg.open()== Dialog.OK){
            return;
        }
	}
	
	public static void openCheckoutModuleDialog(Shell parent){
		CheckoutModuleDialog dlg=new CheckoutModuleDialog(parent);
		if(dlg.open()== Dialog.OK){
            return;
        }
	}
	
	
	/**
	 * 登录对话框
	 * @author fan
	 *
	 */
	private static class LoginDialog extends Dialog{
		private Composite topComp;
		private Text nameText;
		private Text passwordText;
		
		public LoginDialog(Shell parentshell){
			super(parentshell);
		}
		
		protected Control createDialogArea(Composite parent){
			GridLayout lay=new GridLayout();
			lay.numColumns=3;
			lay.marginTop=10;
			lay.marginLeft=10;
			lay.verticalSpacing=8;
			this.getShell().setText("登录");
			topComp=new Composite(parent,SWT.NONE);

			topComp.setLayout(null);
			
			Label nameLabel=new Label(topComp,SWT.NONE);
		    nameLabel.setText("用户名:");
		    nameLabel.setBounds(10,15,50,12);
		    nameText=new Text(topComp,SWT.BORDER);
		    nameText.setBounds(60,12,160,18);
		    Label passwordLabel=new Label(topComp,SWT.NONE);
		    passwordLabel.setText("密  码:");
		    passwordLabel.setBounds(10,40,50,12);
		    
		    passwordText=new Text(topComp,SWT.PASSWORD|SWT.BORDER);
			passwordText.setBounds(60, 38, 160, 18);
			
		    return topComp;
			
		}

		protected void initializeBounds() {
			// TODO Auto-generated method stub
			super.createButton((Composite)getButtonBar(),IDialogConstants.OK_ID, "确定", false);
			super.createButton((Composite)getButtonBar(), IDialogConstants.CANCEL_ID, "取消", false);
			super.initializeBounds();
		}

		protected Button createButton(Composite parent, int id, String label,
				boolean defaultButton) {
			// TODO Auto-generated method stub
			return null;
		}

		protected Point getInitialSize() {
			// TODO Auto-generated method stub
			Point p=super.getInitialSize();
			p.x=250;
			p.y=130;
			return p;
		}

		protected void buttonPressed(int buttonId) {
			// TODO Auto-generated method stub
			//super.buttonPressed(buttonId);
			if(buttonId==IDialogConstants.OK_ID){
				String name=nameText.getText();
				String password=passwordText.getText();
				if(name.length()==0||password.length()==0||name==null||password==null){
					MessageDialog.openError(getShell(), "error", "用户名、密码不能为空");
				}
				else{
					try{
				    	File file=new File("C:/SVNLoginInf.txt");
				    	file.createNewFile();
				    	if(!file.isFile()){
				    		System.out.println("创建"+file.getPath()+"失败");
				    		return;
				    	}
				    	//将登录信息保存到C:/SVNLoginInf.txt中
					    BufferedWriter myOutput = new BufferedWriter(new FileWriter(file.getPath()));
					    myOutput.write(name+"="+password);
					    myOutput.close();
					    
					    //读取仓库路径和服务器ip
					    FileReader in = new FileReader("C:/SVNBasicInf.txt");
			            BufferedReader bufferIn = new BufferedReader(in);
			            String reposRoot = bufferIn.readLine();
			            String localRoot=bufferIn.readLine();
			           
					    WorkingCopyManager wcManager = new WorkingCopyManager(reposRoot, localRoot);
					    
					    //测试是否可以连接
                        if(!wcManager.configConnection()){
                            MessageDialog.openError(null, "连接服务器出错", "无法连接到服务器，请检查相应设置！");
                        }
					    else
					    	MessageDialog.openInformation(this.getShell(), "信息", "登录成功");
						this.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			}
			else{
				this.close();
			}
		}
	}
	
	/**
	 *  综合配置对话框
	 *  用于设置本地工作目录、模型仓库路径、服务器IP
	 *  按确定按钮将上述设置保存在c:/CVSBasicInf.txt 文件中
	 * @author fan, zhangpeng
	 *
	 */
	private static class ConfigurationDialog extends Dialog{
		private Composite topComp;
		private Group group;
		private Text fileLocationText;
		private Text localDirText;
		private Text reposURLText;
		//private Text text4;
		
		
		public ConfigurationDialog(Shell parentshell){
			super(parentshell);
		}
		
		protected Control createDialogArea(Composite parent){
			this.getShell().setText("SVN环境配置");
			topComp=new Composite(parent,SWT.NONE);
			topComp.setLayout(new FormLayout());
			
			group=new Group(topComp,SWT.NONE);
			group.setLayout(new FormLayout());
			final FormData fd_group = new FormData();
			fd_group.bottom = new FormAttachment(0, 158);
			fd_group.top = new FormAttachment(0, 8);
			fd_group.right = new FormAttachment(0, 358);
			fd_group.left = new FormAttachment(0, 8);
			group.setLayoutData(fd_group);
			group.setText("工作环境设置");
			Label label1=new Label(group,SWT.NONE);
			final FormData fd_label1 = new FormData();
			fd_label1.bottom = new FormAttachment(0, 32);
			fd_label1.top = new FormAttachment(0, 20);
			label1.setLayoutData(fd_label1);
			//label1.setBounds(30,30,80,25);
			label1.setText("配置文件位置：");
			
			fileLocationText=new Text(group,SWT.BORDER);
			final FormData fd_fileLocationText = new FormData();
			fd_fileLocationText.top = new FormAttachment(0, 17);
			fd_fileLocationText.bottom = new FormAttachment(0, 35);
			fd_fileLocationText.left = new FormAttachment(0, 100);
			fileLocationText.setLayoutData(fd_fileLocationText);
			fileLocationText.setTextLimit(30);
			fileLocationText.setText("C:\\SVNBasicInf.txt"); //预设配置文件存放路径
			fileLocationText.setEnabled(false);
			
		    
			//最好加上文件夹对话框让用户直接在选择路径
			Label label2;
			label2=new Label(group,SWT.NONE);
			fd_label1.right = new FormAttachment(label2, 81, SWT.LEFT);
			fd_label1.left = new FormAttachment(label2, 0, SWT.LEFT);
			final FormData fd_label2 = new FormData();
			fd_label2.bottom = new FormAttachment(0, 69);
			fd_label2.top = new FormAttachment(0, 57);
			label2.setLayoutData(fd_label2);
			label2.setText("本地工作根目录：");
			localDirText=new Text(group,SWT.BORDER);
			fd_fileLocationText.right = new FormAttachment(localDirText, 0, SWT.RIGHT);
			final FormData fd_localDirText = new FormData();
			fd_localDirText.bottom = new FormAttachment(0, 72);
			fd_localDirText.top = new FormAttachment(0, 54);
			fd_localDirText.right = new FormAttachment(fileLocationText, 155, SWT.LEFT);
			fd_localDirText.left = new FormAttachment(fileLocationText, 0, SWT.LEFT);
			localDirText.setLayoutData(fd_localDirText);
			//在目录对话框中选择本地工作目录
			Button button;
			button=new Button(group,SWT.NONE);
			final FormData fd_button = new FormData();
			fd_button.bottom = new FormAttachment(0, 74);
			fd_button.top = new FormAttachment(0, 52);
			fd_button.right = new FormAttachment(localDirText, 67, SWT.RIGHT);
			fd_button.left = new FormAttachment(localDirText, 5, SWT.RIGHT);
			button.setLayoutData(fd_button);
			button.addSelectionListener(new SelectionAdapter(){
				public void widgetSelected(SelectionEvent e){
					DirectoryDialog dlg=new DirectoryDialog(topComp.getShell());
					dlg.setText("目录");
					dlg.setMessage("请选择一个目录:");
					String dir=dlg.open();
					if(dir!=null){
						localDirText.setText(dir);
					}
				}
			});
			button.setText("选择");
			
			Label label3;
			label3=new Label(group,SWT.NONE);
			final FormData fd_label3 = new FormData();
			fd_label3.top = new FormAttachment(0, 97);
			fd_label3.bottom = new FormAttachment(0, 110);
			fd_label3.left = new FormAttachment(0, 4);
			fd_label3.right = new FormAttachment(0, 100);
			label3.setLayoutData(fd_label3);
			label3.setText("模型存储库位置：");
			reposURLText=new Text(group,SWT.BORDER);
			fd_label2.left = new FormAttachment(reposURLText, -95, SWT.LEFT);
			fd_label2.right = new FormAttachment(reposURLText, -5, SWT.LEFT);
			final FormData fd_reposURLText = new FormData();
			fd_reposURLText.bottom = new FormAttachment(0, 114);
			fd_reposURLText.top = new FormAttachment(0, 95);
			fd_reposURLText.right = new FormAttachment(0, 322);
			fd_reposURLText.left = new FormAttachment(0, 100);
			reposURLText.setLayoutData(fd_reposURLText);
			
			File file=new File("C:\\SVNBasicInf.txt");
			if(file.exists()){
				try{
					FileReader in=new FileReader("C:\\SVNBasicInf.txt");
					BufferedReader bufferIn = new BufferedReader(in);
					reposURLText.setText(bufferIn.readLine());
					//text4.setText(bufferIn.readLine());
					localDirText.setText(bufferIn.readLine());
					
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		    return topComp;
			
		}

		protected void initializeBounds() {
			// TODO Auto-generated method stub
			super.createButton((Composite)getButtonBar(),IDialogConstants.OK_ID, "确定", false);
			super.createButton((Composite)getButtonBar(), IDialogConstants.CANCEL_ID, "取消", false);
			super.initializeBounds();
		}

		protected Button createButton(Composite parent, int id, String label,
				boolean defaultButton) {
			// TODO Auto-generated method stub
			return null;
		}

		protected Point getInitialSize() {
			// TODO Auto-generated method stub
			Point p=super.getInitialSize();
			p.x=380;
			p.y=240;
			return p;
		}

		protected void buttonPressed(int buttonId) {
			if(buttonId==IDialogConstants.OK_ID){
				String str=fileLocationText.getText().trim();
				String localWorkRoot=localDirText.getText().trim();
				String repositoryRootURL=reposURLText.getText().trim();
				try{
					File file=new File(str);
					file.createNewFile();
					
					if(!file.isFile()){
						System.out.println("Creating"+file.getPath()+"failed");
						return;
					}
					BufferedWriter output=new BufferedWriter(new FileWriter(file.getPath()));
					output.write(repositoryRootURL+"\n"+localWorkRoot);
					output.close();
					this.close();
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
			else{
				this.close();
			}
		}
	}
	
	/**
	 * 导入模型对话框
	 * @author fan, zhangpeng
	 *
	 */
	private static class InputModuleDialog extends Dialog{
		private Composite topComp;
		private Text localLocationText;
		private Text reposNameText;
		
		public InputModuleDialog(Shell parentshell){
			super(parentshell);
		}
		
		protected Control createDialogArea(Composite parent){
			this.getShell().setText("导入模块");
			topComp=new Composite(parent,SWT.NONE);
			topComp.setLayout(null);
			
			Label label1=new Label(topComp,SWT.NONE);
			label1.setBounds(15,14,171,20);
			label1.setText("要导入模块在本地的路径：");
			 localLocationText=new Text(topComp,SWT.BORDER);
			localLocationText.setBounds(15,40,200,18);
			
			
			Label label2=new Label(topComp,SWT.NONE);
			label2.setBounds(15,66,200,20);
			label2.setText("仓库中将要使用的名字(包括类别后缀)");
			reposNameText=new Text(topComp,SWT.BORDER);
			reposNameText.setBounds(15,90,165,20);
			//text2.setTextLimit(30);
			
			//查找按钮，用于在目录对话框中选择要导入的文件夹
			final Button button1=new Button(topComp,SWT.NONE);
			button1.addSelectionListener(new SelectionAdapter(){
				public void widgetSelected(SelectionEvent e){
					DirectoryDialog dlg=new DirectoryDialog(topComp.getShell());
					dlg.setText("目录");
					dlg.setMessage("请选择一个目录:");
					String dir=dlg.open();
					if(dir!=null){
						localLocationText.setText(dir);
					}
				}
			});
			button1.setBounds(220,38,55,22);
			button1.setText("查找");

			final Label label = new Label(topComp, SWT.NONE);
			label.setText("(如123.process)");
			label.setBounds(188, 92, 87, 13);
			
		    return topComp;
			
		}

		protected void initializeBounds() {
			// TODO Auto-generated method stub
			super.createButton((Composite)getButtonBar(),IDialogConstants.OK_ID, "确定", false);
			super.createButton((Composite)getButtonBar(), IDialogConstants.CANCEL_ID, "取消", false);
			super.initializeBounds();
		}

		protected Button createButton(Composite parent, int id, String label,
				boolean defaultButton) {
			// TODO Auto-generated method stub
			return null;
		}

		protected Point getInitialSize() {
			// TODO Auto-generated method stub
			Point p=super.getInitialSize();
			p.x=288;
			p.y=185;
			return p;
		}

		protected void buttonPressed(int buttonId) {
			// TODO Auto-generated method stub
			//super.buttonPressed(buttonId);
			if(buttonId==IDialogConstants.OK_ID){
				String dir=localLocationText.getText();
	    		String moduleName=reposNameText.getText();
	    		if(dir.length()>0&&moduleName.length()>0){
	    			File file = new File(dir);
	    			if(!file.exists()){
	    				MessageDialog.openError(this.getShell(), "错误", "文件不存在！");
                        return;
                    }
	    			WorkingCopyManager wcManager=new WorkingCopyManager();
                    //测试是否可以连接
                    if(!wcManager.configConnection()){
                        MessageDialog.openError(null, "连接服务器出错", "无法连接到服务器，请检查相应设置！");
                        return;
                    }
	    			SVNURL dstURL;
					try {
						dstURL = wcManager.getRepositoryRootURL().appendPath("/" + moduleName, false);
	    				SVNCommitInfo info = wcManager.importDirectory(dir, dstURL, "导入模块"+moduleName, true);
	    				//cf.importModule(this.getShell(), dir, modulename);   //导入模型
	    				MessageDialog.openInformation(this.getShell(), "导入成功", "导入模块成功！");
					} catch (SVNException e1) {
                        MessageDialog.openError(this.getShell(), "错误", "从服务器签出失败，请确认你\n拥有权限并提供了正确的工程名");
                        return;
					}
	    		}
                else{
                    MessageDialog.openInformation(this.getShell(), "提示", "请输入路径信息或工程名！");
                    return;
                }
			}
			else{
				this.close();
			}
            super.buttonPressed(buttonId);
		}
	}
	
	/**
	 * 导出模型对话框
	 * @author fan
	 *
	 */
	private static class CheckoutModuleDialog extends Dialog{
		private Composite topComp;
		private Text ralativeReposURLText;
		private Text localWorkRootText;
		
		public CheckoutModuleDialog(Shell parentshell){
			super(parentshell);
		}
		
		protected Control createDialogArea(Composite parent){
			this.getShell().setText("导出模块");
			topComp=new Composite(parent,SWT.NONE);
			topComp.setLayout(null);
			
			Label label1=new Label(topComp,SWT.NONE);
			label1.setBounds(10,14,234,20);
			label1.setText("要导出的模块在存储库中的工程名(加后缀):");
			ralativeReposURLText=new Text(topComp,SWT.BORDER);
			ralativeReposURLText.setBounds(10,40,156,20);
			
			Label label2=new Label(topComp,SWT.NONE);
			label2.setBounds(15,66,250,20);
			label2.setText("导出到本地的工作根目录:");
			localWorkRootText=new Text(topComp,SWT.BORDER);
			localWorkRootText.setBounds(10,90,250,20);
			localWorkRootText.setEnabled(false);
			try{
				FileReader in = new FileReader("C:/SVNBasicInf.txt");
				BufferedReader bufferIn = new BufferedReader(in);
				bufferIn.readLine();
				String workroot=bufferIn.readLine();
				localWorkRootText.setText(workroot);
                
				System.out.println(localWorkRootText);
				
			}catch(Exception e){
                MessageDialog.openError(null, "错误", "请先设置登录信息和存储信息！");
				e.printStackTrace();
			}

			final Label label = new Label(topComp, SWT.NONE);
			label.setText("(如123.process)");
			label.setBounds(172, 43, 83, 13);
			
		    return topComp;
			
		}

		protected void initializeBounds() {
			super.createButton((Composite)getButtonBar(),IDialogConstants.OK_ID, "确定", false);
			super.createButton((Composite)getButtonBar(), IDialogConstants.CANCEL_ID, "取消", false);
			super.initializeBounds();
		}

		protected Button createButton(Composite parent, int id, String label,
				boolean defaultButton) {
			return null;
		}

		protected Point getInitialSize() {
			Point p=super.getInitialSize();
			p.x=290;
			p.y=188;
			return p;
		}
		
		
		protected void setFilesReadonly(File file){
			if(file.isFile()){
				file.setReadOnly();
			}
			else if(file.isDirectory()){
				if(file.getName().equals(".svn"))
					return;
				if(file.getName().equals(".settings"))
					return;
				File[] files=file.listFiles();
				for(int i=0;i<files.length;i++){
					setFilesReadonly(files[i]);
				}
			}
		}
		
		protected void deleteFiles(File file){
			if(file.isFile()){
				if(file.getName().equals(".project"))
					return; 
                file.delete();
			}
			else if(file.isDirectory()){
				if(file.getName().equals(".settings")||file.getName().equals(".svn"))
					return;
				File[] files=file.listFiles();
				for(int i=0;i<files.length;i++){
					deleteFiles(files[i]);
				}
			}
		}

		protected void buttonPressed(int buttonId) {
			if(buttonId==IDialogConstants.OK_ID){
				String subURL =ralativeReposURLText.getText().trim();
                String prefix;
				if(subURL!=null&&subURL.length()>0){
                    if(subURL.endsWith(".resource")){
                       prefix = "资源模型";
                    }else if(subURL.endsWith(".process")){
                        prefix = "过程模型";
                    }else if(subURL.endsWith(".organization")){
                        prefix = "组织模型";
                    }else{
                        prefix = "";
                    }
					WorkingCopyManager wcManager = new WorkingCopyManager();
                    //测试是否可以连接
                    if(!wcManager.configConnection()){
                        MessageDialog.openError(null, "连接服务器出错", "无法连接到服务器，请检查相应设置！");
                        return;
                    }
					//导出模块到本地工作目录，不加锁
					SVNURL workSVNURL;
					try {
						workSVNURL = SVNURL.parseURIEncoded(wcManager.getRepositoryRootURL()+"/" + subURL);
						wcManager.checkout(workSVNURL, SVNRevision.HEAD, prefix+"/"+ subURL, true);
					} catch (SVNException e1) {
                        MessageDialog.openError(null, "签出出错", "签出工程时出错\n"+"工称可能已经存在或存储库路径不对！");
                        return;
					}
//					File file=new File(wcManager.getLocalWorkRoot()+"/"+subURL);
//					deleteFiles(file);
					IWorkspace workspace = ResourcesPlugin.getWorkspace();
					IWorkspaceRoot root=workspace.getRoot();
					try {
						IProject project=root.getProject(subURL);
						IPath targetPath=new Path(wcManager.getLocalWorkRoot()+"\\"+prefix+"\\"+subURL);
						IProjectDescription description;
						description = workspace.loadProjectDescription(
								new Path(wcManager.getLocalWorkRoot()+"\\"+prefix+"\\"+subURL+"\\.project"));
						description.setLocation(targetPath);
						project.create(description, null);
						project.open(null);
                        MessageDialog.openInformation(null, "导出成功", "工程已成功导出到本地。");
					} catch (CoreException e) {
						MessageDialog.openError(null, "导出工程错误", "导出工程时出错\n"+"工程可能已经存在或存储库路径不对！");
						e.printStackTrace();
                        return;
					}
				}
        		else{ //模块路径不能为空
        			MessageDialog.openError(this.getShell(), "错误", "模块路径不能为空！");
                    return;
        		}
            }
            super.buttonPressed(buttonId);
		}
	}
}
