package edu.bu.met.cs665.emailgeneratorsystem;

/*
 * Only one instance of EMailGenerationSystem should be created - SingletonPattern
 * */
public class EmailGeneratorSingleton {

	private static EmailGeneratorSingleton uniqueInstance;
		
	private EmailGeneratorSingleton() {}
			
	public static EmailGeneratorSingleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new EmailGeneratorSingleton();
		}
		return uniqueInstance;
	}
		
	public String getdescription() {
		return "Singleton Email Generator Instance";
	}
	
	/*
	 * Using Factory Method to create objects
	 * */
	public static Email createEmaill(String string) {
		if(string == "Business") {
			BusinessCustomer email = new BusinessCustomer();
			return email;
		}
		ImportantCustomer emailVip = new ImportantCustomer();
		return emailVip;
	}
	public static EmailSpellOnly createEmails(String string) {
		if(string == "New") {
			NewCustomer emailNew = new NewCustomer();
			return emailNew;
		}else if(string == "Frequent"){
			FrequentCustomer emailF = new FrequentCustomer();
			return emailF;
		}
		ReturningCustomer emailR = new ReturningCustomer();
		return emailR;}
}