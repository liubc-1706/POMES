package newpmbe.process.validator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import newpmbe.validator.Problems;
import newpmbe.validator.Warning;
import newpmbe.validator.XMLParser;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.jdom.Attribute;
import org.jdom.Element;
import org.jdom.Namespace;

public class Validator {
	IProject project;
	private List problemList;
	private List activityProblemList;
	private List productProblemList;
	private List conditionalProblemList;
	private List resourceProblemList;
	private List otherProblemList;
	
	private Problems activityProblems;
	private Problems productProblems;
	private Problems conditionalProblems;
	private Problems resourceProblems;
	private Problems otherProblems;
	
	public  final static Namespace XMLNS_XMI=Namespace.getNamespace("xmi","http://www.omg.org/XMI");
	public  final static Namespace XMLNS_PROCESS=Namespace.getNamespace("vpml.processpackage","http:///vpml/processpackage.ecore");
	public  final static Namespace XMLNS_XSI=Namespace.getNamespace("xsi","http://www.w3.org/2001/XMLSchema-instance");
	
	
	
	public Validator(IProject project){
		this.project=project;
		problemList=new ArrayList();
		activityProblemList=new ArrayList();
		productProblemList=new ArrayList();
		conditionalProblemList=new ArrayList();
		resourceProblemList=new ArrayList();
		otherProblemList=new ArrayList();
		
		activityProblems=new Problems();
		productProblems=new Problems();
		conditionalProblems=new Problems();
		resourceProblems=new Problems();
		otherProblems=new Problems();
		
		activityProblems.setType(Problems.TYPE_ACTIVITY);
		productProblems.setType(Problems.TYPE_PRODUCT);
		conditionalProblems.setType(Problems.TYPE_CONDITIONAL);
		resourceProblems.setType(Problems.TYPE_RESOURCE);
		otherProblems.setType(Problems.TYPE_OTHER);
		
	}
	
	public boolean isRsModelRelated(){
		IFile recordFile = project.getFile(".rsrecord");
		if(!recordFile.exists())
			return false;
		java.io.File nativeFile = recordFile.getRawLocation().toFile();
		try { 
			 FileReader fr = new FileReader(nativeFile);
			 BufferedReader br = new BufferedReader(fr);
			 String record = new String();
			 while ((record = br.readLine()) != null) {
				 String strs[] = record.split("=");
				 if(strs[0].equals(project.getName()+"_diagram")
		        			&& strs[1].equals(project.getRawLocation().append(project.getName()+"_diagram").toString())){
					 return true;
				 }
			 }
		}catch(Exception e){
			 System.out.println("IO错误：读写操作失败");
	         e.printStackTrace();
		}
		return false;
	}
	
	public boolean isOrgModelRelated(){
		IFile recordFile = project.getFile(".orgrecord");
		if(!recordFile.exists())
			return false;
		java.io.File nativeFile = recordFile.getRawLocation().toFile();
		try { 
			 FileReader fr = new FileReader(nativeFile);
			 BufferedReader br = new BufferedReader(fr);
			 String record = new String();
			 while ((record = br.readLine()) != null) {
				 String strs[] = record.split("=");
				 if(strs[0].equals(project.getName()+"_diagram")
		        			&& strs[1].equals(project.getRawLocation().append(project.getName()+"_diagram").toString())){
					 return true;
				 }
			 }
		}catch(Exception e){
			 System.out.println("IO错误：读写操作失败");
	         e.printStackTrace();
		}
		return false;
	}
	
	
	/**
	 * 对过程模型进行完整性检查
	 * @param project 要检查的过程模型的工程
	 * @return 返回完整性问题的列表
	 */
	public List ValidateProcess(){
		Object[] files = null;
		try {
			files =project.members();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<files.length;i++){
			if(files[i] instanceof IFile){
				if(((IFile)files[i]).getName().equals(project.getName()+"_diagram")){
					if(isDiagramNull(((IFile)files[i]).getLocation().toFile())){
						newpmbe.validator.Error error=new newpmbe.validator.Error();
						error.path=((IFile)files[i]).getFullPath().removeFileExtension().addFileExtension("process_diagram");
						error.description="\"定义\"错误: 没有\"活动\"";
						error.resource=project.getName();
						activityProblemList.add(error);
					}
					/*Element root=XMLParser.parser(((IFile)files[i]).getLocation().toFile()).getRootElement();
					Element model=root.getChild("EMPDiagram", Validator.XMLNS_PROCESS);
					Element emo=model.getChild("emoDiagrams");
					Element emr=model.getChild("emrDiagrams");*/
					if(!isRsModelRelated()){
						newpmbe.validator.Warning warning=new newpmbe.validator.Warning();
						warning.path=((IFile)files[i]).getFullPath().removeFileExtension().addFileExtension("process_diagram");
						warning.description="过程未与资源模型关联";
						warning.resource=project.getName();
						otherProblemList.add(warning);
					}
					if(!isOrgModelRelated()){
						newpmbe.validator.Warning warning=new newpmbe.validator.Warning();
						warning.path=((IFile)files[i]).getFullPath().removeFileExtension().addFileExtension("process_diagram");
						warning.description="过程未与组织模型关联";
						warning.resource=project.getName();
						otherProblemList.add(warning);
					}
					
					processFileParse((IFile)files[i]);
				}
			}
			else if(files[i] instanceof IFolder){
				if(!((IFolder)files[i]).getName().equals("SliceProcess"))
					fileValidate(files[i]);
			}
		}
		
		activityProblems.setProblemList(activityProblemList);
		productProblems.setProblemList(productProblemList);
		conditionalProblems.setProblemList(conditionalProblemList);
		resourceProblems.setProblemList(resourceProblemList);
		otherProblems.setProblemList(otherProblemList);
		problemList.add(activityProblems);
		problemList.add(productProblems);
		problemList.add(conditionalProblems);
		problemList.add(resourceProblems);
		problemList.add(otherProblems);
		
		return problemList;		
	}
	
