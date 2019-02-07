package testpackage.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class MainWidget extends PageObject {

    private By logo = By.xpath("//a[@class='main_logo_a']");
    private By logoTitle = By.xpath("//span[@class='title']");
    private By logoSubTitle = By.xpath("//span[@class='subtitle']");
    private By mainPage = By.xpath("//a[contains(text(),'ГЛАВНАЯ')]");
    private By portfolioDropDown = By.xpath("//a[contains(text(),'ПОРТФОЛИО')]");
    private By weddingPage = By.xpath("//a[contains(text(),'Свадьба')]");
    private By lovePage = By.xpath("//a[contains(text(),'Любовь')]");
    private By familyPage = By.xpath("//a[contains(text(),'Семья')]");
    private By portraitPage = By.xpath("//a[contains(text(),'Портрет')]");
    private By reportagePage = By.xpath("//a[contains(text(),'Репортаж')]");
    private By contactsPage = By.xpath("//a[contains(text(),'КОНТАКТЫ')]");

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

    public MainWidget clickOnMainPage(){
        find(mainPage).click();
        return this;
    }

    public MainWidget expandPortfolioDropDown(){
        if (!find(weddingPage).isDisplayed()){
            find(portfolioDropDown).click();
        }
        return this;
    }

    private MainWidget clickOnPortfolioPage(By page){
        if (find(page).isDisplayed()) {
            find(page).click();
        }
        else this.expandPortfolioDropDown();
        find(page).waitUntilVisible().click();
        return this;
    }

    public MainWidget clickOnWeddingPage(){
        clickOnPortfolioPage(weddingPage);
        return this;
    }

    public MainWidget clickOnLovePage(){
        clickOnPortfolioPage(lovePage);
        return this;
    }

    public MainWidget clickOnFamilyPage(){
        clickOnPortfolioPage(familyPage);
        return this;
    }

    public MainWidget clickOnPortraitPage(){
       clickOnPortfolioPage(portraitPage);
        return this;
    }

    public MainWidget clickOnReportagePage(){
        clickOnPortfolioPage(reportagePage);
        return this;
    }

    public MainWidget clickOnContactsPage(){
        find(contactsPage).click();
        return this;
    }

}
