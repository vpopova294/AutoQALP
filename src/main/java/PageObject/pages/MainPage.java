package PageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage  {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToAuthPage(){
        driver.findElement(By.linkText("Form Authentication")).click();
    }

    public void goToChallengingDomPage() {
    driver.findElement(By.linkText("Challenging DOM")).click();

    }
}
