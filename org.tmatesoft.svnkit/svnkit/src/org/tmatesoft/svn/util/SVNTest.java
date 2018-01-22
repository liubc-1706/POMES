/*
 * ====================================================================
 * Copyright (c) 2004-2007 TMate Software Ltd.  All rights reserved.
 *
 * This software is licensed as described in the file COPYING, which
 * you should have received as part of this distribution.  The terms
 * are also available at http://svnkit.com/license.html.
 * If newer versions of this license are posted there, you may use a
 * newer version instead, at your option.
 * ====================================================================
 */
package org.tmatesoft.svn.util;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import org.tmatesoft.svn.core.SVNCommitInfo;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNProperty;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.internal.io.fs.FSRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.svn.SVNRepositoryFactoryImpl;
import org.tmatesoft.svn.core.internal.wc.SVNFileUtil;
import org.tmatesoft.svn.core.io.ISVNEditor;
import org.tmatesoft.svn.core.io.ISVNReporter;
import org.tmatesoft.svn.core.io.ISVNReporterBaton;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.io.SVNRepositoryFactory;
import org.tmatesoft.svn.core.io.diff.SVNDiffWindow;


/**
 * @version 1.0
 * @author  TMate Software Ltd.
 */
public class SVNTest {
    
    public static void main(String[] args) throws SVNException {
        SVNRepositoryFactoryImpl.setup();
        FSRepositoryFactory.setup();
    
        SVNURL url = SVNURL.parseURIEncoded("file:///c:/test/svn/repos/svn");
        SVNRepository repos = SVNRepositoryFactory.create(url);
        long latestRevision = repos.getLatestRevision();
        repos.closeSession();
        repos.diff(url, latestRevision, latestRevision, "", false, true, true, new ISVNReporterBaton() {
            public void report(ISVNReporter reporter) throws SVNException {
                reporter.setPath("", null, 0, false);
                reporter.finishReport();
            }
        }, new DiffEditor());

//        SVNDiffClient dc = SVNClientManager.newInstance().getDiffClient();
//        for (long i = latestRevision; i > 0; i--) {
//            final long rev = i - 1;
//            repos.diff(url, i, i, "", false, true, true, new ISVNReporterBaton() {
//                public void report(ISVNReporter reporter) throws SVNException {
//                    reporter.setPath("", null, rev, false);
//                    reporter.finishReport();
//                }
//            }, new DiffEditor());
//            dc.doDiff(url, SVNRevision.UNDEFINED, SVNRevision.create(i), SVNRevision.create(i - 1), true, false, SVNFileUtil.DUMMY_OUT);
//            System.out.println("DIFF: r" + i + ":" + rev + " done.");
//        }
        System.exit(0);
    }
    
    private static class DiffEditor implements ISVNEditor {

        public void abortEdit() throws SVNException {
        }

        public void absentDir(String path) throws SVNException {
        }

        public void absentFile(String path) throws SVNException {
        }

        public void addDir(String path, String copyFromPath, long copyFromRevision) throws SVNException {
        }

        public void addFile(String path, String copyFromPath, long copyFromRevision) throws SVNException {
        }

        public void changeDirProperty(String name, String value) throws SVNException {
        }

        public void changeFileProperty(String path, String name, String value) throws SVNException {
        }

        public void closeDir() throws SVNException {
        }

        public SVNCommitInfo closeEdit() throws SVNException {
            return null;
        }

        public void closeFile(String path, String textChecksum) throws SVNException {
        }

        public void deleteEntry(String path, long revision) throws SVNException {
        }

        public void openDir(String path, long revision) throws SVNException {
        }

        public void openFile(String path, long revision) throws SVNException {
        }

        public void openRoot(long revision) throws SVNException {
        }

        public void targetRevision(long revision) throws SVNException {
        }

        public void applyTextDelta(String path, String baseChecksum) throws SVNException {
        }

        public OutputStream textDeltaChunk(String path, SVNDiffWindow diffWindow) throws SVNException {
            return null;
        }

        public void textDeltaEnd(String path) throws SVNException {
        }
        
    }

