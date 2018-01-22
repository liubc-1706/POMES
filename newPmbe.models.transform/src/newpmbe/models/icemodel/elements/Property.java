package newpmbe.models.icemodel.elements;

import org.jdom.Element;

public class Property {
	public Element property;
	protected Element Name;
	protected Element Value;
	protected Element Attribute_Order;
	protected Element Attribute_Min;
	protected Element Attribute_Max;
	protected Element Attribute_DataType;
	protected Element Attribute_Width;
	protected Element Attribute_DisplayWidth;
	protected Element Attribute_Window;
	
	public Property(){
		property=new Element("Property");
		Name=new Element("Name");
		Value=new Element("Value");
		Attribute_Order=new Element("Attribute_Order");
		Attribute_Min=new Element("Attribute_Min");
		Attribute_Max=new Element("Attribute_Max");
		Attribute_DataType=new Element("Attribute_DataType");
		Attribute_Width=new Element("Attribute_Width");
		Attribute_DisplayWidth=new Element("Attribute_DisplayWidth");
		Attribute_Window=new Element("Attribute_Window");
	}
	
	public Element getXMLElement(){
		property.addContent(Name);
		property.addContent(Value);
		property.addContent(Attribute_Order);
		property.addContent(Attribute_Min);
		property.addContent(Attribute_Max);
		property.addContent(Attribute_DataType);
		property.addContent(Attribute_Width);
		property.addContent(Attribute_DisplayWidth);
		property.addContent(Attribute_Window);
		return property;
	}
	
	public void setName(String name){
		Name.setText(name);
	}
	public Element getName(){
		return Name;
	}
	
	public void setValue(String value){
		Value.setText(value);
	}
	public Element getValue(){
		return Value;
	}
	
	public void setAttribute_Order(String attribute_Order){
		Attribute_Order.setText(attribute_Order);
	}
	public Element getAttribute_Order(){
		return Attribute_Order;
	}
	
	public void setAttribute_Min(String attribute_Min){
		Attribute_Min.setText(attribute_Min);
	}
	public Element getAttribute_Min(){
		return Attribute_Min;
	}
	
	public void setAttribute_Max(String attribute_Max){
		Attribute_Max.setText(attribute_Max);
	}
	public Element getAttribute_Max(){
		return Attribute_Max;
	}
	
	public void setAttribute_DataType(String attribute_DataType){
		Attribute_DataType.setText(attribute_DataType);
	}
	public Element getAttribute_DataType(){
		return Attribute_DataType;
	}
	
	public void setAttribute_Width(String attribute_Width){
		Attribute_Width.setText(attribute_Width);
	}
	public Element getAttribute_Width(){
		return Attribute_Width;
	}
	
	public void setAttribute_DisplayWidth(String attribute_DisplayWidth){
		Attribute_DisplayWidth.setText(attribute_DisplayWidth);
	}
	public Element getAttribute_DisplayWidth(){
		return Attribute_DisplayWidth;
	}
	
	public void setAttribute_Window(String attribute_Window){
		Attribute_Window.setText(attribute_Window);
	}
	public Element getAttribute_Window(){
		return Attribute_Window;
	}	
}
