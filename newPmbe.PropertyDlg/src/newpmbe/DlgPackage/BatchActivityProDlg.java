package newpmbe.DlgPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
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
import vpml.utilpackage.DSDistribution;
import vpml.utilpackage.EnumBatchType;
import vpml.utilpackage.EnumDistribution;
import vpml.utilpackage.EnumTimeUnit;
import vpml.utilpackage.UtilpackageFactory;

public class BatchActivityProDlg extends Dialog {
	private Combo intervalUnit;
	private Text intervalValue;
	private Combo batchunit;
	private Text cycle;
	private Text bendTime;
	private DateTime startTime;
	private Text maxTxt;
	private Text minTxt;
	private Text bstartTime;
	private Text priTxt;
	private Text param2Txt;
	private Combo discombo;
	private DateTime modify_time;
	private DateTime create_time;
	private Text param1Txt;
	private Combo UnitCombo;
	private Label param1;
	private Label param2;
	private Button isDefaultBtn;
	private Group numgroup;
	private Label stlabel;
	private Label etlabel;
	private Label cyclelabel;
	private Label batchunitlabel;
	private Button timequeneTagBtn;
	private Button emergencyTagBtn;
	
	private Group time_group;
	
	private Button quantityBtn;
	private Button timeBtn;
	private Button qortBtn;
	private Button qandtBtn;

	private EnumDistribution dis;
	private Text unitTxt;
	private Text ioTxt;
	private Text modifierTxt;
	private Text createrTxt;
	private Text idTxt;
	private Text proTxt;
	private Text desTxt;
	private Text nameTxt;
	private EMPBatchActivity batchact;
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	
	//用于返回结果
	private String name;
	private String creater;
	private String description;
	private String procedure;
	private int	   priority;
	private String id;
	private String modifier;
	private Date time_modify;
	private Date time_create;	
	private Date st;
	private boolean isDefault;
	private DSDistribution dsd = UtilpackageFactory.eINSTANCE.createDSDistribution();
	private EnumTimeUnit timeunit;
	private EnumBatchType batchType = null;
	private DSDistribution defaultDis;
	//批处理数据
	private EnumTimeUnit intervalTimeUnit;	//间隔时间单位
	private double bst;	//开始时间
	private double bet;	//结束时间
	private double brc;	//重做周期
	private EnumTimeUnit btu; //批处理单位
	private int maxq;	//最大数量
	private int minq;	//最小数量
	private boolean timetag; 	//时钟队列标志
	private boolean emertag;	//紧急状况标志
	private double  inttime;	//间隔时间
	
	private boolean isSimulation;

	public EnumBatchType getBatchType() {
		return batchType;
	}

	public void setBatchType(EnumBatchType batchType) {
		this.batchType = batchType;
	}

	/**
	 * Create the dialog
	 * @param parentShell
	 */
	public BatchActivityProDlg(Shell parentShell) {
		super(parentShell);
	}

