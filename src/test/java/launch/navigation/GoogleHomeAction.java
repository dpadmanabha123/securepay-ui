package launch.navigation;

import net.thucydides.core.annotations.Step;

public class GoogleHomeAction {

    GoogleHomePage googleHomePage;

    @Step("Open the Google home page")
    public void theGoogleHomePage() {
        googleHomePage.open();
    }
}
