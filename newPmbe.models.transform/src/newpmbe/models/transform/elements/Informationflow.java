package newpmbe.models.transform.elements;

import java.util.List;
import org.jdom.Element;

public class Informationflow extends PMBEObject {
	public Element informationflow;
	
	protected Element StartPoint;
	protected Element EndPoint;
	protected Element Lable;
	protected Element Probability;
	
	public Informationflow(){
		informationflow=new Element("Informationflow");
		StartPoint=new Element("StartPoint");
		EndPoint=new Element("EndPoint");
		Lable=new Element("Lable");
		Probability=new Element("Probability");
	}
	
	public Element addContents(Element element){
		super.addContents(element);
		element.addContent(StartPoint);
		element.addContent(EndPoint);
		element.addContent(Lable);
		element.addContent(Probability);
		return element;
	}
	
	@Override
	public Element getXMLElement() {
		// TODO Auto-generated method stub
		informationflow=addContents(informationflow);
		informationflow.setNamespace(XMLNS);
		List list=informationflow.getChildren();
		for(int i=0;i<list.size();i++){
			((Element)list.get(i)).setNamespace(XMLNS);
		}
		return informationflow;
	}

	public void setType(String type){
		informationflow.setAttribute("type",type,XMLNS_XSI);
	}
	
	public void setID(String id){
		informationflow.setAttribute("ID",id);
	}
	
	public void setStartPointID(String sID){
		informationflow.setAttribute("StartPointID",sID);
	}
	
	public void setEndPointID(String eID){
		informationflow.setAttribute("EndPointID",eID);
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

	public Element getLable() {
		return Lable;
	}

	public void setLable(String lable) {
		Lable.setText(lable);
	}

	public Element getProbability() {
		return Probability;
	}

	public void setProbability(String probability) {
		Probability.setText(probability);
	}
	
	

}
