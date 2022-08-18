package PageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private final By byUsername = By.cssSelector("[name='username']");
    private final By ByPassword = By.cssSelector("[name='password']");
    private final By ByLoginButton = By.cssSelector("[class='radius']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setUsername(String username) {
        WebElement usernameInput = driver.findElement(byUsername);
        usernameInput.clear();
        usernameInput.sendKeys(username);
        return this;
    }

    public LoginPage setPassword(String password) {
        WebElement passwordInput = driver.findElement(ByPassword);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        return this;
    }

    public SecurePageWhenLogin clickLoginButton() {
        driver.findElement(ByLoginButton).click();
        return new SecurePageWhenLogin(driver);
    }

    public LoginPage clickLoginButtonWithIncorrectUsername() {
        driver.findElement(ByLoginButton).click();
        return new LoginPage(driver);
    }

    public SecurePageWhenLogin login(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }
}
