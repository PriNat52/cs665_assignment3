package edu.bu.met.cs665.emailgeneratorsystem;

/*
 * Email components are different for each customer type and are generated 
 * together based on customer-specific type.
 * */
public class NewCustomer extends EmailSpellOnly{

	String emailheader = "Wellcome!!";
	String emailto = "To";
	String emailsubject = "Subject:";
	String emailcontent = "Text Mail content";
	String emailsign ="cheers";
	String emailfooter = "Subscribe||UnSubscribe";
	String emailmember = "Membership Details";

	public NewCustomer() {
		emailheader = "\r\t"+ "Wellcome to Fresh Green House!!"+"\n";
		emailto = "\r"+"Hello Malla,"+"\n";
		emailsubject = "\r" + "Sub:[New]Delivering purchased confirmation."+"\n";
		emailcontent = "\r"+"Thank you for purchase with us!!" +"\n";
		emailmember = "\r"+"For Newly Registered Members Fresh Green House provides special discounts upto 50% for every purchase."
				+"\n"+"If interested Subscribe bellow."+"\n";
		emailsign = "\r"+"Cheers, " +"\n" + "Priya."+"\n";
		emailfooter = "\r\t"+"Subscribe||UnSubscribe";
	}
	
	public String createEmail() {
		
		return "\n"+emailheader + emailto + emailsubject + emailcontent + emailmember + emailsign + emailfooter;
	}
	
	String emailspellcheck = "Spell check not done yet";
	
	public void setEmailspellcheck(String emailspellcheck) {
		this.emailspellcheck = emailspellcheck;
	}
	
	public String getEmailspellcheck() {
		
		return emailspellcheck;
	}
}
