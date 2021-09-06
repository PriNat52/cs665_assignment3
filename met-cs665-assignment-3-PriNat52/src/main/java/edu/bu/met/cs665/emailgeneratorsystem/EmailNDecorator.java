package edu.bu.met.cs665.emailgeneratorsystem;

/*
 * After emails are generated, company may need to check the emails for spelling, grammar
 * errors and encryption before sending
 * */
public abstract class EmailNDecorator extends EmailSpellOnly {

	public abstract String getEmailspellcheck();
}
