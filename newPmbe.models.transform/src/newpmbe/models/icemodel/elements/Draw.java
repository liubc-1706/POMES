package newpmbe.models.icemodel.elements;

import org.jdom.Element;

public class Draw {
	public Element draw;
	protected Element Type;
	protected Element ClassID;
	protected Element ClassName;
	protected Element ClassCaption;
	protected Element ObjectID;
	protected Element ObjectName;
	protected Element ObjectCaption;
	protected Element ObjectIDBK;
	protected Element Corlor;
	protected Element Constraint;
	protected Element Icon;
	protected Element BorderStyle;
	protected Element FontStyle;
	protected Element LinkSubPage;
	protected Element PattenID;
	protected Element PattenName;
	protected Element GroupID;
	
	public Draw(){
		draw=new Element("Draw");
		Type=new Element("Type");
		ClassID=new Element("ClassID");
		ClassName=new Element("ClassName");
		ClassCaption=new Element("ClassCaption");
		ObjectID=new Element("ObjectID");
		ObjectName=new Element("ObjectName");
		ObjectCaption=new Element("ObjectCaption");
		ObjectIDBK=new Element("ObjectIDBK");
		Corlor=new Element("Corlor");
		Constraint=new Element("Constraint");
		Icon=new Element("Icon");
		BorderStyle=new Element("BorderStyle");
		FontStyle=new Element("FontStyle");
		LinkSubPage=new Element("LinkSubPage");
		PattenID=new Element("PattenID");
		PattenName=new Element("PattenName");
		GroupID=new Element("GroupID");
	
	}
	
	public Element getXMLElement(){
		draw.addContent(Type);
		draw.addContent(ClassID);
		draw.addContent(ClassName);
		draw.addContent(ClassCaption);
		draw.addContent(ObjectID);
		draw.addContent(ObjectName);
		draw.addContent(ObjectCaption);
		draw.addContent(ObjectIDBK);
		draw.addContent(Corlor);
		draw.addContent(Constraint);
		draw.addContent(Icon);
		draw.addContent(BorderStyle);
		draw.addContent(FontStyle);
		draw.addContent(LinkSubPage);
		draw.addContent(PattenID);
		draw.addContent(PattenName);
		draw.addContent(GroupID);
		return draw;
	}
	
	public void setType(String type){
		Type.setText(type);
	}
	
	public Element getType(){
		return Type;
	}
	
	public void setClassID(String classID){
		ClassID.setText(classID);
	}
	
	public Element getClassID(){
		return ClassID;
	}
	
	public void setClassName(String className){
		ClassName.setText(className);
	}
	
	public Element getClassName(){
		return ClassName;
	}
	
	public void setClassCaption(String classCaption){
		ClassCaption.setText(classCaption);
	}
	
	public Element getClassCaption(){
		return ClassCaption;
	}
	
	public void setObjectID(String objectID){
		ObjectID.setText(objectID);
	}
	
	public Element getObjectID(){
		return ObjectID;
	}
	
	public void setObjectName(String objectName){
		ObjectName.setText(objectName);
	}
	
	public Element getObjectName(){
		return ObjectName;
	}
	
	public void setObjectCaption(String objectCaption){
		ObjectCaption.setText(objectCaption);
	}
	
	public Element getObjectCaption(){
		return ObjectCaption;
	}
	
	public void setObjectIDBK(String objectIDBK){
		ObjectIDBK.setText(objectIDBK);
	}
	
	public Element getObjectIDBK(){
		return ObjectIDBK;
	}
	
	public void setCorlor(String corlor){
		Corlor.setText(corlor);
	}
	
	public Element getCorlor(){
		return Corlor;
	}
	
	public void setConstraint(String constraint){
		Constraint.setText(constraint);
	}
	
	public Element getConstraint(){
		return Constraint;
	}
	
	public void setIcon(String icon){
		Icon.setText(icon);
	}
	
	public Element getCIcon(){
		return Icon;
	}
	
	public void setBorderStyle(String borderStyle){
		BorderStyle.setText(borderStyle);
	}
	
	public Element getBorderStyle(){
		return BorderStyle;
	}
	
	public void setFontStyle(String fontStyle){
		FontStyle.setText(fontStyle);
	}
	
	public Element getFontStyle(){
		return FontStyle;
	}
	
	public void setLinkSubPage(String linkSubPage){
		LinkSubPage.setText(linkSubPage);
	}
	
	public Element getLinkSubPage(){
		return LinkSubPage;
	}
	
	public void setPattenID(String pattenID){
		PattenID.setText(pattenID);
	}
	
	public Element getPattenID(){
		return PattenID;
	}
	
	public void setPattenName(String pattenName){
		PattenName.setText(pattenName);
	}
	
	public Element getPattenName(){
		return PattenName;
	}
	
	public void setGroupID(String groupID){
		GroupID.setText(groupID);
	}
	
	public Element getGroupID(){
		return GroupID;
	}
}
