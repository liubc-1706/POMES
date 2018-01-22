package newpmbe.web.util;

import java.io.File;

public class PageGenerator {
	
	String infoDir;
	
	String jpgDir;
	
	String outDir;
	
	public PageGenerator(String in)
	{
		infoDir = in + "\\" + "info";
		jpgDir = in + "\\" + "jpg";
		outDir = in + "\\" + "src";
		
		File tmpOut = new File(outDir);
		if (tmpOut.exists() == false)
			tmpOut.mkdir();
	}
	
	

}
