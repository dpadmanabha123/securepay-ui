package securepay.pages.home;

import org.openqa.selenium.By;

public class SecurePayHomePage {
	
    static By HOMEPAGE_HEADER = By.cssSelector("#header-wrap");
    static By SUPPORT_MENU_ITEM = By.cssSelector("a[data-description = 'Support']");
    static By SUPPORT_MENU_ITEM_CHILD_CONTACT_US = By.cssSelector("a[data-description = 'Support:Contact Us']");

}
