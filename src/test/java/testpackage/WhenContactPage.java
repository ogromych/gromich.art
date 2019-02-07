package testpackage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import testpackage.steps.serenity.ContactPageSteps;

@RunWith(SerenityRunner.class)
public class WhenContactPage {

    @Steps
    private ContactPageSteps steps;

    @Managed
    private WebDriver driver;

    @Test
    public void sendMessage() {
        steps.open();
        steps.userShouldSeeHeader();
        steps.setName("Alex");
        steps.setEmail("test@test.com");
        steps.setText("This is automation baby!");
        steps.submitForm();
        steps.userShouldSeeSendingConfirmation();
    }

    @Test
    public void submitBlankForm() {
        steps.open();
        steps.submitForm();
        steps.userShouldSeeNameError();
        steps.userShouldSeeEmailError();
        steps.userShouldSeeSendingError();
    }
}
