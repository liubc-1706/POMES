package newpmbe.process.diagram.edit.policies;
/* hzg
 * ������Ʋ��ܱ�����ɾ��
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
//				MessageDialog.openError(null, "��������", "���ܵ���ɾ����������");
				return null;
			}
			return null;
		
	}
	
	

}