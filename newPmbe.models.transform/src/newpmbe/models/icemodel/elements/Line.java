package newpmbe.models.icemodel.elements;

import org.jdom.Element;

public class Line {
	public Element line;
	public Element source;
	protected Element sFlag;
	protected Element target;
	protected Element tFlag;
	protected Element SourceAnchor;
	protected Element TargetAnchor;
	protected Element MiddleCaption;
	protected Element MiddleCaptionDistance;
	protected Element SourceCaption;
	protected Element SourceCaptionDistance;
	protected Element TartgetCaption;
	protected Element TargetCaptionDistance;
	protected Element SourceCaptionDisplayDirection;
	protected Element TargetCaptionDisplayDirection;
	protected Element CaptionFont;
	protected Element CaptionColor;
	protected Element SourceFigure;
	protected Element TargetFigure;
	protected Element SourceFigureSize;
	protected Element TargetFigureSize;
	protected Element LineType;
	protected Element Color;
	protected Element Style;
	protected Element Width;
	protected Element DisplayDirection;
	protected Element Route;
	protected Element BendPoints ;
	
	public Line(){
		line=new Element("Line");
		source=new Element("Source");
		sFlag=new Element("sFlag");
		target=new Element("Target");
		tFlag=new Element("tFlag");
		SourceAnchor=new Element("SourceAnchor");
		TargetAnchor=new Element("TargetAnchor");
		MiddleCaption=new Element("MiddleCaption");
		MiddleCaptionDistance=new Element("MiddleCaptionDistance");
		SourceCaption=new Element("SourceCaption");
		SourceCaptionDistance=new Element("SourceCaptionDistance");
		TartgetCaption=new Element("TartgetCaption");
		TargetCaptionDistance=new Element("TargetCaptionDistance");
		SourceCaptionDisplayDirection=new Element("SourceCaptionDisplayDirection");
		TargetCaptionDisplayDirection=new Element("TargetCaptionDisplayDirection");
		CaptionFont=new Element("CaptionFont");
		CaptionColor=new Element("CaptionColor");
		SourceFigure=new Element("SourceFigure");
		TargetFigure=new Element("TargetFigure");
		SourceFigureSize=new Element("SourceFigureSize");
		TargetFigureSize=new Element("TargetFigureSize");
		LineType=new Element("LineType");
		Color=new Element("Color");
		Style=new Element("Style");
		Width=new Element("Width");
		DisplayDirection=new Element("DisplayDirection");
		Route=new Element("Route");
		BendPoints=new Element("BendPoints");
		line=new Element("Line");
	}
	
	public Element getXMLElement(){
		line=addContents(line);
		return line;
	}
	
	public Element addContents(Element element){
		element.addContent(source);
		element.addContent(sFlag);
		element.addContent(target);
		element.addContent(tFlag);
		element.addContent(SourceAnchor);
		element.addContent(TargetAnchor);
		element.addContent(MiddleCaption);
		element.addContent(MiddleCaptionDistance);
		element.addContent(SourceCaption);
		element.addContent(SourceCaptionDistance);
		element.addContent(TartgetCaption);
		element.addContent(TargetCaptionDistance);
		element.addContent(SourceCaptionDisplayDirection);
		element.addContent(TargetCaptionDisplayDirection);
		element.addContent(CaptionFont);
		element.addContent(CaptionColor);
		element.addContent(SourceFigure);
		element.addContent(TargetFigure);
		element.addContent(SourceFigureSize);
		element.addContent(TargetFigureSize);
		element.addContent(LineType);
		element.addContent(Color);
		element.addContent(Style);
		element.addContent(Width);
		element.addContent(DisplayDirection);
		element.addContent(Route);
		element.addContent(BendPoints);
		
		return element;
	} 
	
	public void setSource(String ssource_type){
		source.setText(ssource_type);
	}
	
	public Element getSource(){
		return source;
	}
	
	public void setsFlag(String sflag){
		sFlag.setText(sflag);
	}
	
	public Element getsFlag(){
		return sFlag;
	}
	
	
	public Element getTarget(){
		return target;
	}
	
	public void settFlag(String tflag){
		tFlag.setText(tflag);
	}
	
	public Element gettFlag(){
		return tFlag;
	}
	
	public void setSourceAnchor(String sourceanchor){
		SourceAnchor.setText(sourceanchor);
	}
	
