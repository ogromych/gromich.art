package testpackage.steps.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import testpackage.steps.serenity.MainWidgetSteps;

public class MainWidgetStepsJbehave {

    @Steps
    private MainWidgetSteps steps;

    @When("I click on logo")
    public void clickLogo() {
        steps.clickLogo();
    }

    @When("I click on Main page")
    public void clickOnMainPage() {
        steps.clickOnMainPage();
    }

    @When("I expand Portfolio dropdown")
    public void expandPortfolioDropDown() {
        steps.expandPortfolioDropDown();
    }

    @When("I click on Wedding page")
    public void clickOnWiddingPage() {
        steps.clickOnWiddingPage();
    }

    @When("I click on Love page")
    public void clickOnLovePage() {
        steps.clickOnLovePage();
    }

    @When("I click on Family page")
    public void clickOnFamilyPage() {
        steps.clickOnFamilyPage();
    }

    @When("I click on Portrait page")
    public void clickOnPortraitPage() {
        steps.clickOnPortraitPage();
    }

    @When("I click on Reportage page")
    public void clickOnReportagePage() {
        steps.clickOnReportagePage();
    }

    @When("I click on Contacts page")
    public void clickOnContactsPage() {
        steps.clickOnContactsPage();
    }

    @Then("I see logo title")
    public void isLogoTitleVisible() {
        steps.isLogoTitleVisible();
    }

    @Then("I see logo sub title")
    public void isLogoSubTitleVisible() {
        steps.isLogoSubTitleVisible();
    }
}