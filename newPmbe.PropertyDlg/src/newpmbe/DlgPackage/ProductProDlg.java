package newpmbe.DlgPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.resources.ResourcesPlugin;
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
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text; 

import vpml.informationpackage.EMIForm;
import vpml.processpackage.EMPForm;
import vpml.processpackage.EMPLeafProduct;
import vpml.processpackage.EMPProductPackage;
import vpml.utilpackage.DSDistribution;
import vpml.utilpackage.EnumDistribution;
import vpml.utilpackage.EnumIOType;
import vpml.utilpackage.EnumTimeUnit;
import vpml.utilpackage.UtilpackageFactory;

public class ProductProDlg extends Dialog {
	private Text listTxt;
	private Text param2Txt;
	private Combo discombo;
	private Text param1Txt;
	private Text costTxt;
	private Combo UnitCombo;
	private Combo ioCombo;
	private Label param1;
	private Label distributeTxt;
	private Label param2;
	private Label listLbl;
	private Label unitLabel;
	private Label periodlbl;
	private Text  periodTxt;
	
	
	private Text formTypeTxt;
	private EMIForm formType;
	
	private Text unitTxt;
	private Text ioTxt;
	private Text handleTxt;
//	private Text proTxt;
	private Text desTxt;
	private Text nameTxt;
	private EMPLeafProduct lprt;
	private Composite topComp;
	
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	private DSDistribution dsd = UtilpackageFactory.eINSTANCE.createDSDistribution();
	private EnumDistribution dis;
	private EnumIOType iotype;
	private EnumTimeUnit timeunit;
	private String name;
	private String handle;
	private String creater;
	private String description;
	private int	period;
	
	private int initqueue;
	private double cost;

	private boolean isSimulation;
	/**
	 * Create the dialog
	 * @param parentShell
	 */
	public ProductProDlg(Shell parentShell) {
		super(parentShell);
	}

	public ProductProDlg(Shell parent, EObject obj){
		this(parent);
		lprt = (EMPLeafProduct)obj;
	} 
	public ProductProDlg(Shell parent, EObject obj, boolean isSim) {
		// TODO Auto-generated constructor stub
		this(parent);
		lprt = (EMPLeafProduct)obj;
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
//		Composite 
		topComp=new Composite(parent,SWT.NONE);
		
		final TabFolder tabFolder = new TabFolder(topComp, SWT.NONE);
		
		tabFolder.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, false));
		tabFolder.setBounds(15, 10,318, 265);

		final TabItem defItem = new TabItem(tabFolder, SWT.NONE);
		defItem.setText("����");
		
		final Composite defcomposite = new Composite(tabFolder, SWT.NONE);
		defItem.setControl(defcomposite);

		final Label nameLabel = new Label(defcomposite, SWT.NONE);
		nameLabel.setText("���ƣ�");
		nameLabel.setBounds(10, 10, 30, 12);

		nameTxt = new Text(defcomposite, SWT.BORDER);
		nameTxt.setEnabled(!isSimulation);
		nameTxt.setBounds(10, 25, 287, 18);

		final Label desLabel = new Label(defcomposite, SWT.NONE);
		desLabel.setText("������");
		desLabel.setBounds(10, 55, 30, 12);

		desTxt = new Text(defcomposite, SWT.V_SCROLL | SWT.BORDER | SWT.WRAP);
		desTxt.setEnabled(!isSimulation);
		desTxt.setBounds(10, 70, 287, 147);

//		final Label proLabel = new Label(defcomposite, SWT.NONE);
//		proLabel.setText("���̣�");
//		proLabel.setBounds(10, 125, 30, 12);

