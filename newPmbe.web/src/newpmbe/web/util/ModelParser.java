package newpmbe.web.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import newpmbe.web.constant.CanvasSize;
import newpmbe.web.constant.DefaultSize;
import newpmbe.web.constant.LegalElementType;
import org.jdom.Attribute;
import org.jdom.DocType;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;


public class ModelParser {
	
	String outputPath;
	String[] subDirName;
	String diagramFile;
	String nonDiagramFile;
	String infoName;
	String infoType;
	
	String[] test;
	
	public  final static Namespace XMLNS_XMI=Namespace.getNamespace("xmi","http://www.omg.org/XMI");
	 

	public static void main(String[] argc){
		
		String[] temp = {"4","5"};
		ModelParser ip = new ModelParser(
				"D:\\Process2\\runTest\\过程模型\\test.process\\4",
				"D:\\Process2\\web\\JPG\\test.process\\info\\4", temp);
		ip.parse();
	}
	
	public ModelParser(String inputDir, String outputPath, String[] subName){
		this.outputPath = outputPath;
		this.subDirName = subName;
		
		File tmpDir = new File(inputDir);
		File[] subFiles = tmpDir.listFiles();
		
		int i;
		for (i = 0; i < subFiles.length; i++)
		{
			File tmp = subFiles[i];
			if (tmp.isFile())
			{
				String fullName = tmp.getName();
				String[] sep = new String[2];
				
				int tmpIndex = fullName.indexOf(".");
				sep[0] = fullName.substring(0, tmpIndex);
				sep[1] = fullName.substring(tmpIndex + 1);
				
				if (sep[1].indexOf("process") >= 0 ||
						sep[1].indexOf("resource") >= 0 ||
						sep[1].indexOf("product") >= 0 ||
						sep[1].indexOf("organization") >= 0)
				{
					if (sep[1].indexOf("diagram") >= 0 )
						this.diagramFile = inputDir + "\\" + fullName;
//					else
//					{
//		//				this.nonDiagramFile = inputDir + "\\" + fullName;
//						this.infoType = sep[1];
//					}
					
					this.infoName = sep[0];
					this.infoType = sep[1].substring(0, sep[1].indexOf("_"));
				}
			}
		}
	}

