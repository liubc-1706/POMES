package newpmbe.print.framework;


import java.util.ListIterator;

import newpmbe.product.diagram.part.NewPMBEDiagramEditorPlugin;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import vpml.organizationpackage.EMODiagram;
import vpml.processpackage.EMPActivity;
import vpml.processpackage.EMPClockFlow;
import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPFlow;
import vpml.processpackage.EMPLeafActivity;
import vpml.processpackage.EMPObject;
import vpml.processpackage.EMPRefFlow;

import vpml.processpackage.impl.EMPLeafProductImpl;
import vpml.processpackage.impl.EMPProductImpl;
import vpml.resourcepackage.EMRDiagram;
import vpml.utilpackage.EnumIOType;

public class PrintCurSpecAction implements IWorkbenchWindowActionDelegate {
	
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
		
		if(diagram.getElement() instanceof EMODiagram){
			MessageDialog.openInformation(null, "错误提示", "现在位于组织视图，请在过程视图打印过程规格说明！");
		}
		else if(diagram.getElement() instanceof EMRDiagram){
			MessageDialog.openInformation(null, "错误提示", "现在位于资源视图，请在过程视图打印过程规格说明！");
		}
		else{
		EMPDiagram eMPDiagram = (EMPDiagram)diagram.getElement();
		
		
		PrintDialog printDialog = new PrintDialog(window.getShell());
		PrinterData printerData = printDialog.open();
		if (printerData == null)
			return;
		Printer printer = new Printer(printerData);
		
		EList autoBatchActivityList = eMPDiagram.getAutoBatchActivities();
		EList manualBatchActivityList = eMPDiagram.getManualBatchActivities();
		EList autoActivityList = eMPDiagram.getAutoActivities();
		EList compActivityList = eMPDiagram.getCompActivities();
		EList normalActivityList = eMPDiagram.getNormalActivities();
		
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
		//add by wzy end
		
		//打印封面：add by wzy starts
		StyledText textCover = new StyledText(window.getShell(),SWT.MULTI);
		textCover.append("过程规格说明--"+projectName);
		textCover.setSize(22, 22);
		textCover.setLocation(100,100);
////		textCover.print(printer).run();
		//打印封面：add by wzy ends
			
		StyledText text = new StyledText(window.getShell(), SWT.MULTI);
		text.append("***过程模型规格说明***\n");
		text.append("===============================\n\n");
		int seqBegin = 1;// add by wzy		
		ListIterator listIterator = autoBatchActivityList.listIterator();
		seqBegin = appendActivity(text, listIterator, diagram,seqBegin);
		
		listIterator = manualBatchActivityList.listIterator();
		seqBegin = appendActivity(text, listIterator, diagram,seqBegin);
		
		listIterator = autoActivityList.listIterator();
		seqBegin = appendActivity(text, listIterator, diagram,seqBegin);
		
		listIterator = compActivityList.listIterator();
		seqBegin = appendActivity(text, listIterator, diagram,seqBegin);
		
		listIterator = normalActivityList.listIterator();
		seqBegin = appendActivity(text, listIterator, diagram,seqBegin);
		
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
	
	private int appendActivity(StyledText text, ListIterator listIterator, Diagram diagram,int seq) {
		
		while (listIterator.hasNext()) {
			//活动：
			EMPActivity eMPActivity = (EMPActivity)listIterator.next();
			text.append("\n"+String.valueOf(seq)+" "+eMPActivity.getName() + "\n"+"\n");
			text.setSize(22,22);
			seq++;
			text.append("活动说明:"+"\n");
			text.setSize(14,14);
			text.append("\t"+"标准编码 : " + eMPActivity.getCode() + "\n");
			text.append("\t"+"描述 : " + eMPActivity.getDescription() + "\n");
			text.append("\t"+"过程 : " + diagram.getName() + "\n");
			if (eMPActivity instanceof EMPLeafActivity)
				text.append("\t"+"优先级(99~1) : " + ((EMPLeafActivity)eMPActivity).getPriority() + "\n");
			text.append("\t"+"分布 : 缺省\n");
			text.append("\n");
			text.setSize(10,10);
			
			//输入说明：
			text.append("输入说明:\n");
			text.setSize(14,14);
			EList targetList = eMPActivity.getTargetDataFlows();
			ListIterator targetIter = targetList.listIterator();
			while (targetIter.hasNext()) {
				EMPFlow eMPFlow = (EMPFlow)targetIter.next();
				EMPObject sourceEMPObject = null;
				
				if (eMPFlow instanceof EMPDataFlow) {
					EMPDataFlow eMPDataFlow = (EMPDataFlow)eMPFlow;					
					
					if (eMPDataFlow.getSourceProduct() != null)
						sourceEMPObject = eMPDataFlow.getSourceProduct();
					else if (eMPDataFlow.getSourceActivity() != null)
						sourceEMPObject = eMPDataFlow.getSourceActivity();
					else if (eMPDataFlow.getSourceInAnd() != null)
						sourceEMPObject = eMPDataFlow.getSourceInAnd();
					else if (eMPDataFlow.getSourceInOr() != null)
						sourceEMPObject = eMPDataFlow.getSourceInOr();
					else if (eMPDataFlow.getSourceOutAnd() != null)
						sourceEMPObject = eMPDataFlow.getSourceOutAnd();
					else if (eMPDataFlow.getSourceOutOr() != null)
						sourceEMPObject = eMPDataFlow.getSourceOutOr();
				} else if (eMPFlow instanceof EMPRefFlow) {
					EMPRefFlow eMPRefFlow = (EMPRefFlow)eMPFlow;											
					sourceEMPObject = eMPRefFlow.getProduct();
				} else if (eMPFlow instanceof EMPClockFlow) {
					EMPClockFlow eMPClockFlow = (EMPClockFlow)eMPFlow;
					sourceEMPObject = eMPClockFlow.getClock();
				}
				
				if (sourceEMPObject != null) {
					text.append("\t"+"文档名称 : " + sourceEMPObject.getName() + "\n");
					text.append("\t"+"标准编码 : " + sourceEMPObject.getCode() + "\n");
					text.append("\t"+"描述 : " + sourceEMPObject.getDescription() + "\n");
					text.append("\t"+"过程 : " + diagram.getName() + "\n");
			//		text.append("\t"+"路径 : \n");
					
					String ioTypeZ1 = null;
					EnumIOType ioTypeE = ((EMPLeafProductImpl)sourceEMPObject).getIoType();
					int ioNum = ioTypeE.getValue();
					if(ioNum == 0){ioTypeZ1 = "生产材料";}
					else if(ioNum == 1){ioTypeZ1 = "所需材料单一";}
					else if(ioNum == 2){ioTypeZ1 = "所需材料连续";}
					else{ioTypeZ1 = "类型非法";}
					text.append("\t"+"输入/输出类型 : "+ioTypeZ1+"\n");
				}							
			}
			text.append("\n");
			text.setSize(10,10);
			
			//输出说明：
			text.append("输出说明:\n");
			text.setSize(14,14);
			EList sourceList = eMPActivity.getSourceDataFlows();
			ListIterator sourceIter = sourceList.listIterator();
			while (sourceIter.hasNext()) {
				EMPFlow eMPFlow = (EMPFlow)sourceIter.next();
				EMPObject targetEMPObject = null;
				
				if (eMPFlow instanceof EMPDataFlow) {
					EMPDataFlow eMPDataFlow = (EMPDataFlow)eMPFlow;					
					
					if (eMPDataFlow.getTargetProduct() != null)
						targetEMPObject = eMPDataFlow.getTargetProduct();
					else if (eMPDataFlow.getTargetActivity() != null)
						targetEMPObject = eMPDataFlow.getTargetActivity();
					else if (eMPDataFlow.getTargetInAnd() != null)
						targetEMPObject = eMPDataFlow.getTargetInAnd();
					else if (eMPDataFlow.getTargetInOr() != null)
						targetEMPObject = eMPDataFlow.getTargetInOr();
					else if (eMPDataFlow.getTargetOutAnd() != null)
						targetEMPObject = eMPDataFlow.getTargetOutAnd();
					else if (eMPDataFlow.getTargetOutOr() != null)
						targetEMPObject = eMPDataFlow.getTargetOutOr();
				}
				
				if (targetEMPObject != null) {
					text.append("\t"+"文档名称 : " + targetEMPObject.getName() + "\n");
					text.append("\t"+"标准编码 : " + targetEMPObject.getCode() + "\n");
					text.append("\t"+"描述 : " + targetEMPObject.getDescription() + "\n");
					text.append("\t"+"过程 : " + diagram.getName() + "\n");
		//			text.append("\t"+"路径 : \n");
					String ioTypeZ2 = null;
					EnumIOType ioTypeE = ((EMPLeafProductImpl)targetEMPObject).getIoType();
					int ioNum = ioTypeE.getValue();
					if(ioNum == 0){ioTypeZ2 = "生产材料";}
					else if(ioNum == 1){ioTypeZ2 = "所需材料单一";}
					else if(ioNum == 2){ioTypeZ2 = "所需材料连续";}
					else{ioTypeZ2 = "类型非法";}
					text.append("\t"+"输入/输出类型 : "+ioTypeZ2+"\n");
				}
				text.setSize(10,10);
			}
		}
		return seq;
	}

}
