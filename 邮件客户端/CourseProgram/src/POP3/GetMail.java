package POP3;

import java.io.IOException;

public class GetMail extends POP3 {
	public String getMailCont() {
		String message="";
		String line=null;
		try {
			line=br.readLine();
			
			while(!".".equalsIgnoreCase(line)) {
				message=message+line+"\n";
//				System.out.println("** "+line+" **");
				line=br.readLine();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return message;
	}
	
	public void getMail(int MailNo) throws IOException, InterruptedException {
		String result=null;
		pw.println("retr "+MailNo);
		result=br.readLine();
		
		System.out.println("第"+MailNo+"封邮件");
		System.out.println(getMailCont());
	}
}
