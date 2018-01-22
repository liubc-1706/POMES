package newpmbe.web.constant;

public class LegalElementType {
	
	private static String[] typeList = new String[]{
		"batchActivities", 
		"compActivities",
		"normalActivities",
		"autoActivities",
		"manualBatchActivities",
		"autoBatchActivities",
		"documents",
		"artifacts",
		"others",
		"messages",
		"productPackages",
		"clocks",
		"resourceGroupTypes",
		"roles",
		"inAnds",
		"inOrs",
		"outAnds",
		"outOrs",
		"abstractMachineTypes",
		"abstractToolTypes",
		"abstractLocationTypes",
		"toolTypes",
		"machineTypes",
		"locationTypes",
	};
	
	public static boolean isLegalType(String typeName)
	{
		int i;
		for (i = 0; i < typeList.length; i++)
		{
			if (typeName.equals(typeList[i]))
				return true;
		}
		return false;
	}

}
