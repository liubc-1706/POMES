package newpmbe.models.transform.elements;

import java.util.List;
import org.jdom.Element;

public class Activity extends PMBEObject {
	public Element activity;
	
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
	protected Element EstProcedure;  //手动活动需要
	protected Element Instructions;  //手动活动/批处理活动需要
	protected Element ScriptName;
	protected Element ProcessPathName;  //组合活动需要
	//以下批处理活动需要
	protected Element BatchType;
	protected Element Interval;
	protected Element IntervalUnit;
	protected Element WaitforRes;
	protected Element WaitforInput;
	protected Element MaxAmount;
	protected Element MinAmount;
	protected Element RestartPeriod;
	protected Element Start;
	protected Element End;
	protected Element TimeUnit;
	
	public Activity() {
		super();
		activity=new Element("Activity");
		FlagSpecialAct=new Element("FlagSpecialAct");
		WBSId=new Element("WBSId");
		Priority=new Element("Priority");
		distribution=new Distribution();
		distribution.setID(distribution.getOID().getText());
		Behavior=new Element("Behavior");
		StartTime=new Element("StartTime");
		LastStartTime=new Element("LastStartTime");
		OnCriticalPath=new Element("OnCriticalPath");
		DurationUnit=new Element("DurationUnit");
		ActState=new Element("ActState");
		ActId=new Element("ActId");
		EstProcedure=new Element("EstProcedure");
		Instructions=new Element("Instructions");
		ScriptName=new Element("ScriptName");
		ProcessPathName=new Element("ProcessPathName");
		BatchType=new Element("BatType");
		Interval=new Element("Interval");
		IntervalUnit=new Element("IntervalUnit");
		WaitforRes=new Element("WaitforRes");
		WaitforInput=new Element("WaitforInput");
		MaxAmount=new Element("MaxAmount");
		MinAmount=new Element("MinAmount");
		RestartPeriod=new Element("RestartPeriod");
		Start=new Element("Start");
		End=new Element("End");
		TimeUnit=new Element("TimeUnit");
	}
	
	
	@Override
	public Element getXMLElement() {
		// TODO Auto-generated method stub
		activity=addContents(activity);
		activity.setNamespace(XMLNS);
		List list=activity.getChildren();
		for(int i=0;i<list.size();i++){
			((Element)list.get(i)).setNamespace(XMLNS);
		}
		return activity;
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
		if(element.getAttributeValue("type", XMLNS_XSI).equals("prManualActivityType")){
			element.addContent(EstProcedure);
			element.addContent(Instructions);
		}
		if(element.getAttributeValue("type",XMLNS_XSI).equals("prBatActivityType")){
			element.addContent(Instructions);
			element.addContent(BatchType);
			element.addContent(Interval);
			element.addContent(IntervalUnit);
			element.addContent(WaitforRes);
			element.addContent(WaitforInput);
			element.addContent(MaxAmount);
			element.addContent(MinAmount);
			element.addContent(RestartPeriod);
			element.addContent(Start);
			element.addContent(End);
			element.addContent(TimeUnit);
		}
		if(element.getAttributeValue("type",XMLNS_XSI).equals("prProcessLinkType")){
			element.addContent(ProcessPathName);
		}
		return element;
	}
	
	public void setTimeUnit(String timeunit){
		TimeUnit.setText(timeunit);
	}
	public Element getTimeUnit(){
		return TimeUnit;
	}
	
	public void setEnd(String end){
		End.setText(end);
	}
	public Element getEnd(){
		return End;
	}
	
	public void setStart(String start){
		Start.setText(start);
	}
	public Element getStart(){
		return Start;
	}
	
	public void setRestartPeriod(String per){
		RestartPeriod.setText(per);
	}
	public Element getRestartPeriod(){
		return RestartPeriod;
	}
	
	public void setMinAmount(String min){
		MinAmount.setText(min);
	}
	public Element getMinAmount(){
		return MinAmount;
	}
	
	public void setMaxAmount(String max){
		MaxAmount.setText(max);
	}
	public Element getMaxAmount(){
		return MaxAmount;
	}
	
	public void setWaitforInput(String input){
		WaitforInput.setText(input);
	}
	public Element getWaitforInput(){
		return WaitforInput;
	}
	public void setWaitforRes(String wait){
		WaitforRes.setText(wait);
	}
	public Element getWaitforRes(){
		return WaitforRes;
	}
	
	public void setIntervalUnit(String unit){
		IntervalUnit.setText(unit);
	}
	
	public Element getIntervalUnit(){
		return IntervalUnit;
	}
	
	public void setInterval(String inter){
		Interval.setText(inter);
	}
	
	public Element getInterval(){
		return Interval;
	}
	
	public void setBatchType(String batchType){
		BatchType.setText(batchType);
	}
	
	public Element getBatchType(){
		return BatchType;
	}
	
	public void setEstProcedure(String pro){
		EstProcedure.setText(pro);
	}
	
	public Element getEstProcedure(){
		return EstProcedure;
	}
	
	public void setProcessPathName(String path){
		ProcessPathName.setText(path);
	}
	
	public Element getProcessPathName(){
		return ProcessPathName;
	}
	
	public void setType(String type){
		activity.setAttribute("type", type, XMLNS_XSI);
	}
	
	public void setID(String id){
		activity.setAttribute("ID", id);
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


	public Element getInstructions() {
		return Instructions;
	}


	public void setInstructions(Element instructions) {
		Instructions = instructions;
	}


	public Element getScriptName() {
		return ScriptName;
	}
	
	public void setScriptName(Element scriptName) {
		ScriptName = scriptName;
	}
	
	
}
