package webrivertests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dropdown {


    @Test
    public void dropdownTest() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html ");

        Actions actions = new Actions(driver);

        actions.moveToElement(driver.findElement(By.cssSelector("li.dropdown > a")))
                .moveToElement(driver.findElement(By.cssSelector("li.secondary-dropdown > a")))
                .moveToElement(driver.findElement(By.cssSelector("li.secondary-dropdown > ul > li > a")))
                .click()
                .perform();

        driver.quit();


    }
}
