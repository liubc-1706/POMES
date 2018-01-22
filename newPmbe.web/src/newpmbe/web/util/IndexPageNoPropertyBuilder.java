package newpmbe.web.util;

import java.io.File;
import java.io.FileWriter;

public class IndexPageNoPropertyBuilder {

String outputDir;
	
	String fileName = "index.html";
	
	String titleName = "Index";
	
	//Left tree of the viewer page
	String treePageName = "TreeView.html";
	
	//Right viewer page
	String defaultPageName = "default.html";

	
	/*
	 * Build the index page
	 */
	public IndexPageNoPropertyBuilder(String outDir)
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
				break;
			}
	}
	
	public void build()
	{
		String[] frames = new String[2];
		int[] ratio1 = new int[]{20, 80};
		
		frames[0] = 
			HtmlWizard.buildFrame("treeFrame", "src\\" + this.treePageName);
		
		frames[1] = 
			HtmlWizard.buildFrame("mainFrame", "src\\" + this.defaultPageName);
	
		String frameset = HtmlWizard.buildFrameSet2(frames, ratio1);
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