	public Element getSourceAnchor(){
		return SourceAnchor;
	}
	
	public void setTargetAnchor(String targetanchor){
		TargetAnchor.setText(targetanchor);
	}
	
	public Element getTargetAnchor(){
		return TargetAnchor;
	}
	
	public void setMiddleCaption(String middlecaption){
		MiddleCaption.setText(middlecaption);
	}
	
	public Element getMiddleCaption(){
		return MiddleCaption;
	}
	
	public void setMiddleCaptionDistance(String middlecaptiondistance){
		MiddleCaptionDistance.setText(middlecaptiondistance);
	}
	
	public Element getMiddleCaptionDistance(){
		return MiddleCaptionDistance;
	}
	
	public void setSourceCaption(String sourcecaption){
		SourceCaption.setText(sourcecaption);
	}
	
	public Element getSourceCaption(){
		return SourceCaption;
	}
	
	public void setSourceCaptionDistance(String sourcecaptiondistance){
		SourceCaptionDistance.setText(sourcecaptiondistance);
	}
	
	public Element getSourceCaptionDistance(){
		return SourceCaptionDistance;
	}
	
	public void setTartgetCaption(String tartgetcaption){
		TartgetCaption.setText(tartgetcaption);
	}
	
	public Element getTartgetCaption(){
		return TartgetCaption;
	}
	
	public void setTargetCaptionDistance(String targetcaptiondistance){
		TargetCaptionDistance.setText(targetcaptiondistance);
	}
	
	public Element getTargetCaptionDistance(){
		return TargetCaptionDistance;
	}
	
	public void setSourceCaptionDisplayDirection(String sourcecaptiondisplaydirection){
		SourceCaptionDisplayDirection.setText(sourcecaptiondisplaydirection);
	}
	
	public Element getSourceCaptionDisplayDirection(){
		return SourceCaptionDisplayDirection;
	}
	
	public void setTargetCaptionDisplayDirection(String targetcaptiondisplaydirection){
		TargetCaptionDisplayDirection.setText(targetcaptiondisplaydirection);
	}
	
	public Element getTargetCaptionDisplayDirection(){
		return TargetCaptionDisplayDirection;
	}
	
	public void setCaptionFont(String captionfont){
		CaptionFont.setText(captionfont);
	}
	
	public Element getCaptionFont(){
		return CaptionFont;
	}
	
	public void setCaptionColor(String captioncolor){
		CaptionColor.setText(captioncolor);
	}
	
	public Element getCaptionColor(){
		return CaptionColor;
	}
	
	public void setSourceFigure(String sourcefigure){
		SourceFigure.setText(sourcefigure);
	}
	
	public Element getSourceFigure(){
		return SourceFigure;
	}
	
	public void setTargetFigure(String targetfigure){
		TargetFigure.setText(targetfigure);
	}
	
	public Element getTargetFigure(){
		return TargetFigure;
	}
	
	public void setSourceFigureSize(String sourcefigureSize){
		SourceFigureSize.setText(sourcefigureSize);
	}
	
	public Element getSourceFigureSize(){
		return SourceFigureSize;
	}
	
	public void setTargetFigureSize(String targetfigureSize){
		TargetFigureSize.setText(targetfigureSize);
	}
	
	public Element getTargetFigureSize(){
		return TargetFigureSize;
	}
	
	public void setLineType(String linetype){
		LineType.setText(linetype);
	}
	
	public Element getLineType(){
		return LineType;
	}
	
	public void setColor(String color){
		Color.setText(color);
	}
	
	public Element getColor(){
		return Color;
	}
	
	public void setStyle(String style){
		Style.setText(style);
	}
	
	public Element getStyle(){
		return Style;
	}
	
	public void setWidth(String width){
		Width.setText(width);
	}
	
	public Element getWidth(){
		return Width;
	}
	
	public void setDisplayDirection(String displaydirection){
		DisplayDirection.setText(displaydirection);
	}
	
	public Element getDisplayDirection(){
		return DisplayDirection;
	}
	
	public void setRoute(String route){
		Route.setText(route);
	}
	
	public Element getRoute(){
		return Route;
	}
	
	public void setBendPoints(String bendpoints){
		BendPoints.setText(bendpoints);
	}
	
	public Element getBendPoints(){
		return BendPoints;
	}
}
