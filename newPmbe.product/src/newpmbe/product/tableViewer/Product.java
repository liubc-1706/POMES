package newpmbe.product.tableViewer;

public class Product {
	protected static final String DEFAULT = null;
	private String productType=DEFAULT;
	private String productID=DEFAULT;
	private String name=DEFAULT;
	private String code=DEFAULT;
	private String description=DEFAULT;
	private String attachment=DEFAULT;
	private String file=DEFAULT;//该产品所在的文件
	private String project=DEFAULT;//产品所属的工程
	
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	
	

}
