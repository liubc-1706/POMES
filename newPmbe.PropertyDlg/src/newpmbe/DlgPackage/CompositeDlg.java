package newpmbe.DlgPackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
//import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPProductPackage;

public class CompositeDlg extends Dialog {
	
	private DateTime modify_time;
	private DateTime create_time;
	private Text unitTxt;
	private Text modifierTxt;
	private Text createrTxt;
	private Text idTxt;
	private Text desTxt;
	private Text nameTxt;
	private EMPProductPackage prtpackage;
	private EMPCompActivity comactivity;
	private boolean isact;					//是组合产品还是组合活动
	private int result;
	private String name;
	private String creater;
	private String description;
	private String procedure;
	private String id;
	private String modifier;
	private Date time_modify;
	private Date time_create;
	private boolean m_enable;
	
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

	private boolean isSimulation;
	/**
	 * Create the dialog
	 * @param parentShell
	 */
	public CompositeDlg(Shell parentShell) {
		super(parentShell);
	}

	public CompositeDlg(Shell parent, EObject obj, boolean enable,boolean isSim){
		this(parent);
		m_enable = enable;
		if (obj instanceof EMPProductPackage) 
		{
			isact = false;
			prtpackage  = (EMPProductPackage) obj;			
		}
		else
			if (obj instanceof EMPCompActivity)
		{		
			isact = true;
			comactivity = (EMPCompActivity)obj;
		}
		isSimulation = isSim;
	} 
//	public CompositeDlg(Shell parent, EObject obj, boolean isSim) {
//		// TODO Auto-generated constructor stub
//		this(parent);
//		if (obj instanceof EMPProductPackage) 
//		{
//			isact = false;
//			prtpackage  = (EMPProductPackage) obj;			
//		}
//		else
//			if (obj instanceof EMPCompActivity)
//		{		
//			isact = true;
//			comactivity = (EMPCompActivity)obj;
//		}
//		isSimulation = isSim;
//	}

