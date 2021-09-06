package edu.bu.met.cs665.emailgeneratorsystem;

/*
 * Email components are different for each customer type and are generated 
 * together based on customer-specific type.
 * */
public class FrequentCustomer extends EmailSpellOnly{

	String emailheader = "Wellcome!!";
	String emailto = "To";
	String emailsubject = "Subject:";
	String emailcontent = "Text Mail content";
	String emailsurvey = "Survey";
	String emailsign ="cheers";
	String emailfooter = "Subscribe||UnSubscribe";

	public FrequentCustomer() {
		emailheader = "\r\t"+ "Fresh Green House!!"+"\n";
		emailsubject = "\r" + "Sub:[Regular]Delivering purchased confirmation."+"\n";
		emailto = "\r"+"Hello Derick,"+"\n";
		emailcontent = "\r"+"Thank you for your regular purchase with us!! New Discounts available!" +"\n";
		emailsurvey = "\r"+"Please fill out the feedback form to improve our services"+"\n"+"||Survey Form||"+"\n";
		emailsign = "\r"+"Cheers, "+"\n" + "Priya."+"\n";
		emailfooter = "\r\t"+"New Discounts||Subscribe||UnSubscribe";
	}
	
	public String createEmail() {
		
		return "\n"+emailheader + emailto + emailsubject + emailcontent + emailsurvey + emailsign + emailfooter;
	}
	
	String emailspellcheck = "Spell check not done yet";
	
	public void setEmailspellcheck(String emailspellcheck) {
		this.emailspellcheck = emailspellcheck;
	}
	
	public String getEmailspellcheck() {
		
		return emailspellcheck;
	}

}
