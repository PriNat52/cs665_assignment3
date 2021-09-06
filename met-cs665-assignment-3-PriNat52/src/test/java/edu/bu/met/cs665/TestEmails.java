package edu.bu.met.cs665;

import org.apache.log4j.Logger;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import edu.bu.met.cs665.emailgeneratorsystem.Email;
import edu.bu.met.cs665.emailgeneratorsystem.EmailBCheck;
import edu.bu.met.cs665.emailgeneratorsystem.EmailGeneratorSingleton;
import edu.bu.met.cs665.emailgeneratorsystem.EmailNCheck;
import edu.bu.met.cs665.emailgeneratorsystem.EmailSpellOnly;

public class TestEmails {
	private static Logger logger = Logger.getLogger(TestEmails.class);
		
	/*
	 * create an initialization method with "@Before" to create a single instance
	 *  of “EMailGeneration” system, and use this instance in any following tests
	 * */
	@Before
	public void setUp(){
		EmailGeneratorSingleton first = EmailGeneratorSingleton.getInstance();
		EmailGeneratorSingleton second = EmailGeneratorSingleton.getInstance();

		logger.info("Creating a single instance of EMail Generation system");
		assertEquals(first,second);
	}
	
	@Test
	public void test() {
		
		/*
		 * generate atleast one object of each customer type and test the email generation
		 * */
		Email businessemail = EmailGeneratorSingleton.createEmaill("Business");
		logger.info(businessemail.createEmail());
		
		Email vipemail =EmailGeneratorSingleton.createEmaill("Important");
		logger.info(vipemail.createEmail());
		
		EmailSpellOnly regularemail = EmailGeneratorSingleton.createEmails("Frequent");
		logger.info(regularemail.createEmail());
		
		EmailSpellOnly newemail = EmailGeneratorSingleton.createEmails("New");
		logger.info(newemail.createEmail());
		
		EmailSpellOnly returnemail = EmailGeneratorSingleton.createEmails("Returning");
		logger.info(returnemail.createEmail());
		
		/*
		 * Unit tests for additional tasks of Email content checks and email encryption
		 * */
		EmailBCheck Emailbus = new EmailBCheck(businessemail);
		logger.info(Emailbus.getEmailencryption());
		logger.info(Emailbus.getEmailspellcheck());
		
		EmailBCheck Emailvip = new EmailBCheck(vipemail);
		logger.info(Emailvip.getEmailencryption());
		logger.info(Emailvip.getEmailspellcheck());
		
		/*
		 * Unit tests for additional tasks of Email content checks
		 * */
		EmailNCheck Emailregular = new EmailNCheck(regularemail);
		logger.info(Emailregular.getEmailspellcheck());
		
		EmailNCheck Emailnew = new EmailNCheck(newemail);
		logger.info(Emailnew.getEmailspellcheck());
		
		EmailNCheck Emailreturn = new EmailNCheck(returnemail);
		logger.info(Emailreturn.getEmailspellcheck());
		
	}
}
