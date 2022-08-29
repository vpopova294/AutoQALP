package PageObject.pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class SelenideDownloadPage {

    private final SelenideElement textFile = $(By.linkText("empty.txt"));

//    public SelenideDownloadPage downloadFile (String s) {
//        downloadFile(String.valueOf(this.textFile)).downloadFile(textFile);
//        return this;
//
//    }

    public SelenideDownloadPage downloadPage() throws FileNotFoundException {
        textFile.download();
        return this;

    }







}


