package newpmbe.rcp;
  
import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;



public   class  ActionHelp  extends  Action  implements  IWorkbenchAction   {

private  IWorkbenchWindow workbenchWindow;

public  ActionHelp(IWorkbenchWindow window)   {
           if  (window  ==   null )   {
              throw   new  IllegalArgumentException();
         } 
  
          this .workbenchWindow  =  window;
     } 
     
       public   void  run()   {
          //  make sure action is not disposed 
            if  (workbenchWindow  !=   null )   {
              // ��������ӹ��� 
//              FirstDialog dg  =   new  FirstDialog(workbenchWindow.getShell());
//              dg.open();            	
            	
            	String path = getPath();            	  
                String filename = path + "EPMS3.0�û��ֲ�.chm";
                
                File   file   =   new   File(filename);   
                if(!file.exists()){
                	//path = path.substring(0, path.length() - 9) + "/help/EPMS3.0�û��ֲ�.chm";
                	path = path.substring(0, path.lastIndexOf("configuration")-1) + "/help/EPMS3.0�û��ֲ�.chm";
                	filename = path;
                }
                
                boolean key = true;
                try {
					key = Program.launch(filename);
				} catch (RuntimeException e) {
					// TODO Auto-generated catch block
	                MessageDialog.openInformation(new Shell(), "�ļ��޷���", "���� EPMS3.0�û��ֲ�.chm �Ƿ�����Ƿ���"); 	                
				}
                
         } 
     } 
       
       public static String getPath(){
           String path;
           try {
               path= Platform.asLocalURL(Platform.getBundle("newPmbe.custom").getEntry("")).getPath();
               path=path.substring(path.indexOf("/")+1,path.length());
           } catch (IOException e) {
               path="";
               e.printStackTrace();
           }
           return path;
       }

  
       public   void  dispose()   {
         workbenchWindow  =  null ;
  
     } 
       
       
  
 } 