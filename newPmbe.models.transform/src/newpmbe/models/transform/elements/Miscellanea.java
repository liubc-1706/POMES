package newpmbe.models.transform.elements;

import java.util.List;
import org.jdom.Element;
/**
 * for clock
 * @author fan
 *
 */
public class Miscellanea extends PMBEObject {
	public Element miscellanea;
	
	protected Element StartTime;
	protected Element EndTime;
	protected Element TimeUnit;
	protected Element Interval;
	protected Element RestartPeriod;
	protected Element IntervalUnit;
	protected Element WaitforInput;
	protected Element WaitforRes;
	
	public Miscellanea(){
		miscellanea=new Element("Miscellanea");
		StartTime=new Element("StartTime");
		EndTime=new Element("EndTime");
		TimeUnit=new Element("TimeUnit");
		Interval=new Element("Interval");
		RestartPeriod=new Element("RestartPeriod");
		IntervalUnit=new Element("IntervalUnit");
		WaitforInput=new Element("WaitforInput");
		WaitforRes=new Element("WaitforRes");
	}
	
	
	public Element addContents(Element element){
		super.addContents(element);
		element.addContent(StartTime);
		element.addContent(EndTime);
		element.addContent(TimeUnit);
		element.addContent(Interval);
		element.addContent(RestartPeriod);
		element.addContent(IntervalUnit);
		element.addContent(WaitforInput);
		element.addContent(WaitforRes);
		return element;
	}
	
	@Override
	public Element getXMLElement() {
		// TODO Auto-generated method stub
		miscellanea=addContents(miscellanea);
		miscellanea.setNamespace(XMLNS);
		List list=miscellanea.getChildren();
		for(int i=0;i<list.size();i++){
			((Element)list.get(i)).setNamespace(XMLNS);
		}
		return miscellanea;
	}
	
	public void setType(String type){
		miscellanea.setAttribute("type",type,XMLNS_XSI);
	}
	
	public void setID(String id){
		miscellanea.setAttribute("ID",id);
	}


	public Element getStartTime() {
		return StartTime;
	}


	public void setStartTime(String startTime) {
		StartTime.setText(startTime);
	}


	public Element getEndTime() {
		return EndTime;
	}


	public void setEndTime(String endTime) {
		EndTime.setText(endTime);
	}


	public Element getTimeUnit() {
		return TimeUnit;
	}


	public void setTimeUnit(String timeUnit) {
		TimeUnit.setText(timeUnit);
	}


	public Element getInterval() {
		return Interval;
	}


	public void setInterval(String interval) {
		Interval.setText(interval);
	}


	public Element getRestartPeriod() {
		return RestartPeriod;
	}


	public void setRestartPeriod(String restartPeriod) {
		RestartPeriod.setText(restartPeriod);
	}


	public Element getIntervalUnit() {
		return IntervalUnit;
	}


	public void setIntervalUnit(String intervalUnit) {
		IntervalUnit.setText(intervalUnit);
	}


	public Element getWaitforInput() {
		return WaitforInput;
	}


	public void setWaitforInput(String waitforInput) {
		WaitforInput.setText(waitforInput);
	}


	public Element getWaitforRes() {
		return WaitforRes;
	}


	public void setWaitforRes(String waitforRes) {
		WaitforRes.setText(waitforRes);
	}
	
	
	

}
