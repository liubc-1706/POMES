/*
 * @author Steve Blass
 * swb@aurora.phys.utk.edu
 * 09/11/2004
 *//*
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package vpml.informationpackage.presentation;

import java.util.Collection;

import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

import vpml.informationpackage.presentation.InformationpackageEditor;
import vpml.presentation.NewPMBEEditorPlugin;



/**
 * @author swb
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ParsedSelection {

	String textAnswer;
	
	/**
	 * 
	 */
	public ParsedSelection() {
		super();
	}

	public ParsedSelection(ISelection selection, InformationpackageEditor ourEditor) {
		super();
		Collection collection = ((IStructuredSelection)selection).toList();
		switch (collection.size()) {
			case 0: {
				//System.out.println(RceEditorPlugin.INSTANCE.getString("_UI_NoObjectSelected"));
				this.textAnswer= NewPMBEEditorPlugin.INSTANCE.getString("_UI_NoObjectSelected");
				break;
			}
			case 1: {
				
				String text = new AdapterFactoryItemDelegator(ourEditor.getAdapterFactory()).getText(collection.iterator().next());
				//System.out.println(RceEditorPlugin.INSTANCE.getString("_UI_SingleObjectSelected") + text +"\n");
				this.textAnswer= NewPMBEEditorPlugin.INSTANCE.getString("_UI_SingleObjectSelected") + text +"\n";
				break;
			}
			default: {
				//System.out.println(RceEditorPlugin.INSTANCE.getString("_UI_MultiObjectSelected")+ Integer.toString(collection.size()));
				this.textAnswer= NewPMBEEditorPlugin.INSTANCE.getString("_UI_MultiObjectSelected")+ Integer.toString(collection.size());
				break;
			}
		}
		
	}

}
