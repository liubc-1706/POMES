package process.diagram.actions;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;



public class CloseProcessModelAction implements IWorkbenchWindowActionDelegate {

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub

	}

	public void run(IAction action) {
		// TODO Auto-generated method stub
		MyFrame myFrame=new MyFrame();	
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}
	//打开模型选择界面
	public class MyList extends JPanel{
		JList list;
		DefaultListModel model;
	
		IWorkspace workSpace=ResourcesPlugin.getWorkspace();
		IProject[] projects = workSpace.getRoot().getProjects();
		public MyList(){
			setLayout(new BorderLayout());
			model=new DefaultListModel();
			list=new JList(model);
		    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
			JScrollPane pane=new JScrollPane(list);
			
			
			
			for(int i=0, j;i<projects.length;i++){
				if(projects[i].getName().lastIndexOf(".process")!=-1)
				model.addElement(projects[i].getName().toString());	
			}
			
			add(pane,BorderLayout.NORTH);
			
		}
	}
	public class MyFrame{
		JFrame frame =new JFrame("关闭过程模型");
		JButton closeButton=new JButton("关闭");
		JButton cancelButton=new JButton("取消");
		JPanel panel1=new JPanel();
		JLabel l=new JLabel("         ");
		MyList myList=new MyList();
		public MyFrame(){
			panel1.add(closeButton);
			panel1.add(l);
			panel1.add(cancelButton);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.getContentPane().add(myList,BorderLayout.NORTH);
			frame.getContentPane().add(panel1,BorderLayout.SOUTH);
			frame.setSize(250,230);
			frame.setVisible(true);
			frame.setAlwaysOnTop(true);
			frame.setLocationRelativeTo(null);
			frame.setResizable(false);
			
			closeButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int i=myList.list.getSelectedIndex();
					String str=myList.model.getElementAt(i).toString();
					myList.model.removeElementAt(i);
					for(i=0;i<myList.projects.length;i++){
						if(myList.projects[i].getName().equals(str)){
							try {
								myList.projects[i].delete(false, true, null);
							} catch (CoreException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							break;
						}
					}
				}
			});
			
			cancelButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					frame.dispose();
				}
			});
		}
		
	}
}
