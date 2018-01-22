package newpmbe.oldEdition.update;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import newpmbe.process.diagram.edit.parts.*;
import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;
import newpmbe.models.transform.XMLParser;
import newpmbe.models.transform.elements.PMBEElement;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.properties.Properties;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.ChangePropertyValueRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.jdom.Element;
import vpml.processpackage.EMPClock;
import vpml.processpackage.EMPNormalActivity;
import vpml.processpackage.EMPProduct;

public class OldPMBEModel {
	private ModelManager modelManager;      //used for creating model,elements,connections and setting attributes
	private AttributeManager attributeManager;
	private File mainProcessFile;           //the main process file
	private File resourceFile;              //resource file specified by modeler
	private String modelName;               //model name
	private Map nodeEditPartMap; 
	private Map resourceMap;
	private IProgressMonitor monitor;
	
	//constructor
	public OldPMBEModel(ModelManager mmg,AttributeManager am,String modelName,File process, File rs,IProgressMonitor monitor){
		this.modelManager=mmg;
		this.mainProcessFile=process;
		this.resourceFile=rs;
		this.modelName=modelName+".process";///by fan
		this.attributeManager=am;
		nodeEditPartMap=new HashMap();
		resourceMap=new HashMap();
		this.monitor=monitor;
		
	}
	
	/**
	 * parse the old pmbe model and generate new model in IPRO
	 * @throws Exception
	 */
	public void parseAndGenerateModel() throws Exception{
		modelManager.createProcessProject(modelName);
		monitor.worked(2);
		this.parseResourceFile();
		monitor.worked(2);
		this.parseProcessFile(mainProcessFile);
		nodeEditPartMap=null;
		resourceMap=null;
		modelManager=null;
		attributeManager=null;
	}
	
