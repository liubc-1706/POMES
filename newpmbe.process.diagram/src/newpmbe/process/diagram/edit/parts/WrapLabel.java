package newpmbe.process.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontMetrics;

public class WrapLabel extends Label {
	private String sourceText;
	private boolean deal=false;
	private int margin=20;
	/**
	*
	*/
	public WrapLabel() {
	super();
	this.sourceText="";
	// TODO Auto-generated constructor stub
	}

	/**
	* @param s
	*/
	public WrapLabel(String s) {
	this.sourceText=s;
	// TODO Auto-generated constructor stub
	}
	public WrapLabel(String s,int margin){
	this.sourceText=s;
	this.margin=margin;
	}
	/* (non-Javadoc)
	* @see org.eclipse.draw2d.Label#setText(java.lang.String)
	*/
	public void setText(String s) {
	this.sourceText=s;
	deal=false;
	}

	/* (non-Javadoc)
	* @see org.eclipse.draw2d.Label#paintFigure(org.eclipse.draw2d.Graphics)
	*/
	protected void paintFigure(Graphics graphics) {
	modifyText();
	super.paintFigure(graphics);
	}
	/* (non-Javadoc)
	* @see org.eclipse.draw2d.Figure#setBounds(org.eclipse.draw2d.geometry.Rectangle)
	*/
	public void setBounds(Rectangle rect) {
	deal=false;
	super.setBounds(rect);
	}
	private void modifyText(){
	if(deal) return;
	Font f=getFont();
	if(f != null){
	int width = getBounds().width-margin;
	StringBuffer buf=new StringBuffer();
	if(width>5){
	String str=sourceText;
	while(str.length()>0){
	int sub=getLargestSubstringConfinedTo(str,f,width);
	if(sub==0 && str.length()>0) break;
	if(sub< str.length()){
	buf.append(str.substring(0,sub));
	buf.append("\n");
	str=str.substring(sub);
	}
	else{
	buf.append(str);
	str="";
	}
	}
	}
	deal=true;
	super.setText(buf.toString());
	}
	}
	private int getLargestSubstringConfinedTo(String s, Font f, int availableWidth) {
	FontMetrics metrics = FigureUtilities.getFontMetrics(f);
	int min, max;
	float avg = metrics.getAverageCharWidth();
	min = 0;
	max = s.length() + 1;

	//The size of the current guess
	int guess = 0,
	guessSize = 0;
	while ((max - min) > 1) {
	//Pick a new guess size
	// New guess is the last guess plus the missing width in pixels
	// divided by the average character size in pixels
	guess = guess + (int)((availableWidth - guessSize) / avg);

	if (guess >= max) guess = max - 1;
	if (guess <= min) guess = min + 1;

	//Measure the current guess
	guessSize = FigureUtilities.getTextExtents(s.substring(0, guess), f).width;

	if (guessSize < availableWidth)
	//We did not use the available width
	min = guess;
	else
	//We exceeded the available width
	max = guess;
	}
	return min;
	}
	}
