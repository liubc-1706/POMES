package newpmbe.models.transform.elements;

import org.jdom.Element;
import org.jdom.Namespace;

/**
 * @author  fan
 */
public abstract class PMBEElement {
	protected Element OID;
	protected Element NetID;
	protected Element Name;
	protected Element CreateBy;
	protected Element CreateDate;
	protected Element ModifiedBy;
	protected Element ModifiedDate;
	
	public  final static Namespace XMLNS=Namespace.getNamespace("process.buaa.edu.cn/2003/XVPML1.1");
	public  final static Namespace XMLNS_XSI=Namespace.getNamespace("xsi","http://www.w3.org/2001/XMLSchema-instance");
	
	private static int OBJECT_ID=1;

	public PMBEElement(){
		OID=new Element("OID");
		OID.setText(Integer.toString(OBJECT_ID));
		OBJECT_ID++;
		NetID=new Element("NetID");
		Name=new Element("Name");
		CreateBy=new Element("CreateBy");
		CreateDate=new Element("CreateDate");
		ModifiedBy=new Element("ModifiedBy");
		ModifiedDate=new Element("ModifiedDate");
		
	}

	
	/**
	 * 给element添加相关的内容
	 * @param element
	 * @return
	 */
	public Element addContents(Element element){
		element.addContent(OID);
		element.addContent(NetID);
		element.addContent(Name);
		element.addContent(CreateBy);
		element.addContent(CreateDate);
		element.addContent(ModifiedBy);
		element.addContent(ModifiedDate);
		
		return element;
	}
	
	public abstract Element getXMLElement();
	
	
	public Element getOID() {
		return OID;
	}
	public void setOID(String oid) {
		OID.setText(oid);
	}
	public Element getNetID() {
		return NetID;
	}
	public void setNetID(String netID) {
		NetID.setText(netID);
	}
	public Element getName() {
		return Name;
	}
	public void setName(String name) {
		Name.setText(name);
	}
	public Element getCreateBy() {
		return CreateBy;
	}
	public void setCreateBy(String createBy) {
		CreateBy.setText(createBy);
	}
	
	public Element getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(String createDate) {
		CreateDate.setText(createDate);
	}
	public Element getModifiedBy() {
		return ModifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		ModifiedBy.setText(modifiedBy);
	}
	public Element getModifiedDate() {
		return ModifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		ModifiedDate.setText(modifiedDate);
	}
	
	
	
}
