package newpmbe.rcp.actions.transport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

public class SaveAsDialog extends Dialog {

	private Text text;
	private IProject originProject;
	
	private Label typeLabel;
	/**
	 * Create the dialog
	 * @param parentShell
	 */
	public SaveAsDialog(Shell parentShell) {
		super(parentShell);
	}
	public SaveAsDialog(Shell parentShell, IProject originProject){
		super(parentShell);
		this.originProject = originProject;
	}

	/**
	 * Create contents of the dialog
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FormLayout());

		final Label label = new Label(container, SWT.NONE);
		final FormData fd_label = new FormData();
		fd_label.right = new FormAttachment(0, 165);
		fd_label.top = new FormAttachment(0, 20);
		fd_label.left = new FormAttachment(0, 15);
		label.setLayoutData(fd_label);
		label.setText("工程另存为：");

		text = new Text(container, SWT.BORDER);
		final FormData fd_text = new FormData();
		fd_text.right = new FormAttachment(0, 180);
		fd_text.bottom = new FormAttachment(0, 69);
		fd_text.top = new FormAttachment(0, 50);
		fd_text.left = new FormAttachment(label, 0, SWT.LEFT);
		text.setLayoutData(fd_text);

		String projectName = originProject.getName();
		int lastIndex = projectName.lastIndexOf(".");
		
		typeLabel = new Label(container, SWT.NONE);
		final FormData fd_typeLabel = new FormData();
		fd_typeLabel.top = new FormAttachment(text, 0, SWT.TOP);
		fd_typeLabel.bottom = new FormAttachment(text, 0, SWT.BOTTOM);
		fd_typeLabel.right = new FormAttachment(0, 245);
		fd_typeLabel.left = new FormAttachment(text, 0, SWT.RIGHT);
		typeLabel.setLayoutData(fd_typeLabel);
		typeLabel.setText(projectName.substring(lastIndex));
		//
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
		return new Point(285, 172);
	}
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) {
			String projName = text.getText();
			String projectFullName = projName + typeLabel.getText();

			IWorkspace space = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot root = space.getRoot();
			IResource resource = root.findMember(projectFullName);
			if(resource != null){
				MessageDialog.openWarning(null, "工程已存在", "已存在相同的工程名，请输入一个新的名称！");
				return;
			}
//			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
//			if(page == null){
//				MessageDialog.openInformation(null, "无法保存", "当前没有可保存的工程");
//			}else{
//				IEditorPart editor = page.getActiveEditor();
//				if(editor == null){
//					MessageDialog.openInformation(null, "无法保存", "当前没有可保存的工程");
//				}else{
//					if(editor.isDirty()){
//						editor.doSave(null);
//					}
//					IFileEditorInput input = (IFileEditorInput)editor.getEditorInput();
//					IFile file = input.getFile();
//					IProject originProject = file.getProject();
					//将当前工程复制到工作空间中的其他地方
	//				IProject project=root.getProject(projName);
//			if(originProject != null){

			IPath targetPath=root.getFullPath().append(projectFullName);
			try {
				
				originProject.copy(targetPath, true, new NullProgressMonitor());
				//然后改变另存到的工作空间中的过程diagram的名称
				
				IProject newProject = root.getProject(projectFullName);
				String oldDiagramName = originProject.getName()+"_diagram";
				IFile newDiagramFile = newProject.getFile(oldDiagramName);
				
				
				newDiagramFile.move(targetPath.append(newProject.getName()+"_diagram"), true, new NullProgressMonitor());
				newDiagramFile = newProject.getFile(newProject.getName()+"_diagram");
				
				//自动对资源和组织进行关联
				//查找是否有关联的资源
				IFile rsRecordFile = newProject.getFile(".rsrecord");
				changeRecordFile(rsRecordFile, originProject.getFile(oldDiagramName), newDiagramFile);
				
				//查找是否有关联的资源
				IFile orgRecordFile = newProject.getFile(".orgrecord");
				changeRecordFile(orgRecordFile, originProject.getFile(oldDiagramName), newDiagramFile);
				
				newProject.open(new NullProgressMonitor());
			} catch (CoreException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

//				}
//			}
		}
		super.buttonPressed(buttonId);
	}
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("另存为...");
	}

	private void changeRecordFile(IFile recordFile, IFile oldFile, IFile newFile){
		//在文件中记录所关联的资源的名字，格式为:fileName | filePath | resourceName | resourcePath
		//查找文件.record是否已存在，如果不存在，创建它

//		if(!recordFile.exists()){
//			return;
//		}
		java.io.File nativeFile = recordFile.getRawLocation().toFile();
		if(!nativeFile.exists()){
			return;
		}
		StringBuffer cache = new StringBuffer();
		//先读入，看有没有此条目
		try {
			FileReader fr = new FileReader(nativeFile);
	        BufferedReader br = new BufferedReader(fr);
	        String record = new String();
	        while ((record = br.readLine()) != null) {
	        	String strs[] = record.split("=");
	        	if(strs[0].equals(oldFile.getName())
	        			&& strs[1].equals(oldFile.getRawLocation().toString())){
	        		cache.append(newFile.getName() + "=" + newFile.getRawLocation().toString() + "="
	        				+strs[2]+ "="
	        				+strs[3]);
	        		cache.append("\n");
	        	}
	        	else if(strs[1].contains(oldFile.getProject().getName())){
	        	//改变oldFile的值
	        		//需要替换一个东西
//	        		String oldFileStr = oldFile.getRawLocation().toString();
//	        		String newFileStr = newFile.getRawLocation().toString();
	        		String oldPathStr = oldFile.getRawLocation().removeLastSegments(1).toString();
	        		String endPartStr = strs[1].substring(oldPathStr.length());
	        		cache.append(strs[0] + "=" + newFile.getRawLocation().removeLastSegments(1).toString()
	        				+endPartStr + "="
	        				+strs[2]+ "="
	        				+strs[3]);
	        		cache.append("\n");
	        	}
			 }
			 br.close();
			 fr.close(); 
			 
			 //写文件
			 
			 
			 
	      } catch (IOException e) { 
	          System.out.println("IO错误：读写操作失败");
	          e.printStackTrace();
	      }
	      
		    try {
		    	//看是否存在，若存在，则输出cache
		    	FileWriter fw = null;
		    	PrintWriter out = null;
//		    	if(isExist == true){
		    		fw = new FileWriter(nativeFile, false);
		    		out = new PrintWriter(fw);
		    		out.print(cache);
//		    	}else{
//		    	//否则，追加写
//			    	fw = new FileWriter(nativeFile, true);
//			    	out = new PrintWriter(fw);    
//			    	out.print(editor.getTitle()+"="+editorFile.getRawLocation());
//			    	out.println("="+dlg.getResourceFilePath()
//			    			+ "="+dlg.getResourceName());
//		    	}
		    	out.close();
		    	fw.close();
		    	     } catch (IOException e) { 
		    	         System.out.println("Uh oh, got an IOException error!");
		    	         e.printStackTrace();
		    	     }
	}
}
