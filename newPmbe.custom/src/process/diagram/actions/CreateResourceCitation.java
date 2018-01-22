package process.diagram.actions;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Vector;

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
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import newpmbe.process.diagram.edit.parts.EMPCompActivityEditPart;
import newpmbe.process.diagram.edit.parts.EMRMachineTypeEditPart;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import process.diagram.actions.OpenProcessModelAction.MyList;

import vpml.resourcepackage.impl.EMRMachineTypeImpl;
//引用资源模型中的设备
public class CreateResourceCitation implements IWorkbenchWindowActionDelegate {

	public EMRMachineTypeEditPart selectedElement;
	public IStructuredSelection selection;
	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub

	}

	public void run(IAction action) {
		// TODO Auto-generated method stub
		IWorkspace workSpace=ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root=workSpace.getRoot();
		IProject []projects=root.getProjects();
		boolean exist=false;
		for(int i=0;i<projects.length;i++){
			if(projects[i].getName().lastIndexOf(".resource")!=-1)
			{
				exist=true;
				break;
			}
		}
		if(exist==false){
			MyFrame myFrame=new MyFrame();
		}
		else{
			String modelName="";
			for(int i=0;i<projects.length;i++){
				if(projects[i].getName().lastIndexOf(".resource")!=-1){
					modelName=projects[i].getName().substring(0,projects[i].getName().lastIndexOf("."));
				    break;
				}
			}
			Vector<String> itemName=getItemName(modelName);
			MyFrameOne myFrameOne=new MyFrameOne(modelName);
			for(int i1=0;i1<itemName.size();i1++){
				myFrameOne.myList.model.addElement(itemName.elementAt(i1));
			}
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof EMRMachineTypeEditPart) {
				selectedElement = (EMRMachineTypeEditPart) structuredSelection
						.getFirstElement();
			}
		}
	}

	//打开选择界面
	//public class openViewer extends 
	public class MyList extends JPanel{
		JList list;
		DefaultListModel model;
		IWorkspace workSpace=ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root=workSpace.getRoot();
		IProject[] projects = workSpace.getRoot().getProjects();
		String path="";
		public MyList(){
			setLayout(new BorderLayout());
			model=new DefaultListModel();
			list=new JList(model);
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			JScrollPane pane=new JScrollPane(list);
			JButton openButton=new JButton("打开");
			JButton cancelButton=new JButton("取消");
			
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
			File file=new File(path+"\\资源模型");
			
			String string[];
			string=file.list();	
			//System.out.println(root.getLocation().toString());
			for(int i=0, j;i<string.length;i++){
				model.addElement(string[i].substring(0, string[i].length()-9));	
			}
			
			String nameFolder;
			nameFolder=((EList)((ResourceSet)((TransactionalEditingDomain)selectedElement.getEditingDomain()).getResourceSet()).getResources()).get(0).toString();
			String namePath;
		
			namePath=nameFolder.substring(nameFolder.indexOf("/")+9,nameFolder.lastIndexOf("/"));
			//pathSource获得完整路径名
			String lastChoose="";
			
			String pathSource;
			
			pathSource=path+"/过程模型"+namePath+"/.XML";
			File exist=new File(pathSource);
			if(exist.exists()){
			Document doc=parseXML(pathSource);
			Node rootItem=doc.getFirstChild();
			NodeList nodeList=rootItem.getChildNodes();
			
			String nameSource=((EMRMachineTypeImpl)((NodeImpl)selectedElement.getModel()).getElement()).getName();
			
			for(int t=0;t<(nodeList.getLength()-1)/2;t++){
				if(nodeList.item(2*t+1).getAttributes().getNamedItem("type").getNodeValue().equals("MachineType")&&
						nodeList.item(2*t+1).getAttributes().getNamedItem("nameTarget").getNodeValue().equals(nameSource)){
					lastChoose=nodeList.item(2*t+1).getAttributes().getNamedItem("pathTarget").getNodeValue();
					lastChoose=lastChoose.substring(0,lastChoose.lastIndexOf("/"));
					lastChoose=lastChoose.substring(lastChoose.lastIndexOf("/")+1,lastChoose.lastIndexOf("."));
					break;
				}
			}
			}
			if(lastChoose.equals("")){
				list.setSelectedIndex(0);
			}
			else{
				for(int i=0;i<model.getSize();i++){
					if(model.elementAt(i).toString().equals(lastChoose)){
						list.setSelectedIndex(i);
						break;
					}
				}
			}
			add(pane,BorderLayout.NORTH);
			
		}
	}
	public class MyFrame{
		JFrame frame =new JFrame("选择资源模型");
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
			frame.setSize(230,230);
			frame.setVisible(true);
			frame.setAlwaysOnTop(true);
			frame.setLocationRelativeTo(null);
			frame.setResizable(false);
			
			openButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int i=myList.list.getSelectedIndex();
					String modelName=myList.model.getElementAt(i).toString();
					String nameSource=((EMRMachineTypeImpl)((NodeImpl)selectedElement.getModel()).getElement()).getName();
					Vector<String> itemName=getItemName(modelName);
					MyFrameOne myFrameOne=new MyFrameOne(myList.model.getElementAt(myList.list.getSelectedIndex()).toString());
					for(int i1=0;i1<itemName.size();i1++){
						myFrameOne.myList.model.addElement(itemName.elementAt(i1));
					}
					if(itemName.size()>0){
						boolean exist=false;
						for(int t=0;t<itemName.size();t++){
							if(myFrameOne.myList.model.getElementAt(t).toString().equals(nameSource)){
								exist=true;
								myFrameOne.myList.list.setSelectedIndex(t);
								break;
							}
						}
						if(!exist){
							myFrameOne.myList.list.setSelectedIndex(0);
						}
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
	public class MyListOne extends JPanel{
		JList list;
		DefaultListModel model;
		public MyListOne(){
			setLayout(new BorderLayout());
			model=new DefaultListModel();
			list=new JList(model);
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			JScrollPane pane=new JScrollPane(list);
			JButton openButton=new JButton("打开");
			JButton cancelButton=new JButton("取消");
			add(pane,BorderLayout.NORTH);
			
		}
	}
	public class MyFrameOne extends JFrame{

		JFrame frame ;
		JButton openButton=new JButton("确定");
		JButton cancelButton=new JButton("取消");
		JPanel panel1=new JPanel();
		JLabel l=new JLabel("         ");
		MyListOne myList=new MyListOne();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root=workspace.getRoot();
		public MyFrameOne(final String projectTarget){
			frame=new JFrame(projectTarget+"模型资源");
			panel1.add(openButton);
			panel1.add(l);
			panel1.add(cancelButton);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.getContentPane().add(myList,BorderLayout.NORTH);
			frame.getContentPane().add(panel1,BorderLayout.SOUTH);
			frame.setSize(230,210);
			frame.setVisible(true);
			frame.setAlwaysOnTop(true);
			frame.setLocationRelativeTo(null);
			frame.setResizable(false);
			
			openButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					
			//	((EMRBasicResourceTypeEditPart.BasicRectangle)selectedElement.getContentPane()).fnodeName.setText(myList.model.getElementAt(i).toString());
					
					//selectedElement.getContentPane().getBounds()
					
			       // System.out.println(((EMRBasicResourceTypeImpl)((NodeImpl)selectedElement.getModel()).getElement()).getName());
					//更改节点的label
					String nameSource;
					String nameTarget;
					
					nameSource=((EMRMachineTypeImpl)((NodeImpl)selectedElement.getModel()).getElement()).getName();
					nameTarget=myList.model.getElementAt(myList.list.getSelectedIndex()).toString();
				    //rootPath或地工作空间路径
					String rootPath="";
				    File workpath=new File(root.getLocation().toString()+"\\workspacePath.properties");
					if(!workpath.exists())
					{rootPath=root.getLocation().toString();}
					else
					{
						try {
							FileInputStream inPut=new FileInputStream(workpath);
							Properties pro=new Properties();
							try {
								pro.load(inPut);
								rootPath=pro.getProperty("path");
								
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					//nameFolder获得完整路径中在工程名后面的那一段
					String nameFolder;
					nameFolder=((EList)((ResourceSet)((TransactionalEditingDomain)selectedElement.getEditingDomain()).getResourceSet()).getResources()).get(0).toString();
					String namePath;
				
					namePath=nameFolder.substring(nameFolder.indexOf("/")+9,nameFolder.lastIndexOf("/"));
					//pathSource获得完整路径名
				
					String pathSource;
					pathSource=rootPath+"/过程模型"+namePath+"/.XML";
			        String pathTarget;
			        pathTarget=rootPath+"/资源模型/"+projectTarget+".resource/.XML";
			//		System.out.println(pathSource);
			//		System.out.println(pathTarget);
			        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(((EMRMachineTypeImpl)((NodeImpl)selectedElement.getModel()).getElement()));    
					domain.getCommandStack().execute(new RecordingCommand(domain) {       
					    protected void doExecute() {
					    	int i=myList.list.getSelectedIndex();
					    	((EMRMachineTypeImpl)((NodeImpl)selectedElement.getModel()).getElement()).setName(myList.model.getElementAt(i).toString());
					    	
					    }    
					});  
					generateLink(nameSource,pathSource,nameTarget,pathTarget,"MachineType");
					frame.dispose();
				}
			});

			cancelButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					frame.dispose();
				}
			});
		}
	}
	//记录引用信息
	//nameSource记录引用前引用节点的名字，
	public void generateLink(String nameSource,String pathSource,String nameTarget,String pathTarget,String type){
		File fileSource=new File(pathSource);
		if(!fileSource.exists()){
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
			Element children=doc.createElement(strChild);
			children.setAttribute("nameTarget", nameTarget);
			children.setAttribute("type", type);
			children.setAttribute("pathTarget", pathTarget);
			rootItem.appendChild(children);
			saveXML(doc,pathSource);
		}
		else{
			Document doc=parseXML(pathSource);
			Node rootItem=doc.getFirstChild();
			NodeList nodeList=rootItem.getChildNodes();
			boolean exist=false;
			int i;
			for( i=0;i<(nodeList.getLength()-1)/2;i++){
				if(nodeList.item(2*i+1).getAttributes().getNamedItem("type").getNodeValue().equals(type)&&
					nodeList.item(2*i+1).getAttributes().getNamedItem("nameTarget").getNodeValue().equals(nameSource)){
					exist=true;
					break;
				}
			}
			if(!exist){
				Element children=doc.createElement("children");
				children.setAttribute("nameTarget", nameTarget);
				children.setAttribute("type", type);
				children.setAttribute("pathTarget", pathTarget);
				rootItem.appendChild(children);
				saveXML(doc,pathSource);
			}//if exist citation
			else{//删除被引用节点出的引用信息 
				Document doc1=parseXML(nodeList.item(2*i+1).getAttributes().getNamedItem("pathTarget").getNodeValue());
			    Node rootItem1=doc1.getFirstChild();
			    NodeList nodeList1=rootItem1.getChildNodes();
			    for(int j=0;j<(nodeList1.getLength()-1)/2;j++){
			    	if(nodeList1.item(2*j+1).getAttributes().getNamedItem("type").getNodeValue().equals(type)&&
			    		nodeList1.item(2*j+1).getAttributes().getNamedItem("nameSource").getNodeValue().equals(nameSource)&&
			    		nodeList1.item(2*j+1).getAttributes().getNamedItem("pathSource").getNodeValue().equals(pathSource)){
			    		rootItem1.removeChild(nodeList1.item(2*j+2));
			    		rootItem1.removeChild(nodeList1.item(2*j+1));
			    		break;
			    	}
			    }
			    saveXML(doc1,nodeList.item(2*i+1).getAttributes().getNamedItem("pathTarget").getNodeValue());
			    rootItem.removeChild(nodeList.item(2*i+2));
			    rootItem.removeChild(nodeList.item(2*i+1));
			    Element children=doc.createElement("children");
				children.setAttribute("nameTarget", nameTarget);
				children.setAttribute("type", type);
				children.setAttribute("pathTarget", pathTarget);
				rootItem.appendChild(children);
			    saveXML(doc,pathSource);
			}
		}
		File fileTarget=new File(pathTarget);
		if(!fileTarget.exists()){
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
			Element children=doc.createElement(strChild);
			children.setAttribute("nameSource", nameTarget);
			children.setAttribute("type", type);
			children.setAttribute("pathSource", pathSource);
			rootItem.appendChild(children);
			saveXML(doc,pathTarget);
		}
		else{
			Document doc=parseXML(pathTarget);
			Node rootItem=doc.getFirstChild();
			NodeList nodeList=rootItem.getChildNodes();
			Element children=doc.createElement("children");
			children.setAttribute("nameSource", nameTarget);
			children.setAttribute("type", type);
			children.setAttribute("pathSource", pathSource);
			rootItem.appendChild(children);
			saveXML(doc,pathTarget);
		}
	}
	//根据path解析xml文件
	public Document parseXML(String path){
		Document doc = null;
	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			FileInputStream inputStream=new FileInputStream(path);

			doc = builder.parse(inputStream);
	      
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doc;	
	}
	//根据path保存修改后的xml文件
	public void saveXML(Document doc,String path){
		try {
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			DOMSource source = new DOMSource(doc);
			transformer.setOutputProperty(OutputKeys.ENCODING, "GB2312");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			PrintWriter pw = new PrintWriter(new FileOutputStream(path));
			StreamResult result = new StreamResult(pw);
			transformer.transform(source, result);
			pw.close();
		} catch (TransformerException mye) {
			mye.printStackTrace();
		} catch (IOException exp) {
			exp.printStackTrace();
		}
	}
	Vector<String> getItemName(String modelName){
		Vector<String> itemName=new Vector();
		Document doc = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root=workspace.getRoot();
		try {
			builder = factory.newDocumentBuilder();
			
			
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
			//System.out.println(pathStr+"\\资源模型\\"+modelName+".resource\\"+modelName+".resource");
			FileInputStream inputStream=new FileInputStream(pathStr+"\\资源模型\\"+modelName+".resource\\"+modelName+".resource");
			
			doc = builder.parse(inputStream);
			Node rootItem = doc.getFirstChild();
			NodeList nodeList = rootItem.getChildNodes();
			for(int q=0;q<(nodeList.getLength()-1)/2;q++){
				if(nodeList.item(2*q+1).getNodeName().toString().equals("MachineType"))
				itemName.add(nodeList.item(2*q+1).getAttributes().getNamedItem("name").getNodeValue());
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
		return itemName;
	}
}
