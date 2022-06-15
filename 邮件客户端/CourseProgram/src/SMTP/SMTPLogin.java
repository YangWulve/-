package SMTP;

import java.io.*;

public class SMTPLogin extends SMTP {
	public static void sayAUTHLOGIN() {
		try {
			pw.println("auth login");
			String str=br.readLine();
			if(str.charAt(0)!='3'||str.charAt(1)!='3'||str.charAt(2)!='4') {
				System.out.println("Server: "+str);
				System.out.println("AUTH LOGIN ERROR...");
				socket.close();
				System.exit(0);
			}
			System.out.println("Server: "+str);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	public static int Login(String Username,String Password,int mailNo) {
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
		String UserMail=Username+mailpost;
		
//		System.out.println(UserMail);
//		System.out.println(Password);
		
		String UserBase64 = Base64Code.EncodeBase64(UserMail.getBytes());
		try {
			pw.println(UserBase64);
			String str=br.readLine();
			if(str.charAt(0)!='3'||str.charAt(1)!='3'||str.charAt(2)!='4') {
				System.out.println("Server: "+str);
				System.out.println("USERNAME ERROR...");
				return 0;
			}
			System.out.println("Server: "+str);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		String PwdBase64 = Base64Code.EncodeBase64(Password.getBytes());
		try {
			pw.println(PwdBase64);
			String str=br.readLine();
			if(str.charAt(0)!='2'||str.charAt(1)!='3'||str.charAt(2)!='5') {
				System.out.println("Server: "+str);
				System.out.println("PASSWORD ERROR...");
				return 0;
			}
			System.out.println("Server: "+str);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return 2;
	}
}
