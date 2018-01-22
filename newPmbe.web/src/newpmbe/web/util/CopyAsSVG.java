package newpmbe.web.util;

import java.awt.image.*;
import java.io.*;

import javax.imageio.*;


import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat;
import org.eclipse.gmf.runtime.diagram.ui.render.util.CopyToImageUtil;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.model.WorkbenchContentProvider;


public class CopyAsSVG {
		
	public static IFile openDiagramFile(String inDir, String folderName, String fileName){
		
		IWorkbenchWindow window = null;
		if(fileName.indexOf("process") >= 0){
			window = newpmbe.process.diagram.part
			.NewPMBEDiagramEditorPlugin.getInstance()
			.getWorkbench().getActiveWorkbenchWindow();
		}else{
			window = newpmbe.product.diagram.part
			.NewPMBEDiagramEditorPlugin.getInstance()
			.getWorkbench().getActiveWorkbenchWindow();
		}
		IWorkbenchPage activePage = window.getActivePage();
		ITreeContentProvider myWorkbenchContentProvider = new WorkbenchContentProvider();
		Object[] elements = myWorkbenchContentProvider
				.getElements(ResourcesPlugin.getWorkspace().getRoot());
		
		int indexPro = inDir.indexOf("runtime-New_configuration");
		String proName = inDir.substring(indexPro + 26);
		int indexPro2 = -1;
		if((indexPro2 = proName.indexOf("\\")) >= 0){
			proName = proName.substring(0, indexPro2);
		}
		
		
		IFile file = null;
		for(int i=0;i<elements.length;i++){
			Project project = (Project)elements[i];
			if(project.getName().equals(proName)){
				Project targetProject = project;
				file = targetProject.getFile(fileName);
				System.out.println(file.getLocation());
				
				if(file.exists()){
					try {
						IDE.openEditor(activePage, file);
					} catch (PartInitException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}else{
					int index1 = inDir.indexOf(proName);
					int proNameLen = proName.length();
					String dirTmp = inDir.substring(index1 + proNameLen + 1);
					int tagNum = 1;
					int tagIndex;
					String folderNameTmp = dirTmp;
					if(dirTmp.indexOf("\\") >= 0){
						folderNameTmp = dirTmp.substring(0, dirTmp.indexOf("\\"));
					}
					if((tagIndex = dirTmp.indexOf("\\")) >= 0){
						tagNum++;
						dirTmp = dirTmp.substring(tagIndex + 1);
					}
					
					Folder targetFolder = (Folder) targetProject.getFolder(folderNameTmp);
					while(tagNum > 0){
						if(tagNum == 1){
							//String folderNameTmp = dirTmp;
							file = targetFolder.getFile(fileName);
							try {
								IDE.openEditor(activePage, file);
							} catch (PartInitException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}	
							tagNum--;
						}else{
							if(dirTmp.indexOf("\\") >= 0){
								folderNameTmp = dirTmp.substring(0, dirTmp.indexOf("\\"));	
							}else{
								folderNameTmp = dirTmp;
							}
							targetFolder = (Folder) targetFolder.getFolder(folderNameTmp);	
							tagNum--;
						}
					}
				}
			}else if(i == elements.length - 1) {
//				Shell parent = new Shell();
//				String mesTitle = "OpenError";
//				String message = "Project does not exist in Workspace";
//				MessageDialog.openError(parent, mesTitle, message);
//				System.out.println("ERROR");
			}
		}
		return file;	
	} 
	
	
	public static void genImage(IFile file, String fileDir){
		
		int index1 = fileDir.lastIndexOf("\\");
	    String fileNameTmp = fileDir.substring(index1 + 1);
	    int index2 =fileNameTmp.indexOf(".");
	    String fileName = fileNameTmp.substring(0, index2);
	    
	    IWorkbenchWindow window = null;
		if(fileNameTmp.indexOf("process") >= 0){
			window = newpmbe.process.diagram.part
			.NewPMBEDiagramEditorPlugin.getInstance()
			.getWorkbench().getActiveWorkbenchWindow();
		}else{
			window = newpmbe.product.diagram.part
			.NewPMBEDiagramEditorPlugin.getInstance()
			.getWorkbench().getActiveWorkbenchWindow();
		}
		
		IWorkbenchPage activePage = window.getActivePage();
		DiagramDocumentEditor targetDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
		Diagram targetDiagram = targetDiagramEditor.getDiagramEditPart().getDiagramView();
	    CopyToImageUtil copyToImageUtil = new CopyToImageUtil();
	    
	    
	    
	    try {
			   copyToImageUtil.copyToImage((Diagram)
					   targetDiagram, file.getParent().getLocation().append(fileName + ".svg"), ImageFileFormat.SVG,new NullProgressMonitor(), PreferencesHint.USE_DEFAULTS);
		   } catch (Exception e) {
		   // TODO Auto-generated catch block
			   e.printStackTrace();
		   }
	}
   
   
   public static void closeDiagram(String fileName){
	   IWorkbenchWindow window = null;
		if(fileName.indexOf("process") >= 0){
			window = newpmbe.process.diagram.part
			.NewPMBEDiagramEditorPlugin.getInstance()
			.getWorkbench().getActiveWorkbenchWindow();
		}else{
			window = newpmbe.product.diagram.part
			.NewPMBEDiagramEditorPlugin.getInstance()
			.getWorkbench().getActiveWorkbenchWindow();
		}
		IWorkbenchPage activePage = window.getActivePage();
		DiagramDocumentEditor targetDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
		targetDiagramEditor.close(false);	
   }
   
   public static BufferedImage readImage(String fileName){
       BufferedImage bi = null;
       try {
           bi = ImageIO.read(new File(fileName));
       } catch(IOException ioe) {
           ioe.printStackTrace();
       }
       return bi;
   }

}
