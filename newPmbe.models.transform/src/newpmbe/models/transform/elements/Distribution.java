package newpmbe.models.transform.elements;

import java.util.List;
import org.jdom.Attribute;
import org.jdom.Element;

public class Distribution extends PMBEElement{
	public Element distribution;
	
	private Element Function;
	private Element Argument1;
	private Element Argument2;
	
	public Distribution(){
		distribution=new Element("Distribution");
		//ID=new Attribute("ID","1");
		Function=new Element("Function");
		Argument1=new Element("Argument1");
		Argument2=new Element("Argument2");
		
	}
	
	
	public Element getXMLElement(){
		//distribution.setAttribute(ID);	//Attribute can not be null;
		distribution.addContent(OID);
		distribution.addContent(NetID);
		distribution.addContent(Name);
		distribution.addContent(CreateBy);
		distribution.addContent(CreateDate);
		distribution.addContent(ModifiedBy);
		distribution.addContent(ModifiedDate);
		distribution.addContent(Function);
		distribution.addContent(Argument1);
		distribution.addContent(Argument2);
		
		List list=distribution.getChildren();
		for(int i=0;i<list.size();i++){
			((Element)list.get(i)).setNamespace(XMLNS);
		}
		return distribution;
	}
	
	public void setID(String id){
		distribution.setAttribute("ID",id);
	}

	public Element getFunction() {
		return Function;
	}

	public void setFunction(String function) {
		Function.setText(function);
	}

	public Element getArgument1() {
		return Argument1;
	}

	public void setArgument1(String argument1) {
		Argument1.setText(argument1);
	}

	public Element getArgument2() {
		return Argument2;
	}

	public void setArgument2(String argument2) {
		Argument2.setText(argument2);
	}
	
}
