/*
 * @author Steve Blass
 * swb@aurora.phys.utk.edu
 * 09/11/2004
 *//*
 * Created on Sep 11, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package vpml.informationpackage.presentation;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import vpml.informationpackage.presentation.InformationpackageEditor;



/**
 * @author swb
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ScrolledPropertiesPage extends FormPage implements IPropertyListener, Listener{

	private InformationpackageEditor ourEditor;
	public ScrolledPropertiesBlock block;
	private FormToolkit toolkit;	
	public TreeViewer ourViewer=null;
	
	public ScrolledPropertiesPage(InformationpackageEditor editor ){ //FormEditor editor) {
		super(editor, "RcpEmfForms", "Master Details");
		ourEditor= (InformationpackageEditor) editor;
		//block = new ScrolledPropertiesBlock(this,ourEditor);	
	}
	protected void createFormContent(final IManagedForm managedForm) {
		final ScrolledForm form = managedForm.getForm();
		this.toolkit = managedForm.getToolkit();
		form.setText("模型定义");
		ourViewer = (TreeViewer) createViewer(form);
		/*
		form.setBackgroundImage(StuffnJunk.getImage(
				StuffnJunk.IMG_FORM_BG));
		*/
		block = new ScrolledPropertiesBlock(this,ourEditor,ourViewer);
		block.createContent(managedForm);
		//this.setActive(true);
	}
	/* (non-Javadoc)
	 * @see bd7.editorpages.myViewerPane#createViewer(org.eclipse.swt.widgets.Composite)
	 */
	public Viewer createViewer(Composite parent) {

		return(ourViewer); 

	}
	public void requestActivation() {
		;
		//super.requestActivation();
		//ourEditor.setCurrentViewerPane(this);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPropertyListener#propertyChanged(java.lang.Object, int)
	 */
	public void propertyChanged(Object source, int propId) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see org.eclipse.swt.widgets.Listener#handleEvent(org.eclipse.swt.widgets.Event)
	 */
	public void handleEvent(Event event) {
		// TODO Auto-generated method stub
		
	}

}
