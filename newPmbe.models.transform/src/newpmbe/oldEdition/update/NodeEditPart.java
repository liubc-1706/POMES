package newpmbe.oldEdition.update;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;

public class NodeEditPart {
	private String path;
	private GraphicalEditPart editPart;
	
	public NodeEditPart(GraphicalEditPart editPart,String path){
		this.path=path;
		this.editPart=editPart;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public GraphicalEditPart getEditPart() {
		return editPart;
	}

	public void setEditPart(GraphicalEditPart editPart) {
		this.editPart = editPart;
	}

	
	
	
}