//		proTxt = new Text(defcomposite, SWT.V_SCROLL | SWT.BORDER | SWT.WRAP);
//		proTxt.setEnabled(!isSimulation);
//		proTxt.setBounds(10, 140, 287, 49);

		final TabItem parItem = new TabItem(tabFolder, SWT.NONE);
		parItem.setText("����");

		final Composite parComposite = new Composite(tabFolder, SWT.NONE);
		parItem.setControl(parComposite);

		if(lprt instanceof EMPForm){
			final Label typeLabel = new Label(parComposite, SWT.NONE);
			typeLabel.setText("���ͣ�");
			typeLabel.setBounds(10, 15, 30, 12);
			
			formTypeTxt = new Text(parComposite, SWT.BORDER);
			formTypeTxt.setBounds(50, 11, 188, 20);
			
		}else{
			final Label handlerLabel = new Label(parComposite, SWT.NONE);
			handlerLabel.setText("·����");
			handlerLabel.setBounds(10, 15, 30, 12);

			handleTxt = new Text(parComposite, SWT.BORDER);
			handleTxt.setBounds(50, 11, 188, 20);
		}
		
		final Label ioLabel = new Label(parComposite, SWT.NONE);
		ioLabel.setText("����/���ģʽ��");
		ioLabel.setBounds(10, 45, 90, 12);

		ioCombo = new Combo(parComposite, SWT.NONE);
		ioCombo.setEnabled(!isSimulation);
		ioCombo.setItems(new String[] {"��������", "������ϵ�һ", "�����������"});
		ioCombo.setBounds(110, 40, 100, 25);
		
		periodlbl = new Label(parComposite, SWT.NONE);
		periodlbl.setText("���ڣ�");
		periodlbl.setBounds(10, 100, 64, 12);
		periodlbl.setVisible(false);
		
		periodTxt = new Text(parComposite, SWT.BORDER);
		periodTxt.setBounds(110, 95, 100, 20);
		periodTxt.setVisible(false);

		param1 = new Label(parComposite, SWT.NONE);
		param1.setText("����ֵ��");
		param1.setBounds(10, 100, 64, 12);
		param1.setVisible(false);

		unitLabel = new Label(parComposite, SWT.NONE);
		unitLabel.setText("��λ��");
		unitLabel.setBounds(10, 146, 30, 12);
		unitLabel.setVisible(false);

		UnitCombo = new Combo(parComposite, SWT.NONE);
		UnitCombo.setItems(new String[] {"��", "��", "Сʱ", "��", "��", "��", "��", "��"});
		UnitCombo.setBounds(110, 146, 100, 25);
		UnitCombo.setVisible(false);

		final Label costLabel = new Label(parComposite, SWT.NONE);
		costLabel.setText("���ã�");
		costLabel.setBounds(10, 205, 30, 12);

		costTxt = new Text(parComposite, SWT.BORDER);
		costTxt.setBounds(110, 205, 100, 20);
		

		param1Txt = new Text(parComposite, SWT.BORDER);
		param1Txt.setBounds(110, 95, 100, 20);
		param1Txt.setVisible(false);

		distributeTxt = new Label(parComposite, SWT.NONE);
		distributeTxt.setText("����ֲ���");
		distributeTxt.setBounds(10, 70, 64, 12);
		distributeTxt.setVisible(false);
		
		discombo = new Combo(parComposite, SWT.NONE);
		discombo.setItems(new String[]{"�����ֲ�", "���ȷֲ�", "��̬�ֲ�", "���ɷֲ�", "ָ���ֲ�", "Gamma�ֲ�"});
		discombo.setBounds(110, 65, 100, 20);
		discombo.setVisible(false);
		
		param2Txt = new Text(parComposite, SWT.BORDER);
		param2Txt.setVisible(false);
		param2Txt.setBounds(110, 120, 100, 20);

		param2 = new Label(parComposite, SWT.NONE);
		param2.setBounds(10, 124, 64, 12);
		param2.setVisible(false);

		listLbl = new Label(parComposite, SWT.NONE);
		listLbl.setText("��ʼ���У�");
		listLbl.setBounds(10, 174, 64, 12);
		listLbl.setVisible(false);

		listTxt = new Text(parComposite, SWT.BORDER);
		listTxt.setBounds(110, 174, 100, 20);
		listTxt.setVisible(false);
		
		//����������Ӧ�б��
		ioCombo.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				int index = ioCombo.getSelectionIndex();
				ChangeDisplayByIOType(index);
			}
		});
		
		//����ֲ�ѡ����Ӧ
		discombo.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				int index = discombo.getSelectionIndex();
				ChangeDisplayByDistribution(index, EnumIOType.SEQUENCE_SOURCE_LITERAL);
			}
		});
		
		UnitCombo.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				int index = UnitCombo.getSelectionIndex();
				SetTimeUnit(index);
			}
		});
		
		if(lprt instanceof EMPForm){
			final Button button = new Button(parComposite, SWT.NONE);
			button.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					FormTypeSetDlg dlg=new FormTypeSetDlg(topComp.getShell());
					dlg.open();
					EMIForm ft=dlg.getForm();
					if(ft!=null){
						setFormType(ft);
						if(ft.getName()!=null)
							formTypeTxt.setText(ft.getName());
					}
				}
			});
			button.setText("ѡ��...");
			button.setBounds(244, 10, 55, 23);
		}else{
		
			final Button button = new Button(parComposite, SWT.NONE);
			button.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					FileDialog dlg=new FileDialog(topComp.getShell());
					dlg.setText("ѡ���ļ�");
					dlg.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString());
					String file=dlg.open();
					if(file!=null){
						handleTxt.setText(file);
					}
				}
			});
			button.setText("ѡ��...");
			button.setBounds(244, 10, 55, 23);
		}
		
		LoadData();
		return topComp;
	}

	//���ݷֲ����͸ı����Ԫ�ز���
	protected void ChangeDisplayByDistribution(int index, EnumIOType iotype)
	{
		if (iotype != EnumIOType.SEQUENCE_SOURCE_LITERAL)
		{
			return;
		}
		periodlbl.setVisible(false);
		periodTxt.setVisible(false);
		switch (index)
		{
			case 0:
				param1.setText("��ֵ��");
				param1.setVisible(true);
				param1Txt.setVisible(true);
				param2.setVisible(false);
				param2Txt.setVisible(false);
				dis = EnumDistribution.CONSTANT_LITERAL;
				break;
			case 1:
				param1.setText("����ֵ��");
				param1.setVisible(true);
				param1Txt.setVisible(true);
				param2.setText("����ֵ��");
				param2.setVisible(true);
				param2Txt.setVisible(true);
				dis = EnumDistribution.UNIFORM_LITERAL;
				break;
			case 2:
				param1.setText("ƽ��ֵ��");
				param1.setVisible(true);
				param1Txt.setVisible(true);
				param2.setText("��׼���");
				param2.setVisible(true);
				param2Txt.setVisible(true);
				dis = EnumDistribution.NORMAL_LITERAL;
				break;
			case 3:
				param1.setText("ƽ��ֵ��");
				param1.setVisible(true);
				param1Txt.setVisible(true);
				param2.setText("����ֵ��");
				param2.setVisible(false);
				param2Txt.setVisible(false);
				dis = EnumDistribution.POISSION_LITERAL;
				break;
			case 4:
				param1.setText("ƽ��ֵ��");
				param1.setVisible(true);
				param1Txt.setVisible(true);
				param2.setText("����ֵ��");
				param2.setVisible(false);
				param2Txt.setVisible(false);
				dis = EnumDistribution.EXPONENTIAL_LITERAL;
				break;
			case 5:
				param1.setText("��������");
				param1.setVisible(true);
				param1Txt.setVisible(true);
				param2.setText("������");
				param2.setVisible(true);
				param2Txt.setVisible(true);
				dis = EnumDistribution.GAMMA_LITERAL;
				break;					
			default:
				dis = EnumDistribution.CONSTANT_LITERAL;
				break;
		}
	}
	//����io���͸ı����Ԫ�ز���
	protected void ChangeDisplayByIOType(int index)
	{
		switch(index)
		{
			case 0:
				distributeTxt.setVisible(false);
				discombo.setVisible(false);
				periodlbl.setVisible(true);
				periodTxt.setVisible(true);
				param1.setVisible(false);
				param1Txt.setVisible(false);
				unitLabel.setVisible(true);
				UnitCombo.setVisible(true);
				param2.setVisible(false);
				param2Txt.setVisible(false);
				listLbl.setVisible(false);
				listTxt.setVisible(false);
				iotype = EnumIOType.NON_SOURCE_LITERAL;
				break;
			case 1:
				distributeTxt.setVisible(false);
				discombo.setVisible(false);
				periodlbl.setVisible(false);
				periodTxt.setVisible(false);
				param1.setVisible(false);
				param1Txt.setVisible(false);
				unitLabel.setVisible(false);
				UnitCombo.setVisible(false);
				param2.setVisible(false);
				param2Txt.setVisible(false);
				listLbl.setVisible(false);
				listTxt.setVisible(false);
				iotype = EnumIOType.SINGLE_SOURCE_LITERAL;
				break;
			case 2:
				distributeTxt.setVisible(true);
				discombo.setVisible(true);
				periodlbl.setVisible(false);
				periodTxt.setVisible(false);
				param1.setVisible(true);
				param1Txt.setVisible(true);
				unitLabel.setVisible(true);
				UnitCombo.setVisible(true);
				param2.setVisible(false);
				param2Txt.setVisible(false);
				listLbl.setVisible(true);
				listTxt.setVisible(true);
				iotype = EnumIOType.SEQUENCE_SOURCE_LITERAL;
				SetDisParam(dsd, iotype);
				break;
			default:
				break;
		}
	}
	/**
	 * Create contents of the button bar
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "ȷ��",
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				"ȡ��", false);
	}

	protected void LoadData()
	{
		nameTxt.setText(GetValue(lprt.getName()));
//		proTxt.setText(GetValue(lprt.g));
		desTxt.setText(GetValue(lprt.getDescription()));
		if(lprt instanceof EMPForm){
			if(((EMPForm)lprt).getFormType()!=null){
				if(((EMPForm)lprt).getFormType().getName()!=null){
					formTypeTxt.setText(((EMPForm)lprt).getFormType().getName());
				}
			}
		}else{
			handleTxt.setText(GetValue(lprt.getAttachment()));
		}
		periodTxt.setText((lprt.getPeriod()).toString());
		costTxt.setText(lprt.getCost().toString());
		listTxt.setText(lprt.getInitQueue().toString());
		SetIOType(lprt.getIoType());
		SetDisParam(lprt.getDurationTime(), lprt.getIoType());
		UnitCombo.select(GetTimeUnit(lprt.getTimeUnit()));		
	}
	
	protected void SetIOType(EnumIOType iotype)
	{
		int ioindex;
		if (iotype == null)
		{
			ioindex = 0;			
		}
		else
		{
			switch(iotype.getValue())
			{
			case EnumIOType.NON_SOURCE:
				ioindex = 0;
				break;
			case EnumIOType.SINGLE_SOURCE:
				ioindex = 1;
				break;
			case EnumIOType.SEQUENCE_SOURCE:
				ioindex = 2;
				break;
			default:
				ioindex = 0;
				break;
			}
		}
		ioCombo.select(ioindex);
		ChangeDisplayByIOType(ioindex);
	}
	
	protected void SetDisParam(DSDistribution dd, EnumIOType iotype)
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

			ChangeDisplayByDistribution(index, iotype);
			discombo.select(index);
			param1Txt.setText(GetParamValue(dd.getDArgument1()));
			param2Txt.setText(GetParamValue(dd.getDArgument2()));
		}		
	}
	//��ȡʱ�䵥λ
	protected int GetTimeUnit(EnumTimeUnit tu)
	{
		int index;
		if (tu == null)
			index = 2; //Ĭ������ΪСʱ
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
		timeunit = tu;
		return index;
	}
	
	//����ʱ�䵥λ
	protected void SetTimeUnit(int index)
	{
		switch (index)
		{
		case 7:
			timeunit = EnumTimeUnit.YEAR_LITERAL;
			break;
		case 6:
			timeunit = EnumTimeUnit.QUARTER_LITERAL;
			break;
		case 5:
			timeunit = EnumTimeUnit.MONTH_LITERAL;
			break;
		case 4:
			timeunit = EnumTimeUnit.WEEK_LITERAL;
			break;
		case 3:
			timeunit = EnumTimeUnit.DAY_LITERAL;
			break;	
		case 2:
			timeunit = EnumTimeUnit.HOUR_LITERAL;
			break;
		case 1:
			timeunit = EnumTimeUnit.MINUTE_LITERAL;
			break;
		case 0:
			timeunit = EnumTimeUnit.SECOND_LITERAL;
			break;
		default:
			timeunit = EnumTimeUnit.HOUR_LITERAL;
			break;
		}
	}
	//��ȡ�ַ���ֵ
	protected String GetValue(String value)
	{
		return (value == null ? "":value);
	}
	
	//��ȡʱ���ַ�����ֵ
	protected String GetTimeValue(String time)
	{
		if (time == null)
		{
			//���ʱ��Ϊ�գ��򷵻ص�ǰֵ
			Date date = new Date();
			return formatter.format(date);
		}
		else
			return time;
	}
	
	//��ȡ����ֵ
	protected String GetParamValue(double value)
	{
		 return new Double(value).toString();
	}
	
	protected String GetParamValue(int value)
	{
		return (new Integer(value)).toString();
	}
	/**
	 * Return the initial size of the dialog
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(355, 359);
	}

	public Text getParam1Txt() {
		return param1Txt;
	}

	public void setCycleTxt(Text param1Txt) {
		this.param1Txt = param1Txt;
	}

	public Text getCostTxt() {
		return costTxt;
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

	public Text getHandleTxt() {
		return handleTxt;
	}

	public void setHandleTxt(Text handleTxt) {
		this.handleTxt = handleTxt;
	}

//	public Text getProTxt() {
//		return proTxt;
//	}
//
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
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		String title = null;
		if(lprt.getName() == null)
			title = "δ����";
		else
			title = lprt.getName();
		newShell.setText("���˵����" + title);

	}
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) 
		{
			boolean isValid = true;
			String information = null;
			//changed by zhangpeng-->verify the data
			try{
				if(ioCombo.getSelectionIndex()== 0){
					int periodNum = new Integer(periodTxt.getText()).intValue();
					if(periodNum < 0){
						MessageDialog.openWarning(this.getShell(),"��Ч����", 
								"���ڲ���С��0��");
						return;
					}
					this.setPeriod(periodNum);
				}else if(ioCombo.getSelectionIndex() == 2){
					double param1 = new Double(param1Txt.getText()).doubleValue();
					double param2 = new Double(param2Txt.getText());
					switch(discombo.getSelectionIndex()){
					case 0:
						//�����ֲ�-->��֪�ɷ�Ϊ��
						break;
					case 1:
						//���ȷֲ�-->��֪�ɷ�Ϊ����������Ӧ�ô��ڵ�������
						if(param1 < param2){
							isValid = false;
							information = "���ޱ�����ڵ�������";
						}
						break;
							
					case 2:
						//��̬�ֲ�-->��׼����Ӧ�ô���0
						if(param2 < 0){
							isValid = false;
							information = "��׼���������ڵ���0";
						}
							
					case 3:
						//���ɷֲ�-->����������Ƿ����С��0
						break;
					case 4:
						//ָ���ֲ�-->����������Ƿ����С��0
						break;
					case 5:
						//gamma�ֲ�-->����������Ƿ����С��0
						break;
					}
					if(isValid == false){
						MessageDialog.openWarning(this.getShell(),"��Ч����", 
								information+"�����������ã�");
						return;
					}
					int initQueue = new Integer(listTxt.getText()).intValue();
					if(initQueue < 0)
					{
						MessageDialog.openWarning(this.getShell(),"��Ч����", 
								"��ʼ���в�ӦС��0��");
						return;
					}
					dsd.setDArgument1(param1);
					dsd.setDArgument2(param2);
					dsd.setType(dis);
					this.setInitqueue(initQueue);
				}

				double cost = new Double(costTxt.getText()).doubleValue();
				
				if(cost < 0){
					MessageDialog.openWarning(this.getShell(), "��Ч����", "��ֵ��������С��0");
					return;
				}
				this.setCost(cost);

//				dsd.setDArgument1(new Double(param1Txt.getText()));
//				dsd.setDArgument2(new Double(param2Txt.getText()));
			}catch(NumberFormatException e){
				String[] strs = e.getMessage().split("\"");
				MessageDialog.openWarning(this.getShell(), "��Ч����", "����\""+strs[1]+"\"������������������Ӧ��ֵ��");
				return;
			}
			this.setName(GetValue(nameTxt.getText()));
			if(!(lprt instanceof EMPForm)){
				this.setHandle(GetValue(handleTxt.getText()));
			}
			this.setDescription(GetValue(desTxt.getText()));
			//end changed by zhangpeng

		}
	super.buttonPressed(buttonId);
	}

	public EnumIOType getIotype() {
		return iotype;
	}

	public void setIotype(EnumIOType iotype) {
		this.iotype = iotype;
	}

	public EnumTimeUnit getTimeunit() {
		return timeunit;
	}

	public void setTimeunit(EnumTimeUnit timeunit) {
		this.timeunit = timeunit;
	}

	public DSDistribution getDsd() {
		return dsd;
	}

	public void setDsd(DSDistribution dsd) {
		this.dsd = dsd;
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

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public int getInitqueue() {
		return initqueue;
	}

	public void setInitqueue(int initqueue) {
		this.initqueue = initqueue;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public EMIForm getFormType() {
		return formType;
	}

	public void setFormType(EMIForm formType) {
		this.formType = formType;
	}



}
