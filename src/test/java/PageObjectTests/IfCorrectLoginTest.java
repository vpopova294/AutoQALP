package PageObjectTests;

import PageObject.pages.LoginPage;
import org.testng.annotations.Test;

public class IfCorrectLoginTest extends BaseTest {
    @Test
    public void checkCorrectLogin(){

        LoginPage pageWhenLogin = openApp().goToAuthPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLoginButton()
                .clickLogoutButton()
                .setUsername("lera")
                .setPassword("SuperSecretPassword!")
                .clickLoginButtonWithIncorrectUsername();

//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.setUsername("tomsmith");
//        loginPage.setPassword("SuperSecretPassword!");
//        loginPage.clickLoginButton();
//
//
//        SecurePageWhenLogin securePageWhenLogin = new SecurePageWhenLogin(driver);
//        securePageWhenLogin.clickLogoutButton();
//
//
//
//        LoginPage loginPage1 = new LoginPage(driver);
//        loginPage1.setUsername("tomsmith");
//        loginPage1.setPassword("something");
//        loginPage1.clickLoginButton();
//
//        driver.quit();
    }

}
