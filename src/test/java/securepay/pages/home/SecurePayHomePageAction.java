package securepay.pages.home;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SecurePayHomePageAction extends UIInteractionSteps {

    @Step("Validate home page header menu is displayed")
    public boolean homePageHeaderisDislayed() {
        return $(SecurePayHomePage.HOMEPAGE_HEADER).isDisplayed();

    }
    
    @Step("Select Support from the Home Page Menu and then click on Contact Us ")
    public void selectContactUs() {
        $(SecurePayHomePage.SUPPORT_MENU_ITEM).click();
        waitForElement();
        $(SecurePayHomePage.SUPPORT_MENU_ITEM_CHILD_CONTACT_US).click();

    }
}
