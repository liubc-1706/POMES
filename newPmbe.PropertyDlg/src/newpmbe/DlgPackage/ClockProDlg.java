package newpmbe.DlgPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
//import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ListViewer;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

import vpml.processpackage.*;
import vpml.utilpackage.EnumTimeUnit;
import vpml.utilpackage.UtilpackageFactory;

public class ClockProDlg extends Dialog {
	private Combo intervalUnit;
	private Text intervalValue;
	private Combo batchunit;
	private Text cycle;
	private Text bendTime;
	private Text bstartTime;
	private Label stlabel;
	private Label etlabel;
	private Label cyclelabel;
	private Label batchunitlabel;
	private Button timequeneTagBtn;
	private Button emergencyTagBtn;
	
	private Group time_group;
	
	private Text unitTxt;
	private Text desTxt;
	private Text nameTxt;
	private EMPClock clock;
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	
	//用于返回结果
	private String name;
	private String description;


	private EnumTimeUnit timeunit;
	
	//时间数据
	private EnumTimeUnit intervalTimeUnit;	//间隔时间单位
	private double bst;	//开始时间
	private double bet;	//结束时间
	private double brc;	//重做周期
	private boolean timetag; 	//时钟队列标志
	private boolean emertag;	//紧急状况标志
	private double  inttime;	//间隔时间

	private boolean isSimulation;
	
	/**
	 * Create the dialog
	 * @param parentShell
	 */
	public ClockProDlg(Shell parentShell) {
		super(parentShell);
	}

	public ClockProDlg(Shell parent, EObject obj){
		this(parent);
		clock = (EMPClock)obj;
	} 
	public ClockProDlg(Shell parent, EObject obj, boolean isSim) {
		this(parent);
		clock = (EMPClock)obj;
		isSimulation = isSim;
	}

