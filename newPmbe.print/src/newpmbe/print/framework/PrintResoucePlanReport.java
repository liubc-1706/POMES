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

import vpml.processpackage.EMPActivity;
import vpml.processpackage.EMPAssFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.impl.EMPAssFlowImpl;
import vpml.resourcepackage.EMRBasicResourceType;
import vpml.resourcepackage.EMRLocationType;
import vpml.resourcepackage.EMRMachineType;
import vpml.resourcepackage.EMRRole;
import vpml.resourcepackage.EMRToolType;

public class PrintResoucePlanReport implements IWorkbenchWindowActionDelegate {

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
		Diagram diagram = (Diagram)currentDiagramEditor.getDiagram();
		EMPDiagram eMPDiagram = (EMPDiagram)diagram.getElement();
	
		StyledText text = new StyledText(window.getShell(), SWT.MULTI);
		text.append("***角色和资源使用计划报告***\n");
		text.append("===============================\n\n");
		text.append("[角色]\n");
		
		EList roles = eMPDiagram.getRoles();		
		ListIterator listIterator = roles.listIterator();
		while (listIterator.hasNext()) {
			EMRRole role = (EMRRole)listIterator.next();
			text.append("    " + role.getName() + "\n");
			EList assFlows = role.getAssFlows();
			ListIterator assFlowsIterator = assFlows.listIterator();
			while (assFlowsIterator.hasNext()) {
				EMPAssFlow eMPAssFlow = (EMPAssFlow)assFlowsIterator.next();
				
				EMPActivity eMPActivity = null;
				if (eMPAssFlow.getCompActivity() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getCompActivity();
				else if(eMPAssFlow.getAutoActivity() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getAutoActivity();
				else if(eMPAssFlow.getNormalActivity() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getNormalActivity();
				else if(eMPAssFlow.getManualBatchActivity() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getManualBatchActivity();
				else if(eMPAssFlow.getAutoBatchActiviy() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getAutoBatchActiviy();
				
				if (eMPActivity != null)
//					text.append("        " + eMPAssFlow.getNumber() + " -> " + eMPActivity.getName() + "\n\n");
					text.append("        " + "1" + " -> " + eMPActivity.getName() + "\n\n");
			}
		}
		
		text.append("[资源]\n");
		
		EList machines = eMPDiagram.getMachineTypes();		
		listIterator = machines.listIterator();
		while (listIterator.hasNext()) {
			EMRMachineType machine = (EMRMachineType)listIterator.next();
			text.append("    " + machine.getName() + "\n");
			EList assFlows = machine.getAssFlows();
			ListIterator assFlowsIterator = assFlows.listIterator();
			while (assFlowsIterator.hasNext()) {
				EMPAssFlow eMPAssFlow = (EMPAssFlow)assFlowsIterator.next();
				
				EMPActivity eMPActivity = null;
				if (eMPAssFlow.getCompActivity() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getCompActivity();
				else if(eMPAssFlow.getAutoActivity() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getAutoActivity();
				else if(eMPAssFlow.getNormalActivity() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getNormalActivity();
				else if(eMPAssFlow.getManualBatchActivity() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getManualBatchActivity();
				else if(eMPAssFlow.getAutoBatchActiviy() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getAutoBatchActiviy();
				
				if (eMPActivity != null)
//					text.append("        " + eMPAssFlow.getNumber() + " -> " + eMPActivity.getName() + "\n\n");
					text.append("        " + "1" + " -> " + eMPActivity.getName() + "\n\n");
			}
		}
		
		EList locations = eMPDiagram.getLocationTypes();		
		listIterator = locations.listIterator();
		while (listIterator.hasNext()) {
			EMRLocationType location = (EMRLocationType)listIterator.next();
			text.append("    " + location.getName() + "\n");
			EList assFlows = location.getAssFlows();
			ListIterator assFlowsIterator = assFlows.listIterator();
			while (assFlowsIterator.hasNext()) {
				EMPAssFlow eMPAssFlow = (EMPAssFlow)assFlowsIterator.next();
				
				EMPActivity eMPActivity = null;
				if (eMPAssFlow.getCompActivity() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getCompActivity();
				else if(eMPAssFlow.getAutoActivity() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getAutoActivity();
				else if(eMPAssFlow.getNormalActivity() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getNormalActivity();
				else if(eMPAssFlow.getManualBatchActivity() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getManualBatchActivity();
				else if(eMPAssFlow.getAutoBatchActiviy() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getAutoBatchActiviy();
				
				if (eMPActivity != null)
//					text.append("        " + eMPAssFlow.getNumber() + " -> " + eMPActivity.getName() + "\n\n");
					text.append("        " + "1" + " -> " + eMPActivity.getName() + "\n\n");
			}
		}
		
		EList tools = eMPDiagram.getToolTypes();		
		listIterator = tools.listIterator();
		while (listIterator.hasNext()) {
			EMRToolType tool = (EMRToolType)listIterator.next();
			text.append("    " + tool.getName() + "\n");
			EList assFlows = tool.getAssFlows();
			ListIterator assFlowsIterator = assFlows.listIterator();
			while (assFlowsIterator.hasNext()) {
				EMPAssFlow eMPAssFlow = (EMPAssFlow)assFlowsIterator.next();
				
				EMPActivity eMPActivity = null;
				if (eMPAssFlow.getCompActivity() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getCompActivity();
				else if(eMPAssFlow.getAutoActivity() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getAutoActivity();
				else if(eMPAssFlow.getNormalActivity() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getNormalActivity();
				else if(eMPAssFlow.getManualBatchActivity() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getManualBatchActivity();
				else if(eMPAssFlow.getAutoBatchActiviy() != null)
					eMPActivity = (EMPActivity)eMPAssFlow.getAutoBatchActiviy();
				
				if (eMPActivity != null)
//					text.append("        " + eMPAssFlow.getNumber() + " -> " + eMPActivity.getName() + "\n\n");
					text.append("        " + "1" + " -> " + eMPActivity.getName() + "\n\n");
			}
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
