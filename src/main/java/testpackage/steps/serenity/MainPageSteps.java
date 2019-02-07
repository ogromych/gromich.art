package testpackage.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import testpackage.pages.MainPage;

public class MainPageSteps extends MainWidgetSteps{
    private MainPage page;

    @Step
    public void open() {
        page.open();
    }

    @Step
    public void checkURL() {
        Assertions.assertThat(page.getDriver().getCurrentUrl()).isEqualTo("https://gromich.art");
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

