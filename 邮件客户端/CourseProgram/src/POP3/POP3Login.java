package POP3;

import java.io.*;

public class POP3Login extends POP3 {
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
		
		try {
			pw.println("user "+UserMail);
			String str=br.readLine();
			if(str.charAt(0)!='+'||str.charAt(1)!='O'||str.charAt(2)!='K') {
				System.out.println("Server: "+str);
				System.out.println("USERNAME ERROR...");
				return 0;
			}
			System.out.println("Server: "+str);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		try {
			pw.println("pass "+Password);
			String str=br.readLine();
			if(str.charAt(0)!='+'||str.charAt(1)!='O'||str.charAt(2)!='K') {
				System.out.println("Server: "+str);
				System.out.println("PASSWORD ERROR...");
				return 0;
			}
			System.out.println("Server: "+str);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		return 1;
	}
}
