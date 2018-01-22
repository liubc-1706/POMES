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
//img.style.zoom获取img对象的缩放比例，并转为十进制整数 
"var zoom = parseInt(img.style.zoom,10);" + "\n" + 
"if (isNaN(zoom)){" + "\n" + //当zoom非数字时zoom默认为100％ 
"zoom = 100;" + "\n" +
"}" + "\n" +
//event.wheelDelta滚轮移动量上移＋120，下移－120；显示比例每次增减10％ 
"zoom += event.wheelDelta / 12; " + "\n" +
//当zoom大于10％时重新设置显示比例 
"if (zoom>10) img.style.zoom = zoom + \"%\"; " + "\n" +
"return false; " + "\n" +
"}" + "\n";
	
	
}
