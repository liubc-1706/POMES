package newpmbe.validator;

import org.eclipse.core.runtime.IPath;

public class Error implements Problem {
	public  String description;
	public  String resource;
	public  IPath path;
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
