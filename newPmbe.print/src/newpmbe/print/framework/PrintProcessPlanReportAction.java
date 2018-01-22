package newpmbe.print.framework;

import java.util.ListIterator;

import newpmbe.product.diagram.part.NewPMBEDiagramEditorPlugin;

import org.eclipse.core.resources.IFile;
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

import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPAutoActivity;
import vpml.processpackage.EMPAutoBatchActivity;
import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPLeafActivity;
import vpml.processpackage.EMPManualBatchActivity;
import vpml.processpackage.EMPNormalActivity;
import vpml.processpackage.EMPObject;
import vpml.resourcepackage.EMRObject;

public class PrintProcessPlanReportAction implements
		IWorkbenchWindowActionDelegate {
	
	private IWorkbenchWindow window;

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	public void run(IAction action) {
		
		PrintDialog printDialog = new PrintDialog(window.getShell());
		PrinterData printerData = printDialog.open();
		if (printerData == null)
			return;
		Printer printer = new Printer(printerData);
		
		IWorkbenchPage activePage = window.getActivePage();
		DiagramDocumentEditor currentDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
		Diagram diagram = currentDiagramEditor.getDiagram();
		EMPDiagram eMPDiagram = (EMPDiagram)diagram.getElement();
		
		StyledText text = new StyledText(window.getShell(), SWT.MULTI);
		//add by wzy start
		
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();		
		
		DiagramDocumentEditor targetDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();		
		IEditorInput activeInput = targetDiagramEditor.getEditorInput();		
		IFile activeEditorFile = ((IFileEditorInput)activeInput).getFile();
		//得到当前工程名
		String actFilePath=activeEditorFile.getProjectRelativePath().toString();//当前文件的相对路径
		int end = actFilePath.indexOf(".");
		String projectName = actFilePath.substring(0, end-1);
		text.append("过程名："+projectName+"\n\n");		
		
		//add by wzy end
		text.append("***过程/工程计划报告***\n");
		text.append("===============================\n\n");
		text.append("活动 / [资源][角色]                                    所需数量\n");
		text.append("-----------------------------------------------------------\n");
		System.out.println(text);
		
		EList list = null;
		
		list = eMPDiagram.getCompActivities();
		ListIterator listIter = list.listIterator();
		while (listIter.hasNext()) {
			EMPCompActivity eMPCompActivity = (EMPCompActivity)listIter.next();
			text.append("*");
			appendCompActivity(text, eMPCompActivity, 1);
		}
		
		list = eMPDiagram.getAutoBatchActivities();
		listIter = list.listIterator();
		while (listIter.hasNext()) {
			EMPLeafActivity eMPLeafActivity = (EMPLeafActivity)listIter.next();
			text.append("*");
			appendLeafActivity(text, eMPLeafActivity, 1);
		}
		
		list = eMPDiagram.getManualBatchActivities();
		listIter = list.listIterator();
		while (listIter.hasNext()) {
			EMPLeafActivity eMPLeafActivity = (EMPLeafActivity)listIter.next();
			text.append("*");
			appendLeafActivity(text, eMPLeafActivity, 1);
		}
		
		list = eMPDiagram.getNormalActivities();
		listIter = list.listIterator();
		while (listIter.hasNext()) {
			EMPLeafActivity eMPLeafActivity = (EMPLeafActivity)listIter.next();
			text.append("*");
			appendLeafActivity(text, eMPLeafActivity, 1);
		}
		
		list = eMPDiagram.getAutoActivities();
		listIter = list.listIterator();
		while (listIter.hasNext()) {
			EMPLeafActivity eMPLeafActivity = (EMPLeafActivity)listIter.next();
			text.append("*");
			appendLeafActivity(text, eMPLeafActivity, 1);
		}
		
		text.print(printer).run();
	
		//for test
/*		StyledTextContent styledTextContent = text.getContent();
		int lineCount = styledTextContent.getLineCount();
		for (int i = 0;i < lineCount;i++) {
			String line = styledTextContent.getLine(i);
			System.out.println(line);
		}*/
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}
	
	private void appendCompActivity(StyledText text, EMPCompActivity compActivity, int level) {
		text.append(compActivity.getName() + "\n");
		EList list = compActivity.getLeafObjects();
		ListIterator listIter = list.listIterator();
		while (listIter.hasNext()) {
			text.append("  ");
			EMPObject eMPObject = (EMPObject)listIter.next();
			if (eMPObject instanceof EMPCompActivity)
				appendCompActivity(text, (EMPCompActivity)eMPObject, level + 1);
			else if (eMPObject instanceof EMPLeafActivity)
				appendLeafActivity(text, (EMPLeafActivity)eMPObject, level + 1);
		}
	}
	
	private void appendLeafActivity(StyledText text, EMPLeafActivity leafActivity, int level) {
		text.append(leafActivity.getName() + "\n");
		
		EList list = null;
		if (leafActivity instanceof EMPAutoActivity)
			list = ((EMPAutoActivity)leafActivity).getAssFlows();
		else if (leafActivity instanceof EMPNormalActivity)
			list = ((EMPNormalActivity)leafActivity).getAssFlows();
		else if (leafActivity instanceof EMPAutoBatchActivity)
			list = ((EMPAutoBatchActivity)leafActivity).getAssFlows();
		else if (leafActivity instanceof EMPManualBatchActivity)
			list = ((EMPManualBatchActivity)leafActivity).getAssFlows();
		
		ListIterator listIter = list.listIterator();		
		while (listIter.hasNext()) {
			text.append("  ");
			
			EMPAssFlow eMPAssFlow = (EMPAssFlow)listIter.next();
			EMRObject eMPObject = null;
			
			if (eMPAssFlow.getRole() != null)
				eMPObject = (EMRObject)eMPAssFlow.getRole();
			else if (eMPAssFlow.getLocationType() != null)
				eMPObject = (EMRObject)eMPAssFlow.getLocationType();
			else if (eMPAssFlow.getMachineType() != null)
				eMPObject = (EMRObject)eMPAssFlow.getMachineType();
			else if (eMPAssFlow.getToolType() != null)
				eMPObject = (EMRObject)eMPAssFlow.getToolType();
			
			if (eMPObject != null) {
				for (int i = 0;i < level;i++)
					text.append("  ");
//				text.append("#" + eMPObject.getName() + " : " + eMPAssFlow.getNumber() + "\n");
				text.append("#" + eMPObject.getName() + " : " + "1" + "\n");
				//hzg modify
			}
		}
	}
}
