package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("https://gromich.art")
public class MainPage extends MainWidget {

    private By carouselSlots = By.xpath("//div[@class='slick-track']/div//img");
    private By currentImage = By.xpath("//div[contains(@class,'current')]//img");

    public List<WebElementFacade> getCarouselSlots() {
        return findAll(carouselSlots);
    }

    public WebElementFacade getImageInCarousel() {
        return find(currentImage);
    }

    public boolean checkIsMainCarouselLooped() {
        List<WebElementFacade> slots = this.getCarouselSlots();
        String startingUrl = slots.get(0).getAttribute("src");
        String url = startingUrl;

        for (int i = 0; i < slots.size() && !url.equals(startingUrl); i++) {
            url = slots.get(i).getAttribute("src");
            slots.get(i).click();
        }
        return true;
    }

    public boolean isMainCarouselVisible() {
        return find(currentImage).isVisible();
    }
}