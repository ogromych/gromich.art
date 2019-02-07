package testpackage.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import testpackage.pages.ContactPage;

public class ContactPageSteps extends MainWidgetSteps{
    private ContactPage page;

    @Step
    public void open() {
        page.open();
    }

    @Step("User sees header")
    public void userShouldSeeHeader() {
        Assertions.assertThat(page.isHeaderVisible()).isTrue();
    }

    @Step("User sets name")
    public void setName(String name) {
        page.typeName(name);
    }

    @Step("User sets email")
    public void setEmail(String email) {
        page.typeEmail(email);
    }

    @Step("User sets text")
    public void setText(String text) {
        page.typeText(text);
    }

    @Step("User submits form")
    public void submitForm() {
        page.submitForm();
    }

    @Step("User sees phone")
    public void userShouldSeePhone() {
        Assertions.assertThat(page.getPhoneText()).isEqualTo("+380500100317");
    }

    @Step("User sees skype")
    public void userShouldSeeSkype() {
        Assertions.assertThat(page.getSkypeText()).isEqualTo("alexander_gromich");
    }

    @Step("User sees email")
    public void userShouldSeeEmail() {
        Assertions.assertThat(page.getEmailText()).isEqualTo("aleksandr.gromich@gmail.com");
    }

    @Step("User sees facebook")
    public void userShouldSeeFacebook() {
        Assertions.assertThat(page.getFacebookText()).isEqualTo("gromichaleksandr");
    }

    @Step("User sees error about blank name field")
    public void userShouldSeeNameError() {
        Assertions.assertThat(page.getNameError())
                .as("User should see error message, but he doesn't")
                .isTrue();
    }

    @Step("User sees error about blank email field")
    public void userShouldSeeEmailError() {
        Assertions.assertThat(page.getEmailError())
                .as("User should see error message, but he doesn't")
                .isTrue();
    }

    @Step("User sees main error")
    public void userShouldSeeSendingError() {
        Assertions.assertThat(page.getMessageStatus())
                .as("User should see error message, but he doesn't")
                .isEqualTo("Одно или несколько полей содержат ошибочные данные. Пожалуйста, проверьте их и попробуйте ещё раз.");
    }

    @Step("User sees message that email has been send")
    public void userShouldSeeSendingConfirmation() {
        Assertions.assertThat(page.getMessageStatus())
                .as("User should see confirmation message, but he doesn't")
                .isEqualTo("Спасибо за Ваше сообщение. Оно успешно отправлено.");
    }
}
