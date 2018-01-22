package newpmbe.web.providers;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.providers.internal.RadialProvider;
import org.eclipse.swt.internal.Library;


public class LibraryLayoutProvider extends RadialProvider{
//	private void addListeners() {
//		   GraphicalEditPart editPart = (GraphicalEditPart)getDecoratorTarget().getAdapter(GraphicalEditPart.class);
//		   if (editPart!=null){
//		      Shelf shelf = (Shelf)editPart.resolveSemanticElement();
//		      if (shelf == null || shelf.eIsProxy()) {
//		         return;
//		      }
//		      TransactionalEditingDomain theEditingDomain = editPart.getEditingDomain();
//		      if (theEditingDomain != null) {
//		         DiagramEventBroker diagramEventBroker = DiagramEventBroker.getInstance(theEditingDomain);
//		         Library library = (Library)shelf.eContainer();
//		         List employees = library.getEmpolyees();
//		         for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
//		            Employee employee = (Employee) iterator.next();
//		            diagramEventBroker.addNotificationListener(employee,this);
//		         }
//		      }                
//		   }
//		}

}
