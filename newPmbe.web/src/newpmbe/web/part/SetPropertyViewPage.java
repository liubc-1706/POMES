package newpmbe.web.part;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;

public class SetPropertyViewPage extends WizardPage{
	
	private Button webViewButton;
	private Button labelViewButton;
	private Button labelWebViewButton;
	
	private boolean webViewTag = false;
	private boolean labelViewTag = true;
	private boolean labelWebViewTag = false;
	
	public int propertyViewTag = 1;
	
	protected SetPropertyViewPage(String pageName) {
		super(pageName);
	}
	
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		final GridLayout gridLayout = new GridLayout();
		container.setLayout(gridLayout);	
		
		Group propertyViewGroup = new Group(container, 1);
		GridData layoutGridData = new GridData(GridData.FILL_HORIZONTAL);
		propertyViewGroup.setLayoutData(layoutGridData);
		propertyViewGroup.setText("属性显示方式");
		
		labelViewButton = new Button(propertyViewGroup, SWT.RADIO);
		labelViewButton.setSelection(true);
		labelViewButton.setText("属性标签显示");
		labelViewButton.setBounds(20, 20, 90, 30);
		labelViewButton.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent event) {
				labelViewSelected();
				setNextPageBack();
			}
		});
		
		webViewButton = new Button(propertyViewGroup, SWT.RADIO);
		webViewButton.setSelection(false);
		webViewButton.setText("属性栏显示");
		webViewButton.setBounds(130, 20, 80, 30);
		webViewTag = false;
		webViewButton.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent event) {
				webViewSelected();
				setNextPage();
			}
		});
		
		
		labelWebViewButton = new Button(propertyViewGroup, SWT.RADIO);
		labelWebViewButton.setSelection(false);
		labelWebViewButton.setText("同时显示属性栏和属性标签");
		labelWebViewButton.setBounds(230, 20, 160, 30);
		labelWebViewButton.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent event) {
				labelWebViewSelected();
				setNextPageBack();
			}
		});
		
		setTitle("设置发布属性显示方式");
	    setMessage("请设置发布属性显示方式", INFORMATION);
	    setControl(container);
	}
	
	private void labelViewSelected(){
		this.labelViewTag = true;
		this.webViewTag = false;
		this.labelWebViewTag = false;
	}
	
	private void webViewSelected(){
		this.webViewTag = true;
		this.labelViewTag = false;
		this.labelWebViewTag = false;
	}
	
	private void labelWebViewSelected(){
		this.labelWebViewTag = true;
		this.webViewTag = false;
		this.labelViewTag = false;
	}
	
	private void setNextPage(){
		IWizardPage nextPage = getNextPage();
		Composite con = (Composite) nextPage.getControl();
		Control[] consNext = con.getChildren();
		for(int i=0; i<consNext.length; i++){
			consNext[i].setEnabled(false);
		}
	}
	
	private void setNextPageBack(){
		IWizardPage nextPage = getNextPage();
		Composite con = (Composite) nextPage.getControl();
		Control[] consNext = con.getChildren();
		for(int i=0; i<consNext.length; i++){
			consNext[i].setEnabled(true);
		}
	}
	
	public int getPropertyViewTag(){
		if(webViewTag == true){
			propertyViewTag = 2;
		}else if(labelViewTag == true){
			propertyViewTag = 1;
		}else if(labelWebViewTag == true){
			propertyViewTag = 3;
		}
		
		return propertyViewTag;
	}
}
