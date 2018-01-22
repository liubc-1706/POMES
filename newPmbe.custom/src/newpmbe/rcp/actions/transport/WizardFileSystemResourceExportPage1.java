package newpmbe.rcp.actions.transport;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardExportResourcesPage;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;


/**
 *	Page 1 of the base resource export-to-file-system Wizard
 */
public class WizardFileSystemResourceExportPage1 extends
        WizardExportResourcesPage implements Listener {
    // widgets
    private Combo destinationNameField;

    private Button destinationBrowseButton;

    protected Button overwriteExistingFilesCheckbox;

    protected Button createDirectoryStructureButton;


    // dialog store id constants
    private static final String STORE_DESTINATION_NAMES_ID = "WizardFileSystemResourceExportPage1.STORE_DESTINATION_NAMES_ID"; //$NON-NLS-1$

    private static final String STORE_OVERWRITE_EXISTING_FILES_ID = "WizardFileSystemResourceExportPage1.STORE_OVERWRITE_EXISTING_FILES_ID"; //$NON-NLS-1$

    private static final String STORE_CREATE_STRUCTURE_ID = "WizardFileSystemResourceExportPage1.STORE_CREATE_STRUCTURE_ID"; //$NON-NLS-1$

    //messages
    private static final String SELECT_DESTINATION_MESSAGE = "�ļ�ϵͳ";

    private static final String SELECT_DESTINATION_TITLE = "����Դ���뱾���ļ�ϵͳ��";

    
    private final static String SELECT_TYPES_TITLE = "ѡ������...";
    

    private final static String SELECT_ALL_TITLE = "ѡ������";

    private final static String DESELECT_ALL_TITLE = "ȡ������";

    private IStructuredSelection initialResourceSelection;
    /**
     *	Create an instance of this class
     */
    protected WizardFileSystemResourceExportPage1(String name,
            IStructuredSelection selection) {
        super(name, selection);
        this.initialResourceSelection = selection;
    }

    /**
     * Create an instance of this class.
     *
     * @param selection the selection
     */
    public WizardFileSystemResourceExportPage1(IStructuredSelection selection) {
        this("fileSystemExportPage1", selection); //$NON-NLS-1$
        setTitle("�ļ�ϵͳ");
        setDescription("����Դ�����������ļ�ϵͳ��");
    }

    /**
     *	Add the passed value to self's destination widget's history
     *
     *	@param value java.lang.String
     */
    protected void addDestinationItem(String value) {
        destinationNameField.add(value);
    }

    /** (non-Javadoc)
     * Method declared on IDialogPage.
     */
    public void createControl(Composite parent) {

            initializeDialogUnits(parent);

            Composite composite = new Composite(parent, SWT.NULL);
            composite.setLayout(new GridLayout());
            composite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
                    | GridData.HORIZONTAL_ALIGN_FILL));
            composite.setFont(parent.getFont());

            createResourcesGroup(composite);
            createButtons2Group(composite);

            createDestinationGroup(composite);

            createOptionsGroup(composite);

            restoreResourceSpecificationWidgetValues(); // ie.- local
            restoreWidgetValues(); // ie.- subclass hook
            if (initialResourceSelection != null) {
    			setupBasedOnInitialSelections();
    		}

            updateWidgetEnablements();
            setPageComplete(determinePageCompletion());
            setErrorMessage(null);	// should not initially have error message
            
            setControl(composite);
        giveFocusToDestination();
