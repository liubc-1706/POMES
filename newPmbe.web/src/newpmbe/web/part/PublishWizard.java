package newpmbe.web.part;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import newpmbe.web.util.AllPath;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.ui.IWorkbench;

public class PublishWizard extends Wizard{
	
	private SetBasicConfigureWizardPage setBasicConfigure;
	private SetPropertyViewPage setPropertyViewPage;
	private SetLabelViewWizardPage setLabelViewPage;
	private IStructuredSelection initialSelection;
	

	private String modelPath;
	private String outputPath;
	private int formatTag;
	private boolean arrangeTag;
	private boolean popTag;
	private int propertyViewTag;
	private RGB backColor;
	private RGB frameColor;
	private RGB fontColor;
	private String backColorStr;
	private String frameColorStr;
	private String fontColorStr;
	private String font;
	
	 /**
     * 改写父类的addPages方法。在此方法将页面加入
     */
    
	public void addPages(){
		
		setWindowTitle("Web发布向导");
		
		setBasicConfigure = new SetBasicConfigureWizardPage("");
		setBasicConfigure.setModelPath("D:\\Process2\\runtime-New_configuration");
		setBasicConfigure.setOutputPath("D:\\Process2");
		addPage(setBasicConfigure);
		
		setPropertyViewPage = new SetPropertyViewPage("");
		addPage(setPropertyViewPage);

		setLabelViewPage = new SetLabelViewWizardPage("");
		addPage(setLabelViewPage);

	}
	

    /**
     * 改写父类的canFinish方法，由此方法判断“完成”按钮何时可用、不可用
     * 
     * @return false“完成”按钮不可用，true则相反
     */
//    public boolean canFinish() {
//        //设置为：当还没到最后一页时“完成”按钮不可用
//        if (this.getContainer().getCurrentPage() != setWebFramePage)
//            return false;
//        return super.canFinish();
//    }
	
	
	public void init(IWorkbench workbench, IStructuredSelection selection){
	
		initialSelection = selection;
	}
	
	
	/*
     * 
     * 改写父类的performFinish方法，当单击“完成”按钮时，将执行此方法
     */
    public boolean performFinish() {
    	getModelPath();
    	getOutputPath();
    	getFormatTag();
    	getArrangeTag();
    	getPopTag();
    	getPropertyViewTag();
    	getBackColor();
    	getFrameColor();
    	getFontColor();
    	
//    	ProgressBar proBar = setLabelViewPage.getProgressBar();
//    	proBar.setVisible(true);
    	
    	performWebPublish();
//    	getFont();
        return true;
    }
	
	
    private void performOperation (IProgressMonitor monitor){
//		ExtractedString[] extracted = setWebFramePage.getSelection();
	}
	
