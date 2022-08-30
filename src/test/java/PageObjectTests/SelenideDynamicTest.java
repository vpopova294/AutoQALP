package PageObjectTests;

import PageObject.pages.SelenideDynamicLoading;
import PageObject.pages.SelenideDynamicLoading1;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideDynamicTest {
    @Test

    public void selenideDynamicTest() throws InterruptedException {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        //Configuration.holdBrowserOpen = true;

        open("/dynamic_loading");

        SelenideDynamicLoading selenideDynamicLoading = new SelenideDynamicLoading();
        selenideDynamicLoading.clickOnExample1Link();

        //open("/dynamic_loading2");
        SelenideDynamicLoading1 selenideDynamicLoading1 = new SelenideDynamicLoading1();
        selenideDynamicLoading1.clickOnStartButton();

        //selenideDynamicLoading.wait(10);
        TimeUnit.SECONDS.sleep(5);

        SelenideElement text = $(By.cssSelector("#finish > h4"));
        Assert.assertTrue(text.getText().equals("text is incorrect"));

    }

}
