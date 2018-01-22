package newpmbe.oldEdition.update;

import java.util.HashMap;
import java.util.Map;
import newpmbe.models.transform.elements.*;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.jdom.Element;
import vpml.organizationpackage.OrganizationpackagePackage;
import vpml.processpackage.ProcesspackagePackage;
import vpml.resourcepackage.ResourcepackagePackage;
import vpml.utilpackage.EnumIOType;

public class AttributeManager {
	private EStructuralFeature normalActivityName;
	private EStructuralFeature normalActivityId;
	private EStructuralFeature normalActivityDescription;
	private EStructuralFeature normalActivityPriority;
	private EStructuralFeature normalActivityTimeUnit;
	private EStructuralFeature normalActivityProcedure;
	
	private EStructuralFeature autoActivityName;
	private EStructuralFeature autoActivityId;
	private EStructuralFeature autoActivityDescription;
	private EStructuralFeature autoActivityPriority;
	
	private EStructuralFeature batchActivityName;
	private EStructuralFeature batchActivityId;
	private EStructuralFeature batchActivityDescription;
	private EStructuralFeature batchActivityPriority;
	
	private EStructuralFeature autoBatchActivityName;
	private EStructuralFeature autoBatchActivityId;
	private EStructuralFeature autoBatchActivityDescription;
	private EStructuralFeature autoBatchActivityPriority;
	
	private EStructuralFeature compActivityName;
	private EStructuralFeature compActivityId;
	private EStructuralFeature compActivityDescription;
	
	private EStructuralFeature documentName;
	private EStructuralFeature documentId;
	private EStructuralFeature documentDescription;
	private EStructuralFeature documentIOType;
	private EStructuralFeature documentInitValue;
	private EStructuralFeature documentPeriod;
	private EStructuralFeature documentTimeUnit;

	
	private EStructuralFeature artifactName;
	private EStructuralFeature artifactId;
	private EStructuralFeature artifactDescription;
	
	private EStructuralFeature otherName;
	private EStructuralFeature otherId;
	private EStructuralFeature otherDescription;
	
	private EStructuralFeature messageName;
	private EStructuralFeature messageId;
	private EStructuralFeature messageDescription;
	
	private EStructuralFeature productPackageName;
	private EStructuralFeature productPackageId;
	private EStructuralFeature productPackageDescription;
	
	private EStructuralFeature roleName;
	private EStructuralFeature roleId;
	private EStructuralFeature roleDescription;
	private EStructuralFeature roleCostPerUnit;
	private EStructuralFeature roleEfficiency;
	private EStructuralFeature roleAvailableAmount;
	private EStructuralFeature roleTotalAmount;
	private EStructuralFeature roleUsageAmount;
	
	private EStructuralFeature machineName;
	private EStructuralFeature machineId;
	private EStructuralFeature machineDescription;
	
	private EStructuralFeature locationName;
	private EStructuralFeature locationId;
	private EStructuralFeature locationDescription;
	
	private EStructuralFeature toolName;
	private EStructuralFeature toolId;
	private EStructuralFeature toolDescription;
	
	private EStructuralFeature clockName;
	private EStructuralFeature clockId;
	private EStructuralFeature clockDescription;
	private EStructuralFeature clockStartTime;
	private EStructuralFeature clockEndTime;
	private EStructuralFeature clockIntervalUnit;
	private EStructuralFeature clockInterval;
	private EStructuralFeature clockTimeUnit;
	private EStructuralFeature clockRestartPeriod;
	
	private EStructuralFeature inAndName;
	private EStructuralFeature inAndId;
	private EStructuralFeature inAndDescription;
	
	private EStructuralFeature inOrName;
	private EStructuralFeature inOrId;
	private EStructuralFeature inOrDescription;
	
	private EStructuralFeature outAndName;
	private EStructuralFeature outAndId;
	private EStructuralFeature outAndDescription;
	
	private EStructuralFeature outOrName;
	private EStructuralFeature outOrId;
	private EStructuralFeature outOrDescription;
	
	
	
