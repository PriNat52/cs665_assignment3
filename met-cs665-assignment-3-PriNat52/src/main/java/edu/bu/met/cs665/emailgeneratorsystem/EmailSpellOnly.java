package edu.bu.met.cs665.emailgeneratorsystem;

/*
 * Abstract Factory Pattern:
 * Abstract class as interface
 * */
public abstract class EmailSpellOnly {

	public abstract String createEmail();
	
	protected abstract void setEmailspellcheck(String string);

	protected abstract String getEmailspellcheck();
}
