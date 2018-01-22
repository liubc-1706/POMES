package newpmbe.web.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.eclipse.core.resources.IFile;
import org.jdom.JDOMException;



public class AllPath {
	
	private String inputDir;
	private String outputDir;
	private String backupIconDir;
	private String backupJSDir;
	private int formatTag;
	private int propertyTag;
	private boolean arrangeTag;
	private boolean popTag;
	private String backColorStr;
	private String frameColorStr;
	private String fontColorStr;

	
	int state = 0;	//0-idle, 1-finish clear, 2-finish build info, 3-finish copy image, 4-finish build page
	//5-finish build index, 6-finish
	
	public AllPath(String in, String out, String backIcon, String backJS,
			int format, int property, boolean arrange, boolean pop, String backColor,
			String frameColor, String fontColor)
	{
		inputDir = in;
		outputDir = out;
		backupIconDir = backIcon;
		backupJSDir = backJS;
		formatTag = format;
		propertyTag = property;
		arrangeTag = arrange;
		popTag = pop;
		backColorStr = backColor;
		frameColorStr = frameColor;
		fontColorStr = fontColor;
	}
	
	public int getState()
	{
		return state;
	}
	
//	public static void main(String[] args)
//	{
//		AllPath pa = new AllPath("e:\\testIpro\\过程实例", "e:\\testIpro\\web", "e:\\testIpro\\icons", "e:\\testIpro\\js");
//		pa.buildInfo();
//		
//	}
	
