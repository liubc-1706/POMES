package newpmbe.web.constant;

public class Script {

	public static String showDiv = "function showdiv(blah)" + "\n" + 
"{" +  "\n" + 
"blah.style.display=\"\"" +  "\n" +
"blah.style.left=window.event.offsetX+15" +  "\n" +
"blah.style.top=window.event.offsetY" + "\n" + "}\n";
	
	 /*+
	 "var x = window.event.clientX" + "\n" +
	 "var y = window.event.clientY" + "\n" +
	 "var str = \"pos: \" + x + \",\" + y" + "\n" +
	 "blah.replaceChild(str);" +  "\n" +
	 "}" + "\n" ;*/
	
	public static String hideDiv = "function hiddiv(blah)" +  "\n" +
"{" +  "\n" +
"blah.style.display=\"none\"" +  "\n" +
"}" + "\n"; 
	
	public static String scrollImg = "function zoomimg(img){" + "\n" +
//img.style.zoom��ȡimg��������ű�������תΪʮ�������� 
"var zoom = parseInt(img.style.zoom,10);" + "\n" + 
"if (isNaN(zoom)){" + "\n" + //��zoom������ʱzoomĬ��Ϊ100�� 
"zoom = 100;" + "\n" +
"}" + "\n" +
//event.wheelDelta�����ƶ������ƣ�120�����ƣ�120����ʾ����ÿ������10�� 
"zoom += event.wheelDelta / 12; " + "\n" +
//��zoom����10��ʱ����������ʾ���� 
"if (zoom>10) img.style.zoom = zoom + \"%\"; " + "\n" +
"return false; " + "\n" +
"}" + "\n";
	
	
}
