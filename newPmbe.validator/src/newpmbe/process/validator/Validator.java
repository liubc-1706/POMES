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
			 System.out.println("IO���󣺶�д����ʧ��");
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
			 System.out.println("IO���󣺶�д����ʧ��");
	         e.printStackTrace();
		}
		return false;
	}
	
	
	/**
	 * �Թ���ģ�ͽ��������Լ��
	 * @param project Ҫ���Ĺ���ģ�͵Ĺ���
	 * @return ����������������б�
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
						error.description="\"����\"����: û��\"�\"";
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
						warning.description="����δ����Դģ�͹���";
						warning.resource=project.getName();
						otherProblemList.add(warning);
					}
					if(!isOrgModelRelated()){
						newpmbe.validator.Warning warning=new newpmbe.validator.Warning();
						warning.path=((IFile)files[i]).getFullPath().removeFileExtension().addFileExtension("process_diagram");
						warning.description="����δ����֯ģ�͹���";
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
	 * ������ϲ�Ʒ��ͼ�ļ�
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
					error.description="��Ʒ����δ����";
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
						error.description="��ϲ�ƷΪ��";
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
					error.description="��ϲ�ƷΪ��";
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
					error.description="��Ӧ���������";
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
					error.description="��������Ϊ�������";
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
	 *���������ļ��������������Թ��������м�� 
	 * @param file ��Ҫ�����Ĺ��������ļ�
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
	 * ��ģ��Ԫ�ؽ��������Լ��
	 * @param element��  ģ��Ԫ��
	 * @param file��  ģ��Ԫ�����ڵ��ļ�
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
				error.description="��Ʒ����δ����";
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
				error.description="��Ӧ���������";
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
				error.description="��������Ϊ�������";
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
				error.description="���Ӳ��ʵ�";
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
				error.description="��Ʒ����δ����";
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
				error.description="���Ӳ��ʵ�";
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
					error.description="��ϲ�ƷΪ��";
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
				error.description="��ϲ�ƷΪ��";
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
				error.description="�����δ����";
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
				error.description="���Ӳ��ʵ�";
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
					error.description="δ���ɲ�Ʒ";
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
					error.description="û�������Ʒ";
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
				//������˹��������Ҫ����Ƿ����ɫ����
				if(type.equals("normalActivities")||type.equals("manualBatchActivities")){
					if(!isRoleAssigned(assFlows, file)){
						newpmbe.validator.Error error=new newpmbe.validator.Error();
						error.path=file.getFullPath().removeFileExtension().addFileExtension("process_diagram");
						error.description="δ�����ɫ";
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
						error.description="δ�������";
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
				error.description="�����δ����";
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
					warning.description="δ������ϻ";
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
					error.description="��ϻΪ��";
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
				error.description="��ϻΪ��";
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
				error.description="ʱ������δ����";
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
				error.description="���Ӳ��ʵ�";
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
				error.description="��Դû������";
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
				error.description="��Դ����δ����";
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
					error.description="û�����ӵ��";
					error.name="������";
				}
				if(type.equals("inOrs")){
					error.description="û�����ӵ��";
					error.name="�����";
				}
				else if(type.equals("outAnds")){
					error.description="û�����ӵ���Ʒ";
					error.name="�����";
				}
				else if(type.equals("outOrs")){
					error.description="û�����ӵ���Ʒ";
					error.name="�����";
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
						error.description="û�в�Ʒ��������";
						error.name="������";
					}
					if(type.equals("inOrs")){
						error.description="û�в�Ʒ��������";
						error.name="�����";
					}
					else if(type.equals("outAnds")){
						error.description="û�л��������";
						error.name="�����";
					}
					else if(type.equals("outOrs")){
						error.description="û�л��������";
						error.name="�����";
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
	 * �ж�һ������ͼ���Ʒͼ�Ƿ�Ϊ�գ�����ͼ��Ϊ�յ�������ͼ��������һ�����
	 * ��Ʒͼ��Ϊ�յ����������ٰ���һ����Ʒ��
	 * @param file��Ҫ�жϵĹ���ͼ���Ʒͼ�ļ�
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
	
	//�ж�һ���˹���Ƿ񱻷����˽�ɫ
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
			return "δ�����ĵ�";
		if(type.equals("artifacts"))
			return "δ������Ʒ";
		if(type.equals("others"))
			return "δ����������Ʒ";
		if(type.equals("forms"))
			return "δ������";
		if(type.equals("messages"))
			return "δ������Ϣ";
		if(type.equals("productPackages"))
			return "δ������ϲ�Ʒ";
		if(type.equals("normalActivities"))
			return "δ�����";
		if(type.equals("autoActivities"))
			return "δ�����Զ��";
		if(type.equals("manualBatchActivities"))
			return "δ�����ֶ�������";
		if(type.equals("autoBatchActivities"))
			return "δ�����Զ�������";
		if(type.equals("compActivities"))
			return "δ������ϻ";
		if(type.equals("clocks"))
			return "δ����ʱ��";
		if(type.equals("inAnds"))
			return "������";
		if(type.equals("inOrs"))
			return "�����";
		if(type.equals("outAnds"))
			return "�����";
		if(type.equals("outOrs"))
			return "�����";
		if(type.equals("roles"))
			return "δ������ɫ";
		if(type.equals("machineTypes"))
			return "δ�����豸����";
		if(type.equals("locationTypes"))
			return "δ������������";
		if(type.equals("toolTypes"))
			return "δ������������";
		if(type.equals("resourceGroupTypes"))
			return "δ������֯����";
		return null;
	}
	
}
