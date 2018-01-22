package newpmbe.rcp.views.Navigator;

import newpmbe.rcp.viewers.common.filtermanager.SVNFolderFilter;

import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.IWorkingSetManager;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.navigator.ResourceNavigator;

public class NavigatorView extends ResourceNavigator {
    public static final String ID = "newpmbe.rcp.ui.NavigatorView";
    private NavigatorActionGroup navigatorActionGroup;
    protected void makeActions() {
    	navigatorActionGroup = new NavigatorActionGroup(this);
    	setActionGroup(navigatorActionGroup);
    	}
    protected void initWorkingSetFilter() {
    	super.initWorkingSetFilter();
    	getViewer().addFilter(new SVNFolderFilter());
    }
}
