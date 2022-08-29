package PageObject.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class SelenideUploadPage {



    private final SelenideElement chooseFileSelector = $("input[name='file']");
    private final SelenideElement clickUploadButton = $(".button");


    public SelenideUploadPage chooseFile(File downloadedFile){
        chooseFileSelector.uploadFile(downloadedFile);
        return this;
    }


    public SelenideUploadPage clickButton() {
        clickUploadButton.shouldBe(Condition.visible)
                .shouldBe(Condition.interactable)
                .click();
        return this;
    }
}
