package testpackage.steps.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import testpackage.steps.serenity.ContactPageSteps;

public class ContactPageStepsJbehave {

    @Steps
    private ContactPageSteps steps;

    @Given("I open contact page")
    public void openPage() {
        steps.open();
    }

    @When("I set name \"$name\"")
    public void setName(String name) {
        steps.setName(name);
    }

    @When("I set email \"$email\"")
    public void setEmail(String email) {
        steps.setEmail(email);
    }

    @When("I set text \"$text\"")
    public void setText(String text) {
        steps.setText(text);
    }

    @When("I submit form")
    public void submitForm() {
        steps.submitForm();
    }

    @Then("I see sending confirmation")
    public void userSeeSendingConfirmation(){
        steps.userShouldSeeSendingConfirmation();
    }

    @Then("I see name error")
    public void userSeeNameError(){
        steps.userShouldSeeNameError();
    }

    @Then("I see email error")
    public void userSeeEmailError(){
        steps.userShouldSeeEmailError();
    }

    @Then("I see sending error")
    public void userSeeSendingError(){
        steps.userShouldSeeSendingError();
    }
}
