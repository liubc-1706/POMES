package newpmbe.models.transform;

import java.util.ArrayList;
import java.util.List;

public class ProcessRegister {
	List processList;
	
	public ProcessRegister(){
		processList=new ArrayList();
	}
	public void addProcess(ProcessEntity process){
		processList.add(process);
	}
	
	public void removeProcess(ProcessEntity process){
		processList.remove(process);
	}
	
	public List getProcessList(){
		return processList;
	}
}
