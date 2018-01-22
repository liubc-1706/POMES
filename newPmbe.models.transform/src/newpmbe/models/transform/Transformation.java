package newpmbe.models.transform;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import newpmbe.models.transform.elements.*;
import newpmbe.models.transform.elements.Process;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import vpml.organizationpackage.EMOResourceGroupType;
import vpml.processpackage.EMPArtifact;
import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPBatchActivity;
import vpml.processpackage.EMPClock;
import vpml.processpackage.EMPClockFlow;
import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPDocument;
import vpml.processpackage.EMPInAnd;
import vpml.processpackage.EMPInOr;
import vpml.processpackage.EMPNormalActivity;
import vpml.processpackage.EMPOther;
import vpml.processpackage.EMPOutAnd;
import vpml.processpackage.EMPOutOr;
import vpml.processpackage.EMPProduct;
import vpml.processpackage.EMPProductPackage;
import vpml.processpackage.EMPRefFlow;
import vpml.resourcepackage.EMRBasicResourceType;
import vpml.resourcepackage.EMRRole;

public class Transformation {
	private  PMBEElementFactory factory;	//factory for creating PMBE elements
	private List processes;			//processes for PMBE
	private newpmbe.models.transform.elements.Resource resource;		//resource for PMBE, only one Resource element defined for a process model
	private Element resources;		//Pmbe resources which is used for assembling all the resource object;
	private ProcessRegister processRegister;
	public String storePath;    //转换后模型的存储路径
	ResourceSet rsSet=new ResourceSetImpl();
	
