package testpackage.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import testpackage.pages.MainPage;

public class MainPageSteps {
    private MainPage page;

    @Step
    public void open() {
        page.open();
    }

    @Step
    public void checkURL() {
        Assertions.assertThat(page.getDriver().getCurrentUrl()).isEqualTo("https://gromich.art");
    }

    @Step("User clicks on logo")
    public void clickLogo() {
        page.clickLogo();
        String URL = page.getDriver().getCurrentUrl();
        Assertions.assertThat(
                URL.equals("https://gromich.art/")).isTrue();
    }

    @Step("User gets logo title")
    public void isLogoTitleVisible() {
        Assertions.assertThat(
                page.isLogoTitleVisible()).isTrue();
    }

    @Step("User gets logo sub title")
    public void isLogoSubTitleVisible() {
        Assertions.assertThat(
                page.isLogoSubTitleVisible()).isTrue();
    }

    @Step("User clicks on link Main")
    public void clickLinkMain() {
        page.clickLinkMain();
        String URL = page.getDriver().getCurrentUrl();
        Assertions.assertThat(
                URL.equals("https://gromich.art/")).isTrue();
    }

    @Step("User clicks on Portfolio dropdown")
    public void clickDropDownPortfolio() {
        page.clickDropDownPortfolio();
    }

    @Step("User clicks on link Wedding")
    public void clickLinkWedding() {
        page.clickLinkWedding();
    }

    @Step("User clicks on link Love")
    public void clickLinkLove() {
        page.clickLinkLove();
    }

    @Step("User clicks on link Family")
    public void clickLinkFamily() {
        page.clickLinkFamily();
    }

    @Step("User clicks on link Portrait")
    public void clickLinkPortrait() {
        page.clickLinkPortrait();
    }

    @Step("User clicks on link Reportage")
    public void clickLinkReportage() {
        page.clickLinkReportage();
    }

    @Step("User clicks on link Contacts")
    public void clicklinkContacts() {
        page.clickLinkContacts();
    }

    @Step("User clicks through main carousel")
    public void clickThroughMainCarousel(){
        page.clickThroughMainCarousel();
    }

    @Step("User checks visibility of image in main carousel")
    public void checkVisibilityOfImageOnMainCarousel(int index) {
        Assertions.assertThat(
                page.checkVisibilityOfImageOnMainCarousel(index)).isTrue();
    }

}