	public BatchActivityProDlg(Shell parent, EObject obj){
		this(parent);
		if (obj instanceof EMPAutoBatchActivity)
		{
			defaultDis = ((EMPAutoBatchActivity)obj).getEmpDiagram().getDurationTime();
		}
		if (obj instanceof EMPManualBatchActivity)
		{
			defaultDis = ((EMPManualBatchActivity)obj).getEmpDiagram().getDurationTime();
		}		
		batchact = (EMPBatchActivity)obj;
	} 
	public BatchActivityProDlg(Shell parent, EObject obj, boolean isSim) {
		this(parent);
		if (obj instanceof EMPAutoBatchActivity)
		{
			defaultDis = ((EMPAutoBatchActivity)obj).getEmpDiagram().getDurationTime();
		}
		if (obj instanceof EMPManualBatchActivity)
		{
			defaultDis = ((EMPManualBatchActivity)obj).getEmpDiagram().getDurationTime();
		}		
		batchact = (EMPBatchActivity)obj;
		isSimulation = isSim;
	}
	public BatchActivityProDlg(Shell parent, EObject obj, boolean isSim, IFile file) {
		this(parent);
		IProject project = file.getProject();
		IFile projectFile = project.getFile(project.getName()+"_diagram");
		EObject diagramObject = PropertyUtility.GetDiagramObject(projectFile.getLocation().toString());
//		if (obj instanceof EMPNormalActivity)
//		{
			defaultDis = ((EMPDiagram)diagramObject).getDurationTime();
//		}
//		if (obj instanceof EMPAutoActivity)
//		{
//			defaultDis = ((EMPAutoActivity)obj).getEmpDiagram().getDurationTime();
//		}		
		batchact = (EMPBatchActivity)obj;
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
		tabFolder.setBounds(15, 10,318, 220);

		final TabItem defItem = new TabItem(tabFolder, SWT.NONE);
		defItem.setText("定义");

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
		createrTxt.setBounds(14, 80, 135, 25);
		

		final Label modifierLabel = new Label(vercomposite, SWT.NONE);
		modifierLabel.setText("最近修改者：");
		modifierLabel.setBounds(12, 115, 75, 16);

		final Label modify_timeLabel = new Label(vercomposite, SWT.NONE);
		modify_timeLabel.setText("最近修改日期：");
		modify_timeLabel.setBounds(157, 115, 80, 12);

		modifierTxt = new Text(vercomposite, SWT.BORDER);
		modifierTxt.setEnabled(!isSimulation);
		modifierTxt.setBounds(14, 140, 135, 25);
		

		create_time = new DateTime(vercomposite, SWT.DATE);
		create_time.setBounds(157, 80, 145, 25);

		modify_time = new DateTime(vercomposite, SWT.DATE);
		modify_time.setBounds(157, 140, 145, 25);
		
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
		desTxt.setBounds(10, 70, 287, 49);

		final Label proLabel = new Label(defcomposite, SWT.NONE);
		proLabel.setText("过程：");
		proLabel.setBounds(10, 125, 44, 12);

		proTxt = new Text(defcomposite, SWT.V_SCROLL | SWT.BORDER | SWT.WRAP);
		proTxt.setEnabled(!isSimulation);
		proTxt.setBounds(10, 140, 287, 49);

		final TabItem parItem = new TabItem(tabFolder, SWT.NONE);
		parItem.setText("参数");

		final Composite parComposite = new Composite(tabFolder, SWT.NONE);
		parItem.setControl(parComposite);

		final Label prioritylbl = new Label(parComposite, SWT.NONE);
		prioritylbl.setText("优先级：");
		prioritylbl.setBounds(12, 173, 64, 12);		

		priTxt = new Text(parComposite, SWT.BORDER);
		priTxt.setBounds(116, 170, 100, 20);		

		final Group group = new Group(parComposite, SWT.NONE);
		group.setText("持续时间");
		group.setBounds(1, 5, 305, 157);

		isDefaultBtn = new Button(group, SWT.CHECK);
		isDefaultBtn.setText("缺省");
		isDefaultBtn.setBounds(12, 20, 55, 16);
		isDefaultBtn.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				isDefault = isDefaultBtn.getSelection();
				SetDistributionModifyAttribtue(isDefault);
				if (isDefault)
					SetDisParam(defaultDis);
			}
		});

		final Label stLabel = new Label(group, SWT.NONE);
		stLabel.setText("开始时间");
		stLabel.setBounds(90, 22, 55, 16);

		startTime = new DateTime(group, SWT.DATE);
		startTime.setBounds(150, 17, 149, 20);
		
		final Label distributeTxt = new Label(group, SWT.NONE);
		distributeTxt.setBounds(12, 52,64, 12);
		distributeTxt.setText("分布：");

		param1Txt = new Text(group, SWT.BORDER);
		param1Txt.setBounds(116, 73,100, 20);

		param1 = new Label(group, SWT.NONE);
		param1.setBounds(12, 80,64, 12);
		param1.setText("周期：");

		param2 = new Label(group, SWT.NONE);
		param2.setBounds(12, 105,64, 12);
		param2.setVisible(false);
		
		param2Txt = new Text(group, SWT.BORDER);
		param2Txt.setBounds(116, 100,100, 20);
		param2Txt.setVisible(false);

		UnitCombo = new Combo(group, SWT.NONE);
		UnitCombo.setBounds(116, 128,100, 20);
		UnitCombo.setItems(new String[] {"秒", "分", "小时", "日", "周", "月", "季", "年"});
		UnitCombo.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				int index = UnitCombo.getSelectionIndex();
				timeunit = SetTimeUnit(index);
			}
		});
		

		final Label unitLabel = new Label(group, SWT.NONE);
		unitLabel.setBounds(12, 129,30, 12);
		unitLabel.setText("单位：");
		
		discombo = new Combo(group, SWT.NONE);
		discombo.setBounds(116, 44,100, 20);
		discombo.setItems(new String[]{"常量分布", "均匀分布", "正态分布", "泊松分布", "指数分布", "Gamma分布"});
		
		//输入类型响应列表框
		
		//到达分布选择响应
		discombo.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				int index = discombo.getSelectionIndex();
				DisplayDistribution(index);
			}
		});		

		final TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("批处理");

		final Composite composite = new Composite(tabFolder, SWT.NONE);
		tabItem.setControl(composite);

		final Group typegroup = new Group(composite, SWT.NONE);
		typegroup.setBounds(8, 0, 142, 93);
		typegroup.setText("类型");

		quantityBtn = new Button(typegroup, SWT.RADIO);
		quantityBtn.setText("只有数量");
		quantityBtn.setBounds(20, 12, 93, 16);
		quantityBtn.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				batchType = EnumBatchType.AMOUNT_ONLY_LITERAL;
				SetBatchDisplay(batchType);
			}
		});

		timeBtn = new Button(typegroup, SWT.RADIO);
		timeBtn.setText("只有时间");
		timeBtn.setBounds(20, 32, 93, 16);
		timeBtn.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				batchType = EnumBatchType.TIME_ONLY_LITERAL;
				SetBatchDisplay(batchType);
			}
		});

		qortBtn = new Button(typegroup, SWT.RADIO);
		qortBtn.setText("时间或数量");
		qortBtn.setBounds(20, 52, 93, 16);
		qortBtn.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				batchType = EnumBatchType.TIME_OR_AMOUNT_LITERAL;
				SetBatchDisplay(batchType);
			}
		});

		qandtBtn = new Button(typegroup, SWT.RADIO);
		qandtBtn.setText("时间和数量");
		qandtBtn.setBounds(20, 72, 93, 16);
		qandtBtn.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				batchType = EnumBatchType.TIME_AND_AMOUNT_LITERAL;
				SetBatchDisplay(batchType);
			}
		});

		numgroup = new Group(composite, SWT.NONE);
		numgroup.setText("数量");
		numgroup.setBounds(161, 0, 139, 93);

		final Label minLabel = new Label(numgroup, SWT.NONE);
		minLabel.setText("最小：");
		minLabel.setBounds(10, 25, 35, 12);

		final Label maxLabel = new Label(numgroup, SWT.NONE);
		maxLabel.setText("最大：");
		maxLabel.setBounds(10, 60, 35, 12);

		minTxt = new Text(numgroup, SWT.BORDER);
		minTxt.setBounds(48, 19, 80, 20);

		maxTxt = new Text(numgroup, SWT.BORDER);
		maxTxt.setBounds(48, 57, 80, 20);

		stlabel = new Label(composite, SWT.NONE);
		stlabel.setText("开始时间：");
		stlabel.setBounds(8, 105, 60, 12);

		etlabel = new Label(composite, SWT.NONE);
		etlabel.setText("结束时间：");
		etlabel.setBounds(8, 127, 60, 12);

		cyclelabel = new Label(composite, SWT.NONE);
		cyclelabel.setText("重做周期：");
		cyclelabel.setBounds(8, 149, 60, 12);

		batchunitlabel = new Label(composite, SWT.NONE);
		batchunitlabel.setText("单位：");
		batchunitlabel.setBounds(8, 171, 60, 12);

		bstartTime = new Text(composite, SWT.BORDER);
		bstartTime.setBounds(70, 100, 80, 20);

		bendTime = new Text(composite, SWT.BORDER);
		bendTime.setBounds(70, 123, 80, 20);

		cycle = new Text(composite, SWT.BORDER);
		cycle.setBounds(70, 145, 80, 20);

		batchunit = new Combo(composite, SWT.NONE);
		batchunit.setBounds(70, 168, 80, 20);
		batchunit.setItems(new String[] {"秒", "分", "小时", "日", "周", "月", "季", "年"});
		batchunit.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				int index = batchunit.getSelectionIndex();
				timeunit = SetTimeUnit(index);
			}
		});

		timequeneTagBtn = new Button(composite, SWT.CHECK);
		timequeneTagBtn.setText("时钟队列标志");
		timequeneTagBtn.setBounds(161, 95, 104, 16);
		timequeneTagBtn.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				timetag = timequeneTagBtn.getSelection();
			}
		});

		emergencyTagBtn = new Button(composite, SWT.CHECK);
		emergencyTagBtn.setText("紧急情况标志");
		emergencyTagBtn.setBounds(161, 115, 104, 16);
		emergencyTagBtn.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				emertag = emergencyTagBtn.getSelection();
			}
		});

		time_group = new Group(composite, SWT.NONE);
		time_group.setText("间隔时间");
		time_group.setBounds(161, 133, 139, 60);

		final Label intervalValuelabel = new Label(time_group, SWT.NONE);
		intervalValuelabel.setText("数值：");
		intervalValuelabel.setBounds(10, 15, 35, 12);

		final Label intervalUnitLabel = new Label(time_group, SWT.NONE);
		intervalUnitLabel.setText("单位：");
		intervalUnitLabel.setBounds(10, 38, 35, 12);

		intervalValue = new Text(time_group, SWT.BORDER);
		intervalValue.setBounds(49, 10, 80, 20);

		intervalUnit = new Combo(time_group, SWT.NONE);
		intervalUnit.setBounds(49, 35, 80, 20);
		
		intervalUnit.setItems(new String[] {"秒", "分", "小时", "日", "周", "月", "季", "年"});
		intervalUnit.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				int index = intervalUnit.getSelectionIndex();
				intervalTimeUnit = SetTimeUnit(index);
			}
		});
		group.setBounds(1, 5, 305, 157);
		
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
		nameTxt.setText(GetValue(batchact.getName()));
		idTxt.setText(GetValue(batchact.getOID().toString()));
		desTxt.setText(GetValue(batchact.getDescription()));
		proTxt.setText(GetValue(batchact.getProcedure()));
		UnitCombo.select(GetTimeUnit(batchact.getTimeUnit()));
		createrTxt.setText(GetValue(batchact.getCreater()));
		modifierTxt.setText(GetValue(batchact.getLastModifier()));
		PropertyUtility.DateToDateTime(create_time, PropertyUtility.GetTimeValue(batchact.getCreatedDate()));
		PropertyUtility.DateToDateTime(modify_time, PropertyUtility.GetTimeValue(batchact.getLastModifiedDate()));
		PropertyUtility.DateToDateTime(startTime, PropertyUtility.GetTimeValue(batchact.getStartTime()));
		priTxt.setText((new Integer(batchact.getPriority())).toString());
		
		//根据是否是默认设置读取分布属性
		if (isDefault = (batchact.getIsDefault() == null ? false: batchact.getIsDefault()))
		{
			isDefaultBtn.setSelection(true);
			SetDisParam(defaultDis);
		}
		else
		{	
			isDefaultBtn.setSelection(false);
			SetDisParam(batchact.getDurationTime());
		}
		SetDistributionModifyAttribtue(isDefault);
		
		UnitCombo.select(GetTimeUnit(batchact.getTimeUnit()));
		
		SetBatchDisplay(batchact.getBatchType());
		//获取批处理参数
		maxTxt.setText(batchact.getMaxQuantity().toString());
		minTxt.setText(batchact.getMinQuantity().toString());
		
		bstartTime.setText(batchact.getBatStartTime().toString());
		bendTime.setText(batchact.getBatEndTime().toString());		
		cycle.setText(batchact.getRestartPeriod().toString());	
		timeunit = batchact.getTimeUnit();
		batchunit.select(GetTimeUnit(timeunit));
		
		timetag = batchact.getTimerQueueFlag();
		timequeneTagBtn.setSelection(timetag);
		
		emertag = batchact.getEmergencyFlag();
		emergencyTagBtn.setSelection(emertag);
		intervalValue.setText(batchact.getIntervalValue().toString());
		
		intervalTimeUnit = batchact.getIntervalTimeUnit();
		intervalUnit.select(GetTimeUnit(intervalTimeUnit));		
	}
	
	//切换分布面板上的元素显示
	protected void DisplayDistribution(int index)
	{
		switch (index)
		{
			case 0:
				param1.setText("数值：");
				param1.setVisible(true);
				param1Txt.setVisible(true);
				param2.setVisible(false);
				param2Txt.setVisible(false);
				dis = EnumDistribution.CONSTANT_LITERAL;
				break;
			case 1:
				param1.setText("上限值：");
				param1.setVisible(true);
				param1Txt.setVisible(true);
				param2.setText("下限值：");
				param2.setVisible(true);
				param2Txt.setVisible(true);
				dis = EnumDistribution.UNIFORM_LITERAL;
				break;
			case 2:
				param1.setText("平均值：");
				param1.setVisible(true);
				param1Txt.setVisible(true);
				param2.setText("标准方差：");
				param2.setVisible(true);
				param2Txt.setVisible(true);
				dis = EnumDistribution.NORMAL_LITERAL;
				break;
			case 3:
				param1.setText("平均值：");
				param1.setVisible(true);
				param1Txt.setVisible(true);
				param2.setText("下限值：");
				param2.setVisible(false);
				param2Txt.setVisible(false);
				dis = EnumDistribution.POISSION_LITERAL;
				break;
			case 4:
				param1.setText("平均值：");
				param1.setVisible(true);
				param1Txt.setVisible(true);
				param2.setText("下限值：");
				param2.setVisible(false);
				param2Txt.setVisible(false);
				dis = EnumDistribution.EXPONENTIAL_LITERAL;
				break;
			case 5:
				param1.setText("阿尔法：");
				param1.setVisible(true);
				param1Txt.setVisible(true);
				param2.setText("贝塔：");
				param2.setVisible(true);
				param2Txt.setVisible(true);
				dis = EnumDistribution.GAMMA_LITERAL;
				break;					
			default:
				break;
		}
	}
	
	//设置分布参数的可修改性
	protected void SetDistributionModifyAttribtue(boolean isdefault)
	{
		param1Txt.setEnabled(!isdefault);
		param2Txt.setEnabled(!isdefault);
		discombo.setEnabled(!isdefault);		
	}
	//设置分布参数
	protected void SetDisParam(DSDistribution dd)
	{
		if (dd == null)
		{
			discombo.select(0);
			param1Txt.setText("10.0");
			param2Txt.setText("1.0");
		}
		else
		{			
			int index ;
			switch(dd.getType().getValue())
			{
				case EnumDistribution.CONSTANT:
					index = 0;
					break;
				case EnumDistribution.UNIFORM:
					index = 1;
					break;
				case EnumDistribution.NORMAL:
					index = 2;
					break;
				case EnumDistribution.POISSION:
					index = 3;
					break;
				case EnumDistribution.EXPONENTIAL:
					index = 4;
					break;
				case EnumDistribution.GAMMA:
					index = 5;
					break;
				default:
					index = 0;
					dis = EnumDistribution.CONSTANT_LITERAL;
					break;
			}
			DisplayDistribution(index);
			discombo.select(index);
			param1Txt.setText(GetParamValue(dd.getDArgument1()));
			param2Txt.setText(GetParamValue(dd.getDArgument2()));
		}		
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
	
	//切换面板上的批处理格式显示
	protected void SetBatchDisplay(EnumBatchType btype)
	{
		if(btype == null)
		{
			batchType = EnumBatchType.AMOUNT_ONLY_LITERAL;
			btype = batchType;
		}
		switch(btype.getValue())
		{
		case EnumBatchType.AMOUNT_ONLY:
			quantityBtn.setSelection(true);
			timeBtn.setSelection(false);
			qortBtn.setSelection(false);
			qandtBtn.setSelection(false);
			break;
		case EnumBatchType.TIME_ONLY:
			quantityBtn.setSelection(false);
			timeBtn.setSelection(true);
			qortBtn.setSelection(false);
			qandtBtn.setSelection(false);
			break;
		case EnumBatchType.TIME_OR_AMOUNT:
			quantityBtn.setSelection(false);
			timeBtn.setSelection(false);
			qortBtn.setSelection(true);
			qandtBtn.setSelection(false);
			break;
		case EnumBatchType.TIME_AND_AMOUNT:
			quantityBtn.setSelection(false);
			timeBtn.setSelection(false);
			qortBtn.setSelection(false);
			qandtBtn.setSelection(true);
			break;
		default:
			break;
		}
		if (batchType == null)
		{
			batchType = btype;
		}
		DisplayBatch(batchType);
	}
	
	protected void DisplayBatch(EnumBatchType btype)
	{
		numgroup.setVisible(false);
		stlabel.setVisible(false);
		etlabel.setVisible(false);
		cyclelabel.setVisible(false);
		batchunitlabel.setVisible(false);
		bstartTime.setVisible(false);
		bendTime.setVisible(false);
		batchunit.setVisible(false);
		cycle.setVisible(false);
		timequeneTagBtn.setVisible(false);
		emergencyTagBtn.setVisible(false);
		time_group.setVisible(false);
		if (IsTimeRelated(btype))
		{
			stlabel.setVisible(true);
			etlabel.setVisible(true);
			cyclelabel.setVisible(true);
			batchunitlabel.setVisible(true);
			bstartTime.setVisible(true);
			bendTime.setVisible(true);
			batchunit.setVisible(true);
			cycle.setVisible(true);
			timequeneTagBtn.setVisible(true);
			emergencyTagBtn.setVisible(true);
			time_group.setVisible(true);
		}
		if(IsAmountRelated(btype))
		{
			numgroup.setVisible(true);
		}
	}
	
	//和时间是否相关
	protected boolean IsTimeRelated(EnumBatchType btype)
	{
		boolean result = false;
		if (btype == EnumBatchType.TIME_ONLY_LITERAL)
		{
			result = true;	
		}
		if (btype == EnumBatchType.TIME_OR_AMOUNT_LITERAL)
		{
			result = true;
		}
		if (btype == EnumBatchType.TIME_AND_AMOUNT_LITERAL)
		{
			result = true;
		}
		
		return result;
	}
	
	//和数量是否相关
	protected boolean IsAmountRelated(EnumBatchType btype)
	{
		boolean result = false;
		if (btype == EnumBatchType.AMOUNT_ONLY_LITERAL)
		{
			result = true;	
		}
		if (btype == EnumBatchType.TIME_OR_AMOUNT_LITERAL)
		{
			result = true;
		}
		if (btype == EnumBatchType.TIME_AND_AMOUNT_LITERAL)
		{
			result = true;
		}
		
		return result;
	}
	
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) 
		{
			boolean isValid = true;
			String information = null;
			//changed by zhangpeng-->verify the data
			try{
				int priority = new Integer(priTxt.getText()).intValue();
				double param1 = new Double(param1Txt.getText()).doubleValue();
				double param2 = new Double(param2Txt.getText()).doubleValue();
				switch(discombo.getSelectionIndex()){
				case 0:
					//常量分布-->不知可否为负
					break;
				case 1:
					//均匀分布-->不知可否为负，但上限应该大于等于下限
					if(param1 < param2){
						isValid = false;
						information = "上限必须大于等于下限";
					}
					break;
						
				case 2:
					//正态分布-->标准方差应该大于0
					if(param2 < 0){
						isValid = false;
						information = "标准方差必须大于等于0";
					}
						
				case 3:
					//泊松分布-->不清楚参数是否可以小于0
					break;
				case 4:
					//指数分布-->不清楚参数是否可以小于0
					break;
				case 5:
					//gamma分布-->不清楚参数是否可以小于0
					break;
				}
				if(isValid == false){
					MessageDialog.openWarning(this.getShell(),"无效数据", 
							information+"，请重新设置！");
					return;
				}
				if(priority> 50 || priority < 1){
					MessageDialog.openWarning(this.getShell(),"无效数据", 
							"优先级的范围只能是1-50，请重新设置！");
					return;
				}
				dsd.setDArgument1(param1);
				dsd.setDArgument2(param2);
				
				double bstartTimeValue = new Double(bstartTime.getText()).doubleValue();
				double bendTimeValue = new Double(bendTime.getText()).doubleValue();
				Double cycleValue = new Double(cycle.getText()).doubleValue();
				Double interval = new Double(intervalValue.getText()).doubleValue();
				
				int maxNum = new Integer(maxTxt.getText()).intValue();
				int minNum = new Integer(minTxt.getText()).intValue();
				if(bstartTimeValue<0 || bendTimeValue<0 ||bstartTimeValue > bendTimeValue){
					MessageDialog.openWarning(this.getShell(), "无效数据", "\"初始时间/终了时间\"设置有误");
					return;
				}
				if(cycleValue < 0 || interval < 0){
					MessageDialog.openWarning(this.getShell(), "无效数据", "\"重做周期/间隔时间\"设置有误");
					return;
				}
				if(minNum < 0 || maxNum < 0 || minNum > maxNum){
					MessageDialog.openWarning(this.getShell(), "无效数据", "数量\"最大/最小\"设置有误");
					return;
				}
				this.setProcedure(proTxt.getText());
				this.setBst(bstartTimeValue);
				this.setBet(bendTimeValue);
				this.setBrc(cycleValue);
				
				this.setMaxq(maxNum);
				this.setMinq(minNum);
				this.setPriority(priority);
				dsd.setType(dis);
				//间隔时间
				this.setInttime(interval);
			}catch(NumberFormatException e){
				String[] strs = e.getMessage().split("\"");
				MessageDialog.openWarning(this.getShell(), "无效数据", "输入\""+strs[1]+"\"有误，请您重新设置相应的值！");
				return;
			}
			time_create = PropertyUtility.DateTimeToDate(create_time);
			time_modify = PropertyUtility.DateTimeToDate(modify_time);
			if(time_create.after(time_modify)){
				MessageDialog.openWarning(this.getShell(), "无效数据", 
						"修改时间不得早于创建时间，请重新设置！");
				return;
			}
			this.setName(GetValue(this.getNameTxt().getText()));
			this.setCreater(GetValue(this.getCreaterTxt().getText()));
			this.setDescription(GetValue(this.getDesTxt().getText()));
			this.setId(GetValue(this.getIdTxt().getText()));
			this.setProcedure(GetValue(this.getProTxt().getText()));
			this.setModifier(GetValue(this.getModifierTxt().getText()));

			st = PropertyUtility.DateTimeToDate(startTime);
			//end changed by zhangpeng
		}
	super.buttonPressed(buttonId);
	}
	
	/**
	 * Return the initial size of the dialog
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(355, 310);
	}

	public Text getParam1Txt() {
		return param1Txt;
	}

	public void setCycleTxt(Text param1Txt) {
		this.param1Txt = param1Txt;
	}



	public Text getUnitTxt() {
		return unitTxt;
	}

	public void setUnitTxt(Text unitTxt) {
		this.unitTxt = unitTxt;
	}

	public Text getIoTxt() {
		return ioTxt;
	}

	public void setIoTxt(Text ioTxt) {
		this.ioTxt = ioTxt;
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

	public Text getProTxt() {
		return proTxt;
	}

	public void setProTxt(Text proTxt) {
		this.proTxt = proTxt;
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
		if (batchact.getName() == null)
		{
			title = "未命名";
		}
		else
			title = batchact.getName();
		
		newShell.setText("规格说明：" + title);
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

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
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

	public DSDistribution getDsd() {
		return dsd;
	}

	public void setDsd(DSDistribution dsd) {
		this.dsd = dsd;
	}

	public Date getSt() {
		return st;
	}

	public void setSt(Date st) {
		this.st = st;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean isIsdefault() {
		return isDefault;
	}

	public void setIsdefault(boolean isdefault) {
		this.isDefault = isdefault;
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

	public EnumTimeUnit getBtu() {
		return btu;
	}

	public void setBtu(EnumTimeUnit btu) {
		this.btu = btu;
	}

	public int getMaxq() {
		return maxq;
	}

	public void setMaxq(int maxq) {
		this.maxq = maxq;
	}

	public int getMinq() {
		return minq;
	}

	public void setMinq(int minq) {
		this.minq = minq;
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
