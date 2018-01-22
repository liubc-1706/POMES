package newpmbe.rcp;

import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;

import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ContributionItemFactory;
import org.eclipse.ui.actions.NewWizardMenu;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.actions.QuickMenuAction;
import org.eclipse.swt.SWT;



/**
 * An action bar advisor is responsible for creating, adding, and disposing of
 * the actions added to a workbench window. Each window will be populated with
 * new actions.
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	// Actions - important to allocate these only in makeActions, and then use
	// them
	// in the fill methods. This ensures that the actions aren't recreated
	// when fillActionBars is called with FILL_PROXY.	
	
//	private NewWizardMenu newWizardMenu;
//    private QuickMenuAction newQuickMenu;
    private IWorkbenchWindow window;
	private IWorkbenchAction saveAction;
    private IWorkbenchAction introAction;
    
    private  IWorkbenchAction action1;
	
//	private IWorkbenchAction newAction;
	private IWorkbenchAction exitAction;
//	private IWorkbenchAction undoAction;
//	private IWorkbenchAction redoAction;
	private IWorkbenchAction cutAction;
	private IWorkbenchAction copyAction;
	private IWorkbenchAction pasteAction;
	private IWorkbenchAction deleteAction;
	private IWorkbenchAction selectAllAction;
//	private IWorkbenchAction closePerspectiveAction;
//	private IWorkbenchAction editActionSetAction;

//	private IWorkbenchAction preferenceAction;
//	private IWorkbenchAction openNewWindowAction;
	private IWorkbenchAction helpContentsAction;
	private IWorkbenchAction aboutAction;
//	private MenuManager perspectiveMenu;
//	private IContributionItem perspectiveList;
//	private MenuManager viewMenu;
//	private IContributionItem viewList;
//	private IContributionItem openWindowsItem;
//	private final ApplicationWorkbenchWindowAdvisor windowAdvisor;
//	private Action toggleToolbar;
//	private Action toggleQuickSearch;

	public ApplicationActionBarAdvisor(
			ApplicationWorkbenchWindowAdvisor windowAdvisor,
			IActionBarConfigurer configurer) {
		super(configurer);
//		this.windowAdvisor = windowAdvisor;
	}
	

	protected void makeActions(final IWorkbenchWindow window) {
		// Creates the actions and registers them.
		// Registering is needed to ensure that key bindings work.
		// The corresponding commands keybindings are defined in the plugin.xml
		// file.
		// Registering also provides automatic disposal of the actions when
		// the window is closed.
		this.window = window;
		
		//added by zhangpeng
        final String newQuickMenuId = "org.eclipse.ui.file.newQuickMenu"; //$NON-NLS-1$
//        newQuickMenu = new QuickMenuAction(newQuickMenuId) {
//            protected void fillMenu(IMenuManager menu) {
//                menu.add(new NewWizardMenu(window));
//            }
//        };
//        newQuickMenu.setText("新建");
//        register(newQuickMenu);
        
        saveAction = ActionFactory.SAVE.create(window);
        saveAction.setText("保存");
        saveAction.setToolTipText("保存");
        register(saveAction);
        
		introAction = ActionFactory.INTRO.create(window);
		introAction.setText("欢迎");
		introAction.setToolTipText("欢迎");
		register(introAction);
        //end added by zhangpeng
		
        
//		newAction = ActionFactory.NEW.create(window);
//		newAction.setText("新建");
//		register(newAction);
		
		
		exitAction = ActionFactory.QUIT.create(window);
		exitAction.setText("退出");
		exitAction.setToolTipText("退出");
		register(exitAction);
		
//		undoAction = ActionFactory.UNDO.create(window);
//		undoAction.setText("撤销");
//		register(undoAction);
//		
//		redoAction = ActionFactory.REDO.create(window);
//		redoAction.setText("重做");
//		register(redoAction);
		
		cutAction = ActionFactory.CUT.create(window);
		cutAction.setText("剪切");
		cutAction.setToolTipText("剪切");
		register(cutAction);
		
		copyAction = ActionFactory.COPY.create(window);
		copyAction.setText("复制");
		copyAction.setToolTipText("复制");
		register(copyAction);
		
		pasteAction = ActionFactory.PASTE.create(window);
		pasteAction.setText("粘贴");
		pasteAction.setToolTipText("粘贴");
		register(pasteAction);
		
		deleteAction = ActionFactory.DELETE.create(window);
		deleteAction.setText("删除");
		deleteAction.setToolTipText("删除");
		register(deleteAction);
		
		selectAllAction = ActionFactory.SELECT_ALL.create(window);
		selectAllAction.setText("全部选择");
		selectAllAction.setToolTipText("全部选择");
		register(selectAllAction);
		
//        editActionSetAction = ActionFactory.EDIT_ACTION_SETS.create(window);
//        editActionSetAction.setText("定制透视图");
//        register(editActionSetAction);
//		
//		closePerspectiveAction = ActionFactory.CLOSE_PERSPECTIVE.create(window);
//		closePerspectiveAction.setText("关闭透视图");
//		register(closePerspectiveAction);
		
		
//		preferenceAction = ActionFactory.PREFERENCES.create(window);
//		preferenceAction.setText("外观");
//		register(preferenceAction);
		
//		openNewWindowAction = ActionFactory.OPEN_NEW_WINDOW.create(window);
//		openNewWindowAction.setText("打开新窗口");
//		register(openNewWindowAction);
		
//		helpContentsAction = ActionFactory.HELP_CONTENTS.create(window);
//		helpContentsAction.setText("帮助内容");
//		helpContentsAction.setToolTipText("帮助内容");
//		register(helpContentsAction);
		helpContentsAction = new ActionHelp(window);
		helpContentsAction.setText("帮助内容");
		helpContentsAction.setId("topxebec");
//		helpContentsAction.setImageDescriptor(Activator.getImageDescriptor("D:/workspace/newPmbe.custom/lib/doc/javadoc/info.png"));
		register(helpContentsAction);
		
		aboutAction = ActionFactory.ABOUT.create(window);
		aboutAction.setText("关于...");
		aboutAction.setToolTipText("关于本产品");
		register(aboutAction);
		
		action1  =   new  ActionAbout(window);
		action1.setText( "关于..." );
		action1.setId( " cn.blogjava.youxia.actions.action1 " );
		
		
//        perspectiveMenu = new MenuManager(newpmbe.rcp.IDEWorkbenchMessages.getString("ApplicationActionBarAdvisor.0"),"openPerspective"); //$NON-NLS-1$ //$NON-NLS-2$
//		perspectiveList =ContributionItemFactory.PERSPECTIVES_SHORTLIST.create(window);
//        perspectiveMenu.add(perspectiveList);
//        
//        viewMenu = new MenuManager(newpmbe.rcp.IDEWorkbenchMessages.getString("ApplicationActionBarAdvisor.2")); //$NON-NLS-1$
//        viewList = ContributionItemFactory.VIEWS_SHORTLIST.create(window);
//        viewMenu.add(viewList);
//        
//        openWindowsItem = ContributionItemFactory.OPEN_WINDOWS.create(window);
        
//		toggleQuickSearch = new Action(newpmbe.rcp.IDEWorkbenchMessages.getString("ApplicationActionBarAdvisor.3"), IAction.AS_CHECK_BOX) { //$NON-NLS-1$
//			public void run() {
//				windowAdvisor.setShowSearchPanel(!windowAdvisor.getShowSearchPanel());
//				updateEnablements();
//			}
//		};
		
//        toggleToolbar = new Action(newpmbe.rcp.IDEWorkbenchMessages.getString("ApplicationActionBarAdvisor.4"), IAction.AS_CHECK_BOX) { //$NON-NLS-1$
//            public void run() {
//				windowAdvisor.setShowToolbar(!windowAdvisor.getShowToolbar());
//				updateEnablements();
//            }
//        };
        
        
	}

	protected void fillMenuBar(IMenuManager menuBar) {
		menuBar.add(createFileMenu());
		menuBar.add(createEditMenu());
//        IMenuManager viewMenu = new MenuManager(newpmbe.rcp.IDEWorkbenchMessages.getString("ApplicationActionBarAdvisor.5"), "view"); //$NON-NLS-1$ //$NON-NLS-2$
//        viewMenu.add(toggleToolbar);
//        viewMenu.add(toggleQuickSearch);

//		menuBar.add(viewMenu);
		menuBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		
//		menuBar.add(createWindowMenu());
		menuBar.add(createHelpMenu());
	}

	private MenuManager createFileMenu() {
		//added by zhangpeng
        MenuManager menu = new MenuManager(newpmbe.rcp.IDEWorkbenchMessages.getString("ApplicationActionBarAdvisor.10"), IWorkbenchActionConstants.M_FILE); //$NON-NLS-1$
        menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_START));
/*        {
            // create the New submenu, using the same id for it as the New action
            String newText = IDEWorkbenchMessages.Workbench_new;
            String newId = ActionFactory.NEW.getId();
            MenuManager newMenu = new MenuManager(newText, newId) {
                public String getMenuText() {
                    String result = super.getMenuText();
                    if (newQuickMenu == null) {
						return result;
					}
                    String shortCut = newQuickMenu.getShortCutString();
                    if (shortCut == null) {
						return result;
					}
                    return result + "\t" + shortCut; //$NON-NLS-1$
                }
            };
            newMenu.add(new Separator(newId));
            this.newWizardMenu = new NewWizardMenu(getWindow());
            newMenu.add(this.newWizardMenu);
            newMenu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
            menu.add(newMenu);
        }*/

        menu.add(new GroupMarker(IWorkbenchActionConstants.NEW_EXT));
        menu.add(new Separator());
        
        menu.add(new GroupMarker(IWorkbenchActionConstants.OPEN_EXT));
        menu.add(new  GroupMarker(IWorkbenchActionConstants.CLOSE_EXT));
        menu.add(new Separator());
        
        menu.add(saveAction);
        menu.add(new Separator());
        
        menu.add(exitAction);
