package edu.bu.met.cs665.emailgeneratorsystem;

/*
 * Abstract Factory Pattern:
 * Abstract class as interface
 * */
public abstract class Email {

	public abstract String createEmail();

	protected abstract void setEmailencryption(String string);

	protected abstract void setEmailspellcheck(String string);

	protected abstract String getEmailspellcheck();

	protected abstract String getEmailencryption();
}
