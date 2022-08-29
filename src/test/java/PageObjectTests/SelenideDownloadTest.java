package PageObjectTests;

import PageObject.pages.SelenideDownloadPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.open;

public class SelenideDownloadTest {
    @Test()
    public void selenideTest() throws FileNotFoundException {
        //Configuration.browser = "chrome";
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.holdBrowserOpen = true;

        open("/download");

        SelenideDownloadPage selenideDownloadPage = new SelenideDownloadPage();
        selenideDownloadPage.downloadPage();


    }
}
