package securepay.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import launch.navigation.GoogleHomeAction;
import launch.search.SearchFormAction;
import launch.search.SearchResultAction;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Condition;
import org.junit.Assume;

import static org.assertj.core.api.Assertions.assertThat;
import static utility.matchers.TextMatcher.textOf;

public class SearchOnGoogleStepDefinitions {

    @Steps
    GoogleHomeAction navigateTo;

    @Steps
    SearchFormAction searchFor;

    @Steps
    SearchResultAction searchResult;

    @Given("^(?:.*) is on the Google home page")
    public void i_am_on_the_Google_home_page() {
        navigateTo.theGoogleHomePage();
    }

    @When("^s?he (?:searches|has searched) for \"(.*)\"")
    public void i_search_for(String term) {
        searchFor.term(term);
    }


    @When("^s?he (?:searches|has searched) again for \"(.*)\"")
    public void i_search_again_for(String term) {
        searchFor.termOnSearchResultsPage(term);
    }

    @Then("all the result titles should contain the word {string}")
    public void all_the_result_titles_should_contain_the_word(String expectedTerm) {
        assertThat(searchResult.titles())
                .allMatch(title -> textOf(title).containsIgnoringCase(expectedTerm));
    }
    
    @When("^s?he selects the first link")
    public void he_selects_the_first_link() {
    	searchFor.selectOnSearchResultsPage();
    }
}
