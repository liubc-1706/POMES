package newpmbe.oldEdition.update;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import newpmbe.rcp.viewers.common.filtermanager.FilterManager;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class UpdateWithProgress implements IRunnableWithProgress {
	private String mainProcessFile;
	private String resourceFile;
	private String modelName;
	
	public UpdateWithProgress(String process,String resource,String modelName){
		this.mainProcessFile=process;
		this.resourceFile=resource;
		this.modelName=modelName;
	}
	
	
	public void run(IProgressMonitor monitor) throws InvocationTargetException,
			InterruptedException {
		monitor.beginTask("转换并生成模型......", this.getTotal()*2+2);
		UpdateManager mag=new UpdateManager(modelName,new File(mainProcessFile),new File(resourceFile),monitor);
		try {
			//先关闭模型浏览器的视图
			IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().
			getActiveWorkbenchWindow().getActivePage();
			IViewPart view=workbenchPage.findView("org.eclipse.ui.navigator.ProjectExplorer");
			if(view!=null)
				workbenchPage.hideView(view);
				
			mag.update();
			//转换完成后，在打开模型浏览器视图
			/*workbenchPage.showView("org.eclipse.ui.navigator.ProjectExplorer");
			FilterManager.getInstance().init();
			workbenchPage.showView("newpmbe.rcp.ui.NavigatorView");
			*/
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//打开模型浏览器
			/*IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().
			getActiveWorkbenchWindow().getActivePage();
			try {
				workbenchPage.showView("org.eclipse.ui.navigator.ProjectExplorer");
				FilterManager.getInstance().init();
				workbenchPage.showView("newpmbe.rcp.ui.NavigatorView");
			} catch (PartInitException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
			MessageDialog.openError(null, "转换出错", "转换过程出错，请检查源模型");
		}
		monitor.done();
		// TODO Auto-generated method stub

	}
	
	public int getTotal(){
		return (new File(mainProcessFile)).getParentFile().list().length;
	}

}
