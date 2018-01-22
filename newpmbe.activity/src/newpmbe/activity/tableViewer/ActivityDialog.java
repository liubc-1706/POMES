package newpmbe.activity.tableViewer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import newpmbe.activity.ProcessManager;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;


public class ActivityDialog extends Dialog {
	private Composite topComp;
	private Composite left;
	private Composite right;
	private Group queryPanel;//查询面板
	private TableViewer tv;
	//声明排序器对象
	private ViewerSorter idSorter0;
	private ViewerSorter idSorter1;
	private ViewerSorter nameSorter0;
	private ViewerSorter nameSorter1;
	
	Combo combo1;//列出workspace中的工程
	Button showActivities;//"显示所有活动"按钮
	
	//以下为5个复选框按钮，查询时用于选择活动类型
	Button b1;//normalactivity
	Button b2;//autoactivity
	Button b3;//manualbatchactivity
	Button b4;//compactivity
//	Button b5;//
	Button b6;//autobatchactivity
	
	Combo combo2;//用于选择查询类型
	Text text;//用户输入关键字
	Button query;//查询按钮
	
	public ActivityDialog(Shell parentshell){
		super(parentshell);
	}
	
	protected Control createDialogArea(Composite parent){
		this.getShell().setText("活动查询");
		topComp=new Composite(parent,SWT.NONE);
		topComp.setLayout(new GridLayout());
		this.getShell().setLayout(new GridLayout());
		topComp.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		{
			SashForm sashForm=new SashForm(topComp,SWT.BORDER);
			sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));
			left=new Composite(sashForm,SWT.BORDER);
			right=new Composite(sashForm,SWT.BORDER);
			this.leftInit();
			this.rightInit();
			sashForm.setWeights(new int[]{6,3});
		}
		
	    return topComp;
		
	}
	
	
	public void leftInit(){
		left.setLayout(new FillLayout());
		
		tv=new TableViewer(left,SWT.MULTI|SWT.BORDER|SWT.FULL_SELECTION);
		//声明排序器对象
		idSorter0=new MySorter(MySorter.ID);
		idSorter1=new MySorter(-MySorter.ID);
		nameSorter0=new MySorter(MySorter.NAME);
		nameSorter1=new MySorter(-MySorter.NAME);

		Table table=tv.getTable();
		//table.setLayout(new GridLayout());
		//table.setLayoutData(new GridData(GridData.FILL_BOTH));
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		TableLayout tLayout=new TableLayout();
		table.setLayout(tLayout);
	
		
		//添加活动ID列，并实现单击排序
		tLayout.addColumnData(new ColumnWeightData(25));
		TableColumn col1=new TableColumn(table,SWT.NONE);
		col1.setText("活动ID");
		col1.addSelectionListener(new SelectionAdapter(){
			boolean sortType=true;
			public void widgetSelected(SelectionEvent e){
				sortType=!sortType;
				tv.setSorter(sortType?idSorter0 : idSorter1);
			}
		});
		//添加活动名称列，并实现单击排序
		tLayout.addColumnData(new ColumnWeightData(40));
		TableColumn col2=new TableColumn(table,SWT.NONE);
		col2.setText("活动名称");
		col2.addSelectionListener(new SelectionAdapter(){
			boolean sortType=true;
			public void widgetSelected(SelectionEvent e){
				sortType=!sortType;
				tv.setSorter(sortType?nameSorter0 : nameSorter1);
			}
		});
		
		//添加其他列（活动描述和路径）
		tLayout.addColumnData(new ColumnWeightData(50));
		new TableColumn(table,SWT.NONE).setText("活动描述");
		tLayout.addColumnData(new ColumnWeightData(100));
		new TableColumn(table,SWT.NONE).setText("路径");
		
		//添加右键菜单 not needed
		//MyActionGroup actionGroup=new MyActionGroup(tv);
		//actionGroup.fillContextMenu(new MenuManager());
		
		//添加内容器和标签器
		tv.setContentProvider(new MyContentProvider());
		tv.setLabelProvider(new MyLabelProvider());
		//输入数据
		//tv.setInput(ProductFactory.getProductsFromProject("test"));
		tv.setInput(null);
	}
	
	//右侧面板的初始化
	@SuppressWarnings("rawtypes")
	public void rightInit(){
		GridLayout gridlayout=new GridLayout(1,false);
		gridlayout.verticalSpacing=15;
		right.setLayout(gridlayout);
		
		GridLayout gridlayout2=new GridLayout(4,false);
		Composite cps=new Composite(right,SWT.NONE);
		cps.setLayout(gridlayout2);
		gridlayout2.horizontalSpacing=10;
		cps.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,1));
		
		{
			Label label=new Label(cps,SWT.NONE);
			label.setText("请选择工程：");
			label.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,4));
			combo1=new Combo(cps,SWT.READ_ONLY);
			combo1.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,2));
			List list=new ArrayList();
			list=ProcessManager.getProjectsFromWorkspace();
			for(int i=0;i<list.size();i++)
				combo1.add(list.get(i).toString());
			combo1.select(0);
			showActivities=new Button(cps,SWT.NONE);
			showActivities.setText("显示所有活动");
			showActivities.setLayoutData(createGridData(GridData.HORIZONTAL_ALIGN_FILL,2));
			showActivities.addSelectionListener(new SelectionAdapter(){
				public void widgetSelected(SelectionEvent e){
					String project=combo1.getText();
					if(project!=null){
						tv.setInput(ProcessManager.getActivitiesFromProject(project));
					}
				}
			});
		}
		//查询面板
		queryPanel=new Group(right,SWT.NONE);
		queryPanel.setText("活动查询");
		this.queryPanelInit();
		queryPanel.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,1,9));
	}
	
	//查询面板初始化
	private void queryPanelInit(){
		//queryPanel=new Composite(right,SWT.BORDER);
		GridLayout layout=new GridLayout(6,false);
		layout.verticalSpacing=8;
		queryPanel.setLayout(layout);
		Label l1=new Label(queryPanel,SWT.NONE);
		l1.setText("请选择活动类别(可多选):");
		l1.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,6));
		b1=new Button(queryPanel,SWT.CHECK);
		b1.setText("活动");
		b1.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,2));
		b2=new Button(queryPanel,SWT.CHECK);
		b2.setText("自动活动");
		b2.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,2));
		b3=new Button(queryPanel,SWT.CHECK);
		b3.setText("手工批处理活动");
		b3.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,2));
		b6=new Button(queryPanel,SWT.CHECK);
		b6.setText("自动批处理活动");
		b6.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,2));
		b4=new Button(queryPanel,SWT.CHECK);
		b4.setText("组合活动");
		b4.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,2));
		/*b5=new Button(queryPanel,SWT.CHECK);
		b5.setText("其他产品");
		b5.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,2));*/
		Label l2=new Label(queryPanel,SWT.NONE);
		l2.setText("请选择查询类型：");
		l2.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,6));
		combo2=new Combo(queryPanel,SWT.READ_ONLY);
		combo2.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,4));
		combo2.add("活动ID");
		combo2.add("活动名称");
		combo2.add("活动描述");
		combo2.select(1);
		Label l3=new Label(queryPanel,SWT.NONE);
		l3.setText("请输入查询内容:");
		l3.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,6));
		text=new Text(queryPanel,SWT.BORDER);
		text.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,4));
		
		query=new Button(queryPanel,SWT.NONE);
		query.setText("查询");
		query.setLayoutData(createGridData(GridData.FILL_HORIZONTAL,2));
		query.addSelectionListener(new SelectionAdapter(){
			@SuppressWarnings("rawtypes")
			public void widgetSelected(SelectionEvent e){
				String project=combo1.getText();
				List list=new ArrayList();
				if(project!=null){
					list=ProcessManager.getActivitiesFromProject(project);
					list=ProcessManager.queryActivities(list, b1.getSelection(),
							b2.getSelection(), b3.getSelection(),b6.getSelection(), b4.getSelection(), 
							 combo2.getSelectionIndex(), text.getText());
					tv.setInput(list);
				}
			}
		});
	}

	private GridData createGridData(int style,int horizontalSpan){
		GridData gridData=new GridData(style);
		gridData.horizontalSpan=horizontalSpan;
		return gridData;
	}
	
	private GridData createGridData(int style,int horizontalSpan,int verticalSpan){
		GridData gridData=new GridData(style);
		gridData.horizontalSpan=horizontalSpan;
		gridData.verticalSpan=verticalSpan;
		return gridData;
	}

	@Override
	protected void initializeBounds() {
		// TODO Auto-generated method stub
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
		p.x=1000;
		p.y=410;
		return p;
	}

	@Override
	protected void buttonPressed(int buttonId) {
		// TODO Auto-generated method stub
		//super.buttonPressed(buttonId);
		if(buttonId==IDialogConstants.OK_ID){
			
		}
		else{
			this.close();
		}
	}

	@Override
	protected int getShellStyle() {
		// TODO Auto-generated method stub
		return super.getShellStyle()|SWT.RESIZE|SWT.MAX;
	}
	
}
