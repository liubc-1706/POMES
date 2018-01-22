package newpmbe.models.icemodel.transformation;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import newpmbe.models.icemodel.elements.Draw;
import newpmbe.models.icemodel.elements.Line;
import newpmbe.models.icemodel.elements.Model;
import newpmbe.models.icemodel.elements.Page;
import newpmbe.models.icemodel.elements.Property;
import newpmbe.models.icemodel.elements.RowValue;
import newpmbe.models.icemodel.elements.Table;
import newpmbe.models.icemodel.elements.TableSchema;
import newpmbe.models.transform.elements.Activity;
import newpmbe.models.transform.elements.Process;
import newpmbe.models.transform.elements.Product;
import newpmbe.models.transform.elements.Resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import vpml.infopackage.EMIDataFlow;
import vpml.infopackage.EMIRefFlow;
import vpml.processpackage.EMPArtifact;
import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPAutoActivity;
import vpml.processpackage.EMPBatchActivity;
import vpml.processpackage.EMPClockFlow;
import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPDocument;
import vpml.processpackage.EMPInAnd;
import vpml.processpackage.EMPInOr;
import vpml.processpackage.EMPMessage;
import vpml.processpackage.EMPNormalActivity;
import vpml.processpackage.EMPOther;
import vpml.processpackage.EMPOutAnd;
import vpml.processpackage.EMPOutOr;
import vpml.processpackage.EMPProductPackage;
import vpml.resourcepackage.EMRLocationType;
import vpml.resourcepackage.EMRMachineType;
import vpml.resourcepackage.EMRRole;
import vpml.resourcepackage.EMRToolType;

