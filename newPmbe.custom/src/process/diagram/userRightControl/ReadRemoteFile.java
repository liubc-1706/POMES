package process.diagram.userRightControl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadRemoteFile {
	public static void main(String[] args) throws Exception {
		URL urlfile = new URL("http://192.168.16.34/xuys/index_.html"); //$NON-NLS-1$
		BufferedReader in = new BufferedReader(new InputStreamReader(urlfile
				.openStream()));
		String content = ""; //$NON-NLS-1$
		String inputLine = in.readLine();
		while (inputLine != null) {
			content += inputLine;
			inputLine = in.readLine();
		}
		System.out.println(content);
		in.close();
	}
}