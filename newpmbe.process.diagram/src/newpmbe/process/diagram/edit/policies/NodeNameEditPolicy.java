package newpmbe.process.diagram.edit.policies;
/* hzg
 * 结点名称不能被单独删除
 */
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ComponentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.GroupRequestViaKeyboard;
import org.eclipse.jface.dialogs.MessageDialog;

public class NodeNameEditPolicy extends ComponentEditPolicy {

	@Override
	protected Command getDeleteCommand(GroupRequest request) {
		// TODO Auto-generated method stub


			GroupRequest grpRequest = (GroupRequest)request;
			if (grpRequest instanceof GroupRequestViaKeyboard){
//				MessageDialog.openError(null, "操作错误", "不能单独删除结点的名称");
				return null;
			}
			return null;
		
	}
	
	

}