/**
 * ===============================================
 * Copyright SEI of Beihang University. All rights
 * reserved.
 * created by zhang peng in 2007-7-21.
 * To apply methods for newpmbe project, so that it
 * can communicate with svn server using svn protocal.
 * ================================================
**/
package newpmbe.svn.wc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;

import org.eclipse.jface.dialogs.MessageDialog;
import org.tmatesoft.svn.core.SVNAuthenticationException;
import org.tmatesoft.svn.core.SVNCommitInfo;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.internal.io.dav.DAVRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.fs.FSRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.svn.SVNRepositoryFactoryImpl;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.wc.ISVNOptions;
import org.tmatesoft.svn.core.wc.SVNClientManager;
import org.tmatesoft.svn.core.wc.SVNRevision;
import org.tmatesoft.svn.core.wc.SVNUpdateClient;
import org.tmatesoft.svn.core.wc.SVNWCUtil;
import org.tmatesoft.svn.core.wc.ISVNEventHandler;


public class WorkingCopyManager {
/*	private static WorkingCopyFunctionality _instance;*/

	private String buildPath = "C:/";
	private String repositoryRoot;
	
	private String userName;
	private String passwd;
	
	private SVNURL repositoryRootURL;
	
	//本地工作根目录——将会在此检入检出工程
	private String localWorkRoot;
    private static SVNClientManager ourClientManager;
    private static ISVNEventHandler myCommitEventHandler;
    private static ISVNEventHandler myUpdateEventHandler;
    private static ISVNEventHandler myWCEventHandler;
    public WorkingCopyManager(){
    	readBasicInformation();
    	readLoginInformation();
        setupLibrary();
        init();
    }
    public WorkingCopyManager(String repository, String localRoot, String name, String password){
    	repositoryRoot = repository;
    	localWorkRoot = localRoot;
    	userName = name;
    	passwd = password;
        setupLibrary();
        init();
    }
    public WorkingCopyManager(String repository, String localRoot){
    	repositoryRoot = repository;
    	localWorkRoot = localRoot;
    	readLoginInformation();
        setupLibrary();
        init();

    }

    public void readBasicInformation(){
		try{    
		//从C:/SVNBasicInf.txt中读取配置信息
		FileReader configFileReader = new FileReader(buildPath+"SVNBasicInf.txt");
        BufferedReader configBufferReader = new BufferedReader(configFileReader);
        repositoryRoot = configBufferReader.readLine();
        localWorkRoot = configBufferReader.readLine();
		}catch(Exception e){
			e.printStackTrace();
		}
    }
    public void readLoginInformation(){
		try{    
            //从c:/SVNLoginInf.tx中读取登录信息
            FileReader loginFileReader =new FileReader(buildPath+"SVNLoginInf.txt");
            BufferedReader loginBufferReader =new BufferedReader(loginFileReader);
            
            //currently only support one login user
            //will be changed later
            String loginLine = loginBufferReader.readLine();
            String[] loginMessage = loginLine.split("=");
            userName = loginMessage[0];
            passwd = loginMessage[1];
			}catch(Exception e){
				e.printStackTrace();
			}
    }
    public void init(){
        try {
            repositoryRootURL = SVNURL.parseURIEncoded(repositoryRoot);
        } catch (SVNException e) {
            //
        }
        myCommitEventHandler = new CommitEventHandler();
        myUpdateEventHandler = new UpdateEventHandler();
        myWCEventHandler = new WCEventHandler();
        ISVNOptions options = SVNWCUtil.createDefaultOptions(true);
        ourClientManager = SVNClientManager.newInstance(options, userName, passwd);
        ourClientManager.getCommitClient().setEventHandler(myCommitEventHandler);
        ourClientManager.getUpdateClient().setEventHandler(myUpdateEventHandler);
        ourClientManager.getWCClient().setEventHandler(myWCEventHandler);
    }

    public boolean configConnection(){
/*        try {
            repositoryRootURL = SVNURL.parseURIEncoded(repositoryRoot);
        } catch (SVNException e) {
            //
        }*/

        //repository.getAuthenticationManager().getFirstAuthentication(kind, realm, url)
        SVNRepository repository;
		try {
			repository = ourClientManager.createRepository(repositoryRootURL, true);
			repository.testConnection();
		}catch(SVNAuthenticationException e){
            e.printStackTrace();
        	System.out.println("登录信息有误，无法建立连接");	
        	return false;
		}
		catch (SVNException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}
		//From now on, the connection could be built(informations are correct).
		return true;
    }
    /*
     * already seted up by the plug-in Activator
     * 
     * Initializes the library to work with a org.tmatesoft.svn.examples.repository via 
     * different protocols.
     */
    public void setupLibrary() {
        /*
         * For using over http:// and https://
         */
        DAVRepositoryFactory.setup();
        /*
         * For using over svn:// and svn+xxx://
         */
        SVNRepositoryFactoryImpl.setup();
        
        /*
         * For using over file:///
         */
        FSRepositoryFactory.setup();
    }

