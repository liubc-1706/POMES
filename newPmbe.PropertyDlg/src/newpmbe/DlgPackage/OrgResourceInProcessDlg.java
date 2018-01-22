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
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

import vpml.EMDiagram;
import vpml.organizationpackage.*;
import vpml.processpackage.EMPDiagram;
import vpml.resourcepackage.*;

/**
 * @see 组织视图中的角色在过程视图中的显示
 * @author Administrator
 *
 */
public class OrgResourceInProcessDlg extends Dialog {
	
	private Text usageText;
	private Text codeText;
	private CCombo nameCombo;
	private Text efficiencyTxt;
	private Text aviliableTxt;
	private Text totalTxt;
	private Text priceTxt;

	private String name;
	//added by zhangpeng
//	private String refId;
	
	private String description;
	private String code;
	private int	total;
	private int usage;
	private int aviliable;
	private double price;
	private double efficiency;
	private EMRRole basicrt;
	private EList resource;
	private EMODiagram diagram;
//	private EMPDiagram pdiagram;
//	private EList	emodiagram;
	
	
	private IFile processFile;

	private void LoadResource()
	{
//		PropertyUtility.GetDiagramObject(processFile.getFullPath().toString());
		IFile recordFile = processFile.getProject().getFile(".orgrecord");
		if(!recordFile.exists()){
			resource = null;
			return;
		}
		diagram = (EMODiagram)getResourceDiagram(recordFile);
		//假设该recordFile存在
//		pdiagram = basicrt.getEmpDiagram();
//		emodiagram = pdiagram.getEmoDiagrams();
//		if (emodiagram != null && emodiagram.size() > 0)
//		{
		if(diagram != null){
//			diagram = (EMODiagram)emodiagram.get(0); 
			resource = diagram.getRoles();
		}
		else
			resource = null;
	}

	/**
	 * Create the dialog
	 * @param parentShell
	 */
	public OrgResourceInProcessDlg(Shell parentShell) {
		super(parentShell);
	}

