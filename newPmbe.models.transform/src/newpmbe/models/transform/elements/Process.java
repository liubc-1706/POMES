package newpmbe.models.transform.elements;

import java.util.List;
import org.jdom.Attribute;
import org.jdom.Element;
import org.jdom.Namespace;

public class Process extends PMBEObject {
	public Element process;
	
	protected Element FlagSpecialAct;
	protected Element WBSId;
	protected Element Priority;
	protected Distribution distribution;
	protected Element Behavior;
	protected Element StartTime;
	protected Element LastStartTime;
	protected Element OnCriticalPath;
	protected Element DurationUnit;
	protected Element ActState;
	protected Element ActId;
	protected Element Activities;
	protected Element Products;
	protected Element Conditionals;
	protected Element Miscellaneas;
	protected Element Informations;
	protected Element Associations;
	protected Element References;
	protected Element TimerConnections;
	
	
	public Process(){
		process=new Element("process");
		FlagSpecialAct=new Element("FlagSpecialAct");
		WBSId=new Element("WBSId");
		Priority=new Element("Priority");
		distribution=new Distribution();
		Behavior=new Element("Behavior");
		StartTime=new Element("StartTime");
		LastStartTime=new Element("LastStartTime");
		OnCriticalPath=new Element("OnCriticalPath");
		DurationUnit=new Element("DurationUnit");
		ActState=new Element("ActState");
		ActId=new Element("ActId");
		Activities=new Element("Activities");
		Products=new Element("Products");
		Conditionals=new Element("Conditionals");
		Miscellaneas=new Element("Miscellaneas");
		Informations=new Element("Informations");
		Associations=new Element("Associations");
		References=new Element("References");
		TimerConnections=new Element("TimerConnections");
	}
	
	public Element addContents(Element element){
		super.addContents(element);
		element.addContent(FlagSpecialAct);
		element.addContent(WBSId);
		element.addContent(Priority);
		element.addContent(distribution.getXMLElement());
		element.addContent(Behavior);
		element.addContent(StartTime);
		element.addContent(LastStartTime);
		element.addContent(OnCriticalPath);
		element.addContent(DurationUnit);
		element.addContent(ActState);
		element.addContent(ActId);
		if(!Activities.getChildren().isEmpty())
			element.addContent(Activities);
		if(!Products.getChildren().isEmpty())
			element.addContent(Products);
		if(!Conditionals.getChildren().isEmpty())
			element.addContent(Conditionals);
		if(!Miscellaneas.getChildren().isEmpty())
			element.addContent(Miscellaneas);
		element.addContent(Informations);
		element.addContent(Associations);
		element.addContent(References);
		element.addContent(TimerConnections);
		return element;
	}
	
	@Override
	public Element getXMLElement() {
		// TODO Auto-generated method stub
		process.setNamespace(XMLNS);
		process.addNamespaceDeclaration(XMLNS_XSI);
		process=addContents(process);
		List list=process.getChildren();
		for(int i=0;i<list.size();i++){
			((Element)list.get(i)).setNamespace(XMLNS);
		}
		//process.setAttribute("type", "activity",xmlns_xsi);
		return process;
	}

	public Element getFlagSpecialAct() {
		return FlagSpecialAct;
	}

	public void setFlagSpecialAct(String flagSpecialAct) {
		FlagSpecialAct.setText(flagSpecialAct);
	}

	public Element getWBSId() {
		return WBSId;
	}

	public void setWBSId(String id) {
		WBSId.setText(id);
	}

	public Element getPriority() {
		return Priority;
	}

	public void setPriority(String priority) {
		Priority.setText(priority);
	}

	public Distribution getDistribution() {
		return distribution;
	}

	public void setDistribution(Distribution distribution) {
		this.distribution = distribution;
	}

	public Element getBehavior() {
		return Behavior;
	}

	public void setBehavior(String behavior) {
		Behavior.setText(behavior);
	}

	public Element getStartTime() {
		return StartTime;
	}

	public void setStartTime(String startTime) {
		StartTime.setText(startTime);
	}

	public Element getLastStartTime() {
		return LastStartTime;
	}

	public void setLastStartTime(String lastStartTime) {
		LastStartTime.setText(lastStartTime);
	}

	public Element getOnCriticalPath() {
		return OnCriticalPath;
	}

	public void setOnCriticalPath(String onCriticalPath) {
		OnCriticalPath.setText(onCriticalPath);
	}

	public Element getDurationUnit() {
		return DurationUnit;
	}

	public void setDurationUnit(String durationUnit) {
		DurationUnit.setText(durationUnit);
	}

	public Element getActState() {
		return ActState;
	}

	public void setActState(String actState) {
		ActState.setText(actState);
	}

	public Element getActId() {
		return ActId;
	}

	public void setActId(String actId) {
		ActId.setText(actId);
	}

	public Element getActivities() {
		return Activities;
	}

	public void setActivities(Element activities) {
		Activities = activities;
	}

	public Element getProducts() {
		return Products;
	}

	public void setProducts(Element products) {
		Products = products;
	}

	public Element getConditionals() {
		return Conditionals;
	}

	public void setConditionals(Element conditionals) {
		Conditionals = conditionals;
	}

	public Element getMiscellaneas() {
		return Miscellaneas;
	}

	public void setMiscellaneas(Element miscellaneas) {
		Miscellaneas = miscellaneas;
	}

	public Element getInformations() {
		return Informations;
	}

	public void setInformations(Element informations) {
		Informations = informations;
	}

	public Element getAssociations() {
		return Associations;
	}

	public void setAssociations(Element associations) {
		Associations = associations;
	}

	public Element getReferences() {
		return References;
	}

	public void setReferences(Element references) {
		References = references;
	}

	public Element getTimerConnections() {
		return TimerConnections;
	}

	public void setTimerConnections(Element timerConnections) {
		TimerConnections = timerConnections;
	}
	
	public void setID(String id){
		process.setAttribute("ID",id);
	}
	
	

}
