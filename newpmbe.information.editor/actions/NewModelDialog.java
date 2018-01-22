package vpml.informationpackage.actions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import vpml.EMObject;
import vpml.informationpackage.InformationpackageFactory;
import vpml.informationpackage.InformationpackagePackage;
import vpml.presentation.InformationModelEditorPlugin;

public class NewModelDialog extends Dialog{
	private String textValue;
	private String type;
	private IProject selectedProject;
	private Text nameText;
	
	protected InformationpackagePackage informationpackagePackage = InformationpackagePackage.eINSTANCE;
	protected InformationpackageFactory informationpackageFactory = informationpackagePackage.getInformationpackageFactory();
	
	public NewModelDialog(Shell parentShell){
		super(parentShell);
	}
	
	public String getTextValue(){
		return this.textValue;
	}
	
	public void setTextValue(String string){
		this.textValue=string;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public IProject getSelectedProject() {
		return selectedProject;
	}

	public void setSelectedProject(IProject selectedProject) {
		this.selectedProject = selectedProject;
	}

	protected Control createDialogArea(Composite parent){
		this.getShell().setText("新建表单"); 
		Composite topComp=new Composite(parent,SWT.NONE);
		topComp.setLayout(null);
		Label label=new Label(topComp,SWT.NONE);
	    label.setBounds(10,30,75,25);
	    label.setText("表单名称");
	    nameText=new Text(topComp,SWT.BORDER);
	    nameText.setText(textValue==null?"":textValue); 
	    nameText.setBounds(90,30,170,20);
	    
	    return topComp;
		
	}

	@Override
	protected void initializeBounds() {
		// TODO Auto-generated method stub
		super.createButton((Composite)getButtonBar(),IDialogConstants.OK_ID, "确定", false); //$NON-NLS-1$
		super.createButton((Composite)getButtonBar(), IDialogConstants.CANCEL_ID, "取消", false); //$NON-NLS-1$
		super.initializeBounds();
	}

	@Override
	protected Button createButton(Composite parent, int id, String label,
			boolean defaultButton) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Point getInitialSize() {
		// TODO Auto-generated method stub
		Point p=super.getInitialSize();
		p.x=280;
		p.y=140;
		return p;
	}

	@Override
	protected void buttonPressed(int buttonId) {
		// TODO Auto-generated method stub
		//super.buttonPressed(buttonId);
		if(buttonId==IDialogConstants.OK_ID){
			this.textValue=nameText.getText();
			String modelName=nameText.getText();
			if(modelName!=null&&modelName.length()!=0){
				String suffix="form";
				if(type.equals("EMIList")){
					suffix="list";
				}else if(type.equals("EMIEnum")){
					suffix="enum";
				}
				IFile modelFile=ResourcesPlugin.getWorkspace().getRoot().getFile(selectedProject.getFullPath().append(modelName+"."+suffix));
				ResourceSet resourceSet = new ResourceSetImpl();

				URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
				Resource resource = resourceSet.createResource(fileURI);
				
				EMObject rootObject = (EMObject)createInitialModel();
				rootObject.setName(modelName);
				
				if (rootObject != null) {
					resource.getContents().add(rootObject);
				}
				
				Map options = new HashMap();
				options.put(XMLResource.OPTION_ENCODING, "utf8");
				try {
					resource.save(options);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				IWorkbench workbench=PlatformUI.getWorkbench();
				IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
				IWorkbenchPage page = workbenchWindow.getActivePage();
				final IWorkbenchPart activePart = page.getActivePart();
				if (activePart instanceof ISetSelectionTarget) {
					final ISelection targetSelection = new StructuredSelection(modelFile);
					getShell().getDisplay().asyncExec
						(new Runnable() {
							 public void run() {
								 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
							 }
						 });
				}

				// Open an editor on the new file.
				//
				try {
					page.openEditor
						(new FileEditorInput(modelFile),
						 "vpml.informationpackage.presentation.InformationpackageEditorID");
				}
				catch (PartInitException exception) {
					MessageDialog.openError(workbenchWindow.getShell(), InformationModelEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());

				}
				
				this.close();
				
			}
			else{
				MessageDialog.openError(getShell(),"...", "请输入名称"); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}
		else if(buttonId==IDialogConstants.CANCEL_ID){
			this.close();
		}
	}
	
	protected EObject createInitialModel(){
		EClass eClass = (EClass)informationpackagePackage.getEClassifier(type);
		EObject rootObject = informationpackageFactory.create(eClass);
		return rootObject;
	}

}
