package Client;

import java.io.*;

import SMTP.*;

import POP3.*;

public class mailClient {
	
	private static BufferedReader  stdIn =
			new  BufferedReader(new  InputStreamReader(System.in));
	private static PrintWriter  stdOut =
			new  PrintWriter(System.out, true);
	private static PrintWriter  stdErr =
			new  PrintWriter(System.err, true);
	
	static User user = new User();
	static Mail sendMail = new Mail();
	
	public static void main(String[] args) throws InterruptedException {
		
		int MailChoice=0;
		do {
			Welcome.welcome();
			try {
				MailChoice=Integer.parseInt(stdIn.readLine());
			} catch (NumberFormatException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}while(MailChoice < 1 || MailChoice > 2);
		
		new SPrepare().SMTPPrepare(MailChoice);
		new PPrepare().POP3Prepare(MailChoice);
		
		Login.login(MailChoice);
		
		int FuncChoice=0;
		do {
			do {
				Menu.menu(user);
				try {
					FuncChoice=Integer.parseInt(stdIn.readLine());
				} catch (NumberFormatException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}while(FuncChoice<0||FuncChoice>4);
			switch(FuncChoice) {
			case 1:
				WriteMail.writeMail(user, MailChoice);
				new SendMail().sendmail(sendMail);
				break;
			case 2:
				CheckMail.checkMail();
				break;
			case 3:
				new SMTPExit().SMTPexit();
				new POP3Exit().POP3exit();
				mailClient.main(args);
				break;
			case 4:
				new SMTPExit().SMTPexit();
				new POP3Exit().POP3exit();
				System.exit(0);
			}
		}while(FuncChoice!=4);
	}
}
