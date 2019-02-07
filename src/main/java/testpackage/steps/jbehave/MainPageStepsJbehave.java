package testpackage.steps.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import testpackage.pages.MainPage;
import testpackage.steps.serenity.ContactPageSteps;
import testpackage.steps.serenity.MainPageSteps;

public class MainPageStepsJbehave {

    @Steps
    private MainPageSteps steps;

    @Given("I open main page")
    public void openPage(){
        steps.open();
    }

    @When("I click on logo")
    public void clickLogo(){
        steps.clickLogo();
    }

    @Then("I see main page URL")
    public void checkURL(){
        steps.checkURL();
    }

    @When("I click through main carousel")
    public void clickThroughMainCarousel(){
        steps.clickThroughMainCarousel();
    }

    @Then("I see $index image in main carousel")
    public void checkVisibilityOfImageOnMainCarousel(int index){
        steps.checkVisibilityOfImageOnMainCarousel(index);
    }


}
