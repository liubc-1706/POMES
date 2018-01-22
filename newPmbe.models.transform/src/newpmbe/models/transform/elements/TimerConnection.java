package newpmbe.models.transform.elements;

import java.util.List;
import org.jdom.Element;

public class TimerConnection extends PMBEObject {
	public Element timerConnection;
	
	protected Element TimerID;
	protected Element ActivityID;
	
	public TimerConnection(){
		timerConnection=new Element("TimerConn");
		TimerID=new Element("TimerID");
		ActivityID=new Element("ActivityID");
	}
	
	public Element addContents(Element element){
		super.addContents(element);
		element.addContent(TimerID);
		element.addContent(ActivityID);
		return element;
	}
	@Override
	public Element getXMLElement() {
		// TODO Auto-generated method stub
		timerConnection=addContents(timerConnection);
		timerConnection.setNamespace(XMLNS);
		List list=timerConnection.getChildren();
		for(int i=0;i<list.size();i++){
			((Element)list.get(i)).setNamespace(XMLNS);
		}
		return timerConnection;
	}

	public void setType(String type){
		timerConnection.setAttribute("type", type, XMLNS_XSI);
	}
	
	public void setID(String id){
		timerConnection.setAttribute("ID",id);
	}
	
	public void setStartPointID(String sID){
		timerConnection.setAttribute("StartPointID", sID);
	}
	
	public void setEndPointID(String eID){
		timerConnection.setAttribute("EndPointID",eID);
	}
	
	public Element getTimerID() {
		return TimerID;
	}

	public void setTimerID(String timerID) {
		TimerID.setText(timerID);
	}

	public Element getActivityID() {
		return ActivityID;
	}

	public void setActivityID(String activityID) {
		ActivityID.setText(activityID);
	}
	
	

}
