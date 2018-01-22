package newpmbe.models.transform.elements;

import java.util.List;
import org.jdom.Element;

public class IOMode extends PMBEElement {
	public Element ioMode;
	
	protected Element IOType;
	protected Distribution distribution;
	protected Element InitialValue;
	protected Element Unit;
	protected Element Period;
	
	
	public IOMode(){
		ioMode=new Element("IOMode");
		IOType=new Element("IOType");
		distribution=new Distribution();
		distribution.setID(distribution.getOID().getText());
		InitialValue=new Element("InitialValue");
		Unit=new Element("Unit");
		Period=new Element("Period");
	}
	
	@Override
	public Element getXMLElement() {
		// TODO Auto-generated method stub
		ioMode=addContents(ioMode);
		ioMode.setNamespace(XMLNS);
		List list=ioMode.getChildren();
		for(int i=0;i<list.size();i++){
			((Element)list.get(i)).setNamespace(XMLNS);
		}
		return ioMode;
	}
	
	public Element addContents(Element element){
		super.addContents(element);
		element.addContent(IOType);
		element.addContent(distribution.getXMLElement());
		element.addContent(InitialValue);
		element.addContent(Unit);
		element.addContent(Period);
		
		return element;
	}
	
	public void setID(String id){
		ioMode.setAttribute("ID",id);
	}

	public Element getIOType() {
		return IOType;
	}

	public void setIOType(String type) {
		IOType.setText(type);
	}

	public Distribution getDistribution() {
		return distribution;
	}

	public void setDistribution(Distribution distribution) {
		this.distribution = distribution;
	}

	public Element getInitialValue() {
		return InitialValue;
	}

	public void setInitialValue(String initialValue) {
		InitialValue.setText(initialValue);
	}

	public Element getUnit() {
		return Unit;
	}

	public void setUnit(String unit) {
		Unit.setText(unit);
	}

	public Element getPeriod() {
		return Period;
	}

	public void setPeriod(String period) {
		Period.setText(period);
	}

}
