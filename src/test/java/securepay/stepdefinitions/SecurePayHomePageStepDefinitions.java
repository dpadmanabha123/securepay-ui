package securepay.stepdefinitions;

import static org.junit.Assert.assertTrue;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import securepay.pages.home.SecurePayHomePageAction;

public class SecurePayHomePageStepDefinitions {
	
	 @Steps
	 SecurePayHomePageAction homepage;
	
	@Then("validate he has reached the homepage")
    public void validate_he_has_reached_the_homepage() {
        assertTrue(homepage.homePageHeaderisDislayed());
    }
	
	@When("^s?he navigates to \"(.*)\"")
    public void he_navigates_to(String child) {
        // TODO : Logic of Navigation to different page depending on the child string comes here
		homepage.selectContactUs();
    }

}
