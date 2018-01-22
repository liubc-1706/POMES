/*
 * @author Steve Blass
 * swb@aurora.phys.utk.edu
 * 09/11/2004
 */
package vpml.informationpackage.presentation;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.views.properties.PropertySheet;

import vpml.EMObject;
import vpml.impl.EMObjectImpl;
import vpml.informationpackage.EMIComplexAttribute;
import vpml.informationpackage.EMIComplexItem;
import vpml.informationpackage.EMIForm;
import vpml.informationpackage.EMISimpleType;
import vpml.informationpackage.impl.EMIAttributeImpl;
import vpml.informationpackage.impl.EMIComplexAttributeImpl;
import vpml.informationpackage.impl.EMIComplexItemImpl;
import vpml.informationpackage.impl.EMIEnumImpl;
import vpml.informationpackage.impl.EMIEnumLiteralImpl;
import vpml.informationpackage.impl.EMISimpleAttributeImpl;
import vpml.informationpackage.impl.EMIStatAttributeImpl;
import vpml.informationpackage.presentation.InformationpackageEditor;


/**
 * ObjectDetailsPage
 * @author swb
 */
public class ObjectDetailsPage implements IDetailsPage, IPartListener, ISelectionChangedListener {
	boolean debug =false;	
	private IManagedForm mform;		
	private Object input;
	private AdapterFactory AF;
	private AdapterFactoryLabelProvider Aflp;
	private AdapterFactoryItemDelegator Afid;
	// details composite
	Composite client;
	// our Editor
	private InformationpackageEditor ourEditor=null;
	Section s1;
	GenericSection GS;
	
