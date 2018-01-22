package newpmbe.DlgPackage;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
//import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import vpml.EMDiagram;
import vpml.processpackage.*;
import vpml.resourcepackage.EMRDiagram;

/**
 * 资源属性关联对话框
 * @author Administrator
 *
 */
public class ResourceRelateDlg extends Dialog {
	private int result;
	int m_type;
	private List list;
	private EMPDiagram empdiagram;
	private HashMap<String, String> filelist = new HashMap();
	private EMDiagram diagram;
	private ArrayList<EMDiagram> diagramList = new ArrayList();
	private String resDirType = null;
	private String resFileType = null;
	private String pathpre = null;	//文件后缀
	
	private String resourceFilePath = null;
	private String resourceProjectName = null;

	/**
	 * Create the dialog
	 * @param parentShell
	 */
	public ResourceRelateDlg(Shell parentShell) {
		super(parentShell);
	}

	public ResourceRelateDlg(Shell parent, EObject obj, int rtype){
		this(parent);
		m_type = rtype;
		empdiagram = (EMPDiagram)obj;
		switch(m_type)
		{
			case RESOURCETYPE.RESEOURCE: 
				resDirType = ".resource";
				resFileType = ".resource_diagram";
//				pathpre = "\\资源模型\\";
				break;
			case RESOURCETYPE.ORGNIZATION:
				resDirType = ".organization";
				resFileType = ".organization_diagram";
//				pathpre = "\\组织模型\\";
				break;
			default:
				resDirType = null;
				resFileType = null;
				break;
		}
	} 
	/**
	 * Create contents of the dialog
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite topComp=new Composite(parent,SWT.NONE);

		final Composite composite = new Composite(topComp, SWT.NONE);
		composite.setBounds(0, 0, 205, 230);

		list = new List(composite, SWT.V_SCROLL | SWT.BORDER);
		list.setBounds(28, 40, 158, 180);

		final Label label = new Label(composite, SWT.NONE);
		label.setText("选择视图：");
		label.setBounds(30, 15, 80, 15);

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
		boolean	found = false;
		//获取工程根目录
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = ws.getRoot();
//		IPath path = root.getRawLocation();
//		String pathstr = path.toString();
//		pathstr += pathpre;
		
		//搜索该工程下的资源文件
//		found = FindResourceFile(pathstr);
		found = findResourceFile(root);
		
		if (!found)
		{
			MessageDialog.openWarning(null, "", "没有资源文件，请先定义资源视图");
//			this.cancelPressed();
		}
		else
		{
			Set<String> keyset = filelist.keySet();
			Iterator iter = keyset.iterator();
			while(iter.hasNext())
			{
				String key = (String)iter.next();
				list.add(key);
			}
		}		
	}
	
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);		
		newShell.setText("选择视图");
	}
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) 
		{
			String []select = list.getSelection();
			
			if (select.length == 0)
				MessageDialog.openInformation(this.getShell(), "提示", "未选择任何资源！");
			else if(select.length > 0)
			{
				diagram = (EMDiagram)PropertyUtility.GetDiagramObject(filelist.get(select[0]));
				diagramList.add(diagram);
				
				//added by zhangpeng
				this.resourceFilePath = filelist.get(select[0]);
				resourceProjectName = select[0];
			}
			
		}
	super.buttonPressed(buttonId);
	}
	
	/**
	 * Return the initial size of the dialog
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(220, 310);
	}
	
	//读取当前资源视图
//	private boolean FindResourceFile(String dir)
//	{
//		boolean found = false;
//		//搜索该工程下的资源文件
//		File allfiles = new File(dir);
//		File fc[] = allfiles.listFiles();
//		if(fc == null)
//			return false;
//		for (int i = 0; (i < fc.length); i++)
//		{
//			if (fc[i].isFile() && fc[i].getName().endsWith(resFileType))
//			{
//				String filepath = fc[i].getAbsolutePath();
//				String file = fc[i].getName();
//				int pos = file.indexOf('.');
//				String filename = file.substring(0, pos);
//				filelist.put(filename, filepath);
//			}	
//			if(fc[i].isDirectory() && fc[i].getName().endsWith(resDirType))
//			{
//				String dirname = fc[i].getAbsolutePath();
//				FindResourceFile(dirname);				
//			}
//		}
//		if (filelist.size() > 0)
//			found = true;
//		return found;
//	}
	//读取当前资源视图
	private boolean findResourceFile(IWorkspaceRoot root)
	{
		boolean found = false;
		IProject[] projects = root.getProjects();
		for(int i = 0; i < projects.length; i++){
			if(projects[i].getName().endsWith(resDirType)){
				String fileName = projects[i].getName()+"_diagram";
				IFile file = projects[i].getFile(fileName);
				filelist.put(projects[i].getName(), file.getRawLocation().toString());
			}
		}
		if(filelist.size() > 0)
			found = true;
		return found;
	}

	public EMDiagram getDiagram() {
		return diagram;
	}

	public void setDiagram(EMDiagram diagram) {
		this.diagram = diagram;
	}

	public ArrayList getDiagramList() {
		return diagramList;
	}
	public String getResourceFilePath(){
		return resourceFilePath;
	}
	public String getResourceName(){
		return resourceProjectName;
	}

	public void setDiagramList(ArrayList diagramList) {
		this.diagramList = diagramList;
	}
	
}
