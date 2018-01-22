package newpmbe.product.tableViewer;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

import vpml.processpackage.EMPProduct;

public class MySorter extends ViewerSorter {
	public static final int ID=1;
	public static final int NAME=2;
	private int sortType;
	
	private MySorter(){}
	public MySorter(int sortType){
		this.sortType=sortType;
	}
	
	
	public int compare(Viewer viewer, Object e1, Object e2) {
		// TODO Auto-generated method stub
		EMPProduct p1=(EMPProduct)e1;
		EMPProduct p2=(EMPProduct)e2;
		switch(sortType){
		case ID:{
			String id1=p1.getOID().toString();
			String id2=p2.getOID().toString();
			if(id1!=null&&id2!=null)
				return id1.compareTo(id2);
		}
		case -ID:{
			String id1=p1.getOID().toString();
			String id2=p2.getOID().toString();
			if(id1!=null&&id2!=null)
				return id2.compareTo(id1);
		}
		case NAME:{
			String name1=p1.getName();
			String name2=p2.getName();
			if(name1!=null&&name2!=null)
				return name1.compareTo(name2);
		}
		case -NAME:{
			String name1=p1.getName();
			String name2=p2.getName();
			if(name1!=null&&name2!=null)
				return name2.compareTo(name1);
		}
		}
		
		return 0;
	}
	
	
}
