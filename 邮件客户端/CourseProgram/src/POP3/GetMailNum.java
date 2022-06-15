package POP3;

import java.io.IOException;
import java.util.StringTokenizer;

public class GetMailNum extends POP3 {
	public static int getMailNum() throws IOException {
		String result=null;
		String line=null;
		int mailNum=0;
		
		pw.println("stat");
		line=br.readLine();
		
		StringTokenizer st=new StringTokenizer(line," ");
		
		result=st.nextToken();
		
		if(st.hasMoreTokens()) {
			mailNum=Integer.parseInt(st.nextToken());
		}else {
			mailNum=0;
		}
		
		return mailNum;
	}
}
