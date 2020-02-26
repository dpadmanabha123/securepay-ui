package securepay.stepdefinitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import securepay.pages.contactus.SecurePayContactUsPageAction;

public class SecurePayContactUsStepDefinitions {
	 @Steps
	 SecurePayContactUsPageAction contact;
	 
	@Then("he enters all the information on the contact us page")
	public void he_enters_all_the_information_on_the_contact_us_page() {
		contact.enterRandomDetails();
	}
	
	@And("validate he has reached the contact us page")
	public void validate_he_has_reached_the_contact_us_page() {
		contact.contactUsPageHeaderisDislayed();
	}

}
