package newpmbe.models.transform.elements;

import java.util.List;
import org.jdom.Element;

public class Resource extends PMBEElement {
	public Element resource;
	
	protected Element UsageAmount;
	protected Element Efficiency;
	protected Element TotalAmount;
	protected Element Effort;
	protected Element CostUnit;
	protected Element resources;
	
	public Resource(){
		resource=new Element("resource");
		UsageAmount=new Element("UsageAmount");
		Efficiency=new Element("Efficiency");
		TotalAmount=new Element("TotalAmount");
		Effort=new Element("Effort");
		CostUnit=new Element("CostUnit");
		resources=new Element("resources");
		
	}
	
	public Element addContents(Element element){
		super.addContents(element);
		element.addContent(UsageAmount);
		element.addContent(Efficiency);
		element.addContent(TotalAmount);
		element.addContent(Effort);
		element.addContent(CostUnit);
		if(!resources.getChildren().isEmpty())
			element.addContent(resources);
		return element;
	}
	
	@Override
	public Element getXMLElement() {
		// TODO Auto-generated method stub
		resource=addContents(resource);
		resource.setNamespace(XMLNS);
		resource.addNamespaceDeclaration(XMLNS_XSI);
		List list=resource.getChildren();
		for(int i=0;i<list.size();i++){
			((Element)list.get(i)).setNamespace(XMLNS);
		}
		return resource;
	}
	
	public void setID(String id){
		resource.setAttribute("ID",id);
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

	public Element getResources() {
		return resources;
	}

	public void setResources(Element resources) {
		this.resources = resources;
	}
	
	

}
