package webrivertests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Username {
    @Test
    public void getUserName() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions actions = new Actions(driver);
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/img"));
        WebElement element3 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/img"));
        actions.moveToElement(element1)
                .perform();


        WebElement valuename1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5"));
        System.out.println(valuename1.getText());
        this.sleep(2);

        actions.moveToElement(element2)
                .perform();


        WebElement valuename2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/h5"));
        System.out.println(valuename2.getText());
        this.sleep(2);

        actions.moveToElement(element3)
                .perform();

        WebElement valuename3 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/h5"));
        System.out.println(valuename3.getText());
        this.sleep(2);

    }

    private void sleep(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {


        }
    }
}