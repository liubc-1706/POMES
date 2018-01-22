package newpmbe.models.icemodel.elements;

import org.jdom.Element;

public class InnerModel {
	public Element model;
	protected Property Property;
	
	public InnerModel(){
		model=new Element("Model");
	}
	public void addContents(Element element){
		model.addContent(element);
	}
	public Element getXMLElement(){
		return model;
	}
}
