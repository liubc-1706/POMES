package newpmbe.models.transform;


import java.io.*;

import newpmbe.models.transform.elements.*;
import newpmbe.models.transform.elements.Process;

import org.jdom.*;
import org.jdom.input.*;
import org.jdom.input.*;
import org.jdom.output.*;

public class test {

	public void BuildXMLDoc() throws IOException,JDOMException {
		/*Process process=new Process();
		process.setName("process1");
		process.setNetID("fefe");
		Product p=new Product();
		p.setOID("12");
		p.setName("product1");
		p.setCreateBy("fanshuchuan");
		Activity a=new Activity();
		a.setActId("1323");
		a.setActState("1");
		a.setName("actofie");
		
		a.setType("compactivity");
		a.setID(a.getOID().getText());
		a.setCreateBy("fanshuchuan");
		Element acts=process.getActivities();
		acts.addContent(a.getXMLElement());
		Element pros=process.getProducts();
		pros.addContent(p.getXMLElement());
		process.setActivities(acts);
		process.setProducts(pros);
		//Product p1=new Product();
		//Element products=dis.getProducts();
		//Element product=dis.getXMLElement();
		//product.setText("feofeifeo");
		//product.setAttribute("type","document",PMBEElement.XMLNS_XSI);
		//products.addContent(product);
		//dis.setProducts(products);
		Element root=process.getXMLElement();
        Document doc = new Document(root); //将根元素植入文档doc中
        Format format = Format.getCompactFormat();
        format.setEncoding("gb2312"); //设置xml文件的字符为gb2312
        format.setIndent("    "); //设置xml文件的缩进为4个空格
        XMLOutputter XMLOut = new XMLOutputter(format);//元素后换行一层元素缩四格 
        XMLOut.output(doc, new FileOutputStream("studentinfo.xml"));  */
		File file=new File("D:\\tet\\tet.process");
		Transformation trans=new Transformation();
		trans.processFileParse(file,null);
		trans.generatePMBEModel();
		/*File file=new File("D:\\Process2\\runtime-New_configuration\\过程实例\\过程实例.process");
		String path="分析与设计/test/test.process#//@document.1";
		Transformation t=new Transformation();
		System.out.println(t.getPath(file, path));*/
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			test s1 = new test();
			System.out.println("Now we build an XML document .....");
			s1.BuildXMLDoc();
			} 
			catch (Exception e) { 
			System.out.println(e.getMessage());
			}
	
	}

}
