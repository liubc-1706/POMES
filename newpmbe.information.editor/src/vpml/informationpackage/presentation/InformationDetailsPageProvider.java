/*
 * @author Steve Blass
 * swb@aurora.phys.utk.edu
 * 09/11/2004
 */
package vpml.informationpackage.presentation;


import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IDetailsPageProvider;

import vpml.informationpackage.presentation.InformationpackageEditor;


 
/**
 * @author swb
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class InformationDetailsPageProvider implements IDetailsPageProvider {

	protected InformationpackageEditor ourEditor;
	/**
	 * @param ourEditor
	 */
	public InformationDetailsPageProvider(InformationpackageEditor ourEditor) {
		
		// TODO Auto-generated constructor stub
		this.ourEditor=ourEditor;
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPageProvider#getPageKey(java.lang.Object)
	 */
	public Object getPageKey(Object object) {
		Object key=null;
		
		return object;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPageProvider#getPage(java.lang.Object)
	 */
	public IDetailsPage getPage(Object key) {
		//System.out.println("getPage "+key);
		return new ObjectDetailsPage(key,ourEditor);
	}

}
