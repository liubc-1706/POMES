package newpmbe.models.transform.elements;

public class PMBEElementFactory {
	
	public PMBEElementFactory(){
		
	}
	
	public PMBEElement createPMBEElement(String type){
		if(type.equals("ACTIVITY"))
			return new Activity();
		if(type.equals("ASSOCIATION"))
			return new Association();
		if(type.equals("CONDITIONAL"))
			return new Conditional();
		if(type.equals("INFORMATIONFLOW"))
			return new Informationflow();
		if(type.equals("MISCELLANEA"))
			return new Miscellanea();
		if(type.equals("PROCESS"))
			return new Process();
		if(type.equals("PRODUCT"))
			return new Product();
		if(type.equals("REFERENCE"))
			return new Reference();
		if(type.equals("RESOURCE"))
			return new Resource();
		if(type.equals("RSOBJECT"))
			return new RSObject();
		if(type.equals("TIMERCONNECTION"))
			return new TimerConnection();
		else
			return null;
	}
	
}
