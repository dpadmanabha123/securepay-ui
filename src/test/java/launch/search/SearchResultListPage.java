package launch.search;

import org.openqa.selenium.By;

class SearchResultListPage {
    static By RESULT_TITLES = By.cssSelector("#links .result__title a:nth-child(1)");
    static By FIRST_RESULT_TILE = By.cssSelector("div.r h3");
}
