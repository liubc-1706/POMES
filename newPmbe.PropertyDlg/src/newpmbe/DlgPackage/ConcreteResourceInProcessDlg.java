package newpmbe.DlgPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
//import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

import vpml.EMDiagram;
import vpml.organizationpackage.EMODiagram;
import vpml.processpackage.EMPDiagram;
import vpml.resourcepackage.*;

public class ConcreteResourceInProcessDlg extends Dialog {
	private Text codeText;
	private Text usageText;
	private CCombo nameCombo;
	private Text efficiencyTxt;
	private Text aviliableTxt;
	private Text totalTxt;
	private Text priceTxt;

	private String name;
	private String code;
	private String description;
	private int	total;
	private int usage;
	private int aviliable;
	private double price;
	private double efficiency;
	private EMRBasicResourceType basicrt;
	private EList resource;
	private EMRDiagram diagram;
//	private EMPDiagram pdiagram;
//	private String filename = null;
//	private EList emrdiagram = null;

	/**
	 * 资源类型：	1：角色
	 * 		   	2：场所
	 * 			3：设备
	 * 			4：工具
	 */
	private int resourceType;
	private IFile processFile;
	

	private void LoadResource()
	{
		
//		PropertyUtility.GetDiagramObject(processFile.getFullPath().toString());
		IFile recordFile = processFile.getProject().getFile(".rsrecord");
		if(!recordFile.exists()){
			resource = null;
			return;
		}
		diagram = (EMRDiagram)getResourceDiagram(recordFile);
		//假设该recordFile存在
		
	switch(resourceType)
		{
		case 1:		
//			pdiagram = ((EMRRole) basicrt).getEmpDiagram();
//			emrdiagram = pdiagram.getEmrDiagrams();
//			if (emrdiagram != null && emrdiagram.size() > 0)
//			{
//				diagram = (EMRDiagram)emrdiagram.get(0); 
			if(diagram != null){
				resource = diagram.getRoles();
			}
			else
				resource = null;
			break;
		case 2:
//			pdiagram = ((EMRLocationType) basicrt).getEmpDiagram();
//			emrdiagram = pdiagram.getEmrDiagrams();
//			if (emrdiagram != null && emrdiagram.size() > 0)
//			{	
//				diagram = (EMRDiagram)emrdiagram.get(0); 
			if(diagram != null){
				resource = diagram.getLocationTypes();
			}
			else
				resource = null;
			break;
		case 3:
//			pdiagram = ((EMRMachineType) basicrt).getEmpDiagram();
//			emrdiagram = pdiagram.getEmrDiagrams();
//			if (emrdiagram != null && emrdiagram.size() > 0)
//			{
//				diagram = (EMRDiagram)emrdiagram.get(0); 
			
			if(diagram != null){
				resource = diagram.getMachineTypes();
			}
			else
				resource = null;
			break;
		case 4:
//			pdiagram = ((EMRToolType) basicrt).getEmpDiagram();
			
			
//			emrdiagram = pdiagram.getEmrDiagrams();
//			if (emrdiagram != null && emrdiagram.size() > 0)
//			{
			if(diagram != null){
//				diagram = (EMRDiagram)emrdiagram.get(0); 
				resource = diagram.getToolTypes();
			}
			else
				resource = null;
			break;
		default:
			resource = null;
			break;
		}
	}

	/**
	 * Create the dialog
	 * @param parentShell
	 */
	public ConcreteResourceInProcessDlg(Shell parentShell) {
		super(parentShell);
	}

