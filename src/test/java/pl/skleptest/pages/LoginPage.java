package pl.skleptest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(name = "login")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginUser(String user, String password) {
        usernameInput.sendKeys(user);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
