package launch.search;

import org.openqa.selenium.By;

class SearchFormPage {
    static By SEARCH_FIELD = By.name("q");
    static By SEARCH_BUTTON = By.name("btnK");
    static By SEARCH_FIELD_ON_RESULT_PAGE = By.cssSelector("#search_form_input");
    static By SEARCH_BUTTON_ON_RESULT_PAGE = By.cssSelector("#search_button");
}