	private void getModelPath(){
		modelPath = setBasicConfigure.getModelPath();
	}
	private void getOutputPath(){
		outputPath = setBasicConfigure.getOutputPath();
	}
	private void getFormatTag(){
		formatTag = setBasicConfigure.getFormatTag();
	}
	private void getArrangeTag(){
		arrangeTag = setBasicConfigure.getArrangeTag();
	}
	private void getPopTag() {
		popTag = setBasicConfigure.getPopTag();
	}
	private void getPropertyViewTag(){
		propertyViewTag = setPropertyViewPage.getPropertyViewTag();
	}
	private void getBackColor(){
		String redStr;
		String greenStr;
		String blueStr;
		backColor = setLabelViewPage.getBackColor();
		int red = backColor.red;
		if(red < 16){
			redStr = "0" + Integer.toHexString(red);
		}else{
			redStr = Integer.toHexString(red);
		}
		int green = backColor.green;
		if(green < 16){
			greenStr = "0" + Integer.toHexString(green);
		}else{
			greenStr = Integer.toHexString(green);
		}
		int blue = backColor.blue;
		if(blue < 16){
			blueStr = "0" + Integer.toHexString(blue);
		}else{
			blueStr = Integer.toHexString(blue);
		}
		
		backColorStr = "#" + redStr + greenStr + blueStr;
	}
	private void getFrameColor(){
		String redStr;
		String greenStr;
		String blueStr;
		frameColor = setLabelViewPage.getFrameColor();
		int red = frameColor.red;
		if(red < 16){
			redStr = "0" + Integer.toHexString(red);
		}else{
			redStr = Integer.toHexString(red);
		}
		int green = frameColor.green;
		if(green < 16){
			greenStr = "0" + Integer.toHexString(green);
		}else{
			greenStr = Integer.toHexString(green);
		}
		int blue = frameColor.blue;
		if(blue < 16){
			blueStr = "0" + Integer.toHexString(blue);
		}else{
			blueStr = Integer.toHexString(blue);
		}
		
		frameColorStr = "#" + redStr + greenStr + blueStr;
	}
	private void getFontColor(){
		String redStr;
		String greenStr;
		String blueStr;
		fontColor = setLabelViewPage.getFontColor();
		int red = fontColor.red;
		if(red < 16){
			redStr = "0" + Integer.toHexString(red);
		}else{
			redStr = Integer.toHexString(red);
		}
		int green = fontColor.green;
		if(green < 16){
			greenStr = "0" + Integer.toHexString(green);
		}else{
			greenStr = Integer.toHexString(green);
		}
		int blue = fontColor.blue;
		if(blue < 16){
			blueStr = "0" + Integer.toHexString(blue);
		}else{
			blueStr = Integer.toHexString(blue);
		}
		
		fontColorStr = "#" + redStr + greenStr + blueStr;
	}
	private void getFont(){
		font = setLabelViewPage.getViewFont();
		System.out.println(font);
	}
	
