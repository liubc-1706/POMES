package newpmbe.product;

import java.util.ArrayList;
import java.util.List;

import newpmbe.product.tableViewer.Product;

import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.ui.model.WorkbenchContentProvider;

import vpml.processpackage.EMPArtifact;
import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPDocument;
import vpml.processpackage.EMPForm;
import vpml.processpackage.EMPMessage;
import vpml.processpackage.EMPOther;
import vpml.processpackage.EMPProduct;
import vpml.processpackage.EMPProductPackage;

public class ProcessManager {
	/**
	 * 得到工作空间的所有过程模型
	 * @return 过程模型列表
	 */
	public static List getProjectsFromWorkspace(){
		List modelList=new ArrayList();
		ITreeContentProvider myWorkbenchContentProvider = new WorkbenchContentProvider();
		Object[] elements = myWorkbenchContentProvider
				.getElements(ResourcesPlugin.getWorkspace().getRoot());
		
		for (int j = 0; j < elements.length; j++)
			if (elements[j] instanceof Project){
				if(((Project)elements[j]).getName().endsWith(".process"))
					modelList.add(((Project)elements[j]).getName());
			}
				
		return modelList;
	}
	
	/**
	 * 在指定的过程模型中检索所有的产品，最后返回产品的list
	 * @param project 工程名
	 * @return
	 */
	public static List getProductsFromProject(String projectName){
		Project project=getProjectByName(projectName);
		List list=new ArrayList();
		
		ResourceSet resourceSet=new ResourceSetImpl();
		getProductsFromResource(project.getFile(project.getName()+"_diagram"),
				list, resourceSet);
		return list;
	}
	
	
	public static void getProductsFromResource(IFile file, List list, ResourceSet rsSet){		
		URI fileURI= URI.createFileURI(file.getLocation().toString());
		Resource resource = rsSet.getResource(fileURI, true);
		EMPDiagram empModel=(EMPDiagram)resource.getContents().get(0);
		list.addAll(empModel.getDocuments());
		list.addAll(empModel.getArtifacts());
		list.addAll(empModel.getForms());
		list.addAll(empModel.getOthers());
		list.addAll(empModel.getMessages());
		list.addAll(empModel.getProductPackages());
		
		List packageList=empModel.getProductPackages();
		for(int i=0;i<packageList.size();i++){
			EMPProductPackage proPackage=(EMPProductPackage)packageList.get(i);
			if(proPackage.getName()!=null &&proPackage.getName().length()>0){
				IFile subFile=file.getProject().getFile(file.getParent().
						getProjectRelativePath().append(proPackage.getName()).
						append(proPackage.getName()+".product_diagram"));
				if(subFile.exists())
					getProductsFromResource(subFile,list,rsSet);
			}
		}
		
		List compActList=empModel.getCompActivities();
		for(int i=0;i<compActList.size();i++){
			EMPCompActivity compAct=(EMPCompActivity)compActList.get(i);
			if(compAct.getName()!=null && compAct.getName().length()>0){
				IFile subFile=file.getProject().getFile(file.getParent().
						getProjectRelativePath().append(compAct.getName()).
						append(compAct.getName()+".process_diagram"));
				if(subFile.exists())
					getProductsFromResource(subFile,list,rsSet);
			}
		}
	}
	
	//get Project from current workspace by name
	public static Project getProjectByName(String name){
		ITreeContentProvider wcp = new WorkbenchContentProvider();
		Object[] elements = wcp.getElements(ResourcesPlugin.getWorkspace().getRoot());
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] instanceof Project) {
				if (name.equals(((Project) elements[i])
							.getName())){
					return (Project)elements[i];
				}
			}
		}
		return null;
	}
	
	
	/**
	 * 从给定的产品列表中查询符合要求的产品
	 * @param list  原产品列表
	 * @param document  
	 * @param artifact
	 * @param productPackage
	 * @param other
	 * @param message
	 * @param type
	 * @param keyword
	 * @return
	 */
	public static List queryProducts(List list, boolean document, boolean artifact, boolean message, boolean productPackage
			,boolean other,int type,String keyword){
		List newlist=new ArrayList();
		for(int i=0;i<list.size();i++){
			EMPProduct product=(EMPProduct)list.get(i);
			if((document && (product instanceof EMPDocument))||
					(artifact && (product instanceof EMPArtifact))||
					(productPackage && (product instanceof EMPProductPackage))||
					(other && (product instanceof EMPOther))||
					(message && (product instanceof EMPMessage)))
//					||(form && (product instanceof EMPForm)))
				;
			else 
				continue;
			
			switch(type){
			case 0:
				if(product.getOID()!=null&&product.getOID().toString().contains(keyword))
					newlist.add(product);
				break;
			case 1:
				if(product.getName()!=null&&product.getName().contains(keyword))
					newlist.add(product);
				if(product.getName()==null && keyword.trim().length()==0)
					newlist.add(product);
				break;
			case 2:
				if(product.getDescription()!=null&&product.getDescription().contains(keyword))
					newlist.add(product);
				if(product.getDescription()==null&&keyword.trim().length()==0)
					newlist.add(product);
				break;
			}
						
		}
		return newlist;
	}
}
