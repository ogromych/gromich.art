package testpackage.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("https://gromich.art")
public class MainPage extends MainWidget {

    private By mainCarousel = By.xpath("//div[@class='slick-track']/div");

    public MainPage clickThroughMainCarousel() {
        List<WebElementFacade> images = findAll(mainCarousel);

        for (int i = 0; i < images.size(); i++) {
            if (images.get(i).getAttribute("aria-hidden").equals("false")) {
                images.get(i).click();
            }
        }
        return this;
    }

    public boolean checkVisibilityOfImageOnMainCarousel(int index) {
        List<WebElementFacade> images = findAll(mainCarousel);
        return images.get(index).isVisible();
    }
}