    /*
     * Creates a new version controlled directory (doesn't create any intermediate
     * directories) right in a org.tmatesoft.svn.examples.repository. Like 'svn mkdir URL -m "some comment"' 
     * command. It's done by invoking 
     * 
     * SVNCommitClient.doMkDir(SVNURL[] urls, String commitMessage) 
     * 
     * which takes the following parameters:
     * 
     * urls - an array of URLs that are to be created;
     * 
     * commitMessage - a commit log message since a URL-based directory creation is 
     * immediately committed to a org.tmatesoft.svn.examples.repository.
     */
    public SVNCommitInfo makeDirectory(SVNURL url, String commitMessage) throws SVNException{
        /*
         * Returns SVNCommitInfo containing information on the new revision committed 
         * (revision number, etc.) 
         */
        if(!configConnection()){
            System.out.println("连接不正确！！！");
            return null;
        }
        return ourClientManager.getCommitClient().doMkDir(new SVNURL[]{url}, commitMessage);
    }
    
    /*
     * Imports an unversioned directory into a org.tmatesoft.svn.examples.repository location denoted by a
     * destination URL (all necessary parent non-existent paths will be created 
     * automatically). This operation commits the org.tmatesoft.svn.examples.repository to a new revision. 
     * Like 'svn import PATH URL (-N) -m "some comment"' command. It's done by 
     * invoking 
     * 
     * SVNCommitClient.doImport(File path, SVNURL dstURL, String commitMessage, boolean recursive) 
     * 
     * which takes the following parameters:
     * 
     * path - a local unversioned directory or singal file that will be imported into a 
     * org.tmatesoft.svn.examples.repository;
     * 
     * dstURL - a org.tmatesoft.svn.examples.repository location where the local unversioned directory/file will be 
     * imported into; this URL path may contain non-existent parent paths that will be 
     * created by the org.tmatesoft.svn.examples.repository server;
     * 
     * commitMessage - a commit log message since the new directory/file are immediately
     * created in the org.tmatesoft.svn.examples.repository;
     * 
     * recursive - if true and path parameter corresponds to a directory then the directory
     * will be added with all its child subdirictories, otherwise the operation will cover
     * only the directory itself (only those files which are located in the directory).  
     */
    public SVNCommitInfo importDirectory(String localPath, SVNURL dstURL, String commitMessage, boolean isRecursive) throws SVNException{
        /*
         * Returns SVNCommitInfo containing information on the new revision committed 
         * (revision number, etc.) 
         */
        if(!configConnection()){
            System.out.println("连接不正确！！！");
            return null;
        }
    	File file = new File(localPath);
        if(!file.exists()){
            return null;
        }
        return ourClientManager.getCommitClient().doImport(file, dstURL, commitMessage, isRecursive);
        
    }

    public SVNCommitInfo commit(String wcPath, boolean keepLocks, String commitMessage)
            throws SVNException {
        if(!configConnection()){
            System.out.println("连接不正确！！！");
            return null;
        }
    	File file = new File(wcPath);

        return ourClientManager.getCommitClient().doCommit(new File[] { file }, keepLocks,
                commitMessage, false, true);
    }
    /*
     * added by zhangpeng
     * commit the changed files to svn server.
     */
    public SVNCommitInfo commitFiles(File[] files, boolean keepLocks, String commitMessage)
    		throws SVNException {
        if(!configConnection()){
            System.out.println("连接不正确！！！");
            return null;
        }
        return ourClientManager.getCommitClient().doCommit(files, keepLocks,
                commitMessage, false, true);
    }
    public SVNCommitInfo importUnVersionedFiles(File file, SVNURL dstURL, String commitMessage, boolean recursive)
        throws SVNException {
        if(!configConnection()){
            System.out.println("连接不正确！！！");
            return null;
        }
        return ourClientManager.getCommitClient().doImport(file, dstURL, commitMessage, true);
    }

