package newpmbe.DlgPackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
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

import vpml.processpackage.*;

public class MileStoneProDlg extends Dialog {
	
	private Text proTxt;
	private Text desTxt;
	private Text nameTxt;

	private EMPMileStone milestone;
	
	private String name;
	private String description;
	private String procedure;


	/**
	 * Create the dialog
	 * @param parentShell
	 */
	public MileStoneProDlg(Shell parentShell) {
		super(parentShell);
	}

	public MileStoneProDlg(Shell parent, EObject obj){
		this(parent);
		milestone = (EMPMileStone) obj;			
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
		tabFolder.setBounds(15, 10,318, 220);

		final TabItem defItem = new TabItem(tabFolder, SWT.NONE);
		defItem.setText("定义");
		
		final Composite defcomposite = new Composite(tabFolder, SWT.NONE);
		defItem.setControl(defcomposite);

		final Label nameLabel = new Label(defcomposite, SWT.NONE);
		nameLabel.setText("名称：");
		nameLabel.setBounds(10, 10, 30, 12);

		nameTxt = new Text(defcomposite, SWT.BORDER);
		nameTxt.setBounds(10, 25, 287, 18);

		final Label desLabel = new Label(defcomposite, SWT.NONE);
		desLabel.setText("描述：");
		desLabel.setBounds(10, 55, 30, 12);

		desTxt = new Text(defcomposite, SWT.V_SCROLL | SWT.BORDER | SWT.WRAP);
		desTxt.setBounds(10, 70, 287, 49);

		final Label proLabel = new Label(defcomposite, SWT.NONE);
		proLabel.setText("过程：");
		proLabel.setBounds(10, 125, 30, 12);

		proTxt = new Text(defcomposite, SWT.V_SCROLL | SWT.BORDER | SWT.WRAP);
		proTxt.setBounds(10, 140, 287, 49);
		
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
		nameTxt.setText(PropertyUtility.GetValue(milestone.getName()));
		desTxt.setText(PropertyUtility.GetValue(milestone.getDescription()));
		proTxt.setText(PropertyUtility.GetValue(milestone.getProcess()));
	}
	
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		String title = null;
		if(milestone.getName() == null)
			title = "未命名";
		else
			title = milestone.getName();
		newShell.setText("规格说明：" + title);
	}
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) 
		{
			this.setName(PropertyUtility.GetValue(this.getNameTxt().getText()));
			this.setDescription(PropertyUtility.GetValue(this.getDesTxt().getText()));
			this.setProcedure(PropertyUtility.GetValue(this.getProTxt().getText()));
			this.setProcedure(proTxt.getText());
//			this.setTime_modify(PropertyUtility.GetTimeValue(new Date(modify_time.getYear(), modify_time.getMonth(), modify_time.getDay(), modify_time.getHours(), modify_time.getMinutes(), modify_time.getSeconds())));
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

	public String getProcedure() {
		return procedure;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}
	
	/**
	 * Return the initial size of the dialog
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(355, 310);
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
}
