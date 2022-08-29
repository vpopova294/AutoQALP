package PageObject.pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class SelenideDownloadPage {

    private final SelenideElement textFile = $(By.linkText("empty.txt"));

    public File downloadFile() throws FileNotFoundException {

        return textFile.download();
    }

}



