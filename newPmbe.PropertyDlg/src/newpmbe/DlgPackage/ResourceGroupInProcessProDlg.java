package newpmbe.DlgPackage;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
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

public class ResourceGroupInProcessProDlg extends Dialog {
	
	private Text codeText;
	private CCombo namecombo;
	private Text resTxt;
	private Text numTxt;
	private Text priTxt;
	private Text orgTypeTxt;
	private Text desTxt;

	private EMOResourceGroupType resGroup;
	
	private String name;
	private String code;
	private String description;
	private String orgType;
	private String princpal;
	private Long   arrangeNum;
	private String reserved;
	private EList resource;
	private EMODiagram diagram;
//	private EMPDiagram pdiagram;
//	private EList emodiagram;
	
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
//		pdiagram = resGroup.getEmpDiagram();
//		emodiagram = pdiagram.getEmoDiagrams();
//		if (emodiagram != null && emodiagram.size() > 0)
//		{
//			diagram = (EMODiagram)emodiagram.get(0); 
		if(diagram != null)
			resource = diagram.getResourceGroupTypes();
		else
			resource = null;
	}

	/**
	 * Create the dialog
	 * @param parentShell
	 */
	public ResourceGroupInProcessProDlg(Shell parentShell) {
		super(parentShell);
	}

	public ResourceGroupInProcessProDlg(Shell parent, EObject obj){
		this(parent);
		resGroup = (EMOResourceGroupType) obj;			
	} 
	public ResourceGroupInProcessProDlg(Shell parent, EObject obj, IFile processFile){
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
		tabFolder.setBounds(15, 10,318, 209);

		final TabItem defItem = new TabItem(tabFolder, SWT.NONE);
		defItem.setText("����");

		final TabItem resTab = new TabItem(tabFolder, SWT.NONE);
		resTab.setText("��Դ");

		final Composite composite = new Composite(tabFolder, SWT.NONE);
		resTab.setControl(composite);

		final Label orglbl = new Label(composite, SWT.NONE);
		orglbl.setText("��֯����:");
		orglbl.setBounds(50, 22, 60, 13);

		orgTypeTxt = new Text(composite, SWT.BORDER);
		orgTypeTxt.setEnabled(false);
		orgTypeTxt.setBounds(130, 18, 123, 20);

		final Label prilbl = new Label(composite, SWT.NONE);
		prilbl.setText("������:");
		prilbl.setBounds(50, 55, 60, 12);

		priTxt = new Text(composite, SWT.BORDER);
		priTxt.setEnabled(false);
		priTxt.setBounds(130, 50, 123, 20);

		final Label numlbl = new Label(composite, SWT.NONE);
		numlbl.setText("��ʾ���:");
		numlbl.setBounds(50, 90, 60, 12);

		numTxt = new Text(composite, SWT.BORDER);
		numTxt.setEnabled(false);
		numTxt.setBounds(130, 85, 123, 20);

		final Label reslbl = new Label(composite, SWT.NONE);
		reslbl.setText("��ע:");
		reslbl.setBounds(50, 156, 58, 12);

		resTxt = new Text(composite, SWT.BORDER);
		resTxt.setEnabled(false);
		resTxt.setBounds(130, 153, 123, 20);

		final Label codeLabel = new Label(composite, SWT.NONE);
		codeLabel.setText("����:");
		codeLabel.setBounds(50, 123, 36, 13);

		codeText = new Text(composite, SWT.BORDER);
		codeText.setEditable(false);
		codeText.setBounds(130, 120, 123, 20);
		
		final Composite defcomposite = new Composite(tabFolder, SWT.NONE);
		defItem.setControl(defcomposite);

		final Label nameLabel = new Label(defcomposite, SWT.NONE);
		nameLabel.setText("���ƣ�");
		nameLabel.setBounds(10, 10, 30, 12);

		final Label desLabel = new Label(defcomposite, SWT.NONE);
		desLabel.setText("������");
		desLabel.setBounds(10, 55, 30, 12);

		desTxt = new Text(defcomposite, SWT.V_SCROLL | SWT.BORDER | SWT.WRAP);
		desTxt.setEnabled(false);
		desTxt.setBounds(10, 70, 287, 103);

		namecombo = new CCombo(defcomposite, SWT.BORDER);
		namecombo.setEditable(false);
		namecombo.setBounds(10, 25, 287, 20);
		namecombo.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e)
			{
				int index = namecombo.getSelectionIndex();
				ChangeDisplay(index);
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
		createButton(parent, IDialogConstants.OK_ID, "ȷ��",
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				"ȡ��", false);
	}

	protected void LoadData()
	{	
		LoadResource();
		int index = -1;
		EMOResourceGroupType obj = null;
		if (resource != null)
		{
			Iterator iter = resource.iterator();

			while(iter.hasNext())
			{
				obj = (EMOResourceGroupType)(iter.next());
				String name = obj.getName();
				//����δ��������Դ������
				if(name != null){
					index++;
					namecombo.add(name, index);
					namecombo.setData("" + index, obj);
				}
			}
		}
		if (resGroup.getName() != null)
		{
			if(obj != null)
				name = obj.getName();
			int count = namecombo.getItemCount();
			for (index = 0; index < count; index++)
			{
				obj = (EMOResourceGroupType)namecombo.getData(""+index);
				if (obj.getName().equals(resGroup.getName()))
				{
					namecombo.select(index);
					break;
				}
			}
			if (obj != null)
			{
				codeText.setText(PropertyUtility.GetValue(resGroup.getCode()));
				desTxt.setText(PropertyUtility.GetValue(resGroup.getDescription()));
				orgTypeTxt.setText(PropertyUtility.GetValue(resGroup.getOrganiztionType()));
				priTxt.setText(PropertyUtility.GetValue(resGroup.getPrincipal()));
				numTxt.setText(resGroup.getArrangeNumber().toString());
				resTxt.setText(PropertyUtility.GetValue(resGroup.getReserved()));
			}
			else
			{
				DefaultSet();
			}
		}
		else
		{
			namecombo.select(0);
			ChangeDisplay(0);
		}
	}
	protected void DefaultSet()
	{
		codeText.setText("");
		desTxt.setText("��");
		orgTypeTxt.setText("δ����");
		priTxt.setText("��");
		numTxt.setText((new Integer(1)).toString());
		resTxt.setText("δ����");
	}
	protected void ChangeDisplay(int index)
	{
		EMOResourceGroupType obj = (EMOResourceGroupType)namecombo.getData(""+index);
		if (obj == null)
		{
			DefaultSet();
			return;
		}
		name = obj.getName();
		codeText.setText(PropertyUtility.GetValue(obj.getCode()));
		desTxt.setText(PropertyUtility.GetValue(obj.getDescription()));
		orgTypeTxt.setText(PropertyUtility.GetValue(obj.getOrganiztionType()));
		priTxt.setText(PropertyUtility.GetValue(obj.getPrincipal()));
		numTxt.setText(obj.getArrangeNumber().toString());
		resTxt.setText(PropertyUtility.GetValue(obj.getReserved()));
	}
	
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		String title = null;
		if(resGroup.getName() == null)
		{
			title = "δ����";
		}
		else
			title = resGroup.getName();
		
		newShell.setText("���˵����" + title);
	}
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) 
		{
			//changed by zhangpeng-->verify the data
			try{
				long num = new Long(numTxt.getText()).longValue();
				if(num < 0){
					MessageDialog.openWarning(this.getShell(), "��Ч����", "\"aNumber\"������Ӧ��С��0");
					return;
				}
				this.setArrangeNum(num);
			}catch(NumberFormatException e){
				String[] strs = e.getMessage().split("\"");
				MessageDialog.openWarning(this.getShell(), "��Ч����", "����\""+strs[1]+"\"������������������Ӧ��ֵ��");
				return;
			}
			//end changed by zhangpeng
			this.setDescription(PropertyUtility.GetValue(this.getDesTxt().getText()));
			this.setPrincpal(PropertyUtility.GetValue(priTxt.getText()));
			this.setOrgType(PropertyUtility.GetValue(orgTypeTxt.getText()));
//			this.setArrangeNum(new Long(numTxt.getText()));
			this.setReserved(PropertyUtility.GetValue(resTxt.getText()));
			this.setCode(codeText.getText());
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
		return new Point(355, 302);
	}


	public Text getDesTxt() {
		return desTxt;
	}

	public void setDesTxt(Text desTxt) {
		this.desTxt = desTxt;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
	public EMDiagram getResourceDiagram(IFile recordFile){
//		Boolean isExist = false;
		EMDiagram emDiagram = null;
		//�ȶ��룬����û�д���Ŀ
		 try { 
			 FileReader fr = new FileReader(recordFile.getRawLocation().toFile());
			        BufferedReader br = new BufferedReader(fr);
			        String record = new String();
			        while ((record = br.readLine()) != null) {
			        	String strs[] = record.split("=");
			        	if(strs[0].equals(processFile.getName())
			        			&& strs[1].equals(processFile.getRawLocation().toString())){
			        	//�Ѿ������˴���Ŀ�����޸Ĵ���Ŀ
//			        		isExist = true;
			        		emDiagram = (EMDiagram)PropertyUtility.GetDiagramObject(strs[2]);
			        		break;
			        	}
			 }
			 br.close();
			 fr.close(); 
	      } catch (IOException e) { 
	          System.out.println("IO���󣺶�д����ʧ��");
	          e.printStackTrace();
	      }
	      return emDiagram;
	}
}
