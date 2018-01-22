package newpmbe.validator;

import org.eclipse.core.runtime.IPath;

public class Warning implements Problem {
	public String description;	//警告的描述
	public String resource;		//出现警告的文件
	public IPath path;			//出现警告的路径
	public String name;
	public String id;
	
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	public IPath getPath() {
		// TODO Auto-generated method stub
		return path;
	}
	public String getResource() {
		// TODO Auto-generated method stub
		return resource;
	}
	
	public String getName(){
		return name;
	}
	
	public String getID(){
		return id;
	}
	
	
	

}
