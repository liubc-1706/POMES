package process.diagram.actions;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.border.Border;
import javax.swing.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.awt.event.ActionListener;

import javax.naming.ldap.Control;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;





public class NewBusinessModel implements IWorkbenchWindowActionDelegate {

	
	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub
		
	}

	public void run(IAction action) {
		// TODO Auto-generated method stub
        MyFrame myFrame=new MyFrame();
       
	}
	
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

  	}
	public class MyList extends JPanel{
		JList listLeft;
		JList listRight;
		DefaultListModel modelLeft;
		DefaultListModel modelRight;
		IWorkspace workSpace=ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root=workSpace.getRoot();
		IProject[] projects = workSpace.getRoot().getProjects();
		
		public MyList(){
			setSize(450,230);
			GridLayout layout=new GridLayout(1,2,0,5);
			setLayout(layout);
			modelLeft=new DefaultListModel();
			modelRight=new DefaultListModel();
			listLeft=new JList(modelLeft);
			listRight=new JList(modelRight);
			listLeft.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			listRight.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			JScrollPane paneLeft=new JScrollPane(listLeft);
			JScrollPane paneRight=new JScrollPane(listRight);
			
			
			String path="";
			File workpath=new File(root.getLocation().toString()+"\\workspacePath.properties");
			if(!workpath.exists())
			{path=root.getLocation().toString();}
			else
			{
				try {
					FileInputStream inPut=new FileInputStream(workpath);
					Properties pro=new Properties();
					try {
						pro.load(inPut);
						path=pro.getProperty("path");
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			File fileProcess=new File(path+"//过程模型");
			String string[];
			string=fileProcess.list();	
			for(int i=0;i<string.length;i++){
				 modelLeft.addElement(string[i]);	
			}
			File fileOrganization=new File(path+"//组织模型");
			String strOrg[];
			strOrg=fileOrganization.list();
			for(int i=0;i<strOrg.length;i++){
				 modelLeft.addElement(strOrg[i]);	
			}
			File fileRes=new File(path+"//资源模型");
			String strRes[];
			strRes=fileRes.list();
			for(int i=0;i<strRes.length;i++){
				modelLeft.addElement(strRes[i]);	
			}
			
			add(paneLeft);
			add(paneRight);
		}
	}
	public class MyFrame{
		JFrame frame =new JFrame("新建业务模型");
		JButton okButton=new JButton("确定");
		JButton cancelButton=new JButton("取消");
		JButton addButton=new JButton("添加");
		JButton deleteButton=new JButton("删除");
		JPanel panel1=new JPanel(new GridLayout(3,1,5,5));
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel(new GridLayout(1,2,5,5));
		JPanel panel4=new JPanel();
	    JLabel name=new JLabel("                   业务名:");
	    JTextField inputName=new JTextField();
		MyList myList=new MyList();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root=workspace.getRoot();
		public MyFrame(){
			
			panel2.add(addButton);
			panel2.add(new JLabel("                "));
			panel2.add(deleteButton);
			panel3.add(name);
			
			panel3.add(inputName);
			panel4.add(okButton);
			panel4.add(new JLabel("                "));
			panel4.add(cancelButton);
		
			panel1.add(panel2);
			panel1.add(panel3);
			panel1.add(panel4);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setLayout(new BorderLayout());
			frame.getContentPane().add(myList,BorderLayout.NORTH);
			frame.getContentPane().add(panel1,BorderLayout.SOUTH);
			frame.setSize(300,350);
			frame.setVisible(true);
			frame.setAlwaysOnTop(true);
			frame.setLocationRelativeTo(null);
		//	frame.setResizable(false);
			addButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event) {
					// TODO Auto-generated method stub
					
					int i=myList.listLeft.getSelectedIndex();
					String str=myList.modelLeft.getElementAt(i).toString();
					
					boolean exist=false;
//					if(str.lastIndexOf(".organization")!=-1){
//						for(int j=0;j<myList.modelRight.getSize();j++){
//							if(str.lastIndexOf(".organization")!=-1){
//								exist=true;
//								//MessageDialog.openError(new Shell(), "error", "非法路径");
//							    break;
//							}
//						}
//					}
					String str1=str.substring(str.lastIndexOf("."),str.length());
					String str2="";
     				for(int j=0;j<myList.modelRight.getSize();j++){
						if(str.equals(myList.modelRight.elementAt(j).toString())==true){
							exist=true;
							break;
						}
						str2=myList.modelRight.elementAt(j).toString();
						if(str1.equals(str2.substring(str2.lastIndexOf("."), str2.length()))){
							exist=true;
							break;
						}
					}
     				if(!exist)
					 myList.modelRight.addElement(str);
				}
			});
			deleteButton.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent event) {
					// TODO Auto-generated method stub
					int i=myList.listRight.getSelectedIndex();
					myList.modelRight.removeElementAt(i);
				}
				
			});
			okButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					    Document doc = null;
					    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
						DocumentBuilder builder = null;
						try {
							builder = factory.newDocumentBuilder();
						} catch (ParserConfigurationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						doc = builder.newDocument();
						String strNode="father";
						Element rootItem = doc.createElement(strNode);
						doc.appendChild(rootItem);	
						String strChild="children";
						
						for(int i=0;i<myList.modelRight.getSize();i++){
							Element FolderItem = doc.createElement(strChild);
							FolderItem.setTextContent(myList.modelRight.getElementAt(i).toString());
							rootItem.appendChild(FolderItem);
						}
						
//						Element FolderItem1 = doc.createElement(strChild);
//						FolderItem1.setTextContent("bbb");
//						rootItem.appendChild(FolderItem1);
						if(!inputName.getText().equals("")&&myList.modelRight.getSize()>0){
						String str=inputName.getText();


						String path="";
						File workpath=new File(root.getLocation().toString()+"\\workspacePath.properties");
						if(!workpath.exists())
						{path=root.getLocation().toString();}
						else
						{
							try {
								FileInputStream inPut=new FileInputStream(workpath);
								Properties pro=new Properties();
								try {
									pro.load(inPut);
									path=pro.getProperty("path");
									
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							} catch (FileNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						
						
						String strFileName =path+"\\业务模型\\"+str+".xml";
						try {
							TransformerFactory tf = TransformerFactory.newInstance();
							Transformer transformer = tf.newTransformer();
							DOMSource source = new DOMSource(doc);
							transformer.setOutputProperty(OutputKeys.ENCODING, "GB2312");
							transformer.setOutputProperty(OutputKeys.INDENT, "yes");
							PrintWriter pw = new PrintWriter(new FileOutputStream(strFileName));
							StreamResult result = new StreamResult(pw);
							transformer.transform(source, result);
							pw.close();
						} catch (TransformerException mye) {
							mye.printStackTrace();
						} catch (IOException exp) {
							exp.printStackTrace();
						}
						frame.dispose();
						}
				}
				
			});
			cancelButton.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent event) {
					// TODO Auto-generated method stub
					//frame.dispose();
					
				
					
				}
				
			});
			   
		}
		
	}
}
