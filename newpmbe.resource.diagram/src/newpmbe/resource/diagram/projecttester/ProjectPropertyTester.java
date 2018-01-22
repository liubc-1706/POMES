package newpmbe.resource.diagram.projecttester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IProject;

public class ProjectPropertyTester extends PropertyTester {
	private static final String PROPERTY_QUALIFIED_NAME = "qualifiedName";

	private static final String RESOURCE_PROPERTY ="resource";

	public boolean test(Object arg0, String arg1, Object[] arg2, Object arg3) {
		// TODO Auto-generated method stub
		IProject project = (IProject)arg0;
		String property;
		property = project.getFileExtension();
		if(!property.equals(RESOURCE_PROPERTY))
			return false;
		if(PROPERTY_QUALIFIED_NAME.equals(arg1)){
				return property.equals(arg3);
		}
		return false;
	}

}
