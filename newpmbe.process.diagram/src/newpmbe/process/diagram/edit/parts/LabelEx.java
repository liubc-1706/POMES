package newpmbe.process.diagram.edit.parts;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.text.BlockFlow;
import org.eclipse.draw2d.text.FlowPage;
import org.eclipse.draw2d.text.ParagraphTextLayout;
import org.eclipse.draw2d.text.TextFlow;
//import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel.IconInfo;
import org.eclipse.swt.graphics.Image;

class LabelEx extends FlowPage {

    private TextFlow contents;
    private Image icon;
    private Dimension iconSize = new Dimension(0, 0);
	private static int FLAG_UNDERLINED = MAX_FLAG << 3;

	private static int FLAG_STRIKEDTHROUGH = MAX_FLAG << 4;
//	private IconInfo iconInfo;
    public LabelEx() {
        this("");
    }

    public LabelEx(String text) {
        contents = new TextFlow();
        contents.setLayoutManager(new ParagraphTextLayout(contents, ParagraphTextLayout.WORD_WRAP_SOFT));
        contents.setText(text);
        add(contents);
    }

    public void setText(String text) {
        contents.setText(text);
    }

    public String getText() {
        return contents.getText();
    }
    public void setIcon(Image image) {
    	if (icon == image) 
    		return;
    	icon = image;
    	//Call repaint, in case the image dimensions are the same.
    	repaint();
    	if (icon == null)
    		setIconDimension(new Dimension());
    	else
    		setIconDimension(new Dimension(image));
    }


	public void setTextUnderline(boolean b) {
		if (isTextUnderlined() == b)
			return;
		setFlag(FLAG_UNDERLINED, b);
		repaint();
	}
	public void setTextStrikeThrough(boolean b) {
		if (isTextStrikedThrough() == b)
			return;
		setFlag(FLAG_STRIKEDTHROUGH, b);
		repaint();
	}
	public boolean isTextUnderlined() {
		return (flags & FLAG_UNDERLINED) != 0;
	}
	public boolean isTextStrikedThrough() {
		return (flags & FLAG_STRIKEDTHROUGH) != 0;
	}
	public Image getIcon() {
		return icon;
	}
	public void setIconDimension(Dimension d) {
		if (d.equals(iconSize)) 
			return;
		iconSize = d;
		revalidate();
	}
}