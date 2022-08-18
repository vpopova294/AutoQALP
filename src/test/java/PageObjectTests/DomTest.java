package PageObjectTests;

import PageObject.pages.ChallengingDomPage;
import org.testng.annotations.Test;

public class DomTest extends BaseTest {
    @Test
    public void clickButtons() {


        ChallengingDomPage domPage = openApp().goToChallengingDomPage();
        domPage.clickOnButton1()
                .clickOnButton2()
                .clickOnButton3();

        domPage.getValues();


    }
}