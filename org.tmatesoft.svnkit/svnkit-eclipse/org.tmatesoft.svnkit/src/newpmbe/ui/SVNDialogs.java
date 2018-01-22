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
 * �ṩCVS��ع��ܵĶԻ���
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
	 * ��¼�Ի���
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
			this.getShell().setText("��¼");
			topComp=new Composite(parent,SWT.NONE);

			topComp.setLayout(null);
			
			Label nameLabel=new Label(topComp,SWT.NONE);
		    nameLabel.setText("�û���:");
		    nameLabel.setBounds(10,15,50,12);
		    nameText=new Text(topComp,SWT.BORDER);
		    nameText.setBounds(60,12,160,18);
		    Label passwordLabel=new Label(topComp,SWT.NONE);
		    passwordLabel.setText("��  ��:");
		    passwordLabel.setBounds(10,40,50,12);
		    
		    passwordText=new Text(topComp,SWT.PASSWORD|SWT.BORDER);
			passwordText.setBounds(60, 38, 160, 18);
			
		    return topComp;
			
		}

		protected void initializeBounds() {
			// TODO Auto-generated method stub
			super.createButton((Composite)getButtonBar(),IDialogConstants.OK_ID, "ȷ��", false);
			super.createButton((Composite)getButtonBar(), IDialogConstants.CANCEL_ID, "ȡ��", false);
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
					MessageDialog.openError(getShell(), "error", "�û��������벻��Ϊ��");
				}
				else{
					try{
				    	File file=new File("C:/SVNLoginInf.txt");
				    	file.createNewFile();
				    	if(!file.isFile()){
				    		System.out.println("����"+file.getPath()+"ʧ��");
				    		return;
				    	}
				    	//����¼��Ϣ���浽C:/SVNLoginInf.txt��
					    BufferedWriter myOutput = new BufferedWriter(new FileWriter(file.getPath()));
					    myOutput.write(name+"="+password);
					    myOutput.close();
					    
					    //��ȡ�ֿ�·���ͷ�����ip
					    FileReader in = new FileReader("C:/SVNBasicInf.txt");
			            BufferedReader bufferIn = new BufferedReader(in);
			            String reposRoot = bufferIn.readLine();
			            String localRoot=bufferIn.readLine();
			           
					    WorkingCopyManager wcManager = new WorkingCopyManager(reposRoot, localRoot);
					    
					    //�����Ƿ��������
                        if(!wcManager.configConnection()){
                            MessageDialog.openError(null, "���ӷ���������", "�޷����ӵ���������������Ӧ���ã�");
                        }
					    else
					    	MessageDialog.openInformation(this.getShell(), "��Ϣ", "��¼�ɹ�");
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
	 *  �ۺ����öԻ���
	 *  �������ñ��ع���Ŀ¼��ģ�Ͳֿ�·����������IP
	 *  ��ȷ����ť���������ñ�����c:/CVSBasicInf.txt �ļ���
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
			this.getShell().setText("SVN��������");
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
			group.setText("������������");
			Label label1=new Label(group,SWT.NONE);
			final FormData fd_label1 = new FormData();
			fd_label1.bottom = new FormAttachment(0, 32);
			fd_label1.top = new FormAttachment(0, 20);
			label1.setLayoutData(fd_label1);
			//label1.setBounds(30,30,80,25);
			label1.setText("�����ļ�λ�ã�");
			
			fileLocationText=new Text(group,SWT.BORDER);
			final FormData fd_fileLocationText = new FormData();
			fd_fileLocationText.top = new FormAttachment(0, 17);
			fd_fileLocationText.bottom = new FormAttachment(0, 35);
			fd_fileLocationText.left = new FormAttachment(0, 100);
			fileLocationText.setLayoutData(fd_fileLocationText);
			fileLocationText.setTextLimit(30);
			fileLocationText.setText("C:\\SVNBasicInf.txt"); //Ԥ�������ļ����·��
			fileLocationText.setEnabled(false);
			
		    
			//��ü����ļ��жԻ������û�ֱ����ѡ��·��
			Label label2;
			label2=new Label(group,SWT.NONE);
			fd_label1.right = new FormAttachment(label2, 81, SWT.LEFT);
			fd_label1.left = new FormAttachment(label2, 0, SWT.LEFT);
			final FormData fd_label2 = new FormData();
			fd_label2.bottom = new FormAttachment(0, 69);
			fd_label2.top = new FormAttachment(0, 57);
			label2.setLayoutData(fd_label2);
			label2.setText("���ع�����Ŀ¼��");
			localDirText=new Text(group,SWT.BORDER);
			fd_fileLocationText.right = new FormAttachment(localDirText, 0, SWT.RIGHT);
			final FormData fd_localDirText = new FormData();
			fd_localDirText.bottom = new FormAttachment(0, 72);
			fd_localDirText.top = new FormAttachment(0, 54);
			fd_localDirText.right = new FormAttachment(fileLocationText, 155, SWT.LEFT);
			fd_localDirText.left = new FormAttachment(fileLocationText, 0, SWT.LEFT);
			localDirText.setLayoutData(fd_localDirText);
			//��Ŀ¼�Ի�����ѡ�񱾵ع���Ŀ¼
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
					dlg.setText("Ŀ¼");
					dlg.setMessage("��ѡ��һ��Ŀ¼:");
					String dir=dlg.open();
					if(dir!=null){
						localDirText.setText(dir);
					}
				}
			});
			button.setText("ѡ��");
			
			Label label3;
			label3=new Label(group,SWT.NONE);
			final FormData fd_label3 = new FormData();
			fd_label3.top = new FormAttachment(0, 97);
			fd_label3.bottom = new FormAttachment(0, 110);
			fd_label3.left = new FormAttachment(0, 4);
			fd_label3.right = new FormAttachment(0, 100);
			label3.setLayoutData(fd_label3);
			label3.setText("ģ�ʹ洢��λ�ã�");
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
			super.createButton((Composite)getButtonBar(),IDialogConstants.OK_ID, "ȷ��", false);
			super.createButton((Composite)getButtonBar(), IDialogConstants.CANCEL_ID, "ȡ��", false);
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
	 * ����ģ�ͶԻ���
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
			this.getShell().setText("����ģ��");
			topComp=new Composite(parent,SWT.NONE);
			topComp.setLayout(null);
			
			Label label1=new Label(topComp,SWT.NONE);
			label1.setBounds(15,14,171,20);
			label1.setText("Ҫ����ģ���ڱ��ص�·����");
			 localLocationText=new Text(topComp,SWT.BORDER);
			localLocationText.setBounds(15,40,200,18);
			
			
			Label label2=new Label(topComp,SWT.NONE);
			label2.setBounds(15,66,200,20);
			label2.setText("�ֿ��н�Ҫʹ�õ�����(��������׺)");
			reposNameText=new Text(topComp,SWT.BORDER);
			reposNameText.setBounds(15,90,165,20);
			//text2.setTextLimit(30);
			
			//���Ұ�ť��������Ŀ¼�Ի�����ѡ��Ҫ������ļ���
			final Button button1=new Button(topComp,SWT.NONE);
			button1.addSelectionListener(new SelectionAdapter(){
				public void widgetSelected(SelectionEvent e){
					DirectoryDialog dlg=new DirectoryDialog(topComp.getShell());
					dlg.setText("Ŀ¼");
					dlg.setMessage("��ѡ��һ��Ŀ¼:");
					String dir=dlg.open();
					if(dir!=null){
						localLocationText.setText(dir);
					}
				}
			});
			button1.setBounds(220,38,55,22);
			button1.setText("����");

			final Label label = new Label(topComp, SWT.NONE);
			label.setText("(��123.process)");
			label.setBounds(188, 92, 87, 13);
			
		    return topComp;
			
		}

		protected void initializeBounds() {
			// TODO Auto-generated method stub
			super.createButton((Composite)getButtonBar(),IDialogConstants.OK_ID, "ȷ��", false);
			super.createButton((Composite)getButtonBar(), IDialogConstants.CANCEL_ID, "ȡ��", false);
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
	    				MessageDialog.openError(this.getShell(), "����", "�ļ������ڣ�");
                        return;
                    }
	    			WorkingCopyManager wcManager=new WorkingCopyManager();
                    //�����Ƿ��������
                    if(!wcManager.configConnection()){
                        MessageDialog.openError(null, "���ӷ���������", "�޷����ӵ���������������Ӧ���ã�");
                        return;
                    }
	    			SVNURL dstURL;
					try {
						dstURL = wcManager.getRepositoryRootURL().appendPath("/" + moduleName, false);
	    				SVNCommitInfo info = wcManager.importDirectory(dir, dstURL, "����ģ��"+moduleName, true);
	    				//cf.importModule(this.getShell(), dir, modulename);   //����ģ��
	    				MessageDialog.openInformation(this.getShell(), "����ɹ�", "����ģ��ɹ���");
					} catch (SVNException e1) {
                        MessageDialog.openError(this.getShell(), "����", "�ӷ�����ǩ��ʧ�ܣ���ȷ����\nӵ��Ȩ�޲��ṩ����ȷ�Ĺ�����");
                        return;
					}
	    		}
                else{
                    MessageDialog.openInformation(this.getShell(), "��ʾ", "������·����Ϣ�򹤳�����");
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
	 * ����ģ�ͶԻ���
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
			this.getShell().setText("����ģ��");
			topComp=new Composite(parent,SWT.NONE);
			topComp.setLayout(null);
			
			Label label1=new Label(topComp,SWT.NONE);
			label1.setBounds(10,14,234,20);
			label1.setText("Ҫ������ģ���ڴ洢���еĹ�����(�Ӻ�׺):");
			ralativeReposURLText=new Text(topComp,SWT.BORDER);
			ralativeReposURLText.setBounds(10,40,156,20);
			
			Label label2=new Label(topComp,SWT.NONE);
			label2.setBounds(15,66,250,20);
			label2.setText("���������صĹ�����Ŀ¼:");
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
                MessageDialog.openError(null, "����", "�������õ�¼��Ϣ�ʹ洢��Ϣ��");
				e.printStackTrace();
			}

			final Label label = new Label(topComp, SWT.NONE);
			label.setText("(��123.process)");
			label.setBounds(172, 43, 83, 13);
			
		    return topComp;
			
		}

		protected void initializeBounds() {
			super.createButton((Composite)getButtonBar(),IDialogConstants.OK_ID, "ȷ��", false);
			super.createButton((Composite)getButtonBar(), IDialogConstants.CANCEL_ID, "ȡ��", false);
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
                       prefix = "��Դģ��";
                    }else if(subURL.endsWith(".process")){
                        prefix = "����ģ��";
                    }else if(subURL.endsWith(".organization")){
                        prefix = "��֯ģ��";
                    }else{
                        prefix = "";
                    }
					WorkingCopyManager wcManager = new WorkingCopyManager();
                    //�����Ƿ��������
                    if(!wcManager.configConnection()){
                        MessageDialog.openError(null, "���ӷ���������", "�޷����ӵ���������������Ӧ���ã�");
                        return;
                    }
					//����ģ�鵽���ع���Ŀ¼��������
					SVNURL workSVNURL;
					try {
						workSVNURL = SVNURL.parseURIEncoded(wcManager.getRepositoryRootURL()+"/" + subURL);
						wcManager.checkout(workSVNURL, SVNRevision.HEAD, prefix+"/"+ subURL, true);
					} catch (SVNException e1) {
                        MessageDialog.openError(null, "ǩ������", "ǩ������ʱ����\n"+"���ƿ����Ѿ����ڻ�洢��·�����ԣ�");
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
                        MessageDialog.openInformation(null, "�����ɹ�", "�����ѳɹ����������ء�");
					} catch (CoreException e) {
						MessageDialog.openError(null, "�������̴���", "��������ʱ����\n"+"���̿����Ѿ����ڻ�洢��·�����ԣ�");
						e.printStackTrace();
                        return;
					}
				}
        		else{ //ģ��·������Ϊ��
        			MessageDialog.openError(this.getShell(), "����", "ģ��·������Ϊ�գ�");
                    return;
        		}
            }
            super.buttonPressed(buttonId);
		}
	}
}
