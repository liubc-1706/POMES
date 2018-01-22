package newpmbe.web.part;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.model.WorkbenchContentProvider;

public class SetBasicConfigureWizardPage extends WizardPage{
	
	private Combo modelCombo;
	private List modelList = new ArrayList(); 
	private Text modelPathText;
	private String modelPath;
	private Text outputPathText;
	private String outputPath;
	
	private Button layoutCheck;
	private Button popCheck;
	private boolean arrangeTag = false;
	private boolean popTag = false;

	private Button jpgRadio;
	private Button svgRadio; 
	private int formatTag = 1;
	
	private boolean inputFinished = false;
	private boolean outputFinished = false;
	
	
	protected SetBasicConfigureWizardPage(String pageName) {
		super(pageName);
	}

	public void createControl(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout gridLayout = new GridLayout();
		container.setLayout(gridLayout);	
	
		//设置输入输出路径向导
//		Group modelGroup = new Group(container, 1);
//		GridData modelGridData = new GridData(GridData.FILL_HORIZONTAL);
//		modelGroup.setLayoutData(modelGridData);
//		modelGroup.setText("发布模型");
		
		Group pathGroup = new Group(container, 1);
		GridData pathGridData = new GridData(GridData.FILL_HORIZONTAL);
		pathGroup.setLayoutData(pathGridData);
		pathGroup.setText("选择模型和设置路径");
		
		
		IWorkspace workSpace = ResourcesPlugin.getWorkspace();
		String projectPath = workSpace.getRoot().getLocation().toOSString();

		
		Label modelLabel = new Label(pathGroup, SWT.BOLD);
		modelLabel.setText("选择发布模型");
		modelLabel.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,1));
		modelCombo = new Combo(pathGroup, SWT.READ_ONLY);
		modelCombo.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,2));
		modelList = getProjectsFromWorkspace();
		for(int i=0; i<modelList.size(); i++){
			if (modelList.get(i) instanceof File){
				File modelFile = (File) modelList.get(i);
				modelCombo.add(modelFile.getName());
			}else if(modelList.get(i) instanceof Project){
				Project modelProject = (Project)modelList.get(i);
				modelCombo.add(modelProject.getName());
			}
		}
		modelCombo.select(0);
		String modelName = modelCombo.getText();
		for (int i=0; i<modelList.size(); i++){
			File modelFile = (File) modelList.get(i);
			if (modelFile.getName().equals(modelName)){
				modelPath = ((File)modelList.get(i)).getPath();
				break;
			}
		}
		modelCombo.addModifyListener(new ModifyListener(){
			public void modifyText (ModifyEvent e){
				modelDataChanged();
			}
		});
		
		
		DirectoryFieldEditor outputDFE = new DirectoryFieldEditor("","设置发布路径",pathGroup);
		outputDFE.setChangeButtonText("浏览...");
		outputPathText = outputDFE.getTextControl(pathGroup); 
		outputPathText.setText("");
        setPageComplete(false);
		outputPathText.addModifyListener(new ModifyListener(){
			public void modifyText(ModifyEvent e) {
				outputPathDataChanged(); //输入值的合法性判断
            }
		});
		
		//自动弹出网页
		Group popGroup = new Group(container,1);
		GridData popGridData = new GridData(GridData.FILL_HORIZONTAL);
		popGroup.setLayoutData(popGridData);
		popGroup.setText("设置网页自动弹出");
		
		popCheck = new Button(popGroup, SWT.CHECK);
		popCheck.setText("发布结束后自动弹出网页");
		popCheck.setLayoutData(popGridData);
		popCheck.setBounds(20, 20, 150, 30);
		popCheck.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				if(popCheck.getSelection() == true){
					setPopTag();
				}
			}
		});
		
		//设置自动布图向导
//		Group layoutGroup = new Group(container,1);
//		GridData layoutGridData = new GridData(GridData.FILL_HORIZONTAL);
//		layoutGroup.setLayoutData(layoutGridData);
//		layoutGroup.setText("自动布图");
//		
//		layoutCheck = new Button(layoutGroup, SWT.CHECK);
//		layoutCheck.setText("应用自动布图");
//		layoutCheck.setLayoutData(layoutGridData);
//		layoutCheck.setBounds(20, 20, 90, 30);
//		layoutCheck.addSelectionListener(new SelectionAdapter() {
//			public void widgetSelected(SelectionEvent e) {
//				if(layoutCheck.getSelection() == true){
//					setArrangeTag();
//				}
//			}
//		});
		
		//设置发布格式向导
		
