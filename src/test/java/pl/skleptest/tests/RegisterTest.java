package pl.skleptest.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pl.skleptest.pages.HomePage;
import pl.skleptest.pages.LoginPage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class RegisterTest {
    @Test
    public void validUserShouldLoginSuccessfully() {
        // user: michal+123456678@gmail.com
        // pass: michal+123456678@gmail.com

        WebDriver driver = new ChromeDriver();
        driver.get("https://skleptest.pl");

        HomePage homePage = new HomePage(driver);
        homePage.goToRegistrationForm();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginUser("michal+123456678@gmail.com", "michal+123456678@gmail.com");

        loginPage.takeScreenshot("login_screenshot");
    }
}
