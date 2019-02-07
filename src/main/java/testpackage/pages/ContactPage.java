package testpackage.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://gromich.art/kontaktyi")
public class ContactPage extends MainWidget {

    private By header = By.xpath("//h3[contains(text(),'СВЯЖИТЕСЬ СО МНОЙ')]");
    private By nameField = By.xpath("//input[@name='your-name']");
    private By nameError = By.xpath("//span[@class='wpcf7-form-control-wrap your-name']/span");
    private By emailField = By.xpath("//input[@name='your-email']");
    private By emailError = By.xpath("//span[@class='wpcf7-form-control-wrap your-email']/span");
    private By textField = By.xpath("//textarea[@name='your-message']");
    private By submitButton = By.xpath("//input[@value='Отправить']");
    private By phoneText = By.xpath("//div[@class='row ccnt'][1]/div[1]");
    private By skypeText = By.xpath("//div[@class='row ccnt'][1]/div[2]");
    private By emailText = By.xpath("//div[@class='row ccnt'][2]/div[1]");
    private By facebookText = By.xpath("//div[@class='row ccnt'][2]/div[2]");
    private By messageStatus = By.xpath("//form/div[3]");

    public boolean isHeaderVisible() {
        return find(header).isVisible();
    }

    public ContactPage typeName(String name) {
        find(nameField).sendKeys(name);
        return this;
    }

    public ContactPage typeEmail(String email) {
        find(emailField).sendKeys(email);
        return this;
    }

    public ContactPage typeText(String text) {
        find(textField).sendKeys(text);
        return this;
    }

    public ContactPage submitForm() {
        find(submitButton).submit();
        return this;
    }

    public String getPhoneText() {
        return find(phoneText).getText();
    }

    public String getSkypeText() {
        return find(skypeText).getText();
    }

    public String getEmailText() {
        return find(emailText).getText();
    }

    public String getFacebookText() {
        return find(facebookText).getText();
    }

    public boolean getNameError() {
        return find(nameError).isVisible();
    }

    public boolean getEmailError() {
        return find(emailError).isVisible();
    }

    public String getMessageStatus() {
        return find(messageStatus).getText();
    }


}