	private void performWebPublish(){
		
		final String webProjectPath = modelPath;
		int last = webProjectPath.lastIndexOf("\\");
		final String projectName = webProjectPath.substring(last + 1);
		String projectType = "";
		if (projectName.contains("process")){
			projectType = "过程模型";
		}else if(projectName.contains("organization")){
			projectType = "组织模型";
		}else{
			projectType = "资源模型";
		}
		
		String projectPath;
		String workSpacePath;
		
		IWorkspace workSpace = ResourcesPlugin.getWorkspace();
		
		IWorkspaceRoot root = workSpace.getRoot();
		String test = root.getLocation().toOSString();
		
//		IPath path = root.getLocation().append(projectType).append(projectName).append(".project");
//		IProjectDescription description = null;;
//		try {
//			description = workSpace.loadProjectDescription(path);
//		} catch (CoreException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
//		IProject project= root.getProject(projectName+".process");
//		try {
//			project.setDescription(description, new NullProgressMonitor());
//			project.open(new NullProgressMonitor());
//		} catch (CoreException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		IPath path1 = root.getLocation().append(projectType).append(projectName).append(".project");
		IProjectDescription description;
		try {
			description = workSpace.loadProjectDescription(path1);
			IProject project=root.getProject(description.getName());
			project.create(description, new NullProgressMonitor());
			project.open(new NullProgressMonitor());
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//project.setDescription(description, new NullProgressMonitor());
		
		
	//	IProject project = root.getProject(projectType);
//		Iproject pro = project1.getFile(path);
//		String proPath = typeProject.getLocation().toOSString();
//		IProject project = (IProject) typeProject.findMember(projectName);
	
//		try {
//			project.create(null);
//			project.open(null);
//			project.getDescription();
//		} catch (CoreException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		projectPath = workSpace.getRoot().getLocation().toOSString(); 
		workSpacePath = projectPath.substring(0, projectPath.lastIndexOf("\\"));
		
		//the method to get the path for plugin
		String pluginPath;
		String pluginId = "newPmbe.web";
		
	    try {
	    	pluginPath = FileLocator.toFileURL(
	               Platform.getBundle(pluginId).getEntry("")).getPath();
	    	pluginPath = pluginPath.substring(pluginPath.indexOf("/") + 1, pluginPath.length());
	    	pluginPath = pluginPath.replaceAll("/", "\\\\");
	    } catch (IOException e) {
	    	pluginPath = "";
	        e.printStackTrace();
	    }
	  	
		
		
		String imageFormat = null;
	
		if(formatTag == 1){
			imageFormat = "JPG";
		}
		else if (formatTag == 2){
			imageFormat = "SVG";
		}
						
		//build the web folder for saving web files
		
		File webFile = new File(this.outputPath + "\\web发布");
		webFile.mkdir();
		
		File formatFile = new File(this.outputPath + "\\web发布" + "\\" + projectType);
		formatFile.mkdir();
		
		File projectFile = new File(this.outputPath + "\\web发布" + "\\" + projectType + "\\" + projectName);
		projectFile.mkdir();
		/*
		 * Choose project to create webs
		 */
		
		
/*		File[] projectList = projectFile.listFiles();
		for(int i  = 0; i < projectList.length; i ++)
		{
			File webFile = new File(workSpacePath + "\\web\\" + projectList[i].getName());
		}
*/
		
		
		AllPath ap = new AllPath(this.modelPath,
				this.outputPath + "\\web发布" + "\\" + projectType + "\\" + projectName, 
				pluginPath + "icons", pluginPath + "jsFile", 
				formatTag, propertyViewTag, arrangeTag, popTag,
				backColorStr, frameColorStr, fontColorStr);
	
		ap.buildInfo();
		
		/*
		 * open index.html automatically
		 */
		
		if (popTag == true){
			try
					{  
				String filePath = this.outputPath + "\\web发布\\" + projectType + "\\" + projectName + "\\index.html";
				filePath = filePath.replaceAll(" ", "\" \"");
				Process  process =  Runtime.getRuntime().exec("cmd.exe  /c  start  " + filePath);  
			}
				catch(Exception  e)
			{
				e.printStackTrace();
			} 
		}
		
//		try
//		{	
//			
//			ProgressMonitorDialog pmd = new ProgressMonitorDialog(null);
//			IRunnableWithProgress rwp = new IRunnableWithProgress(){
//		
//			public void run(IProgressMonitor monitor) throws InvocationTargetException, 
//																InterruptedException
//			{
//				monitor.beginTask("Web Publishing...", 4);
//				
//				//get the path for the project and work space
//				String projectPath;
//				String workSpacePath;
//		//		File projectFile = (File) ResourcesPlugin.getWorkspace().getRoot().getLocation();
//				
//				projectPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString(); 
//				workSpacePath = projectPath.substring(0, projectPath.length() - 26);
//				
//								
//				//build the web folder for saving web files
//				File f = new File(workSpacePath + "\\web");
//				f.mkdir();
//				
//				File webFile = new File(workSpacePath + "\\web" + projectName);
//				webFile.mkdir();
//				/*
//				 * Choose project to create webs
//				 */
//				
//				
//		/*		File[] projectList = projectFile.listFiles();
//				for(int i  = 0; i < projectList.length; i ++)
//				{
//					File webFile = new File(workSpacePath + "\\web\\" + projectList[i].getName());
//				}
//		*/
//				
//				
//				AllPath ap = new AllPath(webProjectPath,
//						workSpacePath + "\\web" + projectName, 
//						workSpacePath + "\\CorrectSvg\\newPmbe.web\\icons", 
//						workSpacePath + "\\CorrectSvg\\newPmbe.web\\jsFile",
//						ResourcesPlugin.getWorkspace());
//			//	AllPath ap = new AllPath("e:\\testIpro\\过程实例", "e:\\testIpro\\web", "e:\\testIpro\\icons", "e:\\testIpro\\js", ResourcesPlugin.getWorkspace());
//				
//				
//				ap.buildInfo();
//				
//				for(int i = 0; i < 4; i++)
//				{
//					try{
//						Thread.sleep(1000);
//					}catch(Throwable e2){
//					}
//					monitor.worked(2);
//					monitor.done();
//				}
//				
//				/*
//				 * open index.html automatically
//				 */
//				try
//				{  
//					Process  process =  Runtime.getRuntime().exec
//										("cmd.exe  /c  start  " + 
//											workSpacePath + "\\web\\" + 
//											projectName + "\\index.html");  
//				}
//				catch(Exception  e)
//				{
//					e.printStackTrace();
//				} 
//			}	
//		};
//			
//			pmd.run(true, true, rwp);
//		}catch(Exception e3){
//					e3.printStackTrace();	
//		}
	}
}
