package PageObject.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelenideDynamicLoading1 {

    private final SelenideElement button = $(By.xpath("//*[@id=\"start\"]/button"));


    public SelenideDynamicLoading1 clickOnStartButton() {
        button.shouldBe(Condition.visible)
                .shouldBe(Condition.interactable)
                .click();

        return new SelenideDynamicLoading1();
    }
}
