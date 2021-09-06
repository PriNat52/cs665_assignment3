package edu.bu.met.cs665.emailgeneratorsystem;

/*
 * Email components are different for each customer type and are generated 
 * together based on customer-specific type.
 * */
public class ImportantCustomer extends Email {

	String emailheader = "Wellcome!!";
	String emailto = "To";
	String emailsubject = "Subject:";
	String emailcontent = "Text Mail content";
	String emailsurvey = "Survey";
	String emailsign ="cheers";
	String emailfooter = "Subscribe||UnSubscribe";
	
	public ImportantCustomer() {
		emailheader = "\r\t"+ "Fresh Green House!!"+"\n";
		emailto = "\r"+"Hello Ren,"+"\n";
		emailsubject = "\r" + "Sub:[VIP]Delivering purchased confirmation."+"\n";
		emailcontent = "\r"+"VIP Specials are added to your purchase!!" +"\n";
		emailsurvey = "\r"+"Please fill out the feedback form to improve our services"+"\n"+"||Survey Form||"+"\n";
		emailsign = "\r"+"Cheers, "+"\n" + "Priya."+"\n";
		emailfooter = "\r\t"+"Subscribe||UnSubscribe";
	}
	
	public String createEmail() {
		
		return "\n"+emailheader + emailto + emailsubject + emailcontent +emailsurvey+ emailsign + emailfooter;
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
