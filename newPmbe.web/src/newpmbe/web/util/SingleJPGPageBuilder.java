package newpmbe.web.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import newpmbe.web.constant.*;
import org.jdom.Attribute;
import org.jdom.DocType;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class SingleJPGPageBuilder {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		SingleJPGPageBuilder2 spb = new SingleJPGPageBuilder2("D:\\Process2\\web\\JPG\\����ʵ��\\info",
//				"D:\\Process2\\web\\JPG\\����ʵ��\\jpg", "D:\\Process2\\web\\JPG\\����ʵ��\\src");
//		try{
//		spb.parseInfo();
//		}catch(Exception ex)
//		{
//			ex.printStackTrace();k
//		};
//	}
	
	String infoPath;
	String imagePath;
	String pagePath;
	int propertyView;
	String backColorStr;
	String frameColorStr;
	String fontColorStr;
	
	public SingleJPGPageBuilder(String inPath, String imPath, String paPath, 
			int property, String backColor, String frameColor, String fontColor)
	{
		infoPath = inPath;
		imagePath = imPath;
		pagePath = paPath;
		propertyView = property;
		backColorStr = backColor;
		frameColorStr = frameColor;
		fontColorStr = fontColor;
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
		
		imageFileName = preName + ".jpg";
		
		//load info file parse
		String name;
		String type;
		String path;		
		String cnType = "";
		
		SAXBuilder builder = new SAXBuilder();		
		File in = new File(infoPath + "\\" + fileName);
		Document docTemp = builder.build(in);
		
		Element rootElement = docTemp.getRootElement();
		List childrenList = rootElement.getChildren();
		
		name = rootElement.getChildText("infoName");
		type = rootElement.getChildText("infoType");
		path = rootElement.getChildText("infoHref");
		
		if (type.equals("process")){
			cnType = "����ģ��";
		}else if (type.equals("organization")){
			cnType = "��֯ģ��";
		}else if (type.equals("resource")){
			cnType = "��Դģ��";
		}
		
		Element elements = rootElement.getChild("elements");
		List elementList = elements.getChildren();
		
	
	
		//build html
		
		Document doc = new Document();
		
		DocType type2 = new DocType("myType"); //�ĵ�����
		type2.setPublicID("public.dtd");    //��Ϊ public
		doc.addContent(type2); //����ĵ�����
		
		Element root = new Element("html"); //����diagramԪ��
		doc.setRootElement(root); //����Ԫ����Ϊ��Ԫ��
		
		Element scriptElement = new Element("script");
		scriptElement.setAttribute("language", "javascript");
		String tempStr = pagePath;
		int tempIndex = pagePath.indexOf("src");
		int num = 0;
		tempStr = tempStr.substring(tempIndex + 3);
		while(tempStr.contains("\\")){
			num++;
			tempStr = tempStr.substring(tempStr.indexOf("\\") + 1);
		}
		String srcStr = "";
		while(num > 0){
			srcStr += "..\\";
			num--;
		}
		srcStr += "src.js";
		
		scriptElement.setAttribute("src", srcStr);
		scriptElement.setText("javascript");
		root.addContent(scriptElement);
		
		
		
	//	String script = Script.showDiv + Script.hideDiv + Script.scrollImg;
	//	scriptElement.addContent(script);
		
		Element headElement = new Element("head");
		root.addContent(headElement);
		headElement.addContent(new Element("title").setText(preName));
		Element metaElement = new Element("meta");
		headElement.addContent(metaElement);
		Attribute httpequivAtt = new Attribute("http-equiv", "Content-Type");
		Attribute contentAtt = new Attribute("content", "text/html; charset=gb2312");
		
		metaElement.setAttribute(httpequivAtt);
		metaElement.setAttribute(contentAtt);
		
		
		Element bodyElement = new Element("body");
		Attribute onloadAtt = new Attribute("onload", 
				String.format("changeProperty('%s')",preName));
		bodyElement.setAttribute(onloadAtt);
		root.addContent(bodyElement);
		
		Element pElement = new Element("p");
		bodyElement.addContent(pElement);
		Attribute pAtt = new Attribute("align", "center");
		pElement.setAttribute(pAtt);
		Element fontElement = new Element("font");
		pElement.addContent(fontElement);
		Attribute sizeAtt = new Attribute("size", "4");
		Attribute faceAtt = new Attribute("face", "Arial, Helvetica, sans-serif");
		fontElement.setAttribute(sizeAtt);
		fontElement.setAttribute(faceAtt);
		fontElement.addContent(new Element("u").setText(cnType + ":" + name));
	
		Element pElement1 = new Element("p");
		bodyElement.addContent(pElement1);
		pElement1.addContent(new Element("br").setText("\n"));
		pElement1.addContent(new Element("br").setText("\n"));
		
		Element pElement2 = new Element("p");
		bodyElement.addContent(pElement2);
		Element imgElement = new Element("img");
		pElement2.addContent(imgElement);
		Attribute borderAtt = new Attribute("border", "0");
		String jpgPath = imagePath.substring(imagePath.indexOf("\\jpg"));
		
		System.out.print(jpgPath + "\n");
		int tag = 0;
		String tempJpgPath = jpgPath;
		while(tempJpgPath.contains("\\")){
			tag++;
			tempJpgPath = tempJpgPath.substring(tempJpgPath.indexOf("\\")+1);
		}
	
		String preJpgPath = "";
		while(tag > 0){
			preJpgPath += "..\\"; 
			tag--;
		}
		Attribute srcAtt = new Attribute("src", preJpgPath + jpgPath.substring(1) + "\\" + imageFileName);
		Attribute usemapAtt = new Attribute("usemap", "#Map");
		Attribute onmousewheelAtt = new Attribute("onmousewheel", "return zoomimg(this)");
		imgElement.setAttribute(borderAtt);
		imgElement.setAttribute(srcAtt);
		imgElement.setAttribute(usemapAtt);
		imgElement.setAttribute(onmousewheelAtt);
		
		
		Element mapElement = new Element("map");
		pElement2.addContent(mapElement);
		Attribute nameAtt = new Attribute("name", "Map");
		mapElement.setAttribute(nameAtt);
		
		String posX;
		String posY;
		String width;
		String height;
		String subHref;
		String elementName;
		String elementType;
		String elementCnType;
		
		int minX = CanvasSize.maxX;
		int minY = CanvasSize.maxY;
		
		for(int t=0; t<elementList.size(); t++){
			
			Element temp = (Element) elementList.get(t);
			int tmpX = Integer.parseInt(temp.getChildText("posX"));
			int tmpY = Integer.parseInt(temp.getChildText("posY"));
			
			if (tmpX < minX)
				minX = tmpX;
			if (tmpY < minY)
				minY = tmpY;
		}
		
		minX -= 10;
		minY -= 10;
		
		for(i=0; i < elementList.size(); i++){
			
			Element e = (Element) elementList.get(i);
			posY = e.getChildText("posY");
			posX = e.getChildText("posX");
		
			width = e.getChildText("width");
			height = e.getChildText("height");
			subHref = e.getChildText("subHref");
			
			elementName = e.getChildText("elementName");
			elementType = e.getChildText("elementType");
			elementCnType = getCnType(elementType);
			Element propertyEle = e.getChild("property");
			List propertyList = propertyEle.getChildren();
		
			
			int x1 = Integer.parseInt(posX);
			int y1 = Integer.parseInt(posY);
			x1 -= minX;
			y1 -= minY;
			int x2 = x1 + Integer.parseInt(width);
			int y2 = y1 + Integer.parseInt(height);
			
			Element areaElement = new Element("area");
			mapElement.addContent(areaElement);
			Attribute shapeAtt = new Attribute("shape", "rect");
			Attribute coordsAtt = new Attribute(
					"coords", x1 + "," + y1 + "," + x2 + "," + y2 );
			Attribute hrefAtt = new Attribute("href", subHref);
			
			areaElement.setAttribute(shapeAtt);
			areaElement.setAttribute(coordsAtt);			
		
			String area = "area" + i;
			if (subHref.equals("#") == false)
				areaElement.setAttribute(hrefAtt);
			else
			{
				Attribute onclickAtt = new Attribute("onclick", String.format("changeProperty('%s', '%s')", preName, area));
				areaElement.setAttribute(onclickAtt);
			}
			areaElement.setAttribute("onmouseout", "hiddiv(" + area + ")");
			areaElement.setAttribute("onmousemove", "showdiv(" + area + ")");
			
			if(propertyView != 2){
				Element divElement = new Element("div");
				bodyElement.addContent(divElement);
				Attribute idAtt = new Attribute("id", area);
				String styleStr = "position: absolute; font-size:9pt; border-width: 1 ; color: " 
					+ fontColorStr + "; border-style: groove; border-color: " + frameColorStr 
					+ "; width: 126; height: 27; background-color: " + backColorStr 
					+ "; display: none; left: 11; top: 36";
				Attribute styleAtt = new Attribute("style", styleStr);
				divElement.setAttribute(idAtt);
				divElement.setAttribute(styleAtt);
				
				Element pElement3 = new Element("p");
				divElement.addContent(pElement3);
				pElement3.addContent("���� : " + elementName);
				
				Element pElement4 = new Element("p");
				divElement.addContent(pElement4);
				pElement4.addContent("���� : " + elementCnType);
				
//				Element hrElement = new Element("hr");
//				divElement.addContent(hrElement);
//				hrElement.addContent("���˵�� : ");
				
				
//				Element pElement5 = new Element("p");
//				divElement.addContent(pElement5);
//				pElement5.addContent("���˵�� : ");
				
//				for(int j=0; j<propertyList.size(); j++){
//					Element temp = (Element) propertyList.get(j);
//					Element pElement6 = new Element("p");
//					divElement.addContent(pElement6);
////					Element bElement = new Element("b");
////					bElement.addContent(temp.getName() + " : " + temp.getValue());
//					pElement6.addContent(temp.getName() + " : " + temp.getValue());
//			
//				}
//				divElement.setText(divText);
			}
			
		//	System.out.print(doc);
			try {
				String pageFileName = pagePath + "\\" + preName + ".html";
			//	String fileName = "D:\\PropertyView.html";
				FileOutputStream ops = new FileOutputStream(pageFileName);
				XMLOutputter xmlout = new XMLOutputter();//�������jdom �ĵ�
				Format format=Format.getPrettyFormat(); //��ʽ���ĵ�
				format.setEncoding("GBK"); //����Ĭ�ϵı�����utf-8,���Ľ���ʾΪ���룬������Ϊgbk
				xmlout.setFormat(format);
				
				System.out.print(doc);
				xmlout.output(doc, ops);
				ops.close();
				
			} catch (IOException ioe) {
				// TODO Auto-generated catch block
				ioe.printStackTrace();
			} 
		}
	
		//����ĵ�
		try {
			String pageFileName = pagePath + "\\" + preName + ".html";
		//	String fileName = "D:\\PropertyView.html";
			FileOutputStream ops = new FileOutputStream(pageFileName);
			XMLOutputter xmlout = new XMLOutputter();//�������jdom �ĵ�
			Format format=Format.getPrettyFormat(); //��ʽ���ĵ�
			format.setEncoding("GBK"); //����Ĭ�ϵı�����utf-8,���Ľ���ʾΪ���룬������Ϊgbk
			xmlout.setFormat(format);
			
			System.out.print(doc);
			xmlout.output(doc, ops);
			ops.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	private String getCnType(String elementType) {
		// TODO Auto-generated method stub
		String cnTypeStr = "";
		if (elementType.equals("EMPNormalActivity")){
			cnTypeStr = "�";
		}else if (elementType.equals("EMPAutoActivity")){
			cnTypeStr = "�Զ��";
		}else if (elementType.equals("EMPManualBatchActivity")){
			cnTypeStr = "�ֹ�������";
		}else if (elementType.equals("EMPAutoBatchActivity")){
			cnTypeStr = "�Զ�������";
		}else if (elementType.equals("EMPCompActivity")){
			cnTypeStr = "��ϻ";
		}else if (elementType.equals("EMPDocument")){
			cnTypeStr = "�ĵ�";
		}else if (elementType.equals("EMPArtifact")){
			cnTypeStr = "��Ʒ";
		}else if (elementType.equals("EMPMessage")){
			cnTypeStr = "��Ϣ";
		}else if (elementType.equals("EMPOther")){
			cnTypeStr = "������Ʒ";
		}else if (elementType.equals("EMPProductPackage")){
			cnTypeStr = "��ϲ�Ʒ";
		}else if (elementType.equals("EMPClock")){
			cnTypeStr = "ʱ��";
		}else if (elementType.equals("EMPInAnd")){
			cnTypeStr = "������";
		}else if (elementType.equals("EMPInOr")){
			cnTypeStr = "�����";
		}else if (elementType.equals("EMPOutAnd")){
			cnTypeStr = "�����";
		}else if (elementType.equals("EMPOutOr")){
			cnTypeStr = "�����";
		}else if (elementType.equals("EMRRole")){
			cnTypeStr = "��ɫ";
		}else if (elementType.equals("EMRToolType")){
			cnTypeStr = "��������";
		}else if (elementType.equals("EMRMachineType")){
			cnTypeStr = "�豸����";
		}else if (elementType.equals("EMRLocationType")){
			cnTypeStr = "��������";
		}else if (elementType.equals("EMOResourceGroupType")){
			cnTypeStr = "��Դ��";
		}else if (elementType.equals("EMRAbstractLocationType")){
			cnTypeStr = "����������";
		}else if (elementType.equals("EMRAbstractMachineType")){
			cnTypeStr = "�����豸����";
		}else if (elementType.equals("EMRAbstractToolType")){
			cnTypeStr = "���󹤾�����";
		}
		return cnTypeStr;
	}
}
