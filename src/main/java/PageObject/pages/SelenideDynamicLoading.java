package PageObject.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelenideDynamicLoading {

    private final SelenideElement linkText = $(By.linkText("Example 2: Element rendered after the fact"));
    private final SelenideElement button = $(By.xpath("//*[@id=\"start\"]/button"));

    public SelenideDynamicLoading1 clickOnExample1Link() {
        linkText.shouldBe(Condition.visible)
                .shouldBe(Condition.interactable)
                .click();
        return new SelenideDynamicLoading1();
    }

    public SelenideDynamicLoading clickOnStartButton() {
        button.shouldBe(Condition.visible)
                .shouldBe(Condition.interactable)
                .click();

        return this;


    }
}
