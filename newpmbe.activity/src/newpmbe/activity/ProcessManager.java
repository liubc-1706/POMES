package newpmbe.activity;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.ui.model.WorkbenchContentProvider;

import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPActivity;
import vpml.processpackage.EMPAutoActivity;
import vpml.processpackage.EMPAutoBatchActivity;
import vpml.processpackage.EMPManualBatchActivity;
import vpml.processpackage.EMPNormalActivity;


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
	 * 在指定的过程模型中检索所有的活动，最后返回活动的list
	 * @param project 工程名
	 * @return
	 */
	public static List getActivitiesFromProject(String projectName){
		Project project=getProjectByName(projectName);
		List list=new ArrayList();
		
		ResourceSet resourceSet=new ResourceSetImpl();
		getActivitiesFromResource(project.getFile(project.getName()+"_diagram"),
				list, resourceSet);
		return list;
	}
	
	
	public static void getActivitiesFromResource(IFile file, List list, ResourceSet rsSet){		
		URI fileURI= URI.createFileURI(file.getLocation().toString());
		Resource resource = rsSet.getResource(fileURI, true);
		EMPDiagram empModel=(EMPDiagram)resource.getContents().get(0);
		list.addAll(empModel.getNormalActivities());
		list.addAll(empModel.getAutoBatchActivities());
		list.addAll(empModel.getManualBatchActivities());
		list.addAll(empModel.getCompActivities());
		list.addAll(empModel.getAutoActivities());
		
/*		List packageList=empModel.getProductPackages();
		for(int i=0;i<packageList.size();i++){
			EMPProductPackage proPackage=(EMPProductPackage)packageList.get(i);
			if(proPackage.getName()!=null &&proPackage.getName().length()>0){
				IFile subFile=file.getProject().getFile(file.getParent().
						getProjectRelativePath().append(proPackage.getName()).
						append(proPackage.getName()+".product_diagram"));
				if(subFile.exists())
					getProductsFromResource(subFile,list,rsSet);
			}
		}*/
		//遇到组合活动再进一步展开子图得到活动
		List compActList=empModel.getCompActivities();
		for(int i=0;i<compActList.size();i++){
			EMPCompActivity compAct=(EMPCompActivity)compActList.get(i);
			if(compAct.getName()!=null && compAct.getName().length()>0){
				IFile subFile=file.getProject().getFile(file.getParent().
						getProjectRelativePath().append(compAct.getName()).
						append(compAct.getName()+".process_diagram"));
				if(subFile.exists())
					getActivitiesFromResource(subFile,list,rsSet);
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
	 * 从给定的活动列表中查询符合要求的活动
	 * @param list  原活动列表
	 * @param normalactivity  
	 * @param autoactivity
	 * @param manualbatchactivity
	 * @param autobatchactivity
	 * @param compactivity
	 * @param type
	 * @param keyword
	 * @return
	 */
	public static List queryActivities(List list, boolean normalactivity, boolean autoactivity, boolean manualbatchactivity,boolean autobatchactivity, boolean compactivity
			,int type,String keyword){
		List newlist=new ArrayList();
		for(int i=0;i<list.size();i++){
			EMPActivity activity=(EMPActivity)list.get(i);
			if((normalactivity && (activity instanceof EMPNormalActivity))||
					(autoactivity && (activity instanceof EMPAutoActivity))||
					(manualbatchactivity && (activity instanceof EMPManualBatchActivity))||
					(autobatchactivity && (activity instanceof EMPAutoBatchActivity))||
					(compactivity && (activity instanceof EMPCompActivity)))
				;
			else 
				continue;
			
			switch(type){
			case 0:
				if(activity.getOID()!=null&&activity.getOID().toString().contains(keyword))
					newlist.add(activity);
				break;
			case 1:
				if(activity.getName()!=null&&activity.getName().contains(keyword))
					newlist.add(activity);
				if(activity.getName()==null && keyword.trim().length()==0)
					newlist.add(activity);
				break;
			case 2:
				if(activity.getDescription()!=null&&activity.getDescription().contains(keyword))
					newlist.add(activity);
				if(activity.getDescription()==null&&keyword.trim().length()==0)
					newlist.add(activity);
				break;
			}
						
		}
		return newlist;
	}
}