	public Transformation(){
		factory=new PMBEElementFactory();	
		processes=new ArrayList();
		resource=new newpmbe.models.transform.elements.Resource();
		resources=resource.getResources();
		resource.setID(resource.getOID().getText());
		processRegister=new ProcessRegister();
		
	}
	
	
	/**
	 * parse process file for IPRO, and transfer it into PMBE process file
	 * note the function could be nestedly called.
	 * @param file : process file to be parsed
	 */
	public void processFileParse(File file,String PID){
		URI fileURI= URI.createFileURI(file.getPath());
		org.eclipse.emf.ecore.resource.Resource rs = rsSet.getResource(fileURI, true);
		EMPDiagram empModel=(EMPDiagram)rs.getContents().get(0);
		
		//Element root=XMLParser.parser(file).getRootElement();
		Process process=(Process)factory.createPMBEElement("PROCESS");
		Resource resource=(Resource)factory.createPMBEElement("RESOURCE");
		Element products=process.getProducts();
		Element activities=process.getActivities();
		Element conditionals=process.getConditionals();
		Element miscellaneas=process.getMiscellaneas();
		Element informations=process.getInformations();
		Element associations=process.getAssociations();
		Element timerConnections=process.getTimerConnections();
		Element references=process.getReferences();
		
		ProcessEntity processEntity=new ProcessEntity();
		processEntity.setPath(file.getAbsolutePath().replace('\\', '/'));	//路径字符串统一格式
		processEntity.setProcessID(process.getOID().getText());
		
		if(PID!=null){
			process.setOID(PID);
			process.setName(file.getName().substring(0, file.getName().lastIndexOf(".")));
		}
		process.getDistribution().setID(process.getDistribution().getOID().getText());
		process.setID(process.getOID().getText());
		
		
		List PMBEDocumentList=new ArrayList();	//to easily get the product identified by the dataflow through index
		List PMBEArtifactList=new ArrayList();
		List PMBEOtherList=new ArrayList();
		List PMBEProductPackageList=new ArrayList();
		List PMBENormalActList=new ArrayList();
		List PMBEBatchActList=new ArrayList();
		List PMBECompActList=new ArrayList();
		List PMBEBasicRSTypeList=new ArrayList();
		List PMBERoleList=new ArrayList();
		List PMBERSGroupList=new ArrayList();	//?
		List PMBETeamList=new ArrayList();	//?
		List PMBEInAndList=new ArrayList();
		List PMBEInOrList=new ArrayList();
		List PMBEOutAndList=new ArrayList();
		List PMBEOutOrList=new ArrayList();
		List PMBEClockList=new ArrayList();

		List documents=empModel.getDocuments();
		List artifacts=empModel.getArtifacts();
		List others=empModel.getOthers();
		List productPackages=empModel.getProductPackages();
		List batchActivities=empModel.getManualBatchActivities();
		List normalActivities=empModel.getNormalActivities();
		List compActivities=empModel.getCompActivities();
		List dataFlows=empModel.getDataFlows();
		List refFlows=empModel.getRefFlows();
		List assFlows=empModel.getAssFlows();
		List clockFlows=empModel.getClockFlows();
		List inOrs=empModel.getInOrs();
		List inAnds=empModel.getInAnds();
		List outOrs=empModel.getOutOrs();
		List outAnds=empModel.getOutAnds();
		List basicResources=empModel.getMachineTypes();
		//List teams=root.getChildren("team");
		List roles=empModel.getRoles();
		List resourceGroups=empModel.getResourceGroupTypes();
		List clocks=empModel.getClocks();	
		
		for(Iterator iter = documents.iterator(); iter.hasNext();){
			Product product=(Product)factory.createPMBEElement("PRODUCT");
			EMPDocument doc=(EMPDocument)iter.next();

			String name=doc.getName();
			String description=doc.getDescription();
			String proID=doc.getId();
			product.setName(name);
			product.setDescription(description);
			product.setProId(proID);
			product.setType("prDocumentType");
			product.setID(product.getOID().getText());
			
			//set default attributes
			product.setDocType("0");
			product.setProAmount("1");
			product.setProState("0");
			product.getIoMode().setIOType("0");  //set IOType as not source
			product.getIoMode().setUnit("2");
			product.getIoMode().setInitialValue("0");
			product.getIoMode().setPeriod("0");
			product.getIoMode().getDistribution().setFunction("1");
			product.getIoMode().getDistribution().setArgument1("1");
			product.getIoMode().getDistribution().setArgument2("0");
			
			PMBEDocumentList.add(product);
			products.addContent(product.getXMLElement());
		}
		
		processEntity.setPMBEDocumentList(PMBEDocumentList);
		
		for(Iterator iter = artifacts.iterator(); iter.hasNext();){
			Product product=(Product)factory.createPMBEElement("PRODUCT");
			EMPArtifact art=(EMPArtifact)iter.next();
			String name=art.getName();
			String description=art.getDescription();
			String proID=art.getId();
			product.setName(name);
			product.setDescription(description);
			product.setProId(proID);
			product.setType("prArtifactType");
			product.setID(product.getOID().getText());
			
			
			//set default attributes
			product.setDocType("0");
			product.setProAmount("1");
			product.setProState("0");
			product.getIoMode().setIOType("0");  //set IOType as not source
			product.getIoMode().setUnit("2");
			product.getIoMode().setInitialValue("0");
			product.getIoMode().setPeriod("0");
			product.getIoMode().getDistribution().setFunction("1");
			product.getIoMode().getDistribution().setArgument1("1");
			product.getIoMode().getDistribution().setArgument2("0");
			
			PMBEArtifactList.add(product);
			products.addContent(product.getXMLElement());
		}
		
		processEntity.setPMBEArtifactList(PMBEArtifactList);
		
		for(Iterator iter = others.iterator(); iter.hasNext();){
			Product product=(Product)factory.createPMBEElement("PRODUCT");
			EMPOther oth=(EMPOther)iter.next();
			String name=oth.getName();
			String description=oth.getDescription();
			String proID=oth.getId();
			product.setName(name);
			product.setDescription(description);
			product.setProId(proID);
			product.setType("prFolderType");
			product.setID(product.getOID().getText());
			
			
			//set default attributes
			product.setDocType("0");
			product.setProAmount("1");
			product.setProState("0");
			product.getIoMode().setIOType("0");  //set IOType as not source
			product.getIoMode().setUnit("2");
			product.getIoMode().setInitialValue("0");
			product.getIoMode().setPeriod("0");
			product.getIoMode().getDistribution().setFunction("1");
			product.getIoMode().getDistribution().setArgument1("1");
			product.getIoMode().getDistribution().setArgument2("0");
			
			PMBEOtherList.add(product);
			products.addContent(product.getXMLElement());
		}
		
		processEntity.setPMBEOtherList(PMBEOtherList);
		
		//Product package is waited to be added
		
		
		for(Iterator iter = productPackages.iterator(); iter.hasNext();){
			Product product=(Product)factory.createPMBEElement("PRODUCT");
			EMPProductPackage prop=(EMPProductPackage)iter.next();
			String name=prop.getName();
			String description=prop.getDescription();
			String proID=prop.getId();
			product.setName(name);
			product.setDescription(description);
			product.setProId(proID);
			product.setType("prCompositeProductType");
			product.setID(product.getOID().getText());
			
			
			//set default attributes
			product.setProAmount("-1#.QNAN");
			product.setProState("3878640");
			product.getIoMode().setIOType("3");  //set IOType as not source
			product.getIoMode().setUnit("0");
			product.getIoMode().setInitialValue("0");
			product.getIoMode().setPeriod("0");
			product.getIoMode().getDistribution().setFunction("1026");
			product.getIoMode().getDistribution().setArgument1("-1.#QNAN");
			product.getIoMode().getDistribution().setArgument2("6.79834e-321");
			
		//	product.product.addContent(subProducts);                         //location ?????????????
			//PMBEOtherList.add(product);
			File subProductFile=new File(file.getParentFile().getAbsolutePath()+"/"+name+"/"+name+".product_diagram");
			List subproductList=productFileParse(subProductFile);
			for(int i=0;i<subproductList.size();i++){
				product.getSubProducts().addContent(((Product)subproductList.get(i)).getXMLElement());
			}
			PMBEProductPackageList.add(product);
			products.addContent(product.getXMLElement());
		}
		
		processEntity.setPMBEProductPackageList(PMBEProductPackageList);
		
		
		//以下为逻辑连接符部分的解析
		for(Iterator iter=inAnds.iterator();iter.hasNext();){
			Conditional conditional=(Conditional)factory.createPMBEElement("CONDITIONAL");
			EMPInAnd ina=(EMPInAnd)iter.next();
			String name=ina.getName();
			String description=ina.getDescription();
			conditional.setName(name);
			conditional.setDescription(description);
			conditional.setType("prInputAndType");
			conditional.setID(conditional.getOID().getText());
			PMBEInAndList.add(conditional);
			conditionals.addContent(conditional.getXMLElement());
		}
		
		processEntity.setPMBEInAndList(PMBEInAndList);
		
		for(Iterator iter=inOrs.iterator();iter.hasNext();){
			Conditional conditional=(Conditional)factory.createPMBEElement("CONDITIONAL");
			EMPInOr ino=(EMPInOr)iter.next();
			String name=ino.getName();
			String description=ino.getDescription();
			conditional.setName(name);
			conditional.setDescription(description);
			conditional.setType("prInputOrType");
			conditional.setID(conditional.getOID().getText());
			PMBEInOrList.add(conditional);
			conditionals.addContent(conditional.getXMLElement());
		}
		
		processEntity.setPMBEInOrList(PMBEInOrList);
		
		for(Iterator iter=outAnds.iterator();iter.hasNext();){
			Conditional conditional=(Conditional)factory.createPMBEElement("CONDITIONAL");
			EMPOutAnd outa=(EMPOutAnd)iter.next();
			String name=outa.getName();
			String description=outa.getDescription();
			conditional.setName(name);
			conditional.setDescription(description);
			conditional.setType("prOutputAndType");
			conditional.setID(conditional.getOID().getText());
			PMBEOutAndList.add(conditional);
			conditionals.addContent(conditional.getXMLElement());
		}
		
		processEntity.setPMBEOutAndList(PMBEOutAndList);
		
		for(Iterator iter=outOrs.iterator();iter.hasNext();){
			Conditional conditional=(Conditional)factory.createPMBEElement("CONDITIONAL");
			EMPOutOr outo=(EMPOutOr)iter.next();
			String name=outo.getName();
			String description=outo.getDescription();
			conditional.setName(name);
			conditional.setDescription(description);
			conditional.setType("prOutputOrType");
			conditional.setID(conditional.getOID().getText());
			PMBEOutOrList.add(conditional);
			conditionals.addContent(conditional.getXMLElement());
		}
		
		processEntity.setPMBEOutOrList(PMBEOutOrList);
		
		//时钟的解析
		for(Iterator iter=clocks.iterator();iter.hasNext();){
			Miscellanea clock=(Miscellanea)factory.createPMBEElement("MISCELLANEA");
			EMPClock clo=(EMPClock)iter.next();
			String name=clo.getName();
			String description=clo.getDescription();
			clock.setName(name);
			clock.setDescription(description);
			clock.setType("prTimerType");
			clock.setID(clock.getOID().getText());
			clock.setStartTime("0");
			clock.setEndTime("0");
			clock.setTimeUnit("2");
			clock.setInterval("1");
			clock.setIntervalUnit("2");
			clock.setRestartPeriod("0");
			clock.setWaitforInput("1");
			clock.setWaitforRes("1");
			PMBEClockList.add(clock);
			miscellaneas.addContent(clock.getXMLElement());
		}
		
		processEntity.setPMBEClockList(PMBEClockList);
		
		
		// basic-resource type in IPRO is mapped to rsMachineType in PMBE
		for(Iterator iter = basicResources.iterator(); iter.hasNext();){
			RSObject rsobject=(RSObject)factory.createPMBEElement("RSOBJECT");
			EMRBasicResourceType basr=(EMRBasicResourceType)iter.next();
			String name=basr.getName();
			String costUnit=basr.getCostPerUnit().toString();
			String totalAmount=basr.getTotalAmount().toString();
			//there are no usageAmount/efficiency/effort attributes for the moment, but they are needed 
			//so a default value is setted
			//String usageAmount=element.getAttributeValue("usageAmount");
													
			rsobject.setName(name);
			rsobject.setCostUnit(costUnit);
			rsobject.setUsageAmount("1");//default value
			rsobject.setTotalAmount(totalAmount);
			rsobject.setEfficiency("0");
			rsobject.setEffort("1");
			rsobject.setType("rsMachineType");
			rsobject.setID(rsobject.getOID().getText());
			PMBEBasicRSTypeList.add(rsobject);
			resources.addContent(rsobject.getXMLElement());
			
		}
		
		processEntity.setPMBEBasicRSTypeList(PMBEBasicRSTypeList);
		
		//role type in IPRO is mapped to RsRoleType in PMBE
		for(Iterator iter = roles.iterator(); iter.hasNext();){
			RSObject rsobject=(RSObject)factory.createPMBEElement("RSOBJECT");
			EMRRole rol=(EMRRole)iter.next();
			String name=rol.getName();
			String costUnit=rol.getCostPerUnit().toString();
			String totalAmount=rol.getTotalAmount().toString();
			//there are no usageAmount/efficiency/effort attributes for the moment, but they are needed 
			//so a default value is setted
			//String usageAmount=element.getAttributeValue("usageAmount");
													
			rsobject.setName(name);
			rsobject.setCostUnit(costUnit);
			rsobject.setUsageAmount("1");//default value
			rsobject.setTotalAmount(totalAmount);
			rsobject.setEfficiency("0");
			rsobject.setEffort("1");
			rsobject.setType("rsRole");
			rsobject.setID(rsobject.getOID().getText());
			PMBERoleList.add(rsobject);
			resources.addContent(rsobject.getXMLElement());
			
		}
		
		processEntity.setPMBERoleList(PMBERoleList);
		
		//????????????????????????????????????????????????????
		/*for(Iterator iter = resourceGroups.iterator(); iter.hasNext();){
			RSObject rsobject=(RSObject)factory.createPMBEElement("RSOBJECT");
			EMOResourceGroupType resg=(EMOResourceGroupType)iter.next();
			String name=resg.getName();
			String costUnit=resgelement.getAttributeValue("priceUnit");
			String totalAmount=resg.element.getAttributeValue("totalCount");
			//there are no usageAmount/efficiency/effort attributes for the moment, but they are needed 
			//so a default value is setted
			//String usageAmount=element.getAttributeValue("usageAmount");
													
			rsobject.setName(name);
			rsobject.setCostUnit(costUnit);
			rsobject.setUsageAmount("1");//default value
			rsobject.setTotalAmount(totalAmount);
			rsobject.setEfficiency("0");
			rsobject.setEffort("1");
			rsobject.setType("rsMachineType");
			rsobject.setID(rsobject.getOID().getText());
			PMBERSGroupList.add(rsobject);
			resources.addContent(rsobject.getXMLElement());
			
		}
		
		processEntity.setPMBERSGroupList(PMBERSGroupList);*/
		
		//??????????????????????????????????????
		/*for(Iterator iter = teams.iterator(); iter.hasNext();){
			RSObject rsobject=(RSObject)factory.createPMBEElement("RSOBJECT");
			Element element=(Element)iter.next();
			String name=element.getAttributeValue("name");
			String costUnit=element.getAttributeValue("priceUnit");
			String totalAmount=element.getAttributeValue("totalCount");
			//there are no usageAmount/efficiency/effort attributes for the moment, but they are needed 
			//so a default value is setted
			//String usageAmount=element.getAttributeValue("usageAmount");
													
			rsobject.setName(name);
			rsobject.setCostUnit(costUnit);
			rsobject.setUsageAmount("1");//default value
			rsobject.setTotalAmount(totalAmount);
			rsobject.setEfficiency("0");
			rsobject.setEffort("1");
			rsobject.setType("rsRole");
			rsobject.setID(rsobject.getOID().getText());
			PMBETeamList.add(rsobject);
			resources.addContent(rsobject.getXMLElement());
			
		}*/
		
		//processEntity.setPMBETeamList(PMBETeamList);
		
		//以下为活动部分解析,包括一般活动/批处理活动/组合活动
		for(Iterator iter = batchActivities.iterator(); iter.hasNext();){
			Activity activity=(Activity)factory.createPMBEElement("ACTIVITY");
			EMPBatchActivity bata=(EMPBatchActivity)iter.next();
			String name=bata.getName();
			String description=bata.getDescription();
			String actID=bata.getId();
			activity.setName(name);
			activity.setDescription(description);
			activity.setActId(actID);
			activity.setType("prBatActivityType");
			activity.setID(activity.getOID().getText());
			PMBEBatchActList.add(activity);
			activities.addContent(activity.getXMLElement());
		}
		
		processEntity.setPMBEBatchActList(PMBEBatchActList);
		
		for(Iterator iter = normalActivities.iterator(); iter.hasNext();){
			Activity activity=(Activity)factory.createPMBEElement("ACTIVITY");
			EMPNormalActivity nora=(EMPNormalActivity)iter.next();
			String name=nora.getName();
			String description=nora.getDescription();
			String actID=nora.getId();
			activity.setName(name);
			activity.setDescription(description);
			activity.setActId(actID);
			activity.setType("prManualActivityType");
			activity.setID(activity.getOID().getText());
			PMBENormalActList.add(activity);
		
			activities.addContent(activity.getXMLElement());
		}
		
		processEntity.setPMBENormalActList(PMBENormalActList);
		
		//comp activity is to be added
		for(Iterator iter = compActivities.iterator(); iter.hasNext();){
			Activity activity=(Activity)factory.createPMBEElement("ACTIVITY");
			EMPCompActivity coma=(EMPCompActivity)iter.next();
			String name=coma.getName();
			String description=coma.getDescription();
			String actID=coma.getId();
			activity.setName(name);
			activity.setDescription(description);
			activity.setActId(actID);
			activity.setType("prProcessLinkType");
			activity.setID(activity.getOID().getText());
			
			String subProcessPath=storePath+"/PR"+activity.getOID().getText()+".xml";
			activity.setProcessPathName(subProcessPath.replace('/', '\\'));
			PMBECompActList.add(activity);
			activities.addContent(activity.getXMLElement());
		}
		
		processEntity.setPMBECompActList(PMBECompActList);
		processRegister.addProcess(processEntity);
		
		
		//parse sub-process file
		for(int i=0;i<compActivities.size();i++){
			Element element=(Element)compActivities.get(i);
			String name=element.getAttributeValue("name");
			File subProcess=new File(file.getParentFile().getAbsolutePath()+"/"+name+"/"+name+".process_diagram");
			processFileParse(subProcess,((Activity)PMBECompActList.get(i)).getOID().getText());
		}
		
		//whether team and resourceGroup in IPRO is needed to be parsed;
		
		//时钟流的解析			——————————————————————未考虑时钟与组合活动的连接
		for(Iterator iter=clockFlows.iterator();iter.hasNext();){
			TimerConnection timerConn=(TimerConnection)factory.createPMBEElement("TIMERCONNECTION");
			EMPClockFlow clof=(EMPClockFlow)iter.next();
			String name=clof.getName();
			String description=clof.getDescription();
			String act=clof.getActivity().getId();
			String clock=clof.getClock().getId();
			timerConn.setType("prTimerConnType");
			timerConn.setID(timerConn.getOID().getText());
			if(clock!=null){
				String clockId=clock.substring(clock.lastIndexOf(".")+1);
				String startPoint=((Miscellanea)PMBEClockList.get(Integer.valueOf(clockId))).getOID().getText();
				timerConn.setStartPointID(startPoint);
				timerConn.setTimerID(startPoint);
			}
			if(act!=null){
				String actType=act.substring(act.lastIndexOf("@")+1,act.lastIndexOf("."));
				String actId=act.substring(act.lastIndexOf(".")+1);
				String endPoint=null;
				if(actType.equals("normalActivities")){
					endPoint=((Activity)PMBENormalActList.get(Integer.valueOf(actId))).getOID().getText();
				}
				else if(actType.equals("manualBatchActivities")){
					endPoint=((Activity)PMBEBatchActList.get(Integer.valueOf(actId))).getOID().getText();
				}
				timerConn.setEndPointID(endPoint);
				timerConn.setActivityID(endPoint);
			}
			timerConnections.addContent(timerConn.getXMLElement());
		}
		
		//关联流的解析    考虑角色/资源与非组合活动之间的连接
		for(Iterator iter = assFlows.iterator(); iter.hasNext();){
			Association ass=(Association)factory.createPMBEElement("ASSOCIATION");
			EMPAssFlow assf=(EMPAssFlow)iter.next();
			String name=assf.getName();
			String description=assf.getDescription();
			String act=assf.getNormalActivity().getId();
			String role=assf.getRole().getId();
			//String team=element.getAttributeValue("team");
			String rsGroup=assf.getResourceGroupType().getId();
			String rsType=assf.getMachineType().getId();
			
			ass.setName(name);
			ass.setDescription(description);
			ass.setType("prAssociationType");
			ass.setID(ass.getOID().getText());
			
			String startPoint=null;
			String endPoint=null;
			
			if(role!=null){
				String roleId=role.substring(role.lastIndexOf(".")+1);
				startPoint=((RSObject)PMBERoleList.get(Integer.valueOf(roleId))).getOID().getText();
				ass.setStartPointID(startPoint);
				ass.setStartPoint(startPoint);
			}
			
			/*else if(team!=null){
				String teamId=team.substring(team.lastIndexOf(".")+1);
				startPoint=((RSObject)PMBETeamList.get(Integer.valueOf(teamId))).getOID().getText();
				ass.setStartPointID(startPoint);
				ass.setStartPoint(startPoint);
			}*/
			
			else if (rsType!=null){
				String rsTypeId=rsType.substring(rsType.lastIndexOf(".")+1);
				startPoint=((RSObject)PMBEBasicRSTypeList.get(Integer.valueOf(rsTypeId))).getOID().getText();
				ass.setStartPointID(startPoint);
				ass.setStartPoint(startPoint);
			}
			
			else if(rsGroup!=null){
				String rsGroupId=rsGroup.substring(rsGroup.lastIndexOf(".")+1);
				startPoint=((RSObject)PMBERSGroupList.get(Integer.valueOf(rsGroupId))).getOID().getText();
				ass.setStartPointID(startPoint);
				ass.setStartPoint(startPoint);
			}
			
			if(act!=null){
				String actId=act.substring(act.lastIndexOf(".")+1);
				String actType=act.substring(act.lastIndexOf("@")+1,act.lastIndexOf("."));
				if(actType.equals("normalActivities")){
					endPoint=((Activity)PMBENormalActList.get(Integer.valueOf(actId))).getOID().getText();
				}
				else if(actType.equals("manualBatchActivities")){
					endPoint=((Activity)PMBEBatchActList.get(Integer.valueOf(actId))).getOID().getText();
				}
				ass.setEndPointID(endPoint);
				ass.setEndPoint(endPoint);
			}
			
			

			ass.setUsageAmount("0");
			associations.addContent(ass.getXMLElement());
			
		}
		
		for(Iterator iter=refFlows.iterator();iter.hasNext();){
			Reference flow=(Reference)factory.createPMBEElement("REFERENCE");
			EMPRefFlow reff=(EMPRefFlow)iter.next();
			String name=reff.getName();
			String description=reff.getDescription();
			
			flow.setName(name);
			flow.setDescription(description);
			flow.setType("prReferenceType");
			flow.setID(flow.getOID().getText());
			
			String act=reff.getActivity().getId();
			String prod=reff.getProduct().getId();
			
			String actType=act.substring(act.lastIndexOf("@")+1,act.lastIndexOf("."));
			String actID=act.substring(act.lastIndexOf(".")+1);
			String prodType=prod.substring(prod.lastIndexOf("@")+1,prod.lastIndexOf("."));
			String prodID=prod.substring(prod.lastIndexOf(".")+1);
			
			String startPoint=" ";
			String endPoint=" ";
			
			if(actType.equals("normalActivities"))
				endPoint=((Activity)PMBENormalActList.get(Integer.valueOf(actID))).getOID().getText();
			else if(actType.equals("manualBatchActivities"))
				endPoint=((Activity)PMBEBatchActList.get(Integer.valueOf(actID))).getOID().getText();
			else if(actType.equals("compActivities"))
				endPoint=((Activity)PMBECompActList.get(Integer.valueOf(actID))).getOID().getText();
			
			if(prodType.equals("documents"))
				startPoint=((Product)PMBEDocumentList.get(Integer.valueOf(prodID))).getOID().getText();
			else if(prodType.equals("artifacts"))
				startPoint=((Product)PMBEArtifactList.get(Integer.valueOf(prodID))).getOID().getText();
			else if(prodType.equals("others"))
				startPoint=((Product)PMBEOtherList.get(Integer.valueOf(prodID))).getOID().getText();
			else if(prodType.equals("productPackages"))
				startPoint=((Product)PMBEProductPackageList.get(Integer.valueOf(prodID))).getOID().getText();
			
			flow.setStartPoint(startPoint);
			flow.setStartPointID(startPoint);
			flow.setEndPoint(endPoint);
			flow.setEndPointID(endPoint);
			
			references.addContent(flow.getXMLElement());
		}
		
		
		for(Iterator iter = dataFlows.iterator(); iter.hasNext();){
			Informationflow flow=(Informationflow)factory.createPMBEElement("INFORMATIONFLOW");
			EMPDataFlow datf=(EMPDataFlow)iter.next();
			String name=datf.getName();
			String description=datf.getDescription();
			flow.setName(name);
			flow.setDescription(description);
			flow.setType("prInformationflowType");
			flow.setID(flow.getOID().getText());
			
			String sourceId="";
			String targetId="";
			if(datf.getTargetActivity()!=null){
				targetId=datf.getTargetActivity().getId();
			}
			if(datf.getSourceActivity()!=null){
				sourceId=datf.getSourceActivity().getId();
			}
			if(datf.getSourceProduct()!=null){
				sourceId=datf.getSourceProduct().getId();
			}
			if(datf.getTargetProduct()!=null){
				targetId=datf.getTargetProduct().getId();
			}
			if(datf.getSourceInAnd()!=null){
				sourceId=datf.getSourceInAnd().getId();
			}
			if(datf.getTargetInAnd()!=null){
				targetId=datf.getTargetInAnd().getId();
			}
			if(datf.getSourceInOr()!=null){
				sourceId=datf.getSourceInOr().getId();
			}
			if(datf.getTargetInOr()!=null){
				targetId=datf.getTargetInOr().getId();
			}
			if(datf.getSourceOutAnd()!=null){
				sourceId=datf.getSourceOutAnd().getId();
			}
			if(datf.getTargetOutAnd()!=null){
				targetId=datf.getTargetOutAnd().getId();
			}
			if(datf.getSourceOutOr()!=null){
				sourceId=datf.getSourceOutOr().getId();
			}
			if(datf.getTargetOutOr()!=null){
				targetId=datf.getTargetOutOr().getId();
			}
			
			
			/*if(targetAct!=null){
				String targetId=targetAct.substring(targetAct.lastIndexOf(".")+1);
				String targetType=targetAct.substring(targetAct.lastIndexOf("@")+1,targetAct.lastIndexOf("."));
				if(targetType.equals("normalActivities"))
					endPoint=((Activity)PMBENormalActList.get(Integer.valueOf(targetId))).getOID().getText();
				else if(targetType.equals("manualBatchActivities"))
					endPoint=((Activity)PMBEBatchActList.get(Integer.valueOf(targetId))).getOID().getText();
				else if(targetType.equals("compActivities"))
					endPoint=((Activity)PMBECompActList.get(Integer.valueOf(targetId))).getOID().getText();
			}
			
			if(sourceAct!=null){
				String sourceId=sourceAct.substring(sourceAct.lastIndexOf(".")+1);
				String sourceType=sourceAct.substring(sourceAct.lastIndexOf("@")+1,sourceAct.lastIndexOf("."));
				if(sourceType.equals("normalActivities"))
					startPoint=((Activity)PMBENormalActList.get(Integer.valueOf(sourceId))).getOID().getText();
				else if(sourceType.equals("manualBatchActivities"))
					startPoint=((Activity)PMBEBatchActList.get(Integer.valueOf(sourceId))).getOID().getText();
				else if(sourceType.equals("compActivities"))
					startPoint=((Activity)PMBECompActList.get(Integer.valueOf(sourceId))).getOID().getText();
			}
			
			if(sourceProd!=null){
				String sourceId=sourceProd.substring(sourceProd.lastIndexOf(".")+1);
				String sourceType=sourceProd.substring(sourceProd.lastIndexOf("@")+1,sourceProd.lastIndexOf("."));
				if(sourceType.equals("documents"))
					startPoint=((Product)PMBEDocumentList.get(Integer.valueOf(sourceId))).getOID().getText();
				else if(sourceType.equals("artifacts"))
					startPoint=((Product)PMBEArtifactList.get(Integer.valueOf(sourceId))).getOID().getText();
				else if(sourceType.equals("others"))
					startPoint=((Product)PMBEOtherList.get(Integer.valueOf(sourceId))).getOID().getText();
				else if(sourceType.equals("productPackages"))
					startPoint=((Product)PMBEProductPackageList.get(Integer.valueOf(sourceId))).getOID().getText();
			}
			
			if(targetProd!=null){
				String targetId=targetProd.substring(targetProd.lastIndexOf(".")+1);
				String targetType=targetProd.substring(targetProd.lastIndexOf("@")+1,targetProd.lastIndexOf("."));
				if(targetType.equals("documents"))
					endPoint=((Product)PMBEDocumentList.get(Integer.valueOf(targetId))).getOID().getText();
				else if(targetType.equals("artifacts"))
					endPoint=((Product)PMBEArtifactList.get(Integer.valueOf(targetId))).getOID().getText();
				else if(targetType.equals("others"))
					endPoint=((Product)PMBEOtherList.get(Integer.valueOf(targetId))).getOID().getText();
				else if(targetType.equals("productPackages"))
					endPoint=((Product)PMBEProductPackageList.get(Integer.valueOf(targetId))).getOID().getText();
			}
			
			if(sourceInAnd!=null){
				String sourceID=sourceInAnd.substring(sourceInAnd.lastIndexOf(".")+1);
				startPoint=((Conditional)PMBEInAndList.get(Integer.valueOf(sourceID))).getOID().getText();
				
			}
			if(targetInAnd!=null){
				String targetID=targetInAnd.substring(targetInAnd.lastIndexOf(".")+1);
				endPoint=((Conditional)PMBEInAndList.get(Integer.valueOf(targetID))).getOID().getText();
			}
			if(sourceInOr!=null){
				String sourceID=sourceInOr.substring(sourceInOr.lastIndexOf(".")+1);
				startPoint=((Conditional)PMBEInOrList.get(Integer.valueOf(sourceID))).getOID().getText();
			}
			if(targetInOr!=null){
				String targetID=targetInOr.substring(targetInOr.lastIndexOf(".")+1);
				endPoint=((Conditional)PMBEInOrList.get(Integer.valueOf(targetID))).getOID().getText();
			}
			if(sourceOutAnd!=null){
				String sourceID=sourceOutAnd.substring(sourceOutAnd.lastIndexOf(".")+1);
				startPoint=((Conditional)PMBEOutAndList.get(Integer.valueOf(sourceID))).getOID().getText();
			}
			if(targetOutAnd!=null){
				String targetID=targetOutAnd.substring(targetOutAnd.lastIndexOf(".")+1);
				endPoint=((Conditional)PMBEOutAndList.get(Integer.valueOf(targetID))).getOID().getText();
			}
			if(sourceOutOr!=null){
				String sourceID=sourceOutOr.substring(sourceOutOr.lastIndexOf(".")+1);
				startPoint=((Conditional)PMBEOutOrList.get(Integer.valueOf(sourceID))).getOID().getText();
			}
			if(targetOutOr!=null){
				String targetID=targetOutOr.substring(targetOutOr.lastIndexOf(".")+1);
				endPoint=((Conditional)PMBEOutOrList.get(Integer.valueOf(targetID))).getOID().getText();
			}
			
			if(targetProdElement!=null){
				endPoint=this.getIDByPath(targetProdElement.getAttributeValue("href"),file);
			}
			
			if(targetActElement!=null){
				endPoint=this.getIDByPath(targetActElement.getAttributeValue("href"), file);
			}
			*/
			flow.setStartPoint(sourceId);
			flow.setStartPointID(sourceId);
			flow.setEndPoint(targetId);
			flow.setEndPointID(targetId);
			informations.addContent(flow.getXMLElement());
			/*if(targetActElement!=null){
				String processID=this.getProcessID(targetActElement.getAttributeValue("href"), file);
				for(int i=0;i<processes.size();i++){
					Process p=(Process)processes.get(i);
					//processes.remove(p);
					if(p.getOID().getText().equals(processID)){
						Element ins=p.getInformations();
						ins.addContent(flow.getXMLElement());
						break;
					}
					//processes.add(p);
				}
			}
			
			else{
				informations.addContent(flow.getXMLElement());
			}*/
			
			//informations.addContent(flow.getXMLElement());
		}
		
		processes.add(process);
		
		/*
		Element pmbe=process.getXMLElement();
        Document doc = new Document(pmbe); //将根元素植入文档doc中
        Format format = Format.getCompactFormat();
        format.setEncoding("gb2312"); //设置xml文件的字符为gb2312
        format.setIndent("    "); //设置xml文件的缩进为4个空格
        XMLOutputter XMLOut = new XMLOutputter(format);//元素后换行一层元素缩四格 
        try {
			XMLOut.output(doc, new FileOutputStream("process.xml"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
	
	
	
	
	
	/**
	 * parse product file, called by processFileParse() while parsing productPackage element.
	 * @param file	: product file to be parsed
	 * @return
	 */
	public List productFileParse(File file){
		URI fileURI= URI.createFileURI(file.getPath());
		org.eclipse.emf.ecore.resource.Resource rs = rsSet.getResource(fileURI, true);
		EMPDiagram empModel=(EMPDiagram)rs.getContents().get(0);
		
		//Element root=XMLParser.parser(file).getRootElement();		
		List productList=new ArrayList();
		
		List documents=empModel.getDocuments();
		//root.getChildren("documents");
		List artifacts=empModel.getArtifacts();
		//root.getChildren("artifacts");
		List others=empModel.getOthers();
		//root.getChildren("others");
		List productPackages=empModel.getProductPackages();
		//root.getChildren("productPackages");
		
		for(Iterator iter = documents.iterator(); iter.hasNext();){
			Product product=(Product)factory.createPMBEElement("PRODUCT");
			EMPDocument doc=(EMPDocument)iter.next();
			String name=doc.getName();
			//element.getAttributeValue("name");
			String description=doc.getDescription();
			//element.getAttributeValue("description");
			String proID=doc.getId();
			//element.getAttributeValue("productID");
			product.setName(name);
			product.setDescription(description);
			product.setProId(proID);
			product.setType("prDocumentType");
			product.setID(product.getOID().getText());
			productList.add(product);
		}
		
		for(Iterator iter = artifacts.iterator(); iter.hasNext();){
			Product product=(Product)factory.createPMBEElement("PRODUCT");
			EMPArtifact art=(EMPArtifact)iter.next();
			String name=art.getName();
			//element.getAttributeValue("name");
			String description=art.getDescription();
			//element.getAttributeValue("description");
			String proID=art.getId();
			//element.getAttributeValue("productID");
			product.setName(name);
			product.setDescription(description);
			product.setProId(proID);
			product.setType("prArtifactType");
			product.setID(product.getOID().getText());
			productList.add(product);
		}
		
		for(Iterator iter = others.iterator(); iter.hasNext();){
			Product product=(Product)factory.createPMBEElement("PRODUCT");
			EMPOther oth=(EMPOther)iter.next();
			String name=oth.getName();
			//element.getAttributeValue("name");
			String description=oth.getDescription();
			//element.getAttributeValue("description");
			String proID=oth.getId();
			//element.getAttributeValue("productID");
			product.setName(name);
			product.setDescription(description);
			product.setProId(proID);
			product.setType("prFolderType");
			product.setID(product.getOID().getText());
			productList.add(product);
		}
		for(Iterator iter = productPackages.iterator(); iter.hasNext();){
			Product product=(Product)factory.createPMBEElement("PRODUCT");
			EMPProductPackage prop=(EMPProductPackage)iter.next();
			String name=prop.getName();
			//element.getAttributeValue("name");
			String description=prop.getDescription();
			//element.getAttributeValue("description");
			String proID=prop.getId();
			//element.getAttributeValue("productID");
			product.setName(name);
			product.setDescription(description);
			product.setProId(proID);
			product.setType("prCompositeProductType");
			product.setID(product.getOID().getText());
			File subProductFile=new File(file.getParentFile().getAbsolutePath()+"/"+name+"/"+name+".product");
			List subproductList=productFileParse(subProductFile);
			for(int i=0;i<subproductList.size();i++){
				product.getSubProducts().addContent(((Product)subproductList.get(i)).getXMLElement());
			}
			productList.add(product);
		}
		
		return productList;
	}
	
	
	public String getProcessID(String path,File currentFile){
		String filePath=getPath(currentFile,path);
		List list=processRegister.getProcessList();
		for(int i=0;i<list.size();i++){
			ProcessEntity process=(ProcessEntity)list.get(i);
			if(process.getPath().equals(filePath)){
				return process.getProcessID();
			}
		}
		return null;
	}
	
	public String getIDByPath(String path,File currentFile){
		String elementType=path.substring(path.lastIndexOf("@")+1,path.lastIndexOf("."));
		int elementID=Integer.valueOf(path.substring(path.lastIndexOf(".")+1));
		String filePath=getPath(currentFile,path);
		List list=processRegister.getProcessList();
		for(int i=0;i<list.size();i++){
			ProcessEntity process=(ProcessEntity)list.get(i);
			if(process.getPath().equals(filePath)){
				if(elementType.equals("documents"))
					return ((Product)process.getPMBEDocumentList().get(elementID)).getOID().getText();
				else if(elementType.equals("artifacts"))
					return ((Product)process.getPMBEArtifactList().get(elementID)).getOID().getText();
				else if(elementType.equals("others"))
					return ((Product)process.getPMBEOtherList().get(elementID)).getOID().getText();
				else if(elementType.equals("productPackages"))
					return ((Product)process.getPMBEProductPackageList().get(elementID)).getOID().getText();
				else if(elementType.equals("normalActivities"))
					return ((Activity)process.getPMBENormalActList().get(elementID)).getOID().getText();
				else if(elementType.equals("manualBatchActivities"))
					return ((Activity)process.getPMBEBatchActList().get(elementID)).getOID().getText();
				else if(elementType.equals("compActivities"))
					return ((Activity)process.getPMBECompActList().get(elementID)).getOID().getText();
				else if(elementType.equals("clocks"))
					return ((Miscellanea)process.getPMBEClockList().get(elementID)).getOID().getText();
				break;
			}
		}
		
		return null;
	}
	
	public String getPath(File currentFile,String path){
		String testPath=path.substring(0,path.lastIndexOf("#"));
		File testFile=currentFile.getParentFile();
		String s=testPath.substring(0,testPath.indexOf("/"));
		while(s.equals("..")){
			testFile=testFile.getParentFile();
			testPath=testPath.substring(testPath.indexOf("/")+1);
			if(testPath.indexOf("/")!=-1)
				s=testPath.substring(0,testPath.indexOf("/"));
			else
				break;
		}
		
		testPath=testFile.getAbsolutePath()+"/"+testPath;
		testPath=testPath.replace('\\', '/');
		return testPath;
	}
	
	
	
	/**
	 * generate the final process files for PMBE
	 * which are identified in the List "processes"
	 */
	public void generatePMBEModel(){
		for(int i=0;i<processes.size();i++){
			Process process=(Process)processes.get(i);
			Element pmbe=process.getXMLElement();
			Document doc = new Document(pmbe); //将根元素植入文档doc中
			Format format = Format.getCompactFormat();
			format.setEncoding("gb2312"); //设置xml文件的字符为gb2312
			format.setIndent("    "); //设置xml文件的缩进为4个空格
			XMLOutputter XMLOut = new XMLOutputter(format);//元素后换行一层元素缩四格 
			try {
				File parent=new File(storePath);
				if(!parent.exists())
					parent.mkdir();
				File file=new File(storePath+"\\"+"PR"+process.getOID().getText()+".xml");
				XMLOut.output(doc, new FileOutputStream(file));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Element pmbe=resource.getXMLElement();
		Document doc = new Document(pmbe); //将根元素植入文档doc中
		Format format = Format.getCompactFormat();
		format.setEncoding("gb2312"); //设置xml文件的字符为gb2312
		format.setIndent("    "); //设置xml文件的缩进为4个空格
		XMLOutputter XMLOut = new XMLOutputter(format);//元素后换行一层元素缩四格 
		try {
			File parent=new File(storePath);
			if(!parent.exists())
				parent.mkdir();
			File file=new File(storePath+"\\"+"RS"+resource.getOID().getText()+".xml");
			XMLOut.output(doc, new FileOutputStream(file));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
