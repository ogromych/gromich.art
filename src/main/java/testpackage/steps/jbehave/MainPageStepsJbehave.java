package testpackage.steps.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import testpackage.steps.serenity.MainPageSteps;

public class MainPageStepsJbehave extends MainWidgetStepsJbehave {

    @Steps
    private MainPageSteps steps;

    @Given("I open Main page")
    public void openPage() {
        steps.open();
    }

    @Then("I see Main page URL")
    public void checkURL() {
        steps.checkURL();
    }

    @Then("I see main carousel")
    public void isMainCarouselVisible() {
        steps.isMainCarouselVisible();
    }

    @Then("I see same image after browsing trough all images in main carousel")
    public void checkIsMainCarouselLooped() {
        steps.checkIsMainCarouselLooped();
    }


}