//        PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(),
//                IDataTransferHelpContextIds.FILE_SYSTEM_EXPORT_WIZARD_PAGE);
    }
    
    /**
     *	Create the options specification widgets.
     *
     *	@param parent org.eclipse.swt.widgets.Composite
     */
    protected void createOptionsGroup(Composite parent) {
        // options group
        Group optionsGroup = new Group(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        optionsGroup.setLayout(layout);
        optionsGroup.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL
                | GridData.GRAB_HORIZONTAL));
        optionsGroup.setText("ѡ��");
        optionsGroup.setFont(parent.getFont());

        createOptionsGroupButtons(optionsGroup);

    }

    /**
     * Creates the buttons for selecting specific types or selecting all or none of the
     * elements.
     *
     * @param parent the parent control
     */
    protected final void createButtons2Group(Composite parent) {

//        Font font = parent.getFont();
//
//        // top level group
//        Composite buttonComposite = new Composite(parent, SWT.NONE);
//        buttonComposite.setFont(parent.getFont());
//
//        GridLayout layout = new GridLayout();
//        layout.numColumns = 3;
//        layout.makeColumnsEqualWidth = true;
//        buttonComposite.setLayout(layout);
//        buttonComposite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
//                | GridData.HORIZONTAL_ALIGN_FILL));
//
//        // types edit button
//        Button selectTypesButton = createButton(buttonComposite,
//                IDialogConstants.SELECT_TYPES_ID, SELECT_TYPES_TITLE, false);
//
//        SelectionListener listener = new SelectionAdapter() {
//            public void widgetSelected(SelectionEvent e) {
//                handleTypesEditButtonPressed();
//            }
//        };
//        selectTypesButton.addSelectionListener(listener);
//        selectTypesButton.setFont(font);
//        setButtonLayoutData(selectTypesButton);
//
//        Button selectButton = createButton(buttonComposite,
//                IDialogConstants.SELECT_ALL_ID, SELECT_ALL_TITLE, false);
//
//        listener = new SelectionAdapter() {
//            public void widgetSelected(SelectionEvent e) {
//                resourceGroup.setAllSelections(true);
//            }
//        };
//        selectButton.addSelectionListener(listener);
//        selectButton.setFont(font);
//        setButtonLayoutData(selectButton);
//
//        Button deselectButton = createButton(buttonComposite,
//                IDialogConstants.DESELECT_ALL_ID, DESELECT_ALL_TITLE, false);
//
//        listener = new SelectionAdapter() {
//            public void widgetSelected(SelectionEvent e) {
//                resourceGroup.setAllSelections(false);
//            }
//        };
//        deselectButton.addSelectionListener(listener);
//        deselectButton.setFont(font);
//        setButtonLayoutData(deselectButton);

    }
    /**
     *	Create the export destination specification widgets
     *
     *	@param parent org.eclipse.swt.widgets.Composite
     */
    protected void createDestinationGroup(Composite parent) {

        Font font = parent.getFont();
        // destination specification group
        Composite destinationSelectionGroup = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 3;
        destinationSelectionGroup.setLayout(layout);
        destinationSelectionGroup.setLayoutData(new GridData(
                GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_FILL));
        destinationSelectionGroup.setFont(font);

        Label destinationLabel = new Label(destinationSelectionGroup, SWT.NONE);
        destinationLabel.setText(getDestinationLabel());
        destinationLabel.setFont(font);

        // destination name entry field
        destinationNameField = new Combo(destinationSelectionGroup, SWT.SINGLE
                | SWT.BORDER);
        destinationNameField.addListener(SWT.Modify, this);
        destinationNameField.addListener(SWT.Selection, this);
        GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL
                | GridData.GRAB_HORIZONTAL);
        data.widthHint = SIZING_TEXT_FIELD_WIDTH;
        destinationNameField.setLayoutData(data);
        destinationNameField.setFont(font);

        // destination browse button
        destinationBrowseButton = new Button(destinationSelectionGroup,
                SWT.PUSH);
        destinationBrowseButton.setText("���...");
        destinationBrowseButton.addListener(SWT.Selection, this);
        destinationBrowseButton.setFont(font);
        setButtonLayoutData(destinationBrowseButton);

        new Label(parent, SWT.NONE); // vertical spacer
    }

    /**
     * Create the buttons in the options group.
     */

    protected void createOptionsGroupButtons(Group optionsGroup) {

        Font font = optionsGroup.getFont();
        createOverwriteExisting(optionsGroup, font);

        createDirectoryStructureOptions(optionsGroup, font);
    }

    /**
     * Create the buttons for the group that determine if the entire or
     * selected directory structure should be created.
     * @param optionsGroup
     * @param font
     */
    protected void createDirectoryStructureOptions(Composite optionsGroup, Font font) {
        // create directory structure radios
        createDirectoryStructureButton = new Button(optionsGroup, SWT.RADIO
                | SWT.LEFT);
        createDirectoryStructureButton.setText("�����ļ���Ŀ¼�ṹ");
        createDirectoryStructureButton.setSelection(true);
        createDirectoryStructureButton.setFont(font);
        createDirectoryStructureButton.setEnabled(false);

        // create directory structure radios
    }

    /**
     * Create the button for checking if we should ask if we are going to
     * overwrite existing files.
     * @param optionsGroup
     * @param font
     */
    protected void createOverwriteExisting(Group optionsGroup, Font font) {
        // overwrite... checkbox
        overwriteExistingFilesCheckbox = new Button(optionsGroup, SWT.CHECK
                | SWT.LEFT);
        overwriteExistingFilesCheckbox.setText("���������ļ�ʱ����������");
        overwriteExistingFilesCheckbox.setFont(font);
    }

    /**
     * Attempts to ensure that the specified directory exists on the local file system.
     * Answers a boolean indicating success.
     *
     * @return boolean
     * @param directory java.io.File
     */
    protected boolean ensureDirectoryExists(File directory) {
        if (!directory.exists()) {
            if (!queryYesNoQuestion("Ŀ���ļ��в����ڣ��Ƿ�Ҫ������")) {
				return false;
			}

            if (!directory.mkdirs()) {
                displayErrorDialog("Ŀ���ļ����޷�������");
                giveFocusToDestination();
                return false;
            }
        }

        return true;
    }

    /**
     *	If the target for export does not exist then attempt to create it.
     *	Answer a boolean indicating whether the target exists (ie.- if it
     *	either pre-existed or this method was able to create it)
     *
     *	@return boolean
     */
    protected boolean ensureTargetIsValid(File targetDirectory) {
        if (targetDirectory.exists() && !targetDirectory.isDirectory()) {
            displayErrorDialog("Ŀ���ļ�������Ϊ�ļ�����");
            giveFocusToDestination();
            return false;
        }

        return ensureDirectoryExists(targetDirectory);
    }

    /**
     *  Set up and execute the passed Operation.  Answer a boolean indicating success.
     *
     *  @return boolean
     */
    protected boolean executeExportOperation(FileSystemExportOperation op) {
        op.setCreateLeadupStructure(createDirectoryStructureButton
                .getSelection());
        op.setOverwriteFiles(overwriteExistingFilesCheckbox.getSelection());

        try {
            getContainer().run(true, true, op);
        } catch (InterruptedException e) {
            return false;
        } catch (InvocationTargetException e) {
            displayErrorDialog(e.getTargetException());
            return false;
        }

        IStatus status = op.getStatus();
        if (!status.isOK()) {
            ErrorDialog.openError(getContainer().getShell(),
                    "��������",
                    null, // no special message
                    status);
            return false;
        }

        return true;
    }

    /**
     *	The Finish button was pressed.  Try to do the required work now and answer
     *	a boolean indicating success.  If false is returned then the wizard will
     *	not close.
     *
     *	@return boolean
     */
    public boolean finish() {
        List resourcesToExport = getWhiteCheckedResources();
        if (!ensureTargetIsValid(new File(getDestinationValue()))) {
			return false;
		}


        //Save dirty editors if possible but do not stop if not all are saved
        saveDirtyEditors();
        // about to invoke the operation so save our state
        saveWidgetValues();

        return executeExportOperation(new FileSystemExportOperation(null,
                resourcesToExport, getDestinationValue(), this));
    }

    /**
     *	Answer the string to display in self as the destination type
     *
     *	@return java.lang.String
     */
    protected String getDestinationLabel() {
        return "Ŀ���ļ���";
    }

    /**
     *	Answer the contents of self's destination specification widget
     *
     *	@return java.lang.String
     */
    protected String getDestinationValue() {
        return destinationNameField.getText().trim();
    }

    /**
     *	Set the current input focus to self's destination entry field
     */
    protected void giveFocusToDestination() {
        destinationNameField.setFocus();
    }

    /**
     *	Open an appropriate destination browser so that the user can specify a source
     *	to import from
     */
    protected void handleDestinationBrowseButtonPressed() {
        DirectoryDialog dialog = new DirectoryDialog(getContainer().getShell(),
                SWT.SAVE);
        dialog.setMessage(SELECT_DESTINATION_MESSAGE);
        dialog.setText(SELECT_DESTINATION_TITLE);
        dialog.setFilterPath(getDestinationValue());
        String selectedDirectoryName = dialog.open();

        if (selectedDirectoryName != null) {
            setErrorMessage(null);
            setDestinationValue(selectedDirectoryName);
        }
    }

    /**
     * Handle all events and enablements for widgets in this page
     * @param e Event
     */
    public void handleEvent(Event e) {
        Widget source = e.widget;

        if (source == destinationBrowseButton) {
			handleDestinationBrowseButtonPressed();
		}

        updatePageCompletion();
    }

    /**
     *	Hook method for saving widget values for restoration by the next instance
     *	of this class.
     */
    protected void internalSaveWidgetValues() {
        // update directory names history
        IDialogSettings settings = getDialogSettings();
        if (settings != null) {
            String[] directoryNames = settings
                    .getArray(STORE_DESTINATION_NAMES_ID);
            if (directoryNames == null) {
				directoryNames = new String[0];
			}

            directoryNames = addToHistory(directoryNames, getDestinationValue());
            settings.put(STORE_DESTINATION_NAMES_ID, directoryNames);

            // options
            settings.put(STORE_OVERWRITE_EXISTING_FILES_ID,
                    overwriteExistingFilesCheckbox.getSelection());

            settings.put(STORE_CREATE_STRUCTURE_ID,
                    createDirectoryStructureButton.getSelection());

        }
    }

    /**
     *	Hook method for restoring widget values to the values that they held
     *	last time this wizard was used to completion.
     */
    protected void restoreWidgetValues() {
        IDialogSettings settings = getDialogSettings();
        if (settings != null) {
            String[] directoryNames = settings
                    .getArray(STORE_DESTINATION_NAMES_ID);
            if (directoryNames == null) {
				return; // ie.- no settings stored
			}

            // destination
            setDestinationValue(directoryNames[0]);
            for (int i = 0; i < directoryNames.length; i++) {
				addDestinationItem(directoryNames[i]);
			}

            // options
            overwriteExistingFilesCheckbox.setSelection(settings
                    .getBoolean(STORE_OVERWRITE_EXISTING_FILES_ID));

            boolean createDirectories = settings
                    .getBoolean(STORE_CREATE_STRUCTURE_ID);
            createDirectoryStructureButton.setSelection(createDirectories);
        }
    }

    /**
     *	Set the contents of the receivers destination specification widget to
     *	the passed value
     *
     */
    protected void setDestinationValue(String value) {
        destinationNameField.setText(value);
    }

    /**
     *	Answer a boolean indicating whether the receivers destination specification
     *	widgets currently all contain valid values.
     */
    protected boolean validateDestinationGroup() {
        String destinationValue = getDestinationValue();
        if (destinationValue.length() == 0) {
            setMessage(destinationEmptyMessage());
            return false;
        }

        String conflictingContainer = getConflictingContainerNameFor(destinationValue);
        if (conflictingContainer == null) {
			setErrorMessage(null);
		} else {
            setErrorMessage(NLS.bind("Ŀ���ļ�����{0}��������ͻ", conflictingContainer));
            giveFocusToDestination();
            return false;
        }

        return true;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.dialogs.WizardDataTransferPage#validateSourceGroup()
     */
    protected boolean validateSourceGroup() {
    	// there must be some resources selected for Export
    	boolean isValid = true;
        List resourcesToExport = getWhiteCheckedResources();
    	if (resourcesToExport.size() == 0){
    		setErrorMessage("û��Ҫ��������Դ");
            isValid =  false;
    	} else {
			setErrorMessage(null);
		}
		return super.validateSourceGroup() && isValid;
	}

	/**
     * Get the message used to denote an empty destination.
     */
    protected String destinationEmptyMessage() {
        return "������Ŀ���ļ���";
    }

    /**
     * Returns the name of a container with a location that encompasses targetDirectory.
     * Returns null if there is no conflict.
     * 
     * @param targetDirectory the path of the directory to check.
     * @return the conflicting container name or <code>null</code>
     */
    protected String getConflictingContainerNameFor(String targetDirectory) {

        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IPath testPath = new Path(targetDirectory);

        if (root.getLocation().isPrefixOf(testPath)) {
			return "������Ŀ¼";
		}

	    IContainer[] containers = root.findContainersForLocation(testPath);
	    if (containers.length > 0){
    		return containers[0].getName();
	    }

        return null;

    }

}

