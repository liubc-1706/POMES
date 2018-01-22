package newpmbe.models.transform.elements;

import org.jdom.Element;

public abstract class PMBEObject extends PMBEElement{
	protected Element Justification;
	protected Element Description;
	protected Element ObjectID;
	protected Element Procedure;
	
	
	public PMBEObject(){
		Justification=new Element("Justification");
		Description=new Element("Description");
		ObjectID=new Element("ObjectID");
		Procedure=new Element("Procedure");
	}
	
	/**
	 * 给element添加相关内容
	 */
	public Element addContents(Element element){
		super.addContents(element);
		element.addContent(Justification);
		element.addContent(Description);
		element.addContent(ObjectID);
		element.addContent(Procedure);
		
		return element;
	}
	
	public Element getJustification() {
		return Justification;
	}
	public void setJustification(String justification) {
		Justification.setText(justification);
	}
	public Element getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description.setText(description);
	}
	public Element getObjectID() {
		return ObjectID;
	}
	public void setObjectID(String objectID) {
		ObjectID.setText(objectID);
	}
	public Element getProcedure() {
		return Procedure;
	}
	public void setProcedure(String procedure) {
		Procedure.setText(procedure);
	}
	
	
	
}
