package newpmbe.validator;

import java.util.List;


public class Problems {	
	private String type;	//�������ͣ�����/����
	private List problemList;		//�����б�
	private int number=0;		//������������ʼΪ0
	
	public static final String TYPE_ACTIVITY="ACTIVITY";   
	public static final String TYPE_PRODUCT="PRODUCT";
	public static final String TYPE_CONDITIONAL="CONDITIONAL";
	public static final String TYPE_RESOURCE="RESOURCE";
	public static final String TYPE_OTHER="OTHER";

	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List getProblemList() {
		return problemList;
	}
	public void setProblemList(List problems) {
		this.problemList = problems;
		this.number=problems.size();
	}
	public int getNumber() {
		return number;
	}
	
	
	/*public void setNumber(int number) {
		this.number = number;
	}*/
	
	
	
	

}
