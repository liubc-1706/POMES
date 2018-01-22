package newpmbe.print.framework;

import java.util.ListIterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.StyledTextContent;
import org.eclipse.swt.printing.PrintDialog;
import org.eclipse.swt.printing.Printer;
import org.eclipse.swt.printing.PrinterData;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import vpml.organizationpackage.EMODiagram;
import vpml.processpackage.EMPDiagram;
import vpml.resourcepackage.EMRAbstractResourceType;
import vpml.resourcepackage.EMRBasicResourceType;
import vpml.resourcepackage.EMRDiagram;

public class PrintResouceSpecAction implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;
	
	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	public void run(IAction action) {
		
		
		IWorkbenchPage activePage = window.getActivePage();
		DiagramDocumentEditor currentDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
		Diagram diagram = currentDiagramEditor.getDiagram();
		
		if(diagram.getElement() instanceof EMPDiagram){
			MessageDialog.openInformation(null, "错误提示", "现在位于过程视图，请在资源视图打印资源规格说明！");
		}
		else if(diagram.getElement() instanceof EMODiagram){
			MessageDialog.openInformation(null, "错误提示", "现在位于组织视图，请在资源视图打印资源规格说明！");
		}
		else{
		
		EMRDiagram eMRDiagram = (EMRDiagram)diagram.getElement();
		
		PrintDialog printDialog = new PrintDialog(window.getShell());
		PrinterData printerData = printDialog.open();
		if (printerData == null)
			return;
		Printer printer = new Printer(printerData);
		
		StyledText text = new StyledText(window.getShell(), SWT.MULTI);
		text.append("***资源模型规格说明***\n");
		text.append("===============================\n\n");
		
		EList resList;
		ListIterator listIter;
		
		text.append("1 抽象资源类型:\n\n");
		
		resList = eMRDiagram.getAbstractRoles();
		listIter = resList.listIterator();
		appendAbsResType(text, listIter);
		
		resList = eMRDiagram.getAbstractMachineTypes();
		listIter = resList.listIterator();
		appendAbsResType(text, listIter);
		
		resList = eMRDiagram.getAbstractLocationTypes();
		listIter = resList.listIterator();
		appendAbsResType(text, listIter);
		
		resList = eMRDiagram.getAbstractToolTypes();
		listIter = resList.listIterator();
		appendAbsResType(text, listIter);
		
		text.append("2 基本资源类型\n\n");
		
		resList = eMRDiagram.getRoles();
		listIter = resList.listIterator();
		appendBasicResType(text, listIter);
		
		resList = eMRDiagram.getMachineTypes();
		listIter = resList.listIterator();
		appendBasicResType(text, listIter);
		
		resList = eMRDiagram.getLocationTypes();
		listIter = resList.listIterator();
		appendBasicResType(text, listIter);
		
		resList = eMRDiagram.getToolTypes();
		listIter = resList.listIterator();
		appendBasicResType(text, listIter);
		
	//	text.append("资源实例\n\n");
		
		text.print(printer).run();

		}
		
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
	
	private void appendAbsResType(StyledText text, ListIterator listIter) {
		while (listIter.hasNext()) {
			EMRAbstractResourceType absResType = (EMRAbstractResourceType)listIter.next();
			text.append("\t"+"标准编码 : " + absResType.getCode() + "\n");
			text.append("\t"+"描述 : " + absResType.getDescription() + "\n");
			text.append("\t"+"名称 : " + absResType.getName() + "\n");
			text.append("\t"+"是否可共享 : " + "\n");
			text.append("\t"+"是否可移动位置 : " + "\n");	
			text.append("\n");
		}	
	}
	
	private void appendBasicResType(StyledText text, ListIterator listIter) {
		while (listIter.hasNext()) {
			EMRBasicResourceType absResType = (EMRBasicResourceType)listIter.next();
			text.append("\t"+"名称 : " + absResType.getName() + "\n");
			text.append("\t"+"所需数量 : " + "\n");
			text.append("\t"+"可用数量 : " + absResType.getTotalAmount() + "\n");
			text.append("\t"+"单位费用 : " + absResType.getCostPerUnit() + "\n");
			text.append("\t"+"资源利用率 : " + absResType.getEfficiency()+"\n");	
			text.append("\n");
		}	
	}
}
