package newpmbe.models.transform.elements;

import java.util.List;
import org.jdom.Element;

public class RSObject extends PMBEElement {
	public Element rsObject;
	
	protected Element UsageAmount;
	protected Element Efficiency;
	protected Element TotalAmount;
	protected Element Effort;
	protected Element CostUnit;
	
	public RSObject(){
		rsObject=new Element("rsObject");
		UsageAmount=new Element("UsageAmount");
		Efficiency=new Element("Efficiency");
		TotalAmount=new Element("TotalAmount");
		Effort=new Element("Effort");
		CostUnit=new Element("CostUnit");
	}
	
	public Element addContents(Element element){
		super.addContents(element);
		element.addContent(UsageAmount);
		element.addContent(Efficiency);
		element.addContent(TotalAmount);
		element.addContent(Effort);
		element.addContent(CostUnit);
		return element;
	}
	
	@Override
	public Element getXMLElement() {
		// TODO Auto-generated method stub
		rsObject=addContents(rsObject);
		rsObject.setNamespace(XMLNS);
		List list=rsObject.getChildren();
		for(int i=0;i<list.size();i++){
			((Element)list.get(i)).setNamespace(XMLNS);
		}
		return rsObject;
	}

	public void setType(String type){
		rsObject.setAttribute("type", type, XMLNS_XSI);
	}
	
	public void setID(String id){
		rsObject.setAttribute("ID",id);
	}
	
	public Element getUsageAmount() {
		return UsageAmount;
	}

	public void setUsageAmount(String usageAmount) {
		UsageAmount.setText(usageAmount);
	}

	public Element getEfficiency() {
		return Efficiency;
	}

	public void setEfficiency(String efficiency) {
		Efficiency.setText(efficiency);
	}

	public Element getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		TotalAmount.setText(totalAmount);
	}

	public Element getEffort() {
		return Effort;
	}

	public void setEffort(String effort) {
		Effort.setText(effort);
	}

	public Element getCostUnit() {
		return CostUnit;
	}

	public void setCostUnit(String costUnit) {
		CostUnit.setText(costUnit);
	}

	
}