	/**
	 * 
	 * @param element		
	 * @param errorList
	 * @param warningList.
	 */
	protected void fileValidate(Object element){
		if(element instanceof IFolder){
			try{
				Object[] children=((IFolder)element).members();
				for(int i=0;i<children.length;i++){
					if(children[i] instanceof IFile){
						if(((IFile)children[i]).getProjectRelativePath().
								toString().endsWith(".process_diagram"))
							processFileParse((IFile)children[i]);
						else if(((IFile)children[i]).getProjectRelativePath().
								toString().endsWith(".product_diagram"))
							;
					}
					else if(children[i]instanceof IFolder){
						fileValidate(children[i]);
					}
				}
			}catch(Exception e){}
		}
	}
	
	/**
	 * 解析组合产品子图文件
	 * @param file
	 * @param isSource
	 */
	public void productFileParse(IFile file,boolean isSource){
		List list=new ArrayList();
		Element root=XMLParser.parser(file).getRootElement();
		Element model=root.getChild("EMPDiagram",Validator.XMLNS_PROCESS);
		list=model.getChildren();
		
		for(int i=0;i<list.size();i++){
			Element element=(Element)list.get(i);
			String type=element.getName();
			Attribute name=element.getAttribute("name");
			Attribute id=element.getAttribute("id");
			if(type.equals("documents")||type.equals("artifacts")
						||type.equals("messages")||type.equals("productPackages")
						||type.equals("others")||type.equals("forms")){
				if(name==null){
					newpmbe.validator.Error error=new newpmbe.validator.Error();
					error.path=file.getFullPath().removeFileExtension().
									addFileExtension("product_diagram");
					error.description="产品类型未命名";
					error.name=getDefaultName(element);
					error.resource=file.getProject().getName()+":/"+file.getProjectRelativePath().
										removeLastSegments(1).toString();
					if(id!=null)
						error.id=id.getValue();
					productProblemList.add(error);
				}
			}
			
			if(type.equals("productPackages")){
				if(name!=null){
					IPath path=file.getRawLocation().removeLastSegments(1).
									append(name.getValue()).append(name.getValue()+".product_diagram");
					IPath relativePath=file.getProjectRelativePath().removeLastSegments(1).
									append(name.getValue()).append(name.getValue()+".product_diagram");
					File subFile=path.toFile();
					if(subFile.exists()&&!isDiagramNull(subFile)){
						productFileParse(project.getFile(relativePath),isSource);
					}
					else{
						newpmbe.validator.Error error=new newpmbe.validator.Error();
						error.path=file.getFullPath().removeFileExtension().
													addFileExtension("product_diagram");
						error.description="组合产品为空";
						error.resource=file.getProject().getName()+":/"+file.getProjectRelativePath().
													removeLastSegments(1).toString();
						error.name=name.getValue();
						if(id!=null)
							error.id=id.getValue();
						productProblemList.add(error);
					}
				}
				else{
					newpmbe.validator.Error error=new newpmbe.validator.Error();
					error.path=file.getFullPath().removeFileExtension().
													addFileExtension("product_diagram");
					error.description="组合产品为空";
					error.resource=file.getProject().getName()+":/"+file.getProjectRelativePath().
													removeLastSegments(1).toString();
					error.name=getDefaultName(element);
					if(id!=null)
						error.id=id.getValue();
					productProblemList.add(error);
				}
			}
			else if(type.equals("documents")||type.equals("artifacts")
					||type.equals("others")||type.equals("messages")||type.equals("forms")){
				Attribute ioType=element.getAttribute("ioType");
				if(isSource&&ioType==null){
					newpmbe.validator.Error error=new newpmbe.validator.Error();
					error.path=file.getFullPath().removeFileExtension().
													addFileExtension("product_diagram");
					error.description="它应是所需材料";
					error.resource=file.getProject().getName()+":/"+file.getProjectRelativePath().
													removeLastSegments(1).toString();
					if(name!=null)
						error.name=name.getValue();
					else 
						error.name=getDefaultName(element);;
					if(id!=null)
						error.id=id.getValue();
					productProblemList.add(error);
				}
				else if(!isSource&&ioType!=null){
					newpmbe.validator.Error error=new newpmbe.validator.Error();
					error.path=file.getFullPath().removeFileExtension().
													addFileExtension("product_diagram");
					error.description="它不能作为所需材料";
					error.resource=file.getProject().getName()+":/"+file.getProjectRelativePath().
													removeLastSegments(1).toString();
					if(name!=null)
						error.name=name.getValue();
					else 
						error.name=getDefaultName(element);;
					if(id!=null)
						error.id=id.getValue();
					productProblemList.add(error);
				}
			}
		}
		
	}
	
	
	/**
	 *解析过程文件，并按照完整性规则对其进行检查 
	 * @param file ：要解析的过程语义文件
	 */
	protected void processFileParse(IFile file){
		List list=new ArrayList();
		
		Element root=XMLParser.parser(file).getRootElement();
		Element model=root.getChild("EMPDiagram", Validator.XMLNS_PROCESS);
		list=model.getChildren();
		
		for(int i=0;i<list.size();i++){
			Element element=(Element)list.get(i);
			elementCheck(element,file);
		}
	}
	
	
	
