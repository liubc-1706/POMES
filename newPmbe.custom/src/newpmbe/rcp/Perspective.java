package newpmbe.rcp;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IViewLayout;
import org.eclipse.ui.IPlaceholderFolderLayout;


public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		layout.setFixed(false);

		//layout.addView(process.diagram.view.NavigatorViewID, IPageLayout.LEFT, 0.2f, IPageLayout.ID_EDITOR_AREA);
		IFolderLayout leftFolder = layout.createFolder("leftFolderLayout", //$NON-NLS-1$
				IPageLayout.LEFT, 0.20f, editorArea);
		leftFolder.addPlaceholder("newpmbe.rcp.ui.NavigatorView"+":*");
		leftFolder.addView("newpmbe.rcp.ui.NavigatorView");
		leftFolder.addView("org.eclipse.ui.navigator.ProjectExplorer");
		layout.getViewLayout("newpmbe.rcp.ui.NavigatorView").setCloseable(false);
		layout.getViewLayout("org.eclipse.ui.navigator.ProjectExplorer").setCloseable(false);
		

		IFolderLayout outLineLayout = layout.createFolder("outLineFolderLayout", //$NON-NLS-1$
				IPageLayout.BOTTOM, 0.75f, "leftFolderLayout");
		outLineLayout.addPlaceholder("org.eclipse.ui.views.ContentOutline"+":*"); //$NON-NLS-1$ //$NON-NLS-2$
		outLineLayout.addView("org.eclipse.ui.views.ContentOutline"); //$NON-NLS-1$

		
		IFolderLayout bottomLayout = layout.createFolder("bottomFoderLayout", //$NON-NLS-1$
				IPageLayout.BOTTOM, 0.65f, editorArea);
		bottomLayout.addPlaceholder("newpmbe.validator.views.ProblemsView"+":*"); //$NON-NLS-1$ //$NON-NLS-2$
		bottomLayout.addView("newpmbe.validator.views.ProblemsView"); //$NON-NLS-1$
		
		
	}

}
