package testpackage.steps.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import testpackage.steps.serenity.WeddingPageSteps;

public class WeddingPageStepsJbehave extends MainWidgetStepsJbehave{

    @Steps
    private WeddingPageSteps steps;

    @Given("I open Wedding page")
    public void openPage() {
        steps.open();
    }

    @Then("I see Wedding page URL")
    public void checkURL() {
        steps.checkURL();
    }

    @Then("I see same image after browsing trough all images in viewer")
    public void checkImageBrowsingIsLooped() {
        steps.checkImageBrowsingIsLooped();
    }
}
