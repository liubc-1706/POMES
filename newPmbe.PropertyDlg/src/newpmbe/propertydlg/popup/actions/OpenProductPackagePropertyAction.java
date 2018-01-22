package newpmbe.propertydlg.popup.actions;

import java.io.File;
import java.util.Iterator;

import newpmbe.DlgPackage.*;
import newpmbe.process.diagram.part.NewPMBEDiagramEditorPlugin;

import org.eclipse.gmf.runtime.emf.ui.properties.commands.SetModelPropertyValueCommand;

import org.eclipse.ui.views.properties.*;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.*;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;

import vpml.*;
import vpml.processpackage.EMPDiagram;

public class OpenProductPackagePropertyAction extends AbstractActionDelegate
		implements IObjectActionDelegate {

	// @Override
	protected void doRun(IProgressMonitor progressMonitor) {
		Shell shell = new Shell();
		/*
		 * 命令组合
		 */

		// 获取选中的diagram属性
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
				.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		DiagramDocumentEditor targetDiagramEditor = (DiagramDocumentEditor) activePage
				.getActiveEditor();
		IEditorInput activeInput = targetDiagramEditor.getEditorInput();

		IFile activeEditorFile = ((IFileEditorInput) activeInput).getFile();

		// xsm added
		IStructuredSelection strSle = getStructuredSelection();
		Object selection = strSle.getFirstElement();
		IGraphicalEditPart editpart = (IGraphicalEditPart) selection;
		EObject obj = editpart.resolveSemanticElement();
		EMObject element = (EMObject)obj;

//		if (editpart.getClass().toString().contains("newpmbe.simulation")) {
//			EObject obj = editpart.resolveSemanticElement();
//			CompositeDlg dlg = new CompositeDlg(shell, obj, true);
//			if (dlg.open() == Window.OK) {
//			
//			}
//		} else 
		{
			// 转换至上层文件夹
			String cfPath = activeEditorFile.getRawLocation().toString();

			int posu = cfPath.lastIndexOf('/');
			String temp = cfPath.substring(0, posu);
			posu = temp.lastIndexOf('/');

			String projectPath = temp.substring(0, posu);

			String filePath = null;
			File file = new File(projectPath);
			File filelist[] = file.listFiles();
			for (int i = 0; i < filelist.length; i++) {
				if (filelist[i].isFile()
						&& filelist[i].getName().endsWith("_diagram")) {
					filePath = filelist[i].getAbsolutePath();
					break;
				}
			}
//			int posd = filePath.lastIndexOf('_');
//			String resname = filePath.substring(0, posd);
			String resname = filePath;
			String filename = activeEditorFile.getName();

			//int pos = filename.indexOf('.');
			//String composeName = filename.substring(0, pos);

			EMPDiagram rootModel = (EMPDiagram) PropertyUtility
					.GetDiagramObject(resname);

			EList compose = rootModel.getProductPackages();
			Iterator iter = compose.iterator();
			EObject rs = null;
			while (iter.hasNext()) {
				EMObject base = (EMObject) iter.next();
				if (base.getId().equals(element.getId())) {
					rs = base;
					break;
				}
			}
			if (rs == null) {
				return;
			}
			CompositeDlg dlg = new CompositeDlg(shell, rs, false,editpart.getClass().toString().contains("newpmbe.simulation"));
			if (dlg.open() == Window.OK) {
				CompositeCommand cc = new CompositeCommand("dlg");
				NewPMBEPropertySource ns = new NewPMBEPropertySource();
				IPropertySource ips = ns.getPropertySource(rs);
				//			
				// SetModelPropertyValueCommand name = new
				// SetModelPropertyValueCommand(editpart.getEditingDomain(),
				// "Name", obj, ips, "Name", dlg.getName());
				// cc.compose(name);
				//			
				// SetModelPropertyValueCommand description = new
				// SetModelPropertyValueCommand(editpart.getEditingDomain(),
				// "Description", obj, ips, "Description",
				// dlg.getDescription());
				// cc.compose(description);
				//			
				// //
				// editpart.getDiagramEditDomain().getDiagramCommandStack().execute(new
				// ICommandProxy(cc));
			}
		}
	}
}