	/**
	 * 对模型元素进行完整性检查
	 * @param element：  模型元素
	 * @param file：  模型元素所在的文件
	 */
	protected void elementCheck(Element element,IFile file){
		String type=element.getName();
		if(type.equals("dataFlows")||type.equals("refFlows")
				||type.equals("assFlows")||type.equals("clockFlows")){
			
		}
		else if(type.equals("documents")||type.equals("artifacts")
				||type.equals("others")||type.equals("messages")||type.equals("forms")){
			Attribute targetFlows=element.getAttribute("targetDataFlows");
			Attribute sourceFlows=element.getAttribute("sourceDataFlows");
			Attribute refFlows=element.getAttribute("refFlows");
			Attribute name=element.getAttribute("name");
			Attribute ioType=element.getAttribute("ioType");
			Attribute id=element.getAttribute("id");
			
			if(name==null){
				newpmbe.validator.Error error=new newpmbe.validator.Error();
				error.path=file.getFullPath().removeFileExtension().
											addFileExtension("process_diagram");
				error.description="产品类型未命名";
				error.name=getDefaultName(element);
				error.resource=file.getProject().getName()+":/"+file.getProjectRelativePath().
											removeLastSegments(1).toString();
				if(id!=null)
					error.id=id.getValue();
				productProblemList.add(error);
			}
			
			boolean hasTargetFlow=false;
			if(targetFlows==null){
				List children=element.getChildren();
				for(int i=0;i<children.size();i++){
					if(((Element)children.get(i)).getName().equals("targetDataFlows")){
						hasTargetFlow=true;
						break;
					}
				}
			}
			else
				hasTargetFlow=true;
			
			if(!hasTargetFlow&&ioType==null){
				newpmbe.validator.Error error=new newpmbe.validator.Error();
				error.path=file.getFullPath().removeFileExtension().
										addFileExtension("process_diagram");
				error.description="它应是所需材料";
				error.resource=file.getProject().getName()+":/"+
								file.getProjectRelativePath().removeLastSegments(1).toString();
				if(name!=null)
					error.name=name.getValue();
				else
					error.name=getDefaultName(element);
				if(id!=null)
					error.id=id.getValue();
				productProblemList.add(error);
			}
			if(hasTargetFlow&&ioType!=null){
				newpmbe.validator.Error error=new newpmbe.validator.Error();
				error.path=file.getFullPath().removeFileExtension().
										addFileExtension("process_diagram");
				error.description="它不能作为所需材料";
				error.resource=file.getProject().getName()+":/"+
								file.getProjectRelativePath().removeLastSegments(1).toString();
				if(name!=null)
					error.name=name.getValue();
				else
					error.name=getDefaultName(element);
				if(id!=null)
					error.id=id.getValue();
				productProblemList.add(error);
			}
			if(sourceFlows==null&&!hasTargetFlow&&refFlows==null){
				newpmbe.validator.Error error=new newpmbe.validator.Error();
				error.path=file.getFullPath().removeFileExtension().
								addFileExtension("process_diagram");
				error.description="连接不适当";
				error.resource=file.getProject().getName()+":/"+
								file.getProjectRelativePath().removeLastSegments(1).toString();
				if(name!=null)
					error.name=name.getValue();
				else
					error.name=getDefaultName(element);
				if(id!=null)
					error.id=id.getValue();
				productProblemList.add(error);
			}
		}
		
		else if(type.equals("productPackages")){
			Attribute targetFlows=element.getAttribute("targetDataFlows");
			Attribute sourceFlows=element.getAttribute("sourceDataFlows");
			Attribute refFlows=element.getAttribute("refFlows");
			Attribute name=element.getAttribute("name");
			Attribute id=element.getAttribute("id");
			
			if(name==null){
				newpmbe.validator.Error error=new newpmbe.validator.Error();
				error.path=file.getFullPath().removeFileExtension().
											addFileExtension("process_diagram");
				error.description="产品类型未命名";
				error.name=getDefaultName(element);
				error.resource=file.getProject().getName()+":/"+file.getProjectRelativePath().
											removeLastSegments(1).toString();
				if(id!=null)
					error.id=id.getValue();
				productProblemList.add(error);
			}
			
			boolean hasTargetFlow=false;
			boolean isSource=true;
			if(targetFlows==null){
				List children=element.getChildren();
				for(int i=0;i<children.size();i++){
					if(((Element)children.get(i)).getName().equals("targetDataFlows")){
						hasTargetFlow=true;
						isSource=false;
						break;
					}
				}
			}
			else{
				hasTargetFlow=true;
				isSource=false;
			}
			
			
			if(sourceFlows==null&&!hasTargetFlow&&refFlows==null){
				newpmbe.validator.Error error=new newpmbe.validator.Error();
				error.path=file.getFullPath().removeFileExtension().
								addFileExtension("process_diagram");
				error.description="连接不适当";
				error.resource=file.getProject().getName()+":/"+
								file.getProjectRelativePath().removeLastSegments(1).toString();
				if(name!=null)
					error.name=name.getValue();
				else
					error.name=getDefaultName(element);
				if(id!=null)
					error.id=id.getValue();
				productProblemList.add(error);
			}
			if(name!=null){
				IPath path=file.getRawLocation().removeLastSegments(1).append(name.getValue()).
									append(name.getValue()+".product_diagram");
				IPath relativePath=file.getProjectRelativePath().removeLastSegments(1).append(name.getValue()).
									append(name.getValue()+".product_diagram");
				File subFile=path.toFile();
				if(subFile.exists()&&!isDiagramNull(subFile)){
					productFileParse(project.getFile(relativePath),isSource);
				}
				else{
					newpmbe.validator.Error error=new newpmbe.validator.Error();
					error.path=file.getFullPath().removeFileExtension().
									addFileExtension("process_diagram");
					error.description="组合产品为空";
					error.resource=file.getProject().getName()+":/"+
									file.getProjectRelativePath().removeLastSegments(1).toString();
					error.name=name.getValue();
					if(id!=null)
						error.id=id.getValue();
					productProblemList.add(error);
				}
			}
			else{
				newpmbe.validator.Error error=new newpmbe.validator.Error();
				error.path=file.getFullPath().removeFileExtension().
									addFileExtension("process_diagram");
				error.description="组合产品为空";
				error.resource=file.getProject().getName()+":/"+
									file.getProjectRelativePath().removeLastSegments(1).toString();
				error.name=getDefaultName(element);
				if(id!=null)
					error.id=id.getValue();
				productProblemList.add(error);
			}
		}
		
		
		else if(type.equals("manualBatchActivities")||type.equals("autoActivities")
				||type.equals("normalActivities")||type.equals("autoBatchActivities")){
			Attribute targetFlows=element.getAttribute("targetDataFlows");
			Attribute sourceFlows=element.getAttribute("sourceDataFlows");
			Attribute refFlows=element.getAttribute("refFlows");
			Attribute assFlows=element.getAttribute("assFlows");
			Attribute name=element.getAttribute("name");
			Attribute id=element.getAttribute("id");
			
			if(name==null){
				newpmbe.validator.Error error=new newpmbe.validator.Error();
				error.path=file.getFullPath().removeFileExtension().
											addFileExtension("process_diagram");
				error.description="活动类型未命名";
				error.name=getDefaultName(element);
				error.resource=file.getProject().getName()+":/"+file.getProjectRelativePath().
											removeLastSegments(1).toString();
				if(id!=null)
					error.id=id.getValue();
				activityProblemList.add(error);
			}
			
			
			boolean hasTargetFlow=false;
			if(targetFlows==null){
				List children=element.getChildren();
				for(int i=0;i<children.size();i++){
					if(((Element)children.get(i)).getName().equals("targetDataFlows")){
						hasTargetFlow=true;
						break;
					}
				}
			}
			else
				hasTargetFlow=true;
			
			if(sourceFlows==null&&refFlows==null&&assFlows==null&&!hasTargetFlow){
				newpmbe.validator.Error error=new newpmbe.validator.Error();
				error.path=file.getFullPath().removeFileExtension().
								addFileExtension("process_diagram");
				error.description="连接不适当";
				error.resource=file.getProject().getName()+":/"+
									file.getProjectRelativePath().removeLastSegments(1).toString();
				if(name!=null)
					error.name=name.getValue();
				else
					error.name=getDefaultName(element);
				if(id!=null)
					error.id=id.getValue();
				activityProblemList.add(error);
			}
			else{
				if(sourceFlows==null){
					newpmbe.validator.Error error=new newpmbe.validator.Error();
					error.path=file.getFullPath().removeFileExtension().
												addFileExtension("process_diagram");
					error.description="未生成产品";
					error.resource=file.getProject().getName()+":/"+file.getProjectRelativePath().
												removeLastSegments(1).toString();
					if(name!=null)	
						error.name=name.getValue();
					else
						error.name=getDefaultName(element);
					if(id!=null)
						error.id=id.getValue();
					activityProblemList.add(error);
				}
				if(!hasTargetFlow&&refFlows==null){
					newpmbe.validator.Error error=new newpmbe.validator.Error();
					error.path=file.getFullPath().removeFileExtension().addFileExtension("process_diagram");
					error.description="没有输入产品";
					error.resource=file.getProject().getName()+":/"+
										file.getProjectRelativePath().removeLastSegments(1).toString();
					if(name!=null)
						error.name=name.getValue();
					else
						error.name=getDefaultName(element);
					if(id!=null)
						error.id=id.getValue();
					activityProblemList.add(error);
				}
				//如果是人工活动，则需要检查是否与角色相连
				if(type.equals("normalActivities")||type.equals("manualBatchActivities")){
					if(!isRoleAssigned(assFlows, file)){
						newpmbe.validator.Error error=new newpmbe.validator.Error();
						error.path=file.getFullPath().removeFileExtension().addFileExtension("process_diagram");
						error.description="未分配角色";
						error.resource=file.getProject().getName()+":/"+
											file.getProjectRelativePath().removeLastSegments(1).toString();
						if(name!=null)
							error.name=name.getValue();
						else
							error.name=getDefaultName(element);
						if(id!=null)
							error.id=id.getValue();
						activityProblemList.add(error);
					}
				}
				if(type.equals("autoActivities")||type.equals("autoBatchActivities")){
					if(!isMachineAssigned(assFlows, file)){
						newpmbe.validator.Error error=new newpmbe.validator.Error();
						error.path=file.getFullPath().removeFileExtension().addFileExtension("process_diagram");
						error.description="未分配机器";
						error.resource=file.getProject().getName()+":/"+
											file.getProjectRelativePath().removeLastSegments(1).toString();
						if(name!=null)
							error.name=name.getValue();
						else
							error.name=getDefaultName(element);
						if(id!=null)
							error.id=id.getValue();
						activityProblemList.add(error);
					}
				}
			}
		}
		
		else if(type.equals("compActivities")){
			Attribute targetFlows=element.getAttribute("targetDataFlows");
			Attribute sourceFlows=element.getAttribute("sourceDataFlows");
			Attribute refFlows=element.getAttribute("refFlows");
			Attribute name=element.getAttribute("name");
			Attribute id=element.getAttribute("id");
			
			if(name==null){
				newpmbe.validator.Error error=new newpmbe.validator.Error();
				error.path=file.getFullPath().removeFileExtension().
											addFileExtension("process_diagram");
				error.description="活动类型未命名";
				error.name=getDefaultName(element);
				error.resource=file.getProject().getName()+":/"+file.getProjectRelativePath().
											removeLastSegments(1).toString();
				if(id!=null)
					error.id=id.getValue();
				activityProblemList.add(error);
			}
			
			
			if(sourceFlows==null&&targetFlows==null&&refFlows==null){
				List children=element.getChildren();
				boolean hasFlow=false;
				for(int i=0;i<children.size();i++){
					if(((Element)children.get(i)).getName().equals("targetDataFlows")){
						hasFlow=true;
						break;
					}
				}
				if(!hasFlow){
					Warning warning=new Warning();
					warning.path=file.getFullPath().removeFileExtension().
										addFileExtension("process_diagram");
					warning.description="未连接组合活动";
					warning.resource=file.getProject().getName()+":/"+
										file.getProjectRelativePath().removeLastSegments(1).toString();
					if(name!=null)
						warning.name=name.getValue();
					else
						warning.name=getDefaultName(element);
					if(id!=null)
						warning.id=id.getValue();
					activityProblemList.add(warning);
				}
			}
			if(name!=null){
				IPath path=file.getRawLocation().removeLastSegments(1).append(name.getValue()).append(name.getValue()+".process_diagram");
				File subFile=path.toFile();
				if(subFile.exists()&&!isDiagramNull(subFile))
					;
				else{
					newpmbe.validator.Error error=new newpmbe.validator.Error();
					error.path=file.getFullPath().removeFileExtension().
										addFileExtension("process_diagram");
					error.description="组合活动为空";
					error.resource=file.getProject().getName()+":/"+
										file.getProjectRelativePath().removeLastSegments(1).toString();
					error.name=name.getValue();
					if(id!=null)
						error.id=id.getValue();
					activityProblemList.add(error);
				}
			}
			else{
				newpmbe.validator.Error error=new newpmbe.validator.Error();
				error.path=file.getFullPath().removeFileExtension().
										addFileExtension("process_diagram");
				error.description="组合活动为空";
				error.resource=file.getProject().getName()+":/"+
										file.getProjectRelativePath().removeLastSegments(1).toString();
				error.name=getDefaultName(element);
				if(id!=null)
					error.id=id.getValue();
				activityProblemList.add(error);
			}
			
		}
		
		else if(type.equals("clocks")){
			Attribute clockFlows=element.getAttribute("clockFlows");
			Attribute name=element.getAttribute("name");
			Attribute id=element.getAttribute("id");
			
			if(name==null){
				newpmbe.validator.Error error=new newpmbe.validator.Error();
				error.path=file.getFullPath().removeFileExtension().
											addFileExtension("process_diagram");
				error.description="时钟类型未命名";
				error.name=getDefaultName(element);
				error.resource=file.getProject().getName()+":/"+file.getProjectRelativePath().
											removeLastSegments(1).toString();
				if(id!=null)
					error.id=id.getValue();
				otherProblemList.add(error);
			}
			
			if(clockFlows==null){
				newpmbe.validator.Error error=new newpmbe.validator.Error();
				error.path=file.getFullPath().removeFileExtension().
									addFileExtension("process_diagram");
				error.description="连接不适当";
				error.resource=file.getProject().getName()+":/"+file.
									getProjectRelativePath().removeLastSegments(1).toString();
				if(name!=null)
					error.name=name.getValue();
				else
					error.name=getDefaultName(element);
				if(id!=null)
					error.id=id.getValue();
				otherProblemList.add(error);
			}
			
		}
		else if(type.equals("roles")||type.equals("locationTypes")
				||type.equals("machineTypes")||type.equals("toolTypes")
				||type.equals("resourceGroupTypes")){
			Attribute assFlows=element.getAttribute("assFlows");
			Attribute name=element.getAttribute("name");
			Attribute id=element.getAttribute("id");			
			
			if(assFlows==null){
				newpmbe.validator.Error error=new newpmbe.validator.Error();
				error.path=file.getFullPath().removeFileExtension().
									addFileExtension("process_diagram");
				error.description="资源没有连接";
				error.resource=file.getProject().getName()+":/"+file.getProjectRelativePath().
									removeLastSegments(1).toString();
				if(name!=null)
					error.name=name.getValue();
				else
					error.name=getDefaultName(element);
				if(id!=null)
					error.id=id.getValue();
				resourceProblemList.add(error);
			}
			if(name==null){
				newpmbe.validator.Error error=new newpmbe.validator.Error();
				error.path=file.getFullPath().removeFileExtension().
									addFileExtension("process_diagram");
				error.description="资源类型未命名";
				error.resource=file.getProject().getName()+":/"+file.getProjectRelativePath().
									removeLastSegments(1).toString();
				error.name=getDefaultName(element);
				if(id!=null)
					error.id=id.getValue();
				resourceProblemList.add(error);
			}
			
		}
		
		else if(type.equals("inAnds")||type.equals("inOrs")||
				type.equals("outAnds")||type.equals("outOrs")){
			Attribute targetFlows=element.getAttribute("targetFlows");
			Attribute sourceFlows=element.getAttribute("sourceFlows");
			Attribute name=element.getAttribute("name");
			Attribute id=element.getAttribute("id");
			if(sourceFlows==null){
				newpmbe.validator.Error error=new newpmbe.validator.Error();
				error.path=file.getFullPath().removeFileExtension().
									addFileExtension("process_diagram");
				if(type.equals("inAnds")){
					error.description="没有连接到活动";
					error.name="输入与";
				}
				if(type.equals("inOrs")){
					error.description="没有连接到活动";
					error.name="输入或";
				}
				else if(type.equals("outAnds")){
					error.description="没有连接到产品";
					error.name="输出与";
				}
				else if(type.equals("outOrs")){
					error.description="没有连接到产品";
					error.name="输出或";
				}
				error.resource=file.getProject().getName()+":/"+file.getProjectRelativePath().
									removeLastSegments(1).toString();
				if(id!=null)
					error.id=id.getValue();
				conditionalProblemList.add(error);
			}
			if(targetFlows==null){
				List children=element.getChildren();
				boolean hasTargetFlow=false;
				for(int i=0;i<children.size();i++){
					if(((Element)children.get(i)).getName().equals("targetFlows")){
							hasTargetFlow=true;
							break;
					}
				}
				if(!hasTargetFlow){
					newpmbe.validator.Error error=new newpmbe.validator.Error();
					error.path=file.getFullPath().removeFileExtension().
									addFileExtension("process_diagram");
					if(type.equals("inAnds")){
						error.description="没有产品与它相连";
						error.name="输入与";
					}
					if(type.equals("inOrs")){
						error.description="没有产品与它相连";
						error.name="输入或";
					}
					else if(type.equals("outAnds")){
						error.description="没有活动与它相连";
						error.name="输出与";
					}
					else if(type.equals("outOrs")){
						error.description="没有活动与它相连";
						error.name="输出或";
					}
					error.resource=file.getProject().getName()+":/"+file.getProjectRelativePath().
									removeLastSegments(1).toString();
					if(id!=null)
						error.id=id.getValue();
					conditionalProblemList.add(error);
				}
			}
		}
	}
	
	
	/**
	 * 判断一个过程图或产品图是否为空，过程图不为空的条件是图中至少有一个活动；
	 * 产品图不为空的条件是至少包含一个产品；
	 * @param file：要判断的过程图或产品图文件
	 * @return
	 */
	protected boolean isDiagramNull(File file){
		List list=new ArrayList();
		Element root=XMLParser.parser(file).getRootElement();
		Element model=root.getChild("EMPDiagram", Validator.XMLNS_PROCESS);
		list=model.getChildren();
		
		if(file.getName().endsWith(".process_diagram")){
			for(int i=0;i<list.size();i++){
				String type=((Element)list.get(i)).getName();
				if(type.equals("normalActivities")
						||type.equals("manualBatchActivities")
						||type.equals("autoActivities")
						||type.equals("autoBatchActivities")
						||type.equals(("compActivities")))
					return false;
			}
		}
		else if(file.getName().endsWith(".product_diagram")){
			for(int i=0;i<list.size();i++){
				String type=((Element)list.get(i)).getName();
				if(type.equals("artifacts")
						||type.equals("documents")
						||type.equals("others")
						||type.equals("messages")||type.equals("forms")
						||type.equals(("productPackages")))
					return false;
			}
		}
		
		return true;
	}
	