	public ObjectDetailsPage(Object input, InformationpackageEditor ourEditor) { 
		if (debug) System.out.println("ObjectDetailsPage: "+ input);

		this.input=input;
		this.ourEditor=ourEditor;
		this.AF= ourEditor.getAdapterFactory();
		this.Afid= new AdapterFactoryItemDelegator(AF);
		this.Aflp= new AdapterFactoryLabelProvider(AF);
		ourEditor.getSite().getPage().addPartListener(this);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.
	 * 	IDetailsPage#createContents(org.eclipse.swt.widgets.Composite)
	 */
	public void createContents(Composite parent) {	
		if (debug) System.out.println("createContents:");
		
		// setup
		String txt = 
			new AdapterFactoryItemDelegator(
				ourEditor.getAdapterFactory()).
					getText(input);
		
		if (debug) System.out.println("whadawegot: "+txt);
		
		TableWrapLayout layout = new TableWrapLayout();
		layout.topMargin = 5;
		layout.leftMargin = 5;
		layout.rightMargin = 2;
		layout.bottomMargin = 2;
		layout.numColumns=2;
		parent.setLayout(layout);
		
		FormToolkit  toolkit = mform.getToolkit();
		// details header section
		// Section 
		s1 = toolkit.createSection(parent, Section.DESCRIPTION);
		s1.marginWidth = 10;
		s1.setText(txt); 
		s1.setDescription("设置当前选项的属性值.");		
		TableWrapData td = 
			new TableWrapData(TableWrapData.FILL, TableWrapData.TOP);
		td.colspan=2;
		td.grabHorizontal = true;
		s1.setLayoutData(td);
		toolkit.createCompositeSeparator(s1);
		
		// details client section
		client = toolkit.createComposite(s1);		
		GridLayout glayout = new GridLayout();
		glayout.marginWidth = glayout.marginHeight = 0;
		glayout.verticalSpacing=5;
		glayout.numColumns = 2;
		glayout.marginTop=10;
		client.setLayout(glayout);		
		// client content
		toolkit.createCompositeSeparator(s1);
		
		if(input instanceof EMObjectImpl){
			GS=new GenericSection();
			GS.createSection((EMObjectImpl)input);
		}
		
		s1.setClient(client);
		final 
		SectionPart spart = new SectionPart(s1);
		mform.addPart(spart);
		
		createSpacer(toolkit, client, 2);			
	}

	public void labelMaker (String s) {
		Label l = mform.getToolkit().createLabel(client,s,SWT.WRAP);
		GridData gd=new GridData();
		gd.widthHint=66;
		l.setLayoutData(gd);
	}
	
	void update() {
		FormToolkit  toolkit = mform.getToolkit();
		if(input instanceof EMObjectImpl){
			GS.updateSection();
		}
	}

	private void createSpacer(FormToolkit toolkit, 
			Composite parent, int span) {
		Label spacer = toolkit.createLabel(parent, "");
		GridData gd = new GridData();
		gd.horizontalSpan = span;
		spacer.setLayoutData(gd);		
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.
	 *   IFormPart#initialize(org.eclipse.ui.forms.IManagedForm)
	 */
	public void initialize(IManagedForm form) {

		this.mform = form;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IFormPart#dispose()
	 */
	public void dispose() {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IFormPart#isDirty()
	 */
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IFormPart#commit(boolean)
	 */
	public void commit(boolean onSave) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.
	 *   IFormPart#setFormInput(java.lang.Object)
	 */
	public boolean setFormInput(Object input) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IFormPart#setFocus()
	 */
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IFormPart#isStale()
	 */
	public boolean isStale() {
		// TODO Auto-generated method stub
		//return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IFormPart#refresh()
	 */
	public void refresh() {
		// TODO Auto-generated method stub
		if (debug) System.out.println("Object Details Refresh");
		update();

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.
	 *   IPartSelectionListener#selectionChanged(org.eclipse.ui.forms.IFormPart, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IFormPart part, ISelection selection) {
		// TODO Auto-generated method stub
		if (debug) 
			System.out.println("DetailsPage.selectionChanged"+
				"\n"+part+"\n"+selection);
		update();
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPartListener#partActivated(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partActivated(IWorkbenchPart part) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPartListener#partBroughtToTop(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partBroughtToTop(IWorkbenchPart part) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPartListener#partClosed(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partClosed(IWorkbenchPart part) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPartListener#partDeactivated(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partDeactivated(IWorkbenchPart part) {
		if (part instanceof PropertySheet) {
			update();
		}
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPartListener#partOpened(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partOpened(IWorkbenchPart part) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
	 */
	public void selectionChanged(SelectionChangedEvent event) {
		// TODO Auto-generated method stub
		if (debug) System.out.println("ObjectDetails selectionChanged");
		
	}
	
	private class GenericSection{
		Text nameText;
		Text descText;
		Combo simpleTypeCombo;
		Text expressionText;
		Text defaultValueText;
		Text complexTypeText;
		Text minimumText;
		Text maximumText;
		Text enumValueText;
		
		private void updateSection(){
			if(((EMObject)input).getName()!=null){
				nameText.setText(((EMObject)input).getName());
				//nameText.
				if(input instanceof EMIEnumLiteralImpl){
					s1.setText("枚举项-"+((EMObject)input).getName());
				}else{
					s1.setText("数据项-"+((EMObject)input).getName());
				}
				//s1.redraw();
				s1.update();//无法更新
			}
			/*if(((EMObject)input).getDescription()!=null){
				descText.setText(((EMObject)input).getDescription());
			}
			if(input instanceof EMIComplexAttribute){
				if(((EMIComplexAttribute)input).getComplexType()!=null){
					complexTypeText.setText(((EMIComplexAttribute)input)
							.getComplexType().getName());
				}
			}*/
			//consider specific situations
		}
		
		private void createSection(final EMObjectImpl impl){
			FormToolkit t= mform.getToolkit();
			final List l=
				new AdapterFactoryItemDelegator(ourEditor.getAdapterFactory()).
					getPropertyDescriptors(input);
			labelMaker("名称：");
			if(impl.getName()==null) impl.setName("");
			nameText=t.createText(client,impl.getName(), SWT.NONE);
			nameText.setEditable(false);
			nameText.setEnabled(false);
			GridData gd = new GridData();
			gd.widthHint=220;
			nameText.setLayoutData(gd);
			nameText.addModifyListener(new ModifyListener(){
				public void modifyText(ModifyEvent e) {
					if (debug) {
						System.out.println("modifyText: ");
						System.out.println("contents?: "+((Text)e.widget).getText());
					}
					for (Iterator i=l.iterator();i.hasNext();) {
						 IItemPropertyDescriptor desc = 
			 		    	(IItemPropertyDescriptor)i.next();
						 if (debug) System.out.println("descriptorID: " + desc.getId(input));
						 if (desc.getId(input).equals("Name") ) {
							 if(nameText.getText()!=""&&!((EMObject)input).getName().equals(nameText.getText())){
						 		desc.setPropertyValue(input,nameText.getText());
							 }
						 }
					}
					
				}});
			
			if(impl instanceof EMISimpleAttributeImpl){
				labelMaker("类型：");
				simpleTypeCombo=new Combo(client,SWT.NONE);
				for (Iterator i=l.iterator();i.hasNext();) {
					 IItemPropertyDescriptor desc = 
		 		    	(IItemPropertyDescriptor)i.next();
					 if (debug) System.out.println("descriptorID: " + desc.getId(input));
					 if (desc.getId(input).equals("Type")) {
					 	for (Iterator ci= desc.getChoiceOfValues(input).iterator(); ci.hasNext();){
					 		simpleTypeCombo.add(ci.next().toString());
					 	}
					 	simpleTypeCombo.select(((EMISimpleAttributeImpl)impl).getType().getValue());
					 }
				}
				gd = new GridData();
				gd.widthHint=205;
				simpleTypeCombo.setLayoutData(gd);
				simpleTypeCombo.addModifyListener(new ModifyListener() {
					public void modifyText(ModifyEvent e) {
						for (Iterator i=l.iterator();i.hasNext();) {
							 IItemPropertyDescriptor desc = 
				 		    	(IItemPropertyDescriptor)i.next();
							 if (debug) System.out.println("descriptorID: " + desc.getId(input));
							 if (desc.getId(input).equals("Type") ) {
							 	EMISimpleType st= new EMISimpleType(simpleTypeCombo.getSelectionIndex(),
							 			simpleTypeCombo.getItem(simpleTypeCombo.getSelectionIndex()),simpleTypeCombo.getItem(simpleTypeCombo.getSelectionIndex()));
							 	desc.setPropertyValue(input,st);
							 }
						}
					}});
				
			}
			
			if(impl instanceof EMIStatAttributeImpl){
				labelMaker("表达式：");
				if(((EMIStatAttributeImpl)impl).getExpressions()==null) ((EMIStatAttributeImpl)impl).setExpressions("");
				expressionText=t.createText(client,((EMIStatAttributeImpl)impl).getExpressions(), SWT.NONE);
				expressionText.setEditable(true);
				gd = new GridData();
				gd.widthHint=220;
				expressionText.setLayoutData(gd);
				expressionText.addModifyListener(new ModifyListener(){
					public void modifyText(ModifyEvent e) {
						if (debug) {
							System.out.println("modifyText: ");
							System.out.println("contents?: "+((Text)e.widget).getText());
						}
						for (Iterator i=l.iterator();i.hasNext();) {
							 IItemPropertyDescriptor desc = 
				 		    	(IItemPropertyDescriptor)i.next();
							 if (debug) System.out.println("descriptorID: " + desc.getId(input));
							 if (desc.getId(input).equals("Expressions") ) {
							 	desc.setPropertyValue(input,((Text)e.widget).getText());
							 }
						}
						
					}});
				
				labelMaker("默认值：");
				if(((EMIStatAttributeImpl)impl).getDefaultValue()==null) ((EMIStatAttributeImpl)impl).setDefaultValue("");
				defaultValueText=t.createText(client,((EMIStatAttributeImpl)impl).getDefaultValue(), SWT.NONE);
				defaultValueText.setEditable(true);
				gd = new GridData();
				gd.widthHint=220;
				defaultValueText.setLayoutData(gd);
				defaultValueText.addModifyListener(new ModifyListener(){
					public void modifyText(ModifyEvent e) {
						if (debug) {
							System.out.println("modifyText: ");
							System.out.println("contents?: "+((Text)e.widget).getText());
						}
						for (Iterator i=l.iterator();i.hasNext();) {
							 IItemPropertyDescriptor desc = 
				 		    	(IItemPropertyDescriptor)i.next();
							 if (debug) System.out.println("descriptorID: " + desc.getId(input));
							 if (desc.getId(input).equals("DefaultValue") ) {
							 	desc.setPropertyValue(input,((Text)e.widget).getText());
							 }
						}
						
					}});
			}
			
			if(impl instanceof EMIComplexAttributeImpl){
				labelMaker("类型:");
				
				GridLayout glayout = new GridLayout();
				glayout.marginWidth = glayout.marginHeight = 0;
				glayout.numColumns = 2;
				Composite cp=t.createComposite(client);
				cp.setLayout(glayout);
				
				String cType="";
				if(((EMIComplexAttributeImpl)impl).getComplexType()!=null){
					cType=((EMIComplexAttributeImpl)impl).getComplexType().getName();
				}
				
				complexTypeText =t.createText(cp, cType, SWT.NONE);
				complexTypeText.setEditable(false);
			    gd = new GridData();
				gd.widthHint=160;
				complexTypeText.setLayoutData(gd);
				//complexTypeText.setText("");
				
				final Button chooseTypeButton=t.createButton(cp, "选择", SWT.NONE);
				chooseTypeButton.addSelectionListener(new SelectionAdapter(){
					public void widgetSelected(SelectionEvent e){
						ComplexTypeSetDialog dlg=new ComplexTypeSetDialog(null);
						dlg.open();
					}
				});
				gd=new GridData();
				gd.widthHint=50;
				chooseTypeButton.setLayoutData(gd);
				gd=new GridData();
				gd.widthHint=220;
				cp.setLayoutData(gd);
			}
			if(impl.eContainer() instanceof EMIForm){
				labelMaker("最小项数：");
				if(((EMIAttributeImpl)impl).getMinimum()==null) ((EMIAttributeImpl)impl).setMinimum(1);
				minimumText=t.createText(client, String.valueOf(((EMIAttributeImpl)impl).getMinimum()),SWT.NONE);
				minimumText.setEditable(true);
				gd = new GridData();
				gd.widthHint=110;
				minimumText.setLayoutData(gd);
				
				labelMaker("最大项数：");
				if(((EMIAttributeImpl)impl).getMaximun()==null) ((EMIAttributeImpl)impl).setMaximun(1);
				maximumText=t.createText(client, String.valueOf(((EMIAttributeImpl)impl).getMaximun()),SWT.NONE);
				maximumText.setEditable(true);
				maximumText.setLayoutData(gd);
				
				minimumText.addModifyListener(new ModifyListener(){
					public void modifyText(ModifyEvent e) {
						for (Iterator i=l.iterator();i.hasNext();) {
							 IItemPropertyDescriptor desc = 
				 		    	(IItemPropertyDescriptor)i.next();
							 if (desc.getId(input).equals("Minimum") ) {
							 	desc.setPropertyValue(input,new Integer(((Text)e.widget).getText()));
							 }
						}
						
					}});
				
				maximumText.addModifyListener(new ModifyListener(){
					public void modifyText(ModifyEvent e) {
						for (Iterator i=l.iterator();i.hasNext();) {
							 IItemPropertyDescriptor desc = 
				 		    	(IItemPropertyDescriptor)i.next();
							 if (desc.getId(input).equals("Maximun") ) {
							 	desc.setPropertyValue(input,new Integer(((Text)e.widget).getText()));
							 }
						}
						
					}});
			}
			
			if(input instanceof EMIEnumLiteralImpl){
				labelMaker("取值：");
				if(((EMIEnumLiteralImpl)impl).getValue()==null) ((EMIEnumLiteralImpl)impl).setValue(1);
				enumValueText=t.createText(client, String.valueOf(((EMIEnumLiteralImpl)impl).getValue()),SWT.NONE);
				enumValueText.setEditable(true);
				gd = new GridData();
				gd.widthHint=110;
				enumValueText.setLayoutData(gd);
				
				enumValueText.addModifyListener(new ModifyListener(){
					public void modifyText(ModifyEvent e) {
						for (Iterator i=l.iterator();i.hasNext();) {
							 IItemPropertyDescriptor desc = 
				 		    	(IItemPropertyDescriptor)i.next();
							 if (desc.getId(input).equals("Value") ) {
							 	desc.setPropertyValue(input,new Integer(((Text)e.widget).getText()));
							 }
						}
						
				}});
			}
			
			labelMaker("描述：");
			if(impl.getDescription()==null) impl.setDescription("");
			descText=t.createText(client, impl.getDescription(),SWT.MULTI);
			descText.setEditable(true);
			gd = new GridData();
			gd.widthHint=220;
			gd.heightHint=70;
			descText.setLayoutData(gd);
			descText.addModifyListener(new ModifyListener(){
				public void modifyText(ModifyEvent e) {
					if (debug) {
						System.out.println("modifyText: ");
						System.out.println("contents?: "+((Text)e.widget).getText());
					}
					for (Iterator i=l.iterator();i.hasNext();) {
						 IItemPropertyDescriptor desc = 
			 		    	(IItemPropertyDescriptor)i.next();
						 if (debug) System.out.println("descriptorID: " + desc.getId(input));
						 if (desc.getId(input).equals("Description") ) {
						 	desc.setPropertyValue(input,((Text)e.widget).getText());
						 }
					}
					
				}});
			t.paintBordersFor(client);
		}
	
		public void setComplexTypeText(String complexType){
			complexTypeText.setText(complexType);
		}
	}
	
	public class ComplexTypeSetDialog extends Dialog {
		TreeViewer tv;
		Tree tree;
		
		public ComplexTypeSetDialog(Shell parentShell){
			super(parentShell);
		}
		
		protected Control createDialogArea(Composite parent){
			getShell().setText("设置复杂数据类型");
			Composite topComp=new Composite(parent,SWT.NONE);
			topComp.setLayout(null);
			
			Label label=new Label(topComp,SWT.NONE);
			label.setBounds(10, 16, 150, 20);
			label.setText("请选择复杂数据类型：");
			ITreeContentProvider myWorkbenchContentProvider = new WorkbenchContentProvider();
			Object[] elements = myWorkbenchContentProvider
					.getElements(ResourcesPlugin.getWorkspace().getRoot());
			tv=new TreeViewer(topComp,SWT.BORDER);
			tv.setContentProvider(myWorkbenchContentProvider);
			//tv.setLabelProvider(new WorkbenchLabelProvider());
			tv.setLabelProvider(new TreeLabelProvider());
			tv.setInput(ResourcesPlugin.getWorkspace().getRoot());
			tv.getTree().setBounds(10, 42, 250, 270);
			tv.setFilters(getModelFilter());
	        return topComp;
		}
		
		@Override
		protected void initializeBounds() {
			// TODO Auto-generated method stub
			super.createButton((Composite)getButtonBar(),IDialogConstants.OK_ID, "确定", false);
			super.createButton((Composite)getButtonBar(), IDialogConstants.CANCEL_ID, "取消", false);
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
			p.y=385;
			return p;
		}

		@Override
		protected void buttonPressed(int buttonId) {
			// TODO Auto-generated method stub
			if(buttonId==IDialogConstants.OK_ID){
				TreeSelection selection = (TreeSelection) tv.getSelection();   
				if(selection.getFirstElement() instanceof IFile){
					URI fileURI= URI.createFileURI(((IFile)selection.getFirstElement()).getLocation().toString());
					Resource resource =((EObject)input).eResource().getResourceSet().getResource(fileURI, true);
					EMIComplexItemImpl ci=(EMIComplexItemImpl)resource.getContents().get(0);
					List l=
						new AdapterFactoryItemDelegator(ourEditor.getAdapterFactory()).
							getPropertyDescriptors(input);
					for (Iterator i=l.iterator();i.hasNext();) {
						 IItemPropertyDescriptor desc = 
				 	    	(IItemPropertyDescriptor)i.next();
						 if (debug) System.out.println("descriptorID: " + desc.getId(input));
						 if (desc.getId(input).equals("Complex Type") ){
							desc.setPropertyValue(input,ci);
							GS.setComplexTypeText(ci.getName());
						 }
					}
				}
				this.close();
			}
			else{
				this.close();
			}
		}
		
		private ViewerFilter[] getModelFilter(){
			ModelFilter mf=new ModelFilter();
			ViewerFilter[] filters=new ViewerFilter[1];
			filters[0]=mf;
			return filters;
		}
		
	}
	
	private class ModelFilter extends ViewerFilter{

		@Override
		public boolean select(Viewer viewer, Object parentElement,
				Object element) {
			// TODO Auto-generated method stub
			if(element instanceof Project){
				if(((Project)element).getFileExtension()!=null && ((Project)element).getFileExtension().equals("info"))
					return true;
			}else if(element instanceof IFile){
				if(((IFile)element).getFileExtension().equals("form"))
					return true;
				else if(((IFile)element).getFileExtension().equals("list"))
					return true;
				else if(((IFile)element).getFileExtension().equals("enum"))
					return true;
			}else if(element instanceof IFolder){
				return true;
			}
			return false;
		}
		
	}
	
	public class TreeLabelProvider implements ILabelProvider{

		public Image getImage(Object element) {
			// TODO Auto-generated method stub
			//AbstractUIPlugin.imageDescriptorFromPlugin(
				//	, "/icons/next.ico").createImage();
			if(element instanceof IProject){
				return PlatformUI.getWorkbench().getSharedImages().
								getImage(ISharedImages.IMG_OBJ_PROJECT);
			}else if(element instanceof IFolder){
				return PlatformUI.getWorkbench().getSharedImages().
				getImage(ISharedImages.IMG_OBJ_FOLDER);
			}else if(element instanceof IFile){
				if(((IFile)element).getFileExtension()!=null){
					if(((IFile)element).getFileExtension().equals("form")){
						return AbstractUIPlugin.
							imageDescriptorFromPlugin("newpmbe.information.editor","icons/full/ico_form.gif").createImage(); 
					}else if(((IFile)element).getFileExtension().equals("list")){
						return AbstractUIPlugin.
						imageDescriptorFromPlugin("newpmbe.information.editor","icons/full/ico_list.gif").createImage(); 
					}else if(((IFile)element).getFileExtension().equals("enum")){
						return AbstractUIPlugin.
						imageDescriptorFromPlugin("newpmbe.information.editor","icons/full/ico_enum.gif").createImage(); 
					}
				}
			}
			return null;
		}

		public String getText(Object element) {
			// TODO Auto-generated method stub
			String name="";
			String extension="";
			int index=-1;
			if(element instanceof IContainer){
				name=((IContainer)element).getName();
				extension=((IContainer)element).getFileExtension();
			}else if(element instanceof IFile){
				name=((IFile)element).getName();
				extension=((IFile)element).getFileExtension();
			}
			String result=name;
			if(extension!=null)
			if(extension.equals("list")||extension.equals("form")||
					extension.equals("enum")||extension.equals("info")){
				index=name.lastIndexOf(extension);
				
				if(index>0){
					result=name.substring(0, index-1);
				}
			}
			return result;
		}

		public void addListener(ILabelProviderListener listener) {
			// TODO Auto-generated method stub
			
		}

		public void dispose() {
			// TODO Auto-generated method stub
			
		}

		public boolean isLabelProperty(Object element, String property) {
			// TODO Auto-generated method stub
			return false;
		}

		public void removeListener(ILabelProviderListener listener) {
			// TODO Auto-generated method stub
			
		}

		
		
	}
}


