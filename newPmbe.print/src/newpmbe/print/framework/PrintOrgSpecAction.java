package newpmbe.print.framework;

import java.util.ListIterator;

import newpmbe.product.diagram.part.NewPMBEDiagramEditorPlugin;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
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

import vpml.organizationpackage.EMODiagram;
import vpml.organizationpackage.EMOResourceGroupType;
import vpml.organizationpackage.impl.EMOResourceGroupTypeImpl;
import vpml.processpackage.EMPDiagram;
import vpml.resourcepackage.EMRDiagram;
import vpml.resourcepackage.EMRRole;

public class PrintOrgSpecAction implements IWorkbenchWindowActionDelegate {

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
			MessageDialog.openInformation(null, "������ʾ", "����λ�ڹ�����ͼ��������֯��ͼ��ӡ��֯���˵����");
		}
		else if(diagram.getElement() instanceof EMRDiagram){
			MessageDialog.openInformation(null, "������ʾ", "����λ����Դ��ͼ��������֯��ͼ��ӡ��֯���˵����");
		}
		else{
		EMODiagram eMPDiagram = (EMODiagram)diagram.getElement();		
		
		PrintDialog printDialog = new PrintDialog(window.getShell());
		PrinterData printerData = printDialog.open();
		if (printerData == null)
			return;
		Printer printer = new Printer(printerData);
		
		EList roleList = eMPDiagram.getRoles();
		EList orgList = eMPDiagram.getResourceGroupTypes();
		
		StyledText text = new StyledText(window.getShell(), SWT.MULTI);
		text.append("***��֯ģ�͹��˵��***\n");
		text.append("===============================\n\n");
		
		IWorkbenchWindow window = NewPMBEDiagramEditorPlugin.getInstance()
		.getWorkbench().getActiveWorkbenchWindow();		
		
		DiagramDocumentEditor targetDiagramEditor = (DiagramDocumentEditor)activePage.getActiveEditor();		
		IEditorInput activeInput = targetDiagramEditor.getEditorInput();		
		IFile activeEditorFile = ((IFileEditorInput)activeInput).getFile();
		//�õ���ǰ������
		String actFilePath=activeEditorFile.getProjectRelativePath().toString();//��ǰ�ļ������·��
		int end = actFilePath.indexOf(".");
		String projectName = actFilePath.substring(0, end-1);
		text.append("��֯ģ�����ƣ�"+projectName+"\n\n");		
		
		text.append("	��ɫ"+ "\n\n");
		ListIterator listIteratorRole = roleList.listIterator();
		while (listIteratorRole.hasNext()) {
			EMRRole emrRole = (EMRRole)listIteratorRole.next();
			text.append("��Դ���� : " + emrRole.getTotalAmount() + "\n");
			text.append("��ʹ���� : " + emrRole.getUsageAmount() + "\n");
			text.append("��λ���� : " + emrRole.getAvailableAmount() + "\n");
			text.append("��λ�۸� : " + emrRole.getCostPerUnit() + "\n");
			text.append("\n");
		}
		
		text.append("	��֯����"+ "\n\n");

		for(int i=0;i<orgList.size();i++){
			EMOResourceGroupType emoOrg = (EMOResourceGroupType)orgList.get(i);
			text.append("��֯���� : " + emoOrg.getOrganiztionType() + "\n");
			text.append("������   : " + emoOrg.getPrincipal() + "\n");
			text.append("anumber : " + emoOrg.getArrangeNumber() + "\n");
			text.append("reserved: " + emoOrg.getReserved()+ "\n");
			text.append("\n");
		}
		text.print(printer).run();
		
	}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}
}
