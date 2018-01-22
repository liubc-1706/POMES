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
	
		//�����������·����
//		Group modelGroup = new Group(container, 1);
//		GridData modelGridData = new GridData(GridData.FILL_HORIZONTAL);
//		modelGroup.setLayoutData(modelGridData);
//		modelGroup.setText("����ģ��");
		
		Group pathGroup = new Group(container, 1);
		GridData pathGridData = new GridData(GridData.FILL_HORIZONTAL);
		pathGroup.setLayoutData(pathGridData);
		pathGroup.setText("ѡ��ģ�ͺ�����·��");
		
		
		IWorkspace workSpace = ResourcesPlugin.getWorkspace();
		String projectPath = workSpace.getRoot().getLocation().toOSString();

		
		Label modelLabel = new Label(pathGroup, SWT.BOLD);
		modelLabel.setText("ѡ�񷢲�ģ��");
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
		
		
		DirectoryFieldEditor outputDFE = new DirectoryFieldEditor("","���÷���·��",pathGroup);
		outputDFE.setChangeButtonText("���...");
		outputPathText = outputDFE.getTextControl(pathGroup); 
		outputPathText.setText("");
        setPageComplete(false);
		outputPathText.addModifyListener(new ModifyListener(){
			public void modifyText(ModifyEvent e) {
				outputPathDataChanged(); //����ֵ�ĺϷ����ж�
            }
		});
		
		//�Զ�������ҳ
		Group popGroup = new Group(container,1);
		GridData popGridData = new GridData(GridData.FILL_HORIZONTAL);
		popGroup.setLayoutData(popGridData);
		popGroup.setText("������ҳ�Զ�����");
		
		popCheck = new Button(popGroup, SWT.CHECK);
		popCheck.setText("�����������Զ�������ҳ");
		popCheck.setLayoutData(popGridData);
		popCheck.setBounds(20, 20, 150, 30);
		popCheck.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				if(popCheck.getSelection() == true){
					setPopTag();
				}
			}
		});
		
		//�����Զ���ͼ��
//		Group layoutGroup = new Group(container,1);
//		GridData layoutGridData = new GridData(GridData.FILL_HORIZONTAL);
//		layoutGroup.setLayoutData(layoutGridData);
//		layoutGroup.setText("�Զ���ͼ");
//		
//		layoutCheck = new Button(layoutGroup, SWT.CHECK);
//		layoutCheck.setText("Ӧ���Զ���ͼ");
//		layoutCheck.setLayoutData(layoutGridData);
//		layoutCheck.setBounds(20, 20, 90, 30);
//		layoutCheck.addSelectionListener(new SelectionAdapter() {
//			public void widgetSelected(SelectionEvent e) {
//				if(layoutCheck.getSelection() == true){
//					setArrangeTag();
//				}
//			}
//		});
		
		//���÷�����ʽ��
		
//		Group formatGroup = new Group(container, 1);
//		GridData formatGridData = new GridData(GridData.FILL_HORIZONTAL);
//		formatGroup.setLayoutData(formatGridData);
//		formatGroup.setText("���÷�����ʽ");
//		
//		jpgRadio = new Button(formatGroup, SWT.RADIO);
//		jpgRadio.setSelection(true);
//		jpgRadio.setText("JPG��ʽ");
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
//		svgRadio.setText("SVG��ʽ");
//		svgRadio.setBounds(150, 20, 60, 30);
//		svgRadio.addSelectionListener(new SelectionAdapter(){
//			public void widgetSelected(SelectionEvent event) {
//				setFormatTag();
//				setNextPageSVG();
//			}
//		});
	    
		
		setTitle("web������������");
		setMessage("�����web������������", INFORMATION);
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
			if(radio.getText() == "��������ʾ"){
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
			if(radio.getText().equals("���Ա�ǩ��ʾ")){
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
	        setErrorMessage("ģ��·������Ϊ��"); //��ʾ������Ϣ
	        setPageComplete(false); //ʹ����ɡ��͡���һ��������ť������
	        return;
	    }else if(!modelFile.exists()){
	    	tag = 3;
	    	setErrorMessage("ģ�Ͳ�����");
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
			setErrorMessage("·�����ڵ�ǰWorkspace��"); //��ʾ������Ϣ
	        setPageComplete(false); //ʹ����ɡ��͡���һ��������ť������
	        return;
		}
		
		inputFinished = true;
		setErrorMessage(null); //�����Ի����ϵĳ�����ʾ����
	    if(outputFinished == true)
			setPageComplete(true); //ʹ����ɡ��͡���һ��������ť����
		
	}
	
	private void outputPathDataChanged() {
		
		if (outputPathText.getText().length() == 0) {
            setErrorMessage("���·������Ϊ��"); //��ʾ������Ϣ
            setPageComplete(false); //ʹ����ɡ��͡���һ��������ť������
            return;
        }
		String outputPath = outputPathText.getText();
		File outFile = new File(outputPath);
		if (!outFile.exists()){
			setErrorMessage("���·��������"); //��ʾ������Ϣ
            setPageComplete(false); //ʹ����ɡ��͡���һ��������ť������
            return;
		}
		
		outputFinished = true;
		setErrorMessage(null); //�����Ի����ϵĳ�����ʾ����
//		if(inputFinished == true)
			setPageComplete(true); //ʹ����ɡ��͡���һ��������ť����
		
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
			if (tmp.getName().equals("����ģ��")){
				File[] proPros = tmp.listFiles();
				for (int k = 0; k<proPros.length; k++){
					File proPro = proPros[k];
					elements.add(proPro);
				}
			}else if (tmp.getName().equals("��֯ģ��")){
				File[] orgPros = tmp.listFiles();
				for (int k = 0; k<orgPros.length; k++){
					File orgPro = orgPros[k];
					elements.add(orgPro);
				}
			}else if (tmp.getName().equals("��Դģ��")){
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
