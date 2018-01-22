package process.diagram.actions;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import process.diagram.actions.OpenProcessModelAction.MyList;

public class OpenBusinessModelAction implements IWorkbenchWindowActionDelegate {

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
	//打开模型选择界面
	//public class openViewer extends 
	public class MyList extends JPanel{
		JList list;
		DefaultListModel model;
		IWorkspace workSpace=ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root=workSpace.getRoot();
		IProject[] projects = workSpace.getRoot().getProjects();
		
		public MyList(){
			setLayout(new BorderLayout());
			model=new DefaultListModel();
			list=new JList(model);
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			JScrollPane pane=new JScrollPane(list);
			JButton openButton=new JButton("打开");
			JButton cancelButton=new JButton("取消");
			
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
			
			File file=new File(path+"\\业务模型");
			String string[];
			string=file.list();	
			//System.out.println(root.getLocation().toString());
			for(int i=0, j;i<string.length;i++){
				model.addElement(string[i]);	
			}
			
			add(pane,BorderLayout.NORTH);
			
		}
	}
	public class MyFrame{
		JFrame frame =new JFrame("打开业务模型");
		JButton openButton=new JButton("打开");
		JButton cancelButton=new JButton("取消");
		JPanel panel1=new JPanel();
		JLabel l=new JLabel("         ");
		MyList myList=new MyList();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root=workspace.getRoot();
		public MyFrame(){
			panel1.add(openButton);
			panel1.add(l);
			panel1.add(cancelButton);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.getContentPane().add(myList,BorderLayout.NORTH);
			frame.getContentPane().add(panel1,BorderLayout.SOUTH);
			frame.setSize(250,230);
			frame.setVisible(true);
			frame.setAlwaysOnTop(true);
			frame.setLocationRelativeTo(null);
			frame.setResizable(false);
			
			openButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					      IProject  []projects=root.getProjects();
					      for(int i=0;i<projects.length;i++){
					    	  try {
								projects[i].delete(false, true, null);
							} catch (CoreException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					      }
					      Document doc = null;
					      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
						  DocumentBuilder builder = null;
						try {
							builder = factory.newDocumentBuilder();
							int i=myList.list.getSelectedIndex();
							String businessName=myList.model.getElementAt(i).toString();
							
							File workpath=new File(root.getLocation().toString()+"\\workspacePath.properties");
							String pathStr="";
							if(!workpath.exists())
							{pathStr=root.getLocation().toString();}
							else
							{
								try {
									FileInputStream inPut=new FileInputStream(workpath);
									Properties pro=new Properties();
									try {
										pro.load(inPut);
										pathStr=pro.getProperty("path");
										
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
								} catch (FileNotFoundException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
							FileInputStream inputStream=new FileInputStream(pathStr+"\\业务模型\\"+businessName);
							doc = builder.parse(inputStream);
							Node rootItem = doc.getFirstChild();
							NodeList nodeList = rootItem.getChildNodes();
							for(int j=0;j<(nodeList.getLength()-1)/2;j++){
								String str=nodeList.item(2*j+1).getTextContent();
								Path path;
								if(str.lastIndexOf(".process")!=-1){
								 path=new Path(pathStr+"\\过程模型\\"+str);
								}
								else if(str.lastIndexOf(".organization")!=-1){
								 path=new Path(pathStr+"\\组织模型\\"+str);	
								}
								else
								{
								 path=new Path(pathStr+"\\资源模型\\"+str);
								}
								IProject project=root.getProject(str);
								try{
								IProjectDescription description=workspace.loadProjectDescription(
										 (IPath) new Path(path+"\\.project"));				
									//changed by zhangpeng
									if(!project.exists()){
									project.create(description, null);
									project.open(null);
									}
									else{
										System.out.println("模型已存在！！！！！！");
									}
									//end changed by zhangpeng
								}
								catch(Exception ev){ev.printStackTrace();}
							}
						} catch (ParserConfigurationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SAXException e2)
						{
							e2.printStackTrace();
						} catch (IOException e3)
						{
							e3.printStackTrace();
						}
				}
			});

			cancelButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					frame.dispose();
				}
			});
		}
	}
}