    private static void filterLog() {
        File source1 = new File("c:/test/tcbug/bug.delta.log");
        File source2 = new File("c:/test/tcbug/good.delta.log");
        BufferedReader reader1 = null;
        BufferedReader reader2 = null;
        
        try {
            reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(source1)));
            reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(source2)));
            boolean started = false;
            long line = 0;
            while(true) {
                String line1 = reader1.readLine();
                String line2 = reader2.readLine();
                
                if (line1 == null) {
                    System.out.println("file (BUG) " + source1 + " finished at line " + line);
                    return;
                }
                if (line2 == null) {
                    System.out.println("file (GOOD) " + source2 + " finished at line " + line);
                    return;
                }
                if (!line1.equals(line2)) {
                    System.out.println("lines differs at " + line);
                    System.out.println("BUG: " + line1);
                    System.out.println("GOOD: " + line2);
                    System.out.println("next.BUG: " + reader1.readLine());
                    System.out.println("next.GOOD: " + reader2.readLine());
                    return;
                }
                line++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            SVNFileUtil.closeFile(reader1);
            SVNFileUtil.closeFile(reader2);
        }
        System.exit(0);
    }
    
    private static class Listener implements Runnable {

        public void run() {
            ServerSocket socket = null;
            try {
                socket = new ServerSocket(2222);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            while (true) {
                Socket client = null;
                try {
                    client = socket.accept();
                    if (client != null) {
                        new Thread(new Processor(client)).start();
                    }
                } catch (IOException e) {
                    if (client != null) {
                        try {
                            client.close();
                        } catch (IOException inner) {
                            inner.printStackTrace();
                        }
                    }
                    e.printStackTrace();
                    return;
                } 
            }
        }
        
    }

    private static class Processor implements Runnable {
        
        private Socket mySocket;

        public Processor(Socket socket) {
            mySocket = socket;
        }

        public void run() {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            try {
                // process socket in another thread....
                InputStream is = mySocket.getInputStream();
                byte[] buffer = new byte[2048];
                boolean hasEOL = false;
                while(!hasEOL) {
                    int read = is.read(buffer);
                    if (read <= 0) {
                        break;
                    }
                    for (int i = 0; i < read; i++) {
                        if (buffer[i] == '\n') {
                            hasEOL = true;
                            read = i;
                            break;
                        }
                    }
                    bos.write(buffer, 0, read);
                }
                
            } catch (IOException e) {
                e.printStackTrace();
                return;
            } finally {
                if (mySocket != null) {
                    try {
                        mySocket.close();
                    } catch (IOException e) {
                    }
                }
            }
            String commandLine = new String(bos.toByteArray());
            System.out.println("commandline: " + commandLine);
            if ("SHUTDOWN".equals(commandLine)) {
                System.exit(0);
            } else {
                
                // parse command line and run command.
                // set proper user.dir. 
                // run command line command.
            }
        }
        
    }
    
    private static class BaseExportEditor implements ISVNEditor {
        private File myCurrentDirectory;
        private Map myExternals;

        public BaseExportEditor() {
          myExternals = new HashMap();
        }

        public Map getCollectedExternals() {
          return myExternals;
        }

        public void changeDirProperty(String name, String value) throws SVNException {
          if (SVNProperty.EXTERNALS.equals(name)) {
            myExternals.put(myCurrentDirectory, value);
          }
        }

        public void openDir(String path, long revision) throws SVNException {
          myCurrentDirectory = new File(new File("."), path);
        }

        public void addDir(String path, String copyFromPath, long copyFromRevision) throws SVNException {
          myCurrentDirectory = new File(new File("."), path);
        }

        public void closeDir() throws SVNException {
          myCurrentDirectory = myCurrentDirectory.getParentFile();
        }


        public SVNCommitInfo closeEdit() throws SVNException {
          return null;
        }

        public void targetRevision(long revision) throws SVNException {
        }

        public void deleteEntry(String path, long revision) throws SVNException {
        }

        public void absentDir(String path) throws SVNException {
        }

        public void absentFile(String path) throws SVNException {
        }

        public void openFile(String path, long revision) throws SVNException {
        }

        public void abortEdit() throws SVNException {
        }

        public void openRoot(long revision) throws SVNException {
          addDir("", null, -1);
        }


        public void addFile(String path, String copyFromPath, long copyFromRevision) throws SVNException {

        }

        public void changeFileProperty(String path, String name, String value) throws SVNException {
        }

        public void closeFile(String path, String textChecksum) throws SVNException {
        }


        public void applyTextDelta(String string, String string1) throws SVNException {

        }

        public OutputStream textDeltaChunk(String string, SVNDiffWindow svnDiffWindow) throws SVNException {
          return null;
        }

        public void textDeltaEnd(String string) throws SVNException {
        }
      }

}
