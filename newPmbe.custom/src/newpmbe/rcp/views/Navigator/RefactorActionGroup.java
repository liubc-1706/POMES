package newpmbe.rcp.views.Navigator;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
//import org.eclipse.ui.actions.DeleteResourceAction;
import org.eclipse.ui.actions.TextActionHandler;
import org.eclipse.ui.views.navigator.IResourceNavigator;
import org.eclipse.ui.views.navigator.ResourceNavigatorActionGroup;
import org.eclipse.ui.views.navigator.ResourceSelectionUtil;

/**
 * This is the action group for refactor actions,
 * including global action handlers for copy, paste and delete.
 * 
 * @since 2.0
 */
public class RefactorActionGroup extends ResourceNavigatorActionGroup {

    private Clipboard clipboard;

//    private CopyAction copyAction;

    private DeleteResourceAction deleteAction;

//    private PasteAction pasteAction;

//    private ResourceNavigatorMoveAction moveAction;

    private TextActionHandler textActionHandler;

    public RefactorActionGroup(IResourceNavigator navigator) {
        super(navigator);
    }

    public void dispose() {
        if (clipboard != null) {
            clipboard.dispose();
            clipboard = null;
        }
        super.dispose();
    }

    public void fillContextMenu(IMenuManager menu) {
        IStructuredSelection selection = (IStructuredSelection) getContext()
                .getSelection();

        boolean anyResourceSelected = !selection.isEmpty()
                && ResourceSelectionUtil.allResourcesAreOfType(selection,
                        IResource.PROJECT);
                        //| IResource.FOLDER | IResource.FILE);

//        copyAction.selectionChanged(selection);
//        menu.add(copyAction);
//        pasteAction.selectionChanged(selection);
//        menu.add(pasteAction);

        if (anyResourceSelected) {
            deleteAction.selectionChanged(selection);
            menu.add(deleteAction);
//            moveAction.selectionChanged(selection);
//            menu.add(moveAction);
        }
    }

    public void fillActionBars(IActionBars actionBars) {
        textActionHandler = new TextActionHandler(actionBars); // hooks handlers
//        textActionHandler.setCopyAction(copyAction);
//        textActionHandler.setPasteAction(pasteAction);
        textActionHandler.setDeleteAction(deleteAction);

//        actionBars.setGlobalActionHandler(ActionFactory.MOVE.getId(),
//                moveAction);
    }

    /**
     * Handles a key pressed event by invoking the appropriate action.
     */
    public void handleKeyPressed(KeyEvent event) {
        if (event.character == SWT.DEL && event.stateMask == 0) {
            if (deleteAction.isEnabled()) {
                deleteAction.run();
            }

            // Swallow the event.
            event.doit = false;

        } else if (event.keyCode == SWT.F2 && event.stateMask == 0) {

            // Swallow the event.
            event.doit = false;
        }
    }

    protected void makeActions() {
        TreeViewer treeViewer = navigator.getViewer();
        Shell shell = navigator.getSite().getShell();
        clipboard = new Clipboard(shell.getDisplay());

//        pasteAction = new PasteAction(shell, clipboard);
        ISharedImages images = PlatformUI.getWorkbench().getSharedImages();
//        pasteAction.setDisabledImageDescriptor(images
//                .getImageDescriptor(ISharedImages.IMG_TOOL_PASTE_DISABLED));
//        pasteAction.setImageDescriptor(images
//                .getImageDescriptor(ISharedImages.IMG_TOOL_PASTE));
//
//        copyAction = new CopyAction(shell, clipboard, pasteAction);
//        copyAction.setDisabledImageDescriptor(images
//                .getImageDescriptor(ISharedImages.IMG_TOOL_COPY_DISABLED));
//        copyAction.setImageDescriptor(images
//                .getImageDescriptor(ISharedImages.IMG_TOOL_COPY));

//        moveAction = new ResourceNavigatorMoveAction(shell, treeViewer);

        deleteAction = new DeleteResourceAction(shell);
        deleteAction.setDisabledImageDescriptor(images
                .getImageDescriptor(ISharedImages.IMG_TOOL_DELETE_DISABLED));
        deleteAction.setImageDescriptor(images
                .getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
    }

    public void updateActionBars() {
        IStructuredSelection selection = (IStructuredSelection) getContext()
                .getSelection();

//        copyAction.selectionChanged(selection);
//        pasteAction.selectionChanged(selection);
        deleteAction.selectionChanged(selection);
//        moveAction.selectionChanged(selection);
    }

}