	public OrgResourceInProcessDlg(Shell parent, EObject obj){
		this(parent);
		basicrt = (EMRRole)obj;
	} 
	public OrgResourceInProcessDlg(Shell parent, EObject obj, IFile processFile){
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
		tabFolder.setBounds(15, 10,318, 228);

		final TabItem resItem = new TabItem(tabFolder, SWT.NONE);
		resItem.setText("资源描述");
		
		final Composite composite = new Composite(tabFolder, SWT.NONE);
		resItem.setControl(composite);

		final Label label = new Label(composite, SWT.NONE);
		label.setText("花费/单位:");
		label.setBounds(15, 144, 69, 12);

		priceTxt = new Text(composite, SWT.BORDER);
		priceTxt.setEditable(false);
		priceTxt.setBounds(105, 139, 80, 20);

		final Label label_1 = new Label(composite, SWT.NONE);
		label_1.setText("资源总数:");
		label_1.setBounds(15, 113, 69, 12);

		totalTxt = new Text(composite, SWT.BORDER);
		totalTxt.setEditable(false);
		totalTxt.setBounds(105, 108, 80, 20);

		final Label label_3 = new Label(composite, SWT.NONE);
		label_3.setText("使用数量/活动:");
		label_3.setBounds(15, 52, 89, 12);

		aviliableTxt = new Text(composite, SWT.BORDER);
		aviliableTxt.setEditable(false);
		aviliableTxt.setBounds(105, 78, 80, 20);

		final Label label_4 = new Label(composite, SWT.NONE);
		label_4.setText("效率:");
		label_4.setBounds(198, 52, 30, 12);

		efficiencyTxt = new Text(composite, SWT.BORDER);
		efficiencyTxt.setEditable(false);
		efficiencyTxt.setBounds(232, 49, 39, 20);

		final Label label_5 = new Label(composite, SWT.NONE);
		label_5.setText("%");
		label_5.setBounds(280, 52, 17, 12);

		final Label namelab = new Label(composite, SWT.NONE);
		namelab.setText("名称:");
		namelab.setBounds(15, 23, 49, 12);

		nameCombo = new CCombo(composite, SWT.BORDER);
		nameCombo.setEditable(false);
		nameCombo.setBounds(70, 20, 215, 20);
		
		nameCombo.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				int index = nameCombo.getSelectionIndex();
				ChangeDisplay(index);
			}
		});

		final Label codeLabel = new Label(composite, SWT.NONE);
		codeLabel.setText("编码:");
		codeLabel.setBounds(15, 175, 49, 13);

		codeText = new Text(composite, SWT.BORDER);
		codeText.setEditable(false);
		codeText.setBounds(105, 172, 80, 20);

		final Label label_2 = new Label(composite, SWT.NONE);
		label_2.setText("可用数量:");
		label_2.setBounds(15, 82, 55, 13);

		usageText = new Text(composite, SWT.BORDER);
		usageText.setBounds(105, 49, 80, 20);
		
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
		EMRRole obj = null;
		if (resource != null)
		{
			Iterator iter = resource.iterator();

			//加载所有的相关资源
			while(iter.hasNext())
			{
				obj = (EMRRole)(iter.next());
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
			if(obj != null){
				name = obj.getName();
			}
			int count = nameCombo.getItemCount();
			for (index = 0; index < count; index++)
			{
				obj = (EMRRole)nameCombo.getData(""+index);
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
				usageText.setText(PropertyUtility.GetParamValue(basicrt.getUsageAmount()));
				priceTxt.setText(PropertyUtility.GetParamValue(obj.getCostPerUnit()));
				efficiencyTxt.setText((new Double(obj.getEfficiency()*100)).toString());
			}
			else
			{
				codeText.setText("");
				totalTxt.setText((new Integer(1)).toString());
				aviliableTxt.setText((new Integer(1)).toString());
				priceTxt.setText((new Double(10.0)).toString());
				usageText.setText((new Integer(0)).toString());
				efficiencyTxt.setText((new Double(1.0 * 100)).toString());
			}
		}
		else
		{
			nameCombo.select(0);
			ChangeDisplay(0);
			usageText.setText((new Integer(0)).toString());
		}

	}
	
	protected void DefaultSet()
	{
		totalTxt.setText((new Integer(1)).toString());
		aviliableTxt.setText((new Integer(1)).toString());
		usageText.setText((new Integer(0)).toString());
		priceTxt.setText((new Double(10.0)).toString());
		efficiencyTxt.setText((new Double(1.0 * 100)).toString());
		codeText.setText("");
	}
	protected void ChangeDisplay(int index)
	{
		EMRRole obj = (EMRRole)nameCombo.getData(""+index);
		if (obj == null)
		{
			DefaultSet();
			return;
		}
		name = obj.getName();
		codeText.setText(PropertyUtility.GetValue(obj.getCode()));
		totalTxt.setText(PropertyUtility.GetParamValue(obj.getTotalAmount()));
		aviliableTxt.setText(PropertyUtility.GetParamValue(obj.getAvailableAmount()));
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
				MessageDialog.openInformation(this.getShell(), "没有选中组织模型","没有选中组织模型，所有设置没有实际作用！");
				flag = true;
			}
			else{
				EMRBasicResourceType obj = (EMRBasicResourceType)nameCombo.getData(""+nameCombo.getSelectionIndex());
				int avaliableAmount = obj.getAvailableAmount().intValue();
				if(new Integer(usageText.getText()).intValue() > avaliableAmount){
					MessageDialog.openWarning(this.getShell(), "无效数据", "没有足够的人员，请重新设置！");
					return;
				}
			}
			if(flag == false){
				if(usageText.getText()!= null && usageText.getText().equals("")){
					MessageDialog.openWarning(this.getShell(), "无效数据", "请输入使用人员的数量！");
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
				this.setCode(codeText.getText());
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
			//end changed by zhangpeng
		}
	super.buttonPressed(buttonId);
	}

	public String getName() {
		return name;
	}

	public void setName(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Return the initial size of the dialog
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(355, 318);
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
