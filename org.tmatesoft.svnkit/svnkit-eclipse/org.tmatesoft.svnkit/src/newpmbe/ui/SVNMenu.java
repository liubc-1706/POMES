package newpmbe.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;

/**CVS�˵� �ṩ��CVSЭͬ��ģ����ع���
 * 
 * @author fanshuchuan
 *
 */


public class SVNMenu {
	private Shell shell;
	private MenuItem cvsItem;
	
	/**
	 * ���캯��
	 * @param shell
	 */
	public SVNMenu(Shell shell){
		this.shell=shell;
		this.menuInit();
	}
	
	/** ��ʼ���˵�
	 * 
	 */
	public void menuInit(){
		MenuItem cvsItem=new MenuItem(shell.getMenuBar(),SWT.CASCADE);
		cvsItem.setText("CVS");
		
		Menu cvsMenu=new Menu(shell,SWT.DROP_DOWN);
		cvsItem.setMenu(cvsMenu);
		
		MenuItem setItem=new MenuItem(cvsMenu,SWT.CASCADE);
		setItem.setText("�ۺ�����");
		setItem.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				//?? code to be added;
				Shell dialog=new Shell();
				//dialog=CVSDialogs.configurationDialog();
				dialog.layout();
				dialog.open();
				
			}
		});
		
		MenuItem loginItem=new MenuItem(cvsMenu,SWT.CASCADE);
		loginItem.setText("��¼");
		loginItem.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				//?? code to be added;
				Shell dialog=new Shell();
				//dialog=CVSDialogs.loginDialog();
				dialog.layout();
				dialog.open();
			}
		});
		
		MenuItem inputModuleItem=new MenuItem(cvsMenu,SWT.CASCADE);
		inputModuleItem.setText("����ģ��");
		inputModuleItem.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				//?? code to be added;
				Shell dialog=new Shell();
				//dialog=CVSDialogs.inputModuleDialog();
				dialog.layout();
				dialog.open();
			}
		});
		
		MenuItem checkoutModuleItem=new MenuItem(cvsMenu,SWT.CASCADE);
		checkoutModuleItem.setText("ǩ��ģ��");
		checkoutModuleItem.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				//?? code to be added;
				Shell dialog=new Shell();
				//dialog=CVSDialogs.checkoutModuleDialog();
				dialog.layout();
				dialog.open();
			}
		});
		
		
	}

	// get/set method
	
	public MenuItem getCvsItem() {
		return cvsItem;
	}

	public void setCvsItem(MenuItem cvsItem) {
		this.cvsItem = cvsItem;
	}

	public Shell getShell() {
		return shell;
	}

	public void setShell(Shell shell) {
		this.shell = shell;
	}

}