	/**
	 * Create contents of the dialog
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite topComp=new Composite(parent,SWT.NONE);
		
		final TabFolder tabFolder = new TabFolder(topComp, SWT.NONE);
		
		tabFolder.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, false));
		tabFolder.setBounds(15, 10,318, 220);

		final TabItem defItem = new TabItem(tabFolder, SWT.NONE);
		defItem.setText("定义");

		final Composite defcomposite = new Composite(tabFolder, SWT.NONE);
		defItem.setControl(defcomposite);
		
		
		final Label nameLabel = new Label(defcomposite, SWT.NONE);
		nameLabel.setText("名称：");
		nameLabel.setBounds(10, 10, 30, 12);

		nameTxt = new Text(defcomposite, SWT.BORDER);
		nameTxt.setEnabled(!isSimulation);
		nameTxt.setBounds(10, 25, 287, 18);

		final Label desLabel = new Label(defcomposite, SWT.NONE);
		desLabel.setText("描述：");
		desLabel.setBounds(10, 55, 30, 12);

		desTxt = new Text(defcomposite, SWT.BORDER|SWT.WRAP|SWT.V_SCROLL);
		desTxt.setEnabled(!isSimulation);
		desTxt.setBounds(10, 70, 287, 114);
		
		if (isact)
		{
			final TabItem verItem = new TabItem(tabFolder, SWT.NONE);
			verItem.setText("版本");
	
			final Composite vercomposite = new Composite(tabFolder, SWT.NONE);
			verItem.setControl(vercomposite);
	
			final Label idLabel = new Label(vercomposite, SWT.NONE);
			idLabel.setText("ID：");
			idLabel.setBounds(12, 23, 24, 14);
	
			idTxt = new Text(vercomposite, SWT.BORDER);
			idTxt.setEnabled(!isSimulation);
			idTxt.setBounds(38, 18, 264, 24);
	
			final Label createrLabel = new Label(vercomposite, SWT.NONE);
			createrLabel.setText("创建者：");
			createrLabel.setBounds(12, 56, 44, 18);
	
			final Label createTimeLabel = new Label(vercomposite, SWT.NONE);
			createTimeLabel.setText("创建日期：");
			createTimeLabel.setBounds(157, 56, 56, 22);
	
			createrTxt = new Text(vercomposite, SWT.BORDER);
			createrTxt.setEnabled(!isSimulation);
			createrTxt.setBounds(12, 80, 135, 25);	
	
			final Label modifierLabel = new Label(vercomposite, SWT.NONE);
			modifierLabel.setText("最近修改者：");
			modifierLabel.setBounds(12, 115, 75, 16);
	
			final Label modify_timeLabel = new Label(vercomposite, SWT.NONE);
			modify_timeLabel.setText("最近修改日期：");
			modify_timeLabel.setBounds(157, 115, 80, 12);
	
			modifierTxt = new Text(vercomposite, SWT.BORDER);
			modifierTxt.setEnabled(!isSimulation);
			modifierTxt.setBounds(12, 140, 135, 25);
	
			create_time = new DateTime(vercomposite, SWT.DATE);
			create_time.setBounds(157, 80, 145, 25);
			
			modify_time = new DateTime(vercomposite, SWT.DATE);
			modify_time.setBounds(157, 140, 145, 25);
		}

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
		if(isact)
		{			
			nameTxt.setText(PropertyUtility.GetValue(comactivity.getName()));
			//nameTxt.setEnabled(m_enable);
			idTxt.setText(PropertyUtility.GetValue(comactivity.getOID().toString()));
			//idTxt.setEnabled(m_enable);
			desTxt.setText(PropertyUtility.GetValue(comactivity.getDescription()));
			//desTxt.setEnabled(m_enable);
			createrTxt.setText(PropertyUtility.GetValue(comactivity.getCreater()));
			//createrTxt.setEnabled(m_enable);
			//proTxt.setEnabled(m_enable);
			modifierTxt.setText(PropertyUtility.GetValue(comactivity.getLastModifier()));
			//modifierTxt.setEnabled(m_enable);
								
			PropertyUtility.DateToDateTime(create_time, PropertyUtility.GetTimeValue(comactivity.getCreatedDate()));
			//create_time.setEnabled(m_enable);
			PropertyUtility.DateToDateTime(modify_time, PropertyUtility.GetTimeValue(comactivity.getLastModifiedDate()));
			//modify_time.setEnabled(m_enable);
		}
		else
		{			
			nameTxt.setText(PropertyUtility.GetValue(prtpackage.getName()));
			//nameTxt.setEnabled(m_enable);
			desTxt.setText(PropertyUtility.GetValue(prtpackage.getDescription()));
			//desTxt.setEnabled(m_enable);
			//proTxt.setEnabled(false);
		}		
	}
	
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		String title = null;
		if(isact)
		{
			if(comactivity.getName() == null)
				title = "未命名";
			else
				title = comactivity.getName();			
		}
		else
		{
			if(prtpackage.getName() == null)
				title = "未命名";
			else
				title = prtpackage.getName();	
		}
				
		
			newShell.setText("规格说明：" + title);
	}
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) 
		{
			this.setName(PropertyUtility.GetValue(this.getNameTxt().getText()));
			this.setDescription(PropertyUtility.GetValue(this.getDesTxt().getText()));
			if (isact)
			{
				this.setCreater(PropertyUtility.GetValue(this.getCreaterTxt().getText()));
				this.setId(PropertyUtility.GetValue(this.getIdTxt().getText()));
				this.setModifier(PropertyUtility.GetValue(this.getModifierTxt().getText()));
				time_create = PropertyUtility.DateTimeToDate(create_time);
				time_modify = PropertyUtility.DateTimeToDate(modify_time);
				if(time_create.after(time_modify)){
					MessageDialog.openWarning(this.getShell(), "无效数据", 
							"修改时间不得早于创建时间，请重新设置！");
					return;
				}
			}
		}
	super.buttonPressed(buttonId);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProcedure() {
		return procedure;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Return the initial size of the dialog
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(355, 310);
	}


	public Text getUnitTxt() {
		return unitTxt;
	}

	public void setUnitTxt(Text unitTxt) {
		this.unitTxt = unitTxt;
	}

	public Text getModifierTxt() {
		return modifierTxt;
	}

	public void setModifierTxt(Text modifierTxt) {
		this.modifierTxt = modifierTxt;
	}

	public Text getCreaterTxt() {
		return createrTxt;
	}

	public void setCreaterTxt(Text createrTxt) {
		this.createrTxt = createrTxt;
	}

	public Text getIdTxt() {
		return idTxt;
	}

	public void setIdTxt(Text idTxt) {
		this.idTxt = idTxt;
	}


//	public void setProTxt(Text proTxt) {
//		this.proTxt = proTxt;
//	}

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
	
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public DateTime getModify_time() {
		return modify_time;
	}

	public void setModify_time(DateTime modify_time) {
		this.modify_time = modify_time;
	}

	public DateTime getmodify_time() {
		return modify_time;
	}

	public void setmodify_time(DateTime modify_time) {
		this.modify_time = modify_time;
	}

	public Date getTime_modify() {
		return time_modify;
	}

	public void setTime_modify(Date time_modify) {
		this.time_modify = time_modify;
	}

	public Date getTime_create() {
		return time_create;
	}

	public void setTime_create(Date time_create) {
		this.time_create = time_create;
	}

	public boolean isIsact() {
		return isact;
	}

	public void setIsact(boolean isact) {
		this.isact = isact;
	}
	
}