	public AttributeManager(){
		normalActivityName = ProcesspackagePackage.Literals.EMP_NORMAL_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_NORMAL_ACTIVITY__NAME);
		normalActivityId = ProcesspackagePackage.Literals.EMP_NORMAL_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_NORMAL_ACTIVITY__ID);
		normalActivityDescription = ProcesspackagePackage.Literals.EMP_NORMAL_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_NORMAL_ACTIVITY__DESCRIPTION);
		normalActivityPriority = ProcesspackagePackage.Literals.EMP_NORMAL_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_NORMAL_ACTIVITY__PRIORITY);
		normalActivityTimeUnit= ProcesspackagePackage.Literals.EMP_NORMAL_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_NORMAL_ACTIVITY__TIME_UNIT);
		normalActivityProcedure= ProcesspackagePackage.Literals.EMP_NORMAL_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_NORMAL_ACTIVITY__PROCEDURE);
		
		autoActivityName = ProcesspackagePackage.Literals.EMP_AUTO_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_AUTO_ACTIVITY__NAME);
		autoActivityId = ProcesspackagePackage.Literals.EMP_AUTO_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_AUTO_ACTIVITY__ID);
		autoActivityDescription = ProcesspackagePackage.Literals.EMP_AUTO_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_AUTO_ACTIVITY__DESCRIPTION);
		autoActivityPriority = ProcesspackagePackage.Literals.EMP_AUTO_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_AUTO_ACTIVITY__PRIORITY);
		
		
		batchActivityName = ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_BATCH_ACTIVITY__NAME);
		batchActivityId = ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_BATCH_ACTIVITY__ID);
		batchActivityDescription = ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_BATCH_ACTIVITY__DESCRIPTION);
		batchActivityPriority = ProcesspackagePackage.Literals.EMP_BATCH_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_BATCH_ACTIVITY__PRIORITY);
		
		autoBatchActivityName = ProcesspackagePackage.Literals.EMP_AUTO_BATCH_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_AUTO_BATCH_ACTIVITY__NAME);
		autoBatchActivityId = ProcesspackagePackage.Literals.EMP_AUTO_BATCH_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_AUTO_BATCH_ACTIVITY__ID);
		autoBatchActivityDescription = ProcesspackagePackage.Literals.EMP_AUTO_BATCH_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_AUTO_BATCH_ACTIVITY__DESCRIPTION);
		autoBatchActivityPriority = ProcesspackagePackage.Literals.EMP_AUTO_BATCH_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_AUTO_BATCH_ACTIVITY__PRIORITY);
		
		
		compActivityName = ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_COMP_ACTIVITY__NAME);
		compActivityId = ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_COMP_ACTIVITY__ID);
		compActivityDescription = ProcesspackagePackage.Literals.EMP_COMP_ACTIVITY.getEStructuralFeature(ProcesspackagePackage.EMP_COMP_ACTIVITY__DESCRIPTION);
		
		documentName = ProcesspackagePackage.Literals.EMP_DOCUMENT.getEStructuralFeature(ProcesspackagePackage.EMP_DOCUMENT__NAME);
		documentId = ProcesspackagePackage.Literals.EMP_DOCUMENT.getEStructuralFeature(ProcesspackagePackage.EMP_DOCUMENT__ID);
		documentDescription = ProcesspackagePackage.Literals.EMP_DOCUMENT.getEStructuralFeature(ProcesspackagePackage.EMP_DOCUMENT__DESCRIPTION);
		documentIOType= ProcesspackagePackage.Literals.EMP_DOCUMENT.getEStructuralFeature(ProcesspackagePackage.EMP_DOCUMENT__IO_TYPE);
		documentInitValue= ProcesspackagePackage.Literals.EMP_DOCUMENT.getEStructuralFeature(ProcesspackagePackage.EMP_DOCUMENT__INIT_QUEUE);
		documentPeriod= ProcesspackagePackage.Literals.EMP_DOCUMENT.getEStructuralFeature(ProcesspackagePackage.EMP_DOCUMENT__PERIOD);
		documentTimeUnit= ProcesspackagePackage.Literals.EMP_DOCUMENT.getEStructuralFeature(ProcesspackagePackage.EMP_DOCUMENT__TIME_UNIT);
		
		artifactName = ProcesspackagePackage.Literals.EMP_ARTIFACT.getEStructuralFeature(ProcesspackagePackage.EMP_ARTIFACT__NAME);
		artifactId = ProcesspackagePackage.Literals.EMP_ARTIFACT.getEStructuralFeature(ProcesspackagePackage.EMP_ARTIFACT__ID);
		artifactDescription = ProcesspackagePackage.Literals.EMP_ARTIFACT.getEStructuralFeature(ProcesspackagePackage.EMP_ARTIFACT__DESCRIPTION);
		
		otherName = ProcesspackagePackage.Literals.EMP_OTHER.getEStructuralFeature(ProcesspackagePackage.EMP_OTHER__NAME);
		otherId = ProcesspackagePackage.Literals.EMP_OTHER.getEStructuralFeature(ProcesspackagePackage.EMP_OTHER__ID);
		otherDescription = ProcesspackagePackage.Literals.EMP_OTHER.getEStructuralFeature(ProcesspackagePackage.EMP_OTHER__DESCRIPTION);
		
		messageName = ProcesspackagePackage.Literals.EMP_MESSAGE.getEStructuralFeature(ProcesspackagePackage.EMP_MESSAGE__NAME);
		messageId = ProcesspackagePackage.Literals.EMP_MESSAGE.getEStructuralFeature(ProcesspackagePackage.EMP_MESSAGE__ID);
		messageDescription = ProcesspackagePackage.Literals.EMP_MESSAGE.getEStructuralFeature(ProcesspackagePackage.EMP_MESSAGE__DESCRIPTION);
		
		
		productPackageName = ProcesspackagePackage.Literals.EMP_PRODUCT_PACKAGE.getEStructuralFeature(ProcesspackagePackage.EMP_PRODUCT_PACKAGE__NAME);
		productPackageId = ProcesspackagePackage.Literals.EMP_PRODUCT_PACKAGE.getEStructuralFeature(ProcesspackagePackage.EMP_PRODUCT_PACKAGE__ID);
		productPackageDescription = ProcesspackagePackage.Literals.EMP_PRODUCT_PACKAGE.getEStructuralFeature(ProcesspackagePackage.EMP_PRODUCT_PACKAGE__DESCRIPTION);
		
		roleName = ResourcepackagePackage.Literals.EMR_ROLE.getEStructuralFeature(ResourcepackagePackage.EMR_ROLE__NAME);
		roleId = ResourcepackagePackage.Literals.EMR_ROLE.getEStructuralFeature(ResourcepackagePackage.EMR_ROLE__ID);
		roleDescription=ResourcepackagePackage.Literals.EMR_ROLE.getEStructuralFeature(ResourcepackagePackage.EMR_ROLE__DESCRIPTION);
		roleCostPerUnit=ResourcepackagePackage.Literals.EMR_ROLE.getEStructuralFeature(ResourcepackagePackage.EMR_ROLE__COST_PER_UNIT);
		roleEfficiency=ResourcepackagePackage.Literals.EMR_ROLE.getEStructuralFeature(ResourcepackagePackage.EMR_ROLE__EFFICIENCY);
		roleAvailableAmount=ResourcepackagePackage.Literals.EMR_ROLE.getEStructuralFeature(ResourcepackagePackage.EMR_ROLE__AVAILABLE_AMOUNT);
		roleTotalAmount=ResourcepackagePackage.Literals.EMR_ROLE.getEStructuralFeature(ResourcepackagePackage.EMR_ROLE__TOTAL_AMOUNT);
		roleUsageAmount=ResourcepackagePackage.Literals.EMR_ROLE.getEStructuralFeature(ResourcepackagePackage.EMR_ROLE__USAGE_AMOUNT);
		
		machineName = ResourcepackagePackage.Literals.EMR_MACHINE_TYPE.getEStructuralFeature(ResourcepackagePackage.EMR_MACHINE_TYPE__NAME);
		machineId = ResourcepackagePackage.Literals.EMR_MACHINE_TYPE.getEStructuralFeature(ResourcepackagePackage.EMR_MACHINE_TYPE__ID);
		machineDescription=ResourcepackagePackage.Literals.EMR_MACHINE_TYPE.getEStructuralFeature(ResourcepackagePackage.EMR_MACHINE_TYPE__DESCRIPTION);
		
		locationName=ResourcepackagePackage.Literals.EMR_LOCATION_TYPE.getEStructuralFeature(ResourcepackagePackage.EMR_LOCATION_TYPE__NAME);
		locationId = ResourcepackagePackage.Literals.EMR_LOCATION_TYPE.getEStructuralFeature(ResourcepackagePackage.EMR_LOCATION_TYPE__ID);
		locationDescription=ResourcepackagePackage.Literals.EMR_LOCATION_TYPE.getEStructuralFeature(ResourcepackagePackage.EMR_LOCATION_TYPE__DESCRIPTION);
		
		toolName=ResourcepackagePackage.Literals.EMR_TOOL_TYPE.getEStructuralFeature(ResourcepackagePackage.EMR_TOOL_TYPE__NAME);
		toolId = ResourcepackagePackage.Literals.EMR_TOOL_TYPE.getEStructuralFeature(ResourcepackagePackage.EMR_TOOL_TYPE__ID);
		toolDescription=ResourcepackagePackage.Literals.EMR_TOOL_TYPE.getEStructuralFeature(ResourcepackagePackage.EMR_TOOL_TYPE__DESCRIPTION);
		
		
		clockName = ProcesspackagePackage.Literals.EMP_CLOCK.getEStructuralFeature(ProcesspackagePackage.EMP_CLOCK__NAME);
		clockId = ProcesspackagePackage.Literals.EMP_CLOCK.getEStructuralFeature(ProcesspackagePackage.EMP_CLOCK__ID);
		clockDescription = ProcesspackagePackage.Literals.EMP_CLOCK.getEStructuralFeature(ProcesspackagePackage.EMP_CLOCK__DESCRIPTION);
		clockStartTime = ProcesspackagePackage.Literals.EMP_CLOCK.getEStructuralFeature(ProcesspackagePackage.EMP_CLOCK__START_TIME);
		clockEndTime = ProcesspackagePackage.Literals.EMP_CLOCK.getEStructuralFeature(ProcesspackagePackage.EMP_CLOCK__END_TIME);
		clockIntervalUnit=ProcesspackagePackage.Literals.EMP_CLOCK.getEStructuralFeature(ProcesspackagePackage.EMP_CLOCK__INTERVAL_UNIT);
		clockInterval = ProcesspackagePackage.Literals.EMP_CLOCK.getEStructuralFeature(ProcesspackagePackage.EMP_CLOCK__INTERVAL_VALUE);
		clockTimeUnit=ProcesspackagePackage.Literals.EMP_CLOCK.getEStructuralFeature(ProcesspackagePackage.EMP_CLOCK__TIME_UNIT);
		clockRestartPeriod = ProcesspackagePackage.Literals.EMP_CLOCK.getEStructuralFeature(ProcesspackagePackage.EMP_CLOCK__RESTART_PERIOD);
		
		inAndName = ProcesspackagePackage.Literals.EMP_IN_AND.getEStructuralFeature(ProcesspackagePackage.EMP_IN_AND__NAME);
		inAndId = ProcesspackagePackage.Literals.EMP_IN_AND.getEStructuralFeature(ProcesspackagePackage.EMP_IN_AND__ID);
		inAndDescription = ProcesspackagePackage.Literals.EMP_IN_AND.getEStructuralFeature(ProcesspackagePackage.EMP_IN_AND__DESCRIPTION);
		
		inOrName = ProcesspackagePackage.Literals.EMP_IN_OR.getEStructuralFeature(ProcesspackagePackage.EMP_IN_OR__NAME);
		inOrId = ProcesspackagePackage.Literals.EMP_IN_OR.getEStructuralFeature(ProcesspackagePackage.EMP_IN_OR__ID);
		inOrDescription = ProcesspackagePackage.Literals.EMP_IN_OR.getEStructuralFeature(ProcesspackagePackage.EMP_IN_OR__DESCRIPTION);
		
		outAndName = ProcesspackagePackage.Literals.EMP_OUT_AND.getEStructuralFeature(ProcesspackagePackage.EMP_OUT_AND__NAME);
		outAndId = ProcesspackagePackage.Literals.EMP_OUT_AND.getEStructuralFeature(ProcesspackagePackage.EMP_OUT_AND__ID);
		outAndDescription = ProcesspackagePackage.Literals.EMP_OUT_AND.getEStructuralFeature(ProcesspackagePackage.EMP_OUT_AND__DESCRIPTION);
		
		outOrName = ProcesspackagePackage.Literals.EMP_OUT_OR.getEStructuralFeature(ProcesspackagePackage.EMP_OUT_OR__NAME);
		outOrId = ProcesspackagePackage.Literals.EMP_OUT_OR.getEStructuralFeature(ProcesspackagePackage.EMP_OUT_OR__ID);
		outOrDescription = ProcesspackagePackage.Literals.EMP_OUT_OR.getEStructuralFeature(ProcesspackagePackage.EMP_OUT_OR__DESCRIPTION);
	}
	
	/**
	 * get the attribute map from the old pmbe element
	 * @param element
	 * @return
	 */
	public Map getAttributesFromElement(Element element){
		Map attributesMap=new HashMap();
		String type=element.getName();
		String xsi_type=element.getAttributeValue("type", PMBEElement.XMLNS_XSI);
		if(xsi_type.equals("prManualActivityType")||xsi_type.equals("prAutoActivityType")
				||xsi_type.equals("prBatActivityType")||xsi_type.equals("prAutoBatActivityType")){
			attributesMap.put(normalActivityName, element.getChild("Name",PMBEElement.XMLNS).getText());
			attributesMap.put(normalActivityId, element.getChild("OID",PMBEElement.XMLNS).getText());
			attributesMap.put(normalActivityDescription, element.getChild("Description",PMBEElement.XMLNS).getText());
			attributesMap.put(normalActivityPriority, element.getChild("Priority", PMBEElement.XMLNS).getText());
			attributesMap.put(normalActivityTimeUnit, element.getChild("DurationUnit",PMBEElement.XMLNS).getText());
			attributesMap.put(normalActivityProcedure,element.getChild("Procedure",PMBEElement.XMLNS).getText());
		}
		/*if(xsi_type.equals("prAutoActivityType")){
			attributesMap.put(autoActivityName, element.getChild("Name",PMBEElement.XMLNS).getText());
			attributesMap.put(autoActivityId, element.getChild("OID",PMBEElement.XMLNS).getText());
			attributesMap.put(autoActivityDescription, element.getChild("Description",PMBEElement.XMLNS).getText());
			attributesMap.put(autoActivityPriority, element.getChild("Priority", PMBEElement.XMLNS).getText());
		}
		if(xsi_type.equals("prBatActivityType")){
			attributesMap.put(batchActivityName, element.getChild("Name", PMBEElement.XMLNS).getText());
			attributesMap.put(batchActivityId, element.getChild("OID",PMBEElement.XMLNS).getText());
			attributesMap.put(batchActivityDescription,element.getChild("Description",PMBEElement.XMLNS).getText());
			attributesMap.put(batchActivityPriority, element.getChild("Priority", PMBEElement.XMLNS).getText());
		}
		if(xsi_type.equals("prAutoBatActivityType")){
			attributesMap.put(autoBatchActivityName, element.getChild("Name", PMBEElement.XMLNS).getText());
			attributesMap.put(autoBatchActivityId, element.getChild("OID",PMBEElement.XMLNS).getText());
			attributesMap.put(autoBatchActivityDescription,element.getChild("Description",PMBEElement.XMLNS).getText());
			attributesMap.put(autoBatchActivityPriority, element.getChild("Priority", PMBEElement.XMLNS).getText());
		
		}*/
		if(xsi_type.equals("prProcessLinkType")){
			attributesMap.put(compActivityName, element.getChild("Name", PMBEElement.XMLNS).getText());
			attributesMap.put(compActivityId, element.getChild("OID",PMBEElement.XMLNS).getText());
			attributesMap.put(compActivityDescription,element.getChild("Description",PMBEElement.XMLNS).getText());
			attributesMap.put(normalActivityProcedure,element.getChild("Procedure",PMBEElement.XMLNS).getText());
		}
		if(xsi_type.equals("prDocumentType")||xsi_type.equals("prArtifactType")
				||xsi_type.equals("prFolderType")||xsi_type.equals("prMessageType")){
			attributesMap.put(documentName, element.getChild("Name", PMBEElement.XMLNS).getText());
			attributesMap.put(documentId, element.getChild("OID",PMBEElement.XMLNS).getText());
			attributesMap.put(documentDescription,element.getChild("Description",PMBEElement.XMLNS).getText());
			attributesMap.put(documentIOType,element.getChild("IOMode",PMBEElement.XMLNS).
									getChild("IOType",PMBEElement.XMLNS).getText());
			attributesMap.put(documentInitValue, element.getChild("IOMode",PMBEElement.XMLNS)
									.getChild("InitialValue", PMBEElement.XMLNS).getText());
			attributesMap.put(documentPeriod, element.getChild("IOMode",PMBEElement.XMLNS)
									.getChild("Period",PMBEElement.XMLNS).getText());
			attributesMap.put(documentTimeUnit, element.getChild("IOMode",PMBEElement.XMLNS)
									.getChild("Unit",PMBEElement.XMLNS).getText());
			
		}
		/*if(xsi_type.equals("prArtifactType")){
			attributesMap.put(artifactName, element.getChild("Name", PMBEElement.XMLNS).getText());
			attributesMap.put(artifactId, element.getChild("OID",PMBEElement.XMLNS).getText());
			attributesMap.put(artifactDescription,element.getChild("Description",PMBEElement.XMLNS).getText());
		}
		if(xsi_type.equals("prFolderType")){
			attributesMap.put(otherName, element.getChild("Name", PMBEElement.XMLNS).getText());
			attributesMap.put(otherId, element.getChild("OID",PMBEElement.XMLNS).getText());
			attributesMap.put(otherDescription,element.getChild("Description",PMBEElement.XMLNS).getText());
		}
		if(xsi_type.equals("prMessageType")){
			attributesMap.put(messageName, element.getChild("Name", PMBEElement.XMLNS).getText());
			attributesMap.put(messageId, element.getChild("OID",PMBEElement.XMLNS).getText());
			attributesMap.put(messageDescription,element.getChild("Description",PMBEElement.XMLNS).getText());
		
		}*/
		if(xsi_type.equals("prCompositeProductType")){
			attributesMap.put(productPackageName, element.getChild("Name", PMBEElement.XMLNS).getText());
			attributesMap.put(productPackageId, element.getChild("OID",PMBEElement.XMLNS).getText());
			attributesMap.put(productPackageDescription,element.getChild("Description",PMBEElement.XMLNS).getText());
		}
		if(xsi_type.equals("prInputAndType")){
			attributesMap.put(inAndName, element.getChild("Name", PMBEElement.XMLNS).getText());
			attributesMap.put(inAndId, element.getChild("OID",PMBEElement.XMLNS).getText());
			attributesMap.put(inAndDescription,element.getChild("Description",PMBEElement.XMLNS).getText());
		}
		if(xsi_type.equals("prInputOrType")){
			attributesMap.put(inOrName, element.getChild("Name", PMBEElement.XMLNS).getText());
			attributesMap.put(inOrId, element.getChild("OID",PMBEElement.XMLNS).getText());
			attributesMap.put(inOrDescription,element.getChild("Description",PMBEElement.XMLNS).getText());
		}
		if(xsi_type.equals("prOutputAndType")){
			attributesMap.put(outAndName, element.getChild("Name", PMBEElement.XMLNS).getText());
			attributesMap.put(outAndId, element.getChild("OID",PMBEElement.XMLNS).getText());
			attributesMap.put(outAndDescription,element.getChild("Description",PMBEElement.XMLNS).getText());
		}
		if(xsi_type.equals("prOutputOrType")){
			attributesMap.put(outOrName, element.getChild("Name", PMBEElement.XMLNS).getText());
			attributesMap.put(outOrId, element.getChild("OID",PMBEElement.XMLNS).getText());
			attributesMap.put(outOrDescription,element.getChild("Description",PMBEElement.XMLNS).getText());
		}
		if(xsi_type.equals("prTimerType")){
			attributesMap.put(clockName, element.getChild("Name", PMBEElement.XMLNS).getText());
			attributesMap.put(clockId, element.getChild("OID",PMBEElement.XMLNS).getText());
			attributesMap.put(clockDescription,element.getChild("Description",PMBEElement.XMLNS).getText());
			attributesMap.put(clockStartTime, element.getChild("TStartTime",PMBEElement.XMLNS).getText());
			attributesMap.put(clockEndTime, element.getChild("TEndTime", PMBEElement.XMLNS).getText());
			attributesMap.put(clockIntervalUnit, element.getChild("IntervalUnit",PMBEElement.XMLNS).getText());
			attributesMap.put(clockInterval, element.getChild("Interval", PMBEElement.XMLNS).getText());
			attributesMap.put(clockTimeUnit, element.getChild("TimeUnit", PMBEElement.XMLNS).getText());
			attributesMap.put(clockRestartPeriod, element.getChild("RestartPeriod", PMBEElement.XMLNS).getText());
		}
		if(xsi_type.equals("rsMachineType")||xsi_type.equals("rsLocationType")
				||xsi_type.equals("rsToolType")||xsi_type.equals("rsRole")){
			attributesMap.put(roleName, element.getChild("Name", PMBEElement.XMLNS).getText());
			attributesMap.put(roleId, element.getChild("OID",PMBEElement.XMLNS).getText());
			attributesMap.put(roleCostPerUnit, element.getChild("CostUnit",PMBEElement.XMLNS).getText());
			attributesMap.put(roleEfficiency, element.getChild("Efficiency",PMBEElement.XMLNS).getText());
			attributesMap.put(roleTotalAmount,element.getChild("TotalAmount",PMBEElement.XMLNS).getText());
			attributesMap.put(roleUsageAmount, element.getChild("UsageAmount",PMBEElement.XMLNS).getText());
		}
		/*if(xsi_type.equals("rsLocationType")){
			attributesMap.put(locationName, element.getChild("Name", PMBEElement.XMLNS).getText());
			//attributesMap.put(basicResourceTypeId, element.getChild("OID",PMBEElement.XMLNS).getText());
			//attributesMap.put(basicResourceTypeDescription, element.getChild("Description", PMBEElement.XMLNS).getText());
		}
		if(xsi_type.equals("rsToolType")){
			attributesMap.put(toolName, element.getChild("Name", PMBEElement.XMLNS).getText());
		}
		if(xsi_type.equals("rsRole")){
			attributesMap.put(roleName, element.getChild("Name", PMBEElement.XMLNS).getText());
			//attributesMap.put(roleId, element.getChild("OID",PMBEElement.XMLNS).getText());
			//attributesMap.put(roleDescription, element.getChild("Description", PMBEElement.XMLNS).getText());
		}*/
		
		return attributesMap;
	}

	public String getOID(Element element){
		return element.getChild("OID",PMBEElement.XMLNS).getText();
	}
	
}
