package edu.bu.met.cs665.emailgeneratorsystem;

/*
 * EmailNCheck is a Decorator
 * */
public class EmailNCheck extends EmailNDecorator {

	EmailSpellOnly email;
	
	public EmailNCheck(EmailSpellOnly email) {
		this.email = email;
		email.setEmailspellcheck("***Spell Check sucessfull! No errors found***");
	}

	@Override
	public String getEmailspellcheck() {
		
		return "\n"+"...Initializing Spell Checks..."+email.createEmail() +"\n"+email.getEmailspellcheck() + "\n";
	}

	public String createEmail() {
		
		return email.createEmail();
	}

	@Override
	protected void setEmailspellcheck(String emailspellcheck) {}
}
