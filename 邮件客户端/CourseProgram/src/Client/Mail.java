package Client;

public class Mail {
	private int MailNum;
	private String Addresser;	//发件人
	private String Addressee;	//收件人
	private String Date;
	private String Mailtitle;
	private String Mailtext;
	
	/**
	 * @return addresser
	 */
	public String getAddresser() {
		return Addresser;
	}
	
	/**
	 * @param addresser 要设置的 addresser
	 */
	public void setAddresser(String addresser) {
		Addresser = addresser;
	}

	/**
	 * @return addressee
	 */
	public String getAddressee() {
		return Addressee;
	}

	/**
	 * @param addressee 要设置的 addressee
	 */
	public void setAddressee(String addressee) {
		Addressee = addressee;
	}

	/**
	 * @return mailtitle
	 */
	public String getMailtitle() {
		return Mailtitle;
	}

	/**
	 * @param mailtitle 要设置的 mailtitle
	 */
	public void setMailtitle(String mailtitle) {
		Mailtitle = mailtitle;
	}

	/**
	 * @return mailtext
	 */
	public String getMailtext() {
		return Mailtext;
	}

	/**
	 * @param mailtext 要设置的 mailtext
	 */
	public void setMailtext(String mailtext) {
		Mailtext = mailtext;
	}

	/**
	 * @return date
	 */
	public String getDate() {
		return Date;
	}

	/**
	 * @param date 要设置的 date
	 */
	public void setDate(String date) {
		Date = date;
	}

	/**
	 * @return mailNum
	 */
	public int getMailNum() {
		return MailNum;
	}

	/**
	 * @param mailNum 要设置的 mailNum
	 */
	public void setMailNum(int mailNum) {
		MailNum = mailNum;
	}
	
	public String list() {
		return getMailNum()+" "+getMailtitle()+" "+getAddresser()+" "+getDate();
	}
	
	public String Content() {
		return getMailtitle()+"\n"+getAddresser()+"\n"+getAddressee()+"\n"+getMailtext()+"\n"+getDate();
	}
}
