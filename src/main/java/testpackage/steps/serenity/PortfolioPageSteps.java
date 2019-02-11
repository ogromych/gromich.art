package testpackage.steps.serenity;

import net.thucydides.core.annotations.Step;
import testpackage.pages.PortfolioPage;

public class PortfolioPageSteps extends MainWidgetSteps {
    private PortfolioPage page;

    @Step("User clicks on image tile by index")
    public void clickOnImageTileByIndex(int index) {
        page.clickOnImageTileByIndex(index);
    }

    @Step("User opens image viewer")
    public void getImageViewer() {
        page.getImageInViewer();
    }

    @Step("User clicks on previous arrow")
    public void clickOnPreviousButton() {
        page.clickOnPreviousButton();
    }

    @Step("User clicks on next arrow")
    public void clickOnNextButton() {
        page.clickOnNextButton();
    }

    @Step("User clicks on slideshow icon")
    public void clickOnSlideShowIcon() {
        page.clickOnSlideShowIcon();
    }

    @Step("User clicks on pause icon")
    public void clickOnPauseSlideShowIcon() {
        page.clickOnPauseSlideShowIcon();
    }

    @Step("User clicks on close viewer icon")
    public void closeImageViewer() {
        page.closeImageViewer();
    }

    @Step("User clicks trough all images in viewer")
    public void clickThroughAllImages() {
        page.browseThroughAllImages();
    }

}

