package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class PortfolioPage extends MainWidget {

    private By imageTiles = By.xpath("//img[contains(@id,'wd-cl-img')]");
    private By viewerSlots = By.xpath("//div[@class='cont-inner']/div");
    private By currentImageInViewer = By.xpath("//div[contains(@class,'current')]//img");
    private By previousArrow = By.xpath("//div[contains(@class,'rwd-prev rwd-icon')]");
    private By nextArrow = By.xpath("//div[contains(@class,'rwd-next rwd-icon')]");
    private By slideShowIcon = By.xpath("//*[contains(@class,'play_bg')]");
    private By pauseSlideShowIcon = By.xpath("//*[contains(@class,'pause_bg')]");
    private By closeIcon = By.xpath("//*[contains(@class,'close_bg')]");

    public PortfolioPage clickOnImageTileByIndex(int index) {
        findAll(imageTiles).get(index).click();
        this.getImageInViewer().waitUntilVisible();
        return this;
    }

    public List<WebElementFacade> getImageTiles() {
        return findAll(imageTiles);
    }

    public List<WebElementFacade> getViewerSlots() {
        return findAll(viewerSlots);
    }

    public WebElementFacade getImageInViewer() {
        return find(currentImageInViewer);
    }

    public PortfolioPage clickOnPreviousButton() {
        find(previousArrow).click();
        return this;
    }

    public PortfolioPage clickOnNextButton() {
        find(nextArrow).click();
        return this;
    }

    public PortfolioPage clickOnSlideShowIcon() {
        find(slideShowIcon).click();
        return this;
    }

    public PortfolioPage clickOnPauseSlideShowIcon() {
        find(pauseSlideShowIcon).click();
        return this;
    }

    public PortfolioPage closeImageViewer() {
        find(closeIcon).click();
        return this;
    }

    public PortfolioPage browseThroughAllImages() {
        List<WebElementFacade> slots = this.getViewerSlots();
        slots.get(0).click();
        for (int i = 0; i < slots.size() + 1; i++) {
            this.clickOnNextButton();
        }
        return this;
    }

    public boolean checkImageBrowsingIsLooped() {
        String image1 = this.getImageInViewer().getAttribute("src");
        String image2;
        this.browseThroughAllImages();
        image2 = this.getImageInViewer().getAttribute("src");
        return image1.equals(image2);
    }
}
