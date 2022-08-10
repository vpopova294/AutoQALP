package webrivertests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

//using "for" loop

public class UserName2 {
    @Test
    public void getUserName() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions actions = new Actions(driver);
        List<WebElement> profiles = driver.findElements(By.xpath("//*[@id=\"content\"]/div/descendant::div[@class=\"figure\"]"));

        for (int i=0; i<profiles.size(); i++)
        {
            actions.moveToElement(profiles.get(i)).perform();
            String xpathName = "//*[@id=\"content\"]/div/div["+ (i+1) +"]/div/h5";
            String name = profiles.get(i).findElement(By.xpath(xpathName)).getText();
            System.out.println(name);
            this.sleep(5);
        }
            driver.quit();
    }

    private void sleep(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {


        }
    }
}