package newpmbe.models.icemodel.elements;

import org.jdom.Element;

public class Page {
	public Element page;
	
	protected Element PageName;
	protected Element PageCaption;
	protected Element PageIcon;
	protected Element PageActive;
	protected Element PageType;
	
	public Page(){
		page=new Element("Page");
		PageName=new Element("PageName");
		PageCaption=new Element("PageCaption");
		PageIcon=new Element("PageIcon");
		PageActive=new Element("PageActive");
		PageType=new Element("PageType");
	}
	
	public void addContents(Element element){
		page.addContent(element);
	}
	
	public Element getXMLElement(){
		page.addContent(PageName);
		page.addContent(PageCaption);
		page.addContent(PageIcon);
		page.addContent(PageActive);
		page.addContent(PageType);
		return page;
	}
	
	public void setPageName(String pagename){
		PageName.setText(pagename);
	}
	
	public Element getPageName(){
		return PageName;
	}
	
	public void setPageCaption(String pagecaption){
		PageCaption.setText(pagecaption);
	}
	
	public Element getPageCaption(){
		return PageCaption;
	}
	
	public void setPageIcon(String pageicon){
		PageIcon.setText(pageicon);
	}
	
	public Element getPageIcon(){
		return PageIcon;
	}
	
	public void setPageActive(String pageactive){
		PageActive.setText(pageactive);
	}
	
	public Element getPageActive(){
		return PageActive;
	}
	public void setPageType(String pagetype){
		PageType.setText(pagetype);
	}
	
	public Element getPageType(){
		return PageType;
	}
}
