package newpmbe.DlgPackage;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
//import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

//import sun.text.CompactShortArray.Iterator;
import vpml.resourcepackage.*;

public class ConcreteResourceDlg extends Dialog {
	
	private Text codeText;
	private Text efficiencyTxt;
	private Text aviliableTxt;
	private Text usageTxt;
	private Text totalTxt;
	private Text priceTxt;
	private Text desTxt;
	private Text nameTxt;

	private String name;
	private String code;
	private String description;
	private int	total;
	private int usage;
	private int aviliable;
	private double price;
	private double efficiency;
	private EMRBasicResourceType basicrt;

	private boolean isSimulation;
	
	private IGraphicalEditPart editPart;
	/**
	 * Create the dialog
	 * @param parentShell
	 */
	public ConcreteResourceDlg(Shell parentShell) {
		super(parentShell);
	}

	public ConcreteResourceDlg(Shell parent, EObject obj){
		this(parent);
		basicrt = (EMRBasicResourceType)obj;
	} 
	public ConcreteResourceDlg(Shell parent, EObject obj, boolean isSim) {
		// TODO Auto-generated constructor stub
		this(parent);
		basicrt = (EMRBasicResourceType)obj;
		isSimulation = isSim;
	}
	public ConcreteResourceDlg(Shell parent, IGraphicalEditPart part, boolean isSim) {
		this(parent);
		editPart = part;
		basicrt = (EMRBasicResourceType)editPart.resolveSemanticElement();
		isSimulation = isSim;
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
		tabFolder.setBounds(15, 10,318, 274);

		final TabItem defItem = new TabItem(tabFolder, SWT.NONE);
		defItem.setText("定义");

		final TabItem resItem = new TabItem(tabFolder, SWT.NONE);
		resItem.setText("资源");

		final Composite composite = new Composite(tabFolder, SWT.NONE);
		resItem.setControl(composite);

		final Label label = new Label(composite, SWT.NONE);
		label.setText("单位价格:");
		label.setBounds(70, 130, 69, 12);

		priceTxt = new Text(composite, SWT.BORDER);
		priceTxt.setEnabled(!isSimulation);
		priceTxt.setBounds(150, 127, 80, 20);

		final Label priceunit = new Label(composite, SWT.NONE);
		priceunit.setText("元");
		priceunit.setBounds(232, 130, 30, 12);

		final Label label_1 = new Label(composite, SWT.NONE);
		label_1.setText("资源总数:");
		label_1.setBounds(70, 25, 69, 12);

		totalTxt = new Text(composite, SWT.BORDER);
		totalTxt.setEnabled(!isSimulation);
		totalTxt.setBounds(150, 22, 80, 20);

		final Label label_2 = new Label(composite, SWT.NONE);
		label_2.setText("已使用数:");
		label_2.setBounds(70, 63, 69, 12);

		usageTxt = new Text(composite, SWT.BORDER);
		usageTxt.setBounds(150, 57, 80, 20);

		final Label label_3 = new Label(composite, SWT.NONE);
		label_3.setText("可使用数:");
		label_3.setBounds(70, 100, 69, 12);

		aviliableTxt = new Text(composite, SWT.BORDER);
		aviliableTxt.setEnabled(!isSimulation);
		aviliableTxt.setBounds(150, 93, 80, 20);

		final Label label_4 = new Label(composite, SWT.NONE);
		label_4.setText("效率:");
		label_4.setBounds(82, 162, 39, 12);

		efficiencyTxt = new Text(composite, SWT.BORDER);
		efficiencyTxt.setEnabled(!isSimulation);
		efficiencyTxt.setBounds(150, 159, 80, 20);

		final Label label_5 = new Label(composite, SWT.NONE);
		label_5.setText("%");
		label_5.setBounds(232, 162, 30, 12);

		codeText = new Text(composite, SWT.BORDER);
		codeText.setBounds(150, 195, 80, 20);

		final Label codeLabel = new Label(composite, SWT.NONE);
		codeLabel.setText("编码:");
		codeLabel.setBounds(82, 198, 39, 13);
		
		final Composite defcomposite = new Composite(tabFolder, SWT.NONE);
		defItem.setControl(defcomposite);

		final Label nameLabel = new Label(defcomposite, SWT.NONE);
		nameLabel.setText("名称：");
		nameLabel.setBounds(10, 10, 30, 12);

		nameTxt = new Text(defcomposite, SWT.BORDER);
		nameTxt.setEnabled(!isSimulation);
		nameTxt.setBounds(10, 25, 287, 18);

		final Label desLabel = new Label(defcomposite, SWT.NONE);
		desLabel.setText("职责描述：");
		desLabel.setBounds(10, 55, 60, 12);

		desTxt = new Text(defcomposite, SWT.V_SCROLL | SWT.BORDER | SWT.WRAP);
		desTxt.setEnabled(!isSimulation);
		desTxt.setBounds(10, 70, 287, 155);
		
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
		nameTxt.setText(PropertyUtility.GetValue(basicrt.getName()));
		codeText.setText(PropertyUtility.GetValue(basicrt.getCode()));
		desTxt.setText(PropertyUtility.GetValue(basicrt.getDescription()));
		totalTxt.setText(PropertyUtility.GetParamValue(basicrt.getTotalAmount()));
		usageTxt.setText(PropertyUtility.GetParamValue(basicrt.getUsageAmount()));
		aviliableTxt.setText(PropertyUtility.GetParamValue(basicrt.getAvailableAmount()));
		priceTxt.setText(PropertyUtility.GetParamValue(basicrt.getCostPerUnit()));
		efficiencyTxt.setText(PropertyUtility.GetParamValue(basicrt.getEfficiency()*100));
	}
	
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		String title = null;
		if(basicrt.getName() == null)
		{
			title = "未命名";
		}
		else
			title = basicrt.getName();
		
