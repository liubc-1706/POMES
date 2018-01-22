package newpmbe.web.util;

public class HtmlWizard {

	public static String buildHtml(String head, String body)
	{
		String ret = "<html>" + "\n" +
					head + "\n" +
					body + "\n" +
					"</html>";
		
		return ret;
	}
	
	public static String buildElement(String nodeName, String nodeValue)
	{
		String ret = "";
		ret += "<" + nodeName + ">" + nodeValue + 
				"</" + nodeName + ">";
		
		ret += "\n";
		return ret;
	}
	
	public static String buildFrameSet(String[] frames, int[] ratio1, int[] ratio2)
	{
		//add frameset1
		String ret = "<frameset cols = \"";
		int i;
		for (i = 0; i < ratio1.length; i++)
			if (i == 0)
				ret += ratio1[i] + "%";
			else
				ret += "," + ratio1[i] + "%";
		
		ret += "\">" + "\n";
		
		//add frame1
		ret += frames[0] + "\n";
		
		//add frameset2
		ret += "<frameset rows = \"";
		for (i = 0; i < ratio2.length; i++)
			if (i == 0)
				ret += ratio2[i] + "%";
			else
				ret += "," + ratio2[i] + "%";
		
		ret += "\">" + "\n";
		
		//add frame2 and frame3
		for (i = 1; i < frames.length; i++)
		{
			ret += frames[i] + "\n";
		}
		
		//add tail
		ret += "</frameset>\n</frameset>";
	
		
		return ret;
	}
	
	public static String buildFrameSet2(String[] frames, int[] ratio1)
	{
		//add frameset1
		String ret = "<frameset cols = \"";
		int i;
		for (i = 0; i < ratio1.length; i++)
			if (i == 0)
				ret += ratio1[i] + "%";
			else
				ret += "," + ratio1[i] + "%";
		
		ret += "\">" + "\n";
		
		//add frame1
		ret += frames[0] + "\n";
		
		for (i = 1; i < frames.length; i++)
		{
			ret += frames[i] + "\n";
		}
		
		//add tail
		ret += "</frameset>\n</frameset>";
	
		
		return ret;
	}
	
	public static String buildFrame(String name, String src)
	{
		String ret = "<frame name=\"" + name + "\" src=\"" + src + "\" resize>";
		
		return ret;
	}
	
	public static String buildSubject(String subject)
	{
		String tmpHead = "<p align=\"center\"><font size=\"4\" face=\"Arial, Helvetica, sans-serif\"><u>";
		String tmpTail = "</u></font> </p>\r\n";
		
		return tmpHead + subject + tmpTail;
	}
	
	public static String buildImageWithMap(String imageSrc, String[] href, String[] pos)
	{
		String imageStr = "<img border=\"0\" src=\"" + imageSrc + "\" usemap=\"#Map\" onmousewheel=\"return zoomimg(this);\" />";
		
		String mapHead = "<map name=\"Map\">";
		String mapTail = "</map>\r\n";
		
		String areaStr = "";
		
		int i;
		for (i = 0; i < href.length; i++)
		{
			if (href[i].equals("N_U_L_L") == false)
			{
				String[] tmp = pos[i].split(",");
				areaStr += buildRetangleArea(
						Integer.parseInt(tmp[0]), 
						Integer.parseInt(tmp[1]), 
						Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2]), 
						Integer.parseInt(tmp[1]) + Integer.parseInt(tmp[3]), 
						href[i], i);
			}
			else
			{
				String[] tmp = pos[i].split(",");
				areaStr += buildRetangleArea(
						Integer.parseInt(tmp[0]), 
						Integer.parseInt(tmp[1]), 
						Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2]), 
						Integer.parseInt(tmp[1]) + Integer.parseInt(tmp[3]), 
						"#", i);
			}
		}
		
		return "<p><br><br></p><p>" + imageStr + mapHead + areaStr + mapTail + "</p>\r\n";
	}
	
	public static String buildRetangleArea(int x1, int y1, int x2, int y2, String href, 
			int areaID)
	{
		String areaHead = "<area shape=\"rect\" coords=\"";
		String areaCoords = x1 + "," + y1 + "," + x2 + "," + y2;
		String areaMid = "\" href=\"";
		String areaHref = href; 
		String areaTail = "\" onmouseout=hiddiv(area" + areaID +
		"); onmousemove=showdiv(area" + areaID +"); />\r\n";
		
		return areaHead + areaCoords + areaMid + areaHref + areaTail;
	}
	
	public static String buildJavaScript(String funtion)
	{
		String head = "<script language=javascript>" + "\n" + 
"<!-- " + "\n";
		
		String tail = "//-->" + "\n" + 
"</script>" + "\n";
		
		return head + funtion + tail;
	}
	
	public static String buildDiv(String[] pos, String[] prop)
	{
		String beforeID = "<div id=area";
		String afterID = " style=\"position: absolute; width: 126; height: 27; background-color: #FF99FF; display: none; left: 11; top: 36\">";
		String tail = "</div>";
		
		String ret = "";
		
		int i;
		for (i = 0; i < prop.length; i++)
		{
			ret += beforeID + i + afterID + prop[i] + tail;
			ret += "\n\n";
		}
		
		return ret;
	}
	
	public static String pathToVaryName(String path)
	{
		char[] tmp = path.toCharArray();
		int i;
		for (i = 0; i < tmp.length; i++)
		{
			if (tmp[i] == '\\' || tmp[i] == ':' || tmp[i] == '.' || tmp[i] == ' ')
				tmp[i] = '1';
			
			if (tmp[i] > 128)
				tmp[i] = '2';
		}
		
		return new String(tmp);
	}
	
	public static String buildTreeFolder(String parentDir, String newFolderName, String viewName)
	{
		String href = parentDir + "\\" + newFolderName + "\\" + newFolderName + ".html";
		char[] tmp = href.toCharArray();
		
		int i;
		for (i = 0; i < tmp.length; i++)
		{
			if (tmp[i] == '\\')
				tmp[i] = '/';
		}
		href = /*"file:///" +*/ new String(tmp);
		
		String left = pathToVaryName(parentDir + "\\" + newFolderName);
		href = ".." + href.substring(href.indexOf("/src/"));
		String right = "insFld(" + pathToVaryName(parentDir) + ", " + "gFld(\"" + viewName + "\", \"" + href + "#\"))";
		return left + " = " + right + "\n";
	}
	
	public static String buildTreeLeaf(String parentDir, String fileName)
	{
		String href = parentDir + "\\" + fileName;
		char[] tmp = href.toCharArray();
		
		int i;
		for (i = 0; i < tmp.length; i++)
		{
			if (tmp[i] == '\\')
				tmp[i] = '/';
		}
		href = "file:///" + new String(tmp);
		
		String ret = "insDoc(" + pathToVaryName(parentDir) + ", gLnk(0, \"Graph\", \"" + href + "#\"))";
		return ret + "\n";
	}
	
	public static String buildTreeRoot(String dir, String viewName)
	{
		String rootName;
		String left = pathToVaryName(dir);
		rootName = viewName.substring(viewName.indexOf(": ") + 2);
		dir = ".." + dir.substring(dir.indexOf("\\src"));
		String right = "gFld(\"" + viewName + "\", \""
						+ dir + "\\" + rootName +".html#\")";
		char[] tmp = right.toCharArray();
		
		int i;
		for(i = 0; i < tmp.length; i++)
		{
			if(tmp[i] == '\\')
				tmp[i] = '/';
		}
		right = new String(tmp);
		return left + " = " + right + "\n";
	}
}
