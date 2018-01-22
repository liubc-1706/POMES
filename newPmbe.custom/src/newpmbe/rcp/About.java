package newpmbe.rcp;

import java.awt.Image;
import java.awt.Paint;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import  org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import  org.eclipse.swt.events.SelectionAdapter;
import  org.eclipse.swt.events.SelectionEvent;
import  org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import  org.eclipse.swt.widgets.Dialog;
import  org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import  org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
//import com.swtdesigner.ResourceManager;
import newpmbe.rcp.NewPmbePlugin;
 
  
   public   class  About  extends  Dialog   {
  
      protected  Shell shell;
     
      private   int  result;
  
       public  About(Shell parent,  int  style)   {
          super (parent, style);
     } 
  
       public  About(Shell parent)   {
          this (parent, SWT.NONE);
     } 
  
       public   int  open()   {
         createContents();
         shell.open();
         shell.layout();
         Display display  =  getParent().getDisplay();
           while  ( ! shell.isDisposed())   {
              if  ( ! display.readAndDispatch())
                 display.sleep();
         } 
          return  result;
     } 
  
       protected   void  createContents()   {
         shell  =   new  Shell(getParent(), SWT.DIALOG_TRIM  |  SWT.APPLICATION_MODAL);
         shell.setLocation(300, 300);
         shell.setSize( 282 ,  161 );
         shell.setText( "EPMS3.0" );
  
          final  Button okButton  =   new  Button(shell, SWT.NONE);
          okButton.addSelectionListener( new  SelectionAdapter()   {
               public   void  widgetSelected(SelectionEvent e)   {
                 result  =   1 ;
                 shell.dispose();
             } 
         } );
         okButton.setText( " OK " );
         okButton.setBounds( 218 ,  97 ,  48 ,  22 );
        
         
         
         final Label label = new Label(shell, SWT.WRAP);
         label.setText("企事业过程建模系统EPMS \r\n版本号 3.0 \r\n \r\n北京赛柏科技有限责任公司  \r\n版权所有(c) 2007");
         label.setBounds(85, 25, 163, 68);

         final CLabel label_1 = new CLabel(shell, SWT.NONE);
         label_1.setImage(NewPmbePlugin.getImageDescriptor("icons/Probuilder.ico").createImage());
         label_1.setBounds(35, 20, 38, 46);

         
//          final  Button cancelButton  =   new  Button(shell, SWT.NONE);
//          cancelButton.addSelectionListener( new  SelectionAdapter()   {
//               public   void  widgetSelected(SelectionEvent e)   {
//                 result  =   2 ;
//                 shell.dispose();
//             } 
//         } );
//         cancelButton.setText( " Cancel " );
//         cancelButton.setBounds( 89 ,  10 ,  48 ,  22 );
     } 
  
 } 