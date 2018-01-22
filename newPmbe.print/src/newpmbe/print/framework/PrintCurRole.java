package newpmbe.print.framework;

import java.util.ListIterator;

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
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import vpml.organizationpackage.EMODiagram;
import vpml.processpackage.EMPDiagram;
import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.EMRLocationType;
import vpml.resourcepackage.EMRRole;

public class PrintCurRole implements IWorkbenchWindowActionDelegate {

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
		EMODiagram eMRDiagram = (EMODiagram)diagram.getElement();
		//hzg modify
	//	EList eMRDiagrams = eMPDiagram.getEmrDiagrams();
		//hzg
		
		//add by wzy starts
	//	EList eMRDiagram = eMPDiagram.getRoles();
		//add by wzy ends
		
		StyledText text = new StyledText(window.getShell(), SWT.MULTI);
		text.append("***资源定义报告***\n");
		text.append("===============================\n\n");
		text.append("资源类型名称		数量		花费		效率	\n\n");
		
		text.append("角色类型：\n");
		
//		//hzg modify
//		ListIterator listIter1 = eMRDiagrams.listIterator();
//		while (listIter1.hasNext()) {
//		//	EMRRole eMRDiagram = (EMRRole)listIter1.next();//wzy
//			EMODiagram eMRDiagram = (EMODiagram)listIter1.next();
//			EList list = eMRDiagram.getRoles();
//			ListIterator listIter2 = list.listIterator();
//			while (listIter2.hasNext()) {
//				EMRRole role = (EMRRole)listIter2.next();
//				text.append(role.getName() + "\t\t" + role.getTotalAmount() + "\t\t" + role.getCostPerUnit() + "\t\t" + role.getEfficiency() + "\n");
//			}			
//		}
//		//hzg
		EList list = eMRDiagram.getRoles();
		ListIterator listIter = list.listIterator();
		while (listIter.hasNext()) {
			EMRRole role = (EMRRole)listIter.next();
			text.append(role.getName() + "\t\t\t\t" + role.getTotalAmount() + "\t\t" + role.getCostPerUnit() + "\t\t" + role.getEfficiency() + "\n");
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

}
