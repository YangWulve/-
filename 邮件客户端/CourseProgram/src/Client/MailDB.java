package Client;

import java.util.*;

public class MailDB implements Iterable<Mail> {
	
	private ArrayList<Mail> mails;
	static private MailDB singletonInstance=null;
	
	private MailDB() {
		mails=new ArrayList<Mail>();
	}
	
	static public MailDB getSingeltonInstance() {
		if(singletonInstance==null) 
			singletonInstance=new MailDB();
		return singletonInstance;
	}
	
	public void addMail(Mail mail) {
		mails.add(mail);
	}
	
	public Iterator<Mail> getMailIterator(){
		return mails.iterator();
	}
	
	public Mail getMail(int mailno) {
		for(Iterator<Mail> i=iterator();i.hasNext();) {
			Mail mail=i.next();
			if(mail.getMailNum()==mailno) {
				return mail;
			}
		}
		return null;
	}
	
	public int getNumOfMails() {
		return mails.size();
	}
	
	public Iterator<Mail> iterator(){
		return this.getMailIterator();
	}
	
	public void List() {
		for(Iterator<Mail> i=iterator();i.hasNext();) {
			Mail mail=i.next();
			System.out.println(mail.list());
		}
	}
}