	public void buildInfo()
	{
		state = 0;
		
		recursiveClearDir(this.outputDir);
		state = 1;
		
	//	recursiveBuildInfo(this.inputDir, this.outputDir + "\\info");	
		state = 2;
		
		if (formatTag == 1){
			
			recursiveCopyJPGImage(this.inputDir, this.outputDir + "\\jpg", this.arrangeTag);
			state = 3;
			
			recursiveBuildInfo(this.inputDir, this.outputDir + "\\info");
			
			recursiveMakeJPGPage(this.outputDir + "\\info", this.outputDir + "\\jpg", this.outputDir + "\\src");
			state= 4;
		}
		else if (formatTag == 2){
			propertyTag = 2;
			
			recursiveCopySVGImage(this.inputDir, this.outputDir + "\\svg", this.arrangeTag);
			state = 3;
			
			recursiveBuildInfo(this.inputDir, this.outputDir + "\\info");
			
			recursiveMakeSVGPage(this.outputDir + "\\info", this.outputDir + "\\svg", this.outputDir + "\\src");
			state= 4;
		}
		
		
		
		if(propertyTag != 1){
			recursiveMakePropertyPage(this.outputDir + "\\info", this.outputDir + "\\src");
		}
		buildTree();
	//	buildTreeTest();
		buildIndexPage(propertyTag);
		
		state = 5;
		
		try{
		copyFiles();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
		state = 6;
	}
	
	private void copyFiles() throws IOException
	{
		//copy src.js and gif files from backup Dir to outputDir\src\
		//invoke the native cmd
		
		File[] listIcon = new File(this.backupIconDir).listFiles();
		File[] listJS = new File(this.backupJSDir).listFiles();
		
		int i;
		for (i = 0; i < listIcon.length; i++)
		{
			File f = listIcon[i];
			if (f.isFile())
			{
				String fname = f.getAbsolutePath();
				String outName = this.outputDir + "\\src\\" + f.getName();
				FileInputStream fis = new FileInputStream(fname);
				FileOutputStream fos = new FileOutputStream(outName);
				
				int tmp = 1;
				while (true)
				{
					tmp = fis.read();
					if (tmp == -1)
						break;
					fos.write(tmp);
				}
				
				fis.close();
				fos.close();		
			}
		}
		
		for (i = 0; i < listJS.length; i++)
		{
			File f = listJS[i];
			if (f.isFile())
			{
				String fname = f.getAbsolutePath();
				String outName = this.outputDir + "\\src\\" + f.getName();
				FileInputStream fis = new FileInputStream(fname);
				FileOutputStream fos = new FileOutputStream(outName);
				
				int tmp = 1;
				while (true)
				{
					tmp = fis.read();
					if (tmp == -1)
						break;
					fos.write(tmp);
				}
				
				fis.close();
				fos.close();		
			}
		}
	}
	
	private void recursiveClearDir(String rootDir)
	{
		File rootFile = new File(rootDir);
		
		if (rootFile.exists() == false)
			rootFile.mkdir();
		
		else{
			File[] list = new File(rootDir).listFiles();
		
			int i;
			for (i = 0; i < list.length; i++)
			{
				if (list[i].isFile())
				{
					list[i].delete();
				}
				else if (list[i].isDirectory())
				{
					recursiveClearDir(rootDir + "\\" + list[i].getName());
					list[i].delete();
				}
			}
		}
	}
	
	private void buildIndexPage(int property)
	{
		property = propertyTag;
		if (property == 1){
			IndexPageNoPropertyBuilder ipb = new IndexPageNoPropertyBuilder(this.outputDir);
			ipb.build();
		}else{
			IndexPageBuilder ipb = new IndexPageBuilder(this.outputDir);
			ipb.build();
		}
	}
	private void recursiveMakePropertyPage(String infoDir, String pageDir){
		
		File tmpIn = new File(infoDir);
		if (tmpIn.exists() == false)
			{
				System.out.println("Error: InfoDir not exist...." + infoDir);
				return;
			}
		
		File tmpOut = new File(pageDir);
		if (tmpOut.exists() == false)
			tmpOut.mkdir();
		
		//do page build
		try {
			PropertyPageBuilder ppb = new PropertyPageBuilder(infoDir, pageDir);
			ppb.build();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		
		
		//Do recursive
		String[] subDir = getAllInfo(infoDir);
		int i;
		for (i = 0; i < subDir.length; i++)
		{
			recursiveMakePropertyPage(infoDir + "\\" + subDir[i], 
					pageDir + "\\" + subDir[i]);
		}
	}
	@SuppressWarnings("unused")
	private void buildTreeTest(){
		TreePageBuilder tpb = new TreePageBuilder(this.outputDir);
		tpb.build();
	}
	private void buildTree()
	{
		//The fileName on default is "TreeView.html"
		
		String rootName = "Default Project";
		File[] tmpList = new File(this.outputDir + "\\src").listFiles();
		int index = 0;
		String projectType = "";
		if (this.inputDir.contains(".process")){
			projectType = "过程模型";
		}else if (this.inputDir.contains(".organization")){
			projectType = "组织模型";
		}else if (this.inputDir.contains(".resource")){
			projectType = "资源模型";
		}
		int i;
		for (i = 0; i < tmpList.length; i++)
			if (tmpList[i].isFile() && 
					tmpList[i].getName().indexOf(".html") >= 0)
			{
				String str = tmpList[i].getName();
				if (str.contains(".html"))
					index = str.indexOf(".html");
					
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
		String fileName = this.outputDir + "\\src\\" + "TreeView.html";
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
		
		String[] subDir = getAllInfo(inDir);
		
		int i;
		for (i = 0; i < subDir.length; i++)
		{
			ret += HtmlWizard.buildTreeFolder(inDir, subDir[i], subDir[i]);
		}
		
		/*
		String fileName = "";
		File[] fileList = new File(inDir).listFiles();
		for (i = 0; i < fileList.length; i++)
		{
			if (fileList[i].isFile() && fileList[i].getName().indexOf(".html") >= 0)
			{
				fileName = fileList[i].getName();
				break;
			}
		}
		ret += HtmlWizard.buildTreeLeaf(inDir, fileName);
		*/
		
		//Do recursive
		for (i = 0; i < subDir.length; i++)
		{
			ret += recursiveBuildTree(inDir + "\\" + subDir[i]);
		}
		
		return ret;
	}
	
	private void recursiveMakeJPGPage(String infoDir, String imageDir, String pageDir)
	{
		//make sure the infoDirs and imageDir exist, build pageDir
		File tmpIn = new File(infoDir);
		if (tmpIn.exists() == false)
			{
				System.out.println("Error: InfoDir not exist...." + infoDir);
				return;
			}
		
		tmpIn = new File(imageDir);
		if (tmpIn.exists() == false)
		{
			System.out.println("Error: ImageDir not exist...." + imageDir);
			return;
		}
		
		File tmpOut = new File(pageDir);
		if (tmpOut.exists() == false)
			tmpOut.mkdir();
		
		//do page build
		SingleJPGPageBuilder  spb = new SingleJPGPageBuilder(
				infoDir, imageDir, pageDir, propertyTag, backColorStr, frameColorStr, fontColorStr);
		try {
			spb.parseInfo();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		
		//Do recursive
		String[] subDir = getAllInfo(infoDir);
		int i;
		for (i = 0; i < subDir.length; i++)
		{
			recursiveMakeJPGPage(infoDir + "\\" + subDir[i], 
					imageDir + "\\" + subDir[i],
					pageDir + "\\" + subDir[i]);
		}
	}
	
	private void recursiveMakeSVGPage(String infoDir, String imageDir, String pageDir)
	{
		//make sure the infoDirs and imageDir exist, build pageDir
		File tmpIn = new File(infoDir);
		if (tmpIn.exists() == false)
			{
				System.out.println("Error: InfoDir not exist...." + infoDir);
				return;
			}
		
		tmpIn = new File(imageDir);
		if (tmpIn.exists() == false)
		{
			System.out.println("Error: ImageDir not exist...." + imageDir);
			return;
		}
		
		File tmpOut = new File(pageDir);
		if (tmpOut.exists() == false)
			tmpOut.mkdir();
		
		//do page build
		SingleSVGPageBuilder  spb = new SingleSVGPageBuilder(infoDir, imageDir, pageDir);
		try {
			spb.parseInfo();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		
		//Do recursive
		String[] subDir = getLegalDir(infoDir);
		int i;
		for (i = 0; i < subDir.length; i++)
		{
			recursiveMakeSVGPage(infoDir + "\\" + subDir[i], 
					imageDir + "\\" + subDir[i],
					pageDir + "\\" + subDir[i]);
		}
	}
	
	@SuppressWarnings("unused")
	private void recursiveCopyJPGImage(String inDir, String outDir, boolean arrange)
	{
		arrange = arrangeTag;
		//make sure the inDir and outDir exist
		File tmpIn = new File(inDir);
		if (tmpIn.exists() == false)
			{
				System.out.println("Error: Dir not exist...." + inDir);
				return;
			}
		
		File tmpOut = new File(outDir);
		if (tmpOut.exists() == false)
			tmpOut.mkdir();		
		
		//Do the image copy jobs
		
			
		String[] myImage = getAllDiagram(inDir);
		
		for (int k = 0; k < myImage.length; k++)
		{
			
			int indexName = inDir.lastIndexOf("\\");
			String folderName = inDir.substring(indexName + 1);
				
			if(arrange == true){
					
				ArrangeAll arr = new ArrangeAll();
//				try {
//					arr.arrangeAll(inDir + "\\" + myImage[k].substring(0, myImage[k].indexOf(".")) + ".process_diagram");
//				} catch (JDOMException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
			
				IFile diagramFile = CopyAsJPG.openDiagramFile(inDir, folderName, myImage[k]);
				
		//		ArrangeAll.arrangeAll(diagramFile, myImage[k]);
				
				
				CopyAsJPG.genImage(diagramFile, myImage[k]);
				CopyAsJPG.closeDiagram(myImage[k]);
				
				int index = myImage[k].indexOf(".");
				String imageFile = myImage[k].substring(0, index);
				BufferedImage jpgBi = CopyAsJPG.readImage(inDir + "\\" + imageFile + ".jpg");		
			    CopyAsJPG.writeJPEGImage(jpgBi, outDir + "\\" + imageFile + ".jpg");

			    String[] subDir = getLegalDir(inDir);
				int i;
				for (i = 0; i < subDir.length; i++)
				{
					recursiveCopyJPGImage(inDir + "\\" + subDir[i], outDir + "\\" + subDir[i], arrange);
				}
		
		}
		
		//Do recursive
		
	}
	
	private void recursiveCopySVGImage(String inDir, String outDir, boolean arrange)
	{
		//make sure the inDir and outDir exist
		File tmpIn = new File(inDir);
		if (tmpIn.exists() == false)
			{
				System.out.println("Error: Dir not exist...." + inDir);
				return;
			}
		
		File tmpOut = new File(outDir);
		if (tmpOut.exists() == false)
			tmpOut.mkdir();		
		
		//Do the image copy jobs
		
		String[] myImage = getAllDiagram(inDir);
		
		int k;
		for (k = 0; k < myImage.length; k++)
		{
			//String outputDir = outDir + "\\" + myImage[k];
			//IFile imageFile = CopyAsJPG.OpenDiagram(inDir, myImage[k]);
			
			int indexName = inDir.lastIndexOf("\\");
			String folderName = inDir.substring(indexName + 1);
			
			IFile diagramFile = CopyAsSVG.openDiagramFile(inDir, folderName, myImage[k]);
			if(arrange == true){
	//			ArrangeAll.arrangeAll(diagramFile, myImage[k]);
			}
			CopyAsSVG.genImage(diagramFile, myImage[k]);
			CopyAsSVG.closeDiagram(myImage[k]);
			
			int index = myImage[k].indexOf(".");
			String imageFile = myImage[k].substring(0, index);
			
			FileInputStream fis = null;
			FileOutputStream fos = null;
			try {
				fis = new FileInputStream(inDir + "\\" + imageFile + ".svg");
				fos= new FileOutputStream(outDir + "\\" + imageFile + ".svg");		
				
				byte[] b=new byte[1024*1024]; 
				int len; 
				while((len = fis.read(b))!=-1){ 
				fos.write(b,0,len); 
				fos.flush(); 
				fos.close(); 
				fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		//Do recursive
		String[] subDir = getLegalDir(inDir);
		int i;
		for (i = 0; i < subDir.length; i++)
		{
			recursiveCopySVGImage(inDir + "\\" + subDir[i], outDir + "\\" + subDir[i], arrange);
		}
	}
	
	@SuppressWarnings("unused")
	private void recursiveCopyDoc(String inDir, String outDir)
	{
		//make sure the inDir and outDir exist
		File tmpIn = new File(inDir);
		if (tmpIn.exists() == false)
			{
				System.out.println("Error: Dir not exist...." + inDir);
				return;
			}
		
		File tmpOut = new File(outDir);
		if (tmpOut.exists() == false)
			tmpOut.mkdir();		
		
		//Do the doc copy jobs
		String[] docFiles = getAllDoc(inDir);
		int k;
		for (k = 0; k < docFiles.length; k++)
		{
			try
			{
				FileReader fr = new FileReader(inDir + "\\" + docFiles[k]);
				char[] buffer = null;
				fr.read(buffer);
				fr.close();
				
				FileWriter fw = new FileWriter(outDir + "\\" + docFiles[k]);
				fw.write(buffer);
				fw.close();
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
		
		//Do recursive
		String[] subDir = getLegalDir(inDir);
		int i;
		for (i = 0; i < subDir.length; i++)
		{
			recursiveCopyDoc(inDir + "\\" + subDir[i], outDir + "\\" + subDir[i]);
		}
	}
	
	private void recursiveBuildInfo(String inDir, String outDir)
	{
		//make sure the inDir and outDir exist
		File tmpIn = new File(inDir);
		if (tmpIn.exists() == false)
			{
				System.out.println("Error: Dir not exist...." + inDir);
				return;
			}
		
		File tmpOut = new File(outDir);
		if (tmpOut.exists() == false)
			tmpOut.mkdir();
		
		//Do the info jobs
		String[] subDir = getLegalDir(inDir);
		
//		InfoParser ip = new InfoParser(inDir, outDir, subDir);
//		String content = ip.parse();
//		ip.writeToDisk(content);
		
		ModelParser ip = new ModelParser(inDir, outDir, subDir);
		ip.parse();

		//recursive
		
		int i;
		for (i = 0; i < subDir.length; i++)
		{
			recursiveBuildInfo(inDir + "\\" + subDir[i], outDir + "\\" + subDir[i]);
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private String[] getAllDoc(String rootDir)
	{
		File root = new File(rootDir);
		
		File[] allFiles = root.listFiles();
		ArrayList tmpList = new ArrayList();
		int i;
		
		for (i = 0; i < allFiles.length; i++)
		{
			if (allFiles[i].isFile())
			{
				if (allFiles[i].getName().indexOf(".doc") >= 0)
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
	
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	private String[] getAllJpg(String rootDir)
	{
		File root = new File(rootDir);
		
		File[] allFiles = root.listFiles();
		ArrayList tmpList = new ArrayList();
		int i;
		
		for (i = 0; i < allFiles.length; i++)
		{
			if (allFiles[i].isFile())
			{
				if (allFiles[i].getName().indexOf(".jpg") >= 0)
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
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private String[] getAllDiagram(String rootDir){
		
		File root = new File(rootDir);
		
		File[] allFiles = root.listFiles();
		ArrayList tmpList = new ArrayList();
		int i;
		
		for (i = 0; i < allFiles.length; i++)
		{
			if (allFiles[i].isFile())
			{
				if (allFiles[i].getName().indexOf("process_diagram") >= 0
						||allFiles[i].getName().indexOf("organization_diagram") >= 0
						||allFiles[i].getName().indexOf("resource_diagram") >= 0)
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
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private String[] getAllInfo(String rootDir)
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
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
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
				File[] files = allFiles[i].listFiles();
				boolean fileTag = false;
				for (int j=0; j<files.length; j++){
					String nameTmp = files[j].getName();
					if (nameTmp.contains("process_diagram")
							||nameTmp.contains("organization_diagram")
							||nameTmp.contains("resource_diagram")){
						fileTag = true;
						break;
					}
				}
				
				if (allFiles[i].getName().equals(".settings") == false && fileTag == true)
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
