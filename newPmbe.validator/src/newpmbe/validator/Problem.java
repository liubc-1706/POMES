package newpmbe.validator;

import org.eclipse.core.runtime.IPath;

public interface Problem {
	/**
	 * get the description of the problem
	 * @return
	 */
	public String getDescription();
	
	/**
	 * get the resource of the Problem
	 * @return
	 */
	public String getResource();
	
	/**
	 * get the path of the problem
	 * @return
	 */
	public IPath getPath();
	
	
	public String getName();
	
	//public String getType();
	public String getID();
	
	
}
