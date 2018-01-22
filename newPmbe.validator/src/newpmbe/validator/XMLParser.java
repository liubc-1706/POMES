package newpmbe.validator;
import java.io.File;

import org.eclipse.core.resources.IFile;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class XMLParser {
	public XMLParser(){
		super();
	}
	
	public static Document parser(String uri){
		Document docJDOM;
		SAXBuilder bSAX=new SAXBuilder(false);
		try{
			docJDOM=bSAX.build(new File(uri));
			
			
			return docJDOM;
			
		}catch(Exception e){
			e.printStackTrace();
			//return;
		}
		return null;
	}
	
	public static Document parser(File file){
		Document docJDOM;
		SAXBuilder bSAX=new SAXBuilder(false);
		try{
			docJDOM=bSAX.build(file);
			return docJDOM;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static Document parser(IFile file){
		SAXBuilder bSAX=new SAXBuilder(false);
		try{
			Document docJDOM=bSAX.build(file.getLocation().toFile());
			return docJDOM;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
		
	
}
