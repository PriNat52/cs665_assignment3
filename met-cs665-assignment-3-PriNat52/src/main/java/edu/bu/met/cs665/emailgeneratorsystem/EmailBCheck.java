package edu.bu.met.cs665.emailgeneratorsystem;

/*
 * EmailBCheck is a Decorator
 * */
public class EmailBCheck extends EmailBDecorator {

	Email email;
	
	public EmailBCheck(Email email) {
		this.email = email;
		email.setEmailspellcheck("***Spell Check sucessfull! No errors found***");
		email.setEmailencryption("***Encryption Successfull!***");
	}

	@Override
	public String getEmailspellcheck() {
		
		return "\n"+"...Initializing Spell Checks..."+email.createEmail() +"\n"+email.getEmailspellcheck() + "\n";
	}

	@Override
	public String getEmailencryption() {
		
		return "\n"+"...Initializing Encryption..."+ email.createEmail() +"\n"+ email.getEmailencryption() + "\n";
	}

	public String createEmail() {
		
		return email.createEmail();
	}

	@Override
	protected void setEmailencryption(String emailencryption) {}

	@Override
	protected void setEmailspellcheck(String emailspellcheck) {}
}
