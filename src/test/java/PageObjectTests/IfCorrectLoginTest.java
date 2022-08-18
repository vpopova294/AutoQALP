package PageObjectTests;

import PageObject.pages.LoginPage;
import PageObject.pages.MainPage;
import PageObject.pages.SecurePageWhenLogin;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IfCorrectLoginTest {
    @Test
    public void checkCorrectLogin(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        MainPage mainPage = new MainPage(driver);
        mainPage.goToAuthPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.clickLoginButton();


        SecurePageWhenLogin securePageWhenLogin = new SecurePageWhenLogin(driver);
        securePageWhenLogin.clickLogoutButton();

    }

}
