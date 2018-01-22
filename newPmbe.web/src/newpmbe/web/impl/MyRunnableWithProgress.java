package newpmbe.web.impl;

import java.lang.reflect.InvocationTargetException;
import newpmbe.web.util.AllPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;

public class MyRunnableWithProgress implements IRunnableWithProgress{

	AllPath apRef = null;
	
	public void run(IProgressMonitor monitor) throws InvocationTargetException,
			InterruptedException {

		monitor.beginTask("Publish web...", 6);
		
		while (true)
		{
			if (apRef.getState() == 6)
				break;
			
			monitor.worked(apRef.getState());
			
			Thread.sleep(400);
		}
		
		monitor.done();
		
	}
	
	public MyRunnableWithProgress(AllPath ref)
	{
		this.apRef = ref;
	}

}
