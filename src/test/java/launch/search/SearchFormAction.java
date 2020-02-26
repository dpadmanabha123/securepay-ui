package launch.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SearchFormAction extends UIInteractionSteps {

    @Step("Search for term {0}")
    public void term(String term) {
        $(SearchFormPage.SEARCH_FIELD).clear();
        $(SearchFormPage.SEARCH_FIELD).type(term);
        $(SearchFormPage.SEARCH_BUTTON).click();
    }

    @Step("Search for term {0}")
    public void termOnSearchResultsPage(String term) {
        $(SearchFormPage.SEARCH_FIELD_ON_RESULT_PAGE).clear();
        $(SearchFormPage.SEARCH_FIELD_ON_RESULT_PAGE).type(term);
        $(SearchFormPage.SEARCH_BUTTON_ON_RESULT_PAGE).click();
    }

    @Step("Select Result")
    public void selectOnSearchResultsPage() {
        $(SearchResultListPage.FIRST_RESULT_TILE).click();
    }
}
