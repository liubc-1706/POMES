package newpmbe.rcp;

import java.io.*;
import java.util.*;

import org.eclipse.swt.widgets.*;
import org.eclipse.ui.forms.widgets.*;
import org.eclipse.ui.intro.config.*;
import org.w3c.dom.*;

//

public class DynamicContentProvider implements IIntroXHTMLContentProvider {


    public void init(IIntroContentProviderSite site) {
    }


    public void createContent(String id, PrintWriter out) {
    }

    public void createContent(String id, Composite parent, FormToolkit toolkit) {
    }

    private String getCurrentTimeString() {
        StringBuffer content = new StringBuffer(
                Messages.getString("DynamicContentProvider.0")); //$NON-NLS-1$
        content.append(Messages.getString("DynamicContentProvider.1")); //$NON-NLS-1$
        content.append(new Date(System.currentTimeMillis()));
        return content.toString();
    }

    public void createContent(String id, Element parent) {
        Document dom = parent.getOwnerDocument();
        Element para = dom.createElement("p"); //$NON-NLS-1$
        para.setAttribute("id", "someDynamicContentId"); //$NON-NLS-1$ //$NON-NLS-2$
        para.appendChild(dom.createTextNode(getCurrentTimeString()));
        parent.appendChild(para);

    }


    public void dispose() {

    }



}
