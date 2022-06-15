package POP3;

import java.io.IOException;

public class DelMail extends POP3 {
	public void delMail(int MailNo) throws IOException {
		String str=null;
		pw.println("dele "+MailNo);
		str=br.readLine();
		if(str.charAt(0)!='+'||str.charAt(1)!='O'||str.charAt(2)!='K') {
			System.out.println("Server: "+str);
			System.out.println("DELETE ERROR...");
		}
		System.out.println("Server: "+str);
	}
}