	public ConcreteResourceInProcessDlg(Shell parent, EObject obj){
		this(parent);
		basicrt = (EMRBasicResourceType)obj;
		if (basicrt instanceof EMRRole)
		{
			resourceType = 1;
		}
		if (basicrt instanceof EMRLocationType)
		{
			resourceType = 2;
		}
		if(basicrt instanceof EMRMachineType)
		{
			resourceType = 3;
		}
		if (basicrt instanceof EMRToolType)
		{
			resourceType = 4;
		}
		
	} 
	public ConcreteResourceInProcessDlg(Shell parent, EObject obj, IFile processFile){
		this(parent, obj);
		this.processFile = processFile;
	} 
	/**
	 * Create contents of the dialog
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite topComp=new Composite(parent,SWT.NONE);
		
		final TabFolder tabFolder = new TabFolder(topComp, SWT.NONE);
		
		tabFolder.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, false));
		tabFolder.setBounds(15, 10,318, 245);

		final TabItem resItem = new TabItem(tabFolder, SWT.NONE);
		resItem.setText("资源描述");
		
		final Composite composite = new Composite(tabFolder, SWT.NONE);
		resItem.setControl(composite);

		final Label label = new Label(composite, SWT.NONE);
		label.setText("花费/单位:");
		label.setBounds(15, 159, 69, 12);

		priceTxt = new Text(composite, SWT.BORDER);
		priceTxt.setEditable(false);
		priceTxt.setBounds(105, 154, 80, 20);

		final Label label_1 = new Label(composite, SWT.NONE);
		label_1.setText("资源总数:");
		label_1.setBounds(15, 124, 69, 12);

		totalTxt = new Text(composite, SWT.BORDER);
		totalTxt.setEditable(false);
		totalTxt.setBounds(105, 119, 80, 20);

		final Label label_3 = new Label(composite, SWT.NONE);
		label_3.setText("使用数量/活动:");
		label_3.setBounds(15, 53, 89, 12);

		aviliableTxt = new Text(composite, SWT.BORDER);
		aviliableTxt.setEditable(false);
		aviliableTxt.setBounds(105, 85, 80, 20);

		final Label label_4 = new Label(composite, SWT.NONE);
		label_4.setText("效率:");
		label_4.setBounds(198, 53, 30, 12);

		efficiencyTxt = new Text(composite, SWT.BORDER);
		efficiencyTxt.setEditable(false);
		efficiencyTxt.setBounds(232, 50, 39, 20);

		final Label label_5 = new Label(composite, SWT.NONE);
		label_5.setText("%");
		label_5.setBounds(280, 53, 17, 12);

		final Label namelab = new Label(composite, SWT.NONE);
		namelab.setText("名称:");
		namelab.setBounds(15, 18, 49, 12);

		nameCombo = new CCombo(composite, SWT.BORDER);
		nameCombo.setEditable(false);
		nameCombo.setBounds(70, 15, 215, 20);
		
		nameCombo.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				int index = nameCombo.getSelectionIndex();
				ChangeDisplay(index);
			}
		});

		final Label label_2 = new Label(composite, SWT.NONE);
		label_2.setText("可用数量:");
		label_2.setBounds(15, 89, 52, 13);

		usageText = new Text(composite, SWT.BORDER);
		usageText.setBounds(105, 50, 80, 20);

		final Label codeLabel = new Label(composite, SWT.NONE);
		codeLabel.setText("编码:");
		codeLabel.setBounds(15, 195, 39, 13);

		codeText = new Text(composite, SWT.BORDER);
		codeText.setEditable(false);
		codeText.setBounds(105, 192, 80, 20);
		codeText.setText("");
		
		LoadData();
		return topComp;
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

	protected void LoadData()
	{
		LoadResource();
		int index = -1;
		EMRBasicResourceType obj = null;
		if (resource != null)
		{
			Iterator iter = resource.iterator();

			while(iter.hasNext())
			{
				obj = (EMRBasicResourceType)(iter.next());
				String name = obj.getName();	
				//避免未命名的资源被引用
				if(name != null){
					index++;
					nameCombo.add(name, index);
					nameCombo.setData("" + index, obj);
				}
			}
		}
		if (basicrt.getName() != null)
		{
			if(obj != null)
				name = obj.getName();
			int count = nameCombo.getItemCount();
			for (index = 0; index < count; index++)
			{
				obj = (EMRBasicResourceType)nameCombo.getData(""+index);
				if (obj.getName().equals(basicrt.getName()))
				{
					nameCombo.select(index);
					break;
				}
			}
			if (obj != null)
			{
				codeText.setText(PropertyUtility.GetValue(obj.getCode()));
				totalTxt.setText(PropertyUtility.GetParamValue(obj.getTotalAmount()));
				aviliableTxt.setText(PropertyUtility.GetParamValue(obj.getAvailableAmount()));
				priceTxt.setText(PropertyUtility.GetParamValue(obj.getCostPerUnit()));
				usageText.setText(PropertyUtility.GetParamValue(basicrt.getUsageAmount()));
				efficiencyTxt.setText((new Double(obj.getEfficiency()*100)).toString());
			}
			else
			{
				totalTxt.setText((new Integer(1)).toString());
				aviliableTxt.setText((new Integer(1)).toString());
				priceTxt.setText((new Double(10.0)).toString());
				usageText.setText(new Integer(0).toString());
				efficiencyTxt.setText((new Double(1.0 * 100)).toString());
			}
		}
		else
		{
			nameCombo.select(0);
			ChangeDisplay(0);
		}

	}
	
	protected void DefaultSet()
	{
		totalTxt.setText((new Integer(1)).toString());
		aviliableTxt.setText((new Integer(1)).toString());
		usageText.setText((new Integer(0)).toString());
		priceTxt.setText((new Double(10.0)).toString());
		efficiencyTxt.setText((new Double(1.0 * 100)).toString());
	}			

	protected void ChangeDisplay(int index)
	{
		EMRBasicResourceType obj = (EMRBasicResourceType)nameCombo.getData(""+index);
		if (obj == null)
		{
			DefaultSet();
			return;
		}
		name = obj.getName();
		codeText.setText(PropertyUtility.GetValue(obj.getCode()));
		totalTxt.setText(PropertyUtility.GetParamValue(obj.getTotalAmount()));
		aviliableTxt.setText(PropertyUtility.GetParamValue(obj.getAvailableAmount()));
		usageText.setText(PropertyUtility.GetParamValue(obj.getUsageAmount()));
		priceTxt.setText(PropertyUtility.GetParamValue(obj.getCostPerUnit()));
		efficiencyTxt.setText((new Double(obj.getEfficiency()*100)).toString());
	}
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		String title = null;
		if(basicrt.getName() == null)
			title = "未命名";
		else
			title = basicrt.getName();
		newShell.setText("规格说明：" + title);
	}
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) 
		{
			boolean flag = false;
			if(nameCombo.getSelectionIndex() == -1){
				//no item was selected
				MessageDialog.openInformation(this.getShell(), "没有选中资源","没有选中资源，请首先关联资源！");
				flag = true;
			}
			else{
				Object object = nameCombo.getData(""+nameCombo.getSelectionIndex());
				EMRBasicResourceType obj = (EMRBasicResourceType)object;
				int avaliableAmount = obj.getAvailableAmount().intValue();
				if(new Integer(usageText.getText()).intValue() > avaliableAmount){
					MessageDialog.openWarning(this.getShell(), "无效数据", "没有足够的资源，请重新设置！");
					return;
				}
			}
			if(flag == false){
				if(usageText.getText()!= null && usageText.getText().equals("")){
					MessageDialog.openWarning(this.getShell(), "无效数据", "请输入使用资源的数量！");
					return;
				}
			}
			//changed by zhangpeng-->verify the data
			try{
				int total = new Integer(totalTxt.getText()).intValue();
				int aviliable = new Integer(aviliableTxt.getText()).intValue();
				int usage = new Integer(usageText.getText()).intValue();
				double price = new Double(priceTxt.getText()).doubleValue();
				double efficiency = new Double(efficiencyTxt.getText()).doubleValue()/100;

				if(total < 0 || aviliable < 0 || price < 0 || usage < 0 || efficiency < 0)
				{
					MessageDialog.openWarning(this.getShell(), "无效数据", "数值不能为负！");
					return;
				}
				if(efficiency > 1){
					MessageDialog.openWarning(this.getShell(), "无效数据", "效率不能超过100%！");
					return;
				}
				this.setTotal(total);
				this.setName(name);
				this.setAviliable(aviliable);
				this.setUsage(usage);
				this.setPrice(price);
				this.setEfficiency(efficiency);
			}catch(NumberFormatException e){
				String[] strs = e.getMessage().split("\"");
				MessageDialog.openWarning(this.getShell(), "无效数据", "输入\""+strs[1]+"\"有误，请您重新设置相应的值！");
				return;
			}
			this.setCode(codeText.getText());
			//end changed by zhangpeng

			
//			//changed by zhangpeng-->verify the data
//			try{
//				this.setTotal(new Integer(totalTxt.getText()));
//				this.setAviliable(new Integer(aviliableTxt.getText()));
//				this.setPrice(new Double(priceTxt.getText()));
//				this.setEfficiency((new Double(efficiencyTxt.getText())/100.0));
//			}catch(NumberFormatException e){
//				MessageDialog.openWarning(this.getShell(), "无效数据", e.getMessage());
//				return;
//			}
//			//end changed by zhangpeng
		}
	super.buttonPressed(buttonId);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * Return the initial size of the dialog
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(355, 337);
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getUsage() {
		return usage;
	}

	public void setUsage(int usage) {
		this.usage = usage;
	}

	public int getAviliable() {
		return aviliable;
	}

	public void setAviliable(int aviliable) {
		this.aviliable = aviliable;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}
	public EMDiagram getResourceDiagram(IFile recordFile){
//		Boolean isExist = false;
		EMDiagram emDiagram = null;
		//先读入，看有没有此条目
		 try { 
			 FileReader fr = new FileReader(recordFile.getRawLocation().toFile());
			        BufferedReader br = new BufferedReader(fr);
			        String record = new String();
			        while ((record = br.readLine()) != null) {
			        	String strs[] = record.split("=");
			        	if(strs[0].equals(processFile.getName())
			        			&& strs[1].equals(processFile.getRawLocation().toString())){
			        	//已经包含了此条目，则修改此条目
//			        		isExist = true;
			        		emDiagram = (EMDiagram)PropertyUtility.GetDiagramObject(strs[2]);
			        		break;
			        	}
			 }
			 br.close();
			 fr.close(); 
	      } catch (IOException e) { 
	          System.out.println("IO错误：读写操作失败");
	          e.printStackTrace();
	      }
	      return emDiagram;
	}
}
