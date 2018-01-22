package newpmbe.models.transform;

import java.util.ArrayList;
import java.util.List;
/**
 * process entity, note all the process elements but flows
 * @author fan
 *
 */
public class ProcessEntity {
	private String path;
	private String processID;
	
	private List PMBEDocumentList;	//to easily get the product identified by the dataflow through index
	private List PMBEArtifactList;
	private List PMBEOtherList;
	private List PMBEProductPackageList;
	private List PMBENormalActList;
	private List PMBEBatchActList;
	private List PMBECompActList;
	private List PMBEBasicRSTypeList;
	private List PMBERoleList;
	private List PMBERSGroupList;	//?
	private List PMBETeamList;	//?
	private List PMBEInAndList;
	private List PMBEInOrList;
	private List PMBEOutAndList;
	private List PMBEOutOrList;
	private List PMBEClockList;
	
	public ProcessEntity(){
		PMBEDocumentList=new ArrayList();	//to easily get the product identified by the dataflow through index
		PMBEArtifactList=new ArrayList();
		PMBEOtherList=new ArrayList();
		PMBEProductPackageList=new ArrayList();
		PMBENormalActList=new ArrayList();
		PMBEBatchActList=new ArrayList();
		PMBECompActList=new ArrayList();
		PMBEBasicRSTypeList=new ArrayList();
		PMBERoleList=new ArrayList();
		PMBERSGroupList=new ArrayList();	//?
		PMBETeamList=new ArrayList();	//?
		PMBEInAndList=new ArrayList();
		PMBEInOrList=new ArrayList();
		PMBEOutAndList=new ArrayList();
		PMBEOutOrList=new ArrayList();
		PMBEClockList=new ArrayList();
	}
	
	

	public String getProcessID() {
		return processID;
	}



	public void setProcessID(String processID) {
		this.processID = processID;
	}



	public String getPath() {
		return path;
	}



	public void setPath(String path) {
		this.path = path;
	}



	public List getPMBEDocumentList() {
		return PMBEDocumentList;
	}

	public void setPMBEDocumentList(List documentList) {
		PMBEDocumentList = documentList;
	}

	public List getPMBEArtifactList() {
		return PMBEArtifactList;
	}

	public void setPMBEArtifactList(List artifactList) {
		PMBEArtifactList = artifactList;
	}

	public List getPMBEOtherList() {
		return PMBEOtherList;
	}

	public void setPMBEOtherList(List otherList) {
		PMBEOtherList = otherList;
	}

	public List getPMBEProductPackageList() {
		return PMBEProductPackageList;
	}

	public void setPMBEProductPackageList(List productPackageList) {
		PMBEProductPackageList = productPackageList;
	}

	public List getPMBENormalActList() {
		return PMBENormalActList;
	}

	public void setPMBENormalActList(List normalActList) {
		PMBENormalActList = normalActList;
	}

	public List getPMBEBatchActList() {
		return PMBEBatchActList;
	}

	public void setPMBEBatchActList(List batchActList) {
		PMBEBatchActList = batchActList;
	}

	public List getPMBECompActList() {
		return PMBECompActList;
	}

	public void setPMBECompActList(List compActList) {
		PMBECompActList = compActList;
	}

	public List getPMBEBasicRSTypeList() {
		return PMBEBasicRSTypeList;
	}

	public void setPMBEBasicRSTypeList(List basicRSTypeList) {
		PMBEBasicRSTypeList = basicRSTypeList;
	}

	public List getPMBERoleList() {
		return PMBERoleList;
	}

	public void setPMBERoleList(List roleList) {
		PMBERoleList = roleList;
	}

	public List getPMBERSGroupList() {
		return PMBERSGroupList;
	}

	public void setPMBERSGroupList(List groupList) {
		PMBERSGroupList = groupList;
	}

	public List getPMBETeamList() {
		return PMBETeamList;
	}

	public void setPMBETeamList(List teamList) {
		PMBETeamList = teamList;
	}

	public List getPMBEInAndList() {
		return PMBEInAndList;
	}

	public void setPMBEInAndList(List inAndList) {
		PMBEInAndList = inAndList;
	}

	public List getPMBEInOrList() {
		return PMBEInOrList;
	}

	public void setPMBEInOrList(List inOrList) {
		PMBEInOrList = inOrList;
	}

	public List getPMBEOutAndList() {
		return PMBEOutAndList;
	}

	public void setPMBEOutAndList(List outAndList) {
		PMBEOutAndList = outAndList;
	}

	public List getPMBEOutOrList() {
		return PMBEOutOrList;
	}

	public void setPMBEOutOrList(List outOrList) {
		PMBEOutOrList = outOrList;
	}

	public List getPMBEClockList() {
		return PMBEClockList;
	}

	public void setPMBEClockList(List clockList) {
		PMBEClockList = clockList;
	}
	
	
	
}
