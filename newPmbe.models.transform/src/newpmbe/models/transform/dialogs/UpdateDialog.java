package newpmbe.models.transform.dialogs;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import newpmbe.models.transform.Transformation;
import newpmbe.oldEdition.update.UpdateManager;
import newpmbe.oldEdition.update.UpdateWithProgress;
import newpmbe.rcp.viewers.common.filtermanager.FilterManager;


import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.WorkbenchContentProvider;

public class UpdateDialog extends Dialog{

	private Composite topComp;
	private Text text1;
	private Text text2;
	private Text text3;
	
	public UpdateDialog(Shell parentShell) {
		super(parentShell);
	}
	
	protected Control createDialogArea(Composite parent){
		this.getShell().setText("�ɰ汾PMBEģ������");
		topComp=new Composite(parent,SWT.NONE);
		topComp.setLayout(null);
		
		Label label1=new Label(topComp,SWT.NONE);
		label1.setBounds(15,15,225,20);
		label1.setText("��ѡ��PMBEģ���������ļ���");
		text1=new Text(topComp,SWT.BORDER);
		text1.setBounds(15,35,225,20);
		
		Label label2=new Label(topComp,SWT.NONE);
		label2.setBounds(15,64,225,20);
		label2.setText("��ѡ��PMBEģ����Դ�ļ�:");
		text2=new Text(topComp,SWT.BORDER);
		text2.setBounds(15,84,225,20);
		
		Label label3=new Label(topComp,SWT.NONE);
		label3.setBounds(15,110,225,20);
		label3.setText("�����ù�������");
		text3=new Text(topComp,SWT.BORDER);
		text3.setBounds(15,132,225,20);
		
		
		//���Ұ�ť��������Ŀ¼�Ի�����ѡ��Ҫ������ļ���
		final Button button1=new Button(topComp,SWT.NONE);
		button1.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				FileDialog dlg=new FileDialog(topComp.getShell(),SWT.OPEN|SWT.MULTI);
				dlg.setText("��ѡ���������ļ�");
				dlg.setFilterExtensions(new String[]{"PR*.xml"});
				String dir=dlg.open();
				if(dir!=null){
					text1.setText(dir);
				}
			}
		});
		button1.setBounds(250,32,75,22);
		button1.setText("ѡ��");
		
		final Button button2=new Button(topComp,SWT.NONE);
		button2.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				FileDialog dlg=new FileDialog(topComp.getShell(),SWT.OPEN|SWT.MULTI);
				dlg.setText("��ѡ����Դ�ļ�");
				dlg.setFilterExtensions(new String[]{"RS*.xml"});
				String dir=dlg.open();
				if(dir!=null){
					text2.setText(dir);
				}
			}
		});
		button2.setBounds(250,82,75,22);
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
		p.x=340;
		p.y=230;
		return p;
	}

	@Override
	protected void buttonPressed(int buttonId) {
		// TODO Auto-generated method stub
		//super.buttonPressed(buttonId);
		if(buttonId==IDialogConstants.OK_ID){
    		if(validateInput()==false)
    			return;
    		String path1=text1.getText();
    		String path2=text2.getText();
    		String name=text3.getText();
    		if(name.length()>50){
    			MessageDialog.openError(getShell(), "����", "���������ܳ���50���ַ�����������������");
    			return;
    		}
    		ProgressMonitorDialog dlg=new ProgressMonitorDialog(this.getShell());
    		
    		UpdateWithProgress rwp=new UpdateWithProgress(path1,path2,name);
    		/*IRunnableWithProgress rwp=new IRunnableWithProgress(){
    			public void run(IProgressMonitor monitor)throws InvocationTargetException,
    			InterruptedException{
    				//monitor.beginTask("begin....", 20);
    				UpdateManager mag=new UpdateManager(text3.getText(),new File(text1.getText()),new File(text2.getText()),monitor);
    				
					try {
						mag.update();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    				//monitor.done();
    			}
    		};*/
    		this.getShell().setVisible(false);
    		//this.close();
    		try{
    			dlg.run(false, false, rwp);
    			
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    		this.close();
		}
		else{
			this.close();
		}
	}

	/**
	 * validate the input messages
	 * @return
	 */
	private boolean validateInput(){
		String processPath=text1.getText();
		String resourcePath=text2.getText();
		String modelName=text3.getText();
		
		if(processPath.length()<1||resourcePath.length()<1||modelName.length()<1){
			MessageDialog.openError(this.getShell(),"Error", "���벻��Ϊ��");
			return false;
		}
		
		File process=new File(processPath);
		File resource=new File(resourcePath);
		if(!process.exists()||!resource.exists()){
			MessageDialog.openError(this.getShell(), "Error", "�����ļ�·��");
			return false;
		}
		
		if(ResourcesPlugin.getWorkspace().getRoot().getLocation().append("����ģ��").append(modelName+".process").toFile().exists()){
			MessageDialog.openError(this.getShell(),"Error","�������Ѵ��ڡ�");
			return false;
		}
		return true;
	}
}
