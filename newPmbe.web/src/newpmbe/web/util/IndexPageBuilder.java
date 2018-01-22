package newpmbe.web.util;

import java.io.File;
import java.io.FileWriter;

public class IndexPageBuilder {
	
	String outputDir;
	
	String fileName = "index.html";
	
	String titleName = "Index";
	
	//Left tree of the viewer page
	String treePageName = "TreeView.html";
	
	//Right viewer page
	String defaultPageName = "default.html";
	
	//Property viewer page
	String propertyPageName = "defaultProperty.html";
	
	/*
	 * Build the index page
	 */
	public IndexPageBuilder(String outDir)
	{
		outputDir = outDir;
		
		File[] tmpList = new File(this.outputDir + "\\src").listFiles();
		int i;
		for (i = 0; i < tmpList.length; i++)
			if (tmpList[i].isFile() && 
					tmpList[i].getName().indexOf(".html") >= 0 &&
					tmpList[i].getName().equals(this.treePageName) == false &&
					tmpList[i].getName().contains("Property") == false)
			{
				this.defaultPageName = tmpList[i].getName();
				this.propertyPageName = defaultPageName
					.substring(0, defaultPageName.indexOf(".")) + "Property.html";
				break;
			}
	}
	
	public void build()
	{
		String[] frames = new String[3];
		int[] ratio1 = new int[]{20, 80};
		int[] ratio2 = new int[]{80, 20};
		
		frames[0] = 
			HtmlWizard.buildFrame("treeFrame", "src\\" + this.treePageName);
		
		frames[1] = 
			HtmlWizard.buildFrame("mainFrame", "src\\" + this.defaultPageName);
		frames[2] = HtmlWizard.buildFrame("propertyFrame", "src\\" + this.propertyPageName);
		String frameset = HtmlWizard.buildFrameSet(frames, ratio1, ratio2);
		String title = HtmlWizard.buildElement("title", titleName);
		String head = HtmlWizard.buildElement("head", title);
		String html = HtmlWizard.buildHtml(head, frameset);
		
		try{
			String fileName = this.outputDir + "\\" + this.fileName;
			FileWriter fw = new FileWriter(fileName);
			fw.write(html);
			fw.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
	}
}