	public void parse(){
		
		Document doc = new Document();
		
//		DocType type  = new DocType("myType"); //文档类型
//		type.setPublicID("public.dtd");    //设为 public
//		doc.addContent(type); //添加文档类型
		
		Element root = new Element("diagram"); //创建diagram元素
		doc.setRootElement(root); //将该元素做为根元素
		
		root.addContent(new Element("infoName").setText(this.infoName));
		root.addContent(new Element("infoType").setText(this.infoType));
		root.addContent(new Element("infoHref").setText(this.outputPath));
		root.addContent(new Element("elements").setText(""));
		
		//write childrens
		
		Document finalDoc = new Document();
		try{
			Document diagramDoc = this.traversalDiagramFile(doc);
			finalDoc = this.traversalNonDiagramFile(doc);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		try {
			String fileName = this.outputPath + "\\" + this.infoName + ".info";
		//	String fileName = "D:\\PropertyView.html";
			FileOutputStream ops = new FileOutputStream(fileName);
			XMLOutputter xmlout = new XMLOutputter();//用于输出jdom 文档
			Format format=Format.getPrettyFormat(); //格式化文档
			format.setEncoding("GBK"); //由于默认的编码是utf-8,中文将显示为乱码，所以设为gbk
			xmlout.setFormat(format);
			
//			System.out.print(finalDoc);
			xmlout.output(finalDoc, ops);
			ops.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //输出文档
	}
	
	
	private Document traversalDiagramFile(Document docR) throws Exception
	{
		ArrayList ret = new ArrayList();		

		SAXBuilder builder = new SAXBuilder();		
		File in = new File(this.diagramFile);
		Document docTemp = builder.build(in);
		
		Element root = docTemp.getRootElement();
		List areaList = root.getChildren();				//get the diagram and non-diagram parts
		Element diagramElement = (Element) areaList.get(1);
		List childrenList = diagramElement.getChildren();
		
		for(int i=0; i<childrenList.size(); i++)
		{
			Element child = (Element) childrenList.get(i);
			
			if(child.getName().equals("children")){
				
				String x = "-1";
				String y = "-1";
				String width = "-1";
				String height = "-1";
				String childID = "";
				String sourceHref = "#";
				
				List childAttList = child.getAttributes();
				for (int m=0; m<childAttList.size(); m++){
					Attribute childAtt = (Attribute) childAttList.get(m);
					String childAttName = childAtt.getName();
					if (childAttName.equals("element")){
						childID = childAtt.getValue();
					}
				}
				//get child ID end
				
				Element layout = child.getChild("layoutConstraint");
		//		Element element = child.getChild("children");
				List layoutAttList = layout.getAttributes();
		//		List elementAttList = element.getAttributes();
			
				
				for(int j=0; j<layoutAttList.size(); j++){
					Attribute layoutAtt = (Attribute) layoutAttList.get(j);
					if (layoutAtt.getName().equals("x")){
						x = layoutAtt.getValue();
					}else if(layoutAtt.getName().equals("y")){
						y = layoutAtt.getValue();
					}else if(layoutAtt.getName().equals("width")){
						width = layoutAtt.getValue();
					}else if(layoutAtt.getName().equals("height")){
						height = layoutAtt.getValue();
					}
					
					if(width == "-1"){
						width = "30";
					}
					if(height == "-1"){
						height = "30";
					}
				}
				
				Element rootR = docR.getRootElement();
				Element elementsR = rootR.getChild("elements");
				Element elementR = new Element("element");
				elementsR.addContent(elementR.setText(""));
				
				elementR.addContent(new Element("posX").setText(x));
				elementR.addContent(new Element("posY").setText(y));
				elementR.addContent(new Element("width").setText(width));
				elementR.addContent(new Element("height").setText(height));
				elementR.addContent(new Element("ID").setText(childID));
								
				try{
					Element eleElement = child.getChild("element");
					List eleAttList = eleElement.getAttributes();
					for (int k=0; k<eleAttList.size(); k++){
						Attribute eleAtt = (Attribute) eleAttList.get(k);
						if (eleAtt.getName().equals("href")){
							sourceHref = eleAtt.getValue();
							break;
						}
					}
				}catch (Exception ele){
					
				}
				elementR.addContent(new Element("sourceHref").setText(sourceHref));
			
			}
		}
		System.out.print(docR);
		return docR;
		
	}
		

	private Document traversalNonDiagramFile(Document docR) throws Exception
	{
		SAXBuilder builder = new SAXBuilder();		
		File in = new File(this.diagramFile);
		Document docTemp = builder.build(in);
		
		Element root = docTemp.getRootElement();
		List areaList = root.getChildren();
		Element nonDiagramElement = (Element) areaList.get(0);
		List childrenList = nonDiagramElement.getChildren();
		
		
		Element rootR = docR.getRootElement();
		Element elementsR = rootR.getChild("elements");
		List elementsRList = elementsR.getChildren();
		
		for(int i=0; i<childrenList.size();i++){
			Element child = (Element) childrenList.get(i);
			
			if(LegalElementType.isLegalType(child.getName())){
				String name = "";
				String elementType = "";
	//			String cnType = "";
				String elementID = "";
				String elementDescription = "";
				String elementCode = "";
				String elementCreator = "";
				String elementCreatedDate = "";
				String elementLastModifiedDate = "";
		
				elementID = child.getAttribute("id", this.XMLNS_XMI).getValue();
				elementType = child.getAttribute("type", this.XMLNS_XMI).getValue();
				elementType = elementType.substring(elementType.lastIndexOf(":")+1);
				try{
					name = child.getAttribute("name").getValue();
				}catch (Exception ex){
					System.out.print(elementType);
					if (!elementType.equals("EMPInAnd")&&!elementType.equals("EMPInOr")
							&&!elementType.equals("EMPOutAnd")&&!elementType.equals("EMPOutOr")){
						name = "未命名";
					}
					else{
						name = "无";
						
					}
				}
				try{
					elementDescription = child.getAttribute("description").getValue();
				}catch (Exception elemente){
				}
				try{
					elementCode = child.getAttribute("code").getValue();
				}catch (Exception codeE){
				}
				try{
					elementCreator = child.getAttribute("Creator").getValue();
				}catch (Exception creatorE){
				}
				try{
					elementCreatedDate = child.getAttribute("Created Date").getValue();
				}catch (Exception dateE){
				}
				try{
					elementLastModifiedDate = child.getAttribute("Last Modified Date").getValue();
				}catch (Exception dateE){
				}
				
				for(int j=0; j<elementsRList.size(); j++){
					
					Element element = (Element) elementsRList.get(j);
					if(element.getChild("ID").getValue().equals(elementID)){
						
						
						element.addContent(new Element("elementName").setText(name));
	//					cnType = getCnType(elementType);
						element.addContent(new Element("elementType").setText(elementType));
						element.addContent(new Element("subHref").setText(getSubHref(name)));
			
						Element propertyElement = new Element("property");
						if (!elementDescription.equals(""))
							propertyElement.addContent(new Element("描述").setText(elementDescription));
						if (!elementCode.equals(""))
							propertyElement.addContent(new Element("Code").setText(elementCode));
						if (!elementCreator.equals(""))
							propertyElement.addContent(new Element("Creator").setText(elementCreator));
						if (!elementCreatedDate.equals(""))
							propertyElement.addContent(new Element("Created Date").setText(elementCreatedDate));
						if (!elementLastModifiedDate.equals(""))
							propertyElement.addContent(new Element("Last Modified Date").setText(elementCreatedDate));
						element.addContent(propertyElement);
					}			
				}
			}
		}
		
		Document docRe = getAllReferDoc(docR);
		return docRe;
	}
				


	private Document getAllReferDoc(Document docR) throws JDOMException, IOException{	
		
		Element rootR = docR.getRootElement();
		System.out.print(rootR.getName());
		Element elementsR = rootR.getChild("elements");
		System.out.print(elementsR.getValue());
		List elementsRList = elementsR.getChildren();
		
		for(int i=0; i<elementsRList.size(); i++){
			
			Element childR = (Element) elementsRList.get(i);
			Element nameElement = childR.getChild("ID");
			String idString = nameElement.getValue();
			if (idString.equals("")){
				
				String sourceHref = childR.getChildText("sourceHref");
				String targetName = sourceHref.substring(sourceHref.lastIndexOf("/")+1, sourceHref.lastIndexOf(".")) + ".info";	
				int numTag = 0;
				String tempSourceHref = sourceHref;
				tempSourceHref = tempSourceHref.substring(0, tempSourceHref.indexOf("#"));
				while(tempSourceHref.contains("../")){
					numTag++;
					tempSourceHref = tempSourceHref.substring(sourceHref.indexOf("/")+ 1);
				}
				
				if(numTag > 0){
					String targetDir = this.outputPath;
					while(numTag > 0){
						targetDir = targetDir.substring(0, targetDir.lastIndexOf("\\"));
						numTag--;
					}
					String targetFile = targetDir + "\\" + targetName;
					
					String targetID = sourceHref.substring(sourceHref.indexOf("#") + 1);
					
					SAXBuilder builderTmp = new SAXBuilder();		
					File in = new File(targetFile);
					Document doc = builderTmp.build(in);
					
					Element root = doc.getRootElement();
					Element elementsSource = root.getChild("elements");
					List childrenListSource = elementsSource.getChildren();
					
				
					for(int j=0; j<childrenListSource.size(); j++){
						
						Element child = (Element)childrenListSource.get(j);					
						
						if(child.getChildText("ID").equals(targetID)){
							
							Element nameEle = child.getChild("elementName");
							Element typeEle = child.getChild("elementType");
							Element subHrefEle = child.getChild("subHref");
							Element sourceHrefEle = child.getChild("sourceHref");
							Element propertyEle = child.getChild("property");
							
							
							List proList = propertyEle.getChildren();
							childR.addContent(new Element("elementName")
								.setText(nameEle.getValue()));
							childR.addContent(new Element("elementType")
								.setText(typeEle.getValue()));
							childR.addContent(new Element("subHref")
								.setText(subHrefEle.getValue()));
							childR.addContent(new Element("sourceHref")
								.setText(sourceHrefEle.getValue()));
							
							Element proEle = new Element("property");
							childR.addContent(proEle);
							
							for(int k=0; k<proList.size(); k++){
								Element tempEle = (Element) proList.get(k);
								proEle.addContent(new Element(
										tempEle.getName()).setText(tempEle.getValue()));
							}
						}
					}		
				}
			}			
		}
		System.out.print(rootR);
		return docR;
	}
	
	
	
	private String getSubHref(String name){
		
		int i;
		String  subHref = "#";
		for (i = 0; i < this.subDirName.length; i++){
			if (name.equals(subDirName[i])){
				String srcPath = outputPath.replace("info", "src");
				subHref = srcPath + "\\" + subDirName[i] + "\\" + subDirName[i] + ".html";
				subHref = ".." + subHref.substring(subHref.indexOf("\\src\\"));
				break;
			}
		}
		return subHref;
	}
}
