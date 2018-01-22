package newpmbe.models.transform.elements;

import java.util.List;
import org.jdom.Element;

public class Product extends PMBEObject {
	public Element product;
	
	protected Element Handle;
	protected IOMode ioMode;
	protected Element ProState;
	protected Element ProId;
	protected Element ProAmount;
	protected Element DocType;	//specified for document 
	protected Element subProducts; //specified for product package
	
	public Product(){
		product=new Element("Product");
		Handle=new Element("Handle");
		ioMode=new IOMode();
		ioMode.setID(ioMode.getOID().getText());
		ProState=new Element("ProState");
		ProId=new Element("ProId");
		ProAmount=new Element("ProAmount");
		DocType=new Element("DocType");
		subProducts=new Element("Products");
		
	}
	
	public Element addContents(Element element){
		super.addContents(element);
		element.addContent(Handle);
		element.addContent(ioMode.getXMLElement());
		element.addContent(ProState);
		element.addContent(ProId);
		element.addContent(ProAmount);
		if(element.getAttributeValue("type", XMLNS_XSI).equals("prDocumentType")){
			element.addContent(DocType);
		}
		if(element.getAttributeValue("type", XMLNS_XSI).equals("prCompositeProductType")){
			if(subProducts.getChildren().size()>0)
				element.addContent(subProducts);
		}
		return element;
	}
	
	@Override
	public Element getXMLElement() {
		// TODO Auto-generated method stub
		product=addContents(product);
		product.setNamespace(XMLNS);
		List list=product.getChildren();
		for(int i=0;i<list.size();i++){
			((Element)list.get(i)).setNamespace(XMLNS);
		}
		return product;
	}
	
	public void setType(String type){
		product.setAttribute("type", type, XMLNS_XSI);
	}
	
	public void setID(String id){
		product.setAttribute("ID", id);
	}

	public Element getHandle() {
		return Handle;
	}

	public void setHandle(String handle) {
		Handle.setText(handle);
	}

	public IOMode getIoMode() {
		return ioMode;
	}

	public void setIoMode(IOMode ioMode) {
		this.ioMode = ioMode;
	}

	public Element getProState() {
		return ProState;
	}

	public void setProState(String proState) {
		ProState.setText(proState);
	}

	public Element getProId() {
		return ProId;
	}

	public void setProId(String proId) {
		ProId.setText(proId);
	}

	public Element getProAmount() {
		return ProAmount;
	}

	public void setProAmount(String proAmount) {
		ProAmount.setText(proAmount);
	}

	public Element getDocType() {
		return DocType;
	}

	public void setDocType(String docType) {
		DocType.setText(docType);
	}

	public Element getProduct() {
		return product;
	}

	public void setProduct(Element product) {
		this.product = product;
	}

	public Element getSubProducts() {
		return subProducts;
	}

	public void setSubProducts(Element subProducts) {
		this.subProducts = subProducts;
	}
	
	

}
