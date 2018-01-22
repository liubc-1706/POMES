package newpmbe.rcp;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class IDEWorkbenchMessages {
	private static final String BUNDLE_NAME = "newpmbe.rcp.messages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private IDEWorkbenchMessages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
