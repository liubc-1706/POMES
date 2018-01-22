package newpmbe.web.util;

import java.awt.image.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.*;

import newpmbe.process.diagram.edit.parts.NewPMBEExtNodeLabelEditPart;

import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat;
import org.eclipse.gmf.runtime.diagram.ui.render.util.CopyToImageUtil;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.model.WorkbenchContentProvider;



public class CopyAsJPG {
		
	public static IFile openDiagramFile(String inDir, String folderName, String fileName){
		
		IWorkbenchWindow window = null;
		if(fileName.indexOf("process") >= 0){
			window = newpmbe.process.diagram.part
			.NewPMBEDiagramEditorPlugin.getInstance()
			.getWorkbench().getActiveWorkbenchWindow();
		}else if(fileName.indexOf("resource") >= 0){
			window = newpmbe.resource.diagram.part
			.NewPMBEDiagramEditorPlugin.getInstance()
			.getWorkbench().getActiveWorkbenchWindow();
		}else if(fileName.indexOf("organization") >= 0){
			window = newpmbe.organization.diagram.part
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
		
//		int indexPro = inDir.lastIndexOf("\\");
//		String proName = inDir.substring(indexPro + 1);
//		int indexPro2 = -1;
//		if((indexPro2 = proName.indexOf("\\")) >= 0){
//			proName = proName.substring(0, indexPro2);
//		}
		
		IFile file = null;
		for(int i=0;i<elements.length;i++){
			
			Project project = (Project)elements[i];
			String proString = project.getName();
			if (inDir.contains(proString)){
			
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
					int index1 = inDir.indexOf(proString);
					int proNameLen = proString.length();
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
			window = newpmbe.product.diagram.part.NewPMBEDiagramEditorPlugin.getInstance()
			.getWorkbench().getActiveWorkbenchWindow();
		}
		
		IWorkbenchPage activePage = window.getActivePage();
		DiagramDocumentEditor targetDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
		DiagramEditPart editPart = targetDiagramEditor.getDiagramEditPart();
		Diagram targetDiagram = targetDiagramEditor.getDiagramEditPart().getDiagramView();
		
		List children = targetDiagramEditor.getDiagramEditPart().getChildren();
		for(int i=0;i<children.size();i++){
			String temp = children.get(i).toString().substring(0, children.get(i).toString().indexOf("("));
			
			targetDiagramEditor.getDiagramGraphicalViewer().appendSelection((EditPart)children.get(i));
			if (!temp.equals("EMPInAndEditPart")
						&&!temp.equals("EMPInOrEditPart")
						&&!temp.equals("EMPOutAndEditPart")
						&&!temp.equals("EMPOutOrEditPart")){
				targetDiagramEditor.getDiagramGraphicalViewer().appendSelection((EditPart)((EditPart)children.get(i)).getChildren().get(0));
			}
		} 

//		List children = editPart.getChildren();
//		List nameList = new ArrayList();
//		for(int j = 0; j < children.size(); j++){
//			EditPart child = (EditPart)children.get(j);
//			String test = child.toString();
//			List childList = child.getChildren();
//			nameList.add(childList.get(0));
//			targetDiagramEditor.getDiagramGraphicalViewer().select((NewPMBEExtNodeLabelEditPart)childList.get(0));
//		}
		List connections = editPart.getConnections();
		
		for (int j=0; j<connections.size(); j++){
			ConnectionEditPart con = (ConnectionEditPart)connections.get(j);
			targetDiagramEditor.getDiagramGraphicalViewer().appendSelection(con);
		}
		
		List selectedList = targetDiagramEditor.getDiagramGraphicalViewer().getSelectedEditParts();
		
	    CopyToImageUtil copyToImageUtil = new CopyToImageUtil();
	    
	    
	    try {
	    	   copyToImageUtil.copyToImage((DiagramEditPart)editPart, selectedList,
	    			   file.getParent().getLocation().append(fileName + ".jpg"), 
	    					   ImageFileFormat.JPEG, new NullProgressMonitor());
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

   public static boolean writeImage(RenderedImage im, String formatName, String fileName) {
       boolean result = false;
       try {
           result = ImageIO.write(im,formatName,new File(fileName));
       } catch(IOException ioe) {
           ioe.printStackTrace();
       }
       return result;
   }
   
   public static boolean writeJPEGImage(RenderedImage im, String fileName) {
       return writeImage(im,"JPEG",fileName);
   }
   public static boolean writeGIFImage(RenderedImage im, String fileName) {
       return writeImage(im,"GIF",fileName);
   }
   public static boolean writePNGImage(RenderedImage im, String fileName) {
       return writeImage(im,"PNG",fileName);
   }
   public static boolean writeBMPImage(RenderedImage im, String fileName) {
       return writeImage(im,"BMP",fileName);
   }

}
