package newpmbe.web.part;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.ColorSelector;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.ProgressBar;

public class SetLabelViewWizardPage extends WizardPage{
	
	private ColorFieldEditor backEditor;
	private ColorFieldEditor frameEditor;
	private ColorFieldEditor fontColorEditor;
//	private FontFieldEditor fontEditor;
	
	private ColorSelector backColorSelector;
	private ColorSelector frameColorSelector;
	private ColorSelector fontColorSelector;
	
	private RGB backColor = new RGB(255,255,204);
	private RGB frameColor = new RGB(0,102,255);
	private RGB fontColor = new RGB(0,102,255);
	private String fontName;
	
	private ProgressBar pb;
	private Button backColorButton;
	private Button frameColorButton;
	private Button fontColorButton;
	private Color backButtonColor;
	private Color frameButtonColor;
	private Color fontButtonColor;
	
	private Color testColor = new Color(null, new RGB(0,0,0));

	protected SetLabelViewWizardPage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}

	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		Composite container = new Composite(parent, SWT.NULL);
		final GridLayout gridLayout = new GridLayout();
		container.setLayout(gridLayout);	
		
		Group backgroudGroup = new Group(container, 1);
		GridData backgroudGridData = new GridData(GridData.FILL_HORIZONTAL);
		backgroudGroup.setLayoutData(backgroudGridData);
		backgroudGroup.setText("设置属性标签背景颜色");
		backEditor = new ColorFieldEditor(
				"", "标签背景颜色                       ", backgroudGroup);
		backColorSelector = backEditor.getColorSelector();
		backColorButton = backColorSelector.getButton();
		backButtonColor = new Color(
				null, backColor.red, backColor.green, backColor.blue);
		backColorSelector.setColorValue(backColor);
	
		backColorButton.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				setBackColor();
			}
		});
//		backEditor.dispose();
		
		
		Group frameGroup = new Group(container, 1);
		GridData frameGridData = new GridData(GridData.FILL_HORIZONTAL);
		frameGroup.setLayoutData(frameGridData);
		frameGroup.setText("设置属性标签边框颜色");
		frameEditor = new ColorFieldEditor(
				"", "标签边框颜色                       ", frameGroup);
		frameColorSelector = frameEditor.getColorSelector();
		frameColorButton = frameColorSelector.getButton();
		frameButtonColor = new Color(null, frameColor);
		frameColorSelector.setColorValue(frameColor);
		
		frameColorButton.addSelectionListener(new SelectionAdapter(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				super.widgetSelected(e);
				setFrameColor();
			}
			
		});
		
		
		Group fontColorGroup = new Group(container, 1);
		GridData fontColorGridData = new GridData(GridData.FILL_HORIZONTAL);
		fontColorGroup.setLayoutData(fontColorGridData);
		fontColorGroup.setText("设置属性标签字体颜色");
		fontColorEditor = new ColorFieldEditor(
				"", "标签字体颜色                       ", fontColorGroup);
		fontColorSelector = fontColorEditor.getColorSelector();
		fontColorButton = fontColorSelector.getButton();
		fontColorSelector.setColorValue(fontColor);
		
		testColor = fontColorButton.getForeground();
		fontColorButton.addSelectionListener(new SelectionAdapter(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				super.widgetSelected(e);
				setFontColor();
			}
			
		});
		
		Button defaultButton = new Button(container, 0);
		defaultButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		defaultButton.setText("恢复默认设置");
		defaultButton.addSelectionListener(new SelectionAdapter(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				super.widgetSelected(e);
				setDefault();
			}
			
		});
	
		
		pb = new ProgressBar(container,1);
		GridData pbGridData = new GridData(
				GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_END);
		pb.setLayoutData(pbGridData);
		pb.setVisible(false);
		
		
//		Group fontGroup = new Group(container, 1);
//		fontGroup.setLayout(new GridLayout());
//		GridData fontGridData = new GridData(GridData.FILL_HORIZONTAL);
//		fontGroup.setLayoutData(fontGridData);
//		fontGroup.setText("设置属性字体");
//		fontEditor = new FontFieldEditor(
//				"", "属性显示字体", "字体预览", fontGroup);
		
		setTitle("属性标签设置");
		setMessage("请进行属性标签设置", INFORMATION);
		setControl(container);
	}
	
	
	private void setBackColor(){
		backColor = backColorSelector.getColorValue();
//		backButtonColor = new Color(
//				null, backColor.red, backColor.green, backColor.blue);
//		backColorButton.setForeground(backButtonColor);
	}
	
	private void setFrameColor(){
		frameColor = frameColorSelector.getColorValue();
//		frameButtonColor = new Color(
//				null, frameColor.red, frameColor.green, frameColor.blue);
//		frameColorButton.setForeground(frameButtonColor);
	}
	
	private void setFontColor(){
		fontColor = fontColorSelector.getColorValue();
//		fontButtonColor = new Color(
//				null, fontColor.red, fontColor.green, fontColor.blue);
//		fontColorButton.setForeground(fontButtonColor);		
	}
	
	private void setDefault(){
		backColor = new RGB(255,255,204);
		frameColor = new RGB(0,102,255);
		fontColor = new RGB(0,102,255);
		fontColorSelector.setColorValue(fontColor);
		backColorSelector.setColorValue(backColor);
		frameColorSelector.setColorValue(frameColor);
	
	}

	public RGB getBackColor(){
		return backColor;
	}
	
	public RGB getFrameColor(){
		return frameColor;
	}
	
	public RGB getFontColor(){
		return fontColor;
	}
	
	public String getViewFont(){

		return fontName;
	}
	
	public ProgressBar getProgressBar(){
		return pb;
	}
}
