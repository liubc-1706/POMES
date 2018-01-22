package newpmbe.web.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.jdom.*;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class PropertyPageBuilder {
	
	String outputDir;
	String infoPath;
	
	/*
	 * Build the property page
	 */
	public PropertyPageBuilder(String inPath, String outDir){
		
		outputDir = outDir;
		infoPath = inPath;
	}

	public static void main(String[] argc) throws JDOMException, IOException{
		PropertyPageBuilder ppb = new PropertyPageBuilder(
				"D:\\Process2\\web\\JPG\\过程实例\\info", "D:\\Process2\\web\\JPG\\过程实例\\src");
		ppb.build();
	}
	
	public void build() throws JDOMException, IOException{
		
		File tmpFile = new File(infoPath);
		File[] tmpList = tmpFile.listFiles();
		String infoFileName = "";
		String preName = "";
		String imageFileName;
	
		
		int i;
		File infoFile = null;
		for (i = 0; i < tmpList.length; i++)
		{
			if (tmpList[i].isFile() && tmpList[i].getName().indexOf(".info") >=0)
			{
				infoFile = tmpList[i];
				infoFileName = tmpList[i].getName();
				int tmpIndex = infoFileName.indexOf(".info");
				preName = infoFileName.substring(0, tmpIndex);
				break;
			}
		}
		
		String propertyFileName = preName + "Property.html";
		SAXBuilder builder = new SAXBuilder();		
		File in = new File(infoFile.getPath());
		Document infoDoc = builder.build(in);
	
		Element rootElement = infoDoc.getRootElement();
		Element elements = rootElement.getChild("elements");
		List elementList = elements.getChildren();
		
		
		Document doc = new Document();
		
		/*
		 * 创建文档类型并添加到文档
		 */
		DocType  type  = new DocType("myType"); //文档类型
		type.setPublicID("public.dtd");    //设为 public
		doc.addContent(type); //添加文档类型
		
		Element root = new Element("html"); //创建一个元素
		doc.setRootElement(root); //将该元素做为根元素
		  
		Element bodyTag = new Element("body"); 
		root.addContent(bodyTag); //将bodyTag做为html的子元素
		
		Element titleTag = new Element("h4"); 
		bodyTag.addContent(titleTag); //将titleTag做为bodyTag的子元素
		
		Element tableTag = new Element("table"); 
		titleTag.addContent(tableTag); //将tableTag做为titleTag的子元素
		
		Attribute  tableAtt = new Attribute("border", "1"); //创建table的border属性
		tableTag.setAttribute(tableAtt); //为tableTag设置属性
		 
		Element trTag1 = new Element("tr"); 
		tableTag.addContent(trTag1); //将trTag做为tableTag的子元素
		
		trTag1.addContent(new Element("th").setText("属性名称"));
		trTag1.addContent(new Element("th").setText("属性值"));
		
		for(int k=0; k<elementList.size(); k++){
			
			//add by donkey
			Element eleIndex = new Element("a");
			tableTag.addContent(eleIndex);			
			
			//add by piggy
			Element eleTemp = (Element) elementList.get(k);
			Element trTag2 = new Element("tr"); 
			tableTag.addContent(trTag2); //将trTag做为tableTag的子元素
			Element nameEle = eleTemp.getChild("elementName");
			trTag2.addContent(new Element("th").setText("名称"));
			String tempStr = nameEle.getValue();
			Attribute eleNameAtt = new Attribute("name", "area" + k);
			eleIndex.setAttribute(eleNameAtt);
			trTag2.addContent(new Element("td").setText(nameEle.getValue()));
			
			Element trTag3 = new Element("tr"); 
			tableTag.addContent(trTag3);
			Element typeEle = eleTemp.getChild("elementType");
			String cnType = getCnType(typeEle.getValue());
			trTag3.addContent(new Element("th").setText("类型"));
			trTag3.addContent(new Element("td").setText(cnType));
		
//			Element propertyEle = eleTemp.getChild("property");
//			List propertyList = propertyEle.getChildren();
//			for(int j=0; j<propertyList.size(); j++){
//				
//				Element tempEle = (Element) propertyList.get(j);
//				if(!tempEle.getName().equals("name")){
//					Element trTag = new Element("tr");
//					tableTag.addContent(trTag);
//					trTag.addContent(new Element("th").setText(tempEle.getName()));
//					trTag.addContent(new Element("td").setText(tempEle.getValue()));
//				}
//			}
//			Element trTag4 = new Element("tr");
//			tableTag.addContent(trTag4);
//			trTag4.addContent(new Element("th").setText(" "));
//			trTag4.addContent(new Element("td").setText(" "));
		}
		
	//	System.out.print(doc);
		  /*
		   * 格式化输出
		   */		
		
		try {
			String fileName = this.outputDir + "\\" + propertyFileName;
		//	String fileName = "D:\\PropertyView.html";
			FileOutputStream ops = new FileOutputStream(fileName);
			XMLOutputter xmlout = new XMLOutputter();//用于输出jdom 文档
			Format format=Format.getPrettyFormat(); //格式化文档
			format.setEncoding("GBK"); //由于默认的编码是utf-8,中文将显示为乱码，所以设为gbk
			xmlout.setFormat(format);
			
			xmlout.output(doc, ops);
			ops.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //输出文档
	}
	
	
	private String getCnType(String elementType) {
		// TODO Auto-generated method stub
		String cnTypeStr = "";
		if (elementType.equals("EMPNormalActivity")){
			cnTypeStr = "活动";
		}else if (elementType.equals("EMPAutoActivity")){
			cnTypeStr = "自动活动";
		}else if (elementType.equals("EMPManualBatchActivity")){
			cnTypeStr = "手工批处理活动";
		}else if (elementType.equals("EMPAutoBatchActivity")){
			cnTypeStr = "自动批处理活动";
		}else if (elementType.equals("EMPCompActivity")){
			cnTypeStr = "组合活动";
		}else if (elementType.equals("EMPDocument")){
			cnTypeStr = "文档";
		}else if (elementType.equals("EMPArtifact")){
			cnTypeStr = "制品";
		}else if (elementType.equals("EMPMessage")){
			cnTypeStr = "消息";
		}else if (elementType.equals("EMPOther")){
			cnTypeStr = "其他产品";
		}else if (elementType.equals("EMPProductPackage")){
			cnTypeStr = "组合产品";
		}else if (elementType.equals("EMPClock")){
			cnTypeStr = "时钟";
		}else if (elementType.equals("EMPInAnd")){
			cnTypeStr = "输入与";
		}else if (elementType.equals("EMPInOr")){
			cnTypeStr = "输入或";
		}else if (elementType.equals("EMPOutAnd")){
			cnTypeStr = "输出与";
		}else if (elementType.equals("EMPOutOr")){
			cnTypeStr = "输出或";
		}else if (elementType.equals("EMRRole")){
			cnTypeStr = "角色";
		}else if (elementType.equals("EMRToolType")){
			cnTypeStr = "工具类型";
		}else if (elementType.equals("EMRMachineType")){
			cnTypeStr = "设备类型";
		}else if (elementType.equals("EMRLocationType")){
			cnTypeStr = "场所类型";
		}else if (elementType.equals("EMOResourceGroupType")){
			cnTypeStr = "资源组";
		}else if (elementType.equals("EMRAbstractLocationType")){
			cnTypeStr = "抽象场所类型";
		}else if (elementType.equals("EMRAbstractMachineType")){
			cnTypeStr = "抽象设备类型";
		}else if (elementType.equals("EMRAbstractToolType")){
			cnTypeStr = "抽象工具类型";
		}
		return cnTypeStr;
	}
	
	
		  
}
