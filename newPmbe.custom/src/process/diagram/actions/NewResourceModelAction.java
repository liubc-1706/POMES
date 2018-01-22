package process.diagram.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import newpmbe.resource.diagram.part.NewPMBEDiagramEditorUtil;

import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
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
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.part.PageBookView;

import fileCopyUtil.RelativePath;
public class NewResourceModelAction implements IWorkbenchWindowActionDelegate{
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
		NewResourceDialog dlg=new NewResourceDialog(window.getShell());
		dlg.open();
	}
	
	/**
	 * 创建工程名为projectName的资源模型
	 * @param projectName
	 * @throws Exception
	 */
	private void createProject(String projectName)throws Exception{
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root= workspace.getRoot();
		//changed by zhangpeng-projectName增加了后缀
		IProject project= root.getProject(projectName+".resource"); //$NON-NLS-1$
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
		Path path=new Path(pathStr+"\\资源模型\\"+projectName+".resource");
		IProjectDescription description=workspace.newProjectDescription(projectName+".resource");
		description.setLocation(path);
		project.create(description, null);
		//end by luocheng
	    project.open(null);
	    
	    IProgressMonitor progressMonitor = new NullProgressMonitor();
		progressMonitor.beginTask(
				"Creating diagram and model files", 4); //$NON-NLS-1$
		final IProgressMonitor subProgressMonitor = new SubProgressMonitor(
				progressMonitor, 1);
		String resourceName=projectName+".resource_diagram"; //$NON-NLS-1$
		//changed by zhangpeng-projectName增加了后缀
		NewPMBEDiagramEditorUtil.openDiagram(NewPMBEDiagramEditorUtil
			.createDiagram((new Path(projectName+".resource")).makeAbsolute(), //$NON-NLS-1$
					resourceName, progressMonitor));
		//end changed by zhangpeng
		
		//changed by lp - copy files
		String desFilePathStr=path.toString();
//		String srcFilePathStr=pathStr+"\\过程模型\\_ResFiles";
		String srcFilePathStr1=RelativePath.getFullPathRelateClass("../../_CSFiles",RelativePath.class);
		String srcFilePathStr=RelativePath.getFullPathRelateClass("../configuration/_CSFiles",RelativePath.class);

		File srcFolder=new File(srcFilePathStr);
		if(!srcFolder.exists())
			srcFilePathStr=srcFilePathStr1;
		System.out.println(srcFilePathStr);
		try{
			copyFiles(srcFilePathStr,desFilePathStr);
		}
		catch(Exception ee){
			ee.printStackTrace();
		}
	    project.refreshLocal(1, new NullProgressMonitor());
	   //end changed by lp
	}
public void copyFiles(String srcFilePathStr,String desFilePathStr) throws IOException{
		
		
		File srcFolder=new File(srcFilePathStr);
		if(!srcFolder.getName().equals(".svn")){
			new File(desFilePathStr).mkdirs();
			File[] file=srcFolder.listFiles();
			for(int i=0;i<file.length;i++){
				if(file[i].isFile()){
					FileInputStream input=new FileInputStream(file[i]);
					File outputFile=new File(desFilePathStr+"/"+file[i].getName());
					if(!outputFile.exists()){
						outputFile.createNewFile();
						FileOutputStream output=new FileOutputStream(outputFile);
						byte[] b=new byte[1024*5];
						int len;
						while((len=input.read(b))!=-1){
							output.write(b,0,len);
							}
						output.flush();
						output.close();
						input.close();
					}
			     }
			   if(file[i].isDirectory()){
				   copyFiles(srcFilePathStr+"/"+file[i].getName(),desFilePathStr+"/"+file[i].getName());
			  }
			     
			  }
		}
	}
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
	}
	
	/**
	 * 判断工程名projectName是否已经存在
	 * @param projectName
	 * @return
	 */	
//	private boolean isProjectExist(String projectName){
//		ITreeContentProvider myWorkbenchContentProvider = new WorkbenchContentProvider();
//		Object[] elements = myWorkbenchContentProvider
//				.getElements(ResourcesPlugin.getWorkspace().getRoot());
//		
//		for (int j = 0; j < elements.length; j++) {
//			if (elements[j] instanceof Project) {
//				//changed by zhangpeng
//				String projectName2 = projectName +".resource"; //$NON-NLS-1$
//				if (projectName2.equals(((Project) elements[j]).getName())){
//				//end changed by zhangpeng
//					return true;
//				}
//			}
//		}
//		return false;
//	}
	
	
	//overwrite by luocheng
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
		String path=new String(pathStr+"\\资源模型");
		File file=new File(path);
		File []files=file.listFiles();
		
		//added by zhangpeng
		if(files == null)
			return false;
		//end added by zhangpeng
		
		for(int i=0;i<files.length;i++){
			if(files[i].getName().equals(projectName+".resource")){
				return true;
			}
		}
		return false;
	}
	/**
	 * 创建过程模型的对话框
	 * @author fan
	 *
	 */
	private class NewResourceDialog extends Dialog{
		
		private String textValue;
		private Text nameText;
		public NewResourceDialog(Shell parentShell){
			super(parentShell);
		}
		
		public String getTextValue(){
			return this.textValue;
		}
		
		public void setTextValue(String string){
			this.textValue=string;
		}
		
		protected Control createDialogArea(Composite parent){
			this.getShell().setText(Messages.getString("NewResourceModelAction.4")); //$NON-NLS-1$
			Composite topComp=new Composite(parent,SWT.NONE);
			topComp.setLayout(null);
			Label label=new Label(topComp,SWT.NONE);
		    label.setBounds(10,30,75,25);
		    //hzg
		    label.setText("资源模型名称");
//		    label.setText(Messages.getString("NewResourceModelAction.5")); //$NON-NLS-1$
		    nameText=new Text(topComp,SWT.BORDER);
		    nameText.setText(textValue==null?"":textValue); //$NON-NLS-1$
		    nameText.setBounds(90,30,170,20);
		    
		    return topComp;
			
		}

		@Override
		protected void initializeBounds() {
			// TODO Auto-generated method stub
			super.createButton((Composite)getButtonBar(),IDialogConstants.OK_ID, Messages.getString("NewResourceModelAction.7"), false); //$NON-NLS-1$
			super.createButton((Composite)getButtonBar(), IDialogConstants.CANCEL_ID, Messages.getString("NewResourceModelAction.8"), false); //$NON-NLS-1$
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
				if(modelName.length()>50)
					MessageDialog.openError(getShell(), "错误", "工程名不能超过50个字符，请重新输入名称");//hzg modify
				else{
				if(modelName!=null&&modelName.length()!=0){
					if(!isProjectExist(modelName)){
						try{
							createProject(modelName);
						}catch(Exception ex){
							MessageDialog.openError(getShell(), Messages.getString("NewResourceModelAction.9"), Messages.getString("NewResourceModelAction.10")+ex.toString()); //$NON-NLS-1$ //$NON-NLS-2$
						}
						this.close();
					}
					else{
						MessageDialog.openError(getShell(), Messages.getString("NewResourceModelAction.11"), Messages.getString("NewResourceModelAction.12")); //$NON-NLS-1$ //$NON-NLS-2$
					}
				}
				else{
					MessageDialog.openError(getShell(), Messages.getString("NewResourceModelAction.13"), Messages.getString("NewResourceModelAction.14")); //$NON-NLS-1$ //$NON-NLS-2$
				}
				}
			}
			else if(buttonId==IDialogConstants.CANCEL_ID){
				this.close();
			}
		}
		
	}
		
}
