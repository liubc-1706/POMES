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
				"D:\\Process2\\web\\JPG\\����ʵ��\\info", "D:\\Process2\\web\\JPG\\����ʵ��\\src");
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
		 * �����ĵ����Ͳ���ӵ��ĵ�
		 */
		DocType  type  = new DocType("myType"); //�ĵ�����
		type.setPublicID("public.dtd");    //��Ϊ public
		doc.addContent(type); //����ĵ�����
		
		Element root = new Element("html"); //����һ��Ԫ��
		doc.setRootElement(root); //����Ԫ����Ϊ��Ԫ��
		  
		Element bodyTag = new Element("body"); 
		root.addContent(bodyTag); //��bodyTag��Ϊhtml����Ԫ��
		
		Element titleTag = new Element("h4"); 
		bodyTag.addContent(titleTag); //��titleTag��ΪbodyTag����Ԫ��
		
		Element tableTag = new Element("table"); 
		titleTag.addContent(tableTag); //��tableTag��ΪtitleTag����Ԫ��
		
		Attribute  tableAtt = new Attribute("border", "1"); //����table��border����
		tableTag.setAttribute(tableAtt); //ΪtableTag��������
		 
		Element trTag1 = new Element("tr"); 
		tableTag.addContent(trTag1); //��trTag��ΪtableTag����Ԫ��
		
		trTag1.addContent(new Element("th").setText("��������"));
		trTag1.addContent(new Element("th").setText("����ֵ"));
		
		for(int k=0; k<elementList.size(); k++){
			
			//add by donkey
			Element eleIndex = new Element("a");
			tableTag.addContent(eleIndex);			
			
			//add by piggy
			Element eleTemp = (Element) elementList.get(k);
			Element trTag2 = new Element("tr"); 
			tableTag.addContent(trTag2); //��trTag��ΪtableTag����Ԫ��
			Element nameEle = eleTemp.getChild("elementName");
			trTag2.addContent(new Element("th").setText("����"));
			String tempStr = nameEle.getValue();
			Attribute eleNameAtt = new Attribute("name", "area" + k);
			eleIndex.setAttribute(eleNameAtt);
			trTag2.addContent(new Element("td").setText(nameEle.getValue()));
			
			Element trTag3 = new Element("tr"); 
			tableTag.addContent(trTag3);
			Element typeEle = eleTemp.getChild("elementType");
			String cnType = getCnType(typeEle.getValue());
			trTag3.addContent(new Element("th").setText("����"));
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
		   * ��ʽ�����
		   */		
		
		try {
			String fileName = this.outputDir + "\\" + propertyFileName;
		//	String fileName = "D:\\PropertyView.html";
			FileOutputStream ops = new FileOutputStream(fileName);
			XMLOutputter xmlout = new XMLOutputter();//�������jdom �ĵ�
			Format format=Format.getPrettyFormat(); //��ʽ���ĵ�
			format.setEncoding("GBK"); //����Ĭ�ϵı�����utf-8,���Ľ���ʾΪ���룬������Ϊgbk
			xmlout.setFormat(format);
			
			xmlout.output(doc, ops);
			ops.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //����ĵ�
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