/*        menu.add(new Separator());
		menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_END));*/
		return menu;
		//end added by zhangpeng
	}
	private MenuManager createEditMenu() {
        MenuManager menu = new MenuManager(newpmbe.rcp.IDEWorkbenchMessages.getString("ApplicationActionBarAdvisor.7"), //$NON-NLS-1$
                IWorkbenchActionConstants.M_EDIT);
        menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_START));

//        menu.add(undoAction);
////        menu.add(redoAction);
//        menu.add(new GroupMarker(IWorkbenchActionConstants.UNDO_EXT));
//        menu.add(new Separator());

        menu.add(cutAction);
        menu.add(copyAction);
        menu.add(pasteAction);
        menu.add(new GroupMarker(IWorkbenchActionConstants.CUT_EXT));
        menu.add(new Separator());

        menu.add(deleteAction);
        menu.add(selectAllAction);
        menu.add(new Separator());

        menu.add(new GroupMarker(IWorkbenchActionConstants.ADD_EXT));

        menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_END));
        menu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
        return menu;
    }

//    private MenuManager createWindowMenu() {
//        MenuManager menu = new MenuManager(newpmbe.rcp.IDEWorkbenchMessages.getString("ApplicationActionBarAdvisor.8"), //$NON-NLS-1$
//                IWorkbenchActionConstants.M_WINDOW);

