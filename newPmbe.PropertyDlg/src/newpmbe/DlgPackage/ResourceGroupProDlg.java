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

import vpml.organizationpackage.*;

public class ResourceGroupProDlg extends Dialog {
	
	private Text codeText;
	private Text resTxt;
	private Text numTxt;
	private Text priTxt;
	private Text orgTypeTxt;
	private Text desTxt;
	private Text nameTxt;

	private EMOResourceGroupType resGroup;
	
	private String name;
	private String code;
	private String description;
	private String orgType;
	private String princpal;
	private Long   arrangeNum;
	private String reserved;

	private boolean isSimulation;
	private IGraphicalEditPart editPart;


	/**
	 * Create the dialog
	 * @param parentShell
	 */
	public ResourceGroupProDlg(Shell parentShell) {
		super(parentShell);
	}

	public ResourceGroupProDlg(Shell parent, EObject obj){
		this(parent);
		resGroup = (EMOResourceGroupType) obj;			
	} 
	public ResourceGroupProDlg(Shell parent, IGraphicalEditPart part, boolean isSim) {
		// TODO Auto-generated constructor stub
		this(parent);
		editPart = part;
		resGroup = (EMOResourceGroupType)editPart.resolveSemanticElement();
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
		tabFolder.setBounds(15, 10,318, 221);

		final TabItem defItem = new TabItem(tabFolder, SWT.NONE);
		defItem.setText("定义");

		final TabItem resTab = new TabItem(tabFolder, SWT.NONE);
		resTab.setText("资源");

		final Composite composite = new Composite(tabFolder, SWT.NONE);
		resTab.setControl(composite);

		final Label orglbl = new Label(composite, SWT.NONE);
		orglbl.setText("组织类型:");
		orglbl.setBounds(50, 22, 60, 13);

		orgTypeTxt = new Text(composite, SWT.BORDER);
		orgTypeTxt.setBounds(130, 18, 123, 20);

		final Label prilbl = new Label(composite, SWT.NONE);
		prilbl.setText("负责人:");
		prilbl.setBounds(50, 55, 60, 12);

		priTxt = new Text(composite, SWT.BORDER);
		priTxt.setBounds(130, 50, 123, 20);

		final Label numlbl = new Label(composite, SWT.NONE);
		numlbl.setText("显示序号:");
		numlbl.setBounds(50, 90, 60, 12);

		numTxt = new Text(composite, SWT.BORDER);
		numTxt.setBounds(130, 85, 123, 20);

		final Label reslbl = new Label(composite, SWT.NONE);
		reslbl.setText("备注:");
		reslbl.setBounds(50, 157, 58, 12);

		resTxt = new Text(composite, SWT.BORDER);
		resTxt.setBounds(130, 154, 123, 20);

		final Label codeLabel = new Label(composite, SWT.NONE);
		codeLabel.setText("编码:");
		codeLabel.setBounds(49, 121, 28, 13);

		codeText = new Text(composite, SWT.BORDER);
		codeText.setBounds(130, 118, 123, 20);
		
		final Composite defcomposite = new Composite(tabFolder, SWT.NONE);
		defItem.setControl(defcomposite);

		final Label nameLabel = new Label(defcomposite, SWT.NONE);
		nameLabel.setText("名称：");
		nameLabel.setBounds(10, 10, 30, 12);

		nameTxt = new Text(defcomposite, SWT.BORDER);
		nameTxt.setEnabled(!isSimulation);
		nameTxt.setBounds(10, 25, 287, 18);

		final Label desLabel = new Label(defcomposite, SWT.NONE);
		desLabel.setText("职责描述:");
		desLabel.setBounds(10, 55, 63, 12);

		desTxt = new Text(defcomposite, SWT.V_SCROLL | SWT.BORDER | SWT.WRAP);
		desTxt.setEnabled(!isSimulation);
		desTxt.setBounds(10, 70, 287, 115);
		
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
		nameTxt.setText(PropertyUtility.GetValue(resGroup.getName()));
		desTxt.setText(PropertyUtility.GetValue(resGroup.getDescription()));
		codeText.setText(PropertyUtility.GetValue(resGroup.getCode()));
		orgTypeTxt.setText(PropertyUtility.GetValue(resGroup.getOrganiztionType()));
		priTxt.setText(PropertyUtility.GetValue(resGroup.getPrincipal()));
		numTxt.setText(resGroup.getArrangeNumber().toString());
		resTxt.setText(PropertyUtility.GetValue(resGroup.getReserved()));
	}
	
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		String title = null;
		if(resGroup.getName() == null)
		{
			title = "未命名";
		}
		else
			title = resGroup.getName();
		
		newShell.setText("规格说明：" + title);
	}
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) 
		{
			if(editPart != null){
				DiagramEditPart diagramPart = (DiagramEditPart)editPart.getParent();
				List partChildren = diagramPart.getChildren();
				java.util.Iterator iter = partChildren.iterator();
				if(resGroup instanceof EMOResourceGroupType){
					while(iter.hasNext()){
						ShapeNodeEditPart part = (ShapeNodeEditPart)iter.next();
						EObject eobj = part.resolveSemanticElement();
						if(eobj != null && eobj instanceof EMOResourceGroupType){
							EMOResourceGroupType namedObj = (EMOResourceGroupType)eobj;
							if(namedObj == null)
								continue;
							if(!namedObj.equals(resGroup)&& this.getNameTxt().getText().equals(namedObj.getName())){
								//不能有相同的值
								MessageDialog.openWarning(this.getShell(), "无效数据", "该组织已经存在，请重新选择一个名称！");
								return;
							}
						}
					}
				}
			}
			//changed by zhangpeng-->verify the data
			try{
				long arrangeNum = new Long(numTxt.getText()).longValue();
				if(arrangeNum < 0){
					MessageDialog.openWarning(this.getShell(), "无效数据", "\"aNumber\"数量不应该小于0");
					return;
				}
				this.setArrangeNum(arrangeNum);
			}catch(NumberFormatException e){
				String[] strs = e.getMessage().split("\"");
				MessageDialog.openWarning(this.getShell(), "无效数据", "输入\""+strs[1]+"\"有误，请您重新设置相应的值！");
				return;
			}
			//end changed by zhangpeng
			this.setName(PropertyUtility.GetValue(this.getNameTxt().getText()));
			this.setDescription(PropertyUtility.GetValue(this.getDesTxt().getText()));
			this.setPrincpal(PropertyUtility.GetValue(priTxt.getText()));
			this.setOrgType(PropertyUtility.GetValue(orgTypeTxt.getText()));
			this.setCode(PropertyUtility.GetValue(codeText.getText()));

			this.setReserved(PropertyUtility.GetValue(resTxt.getText()));
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
		return new Point(355, 313);
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
	public String getOrgType() {
		return orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public String getPrincpal() {
		return princpal;
	}

	public void setPrincpal(String princpal) {
		this.princpal = princpal;
	}

	public Long getArrangeNum() {
		return arrangeNum;
	}

	public void setArrangeNum(Long arrangeNum) {
		this.arrangeNum = arrangeNum;
	}

	public String getReserved() {
		return reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}
}
