package SMTP;

import java.io.*;
import java.net.*;


import Client.Mail;

public class SendMail extends SMTP {
	public static int sendmail(Mail mail) {
		
		pw.println("mail from:<"+mail.getAddresser()+">");
		try {
			String str=br.readLine();
			if(str.charAt(0)!='2'||str.charAt(1)!='5'||str.charAt(2)!='0') {
				System.out.println("Server: "+str);
				System.out.println("MAILFROM ERROR...");
				return 0;
			}
			System.out.println("Server: "+str);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		pw.println("rcpt to:<"+mail.getAddressee()+">");
		try {
			String str=br.readLine();
			if(str.charAt(0)!='2'||str.charAt(1)!='5'||str.charAt(2)!='0') {
				System.out.println("Server: "+str);
				System.out.println("RCPTTO ERROR...");
				return 0;
			}
			System.out.println("Server: "+str);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		pw.println("data");
		try {
			String str=br.readLine();
			if(str.charAt(0)!='3'||str.charAt(1)!='5'||str.charAt(2)!='4') {
				System.out.println("Server: "+str);
				System.out.println("DATA ERROR...");
				return 0;
			}
			System.out.println("Server: "+str);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		pw.println("subject: "+mail.getMailtitle());
		pw.println("from: "+mail.getAddresser());
		pw.println("to: "+mail.getAddressee());
		pw.println("Content-Type: text/plain;charset=\"gb2312\"");
		pw.println();
		pw.println("text: "+mail.getMailtext());
		pw.println(".");
		pw.print("");
		try {
			String str=br.readLine();
			if(str.charAt(0)!='2'||str.charAt(1)!='5'||str.charAt(2)!='0') {
				System.out.println("Server: "+str);
				System.out.println("CONTEXT ERROR...");
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
