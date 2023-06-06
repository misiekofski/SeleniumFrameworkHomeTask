package pl.skleptest.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pl.skleptest.pages.HomePage;
import pl.skleptest.pages.LoginPage;


import static org.testng.Assert.assertTrue;

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

        assertTrue(false);
    }


    @AfterMethod
    public void checkIfTestWasSuccessfull(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Test się nie udał");
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            System.out.println("Test się udał");
        }
    }
}
