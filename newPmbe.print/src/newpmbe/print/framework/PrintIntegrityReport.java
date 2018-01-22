package newpmbe.print.framework;

import java.util.List;
import java.util.ListIterator;

import newpmbe.process.validator.Validator;
import newpmbe.validator.Problem;
import newpmbe.validator.Problems;
import newpmbe.validator.Warning;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.printing.PrintDialog;
import org.eclipse.swt.printing.Printer;
import org.eclipse.swt.printing.PrinterData;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import vpml.processpackage.EMPDiagram;
import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.EMRRole;

public class PrintIntegrityReport implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;
	
	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub
		this.window=window;

	}

	public void run(IAction action) {
		// TODO Auto-generated method stub
		PrintDialog printDialog = new PrintDialog(window.getShell());
		PrinterData printerData = printDialog.open();
		if (printerData == null)
			return;
		Printer printer = new Printer(printerData);
		
		IWorkbenchPage activePage = window.getActivePage();
		DiagramDocumentEditor currentDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
		IEditorInput activeInput = currentDiagramEditor.getEditorInput();
		IFile activeEditorFile = ((IFileEditorInput)activeInput).getFile();
		IProject project=activeEditorFile.getProject();
		
		Validator validator=new Validator(project);
		List problemList=validator.ValidateProcess();
		
		StyledText text = new StyledText(window.getShell(), SWT.MULTI);
		text.append("***定义完整性检查报告***\n");
		text.append("===============================\n\n");
		text.append("过程名："+project.getName()+"\n\n");
		
		
		for(int i=0;i<problemList.size();i++){
			Problems problems=(Problems)problemList.get(i);
			if(problems.getType().equals(Problems.TYPE_ACTIVITY))
				text.append("活动\n\n");
			else if(problems.getType().equals(Problems.TYPE_PRODUCT))
				text.append("产品\n\n");
			else if(problems.getType().equals(Problems.TYPE_CONDITIONAL))
				text.append("逻辑连接\n\n");
			else if(problems.getType().equals(Problems.TYPE_RESOURCE))
				text.append("资源\n\n");
			else if(problems.getType().equals(Problems.TYPE_OTHER))
				text.append("其他\n\n");
			
			for(int j=0;j<problems.getProblemList().size();j++){
				Problem problem=(Problem)problems.getProblemList().get(j);
				int index=j+1;
				if(problem.getResource().endsWith("/"))
					if(problem.getName()==null)
						text.append(String.valueOf(index)+". "+problem.getResource()+"\n");
					else
						text.append(String.valueOf(index)+". "+problem.getResource()
									+"/"+problem.getName()+"\n");
				else
					if(problem.getName()==null)
						text.append(String.valueOf(index)+". "+problem.getResource()+"\n");
					else
						text.append(String.valueOf(index)+". "+problem.getResource()
							.replaceAll("//", "/")+"//"+problem.getName()+"\n");
				if(problem instanceof newpmbe.validator.Error)
					text.append("  错误：");
				else if(problem instanceof newpmbe.validator.Warning)
					text.append("  警告: ");
				text.append(problem.getDescription()+"\n");
			}
			text.append("\n");
		}
		
		text.print(printer).run();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

}
