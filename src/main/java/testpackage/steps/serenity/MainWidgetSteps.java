package testpackage.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import testpackage.pages.MainWidget;

public class MainWidgetSteps {
    private MainWidget page;

    @Step("User clicks on logo")
    public void clickLogo() {
        page.clickLogo();
        String URL = page.getDriver().getCurrentUrl();
        Assertions.assertThat(
                URL.equals("https://gromich.art/")).isTrue();
    }

    @Step("User checks logo title")
    public void isLogoTitleVisible() {
        Assertions.assertThat(
                page.isLogoTitleVisible()).isTrue();
    }

    @Step("User checks logo sub title")
    public void isLogoSubTitleVisible() {
        Assertions.assertThat(
                page.isLogoSubTitleVisible()).isTrue();
    }

    @Step("User clicks on main page")
    public void clickOnMainPage() {
        page.clickOnMainPage();
        String URL = page.getDriver().getCurrentUrl();
        Assertions.assertThat(
                URL.equals("https://gromich.art/")).isTrue();
    }

    @Step("User expands Portfolio dropdown")
    public void expandPortfolioDropDown(){
        page.expandPortfolioDropDown();
    }

    @Step("User clicks on Wedding page")
    public void clickOnWiddingPage(){
        page.clickOnWeddingPage();
    }

    @Step("User clicks on Love page")
    public void clickOnLovePage(){
        page.clickOnLovePage();
    }

    @Step("User clicks on Family page")
    public void clickOnFamilyPage(){
        page.clickOnFamilyPage();
    }

    @Step("User clicks on Portrait page")
    public void clickOnPortraitPage(){
        page.clickOnPortraitPage();
    }

    @Step("User clicks on Reportage page")
    public void clickOnReportagePage(){
        page.clickOnReportagePage();
    }

    @Step("User clicks on Contacts page")
    public void clickOnContactsPage(){
        page.clickOnContactsPage();
    }
}

