package pl.skleptest.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pl.skleptest.pages.HomePage;
import pl.skleptest.pages.LoginPage;

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

    }
}
