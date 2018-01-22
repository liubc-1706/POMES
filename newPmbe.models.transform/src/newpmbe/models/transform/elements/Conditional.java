package newpmbe.models.transform.elements;

import java.util.List;
import org.jdom.Element;

public class Conditional extends PMBEObject {
	public Element conditional;
	
	
	public Conditional(){
		conditional=new Element("Conditional");
	}
	
	@Override
	public Element getXMLElement() {
		// TODO Auto-generated method stub
		conditional=super.addContents(conditional);
		conditional.setNamespace(XMLNS);
		List list=conditional.getChildren();
		for(int i=0;i<list.size();i++){
			((Element)list.get(i)).setNamespace(XMLNS);
		}
		return conditional;
	}
	
	public void setType(String type){
		conditional.setAttribute("type",type,XMLNS_XSI);
	}
	
	public void setID(String id){
		conditional.setAttribute("ID",id);
	}
}
