package testpackage.steps.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;
import testpackage.steps.serenity.PortfolioPageSteps;

public class PortfolioPageStepsJbehave extends MainWidgetStepsJbehave {

    @Steps
    private PortfolioPageSteps steps;

    @When("I click on image tile with index $index")
    public void clickOnImageTileByIndex(int index) {
        steps.clickOnImageTileByIndex(index);
    }

    @When("I open image viewer")
    public void getImageViewer() {
        steps.getImageViewer();
    }

    @When("I click on previous arrow")
    public void clickOnPreviousButton() {
        steps.clickOnPreviousButton();
    }

    @When("I click on next arrow")
    public void clickOnNextButton() {
        steps.clickOnNextButton();
    }

    @When("I click on slideshow icon")
    public void clickOnSlideShowIcon() {
        steps.clickOnSlideShowIcon();
    }

    @When("I click on pause icon")
    public void clickOnPauseSlideShowIcon() {
        steps.clickOnPauseSlideShowIcon();
    }

    @When("I click on close viewer icon")
    public void closeImageViewer() {
        steps.closeImageViewer();
    }

    @When("I click through all images in viewer")
    public void clickThroughAllImages() {
        steps.clickThroughAllImages();
    }
}