//        menu.add(openNewWindowAction);
        
//        menu.add(new Separator());
//        menu.add(perspectiveMenu);

//        menu.add(viewMenu);
//       
//        menu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
//        menu.add(editActionSetAction);
//        menu.add(closePerspectiveAction);
//        
//        menu.add(preferenceAction);
//
//        menu.add(openWindowsItem);

//        return menu;
//    }

    private MenuManager createHelpMenu() {
        MenuManager menu = new MenuManager(newpmbe.rcp.IDEWorkbenchMessages.getString("ApplicationActionBarAdvisor.9"), //$NON-NLS-1$
                IWorkbenchActionConstants.M_HELP);
        // Welcome or intro page would go here
        menu.add(helpContentsAction);
        // Tips and tricks page would go here
        menu.add(new GroupMarker(IWorkbenchActionConstants.HELP_START));
        menu.add(new GroupMarker(IWorkbenchActionConstants.HELP_END));
        menu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
        // About should always be at the bottom
        // To use the real RCP About dialog uncomment these lines
        menu.add(new Separator());
		// Help
		menu.add(introAction);
		menu.add(new Separator());
//        menu.add(aboutAction);

        menu.add(action1);
        
        return menu;
    }

    protected void fillCoolBar(ICoolBarManager coolBar) {
  	  IToolBarManager toolbar = new ToolBarManager(SWT.FLAT | SWT.RIGHT);
  	  coolBar.add(toolbar);
  	  toolbar.add(new Separator());
//  	  toolbar.add(newAction);
//  	  toolbar.add(undoAction);
//  	  toolbar.add(redoAction);
  	  toolbar.add(new Separator());
  	  toolbar.add(saveAction);
  	  toolbar.add(new Separator());
  	  toolbar.add(new GroupMarker(IWorkbenchActionConstants.TOOLBAR_FILE));
  	  toolbar.add(cutAction);
  	  toolbar.add(copyAction);
  	  toolbar.add(pasteAction);
  	  toolbar.add(deleteAction);
  	  toolbar.add(new GroupMarker(IWorkbenchActionConstants.TOOLBAR_HELP));
  	  toolbar.add(new Separator());
  	  
  	  toolbar.add(helpContentsAction);
  	  toolbar.add(introAction);
//  	  toolbar.add(aboutAction);

/*  	  toolbar.add(new Separator());
  	  toolbar.add(selectAllAction);*/
  	}
    public void updateEnablements()
    {
//    	toggleToolbar.setChecked(windowAdvisor.getShowToolbar());
/*    	toggleQuickSearch.setChecked(windowAdvisor.getShowSearchPanel());    */
    	}

    public IWorkbenchWindow getWindow()
    {
    	return window;
    }
}
