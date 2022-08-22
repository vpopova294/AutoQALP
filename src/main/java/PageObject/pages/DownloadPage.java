package PageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadPage extends BasePage {

    private final By byFile = By.linkText("empty.txt");

    public DownloadPage(WebDriver driver) {
        super(driver);
    }

    public DownloadPage downloadFile() {
        driver.findElement(byFile).click();
        return new DownloadPage(driver);
    }

}


