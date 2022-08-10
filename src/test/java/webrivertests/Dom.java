package webrivertests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Dom {
    @Test
    public void clickOnButtons() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");

        driver.findElement(By.cssSelector(".button")).click();
        driver.findElement(By.cssSelector(".button.alert")).click();
        driver.findElement(By.cssSelector(".button.success")).click();

        //driver.findElement(By.cssSelector("#content > div > div > div > div.large-10.columns > table > thead > tr > th:nth-child(4)"));
        //*[@id="content"]/div/div/div/div[2]/table/thead/tr/th[4]


        List<WebElement> table = driver.findElements(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/descendant::tr/td[4]"));

        //*[@id="content"]/div/div/div/div[2]/table/tbody/tr[1]/td[4]

        for( WebElement values : table) {

          System.out.println(" column 4 has value: " + values.getText() );
        }

//        for(int i=1; i<=table.size(); i++) {
//
//            System.out.println("Column " + i + " has value: " + table.get(i).getText());
//        }

        driver.quit();

    }
}
