package edu.bu.met.cs665.emailgeneratorsystem;

/*
 * Email components are different for each customer type and are generated 
 * together based on customer-specific type.
 * */
public class BusinessCustomer extends Email {
	String emailheader = "Wellcome!!";
	String emailto = "To";
	String emailsubject = "Subject:";
	String emailcontent = "Text Mail content";
	String emailsign ="cheers";
	String emailfooter = "Subscribe||UnSubscribe";
	
	public BusinessCustomer() {
		emailheader = "\r\t"+ "Fresh Green House!!"+"\n";
		emailto = "\r"+ "Hello Bill,"+"\n";
		emailsubject = "\r" + "Sub:[Business]Delivering purchased confirmation."+"\n";
		emailcontent = "\r"+"Thank you for your Business with us!! Bulk Sale Discounts added to your purchase." +"\n";
		emailsign = "\r"+"Cheers, "+"\n" + "Priya."+"\n";
		emailfooter = "\r\t"+"Subscribe||UnSubscribe";
	}
	
	@Override
	public String createEmail() {
		return "\n"+emailheader + emailto + emailsubject + emailcontent + emailsign + emailfooter;
	}
	
	String emailspellcheck = "Spell check not done yet";
	String emailencryption = "Encription not done yet";
	
	public void setEmailspellcheck(String emailspellcheck) {
		this.emailspellcheck = emailspellcheck;
	}
	
	public String getEmailspellcheck() {
		
		return emailspellcheck;
	}

	public String getEmailencryption() {
		return emailencryption;
	}

	public void setEmailencryption(String emailencryption) {
		this.emailencryption = emailencryption;
	}
}