	/**
	 * parse the old pmbe process file and create elements in ipro editor
	 * @param file
	 * @throws Exception 
	 */
	protected void parseProcessFile(File file) throws Exception{
		//modelManager.getCurrentDiagramEditor().close(true);
		Element root=XMLParser.parser(file).getRootElement();
		Element activities=root.getChild("Activities",PMBEElement.XMLNS );
		Element products=root.getChild("Products",PMBEElement.XMLNS);
		Element conditionals=root.getChild("Conditionals",PMBEElement.XMLNS);
		Element timers=root.getChild("Miscellaneas",PMBEElement.XMLNS);
		Element informations=root.getChild("Informations",PMBEElement.XMLNS);
		Element associations=root.getChild("Associations",PMBEElement.XMLNS);
		Element references=root.getChild("References",PMBEElement.XMLNS);
		Element timerConnections=root.getChild("TimerConnections",PMBEElement.XMLNS);
		List activityList=null;
		List productList=null;
		List conditionalList=null;
		List timerList=null;
		List informationList=null;
		List timerConnectionList=null;
		List referenceList=null;
		List associationList=null;
		List quoteConnectionList=new ArrayList();
		
		if(products!=null){
			productList=products.getChildren();
			for(int i=0;i<productList.size();i++){
				Element pro=(Element)productList.get(i);
				Map attributes=attributeManager.getAttributesFromElement(pro);
				NodeEditPart node=modelManager.createElement(getElementType(pro),attributes);
				nodeEditPartMap.put(attributeManager.getOID(pro), node);
				String xsi_type=pro.getAttributeValue("type", PMBEElement.XMLNS_XSI);
				if(xsi_type.equals("prCompositeProductType")){
					IFile currentFile = ((IFileEditorInput)modelManager.getCurrentDiagramEditor().getEditorInput()).getFile();
					modelManager.createSubProductDiagram(currentFile, pro.getChild("Name", PMBEElement.XMLNS).getText());
					//---- set diagram ID 2007-10-19
					String id=pro.getAttributeValue("ID");
					IGraphicalEditPart diagramEditPart=modelManager.getCurrentDiagramEditor().getDiagramEditPart();
					modelManager.setProcessID(diagramEditPart, id);
					//----set ended
					parseCompositeProductElement(pro);
				}
			}
		}
		if(conditionals!=null){
			conditionalList=conditionals.getChildren();
			for(int i=0;i<conditionalList.size();i++){
				Element con=(Element)conditionalList.get(i);
				Map attributes=attributeManager.getAttributesFromElement(con);
				NodeEditPart node=modelManager.createElement(getElementType(con),attributes);
				nodeEditPartMap.put(attributeManager.getOID(con), node);
			}
		}
		if(timers!=null){
			timerList=timers.getChildren();
			for(int i=0;i<timerList.size();i++){
				Element timer=(Element)timerList.get(i);
				Map attributes=attributeManager.getAttributesFromElement(timer);
				NodeEditPart node=modelManager.createElement(getElementType(timer),attributes);
				nodeEditPartMap.put(attributeManager.getOID(timer), node);
				
			}
		}
		
		if(activities!=null){
			activityList=activities.getChildren();
			for(int i=0;i<activityList.size();i++){
				Element act=(Element)activityList.get(i);
				Map attributes=attributeManager.getAttributesFromElement(act);
				NodeEditPart node=modelManager.createElement(getElementType(act), attributes);
				nodeEditPartMap.put(attributeManager.getOID(act), node);
				String xsi_type=act.getAttributeValue("type", PMBEElement.XMLNS_XSI);
				//parse sub process file
				if(xsi_type.equals("prProcessLinkType")){
					modelManager.getCurrentDiagramEditor().doSave(new NullProgressMonitor());
					
					
					String path=act.getChild("ProcessPathName",PMBEElement.XMLNS).getText();
					IFile currentFile = ((IFileEditorInput)modelManager.getCurrentDiagramEditor().getEditorInput()).getFile();
					modelManager.createSubProcessDiagram(currentFile, act.getChild("Name", PMBEElement.XMLNS).getText());
					
					//---- set diagram ID 2007-10-19
					String id=act.getAttributeValue("ID");
					IGraphicalEditPart diagramEditPart=modelManager.getCurrentDiagramEditor().getDiagramEditPart();
					modelManager.setProcessID(diagramEditPart, id);
					//---- set ended
					parseProcessFile(new File(path));
				}
			}
		}
		
		
		if(informations!=null){
			informationList=informations.getChildren();
			for(int i=0;i<informationList.size();i++){
				Element information=(Element)informationList.get(i);
				String startID=information.getAttributeValue("StartPointID");
				String endID=information.getAttributeValue("EndPointID");
				NodeEditPart startNode=(NodeEditPart)nodeEditPartMap.get(startID);
				NodeEditPart endNode=(NodeEditPart)nodeEditPartMap.get(endID);
				
				if(startNode.getPath().equals(endNode.getPath())){
					IElementType type=this.getConnectionType(information);
					if(type!=null)
						//for test
						//modelManager.createConnections(type, startNode.getEditPart(),endNode.getEditPart());
						modelManager.createConnections(type, modelManager.getEditPartById(startID), 
								modelManager.getEditPartById(endID));
				}
				else{
					this.createQuoteElement(startNode, endNode, startID, endID);
					quoteConnectionList.add(information);
				}
			}
		}
		if(timerConnections!=null){
			timerConnectionList=timerConnections.getChildren();
			for(int i=0;i<timerConnectionList.size();i++){
				Element con=(Element)timerConnectionList.get(i);
				String startID=con.getAttributeValue("StartPointID");
				String endID=con.getAttributeValue("EndPointID");
				NodeEditPart startNode=(NodeEditPart)nodeEditPartMap.get(startID);
				NodeEditPart endNode=(NodeEditPart)nodeEditPartMap.get(endID);
				if(startNode.getPath().equals(endNode.getPath())){
					IElementType type=this.getConnectionType(con);
					if(type!=null)
						modelManager.createConnections(type, modelManager.getEditPartById(startID),
								modelManager.getEditPartById(endID));
					
				}
				else{
					this.createQuoteElement(startNode, endNode,startID,endID);
					quoteConnectionList.add(con);
				}
			}
		}
		
		if(references!=null){
			referenceList=references.getChildren();
			for(int i=0;i<referenceList.size();i++){
				Element reference=(Element)referenceList.get(i);
				String startID=reference.getAttributeValue("StartPointID");
				String endID=reference.getAttributeValue("EndPointID");
				NodeEditPart startNode=(NodeEditPart)nodeEditPartMap.get(startID);
				NodeEditPart endNode=(NodeEditPart)nodeEditPartMap.get(endID);
				if(startNode.getPath().equals(endNode.getPath())){
					IElementType type=this.getConnectionType(reference);
					if(type!=null)
						modelManager.createConnections(type,modelManager.getEditPartById(startID),
								modelManager.getEditPartById(endID));
				}
				else{
					this.createQuoteElement(startNode, endNode,startID,endID);
					quoteConnectionList.add(reference);
				}
			}
		}
		//need to be refined : attributes setting
		if(associations!=null){
			associationList=associations.getChildren();
			for(int i=0;i<associationList.size();i++){
				Element association=(Element)associationList.get(i);
				String resourceID=association.getAttributeValue("StartPointID");
				if(nodeEditPartMap.get(resourceID)==null){
					Element resource=(Element)resourceMap.get(resourceID);
					Map attributes=attributeManager.getAttributesFromElement(resource);
					NodeEditPart resourceNode=modelManager.createElement(this.getElementType(resource), attributes);
					nodeEditPartMap.put(resourceID, resourceNode);
				}
			}
			for(int i=0;i<associationList.size();i++){
				Element association=(Element)associationList.get(i);
				String startID=association.getAttributeValue("StartPointID");
				String endID=association.getAttributeValue("EndPointID");
				NodeEditPart startNode=(NodeEditPart)nodeEditPartMap.get(startID);
				NodeEditPart endNode=(NodeEditPart)nodeEditPartMap.get(endID);
				IElementType type=this.getAssociationType((Element)resourceMap.get(startID),endNode.getEditPart());
				if(type!=null){
					modelManager.createConnections(type, modelManager.getEditPartById(startID),
							modelManager.getEditPartById(endID));
				}
			}
			
		}
		
		
		
		
		
		modelManager.getCurrentDiagramEditor().doSave(new NullProgressMonitor());
		IFile diagramFile=((IFileEditorInput)modelManager.getCurrentDiagramEditor().getEditorInput()).getFile();
		modelManager.saveAndCloseCurrentEditor();
		modelManager.openDiagramFile(diagramFile);
	//	modelManager.getCurrentDiagramEditor().close(false);
		
		
		for(int i=0;i<quoteConnectionList.size();i++){
			Element connection=(Element)quoteConnectionList.get(i);
			IElementType type=this.getConnectionType(connection);
			String connectionType=connection.getAttributeValue("type", PMBEElement.XMLNS_XSI);
			String startID=null;
			String endID=null;
			if(connectionType.equals("prInformationflowType")){
				startID=connection.getAttributeValue("StartPointID");
				endID=connection.getAttributeValue("EndPointID");
			}
			else if(connectionType.equals("prReferenceType")
					||connectionType.equals("prTimerConnType")){
				startID=connection.getAttributeValue("EndPointID");
				endID=connection.getAttributeValue("StartPointID");
			}
			GraphicalEditPart source=modelManager.getEditPartById(startID);
			GraphicalEditPart target=modelManager.getEditPartById(endID);
			modelManager.createConnections(type, source, target);
		}
		
		//arrange the diagram and do save operation.
		modelManager.arrangeCurrentDiagram();
		modelManager.saveAndCloseCurrentEditor();
		
		//added for test
		if(modelManager.getCurrentDiagramEditor()!=null){
			IFile diagramFile2=((IFileEditorInput)modelManager.getCurrentDiagramEditor().getEditorInput()).getFile();
			
			modelManager.getActivePage().closeEditor(modelManager.getCurrentDiagramEditor(), false);
			modelManager.openDiagramFile(diagramFile2);
		}
		//modelManager.getCurrentDiagramEditor().doSave(new NullProgressMonitor());// added
		monitor.worked(2);
	}

	
	public void parseCompositeProductElement(Element element) throws Exception{
		modelManager.getCurrentDiagramEditor().close(true);
		Element subProducts=element.getChild("Products", PMBEElement.XMLNS);
		if(subProducts==null){
			modelManager.saveAndCloseCurrentEditor();
			return;
		}
		List productList=subProducts.getChildren();
		for(int i=0;i<productList.size();i++){
			Element pro=(Element)productList.get(i);
			Map attributes=attributeManager.getAttributesFromElement(pro);
			NodeEditPart node=modelManager.createElement(getProductElementType(pro),attributes);
			nodeEditPartMap.put(attributeManager.getOID(pro), node);
			String xsi_type=pro.getAttributeValue("type", PMBEElement.XMLNS_XSI);
			if(xsi_type.equals("prCompositeProductType")){
				IFile currentFile = ((IFileEditorInput)modelManager.getCurrentDiagramEditor().getEditorInput()).getFile();
				modelManager.createSubProductDiagram(currentFile, pro.getChild("Name", PMBEElement.XMLNS).getText());
				parseCompositeProductElement(pro);
			}
		}
		modelManager.arrangeCurrentDiagram();
		modelManager.saveAndCloseCurrentEditor();
		//monitor.worked(1);
		
	}
	/**
	 * parse the old pmbe resource file and create elements in ipro editor
	 */
	public void parseResourceFile(){
		Element root=XMLParser.parser(resourceFile).getRootElement();
		Element resources=root.getChild("resources", PMBEElement.XMLNS);
		if(resources!=null){
			List resourceList=resources.getChildren();
			for(int i=0;i<resourceList.size();i++){
				Element rsObject=(Element)resourceList.get(i);
				String ID=rsObject.getAttributeValue("ID");
				resourceMap.put(ID, rsObject);
			}
		}
	}
	
