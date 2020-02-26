package launch.search;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResultAction extends UIInteractionSteps {
    public List<String> titles() {
        return findAll(SearchResultListPage.RESULT_TITLES)
                .stream()
                .map(WebElementFacade::getTextContent)
                .filter(text -> !text.equalsIgnoreCase("Ad"))
                .collect(Collectors.toList());
    }
    
}
