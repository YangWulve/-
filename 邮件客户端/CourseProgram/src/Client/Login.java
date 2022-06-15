package Client;

import java.io.*;

import POP3.POP3Login;
import SMTP.SMTPLogin;

public class Login extends mailClient {
	public static void login(int mailNo) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			
			int SMTPstatus=0;
			int POP3status=0;
			String Username="";
			String Userpwd="";
			do {
				new SMTPLogin();
				SMTPLogin.sayAUTHLOGIN();
				
//				System.out.println(status);
				
				System.out.print("请输入用户名（@前的部分）");
				Username=br.readLine();
				System.out.print("请输入授权码");
				Userpwd=br.readLine();
				
//				System.out.println(Username);
//				System.out.println(Userpwd);
			
				SMTPstatus=SMTPLogin.Login(Username, Userpwd, mailNo);
				POP3status=POP3Login.Login(Username, Userpwd, mailNo);
			
//				System.out.println(status);
				
				if(SMTPstatus==0||POP3status==0) {
					System.out.println("�û�����������󣡣������������룡");
				}
			}while(SMTPstatus==0||POP3status==0);
			
			user.setUsername(Username);
			user.setPassword(Userpwd);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