		newShell.setText("规格说明："+ title);
	}
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) 
		{
			if(editPart != null){
				DiagramEditPart diagramPart = (DiagramEditPart)editPart.getParent();
				List partChildren = diagramPart.getChildren();
				java.util.Iterator iter = partChildren.iterator();
				if(basicrt instanceof EMRMachineType){
					while(iter.hasNext()){
						ShapeNodeEditPart part = (ShapeNodeEditPart)iter.next();
						EObject eobj = part.resolveSemanticElement();
						if(eobj != null && eobj instanceof EMRMachineType){
							EMRMachineType namedObj = (EMRMachineType)eobj;
							if(namedObj == null)
								continue;
							if(!namedObj.equals(basicrt)&& this.getNameTxt().getText().equals(namedObj.getName())){
								//不能有相同的值
								MessageDialog.openWarning(this.getShell(), "无效数据", "该资源已经存在，请重新选择一个名称！");
								return;
							}
						}
					}
				}
				if(basicrt instanceof EMRToolType){
					while(iter.hasNext()){
						ShapeNodeEditPart part = (ShapeNodeEditPart)iter.next();
						EObject eobj = part.resolveSemanticElement();
						if(eobj != null && eobj instanceof EMRToolType){
							EMRToolType namedObj = (EMRToolType)eobj;
							if(namedObj == null)
								continue;
							if(!namedObj.equals(basicrt)&& this.getNameTxt().getText().equals(namedObj.getName())){
								//不能有相同的值
								MessageDialog.openWarning(this.getShell(), "无效数据", "该资源已经存在，请重新选择一个名称！");
								return;
							}
						}
					}
				}
				if(basicrt instanceof EMRLocationType){
					while(iter.hasNext()){
							ShapeNodeEditPart part = (ShapeNodeEditPart)iter.next();
							EObject eobj = part.resolveSemanticElement();
						if(eobj != null && eobj instanceof EMRLocationType){
							EMRLocationType namedObj = (EMRLocationType)eobj;
							if(namedObj == null)
								continue;
							if(!namedObj.equals(basicrt) && this.getNameTxt().getText().equals(namedObj.getName())){
								//不能有相同的值
								MessageDialog.openWarning(this.getShell(), "无效数据", "该资源已经存在，请重新选择一个名称！");
								return;
							}
						}
					}
				}
				if(basicrt instanceof EMRRole){
					while(iter.hasNext()){
							ShapeNodeEditPart part = (ShapeNodeEditPart)iter.next();
							EObject eobj = part.resolveSemanticElement();
						if(eobj != null && eobj instanceof EMRRole){
							EMRRole namedObj = (EMRRole)eobj;
							if(namedObj == null)
								continue;
							if(!namedObj.equals(basicrt) && this.getNameTxt().getText().equals(namedObj.getName())){
								//不能有相同的值
								MessageDialog.openWarning(this.getShell(), "无效数据", "该资源已经存在，请重新选择一个名称！");
								return;
							}
						}
					}
				}
			}
			//changed by zhangpeng-->verify the data
			try{
				int total = new Integer(totalTxt.getText()).intValue();
				int usage = new Integer(usageTxt.getText()).intValue();
				int aviliable = new Integer(aviliableTxt.getText()).intValue();
				if(total < 0 || usage < 0 || aviliable < 0 || aviliable + usage > total){
					MessageDialog.openWarning(this.getShell(), "无效数据", "\"资源总数/已使用数/可使用数\"输入不合法");
					return;
				}
				double price = new Double(priceTxt.getText()).doubleValue();
				double efficiency = (new Double(efficiencyTxt.getText()).doubleValue())/100.0;
				if(price < 0 || efficiency < 0){
					MessageDialog.openWarning(this.getShell(), "无效数据", "\"耗费/效率\"输入不能小于0");
					return;
				}
				if(efficiency > 1){
					MessageDialog.openWarning(this.getShell(), "无效数据", "\"耗费/效率\"输入不能大于100%");
					return;
				}
				this.setTotal(total);
				this.setUsage(usage);
				this.setAviliable(aviliable);
				this.setPrice(price);
				this.setEfficiency(efficiency);
			}catch(NumberFormatException e){
				String[] strs = e.getMessage().split("\"");
				MessageDialog.openWarning(this.getShell(), "无效数据", "输入\""+strs[1]+"\"有误，请您重新设置相应的值！");
				return;
			}
			//end changed by zhangpeng
			this.setName(PropertyUtility.GetValue(this.getNameTxt().getText()));
			this.setDescription(PropertyUtility.GetValue(this.getDesTxt().getText()));
			this.setCode(PropertyUtility.GetValue(this.getCodeText().getText()));
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

	/**
	 * Return the initial size of the dialog
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(361, 363);
	}


	public Text getDesTxt() {
		return desTxt;
	}

	public void setDesTxt(Text desTxt) {
		this.desTxt = desTxt;
	}

	public Text getNameTxt() {
		return nameTxt;
	}

	public void setNameTxt(Text nameTxt) {
		this.nameTxt = nameTxt;
	}

	public int getTotal() {
		return total;
	}
	
	public Text getCodeText(){
		return codeText;
	}
	public void setCodeText(Text codeText){
		this.codeText = codeText;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
}
