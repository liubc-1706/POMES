package newpmbe.models.icemodel.elements;

import org.jdom.Element;

public class Table {
	public Element table;
	protected Element TableName;
	protected TableSchema TableSchema;
	
	public Table(){
		table=new Element("Table");
		TableName=new Element("TableName");
		TableSchema=new TableSchema();
	}

	public void addContents(Element element){
		table.addContent(element);
	}
	
	public Element getXMLElement() {
		// TODO Auto-generated method stub
		table.addContent(TableName);
		table.addContent(TableSchema.getXMLElement());
		return table;
	}
	
	public void setTableName(String tablename){
		TableName.setText(tablename);
	}
	
	public Element getTableName(){
		return TableName;
	}

}
