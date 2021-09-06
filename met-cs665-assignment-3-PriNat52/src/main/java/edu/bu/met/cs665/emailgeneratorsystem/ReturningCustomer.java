package edu.bu.met.cs665.emailgeneratorsystem;

/*
 * Email components are different for each customer type and are generated 
 * together based on customer-specific type.
 * */
public class ReturningCustomer extends EmailSpellOnly {

	String emailheader = "Wellcome!!";
	String emailto = "To";
	String emailsubject = "Subject:";
	String emailcontent = "Text Mail content";
	String emailsign ="cheers";
	String emailfooter = "Subscribe||UnSubscribe";
	String emailmember = "Membership Details";

	public ReturningCustomer() {
		emailheader = "\r\t"+ "Fresh Green House!!"+"\n";
		emailto = "\r"+"Hello Jane,"+"\n";
		emailsubject = "\r" + "Sub:[Returning]Delivering purchased confirmation."+"\n";
		emailcontent = "\r"+"Thank you for your purchase again with us!!"+"\n";
		emailmember = "\r"+"Special Discounts available for Registered Members."+
				"\n"+"If interested Subscribe below."+"\n";
		emailsign = "\r"+"Cheers, " +"\n" + "Priya."+"\n";
		emailfooter = "\r\t"+"Subscribe||UnSubscribe";
	}
	
	public String createEmail() {
		
		return "\n"+emailheader+ emailto + emailsubject + emailcontent + emailmember + emailsign + emailfooter;
	}
	String emailspellcheck = "Spell check not done yet";
	
	public void setEmailspellcheck(String emailspellcheck) {
		this.emailspellcheck = emailspellcheck;
	}
	
	public String getEmailspellcheck() {
		
		return emailspellcheck;
	}

}
