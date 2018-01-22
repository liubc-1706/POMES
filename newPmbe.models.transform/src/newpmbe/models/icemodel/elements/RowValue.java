package newpmbe.models.icemodel.elements;

import org.jdom.Element;

public class RowValue {
	public Element rowvalue;
	protected Element ObjectName;
	protected Element ColumnValue1;
	protected Element ColumnValue2;
	protected Element ColumnValue3;
	protected Element ColumnValue4;
	protected Element ColumnValue5;
	protected Element ColumnValue6;
	protected Element ColumnValue7;
	
	public RowValue(){
		rowvalue=new Element("RowValue");
		ObjectName=new Element("ObjectName");
		ColumnValue1=new Element("ColumnValue");
		ColumnValue2=new Element("ColumnValue");
		ColumnValue3=new Element("ColumnValue");
		ColumnValue4=new Element("ColumnValue");
		ColumnValue5=new Element("ColumnValue");
		ColumnValue6=new Element("ColumnValue");
		ColumnValue7=new Element("ColumnValue");
	}
	
	public Element getXMLElement(){
		rowvalue.addContent(ObjectName);
		rowvalue.addContent(ColumnValue1);
		rowvalue.addContent(ColumnValue2);
		rowvalue.addContent(ColumnValue3);
		rowvalue.addContent(ColumnValue4);
		rowvalue.addContent(ColumnValue5);
		rowvalue.addContent(ColumnValue6);
		rowvalue.addContent(ColumnValue7);
		return rowvalue;
	}
	
	public void setObjectName(String objectname){
		ObjectName.setText(objectname);
	}
	
	public Element getObjectName(){
		return ObjectName;
	}
	
	public void setColumnValue1(String ColumnValue){
		ColumnValue1.setText(ColumnValue);
	}
	
	public Element getColumnValue1(){
		return ColumnValue1;
	}
	
	public void setColumnValue2(String ColumnValue){
		ColumnValue2.setText(ColumnValue);
	}
	
	public Element getColumnValue2(){
		return ColumnValue2;
	}
	
	public void setColumnValue3(String ColumnValue){
		ColumnValue3.setText(ColumnValue);
	}
	
	public Element getColumnValue3(){
		return ColumnValue3;
	}
	
	public void setColumnValue4(String ColumnValue){
		ColumnValue4.setText(ColumnValue);
	}
	
	public Element getColumnValue4(){
		return ColumnValue4;
	}
	
	public void setColumnValue5(String ColumnValue){
		ColumnValue5.setText(ColumnValue);
	}
	
	public Element getColumnValue5(){
		return ColumnValue5;
	}
	
	public void setColumnValue6(String ColumnValue){
		ColumnValue6.setText(ColumnValue);
	}
	
	public Element getColumnValue6(){
		return ColumnValue6;
	}
	
	public void setColumnValue7(String ColumnValue){
		ColumnValue7.setText(ColumnValue);
	}
	
	public Element getColumnValue7(){
		return ColumnValue7;
	}
}
