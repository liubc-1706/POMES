package newpmbe.models.transform.elements;

import java.util.List;
import org.jdom.Element;

public class Reference extends PMBEObject {
	public Element reference;
	
	protected Element StartPoint;
	protected Element EndPoint;
	
	public Reference(){
		reference=new Element("Reference");
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
		reference=addContents(reference);
		reference.setNamespace(XMLNS);
		List list=reference.getChildren();
		for(int i=0;i<list.size();i++){
			((Element)list.get(i)).setNamespace(XMLNS);
		}
		return reference;
	}
	
	public void setType(String type){
		reference.setAttribute("type",type,XMLNS_XSI);
	}
	
	public void setID(String id){
		reference.setAttribute("ID",id);
	}
	
	public void setStartPointID(String sID){
		reference.setAttribute("StartPointID",sID);
	}
	
	public void setEndPointID(String eID){
		reference.setAttribute("EndPointID",eID);
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
