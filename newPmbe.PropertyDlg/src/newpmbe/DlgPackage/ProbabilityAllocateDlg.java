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

import vpml.processpackage.*;

public class ProbabilityAllocateDlg extends Dialog {
	

	private Text pTxt;
	private EMPDataFlow df;
	
	private String name;
	private String description;
	private String procedure;
	private double probability;


	/**
	 * Create the dialog
	 * @param parentShell
	 */
	public ProbabilityAllocateDlg(Shell parentShell) {
		super(parentShell);
	}

	public ProbabilityAllocateDlg(Shell parent, EObject obj){
		this(parent);
		df = (EMPDataFlow) obj;			
	} 
	/**
	 * Create contents of the dialog
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite topComp=new Composite(parent,SWT.NONE);

		final Composite composite = new Composite(topComp, SWT.NONE);
		composite.setBounds(0, 0, 347, 34);

		final Label label = new Label(composite, SWT.NONE);
		label.setText("����:");
		label.setBounds(30, 18, 38, 12);

		pTxt = new Text(composite, SWT.BORDER);
		pTxt.setBounds(70, 14, 124, 20);
		
		LoadData();
		return topComp;
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
		pTxt.setText(df.getProbability().toString());
	}
	
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);

		newShell.setText("����·������");
	}
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) 
		{
			//changed by zhangpeng-->verify the data
			try{
				probability = new Double(pTxt.getText());
				if(probability < 0){
					MessageDialog.openWarning(this.getShell(), "��Ч����", "\"����\"ֵ������Ч");
				}
			}catch(NumberFormatException e){
				String[] strs = e.getMessage().split("\"");
				MessageDialog.openWarning(this.getShell(), "��Ч����", "����\""+strs[1]+"\"������������������Ӧ��ֵ��");
				return;
			}
			//end changed by zhangpeng
			
		}
	super.buttonPressed(buttonId);
	}
	
	/**
	 * Return the initial size of the dialog
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(355, 106);
	}

	public double getProbability() {
		return probability;
	}

	public void setProbability(double probability) {
		this.probability = probability;
	}
	
}
