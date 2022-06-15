package Client;

public class Mail {
	private int MailNum;
	private String Addresser;	//������
	private String Addressee;	//�ռ���
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
	 * @param addresser Ҫ���õ� addresser
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
	 * @param addressee Ҫ���õ� addressee
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
	 * @param mailtitle Ҫ���õ� mailtitle
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
	 * @param mailtext Ҫ���õ� mailtext
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
	 * @param date Ҫ���õ� date
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
	 * @param mailNum Ҫ���õ� mailNum
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
