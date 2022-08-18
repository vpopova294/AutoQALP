package PageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChallengingDomPage extends BasePage {

    public ChallengingDomPage(WebDriver driver) {
        super(driver);
    }

    public ChallengingDomPage clickOnButton1() {

        WebElement clickButton1 = driver.findElement(By.cssSelector(".button"));
        clickButton1.click();
        return new ChallengingDomPage(driver) ;
    }
    public ChallengingDomPage clickOnButton2() {
        WebElement clickButton2 = driver.findElement(By.cssSelector(".button.alert"));
        clickButton2.click();
        return this;
    }
    public ChallengingDomPage clickOnButton3() {
        WebElement clickButton3 = driver.findElement(By.cssSelector(".button.success"));
        clickButton3.click();
        return this;
    }

    public void getValues() {
        List<WebElement> table = driver.findElements(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]//table/tbody/tr/td[4]"));

        for( WebElement values : table) {

            System.out.println(" Column 4 has values: " + values.getText() );
        }
    }
}
