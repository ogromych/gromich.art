package testpackage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import testpackage.steps.serenity.MainPageSteps;

@RunWith(SerenityRunner.class)
public class WhenMainPage {

    @Steps
    private MainPageSteps steps;

    @Managed
    private WebDriver driver;


    @Test
    public void checkLogoLink() {
        steps.open();
        steps.clickLogo();
    }

    @Test
    public void checkLinkMain() {
        steps.open();
        steps.clickLinkMain();
    }
}

