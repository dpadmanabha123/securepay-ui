package securepay.pages.contactus;

import org.openqa.selenium.By;

public class SecurePayContactUsPage {
    static By CONTACT_US_PAGE_HEADER = By.cssSelector("section[class = 'contact-us-1 custom-heading-section']");
    static By FIRST_NAME = By.cssSelector("input[name = 'first-name']");
    static By LAST_NAME = By.cssSelector("input[name = 'last-name']");
    static By EMAIL_ID = By.cssSelector("input[name = 'email-address']");
    static By PHONE_NUMBER = By.cssSelector("input[name = 'phone-number']");
    static By URL = By.cssSelector("input[name = 'website-url']");
    static By COMPANY = By.cssSelector("input[name = 'business-name']");
    static By REASON_FOR_ENQUIRY = By.cssSelector("select[name = 'reason-for-enquiry']");
    static By MESSAGE = By.cssSelector("textarea[name = 'message']");

}
