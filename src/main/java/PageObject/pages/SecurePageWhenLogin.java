package PageObject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurePageWhenLogin extends BasePage {
    //private final By byLogoutButton = By.cssSelector("[class='button secondary radius']");

    @FindBy(css = "[class='button secondary radius']")
    private WebElement logoutButton;
    public SecurePageWhenLogin(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public LoginPage clickLogoutButton() {
        logoutButton.click();
        return new LoginPage(driver);
    }

}
