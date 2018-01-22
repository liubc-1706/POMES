/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/*
 * @modifed Steve Blass
 * swb@aurora.phys.utk.edu
 * 09/11/2004
 */
package vpml.informationpackage.presentation;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.DelegatingWrapperItemProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.*;
import org.eclipse.ui.actions.ActionGroup;
import org.eclipse.ui.forms.*;
import org.eclipse.ui.forms.editor.FormPage;
//import org.eclipse.ui.forms.examples.internal.ExamplesPlugin;
import org.eclipse.ui.forms.widgets.*;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

import vpml.EMObject;
import vpml.informationpackage.EMIAttribute;
import vpml.informationpackage.EMIComplexAttribute;
import vpml.informationpackage.EMIComplexItem;
import vpml.informationpackage.EMIEnum;
import vpml.informationpackage.EMIEnumLiteral;
import vpml.informationpackage.EMIForm;
import vpml.informationpackage.EMIList;
import vpml.informationpackage.EMISimpleAttribute;
import vpml.informationpackage.EMIStatAttribute;
import vpml.informationpackage.InformationpackageFactory;
import vpml.informationpackage.presentation.InformationpackageEditor;


//import bd7.actions.RolesEditorInput;

/**
 *
 */
public class ScrolledPropertiesBlock 
		extends MasterDetailsBlock 
			implements ISelectionChangedListener {
	private FormPage page;
	protected InformationpackageEditor ourEditor;
	private SelectionChangedEvent selectionEvent;
	//protected  TreeViewer treeViewer; // to use or not to use? 
	private IDetailsPageProvider myDetailsPageProvider;
	
	public AdapterFactoryTreeEditor ADFTE;
	
	public TableViewer tv;
	public static int index=1;
	public ScrolledPropertiesBlock(FormPage page, InformationpackageEditor theEditor, TreeViewer ourViewer) {
		this.page = page;
		this.ourEditor=theEditor;
		this.myDetailsPageProvider=new InformationDetailsPageProvider(ourEditor);
		//this.treeViewer=ourViewer;
		index=1;
	}
		
	protected void createMasterPart(
			final IManagedForm managedForm,
			Composite parent) {
		final ScrolledForm form = managedForm.getForm();
		FormToolkit toolkit = managedForm.getToolkit();
		
		
		
		//  
		Section section = 
			toolkit.createSection(parent, Section.DESCRIPTION);
		section.setText("数据项列表");
		section.setDescription(
				"数据项具体属性可在右侧进行编辑"
		);
		section.marginWidth = 10;
		section.marginHeight = 5;
		toolkit.createCompositeSeparator(section);
		
		// 
		Composite client = toolkit.createComposite(section, SWT.WRAP);
		
		GridLayout layout = new GridLayout();
		
		layout.numColumns = 2;
		layout.marginWidth = 2;
		layout.marginHeight = 2;
		client.setLayout(layout);
		
		//added by fan
		Table t=toolkit.createTable(client, SWT.BORDER|SWT.FULL_SELECTION);
		t.setHeaderVisible(true);
		t.setLinesVisible(true);
		
		TableLayout tLayout=new TableLayout();
		t.setLayout(tLayout);
		tLayout.addColumnData(new ColumnWeightData(18));
		new TableColumn(t,SWT.NONE).setText("序号");
		tLayout.addColumnData(new ColumnWeightData(100));
		new TableColumn(t,SWT.NONE).setText("数据项名称");
		
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.heightHint = 20;
		gd.widthHint = 100;
		t.setLayoutData(gd);
			
		toolkit.paintBordersFor(client);
		

		Composite opSection = toolkit.createComposite(client);
		opSection.setLayout(new GridLayout());
		
		gd=new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		opSection.setLayoutData(gd);
		
		
		Button b = toolkit.createButton(opSection, " 新建 ", SWT.PUSH);
		b.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				tv.getControl().getMenu().setVisible(true);
			}	
		});		
		gd = new GridData(GridData.FILL_VERTICAL);
		b.setLayoutData(gd);
		
		final Button removeButton=toolkit.createButton(opSection," 删除 ",SWT.PUSH);
		gd=new GridData(GridData.FILL_VERTICAL);
		removeButton.setLayoutData(gd);
		removeButton.setEnabled(false);
		
		final Button upButton=toolkit.createButton(opSection," 上移 ",SWT.PUSH);
		gd=new GridData(GridData.FILL_VERTICAL);
		upButton.setLayoutData(gd);
		upButton.setEnabled(false);
		
		final Button downButton=toolkit.createButton(opSection," 下移 ",SWT.PUSH);
		gd=new GridData(GridData.FILL_VERTICAL);
		downButton.setLayoutData(gd);
		downButton.setEnabled(false);
		
		removeButton.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				IStructuredSelection selection=(IStructuredSelection)tv.getSelection();
				EMObject o=(EMObject)selection.getFirstElement();
				EObject container=o.eContainer();
				if(o.eContainer() instanceof EMIForm){
					EMIForm c=(EMIForm)o.eContainer();
					if(o instanceof EMIAttribute){
						RemoveCommand rc=new RemoveCommand(ourEditor.getEditingDomain(),c.getAttributes(),o);
						ourEditor.getEditingDomain().getCommandStack().execute(rc);
					}
				}else if(o.eContainer() instanceof EMIList){
					EMIList l=(EMIList)o.eContainer();
					if(o instanceof EMIEnumLiteral){
						RemoveCommand rc=new RemoveCommand(ourEditor.getEditingDomain(),l.getAttributes(),o);
						ourEditor.getEditingDomain().getCommandStack().execute(rc);
					}
				}else if(o.eContainer() instanceof EMIEnum){
					EMIEnum en=(EMIEnum)o.eContainer();
					if(o instanceof EMIEnumLiteral){
						RemoveCommand rc=new RemoveCommand(ourEditor.getEditingDomain(),en.getLiterals(),o);
						ourEditor.getEditingDomain().getCommandStack().execute(rc);
					}
				}
				tv.setInput(container.eContents());
				if(tv.getTable().getSelectionIndex()<0){
					removeButton.setEnabled(false);
					upButton.setEnabled(false);
					downButton.setEnabled(false);
				}
				refreshTable();
			}
		});
		

		
		upButton.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				IStructuredSelection selection=(IStructuredSelection)tv.getSelection();
				EMObject o=(EMObject)selection.getFirstElement();
				int sIndex=tv.getTable().getSelectionIndex();
				if(o.eContainer() instanceof EMIForm){
					EMIForm c=(EMIForm)o.eContainer();
					if(o instanceof EMIAttribute){
						if(sIndex>0){
							MoveCommand rc=new MoveCommand(ourEditor.getEditingDomain(),c.getAttributes(),o,sIndex-1);
							ourEditor.getEditingDomain().getCommandStack().execute(rc);
						}
					}
				}else if(o.eContainer() instanceof EMIList){
					EMIList c=(EMIList)o.eContainer();
					if(o instanceof EMIAttribute){
						if(sIndex>0){
							MoveCommand rc=new MoveCommand(ourEditor.getEditingDomain(),c.getAttributes(),o,sIndex-1);
							ourEditor.getEditingDomain().getCommandStack().execute(rc);
						}
					}
				}else if(o.eContainer() instanceof EMIEnum){
					EMIEnum c=(EMIEnum)o.eContainer();
					if(o instanceof EMIEnumLiteral){
						if(sIndex>0){
							MoveCommand rc=new MoveCommand(ourEditor.getEditingDomain(),c.getLiterals(),o,sIndex-1);
							ourEditor.getEditingDomain().getCommandStack().execute(rc);
						}
					}
				}
				tv.setInput(o.eContainer().eContents());
				refreshTable();
			}
		});
		
		
		downButton.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				IStructuredSelection selection=(IStructuredSelection)tv.getSelection();
				EMObject o=(EMObject)selection.getFirstElement();
				int sIndex=tv.getTable().getSelectionIndex();
				if(o.eContainer() instanceof EMIForm){
					EMIForm c=(EMIForm)o.eContainer();
					if(o instanceof EMIAttribute){
						if(sIndex<c.getAttributes().size()-1){
							MoveCommand rc=new MoveCommand(ourEditor.getEditingDomain(),c.getAttributes(),o,sIndex+1);
							ourEditor.getEditingDomain().getCommandStack().execute(rc);
						}
					}
				}else if(o.eContainer() instanceof EMIList){
					EMIList c=(EMIList)o.eContainer();
					if(o instanceof EMIAttribute){
						if(sIndex<c.getAttributes().size()-1){
							MoveCommand rc=new MoveCommand(ourEditor.getEditingDomain(),c.getAttributes(),o,sIndex+1);
							ourEditor.getEditingDomain().getCommandStack().execute(rc);
						}
					}
				}else if(o.eContainer() instanceof EMIEnum){
					EMIEnum c=(EMIEnum)o.eContainer();
					if(o instanceof EMIEnumLiteral){
						if(sIndex<c.getLiterals().size()-1){
							MoveCommand rc=new MoveCommand(ourEditor.getEditingDomain(),c.getLiterals(),o,sIndex+1);
							ourEditor.getEditingDomain().getCommandStack().execute(rc);
						}
					}
				}
				tv.setInput(o.eContainer().eContents());
				refreshTable();
			}
		});
		
		
		section.setClient(client);		
				
		final 
		SectionPart spart = new SectionPart(section);
		managedForm.addPart(spart);

		ResourceSet resourceSet = ourEditor.getEditingDomain().getResourceSet();
		Resource resource = (Resource) resourceSet.getResources().get(0);
		//added by fan
		tv=new TableViewer(t);
		tv.setColumnProperties(new String[]{"0","1"});
		CellEditor[] cellEditor=new CellEditor[2];
		cellEditor[0]=null;
		cellEditor[1]=new TextCellEditor(tv.getTable());
		tv.setCellEditors(cellEditor);
		tv.setCellModifier(new ModelCellModifier());
		
		tv.addSelectionChangedListener(new ISelectionChangedListener(){
			public void selectionChanged(SelectionChangedEvent event){
				managedForm.fireSelectionChanged(spart, event.getSelection());
				ISelection selection =event.getSelection();
				removeButton.setEnabled(true);
				upButton.setEnabled(true);
				downButton.setEnabled(true);
				if (selection instanceof IStructuredSelection) {						
					if(tv.getTable().getSelectionIndex()==0){
						upButton.setEnabled(false);
					}
					if(tv.getTable().getSelectionIndex()>=tv.getTable().getItemCount()-1)
						downButton.setEnabled(false);
					ParsedSelection p =new ParsedSelection(selection,ourEditor);
				}
			}
		});
		tv.setContentProvider(new MasterContentProvider());
		tv.setLabelProvider(new MasterLabelProvider());
		tv.setInput(((EObject)resource.getContents().get(0)).eContents());
		tv.getTable().setSelection(0);
		
		//add context menu to tableViewer
		if(resource.getContents().get(0) instanceof EMIEnum){
			EnumModelActionGroup actionGroup=new EnumModelActionGroup(tv);
			actionGroup.fillContextMenu(new MenuManager("#PopUp"));
			
			section.setText("枚举项列表");
			section.setDescription(
					"枚举项具体属性可在右侧进行编辑"
			);
			tv.getTable().getColumn(1).setText("枚举项");
		}else{
			ModelActionGroup actionGroup=new ModelActionGroup(tv);
			actionGroup.fillContextMenu(new MenuManager("#PopUp"));
		}
		
		

		page.getSite().setSelectionProvider(tv);
		
		//ADFTE = new AdapterFactoryTreeEditor(viewer.getTree(), ourEditor.getAdapterFactory());
		
		//ourEditor.pub_createContextMenuFor(tv);

		tv.addSelectionChangedListener(this);
	}
	
	protected void createToolBarActions(IManagedForm managedForm) {
		final ScrolledForm form = managedForm.getForm();
		Action haction = new Action("hor", Action.AS_RADIO_BUTTON) {
			public void run() {
				sashForm.setOrientation(SWT.HORIZONTAL);
				form.reflow(true);
			}
		};
		haction.setChecked(true);
		haction.setToolTipText("Horizontal orientation");
		
		/*
		haction.setImageDescriptor(Bd7Plugin.getDefault()
				.getImageRegistry()
				.getDescriptor(Bd7Plugin.IMG_HORIZONTAL));
		*/
		Action vaction = new Action("ver", Action.AS_RADIO_BUTTON) {
			public void run() {
				sashForm.setOrientation(SWT.VERTICAL);
				form.reflow(true);
			}
		};
		vaction.setChecked(false);
		vaction.setToolTipText("Vertical orientation");
		/*
		vaction.setImageDescriptor(Bd7Plugin.getDefault()
				.getImageRegistry().getDescriptor(Bd7Plugin.IMG_VERTICAL));
		*/
		
		form.getToolBarManager().add(haction);
		form.getToolBarManager().add(vaction);
	}
	
	protected
	void registerPages(DetailsPart detailsPart) {
		detailsPart.setPageProvider(myDetailsPageProvider);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
	 */
	
	public void selectionChanged(SelectionChangedEvent event) {
		// TODO Auto-generated method stub
		this.selectionEvent=event;
		ourEditor.setSelection(selectionEvent.getSelection());	
	
		
	}
	
	private class MasterContentProvider implements IStructuredContentProvider{

		public void dispose() {
			// TODO Auto-generated method stub
			
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// TODO Auto-generated method stub
			
		}

		public Object[] getElements(Object inputElement) {
			// TODO Auto-generated method stub
			if(inputElement instanceof EList)
				return ((EList)inputElement).toArray();
			else
				return new Object[0];
		}
	}
	
	private class MasterLabelProvider implements ITableLabelProvider{
		public Image getColumnImage(Object element, int columnIndex) {
			// TODO Auto-generated method stub
			return null;
		}

		public String getColumnText(Object element, int col) {
			// TODO Auto-generated method stub
			EMObject o=(EMObject)element;
			if(col==0) return String.valueOf(index++);
			if(col==1) {
				if(o.getName()=="")
					return "未命名数据项";
				return o.getName();
			}
			return "";
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
	
	private class ModelCellModifier implements ICellModifier{

		public boolean canModify(Object element, String property) {
			// TODO Auto-generated method stub
			return true;
		}

		public Object getValue(Object element, String property) {
			// TODO Auto-generated method stub
			EMObject o=(EMObject)element;
			if(property.equals("1")){
				if(o.getName()!=null)
					return o.getName();
			}
			return "";
		}

		public void modify(Object element, String property, Object value) {
			// TODO Auto-generated method stub
			
			TableItem tableItem=(TableItem)element;
			EMObject o=(EMObject)tableItem.getData();
			final List l=
				new AdapterFactoryItemDelegator(ourEditor.getAdapterFactory()).
					getPropertyDescriptors(o);
			
			if(property.equals("1")){
				String newValue=(String)value;
				if(newValue.equals("")) return;
				if(o.getName()!=null && newValue.equals(o.getName())){
					return;
				}
				for (Iterator i=l.iterator();i.hasNext();) {
					 IItemPropertyDescriptor desc = 
		 		    	(IItemPropertyDescriptor)i.next();
					 if (desc.getId(o).equals("Name") ) {
					 	desc.setPropertyValue(o,newValue);
					 }
				}
			}
			tv.setInput(o.eContainer().eContents());
			refreshTable();
		}
		
	}
	
	private class ModelActionGroup extends ActionGroup {
		private TableViewer tv;
		
		public ModelActionGroup(TableViewer tableViewer){
			tv=tableViewer;
		}
		
		public void fillContextMenu(IMenuManager mgr){
			MenuManager menuManager=(MenuManager)mgr;
			MenuManager newMenu=new MenuManager("新建");
			newMenu.add(new AddSimpleAttributeAction());
			newMenu.add(new AddComplexAttributeAction());
			newMenu.add(new AddStatAttributeAction());
			menuManager.add(newMenu);
			Table table=tv.getTable();
			Menu menu=menuManager.createContextMenu(table);
			table.setMenu(menu);
		}		
	}
	
	private class EnumModelActionGroup extends ActionGroup{
		private TableViewer tv;
		
		public EnumModelActionGroup(TableViewer tableViewer){
			tv=tableViewer;
		}
		
		public void fillContextMenu(IMenuManager mgr){
			MenuManager menuManager=(MenuManager)mgr;
			menuManager.add(new AddEnumOptionAction());
			Table table=tv.getTable();
			Menu menu=menuManager.createContextMenu(table);
			table.setMenu(menu);
		}
	}
	
	private class ModelActionGroupForButton extends ActionGroup{
		private Button button;
		
		public ModelActionGroupForButton(Button b){
			button=b;
		}
		public void fillContextMenu(IMenuManager mgr){
			MenuManager menuManager=(MenuManager)mgr;
			menuManager.add(new AddSimpleAttributeAction());
			menuManager.add(new AddComplexAttributeAction());
			menuManager.add(new AddStatAttributeAction());
			Menu menu=menuManager.createContextMenu(button);
			button.setMenu(menu);
		}
	}
	
	private class AddSimpleAttributeAction extends Action{
		public AddSimpleAttributeAction(){
			setText("简单数据项");
		}
		public void run(){
			ResourceSet resourceSet = ourEditor.getEditingDomain().getResourceSet();
			Resource resource = (Resource) resourceSet.getResources().get(0);
			EMObject o=(EMObject)resource.getContents().get(0);
			
			EMISimpleAttribute sa=InformationpackageFactory.eINSTANCE.createEMISimpleAttribute();
			if(o instanceof EMIForm){
				AddCommand cmd=new AddCommand(ourEditor.getEditingDomain(),((EMIForm)o).getAttributes(),sa);
				ourEditor.getEditingDomain().getCommandStack().execute(cmd);
			}else if(o instanceof EMIList){
				AddCommand cmd=new AddCommand(ourEditor.getEditingDomain(),((EMIList)o).getAttributes(),sa);
				ourEditor.getEditingDomain().getCommandStack().execute(cmd);
			}
			tv.setInput(o.eContents());
			refreshTable();
			//tv.getTable().select(o.eContents().size()+1);
			tv.getTable().setSelection(o.eContents().size()-1);
			tv.getTable().setFocus();
		}
	}
	
	private class AddComplexAttributeAction extends Action{
		public AddComplexAttributeAction(){
			setText("复杂数据项");
		}
		public void run(){
			ResourceSet resourceSet = ourEditor.getEditingDomain().getResourceSet();
			Resource resource = (Resource) resourceSet.getResources().get(0);
			EMObject o=(EMObject)resource.getContents().get(0);
			
			EMIComplexAttribute ca=InformationpackageFactory.eINSTANCE.createEMIComplexAttribute();
			if(o instanceof EMIForm){
				AddCommand cmd=new AddCommand(ourEditor.getEditingDomain(),((EMIForm)o).getAttributes(),ca);
				ourEditor.getEditingDomain().getCommandStack().execute(cmd);
			}else if(o instanceof EMIList){
				AddCommand cmd=new AddCommand(ourEditor.getEditingDomain(),((EMIList)o).getAttributes(),ca);
				ourEditor.getEditingDomain().getCommandStack().execute(cmd);
			}
			tv.setInput(o.eContents());
			refreshTable();
		}
	}
	
	private class AddStatAttributeAction extends Action{
		public AddStatAttributeAction(){
			setText("分析数据项");
		}
		public void run(){
			ResourceSet resourceSet = ourEditor.getEditingDomain().getResourceSet();
			Resource resource = (Resource) resourceSet.getResources().get(0);
			EMObject o=(EMObject)resource.getContents().get(0);
			
			EMIStatAttribute sa=InformationpackageFactory.eINSTANCE.createEMIStatAttribute();
			if(o instanceof EMIForm){
				AddCommand cmd=new AddCommand(ourEditor.getEditingDomain(),((EMIForm)o).getAttributes(),sa);
				ourEditor.getEditingDomain().getCommandStack().execute(cmd);
			}else if(o instanceof EMIList){
				AddCommand cmd=new AddCommand(ourEditor.getEditingDomain(),((EMIList)o).getAttributes(),sa);
				ourEditor.getEditingDomain().getCommandStack().execute(cmd);
			}
			tv.setInput(o.eContents());
			refreshTable();
		}
	}
	
	private class AddEnumOptionAction extends Action{
		public AddEnumOptionAction(){
			setText("新建枚举项");
		}
		public void run(){
			ResourceSet resourceSet = ourEditor.getEditingDomain().getResourceSet();
			Resource resource = (Resource) resourceSet.getResources().get(0);
			EMObject o=(EMObject)resource.getContents().get(0);
			
			EMIEnumLiteral el=InformationpackageFactory.eINSTANCE.createEMIEnumLiteral();
			el.setValue(o.eContents().size()+1);
			
			if(o instanceof EMIEnum){
				AddCommand cmd=new AddCommand(ourEditor.getEditingDomain(),((EMIEnum)o).getLiterals(),el);
				ourEditor.getEditingDomain().getCommandStack().execute(cmd);
			}
			tv.setInput(o.eContents());
			refreshTable();
		}
	}
	
	//added by fan
	private void refreshTable(){
		index=1;
		tv.refresh();
	}
}