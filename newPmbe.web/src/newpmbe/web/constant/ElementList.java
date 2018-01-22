package newpmbe.web.constant;

public class ElementList {
	
	private static String[] elementList = new String[]{
		"EMPBatchActivity", 
		"EMPDocument",
		"EMPArtifact",
		"EMPOther",
		"EMPCompActivity",
		"EMPNormalActivity",
		"EMPProductPackage",
		"EMPClock",
		"EMRBasicResourceType",
		"EMORole",
		"EMPTeam",
		"EMPResourceGroup",
		"EMPInAnd",
		"EMPInOr",
		"EMPOutAnd",
		"EMPOutOr",
		"EMOResourceGroupType",
		"EMPAutoActivity",
		"EMPAutoBatchActivity",
		"EMPManualBatchActivity",
		"EMPMessage",
		"EMRLocationType",
		"EMRMachineType",
		"EMRRole",
		"EMRToolType",
		"EMOResourceGroupType",
		"EMRAbstractLocationType",
		"EMRAbstractMachineType",
		"EMRAbstractToolType"
	};
	
	
	public static boolean isElement(String elementName)
	{
		int i;
		for (i = 0; i < elementList.length; i++)
		{
			if (elementName.equals(elementList[i]))
				return true;
		}
		return false;
	}
}
