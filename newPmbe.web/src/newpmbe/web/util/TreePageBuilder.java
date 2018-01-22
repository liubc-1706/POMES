package newpmbe.web.util;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class TreePageBuilder {
	
	String outputDir;
	
	
	public TreePageBuilder(String output){
		outputDir = output;
	}
	
	public void build(){
		
		String rootName = "Default Project";
		File[] tmpList = new File(outputDir + "\\src").listFiles();
		int index = 0;
		String projectType = "";
		int i;
		for (i = 0; i < tmpList.length; i++)
			if (tmpList[i].isFile() && 
					tmpList[i].getName().indexOf(".html") >= 0)
			{
				String str = tmpList[i].getName();
				if (str.contains(".process")){
					index = str.indexOf(".process");
					projectType = "过程模型";
				}else if (str.contains(".organization")){
					index = str.indexOf(".organization");
					projectType = "组织模型";
				}else if (str.contains(".resource")){
					index = str.indexOf(".resource");
					projectType = "资源模型";
				}
				rootName = projectType + ": " + str.substring(0, index);
				break;
			}
		
		String treeStr = HtmlWizard.buildTreeRoot(this.outputDir + "\\src", rootName) +
		recursiveBuildTree(this.outputDir + "\\src");
		String treeHead = "<SCRIPT Language=\"JavaScript\">" + "\n";
		String treeTail = "\n" + "initializeDocument(" + HtmlWizard.pathToVaryName(this.outputDir + "\\src") + ")" + "\n" + "</script>";
		
		String meta = "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">";
		String scriptRef = "<SCRIPT Language=\"JavaScript\" SRC=\"src.js\"></SCRIPT>";
		String head = HtmlWizard.buildElement("head", meta + scriptRef);
		String body = HtmlWizard.buildElement("body", treeHead + treeStr + treeTail);
		String html = HtmlWizard.buildHtml(head, body);
		
		try{
		String fileName = outputDir + "\\src\\" + "TreeView.html";
		FileWriter fw = new FileWriter(fileName);
		fw.write(html);
		fw.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	private String recursiveBuildTree(String inDir)
	{
		String ret = "";
		//assume the 'inDir' is built already
		
		String[] subDir = getLegalDir(inDir);
		
		int i;
		for (i = 0; i < subDir.length; i++)
		{
			ret += HtmlWizard.buildTreeFolder(inDir, subDir[i], subDir[i]);
		}
		
		for (i = 0; i < subDir.length; i++)
		{
			ret += recursiveBuildTree(inDir + "\\" + subDir[i]);
		}
		
		return ret;
	}
	
	private String[] getLegalDir(String rootDir)
	{
		File root = new File(rootDir);
		
		File[] allFiles = root.listFiles();
		ArrayList tmpList = new ArrayList();
		int i;
		
		for (i = 0; i < allFiles.length; i++)
		{
			if (allFiles[i].isDirectory())
			{
				if (allFiles[i].getName().equals(".settings") == false)
					tmpList.add(allFiles[i]);
			}
		}
		
		String[] subDir = new String[tmpList.size()];
		for (i = 0; i < subDir.length; i++)
		{
			File tmpFile = (File)tmpList.get(i);
			subDir[i] = tmpFile.getName();
		}
		
		return subDir;
	}
}
