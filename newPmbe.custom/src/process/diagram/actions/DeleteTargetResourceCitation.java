package process.diagram.actions;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import newpmbe.resource.diagram.edit.parts.EMRMachineTypeEditPart;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import vpml.resourcepackage.impl.EMRMachineTypeImpl;



public class DeleteTargetResourceCitation implements
		IWorkbenchWindowActionDelegate {
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
		Shell shell=new Shell();
		OKDialog dlg=new OKDialog(shell);
		dlg.open();
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
	public class OKDialog extends Dialog{
		public OKDialog(Shell parentShell){
			super(parentShell);

		}
		protected Control createDialogArea(Composite parent){
			this.getShell().setText("删除引用");
			Composite topComp=new Composite(parent,SWT.NONE);
			topComp.setLayout(null);
			Label label=new Label(topComp,SWT.NONE);
		    label.setBounds(55,30,110,25);
		    label.setText("您确定要删除引用？");
			topComp.setLayout(null);
			 return topComp;
		}
		protected void initializeBounds() {
			// TODO Auto-generated method stub
			super.createButton((Composite)getButtonBar(),IDialogConstants.OK_ID, "确定", false);
			super.createButton((Composite)getButtonBar(), IDialogConstants.CANCEL_ID, "取消", false);
			super.initializeBounds();
		}
		protected Button createButton(Composite parent, int id, String label,
				boolean defaultButton) {
			// TODO Auto-generated method stub
			return null;
		}
		protected Point getInitialSize() {
			// TODO Auto-generated method stub
			Point p=super.getInitialSize();
			p.x=225;
			p.y=140;
			return p;
		}
		protected void buttonPressed(int buttonId) {
			// TODO Auto-generated method stub
			//super.buttonPressed(buttonId);
			if(buttonId==IDialogConstants.OK_ID){
				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				IWorkspaceRoot root=workspace.getRoot();
				String nameTarget="";
				nameTarget=((EMRMachineTypeImpl)((NodeImpl)selectedElement.getModel()).getElement()).getName();
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
				String pathTarget;
				pathTarget=rootPath+"/资源模型"+namePath+"/.XML";
				Document doc=parseXML(pathTarget);
				Node rootItem =doc.getFirstChild();
				NodeList nodeList=rootItem.getChildNodes();
				for(int i=0;i<(nodeList.getLength()-1)/2;i++){
					if(nodeList.item(2*i+1).getAttributes().getNamedItem("type").getNodeValue().equals("MachineType")&&
							nodeList.item(2*i+1).getAttributes().getNamedItem("nameSource").getNodeValue().equals(nameTarget)){
						String pathSource="";
						pathSource=nodeList.item(2*i+1).getAttributes().getNamedItem("pathSource").getNodeValue().toString();
						Document doc1=parseXML(pathSource);
						Node rootItem1=doc1.getFirstChild();
						NodeList nodeList1=rootItem1.getChildNodes();
						for(int j=0;j<(nodeList1.getLength()-1)/2;j++){
							if(nodeList1.item(2*j+1).getAttributes().getNamedItem("type").getNodeValue().equals("MachineType")&&
									nodeList1.item(2*j+1).getAttributes().getNamedItem("nameTarget").getNodeValue().equals(nameTarget)&&
									nodeList1.item(2*j+1).getAttributes().getNamedItem("pathTarget").getNodeValue().equals(pathTarget)){
								rootItem1.removeChild(nodeList1.item(2*j+2));
								rootItem1.removeChild(nodeList1.item(2*j+1));
								j--;
								saveXML(doc1,pathSource);
								break;
							}
						}
						rootItem.removeChild(nodeList.item(2*i+2));
						rootItem.removeChild(nodeList.item(2*i+1));
						i--;
						saveXML(doc,pathTarget);
					}
				}
				this.close();
			}
			else if(buttonId==IDialogConstants.CANCEL_ID){
				this.close();
			}
		}
	}

}
