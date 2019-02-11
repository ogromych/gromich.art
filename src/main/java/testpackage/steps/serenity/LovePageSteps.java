package testpackage.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import testpackage.pages.LovePage;

public class LovePageSteps extends PortfolioPageSteps{
    private LovePage page;

    public void open() {
        page.open();
    }

    @Step("User checks URL")
    public void checkURL(){
        Assertions.assertThat(page.getDriver().getCurrentUrl()).isEqualTo("https://gromich.art/portfolio/love/");
    }
}

