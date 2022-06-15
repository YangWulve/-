package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import POP3.*;

public class CheckMail {
	
	private static MailDB mailDB;
	
	public static void checkMail() throws InterruptedException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			new GetMailNum();
			int MailNum=0;
			int mailNum=0;
			int mailChoice=0;
			
			do {
				int funChoice;
				MailNum=GetMailNum.getMailNum();
				do {
					mailNum=GetMailNum.getMailNum();
					System.out.println("******欢迎来到收件箱******");
					System.out.println("共"+mailNum+"封邮件，邮件列表如下：");
					
					new GetMailList();
					GetMailList.getMailList();
//					mailDB=new GetMailDB().getMailDB();
//					mailDB.List();
					
					funChoice=0;
					System.out.println();
					System.out.println("1) 查看邮件");
					System.out.println("2) 删除邮件");
					System.out.println("3) 返回主菜单");
					System.out.print("请输入需要进行的操作");
					funChoice=Integer.parseInt(br.readLine());
				}while(funChoice<=0||funChoice>3);
				if(funChoice==1) {
					do {
						System.out.print("请输入需要查看的邮件编号");
						mailChoice=Integer.parseInt(br.readLine());
					}while(mailChoice<=0||mailChoice>MailNum);
					new GetMail().getMail(mailChoice);
//					Mail amail=mailDB.getMail(mailChoice);
//					System.out.println(amail.Content());
				}else if(funChoice==2) {
					do {
						System.out.print("请输入需要删除的邮件编号");
						mailChoice=Integer.parseInt(br.readLine());
					}while(mailChoice<=0||mailChoice>MailNum);
					new DelMail().delMail(mailChoice);
				}else if(funChoice==3) {
					break;
				}
			}while(mailChoice>0&&mailChoice<=MailNum);
		} catch (IOException e) {
			// TODO 自动生成的catch块
			e.printStackTrace();
		}
	}
}
