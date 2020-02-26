package securepay.pages.contactus;

import java.util.Locale;

import com.github.javafaker.Faker;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SecurePayContactUsPageAction extends UIInteractionSteps {

	@Step("he enters all the information on the contact us page")
    public void enterRandomDetails() {
		 Faker faker = new Faker(new Locale("en-AU"));
		 String[] options = new String[]{"Support", "Accounts"};
		 $(SecurePayContactUsPage.FIRST_NAME).type(faker.name().firstName());
		 $(SecurePayContactUsPage.LAST_NAME).type(faker.name().lastName());
		 $(SecurePayContactUsPage.EMAIL_ID).type(faker.internet().emailAddress());
		 $(SecurePayContactUsPage.PHONE_NUMBER).type(faker.phoneNumber().phoneNumber());
		 $(SecurePayContactUsPage.URL).type(faker.internet().url());
		 $(SecurePayContactUsPage.COMPANY).type(faker.company().name());
		 $(SecurePayContactUsPage.REASON_FOR_ENQUIRY).selectByValue(faker.options().option(options));
		 $(SecurePayContactUsPage.MESSAGE).type(faker.lorem().paragraph());
    }
	
	
	@Step("validate he has reached the contact us page")
    public boolean contactUsPageHeaderisDislayed() {
        return $(SecurePayContactUsPage.CONTACT_US_PAGE_HEADER).isDisplayed();
    }

}
