package newpmbe.models.transform.elements;

import java.util.List;
import org.jdom.Element;

public class Association extends PMBEObject {
	public Element association;
	
	protected Element StartPoint;
	protected Element EndPoint;
	
	public Association(){
		association=new Element("Association");
		StartPoint=new Element("StartPoint");
		EndPoint=new Element("EndPoint");
	}
	
	public Element addContents(Element element){
		super.addContents(element);
		element.addContent(StartPoint);
		element.addContent(EndPoint);
		return element;
	}
	@Override
	public Element getXMLElement() {
		// TODO Auto-generated method stub
		association=addContents(association);
		association.setNamespace(XMLNS);
		List list=association.getChildren();
		for(int i=0;i<list.size();i++){
			((Element)list.get(i)).setNamespace(XMLNS);
		}
		return association;
	}
	
	public void setType(String type){
		association.setAttribute("type", type, XMLNS_XSI);
	}
	
	public void setID(String id){
		association.setAttribute("ID",id);
	}
	
	public void setStartPointID(String sID){
		association.setAttribute("StartPointID",sID);
	}
	
	public void setEndPointID(String eID){
		association.setAttribute("EndPointID",eID);
	}
	
	public void setUsageAmount(String amount){
		association.setAttribute("UsageAmount",amount);
	}

	public Element getStartPoint() {
		return StartPoint;
	}

	public void setStartPoint(String startPoint) {
		StartPoint.setText(startPoint);
	}

	public Element getEndPoint() {
		return EndPoint;
	}

	public void setEndPoint(String endPoint) {
		EndPoint.setText(endPoint);
	}
	
	

}
