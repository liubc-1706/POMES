package newpmbe.rcp;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class QuickSearchPanel extends Composite {
	
	private Label label = null;
	private Text findText = null;
	private Image nextImage = null;
	private Image previousImage = null;
	private Image closeImage = null;

	static public interface ICloseable{
		public void closed();
	}

	public QuickSearchPanel(Composite parent, final ICloseable closeable) {
		super(parent, SWT.NONE);
		initialize(closeable);


	}
	public void initialize(final ICloseable closeable)
	{
		GridLayout gridLayout = new GridLayout();
		gridLayout.marginHeight = 3;  // Generated
		gridLayout.numColumns = 4;  // Generated
		gridLayout.marginWidth = 5;  // Generated
		this.setLayout(gridLayout);  // Generated
		
		label = new Label(this, SWT.NONE);
		label.setText(Messages.getString("QuickSearchPanel.0"));  // Generated //$NON-NLS-1$
		label.setLayoutData(new GridData(GridData.BEGINNING));
		
		findText = new Text(this, SWT.SINGLE|SWT.BORDER);
		findText.setLayoutData(new GridData(GridData.BEGINNING));
		
		ToolBar tb = new ToolBar(this, SWT.FLAT | SWT.RIGHT);
		tb.setLayoutData(new GridData(GridData.BEGINNING));
		ToolItem nextItem = new ToolItem(tb, SWT.PUSH);
		nextItem.setText(Messages.getString("QuickSearchPanel.1")); //$NON-NLS-1$
		nextImage = AbstractUIPlugin.imageDescriptorFromPlugin(
				Application.PLUGIN_ID, "/icons/next.ico").createImage(); //$NON-NLS-1$
		previousImage = AbstractUIPlugin.imageDescriptorFromPlugin(
				Application.PLUGIN_ID, "/icons/previous.ico").createImage(); //$NON-NLS-1$
		closeImage = AbstractUIPlugin.imageDescriptorFromPlugin(
				Application.PLUGIN_ID, "/icons/close.ico").createImage(); //$NON-NLS-1$
		nextItem.setImage(nextImage);
		ToolItem previousItem = new ToolItem(tb, SWT.PUSH);
		previousItem.setText(Messages.getString("QuickSearchPanel.2")); //$NON-NLS-1$
		previousItem.setImage(previousImage);
		
		ToolBar closeTb = new ToolBar(this, SWT.FLAT);
		ToolItem closeItem = new ToolItem(closeTb, SWT.PUSH);
		closeItem.setImage(closeImage);
		closeItem.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				if (closeable != null)
					closeable.closed();
			}
		});
		closeTb.setLayoutData(new GridData(GridData.END, GridData.BEGINNING,
				true, false));
		findText.setFocus();
	}
	public boolean setFocus() {
		super.setFocus();
		return findText.setFocus();
	}

	public void dispose() {
		nextImage.dispose();
		previousImage.dispose();
		closeImage.dispose();
	}

}
