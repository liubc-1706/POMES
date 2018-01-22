package newpmbe.print.framework;

import java.util.ListIterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.action.IAction;
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

import vpml.processpackage.EMPDiagram;
import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.EMRLocationType;
import vpml.resourcepackage.EMRMachineType;
import vpml.resourcepackage.EMRRole;
import vpml.resourcepackage.EMRToolType;

public class PrintCurResource implements IWorkbenchWindowActionDelegate {

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
		if(activePage== null){
			System.out.println("null");
		}else{
			System.out.println("OK");
		}
		
		DiagramDocumentEditor currentDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();
		Diagram diagram = currentDiagramEditor.getDiagram();
		EMPDiagram eMPDiagram = (EMPDiagram)diagram.getElement();
		//hzg modify
		EList eMRDiagrams = eMPDiagram.getEmrDiagrams();
		//hzg
		
		StyledText text = new StyledText(window.getShell(), SWT.MULTI);
		text.append("***资源定义报告***\n");
		text.append("===============================\n\n");
		text.append("资源类型名称		数量		花费		效率	\n\n");
		
		
		//hzg modify
		text.append("角色类型：\n");
		ListIterator listIter1 = eMRDiagrams.listIterator();
		while (listIter1.hasNext()) {
			EMRDiagram eMRDiagram = (EMRDiagram)listIter1.next();
			
			
			EList roles = eMRDiagram.getRoles();
			ListIterator listIter2 = roles.listIterator();
			while (listIter2.hasNext()) {
				EMRRole role = (EMRRole)listIter2.next();
				text.append(role.getName() + "\t\t" + role.getTotalAmount() + "\t\t" + role.getCostPerUnit() + "\t\t" + role.getEfficiency() + "\n");
			}		
		}
		
		
		text.append("工具类型：\n");
		ListIterator listIter3 = eMRDiagrams.listIterator();
		while (listIter3.hasNext()) {
			EMRDiagram eMRDiagram = (EMRDiagram)listIter3.next();
			
			
			EList machineTypes = eMRDiagram.getMachineTypes();
			ListIterator listIter4 = machineTypes.listIterator();
			while (listIter4.hasNext()) {
				EMRMachineType machineType = (EMRMachineType)listIter4.next();
				text.append(machineType.getName() + "\t\t" + machineType.getTotalAmount() + "\t\t" + machineType.getCostPerUnit() + "\t\t" + machineType.getEfficiency() + "\n");
			}		
		}
		
		text.append("场所类型：\n");
		ListIterator listIter5 = eMRDiagrams.listIterator();
		while (listIter5.hasNext()) {
			EMRDiagram eMRDiagram = (EMRDiagram)listIter5.next();
			
			
			EList locationTypes = eMRDiagram.getLocationTypes();
			ListIterator listIter6 = locationTypes.listIterator();
			while (listIter6.hasNext()) {
				EMRLocationType locationType = (EMRLocationType)listIter6.next();
				text.append(locationType.getName() + "\t\t" + locationType.getTotalAmount() + "\t\t" + locationType.getCostPerUnit() + "\t\t" + locationType.getEfficiency() + "\n");
			}		
		}
		
		text.append("机器类型：\n");
		ListIterator listIter7 = eMRDiagrams.listIterator();
		while (listIter7.hasNext()) {
			EMRDiagram eMRDiagram = (EMRDiagram)listIter7.next();
			
			
			EList machineTypes = eMRDiagram.getMachineTypes();
			ListIterator listIter8 = machineTypes.listIterator();
			while (listIter8.hasNext()) {
				EMRMachineType machineType = (EMRMachineType)listIter8.next();
				text.append(machineType.getName() + "\t\t" + machineType.getTotalAmount() + "\t\t" + machineType.getCostPerUnit() + "\t\t" + machineType.getEfficiency() + "\n");
			}		
		}
		//hzg		
//		EList list = eMRDiagram.getRoles();
//		ListIterator listIter = list.listIterator();
//		while (listIter.hasNext()) {
//			EMRRole role = (EMRRole)listIter.next();
//			text.append(role.getName() + "\t\t" + role.getTotalAmount() + "\t\t" + role.getCostPerUnit() + "\t\t" + role.getEfficiency() + "\n");
//		}
//		
//		text.append("工具类型：\n");
//		list = eMRDiagram.getToolTypes();
//		listIter = list.listIterator();
//		while (listIter.hasNext()) {
//			EMRToolType tool = (EMRToolType)listIter.next();
//			text.append(tool.getName() + "\t\t" + tool.getTotalAmount() + "\t\t" + tool.getCostPerUnit() + "\t\t" + tool.getEfficiency() + "\n");
//		}
//		
//		text.append("场所类型：\n");
//		list = eMRDiagram.getLocationTypes();
//		listIter = list.listIterator();
//		while (listIter.hasNext()) {
//			EMRLocationType location = (EMRLocationType)listIter.next();
//			text.append(location.getName() + "\t\t" + location.getTotalAmount() + "\t\t" + location.getCostPerUnit() + "\t\t" + location.getEfficiency() + "\n");
//		}
//		
//		text.append("机器类型：\n");
//		list = eMRDiagram.getMachineTypes();
//		listIter = list.listIterator();
//		while (listIter.hasNext()) {
//			EMRMachineType machine = (EMRMachineType)listIter.next();
//			text.append(machine.getName() + "\t\t" + machine.getTotalAmount() + "\t\t" + machine.getCostPerUnit() + "\t\t" + machine.getEfficiency() + "\n");
//		}
		
		text.print(printer).run();
		
		//for test
//		StyledTextContent styledTextContent = text.getContent();
//		int lineCount = styledTextContent.getLineCount();
//		for (int i = 0;i < lineCount;i++) {
//			String line = styledTextContent.getLine(i);
//			System.out.println(line);
//		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

}
