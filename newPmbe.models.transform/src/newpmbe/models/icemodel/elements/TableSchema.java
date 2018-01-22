package newpmbe.models.icemodel.elements;

import org.jdom.Element;

public class TableSchema {
	public Element tableschema;
	protected Element ColumnName1;
	protected Element ColumnName2;
	protected Element ColumnName3;
	protected Element ColumnName4;
	protected Element ColumnName5;
	protected Element ColumnName6;
	protected Element ColumnName7;
	protected Element ColumnName8;
	protected Element ColumnName9;
	protected Element ColumnName10;
	
	public TableSchema(){
		tableschema=new Element("TableSchema");
		ColumnName1=new Element("ColumnName");
		ColumnName2=new Element("ColumnName");
		ColumnName3=new Element("ColumnName");
		ColumnName4=new Element("ColumnName");
		ColumnName5=new Element("ColumnName");
		ColumnName6=new Element("ColumnName");
		ColumnName7=new Element("ColumnName");
		ColumnName8=new Element("ColumnName");
		ColumnName9=new Element("ColumnName");
		ColumnName10=new Element("ColumnName");
	}
	
	public Element getXMLElement(){
		tableschema.addContent(ColumnName1);
		tableschema.addContent(ColumnName2);
		tableschema.addContent(ColumnName3);
		tableschema.addContent(ColumnName4);
		tableschema.addContent(ColumnName5);
		tableschema.addContent(ColumnName6);
		tableschema.addContent(ColumnName7);
		tableschema.addContent(ColumnName8);
		tableschema.addContent(ColumnName9);
		tableschema.addContent(ColumnName10);
		return tableschema;
	}
	
	public void setColumnName1(String columnName){
		ColumnName1.setText(columnName);
	}
	
	public Element getColumnName1(){
		return ColumnName1;
	}
	
	public void setColumnName2(String columnName){
		ColumnName2.setText(columnName);
	}
	
	public Element getColumnName2(){
		return ColumnName2;
	}
	
	public void setColumnName3(String columnName){
		ColumnName3.setText(columnName);
	}
	
	public Element getColumnName3(){
		return ColumnName3;
	}
	
	public void setColumnName4(String columnName){
		ColumnName4.setText(columnName);
	}
	
	public Element getColumnName4(){
		return ColumnName4;
	}
	public void setColumnName5(String columnName){
		ColumnName5.setText(columnName);
	}
	
	public Element getColumnName5(){
		return ColumnName5;
	}
	
	public void setColumnName6(String columnName){
		ColumnName6.setText(columnName);
	}
	
	public Element getColumnName6(){
		return ColumnName6;
	}
	
	public void setColumnName7(String columnName){
		ColumnName7.setText(columnName);
	}
	
	public Element getColumnName7(){
		return ColumnName7;
	}
	
	public void setColumnName8(String columnName){
		ColumnName8.setText(columnName);
	}
	
	public Element getColumnName8(){
		return ColumnName8;
	}
	
	public void setColumnName9(String columnName){
		ColumnName9.setText(columnName);
	}
	
	public Element getColumnName9(){
		return ColumnName9;
	}
	
	public void setColumnName10(String columnName){
		ColumnName10.setText(columnName);
	}
	
	public Element getColumnName10(){
		return ColumnName10;
	}
}