public class Tranform {
	public ResourceSet rsSet=new ResourceSetImpl();
	public Model model=new Model();
	public String storePath; 	
	public String proname;
	public void addtableset(){
		model.addtebleset();
	}
	public void processFileParse(File file,String lable){
		URI fileURI= URI.createFileURI(file.getPath());
		org.eclipse.emf.ecore.resource.Resource rs = rsSet.getResource(fileURI, true);
		EMPDiagram empModel=(EMPDiagram)rs.getContents().get(0);
		
		List documents=empModel.getDocuments();
		List artifacts=empModel.getArtifacts();
		List others=empModel.getOthers();
		List message=empModel.getMessages();
		List productPackages=empModel.getProductPackages();
		List batchActivities=empModel.getManualBatchActivities();
		List autobatch=empModel.getAutoBatchActivities();
		List normalActivities=empModel.getNormalActivities();
		List compActivities=empModel.getCompActivities();
		List autoActivities=empModel.getAutoActivities();
		List dataFlows=empModel.getDataFlows();
		List refFlows=empModel.getRefFlows();
		List assFlows=empModel.getAssFlows();
		List clockFlows=empModel.getClockFlows();
		List inOrs=empModel.getInOrs();
		List inAnds=empModel.getInAnds();
		List outOrs=empModel.getOutOrs();
		List outAnds=empModel.getOutAnds();
		List roles=empModel.getRoles();
		List clocks=empModel.getClocks();	
		List machinetype=empModel.getMachineTypes();
		List locationtype=empModel.getLocationTypes();
		List tooltype=empModel.getToolTypes();
		Page page1=new Page();
		String pagename="NewPage_"+empModel.getName();
		page1.setPageName(pagename);
		model.addContents(page1.getXMLElement());
		
		
		page1.setPageIcon("icons/alt_window_16.gif");
		page1.setPageCaption(lable);		
		Element figure=new Element("Figure");
		page1.addContents(figure);
		Element connection=new Element("Connection");
		page1.addContents(connection);
		
		for(Iterator iter = message.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property=new Property();
			EMPMessage mess=(EMPMessage)iter.next();

			String name=mess.getName();
			String proID=mess.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("2008082802335618");
			draw.setClassName("22 Order");
			draw.setClassCaption("22 Order");
			draw.setObjectID(proID);
			draw.setObjectName("22 Order"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {204, 255, 255}");
			draw.setConstraint("Rectangle(669, 391, 103, 45)");
			draw.setIcon("C:\\eclipseGEF\\icons\\Inf_Order.gif");
			
			property.setName("name");
			property.setValue("value");
			property.setAttribute_Order("2");
			property.setAttribute_Width("100");
			property.setAttribute_DisplayWidth("120");
			property.setAttribute_Window("Window1");
			
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			element.addContent(objectmodel);
			figure.addContent(element);
		}
		//生成实物定义表
		
		for(Iterator iter = compActivities.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property=new Property();
			EMPCompActivity compactivity=(EMPCompActivity)iter.next();

			String name=compactivity.getName();
			String proID=compactivity.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("2008082602413729");
			draw.setClassName("1 Function/Action(FA)");
			draw.setClassCaption("1 Function/Action(FA)");
			draw.setObjectID(proID);
			draw.setObjectName("1 Function/Action(FA)"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {255, 255, 0}");
			draw.setConstraint("Rectangle(212, 300, 90, 71)");
			draw.setIcon("C:\\eclipseGEF\\icons\\Function.gif");
			String subpage="NewPage_"+name;
			draw.setLinkSubPage("subpage");
			
			property.setName("Func Name");
			property.setValue("value");
			property.setAttribute_Order("6");
			property.setAttribute_Width("100");
			property.setAttribute_DisplayWidth("120");
			property.setAttribute_Window("Window1");
	
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			element.addContent(objectmodel);
			figure.addContent(element);
			
		}
		
		for(int i=0;i<compActivities.size();i++){
			EMPCompActivity comact=(EMPCompActivity)compActivities.get(i);
			String name=comact.getName();
			File subProcess=new File(file.getParentFile().getAbsolutePath()+"/"+name+"/"+name+".process_diagram");
			processFileParse(subProcess,name);
		}
		for(Iterator iter = dataFlows.iterator(); iter.hasNext();){
			Line line=new Line();
			EMPDataFlow dataflow=(EMPDataFlow)iter.next();
			String sflag=null;
			String tflag=null;
			if(dataflow.getSourceActivity()!=null){
				sflag=dataflow.getSourceActivity().getId();
			}
			
			if(dataflow.getSourceInAnd()!=null){
					sflag=dataflow.getSourceInAnd().getId();
				}
			 if(dataflow.getSourceInOr()!=null){
				 sflag=dataflow.getSourceInOr().getId();
			 }
			 if(dataflow.getSourceOutAnd()!=null){
				 sflag=dataflow.getSourceOutAnd().getId();
			 }
			 if(dataflow.getSourceOutOr()!=null){
				 sflag=dataflow.getSourceOutOr().getId();
			 }
			 if(dataflow.getSourceProduct()!=null){
				 sflag=dataflow.getSourceProduct().getId();
			 }
			 if(dataflow.getTargetActivity()!=null){
				 tflag=dataflow.getTargetActivity().getId();
			 }
			if(dataflow.getTargetInAnd()!=null){
				tflag=dataflow.getTargetInAnd().getId();
			}
			if(dataflow.getTargetInOr()!=null){
				tflag=dataflow.getTargetInOr().getId();
			}
			if(dataflow.getTargetOutAnd()!=null){
				tflag=dataflow.getTargetOutAnd().getId();
			}
			if(dataflow.getTargetOutOr()!=null){
				tflag=dataflow.getTargetOutOr().getId();
			}
			if(dataflow.getTargetProduct()!=null){
				tflag=dataflow.getTargetProduct().getId();
			}
			line.getSource().setAttribute("Type", "AbstractSourceModel");
			line.setsFlag(sflag);
			line.getTarget().setAttribute("Type", "AbstractSourceModel");
			line.settFlag(tflag);
			line.setSourceAnchor("1.7976931348623157E308");
			line.setTargetAnchor("1.7976931348623157E308");
			line.setMiddleCaptionDistance("1");
			line.setSourceCaptionDistance("1");
			line.setTargetCaptionDistance("1");
			line.setSourceCaptionDisplayDirection("0");
			line.setTargetCaptionDisplayDirection("0");
			line.setCaptionFont("宋体,10,0");
			line.setCaptionColor("Color {0, 0, 0}");
			line.setSourceFigure("0");
			line.setTargetFigure("1");
			line.setSourceFigureSize("1");
			line.setTargetFigureSize("1");
			line.setLineType("CommonConnectionModel");
			line.setColor("Color {0, 0, 0}");
			line.setStyle("1");
			line.setWidth("1");
			line.setDisplayDirection("0");
			line.setRoute("0");
			
			connection.addContent(line.getXMLElement());
		}
		
		for(Iterator iter = assFlows.iterator(); iter.hasNext();){
			Line line=new Line();
			EMPAssFlow assflow=(EMPAssFlow)iter.next();

			//String oid=assflow.getOID().toString();
			//String proID=assflow.getId();
			String sflag;
			String tflag;
			if(assflow.getProduct()!=null)
			{
				sflag=assflow.getToolType().getId();
				tflag=assflow.getProduct().getId();
			}
			else {
				sflag=assflow.getRole().getId();
				if(assflow.getNormalActivity()!=null){
					tflag=assflow.getNormalActivity().getId();
					}
				else{
					if(assflow.getAutoActivity()!=null){
						tflag=assflow.getAutoActivity().getId();
						}
						else {
							if(assflow.getAutoBatchActiviy()!=null){
								tflag=assflow.getAutoBatchActiviy().getId();
								}
							else {
								if(assflow.getCompActivity()!=null){
									tflag=assflow.getCompActivity().getId();
									}
									else{
											tflag=assflow.getManualBatchActivity().getId();
									}
							}
						}
				}
			}
			
			line.getSource().setAttribute("Type", "AbstractSourceModel");
			line.setsFlag(sflag);
			line.getTarget().setAttribute("Type", "AbstractSourceModel");
			line.settFlag(tflag);
			line.setSourceAnchor("1.7976931348623157E308");
			line.setTargetAnchor("1.7976931348623157E308");
			line.setMiddleCaptionDistance("1");
			line.setSourceCaptionDistance("1");
			line.setTargetCaptionDistance("1");
			line.setSourceCaptionDisplayDirection("0");
			line.setTargetCaptionDisplayDirection("0");
			line.setCaptionFont("宋体,10,0");
			line.setCaptionColor("Color {0, 0, 0}");
			line.setSourceFigure("0");
			line.setTargetFigure("2");
			line.setSourceFigureSize("1");
			line.setTargetFigureSize("1");
			line.setLineType("DashedConnectionModel");
			line.setColor("Color {0, 0, 0}");
			line.setStyle("1");
			line.setWidth("1");
			line.setDisplayDirection("0");
			line.setRoute("0");
			
			connection.addContent(line.getXMLElement());
		}
		
		for(Iterator iter = refFlows.iterator(); iter.hasNext();){
			Line line=new Line();
			EMIRefFlow refflow=(EMIRefFlow)iter.next();

			//String oid=refflow.getOID().toString();
			//String proID=refflow.getId();
			String sflag=refflow.getSourceNode().getId();
			String tflag=refflow.getTargetNode().getId();
			line.getSource().setAttribute("Type", "AbstractSourceModel");
			line.setsFlag(sflag);
			line.getTarget().setAttribute("Type", "AbstractSourceModel");
			line.settFlag(tflag);
			line.setSourceAnchor("1.7976931348623157E308");
			line.setTargetAnchor("1.7976931348623157E308");
			line.setMiddleCaptionDistance("1");
			line.setSourceCaptionDistance("1");
			line.setTargetCaptionDistance("1");
			line.setSourceCaptionDisplayDirection("0");
			line.setTargetCaptionDisplayDirection("0");
			line.setCaptionFont("宋体,10,0");
			line.setCaptionColor("Color {0, 0, 0}");
			line.setSourceFigure("0");
			line.setTargetFigure("1");
			line.setSourceFigureSize("1");
			line.setTargetFigureSize("1");
			line.setLineType("CommonConnectionModel");
			line.setColor("Color {0, 0, 0}");
			line.setStyle("1");
			line.setWidth("1");
			line.setDisplayDirection("0");
			line.setRoute("0");
			
			connection.addContent(line.getXMLElement());
		}
		
		for(Iterator iter = clockFlows.iterator(); iter.hasNext();){
			Line line=new Line();
			EMPClockFlow clockflow=(EMPClockFlow)iter.next();

			//String oid=refflow.getOID().toString();
			//String proID=refflow.getId();
			String sflag;
			sflag=clockflow.getId();
			String tflag;
			if(clockflow.getClass()!=null){
				tflag=clockflow.getActivity().getId();
			}
			else
				tflag=clockflow.getCompActivity().getId();	
			line.getSource().setAttribute("Type", "AbstractSourceModel");
			line.setsFlag(sflag);
			line.getTarget().setAttribute("Type", "AbstractSourceModel");
			line.settFlag(tflag);
			line.setSourceAnchor("1.7976931348623157E308");
			line.setTargetAnchor("1.7976931348623157E308");
			line.setMiddleCaptionDistance("1");
			line.setSourceCaptionDistance("1");
			line.setTargetCaptionDistance("1");
			line.setSourceCaptionDisplayDirection("0");
			line.setTargetCaptionDisplayDirection("0");
			line.setCaptionFont("宋体,10,0");
			line.setCaptionColor("Color {0, 0, 0}");
			line.setSourceFigure("0");
			line.setTargetFigure("1");
			line.setSourceFigureSize("1");
			line.setTargetFigureSize("1");
			line.setLineType("CommonConnectionModel");
			line.setColor("Color {0, 0, 0}");
			line.setStyle("1");
			line.setWidth("1");
			line.setDisplayDirection("0");
			line.setRoute("0");
			
			connection.addContent(line.getXMLElement());
		}
		for(Iterator iter = batchActivities.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property=new Property();
			EMPBatchActivity batchactivity=(EMPBatchActivity)iter.next();

			String name=batchactivity.getName();
			String proID=batchactivity.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("2008082602413729");
			draw.setClassName("1 Function/Action(FA)");
			draw.setClassCaption("1 Function/Action(FA)");
			draw.setObjectID(proID);
			draw.setObjectName("1 Function/Action(FA)"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {255, 255, 0}");
			draw.setConstraint("Rectangle(212, 300, 90, 71)");
			draw.setIcon("C:\\eclipseGEF\\icons\\Function.gif");
			draw.setLinkSubPage("");
			
			property.setName("Func Name");
			property.setValue("value");
			property.setAttribute_Order("6");
			property.setAttribute_Width("100");
			property.setAttribute_DisplayWidth("120");
			property.setAttribute_Window("Window1");
	
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			element.addContent(objectmodel);
			figure.addContent(element);
		}
		
		for(Iterator iter = autobatch.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property=new Property();
			EMPBatchActivity oneautobatch=(EMPBatchActivity)iter.next();

			String name=oneautobatch.getName();
			String proID=oneautobatch.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("2008082602413729");
			draw.setClassName("1 Function/Action(FA)");
			draw.setClassCaption("1 Function/Action(FA)");
			draw.setObjectID(proID);
			draw.setObjectName("1 Function/Action(FA)"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {255, 255, 0}");
			draw.setConstraint("Rectangle(212, 300, 90, 71)");
			draw.setIcon("C:\\eclipseGEF\\icons\\Function.gif");
			draw.setLinkSubPage("");
			
			property.setName("Func Name");
			property.setValue("value");
			property.setAttribute_Order("6");
			property.setAttribute_Width("100");
			property.setAttribute_DisplayWidth("120");
			property.setAttribute_Window("Window1");
	
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			element.addContent(objectmodel);
			figure.addContent(element);
		}
		
		for(Iterator iter = normalActivities.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property=new Property();
			EMPNormalActivity normalactivity=(EMPNormalActivity)iter.next();

			String name=normalactivity.getName();
			String proID=normalactivity.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("20080826081043117");
			draw.setClassName("42 Manual Activity(MAA)");
			draw.setClassCaption("42 Manual Activity(MAA)");
			draw.setObjectID(proID);
			draw.setObjectName("42 Manual Activity(MAA)"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {255, 255, 0}");
			draw.setConstraint("Rectangle(384, 414, 90, 45)");
			draw.setIcon("C:\\eclipseGEF\\icons\\FA_ManuActivity.gif");
			
			property.setName("name");
			property.setValue("value");
			property.setAttribute_Order("6");
			property.setAttribute_Width("100");
			property.setAttribute_DisplayWidth("120");
			property.setAttribute_Window("Window1");
	
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			element.addContent(objectmodel);
			figure.addContent(element);
		}
		
		for(Iterator iter = autoActivities.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property=new Property();
			EMPAutoActivity autoactivity=(EMPAutoActivity)iter.next();

			String name=autoactivity.getName();
			String proID=autoactivity.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("20080826081727124");
			draw.setClassName("43 Automated Activity");
			draw.setClassCaption("43 Automated Activity");
			draw.setObjectID(proID);
			draw.setObjectName("43 Automated Activity"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {255, 255, 0}");
			draw.setConstraint("Rectangle(1135, 191, 90, 45)");
			draw.setIcon("C:\\eclipseGEF\\icons\\FA_AutoActivity.gif");
			
			property.setName("name");
			property.setValue("value");
			property.setAttribute_Order("6");
			property.setAttribute_Width("100");
			property.setAttribute_DisplayWidth("120");
			property.setAttribute_Window("Window1");
	
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			element.addContent(objectmodel);
			figure.addContent(element);
		}
		
		for(Iterator iter = artifacts.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property1=new Property();
			Property property2=new Property();
			Property property3=new Property();
			Property property4=new Property();
			EMPArtifact artifact=(EMPArtifact)iter.next();

			String name=artifact.getName();
			String proID=artifact.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("2008051820424901");
			draw.setClassName("3 Physical Product(PP)");
			draw.setClassCaption("3 Physical Product(PP)");
			draw.setObjectID(proID);
			draw.setObjectName("3 Physical Product(PP)"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {228, 228, 228}");
			draw.setConstraint("Rectangle(232, 143, 90, 45)");
			draw.setIcon("C:\\eclipseGEF\\icons\\PhysicalProduct.gif");
			
			property1.setName("序号");
			property1.setAttribute_Order("1");
			property1.setAttribute_DataType("String");
			property1.setAttribute_Width("80");
			property1.setAttribute_DisplayWidth("80");
			property1.setAttribute_Window("实物定义表");
	
			property2.setName("类别");
			property2.setAttribute_Order("2");
			property2.setAttribute_DataType("String");
			property2.setAttribute_Width("100");
			property2.setAttribute_DisplayWidth("100");
			property2.setAttribute_Window("实物定义表");
			
			property2.setName("名称");
			property2.setAttribute_Order("3");
			property2.setAttribute_DataType("String");
			property2.setAttribute_Width("100");
			property2.setAttribute_DisplayWidth("100");
			property2.setAttribute_Window("实物定义表");
			
			property2.setName("说明");
			property2.setAttribute_Order("4");
			property2.setAttribute_DataType("String");
			property2.setAttribute_Width("100");
			property2.setAttribute_DisplayWidth("100");
			property2.setAttribute_Window("实物定义表");
			
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property1.getXMLElement());
			innermodel.addContent(property2.getXMLElement());
			innermodel.addContent(property3.getXMLElement());
			innermodel.addContent(property4.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			element.addContent(objectmodel);
			figure.addContent(element);
		}
		
		for(Iterator iter = documents.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property=new Property();
			EMPDocument doc=(EMPDocument)iter.next();

			String name=doc.getName();
			String proID=doc.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("20080826075643104");
			draw.setClassName("21 Document");
			draw.setClassCaption("21 Document");
			draw.setObjectID(proID);
			draw.setObjectName("21 Document"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {204, 255, 255}");
			draw.setConstraint("Rectangle(243, 417, 90, 45)");
			draw.setIcon("C:\\eclipseGEF\\icons\\Inf_Doc.gif");
			
			property.setName("name");
			property.setValue("value");
			property.setAttribute_Order("4");
			property.setAttribute_Width("100");
			property.setAttribute_DisplayWidth("120");
			property.setAttribute_Window("Window1");
	
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			element.addContent(objectmodel);
			figure.addContent(element);
		}
		
		for(Iterator iter = productPackages.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property=new Property();
			EMPProductPackage propac=(EMPProductPackage)iter.next();

			String name=propac.getName();
			String proID=propac.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("2008082602123814");
			draw.setClassName("2 Information(Inf)");
			draw.setClassCaption("2 Information(Inf)");
			draw.setObjectID(proID);
			draw.setObjectName("2 Information(Inf)"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {204, 255, 255}");
			draw.setConstraint("Rectangle(360, 155, 90, 45)");
			draw.setIcon("C:\\eclipseGEF\\icons\\Information.gif");
			
			property.setName("name");
			property.setValue("value");
			property.setAttribute_Order("2");
			property.setAttribute_Width("100");
			property.setAttribute_DisplayWidth("120");
			property.setAttribute_Window("Window1");
	
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			element.addContent(objectmodel);
			figure.addContent(element);
		}
		
		for(Iterator iter = others.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property=new Property();
			EMPOther other=(EMPOther)iter.next();

			String name=other.getName();
			String proID=other.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("2008082602123814");
			draw.setClassName("2 Information(Inf)");
			draw.setClassCaption("2 Information(Inf)");
			draw.setObjectID(proID);
			draw.setObjectName("2 Information(Inf)"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {204, 255, 255}");
			draw.setConstraint("Rectangle(360, 155, 90, 45)");
			draw.setIcon("C:\\eclipseGEF\\icons\\Information.gif");
			
			property.setName("name");
			property.setValue("value");
			property.setAttribute_Order("2");
			property.setAttribute_Width("100");
			property.setAttribute_DisplayWidth("120");
			property.setAttribute_Window("Window1");
	
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			element.addContent(objectmodel);
			figure.addContent(element);
		}
		
		for(Iterator iter = roles.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property=new Property();
			EMRRole role=(EMRRole)iter.next();

			String name=role.getName();
			String proID=role.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("2008082606233147");
			draw.setClassName("3 Role");
			draw.setClassCaption("3 Role");
			draw.setObjectID(proID);
			draw.setObjectName("3 Role"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {244, 190, 240}");
			draw.setConstraint("Rectangle(209, 340, 90, 45)");
			draw.setIcon("C:\\eclipseGEF\\icons\\Org_role.gif");
			
			property.setName("name");
			property.setValue("value");
			property.setAttribute_Order("9");
			property.setAttribute_Width("100");
			property.setAttribute_DisplayWidth("120");
			property.setAttribute_Window("Window1");
	
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			element.addContent(objectmodel);
			figure.addContent(element);
		}
			
		for(Iterator iter = roles.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property=new Property();
			EMRRole role=(EMRRole)iter.next();

			String name=role.getName();
			String proID=role.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("2008082606233147");
			draw.setClassName("3 Role");
			draw.setClassCaption("3 Role");
			draw.setObjectID(proID);
			draw.setObjectName("3 Role"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {244, 190, 240}");
			draw.setConstraint("Rectangle(209, 340, 90, 45)");
			draw.setIcon("C:\\eclipseGEF\\icons\\Org_role.gif");
			
			property.setName("name");
			property.setValue("value");
			property.setAttribute_Order("9");
			property.setAttribute_Width("100");
			property.setAttribute_DisplayWidth("120");
			property.setAttribute_Window("Window1");
	
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			element.addContent(objectmodel);
		}
		
		for(Iterator iter = locationtype.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property=new Property();
			EMRLocationType location=(EMRLocationType)iter.next();

			String name=location.getName();
			String proID=location.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("2008082607011073");
			draw.setClassName("12 Facility for Storage");
			draw.setClassCaption("12 Facility for Storage");
			draw.setObjectID(proID);
			draw.setObjectName("12 Facility for Storage"+name);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {100, 255, 100}");
			draw.setConstraint("Rectangle(149, 303, 90, 45)");
			draw.setIcon("C:\\eclipseGEF\\icons\\RF_storage.gif");
			
			property.setName("name");
			property.setValue("value");
			property.setAttribute_Order("7");
			property.setAttribute_Width("100");
			property.setAttribute_DisplayWidth("120");
			property.setAttribute_Window("Window1");
	
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			element.addContent(objectmodel);
			figure.addContent(element);
		}
		
		for(Iterator iter = machinetype.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property1=new Property();
			Property property2=new Property();
			Property property3=new Property();
			Property property4=new Property();
			Property property5=new Property();
			Property property6=new Property();
			Property property7=new Property();
			Property property8=new Property();
			Property property9=new Property();
			Property property10=new Property();
			Property property11=new Property();
			Property property12=new Property();
			Property property13=new Property();
			Property property14=new Property();
			Property property15=new Property();
			Property property16=new Property();
			Property property17=new Property();
			Property property18=new Property();
			Property property19=new Property();
			Property property20=new Property();
			Property property21=new Property();
			Property property22=new Property();
			Property property23=new Property();
			Property property24=new Property();
			Property property25=new Property();
			Property property26=new Property();
			Property property27=new Property();
			Property property28=new Property();
			EMRMachineType machine=(EMRMachineType)iter.next();

			String name=machine.getName();
			String proID=machine.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("2008082607004272");
			draw.setClassName("11 Facility for Machining");
			draw.setClassCaption("11 Facility for Machining");
			draw.setObjectID(proID);
			draw.setObjectName("11 Facility for Machining"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {100, 255, 100}");
			draw.setConstraint("Rectangle(223, 163, 90, 45)");
			draw.setIcon("C:\\eclipseGEF\\icons\\RF_machine.gif");
			
			property1.setName("资源类序号");
			property1.setAttribute_Order("1");
			property1.setAttribute_DataType("String");
			property1.setAttribute_Width("80");
			property1.setAttribute_DisplayWidth("80");
			property1.setAttribute_Window("资源类定义表");
			
			property2.setName("资源类编码");
			property2.setAttribute_Order("2");
			property2.setAttribute_DataType("String");
			property2.setAttribute_Width("100");
			property2.setAttribute_DisplayWidth("100");
			property2.setAttribute_Window("资源类定义表");
			
			property3.setName("资源类名称");
			property3.setAttribute_Order("3");
			property3.setAttribute_DataType("String");
			property3.setAttribute_Width("100");
			property3.setAttribute_DisplayWidth("100");
			property3.setAttribute_Window("资源类定义表");
			
			property4.setName("资源类描述");
			property4.setAttribute_Order("4");
			property4.setAttribute_DataType("String");
			property4.setAttribute_Width("300");
			property4.setAttribute_DisplayWidth("300");
			property4.setAttribute_Window("资源类定义表");
			
			property5.setName("资源型序号");
			property5.setAttribute_Order("21");
			property5.setAttribute_DataType("String");
			property5.setAttribute_Width("80");
			property5.setAttribute_DisplayWidth("80");
			property5.setAttribute_Window("资源类定义表");
			
			property6.setName("资源型编码");
			property6.setAttribute_Order("22");
			property6.setAttribute_DataType("String");
			property6.setAttribute_Width("100");
			property6.setAttribute_DisplayWidth("100");
			property6.setAttribute_Window("资源类定义表");
			
			property7.setName("资源型名称");
			property7.setAttribute_Order("23");
			property7.setAttribute_DataType("String");
			property7.setAttribute_Width("100");
			property7.setAttribute_DisplayWidth("100");
			property7.setAttribute_Window("资源类定义表");
			
			property8.setName("资源型描述");
			property8.setAttribute_Order("24");
			property8.setAttribute_DataType("String");
			property8.setAttribute_Width("300");
			property8.setAttribute_DisplayWidth("300");
			property8.setAttribute_Window("资源类定义表");
			
			property9.setName("资源型资源数量");
			property9.setAttribute_Order("25");
			property9.setAttribute_DataType("String");
			property9.setAttribute_Width("100");
			property9.setAttribute_DisplayWidth("100");
			property9.setAttribute_Window("资源类定义表");
			
			property10.setName("属性序号");
			property10.setAttribute_Order("31");
			property10.setAttribute_DataType("String");
			property10.setAttribute_Width("80");
			property10.setAttribute_DisplayWidth("80");
			property10.setAttribute_Window("资源型属性定义表");
			
			property11.setName("属性名称");
			property11.setAttribute_Order("32");
			property11.setAttribute_DataType("String");
			property11.setAttribute_Width("100");
			property11.setAttribute_DisplayWidth("100");
			property11.setAttribute_Window("资源型属性定义表");
			
			property12.setName("属性值类型");
			property12.setAttribute_Order("33");
			property12.setAttribute_DataType("String");
			property12.setAttribute_Width("100");
			property12.setAttribute_DisplayWidth("100");
			property12.setAttribute_Window("资源型属性定义表");
			
			property13.setName("属性值单位");
			property13.setAttribute_Order("34");
			property13.setAttribute_DataType("String");
			property13.setAttribute_Width("100");
			property13.setAttribute_DisplayWidth("100");
			property13.setAttribute_Window("资源型属性定义表");
			
			property14.setName("所属资源型编码");
			property14.setAttribute_Order("35");
			property14.setAttribute_DataType("String");
			property14.setAttribute_Width("100");
			property14.setAttribute_DisplayWidth("100");
			property14.setAttribute_Window("资源型属性定义表");
			
			property15.setName("资源序号");
			property15.setAttribute_Order("41");
			property15.setAttribute_DataType("String");
			property15.setAttribute_Width("80");
			property15.setAttribute_DisplayWidth("80");
			property15.setAttribute_Window("资源池定义表");
			
			property16.setName("资源编码");
			property16.setAttribute_Order("42");
			property16.setAttribute_DataType("String");
			property16.setAttribute_Width("100");
			property16.setAttribute_DisplayWidth("100");
			property16.setAttribute_Window("资源池定义表");
			
			property17.setName("资源名称");
			property17.setAttribute_Order("43");
			property17.setAttribute_DataType("String");
			property17.setAttribute_Width("100");
			property17.setAttribute_DisplayWidth("100");
			property17.setAttribute_Window("资源池定义表");
			
			property18.setName("所属资源型");
			property18.setAttribute_Order("44");
			property18.setAttribute_DataType("String");
			property18.setAttribute_Width("100");
			property18.setAttribute_DisplayWidth("100");
			property18.setAttribute_Window("资源池定义表");
			
			property19.setName("效率定义序号");
			property19.setAttribute_Order("51");
			property19.setAttribute_DataType("String");
			property19.setAttribute_Width("80");
			property19.setAttribute_DisplayWidth("80");
			property19.setAttribute_Window("资源效率定义表");
			
			property20.setName("资源(类/型)编码");
			property20.setAttribute_Order("52");
			property20.setAttribute_DataType("String");
			property20.setAttribute_Width("100");
			property20.setAttribute_DisplayWidth("100");
			property20.setAttribute_Window("资源效率定义表");
			
			property21.setName("衡量指标");
			property21.setAttribute_Order("53");
			property21.setAttribute_DataType("String");
			property21.setAttribute_Width("100");
			property21.setAttribute_DisplayWidth("100");
			property21.setAttribute_Window("资源效率定义表");
			
			property22.setName("指标单位");
			property22.setAttribute_Order("54");
			property22.setAttribute_DataType("String");
			property22.setAttribute_Width("100");
			property22.setAttribute_DisplayWidth("100");
			property22.setAttribute_Window("资源效率定义表");
			
			property23.setName("标准能力");
			property23.setAttribute_Order("55");
			property23.setAttribute_DataType("String");
			property23.setAttribute_Width("100");
			property23.setAttribute_DisplayWidth("100");
			property23.setAttribute_Window("资源效率定义表");
			
			property24.setName("最大能力");
			property24.setAttribute_Order("56");
			property24.setAttribute_DataType("String");
			property24.setAttribute_Width("100");
			property24.setAttribute_DisplayWidth("100");
			property24.setAttribute_Window("资源效率定义表");
			
			property25.setName("能力单位");
			property25.setAttribute_Order("57");
			property25.setAttribute_DataType("String");
			property25.setAttribute_Width("100");
			property25.setAttribute_DisplayWidth("100");
			property25.setAttribute_Window("资源效率定义表");
			
			property26.setName("效率");
			property26.setAttribute_Order("58");
			property26.setAttribute_DataType("String");
			property26.setAttribute_Width("100");
			property26.setAttribute_DisplayWidth("100");
			property26.setAttribute_Window("资源效率定义表");
			
			property27.setName("标准工时转换比率");
			property27.setAttribute_Order("59");
			property27.setAttribute_DataType("String");
			property27.setAttribute_Width("100");
			property27.setAttribute_DisplayWidth("100");
			property27.setAttribute_Window("资源效率定义表");
			
			property28.setName("说明");
			property28.setAttribute_Order("60");
			property28.setAttribute_DataType("String");
			property28.setAttribute_Width("200");
			property28.setAttribute_DisplayWidth("200");
			property28.setAttribute_Window("资源效率定义表");
			
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property1.getXMLElement());
			innermodel.addContent(property2.getXMLElement());
			innermodel.addContent(property3.getXMLElement());
			innermodel.addContent(property4.getXMLElement());
			innermodel.addContent(property5.getXMLElement());
			innermodel.addContent(property6.getXMLElement());
			innermodel.addContent(property7.getXMLElement());
			innermodel.addContent(property8.getXMLElement());
			innermodel.addContent(property9.getXMLElement());
			innermodel.addContent(property10.getXMLElement());
			innermodel.addContent(property11.getXMLElement());
			innermodel.addContent(property12.getXMLElement());
			innermodel.addContent(property13.getXMLElement());
			innermodel.addContent(property14.getXMLElement());
			innermodel.addContent(property15.getXMLElement());
			innermodel.addContent(property16.getXMLElement());
			innermodel.addContent(property17.getXMLElement());
			innermodel.addContent(property18.getXMLElement());
			innermodel.addContent(property19.getXMLElement());
			innermodel.addContent(property20.getXMLElement());
			innermodel.addContent(property21.getXMLElement());
			innermodel.addContent(property22.getXMLElement());
			innermodel.addContent(property23.getXMLElement());
			innermodel.addContent(property24.getXMLElement());
			innermodel.addContent(property25.getXMLElement());
			innermodel.addContent(property26.getXMLElement());
			innermodel.addContent(property27.getXMLElement());
			innermodel.addContent(property28.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			Element tableset=new Element("ObjectTableSet");
			Table table1=new Table();
			table1.setTableName("11 Facility for Machining_资源类定义表");
			TableSchema tableschema1=new TableSchema();
			tableschema1.setColumnName1("资源类序号");
			tableschema1.setColumnName2("资源类编码");
			tableschema1.setColumnName3("资源类名称");
			tableschema1.setColumnName4("资源类描述");
			table1.addContents(tableschema1.getXMLElement());
			tableset.addContent(table1.getXMLElement());
			Table table2=new Table();
			table2.setTableName("11 Facility for Machining_资源型定义表");
			TableSchema tableschema2=new TableSchema();
			tableschema2.setColumnName1("资源型序号");
			tableschema2.setColumnName2("资源型编码");
			tableschema2.setColumnName3("资源型名称");
			tableschema2.setColumnName4("资源型描述");
			tableschema2.setColumnName5("资源型资源数量");
			table2.addContents(tableschema2.getXMLElement());
			tableset.addContent(table2.getXMLElement());
			Table table3=new Table();
			table3.setTableName("11 Facility for Machining_资源型属性定义表");
			TableSchema tableschema3=new TableSchema();
			tableschema3.setColumnName1("属性序号");
			tableschema3.setColumnName2("属性名称");
			tableschema3.setColumnName3("属性值类型");
			tableschema3.setColumnName4("属性值单位");
			tableschema3.setColumnName5("所属资源型编码");
			table3.addContents(tableschema3.getXMLElement());
			tableset.addContent(table3.getXMLElement());
			Table table4=new Table();
			table4.setTableName("11 Facility for Machining_资源池定义表");
			TableSchema tableschema4=new TableSchema();
			tableschema4.setColumnName1("资源序号");
			tableschema4.setColumnName2("资源编码");
			tableschema4.setColumnName3("资源名称");
			tableschema4.setColumnName4("所属资源型");
			table1.addContents(tableschema4.getXMLElement());
			tableset.addContent(table4.getXMLElement());
			Table table5=new Table();
			table5.setTableName("11 Facility for Machining_资源效率定义表");
			TableSchema tableschema5=new TableSchema();
			tableschema5.setColumnName1("效率定义序号");
			tableschema5.setColumnName2("资源(类/型)编码");
			tableschema5.setColumnName3("衡量指标");
			tableschema5.setColumnName4("指标单位");
			tableschema5.setColumnName5("标准能力");
			tableschema5.setColumnName6("最大能力");
			tableschema5.setColumnName7("能力单位");
			tableschema5.setColumnName8("效率");
			tableschema5.setColumnName9("标准工时转换比率");
			tableschema5.setColumnName10("说明");
			table1.addContents(tableschema5.getXMLElement());
			tableset.addContent(table5.getXMLElement());
			objectmodel.addContent(tableset);
			element.addContent(objectmodel);
			figure.addContent(element);
		}
		for(Iterator iter = tooltype.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property1=new Property();
			Property property2=new Property();
			Property property3=new Property();
			Property property4=new Property();
			Property property5=new Property();
			Property property6=new Property();
			Property property7=new Property();
			Property property8=new Property();
			Property property9=new Property();
			Property property10=new Property();
			Property property11=new Property();
			Property property12=new Property();
			Property property13=new Property();
			Property property14=new Property();
			Property property15=new Property();
			Property property16=new Property();
			Property property17=new Property();
			Property property18=new Property();
			Property property19=new Property();
			Property property20=new Property();
			Property property21=new Property();
			Property property22=new Property();
			Property property23=new Property();
			Property property24=new Property();
			Property property25=new Property();
			Property property26=new Property();
			Property property27=new Property();
			Property property28=new Property();
			EMRToolType tool=(EMRToolType)iter.next();

			String name=tool.getName();
			String proID=tool.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("2008082607012076");
			draw.setClassName("31 Outside Resource");
			draw.setClassCaption("31 Outside Resource");
			draw.setObjectID(proID);
			draw.setObjectName("31 Outside Resource"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {100, 255, 100}");
			draw.setConstraint("Rectangle(447, 300, 90, 45)");
			draw.setIcon("C:\\eclipseGEF\\icons\\RF_outside.gif");
			
			property1.setName("资源类序号");
			property1.setAttribute_Order("1");
			property1.setAttribute_DataType("String");
			property1.setAttribute_Width("80");
			property1.setAttribute_DisplayWidth("80");
			property1.setAttribute_Window("资源类定义表");
			
			property2.setName("资源类编码");
			property2.setAttribute_Order("2");
			property2.setAttribute_DataType("String");
			property2.setAttribute_Width("100");
			property2.setAttribute_DisplayWidth("100");
			property2.setAttribute_Window("资源类定义表");
			
			property3.setName("资源类名称");
			property3.setAttribute_Order("3");
			property3.setAttribute_DataType("String");
			property3.setAttribute_Width("100");
			property3.setAttribute_DisplayWidth("100");
			property3.setAttribute_Window("资源类定义表");
			
			property4.setName("资源类描述");
			property4.setAttribute_Order("4");
			property4.setAttribute_DataType("String");
			property4.setAttribute_Width("300");
			property4.setAttribute_DisplayWidth("300");
			property4.setAttribute_Window("资源类定义表");
			
			property5.setName("资源型序号");
			property5.setAttribute_Order("21");
			property5.setAttribute_DataType("String");
			property5.setAttribute_Width("80");
			property5.setAttribute_DisplayWidth("80");
			property5.setAttribute_Window("资源类定义表");
			
			property6.setName("资源型编码");
			property6.setAttribute_Order("22");
			property6.setAttribute_DataType("String");
			property6.setAttribute_Width("100");
			property6.setAttribute_DisplayWidth("100");
			property6.setAttribute_Window("资源类定义表");
			
			property7.setName("资源型名称");
			property7.setAttribute_Order("23");
			property7.setAttribute_DataType("String");
			property7.setAttribute_Width("100");
			property7.setAttribute_DisplayWidth("100");
			property7.setAttribute_Window("资源类定义表");
			
			property8.setName("资源型描述");
			property8.setAttribute_Order("24");
			property8.setAttribute_DataType("String");
			property8.setAttribute_Width("300");
			property8.setAttribute_DisplayWidth("300");
			property8.setAttribute_Window("资源类定义表");
			
			property9.setName("资源型资源数量");
			property9.setAttribute_Order("25");
			property9.setAttribute_DataType("String");
			property9.setAttribute_Width("100");
			property9.setAttribute_DisplayWidth("100");
			property9.setAttribute_Window("资源类定义表");
			
			property10.setName("属性序号");
			property10.setAttribute_Order("31");
			property10.setAttribute_DataType("String");
			property10.setAttribute_Width("80");
			property10.setAttribute_DisplayWidth("80");
			property10.setAttribute_Window("资源型属性定义表");
			
			property11.setName("属性名称");
			property11.setAttribute_Order("32");
			property11.setAttribute_DataType("String");
			property11.setAttribute_Width("100");
			property11.setAttribute_DisplayWidth("100");
			property11.setAttribute_Window("资源型属性定义表");
			
			property12.setName("属性值类型");
			property12.setAttribute_Order("33");
			property12.setAttribute_DataType("String");
			property12.setAttribute_Width("100");
			property12.setAttribute_DisplayWidth("100");
			property12.setAttribute_Window("资源型属性定义表");
			
			property13.setName("属性值单位");
			property13.setAttribute_Order("34");
			property13.setAttribute_DataType("String");
			property13.setAttribute_Width("100");
			property13.setAttribute_DisplayWidth("100");
			property13.setAttribute_Window("资源型属性定义表");
			
			property14.setName("所属资源型编码");
			property14.setAttribute_Order("35");
			property14.setAttribute_DataType("String");
			property14.setAttribute_Width("100");
			property14.setAttribute_DisplayWidth("100");
			property14.setAttribute_Window("资源型属性定义表");
			
			property15.setName("资源序号");
			property15.setAttribute_Order("41");
			property15.setAttribute_DataType("String");
			property15.setAttribute_Width("80");
			property15.setAttribute_DisplayWidth("80");
			property15.setAttribute_Window("资源池定义表");
			
			property16.setName("资源编码");
			property16.setAttribute_Order("42");
			property16.setAttribute_DataType("String");
			property16.setAttribute_Width("100");
			property16.setAttribute_DisplayWidth("100");
			property16.setAttribute_Window("资源池定义表");
			
			property17.setName("资源名称");
			property17.setAttribute_Order("43");
			property17.setAttribute_DataType("String");
			property17.setAttribute_Width("100");
			property17.setAttribute_DisplayWidth("100");
			property17.setAttribute_Window("资源池定义表");
			
			property18.setName("所属资源型");
			property18.setAttribute_Order("44");
			property18.setAttribute_DataType("String");
			property18.setAttribute_Width("100");
			property18.setAttribute_DisplayWidth("100");
			property18.setAttribute_Window("资源池定义表");
			
			property19.setName("效率定义序号");
			property19.setAttribute_Order("51");
			property19.setAttribute_DataType("String");
			property19.setAttribute_Width("80");
			property19.setAttribute_DisplayWidth("80");
			property19.setAttribute_Window("资源效率定义表");
			
			property20.setName("资源(类/型)编码");
			property20.setAttribute_Order("52");
			property20.setAttribute_DataType("String");
			property20.setAttribute_Width("100");
			property20.setAttribute_DisplayWidth("100");
			property20.setAttribute_Window("资源效率定义表");
			
			property21.setName("衡量指标");
			property21.setAttribute_Order("53");
			property21.setAttribute_DataType("String");
			property21.setAttribute_Width("100");
			property21.setAttribute_DisplayWidth("100");
			property21.setAttribute_Window("资源效率定义表");
			
			property22.setName("指标单位");
			property22.setAttribute_Order("54");
			property22.setAttribute_DataType("String");
			property22.setAttribute_Width("100");
			property22.setAttribute_DisplayWidth("100");
			property22.setAttribute_Window("资源效率定义表");
			
			property23.setName("标准能力");
			property23.setAttribute_Order("55");
			property23.setAttribute_DataType("String");
			property23.setAttribute_Width("100");
			property23.setAttribute_DisplayWidth("100");
			property23.setAttribute_Window("资源效率定义表");
			
			property24.setName("最大能力");
			property24.setAttribute_Order("56");
			property24.setAttribute_DataType("String");
			property24.setAttribute_Width("100");
			property24.setAttribute_DisplayWidth("100");
			property24.setAttribute_Window("资源效率定义表");
			
			property25.setName("能力单位");
			property25.setAttribute_Order("57");
			property25.setAttribute_DataType("String");
			property25.setAttribute_Width("100");
			property25.setAttribute_DisplayWidth("100");
			property25.setAttribute_Window("资源效率定义表");
			
			property26.setName("效率");
			property26.setAttribute_Order("58");
			property26.setAttribute_DataType("String");
			property26.setAttribute_Width("100");
			property26.setAttribute_DisplayWidth("100");
			property26.setAttribute_Window("资源效率定义表");
			
			property27.setName("标准工时转换比率");
			property27.setAttribute_Order("59");
			property27.setAttribute_DataType("String");
			property27.setAttribute_Width("100");
			property27.setAttribute_DisplayWidth("100");
			property27.setAttribute_Window("资源效率定义表");
			
			property28.setName("说明");
			property28.setAttribute_Order("60");
			property28.setAttribute_DataType("String");
			property28.setAttribute_Width("200");
			property28.setAttribute_DisplayWidth("200");
			property28.setAttribute_Window("资源效率定义表");
			
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property1.getXMLElement());
			innermodel.addContent(property2.getXMLElement());
			innermodel.addContent(property3.getXMLElement());
			innermodel.addContent(property4.getXMLElement());
			innermodel.addContent(property5.getXMLElement());
			innermodel.addContent(property6.getXMLElement());
			innermodel.addContent(property7.getXMLElement());
			innermodel.addContent(property8.getXMLElement());
			innermodel.addContent(property9.getXMLElement());
			innermodel.addContent(property10.getXMLElement());
			innermodel.addContent(property11.getXMLElement());
			innermodel.addContent(property12.getXMLElement());
			innermodel.addContent(property13.getXMLElement());
			innermodel.addContent(property14.getXMLElement());
			innermodel.addContent(property15.getXMLElement());
			innermodel.addContent(property16.getXMLElement());
			innermodel.addContent(property17.getXMLElement());
			innermodel.addContent(property18.getXMLElement());
			innermodel.addContent(property19.getXMLElement());
			innermodel.addContent(property20.getXMLElement());
			innermodel.addContent(property21.getXMLElement());
			innermodel.addContent(property22.getXMLElement());
			innermodel.addContent(property23.getXMLElement());
			innermodel.addContent(property24.getXMLElement());
			innermodel.addContent(property25.getXMLElement());
			innermodel.addContent(property26.getXMLElement());
			innermodel.addContent(property27.getXMLElement());
			innermodel.addContent(property28.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			Element tableset=new Element("ObjectTableSet");
			Table table1=new Table();
			table1.setTableName("31 Outside Resource_资源类定义表");
			TableSchema tableschema1=new TableSchema();
			tableschema1.setColumnName1("资源类序号");
			tableschema1.setColumnName2("资源类编码");
			tableschema1.setColumnName3("资源类名称");
			tableschema1.setColumnName4("资源类描述");
			table1.addContents(tableschema1.getXMLElement());
			tableset.addContent(table1.getXMLElement());
			Table table2=new Table();
			table2.setTableName("31 Outside Resource_资源型定义表");
			TableSchema tableschema2=new TableSchema();
			tableschema2.setColumnName1("资源型序号");
			tableschema2.setColumnName2("资源型编码");
			tableschema2.setColumnName3("资源型名称");
			tableschema2.setColumnName4("资源型描述");
			tableschema2.setColumnName5("资源型资源数量");
			table2.addContents(tableschema2.getXMLElement());
			tableset.addContent(table2.getXMLElement());
			Table table3=new Table();
			table3.setTableName("31 Outside Resource_资源型属性定义表");
			TableSchema tableschema3=new TableSchema();
			tableschema3.setColumnName1("属性序号");
			tableschema3.setColumnName2("属性名称");
			tableschema3.setColumnName3("属性值类型");
			tableschema3.setColumnName4("属性值单位");
			tableschema3.setColumnName5("所属资源型编码");
			table3.addContents(tableschema3.getXMLElement());
			tableset.addContent(table3.getXMLElement());
			Table table4=new Table();
			table4.setTableName("31 Outside Resource_资源池定义表");
			TableSchema tableschema4=new TableSchema();
			tableschema4.setColumnName1("资源序号");
			tableschema4.setColumnName2("资源编码");
			tableschema4.setColumnName3("资源名称");
			tableschema4.setColumnName4("所属资源型");
			table1.addContents(tableschema4.getXMLElement());
			tableset.addContent(table4.getXMLElement());
			Table table5=new Table();
			table5.setTableName("31 Outside Resource_资源效率定义表");
			TableSchema tableschema5=new TableSchema();
			tableschema5.setColumnName1("效率定义序号");
			tableschema5.setColumnName2("资源(类/型)编码");
			tableschema5.setColumnName3("衡量指标");
			tableschema5.setColumnName4("指标单位");
			tableschema5.setColumnName5("标准能力");
			tableschema5.setColumnName6("最大能力");
			tableschema5.setColumnName7("能力单位");
			tableschema5.setColumnName8("效率");
			tableschema5.setColumnName9("标准工时转换比率");
			tableschema5.setColumnName10("说明");
			table1.addContents(tableschema5.getXMLElement());
			tableset.addContent(table5.getXMLElement());
			objectmodel.addContent(tableset);
			element.addContent(objectmodel);
			figure.addContent(element);
		}
		
		for(Iterator iter = inAnds.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property=new Property();
			EMPInAnd inand=(EMPInAnd)iter.next();

			String name=inand.getName();
			String proID=inand.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("2008052518155428");
			draw.setClassName("12 AND");
			draw.setClassCaption("12 AND");
			draw.setObjectID(proID);
			draw.setObjectName("12 AND"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {0, 0, 0}");
			draw.setConstraint("Rectangle(416, 210, 32, 32)");
			draw.setIcon("C:\\eclipseGEF\\icons\\flag_and.gif");
			
			property.setName("name");
			property.setValue("value");
			property.setAttribute_Order("8");
			property.setAttribute_Width("100");
			property.setAttribute_DisplayWidth("120");
			property.setAttribute_Window("Window1");
	
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			element.addContent(objectmodel);
			figure.addContent(element);
		}
		
		for(Iterator iter = inOrs.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property=new Property();
			EMPInOr inor=(EMPInOr)iter.next();

			String name=inor.getName();
			String proID=inor.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("2008052518154527");
			draw.setClassName("13 OR");
			draw.setClassCaption("13 OR");
			draw.setObjectID(proID);
			draw.setObjectName("13 OR"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {0, 0, 0}");
			draw.setConstraint("Rectangle(299, 184, 32, 32)");
			draw.setIcon("C:\\eclipseGEF\\icons\\flag_or.gif");
			
			property.setName("name");
			property.setValue("value");
			property.setAttribute_Order("1");
			property.setAttribute_Width("100");
			property.setAttribute_DisplayWidth("120");
			property.setAttribute_Window("Window1");
	
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			element.addContent(objectmodel);
			figure.addContent(element);
		}
		
		for(Iterator iter = outOrs.iterator(); iter.hasNext();){
			Element element=new Element("Element");
			Draw draw=new Draw();
			Element innermodel=new Element("Model");
			Element objectmodel=new Element("ObjectModel");
			Element objecttableset =new Element("ObjectTableSet");
			Property property=new Property();
			EMPOutOr outor=(EMPOutOr )iter.next();

			String name=outor.getName();
			String proID=outor.getId();
			draw.setType("AbstractSourceModel");
			draw.setClassID("2008052518153526");
			draw.setClassName("14 XOR");
			draw.setClassCaption("14 XOR");
			draw.setObjectID(proID);
			draw.setObjectName("14 XOR"+proID);
			draw.setObjectCaption(name);
			draw.setObjectIDBK(proID);
			draw.setCorlor("Color {0, 0, 0}");
			draw.setConstraint("Rectangle(276, 140, 32, 32)");
			draw.setIcon("C:\\eclipseGEF\\icons\\flag_xor.gif");
			
			property.setName("name");
			property.setValue("value");
			property.setAttribute_Order("1");
			property.setAttribute_Width("100");
			property.setAttribute_DisplayWidth("120");
			property.setAttribute_Window("Window1");
	
			objectmodel.addContent(objecttableset);
			innermodel.addContent(property.getXMLElement());
			element.addContent(draw.getXMLElement());
			element.addContent(innermodel);
			element.addContent(objectmodel);
			figure.addContent(element);
		}
		
	}
	public void generatePMBEModel(){
		
		Element ice=model.getXMLElement();
		Document doc = new Document(ice); //将根元素植入文档doc中
		Format format = Format.getCompactFormat();
		format.setEncoding("gb2312"); //设置xml文件的字符为gb2312
		format.setIndent("    "); //设置xml文件的缩进为4个空格
		XMLOutputter XMLOut = new XMLOutputter(format);//元素后换行一层元素缩四格 
		try {			
			File parent=new File(storePath);
			if(!parent.exists())
				parent.mkdir();
			File file=new File(storePath+"\\"+proname+".xml");
			XMLOut.output(doc, new FileOutputStream(file));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