	//判断一个人工活动是否被分配了角色
	public boolean isRoleAssigned(Attribute assFlows,IFile file){
		if(assFlows==null)
			return false;
		String ass=assFlows.getValue();
		while(ass.length()>1){
			String xmi_id=ass;
			if(ass.indexOf(" ")>=0)
				xmi_id=ass.substring(0, ass.indexOf(" "));
			System.out.println(xmi_id);
			Element assFlow=getAssFlowById(file,xmi_id);
			if(assFlow!=null){
				Attribute role=assFlow.getAttribute("role");
				if(role!=null)
					return true;
			}
			if(ass.indexOf(" ")>=0){
				ass=ass.substring(ass.indexOf(" ")+1);
				System.out.println(ass);
			}
			else
				break;
			
			
		}
		return false;
	}
	
	public boolean isMachineAssigned(Attribute assFlows,IFile file){
		if(assFlows==null)
			return false;
		Element root=XMLParser.parser(file).getRootElement();
		List assFlowList=root.getChildren("assFlows");
		String ass=assFlows.getValue();
		while(ass.length()>1){
			String xmi_id=ass;
			if(ass.indexOf(" ")>=0)
				xmi_id=ass.substring(0, ass.indexOf(" "));
			System.out.println(xmi_id);
			Element assFlow=getAssFlowById(file,xmi_id);
			if(assFlow!=null){
				Attribute role=assFlow.getAttribute("machineType");
				if(role!=null)
					return true;
			}
			if(ass.indexOf(" ")>=0){
				ass=ass.substring(ass.indexOf(" ")+1);
				System.out.println(ass);
			}
			else
				break;
			
			
		}
		return false;
	}
	
