package webrivertests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

    @Test
    public void dragMethod() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html ");


        WebElement from = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement to = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

        Actions actions = new Actions(driver);

        Action dragAndDrop = actions.clickAndHold(from)
                .moveToElement(to)
                .release(to)
                .build();

        dragAndDrop.perform();

    }
}