	/**
	 * Create contents of the dialog
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		//Composite container = (Composite) super.createDialogArea(parent);
		//
		Composite topComp=new Composite(parent,SWT.NONE);
		
		final TabFolder tabFolder = new TabFolder(topComp, SWT.NONE);
		
		tabFolder.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, false));
		tabFolder.setBounds(15, 10,318, 174);

		final TabItem defItem = new TabItem(tabFolder, SWT.NONE);
		defItem.setText("定义");
		
		final Composite defcomposite = new Composite(tabFolder, SWT.NONE);
		defItem.setControl(defcomposite);

		final Label nameLabel = new Label(defcomposite, SWT.NONE);
		nameLabel.setText("名称：");
		nameLabel.setBounds(10, 10, 44, 12);

		nameTxt = new Text(defcomposite, SWT.BORDER);
		nameTxt.setEnabled(!isSimulation);
		nameTxt.setBounds(10, 25, 287, 18);

		final Label desLabel = new Label(defcomposite, SWT.NONE|SWT.WRAP);
		desLabel.setText("描述：");
		desLabel.setBounds(10, 55, 44, 12);

		desTxt = new Text(defcomposite, SWT.V_SCROLL | SWT.BORDER | SWT.WRAP);
		desTxt.setEnabled(!isSimulation);
		desTxt.setBounds(10, 70, 287, 69);
		
		//输入类型响应列表框
		
		//到达分布选择响应

		final TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("时间");

		final Composite composite = new Composite(tabFolder, SWT.NONE);
		tabItem.setControl(composite);

		stlabel = new Label(composite, SWT.NONE);
		stlabel.setText("开始时间：");
		stlabel.setBounds(8, 25, 60, 12);
		

		etlabel = new Label(composite, SWT.NONE);
		etlabel.setText("结束时间：");
		etlabel.setBounds(8, 55, 60, 12);
		

		cyclelabel = new Label(composite, SWT.NONE);
		cyclelabel.setText("重做周期：");
		cyclelabel.setBounds(8, 85, 60, 12);
		

		batchunitlabel = new Label(composite, SWT.NONE);
		batchunitlabel.setText("单位：");
		batchunitlabel.setBounds(8, 115, 60, 12);

		bstartTime = new Text(composite, SWT.BORDER);
		bstartTime.setBounds(70, 20, 80, 20);
		//bstartTime.setEnabled(!isSimulation);
		
		bendTime = new Text(composite, SWT.BORDER);
		bendTime.setBounds(70, 52, 80, 20);
		//bendTime.setEnabled(!isSimulation);
		
		cycle = new Text(composite, SWT.BORDER);
		cycle.setBounds(70, 82, 80, 20);
		//cycle.setEnabled(!isSimulation);
		
		batchunit = new Combo(composite, SWT.NONE);
		batchunit.setBounds(70, 112, 80, 20);
		batchunit.setItems(new String[] {"秒", "分", "小时", "日", "周", "月", "季", "年"});
		batchunit.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				int index = batchunit.getSelectionIndex();
				timeunit = SetTimeUnit(index);
			}
		});
		//batchunit.setEnabled(!isSimulation);

		timequeneTagBtn = new Button(composite, SWT.CHECK);
		timequeneTagBtn.setText("时钟队列标志");
		timequeneTagBtn.setBounds(161, 20, 104, 16);
		timequeneTagBtn.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				timetag = timequeneTagBtn.getSelection();
			}
		});
		//timequeneTagBtn.setEnabled(!isSimulation);

		emergencyTagBtn = new Button(composite, SWT.CHECK);
		emergencyTagBtn.setText("紧急情况标志");
		emergencyTagBtn.setBounds(161, 40, 104, 16);
		emergencyTagBtn.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				emertag = emergencyTagBtn.getSelection();
			}
		});
		//emergencyTagBtn.setEnabled(!isSimulation);

		time_group = new Group(composite, SWT.NONE);
		time_group.setText("间隔时间");
		time_group.setBounds(156, 62, 139, 73);

		final Label intervalValuelabel = new Label(time_group, SWT.NONE);
		intervalValuelabel.setText("数值：");
		intervalValuelabel.setBounds(10, 20, 35, 12);
		
		
		final Label intervalUnitLabel = new Label(time_group, SWT.NONE);
		intervalUnitLabel.setText("单位：");
		intervalUnitLabel.setBounds(10, 45, 35, 12);
		

		intervalValue = new Text(time_group, SWT.BORDER);
		intervalValue.setBounds(49, 17, 80, 20);
		//intervalValue.setEnabled(!isSimulation);

		intervalUnit = new Combo(time_group, SWT.NONE);
		intervalUnit.setBounds(49, 42, 80, 20);
		//intervalUnit.setEnabled(!isSimulation);
		
		intervalUnit.setItems(new String[] {"秒", "分", "小时", "日", "周", "月", "季", "年"});
		intervalUnit.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				int index = intervalUnit.getSelectionIndex();
				intervalTimeUnit = SetTimeUnit(index);
			}
		});
		
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
		nameTxt.setText(GetValue(clock.getName()));
		desTxt.setText(GetValue(clock.getDescription()));

		//获取批处理参数
		
		bstartTime.setText(new Double(clock.getStartTime()).toString());
		bendTime.setText(new Double(clock.getEndTime()).toString());		
		cycle.setText(new Integer(clock.getRestartPeriod()).toString());		
		timeunit = clock.getTimeUnit();
		batchunit.select(GetTimeUnit(timeunit));
		
		timetag = clock.getTqFlag() == null ? false : clock.getTqFlag();
		timequeneTagBtn.setSelection(timetag);
		
		emertag = clock.getEFlag() == null ? false: clock.getEFlag();
		emergencyTagBtn.setSelection(emertag);
		intervalValue.setText(new Double(clock.getIntervalValue()).toString());
		
		intervalTimeUnit = clock.getIntervalUnit();
		intervalUnit.select(GetTimeUnit(intervalTimeUnit));		
	}
	

	//获取时间单位
	protected int GetTimeUnit(EnumTimeUnit tu)
	{
		int index;
		if (tu == null)
			index = 2; //默认设置为小时
		else
		{
			switch(tu.getValue())
			{
			case EnumTimeUnit.YEAR:
				index = 7;
				break;
			case EnumTimeUnit.QUARTER:
				index = 6;
				break;
			case EnumTimeUnit.MONTH:
				index = 5;
				break;
			case EnumTimeUnit.WEEK:
				index = 4;
				break;
			case EnumTimeUnit.DAY:
				index = 3;
				break;
			case EnumTimeUnit.HOUR:
				index = 2;
				break;
			case EnumTimeUnit.MINUTE:
				index = 1;
				break;
			case EnumTimeUnit.SECOND:
				index = 0;
				break;
			default:
				index = 2;
				break;
			}
		}
		return index;
	}
	
	//设置时间单位
	protected EnumTimeUnit SetTimeUnit(int index)
	{
		EnumTimeUnit tu;
		switch (index)
		{
		case 7:
			tu = EnumTimeUnit.YEAR_LITERAL;
			break;
		case 6:
			tu = EnumTimeUnit.QUARTER_LITERAL;
			break;
		case 5:
			tu = EnumTimeUnit.MONTH_LITERAL;
			break;
		case 4:
			tu = EnumTimeUnit.WEEK_LITERAL;
			break;
		case 3:
			tu = EnumTimeUnit.DAY_LITERAL;
			break;	
		case 2:
			tu = EnumTimeUnit.HOUR_LITERAL;
			break;
		case 1:
			tu = EnumTimeUnit.MINUTE_LITERAL;
			break;
		case 0:
			tu = EnumTimeUnit.SECOND_LITERAL;
			break;
		default:
			tu = EnumTimeUnit.HOUR_LITERAL;
			break;
		}
		return tu;
	}
	//获取字符串值
	protected String GetValue(String value)
	{
		return (value == null ? "":value);
	}
	
	//获取时间字符串的值
	protected String GetTimeValue(Date time)
	{
		if (time == null)
		{
			//如果时间为空，则返回当前值
			Date date = new Date();
			return formatter.format(date);
		}
		else
			return formatter.format(time);
	}
	
	//获取参数值
	protected String GetParamValue(double value)
	{
		 return new Double(value).toString();
	}
	
	protected String GetParamValue(int value)
	{
		return (new Integer(value)).toString();
	}
	

	
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) 
		{
			//changed by zhangpeng-->verify the data
			try{
				double bstart = new Double(bstartTime.getText()).doubleValue();
				double bend = new Double(bendTime.getText()).doubleValue();
				double cycleValue = new Double(cycle.getText()).doubleValue();
				double interval = new Double(intervalValue.getText()).doubleValue();
				if(bstart<0 || bend<0 ||bstart > bend){
					MessageDialog.openWarning(this.getShell(), "无效数据", "\"初始时间/终了时间\"设置有误");
					return;
				}
				if(cycleValue < 0 || interval < 0){
					MessageDialog.openWarning(this.getShell(), "无效数据", "\"重做周期/间隔时间\"设置有误");
					return;
				}
				
				this.setBst(bstart);
				this.setBet(bend);
				this.setBrc(cycleValue);
				this.setInttime(interval);
			}catch(NumberFormatException e){
				String[] strs = e.getMessage().split("\"");
				MessageDialog.openWarning(this.getShell(), "无效数据", "输入\""+strs[1]+"\"有误，请您重新设置相应的值！");
				return;
			}
			//end changed by zhangpeng

			this.setName(GetValue(this.getNameTxt().getText()));
			this.setDescription(GetValue(this.getDesTxt().getText()));
		}
	super.buttonPressed(buttonId);
	}
	
	/**
	 * Return the initial size of the dialog
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(355, 263);
	}

	public Text getUnitTxt() {
		return unitTxt;
	}

	public void setUnitTxt(Text unitTxt) {
		this.unitTxt = unitTxt;
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
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		String title = null;
		if (clock.getName() == null)
		{
			title = "未命名";			
		}
		else
			title = clock.getName();
		newShell.setText("规格说明:" + title);
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

	public EnumTimeUnit getTimeunit() {
		return timeunit;
	}

	public void setTimeunit(EnumTimeUnit timeunit) {
		this.timeunit = timeunit;
	}

	public EnumTimeUnit getIntervalTimeUnit() {
		return intervalTimeUnit;
	}

	public void setIntervalTimeUnit(EnumTimeUnit intervalTimeUnit) {
		this.intervalTimeUnit = intervalTimeUnit;
	}

	public double getBst() {
		return bst;
	}

	public void setBst(double bst) {
		this.bst = bst;
	}

	public double getBet() {
		return bet;
	}

	public void setBet(double bet) {
		this.bet = bet;
	}

	public double getBrc() {
		return brc;
	}

	public void setBrc(double brc) {
		this.brc = brc;
	}

	public boolean isTimetag() {
		return timetag;
	}

	public void setTimetag(boolean timetag) {
		this.timetag = timetag;
	}

	public boolean isEmertag() {
		return emertag;
	}

	public void setEmertag(boolean emertag) {
		this.emertag = emertag;
	}

	public double getInttime() {
		return inttime;
	}

	public void setInttime(double inttime) {
		this.inttime = inttime;
	}

}
