package POP3;

import java.io.IOException;
import java.util.StringTokenizer;

import Client.Mail;
import Client.MailDB;

public class GetMailDB extends POP3{
	public MailDB getMailDB() throws IOException {
		MailDB mdb=MailDB.getSingeltonInstance();
		String numlist="";
		String x=null;
		String line=null;
		
		pw.println("list");
		line=br.readLine();
		while(!".".equalsIgnoreCase(line)) {
			line=br.readLine();
			if(!".".equalsIgnoreCase(line)) {
				StringTokenizer st=new StringTokenizer(line," ");
				numlist=numlist+" "+st.nextToken();
			}
		}
		
		StringTokenizer mn=new StringTokenizer(numlist," ");
		
		x=mn.nextToken();
		
		while(mn.hasMoreTokens()) {
			Mail someMail=new Mail();
			someMail.setMailNum(Integer.parseInt(mn.nextToken()));
			String t=null;
			pw.println("retr "+someMail.getMailNum());
			t=br.readLine();
			line=br.readLine();
			while(!".".equalsIgnoreCase(line)) {
				if(!"".equalsIgnoreCase(line)) {
					StringTokenizer mc=new StringTokenizer(line," ");
					if("Subject:".equals(mc.nextToken())||"subject:".equals(mc.nextToken())){
						someMail.setMailtitle(mc.nextToken());
						System.out.println(someMail.getMailtitle());
					}else if("From:".equals(mc.nextToken())||"from:".equals(mc.nextToken())) {
						someMail.setAddresser(mc.nextToken());
					}else if("To:".equals(mc.nextToken())||"to:".equals(mc.nextToken())) {
						someMail.setAddressee(mc.nextToken());
					}else if("Date:".equals(mc.nextToken())||"date:".equals(mc.nextToken())) {
						someMail.setDate(mc.nextToken());
					}
				}else {
					someMail.setMailtext(br.readLine());
				}
			}
			mdb.addMail(someMail);
		}
		
		
		return mdb;
	}
}