	/**
	 * define the mapping rules 
	 * @param element
	 * @return
	 */
	public IElementType getElementType(Element element){
		String type=element.getName();
		String xsi_type=element.getAttributeValue("type", PMBEElement.XMLNS_XSI);
		if(type.equals("Activity")){
			if(xsi_type.equals("prManualActivityType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPNormalActivity_2044;
			if(xsi_type.equals("prAutoActivityType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPAutoActivity_2047;
			if(xsi_type.equals("prBatActivityType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPManualBatchActivity_2046;
			if(xsi_type.equals("prAutoBatActivityType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPAutoBatchActivity_2048;
			if(xsi_type.equals("prProcessLinkType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPCompActivity_2045;
		}
		if(type.equals("Product")){
			if(xsi_type.equals("prDocumentType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPDocument_2025;
			if(xsi_type.equals("prArtifactType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPArtifact_2037;
			if(xsi_type.equals("prMessageType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPMessage_2029;
			if(xsi_type.equals("prFolderType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPOther_2028;
			if(xsi_type.equals("prCompositeProductType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPProductPackage_2026;
		}
		if(type.equals("Conditional")){
			if(xsi_type.equals("prInputAndType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPInAnd_2034;
			if(xsi_type.equals("prInputOrType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPInOr_2035;
			if(xsi_type.equals("prOutputAndType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPOutAnd_2031;
			if(xsi_type.equals("prOutputOrType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPOutOr_2024;
		}
		if(type.equals("Miscellanea")){
			if(xsi_type.equals("prTimerType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPClock_2033;
		}
		if(type.equals("rsObject")){
			if(xsi_type.equals("rsMachineType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMRMachineType_2041;
			if(xsi_type.equals("rsLocationType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMRLocationType_2042;
			if(xsi_type.equals("rsRole"))//rsToolType
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMRRole_2040;
			if(xsi_type.equals("rsToolType"))
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMRToolType_2039;
		}
		return null;
	}
	
	
	/**
	 * get the product type specified in the product diagram
	 * @param element
	 * @return
	 */
	public IElementType getProductElementType(Element element){
		String type=element.getName();
		String xsi_type=element.getAttributeValue("type", PMBEElement.XMLNS_XSI);

		if(xsi_type.equals("prDocumentType"))
			return newpmbe.product.diagram.providers.NewPMBEElementTypes.EMPDocument_2002;
		if(xsi_type.equals("prArtifactType"))
			return newpmbe.product.diagram.providers.NewPMBEElementTypes.EMPArtifact_2001;
		if(xsi_type.equals("prMessageType"))
			return newpmbe.product.diagram.providers.NewPMBEElementTypes.EMPMessage_2003;
		if(xsi_type.equals("prFolderType"))
			return newpmbe.product.diagram.providers.NewPMBEElementTypes.EMPOther_2004;
		if(xsi_type.equals("prCompositeProductType"))
			return newpmbe.product.diagram.providers.NewPMBEElementTypes.EMPProductPackage_2005;
		return null;
	}
	
	/**
	 * 
	 * @param source
	 * @param target
	 * @return if null, the connection is not allowed in IPRO.
	 */
	public IElementType getConnectionType(Element element){
		String type=element.getName();
		String xsi_type=element.getAttributeValue("type", PMBEElement.XMLNS_XSI);
		String startID=null;
		String endID=null;
		NodeEditPart startNode=null;
		NodeEditPart endNode=null;
		GraphicalEditPart startEditPart=null;
		GraphicalEditPart endEditPart=null;
		//information flow
		if(xsi_type.equals("prInformationflowType")){
			startID=element.getAttributeValue("StartPointID");
			endID=element.getAttributeValue("EndPointID");
			startNode=(NodeEditPart)nodeEditPartMap.get(startID);
			endNode=(NodeEditPart)nodeEditPartMap.get(endID);
			
			startEditPart=startNode.getEditPart();
			endEditPart=endNode.getEditPart();
			if(startEditPart instanceof EMPDocumentEditPart
					||startEditPart instanceof EMPArtifactEditPart
					||startEditPart instanceof EMPOtherEditPart
					||startEditPart instanceof EMPMessageEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPDocumentEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPArtifactEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPOtherEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPMessageEditPart){
				if(endEditPart instanceof EMPNormalActivityEditPart ||
						endEditPart instanceof EMPManualBatchActivityEditPart
						|| endEditPart instanceof EMPCompActivityEditPart
						||endEditPart instanceof EMPAutoActivityEditPart
						||endEditPart instanceof EMPAutoBatchActivityEditPart)
					return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPDataFlow_4002;
				if(endEditPart instanceof EMPInAndEditPart)
					return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPDataFlow_4016;
				if(endEditPart instanceof EMPInOrEditPart)
					return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPDataFlow_4017;
			}
			if(startEditPart instanceof EMPProductPackageEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPProductPackageEditPart){
				if(endEditPart instanceof EMPNormalActivityEditPart 
						||endEditPart instanceof EMPAutoActivityEditPart
						||endEditPart instanceof EMPManualBatchActivityEditPart
						||endEditPart instanceof EMPAutoBatchActivityEditPart
						|| endEditPart instanceof EMPCompActivityEditPart)
					return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPDataFlow_4002;
			}
			if(startEditPart instanceof EMPNormalActivityEditPart
					||startEditPart instanceof EMPAutoActivityEditPart
					||startEditPart instanceof EMPManualBatchActivityEditPart
					||startEditPart instanceof EMPAutoBatchActivityEditPart){
				if(endEditPart instanceof EMPDocumentEditPart
						||endEditPart instanceof EMPArtifactEditPart
						||endEditPart instanceof EMPOtherEditPart
						||endEditPart instanceof EMPMessageEditPart
						||endEditPart instanceof EMPProductPackageEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPDocumentEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPArtifactEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPOtherEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPMessageEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPProductPackageEditPart)
					return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPDataFlow_4005;
				if(endEditPart instanceof EMPOutAndEditPart)
					return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPDataFlow_4020;
				if(endEditPart instanceof EMPOutOrEditPart)
					return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPDataFlow_4021;
			}
			if(startEditPart instanceof EMPCompActivityEditPart){
				if(endEditPart instanceof EMPDocumentEditPart
						||endEditPart instanceof EMPArtifactEditPart
						||endEditPart instanceof EMPOtherEditPart
						||endEditPart instanceof EMPMessageEditPart
						||endEditPart instanceof EMPProductPackageEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPDocumentEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPArtifactEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPOtherEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPMessageEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPProductPackageEditPart)
					return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPDataFlow_4005;
				
			}
			if(startEditPart instanceof EMPInAndEditPart){
				if(endEditPart instanceof EMPInOrEditPart)
					//return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPDataFlow_4003;
					return null;//元模型错误
				if(endEditPart instanceof EMPNormalActivityEditPart
						||endEditPart instanceof EMPAutoActivityEditPart
						||endEditPart instanceof EMPManualBatchActivityEditPart
						||endEditPart instanceof EMPAutoBatchActivityEditPart)
					return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPDataFlow_4018;
			}
			if(startEditPart instanceof EMPInOrEditPart){
				if(endEditPart instanceof EMPInAndEditPart)
					//return newPmbe.process.diagram.providers.NewpmbeElementTypes.EMPDataFlow_4004;
					return null;//元模型错误
				if(endEditPart instanceof EMPNormalActivityEditPart
						||endEditPart instanceof EMPAutoActivityEditPart
						||endEditPart instanceof EMPManualBatchActivityEditPart
						||endEditPart instanceof EMPAutoBatchActivityEditPart)
					return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPDataFlow_4019;
			}
			if(startEditPart instanceof EMPOutAndEditPart){
				if(endEditPart instanceof EMPOutOrEditPart)
					//return newPmbe.process.diagram.providers.NewpmbeElementTypes.EMPDataFlow_4005;
					return null;//元模型错误
				if(endEditPart instanceof EMPDocumentEditPart
						||endEditPart instanceof EMPArtifactEditPart
						||endEditPart instanceof EMPOtherEditPart
						||endEditPart instanceof EMPMessageEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPDocumentEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPArtifactEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPOtherEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPMessageEditPart)
					return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPDataFlow_4022;
			}
			if(startEditPart instanceof EMPOutOrEditPart){
				if(endEditPart instanceof EMPOutAndEditPart)
					//return newPmbe.process.diagram.providers.NewpmbeElementTypes.EMPDataFlow_4006;
					return null;//元模型错误
				if(endEditPart instanceof EMPDocumentEditPart
						||endEditPart instanceof EMPArtifactEditPart
						||endEditPart instanceof EMPOtherEditPart
						||endEditPart instanceof EMPMessageEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPDocumentEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPArtifactEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPOtherEditPart
						||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPMessageEditPart)
					return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPDataFlow_4023;
			}
		}
		if(xsi_type.equals("prTimerConnType")){
			startID=element.getAttributeValue("StartPointID");
			endID=element.getAttributeValue("EndPointID");
			startNode=(NodeEditPart)nodeEditPartMap.get(startID);
			endNode=(NodeEditPart)nodeEditPartMap.get(endID);
			startEditPart=startNode.getEditPart();
			endEditPart=endNode.getEditPart();
			//In IPRO, the connection between clock and composite activity is not allowed, while allowed in PMBE
			if(startEditPart instanceof EMPClockEditPart){
				if(endEditPart instanceof EMPNormalActivityEditPart
						||endEditPart instanceof EMPAutoActivityEditPart
						||endEditPart instanceof EMPManualBatchActivityEditPart
						||endEditPart instanceof EMPAutoBatchActivityEditPart
						||endEditPart instanceof EMPCompActivityEditPart)
					return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPClockFlow_4001;
			}
		}
		if(xsi_type.equals("prReferenceType")){
			startID=element.getAttributeValue("StartPointID");
			endID=element.getAttributeValue("EndPointID");
			startNode=(NodeEditPart)nodeEditPartMap.get(startID);
			endNode=(NodeEditPart)nodeEditPartMap.get(endID);
			startEditPart=startNode.getEditPart();
			endEditPart=endNode.getEditPart();
			if(startEditPart instanceof EMPDocumentEditPart
					||startEditPart instanceof EMPArtifactEditPart
					||startEditPart instanceof EMPOtherEditPart
					||startEditPart instanceof EMPMessageEditPart
					||startEditPart instanceof EMPProductPackageEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPDocumentEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPArtifactEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPOtherEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPProductPackageEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPMessageEditPart){
				if(endEditPart instanceof EMPNormalActivityEditPart
						||endEditPart instanceof EMPAutoActivityEditPart
						||endEditPart instanceof EMPManualBatchActivityEditPart
						||endEditPart instanceof EMPAutoBatchActivityEditPart
						||endEditPart instanceof EMPCompActivityEditPart)
					return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPRefFlow_4004;
			}
		}
		if(type.equals("prAssociationType")){
			
		}
		
		return null;
	}
	
	public IElementType getAssociationType(Element resource,GraphicalEditPart endEditPart){
		String xsi_type=resource.getAttributeValue("type", PMBEElement.XMLNS_XSI);
		if(xsi_type.equals("rsMachineType")){
			if(endEditPart instanceof EMPNormalActivityEditPart)
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPAssFlow_4006;
			if(endEditPart instanceof EMPAutoActivityEditPart)
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPAssFlow_4012;
			if(endEditPart instanceof EMPManualBatchActivityEditPart)
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPAssFlow_4014;
			if(endEditPart instanceof EMPAutoBatchActivityEditPart)
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPAssFlow_4013;
		}
		if(xsi_type.equals("rsLocationType")){
			if(endEditPart instanceof EMPNormalActivityEditPart)
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPAssFlow_4015;
			if(endEditPart instanceof EMPAutoActivityEditPart)
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPAssFlow_4025;
			if(endEditPart instanceof EMPManualBatchActivityEditPart)
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPAssFlow_4027;
			if(endEditPart instanceof EMPAutoBatchActivityEditPart)
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPAssFlow_4026;
		}
		if(xsi_type.equals("rsRole")){
			if(endEditPart instanceof EMPNormalActivityEditPart)
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPAssFlow_4028;
			if(endEditPart instanceof EMPManualBatchActivityEditPart)
				return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPAssFlow_4029;
		}
		if(xsi_type.equals("rsToolType"))
			return newpmbe.process.diagram.providers.NewPMBEElementTypes.EMPAssFlow_4003;
		return null;
	}
	
	/**
	 * 
	 * @param startNode
	 * @param endNode
	 */
	public void createQuoteElement(NodeEditPart startNode, NodeEditPart endNode,String startID,String endID){
		GraphicalEditPart startEditPart=startNode.getEditPart();
		GraphicalEditPart endEditPart=endNode.getEditPart();
		if(!startNode.getPath().equals(modelManager.getCurrentFile().getLocation().toString())){
			if(startEditPart instanceof EMPDocumentEditPart
					||startEditPart instanceof EMPArtifactEditPart
					||startEditPart instanceof EMPOtherEditPart
					||startEditPart instanceof EMPMessageEditPart
					||startEditPart instanceof EMPProductPackageEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPDocumentEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPArtifactEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPOtherEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPMessageEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPProductPackageEditPart){
				EMPProduct data=(EMPProduct)((NodeImpl)startEditPart.getModel()).getElement();
				EObjectAdapter objAdapter = new EObjectAdapter(data);
				CreateViewRequest.ViewDescriptor viewDescriptor = new CreateViewRequest.ViewDescriptor(
						objAdapter, Node.class, null,
						NewPMBEDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				CreateViewRequest cvRequest = new CreateViewRequest(
						(viewDescriptor));
				Command cmd=modelManager.getCurrentDiagramEditor().getDiagramEditPart().getCommand(cvRequest);
				modelManager.getCurrentDiagramEditor().getDiagramEditDomain().getDiagramCommandStack().execute(cmd);
				//to change the color by fan 07-10-1
				Color color = new Color(null, 255, 255, 0);
				ChangePropertyValueRequest req = new ChangePropertyValueRequest(StringStatics.BLANK, Properties.ID_FILLCOLOR, FigureUtilities.colorToInteger(color));
				Command c = modelManager.getEditPartById(data.getId()).getCommand(req);
				modelManager.getCurrentDiagramEditor().getDiagramEditDomain().getDiagramCommandStack().execute(c);
				
				
				
			}
		}
		else if(!endNode.getPath().equals(modelManager.getCurrentFile().getLocation().toString())){
			if(endEditPart instanceof EMPDocumentEditPart
					||endEditPart instanceof EMPArtifactEditPart
					||endEditPart instanceof EMPOtherEditPart
					||endEditPart instanceof EMPMessageEditPart
					||endEditPart instanceof EMPProductPackageEditPart
					||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPDocumentEditPart
					||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPArtifactEditPart
					||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPOtherEditPart
					||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPMessageEditPart
					||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPProductPackageEditPart){
				EMPProduct data=(EMPProduct)((NodeImpl)endEditPart.getModel()).getElement();
				EObjectAdapter objAdapter = new EObjectAdapter(data);
				CreateViewRequest.ViewDescriptor viewDescriptor = new CreateViewRequest.ViewDescriptor(
						objAdapter, Node.class, null,
						NewPMBEDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				CreateViewRequest cvRequest = new CreateViewRequest(
						(viewDescriptor));
				Command cmd=modelManager.getCurrentDiagramEditor().getDiagramEditPart().getCommand(cvRequest);
				modelManager.getCurrentDiagramEditor().getDiagramEditDomain().getDiagramCommandStack().execute(cmd);
				//to change the color by fan 07-10-1
				Color color = new Color(null, 0, 255, 255);
				ChangePropertyValueRequest req = new ChangePropertyValueRequest(StringStatics.BLANK, Properties.ID_FILLCOLOR, FigureUtilities.colorToInteger(color));
				Command c = modelManager.getEditPartById(data.getId()).getCommand(req);
				modelManager.getCurrentDiagramEditor().getDiagramEditDomain().getDiagramCommandStack().execute(c);
				
			}
			if(endEditPart instanceof EMPClockEditPart){
				EMPClock data=(EMPClock)((NodeImpl)endEditPart.getModel()).getElement();
				EObjectAdapter objAdapter = new EObjectAdapter(data);
				CreateViewRequest.ViewDescriptor viewDescriptor = new CreateViewRequest.ViewDescriptor(
						objAdapter, Node.class, null,
						NewPMBEDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				CreateViewRequest cvRequest = new CreateViewRequest(
						(viewDescriptor));
				Command cmd=modelManager.getCurrentDiagramEditor().getDiagramEditPart().getCommand(cvRequest);
				modelManager.getCurrentDiagramEditor().getDiagramEditDomain().getDiagramCommandStack().execute(cmd);
				//to change the color by fan 07-10-1
				Color color = new Color(null, 255, 255, 0);
				ChangePropertyValueRequest req = new ChangePropertyValueRequest(StringStatics.BLANK, Properties.ID_FILLCOLOR, FigureUtilities.colorToInteger(color));
				Command c = modelManager.getEditPartById(data.getId()).getCommand(req);
				modelManager.getCurrentDiagramEditor().getDiagramEditDomain().getDiagramCommandStack().execute(c);
				
			}
		}
	}
	
	/**
	 * create connections when the startnode and the end node are not in the same diagram.
	 * in this situation, we need to create a reference view to one of the nodes first, 
	 * and then create connection between the two editParts. 
	 * @param type
	 * @param startNode
	 * @param endNode
	 */
	public void createQuoteConnection(IElementType type,NodeEditPart startNode,NodeEditPart endNode){
		GraphicalEditPart startEditPart=startNode.getEditPart();
		GraphicalEditPart endEditPart=endNode.getEditPart();
		DiagramDocumentEditor editor1 =(DiagramDocumentEditor)modelManager.getActivePage().getActiveEditor();
		IWorkbenchPage activePage=modelManager.getActivePage();
		//editor1.doSave(new NullProgressMonitor());
		if(!startNode.getPath().equals(modelManager.getCurrentFile().getLocation().toString())){
			if(startEditPart instanceof EMPDocumentEditPart
					||startEditPart instanceof EMPArtifactEditPart
					||startEditPart instanceof EMPOtherEditPart
					||startEditPart instanceof EMPMessageEditPart
					||startEditPart instanceof EMPProductPackageEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPDocumentEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPArtifactEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPOtherEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPMessageEditPart
					||startEditPart instanceof newpmbe.product.diagram.edit.parts.EMPProductPackageEditPart){
				EMPProduct data=(EMPProduct)((NodeImpl)startEditPart.getModel()).getElement();
				EObjectAdapter objAdapter = new EObjectAdapter(data);
				CreateViewRequest.ViewDescriptor viewDescriptor = new CreateViewRequest.ViewDescriptor(
						objAdapter, Node.class, null,
						NewPMBEDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				CreateViewRequest cvRequest = new CreateViewRequest(
						(viewDescriptor));
				Command cmd=editor1.getDiagramEditPart().getCommand(cvRequest);
				editor1.getDiagramEditDomain().getDiagramCommandStack().execute(cmd);
				editor1.doSave(new NullProgressMonitor());
				IFile activeEditorFile = ((IFileEditorInput)editor1.getEditorInput()).getFile();
				//activePage.closeEditor(editor1, true);
				//modelManager.openDiagramFile(activeEditorFile);
				//editor1=(DiagramDocumentEditor)activePage.getActiveEditor();
				startEditPart=(GraphicalEditPart)editor1.getDiagramEditPart().getChildren().get(
						editor1.getDiagramEditPart().getChildren().size()-1);
			}
			
			
			
		}
		else if(!endNode.getPath().equals(modelManager.getCurrentFile().getLocation().toString())){
			if(endEditPart instanceof EMPDocumentEditPart
					||endEditPart instanceof EMPArtifactEditPart
					||endEditPart instanceof EMPOtherEditPart
					||endEditPart instanceof EMPMessageEditPart
					||endEditPart instanceof EMPProductPackageEditPart
					||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPDocumentEditPart
					||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPArtifactEditPart
					||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPOtherEditPart
					||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPMessageEditPart
					||endEditPart instanceof newpmbe.product.diagram.edit.parts.EMPProductPackageEditPart){
				EMPProduct data=(EMPProduct)((NodeImpl)endEditPart.getModel()).getElement();
				EObjectAdapter objAdapter = new EObjectAdapter(data);
				CreateViewRequest.ViewDescriptor viewDescriptor = new CreateViewRequest.ViewDescriptor(
						objAdapter, Node.class, null,
						NewPMBEDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				CreateViewRequest cvRequest = new CreateViewRequest(
						(viewDescriptor));
				Command cmd=modelManager.getCurrentDiagramEditor().getDiagramEditPart().getCommand(cvRequest);
				modelManager.getCurrentDiagramEditor().getDiagramEditDomain().getDiagramCommandStack().execute(cmd);
				modelManager.getCurrentDiagramEditor().doSave(new NullProgressMonitor());
				IFile activeEditorFile = ((IFileEditorInput)modelManager.getCurrentDiagramEditor().getEditorInput()).getFile();
				//modelManager.getActivePage().closeEditor(modelManager.getCurrentDiagramEditor(), false);
				//modelManager.openDiagramFile(activeEditorFile);
				endEditPart=(GraphicalEditPart)modelManager.getCurrentDiagramEditor().getDiagramEditPart().getChildren().get(
						modelManager.getCurrentDiagramEditor().getDiagramEditPart().getChildren().size()-1);
			}
			if(endEditPart instanceof EMPClockEditPart){
				EMPClock data=(EMPClock)((NodeImpl)endEditPart.getModel()).getElement();
				EObjectAdapter objAdapter = new EObjectAdapter(data);
				CreateViewRequest.ViewDescriptor viewDescriptor = new CreateViewRequest.ViewDescriptor(
						objAdapter, Node.class, null,
						NewPMBEDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				CreateViewRequest cvRequest = new CreateViewRequest(
						(viewDescriptor));
				Command cmd=modelManager.getCurrentDiagramEditor().getDiagramEditPart().getCommand(cvRequest);
				modelManager.getCurrentDiagramEditor().getDiagramEditDomain().getDiagramCommandStack().execute(cmd);
				modelManager.getCurrentDiagramEditor().doSave(new NullProgressMonitor());
				IFile activeEditorFile = ((IFileEditorInput)modelManager.getCurrentDiagramEditor().getEditorInput()).getFile();
				//modelManager.getActivePage().closeEditor(modelManager.getCurrentDiagramEditor(), false);
				//modelManager.openDiagramFile(activeEditorFile);
				endEditPart=(GraphicalEditPart)modelManager.getCurrentDiagramEditor().getDiagramEditPart().getChildren().get(
						modelManager.getCurrentDiagramEditor().getDiagramEditPart().getChildren().size()-1);
			
			}
		}
		
		//modelManager.createConnections(type, startEditPart, endEditPart);
		
	}
	
	
}
