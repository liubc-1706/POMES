package newpmbe.rcp;
  
import  org.eclipse.jface.action.Action;
import  org.eclipse.ui.IWorkbenchWindow;
import  org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;



public   class  ActionAbout  extends  Action  implements  IWorkbenchAction   {

private  IWorkbenchWindow workbenchWindow;

public  ActionAbout(IWorkbenchWindow window)   {
           if  (window  ==   null )   {
              throw   new  IllegalArgumentException();
         } 
  
          this .workbenchWindow  =  window;
     } 
     
       public   void  run()   {
          //  make sure action is not disposed 
            if  (workbenchWindow  !=   null )   {
              // 在这里添加功能 
              About dg  =   new  About(workbenchWindow.getShell());
             dg.open();
             
         } 
     } 
  
       public   void  dispose()   {
         workbenchWindow  =   null ;
  
     } 
       
       
  
 } 