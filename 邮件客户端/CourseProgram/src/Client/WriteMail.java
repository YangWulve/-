package Client;

import java.io.*;

public class WriteMail extends mailClient {
	public static void writeMail(User user,int mailNo) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String mailpost="";
		switch(mailNo) {
		case 1:
			mailpost+="@126.com";
			break;
		case 2:
			mailpost+="@163.com";
			break;
		case 3:
			mailpost+="@qq.com";
			break;
		}
		String UserMail=user.getUsername()+mailpost;
		
		sendMail.setAddresser(UserMail);
		try {
			System.out.print("收件人邮箱：");
			String addressee=br.readLine();
			sendMail.setAddressee(addressee);
			System.out.print("邮件标题：");
			String mailtitle=br.readLine();
			sendMail.setMailtitle(mailtitle);
			System.out.print("邮件正文：");
			String mailtext=br.readLine();
			sendMail.setMailtext(mailtext);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
