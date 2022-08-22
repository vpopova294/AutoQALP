package PageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class UploadPage extends BasePage {

    public UploadPage(WebDriver driver) {
        super(driver);
    }

    public UploadPage clickUploadButton() {
        File file = new File("target/downloads/empty.txt");
        driver.findElement(By.cssSelector("input[name='file']")).sendKeys(file.getAbsolutePath());
        driver.findElement(By.cssSelector(".button")).click();
        return new UploadPage(driver);
    }
}
