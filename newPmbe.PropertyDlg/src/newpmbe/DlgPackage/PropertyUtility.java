package newpmbe.DlgPackage;

import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.swt.widgets.DateTime;

import vpml.utilpackage.EnumTimeUnit;

public class PropertyUtility 
{
	public static String GetValue(String value)
	{
		return (value == null ? "":value);
	} 
	
	public static Date GetTimeValue(Date time)
	{
		if (time == null)
		{
			//如果时间为空，则返回当前值
			Date date = new Date();
			return date;
		}
		else
			return time;
	}
	
	public static String GetParamValue(double value)
	{
		 return new Double(value).toString();
	}
	
	public static String GetParamValue(int value)
	{
		return (new Integer(value)).toString();
	}
	
	//从DateTime类型转换到Date类型
	public static Date DateTimeToDate(DateTime dt)
	{
		GregorianCalendar ca = new GregorianCalendar(dt.getYear(), dt.getMonth(), dt.getDay(), dt.getHours(), dt.getMinutes(), dt.getSeconds());
		return ca.getTime();		
	}
	
	//从Date类型转换到DateTime类型
	public static void DateToDateTime(DateTime dt, Date date)
	{
		dt.setYear(date.getYear()+ 1900);
		dt.setMonth(date.getMonth());
		dt.setDay(date.getDate());
		dt.setHours(date.getHours());
		dt.setMinutes(date.getMinutes());
		dt.setSeconds(date.getSeconds());
	}
	
	//设置时间单位值
	public static EnumTimeUnit SetTimeUnit(int index)
	{
		EnumTimeUnit tu;
		switch (index)
		{
			case 7:
				tu = EnumTimeUnit.YEAR_LITERAL;
				break;
			case 6:
				tu = EnumTimeUnit.QUARTER_LITERAL;
				break;
			case 5:
				tu = EnumTimeUnit.MONTH_LITERAL;
				break;
			case 4:
				tu = EnumTimeUnit.WEEK_LITERAL;
				break;
			case 3:
				tu = EnumTimeUnit.DAY_LITERAL;
				break;	
			case 2:
				tu = EnumTimeUnit.HOUR_LITERAL;
				break;
			case 1:
				tu = EnumTimeUnit.MINUTE_LITERAL;
				break;
			case 0:
				tu = EnumTimeUnit.SECOND_LITERAL;
				break;
			default:
				tu = EnumTimeUnit.HOUR_LITERAL;
				break;
		}
		return tu;
	}
	/**
	 * 
	 * @param tu 从模型中读取的时间单位数据
	 * @return 时间单位的索引值，没有时间单位则取默认的为小时
	 */
	public static int GetTimeUnit(EnumTimeUnit tu)
	{
		int index;
		if (tu == null)
			index = 2; //默认设置为小时
		else
		{
			switch(tu.getValue())
			{
			case EnumTimeUnit.YEAR:
				index = 7;
				break;
			case EnumTimeUnit.QUARTER:
				index = 6;
				break;
			case EnumTimeUnit.MONTH:
				index = 5;
				break;
			case EnumTimeUnit.WEEK:
				index = 4;
				break;
			case EnumTimeUnit.DAY:
				index = 3;
				break;
			case EnumTimeUnit.HOUR:
				index = 2;
				break;
			case EnumTimeUnit.MINUTE:
				index = 1;
				break;
			case EnumTimeUnit.SECOND:
				index = 0;
				break;
			default:
				index = 2;
				break;
			}
		}
		return index;
	}
	
	public static EObject GetDiagramObject(String path)
	{
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());   
						
		String filepath = path;
		java.io.File file = new java.io.File(path);
		if(!file.exists())
			return null;
		URI fileURI = URI.createFileURI(filepath);
		Resource tresource = resourceSet.getResource(fileURI, true);
		EObject diagramRootModel = (EObject) tresource.getContents().get(0);
		return diagramRootModel;		
	}
}
