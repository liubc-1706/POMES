package newpmbe.models.transform.dialogs;

import java.io.File;
import newpmbe.models.transform.Transformation;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;


public class IproToPMBEDialog extends Dialog {
	private Composite topComp;
	private Text text1;
	private Text text2;
	
	public IproToPMBEDialog(Shell parentShell) {
		super(parentShell);
	}
	
	protected Control createDialogArea(Composite parent){
		this.getShell().setText("ת���洢��ʽ");
		topComp=new Composite(parent,SWT.NONE);
		topComp.setLayout(null);
		
		Label label1=new Label(topComp,SWT.NONE);
		label1.setBounds(15,15,180,20);
		label1.setText("��ѡ��Ҫת����IPRO����ģ�ͣ�");
		 text1=new Text(topComp,SWT.BORDER);
		text1.setBounds(15,40,200,18);
		
		
		Label label2=new Label(topComp,SWT.NONE);
		label2.setBounds(15,66,200,20);
		label2.setText("��ѡ��ת�������ŵ�·��:");
		text2=new Text(topComp,SWT.BORDER);
		text2.setBounds(15,90,200,20);
		text2.setText(ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString()+"/"+"PMBEModels");
		File defaultfile=new File(ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString()+"/"+"PMBEModels");
		if(!defaultfile.exists())
			defaultfile.mkdir();
		//text2.setTextLimit(30);
		
		//���Ұ�ť��������Ŀ¼�Ի�����ѡ��Ҫ������ļ���
		final Button button1=new Button(topComp,SWT.NONE);
		button1.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				DirectoryDialog dlg=new DirectoryDialog(topComp.getShell());
				dlg.setText("Ŀ¼");
				dlg.setMessage("��ѡ��һ��Ŀ¼:");
				dlg.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString());
				String dir=dlg.open();
				if(dir!=null){
					text1.setText(dir);
				}
			}
		});
		button1.setBounds(220,38,55,22);
		button1.setText("ѡ��");
		
		final Button button2=new Button(topComp,SWT.NONE);
		button2.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				DirectoryDialog dlg=new DirectoryDialog(topComp.getShell());
				dlg.setText("Ŀ¼");
				dlg.setMessage("��ѡ��һ��Ŀ¼:");
				String defaultPath=ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString()+"\\"+"PMBEModels";
				dlg.setFilterPath(defaultPath);
				String dir=dlg.open();
				if(dir!=null){
					text2.setText(dir);
				}
			}
		});
		button2.setBounds(220,90,55,22);
		button2.setText("ѡ��");
		
	    return topComp;
		
	}

	@Override
	protected void initializeBounds() {
		// TODO Auto-generated method stub
		super.createButton((Composite)getButtonBar(),IDialogConstants.OK_ID, "ȷ��", false);
		super.createButton((Composite)getButtonBar(), IDialogConstants.CANCEL_ID, "ȡ��", false);
		super.initializeBounds();
	}

	@Override
	protected Button createButton(Composite parent, int id, String label,
			boolean defaultButton) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Point getInitialSize() {
		// TODO Auto-generated method stub
		Point p=super.getInitialSize();
		p.x=296;
		p.y=185;
		return p;
	}

	@Override
	protected void buttonPressed(int buttonId) {
		// TODO Auto-generated method stub
		//super.buttonPressed(buttonId);
		if(buttonId==IDialogConstants.OK_ID){
			String iproPath=text1.getText();
    		String pmbePath=text2.getText();
    		if(iproPath.length()>0&&pmbePath.length()>0){
    			File project=new File(iproPath);
    			File mainProcessFile=new File(iproPath+"/"+project.getName()+"_diagram");
    			File genFile=new File(pmbePath);
    			if(!genFile.exists()){
    				MessageDialog.openError(this.getShell(), "error","���·��������!");
    				return;
    			}
    			if(!mainProcessFile.exists()){
    				MessageDialog.openError(this.getShell(), "error", "IPRO����ģ�ͳ���!");
    				return;
    			}
    			else{
    				Transformation trans=new Transformation();
    				trans.storePath=pmbePath+"\\"+project.getName();
    				trans.processFileParse(mainProcessFile,null);
    				trans.generatePMBEModel();
    				MessageDialog.openInformation(this.getShell(), "information", "ת���ɹ�");
    				this.close();
    			}
    		}
    		else{
    			MessageDialog.openError(this.getShell(), "error", "·������Ϊ��!");
    		}
		}
		else{
			this.close();
		}
	}

}
