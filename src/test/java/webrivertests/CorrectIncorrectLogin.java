package webrivertests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CorrectIncorrectLogin {

    @Test
    public void checkIfCorrectLogin() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");


        //correct login
        WebElement input1 = driver.findElement(By.cssSelector("[name='username']"));
        input1.sendKeys("tomsmith" + Keys.TAB);

        WebElement input2 = driver.findElement(By.cssSelector("[name='password']"));
        input2.sendKeys("SuperSecretPassword!" + Keys.TAB);

        WebElement buttonLogin = driver.findElement(By.cssSelector("[class='radius']"));
        buttonLogin.click();

        WebElement buttonLogout = driver.findElement(By.cssSelector("[class='button secondary radius']"));
        buttonLogout.click();

        //incorrect login
        WebElement input3 = driver.findElement(By.cssSelector("[name='username']"));
        input3.sendKeys("lera popova" + Keys.TAB);
        WebElement input4 = driver.findElement(By.cssSelector("[name='password']"));
        input4.sendKeys("SuperSecretPassword!" + Keys.TAB);

        WebElement buttonLogin1 = driver.findElement(By.cssSelector("[class='radius']"));
        buttonLogin1.click();
        driver.quit();
    }


}