    public long checkout(SVNURL url,
            SVNRevision revision, String destPath, boolean isRecursive)
            throws SVNException {
        if(!configConnection()){
            System.out.println("连接不正确！！！");
            return -1;
        }
	    File file=new File(localWorkRoot + "/"+destPath);
	    if(file.exists()){
	    	deleteFiles(file);
	    }
        SVNUpdateClient updateClient = ourClientManager.getUpdateClient();
        /*
         * sets externals not to be ignored during the checkout
         */
        updateClient.setIgnoreExternals(false);
        /*
         * returns the number of the revision at which the working copy is 
         */
        return updateClient.doCheckout(url, file, revision, revision, isRecursive);
    }
    

    public long update(String wcPath,
            SVNRevision updateToRevision, boolean isRecursive)
            throws SVNException {
        if(!configConnection()){
            System.out.println("连接不正确！！！");
            return -1;
        }
    	File file = new File(wcPath);

        SVNUpdateClient updateClient = ourClientManager.getUpdateClient();
        /*
         * sets externals not to be ignored during the update
         */
        updateClient.setIgnoreExternals(false);
        /*
         * returns the number of the revision wcPath was updated to
         */
        return updateClient.doUpdate(file, updateToRevision, isRecursive);
    }
    

    public long switchToURL(File wcPath,
            SVNURL url, SVNRevision updateToRevision, boolean isRecursive)
            throws SVNException {
        if(!configConnection()){
            System.out.println("连接不正确！！！");
            return -1;
        }
        SVNUpdateClient updateClient = ourClientManager.getUpdateClient();
        /*
         * sets externals not to be ignored during the switch
         */
        updateClient.setIgnoreExternals(false);
        /*
         * returns the number of the revision wcPath was updated to
         */
        return updateClient.doSwitch(wcPath, url, updateToRevision,
                isRecursive);
    }

    public void showStatus(File wcPath, boolean isRecursive, boolean isRemote, boolean isReportAll,
            boolean isIncludeIgnored, boolean isCollectParentExternals)
            throws SVNException {
        /*
         * StatusHandler displays status information for each entry in the console (in the 
         * manner of the native Subversion command line client)
         */
        if(!configConnection()){
            System.out.println("连接不正确！！！");
            return;
        }
        ourClientManager.getStatusClient().doStatus(wcPath, isRecursive, isRemote, isReportAll,
                isIncludeIgnored, isCollectParentExternals, new StatusHandler(isRemote));
    }

    public void showInfo(File wcPath, SVNRevision revision, boolean isRecursive) throws SVNException {
        /*
         * InfoHandler displays information for each entry in the console (in the manner of
         * the native Subversion command line client)
         */
        ourClientManager.getWCClient().doInfo(wcPath, revision, isRecursive, new InfoHandler());
    }
    
    public void addEntry(File wcPath) throws SVNException {
        ourClientManager.getWCClient().doAdd(wcPath, false, false, false, true);
    }
    
    public void lock(File wcPath, boolean isStealLock, String lockComment) throws SVNException {
        ourClientManager.getWCClient().doLock(new File[] { wcPath }, isStealLock, lockComment);
    }

    public void delete(File wcPath, boolean force) throws SVNException {
        ourClientManager.getWCClient().doDelete(wcPath, force, false);
    }
	protected void deleteFiles(File file){
		if(file.isFile()){
//			if(file.getName().equals(".project"))
//				return;
//			else
				file.delete();
		}
		else if(file.isDirectory()){
			File[] files=file.listFiles();
			for(int i=0;i<files.length;i++){
				deleteFiles(files[i]);
			}
            file.delete();
		}
	}
    
    public SVNCommitInfo copy(SVNURL srcURL, SVNURL dstURL,
            boolean isMove, String commitMessage) throws SVNException {
        
        return ourClientManager.getCopyClient().doCopy(srcURL,  SVNRevision.HEAD,
                dstURL, isMove, commitMessage);
    }
    
    /*
     * Displays error information and exits. 
     */
    public void error(String message, Exception e){
        System.err.println(message+(e!=null ? ": "+e.getMessage() : ""));
        System.exit(1);
    }
    public SVNURL getRepositoryRootURL(){
    	return repositoryRootURL;
    }
    public SVNClientManager getClientManager(){
    	return ourClientManager;
    }
    public String getLocalWorkRoot(){
    	return localWorkRoot;
    }
    public String getUserName(){
    	return userName;
    }
}