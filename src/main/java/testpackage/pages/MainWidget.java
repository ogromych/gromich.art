package testpackage.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


public class MainWidget extends PageObject {

    private By logo = By.xpath("//a[@class='main_logo_a']");
    private By logoTitle = By.xpath("//span[@class='title']");
    private By logoSubTitle = By.xpath("//span[@class='subtitle']");
    private By linkMain = By.xpath("//a[contains(text(),'ГЛАВНАЯ')]");
    private By dropDownPortfolio = By.xpath("//a[contains(text(),'ПОРТФОЛИО')]");
    private By linkWedding = By.xpath("//a[contains(text(),'Свадьба')]");
    private By linkLove = By.xpath("//a[contains(text(),'Любовь')]");
    private By linkFamily = By.xpath("//a[contains(text(),'Семья')]");
    private By linkPortrait = By.xpath("//a[contains(text(),'Портрет')]");
    private By linkReportage = By.xpath("//a[contains(text(),'Репортаж')]");
    private By linkContacts = By.xpath("//a[contains(text(),'КОНТАКТЫ')]");

    public MainWidget clickLogo(){
        find(logo).click();
        return this;
    }

    public boolean isLogoTitleVisible(){
        find(logoTitle).getText().equals("ALEKSANDR GROMICH");
        return true;
    }

    public boolean isLogoSubTitleVisible(){
        find(logoSubTitle).getText().equals("photographer");
        return true;
    }

    public MainWidget clickLinkMain(){
        find(linkMain).click();
        return this;
    }

    public MainWidget clickDropDownPortfolio(){
        find(dropDownPortfolio).click();
        return this;
    }

    private MainWidget clickOnLinkInsidePortfolio(By link){
        if (find(link).isDisplayed())
            find(link).click();
        else this.clickDropDownPortfolio();
        find(link).waitUntilVisible().click();
        return this;
    }

    public MainWidget clickLinkWedding(){
        clickOnLinkInsidePortfolio(linkWedding);
        return this;
    }

    public MainWidget clickLinkLove(){
        clickOnLinkInsidePortfolio(linkLove);
        return this;
    }

    public MainWidget clickLinkFamily(){
        clickOnLinkInsidePortfolio(linkFamily);
        return this;
    }

    public MainWidget clickLinkPortrait(){
       clickOnLinkInsidePortfolio(linkPortrait);
        return this;
    }

    public MainWidget clickLinkReportage(){
        clickOnLinkInsidePortfolio(linkReportage);
        return this;
    }

    public MainWidget clickLinkContacts(){
        find(linkContacts).click();
        return this;
    }

}
