package PageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePageWhenLogin {

    private WebDriver driver;

    public SecurePageWhenLogin(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogoutButton() {
        driver.findElement(By.cssSelector("[class='button secondary radius']"));
    }

    public String getTitle() {
        return driver.findElement(By.tagName("h2")).getText();


    }
}
