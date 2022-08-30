package PageObjectTests;

import PageObject.pages.SelenideUploadPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.open;

public class SelenideUploadTest {
    @Test
    public void selenideTest1() throws FileNotFoundException {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.holdBrowserOpen = true;


        open("/upload");
        SelenideUploadPage selenideUploadPage = new SelenideUploadPage();
        selenideUploadPage.chooseFile()
                .clickButton();
    }
}
