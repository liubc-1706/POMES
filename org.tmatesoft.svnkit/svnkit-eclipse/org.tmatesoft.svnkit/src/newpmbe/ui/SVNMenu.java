package newpmbe.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;

/**CVS菜单 提供了CVS协同建模的相关功能
 * 
 * @author fanshuchuan
 *
 */


public class SVNMenu {
	private Shell shell;
	private MenuItem cvsItem;
	
	/**
	 * 构造函数
	 * @param shell
	 */
	public SVNMenu(Shell shell){
		this.shell=shell;
		this.menuInit();
	}
	
	/** 初始化菜单
	 * 
	 */
	public void menuInit(){
		MenuItem cvsItem=new MenuItem(shell.getMenuBar(),SWT.CASCADE);
		cvsItem.setText("CVS");
		
		Menu cvsMenu=new Menu(shell,SWT.DROP_DOWN);
		cvsItem.setMenu(cvsMenu);
		
		MenuItem setItem=new MenuItem(cvsMenu,SWT.CASCADE);
		setItem.setText("综合配置");
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
		loginItem.setText("登录");
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
		inputModuleItem.setText("导入模型");
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
		checkoutModuleItem.setText("签出模型");
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