	public Element getAssFlowById(IFile file,String id){
		Element root=XMLParser.parser(file).getRootElement();
		Element model=root.getChild("EMPDiagram",Validator.XMLNS_PROCESS);
		List assFlowList=model.getChildren("assFlows");
		for(int i=0;i<assFlowList.size();i++){
			Element assFlow=(Element)assFlowList.get(i);
			if(id.equals(assFlow.getAttributeValue("id", Validator.XMLNS_XMI)))
				return assFlow;
		}
		return null;
	}
	
	private String getDefaultName(Element element){
		String type=element.getName();
		if(type.equals("documents"))
			return "未命名文档";
		if(type.equals("artifacts"))
			return "未命名制品";
		if(type.equals("others"))
			return "未命名其他产品";
		if(type.equals("forms"))
			return "未命名表单";
		if(type.equals("messages"))
			return "未命名消息";
		if(type.equals("productPackages"))
			return "未命名组合产品";
		if(type.equals("normalActivities"))
			return "未命名活动";
		if(type.equals("autoActivities"))
			return "未命名自动活动";
		if(type.equals("manualBatchActivities"))
			return "未命名手动批处理活动";
		if(type.equals("autoBatchActivities"))
			return "未命名自动批处理活动";
		if(type.equals("compActivities"))
			return "未命名组合活动";
		if(type.equals("clocks"))
			return "未命名时钟";
		if(type.equals("inAnds"))
			return "输入与";
		if(type.equals("inOrs"))
			return "输入或";
		if(type.equals("outAnds"))
			return "输出与";
		if(type.equals("outOrs"))
			return "输出或";
		if(type.equals("roles"))
			return "未命名角色";
		if(type.equals("machineTypes"))
			return "未命名设备类型";
		if(type.equals("locationTypes"))
			return "未命名场所类型";
		if(type.equals("toolTypes"))
			return "未命名工具类型";
		if(type.equals("resourceGroupTypes"))
			return "未命名组织机构";
		return null;
	}
	
}