//		Group formatGroup = new Group(container, 1);
//		GridData formatGridData = new GridData(GridData.FILL_HORIZONTAL);
//		formatGroup.setLayoutData(formatGridData);
//		formatGroup.setText("设置发布格式");
//		
//		jpgRadio = new Button(formatGroup, SWT.RADIO);
//		jpgRadio.setSelection(true);
//		jpgRadio.setText("JPG格式");
//		jpgRadio.setBounds(20, 20, 60, 30);
//		jpgRadio.addSelectionListener(new SelectionAdapter(){
//			public void widgetSelected(SelectionEvent event) {
//				setFormatTag();
//				setNextPageJPG();
//			}
//		});
//		
//		svgRadio = new Button(formatGroup, SWT.RADIO);
//		svgRadio.setSelection(false);
//		svgRadio.setText("SVG格式");
//		svgRadio.setBounds(150, 20, 60, 30);
//		svgRadio.addSelectionListener(new SelectionAdapter(){
//			public void widgetSelected(SelectionEvent event) {
//				setFormatTag();
//				setNextPageSVG();
//			}
//		});
	    
		
		setTitle("web发布基本设置");
		setMessage("请进行web发布基本设置", INFORMATION);
	    setControl(container);
	}
	
	
	
	protected void setPopTag() {
		// TODO Auto-generated method stub
		popTag = true;
	}

	public void setModelPath(String str){
		modelPath = str;
	}
	
	public void setOutputPath(String str){
		outputPath = str;
	}
	
	private void setArrangeTag(){
		arrangeTag = true;
	}
	
	private void setFormatTag(){
		if(jpgRadio.getSelection() == true){
			formatTag = 1;
		}else if (svgRadio.getSelection() == true){
			formatTag = 2;
		}
	}
	
	private void setNextPageSVG(){
		IWizardPage nextPage = getNextPage();
		Composite conNext = (Composite) nextPage.getControl();
	
		Control[] controls = conNext.getChildren();
		Group group = (Group) controls[0];
		Control[] cons = group.getChildren();
		for(int i=0; i<cons.length; i++){
			Button radio = (Button) cons[i];
			if(radio.getText() == "属性栏显示"){
				radio.setSelection(true);
				radio.setEnabled(false);
			}else{
				radio.setSelection(false);
				radio.setEnabled(false);
			}
		}
		IWizardPage nextNext = getNextPage().getNextPage();
		Composite conNextNext = (Composite) nextNext.getControl();
		Control[] consNext = conNextNext.getChildren();
		for(int j=0; j<consNext.length; j++){
			consNext[j].setEnabled(false);
		}
	}
	
	private void setNextPageJPG(){
		IWizardPage nextPage = getNextPage();
		Composite conNext = (Composite) nextPage.getControl();
	
		Control[] controls = conNext.getChildren();
		Group group = (Group) controls[0];
		Control[] cons = group.getChildren();
		
		for(int i=0; i<cons.length; i++){
			Button radio = (Button) cons[i];
			radio.setEnabled(true);
			if(radio.getText().equals("属性标签显示")){
				radio.setSelection(true);
				radio.setEnabled(true);
			}else{
				radio.setSelection(false);
				radio.setEnabled(true);
			}
		}
		
		IWizardPage nextNext = getNextPage().getNextPage();
		Composite conNextNext = (Composite) nextNext.getControl();
		Control[] consNext = conNextNext.getChildren();
		for(int j=0; j<consNext.length; j++){
			consNext[j].setEnabled(false);
		}
	}
	
	public String getModelPath(){
		String modelName = modelCombo.getText();
		for (int i=0; i<modelList.size(); i++){
		//	Object ob = modelList.get(i);
			if (modelList.get(i) instanceof File){
				File modelFile = (File) modelList.get(i);
				if (modelFile.getName().equals(modelName)){
					modelPath = modelFile.getPath();
					break;
				}
			}else if (modelList.get(i) instanceof Project){
				Project modelPro = (Project)modelList.get(i);
				if (modelPro.getName().equals(modelName)){
					modelPath = modelPro.getLocation().toOSString();
					break;
				}
			}
		}
		return modelPath;
	}
	
	public String getOutputPath(){
		outputPath = outputPathText.getText();
		return outputPath;
	}
	
	public boolean getArrangeTag(){
		return arrangeTag;
	}
	
	public int getFormatTag(){
		return formatTag;
	}
	
	public boolean getPopTag(){
		return popTag;
	}
	
	private void updatePageComplete(){
		
	}
	
	private void modelDataChanged (){
		String modelName = modelCombo.getText();
		for (int i=0; i<modelList.size(); i++){
			File modelFile = (File) modelList.get(i);
			if (modelFile.getName().equals(modelName)){
				modelPath = modelFile.getPath();
				break;
			}
		}
		
		if(outputFinished == true)
			setPageComplete(true);
	}
	
	private void modelPathDataChanged() {
	
		int tag = 1;
		
		File modelFile = new File(modelPathText.getText());
		if(modelPathText.getText().length() == 0) {
//			tag = 2;
	        setErrorMessage("模型路径不能为空"); //提示错误信息
	        setPageComplete(false); //使“完成”和“下一步”两按钮不可用
	        return;
	    }else if(!modelFile.exists()){
	    	tag = 3;
	    	setErrorMessage("模型不存在");
			setPageComplete(false);
			return;
	    }
		
		IWorkspace workSpace = ResourcesPlugin.getWorkspace();
		String projectPath = workSpace.getRoot().getLocation().toOSString();
		File[] projectTypeFiles = new File(projectPath).listFiles();

		String modelPath = modelPathText.getText();
		String modelTypePath = modelPath.substring(0, modelPath.lastIndexOf("\\"));
		
		int fileNum = projectTypeFiles.length;
		while (fileNum > 0){
			File file = projectTypeFiles[fileNum-1];
			String filePath = file.getPath();
			if (filePath.equals(modelTypePath) && 
					!file.getName().equals(".metadata")){
				File[] projectFiles = file.listFiles();
				int flag = 0;
				int projectNum = projectFiles.length;
				while (projectNum > 0){
					File tmpFile = projectFiles[projectNum-1];
					String tmpPath = tmpFile.getPath();
					if (tmpPath.equals(modelPath)){
						tag = 0;
						break;
					}
					projectNum--;
				}
			}
			fileNum--;
		}
		
		if(tag == 1){
			setErrorMessage("路径不在当前Workspace下"); //提示错误信息
	        setPageComplete(false); //使“完成”和“下一步”两按钮不可用
	        return;
		}
		
		inputFinished = true;
		setErrorMessage(null); //消除对话框上的出错提示文字
	    if(outputFinished == true)
			setPageComplete(true); //使“完成”和“下一步”两按钮可用
		
	}
	
	private void outputPathDataChanged() {
		
		if (outputPathText.getText().length() == 0) {
            setErrorMessage("输出路径不能为空"); //提示错误信息
            setPageComplete(false); //使“完成”和“下一步”两按钮不可用
            return;
        }
		String outputPath = outputPathText.getText();
		File outFile = new File(outputPath);
		if (!outFile.exists()){
			setErrorMessage("输出路径不存在"); //提示错误信息
            setPageComplete(false); //使“完成”和“下一步”两按钮不可用
            return;
		}
		
		outputFinished = true;
		setErrorMessage(null); //消除对话框上的出错提示文字
//		if(inputFinished == true)
			setPageComplete(true); //使“完成”和“下一步”两按钮可用
		
	}
	
	private GridData createGridData(int style,int horizontalSpan){
		GridData gridData=new GridData(style);
		gridData.horizontalSpan=horizontalSpan;
		return gridData;
	}
	
	public static List getProjectsFromWorkspace(){
		List list = new ArrayList();		
		List elements = new ArrayList();
		String proNameStr = null;

		IWorkspace workSpace = ResourcesPlugin.getWorkspace();
		String projectPath = workSpace.getRoot().getLocation().toOSString();
		File[] projectTypeFiles = new File(projectPath).listFiles();
		for(int i=0; i<projectTypeFiles.length; i++){
			File tmp = projectTypeFiles[i];
			if (tmp.getName().equals("过程模型")){
				File[] proPros = tmp.listFiles();
				for (int k = 0; k<proPros.length; k++){
					File proPro = proPros[k];
					elements.add(proPro);
				}
			}else if (tmp.getName().equals("组织模型")){
				File[] orgPros = tmp.listFiles();
				for (int k = 0; k<orgPros.length; k++){
					File orgPro = orgPros[k];
					elements.add(orgPro);
				}
			}else if (tmp.getName().equals("资源模型")){
				File[] resPros = tmp.listFiles();
				for (int k = 0; k<resPros.length; k++){
					File resPro = resPros[k];
					elements.add(resPro);
				}
			}
		}
		
		
		List tmpList = new ArrayList();
		ITreeContentProvider myWorkbenchContentProvider = new WorkbenchContentProvider();
		Object[] treeElements = myWorkbenchContentProvider
				.getElements(ResourcesPlugin.getWorkspace().getRoot());
		
		for (int j = 0; j < treeElements.length; j++)
			if (treeElements[j] instanceof Project){
				String proName = ((Project)treeElements[j]).getName();
				if(proName.endsWith(".process")||proName.endsWith(".organization")||proName.endsWith(".resource")){
					tmpList.add(((Project)treeElements[j]));
				}
			}
				
		
		File tmpFile = null;
		for (int j = 0; j < elements.size(); j++){
			tmpFile = (File) elements.get(j);
			proNameStr = tmpFile.getName();
			if(proNameStr.endsWith(".process") 
					|| proNameStr.endsWith(".organization") 
					|| proNameStr.endsWith(".resource"))
				list.add(tmpFile);
		}
		
		int listSize = list.size();
		for (int k=0; k<tmpList.size(); k++){
			Project treeFile = (Project) tmpList.get(k);
			boolean existTag = false;
			for (int n=0; n<listSize; n++){
				if (treeFile.getName().equals(((File)list.get(n)).getName())){
					existTag = true;
					break;
				}
			}
			if (existTag == false){
				list.add(treeFile);
			}
		}
//		ITreeContentProvider myWorkbenchContentProvider = new WorkbenchContentProvider();
//		Object[] element = myWorkbenchContentProvider
//				.getElements(ResourcesPlugin.getWorkspace().getRoot());
//		
//		for (int j = 0; j < element.length; j++)
//			if (element[j] instanceof Project){
//				if(((Project)element[j]).getName().endsWith(".process")
//						||((Project)element[j]).getName().endsWith(".organization")
//						||((Project)element[j]).getName().endsWith(".resource"))
//					list.add((Project)element[j]);
//			}
		return list;
	}
}
