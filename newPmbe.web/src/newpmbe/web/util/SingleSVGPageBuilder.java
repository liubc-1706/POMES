package newpmbe.web.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import newpmbe.web.constant.CanvasSize;
import newpmbe.web.constant.DefaultSize;
import newpmbe.web.constant.Script;
import org.jdom.Attribute;
import org.jdom.DocType;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class SingleSVGPageBuilder {
	
	String infoPath;
	String imagePath;
	String pagePath;
	
	public SingleSVGPageBuilder(String inPath, String imPath, String paPath)
	{
		infoPath = inPath;
		imagePath = imPath;
		pagePath = paPath;
	}
	
	public static void main(String[] agrc){
		SingleSVGPageBuilder sspb = new SingleSVGPageBuilder(
				"D:\\Process2\\web\\SVG\\过程实例\\info",
				"D:\\Process2\\web\\SVG\\过程实例\\svg",
				"D:\\Process2\\web\\SVG\\过程实例\\src");
		try {
			sspb.parseInfo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void parseInfo() throws Exception
	{
		//find file, both info and image
		File tmpFile = new File(infoPath);
		File[] tmpList = tmpFile.listFiles();
		String fileName = "";
		String preName = "";
		String imageFileName;
		
		int i;
		for (i = 0; i < tmpList.length; i++)
		{
			if (tmpList[i].isFile() && tmpList[i].getName().indexOf(".info") >=0)
			{
				fileName = tmpList[i].getName();
				int tmpIndex = fileName.indexOf(".info");
				preName = fileName.substring(0, tmpIndex);
				break;
			}
		}
		
		imageFileName = preName + ".svg";
		
		//load info file parse
		String name;
		String type;
		String path;		
				
		SAXBuilder builder = new SAXBuilder();		
		File in = new File(infoPath + "\\" + fileName);
		Document docTemp = builder.build(in);
		
		Element rootElement = docTemp.getRootElement();
		List childrenList = rootElement.getChildren();
		
		name = rootElement.getChildText("infoName");
		type = rootElement.getChildText("infoType");
		path = rootElement.getChildText("infoHref");
		
		Element elements = rootElement.getChild("elements");
		List elementList = elements.getChildren();
		
		int minX = CanvasSize.maxX;
		int minY = CanvasSize.maxY;
		int maxX = 0;
		int maxY = 0;
		for(int t=0; t<elementList.size(); t++){
			
			Element temp = (Element) elementList.get(t);
			int tmpMinX = Integer.parseInt(temp.getChildText("posX"));
			int tmpMinY = Integer.parseInt(temp.getChildText("posY"));
			int tmpWidth = DefaultSize.getWidth("");
			int tmpHeight = DefaultSize.getHeight("");
			if (temp.getChild("width") != null) 
				tmpWidth = Integer.parseInt(temp.getChildText("width"));
			if (temp.getChild("height") != null)
				tmpHeight = Integer.parseInt(temp.getChildText("height"));
			int tmpMaxX = tmpMinX + tmpWidth;
			int tmpMaxY = tmpMinY + tmpHeight;
			
			if (tmpMinX < minX)
				minX = tmpMinX;
			if (tmpMinY < minY)
				minY = tmpMinY;
			if (tmpMaxX > maxX)
				maxX = tmpMaxX;
			if (tmpMaxY > maxY)
				maxY = tmpMaxY;
		}
		
		int viewX = maxX - minX;
		int viewY = maxY - minY;
		
		//build html
		
		Document doc = new Document();
		DocType docTy  = new DocType("myType"); //文档类型
		docTy.setPublicID("public.dtd");    //设为 public
		doc.addContent(docTy); //添加文档类型
		
		Element root = new Element("html"); //创建一个元素
		doc.setRootElement(root); //将该元素做为根元素
		  
		Element headTag = new Element("head"); 
		root.addContent(headTag); //将headTag做为html的子元素
		
		headTag.addContent(new Element("title").setText(preName));
		//将titleTag做为headTag的子元素
		
		
		Element bodyTag = new Element("body"); 
		Attribute onloadAtt = new Attribute("onload", 
				String.format("changeProperty('%s')",preName));
		bodyTag.setAttribute(onloadAtt);
		root.addContent(bodyTag); //将bodyTag做为root的子元素
		
		Element pTag1 = new Element("p");
		bodyTag.addContent(pTag1);
		
		Attribute alignAtt = new Attribute("align", "center");
		pTag1.setAttribute(alignAtt);
		
		Element fontTag = new Element("font");
		pTag1.addContent(fontTag);
		
		Attribute sizeAtt = new Attribute("size", "4");
		Attribute faceAtt = new Attribute("face", "Arial, Helvetica, sans-serif");
		fontTag.setAttribute(sizeAtt);
		fontTag.setAttribute(faceAtt);
		
		fontTag.addContent(new Element("u").setText(type + ":" + preName));
		
		
		Element pTag2 = new Element("p");
		bodyTag.addContent(pTag2);
		Element brTag = new Element("br");
		pTag2.addContent(brTag);
		
		
		Element objectTag = new Element("object");
		bodyTag.addContent(objectTag);
		
		Attribute typeAtt = new Attribute("type", "image/svg+xml");
		Attribute dataAtt = new Attribute("data", imagePath + "\\" + imageFileName);
		Attribute widthAtt = new Attribute("width", viewX + "");
		Attribute heightAtt = new Attribute("height", viewY + "");
		objectTag.setAttribute(typeAtt);
		objectTag.setAttribute(dataAtt);
		objectTag.setAttribute(widthAtt);
		objectTag.setAttribute(heightAtt);
		
		Element imageTag = new Element("img");
		objectTag.addContent(imageTag);
		
		Attribute srcAtt = new Attribute("src", "NonSVG.gif");
		Attribute mcesrcAtt = new Attribute("mce_src", "NonSVG.gif");
		Attribute altAtt = new Attribute("alt", "SVG 图像的静态版本");
		
	//	System.out.print(doc);
		  /*
		   * 格式化输出
		   */		
		
		try {
			String pageFileName = pagePath + "\\" + preName + ".html";
			FileOutputStream ops = new FileOutputStream(pageFileName);
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
		
		
//		String htmlStr = "";
//		
//		String title = HtmlWizard.buildElement("title", name);
//		String metaData = "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">";
//		String head = HtmlWizard.buildElement("head", title + metaData);
//		
//		String subject = HtmlWizard.buildSubject(type + ":" + name);
//		String imageMap = HtmlWizard.buildImageWithMap(
//				imagePath + "\\" + imageFileName, hrefList, posList);
//		String propDiv = HtmlWizard.buildDiv(posList, propList);
//		
//		String body = HtmlWizard.buildElement("body", subject + imageMap + propDiv);
//		String script = HtmlWizard.buildJavaScript(Script.showDiv + Script.hideDiv + Script.scrollImg);
//		
//		htmlStr = HtmlWizard.buildHtml(script + head, body);
//		
//		//write to disk
//		String pageFileName = pagePath + "\\" + preName + ".html";
//		FileWriter fw = new FileWriter(pageFileName);
//		fw.write(htmlStr);
//		fw.close();
//	
	
}
